Tennis Refactoring Kata
=======================
Reference: This kata was adapted from Bache, E. (2013). The Coding Dojo Handbook (p. 208). https://leanpub.com/codingdojohandbook

Context
=======
Your team has been in charge of building a scoreboard to display the current score during tennis games. The system assumes a chair umpire will hold a handset with two buttons labeled “player 1 scores” and “player 2 scores”, which he or she will press when the respective player scores a point. When this happens, a big scoreboard display should be updated to show the current score. When one of the players has won, the scoreboard should display which one.

Tennis scoring rules are as follows:
1.	The first player to have won at least four points by two points or more over the opponent wins the game. The score is then “Win for player1” or “Win for player2”
2.	The running score of each game is called in peculiar manner: scores from zero to three points are called “Love”, “Fifteen”, “Thirty”, and “Forty” respectively.
3.	If each player has scored at least three points and the scores are equal, the score is called “Deuce”.
4.	If each player has scored at least three points, and a player has one more point than his opponent, the score is called “Advantage player1” or “Advantage player2”.

Your team has created a TennisGame class containing the logic that outputs the correct score as a string for displaying on the scoreboard. The implementation assumes that the chair umpire pressing the button “player 1 scores” will result in a call to the method wonPoint(“player1”), and similarly wonPoint(“player2”) for the other button. This method returns a string with the current score. Scoring Sets and Matches has been deferred to a future iteration, so for the current iteration the program only needs to report the score for the current game. Feel free to modify the method names to match the idiom for your programming language.

The current implementation works and it passes all the tests. However, the code is not necessarily clean. You are being asked to tidy up the code a little and perhaps make some notes of the design improvements so you can share with your teammates. Time permitted, the product owner also would like to be able to replace “player1” and “player2” with the actual names of the players (e.g., “Serena Williams”, “Maria Sharapova, “Roger Federer”, “Rafael Nadal”, etc.)

Instructions
=============
There are three scenarios (TennisGame1, TennisGame2, and TennisGame3) for this refactoring kata – imagine three different teammates each with their own solution to the problem. We suggest you start with the first version of the code. When you’ve made that one look beautiful, start over with the second and third versions.

The code (in Java) for the three implementations is provided here in case you prefer performing this kata on paper.  If you want to work on your computer, the instructor will provide a copy of the code. The code is available for several popular programming languages for you to try on your programming environment of preference.  A test set is also provided. The tests are almost exhaustive, and fast to run, so any mistakes you make while refactoring should be very obvious. You should not need to change the tests, only run them often as you refactor. 

