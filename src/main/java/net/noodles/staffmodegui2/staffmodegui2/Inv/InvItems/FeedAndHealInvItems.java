package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class FeedAndHealInvItems {

    public static ItemStack Heal() {
        return new ItemBuilder ( Material.SPONGE)
                .setName( StaffModeGUI2.getPlugin().getConfig().getString("feedAndHealMenu.titleItemHeal").replace("&", "§"))
                .setLore( Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("feedAndHealMenu.loreItemHeal").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack Feed() {
        return new ItemBuilder(Material.BREAD)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("feedAndHealMenu.titleItemFeed").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("feedAndHealMenu.loreItemFeed").replace("&", "§")
                ))
                .toItemStack();
    }

}
