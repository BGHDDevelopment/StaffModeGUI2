# Contributing/Making a pull request to StaffModeGUI2

#### Please follow these formats when contributing to StaffModeGUI2.

## Format for StaffModeGUI2 inventory classes

```java
package net.noodles.staffmodegui2.staffmodegui2.Inv;

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

    private int getSize() {
        return 54;
    }

    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory ( null , getSize () , getTitle () );
        // InvName = You're InvItems class name
        // number = 0-53
        // menu = the menu name variable you set in the InvItems class
        inv.setItem ( number , InvNameInvItems.menu () );
        for (int i = 0; i < 54; ++i) {
            if (inv.getItem ( i ) == null) {
                inv.setItem ( i , Glass () );
            }
        }
        return inv;
    }


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
        
    }
}
```

## Format for StaffModeGUI2 invname classes

```java
package net.noodles.staffmodegui2.staffmodegui2.Inv.InvItems;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class MainInvItems {

    public static ItemStack exampleMenu() {
        return new ItemBuilder(Material.COMPASS)
                // setName sets the name of the Inventory that the player is entering Ex. Time Control
                .setName(StaffModeGUI2.getPlugin().getConfig().getString("exampleMenu.title").replace("&", "§"))
                .setLore(Arrays.asList(
                        StaffModeGUI2.getPlugin().getConfig().getString("exampleMenu.lore").replace("&", "§")
                ))
                .toItemStack();
    }

}
```
