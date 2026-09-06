package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.NotFoundPetDto;
import aqa_hw_2.dto.PetDto;
import aqa_hw_2.dto.TagDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class DeletePetTests {
    @Test
    public void verifyPetCanBeRemoved() {
        int petIdToCreate = 324;
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
        Assert.assertEquals(324, postResponseDto.getId());

        Response previouslyCreatedPet = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPet.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());

        given().delete("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        Response deletedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        NotFoundPetDto notFoundPetDto = deletedPetResponse.as(NotFoundPetDto.class);
        Assert.assertEquals(1, notFoundPetDto.getCode());
        Assert.assertEquals("error", notFoundPetDto.getType());
        Assert.assertEquals("Pet not found", notFoundPetDto.getMessage());
    }
}
