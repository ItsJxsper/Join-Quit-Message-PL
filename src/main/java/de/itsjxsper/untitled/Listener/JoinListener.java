package de.itsjxsper.untitled.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onJoinP(PlayerJoinEvent event){
        final Player player = event.getPlayer();

        if (event.getPlayer().getName().equalsIgnoreCase("StellFire")){
            event.setJoinMessage("Gott hat ein fehler gemacht (StellFire)"); //Mo
        }

        if (event.getPlayer().getName().equalsIgnoreCase("ItsJxsper")){
            event.setJoinMessage("Mein Löwe Mein Bear Mein Programmierer"); //ItsJxsper
        }

        if (event.getPlayer().getName().equalsIgnoreCase("EnderRice123")){
            event.setJoinMessage(ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.DARK_RED + "Rice betritt den Reiskocher");//EnderRice123
        }

        if (event.getPlayer().getName().equalsIgnoreCase("Shrimp_Lover")){
            event.setJoinMessage("Shrimp_Lover");
        }

        if (event.getPlayer().getName().equalsIgnoreCase("")){
            event.setJoinMessage("");
        }

        if (event.getPlayer().getName().equalsIgnoreCase("")){
            event.setJoinMessage("");

        }

    }
   @EventHandler (priority = EventPriority.LOWEST)
    public void OnJoinO(PlayerJoinEvent event){
       final Player player = event.getPlayer();
       event.setJoinMessage(ChatColor.DARK_BLUE.toString() + "Gott erschuf " + player.getName());
    }

}
