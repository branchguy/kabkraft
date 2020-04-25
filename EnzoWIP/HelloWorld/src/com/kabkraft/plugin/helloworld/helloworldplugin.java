package com.kabkraft.plugin.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import com.kabkraft.plugin.helloworld.commands.HelloCommand;

public class helloworldplugin extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new HelloCommand(this);
	}
	
	@Override
	public void onDisable () {
		
	}
}
