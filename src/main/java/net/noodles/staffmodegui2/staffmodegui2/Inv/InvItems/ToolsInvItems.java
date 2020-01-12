package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class ToolsInvItems {

    public static ItemStack menuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title1").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore1").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack vanishMenu() {
        return new ItemBuilder (Material.IRON_TRAPDOOR)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack flyMenu() {
        return new ItemBuilder(Material.FEATHER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack invClear() {
        return new ItemBuilder(Material.DEAD_BUSH)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.titleItemInvClear").replace("&", "§"))
                .setLore(StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.loreItemInvClear").replace ("&", "§"))
        .toItemStack();
    }
    public static ItemStack chatClear() {
        return new ItemBuilder(Material.PAPER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.titleItemClearChat").replace("&", "§"))
                .setLore(StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.loreItemClearChat").replace ("&", "§"))
                .toItemStack();
    }
    public static ItemStack feedAndHealMenu() {
        return new ItemBuilder(Material.BREAD)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("feedAndHealMenu.title").replace("&", "§"))
                .setLore(StaffModeGUI2.getPlugin().getConfig().getString("feedAndHealMenu.lore").replace ("&", "§"))
                .toItemStack();
    }

}
