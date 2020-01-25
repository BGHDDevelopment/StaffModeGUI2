package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.WeatherInvItems;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WeatherInv implements Listener {

    private StaffModeGUI2 main;

    public WeatherInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "Weather Control";
    }

    private int getSize() {
        return 9;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(2, WeatherInvItems.weatherClear());
        inv.setItem(6, WeatherInvItems.weatherStorm());
        inv.setItem(8, WeatherInvItems.menuReturn());


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

        if (event.getView() == null) return;
        if (!event.getView().getTitle().equals(getTitle())) return;

        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;

        event.setCancelled(true);
        if (event.getCurrentItem().isSimilar(WeatherInvItems.weatherClear())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.weatherClearMessage").replace("&", "§"));
            player.closeInventory();
            World world = player.getWorld();
            world.setStorm(false);
        } else if (event.getCurrentItem().isSimilar(WeatherInvItems.weatherStorm())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("weatherMenu.weatherStormMessage").replace("&", "§"));
            player.closeInventory();
            World world = player.getWorld();
            world.setStorm(true);
        } else if (event.getCurrentItem().isSimilar(WeatherInvItems.menuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message1").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getServerManagerInv().getInventory());
        }
    }
}