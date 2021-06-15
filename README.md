ICS4U Software analysis exercise 
Group Six 


Brainstorm:
Monster fighting game  I I I I
Create randomly generated monsters for the user to fight
TicTacToe Game(no description needed)
Battleship (no description needed)
Math program
custom methods that take numbers from the user and solve and equation
for example: find all the sides of a triangle
Rock paper scissors but updated with cool stuff













Idea Chosen:
Monster Fighting Game
Game Information:

Name: Monster Fighting Game

Company: RalphTech

Version: v1.0

Date of Conception: 2021-06-14

Task performed:
Creates a procedurally generated turn based monster fighting game
User vs computer
Based on a reskinned version of rock paper scissors
Fantasy themed


Target Demographic:
Ideally children, but the game can be played by anyone who can read
The game is meant for entertainment
The game will be advertised to children
recommended to ages 6 - 10
E for everyone (ages 6 and up) 


















Game Summary

Step by step:
Create a player class (ask the user their name, generate health and attack)
Show the user their health and attack values
Ask how many monsters the user wants to defeat
Create that many monster instances in an array
Ask if the user wants to see the tutorial (only once in the whole program)
Game will start
Double loops (one for looping through monsters, one for looping through turn based combat inside of the other loop)
Will begin going through an array of monsters and introduce the monster to the player: (name, health)
Will ask player to do a simple contest of reskinned rock paper scissors
Whoever wins will have their damage value subtracted from the other’s health
They do this until one of them dies
Each cycle the computer displays the health of the computer and player
The next monster appears
Process repeats until the user defeats the number of monsters that they specified
The user is asked if they want to play again


Abilities that the player and monster will be able to choose from (reskinned RockPaperScissors):

Quick slice: 
Blocked by Shield bash
Dodges Mighty slam
Deal normal damage to quick slice

Mighty slam:
Dodged by Quick slice
Deals high damage against Mighty slam
Breaks through shield bash

Shield bash:
Blocks quick slice
deals no damage against shield bash
Unable to block against mighty slam








Technical Planning:

Classes:

