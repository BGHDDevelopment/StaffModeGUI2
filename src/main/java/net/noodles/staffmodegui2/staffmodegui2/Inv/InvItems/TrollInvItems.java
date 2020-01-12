package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class TrollInvItems {

    public static ItemStack LightningTroll() {
        return new ItemBuilder(Material.FLINT_AND_STEEL)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.titleItemLightningTroll").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.loreItemLightningTroll").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack SlownessTroll() {
        return new ItemBuilder(Material.SOUL_SAND)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.titleItemSlownessTroll").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.loreItemSlownessTroll").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack WeaknessTroll() {
        return new ItemBuilder(Material.OBSIDIAN)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.titleItemWeaknessTroll").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.loreItemWeaknessTroll").replace("&", "§")
                ))
                .toItemStack();

    }

    public static ItemStack BlindnessTroll() {
        return new ItemBuilder(Material.INK_SACK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.titleItemBlindnessTroll").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.loreItemBlindnessTroll").replace("&", "§")
                ))
                .toItemStack();

    }

    public static ItemStack NauseaTroll() {
        return new ItemBuilder(Material.MAGMA_CREAM)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.titleItemNauseaTroll").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.loreItemNauseaTroll").replace("&", "§")
                ))
                .toItemStack();

    }
    public static ItemStack CowTroll() {
        return new ItemBuilder(Material.OBSIDIAN)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.titleItemCowTroll").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.loreItemCowTroll").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack JumpTroll() {
        return new ItemBuilder(Material.SADDLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.titleItemJumpTroll").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.loreItemJumpTroll").replace("&", "§")
                ))
                .toItemStack();

    }

}