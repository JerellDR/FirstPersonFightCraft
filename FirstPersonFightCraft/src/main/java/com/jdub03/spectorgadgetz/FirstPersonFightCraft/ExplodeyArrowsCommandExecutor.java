package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Mrgadgetz
 * Date: 8/7/13
 * Time: 10:18 PM
 */
public class ExplodeyArrowsCommandExecutor implements CommandExecutor {
    private FirstPersonFightCraft plugin;

    public ExplodeyArrowsCommandExecutor(FirstPersonFightCraft fightPlugin) {
        this.plugin = fightPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
         if  (sender instanceof Player == false) {
             sender.sendMessage(ChatColor.RED + "Sorry this command can only be used in game.");
             return true;
         }
        Player player = (Player) sender;
        String playerName = player.getName();
        if (plugin.enabledPlayers.contains(playerName)){
            plugin.enabledPlayers.remove(playerName);
           player.sendMessage(ChatColor.GREEN + "Exploding arrows disabled.");
        } else {
            plugin.enabledPlayers.add(playerName);
            player.sendMessage(ChatColor.GREEN + "Exploding arrows enabled.");
        }
        return false;
    }
}
