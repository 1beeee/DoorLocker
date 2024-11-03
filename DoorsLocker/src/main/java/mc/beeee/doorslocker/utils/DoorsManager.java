package mc.beeee.doorslocker.utils;

import org.bukkit.Location;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class DoorsManager {

    private static List<Location> doors_lvl1 = new ArrayList<>();
    private static List<Location> doors_lvl2 = new ArrayList<>();
    private static List<Location> doors_lvl3 = new ArrayList<>();
    private static List<Location> doors_lvl4 = new ArrayList<>();

    public static List<Location> getDoors_lvl1() {
        return doors_lvl1;
    }

    public static List<Location> getDoors_lvl2() {
        return doors_lvl2;
    }

    public static List<Location> getDoors_lvl3() {
        return doors_lvl3;
    }

    public static List<Location> getDoors_lvl4() {
        return doors_lvl4;
    }

    @Nullable
    public static Location getDoor(Location blockLocation, List<Location> list) {
        for (Location location : list) {
            if (location == blockLocation) {
                return location;
            }
        }
        return null;
    }
}
