package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: Mrgadgetz
 * Date: 8/5/13
 * Time: 9:37 PM
 */
public class FirstPersonFightCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // TODO Insert logic to be performed when the plugin is enabled
        getLogger().info("onEnable has been invoked");
        getCommand("basic").setExecutor(new FirstPersonFightCraftCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
        getLogger().info("onDisable has been invoked");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("lordCmos")) { // if the player typed /basic then do the following...
            // doSomething
            return true;
        }  //if this has happened the function will return true.
        return false;
    }
}
