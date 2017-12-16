# Tennis Refactoring Kata
This kata was adapted from [Coding Dojo Handbook](https://leanpub.com/codingdojohandbook) by Emily Bache (2013). You might want to also take a look to her [repositoty](https://github.com/emilybache/Tennis-Refactoring-Kata) for this kata.

## Context
Tennis has a rather [quirky scoring system](http://en.wikipedia.org/wiki/Tennis#Scoring) and to newcomers it can be a little difficult to keep track of. Your team has been building a scoreboard to display the current score during tennis games. Your team has created a `TennisGame` class containing the logic that outputs the correct score for displaying on the scoreboard. The current implementation works and it passes all the tests, but unfortunately the code is unclean. You are being asked to spend an hour or so tidying up the code and perhaps make some notes of the design improvements so you can share them with your teammates. 

The system assumes chair umpires will hold a handset on which they will press a button when a respective player scores a point, which will result in a call to the method `wonPoint(<player name>)`. This method returns a string with the current score that get displayed on a big scoreboard display.  

The Tennis scoring rules can be summarized as follows:

1. The first player to have won at least four points with a lead of two points or more over the opponent wins the game. The score is called _"game: <player name>"_ for the player in the lead.
2. The running score of each game is called in peculiar manner: scores from zero to three points are called _“love”_, _“fifteen”_, _“thirty”_, and _“forty”_ respectively.
3. A tied score is called adding the word _"all"_ to the point score (e.g., _"love-all", "fifteen-all", "thirty-all"_), except when both players have scored at least three points, in which case the score is called _“deuce”_.
4. When both players haver scored at least three points and a player has one point ahead of his opponent, the score is called _"advantage: <player name>"_ for the player in the lead.

Notice that for the current iteration the program only needs to report the score for the current _game_; scoring _sets_ and _matches_ has been deferred to a future iteration. 

## Instructions
There are three versions (`TennisGame1`, `TennisGame2`, and `TennisGame3`) of this refactoring kata, each with their own design smells and challenges. I suggest you start with the first one, with the class `TennisGame1`. The test suite provided is fairly comprehensive, and fast to run. You should not need to change the tests, only run them often as you refactor. Feel free to modify the method names to match your programming language conventions.

