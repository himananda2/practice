/*package restAssured;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test {

	@Test
	public void extractSingleValue_findSingleTeamName() {
		Response response = get("teams/66");
		String teamName = response.path("name");
		System.out.println(teamName);
	}

}
*/