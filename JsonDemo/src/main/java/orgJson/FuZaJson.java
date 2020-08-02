package orgJson;

import org.json.JSONArray;
import org.json.JSONObject;

public class FuZaJson {
    public static void main(String[] args) {
        String json = "{\n" +
                "    \"data\": {\n" +
                "        \"count\": 5,\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": 45,\n" +
                "                \"title\": \"坚果\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 132,\n" +
                "                \"title\": \"炒货\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 166,\n" +
                "                \"title\": \"蜜饯\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 195,\n" +
                "                \"title\": \"果脯\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 196,\n" +
                "                \"title\": \"礼盒\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"rs_code\": \"1000\",\n" +
                "    \"rs_msg\": \"success\"\n" +
                "}";

        System.out.println("解析第一层:");
        JSONObject jsonObject = new JSONObject(json);
        System.out.println(jsonObject.optInt("rs_code"));
        System.out.println(jsonObject.optString("rs_msg"));
        JSONObject data = jsonObject.getJSONObject("data");
        System.out.println(data);

        System.out.println("第二层解析：");
        System.out.println(data.optInt("count"));
        JSONArray jsonArray = data.optJSONArray("items");
        System.out.println(jsonArray);
        System.out.println("第三层解析：");
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
            System.out.println(jsonObject1.optInt("id"));
            System.out.println(jsonObject1.optString("title"));
        }


    }
}
