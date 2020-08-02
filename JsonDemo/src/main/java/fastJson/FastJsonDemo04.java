package fastJson;

import bean.ShopInfo;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class FastJsonDemo04 {
    public static void main(String[] args) {
        ArrayList<ShopInfo> shopInfos = new ArrayList<>();
        ShopInfo baoyu = new ShopInfo(1, "baoyu", 1666, "http://dafda");
        ShopInfo yanwo = new ShopInfo(9, "yanwo", 1222, "http://dafda");
        shopInfos.add(baoyu);
        shopInfos.add(yanwo);

        String jsonList = JSON.toJSONString(shopInfos);
        System.out.println(jsonList);
    }
}
