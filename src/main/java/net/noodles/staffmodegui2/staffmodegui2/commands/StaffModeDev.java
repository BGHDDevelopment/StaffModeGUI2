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

    public StaffModeDev() {
        StaffModeGUI2 staffmodegui2 = StaffModeGUI2.getInstance ();
        staffmodegui2.getCommand ( "staffmodedev" ).setExecutor ( this );
    }

    @Override
    public boolean onCommand(CommandSender sender , Command cmd , String cmdLabel , String[] args) {
        if (!(sender instanceof Player)) {
            Logger.log ( Logger.LogLevel.WARNING , ("Only players can use this command!") );
            return false;
        }
        Player player = (Player) sender;
        if (!player.getName ().equalsIgnoreCase ( "Noodles_YT" )) {
            player.sendMessage ( Settings.DEV_MESSAGE );
            player.sendMessage ( Settings.DEV_MESSAGE2 );
            player.sendMessage ( Settings.DEV_MESSAGE3 );

            return false;
        }
        player.sendMessage ( ChatColor.WHITE + "Hello Noodles_YT!" );
        player.sendMessage ( ChatColor.GRAY + "Plugin Version - " + ChatColor.WHITE + Settings.VERSION );
        player.sendMessage ( ChatColor.GRAY + "Config Version - " + ChatColor.WHITE + StaffModeGUI2.getPlugin ().getConfig ().getString ( "configVersion" ).replace ( "&" , "§" ) );
        player.sendMessage ( ChatColor.GRAY + "End of log." );
        return true;
    }

}
