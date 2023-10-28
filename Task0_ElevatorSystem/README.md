# Elevator Algorithm:                                                                
## Dor Harizi
---
This project gives a response to the The problem of the placement of calls for elevators in a given building, so that the average for making each elevator call will be lower than possible. 

---

## Algorithm features

*	Matching elevator is chosen based on the formula: state of the elevator + the expected time the elevator will travel from floor a to floor b
*	If pickup call happens in the same direction as a previous call it is assigned to the elevator already having this path
*	Elevator picks up the passengers only in the same direction which minimizes their travel time in case elevator is going way too far in opposite direction
*	The Elevator's class will automatically create a matrix for each elevator. the matrix will represent the fastest time the elevator will travel from floor a to floor    b, and has a main rule in the allocation system
*	
---
## How to use the program:
Clone the repository 
```
git clone https://github.com/DorHarizi/Opp_Assignments/tree/main/Task0_ElevatorSystem.git
