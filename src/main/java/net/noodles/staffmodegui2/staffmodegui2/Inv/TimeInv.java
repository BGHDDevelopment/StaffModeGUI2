package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.TimeInvItems;
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


public class TimeInv implements Listener {

    private StaffModeGUI2 main;

    public TimeInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY.toString () + ChatColor.BOLD + "Time Control";
    }

    private int getSize() {
        return 27;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, TimeInvItems.time12AM());
        inv.setItem(1, TimeInvItems.time1AM());
        inv.setItem(2, TimeInvItems.time2AM());
        inv.setItem(3, TimeInvItems.time3AM());
        inv.setItem(4, TimeInvItems.time4AM());
        inv.setItem(5, TimeInvItems.time5AM());
        inv.setItem(6, TimeInvItems.time6AM());
        inv.setItem(7, TimeInvItems.time7AM());
        inv.setItem(8, TimeInvItems.time8AM());
        inv.setItem(9, TimeInvItems.time9AM());
        inv.setItem(10, TimeInvItems.time10AM());
        inv.setItem(11, TimeInvItems.time11AM());
        inv.setItem(12, TimeInvItems.time12AM());
        inv.setItem(13, TimeInvItems.time1PM());
        inv.setItem(14, TimeInvItems.time2PM());
        inv.setItem(15, TimeInvItems.time3PM());
        inv.setItem(16, TimeInvItems.time4PM());
        inv.setItem(17, TimeInvItems.time5PM());
        inv.setItem(18, TimeInvItems.time6PM());
        inv.setItem(19, TimeInvItems.time7PM());
        inv.setItem(20, TimeInvItems.time8PM());
        inv.setItem(21, TimeInvItems.time9PM());
        inv.setItem(22, TimeInvItems.time10PM());
        inv.setItem(23, TimeInvItems.time11PM());
        inv.setItem(24, TimeInvItems.time12PM());
        inv.setItem(26, MainInvItems.mainMenuReturn());


        for (int i = 0; i < 27; ++i) {
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

        if (event.getView() == null) return;
        if (!event.getView().getTitle().equals(getTitle())) return;

        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;

        event.setCancelled(true);
        if (event.getCurrentItem().isSimilar(TimeInvItems.time12AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime12AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(18000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time1AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime1AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(19000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time2AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime2AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(20000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time3AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime3AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(21000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time4AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime4AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(22000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time5AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime5AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(23000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time6AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime6AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(24000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time7AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime7AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(1000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time8AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime8AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(2000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time9AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime9AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(3000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time10AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime10AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(4000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time11AM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime11AM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(5000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time12PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime12PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(6000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time1PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime1PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(7000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time2PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime2PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(8000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time3PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime3PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(9000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time4PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime4PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(10000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time5PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime5PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(11000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time6PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime6PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(12000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time7PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime7PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(13000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time8PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime8PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(14000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time9PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime9PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(15000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time10PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime10PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(16000L);
        } else if (event.getCurrentItem().isSimilar(TimeInvItems.time11PM())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("timeMenu.messageTime11PM").replace("&", "§"));
            player.closeInventory();
            player.getWorld().setTime(17000L);
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());
        }
    }
}