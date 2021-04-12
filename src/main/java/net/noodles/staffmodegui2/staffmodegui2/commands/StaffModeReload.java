package net.noodles.staffmodegui2.staffmodegui2.commands;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StaffModeReload implements CommandExecutor {

    private StaffModeGUI2 staffmodegui2;

    public StaffModeReload() {
        staffmodegui2 = StaffModeGUI2.getInstance();
        staffmodegui2.getCommand("staffmodereload").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {
        if (!sender.hasPermission("staffmodegui.reload")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmodegui2.getConfig().getString("defaultMessage.noPermission").replace("&", "§")));
            return false;
        }
        staffmodegui2.reloadConfig();
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', staffmodegui2.getConfig().getString("defaultMessage.reloadMessage").replace("&", "§")));
        return false;
    }
}