package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class ServerManagerInvItems {

    public static ItemStack whitelistMenu() {
        return new ItemBuilder(Material.IRON_TRAPDOOR)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack weatherMenu() {
        return new ItemBuilder(Material.FEATHER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack clearMobs() {
        return new ItemBuilder(Material.DIAMOND_AXE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("serverManagerMenu.titleItemClearMobs").replace("&", "§"))
                .setLore(StaffModeGUI2.getPlugin().getConfig().getString("serverManagerMenu.loreItemClearMobs").replace("&", "§"))
                .toItemStack();
    }

    public static ItemStack difficultyMenu() {
        return new ItemBuilder(Material.BEACON)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

}
