package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

/**
 * Created by Mrgadgetz
 * Date: 8/7/13
 * Time: 3:22 PM
 */
public class StrikeCommandExecutor implements CommandExecutor {
    private FirstPersonFightCraft plugin;
    private final static Logger LOGGER = Logger.getLogger(StrikeCommandExecutor.class.getName());

    public StrikeCommandExecutor(FirstPersonFightCraft craftPlugin) {
        this.plugin = craftPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {

            Player player = (Player) sender;
            World world = player.getWorld();

            if (label.equalsIgnoreCase("strikeforce")) {
                if (args.length == 0) {

                    Block targetBlock = player.getTargetBlock(null, 50);
                    Location location = targetBlock.getLocation();
                    world.strikeLightning(location);
                    world.createExplosion(location, 2);

                } else if (args.length == 1) {
                    if (player.getServer().getPlayer(args[0]) != null) {

                        Player targetPlayer = player.getServer().getPlayer(args[0]);
                        Location location = targetPlayer.getLocation();
                        world.strikeLightning(location);

                        player.sendMessage(ChatColor.GRAY + "strikeforce initiated on " + targetPlayer.getDisplayName() + "!");

                    } else {

                        player.sendMessage(ChatColor.RED + "Error: The player is offline.");
                    }

                } else if (args.length > 1) {

                    player.sendMessage(ChatColor.RED + "Error Too many arguments!");
                }
            }
        }

        sender.sendMessage("Must be a player to behold the glory of StrikeForce!!");
        return false;

    }
}
