package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.company.*;

public class Main {
    private  static HttpURLConnection connection;


    public static void main(String[] args) {

        MwlQuery query = new MwlQuery();
        QueryProcess response = new QueryProcess();
        MwlData mwlData = new MwlData();
        ArrayList<MwlData> dataList;
        //query.MwlQuery(response.QueryProcessMethod().toString());
        dataList=query.MwlQueryParse(response.QueryProcessMethod().toString());
        System.out.println(dataList.get(0).SpecificCharacterSetV2);



    }
}