Monster class
Will have one static variable - number of monsters created gets added each time a new instance is created
private static int intMonsterNum
Will have a name instance variable, a health instance variable, and damage instance variable
private int intHealth
private int intDamage
private String strName
Will have a default constructor
No parameters 
Will set the name, health, damage, and add one to the static variable
Will have get methods for all instance variables and static variables
Will have a method for getting a random name
No parameters
Either will return a string or simply set the value of strName
Consists of three arrays
One array contains adjectives like strong and weak
One array contains adjective like depraved, villainous, ect
One array contains the name of the monster
A random index number is chosen for each of the three arrays, and the strings are added together to create the monster name
The monster name gets returned as a string or strName is set as a string
Will have a method for getting health (based on the base value + a calculation with the number of monsters already created
Either will return an integer or simply set the value of intHealth
Select a base value for the health (not decided yet), then add the number of monster instances created times 5
This will be the health value
Method for getting damage
Either will return an integer or simply set the value of intDamage
Select a base value for the damage (not decided yet), then add the number of monster instances created times 2
This will be the damage value
Will have a reset method for resetting static variable when the game is over so the player can play again
This method will be void
It will set intMonsterNum to 0


Player class
Will have name and health instance variables
strName, intHealth, intATK
Create get methods for name and health
Will have methods to get the name from the player
use try catch and scanner tool to get the player’s name
this method will return a string or set the value of strName
No parameters
Will have a method that gets the health of the player
No parameters
Either will return an integer or simply set the value of intHealth
Select a base value for the health (70), then add the number of monster instances created times 5
This will be the health value
Will have a method to buff the player’s health by a random value when called
Will generate a random integer within a certain range
Will add this value to the player’s health
No parameters and will be void
will have  method to increase players strength by a random value with potions
Will generate a random integer within a certain range
Will add this value to the player’s attack
No parameters and will be void

 
Game class
Default constructor
Generates player and monsters by calling other methods within the game class
Instance variables:
array that holds all the monsters 
Monster monsters;
Static boolean that gets set to false after the user is asked if they want to take the tutorial - is initially set to true
Boolean boolTutorial = true;
Tutorial method
No parameters, set to return void
Check if the static boolean boolTutorial is set to true
If yes, ask the user if they want to see the tutorial
If no, move on
After the player is asked if they want to take the tutorial, set static boolean to false
Method to ask the user how many monsters they  want to defeat and generates the monsters
No parameters, returns void
Ask user how many monsters they would like in the game
Create that many monster instances with a for loop and put them in the array
One method for the rock paper scissors reskin 
Gets user input to choose the rock paper scissors equivalent in this game
Will calculate who wins
Will return a true or false value
One big method containing a double loop
One loop for each monster
each time a monster is defeated a random integer will be chosen and based on that the player will receive a random buff using one of the two buff functions in player class
The loop will then move on to the next monster in the array
one loop for turn based combat
will run the rock paper scissors and do damage based on that to whoever won
carry on this loop until the player or monster are dead
One method to output the results of the battle to the user
No parameters, returns void
Will output various stats relating to the battle (total turns, names of monsters faced)



Test class
All the test class will do is call a new instance of a game, and ask the user if they want to play again
make sure to include try catch for input


Base Stats:
Player:
base HP:100
base ATK: 35
Monster:
base HP:70
base ATK: 20



Procedures and Protocols:
Communication outside of class through Google Hangouts and Discord
Collaboration through a shared BlueJ project connected to a GitHub repository
Naming conventions (consistent with the class throughout the quadmester):
For variables (and arrays/arraylists):
byte bytVariableName
short shrVariableName
int intVariableName
long lngVariableName
float fltVariableName
double dblVariableName
String strVariableName
boolean bolVariableName
For constants:
final datatype VARIABLE_NAME
For methods:
Camel naming (e.g. methodName)









Develop a plan for your project that everyone in your group can access in some way.(IMPORTANT)
 I need to see it as well! 
Include dates by which certain elements will be completed as well as who is responsible for what. (Basically who will do what by when) - timeline/calendar
Make sure this document is organized in such a way that it is very clear to everyone what they are responsible for and when it needs to be done for the project to succeed.
You might also want to have procedures and protocols  in place for the group - naming conventions, ways of submitting work to each other, how you will communicate outside of class time etc.
Re-engineer the app you chose, implementing the modifications for improvement OR build a prototype for your client. (Talk to me about what is an acceptable prototype)- keep in mind working as a team is what you are reflecting on here… so make the coding aspect manageable.
Remember to read the rubric to see how you will be evaluated on this project! You will be asked individually, to submit a Group project analysis and debrief as well as user documentation for your product. 

Schedule For The Project: 

Group Member
Full Task
Monday’s Task
Tuesday’s Task
Wednesday’s Task
Thursday’s Task 
Alexander Duong
-Monster Class (sections of it)
-Planning and organizing the project with the group
-Health and Damage methods for the Monster Class
-Get methods for the Monster Class
-Combing the Monster Class code (checking for logic) and fixing errors


Atchya Nandan
Player Class
(instance variables, get set methods for name and health, buff the players health method a increasing the strength method) 


Instance Variables 
And Get set methods 
Health method and buffer method 




Karim Al-Bukhari
Test class
-All the test class will do is call a new instance of a game, and ask the user if they want to play again

-make sure to include try catch for input




Test class
-All the test class will do is call a new instance of a game, and ask the user if they want to play again

-make sure to include try catch for input




John Khalife 
Constructor of monster class

Random name method of monster class

Reset method of monster class




Planning and distributing workload
Constructor of monster class

Random name method of monster class

Reset method of monster class




Vincent Zhu 
Player class
random PlayerHPBuff Method,

random PlayerATKBuff Method,





















ICS4U Group project analysis and debrief
Once the project is complete each team member needs to create and submit:
One member of your group should submit the file program - methods and classes should have group members names on their work.
Planning document (can be group, but each individual must have a specific piece they created)
A report on the management of the project. Plan vs. actual outcome, changes made to the original design with rationale and lessons learned, to explain what could be improved upon in a subsequent project.  Success and failures!
An objective reflection and assessment of the team’s performance, including individual progress towards the completion of the project. (no names please just give team members #s. I want an objective reflection on individuals’ shortcomings and contributions as well as some analysis regarding the underlying reasons for these successes or shortcomings)
Criteria
Level 4
Level 3
Level 2
Level 1
B1. demonstrate the ability to manage the software development process effectively, through all of its stages – planning, development, production, and closing;
B1.3 produce the software according to specifications (i.e., code, test, deploy), 
(really looking for time management here)


All specifications are met and some specs that were not part of the original plan that are useful have also been included.
All specifications from the original plan are well met.
One small specification from the original plan is missing or not well implemented.
Specs are missing or several specs are not well implemented or buggy.
planning document;
Extremely well thought out documentation, easily readable by the intended audience. Clear instructions on use that explains all aspects of the product.


Well thought out documentation. Instructions are free of grammatical or spelling errors. Explains the most common uses of the product. 


Documentation is mostly clear although there are some aspects of use that are unclear or omitted. There are one or two grammatical errors or spelling mistakes.


Documentation is written but spelling and grammar interferes with the understanding of the instructions. Several instructions for use of the product are missing. 


B1.6 review the management of the project
and prepare a report in an appropriate format;
Thorough review of the project, with a comparison of actual vs. planned performance. A thoughtful, in depth review indicates several opportunities for improvement as well as a recognition of successes  
Review of the project includes both the planned vs. actual progress of the development process as well as an analysis of failures and recommendations for future success
Review of actual vs. planned progress of the development of the project with some analysis of discrepancies between the two
Review of the project compares actual vs. planned progress of the development process or an analysis of issues that arose during the process
B2. apply standard project management techniques in the context of a student-managed team project.
B2.2 demonstrate the ability to meet project goals and deadlines by managing individual time during a group project;
Team member is always on task and is aware of the overall progress of the team towards the end closing date
Team member is always on task during work periods
Team member is occasionally off task during work periods
Team member needs to be reminded of tasks and has no awareness of the overall progress of the team as a whole towards the closing date
B2.3 reflect on, and assess, team and individual progress during the project review.
Both the performance of the team and all of individual members’ contributions or shortcomings were analyzed in a thoughtful an objective manner
Both the performance of the team and of individual members’ contributions or shortcomings were analyzed in an objective manner
Both the performance of the team and some individual contributions were examined for either their contributions or shortcomings
The performance of either the team or individuals was reflected upon in a somewhat objective manner


