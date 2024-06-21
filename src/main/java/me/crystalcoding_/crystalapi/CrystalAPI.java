package me.crystalcoding_.crystalapi;

import me.crystalcoding_.crystalapi.Menu.GUIListener;
import me.crystalcoding_.crystalapi.Menu.GUIManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrystalAPI {
    GUIManager guiManager;

    public CrystalAPI(JavaPlugin plugin) {
        guiManager = new GUIManager();

        GUIListener listener = new GUIListener(guiManager);
        Bukkit.getPluginManager().registerEvents(listener, plugin);
    }

    public GUIManager getGuiManager() {
        return guiManager;
    }
}
