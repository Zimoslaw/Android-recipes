package com.mobile.recipes;

public class Recipe  {
    private String name;
    private int count;
    private String unit;
    private String ingredients;
    private String preparation;
    private int imageId;
    public static final Recipe[] recipesDinner = {
            new Recipe("Placki tortilla", R.drawable.tortilla, 12, "placków", "3 szkalnki mąki\n" +
                    "1 szklanka gorącej wody\n" +
                    "3 łyżki oliwy z oliwek",
                    "W misce umieść mąkę, sól, roztopione masło oraz wlej bardzo gorącą wodę (najlepiej wrzątek). Od razu zamieszaj całość łyżką. Po chwili możesz już zacząć wyrabiać ciasto ręcznie (lub mikserem z hakiem do ciasta drożdżowego). Ciasto będzie gorące, ale nie na tyle, by się nim oparzyć.\n" +
                            "Wyrabiaj ciasto kilka minut, aż będzie zwarte i elastyczne. Przykryj je np. folią i odstaw do wystudzenia na 20 minut.\n" +
                            "Po tym czasie możesz już podzielić ciasto na 12 równych kawałków. Ja rozwałkowuję kulę ciasta dłonią na kształt cienkiego wałka i tnę ciasto jak domowe kopytka. Powinny wyjść kawałki wielkości orzecha włoskiego.\n" +
                            "Czystą ściereczkę kuchenną lekko zroś wodą na całej powierzchni, by była wilgotna. Ściereczkę złóż na pół. Pod ściereczką umieść kawałki ciasta. Kawałki ciasta trzymane pod wilgotną, bawełnianą ściereczką nie będą wysychać.\n" +
                            "Suchą, płaską patelnię nagrzej na dużej mocy palnika. Pierwszy kawałek ciasta rozwałkuj na drewnianej desce lub stolnicy (bez podsypywania stolnicy mąką). Kawałek ciasta postaraj się rozwałkować jak najcieniej tylko możesz.\n" +
                            "Ostrożnie łapiąc palcami z dwóch stron, przełóż placek na nagrzaną patelnię. Wystarczy po 20 sekund na każdą stronę. Na placku powinny się zacząć pokazywać pęcherzyki.\n" +
                            "W tym czasie szykuj już kolejny placek. Każdy gotowy kładź jeden na drugim, między połówkami wilgotnej ściereczki. Cienkie ciasto pęcherzyków powinno się podpiekać na brązowo, wiec w razie gdyby placki za mocno się podpiekały, zmniejsz moc palnika.\n" +
                            "Placki z tortilli trzymaj pod ściereczką do całkowitego wystudzenia. Potem (jeśli nie zostaną zjedzone od razu) umieść je w spożywczym woreczku strunowym lub w folii. Koniecznie sprawdź też przepis na najlepsze na świecie i najprostsze do zrobienia podpłomyki z samej wody i mąki."
            ),
            new Recipe("Falafel", R.drawable.falafel, 16, "falafeli",
                    "200 g suchej ciecierzycy - niecała szklanka\n" +
                            "1 mała cebula - do 100 g\n" +
                            "3 ząbki czosnku - około 15 g\n" +
                            "pół płaskiej łyżeczki sody oczyszczonej\n" +
                            "przyprawy: po łyżeczce mielonej kolendry, soli i kuminu; po 1/3 płaskiej łyżeczki pieprzu, imbiru, gałki muszkatołowej i cynamonu\n" +
                            "do smażenia: około pół szklanki oleju np. rzepakowego rafinowanego\n",
                            "Falafele robimy wyłącznie z surowej, moczonej wcześniej ciecierzycy. Nigdy nie używamy do tego przepisu ciecierzycy (cieciorki) gotowanej. Aby zrobić 16 falafeli potrzebujesz 200 gramów (niepełna szklanka) suchej ciecierzycy. Dzień wcześniej należy zalać ją zimną wodą (przegotowana lub z filtra). Wystarczą dwie szklanki wody, czyli około 500 ml wody. Nie mocz jednak ciecierzycy dłużej niż 12 godzin, by nie zaczęła fermentować (szczególnie, gdy w pomieszczeniu temperatura jest wyższa niż 19 stopni). Cieciorka wchłonie sporo wody i napęcznieje. Moja cieciorka po namoczeniu ważyła łącznie około 430 gramów. Wodę z moczenia wylej a cieciorkę przepłucz na sitku. \n" +
                                    "\n" +
                                    "Porada: Do moczenia ciecierzycy nie używam sody oczyszczonej. Wolę ją dodać do masy, by falafel wyszedł puszysty i nie chłonął dużej ilości tłuszczu. Na zdjęciu poniżej jeszcze sucha ciecierzyca po 12 h moczenia w wodzie. Ciecierzycę można też moczy krócej, ale nie krócej niż sześć godzin.\n" +
                                    "Do miski z namoczoną i odcedzoną ciecierzycą dodaj również obraną, małą cebulę oraz obrane trzy ząbki czosnku (wszystko surowe). Do tego jeszcze tylko zestaw ziół. Ja dodałam: po łyżeczce mielonej kolendry, soli i kuminu (kmin rzymski); po 1/3 płaskiej łyżeczki pieprzu, imbiru, gałki muszkatołowej i cynamonu. Dodatkowo można też dodać płaską łyżeczkę suszonej mięty. \n" +
                                    "\n" +
                                    "Porada: Jeśli posiadasz mieszankę siedmiu przypraw libańskich to możesz dodać dwie płaskie łyżeczki takiej mieszanki oraz dodatkowo po 1/3 płaskiej łyżeczki mielonej kolendry, soli i kuminu. Ewentualne mieszanki gotowych przypraw do falafela dodawaj zgodnie z zaleceniami na opakowaniu.\n" +
                                    "Całość polecam wymieszać, by przyprawy oblepiły ciecierzycę. Wszystkie składniki z miski należy zmielić w maszynce do mielenia mięsa. Ja wybieram nakładkę z najmniejszymi oczkami. Sama mielę składniki tylko raz. Jeśli jednak Twoja maszynka nie ma tak drobnych oczek (niecały milimetr), to możesz masę zmielić dwukrotnie. Do zmielonej masy dodaj teraz pół płaskiej łyżeczki sody oczyszczonej i bardzo, bardzo dokładnie wymieszaj całość na gładką masę (najlepiej dłońmi).\n" +
                                    "\n" +
                                    "Miskę z masą przykryj talerzem i odstaw na około godzinę (nie do lodówki). Masa ma idealną konsystencję, gdy możesz z niej formować nierozpadające się kulki. Pamiętaj o tym, że falafel sam się nie uformuje, dlatego też trzeba lekko ugniatać ciasto w zwartą formę i dopiero kształtować falafele. \n" +
                                    "\n" +
                                    "Porada 1: Po co dajemy sodę do masy na falafele? Soda sprawi, że Twój falafel będzie chłonął mniej tłuszczu podczas smażenia. Dodatkowo falafele będą miększe i bardziej puszyste, a nie zbite. Falafele z sodą smażą się trochę szybciej. W środku są mięciutkie, zaś na zewnątrz rumiane i chrupiące. \n" +
                                    "\n" +
                                    "Porada 2: Od razu zaznaczę, że nigdy nie miksuję ciecierzycy na falafele przy użyciu blendera, czy też innego robota kuchennego tego typu. Używam maszynki do mielenia z nakładkami na najmniejsze oczka.\n" +
                                    "Jeśli tłuszcz jest już dobrze nagrzany, to można zacząć smażyć falafele. Smaż po kilka falafeli na raz. Jak tylko falafel ładnie się od spodu zarumieni, to odwracaj go na drugą stronę. Usmażone falafele wyławiaj np. przy pomocy spłaszczonego sitka i od razu odkładaj na ręcznik papierowy, który wchłonie nadmiar oleju. \n" +
                                    "\n" +
                                    "Moje falafele smażyły po po około 1,5 minuty na stronę. Twoje mogą się smażyć trochę krócej lub trochę dłużej. Będzie to uzależnione od ich wielkości i grubości oraz tego w jakim stopniu nagrzany jest tłuszcz. Jeśli zauważysz, że falafele za szybko się rumienią, to zmniejsz moc palnika. W ten sposób usmaż wszystkie falafele"
            ),
            new Recipe("Pierogi ruskie", R.drawable.pierogi_ruskie, 60, "pierogów",
                    "Składniki na ciasto na pierogi:\n" +
                            "\n" +
                            "500 g mąki pszennej np. typ 500\n" +
                            "szklanka gorącej wody - 250 ml\n" +
                            "4 łyżki oleju - 50 ml\n" +
                            "pół łyżeczki soli\n" +
                            "\n" +
                            "Składniki na farsz:\n" +
                            "\n" +
                            "300 g twarogu półtłustego\n" +
                            "duża cebula - 300 g\n" +
                            "500 g ugotowanych ziemniaków\n" +
                            "2 łyżki masła klarowanego\n" +
                            "po pół płaskiej łyżeczki soli i pieprzu",
                    "Obierz około 650-700 gramów ziemniaków i ugotuj do miękkości w osolonej wodzie. Odlej wodę, dokładnie osusz i zmiel ziemniaki lub ubij tłuczkiem na puree. Powinno Ci wyjść nie więcej niż 500 gramów masy ziemniaczanej. Puree odstaw do przestudzenia. Do miski ze zmielonymi ziemniakami dodaj też po pół płaskiej łyżeczki soli i pieprzu.\n" +
                            "\n" +
                            "Porada: Ugotowane ziemniaki najlepiej jest zmielić w maszynce lub przepuścić przez praskę jeszcze lekko ciepłe. Pamiętaj o tym, że ciepłe ziemniaki łatwiej jest przepuścić przez praskę niż zimne z lodówki, które robią się wtedy twarde. Jeśli jednak mielisz ziemniaki w maszynce, to możesz też użyć ziemniaków z obiadu, z dnia poprzedniego. Wówczas mogą być też zimne.\n" +
                            "Dużą cebulę obierz i poszatkuj. Możesz też użyć kilku mniejszych sztuk o łącznej wadze około 300 gramów. Na nagrzaną patelnię dodaj dwie łyżki masła klarowanego. Dodaj poszatkowaną cebulę i podsmażaj na średniej mocy palnika przez około 10 minut. Masło możesz zastąpić delikatną oliwą lub innym ulubionym olejem do smażenia.\n" +
                            "Do farszu potrzebujesz 300 gramów twarogu. Możesz użyć twaróg półtłusty lub tłusty w kostce, typu krajanka (w bloczkach) lub też w \"trójkącie\" pakowany w papier. Twaróg można zmielić w maszynce lub też przepuścić przez ręczną praskę. Do farszu na pierogi ruskie nie używam twarogu mielonego sernikowego w wiaderku, ponieważ nawet te bardzo dobrej jakości twarogi mielone nie są tak zwarte, jak te sprzedawane w kostce.\n" +
                            "Masę ziemniaczaną, zmielony twaróg, zeszkloną z masłem cebulę oraz sól i pieprz wymieszaj razem w jednej misce. Farsz na pierogi ruskie jest już gotowy." +
                            "Przygotuj ciasto na ruskie pierogi. Do szerokiej miski przesiej mąkę. Pół kilograma mąki, to połowa standardowego opakowania o wadze jednego kilograma. Dodaj pół łyżeczki soli oraz cztery łyżki oleju np. rzepakowego. Olej z pestek winogron oraz inne oleje o delikatnym smaku również się sprawdzą. Wlej szklankę gorącej, przegotowanej wody i zamieszaj ciasto łyżką a następnie zacznij je wyrabiać. \n" +
                            "\n" +
                            "Pierogi ruski\n" +
                            "Ciasto można też śmiało wyrabiać w maszynie np. w Thermomix. Ciasto powinno być miękkie, plastyczne i elastyczne.\n" +
                            "Gotową kulę ciasta zawiń w folię i odłóż na 30 minut. Ciasto po leżakowaniu nie będzie się kurczyć podczas wałkowania.\n" +
                            "Po tym czasie ciasto odwiń z folii i podziel na 3 części. Dwa kawałki odłóż na bok i przykryj bawełnianą ściereczką, by ciasto nie obsychało.\n" +
                            "Jeden kawałek rozwałkuj cienko na stolnicy lub na blacie lekko oprószonym mąką. Przy pomocy wykrawaczki o średnicy około 8 cm wycinaj okrągłe placki pod pierogi.  Na środek placka nakładaj farsz na pierogi ruskie. Daję zawsze sporo farszu. Kulkę farszu lekko spłaszczam na kształt wałeczka, by idealnie wypełnić wnętrze pieroga. Pierogi składaj na pół i sklejaj boki. Po sklejeniu łączenia polecam wykonać dodatkowo falbankę. \n" +
                            "\n" +
                            "Porada: Resztki ciasta po wykrawaniu pierogów zbieraj i na koniec połącz w jedną kulę. Ponownie rozwałkuj ciasto i wycinaj placki pod pierogi. Z resztek ciasta możesz też ugotować na koniec kluski z ciasta na pierogi."
            )
    };
    public static final Recipe[] recipesDessert = {
            new Recipe("Rogale Świętomarcińskie", R.drawable.rogal, 24, "rogale",
                    "Ciasto:\n1 szklanka lekko ciepłego mleka\n1 łyżka suchych drożdży lub 30g świeżych\n1 jajko\n½ łyżeczki ekstraktu z wanilii\n3,5 szklanki mąki pszennej (u mnie 525g)\n3 łyżki cukru szczypta soli\n225g miękkiego masła (z tego 2 łyżki należy użyć do ciasta)\n\nNadzienie:\n300g białego maku\n100g masy marcepanowej\n¾ szklanki cukru pudru\n100g orzechów włoskich\n100g zblanszowanych migdałów\n1- 2 łyżek kandyzowanej skórki pomarańczowej\nok. 2 łyżek gęstej, kwaśnej śmietany\n3 podłużne biszkopty, pokruszone na okruszki ",
                    "...")
    };

    private Recipe(String name, int imageId, int count, String unit, String ingredients, String preparation) {
            this.name = name;
            this.imageId = imageId;
            this.count = count;
            this.unit = unit;
            this.ingredients = ingredients;
            this.preparation = preparation;
    }

    public String getName() {
        return name;
    }

    public int getImageId() { return imageId;}

    public String getCount() {
        return count + " " + unit;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getPreparation() {
        return preparation;
    }

    public String toString() {
            return this.name + "\n" + this.ingredients + "\n" + this.preparation;
    }
}
