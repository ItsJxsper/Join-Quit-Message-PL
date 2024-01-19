package de.itsjxsper.untitled.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onQuitP(PlayerQuitEvent event){
        final Player player = event.getPlayer();

        if (event.getPlayer().getName().equalsIgnoreCase("StellFire")){
            event.setJoinMessage("Gott hat sein Fehler gut gemacht (StellFire)"); //Mo
        }

    @EventHandler (priority = EventPriority.LOWEST)
    public void OnQuit(PlayerQuitEvent event){
       final Player player = event.getPlayer();
       event.setJoinMessage(ChatColor.DARK_BLUE.toString() + "Wurde von Gott entfernt " + player.getName());
}
