# Boggle
Solution to the Boggle assignment.

## Summary
Boggle is a word game designed by Allan Turoff and distributed by Hasbro. It involves a board made up of 16 cubic dice, where each die has a letter printed on each of its 6 sides. At the beginning of the game, the 16 dice are shaken and randomly distributed into a 4-by-4 tray, with only the top sides of the dice visible. The players compete to accumulate points by building valid words from the dice, according to these rules:
* A valid word must be composed by following a sequence of adjacent dice—two dice are adjacent if they are horizontal, vertical, or diagonal neighbors.
* A valid word can use each die at most once.
* A valid word must contain at least 3 letters.
* A valid word must be in the dictionary (which typically does not contain proper nouns).

## The Problem
Write a program to play the word game Boggle.

## Scoring
Valid words are scored according to their length, using this table:
| Word Length | Points | 
| :---:       | :---:  |
| 3-4         | 1      |
| 5           | 2      |
| 6           | 3      |
| 7           | 5      |
| 8+          | 11     |

## Qu Special Case
In the English language, the letter Q is almost always followed by the letter U. Consequently, the side of one die is printed with the two-letter sequence Qu instead of Q (and this two-letter sequence must be used together when forming words). When scoring, Qu counts as two letters; for example, the word QuEUE scores as a 5-letter word even though it is formed by following a sequence of only 4 dice.

## Specification.
Programming assignment specification can be found [here.](https://coursera.cs.princeton.edu/algs4/assignments/boggle/specification.php)
