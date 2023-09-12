# Témalaboratórium specifikáció


### 2022/10/23
### Captcha-szerü játék
### Andrási Benedek - (T6KN6G)
### Konzulens: Pataki Béla

## Bemutatás



Az alkalmazás lényege az, hogy mutat képeket egy grafikus felületen a felhasználónak, akinek ki kell találnia,
milyen csoporthoz tartozik az a kép, egy az adott csoporthoz csatolt gombra(jobb és ball klikk ebben a megvalósításban) való kattintással.

A alkalmazás visszajelzést küld a felhasználó számára szöveges üzenettel( ha idén belefér, akkor a grafikus felületen
egy szövegdobozba) minden választás után és statisztikát is vezet, melyet a menet végeztével kiír a felhaszáló számára.

Az alkalmazás bővíthető, mind képekkel, mind típusokkal. Ezek a képek külön-külön mappákba tárolandók.

Ki lehet választani, hogy az adott futáskor mely csoportokkal fusson a játék(Ez még nincs eldöntve, hogy környezeti
változókkal vagy a grafikus felületen gombnyomással történjen).

Az alkalmazás kezdetleges megvalósításában Állatok és Játékállatok csoportjai vannak. Egy menet hossza 10 randomizáltan
előhozott kép( ezt később megváltoztathatóvá lehet tenni, a képek számosságához képest, a grafikus felületen megadva)

Az alkalmazás Java nyelven íródik Gradle build tool segítségével.

Későbbi ötletek még: 

- Az eredmények elmentése perzisztensz adattárolási rendszerben.
- Ezek az eredmények szerint grafikon kirajzolása.
- Kilógó értékek jelzése.
- További csoportok hozzáadása.
- Több csoport használata, mint 2 egyszerre -> más gombok bevonása.
- Ezek a gombok beállítása a grafikus felületen.
- integrállása gyűjteménybe.