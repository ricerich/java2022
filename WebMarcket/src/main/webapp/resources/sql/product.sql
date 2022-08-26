/* system 계정으로 수행*/
DROP USER webmarketDB CASCADE; 
CREATE USER webmarketDB IDENTIFIED BY web1234 DEFAULT TABLESPACE users TEMPORARY
TABLESPACE temp PROFILE DEFAULT;
GRANT CONNECT, RESOURCE TO webmarketDB;
ALTER USER madang ACCOUNT UNLOCK;
/* 여기서부터는 webmarketDB 계정으로 접속 */
conn webmarketDB/webmarketDB;
DROP TABLE product;
CREATE TABLE product(
	p_id VARCHAR(10) NOT NULL,
	p_name VARCHAR(20),
	p_unitPrice  number,
	p_description VARCHAR(500),
   	p_category VARCHAR(20),
	p_manufacturer VARCHAR(20),
	p_unitsInStock number,
	p_condition VARCHAR(20),
	p_fileName  VARCHAR(20),
	PRIMARY KEY (p_id)
);


