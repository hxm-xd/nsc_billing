CREATE DATABASE nsc_billing;
CREATE USER 'nsc_admin'@'localhost' identified BY 'nscnugawela123';
grant all privileges on nsc_billing.* TO 'nsc_admin'@'localhost';
flush privileges;

use nsc_billing;

describe products;
describe bills;
describe users;

select * from products;

ALTER TABLE products modify product_id BIGINT auto_increment; 
ALTER TABLE bills modify bill_id BIGINT auto_increment;
ALTER TABLE users modify id BIGINT auto_increment;
ALTER TABLE services modify service_id BIGINT auto_increment;

ALTER TABLE services CHANGE id service_id int;

truncate users;
truncate bills;
truncate products;
truncate services;
