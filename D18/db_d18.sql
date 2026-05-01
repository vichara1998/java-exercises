show databases;
use javafx_phone;
show tables;
create table charger(
cid int,
name varchar(50),
watt int,
primary key(cid)
#foreign key(pid) references phone(pid)
);
desc phone;

show tables;
select * from phone;
insert into charger values(1,"SONY",23);
insert into charger values(2,"SONY",43);
insert into charger values(3,"ViVo",50);

select * from charger order by name desc;
select * from charger where name like 'v%';

select * from charger where watt>25 order by watt desc;

insert into phone values(2,"Sony","E10",10000.00,4);
insert into phone values(3,"LG","A1",15000.00,12);
insert into phone values(4,"Samsung","M10",25000.00,7);
insert into phone values(5,"Pixel","Pro",70000.00,5);
select version();
select * from phone;
drop table phone;
desc phone;
create table Phone (
PhoneID int not null auto_increment,
Brand varchar(100) not null,
Model varchar(100) not null,
Price decimal ,
Quantity int,
primary key(PhoneID)

);
select * from Phone;

#Insert into Phone(col1,col2) values(1,2); 
