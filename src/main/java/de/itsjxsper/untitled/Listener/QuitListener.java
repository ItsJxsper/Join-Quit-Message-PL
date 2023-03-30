package de.itsjxsper.untitled.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(final PlayerQuitEvent event) {
        final Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.DARK_BLUE + player.getName() + " Wurde von Gott entfernt");
    }
}
