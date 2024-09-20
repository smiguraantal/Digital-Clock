# Digital-Clock

The application was inspired by the numbers displayed in the Windows XP Minesweeper game and was implemented in 2003 using the Swing framework. The numbers consist of seven segments, where specific segments light up to display each digit, while the others remain dim. For example, for the digit 1, only the segments on the right side light up, while the rest remain dim. When displaying other digits, different segments light up, forming the appropriate number on the display.

By modifying the source code, the display of the numbers can be easily adjusted: changing the `UNIT` in the `Constants` interface alters the size of the numbers, while modifying the `LIGHT_COLOR` and `DARK_COLOR` constants changes the colors of the illuminated and dim segments.

## Setup

To start the application, run the `DigitalClock.java` file located in the `org.example` package.

## Screenshots

<img src=docs/01.jpg alt="" width="600">
<img src=docs/02.jpg alt="" width="600">
<img src=docs/03.jpg alt="" width="600">