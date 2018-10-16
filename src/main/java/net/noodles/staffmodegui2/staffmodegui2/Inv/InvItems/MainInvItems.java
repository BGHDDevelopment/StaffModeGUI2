package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class MainInvItems {



    public static ItemStack mainMenuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack whitelistMenu() {
        return new ItemBuilder(Material.COMMAND)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack timeMenu() {
        return new ItemBuilder(Material.DAYLIGHT_DETECTOR)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack weatherMenu() {
        return new ItemBuilder(Material.WATER_BUCKET)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack gamemodeMenu() {
        return new ItemBuilder(Material.COBBLESTONE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.lore").replace("&", "§")
                ))
                .toItemStack();

    }

    public static ItemStack flyMenu() {
        return new ItemBuilder(Material.BLAZE_ROD)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }
    public static ItemStack vanishMenu() {
        return new ItemBuilder(Material.BEDROCK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.lore").replace("&", "§")
                ))
                .toItemStack();

    }
    public static ItemStack mobMenu() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }
    public static ItemStack trollMenu() {
        return new ItemBuilder(Material.CACTUS)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

}
