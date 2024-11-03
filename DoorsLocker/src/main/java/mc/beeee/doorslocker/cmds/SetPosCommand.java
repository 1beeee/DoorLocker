package mc.beeee.doorslocker.cmds;

import mc.beeee.doorslocker.utils.DoorsManager;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetPosCommand implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Эту команду может выполнить только игрок");
            return true;
        }

        Player player = (Player) commandSender;

        if (!player.hasPermission("doorslocker.setpos")) {
            player.sendMessage("У вас нет доступа к этой команде!");
            return true;
        }

        String level = strings[0];

        if (strings.length != 1) {
            player.sendMessage("Введите недостающие аргументы!");
            return true;
        }

        Location blockLocation = player.getTargetBlock(null, 10).getLocation();

        switch (level) {
            case "level1":

                DoorsManager.getDoors_lvl1().add(blockLocation);

                break;
            case "level2":

                DoorsManager.getDoors_lvl2().add(blockLocation);

                break;
            case "level3":

                DoorsManager.getDoors_lvl3().add(blockLocation);

                break;
            case "level4":

                DoorsManager.getDoors_lvl4().add(blockLocation);

                break;

            default:

                return true;
        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 1) {
            return Arrays.asList("level1", "level2", "level3", "level4");
        }

        return new ArrayList<>();
    }
}
