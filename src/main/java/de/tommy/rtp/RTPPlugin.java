package de.tommy.rtp;

import org.bukkit.plugin.java.JavaPlugin;

public class RTPPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("rtp").setExecutor(new RTPCommand());
        getLogger().info("RTP Plugin aktiviert!");
    }

    @Override
    public void onDisable() {
        getLogger().info("RTP Plugin deaktiviert!");
    }
}
