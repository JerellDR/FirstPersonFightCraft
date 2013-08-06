package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created with IntelliJ IDEA.
 * User: Mrgadgetz
 * Date: 8/5/13
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstPersonFightCraftCommandExecutor implements CommandExecutor {
    public FirstPersonFightCraftCommandExecutor(FirstPersonFightCraft firstPersonFightCraft) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            // do something
        } else {
            sender.sendMessage("You must be a player!");
            return false;
        }
        // do something
        return false;
    }
}
