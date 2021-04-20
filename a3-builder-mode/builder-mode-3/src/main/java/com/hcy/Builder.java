package com.hcy;

import com.hcy.ceilling.LevelOneCeiling;
import com.hcy.ceilling.LevelTwoCeiling;
import com.hcy.coat.DuluxCoat;
import com.hcy.coat.LiBangCoat;
import com.hcy.floor.ShengXiangFloor;
import com.hcy.service.IMenu;
import com.hcy.service.impl.DecorationPackageMenu;
import com.hcy.tile.DongPengTile;
import com.hcy.tile.MarcoPoloTile;

/**
 * 建造者模式
 * @author HCY
 * @since 2021/3/15 下午3:41
*/
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                //吊顶，二级顶
                .appendCeiling(new LevelTwoCeiling())
                //涂料，多乐士
                .appendCoat(new DuluxCoat())
                // 地板，圣象
                .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                // 吊顶，二级顶
                .appendCeiling(new LevelTwoCeiling())
                // 涂料，立邦
                .appendCoat(new LiBangCoat())
                // 地砖，马可波罗
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                // 吊顶，二级顶
                .appendCeiling(new LevelOneCeiling())
                // 涂料，立邦
                .appendCoat(new LiBangCoat())
                // 地砖，东鹏
                .appendTile(new DongPengTile());
    }

}
