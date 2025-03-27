package Ch5;

public class Practice {

	public static void main(String[] args) {
		String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"F\",\"shelter_name\":\"臺中市中途動物醫院\"}]";

		String[] cat, dog;
		json.replace("[", "").replace("]", "").split(json);
		String[]stplited = json.replace("[", "").replace("]", "").replace("{", "").split("},");
		cat = stplited[0].split(",");
		dog = stplited[1].split(",");
		
		System.out.println(cat[0]);
		System.out.println(dog[0]);

	}

}
