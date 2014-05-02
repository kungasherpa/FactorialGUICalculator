FactorialGUICalculator
======================
This is a factorial calculator built with GUI interface that can calculate factorial of numbers from 1 to 1000. 

Background
  Most traditional calculator applications cannot calculate factorial of large numbers. Factorial of large numbers are 
displayed in exponential form. However there are very few that shows pricise calculation. This calculator is designed 
to show factorial of large numbers from 1 to 1000 precisely. 

Program Description
  Factorial of any numbers can be calculated by multiplying the facotiral of number less than the number times the number 
itself i.e., facotiral of number n! = (n-1)!*n. So when a factorial has to be calcualted, it is always started at number 1 
assumming the factorial of 1 is always 1. So it goes 
factorial of 2! = 1! * 2 = 2
factorial of 3! = 2! * 3 = 6 
factorial of 4! = 3! * 4 = 24 and so on 
  Another important feature of the program is the facotorial is calcualted by implementing the linked list feature of java.In linked list, the number of nodes can be increased or decreased depending upon the requirements. Initially the linked list only contains one number i.e, 1. The calculation then increases by multiplying the next number by the number in the linked list and saving it in the linked list again. When the number of digits reaches 4, new node is added so that each node in the linked list contains 3 digits. This makes the calculation faster. Subsequently the carryover are also
stored in another temp variable and added to the next node. At the end when no other node exist and there is still
carryover left then a new node is created and the carry over is added to it. Finally the result is displayed. 

Program Design
The program is also designed by implementing the MVC(Model View Architecture). It makes the codes resuable and maintainable throughout the future. 
