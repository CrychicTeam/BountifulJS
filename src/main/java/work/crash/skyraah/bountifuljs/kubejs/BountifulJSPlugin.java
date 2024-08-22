package work.crash.skyraah.bountifuljs.kubejs;

import work.crash.skyraah.bountifuljs.BountifulJS;
import dev.latvian.mods.kubejs.KubeJSPlugin;

public class BountifulJSPlugin extends KubeJSPlugin {
    /* Basic example of a KubeJS Plugin.
       To register your own plugins, add this class and package name to "kubejs.plugins.txt" in your Resources directory.
    */

    @Override
    public void init() {
        BountifulJS.LOGGER.info("This is my KubeJS Plugin!");
    }
}

