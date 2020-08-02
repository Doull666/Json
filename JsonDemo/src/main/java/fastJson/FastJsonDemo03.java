package fastJson;

import bean.ShopInfo;
import com.alibaba.fastjson.JSON;

public class FastJsonDemo03 {
    public static void main(String[] args) {
        ShopInfo baoyu = new ShopInfo(1, "baoyu", 1666, "http://dafda");

        String aaa = JSON.toJSONString(baoyu);
        System.out.println(aaa);
    }
}
