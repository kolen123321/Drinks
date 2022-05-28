package com.kolen_.drinks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.*;

import java.util.HashMap;

public final class Drinks extends JavaPlugin {


    @Override
    public void onEnable() {
        ShapedRecipe recipe;
        ItemStack item;
        PotionMeta meta;
        item = new ItemStack(Material.POTION);
        getCommand("drinks").setExecutor(new DrinksCommand(this));
        meta = (PotionMeta) item.getItemMeta();
        meta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 1), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 1), true);

        meta.setDisplayName(ChatColor.YELLOW + "Beer");
        item.setItemMeta(meta);
        recipe = new ShapedRecipe(item);
        recipe.shape("   ",
                "*&*",
                "***");
        recipe.setIngredient('*', Material.GLASS);
        recipe.setIngredient('&', Material.WHEAT);

        new Drink(this, "beer", recipe, item);

        item = new ItemStack(Material.POTION);

        meta = (PotionMeta) item.getItemMeta();
        meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 1), true);

        meta.setDisplayName(ChatColor.DARK_PURPLE + "Vine");
        item.setItemMeta(meta);
        recipe = new ShapedRecipe(item);
        recipe.shape("   ",
                "*&*",
                "***");
        recipe.setIngredient('*', Material.GLASS);
        recipe.setIngredient('&', Material.APPLE);
        new Drink(this, "vine", recipe, item);

        item = new ItemStack(Material.POTION);

        meta = (PotionMeta) item.getItemMeta();
        meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 200, 1), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1), true);

        meta.setDisplayName(ChatColor.WHITE + "Latte");
        item.setItemMeta(meta);
        recipe = new ShapedRecipe(item);
        recipe.shape("   ",
                "*&*",
                "***");
        recipe.setIngredient('*', Material.GLASS);
        recipe.setIngredient('&', Material.INK_SACK, 3);
        new Drink(this, "latte", recipe, item);

        item = new ItemStack(Material.POTION);

        meta = (PotionMeta) item.getItemMeta();
        meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 200, 1), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.JUMP, 200, 1), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 1), true);

        meta.setDisplayName(ChatColor.WHITE + "Apple energy drink");
        item.setItemMeta(meta);
        recipe = new ShapedRecipe(item);
        recipe.shape(" a ",
                     "*&*",
                     "***");
        recipe.setIngredient('*', Material.GLASS);
        recipe.setIngredient('&', Material.INK_SACK, 3);
        recipe.setIngredient('a', Material.APPLE);
        new Drink(this, "energy", recipe, item);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
