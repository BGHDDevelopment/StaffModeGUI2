package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.TrollInvItems;
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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TrollInv implements Listener {
    public StaffModeGUI2 main;
    public TrollInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents( this, main);
    }
    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Troll Menu";
    }

    private int getSize() {
        return 10;
    }
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, TrollInvItems.LightningTroll());
        inv.setItem(1, TrollInvItems.SlownessTroll());
        inv.setItem(2, TrollInvItems.WeaknessTroll());
        inv.setItem(3, TrollInvItems.BlindnessTroll());
        inv.setItem(4, TrollInvItems.CowTroll());
        inv.setItem(5, TrollInvItems.JumpTroll());
        inv.setItem(9, MainInvItems.mainMenuReturn());

        for (int i = 0; i < 10; ++i) {
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
        if (event.getCurrentItem().isSimilar(TrollInvItems.LightningTroll())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.getWorld().strikeLightningEffect(players.getLocation());
                players.getWorld().strikeLightningEffect(players.getLocation());
                players.getWorld().strikeLightningEffect(players.getLocation());
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.messageItemLightningTroll").replace("&", "§"));
                player.closeInventory();
            }} else if (event.getCurrentItem().isSimilar(TrollInvItems.SlownessTroll())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 4));
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.messageItemSlownessTroll").replace("&", "§"));
                player.closeInventory();
            }} else if (event.getCurrentItem().isSimilar(TrollInvItems.WeaknessTroll())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100000, 4));
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.messageItemWeaknessTroll").replace("&", "§"));
                player.closeInventory();
            }} else if (event.getCurrentItem().isSimilar(TrollInvItems.BlindnessTroll())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100000, 4));
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.messageItemBlindnessTroll").replace("&", "§"));
                player.closeInventory();
            }} else if (event.getCurrentItem().isSimilar(TrollInvItems.NauseaTroll())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100000, 4));
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.messageItemNauseaTroll").replace("&", "§"));
                player.closeInventory();
            }} else if (event.getCurrentItem().isSimilar(TrollInvItems.CowTroll())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.getWorld().spawnEntity(players.getLocation(), EntityType.COW);
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.messageItemCowTroll").replace("&", "§"));
                player.closeInventory();
            }} else if (event.getCurrentItem().isSimilar(TrollInvItems.JumpTroll())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100000, 4));
                player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("trollMenu.messageItemJumpTroll").replace("&", "§"));
                player.closeInventory();
        }} else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());

        }
    }


}