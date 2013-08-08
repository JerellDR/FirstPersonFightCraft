package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

/**
 * Created by Mrgadgetz
 * Date: 8/5/13
 * Time: 9:37 PM
 */
public class FirstPersonFightCraft extends JavaPlugin {
    protected ArrayList<String> enabledPlayers;
    protected ExplodingArrowsLogger log;

    @Override
    public void onEnable() {

        getLogger().info("onEnable has been invoked");
        this.enabledPlayers = new ArrayList<String>();

        // enable console commmands
        getCommand("lordcmos").setExecutor(new CmosCommandExecutor(this));
        getCommand("strikeforce").setExecutor(new StrikeCommandExecutor(this));
        getCommand("explodeyarrows").setExecutor(new ExplodeyArrowsCommandExecutor(this));

        PluginManager manager = this.getServer().getPluginManager();

        manager.registerEvents(new ExplodingArrowsListener(this), this);


    }

    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
        getLogger().info("onDisable has been invoked");
    }


}