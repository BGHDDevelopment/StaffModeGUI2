package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;


public class MainInv implements Listener {

    private StaffModeGUI2 main;

    public MainInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "StaffModeGUI";
    }

    private int getSize() {
        return 54;
    }
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(11, MainInvItems.whitelistMenu());
        inv.setItem(13, MainInvItems.timeMenu());
        inv.setItem(15, MainInvItems.weatherMenu());
        inv.setItem(29, MainInvItems.gamemodeMenu());
        inv.setItem(31, MainInvItems.flyMenu());
        inv.setItem(33, MainInvItems.vanishMenu());
        inv.setItem(47, MainInvItems.mobMenu());
        inv.setItem(49, MainInvItems.trollMenu());
        //inv.setItem(51, MainInvItems.weatherMenu());


        for (int i = 0; i < 54; ++i) {
            if (inv.getItem(i) == null) {
                inv.setItem(i, Glass());
            }
        }

        return inv;
    }


        private ItemStack Glass() {
        ItemStack stone = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)8);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName("");
        stone.setItemMeta(stonem);
        return stone;
    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() == null) return;
        if (!event.getClickedInventory().getTitle().equals(getTitle())) return;
        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;
        event.setCancelled(true);
        // CLICK EVENTS
        if (event.getCurrentItem().isSimilar(MainInvItems.whitelistMenu())) {
            if(!player.hasPermission("staffmodegui.whitelistmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("whitelistMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getWhitelistInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.timeMenu())) {
            if(!player.hasPermission("staffmodegui.timemenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getTimeInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.gamemodeMenu())) {
            if(!player.hasPermission("staffmodegui.gamemodemenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getGamemodeInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.weatherMenu())) {
            if(!player.hasPermission("staffmodegui.weathermenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getWeatherInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.flyMenu())) {
            if(!player.hasPermission("staffmodegui.flymenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("flyMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getFlyInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.vanishMenu())) {
            if(!player.hasPermission("staffmodegui.vanishmenu")) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
        }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getVanishInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mobMenu())) {
            if(!player.hasPermission("staffmodegui.mobmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMobInv().getInventory());
        }
        } else if (event.getCurrentItem().isSimilar(MainInvItems.trollMenu())) {
            if (!player.hasPermission("staffmodegui.trollmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getTrollInv().getInventory());

        }

    }
}
