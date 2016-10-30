#Development Manual
==================

Í þessari handbók verður farið yfir það sem þarf til þess að keyra eftirfarandi verkefni í óuppsettri Tölvu.

1. Útgáfu stjórnun og aðgangur
=======
Útgáfustjórnunarkerfið sem notað er í verkefninu er Git.
Til þess að fá aðgang að forritinu þarftu að byrja á að skrá þig sem notanda á Github ef þú er ekki nú þegar notandi. Einnig þarf að Git notandi að vera meðlimur í LittleBobbyTables organization á Git

2. Hvernig skal klóna verkefni á eigin vél
=======
Fara inn á https://github.com/LittleBobbyTablesHUGB/TicTacToe-1 og smella þar á hnappinn clone/download og valið þar um að opna á desktopi, hala niður zip skrá eða fara inn í GitBash og keyra þar skipunina git clone https://github.com/LittleBobbyTablesHUGB/TicTacToe-1.git
Ítarlegri leiðbeiningar hér : https://help.github.com/articles/set-up-git/

3. Build umhverfi
=======

 * [Git](https://help.github.com/articles/set-up-git/)
 * [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 
Mikilvægt er að vera með rétta útgáfu af Java, hægt er að athuga hvaða útgáfa af Java er á vélinni með skipuninnu : which java. Við viljum hafa Java version 8, ef ekkert svar kemur er Java líklega ekki uppsett á vélinni og þarf þá að ná í það með leiðbeiningunum hér að ofan.

4. Nauðsynlegir dependencies
=========
 * [Gradle](https://gradle.org/)
 
 * [Travis](https://travis-ci.org/)

 * [Heroku](https://Heroku.com)

 * Selenium IDE for Chrome. 

 * Jacoco

 * Junit

 * Spark

5. Build and deploy
==============
Þegar gerðar eru local breytingar þá þarf að keyra skipunina bin/deploy sem keyrir keyrir clean, package og unit_test og ef allt keyrir án þess að upp komi villur þá keyrist upp leikurinn locally og hægt er að testa í browser með ip-tölunni á vélinni og porti sem stillt er(default er 4567). Þegar allt er farið að virka locally þá er pushað á feature branch og þar keyrir travis build skriptur, unit test og deployar á staging http://littlebobbytablestttstaging.herokuapp.com/ og keyrir þar end-to-end selenium test. Ef allt keyrir eðlilega með success þá deployar travis á production server http://littlebobbytablesttt.herokuapp.com/.

Fyrir allar breytingar þarf að notast við feature branch og stofna pull request þegar allt hefur keyrt eðlilega á Travis. Pull request þarf að samþykkjast af öðrum meðlimum í teyminu.

