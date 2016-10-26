Admin Manual
====================
1. Uppsetning á Git og Heroku
====
Til að geta hafist handa er nauðsynlegt að hafa virkan GitHub aðgang. Þegar sá aðgangur er til staðar er hægt að velja á milli þess að setja upp ssh lykil (key) eða notast við notendanafn og lykilorð. Að lokum þarf að sækja Heroku toolbelt.

 Til að auðvelda uppsetningu er hægt að fylgja eftirfarandi leiðbeiningum

  - https://help.github.com/articles/set-up-git
  - https://help.github.com/articles/generating-ssh-keys
  - https://devcenter.heroku.com/articles/quickstart

2.Pull og Deploy
====
Í upphafi þarf að búa til afrit af skránum með því að gera skipunina git 
copy og afrita slóðina https://github.com/LittleBobbyTablesHUGB/TicTacToe-1.git

síðan þarftu að fara inn í dorectory sem sótt var með fyrir aðgerð með því að gefa skipunina 
- cd TicTacToe-1

seinasta skrefið er að færa verkefnið á Heroku serverinn með því að gefa skipunina 
- git push Heroku master

3.Viðhald
====
Ef þörf er á að uppfæra útgáfu eða serverinn þinn þá þarftu að vera staðsettur í TicTacToe-1/directory og gefa eftirfarandi skipanir:
-git pull 
-git push Heroku master
  
 
