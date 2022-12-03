package be.gilles;

import be.gilles.plugins.Optelling;
import be.gilles.plugins.Plugin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Rekenmachine {
    private final int MAX_AANTAL_PLUGINS = 10;
    private final Plugin[] ingeladenPlugins;
    private int aantalPlugins;

    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
        aantalPlugins = 0;
    }

    public void installeer(Plugin teInstallerenPlugin) {

        if (Arrays.asList(ingeladenPlugins).contains(teInstallerenPlugin) || aantalPlugins == MAX_AANTAL_PLUGINS) {

            System.out.println("This plugin is already installed or the maximum number of plugins has been reached.");

        } else

            ingeladenPlugins[aantalPlugins++] = teInstallerenPlugin;

    }

    public double bereken(String command, double x, double y) {

        boolean ingeladen = false;
        double getal = 0;


        for (int i = 0; i <= aantalPlugins; i++) {
            if (ingeladenPlugins[i] != null && ingeladenPlugins[i].getCommand().equals(command)) {
                ingeladen = true;
                getal = ingeladenPlugins[i].bereken(x, y);
            }
        }

        if (!ingeladen) {
            System.out.printf("Plugin \"%s\" niet geïnstalleerd.%n", command);
            getal = 0;
        }

        return getal;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Geïnstalleerde Plugins: ");


        for (Plugin plugin : ingeladenPlugins)
            if (plugin != null) {
                stringBuilder.append(plugin.getCommand()).append(" ");
            }

        return stringBuilder.toString();
    }
}
