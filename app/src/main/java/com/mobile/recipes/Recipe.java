package com.mobile.recipes;

public class Recipe {
    private String name;
    private int count;
    private String unit;
    private String ingredients;
    private String preparation;
    public static final Recipe[] recipes = {
            new Recipe("Placki tortilla", 12, "placków", "3 szkalnki mąki\n" +
                    "1 szklanka gorącej wody\n" +
                    "3 łyżki oliwy z oliwek",
                    "Wsyp makę..."),
            new Recipe("Rogale Świętomarcińskie", 24, "rogale",
                    "Ciasto:\n1 szklanka lekko ciepłego mleka\n1 łyżka suchych drożdży lub 30g świeżych\n1 jajko\n½ łyżeczki ekstraktu z wanilii\n3,5 szklanki mąki pszennej (u mnie 525g)\n3 łyżki cukru szczypta soli\n225g miękkiego masła (z tego 2 łyżki należy użyć do ciasta)\n\nNadzienie:\n300g białego maku\n100g masy marcepanowej\n¾ szklanki cukru pudru\n100g orzechów włoskich\n100g zblanszowanych migdałów\n1- 2 łyżek kandyzowanej skórki pomarańczowej\nok. 2 łyżek gęstej, kwaśnej śmietany\n3 podłużne biszkopty, pokruszone na okruszki ",
                        "...")
    };

    private Recipe(String name, int count, String unit, String ingredients, String preparation) {
            this.name = name;
            this.count = count;
            this.unit = unit;
            this.ingredients = ingredients;
            this.preparation = preparation;
    }

    public String getName() {
        return name;
    }

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
            return this.name;
    }
}
