package net.noodles.staffmodegui2.staffmodegui2.util.UpdateChecker;

import net.noodles.staffmodegui2.staffmodegui2.StaffModeGUI2;
import net.noodles.staffmodegui2.staffmodegui2.util.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UpdateChecker {

    public StaffModeGUI2 plugin;
    public String version;

    public UpdateChecker(StaffModeGUI2 plugin) {
        this.plugin = plugin;
        this.version = this.getLatestVersion();
    }

    @SuppressWarnings("unused")
    public String getLatestVersion() {
        try {
            final int resource = 00000;
            final HttpURLConnection con = (HttpURLConnection)new URL("https://api.spigotmc.org/legacy/update.php?resource=00000").openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.getOutputStream().write("key=98BE0FE67F88AB82B4C197FAF1DC3B69206EFDCC4D3B80FC83A00037510B99B4&resource=00000".getBytes("UTF-8"));
            final String version = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();
            if (version.length() <= 7) {
                return version;
            }
        }
        catch (Exception ex) {
            Logger.log(Logger.LogLevel.WARNING,("Could not load update checker!"));

        }
        return null;
    }

    public boolean isConnected() {
        return this.version != null;
    }

    public boolean hasUpdate() {
        return !this.version.equals(this.plugin.getDescription().getVersion());
    }
}
