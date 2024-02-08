import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class PostSteps {

    private PostApi api = new PostApi();
    private UserApi userApi = new UserApi();

    private ValidatableResponse response;

    public void getPostByPostId(Long postId) {
        response = api.getPostById(postId.toString()).then();
    }

    public void checkPost(Post expectedPost) {
        //Проверяем что 1 = 1
        response.assertThat().statusCode(equalTo(200));
        Post postFromApi = response.extract().body().as(Post.class);
        assertEquals(expectedPost.getId(), postFromApi.getId());
        assertEquals(expectedPost.getUserId(), postFromApi.getUserId());
        assertEquals(expectedPost.getTitle(), postFromApi.getTitle());
        assertEquals(expectedPost.getBody(), postFromApi.getBody());
    }
}
