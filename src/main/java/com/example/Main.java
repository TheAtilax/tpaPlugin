package com.example;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("MyPlugin has been enabled!");
        // Plugin startup logic here
    }

    @Override
    public void onDisable() {
        getLogger().info("MyPlugin has been disabled.");
        // Plugin shutdown logic here
    }
}
