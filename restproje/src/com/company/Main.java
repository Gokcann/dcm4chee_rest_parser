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
import com.company.*;

public class Main {
    private  static HttpURLConnection connection;

    public static void main(String[] args) {

        // ********THIS IS FIRST METHOD*******
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();


        try {
            URL url = new URL("linkhere");
            //http://192.168.12.44:8080/dcm4chee-arc/aets/DCM4CHEE/rs/mwlitems
            connection = (HttpURLConnection) url.openConnection();
            //request
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            //System.out.println(status);

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while (( line = reader.readLine()) != null ) {
                    responseContent.append(line);
                }
                reader.close();
            }else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while (( line = reader.readLine()) != null ) {
                    responseContent.append(line);
                }
                reader.close();
            }
            //System.out.println(responseContent.toString());
            parse(responseContent.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            connection.disconnect();
        }
        MwlData mwlData = new MwlData();


        /*
        // *********THIS IS SECOND METHOD********
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://192.168.12.44:8080/dcm4chee-arc/aets/DCM4CHEE/rs/mwlitems")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

         */
    }

    public static String parse(String responseBody){
        JSONArray myArray = new JSONArray(responseBody);
        int index = 0;
        int index2 = 0;

        System.out.println("********length*************" +myArray.length());
        MwlData mwlData = new MwlData();

        MwlData[] data = new MwlData[myArray.length()];
        for (int i=0 ;i<myArray.length();i++) {
            data[i] = new MwlData();

            data[i].SpecificCharacterSetV2 = myArray.getJSONObject(i).getJSONObject(mwlData.SpecificCharacterSetT0)
                    .getJSONArray(mwlData.SpecificCharacterSetT2).getString(index2);
            System.out.println(data[i].SpecificCharacterSetV2);

            data[i].AccessionNumberV2 = myArray.getJSONObject(i).getJSONObject(mwlData.AccessionNumberT0)
                    .getJSONArray(mwlData.AccessionNumberT2).getString(index2);
            System.out.println(data[i].AccessionNumberV2);

            //iki asamali parse
            data[i].ReferringPhysiciansNameV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ReferringPhysiciansNameT0)
                    .getJSONArray(mwlData.AccessionNumberT2).getJSONObject(0).getString(mwlData.ReferringPhysiciansNameT3);
            System.out.println(data[i].ReferringPhysiciansNameV2);

            data[i].RetrieveURLV2 = myArray.getJSONObject(i).getJSONObject(mwlData.RetrieveURLT0)
                    .getJSONArray(mwlData.RetrieveURLT2).getString(index2);
            System.out.println(data[i].RetrieveURLV2);

            //iki asamali parse
            data[i].PatientsNameV2 = myArray.getJSONObject(i).getJSONObject(mwlData.PatientsNameT0)
                    .getJSONArray(mwlData.PatientsNameT2).getJSONObject(0).getString(mwlData.PatientsNameT3);
            System.out.println(data[i].PatientsNameV2);

            data[i].PatientsIDV2 = myArray.getJSONObject(i).getJSONObject(mwlData.PatientsIDT0)
                    .getJSONArray(mwlData.PatientsIDT2).getString(index2);
            System.out.println(data[i].PatientsIDV2);

            data[i].PatientsBirthDateV2 = myArray.getJSONObject(i).getJSONObject(mwlData.PatientsBirthDateT0)
                    .getJSONArray(mwlData.PatientsBirthDateT2).getString(index2);
            System.out.println(data[i].PatientsBirthDateV2);

            data[i].PatientsSexV2 = myArray.getJSONObject(i).getJSONObject(mwlData.PatientsSexT0)
                    .getJSONArray(mwlData.PatientsSexT2).getString(index2);
            System.out.println(data[i].PatientsSexV2);

            if( myArray.getJSONObject(i).getJSONObject(mwlData.PregnancyStatusT0).has(mwlData.PregnancyStatusT2) ) {
                data[i].PregnancyStatusV2 = myArray.getJSONObject(index).getJSONObject(mwlData.PregnancyStatusT0)
                        .getJSONArray(mwlData.PregnancyStatusT2).getString(index2);
                System.out.println(data[i].PregnancyStatusV2);
            }




            data[i].StudyInstanceUIDV2 = myArray.getJSONObject(i).getJSONObject(mwlData.StudyInstanceUIDT0)
                    .getJSONArray(mwlData.StudyInstanceUIDT2).getString(index2);
            System.out.println(data[i].StudyInstanceUIDV2);

            //iki asamali parse
            data[i].RequestingPhysicianV2 = myArray.getJSONObject(i).getJSONObject(mwlData.RequestingPhysicianT0)
                    .getJSONArray(mwlData.RequestingPhysicianT2).getJSONObject(0).getString(mwlData.RequestingPhysicianT3);
            System.out.println(data[i].RequestingPhysicianV2);

            data[i].RequestedProcedureDescriptionV2 = myArray.getJSONObject(i).getJSONObject(mwlData.RequestedProcedureDescriptionT0)
                    .getJSONArray(mwlData.RequestedProcedureDescriptionT2).getString(index2);
            System.out.println(data[i].RequestedProcedureDescriptionV2);

            data[i].AdmissionIDV2 = myArray.getJSONObject(i).getJSONObject(mwlData.AdmissionIDT0)
                    .getJSONArray(mwlData.AdmissionIDT2).getString(index2);
            System.out.println(data[i].AdmissionIDV2);

            //uc asamali parse **
            data[i].ScheduledProcedureStepSequenceV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledProcedureStepSequenceT3)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
            System.out.println(data[i].ScheduledProcedureStepSequenceV2);

            //yukaridaki 00400100 sorgunun alt dugumleri...
            data[i].ScheduledStationAETitleV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledStationAETitleT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
            System.out.println(data[i].ScheduledStationAETitleV2);

            //yukaridaki 00400100 sorgunun alt dugumleri...
            data[i].ScheduledProcedureStepStartDateV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledProcedureStepStartDateT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
            System.out.println(data[i].ScheduledProcedureStepStartDateV2);
