import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class PostTest {

    private PostSteps steps = new PostSteps();

    @Test
    public void testGetPostById() {
        Post expectedPost = new Post(1L, 1L, "Test", "Test");
        steps.getPostByPostId(expectedPost.getId());
        steps.checkPost(expectedPost);
    }

    @Test
    public void testGetPostByIdExperimental() throws IOException, InterruptedException {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
//                .GET()
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response);
//        OkHttpClient client = new OkHttpClient.Builder().
//                build();
//        Response response = client.newCall(new Request.Builder().get().url("https://jsonplaceholder.typicode.com/posts/1").build()).execute();
//        System.out.println(response);
    }
}
