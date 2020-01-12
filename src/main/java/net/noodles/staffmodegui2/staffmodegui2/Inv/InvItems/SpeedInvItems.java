package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class SpeedInvItems {

    public static ItemStack menuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title4").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore4").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed1() {
        return new ItemBuilder ( Material.GLASS_BOTTLE)
                .setName( StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed1").replace("&", "§"))
                .setLore( Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed1").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed2() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed2").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed2").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed3() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed3").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed3").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed4() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed4").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed4").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed5() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed5").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed5").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed6() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed6").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed6").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed7() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed7").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed7").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speed8() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.titleItemSpeed8").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.loreItemSpeed8").replace("&", "§")
                ))
                .toItemStack();
    }

}