/*
//mevcut degil
        //yukaridaki 00400100 sorgunun alt dugumleri...
        mwlData.ScheduledProcedureStepStartTimeV2 = myArray.getJSONObject(index).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledProcedureStepStartTimeT0)
                .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
        System.out.println(mwlData.ScheduledProcedureStepStartTimeV2);

 */

        /*
//mevcut degil
        //yukaridaki 00400100 sorgunun alt dugumleri...
        mwlData.ScheduledProtocolCodeSequenceV2 = myArray.getJSONObject(index).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledProtocolCodeSequenceT0)
                .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
        System.out.println(mwlData.ScheduledProtocolCodeSequenceV2);

 */
            //yukaridaki 00400100 sorgunun alt dugumleri...
            data[i].ScheduledProcedureStepIDV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledProcedureStepIDT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
            System.out.println(data[i].ScheduledProcedureStepIDV2);

            //yukaridaki 00400100 sorgunun alt dugumleri...
            data[i].ScheduledStationNameV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledStationNameT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
            System.out.println(data[i].ScheduledStationNameV2);

            //yukaridaki 00400100 sorgunun alt dugumleri...
            data[i].ScheduledProcedureStepStatusV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ScheduledProcedureStepSequenceT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getJSONObject(0).getJSONObject(mwlData.ScheduledProcedureStepStatusT0)
                    .getJSONArray(mwlData.ScheduledProcedureStepSequenceT2).getString(0);
            System.out.println(data[i].ScheduledProcedureStepStatusV2);

            data[i].RequestedProcedureIDV2 = myArray.getJSONObject(i).getJSONObject(mwlData.RequestedProcedureIDT0)
                    .getJSONArray(mwlData.RequestedProcedureIDT2).getString(index2);
            System.out.println(data[i].RequestedProcedureIDV2);

            data[i].RequestedProcedurePriorityV2 = myArray.getJSONObject(i).getJSONObject(mwlData.RequestedProcedurePriorityT0)
                    .getJSONArray(mwlData.RequestedProcedurePriorityT2).getString(index2);
            System.out.println(data[i].RequestedProcedurePriorityV2);

        }
        
            
        













