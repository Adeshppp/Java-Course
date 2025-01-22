
JDBC : Java Database Connectivity

When we want to connect java application with database we need JDBC.
We have 4 drivers to do that:
1. Native Driver 
2. ODBC Bridge 
3. Native API
4. Pure Java Drivers


## Connection steps:
1. Import the package. (java.sql.*)
2. Load and Register the Driver.
   1. Load : mysql-connector
   2. Register : forName(com.mysql.jdbc.Driver)
3. Establish the connection : Instantiate Connection interface
4. Create the statement.
   1. Statement : Executes normal query
   2. Prepared Statement : Executes predefined query with different values
   3. Callable Statement : Executes Procedural language
5. Execute the Query.
6. Process Result.
7. Close connection.


Types of languages in SQL:
1. DDL (Data Definition Language)
2. DML (Data Manipulation Language)
3. DCL (Data Control Language)
4. TCL (Transaction Control Language)


## JDBC Design Patterns
1. DAO : Data Access Object
