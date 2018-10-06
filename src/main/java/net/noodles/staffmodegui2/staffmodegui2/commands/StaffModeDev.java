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

public class StaffModeDev implements CommandExecutor {

    private StaffModeGUI2 staffmodegui2;
    private UpdateChecker checker;


    public StaffModeDev() {
        staffmodegui2 = StaffModeGUI2.getInstance();
        staffmodegui2.getCommand("staffmodedev").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {
        if (!(sender instanceof Player)) {
            Logger.log(Logger.LogLevel.WARNING, ("Only players can use this command!"));
            return false;
        }
        Player p = (Player) sender;
        if (!p.getName().equalsIgnoreCase("Noodles_YT")) {
            p.sendMessage(Settings.DEV_MESSAGE);
            p.sendMessage(Settings.DEV_MESSAGE2);
            p.sendMessage(Settings.DEV_MESSAGE3);

            return false;
        }
        p.sendMessage(ChatColor.GRAY + "Hello Noodles_YT!");
        p.sendMessage(ChatColor.GRAY + "Plugin Version - " + Settings.VERSION);
        p.sendMessage(ChatColor.GRAY + "Config Version - " + StaffModeGUI2.getPlugin().getConfig().getString("configVersion").replace("&", "§"));

        return true;
    }
}



