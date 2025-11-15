CREATE DATABASE db_users;
CREATE DATABASE db_payments;
CREATE DATABASE db_hotel;

CREATE USER uauth WITH PASSWORD 'admin-password-uauth*';
GRANT CONNECT ON DATABASE db_users TO uauth;
GRANT USAGE ON SCHEMA public TO uauth;
GRANT SELECT ON ALL TABLES IN SCHEMA public TO uauth;
ALTER DEFAULT PRIVILEGES IN SCHEMA public GRANT SELECT ON TABLES TO uauth;

CREATE USER uuser WITH PASSWORD 'admin-password-uuser*';
GRANT ALL PRIVILEGES ON DATABASE db_users TO uuser;

CREATE USER uhotel WITH PASSWORD 'admin-password-uhotel*';
GRANT ALL PRIVILEGES ON DATABASE db_hotel TO uhotel;

CREATE USER upayment WITH PASSWORD 'admin-password-upayment*';
GRANT ALL PRIVILEGES ON DATABASE db_payments TO upayment;