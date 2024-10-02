# ToDo
Todo Application using SpringBoot

#Login 
The security to the application is provided using the SpringSecurity Configuration----SpringSecurityConfiguration

#ToDo Features:
The Features in this todo are:
1.Add a new todo
2.Delete an exisiting todo
3.Update a todo
All the features are implemented in todo Controller.

#Database connectivity:
The database here we used is H2-database which is an on-premise database in spring boot.
The details of the user is saved in the database and will be retrieved based on the login of the user.

#Working flow
Login to the application.
After login user will be navigating to the Home page. 
In home page When user clicks on manage todos, the user will be navigated to the todo page where he can add a new todo, update an exisiting todo and delete todo.
After performing the operations user can logout.



#Database table:
The database table is having the columns as id,username,desc, targetdate and status.

