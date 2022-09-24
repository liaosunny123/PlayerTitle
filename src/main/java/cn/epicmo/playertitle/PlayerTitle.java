package cn.epicmo.playertitle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import cn.epicmo.playertitle.command.*;
import org.jetbrains.annotations.NotNull;

public final class PlayerTitle extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("PlayerTitle has been loaded.This plugin is designed for WHU University by EpicMo and WarmthDawn");
        //Load Command Listener

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @Override
    public boolean onCommand(@NotNull CommandSender sender,@NotNull Command command,@NotNull String label,@NotNull String[] args) {
        this.getCommand("pt").setExecutor(new commandentry(this));
        return false;
    }

}
