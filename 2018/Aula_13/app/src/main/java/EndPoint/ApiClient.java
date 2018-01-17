package EndPoint;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com";


    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static ApiInterface apiService;

    private ApiClient() {

    }

    public static ApiInterface getInstance () {
        if (apiService == null) {
            apiService = retrofit.create(ApiInterface.class);
        }

        return apiService;
    }
}