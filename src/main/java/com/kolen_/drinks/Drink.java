package com.kolen_.drinks;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import java.util.ArrayList;
import java.util.HashMap;

public class Drink {

    public final Drinks plugin;
    public final Recipe recipe;
    public final ItemStack drink;

    public static HashMap<String, Drink> drinks = new HashMap<>();

    public Drink(Drinks plugin, String id, Recipe recipe, ItemStack result) {
        this.plugin = plugin;
        this.recipe = recipe;

        this.drink = result;
        Bukkit.addRecipe(recipe);
        drinks.put(id, this);
    }


}
