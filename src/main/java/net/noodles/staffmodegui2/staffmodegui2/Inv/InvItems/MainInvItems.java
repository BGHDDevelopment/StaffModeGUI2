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

    public static ItemStack timeMenu() {
        return new ItemBuilder(Material.COMPASS)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack gamemodeMenu() {
        return new ItemBuilder(Material.BLAZE_ROD)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.lore").replace("&", "§")
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

    public static ItemStack toolsMenu() {
        return new ItemBuilder(Material.COMMAND)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack serverManagerMenu() {
        return new ItemBuilder(Material.REDSTONE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("serverManagerMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("serverManagerMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack effectsMenu() {
        return new ItemBuilder(Material.BREWING_STAND_ITEM)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack adminItemsMenu() {
        return new ItemBuilder(Material.DIAMOND_SWORD)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack support() {
        return new ItemBuilder(Material.BOOK)
                .setName("&8Support".replace("&", "§"))
                .setLore(Arrays.asList(
                        "&7Click for Support link".replace("&", "§")
                ))
                .toItemStack();
    }

}