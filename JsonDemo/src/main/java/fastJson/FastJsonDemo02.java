package fastJson;

import bean.ShopInfo;
import com.alibaba.fastjson.JSON;

import java.util.List;

public class FastJsonDemo02 {
    public static void main(String[] args) {
        String json="[\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"imagePath\": \"http://192.168.10.165:8080/f1.jpg\",\n" +
                "        \"name\": \"大虾1\",\n" +
                "        \"price\": 12.3\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2,\n" +
                "        \"imagePath\": \"http://192.168.10.165:8080/f2.jpg\",\n" +
                "        \"name\": \"大虾2\",\n" +
                "        \"price\": 12.5\n" +
                "    }\n" +
                "]";
        List<ShopInfo> shopInfos = JSON.parseArray(json, ShopInfo.class);
        System.out.println(shopInfos);
    }
}
