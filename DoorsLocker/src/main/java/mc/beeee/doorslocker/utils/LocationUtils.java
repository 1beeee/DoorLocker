package mc.beeee.doorslocker.utils;

import org.bukkit.Location;
import org.bukkit.World;

public class LocationUtils {


    public static String locationToString(Location location) {
        if (location == null) {
            return null;
        }
        return location.getWorld().getName() + "," + location.getX() + "," + location.getY() + "," + location.getZ() + "," + location.getYaw() + "," + location.getPitch();
    }


    public static Location stringToLocation(String str, World world) {
        if (str == null || world == null) {
            return null;
        }
        String[] parts = str.split(",");
        double x = Double.parseDouble(parts[1]);
        double y = Double.parseDouble(parts[2]);
        double z = Double.parseDouble(parts[3]);
        float yaw = Float.parseFloat(parts[4]);
        float pitch = Float.parseFloat(parts[5]);
        return new Location(world, x, y, z, yaw, pitch);
    }
}
