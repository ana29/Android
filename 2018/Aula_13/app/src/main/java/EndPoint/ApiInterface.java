package EndPoint;


import models.Posts;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;


public interface ApiInterface {

    @GET("posts/{id}")
    Call<Posts> getPots(@Path("id") Integer id);

    @PUT("posts/{id}")
    Call<Posts> setPosts(@Path("id") Integer id, @Body Posts post);

}
