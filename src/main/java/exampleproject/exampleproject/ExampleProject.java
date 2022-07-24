package exampleproject.exampleproject;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExampleProject extends JavaPlugin {

    @Override
    public void onEnable() {

        //Commands
        getCommand("diamonds").setExecutor(new Diamonds());

        //Listeners
        getServer().getPluginManager().registerEvents(new OnChat(), this);

    }

    @Override
    public void onDisable() {
    }
}
