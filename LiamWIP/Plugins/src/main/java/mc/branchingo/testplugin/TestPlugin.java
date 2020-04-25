package mc.branchingo.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("It is now starting up!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("It is now shut down!");
    }
}
