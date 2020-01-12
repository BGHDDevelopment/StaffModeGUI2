package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class DifficultyInvItems {

    public static ItemStack menuReturn() {
        return new ItemBuilder(Material.BOOK)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.title1").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.lore1").replace("&", "§")
                ))
                .toItemStack();
    }


    public static ItemStack DifficultyPeace() {
        return new ItemBuilder(Material.BEACON)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.titleItemDifficultyPeace").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.loreItemDifficultyPeace").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack DifficultyEasy() {
        return new ItemBuilder(Material.BEACON)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.titleItemDifficultyEasy").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.loreItemDifficultyEasy").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack DifficultyNormal() {
        return new ItemBuilder(Material.BEACON)
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.titleItemDifficultyNormal").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.loreItemDifficultyNormal").replace("&", "§")
                ))
                .toItemStack();
    }

    public static ItemStack DifficultyHard() {
        return new ItemBuilder ( Material.BEACON)
                .setName( StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.titleItemDifficultyHard").replace("&", "§"))
                .setLore( Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.loreItemDifficultyHard").replace("&", "§")
                ))
                .toItemStack();
    }

}
