import io.restassured.response.Response;

public class PostApi extends BaseHttpClient {

    private final String apiPath = "/posts/";

    public Response getPostById(String id) {
        return doGetRequest(apiPath + id);
    }

    public Response createPost(Post post) {
        return doPostRequest(apiPath, post);
    }
}
