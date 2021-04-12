package net.noodles.staffmodegui2.staffmodegui2.util;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import org.bukkit.entity.Player;

public class StaffModeGUIExpansion extends PlaceholderExpansion {

    private StaffModeGUI2 plugin;

    public StaffModeGUIExpansion(StaffModeGUI2 plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean persist(){
        return true;
    }

    @Override
    public boolean canRegister(){
        return true;
    }

    @Override
    public String getAuthor(){
        return plugin.getDescription().getAuthors().toString();
    }

    @Override
    public String getIdentifier(){
        return "staffmodegui";
    }

    @Override
    public String getVersion(){
        return plugin.getDescription().getVersion();
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier){

        if(player == null){
            return "";
        }

        if(identifier.equals("staffonline")){
            return String.valueOf(Settings.getOnlineStaff().size());
        }

        return null;
    }
}