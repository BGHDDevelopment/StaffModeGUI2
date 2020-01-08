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

    private StaffModeGUI2 main;

    public UpdateNotification(StaffModeGUI2 main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (StaffModeGUI2.plugin.getConfig().getBoolean("Update.Enabled") == true) {
            if (p.hasPermission("staffmodegui.update")) {
                new UpdateChecker(StaffModeGUI2.getPlugin(), 60960).getLatestVersion(version -> {
                    if (!StaffModeGUI2.getInstance().getDescription().getVersion().equalsIgnoreCase(version)) {
                        p.sendMessage(ChatColor.GRAY + "****************************************************************");
                        p.sendMessage(ChatColor.RED + "ReportGUI is outdated!");
                        p.sendMessage(ChatColor.RED + "Newest version: " + version);
                        p.sendMessage(ChatColor.RED + "Your version: " + ChatColor.BOLD + Settings.VERSION);
                        p.sendMessage(ChatColor.GOLD + "Please Update Here: " + ChatColor.ITALIC + Settings.PLUGIN_URL);
                        p.sendMessage(ChatColor.GRAY + "****************************************************************");
                    }
                });
            }
        }
    }

    @EventHandler
    public void onDevJoin(PlayerJoinEvent e) { //THIS EVENT IS USED FOR DEBUG REASONS ONLY!
        Player p = e.getPlayer();
        if (p.getName().equals("Noodles_YT")) {
            p.sendMessage(ChatColor.RED + "BGHDDevelopment Debug Message");
            p.sendMessage(" ");
            p.sendMessage(ChatColor.GREEN + "This server is using " + Settings.NAME + " version " + Settings.VERSION);
            p.sendMessage(" ");
        }
    }
}
