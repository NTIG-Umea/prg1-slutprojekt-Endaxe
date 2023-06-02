# Titel

Noah Axelsson 2023-06-02

## Inledning

Mitt syfte var att göra ett rit programm som kördes och fungerade. 
Mitt mål var att iallafall få ut ett program som funkade men också ha några tilläg, fast det var om jag blev färdig med grund koderna.
Jag började med att kolla på inspiration som var rimliga,så det blev paint.
Sedan så försökte jag tänka på hur jag kunde koda den så effektivast så möjligt och fick tips om att göra en bild i photoshop och använda kordinater på bilden, istället för att göra en knapp var för sig.


## Bakgrund

Jag vill göra detta projekt för att jag kände att det var den rimligaste med kunskaperna jag kan och att det fortfarande var lite utmanande med nya grejer.
Så att det inte bara var grejer som jag kunde. 

Hela allt börjad med ett pappers skiss där den stora baren var utritad med lite ideer om hur man kunde använda den.
Jag gick tillbaka och tog grundkoden från ett interaktivt spel från tidigare för att det var det jag behövde, tog självklart bort all kod som hade med det och göra så att det blev från start.
Det första jag ville var att få den och starta i rätt upplösning så jag satte setSize på 1920x1080.
Sedan så ritade jag ut bara en vanlig rektangel med olika storlekar för att bestämma exakt hur stor baren ska vara.
Tog storleken och la in det som ett nytt projekt i photoshop.
Resultat blev bilden nedan:
![GitHub Logo](/images/bar.png)
Baren från photoshop.


Importerade bilden in i projektet och la den på 0 X för den ska vara längst till vänster.
Sedan så började arbeta utifrån det.
I ett ritprogram så är det minsta man ska kunna göra är att rita så det var första fokuset.
Jag ritade ut en bas som fick vara som ett "papper" för att ha något och rita ut på, detta användes senare som ett sätt för att ta bort innehållet som finns på det. "reset knappen".
Nu när jag hade basen så satte jag bara in en if sats i mousedragged för att det är då jag vill att den ska lyssna.
If satsen var att den ska rita ut en liten oval med svart färg OM kordinaten var över 300 x för det var där "baren" började och man ska inte kunna rita över den.
När detta var klar så gjorde jag en private color för färgen som används. 
Detta skulle vara den som ändrade värde på endast färgen när man klickar på dem olika färgpenslarna.
När jag hade dem så behövde jag bara kordinaterna.
För varje gång musen rör på sig så ska den skriva ut både x och y värde. 
Satte in system out i mouse moved där den tar get Y och get X.
Endast som behövde göra var att lägga musen på högsta och minsta X och Y och anteckna ner det.
Med alla kordinater som behövdes så var mouseclicked nästa steg, vilket är eventet när man clickar på musen.
Gjorde en if sats där: om jag clickar mellan dem här kordinaterna så byt current color till (en färgkod).
Det var bara mellan högsta och minsta X värdet och samma på Y.
Sist men inte minst så behövde jag få reset knappen och fungera.
Som jag skrev i början så gjorde jag en bas för att rita och för att få allt och att försvinna så gjorde jag bara en metod där en till vit bas ritas över det tidiagre.



## Positiva erfarenheter

Något nytt och positivt som jag nog behöver i framtida projekt är att hitta kordinater för if satserna.
Detta kommer förmodligen underlätta sånna problem i framtiden och det var inte så avancerat som det kan låta. 
Om jag behöver kordinater för något senare så kommer det nog vara denna metoden som jag använder mig av.

Det gick också bra att göra en bild och importera den för att använda den på ett annat sätt än vad vi har gjort innan.
En bra genväg istället för att rita ut allt var för sig, som kan kosta en massa tid.
## Negativa erfarenheter

I början var det kaos i koden för att jag ville ha så mycket på en gång så all kod blev okordinerade.
För att undvika detta så borde jag nog anteckna ner alla grejer som behöver göras i varsin kategori så att jag fokuserar på en grej i taget och arbetar utifrån det.

## Sammanfattning

Som en nästan klar slutprodukt så blev jag rätt nöjd med mitt projekt. 
Det var mycket jag lärde mig som det jag har nämnt innan.
Det var olika sätt man kan lösa problemen med andra programm och använda metoder för att hitta något som man behöver använda.
Detta var nog en erfarenhet där jag blev mer säker runt om denna område men som kan bli ännu bättre.
De blev inte klart till 100% just för att början var lite långsam och tiden blev för liten på slutet för att slutföra dem sista funktionerna.
Det finns definitivt mer utrymma för att fortsätta, som att göra klart text och sudd funktionerna.
Det finns fler funktioner som ritpgrommar som kan införas också men som sagt det handlar om tid.
