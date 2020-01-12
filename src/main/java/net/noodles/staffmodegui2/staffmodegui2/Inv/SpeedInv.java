package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.EffectsInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.SpeedInvItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpeedInv implements Listener {
    @SuppressWarnings("unused")
    private StaffModeGUI2 main;
    public SpeedInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }
    private String getTitle() {
        return ChatColor.DARK_GRAY.toString () + ChatColor.BOLD + "Speed Control";
    }

    private int getSize() {
        return 18;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, SpeedInvItems.speed1());
        inv.setItem(1, SpeedInvItems.speed2());
        inv.setItem(2, SpeedInvItems.speed3());
        inv.setItem(3, SpeedInvItems.speed4());
        inv.setItem(4, SpeedInvItems.speed5());
        inv.setItem(5, SpeedInvItems.speed6());
        inv.setItem(6, SpeedInvItems.speed7());
        inv.setItem(7, SpeedInvItems.speed8());
        inv.setItem(8, EffectsInvItems.removeEffects());
        inv.setItem(17, SpeedInvItems.menuReturn());

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

        if (event.getView() == null) return;
        if (!event.getView().getTitle().equals(getTitle())) return;

        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;

        event.setCancelled(true);
        if (event.getCurrentItem().isSimilar(SpeedInvItems.speed1())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect (PotionEffectType.SPEED, 180000000, 1));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed1").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.speed2())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 2));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed2").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.speed3())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 3));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed3").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.speed4())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 4));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed4").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.speed5())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 5));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed5").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.speed6())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 6));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed6").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.speed7())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 7));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed7").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.speed8())) {
            player.removePotionEffect(PotionEffectType.SPEED);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 8));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("speedMenu.messageItemSpeed8").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(EffectsInvItems.removeEffects())) {
            player.getActivePotionEffects().clear();
            for (PotionEffect pe : player.getActivePotionEffects()) {
                player.removePotionEffect(pe.getType());
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.messageItemRemoveEffects").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(SpeedInvItems.menuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message4").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getEffectsInv().getInventory());

        }
    }
}