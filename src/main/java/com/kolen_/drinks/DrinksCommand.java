package com.kolen_.drinks;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DrinksCommand implements CommandExecutor {

    public final Drinks plugin;

    public DrinksCommand(Drinks plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            if(args.length >= 1){
                if(args[0].equals("list")){
                    sender.sendMessage(ChatColor.DARK_GREEN + "ids: beer, vine, latte, energy");
                }else if(args[0].equals("give")){
                    if(args.length == 2){
                        ((Player) sender).getInventory().addItem(Drink.drinks.get(args[1]).drink);
                    }
                }
            }
        }
        return true;
    }
}
