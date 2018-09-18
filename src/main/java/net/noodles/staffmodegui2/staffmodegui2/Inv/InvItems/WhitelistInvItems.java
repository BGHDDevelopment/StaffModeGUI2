package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class WhitelistInvItems {


    public static ItemStack whitelistON() {
        return new ItemBuilder(Material.EMERALD_BLOCK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.titleItemON").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.loreItemON").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack whitelistOFF() {
        return new ItemBuilder(Material.REDSTONE_BLOCK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.titleItemOFF").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.loreItemOFF").replace("&", "§")
                ))
                .toItemStack();
    }

}
