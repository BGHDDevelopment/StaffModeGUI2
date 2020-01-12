package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.ExtraMobInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ExtraMobInv implements Listener {

    @SuppressWarnings("unused")
    private StaffModeGUI2 main;

    public ExtraMobInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents( this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY.toString () + ChatColor.BOLD + "Extra Mobs Control";
    }

    private int getSize() {
        return 9;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, ExtraMobInvItems.mobIron());
        inv.setItem(1, ExtraMobInvItems.mobSnow());
        inv.setItem(2, ExtraMobInvItems.mobGiant());
        inv.setItem(3, ExtraMobInvItems.mobWither());
        inv.setItem(4, ExtraMobInvItems.mobDragon());
        inv.setItem(8, ExtraMobInvItems.menuReturn());

        for (int i = 0; i < 9; ++i) {
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
        if (event.getCurrentItem().isSimilar(ExtraMobInvItems.mobIron())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.IRON_GOLEM);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.messageItemIron").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(ExtraMobInvItems.mobSnow())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SNOWMAN);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.messageItemSnow").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(ExtraMobInvItems.mobGiant())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.GIANT);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.messageItemGiant").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(ExtraMobInvItems.mobWither())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.WITHER);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.messageItemWither").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(ExtraMobInvItems.mobDragon())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDER_DRAGON);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("extraMobMenu.messageItemDragon").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(ExtraMobInvItems.menuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message2").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMobInv().getInventory());
        }
    }
}