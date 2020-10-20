package com.company;

import org.json.JSONArray;
import org.json.JSONObject;


import java.util.ArrayList;

public class MwlQuery {

    public String MwlQuery(String responseBody) {
        JSONArray myArray = new JSONArray(responseBody);
        int index = 0;
        int index2 = 0;

        System.out.println("********length*************" + myArray.length());
        MwlData mwlData = new MwlData();

        MwlData[] data = new MwlData[myArray.length()];
        for (int i = 0; i < myArray.length(); i++) {
            data[i] = new MwlData();

            if (myArray.getJSONObject(i).getJSONObject(mwlData.SpecificCharacterSetT0).has(mwlData.SpecificCharacterSetT2)) {
                data[i].SpecificCharacterSetV2 = myArray.getJSONObject(i).getJSONObject(mwlData.SpecificCharacterSetT0)
                        .getJSONArray(mwlData.SpecificCharacterSetT2).getString(index2);
                System.out.println(data[i].SpecificCharacterSetV2);
            }

            data[i].AccessionNumberV2 = myArray.getJSONObject(i).getJSONObject(mwlData.AccessionNumberT0)
                    .getJSONArray(mwlData.AccessionNumberT2).getString(index2);
            System.out.println(data[i].AccessionNumberV2);

            //iki asamali parse
            data[i].ReferringPhysiciansNameV2 = myArray.getJSONObject(i).getJSONObject(mwlData.ReferringPhysiciansNameT0)
                    .getJSONArray(mwlData.ReferringPhysiciansNameT2).getJSONObject(0).getString(mwlData.ReferringPhysiciansNameT3);
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

            if (myArray.getJSONObject(i).getJSONObject(mwlData.PregnancyStatusT0).has(mwlData.PregnancyStatusT2)) {
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
            System.out.println(data[i].RetrieveURLV2);

        }
        return null;
    }

    public ArrayList<MwlData> MwlQueryParse(String responseBody) {
        ArrayList<MwlData> list = new ArrayList<>();
        MwlData _tmp = new MwlData();
        JSONArray myArray = new JSONArray(responseBody);
        for (int i = 0; i < myArray.length(); i++) {
            JSONObject obj = myArray.getJSONObject(i);
            MwlData tmp = new MwlData();

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getSpecificCharacterSetT0()).has(_tmp.getSpecificCharacterSetT2())) {
                tmp.setSpecificCharacterSetV2(obj.getJSONObject(_tmp.getSpecificCharacterSetT0())
                        .getJSONArray(_tmp.getSpecificCharacterSetT2()).getString(0));
            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getAccessionNumberT0()).has(_tmp.getAccessionNumberT2())) {
                tmp.setAccessionNumberV2(obj.getJSONObject(_tmp.getAccessionNumberT0())
                        .getJSONArray(_tmp.getAccessionNumberT2()).getString(0));
            }
            //iki asamali
            //myArray.getJSONObject(i).getJSONObject(_tmp.getReferringPhysiciansNameT0()).getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0).has(_tmp.getReferringPhysiciansNameT3())
            if (myArray.getJSONObject(i).has(_tmp.getReferringPhysiciansNameT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getReferringPhysiciansNameT0()).getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0).has(_tmp.getReferringPhysiciansNameT3())) {
                tmp.setReferringPhysiciansNameV2(obj.getJSONObject(_tmp.getReferringPhysiciansNameT0())
                        .getJSONArray(_tmp.getReferringPhysiciansNameT2()).getJSONObject(0)
                        .getString(_tmp.getReferringPhysiciansNameT3()));
            }



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

            if (myArray.getJSONObject(i).has(_tmp.getPregnancyStatusT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getPregnancyStatusT0()).has(_tmp.getPregnancyStatusT2())) {
                tmp.setPregnancyStatusV2(obj.getJSONObject(_tmp.getPregnancyStatusT0())
                        .getJSONArray(_tmp.getPregnancyStatusT2()).getString(0));
            }



            if (myArray.getJSONObject(i).getJSONObject(_tmp.getStudyInstanceUIDT0()).has(_tmp.getStudyInstanceUIDT2())) {
                tmp.setStudyInstanceUIDV2(obj.getJSONObject(_tmp.getStudyInstanceUIDT0())
                        .getJSONArray(_tmp.getStudyInstanceUIDT2()).getString(0));
            }

            //iki asamali parse

            if (myArray.getJSONObject(i).has(_tmp.getRequestingPhysicianT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getRequestingPhysicianT0()).has(_tmp.getRequestingPhysicianT2())) {
                tmp.setRequestingPhysicianV2(obj.getJSONObject(_tmp.getRequestingPhysicianT0())
                        .getJSONArray(_tmp.getRequestingPhysicianT2()).getJSONObject(0)
                        .getString(_tmp.getRequestingPhysicianT3()));
            }



            if (myArray.getJSONObject(i).has(_tmp.getRequestedProcedureDescriptionT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getRequestedProcedureDescriptionT0()).has(_tmp.getRequestedProcedureDescriptionT2())) {
                tmp.setRequestedProcedureDescriptionV2(obj.getJSONObject(_tmp.getRequestedProcedureDescriptionT0())
                        .getJSONArray(_tmp.getRequestedProcedureDescriptionT2()).getString(0));
            }



            if (myArray.getJSONObject(i).has(_tmp.getAdmissionIDT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getAdmissionIDT0()).has(_tmp.getAdmissionIDT2())) {
                tmp.setAdmissionIDV2(obj.getJSONObject(_tmp.getAdmissionIDT0())
                        .getJSONArray(_tmp.getAdmissionIDT2()).getString(0));
            }



            //uc asamali parse
            if (myArray.getJSONObject(i).has(_tmp.getScheduledProcedureStepSequenceT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).has(_tmp.getScheduledProcedureStepSequenceT3()) && myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepSequenceT3()).has(_tmp.getScheduledProcedureStepSequenceT2())) {
                tmp.setScheduledProcedureStepSequenceV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepSequenceT3()).
                        getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getString(0));
            }



            //yukaridaki 00400100 sorgunun alt dugumleri...**************************************************************************************************************************************************************************
            if (myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledStationAETitleT0()).has(_tmp.getScheduledStationAETitleT2())) {
                tmp.setScheduledStationAETitleV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledStationAETitleT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getString(0));

            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepStartDateT0()).has(_tmp.getScheduledProcedureStepStartDateT2())) {
                tmp.setScheduledProcedureStepStartDateV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepStartDateT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getString(0));

            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepStartTimeT0()).has(_tmp.getScheduledProcedureStepStartTimeT2())) {
                tmp.setScheduledProcedureStepStartTimeV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepStartTimeT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getString(0));

            }

            if (myArray.getJSONObject(i).has(_tmp.getScheduledProcedureStepSequenceT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).has(_tmp.getScheduledProcedureStepSequenceT3()) && myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProtocolCodeSequenceT0()).has(_tmp.getScheduledProtocolCodeSequenceT2())) {
                tmp.setScheduledProtocolCodeSequenceV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProtocolCodeSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getString(0));

            }



            if (myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepIDT0()).has(_tmp.getScheduledProcedureStepIDT2())) {
                tmp.setScheduledProcedureStepIDV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepIDT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepIDT2()).getString(0));

            }

            if (myArray.getJSONObject(i).has(_tmp.getScheduledProcedureStepSequenceT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).has(_tmp.getScheduledProcedureStepSequenceT3()) && myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledStationNameT0()).has(_tmp.getScheduledStationNameT2())) {
                tmp.setScheduledStationNameV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledStationNameT0())
                        .getJSONArray(_tmp.getScheduledStationNameT2()).getString(0));

            }



            if (myArray.getJSONObject(i).getJSONObject(_tmp.getScheduledProcedureStepSequenceT0()).getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepStatusT0()).has(_tmp.getScheduledProcedureStepStatusT2())) {
                tmp.setScheduledProcedureStepStatusV2(obj.getJSONObject(_tmp.getScheduledProcedureStepSequenceT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepSequenceT2()).getJSONObject(0).getJSONObject(_tmp.getScheduledProcedureStepStatusT0())
                        .getJSONArray(_tmp.getScheduledProcedureStepStatusT2()).getString(0));

            }

            if (myArray.getJSONObject(i).getJSONObject(_tmp.getRequestedProcedureIDT0()).has(_tmp.getRequestedProcedureIDT2())) {
                tmp.setRequestedProcedureIDV2(obj.getJSONObject(_tmp.getRequestedProcedureIDT0())
                        .getJSONArray(_tmp.getRequestedProcedureIDT2()).getString(0));
            }


            if (myArray.getJSONObject(i).has(_tmp.getRequestedProcedurePriorityT0()) && myArray.getJSONObject(i).getJSONObject(_tmp.getRequestedProcedurePriorityT0()).has(_tmp.getRequestedProcedurePriorityT2())) {
                tmp.setRequestedProcedurePriorityV2(obj.getJSONObject(_tmp.getRequestedProcedurePriorityT0())
                        .getJSONArray(_tmp.getRequestedProcedurePriorityT2()).getString(0));
            }

            //TODO add other if &and& controls


            list.add(tmp);
        }

        return list;
    }
}
