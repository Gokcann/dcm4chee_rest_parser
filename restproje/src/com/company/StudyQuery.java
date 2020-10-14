package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class StudyQuery {

    public String StudyQuery(String responseBody) {
        JSONArray myArray = new JSONArray(responseBody);
        int index = 0;
        int index2 = 0;

        System.out.println("********length*************" + myArray.length());
        StudyData StudyData = new StudyData();

        StudyData[] data = new StudyData[myArray.length()];
        return "";




    }

    public ArrayList<StudyData> StudyQueryParse(String responseBody) {
        ArrayList<StudyData> list = new ArrayList<>();
        StudyData _tmp = new StudyData();
        JSONArray myArray = new JSONArray(responseBody);
        for (int i = 0; i < myArray.length(); i++) {
            JSONObject obj = myArray.getJSONObject(i);
            StudyData tmp = new StudyData();

            if (myArray.getJSONObject(i).has(_tmp.getSpecificCharacterSetT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getSpecificCharacterSetT0()).has(_tmp.getSpecificCharacterSetT2())) {
                tmp.setSpecificCharacterSetV2(obj.getJSONObject(_tmp.getSpecificCharacterSetT0())
                        .getJSONArray(_tmp.getSpecificCharacterSetT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getStudyDateT0()).has(_tmp.getStudyDateT2())) {
                tmp.setStudyDateV2(obj.getJSONObject(_tmp.getStudyDateT0())
                        .getJSONArray(_tmp.getStudyDateT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getAccessionNumberT0()).has(_tmp.getAccessionNumberT2())) {
                tmp.setAccessionNumberV2(obj.getJSONObject(_tmp.getAccessionNumberT0())
                        .getJSONArray(_tmp.getAccessionNumberT2()).getString(0));
            }

            if (myArray.getJSONObject(i).has(_tmp.getReferringPhysiciansNameT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getReferringPhysiciansNameT0()).has(_tmp.getReferringPhysiciansNameT2()) && myArray.getJSONObject(i).getJSONObject(_tmp.getReferringPhysiciansNameT0()).getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0).has(_tmp.getReferringPhysiciansNameT3())) {
                tmp.setReferringPhysiciansNameV2(obj.getJSONObject(_tmp.getReferringPhysiciansNameT0())
                        .getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0)
                        .getString(_tmp.getReferringPhysiciansNameT3()));
            }


            //iki asamali
            //myArray.getJSONObject(i).getJSONObject(_tmp.getReferringPhysiciansNameT0()).getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0).has(_tmp.getReferringPhysiciansNameT3())

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getRetrieveAETitleT0()).has(_tmp.getRetrieveAETitleT2())) {
                tmp.setRetrieveAETitleV2(obj.getJSONObject(_tmp.getRetrieveAETitleT0())
                        .getJSONArray(_tmp.getRetrieveAETitleT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getInstanceAvailabilityT0()).has(_tmp.getInstanceAvailabilityT2())) {
                tmp.setInstanceAvailabilityV2(obj.getJSONObject(_tmp.getInstanceAvailabilityT0())
                        .getJSONArray(_tmp.getInstanceAvailabilityT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getModalitiesInStudyT0()).has(_tmp.getModalitiesInStudyT2())) {
                tmp.setModalitiesInStudyV2(obj.getJSONObject(_tmp.getModalitiesInStudyT0())
                        .getJSONArray(_tmp.getModalitiesInStudyT2()).getString(0));
            }
/*
            if (myArray.getJSONObject(i).has(_tmp.getReferringPhysiciansNameT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getReferringPhysiciansNameT0()).getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0).has(_tmp.getReferringPhysiciansNameT3())) {
                tmp.setReferringPhysiciansNameV2(obj.getJSONObject(_tmp.getReferringPhysiciansNameT0())
                        .getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0)
                        .getString(_tmp.getReferringPhysiciansNameT3()));
            }

 */

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getRetrieveURLT0()).has(_tmp.getRetrieveURLT2())) {
                tmp.setRetrieveURLV2(obj.getJSONObject(_tmp.getRetrieveURLT0())
                        .getJSONArray(_tmp.getRetrieveURLT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getPatientsNameT0()).has(_tmp.getPatientsNameT2())) {
                tmp.setPatientsNameV2(obj.getJSONObject(_tmp.getPatientsNameT0())
                        .getJSONArray(_tmp.getPatientsNameT2()).getJSONObject(0)
                        .getString(_tmp.getPatientsNameT3()));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getPatientsIDT0()).has(_tmp.getPatientsIDT2())) {
                tmp.setPatientsIDV2(obj.getJSONObject(_tmp.getPatientsIDT0())
                        .getJSONArray(_tmp.getPatientsIDT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getPatientsBirthDateT0()).has(_tmp.getPatientsBirthDateT2())) {
                tmp.setPatientsBirthDateV2(obj.getJSONObject(_tmp.getPatientsBirthDateT0())
                        .getJSONArray(_tmp.getPatientsBirthDateT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getPatientsSexT0()).has(_tmp.getPatientsSexT2())) {
                tmp.setPatientsSexV2(obj.getJSONObject(_tmp.getPatientsSexT0())
                        .getJSONArray(_tmp.getPatientsSexT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getStudyInstanceUIDT0()).has(_tmp.getStudyInstanceUIDT2())) {
                tmp.setStudyInstanceUIDV2(obj.getJSONObject(_tmp.getStudyInstanceUIDT0())
                        .getJSONArray(_tmp.getStudyInstanceUIDT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getStudyIDT0()).has(_tmp.getStudyIDT2())) {
                tmp.setStudyIDV2(obj.getJSONObject(_tmp.getStudyIDT0())
                        .getJSONArray(_tmp.getStudyIDT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getNumberofStudyRelatedSeriesT0()).has(_tmp.getNumberofStudyRelatedSeriesT2())) {
                tmp.setNumberofStudyRelatedSeriesV2(obj.getJSONObject(_tmp.getNumberofStudyRelatedSeriesT0())
                        .getJSONArray(_tmp.getNumberofStudyRelatedSeriesT2()).toString());
            }


            if (myArray.getJSONObject(i).getJSONObject(_tmp.getNumberofStudyRelatedInstancesT0()).has(_tmp.getNumberofStudyRelatedInstancesT2())) {
                tmp.setNumberofStudyRelatedInstancesV2(obj.getJSONObject(_tmp.getNumberofStudyRelatedInstancesT0())
                        .getJSONArray(_tmp.getNumberofStudyRelatedInstancesT2()).toString());
            }



            list.add(tmp);

            //TODO add other if &and& controls



        }

        return list;
    }
}
