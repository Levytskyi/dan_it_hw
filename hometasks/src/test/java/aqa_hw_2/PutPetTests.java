package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.PetDto;
import aqa_hw_2.dto.TagDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;

public class PutPetTests {
    @Test
    public void verifyPetCanBeModified() {
        int petIdToCreate = 325;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(2);
        categoryDto.setName("cats");
        String petNameToCreate = "Sharik";
        String url = "https://b3666184.assetcdn.net/3666184/wp-content/uploads/2024/10/funny-dog-pics-21-10-24-2024.jpg";
        List<String> photoUrlsToCreate = new ArrayList<>(List.of(url));
        TagDto tagDtoToCreate = new TagDto();
        tagDtoToCreate.setId(1);
        tagDtoToCreate.setName("funny");
        List<TagDto> tagsListToCreate = new ArrayList<>(List.of(tagDtoToCreate));
        String status = "available";

        PetDto petDtoToCreate = new PetDto(
                petIdToCreate,
                categoryDto,
                petNameToCreate,
                photoUrlsToCreate,
                tagsListToCreate,
                status);

        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet/");

        PetDto postResponseDto = createdPetResponse.as(PetDto.class);
        System.out.println(postResponseDto);

        System.out.println(createdPetResponse.asPrettyString());
        Assert.assertEquals(325, postResponseDto.getId());

        Response previouslyCreatedPet = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPet.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());
        Assert.assertEquals(categoryDto.getName(), previouslyCreatedPetDto.getCategory().getName());
        Assert.assertEquals(petNameToCreate, previouslyCreatedPetDto.getName());
        Assert.assertEquals(status, previouslyCreatedPetDto.getStatus());

        petDtoToCreate.setName("Tuzik");
        petDtoToCreate.getCategory().setName("dogs");
        petDtoToCreate.setStatus("Sold");

        given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .put("https://petstore.swagger.io/v2/pet/");

        Response putResponseDto = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto obtainedPutResponseDto = putResponseDto.as(PetDto.class);
        System.out.println(obtainedPutResponseDto);
        Assert.assertEquals(petDtoToCreate.getName(), obtainedPutResponseDto.getName());
        Assert.assertEquals(petDtoToCreate.getCategory().getName(), obtainedPutResponseDto.getCategory().getName());
        Assert.assertEquals(petDtoToCreate.getStatus(), obtainedPutResponseDto.getStatus());
    }
}
