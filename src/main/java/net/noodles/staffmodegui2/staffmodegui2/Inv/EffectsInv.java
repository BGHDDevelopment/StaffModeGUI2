package net.noodles.staffmodegui2.staffmodegui2.Inv;

import net.noodles.staffmodegui2.staffmodegui2Inv.InvItems.EffectsInvItems;
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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectsInv implements Listener {
    @SuppressWarnings("unused")
    private StaffModeGUI2 main;

    public EffectsInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents( this, main);
    }

    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Effects Control";
    }

    private int getSize() {
        return 9;
    }
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(null, getSize(), getTitle());

        inv.setItem(0, EffectsInvItems.potionWater());
        inv.setItem(1, EffectsInvItems.invis());
        inv.setItem(2, EffectsInvItems.jumpboostMenu());
        inv.setItem(3, EffectsInvItems.speedMenu());
        inv.setItem(4, EffectsInvItems.strengthMenu());
        inv.setItem(5, EffectsInvItems.slowness());
        inv.setItem(6, EffectsInvItems.removeEffects());
        inv.setItem(7, EffectsInvItems.potionNight());
        inv.setItem(8, MainInvItems.mainMenuReturn());

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

        if (event.getClickedInventory() == null) return;
        if (!event.getClickedInventory().getTitle().equals(getTitle())) return;

        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;

        event.setCancelled(true);
        if (event.getCurrentItem().isSimilar(EffectsInvItems.potionWater())) {
            player.addPotionEffect(new PotionEffect ( PotionEffectType.WATER_BREATHING, 10000000, 0));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.messageItemWaterBreathing").replace("&", "§"));
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(EffectsInvItems.invis())) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 10000000, 0));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.messageItemInvis").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem ().isSimilar ( EffectsInvItems.jumpboostMenu () )) {
            if (!player.hasPermission ( "staffmodegui.jumpmenu" )) {
                player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "defaultMessage.noPermission" ).replace ( "&" , "§" ) );
            }
            player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "jumpMenu.openGUI" ).replace ( "&" , "§" ) );
            player.openInventory ( StaffModeGUI2.getInstance ().getJumpboostInv ().getInventory () );
        } else if (event.getCurrentItem ().isSimilar ( EffectsInvItems.speedMenu () )) {
            if (!player.hasPermission ( "staffmodegui.speedmenu" )) {
                player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "defaultMessage.noPermission" ).replace ( "&" , "§" ) );
            }
            player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "speedMenu.openGUI" ).replace ( "&" , "§" ) );
            player.openInventory ( StaffModeGUI2.getInstance ().getSpeedInv ().getInventory () );
        } else if (event.getCurrentItem ().isSimilar ( EffectsInvItems.strengthMenu () )) {
            if (!player.hasPermission ( "staffmodegui.strengthmenu" )) {
                player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "defaultMessage.noPermission" ).replace ( "&" , "§" ) );
            }
            player.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "strengthMenu.openGUI" ).replace ( "&" , "§" ) );
            player.openInventory ( StaffModeGUI2.getInstance ().getStrengthInv ().getInventory () );
        } else if (event.getCurrentItem().isSimilar(EffectsInvItems.slowness())) {
            player.removePotionEffect(PotionEffectType.JUMP);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 180000000, 0));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.messageItemSlowness").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(EffectsInvItems.removeEffects())) {
            player.getActivePotionEffects().clear();
            for (PotionEffect pe : player.getActivePotionEffects()) {
                player.removePotionEffect(pe.getType());
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.messageItemRemoveEffects").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(EffectsInvItems.potionNight())) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10000000, 0));
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("effectsMenu.messageItemNightVision").replace("&", "§"));
            event.getWhoClicked().closeInventory();
        } else if (event.getCurrentItem().isSimilar(MainInvItems.mainMenuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());

        }
    }


}