/*
        mwlData.ScheduledStationAETitleV2 = myArray.getJSONObject(index).getJSONObject(mwlData.ScheduledStationAETitleT0)
                .getJSONArray(mwlData.ScheduledStationAETitleT2).getString(index2);
        System.out.println(mwlData.ScheduledStationAETitleV2);

 */
/*
        mwlData.ScheduledProcedureStepStartDateV2 = myArray.getJSONObject(index).getJSONObject(mwlData.ScheduledProcedureStepStartDateT0)
                .getJSONArray(mwlData.ScheduledProcedureStepStartDateT2).getString(index2);
        System.out.println(mwlData.ScheduledProcedureStepStartDateV2);

 */


        /*

        //****ONEMLİİİ****

        JSONObject myobj = myArray.getJSONObject(0);
        JSONObject oobjdata = myobj.getJSONObject("00080090");
        JSONArray objarr = oobjdata.getJSONArray("Value");
        JSONObject sonucobj = objarr.getJSONObject(0);
        String sonuc2 = sonucobj.getString("Alphabetic");
        //String sonuc3 = sonuc2.getString(0);


        System.out.println(sonuc2);

         */





        /*
        mwlData.RetrieveURLV2 = myArray.getJSONObject(index).getJSONObject(mwlData.RetrieveURLT0)
                .getJSONArray(mwlData.RetrieveURLT2).getString(index2);
        System.out.println(mwlData.RetrieveURLV2);
*/


        //JSONObject obj = myArray.getJSONObject(0);
        //String value2 =  obj.getJSONObject("00400100").getJSONArray("Value").getJSONObject(0).getJSONArray("Alphabetic").getString(0);
        //System.out.println("------" + value2);
//
//        for(int i=0;i<myArray.length();i++) {
            //JSONObject obj = myArray.getJSONObject(0);
            //int id =  obj.getInt("00080005");
            //int id2 = obj.getInt("00100010");
            //String title = obj.getString("00080005");

//            JSONObject obj2 = obj.getJSONObject("00100010");
//            String title = obj2.getString("vr");
//            JSONArray myArr = obj2.getJSONArray("Value");
//            String value = myArr.getString(0);
//        System.out.println(value);



//            JSONObject obj2 = obj.getJSONObject("00400100");
//            String title = obj2.getString("vr");
//            JSONArray myArr = obj2.getJSONArray("Value");
//            String value = myArr.getJSONObject(myArr.length()-1).getJSONObject("00080060").getJSONArray("Value").getString(0);
//            System.out.println("******" + myArr.length());
//            //JSONObject obj5 = obj4.getJSONObject("00080060");
//            //JSONArray valuearr = obj4.getJSONArray("Value");
//            //String value = valuearr.getString(0);
//            System.out.println("VAL:  " +title+ " " + value);

//
//            MwlData kisi = new MwlData();
//            kisi.AccessionNumberO = obj.getJSONObject(kisi.AccessionNumber);
//            String title2 = kisi.AccessionNumberO.getString("vr");
            //System.out.println("---***" + title2);
            //System.out.println(myArray.length());

        String aranan = "AHMET";
        //System.out.println(aranan);
        int sonucIndex = 1;
        //boolean a = true;
        for (int j=0; j <data.length;j++) {
            if (aranan.equals(data[j].PatientsNameV2) ) {
                System.out.println("--------------------" + data[j].AccessionNumberV2);
            }

        }

            //System.out.println("--------------------" + data[sonucIndex].AccessionNumberV2);
        
        
        return null;
        
        

    }
}

