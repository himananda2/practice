package restAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class NewTest {
	@Test
	public void extractSingleValue_findSingleTeamName() {
		Response response = get("teams/66");
		String teamName = response.path("name");
		System.out.println(teamName);
	}

	@Test
	public void extractSingleValue_findSingleTeamName_specifyJsonPath() {
		Response response = get("teams/66");
		JsonPath jsonPath = new JsonPath(response.asString());
		String teamName = jsonPath.get("name");
		System.out.println(teamName);
	}

	@Test
	public void extractSingleValue_findSingleTeamName_responseAsString() {
		String responseAsString = get("teams/66").asString();
		String teamName = JsonPath.from(responseAsString).get("name");
		System.out.println(teamName);
	}

	@Test
	public void extractSingleValue_findSingleTeamName_getEverythingInOneGo() {
		String teamName = get("teams/66").path("name");
		System.out.println(teamName);
	}

	@Test
	public void extractSingleValue_findSingleTeamName_useAssertion() {
		given().when().get("teams/66").then().assertThat().body("name", equalTo("Manchester United FC"));
	}
}
