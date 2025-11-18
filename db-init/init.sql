CREATE USER uuser WITH PASSWORD 'admin-password-uuser*';
CREATE USER uhotel WITH PASSWORD 'admin-password-uhotel*';
CREATE USER upayment WITH PASSWORD 'admin-password-upayment*';

CREATE DATABASE db_users OWNER uuser;
CREATE DATABASE db_payments OWNER upayment;
CREATE DATABASE db_hotel OWNER uhotel;

CREATE USER uauth WITH PASSWORD 'admin-password-uauth*';
GRANT CONNECT ON DATABASE db_users TO uauth;
GRANT USAGE ON SCHEMA public TO uauth;
GRANT SELECT ON ALL TABLES IN SCHEMA public TO uauth;