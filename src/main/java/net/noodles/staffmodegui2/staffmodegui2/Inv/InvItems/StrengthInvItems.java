package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class StrengthInvItems {

    public static ItemStack menuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title4").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore4").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength1() {
        return new ItemBuilder ( Material.GLASS_BOTTLE)
                .setName( StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength1").replace("&", "§"))
                .setLore( Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength1").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength2() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength2").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength2").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength3() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength3").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength3").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength4() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength4").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength4").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength5() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength5").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength5").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength6() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength6").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength6").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength7() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength7").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength7").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strength8() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.titleItemStrength8").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.loreItemStrength8").replace("&", "§")
                ))
                .toItemStack();
    }

}
