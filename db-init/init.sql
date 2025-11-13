CREATE DATABASE db_users;
CREATE DATABASE db_hotel;
CREATE DATABASE db_payments;

CREATE USER user_users WITH PASSWORD 'usersAdminPassword123';
GRANT ALL PRIVILEGES ON DATABASE db_users TO user_users;

CREATE USER user_hotel WITH PASSWORD 'hotelAdminPassword123';
GRANT ALL PRIVILEGES ON DATABASE db_hotel TO user_hotel;

CREATE USER user_payments WITH PASSWORD 'paymentsAdminPassword123';
GRANT ALL PRIVILEGES ON DATABASE db_payments TO user_payments;