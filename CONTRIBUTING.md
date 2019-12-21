# Contributing/Making a pull request to StaffModeGUI2

#### Please follow these formats when contributing to StaffModeGUI2.

## Format for StaffModeGUI2 Inventory class

```java
package net.noodles.staffmodegui2.staffmodegui2.Inv;

// Change Example to you're invitems class name
import net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems.ExampleInvItems;
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

// Rename Example to you're class name
public class ExampleInv implements Listener {

    private StaffModeGUI2 main;

    // Rename Example to you're class name
    public ExampleInv(StaffModeGUI2 main) {
        this.main = main;
        main.getServer ().getPluginManager ().registerEvents ( this , main );
    }

    // TITLE = You're inv title Ex. "Vanish Control"
    private String getTitle() {
        return ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "TITLE";
    }

    // size = 9-54(Each row is 9 so if you did 17 it would send an error to console if you tried running the gui in game and if you did 18 then it would work)
    private int getSize() {
        return size;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory ( null , getSize () , getTitle () );
        // InvName = You're InvItems class name
        // number = 9-53
        // menu = the menu name variable you set in the InvItems class
        inv.setItem ( number , InvNameInvItems.menu () );
        // size is the size you chose for getSize()
        for (int i = 0; i < size; ++i) {
            if (inv.getItem ( i ) == null) {
                inv.setItem ( i , Glass () );
            }
        }
        return inv;
    }

    // This places glass in every empty slot within the GUI
    private ItemStack Glass() {
        ItemStack stone = new ItemStack ( Material.STAINED_GLASS_PANE , 1 , (short) 8 );
        ItemMeta stonem = stone.getItemMeta ();
        stonem.setDisplayName ( "" );
        stone.setItemMeta ( stonem );
        return stone;
    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked ();
        if (event.getClickedInventory () == null) return;
        if (!event.getClickedInventory ().getTitle ().equals ( getTitle () )) return;
        if (event.getCurrentItem () == null) return;
        if (event.getCurrentItem ().getType () == Material.AIR) return;
        event.setCancelled ( true );
        // CLICK EVENTS
               if (event.getCurrentItem().isSimilar(VanishInvItems.VanishON())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.hidePlayer(player);
                player.setAllowFlight(true);
                player.setFlying(true);
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.messageItemON").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(VanishInvItems.VanishOFF())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.showPlayer(player);
                player.setAllowFlight(false);
                player.setFlying(false);
            }
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("vanishMenu.messageItemOFF").replace("&", "§"));
            player.closeInventory();
        } else if (event.getCurrentItem().isSimilar(VanishInvItems.menuReturn())) {
            player.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("mainMenuReturn.message3").replace("&", "§"));
            player.openInventory(StaffModeGUI2.getInstance().getToolsInv().getInventory());
        }
    }
}
```

## Format for StaffModeGUI2 InvItems classes

```java
package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

// Change Example to you're class name
public class ExampleInvItems {

    public static ItemStack menu() {
        return new ItemBuilder ( Material.GLASS_BOTTLE)
                // .setName Sets the name of the item
                .setName( StaffModeGUI2.getPlugin().getConfig().getString("exampleMenu.titleItemExample").replace("&", "§"))
                // .setLore Sets the lore of the item
                .setLore( Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("exampleMenu.loreItemExample").replace("&", "§")
                ))
                .toItemStack();
    }

}
```
