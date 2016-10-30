Development Manual
==================

Í þessari handbók verður farið yfir það sem þarf til þess að keyra eftirfarandi verkefni í óuppsettri Tölvu. Nokkur forrit eru nauðsýnleg til þess að fá þetta verkefni til þess að keyra og eru þau:

   - Git

   - Java version 8

   - Gradle

1.Git
=====

Útgáfustjórnunarkerfið sem notað er í verkefninu er Git.
Til þess að fá aðgang að forritinu þarftu að byrja á að skrá þig sem notanda á Github ef þú er ekki nú þegar notandi.
Þegar það er komið ferð þú inn á https://github.com/LittleBobbyTablesHUGB/TicTacToe-1 og getur þar smellt á hnappinn clone/download og valið þar um að opna á desktopi, hala niður zip skrá eða fara inn í GitBashog keyra þar skipunina git clone https://github.com/LittleBobbyTablesHUGB/TicTacToe-1.git
Einnig er hægt að nálgast ítarlegri leiðbeiningar hér : https://help.github.com/articles/set-up-git/

2. Java
=======

Til þess að setja upp rétt Java umhverfi þá þarft þú að keyra skipunina:
- sudo apt-get install openjdk-8-jdk
Mikilvægt er að vera með rétta útgáfu af Java, hægt er að athuga hvaða útgáfa af Java er á vélinni með skipuninnu : wich java. Við viljum hafa Java version 8, ef ekkert svar kemur er Java líklega ekki uppsett á vélinni og þarf þá að ná í það með leiðbeiningunum hér að ofan.

3. Gradle
=========

Við þurfum einnig að vera með Gradle og það er hægt að ná það með þessari skipun :
- sudo apt-get install gradle

4. Tic Tac Toe
==============

Til að komast inn á GitHub þar sem leikurinn er staðsettur þarftu að gefa eftirfarandi skipanir inn á Git-Bash:
- cd TicTacToe-1
Þar er síðan gefin skipunin bin/deploy


