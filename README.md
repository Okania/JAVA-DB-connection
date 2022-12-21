# JAVA Database connection

## JDBC

JDBC is a simple API used for connecting Java applications to multiple databases.

To successfully connect to a database we need a JDBC driver. This is a set of classes that interfaces with a specific database engine.

The JDBC driver creates a connection to the database and implements the protocol of transferring queries and resultsets between the client application and the database.


#### Steps when using JDBC:

1. Load the JDBC driver.
2. Establish database connection
3. Create a statement object.
4. Execute a Query.
5. Process the resultset.
6. Close the connection.
