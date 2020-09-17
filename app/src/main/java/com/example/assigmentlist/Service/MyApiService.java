package com.example.assigmentlist.Service;

import com.example.assigmentlist.Entity.Contact;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MyApiService {
    @GET("contacts/")
    Call<List<Contact>> getContact();
}
