# JDBC-database-creation-insertion-and-retrieval
### This is a sample program for creating a table in MySQL ,inserting and extracting data into a table in the database using Java Programming (JDBC) 
> The java program store details of students (name , photo, register number, city, company placed and salary and CGPA) by connecting Java Application with mysql database. 
After inserting the data, the code retrieves the details of the student who gets placed in a company with the highest package.
</br>

**Follow the following steps for running the code**
1. Download connector tar file from this [link](https://dev.mysql.com/downloads/connector/j/). Select OS as Platform Independent.
1. Start xampp.
1. Turn on Apache and Mysql.
1. Create a MySQL database in phpmyadmin
1. Create a new project in netbeans
1. After creating, expand the projects folder, right click on libraries and select add JAR/Folder
1. Select mysql-connector-java-8.0.12.jar and click open. 
1. Go to Window->Services and Right-click on Databases 
1. Select New Connection.
1. Click Add and select mysql-connector-java-8.0.12.jar file. From Driver drop-down, select MySQL (Connector/J driver). Click Next.
1. In the Customize Connection window, replace the Database name with the name we want to give to the db.
1. Click Test Connection.
1. Store the Photos in a folder in your system. Change the location in the code as required.
1. Now, you may build and run the program.
