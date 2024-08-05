create database mc_1_carsales_data;
use mc_1_carsales_data;
create table Customer(
CustomerID int primary key,
FirstName varchar(10),
LastName varchar(10),
City varchar(10),
Rating int,
SalesID int);
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
alter table  Customer add foreign key (SalesID) references SalesPerson(SalesID);
insert into Customer (CustomerId, FirstName, LastName, City, Rating, SalesID) values
(2001, 'Hoffman', 'Anny', 'London', 100, 1001),
(2002, 'Giovanni', 'Jenny', 'Rome', 200, 1003),
(2003, 'Liu', 'William', 'San Jose', 100, 1002),
(2004, 'Harry', 'Grass', 'Berlin', 300, 1002),
(2005, 'Clemens', 'John', 'London', 200, 1001),
(2006, 'Fanny', 'John', 'San Jose', 200, 1005),
(2007, 'Jonathan', 'Bob', 'Rome', 300, 1004);
create table OrderTable (
OrderID int primary key,
Amount int,
OrderDate date,
CustomerID int,
foreign key (CustomerID) references Customer(CustomerID)
);
insert into OrderTable (OrderID, Amount, OrderDate, CustomerID) VALUES 
(3001, 123, '2020-02-01', 2001),
(3002, 100, '2000-07-30', 2003),
(3003, 187, '2020-10-02', 2007),
(3005, 201, '2011-10-09', 2007),
(3009, 145, '2012-10-10', 2002),
(3007, 167, '2021-04-02', 2002),
(3008, 189, '1999-03-02', 2006),
(3010, 100, '2000-09-18', 2001);

select * from OrderTable;
delete from OrderTable where OrderID=3008;
delete from SalesPerson where CommisionRate=0;
update OrderTable
set Amount = 200
where Amount = 100;
update SalesPerson
set CommisionRate = 28
where CommisionRate = 26;
update Customer
set Rating = 150
where Rating = 100;





