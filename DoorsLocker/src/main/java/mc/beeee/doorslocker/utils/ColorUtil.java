package mc.beeee.doorslocker.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

public class ColorUtil {
    private static final Pattern HEX_PATTERN = Pattern.compile("&#([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])");

    public static String formatHex(String text) {
        return ChatColor.translateAlternateColorCodes('&', HEX_PATTERN.matcher(text).replaceAll("&x&$1&$2&$3&$4&$5&$6"));
    }

    public static List<String> formatHex(List<String> messages) {
        List<String> result = new ArrayList();
        if (messages != null) {
            Iterator var2 = messages.iterator();

            while(var2.hasNext()) {
                String message = (String)var2.next();
                result.add(formatHex(message));
            }
        }

        return result;
    }
}
