package me.oliver276.ctfk;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    //mysql? --yes, but later version

    //kits (like kpvp)
    //arenas (like kpvp)

    //cyclic [config for rounds/points]
    //points system:
    //  kills
    //  flag kill
    //  flag capture

    //
    //
    //  +configurable team numbers (2/3)
    //  colors: global/per-arena  (global can be overridden local)
    //  **equal teams
    //  choose teams, but only start when X is reached (global, can be overridden local)
    //
    //  +advanced kit designer.
    //  +support for inv, armour and pot effects.
    //
    //  Y teams with 1 flag each at different spawns in the arena
    //  if player dies, config (instant respawns, flat time respawns, scaling respawns (+X seconds per Y game timer seconds))
    //  if player dies, config (infinite, limited)
    //
    //  config for game timer, score limit, both
    //  gapple drop? -> inherit from kitpvp.
    //
    //
    //
    //

    public void onEnable(){
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

}
