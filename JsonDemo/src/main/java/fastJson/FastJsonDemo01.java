package fastJson;

import bean.ShopInfo;
import com.alibaba.fastjson.JSON;

public class FastJsonDemo01 {
    public static void main(String[] args) {
        String json="{\n" +
                "\t\"id\":2, \"name\":\"大虾\", \n" +
                "\t\"price\":12.3, \n" +
                "\t\"imagePath\":\"http://192.168.10.165:8080/L05_Server/images/f1.jpg\"\n" +
                "}\n";

        ShopInfo json1 = JSON.parseObject(json, ShopInfo.class);
        System.out.println(json1);
    }
}
