package com.jdub03.spectorgadgetz.FirstPersonFightCraft;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
/**
 * Created by Mrgadgetz
 * Date: 8/7/13
 * Time: 10:47 PM
 */
public class ExplodingArrowsListener implements Listener {
    private FirstPersonFightCraft plugin;

    public ExplodingArrowsListener(FirstPersonFightCraft craftPlugin){
        this.plugin = craftPlugin;

    }

    public void onProjectiveHit(ProjectileHitEvent event) {
        Entity entity = event.getEntity();

        if (entity instanceof Arrow){
            Arrow arrow = (Arrow) entity;
            Entity shooter = arrow.getShooter();

            if(shooter instanceof Player){
                // Entity shooter = arrow.getShooter()
                Player player = (Player) shooter;

                if (plugin.enabledPlayers.contains(player.getName())){
                    player.getWorld().createExplosion(arrow.getLocation(), 0F);
                }


            }

        }
    }
}
