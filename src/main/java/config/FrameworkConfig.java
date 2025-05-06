package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources ({"file:${user.dir}/config/config.properties"})
public interface FrameworkConfig extends Config{
    
    String browser();
    String url();
    String runMode();
    String remoteURL();
}
