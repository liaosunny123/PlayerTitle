package cn.epicmo.playertitle.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class commandentry implements CommandExecutor {
    private Plugin mainplugin;
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch (args[0]){
            case "about":
                sender.sendMessage("This plugin is designed for WHU University on PlayerTitle.If you have any question , please connect Administrator");
                break;
            case "getcourseid":

                break;
        }
        return false;
    }

    public commandentry(Plugin name){
        this.mainplugin = name;
    }
}
