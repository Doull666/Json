package orgJson;

import com.google.gson.JsonObject;
import org.json.JSONObject;

//将JSon格式的字符串转化为java对象
public class JsonToJavaObject {
    public static void main(String[] args) {
        String json="{\n" +
                "\"id\":2,\n" +
                "\"name\":\"大虾\",\n" +
                "\"price\":12.6,\n" +
                "\"imagePath\":\"http://192.168.166\"\n" +
                "}";

        //解析json数据
        JSONObject jsonObject = new JSONObject(json);
        System.out.println(jsonObject.getInt("id"));
        System.out.println(jsonObject.optString("name"));

    }
}
