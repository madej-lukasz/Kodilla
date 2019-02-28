package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
      private String bun;
      private int burgers;
      private String sauce;
      private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder setBurgers(int burgers) {
            this.burgers = burgers;
            return  this;
        }

        public BigMacBuilder setSauce(String sauce) {
            if (sauce.equals("standard") || sauce.equals("1000 wysp") || sauce.equals("barbecue")){ ;
            this.sauce = sauce;
            return this;
            }else{
                throw new IllegalStateException("Wybierz sos");
            }

        }

        public BigMacBuilder setIngredient(String ingredient) {
            if (ingredient.equals("salata") || ingredient.equals("cebula") || ingredient.equals("bekon")) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Wybierz składniki");
            }
        }
        public BigMac build(){
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    public BigMac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
