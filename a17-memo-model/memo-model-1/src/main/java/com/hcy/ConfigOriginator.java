package com.hcy;


/**
 * 记录者类
 * @author HCY
 * @since 2021/4/24 8:59 上午
 */
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigMemento saveMemento(){
        return new ConfigMemento(configFile);
    }

    public void getMemento(ConfigMemento memento){
        this.configFile = memento.getConfigFile();
    }

}
