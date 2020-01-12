package net.noodles.staffmodegui2.staffmodegui2.Events;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.Settings;
import net.noodles.staffmodegui2.staffmodegui2.util.UpdateChecker.UpdateChecker;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class UpdateNotification implements Listener {

    public UpdateNotification(StaffModeGUI2 main) {
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!(p.hasPermission("staffmodegui.update"))) {
            if (StaffModeGUI2.getPlugin().getConfig().getBoolean("Update.Enabled")){
                UpdateChecker checker = new UpdateChecker ( StaffModeGUI2.getPlugin () );
                if (checker.isConnected()) {
                    if (checker.hasUpdate()) {
                        p.sendMessage(ChatColor.GRAY + "********************");
                        p.sendMessage ( " " );
                        p.sendMessage(ChatColor.RED + "StaffModeGUI2 is outdated!");
                        p.sendMessage(ChatColor.GREEN + "Newest version: " + checker.getLatestVersion());
                        p.sendMessage(ChatColor.RED + "Your version: " + Settings.VERSION);
                        p.sendMessage(ChatColor.GOLD + "Please update here: " + Settings.PLUGIN_URL );
                        p.sendMessage ( " " );
                        p.sendMessage(ChatColor.GRAY + "********************");
                    }
                }
            }
        }
    }
}