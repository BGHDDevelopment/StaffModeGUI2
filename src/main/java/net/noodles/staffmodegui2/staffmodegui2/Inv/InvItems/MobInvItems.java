package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class MobInvItems {

    public static ItemStack mobCreeper() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemCreeper").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemCreeper").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobSkeleton() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemSkeleton").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemSkeleton").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobSpider() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemSpider").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemSpider").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobZombie() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemZombie").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemZombie").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobSlime() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemSlime").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemSlime").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobGhast() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemGhast").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemGhast").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobZombiePig() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemZombiePig").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemZombiePig").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobEnderman() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemEnderman").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemEnderman").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobCaveSpider() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemCaveSpider").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemCaveSpider").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobSilverFish() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemSilverFish").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemSilverFish").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobBlaze() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemBlaze").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemBlaze").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobMagmaCube() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemMagmaCube").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemMagmaCube").replace("&", "§")
                ))
                .toItemStack();

    }

    public static ItemStack mobBat() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemBat").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemBat").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobWitch() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemWitch").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemWitch").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobPig() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemPig").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemPig").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobSheep() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemSheep").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemSheep").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobCow() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemCow").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemCow").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobChicken() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemChicken").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemChicken").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobSquid() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemSquid").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemSquid").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobWolf() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemWolf").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemWolf").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobMushroom() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemMushroom").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemMushroom").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobOcelot() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemOcelot").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemOcelot").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobHorse() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemHorse").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemHorse").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack mobVillager() {
        return new ItemBuilder(Material.MOB_SPAWNER)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.titleItemVillager").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.loreItemVillager").replace("&", "§")
                ))
                .toItemStack();
    }
    public static ItemStack extraMobMenu() {
        return new ItemBuilder(Material.ENDER_CHEST)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

}