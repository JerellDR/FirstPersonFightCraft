package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: Mrgadgetz
 * Date: 8/5/13
 * Time: 9:37 PM
 */
public class FirstPersonFightCraft extends JavaPlugin {
    public Plugin plugin;

    @Override
    public void onEnable() {
        // TODO Insert logic to be performed when the plugin is enabled
        getLogger().info("onEnable has been invoked");
        getCommand("lordcmos").setExecutor(new CmosCommandExecutor(this));

        getCommand("strikeforce").setExecutor(new StrikeCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
        getLogger().info("onDisable has been invoked");
    }


}