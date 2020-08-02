package orgJson;

import org.json.JSONArray;
import org.json.JSONObject;

//将Json数组转换为JavaList
public class JsonArrayToJavaList {
    public static void main(String[] args) {
        String json="[\n" +
                "{\n" +
                "\"id\":2,\n" +
                "\"name\":\"大虾\",\n" +
                "\"price\":12.6,\n" +
                "\"imagePath\":\"http://192.168.166\"\n" +
                "},\n" +
                "{\n" +
                "\"id\":1,\n" +
                "\"name\":\"青岛\",\n" +
                "\"price\":16.6,\n" +
                "\"imagePath\":\"http://192.168.1666\"\n" +
                "}\n" +
                "]";

        JSONArray jsonArray = new JSONArray(json);
        for(int i=0;i<jsonArray.length();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println(jsonObject.optInt("id"));
            System.out.println(jsonObject.optString("name"));
        }
    }
}
