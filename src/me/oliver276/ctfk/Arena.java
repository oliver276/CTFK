package me.oliver276.ctfk;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;

public class Arena {

    //"borrow" a bit from KPvP

    private ArrayList<Location> spawns = new ArrayList<>();
    private String name = null;
    private String worldName = null;
    //private ArrayList<Fighter> players = new ArrayList<>();
    //private ArrayList<String> kitWhiteList = new ArrayList<>();

    public Arena(Location spawn,String name, String worldName){
        spawns.add(spawn);
        this.name = name;
        this.worldName = worldName;
    }

    public Arena(ArrayList<Location> spawns, String name, String worldName, ArrayList<String> kitWhiteList) {
        this.spawns = spawns;
        this.name = name;
        this.worldName = worldName;
    }

    public void addSpawnPoint(Location location){
        if (location.getWorld().getName().equalsIgnoreCase(worldName)){
            spawns.add(location);
        } else {
            throw new NullPointerException();
        }
    }

    public boolean containsSpawn(Location loc){
        return spawns.contains(loc);
    }

    public ArrayList<Location> getSpawns() {
        return spawns;
    }

    public void removeSpawn(Location spawn){
        if (!(spawns.contains(spawn))){
            throw new NullPointerException();
        }
        spawns.remove(spawn);
    }

    public String getName(){
        return name;
    }

    public void save(FileConfiguration file){
        //todo all the serialisation here etc.
    }

}
