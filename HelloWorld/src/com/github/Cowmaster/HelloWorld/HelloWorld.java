package com.github.Cowmaster.HelloWorld;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class HelloWorld extends JavaPlugin{

	Logger log;
	public void onEnable(){ 
		 log = this.getLogger();
		 log.info("HelloWorld is enabled");
		 System.out.println("Hello World!");
	}
	 
	public void onDisable(){ 
		log.info("Helloworld is disabled");
		 System.out.println("Goodbye World!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("h")){ // If the player typed /h then do the following...
			// doSomething
			sender.sendMessage( "You yell - Hello World!");
			 System.out.println("Hello World!");
			return true;
		} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
		System.out.println("...");
		return false; 
	}
}