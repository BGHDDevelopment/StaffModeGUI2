package net.noodles.staffmodegui2.staffmodegui2;

import net.noodles.staffmodegui2.staffmodegui2.commands.StaffModeCommand;
import net.noodles.staffmodegui2.staffmodegui2.commands.StaffModeDev;
import net.noodles.staffmodegui2.staffmodegui2.Inv.*;
import net.noodles.staffmodegui2.staffmodegui2.util.Logger;
import net.noodles.staffmodegui2.staffmodegui2.util.MetricsLite;
import net.noodles.staffmodegui2.staffmodegui2.util.Settings;
import net.noodles.staffmodegui2.staffmodegui2.util.UpdateChecker.UpdateChecker;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;
import java.util.Arrays;

public final class StaffModeGUI2 extends JavaPlugin {

    public static StaffModeGUI2 plugin;
    public UpdateChecker checker;
    private static StaffModeGUI2 instance;

    //INV
    private MainInv mainInv;
    private WhitelistInv whitelistInv;
    private TimeInv timeInv;
    private WeatherInv weatherInv;
    private GamemodeInv gamemodeInv;
    private FlyInv flyInv;
    private VanishInv vanishInv;
    private MobInv mobInv;
    private ExtraMobInv extraMobInv;
    private TrollInv trollInv;
    private ToolsInv toolsInv;
    private ServerManagerInv serverManagerInv;
    private FeedAndHealInv feedAndHealInv;
    private EffectsInv effectsInv;
    private SpeedInv speedInv;
    private StrengthInv strengthInv;
    private JumpboostInv jumpboostInv;
    private DifficultyInv difficultyInv;

    @Override
    public void onEnable() {
        Logger.log ( Logger.LogLevel.OUTLINE , "****************************************************" );
        Logger.log ( Logger.LogLevel.INFO , "Initializing StaffModeGUI2 Version: " + Settings.VERSION );
        Logger.log ( Logger.LogLevel.INFO, "Created by: " + Settings.DEVELOPER_NAME);
        Logger.log ( Logger.LogLevel.INFO, "Website: " + Settings.DEVELOPER_URL);
        Logger.log ( Logger.LogLevel.INFO, "Spigot: " + Settings.PLUGIN_URL);
        Logger.log ( Logger.LogLevel.INFO, "Support: " + Settings.SUPPORT_DISCORD_URL);
        Logger.log ( Logger.LogLevel.INFO, "Suggestions/Feedback: " + Settings.FEEDBACK);
        Logger.log ( Logger.LogLevel.INFO, "Wiki: " + Settings.WIKI);
        Logger.log ( Logger.LogLevel.OUTLINE , "****************************************************" );
        Logger.log ( Logger.LogLevel.INFO , "Plugin Loading..." );
        Logger.log ( Logger.LogLevel.INFO , "Registering Managers..." );
        plugin = this;
        instance = this;
        MetricsLite metrics = new MetricsLite ( this );
        Logger.log ( Logger.LogLevel.INFO , "Managers Registered!" );
        Logger.log ( Logger.LogLevel.INFO , "Registering Listeners..." );
        registerListener (
                //NOT NEEDED
        );
        Logger.log ( Logger.LogLevel.INFO , "Listeners Registered!" );
        Logger.log ( Logger.LogLevel.INFO , "Registering Commands..." );
        new StaffModeCommand ();
        new StaffModeDev ();
        Logger.log ( Logger.LogLevel.INFO , "Commands Registered!" );
        Logger.log ( Logger.LogLevel.INFO , "Loading Inventory's..." );
        this.mainInv = new MainInv ( this );
        this.whitelistInv = new WhitelistInv ( this );
        this.timeInv = new TimeInv ( this );
        this.weatherInv = new WeatherInv ( this );
        this.gamemodeInv = new GamemodeInv ( this );
        this.flyInv = new FlyInv ( this );
        this.vanishInv = new VanishInv ( this );
        this.mobInv = new MobInv ( this );
        this.extraMobInv = new ExtraMobInv ( this );
        this.trollInv = new TrollInv ( this );
        this.toolsInv = new ToolsInv ( this );
        this.serverManagerInv = new ServerManagerInv ( this );
        this.feedAndHealInv = new FeedAndHealInv ( this );
        this.effectsInv = new EffectsInv(this);
        this.speedInv = new SpeedInv ( this );
        this.strengthInv = new StrengthInv ( this );
        this.jumpboostInv = new JumpboostInv ( this );
        this.difficultyInv = new DifficultyInv ( this );
        Logger.log ( Logger.LogLevel.INFO , "Inventory's Registered!" );
        Logger.log ( Logger.LogLevel.INFO , "Loading Config's..." );
        this.createConfig ();
        Logger.log ( Logger.LogLevel.INFO , "Config's Registered!" );
        Logger.log ( Logger.LogLevel.SUCCESS , "StaffModeGUI2 Version: " + Settings.VERSION + " Loaded." );
        Logger.log ( Logger.LogLevel.OUTLINE , "********************" );
        Logger.log ( Logger.LogLevel.INFO , "Checking for updates..." );
        this.checker = new UpdateChecker ( this );
        if (this.checker.isConnected ()) {
            if (this.checker.hasUpdate ()) {
                Logger.log ( Logger.LogLevel.OUTLINE , "****************************************************" );
                Logger.log ( Logger.LogLevel.WARNING , ("StaffModeGUI2 is outdated!") );
                Logger.log ( Logger.LogLevel.WARNING , ("Newest version: " + this.checker.getLatestVersion ()) );
                Logger.log ( Logger.LogLevel.WARNING , ("Your version: " + Settings.VERSION) );
                Logger.log ( Logger.LogLevel.WARNING , ("Please Update Here: " + Settings.PLUGIN_URL) );
                Logger.log ( Logger.LogLevel.OUTLINE , "****************************************************" );
            } else {
                Logger.log ( Logger.LogLevel.SUCCESS , "StaffModeGUI2 is up to date!" );
            }
        }
    }

