package com.kabkraft.plugin.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.kabkraft.plugin.helloworld.helloworldplugin;


public class HelloCommand implements CommandExecutor {
	
	private helloworldplugin plugin;
	
	public HelloCommand(helloworldplugin plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("hello.use")) {
			p.sendMessage("hi!");
			return true;
		}
		else {
		
			p.sendMessage("You do not have permission to execute this command.");
		}
		
		return false;
	}

}
