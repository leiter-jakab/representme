CREATE SCHEMA representme;

CREATE ROLE schema_usage;
CREATE ROLE schema_create;

GRANT CREATE ON SCHEMA representme TO schema_create;
GRANT USAGE ON SCHEMA representme TO schema_usage;

CREATE USER schema_admin WITH password '${schema_admin_password}'
    CONNECTION LIMIT 2 IN ROLE schema_create, schema_usage;
ALTER ROLE schema_admin SET search_path = representme;

CREATE ROLE table_crud;
ALTER DEFAULT PRIVILEGES FOR USER schema_admin IN SCHEMA representme GRANT SELECT, INSERT, UPDATE, DELETE ON TABLES TO table_crud;

CREATE USER schema_user WITH PASSWORD '${schema_user_password}' IN ROLE schema_usage, table_crud;
ALTER ROLE schema_user SET search_path = representme;
