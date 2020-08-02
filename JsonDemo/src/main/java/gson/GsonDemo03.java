package gson;

import bean.ShopInfo;
import com.google.gson.Gson;

public class GsonDemo03 {
    public static void main(String[] args) {
        ShopInfo baoyu = new ShopInfo(1, "baoyu", 1666, "http://dafda");

        Gson gson = new Gson();
        String json = gson.toJson(baoyu);

        System.out.println(json);
    }
}
