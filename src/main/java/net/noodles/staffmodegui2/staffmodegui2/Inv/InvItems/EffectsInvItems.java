package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class EffectsInvItems {

    public static ItemStack potionWater() {
        return new ItemBuilder ( Material.GLASS_BOTTLE)
                .setName( StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.titleItemWaterBreathing").replace("&", "§"))
                .setLore( Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.loreItemWaterBreathing").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack invis() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.titleItemInvis").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.loreItemInvis").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack jumpboostMenu() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("jumpMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack speedMenu() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack strengthMenu() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("strengthMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack slowness() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.titleItemSlowness").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.loreItemSlowness").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack removeEffects() {
        return new ItemBuilder(Material.MILK_BUCKET)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.titleItemRemoveEffects").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.loreItemRemoveEffects").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack potionNight() {
        return new ItemBuilder(Material.GLASS_BOTTLE)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.titleItemNightVision").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.loreItemNightVision").replace("&", "§")
                ))
                .toItemStack();
    }

}
