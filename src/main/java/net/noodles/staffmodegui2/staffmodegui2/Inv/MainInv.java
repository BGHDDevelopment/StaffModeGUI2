package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
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

public class MainInv implements Listener {

    private StaffModeGUI2 main;

    public MainInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "StaffModeGUI";
    }

    private int getSize() {
        return 54;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(11, MainInvItems.timeMenu());
        inv.setItem(13, MainInvItems.gamemodeMenu());
        inv.setItem(15, MainInvItems.mobMenu());
        inv.setItem(29, MainInvItems.trollMenu());
        inv.setItem(31, MainInvItems.toolsMenu());
        inv.setItem(33, MainInvItems.serverManagerMenu());
        inv.setItem(47, MainInvItems.effectsMenu());
        //inv.setItem ( 49 , MainInvItems.Menu () );
        for (int i = 0; i < 54; ++i) {
            if (inv.getItem(i) == null) {
                inv.setItem(i, Glass());
            }
        }
        return inv;
    }

    private ItemStack Glass() {
        ItemStack stone = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
        ItemMeta stonem = stone.getItemMeta();
        stonem.setDisplayName("");
        stone.setItemMeta(stonem);
        return stone;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView() == null) return;
        if (!event.getView().getTitle().equals(getTitle())) return;
        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;
        event.setCancelled(true);
        // CLICK EVENTS
        if (event.getCurrentItem().isSimilar(MainInvItems.timeMenu())) {
            if (!player.hasPermission("staffmodegui.timemenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getTimeInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.gamemodeMenu())) {
            if (!player.hasPermission("staffmodegui.gamemodemenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getGamemodeInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mobMenu())) {
            if (!player.hasPermission("staffmodegui.mobmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMobInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.trollMenu())) {
            if (!player.hasPermission("staffmodegui.trollmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getTrollInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.toolsMenu())) {
            if (!player.hasPermission("staffmodegui.toolsmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getToolsInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.serverManagerMenu())) {
            if (!player.hasPermission("staffmodegui.servermanagermenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("serverManagerMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getServerManagerInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(MainInvItems.effectsMenu())) {
            if (!player.hasPermission("staffmodegui.effectsmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getEffectsInv().getInventory());
        }
    }
}