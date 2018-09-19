package net.noodles.staffmodegui2.staffmodegui2.commands;

import com.gamerking195.dev.autoupdaterapi.UpdateLocale;
import com.gamerking195.dev.autoupdaterapi.Updater;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.Logger;
import org.apache.commons.lang.math.NumberUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UpdateCommand implements CommandExecutor {

    private StaffModeGUI2 staffmodegui2;

    public UpdateCommand() {
        staffmodegui2 = StaffModeGUI2.getInstance();
        staffmodegui2.getCommand("staffmodeupdate").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args)
    {
        if (!(sender instanceof Player)) {
            Logger.log(Logger.LogLevel.WARNING,("Only players can use this command!"));
            return false;
        }
        Player p = (Player) sender;
        if (!p.hasPermission("staffmodegui.update")) {
            p.sendMessage(StaffModeGUI2.getPlugin().getConfig().getString("defaultMessages.noPermission").replace("&", "§"));
            return false;
        }
        if (sender instanceof Player) {
            if (args.length > 1 && NumberUtils.isNumber("60960")) {
                UpdateLocale locale = new UpdateLocale();
                locale.setFileName("StaffModeGUI2");
                locale.setPluginName("StaffModeGUI2");
                new Updater((Player) sender, StaffModeGUI2.getInstance(), Integer.valueOf("60960"), locale, false, false).update();
            }
        }

        return true;
    }
}
