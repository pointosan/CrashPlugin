package com.gmail.pointochanneru.crashplugin;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCrash implements CommandExecutor {

    private static final String CRASH_PERM="yt.crash";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

       // crash (player)

        if(sender.hasPermission(CRASH_PERM) ) {
            if(args.length == 1) {
                String target_name = args[0];
                Player target = Bukkit.getPlayer(target_name);
                if(target !=null) {
                    for (int i = 0; i < 100; i++) {
                        target.spawnParticle(Particle.EXPLOSION_NORMAL, target.getLocation(), 1000000, 1,1,1);
                    }
                    sender.sendMessage("§eクラッシュしました　§c" + target_name +  "'s §eminecrfat");
                } else  {
                    sender.sendMessage("§c" + target_name + " §eis nicht online");
                }
            } else {
                sender.sendMessage("§4/crash (player)");
            }

        } else {
            sender.sendMessage("§e権限がないよ！ｗｗ!"+ CRASH_PERM);
        }



        return true;
    }

}
