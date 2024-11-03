package mc.beeee.doorslocker.events;

import mc.beeee.doorslocker.utils.ColorUtil;
import mc.beeee.doorslocker.utils.CreateItems;
import mc.beeee.doorslocker.utils.DoorsManager;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class DoorsEvent implements Listener {

    @EventHandler
    public static void onInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        Location clicked_block = e.getClickedBlock().getLocation();

        if (e.getAction().isRightClick()) {
            if (DoorsManager.getDoor(clicked_block, DoorsManager.getDoors_lvl1()) != null) {
                if (!player.getInventory().getItemInMainHand().equals(CreateItems.key1())) {
                    e.setCancelled(true);
                    player.sendMessage(ColorUtil.formatHex("&cУ вас нет ключа!"));
                }else {
                    e.setCancelled(false);
                }
            }
            if (DoorsManager.getDoor(clicked_block, DoorsManager.getDoors_lvl2()) != null) {
                if (!player.getInventory().getItemInMainHand().equals(CreateItems.key2())) {
                    player.sendMessage(ColorUtil.formatHex("&cУ вас нет ключа!"));
                    e.setCancelled(true);
                }else {
                    e.setCancelled(false);
                }
            }
            if (DoorsManager.getDoor(clicked_block, DoorsManager.getDoors_lvl3()) != null) {
                if (!player.getInventory().getItemInMainHand().equals(CreateItems.key3())) {
                    player.sendMessage(ColorUtil.formatHex("&cУ вас нет ключа!"));
                    e.setCancelled(true);
                }else {
                    e.setCancelled(false);
                }
            }
            if (DoorsManager.getDoor(clicked_block, DoorsManager.getDoors_lvl4()) != null) {
                if (!player.getInventory().getItemInMainHand().equals(CreateItems.key4())) {
                    player.sendMessage(ColorUtil.formatHex("&cУ вас нет ключа!"));
                    e.setCancelled(true);
                }else {
                    e.setCancelled(false);
                }
            }
        }
    }
}
