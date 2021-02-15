
CREATE DATABASE melalietest
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'C'
    LC_CTYPE = 'C'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;



create table purchase(
	id serial PRIMARY KEY,
	restaurantId int ,
	customerId int ,
	dishName varchar(255),
	amount varchar(255),
	purchaseDate date

);

create table customer(
	id serial PRIMARY KEY,
	customerName varchar(255),
	customerLocation varchar(255),
	customerBalance varchar(255)
);


create table restaurant(
	id serial primary key,
	restaurantName varchar(255),
	restaurantLocation varchar(255),
	restaurantBalance varchar(255),
	restaurantBusinessDay varchar(255),
	restaurantBusinessHoursOpen int,
	restaurantBusinessHoursClose int
	
);
create table restaurantmenu(
	id serial PRIMARY KEY,
	restaurantId int ,
	restaurantMenuName varchar(255),
	restaurantMenuPrice varchar(255)

);