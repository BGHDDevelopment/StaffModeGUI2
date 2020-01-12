package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class JumpboostInvItems {

    public static ItemStack menuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title4").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore4").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump1() {
        return new ItemBuilder ( Material.GLASS_BOTTLE)
                .setName( StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump1").replace("&", "§"))
                .setLore( Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump1").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump2() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump2").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump2").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump3() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump3").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump3").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump4() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump4").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump4").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump5() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump5").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump5").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump6() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump6").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump6").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump7() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump7").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump7").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jump8() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.titleItemJump8").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.loreItemJump8").replace("&", "§")
                ))
                .toItemStack();
    }

}
