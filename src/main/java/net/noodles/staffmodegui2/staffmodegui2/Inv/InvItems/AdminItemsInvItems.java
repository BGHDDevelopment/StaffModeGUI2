package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class AdminItemsInvItems {

    public static ItemStack adminStick() {
        return new ItemBuilder(Material.STICK)
                .addEnchant(Enchantment.KNOCKBACK, 15)
                .addEnchant(Enchantment.DURABILITY, 1000)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.titleItemAdminStick").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.loreItemAdminStick").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack adminBow() {
        return new ItemBuilder(Material.BOW)
                .addEnchant(Enchantment.ARROW_INFINITE, 1000)
                .addEnchant(Enchantment.DURABILITY, 1000)
                .addEnchant(Enchantment.ARROW_KNOCKBACK, 1000)
                .addEnchant(Enchantment.ARROW_FIRE, 1000)
                .addEnchant(Enchantment.ARROW_DAMAGE, 1000)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.titleItemAdminBow").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.loreItemAdminBow").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack adminArrow() {
        return new ItemBuilder(Material.ARROW)
                .addEnchant(Enchantment.DURABILITY, 1000)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.titleItemAdminArrow").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.loreItemAdminArrow").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack adminSword() {
        return new ItemBuilder(Material.DIAMOND_SWORD)
                .addEnchant(Enchantment.DAMAGE_ALL, 1000)
                .addEnchant(Enchantment.DURABILITY, 1000)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.titleItemAdminSword").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.loreItemAdminSword").replace("&", "§")
                ))
                .toItemStack();
    }

}
