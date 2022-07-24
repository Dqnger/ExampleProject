package exampleproject.exampleproject;

import me.nopox.utils.spigot.CC;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnChat implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {

        String mes = e.getMessage();
        e.setMessage(CC.translate("&c" + mes));
    }
}
