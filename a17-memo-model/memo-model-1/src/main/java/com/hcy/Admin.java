package com.hcy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 管理员类
 * @author HCY
 * @since 2021/4/24 9:00 上午
*/
public class Admin {

    private int cursorIdx = 0;
    private List<ConfigMemento> mementoList = new ArrayList<ConfigMemento>();
    private Map<String, ConfigMemento> mementoMap = new ConcurrentHashMap<String, ConfigMemento>();

    public void append(ConfigMemento memento) {
        mementoList.add(memento);
        mementoMap.put(memento.getConfigFile().getVersionNo(), memento);
        cursorIdx++;
    }

    public ConfigMemento undo() {
        if (--cursorIdx <= 0) {
            return mementoList.get(0);
        }
        return mementoList.get(cursorIdx);
    }

    public ConfigMemento redo() {
        if (++cursorIdx > mementoList.size()) {
            return mementoList.get(mementoList.size() - 1);
        }
        return mementoList.get(cursorIdx);
    }

    public ConfigMemento get(String versionNo){
        return mementoMap.get(versionNo);
    }

}
