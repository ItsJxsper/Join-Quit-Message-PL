package de.itsjxsper.untitled;

import de.itsjxsper.untitled.Listener.JoinListener;
import de.itsjxsper.untitled.Listener.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class OnlineCafe extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Hallo");

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents( new JoinListener(), this);
        manager.registerEvents(new QuitListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
