--1. 마당서점의 고객이 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
--  (1) 도서번호가 1인 도서의 이름
    select bookname
    from book
    where bookid = 1;

--  (2) 가격이 20,000원 이상인 도서의 이름
    select bookname
    from book
    where price >= 20000;

--  (3) 박지성의 총 구매액
    select sum(saleprice)
    from customer, orders
    where customer.custid = orders.custid
      and name like '박지성';
      
    select sum(saleprice)
    from customer join orders 
      on customer.custid = orders.custid
    where name like '박지성';     
      
--  (4) 박지성이 구매한 도서의 수
    select count(*)
    from  customer, orders
    where customer.custid = orders.custid
      and name like '박지성';

--  
--2. 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
--  (1) 마당서점 도서의 총 개수
        select count(*) from book;
        
--  (2) 마당서점에 도서를 출고하는 출판사의 총 개수
        select count(distinct publisher) from book;
        
--  (3) 모든 고객의 이름, 주소
        select name, address from customer;
        
--  (4) 2014년 7월 4일~7월 7일 사이에 주문받은 도서의 주문번호
        select orderid
        from orders
        where orderdate Between '2014/07/04' and '2014/07/07';
        
--  (5) 2014년 7월 4일~7월 7일 사이에 주문받은 도서를 제외한 도서의 주문번호
        select orderid
        from orders
        where orderdate not Between '2014/07/04' and '2014/07/07';
        
--  (6) 성이 ‘김’ 씨인 고객의 이름과 주소
        select name, address 
        from customer 
        where name like '김%';
        
--  (7) 성이 ‘김’ 씨이고 이름이 ‘아’로 끝나는 고객의 이름과 주소
        select name, address 
        from customer 
        where name like '김%아';
        
--2번째
--1. 마당서점의 고객이 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
--  (5) 박지성이 구매한 도서의 출판사 수
        select count(distinct publisher)
          from customer A, orders B, book C
         where A.custid = B.custid
           and B.bookid = C.bookid
           and name like '박지성';
           
        select count(distinct publisher)
          from customer A 
                          join orders B on A.custid = B.custid
                          join book C on B.bookid = C.bookid
         where 
               name like '박지성';

--  (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이

        select 
               bookname, price, price-saleprice
          from 
               customer A 
                          join orders B on A.custid = B.custid
                          join book C on B.bookid = C.bookid
         where 
               name like '박지성';
               
--  (7) 박지성이 구매하지 않은 도서의 이름
    --방법1 마이너스(-)
    -- 전체 도서 - 박지성이 구매한 책
        select bookname 
          from book
        minus
        select 
               bookname
          from 
               customer A 
                          join orders B on A.custid = B.custid
                          join book C on B.bookid = C.bookid
         where 
               name like '박지성';        
    
    --방법2 제외 (not in)
    select bookname
      from book
     where bookname not in (select 
                                   bookname
                              from 
                                   customer A 
                                              join orders B on A.custid = B.custid
                                              join book C on B.bookid = C.bookid
                             where 
                                   name like '박지성')
    order by bookname;
    
    --방법3 제외 (not exists)
   select bookname
      from book
     where not exists ( select 
                               bookname
                          from 
                               customer A 
                               join orders B on A.custid = B.custid                               
                               --join book C on B.bookid = C.bookid
                         where 
                               book.bookid = B.bookid
                           and name like '박지성')
    order by bookname;

--2. 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
--  (8) 주문하지 않은 고객의 이름(조인 사용)
        --방법1
        select name from CUSTOMER
        MINUS
        select 
               name
          from 
               customer A 
          join orders B  on A.custid = B.custid;
     
        --방법2
         select name 
           from CUSTOMER
          where name not in (select 
                                   name
                              from 
                                   customer A 
                              join orders B  on A.custid = B.custid);
        --방법3
         select name 
           from CUSTOMER A1
          where not exists (select 
                                   name
                              from 
                                   customer A 
                              join orders B  on A.custid = B.custid
                              where A.custid = A1.custid);
                              
        --방법4
        select name 
          from CUSTOMER left join orders 
                                      on customer.custid = orders.custid
         where orderid is null;
        
           
--  (9) 주문 금액의 총액과 주문의 평균 금액
        select sum(saleprice), avg(saleprice)
          from orders;
          
--  (10) 고객의 이름과 고객별 구매액
        select name, sum(saleprice)
          from customer join orders on customer.custid = orders.custid
      group by name;

--  (11) 고객의 이름과 고객이 구매한 도서 목록
    select 
           name, bookname
    from 
           customer A 
     join  orders B   on A.custid = B.custid
     join  book C     on B.bookid = C.bookid;
      
--  (12) 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문
        select *
          from orders join book on orders.bookid = book.bookid
         where price-saleprice = (select max(price-saleprice)
                                    from orders join book on orders.bookid = book.bookid);
         
         
          select max(price-saleprice)
            from orders join book on orders.bookid = book.bookid;

--  (13) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
        
        select customer.custid, name --, avg(saleprice)
          from customer join orders on customer.custid = orders.custid
      group by customer.custid, name
        having avg(saleprice) > (select avg(saleprice) from orders);
      
    --도서 판매액 평균
        select avg(saleprice) from orders;
    



