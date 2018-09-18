package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class WeatherInvItems {


    public static ItemStack weatherClear() {
        return new ItemBuilder(Material.SAND)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.titleClear").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.loreClear").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack weatherStorm() {
        return new ItemBuilder(Material.PACKED_ICE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.titleStorm").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.loreStorm").replace("&", "§")
                ))
                .toItemStack();
    }

}
