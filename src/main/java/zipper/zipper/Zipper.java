package zipper.zipper;

import java.io.*;
import net.lingala.zip4j.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Zipper extends JavaPlugin {

    private static String dir = null;
    private static String name = "world_old";

    @Override
    public void onEnable() {
        // Plugin startup logic
         dir =  getServer().getWorldContainer().getPath();

        System.out.println("Zipper: current dir = " + dir);

        System.out.println("Zipper: StartCreateZip");
        zipper();
        System.out.println("Zipper: Zip Created!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static void zipper() {

        ZipFile zipfile = null;
        try {
            zipfile = new ZipFile(new File(dir+File.separator+name+"_Arhive.zip"));
            zipfile.addFolder(new File(dir+File.separator+name));
            System.out.println("Zipper: Zip Created!");
        } catch (IOException e) {
            System.out.println("Zipper: world_old is exist!");
            e.printStackTrace();
        }

    }
}