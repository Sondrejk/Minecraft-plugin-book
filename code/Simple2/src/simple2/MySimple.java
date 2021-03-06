/***
 * Excerpted from "Learn to Program with Minecraft Plugins, CanaryMod Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine2 for more book information.
***/
package mysimple;
import net.canarymod.plugin.Plugin;
import net.canarymod.logger.Logman;
import net.canarymod.Canary;
import net.canarymod.commandsys.*;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.effects.SoundEffect;
import net.canarymod.api.world.position.Location;
import com.pragprog.ahmine.ez.EZPlugin;

public class MySimple extends EZPlugin {
  
  public static long howlong(int years) {
    return years * 365 * 24 * 60 * 60;
  }
    
  @Command(aliases = { "mysimple" },
            description = "Displays Andy's simple variable assignments",
            permissions = { "" },
            toolTip = "/mysimple")
  public void mysimpleCommand(MessageReceiver caller, String[] parameters) {
    if (caller instanceof Player) { 
      Player me = (Player)caller;
      // Put your code after this line:
      
      int myAge = 99;
      int myAgeDoubled = myAge * 2;
      float volume = 2.0f;
      float pitch = 10.0f;
      double dayOnIo = 152853.5047;
      String myName = "Andy Hunt";
      long secondsOld = howlong(10);
  
      me.chat("My age " + myAge);
      me.chat("My age doubled " + myAgeDoubled);
      me.chat("A day on Io " + dayOnIo);    
      me.chat("My name " + myName);
      me.chat("My age in seconds " + secondsOld);
      
      Location loc = me.getLocation();
      loc.getWorld().playSound(new SoundEffect(SoundEffect.Type.GHAST_SCREAM, loc.getX(), loc.getY(), loc.getZ(), volume, pitch));
      
      // ...and finish your code before this line.
    }
  }
}

