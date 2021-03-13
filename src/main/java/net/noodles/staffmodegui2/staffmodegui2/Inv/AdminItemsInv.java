package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.AdminItemsInvItems;
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

public class AdminItemsInv implements Listener {

    private StaffModeGUI2 main;

    public AdminItemsInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "Admin Items Menu";
    }

    private int getSize() {
        return 9;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, AdminItemsInvItems.adminStick());
        inv.setItem(1, AdminItemsInvItems.adminBow());
        inv.setItem(2, AdminItemsInvItems.adminSword());
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

        if (event.getView() == null) return;
        if (!event.getView().getTitle().equals(getTitle())) return;

        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;

        event.setCancelled(true);
        if (event.getCurrentItem().isSimilar(AdminItemsInvItems.adminStick())) {
            player.getInventory().addItem(AdminItemsInvItems.adminStick());
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.messageItemAdminStick").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(AdminItemsInvItems.adminBow())) {
            player.getInventory().addItem(AdminItemsInvItems.adminBow());
            player.getInventory().addItem(AdminItemsInvItems.adminArrow());
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.messageItemAdminBow").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(AdminItemsInvItems.adminSword())) {
            player.getInventory().addItem(AdminItemsInvItems.adminSword());
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("adminItemsMenu.messageItemAdminSword").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());

        }
    }
}
