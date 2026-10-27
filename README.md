Kata 1 - Getting familiar with IntelliJ IDEA and basic workflow 
📝 Description
The program creates an object representing a person with a name and a date of birth. Then, it dynamically calculates their exact age in years and displays the results in the console.

🛠️Packages Used
Packages:
java.time.LocalDate: To handle dates without time zones.
java.time.Period: To calculate the difference (amount of time) between two dates.

📂 Code Structure
The code is organized within the software.ulpgc.kata1 package and consists of two main classes:

Person.java:
This is the model class.
It contains the immutable attributes name (String) and birthDate (LocalDate).
It features the getAge() method, which calculates the years elapsed between the birth date and today using Period.between().

Main.java:
This is the main class containing the entry point of the application.
It instantiates a Person object (in this case, "Daniela").
It prints the name, birth date, and calculated age to the console.

📋Expected Output
When running the program, you should see something similar to this in your console:
Nombre: Daniela
Fecha de cumpleaños: 2006-02-27
Edad: 20 años

https://youtu.be/FP6NBnoLE-w
