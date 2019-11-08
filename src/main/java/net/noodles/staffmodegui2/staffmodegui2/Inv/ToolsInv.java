package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.ToolsInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
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

public class ToolsInv implements Listener {
    @SuppressWarnings("unused")
    private StaffModeGUI2 main;

    public ToolsInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Tools Menu";
    }

    private int getSize() {
        return 9;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, ToolsInvItems.vanishMenu());
        inv.setItem(1, ToolsInvItems.flyMenu());
        inv.setItem(2, ToolsInvItems.invClear());
        inv.setItem(3, ToolsInvItems.chatClear());
        inv.setItem(4, ToolsInvItems.feedAndHealMenu());
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
        if (event.getCurrentItem().isSimilar(ToolsInvItems.vanishMenu())) {
            if(!player.hasPermission("staffmodegui.vanishmenu")) {
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessage.noPermission").replace("&", "§"));
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.openGUI").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getVanishInv().getInventory());
        } else if (event.getCurrentItem().isSimilar(ToolsInvItems.flyMenu())) {
            if (!player.hasPermission ( "staffmodegui.flymenu" )) {
                player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "defaultMessage.noPermission" ).replace ( "&" , "§" ) );
            }
            player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "flyMenu.openGUI" ).replace ( "&" , "§" ) );
            player.openInventory ( StaffModeGUI2.getInstance ().getFlyInv ().getInventory () );
        } else if (event.getCurrentItem().isSimilar(ToolsInvItems.invClear())) {
            player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "toolsMenu.messageItemInvClear" ).replace ( "&" , "§" ) );
            player.getInventory ().clear ();
        } else if (event.getCurrentItem().isSimilar(ToolsInvItems.chatClear ())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                for (int i = 0; i < 600; ++i) {
                    players.sendMessage("");
                }
            }
            Bukkit.broadcastMessage(StaffModeGUI2.getPlugin ().getConfig ().getString ( "toolsMenu.messageItemClearChat").replace ( "&" , "§" ) );
            Bukkit.broadcastMessage(" ");
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());

        }
    }
}
