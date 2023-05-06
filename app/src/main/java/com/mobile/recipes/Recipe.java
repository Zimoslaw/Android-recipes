package com.mobile.recipes;

public class Recipe {
    private String name;
    private String recipe;
    public static final Recipe[] recipes = {
            new Recipe("Placki tortilla", "Składniki (12 placków):\n" +
                    "3 szkalnki mąki\n" +
                    "1 szklanka gorącej wody\n" +
                    "3 łyżki oliwy z oliwek"),
            new Recipe("Rogale Świętomarcińskie", "Składniki (ok. 24 rogale):\nCiasto:\n1 szklanka lekko ciepłego mleka\n1 łyżka suchych drożdży lub 30g świeżych\n1 jajko\n½ łyżeczki ekstraktu z wanilii\n3,5 szklanki mąki pszennej (u mnie 525g)\n3 łyżki cukru szczypta soli\n225g miękkiego masła (z tego 2 łyżki należy użyć do ciasta)\n\nNadzienie:\n300g białego maku\n100g masy marcepanowej\n¾ szklanki cukru pudru\n100g orzechów włoskich\n100g zblanszowanych migdałów\n1- 2 łyżek kandyzowanej skórki pomarańczowej\nok. 2 łyżek gęstej, kwaśnej śmietany\n3 podłużne biszkopty, pokruszone na okruszki ")
    };

    private Recipe(String name, String recipe) {
            this.name = name;
            this.recipe = recipe;
    }

    public String getRecipe() {
            return recipe;
    }

    public String getName() {
            return name;
    }

    public String toString() {
            return this.name;
    }
}
