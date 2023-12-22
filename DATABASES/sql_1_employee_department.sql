SHOW DATABASES;
CREATE DATABASE employee;
USE employee;
CREATE TABLE department (
	department_id VARCHAR(5) PRIMARY KEY,
    department_name VARCHAR(30)
);
CREATE TABLE employee (
	employee_id VARCHAR(5) PRIMARY KEY,
    employee_name VARCHAR(30),
    salary INT,
    department_id VARCHAR(5),
    CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES department(department_id)
);
DESC employee;

insert into department (department_id, department_name) values
('D101', 'Engineering'),
('D102', 'Audit'),
('D103', 'HR'),
('D104', 'Research');

select * from department;

insert into employee (employee_id, employee_name, salary, department_id) values
('E001', 'Rahul Singla', 1600000, 'D101'),
('E002', 'Mira Rani', 1300000, 'D102'),
('E003', 'Ajay Rajput', 1560000, 'D104'),
('E004', 'Priya Bharadwaj', 1250000, 'D103'),
('E005', 'Pankaj Kumar', 1200000, 'D102'),
('E006', 'Ananya Bansal', 1000000, 'D101'),
('E007', 'Parul Chauhan', 1200000, 'D104'),
('E008', 'Manav Sharma', 1050000, 'D103');
select * from employee;

---------------------------------------------------------- 
-- query 1

select e.employee_id, e.employee_name, d.department_name
from employee e
join department d on e.department_id = d.department_id;

---------------------------------------------------------- 
-- query 2

select employee_id, employee_name, salary
from employee
order by salary desc;

---------------------------------------------------------- 
-- query 3

select d.department_name, avg(e.salary) as average_salary
from department d
join employee e on d.department_id = e.department_id
group by d.department_name;



