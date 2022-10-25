--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--  (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
        
        select name
          from customer, orders, book
         where customer.custid = orders.custid
           and orders.bookid = book.bookid         
           AND publisher IN (select distinct publisher
                       from customer, orders, book
                      where customer.custid = orders.custid
                        and orders.bookid = book.bookid
                        and name like '박지성')
          and name not like '박지성';

        --박지성이 구매한 도서
        select distinct publisher as a1
        from   customer a, orders, book
        where customer.custid = orders.custid
          and orders.bookid = book.bookid
          and name like '박지성';

--  (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
     --방법1(group by)-고객별로 구매한 출판사의 갯수
        select name --, count(distinct publisher)
          from customer, orders, book
         where customer.custid = orders.custid
           and orders.bookid = book.bookid
      group by name
        having count(distinct publisher) >= 2;
        
    --방법2(상관쿼리)
      select name
        from customer c
       where (select count(distinct publisher)
               from orders, book
              where c.custid = orders.custid
                and orders.bookid = book.bookid) >= 2;
 
--  (3) 전체 고객의 30% 이상이 구매한 도서
 -- 방법1(GROUP BY) -힌트:도서별 판매수량
        SELECT BOOKNAME, COUNT(BOOKNAME)
          FROM ORDERS, BOOK
         WHERE ORDERS.BOOKID = BOOK.BOOKID
      GROUP BY BOOKNAME
        HAVING COUNT(BOOKNAME) >= (SELECT COUNT(*) FROM CUSTOMER)*0.3;
  -- 방법2(상관쿼리) 
        SELECT BOOKNAME
          FROM BOOK B1
         WHERE (SELECT COUNT(BOOKNAME)
                  FROM ORDERS, BOOK
                 WHERE ORDERS.BOOKID = BOOK.BOOKID
                   AND B1.BOOKID = BOOK.BOOKID) >= (SELECT COUNT(*) FROM CUSTOMER)*0.3;
         
         SELECT COUNT(BOOKNAME)
           FROM ORDERS, BOOK
          WHERE ORDERS.BOOKID = BOOK.BOOKID