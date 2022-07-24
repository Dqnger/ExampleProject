package exampleproject.exampleproject;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Diamonds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command!");
            return true;
        }

        Player player = (Player) sender;

        Random r = new Random();
        int result = r.nextInt(22-6) + 6;

        ItemStack diamond = new ItemStack(Material.DIAMOND, result);
        player.getInventory().addItem(diamond);

        return true;
    }
}
