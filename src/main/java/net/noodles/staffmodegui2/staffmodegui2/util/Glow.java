package net.noodles.staffmodegui2.staffmodegui2.util;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class Glow extends Enchantment
{
    public Glow(final int id) {
        super(id);
    }

    public boolean canEnchantItem(final ItemStack arg0) {
        return false;
    }

    public boolean conflictsWith(final Enchantment arg0) {
        return false;
    }

    public EnchantmentTarget getItemTarget() {
        return null;
    }

    public int getMaxLevel() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public int getStartLevel() {
        return 0;
    }
}
