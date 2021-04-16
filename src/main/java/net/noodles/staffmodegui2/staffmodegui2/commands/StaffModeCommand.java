package net.noodles.staffmodegui2.staffmodegui2.commands;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.Logger;
import net.noodles.staffmodegui2.staffmodegui2.util.Settings;
import net.noodles.staffmodegui2.staffmodegui2.util.UpdateChecker.UpdateChecker;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffModeCommand implements CommandExecutor {

    private StaffModeGUI2 staffmodegui2;

    public StaffModeCommand() {
        staffmodegui2 = StaffModeGUI2.getInstance();
        staffmodegui2.getCommand("staffmode").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {
        if (!(sender instanceof Player)) {
            Logger.log(Logger.LogLevel.WARNING, ("Only players can use this command!"));
            return false;
        }
        Player p = (Player) sender;
        if (args.length == 0) {
            if (!p.hasPermission("staffmodegui.open")) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmodegui2.getConfig().getString("defaultMessage.noPermission").replace("&", "§")));
                return false;
            }
            p.openInventory(StaffModeGUI2.getInstance().getMainInv().getInventory());
            return true;
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("about")) {
                if (!p.hasPermission("staffmodegui.about")) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmodegui2.getConfig().getString("defaultMessage.noPermission").replace("&", "§")));
                    return false;
                }
                p.sendMessage(ChatColor.GRAY + "****************************************************");
                p.sendMessage("");
                p.sendMessage(ChatColor.GRAY + "Created by: " + ChatColor.WHITE + Settings.DEVELOPER_NAME);
                p.sendMessage(ChatColor.GRAY + "Website: " + ChatColor.WHITE + Settings.DEVELOPER_URL);
                p.sendMessage(ChatColor.GRAY + "Wiki: " + ChatColor.WHITE + Settings.WIKI);
                p.sendMessage(ChatColor.GRAY + "Spigot Link: " + ChatColor.WHITE + Settings.PLUGIN_URL);
                p.sendMessage(ChatColor.GRAY + "Support Link: " + ChatColor.WHITE + Settings.SUPPORT_DISCORD_URL);
                p.sendMessage(ChatColor.GRAY + "Version: " + ChatColor.WHITE + Settings.VERSION);
                p.sendMessage("");
                p.sendMessage(ChatColor.GRAY + "****************************************************");
                return true;
            } else if (args[0].equalsIgnoreCase("help")) {
                if (!p.hasPermission("staffmodegui.help")) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmodegui2.getConfig().getString("defaultMessage.noPermission").replace("&", "§")));
                    return false;
                }
                p.sendMessage(ChatColor.GRAY + "****************************************************");
                p.sendMessage("");
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c/staffmode &7- &fOpens the GUI"));
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c/staffmode help &7- &fThis help page"));
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c/staffmode about &7- &fThe about page"));
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c/staffmode update &7- &fChecks for an update on SpigotMC"));
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c/staffmodereload &7- &fReloads the config file"));
                p.sendMessage("");
                p.sendMessage(ChatColor.GRAY + "****************************************************");
                return true;
            } else if (args[0].equalsIgnoreCase("update")) {
                if (!p.hasPermission("staffmodegui.update")) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmodegui2.getConfig().getString("defaultMessage.noPermission").replace("&", "§")));
                    return false;
                }
                p.sendMessage(ChatColor.RED + "Checking for updates...");
                new UpdateChecker(StaffModeGUI2.getPlugin(), 60960).getLatestVersion(version -> {
                    if (!StaffModeGUI2.getInstance().getDescription().getVersion().equalsIgnoreCase(version)) {
                        p.sendMessage(ChatColor.GRAY + "****************************************************************");
                        p.sendMessage(ChatColor.RED + "StaffModeGUI2 is outdated!");
                        p.sendMessage(ChatColor.RED + "Newest version: " + version);
                        p.sendMessage(ChatColor.RED + "Your version: " + ChatColor.BOLD + Settings.VERSION);
                        p.sendMessage(ChatColor.GOLD + "Please Update Here: " + ChatColor.ITALIC + Settings.PLUGIN_URL);
                        p.sendMessage(ChatColor.GRAY + "****************************************************************");
                    } else
                        p.sendMessage(ChatColor.GREEN + "StaffModeGUI2 is up to date!");
                });
                return false;
            }
        }
        return false;
    }
}