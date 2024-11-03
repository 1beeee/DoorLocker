package mc.beeee.doorslocker.utils;

import mc.beeee.doorslocker.Plugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class CreateItems {

    public static ItemStack key1() {
        Integer cmd = Plugin.getInstance().getConfig().getInt("items.key_4.custom_model_data");
        Material m = Material.valueOf(Plugin.getInstance().getConfig().getString("items.key_1.material"));
        String name = ColorUtil.formatHex(Plugin.getInstance().getConfig().getString("items.key_1.name"));
        List<String> lore = ColorUtil.formatHex(Plugin.getInstance().getConfig().getStringList("items.key_1.lore"));

        ItemStack key = new ItemStack(m, 1);
        ItemMeta key_meta = key.getItemMeta();

        key_meta.setLore(lore);
        key_meta.setDisplayName(name);

        key_meta.setCustomModelData(cmd);
        key.setItemMeta(key_meta);

        return key;

    }

    public static ItemStack key2() {
        Integer cmd = Plugin.getInstance().getConfig().getInt("items.key_4.custom_model_data");
        Material m = Material.valueOf(Plugin.getInstance().getConfig().getString("items.key_2.material"));
        String name = ColorUtil.formatHex(Plugin.getInstance().getConfig().getString("items.key_2.name"));
        List<String> lore = ColorUtil.formatHex(Plugin.getInstance().getConfig().getStringList("items.key_2.lore"));

        ItemStack key = new ItemStack(m, 1);
        ItemMeta key_meta = key.getItemMeta();

        key_meta.setLore(lore);
        key_meta.setDisplayName(name);

        key_meta.setCustomModelData(cmd);
        key.setItemMeta(key_meta);

        return key;

    }

    public static ItemStack key3() {
        Integer cmd = Plugin.getInstance().getConfig().getInt("items.key_4.custom_model_data");
        Material m = Material.valueOf(Plugin.getInstance().getConfig().getString("items.key_3.material"));
        String name = ColorUtil.formatHex(Plugin.getInstance().getConfig().getString("items.key_3.name"));
        List<String> lore = ColorUtil.formatHex(Plugin.getInstance().getConfig().getStringList("items.key_3.lore"));

        ItemStack key = new ItemStack(m, 1);
        ItemMeta key_meta = key.getItemMeta();

        key_meta.setLore(lore);
        key_meta.setDisplayName(name);

        key_meta.setCustomModelData(cmd);
        key.setItemMeta(key_meta);

        return key;

    }

    public static ItemStack key4() {
        Integer cmd = Plugin.getInstance().getConfig().getInt("items.key_4.custom_model_data");
        Material m = Material.valueOf(Plugin.getInstance().getConfig().getString("items.key_4.material"));
        String name = ColorUtil.formatHex(Plugin.getInstance().getConfig().getString("items.key_4.name"));
        List<String> lore = ColorUtil.formatHex(Plugin.getInstance().getConfig().getStringList("items.key_4.lore"));

        ItemStack key = new ItemStack(m, 1);
        ItemMeta key_meta = key.getItemMeta();

        key_meta.setLore(lore);
        key_meta.setDisplayName(name);

        key_meta.setCustomModelData(cmd);
        key.setItemMeta(key_meta);

        return key;

    }

    public static ItemStack key5() {
        Integer cmd = Plugin.getInstance().getConfig().getInt("items.key_4.custom_model_data");
        Material m = Material.valueOf(Plugin.getInstance().getConfig().getString("items.key_5.material"));
        String name = ColorUtil.formatHex(Plugin.getInstance().getConfig().getString("items.key_5.name"));
        List<String> lore = ColorUtil.formatHex(Plugin.getInstance().getConfig().getStringList("items.key_5.lore"));

        ItemStack key = new ItemStack(m, 1);
        ItemMeta key_meta = key.getItemMeta();

        key_meta.setLore(lore);
        key_meta.setDisplayName(name);

        key_meta.setCustomModelData(cmd);
        key.setItemMeta(key_meta);

        return key;

    }
}