    @Override
    public void onDisable() {
    }

    private void registerListener(Listener... listeners) {
        Arrays.stream ( listeners ).forEach ( l -> getServer ().getPluginManager ().registerEvents ( l , this ) );
    }

    @SuppressWarnings({"rawtypes" , "unchecked"})
    public static StaffModeGUI2 getPlugin() {
        return (StaffModeGUI2) getPlugin ( (Class) StaffModeGUI2.class );
    }

    private void createConfig() {
        try {
            if (!getDataFolder ().exists ()) getDataFolder ().mkdirs ();

            File file = new File ( getDataFolder () , "config.yml" );
            if (!file.exists ()) {
                saveDefaultConfig ();
            }

        } catch (Exception exception) {
            getLogger ().info ( exception.getMessage () );
        }
    }

    public static StaffModeGUI2 getInstance() {
        return instance;
    }

    //INV
    public MainInv getMainInv() {
        return mainInv;
    }

    public WhitelistInv getWhitelistInv() {
        return whitelistInv;
    }

    public TimeInv getTimeInv() {
        return timeInv;
    }

    public WeatherInv getWeatherInv() {
        return weatherInv;
    }

    public GamemodeInv getGamemodeInv() {
        return gamemodeInv;
    }

    public FlyInv getFlyInv() {
        return flyInv;
    }

    public VanishInv getVanishInv() {
        return vanishInv;
    }

    public MobInv getMobInv() {
        return mobInv;
    }

    public ExtraMobInv getExtraMobInv() {
        return extraMobInv;
    }

    public TrollInv getTrollInv() {
        return trollInv;
    }

    public ToolsInv getToolsInv() {
        return toolsInv;
    }

    public ServerManagerInv getServerManagerInv() {
        return serverManagerInv;
    }

    public FeedAndHealInv getFeedAndHealInv() {
        return feedAndHealInv;
    }

    public EffectsInv getEffectsInv() {
        return effectsInv;
    }

    public SpeedInv getSpeedInv() {
        return speedInv;
    }

    public StrengthInv getStrengthInv() {
        return strengthInv;
}

    public JumpboostInv getJumpboostInv() {
        return jumpboostInv;
    }

    public DifficultyInv getDifficultyInv() {
        return difficultyInv;
    }
}