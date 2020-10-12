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
import javax.swing.*;

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

        for (int i = 0 ; i<dataList.size();i++) {
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            System.out.println(dataList.get(i).SpecificCharacterSetV2);
            System.out.println(dataList.get(i).AccessionNumberV2);
            System.out.println(dataList.get(i).ReferringPhysiciansNameV2);
            System.out.println(dataList.get(i).RetrieveURLV2);
            System.out.println(dataList.get(i).PatientsNameV2);
            System.out.println(dataList.get(i).PatientsIDV2);
            System.out.println(dataList.get(i).PatientsBirthDateV2);
            System.out.println(dataList.get(i).PatientsSexV2);
            System.out.println(dataList.get(i).PregnancyStatusV2);
            System.out.println(dataList.get(i).StudyInstanceUIDV2);
            System.out.println(dataList.get(i).RequestingPhysicianV2);
            System.out.println(dataList.get(i).RequestedProcedureDescriptionV2);
            System.out.println(dataList.get(i).AdmissionIDV2);
            System.out.println(dataList.get(i).ScheduledProcedureStepSequenceV2);
            System.out.println(dataList.get(i).ScheduledStationAETitleV2);
            System.out.println(dataList.get(i).ScheduledProcedureStepStartDateV2);
            System.out.println(dataList.get(i).ScheduledProcedureStepStartTimeV2);
            System.out.println(dataList.get(i).ScheduledProtocolCodeSequenceV2);
            System.out.println(dataList.get(i).ScheduledProcedureStepIDV2);
            System.out.println(dataList.get(i).ScheduledStationNameV2);
            System.out.println(dataList.get(i).ScheduledProcedureStepStatusV2);
            System.out.println(dataList.get(i).RequestedProcedureIDV2);
            System.out.println(dataList.get(i).RequestedProcedurePriorityV2);
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        }

        //swing frame
        JFrame f=new JFrame();
        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(0,0,100, 40);//x axis, y axis, width, height
        f.add(b);//adding button in JFrame
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

        JButton c=new JButton("click");//creating instance of JButton
        c.setBounds(0,40,100, 40);//x axis, y axis, width, height
        f.add(c);//adding button in JFrame
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible






    }
}

