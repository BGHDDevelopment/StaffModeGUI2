package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MainInvItems;
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.MobInvItems;
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

public class MobInv implements Listener {
    @SuppressWarnings("unused")
    private StaffModeGUI2 main;

    public MobInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents( this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Mob Control";
    }

    private int getSize() {
        return 27;
    }
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, MobInvItems.mobCreeper());
        inv.setItem(1, MobInvItems.mobSkeleton());
        inv.setItem(2, MobInvItems.mobSpider());
        inv.setItem(3, MobInvItems.mobZombie());
        inv.setItem(4, MobInvItems.mobSlime());
        inv.setItem(5, MobInvItems.mobGhast());
        inv.setItem(6, MobInvItems.mobZombiePig());
        inv.setItem(7, MobInvItems.mobEnderman());
        inv.setItem(8, MobInvItems.mobCaveSpider());
        inv.setItem(9, MobInvItems.mobSilverFish());
        inv.setItem(10, MobInvItems.mobBlaze());
        inv.setItem(11, MobInvItems.mobMagmaCube());
        inv.setItem(12, MobInvItems.mobBat());
        inv.setItem(13, MobInvItems.mobWitch());
        inv.setItem(14, MobInvItems.mobPig());
        inv.setItem(15, MobInvItems.mobSheep());
        inv.setItem(16, MobInvItems.mobCow());
        inv.setItem(17, MobInvItems.mobChicken());
        inv.setItem(18, MobInvItems.mobSquid());
        inv.setItem(19, MobInvItems.mobWolf());
        inv.setItem(20, MobInvItems.mobMushroom());
        inv.setItem(21, MobInvItems.mobOcelot());
        inv.setItem(22, MobInvItems.mobHorse());
        inv.setItem(23, MobInvItems.mobVillager());
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

        if (event.getClickedInventory() == null) return;
        if (!event.getClickedInventory().getTitle().equals(getTitle())) return;

        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;

        event.setCancelled(true);
        if (event.getCurrentItem().isSimilar(MobInvItems.mobCreeper())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemCreeper").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobSkeleton())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemSkeleton").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobSpider())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SPIDER);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemSpider").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobZombie())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemZombie").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobSlime())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SLIME);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemSlime").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobGhast())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.GHAST);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemGhast").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobZombiePig())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG_ZOMBIE);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemZombiePig").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobEnderman())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDERMAN);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemEnderman").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobCaveSpider())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.CAVE_SPIDER);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.message").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobSilverFish())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SILVERFISH);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemSilverFish").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobBlaze())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.BLAZE);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemBlaze").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobMagmaCube())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.MAGMA_CUBE);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemMagmaCube").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobBat())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.BAT);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemBat").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobWitch())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.WITCH);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemWitch").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobPig())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemPig").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobSheep())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SHEEP);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemSheep").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobCow())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.COW);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemCow").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobChicken())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.CHICKEN);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemChicken").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobSquid())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.SQUID);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemSquid").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobWolf())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.WOLF);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemWolf").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobMushroom())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.MUSHROOM_COW);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemMushroom").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobOcelot())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.OCELOT);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemOcelot").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobHorse())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemHorse").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MobInvItems.mobVillager())) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.VILLAGER);
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mobMenu.messageItemVillager").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());

        }
    }


}