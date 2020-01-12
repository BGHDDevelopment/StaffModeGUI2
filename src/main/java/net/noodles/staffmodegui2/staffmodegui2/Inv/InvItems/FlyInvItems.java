package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class FlyInvItems {

    public static ItemStack menuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title3").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore3").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack FlyON() {
        return new ItemBuilder(Material.EMERALD_BLOCK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.titleItemON").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.loreItemON").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack FlyOFF() {
        return new ItemBuilder(Material.REDSTONE_BLOCK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.titleItemOFF").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.loreItemOFF").replace("&", "§")
                ))
                .toItemStack();
    }

}