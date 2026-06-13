package de.tommy.rtp;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class RTPCommand implements CommandExecutor {

    private final Random random = new Random();

    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Nur Spieler können diesen Befehl nutzen.");
            return true;
        }

        Player player = (Player) sender;

        World world = player.getWorld();

        int x = random.nextInt(10000) - 5000;
        int z = random.nextInt(10000) - 5000;

        int y = world.getHighestBlockYAt(x, z);

        Location target = new Location(world, x + 0.5, y + 1, z + 0.5);

        player.teleport(target);
        player.sendMessage("§aDu wurdest zufällig teleportiert!");

        return true;
    }
}
