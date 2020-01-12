package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class ExtraMobInvItems {

    public static ItemStack menuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title2").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore2").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobIron() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.titleItemIron").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.loreItemIron").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobSnow() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.titleItemSnow").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.loreItemSnow").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobGiant() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.titleItemGiant").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.loreItemGiant").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobWither() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.titleItemWither").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.loreItemWither").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobDragon() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.titleItemDragon").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.loreItemDragon").replace("&", "§")
                ))
                .toItemStack();
    }

}