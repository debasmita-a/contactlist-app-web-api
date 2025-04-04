package config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
    
 }
