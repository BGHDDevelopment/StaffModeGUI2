package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class GamemodeInvItems {


    public static ItemStack creative() {
        return new ItemBuilder(Material.STONE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.titleCreative").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.loreItemCreative").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack survival() {
        return new ItemBuilder(Material.DIRT)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.titleSurvival").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.loreItemSurvival").replace("&", "§")
                ))
                .toItemStack();
    }
    public static ItemStack spectator() {
        return new ItemBuilder(Material.GRASS)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.titleSpectator").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.loreItemSpectator").replace("&", "§")
                ))
                .toItemStack();
    }
    public static ItemStack adventure() {
        return new ItemBuilder(Material.COBBLESTONE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.titleAdventure").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.loreItemAdventure").replace("&", "§")
                ))
                .toItemStack();
    }

}