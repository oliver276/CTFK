package me.oliver276.ctfk;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class GameManager {
    private static GameManager ourInstance; //= new GameManager();

    Plugin plugin;

    public static GameManager getInstance() {
        return ourInstance;
    }
    public static GameManager makeInstance(Plugin plugin){
        ourInstance = new GameManager(plugin);
        return ourInstance;
    }

    private GameManager(Plugin plugin) {
        this.plugin = plugin;
    }

    public Arena loadArenaFromFile(FileConfiguration fc){
        //todo load the arena from the serialised file
        return null;
    }
}
