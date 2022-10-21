# IBA-TECH-mytaskSolutions
Task -1
Write a program called "numbers", which makes a random number and offers the player to guess it.

Technical requirements:
With the help of java.util.Random the program makes a random number in a range [0-100] and invites the player through a console to enter the name which is saved in the variable name.
Before the beginning, show up given text on screen: Let the game begin!.
The whole process of the game is processed in an infinite cycle.
The player is invited to enter the number in the console, after which the program compares the hidden number with the fact that the user has entered.
If the entered number is less than a random number which the program has generated, you should to display the text: Your number is too small. Please, try again.. If the entered number is more than the number which the program has generated, you should display the text: Your number is too big. Please, try again..
If the entered number is equal to the number which the program has generated, it is necessary to display the text on the screen: Congratulations, {name}!.
The task must be performed using arrays (DO NOT USE THE INTERFACES List, Set, Map).

Task-2
You will need to write a "week planner" program

Technical requirements
Create a two-dimensional array of 7x2 strings String[][] scedule = new String[7][2]

Fill the matrix with the following values: weekday + the main task for the current day: scedule[0][0] = "Sunday";
scedule[0][1] = "do home work";
scedule[1][0] = "Monday";
scedule[1][1] = "go to courses; watch a film";

Using a loop and a switch operator, request the user to input a weekday in the console. Depending on the input:
Please, input the day of the week:
The user enters a correct weekday (e.g. Monday) , the program outputs: Your tasks for Monday: go to courses; watch a film.; Then the program goes to the next iteration.
Please, input the day of the week: The user enters a non-valid weekday (e.g. %$=+!11=4)
the program outputs: Sorry, I don't understand you, please try again.; the program goes to the next iteration until the user enters a valid weekday 3)Please, input the day of the week: The user enters exit
The program goes out of the loop
The task must be done using arrays (DON'T use interfacesList, Set, Map).

Please note: the program should accept commands in both lower case (Monday) and upper case (MONDAY) and take into account that the user may have accidentally entered a space after the day of the week.
