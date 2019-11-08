package net.noodles.staffmodegui2.Inv;

import net.noodles.staffmodegui2.Inv.InvItems.ServerManagerInvItems;
import net.noodles.staffmodegui2.Inv.InvItems.ToolsInvItems;
import net.noodles.staffmodegui2.Inv.InvItems.MainInvItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import net.noodles.staffmodegui2.StaffModeGUI2;
import org.bukkit.inventory.meta.ItemMeta;

public class ServerManagerInv implements Listener {
    @SuppressWarnings("unused")
    private StaffModeGUI2 main;

    public ServerManagerInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Server Manager Menu";
    }

    private int getSize() {
        return 9;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(1, ServerManagerInvItems.whitelistMenu());
        inv.setItem(3, ServerManagerInvItems.weatherMenu());
        inv.setItem( 5, ServerManagerInvItems.clearMobs());
        inv.setItem(8, MainInvItems.mainMenuReturn());

        for (int i = 0; i < 9; ++i) {
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

        if (event.getClickedInventory() == null) return;
        if (!event.getClickedInventory().getTitle().equals(getTitle())) return;

        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;
        event.setCancelled(true);
        if (event.getCurrentItem().isSimilar(ServerManagerInvItems.whitelistMenu())) {
            if(!player.hasPermission("staffmodegui.whitelistmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getWhitelistInv ().getInventory());
        } else if (event.getCurrentItem().isSimilar(ServerManagerInvItems.clearMobs ())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("toolsMenu.messageItemClearMobs").replace("&", "§"));
            player.getInventory().clear();
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());

        }
    }
}