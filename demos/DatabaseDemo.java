package demos;
import org.json.JSONArray;
import org.json.JSONObject;

public class DatabaseDemo {
    public static void main(String[] args) {
        
        // example json string
        String jsonString = """
                {"dept": {
                        "id": "tech",
                        "value": "IT",
                        "location": {
                            "count": 3,
                            "addresses": [
                                {"state": "CA"},
                                {"state": "FL"},
                                {"state": "OH"}
                            ]
                        }
                    }
                }
                """;

        // getting the whole string as a working JSONObject (essential)
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println(jsonObject);

        // get the "dept" object from the JSON
        JSONObject dept = jsonObject.getJSONObject("dept");
        System.out.println("dept is " + dept);

        // extracting an string from the 'dept' object
        String id = dept.getString("id");
        System.out.println("id is " + id);

        // extracting an integer
        int count = dept.getJSONObject("location").getInt("count");
        System.out.println(count);

        // extracting an array
        JSONArray jsonArray = dept.getJSONObject("location").getJSONArray("addresses");
        System.out.println(jsonArray);

        // iterating through that array
        for (int i = 0; i<jsonArray.length(); i++) {
            JSONObject address = jsonArray.getJSONObject(i);
            System.out.println("address is " + address);
            String state = address.getString("state");
            System.out.println("state is " + state);
        }

        // extracting a special item from the array
        String secondState = jsonArray.getJSONObject(1).getString("state");
        System.out.println("second state is " + secondState);
    }
}
