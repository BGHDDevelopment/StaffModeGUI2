package net.noodles.staffmodegui2.staffmodegui2.Inv;

import jdk.internal.org.jline.utils.DiffHelper;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.DifficultyInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DifficultyInv implements Listener {
    @SuppressWarnings("unused")
    private StaffModeGUI2 main;

    public DifficultyInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents( this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "Difficulty Control";
    }

    private int getSize() {
        return 9;
    }
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, DifficultyInvItems.DifficultyPeace());
        inv.setItem(1, DifficultyInvItems.DifficultyEasy());
        inv.setItem(2, DifficultyInvItems.DifficultyNormal());
        inv.setItem(3, DifficultyInvItems.DifficultyHard());
        inv.setItem(8, DifficultyInvItems.menuReturn());

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
        if (event.getCurrentItem().isSimilar(DifficultyInvItems.DifficultyPeace())) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 0");
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.messageItemDifficultyPeace").replace("&", "§"));
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(DifficultyInvItems.DifficultyEasy())) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 1");
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("difficultyMenu.messageItemDifficultyEasy").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem ().isSimilar ( DifficultyInvItems.DifficultyNormal () )) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 2");
            player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "difficultyMenu.messageItemDifficultyNormal" ).replace ( "&" , "§" ) );
            player.closeInventory();
        } else if (event.getCurrentItem ().isSimilar ( DifficultyInvItems.DifficultyHard () )) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 3");
            player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "difficultyMenu.messageItemDifficultyHard" ).replace ( "&" , "§" ) );
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(DifficultyInvItems.menuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message1").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getServerManagerInv().getInventory());

        }
    }
}
