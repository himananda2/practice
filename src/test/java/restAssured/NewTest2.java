package restAssured;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class NewTest2 {
	@Test
	public void extractSingleValue_findSingleTeamName() {
		Response response = get("teams/66");
		String teamName = response.path("name");
		System.out.println(teamName);
	}
}
