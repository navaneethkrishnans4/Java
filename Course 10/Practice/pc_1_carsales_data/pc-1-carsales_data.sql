create database pc_1_carsales_data;
use pc_1_carsales_data;
create table SalesPerson(
SalesID int,
FirstName varchar(20),
City varchar(10),
CommisionRate int);
alter table SalesPerson
add primary key (SalesID);
insert into SalesPerson values (1001,'John','London',12);
desc SalesPerson;
select * from SalesPerson;
insert into SalesPerson values (1002,'Bob','San Jose',13);
insert into SalesPerson values (1004,'Judith','London',11);
insert into SalesPerson values (1007,'Robin','Barcelona',15);
insert into SalesPerson values (1003,'Harry','New York',10);
insert into SalesPerson values (1005,'James','London',26);
insert into SalesPerson values (1008,'Charles','Florida',0);
select * from SalesPerson;

