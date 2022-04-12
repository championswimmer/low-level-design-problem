# Wordle

## Problem Statement 

Design a CLI-based implementation of the famous Wordle game. 

Refer actual Wordle game [here](https://www.nytimes.com/games/wordle/index.html)  

## Requirements 

- The game starts with a board having 6 rows each of 5 empty boxes
- Assume: You will be provided with a list of valid 5 letter words
- Each iteration of the game, a random 5 letter word is picked (player doesn't know it) 
- Player gets 6 attempts to guess a 5 letter word 
- On each attempt player has to enter a 5 letter word 
- For a valid attempt the word must be one of the valid words provided to you 
- For every attempt, mark the 5 boxes as this 
  - GREEN: If the letter matches the letter of the correct word in this position 
  - YELLOW: If the letter is contained in the correct word, but at a different position 
  - GREY: If the letter does not exist in the correct word 
- After every attempt, mark the corresponding letters as GREEN/YELLOW/GREY in the keyboard too
- If all letters are green (i.e. correct word guessed), player wins
- Player loses after 6 attempts are over


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

- Keep the code extensible to accomodate multiple word size (4, 5, 6 etc)
- Keep the code extensible to allow different difficulty levels (easy = more attempts, hard = less attempts) 
- Possible to enable hard-mode: In hard mode, every attempt must use green + yellow letters and not use grey letters
