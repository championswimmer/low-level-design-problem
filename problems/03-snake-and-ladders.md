# Snake and Ladders 

## Problem Statement 

Design a CLI-based Snake & Ladders game 

## Requirements 
- The game should take input `N` from user which is board size (board should be `N x N` in size) 
- Every time game is created, snakes and ladders should be placed randomly on the board 
- Snakes start from bigger box and goes down to lower
- Ladders start from lower box and goes up to bigger 
- The game should have `N` snakes and ladders each
- 2 Players will alternate in turns 
- Turns are played with a 1-6 die
- Players move as many places as their die rolls
- If player ends up at head of snake, move them to the tail 
- If player ends up at bottom of ladder, move them to the top
- First player to reach end of the board wins

## Expectations 

### Minimum Requirements 
- Make sure that you have a working and demonstrable code
- Make sure that the code is functionally correct
- Code should be modular and readable
- Separation of concern should be addressed
- Please do not write everything in a single file (if not coding in C/C++)
- Code should easily accommodate new requirements and minimal changes
- There should be a main method from where the code could be easily testable
- Write unit tests, wherever applicable
- No need to create a GUI

### Optional Requirements 
**Please do these only if you’ve time left.** You can write your code such that these could be accommodated without changing your code much.

- Keep the code extensible to accomodate multi-dice mode 
- Keep the code extensible to allow N players instead of 2 players 
- Allow configuring number of snakes and ladders separately from N


## (SOLUTION) UML Diagram 

![SNL-UML](https://user-images.githubusercontent.com/1327050/166486223-3b3d275c-6b1d-4dec-be8e-d6c34a59d264.png)


