package com.gmail.pointochanneru.crashplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrashPlugin extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("CrashPlugin Loaded!");
        getCommand("crash").setExecutor(new CommandCrash());
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("CrashPlugin Unloaded!");
    }
}

    @EventHandler

