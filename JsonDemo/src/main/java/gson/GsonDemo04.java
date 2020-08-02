package gson;

import bean.ShopInfo;
import com.google.gson.Gson;

import java.util.ArrayList;

public class GsonDemo04 {
    public static void main(String[] args) {
        ArrayList<ShopInfo> shopInfos = new ArrayList<>();
        ShopInfo baoyu = new ShopInfo(1, "baoyu", 1666, "http://dafda");
        ShopInfo yanwo = new ShopInfo(9, "yanwo", 1222, "http://dafda");
        shopInfos.add(baoyu);
        shopInfos.add(yanwo);

        Gson gson = new Gson();
        String json = gson.toJson(shopInfos);
        System.out.println(json);
    }
}
