package mc.beeee.doorslocker;

import mc.beeee.doorslocker.utils.DoorsManager;
import mc.beeee.doorslocker.utils.LocationUtils;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Plugin extends JavaPlugin {

    private static Plugin instance;
    private File doorsFile;
    private FileConfiguration doorsConfig;

    @Override
    public void onEnable() {
        getLogger().info("DoorsLocker enabled");

        saveDefaultConfig();
        instance = this;

        doorsFile = new File(getDataFolder(), "doors.yml");
        if (!doorsFile.exists()) {
            saveResource("doors.yml", false);
        }
        loadData();

    }

    @Override
    public void onDisable() {
        getLogger().info("DoorsLocker disabled");
        saveData();
    }

    public static Plugin getInstance() {
        return instance;
    }

    private void loadData() {
        doorsConfig = YamlConfiguration.loadConfiguration(doorsFile);

        if (doorsConfig.contains("level1")) {
            DoorsManager.getDoors_lvl1().clear();
            for (String locStr : doorsConfig.getStringList("level1")) {
                Location loc = LocationUtils.stringToLocation(locStr, getServer().getWorlds().get(0)); // Замените на нужный мир
                if (loc != null) {
                    DoorsManager.getDoors_lvl1().add(loc);
                }
            }
        }

        if (doorsConfig.contains("level2")) {
            DoorsManager.getDoors_lvl2().clear();
            for (String locStr : doorsConfig.getStringList("level2")) {
                Location loc = LocationUtils.stringToLocation(locStr, getServer().getWorlds().get(0)); // Замените на нужный мир
                if (loc != null) {
                    DoorsManager.getDoors_lvl2().add(loc);
                }
            }
        }

        if (doorsConfig.contains("level3")) {
            DoorsManager.getDoors_lvl3().clear();
            for (String locStr : doorsConfig.getStringList("level3")) {
                Location loc = LocationUtils.stringToLocation(locStr, getServer().getWorlds().get(0)); // Замените на нужный мир
                if (loc != null) {
                    DoorsManager.getDoors_lvl3().add(loc);
                }
            }
        }

        if (doorsConfig.contains("level4")) {
            DoorsManager.getDoors_lvl4().clear();
            for (String locStr : doorsConfig.getStringList("level4")) {
                Location loc = LocationUtils.stringToLocation(locStr, getServer().getWorlds().get(0)); // Замените на нужный мир
                if (loc != null) {
                    DoorsManager.getDoors_lvl4().add(loc);
                }
            }
        }
    }

    private void saveData() {

        List<String> level1Str = new ArrayList<>();
        for (Location loc : DoorsManager.getDoors_lvl1()) {
            level1Str.add(LocationUtils.locationToString(loc));
        }
        doorsConfig.set("level1", level1Str);

        List<String> level2Str = new ArrayList<>();
        for (Location loc : DoorsManager.getDoors_lvl2()) {
            level2Str.add(LocationUtils.locationToString(loc));
        }
        doorsConfig.set("level2", level2Str);

        List<String> level3Str = new ArrayList<>();
        for (Location loc : DoorsManager.getDoors_lvl3()) {
            level3Str.add(LocationUtils.locationToString(loc));
        }
        doorsConfig.set("level3", level3Str);

        List<String> level4Str = new ArrayList<>();
        for (Location loc : DoorsManager.getDoors_lvl4()) {
            level4Str.add(LocationUtils.locationToString(loc));
        }
        doorsConfig.set("level4", level4Str);

        try {
            doorsConfig.save(doorsFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
