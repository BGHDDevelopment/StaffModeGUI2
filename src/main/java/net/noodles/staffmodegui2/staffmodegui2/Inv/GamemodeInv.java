package net.noodles.staffmodegui2.staffmodegui2.Inv;


import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.GamemodeInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import org.bukkit.inventory.meta.ItemMeta;

public class GamemodeInv implements Listener {

    private StaffModeGUI2 main;

    public GamemodeInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Gamemodes";
    }

    private int getSize() {
        return 18;
    }
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(1, GamemodeInvItems.creative());
        inv.setItem(3, GamemodeInvItems.survival());
        inv.setItem(5, GamemodeInvItems.spectator());
        inv.setItem(7, GamemodeInvItems.adventure());
        inv.setItem(17, MainInvItems.mainMenuReturn());
        for (int i = 0; i < 18; ++i) {
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
        if (event.getCurrentItem().isSimilar(GamemodeInvItems.creative())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.messageItemCreative").replace("&", "§"));
            player.closeInventory();
            player.setGameMode(GameMode.CREATIVE);
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(GamemodeInvItems.survival())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.messageItemSurvival").replace("&", "§"));
            player.closeInventory();
            player.setGameMode(GameMode.SURVIVAL);
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(GamemodeInvItems.spectator())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.messageItemSpectator").replace("&", "§"));
            player.closeInventory();
            player.setGameMode(GameMode.SPECTATOR);
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(GamemodeInvItems.adventure())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("gamemodeMenu.messageItemAdventure").replace("&", "§"));
            player.closeInventory();
            player.setGameMode(GameMode.ADVENTURE);
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());

        }
    }

}
