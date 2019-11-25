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
        staffmodegui2 = StaffModeGUI2.getInstance ();
        staffmodegui2.getCommand ( "staffmode" ).setExecutor ( this );
    }

    @Override
    public boolean onCommand(CommandSender sender , Command cmd , String cmdLabel , String[] args) {
        if (!(sender instanceof Player)) {
            Logger.log ( Logger.LogLevel.WARNING , ("Only players can use this command!") );
            return false;
        }
        Player p = (Player) sender;

        if (!p.hasPermission ( "staffmodegui.open" )) {
            p.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "defaultMessages.noPermission" ).replace ( "&" , "§" ) );
            return false;
        }
        if (args.length == 0) {
            p.openInventory ( StaffModeGUI2.getInstance ().getMainInv ().getInventory () );
            return true;
        }
                if (args[0].equalsIgnoreCase ( "reload" )) {
                    if (!p.hasPermission ( "staffmodegui.reload" )) {
                        p.sendMessage ( StaffModeGUI2.getPlugin ().getConfig ().getString ( "defaultMessages.noPermission" ).replace ( "&" , "§" ) );
                        return false;
                    }
                    if (args.length == 1) {
                        staffmodegui2.reloadConfig ();
                        p.sendMessage ( ChatColor.translateAlternateColorCodes ( '&' , staffmodegui2.getConfig ().getString ( "defaultMessages.reloadMessage" ) ) );
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }
