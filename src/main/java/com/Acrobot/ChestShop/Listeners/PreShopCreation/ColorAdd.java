package com.Acrobot.ChestShop.Listeners.PreShopCreation;

import com.Acrobot.ChestShop.Configuration.SignConf;
import com.Acrobot.ChestShop.Events.PreShopCreationEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class ColorAdd implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public static void onPreShopCreation(PreShopCreationEvent event) {
        event.setSignLine((byte)0, SignConf.LINE_1_COLOR + event.getSignLine((byte)0));
        event.setSignLine((byte)1, SignConf.LINE_2_COLOR + event.getSignLine((byte)1));
        event.setSignLine((byte)2, SignConf.LINE_3_COLOR + event.getSignLine((byte)2));
        event.setSignLine((byte)3, SignConf.LINE_4_COLOR + event.getSignLine((byte)3));
    }
}
