package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Logger;

/**
 * Created by Mrgadgetz
 * Date: 8/5/13
 * Time: 10:02 PM
 */
public class CmosCommandExecutor implements CommandExecutor {

    private FirstPersonFightCraft plugin;
    private final static Logger LOGGER = Logger.getLogger(CmosCommandExecutor.class.getName());

    public CmosCommandExecutor(FirstPersonFightCraft craftPlugin) {
        this.plugin = craftPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            LOGGER.info("sender instance of player");
            if (cmd.getName().equalsIgnoreCase("lordcmos")) {
                LOGGER.info("ignorecase true");
                if (player.hasPermission("FirstPersonFightCraft.lordcmos")) {
                    LOGGER.info(player.getDisplayName() + " has " + cmd.getPermission());
                    if (args.length >= 2) {
                        LOGGER.info("args >= 2");

                        player.getInventory().addItem(new ItemStack(Material.getMaterial(Integer.parseInt(args[0])), Integer.parseInt(args[1])));
                        player.sendMessage("Gave you" + args[1] + " of " + Material.getMaterial(Integer.parseInt(args[0])).name() + ".");
                        return true;
                    } else {
                        player.sendMessage("Not enough arguments with the command.");
                        return true;
                    }
                }
            }
        }

        sender.sendMessage("Must be a player to do that");
        return false;
    }
}

