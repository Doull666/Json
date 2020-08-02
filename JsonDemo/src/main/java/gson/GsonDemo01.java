package gson;

import bean.ShopInfo;
import com.google.gson.Gson;

//将JSon格式的字符串转化为java对象
public class GsonDemo01 {
    public static void main(String[] args) {
        String json = "{\n" +
                "\t\"id\":2, \"name\":\"大虾\", \n" +
                "\t\"price\":12.3, \n" +
                "\t\"imagePath\":\"http://192.168.10.165:8080/L05_Server/images/f1.jpg\"\n" +
                "}\n";

        Gson gson = new Gson();
        ShopInfo shopInfo = gson.fromJson(json, ShopInfo.class);
        System.out.println(shopInfo);
    }
}
