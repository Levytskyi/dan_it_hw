package aqa_hw_10.controllers;

import aqa_hw_10.dto.TestRailRequestDto;

import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TestRailController {

    private static final String RUN_ID = "1";
    private static final String BASE_API_URL = "https://levytskyi.testrail.io/index.php?/api/v2/";
    private static final String USER_EMAIL = "myscreamo@gmail.com";
    private static final String USER_PASSWORD = "uzFVDaMElZTf4zEJF5qf-s5zR2URgYIjtGHDthf8s";
    private static final String CREDENTIALS = Base64.getEncoder().encodeToString((USER_EMAIL + ":" + USER_PASSWORD).getBytes());

    public static void publishResults(int statusId, int testCaseId) {
        given().header("Authorization", "Basic " + CREDENTIALS).
                contentType("Application/json").
                body(new TestRailRequestDto(statusId)).
                post(BASE_API_URL + String.format("add_result_for_case/%s/%s", RUN_ID, testCaseId));
    }
}
