package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

public class MwlData {

    //00080005
    JSONObject SpecificCharacterSetO = new JSONObject();
    String SpecificCharacterSetT0= "00080005";
    String SpecificCharacterSetT1= "vr";
    String SpecificCharacterSetT2= "Value";
    String SpecificCharacterSetV1;
    String SpecificCharacterSetV2;

    //00080050
    JSONObject AccessionNumberO = new JSONObject();
    String AccessionNumberT0= "00080050";
    String AccessionNumberT1= "vr";
    String AccessionNumberT2= "Value";
    String AccessionNumberV1;
    String AccessionNumberV2;

    //00080090
    JSONObject ReferringPhysiciansNameO = new JSONObject();
    String ReferringPhysiciansNameT0= "00080090";
    String ReferringPhysiciansNameT1= "vr";
    String ReferringPhysiciansNameT2= "Value";
    String ReferringPhysiciansNameT3= "Alphabetic";
    String ReferringPhysiciansNameV1;
    String ReferringPhysiciansNameV2;

    //00081190
    JSONObject RetrieveURLO = new JSONObject();
    String RetrieveURLT0= "00081190";
    String RetrieveURLT1= "vr";
    String RetrieveURLT2= "Value";
    String RetrieveURLV1;
    String RetrieveURLV2;

    //00100010
    JSONObject PatientsNameO = new JSONObject();
    String PatientsNameT0= "00100010";
    String PatientsNameT1= "vr";
    String PatientsNameT2= "Value";
    String PatientsNameT3= "Alphabetic";
    String PatientsNameV1;
    String PatientsNameV2;

    //00100020
    JSONObject PatientsIDO = new JSONObject();
    String PatientsIDT0= "00100020";
    String PatientsIDT1= "vr";
    String PatientsIDT2= "Value";
    String PatientsIDV1;
    String PatientsIDV2;

    //00100030
    JSONObject PatientsBirthDateO = new JSONObject();
    String PatientsBirthDateT0= "00100030";
    String PatientsBirthDateT1= "vr";
    String PatientsBirthDateT2= "Value";

    public JSONObject getSpecificCharacterSetO() {
        return SpecificCharacterSetO;
    }

    public void setSpecificCharacterSetO(JSONObject specificCharacterSetO) {
        SpecificCharacterSetO = specificCharacterSetO;
    }

    public String getSpecificCharacterSetT0() {
        return SpecificCharacterSetT0;
    }

    public void setSpecificCharacterSetT0(String specificCharacterSetT0) {
        SpecificCharacterSetT0 = specificCharacterSetT0;
    }

    public String getSpecificCharacterSetT1() {
        return SpecificCharacterSetT1;
    }

    public void setSpecificCharacterSetT1(String specificCharacterSetT1) {
        SpecificCharacterSetT1 = specificCharacterSetT1;
    }

    public String getSpecificCharacterSetT2() {
        return SpecificCharacterSetT2;
    }

    public void setSpecificCharacterSetT2(String specificCharacterSetT2) {
        SpecificCharacterSetT2 = specificCharacterSetT2;
    }

    public String getSpecificCharacterSetV1() {
        return SpecificCharacterSetV1;
    }

    public void setSpecificCharacterSetV1(String specificCharacterSetV1) {
        SpecificCharacterSetV1 = specificCharacterSetV1;
    }

    public String getSpecificCharacterSetV2() {
        return SpecificCharacterSetV2;
    }

    public void setSpecificCharacterSetV2(String specificCharacterSetV2) {
        SpecificCharacterSetV2 = specificCharacterSetV2;
    }

    public JSONObject getAccessionNumberO() {
        return AccessionNumberO;
    }

    public void setAccessionNumberO(JSONObject accessionNumberO) {
        AccessionNumberO = accessionNumberO;
    }

    public String getAccessionNumberT0() {
        return AccessionNumberT0;
    }

    public void setAccessionNumberT0(String accessionNumberT0) {
        AccessionNumberT0 = accessionNumberT0;
    }

    public String getAccessionNumberT1() {
        return AccessionNumberT1;
    }

    public void setAccessionNumberT1(String accessionNumberT1) {
        AccessionNumberT1 = accessionNumberT1;
    }

    public String getAccessionNumberT2() {
        return AccessionNumberT2;
    }

    public void setAccessionNumberT2(String accessionNumberT2) {
        AccessionNumberT2 = accessionNumberT2;
    }

    public String getAccessionNumberV1() {
        return AccessionNumberV1;
    }

    public void setAccessionNumberV1(String accessionNumberV1) {
        AccessionNumberV1 = accessionNumberV1;
    }

    public String getAccessionNumberV2() {
        return AccessionNumberV2;
    }

    public void setAccessionNumberV2(String accessionNumberV2) {
        AccessionNumberV2 = accessionNumberV2;
    }

    public JSONObject getReferringPhysiciansNameO() {
        return ReferringPhysiciansNameO;
    }

    public void setReferringPhysiciansNameO(JSONObject referringPhysiciansNameO) {
        ReferringPhysiciansNameO = referringPhysiciansNameO;
    }

    public String getReferringPhysiciansNameT0() {
        return ReferringPhysiciansNameT0;
    }

    public void setReferringPhysiciansNameT0(String referringPhysiciansNameT0) {
        ReferringPhysiciansNameT0 = referringPhysiciansNameT0;
    }

    public String getReferringPhysiciansNameT1() {
        return ReferringPhysiciansNameT1;
    }

    public void setReferringPhysiciansNameT1(String referringPhysiciansNameT1) {
        ReferringPhysiciansNameT1 = referringPhysiciansNameT1;
    }

    public String getReferringPhysiciansNameT2() {
        return ReferringPhysiciansNameT2;
    }

    public void setReferringPhysiciansNameT2(String referringPhysiciansNameT2) {
        ReferringPhysiciansNameT2 = referringPhysiciansNameT2;
    }

    public String getReferringPhysiciansNameT3() {
        return ReferringPhysiciansNameT3;
    }

    public void setReferringPhysiciansNameT3(String referringPhysiciansNameT3) {
        ReferringPhysiciansNameT3 = referringPhysiciansNameT3;
    }

    public String getReferringPhysiciansNameV1() {
        return ReferringPhysiciansNameV1;
    }

    public void setReferringPhysiciansNameV1(String referringPhysiciansNameV1) {
        ReferringPhysiciansNameV1 = referringPhysiciansNameV1;
    }

    public String getReferringPhysiciansNameV2() {
        return ReferringPhysiciansNameV2;
    }

    public void setReferringPhysiciansNameV2(String referringPhysiciansNameV2) {
        ReferringPhysiciansNameV2 = referringPhysiciansNameV2;
    }

    public JSONObject getRetrieveURLO() {
        return RetrieveURLO;
    }

    public void setRetrieveURLO(JSONObject retrieveURLO) {
        RetrieveURLO = retrieveURLO;
    }

    public String getRetrieveURLT0() {
        return RetrieveURLT0;
    }

    public void setRetrieveURLT0(String retrieveURLT0) {
        RetrieveURLT0 = retrieveURLT0;
    }

    public String getRetrieveURLT1() {
        return RetrieveURLT1;
    }

    public void setRetrieveURLT1(String retrieveURLT1) {
        RetrieveURLT1 = retrieveURLT1;
    }

    public String getRetrieveURLT2() {
        return RetrieveURLT2;
    }

    public void setRetrieveURLT2(String retrieveURLT2) {
        RetrieveURLT2 = retrieveURLT2;
    }

    public String getRetrieveURLV1() {
        return RetrieveURLV1;
    }

    public void setRetrieveURLV1(String retrieveURLV1) {
        RetrieveURLV1 = retrieveURLV1;
    }

    public String getRetrieveURLV2() {
        return RetrieveURLV2;
    }

    public void setRetrieveURLV2(String retrieveURLV2) {
        RetrieveURLV2 = retrieveURLV2;
    }

    public JSONObject getPatientsNameO() {
        return PatientsNameO;
    }

    public void setPatientsNameO(JSONObject patientsNameO) {
        PatientsNameO = patientsNameO;
    }

    public String getPatientsNameT0() {
        return PatientsNameT0;
    }

    public void setPatientsNameT0(String patientsNameT0) {
        PatientsNameT0 = patientsNameT0;
    }

    public String getPatientsNameT1() {
        return PatientsNameT1;
    }

    public void setPatientsNameT1(String patientsNameT1) {
        PatientsNameT1 = patientsNameT1;
    }

    public String getPatientsNameT2() {
        return PatientsNameT2;
    }

    public void setPatientsNameT2(String patientsNameT2) {
        PatientsNameT2 = patientsNameT2;
    }

    public String getPatientsNameT3() {
        return PatientsNameT3;
    }

    public void setPatientsNameT3(String patientsNameT3) {
        PatientsNameT3 = patientsNameT3;
    }

    public String getPatientsNameV1() {
        return PatientsNameV1;
    }

    public void setPatientsNameV1(String patientsNameV1) {
        PatientsNameV1 = patientsNameV1;
    }

    public String getPatientsNameV2() {
        return PatientsNameV2;
    }

    public void setPatientsNameV2(String patientsNameV2) {
        PatientsNameV2 = patientsNameV2;
    }

    public JSONObject getPatientsIDO() {
        return PatientsIDO;
    }

    public void setPatientsIDO(JSONObject patientsIDO) {
        PatientsIDO = patientsIDO;
    }

    public String getPatientsIDT0() {
        return PatientsIDT0;
    }

    public void setPatientsIDT0(String patientsIDT0) {
        PatientsIDT0 = patientsIDT0;
    }

    public String getPatientsIDT1() {
        return PatientsIDT1;
    }

    public void setPatientsIDT1(String patientsIDT1) {
        PatientsIDT1 = patientsIDT1;
    }

    public String getPatientsIDT2() {
        return PatientsIDT2;
    }

    public void setPatientsIDT2(String patientsIDT2) {
        PatientsIDT2 = patientsIDT2;
    }

    public String getPatientsIDV1() {
        return PatientsIDV1;
    }

    public void setPatientsIDV1(String patientsIDV1) {
        PatientsIDV1 = patientsIDV1;
    }

    public String getPatientsIDV2() {
        return PatientsIDV2;
    }

    public void setPatientsIDV2(String patientsIDV2) {
        PatientsIDV2 = patientsIDV2;
    }

    public JSONObject getPatientsBirthDateO() {
        return PatientsBirthDateO;
    }

    public void setPatientsBirthDateO(JSONObject patientsBirthDateO) {
        PatientsBirthDateO = patientsBirthDateO;
    }

    public String getPatientsBirthDateT0() {
        return PatientsBirthDateT0;
    }

    public void setPatientsBirthDateT0(String patientsBirthDateT0) {
        PatientsBirthDateT0 = patientsBirthDateT0;
    }

    public String getPatientsBirthDateT1() {
        return PatientsBirthDateT1;
    }

    public void setPatientsBirthDateT1(String patientsBirthDateT1) {
        PatientsBirthDateT1 = patientsBirthDateT1;
    }

    public String getPatientsBirthDateT2() {
        return PatientsBirthDateT2;
    }

    public void setPatientsBirthDateT2(String patientsBirthDateT2) {
        PatientsBirthDateT2 = patientsBirthDateT2;
    }

    public String getPatientsBirthDateV1() {
        return PatientsBirthDateV1;
    }

    public void setPatientsBirthDateV1(String patientsBirthDateV1) {
        PatientsBirthDateV1 = patientsBirthDateV1;
    }

    public String getPatientsBirthDateV2() {
        return PatientsBirthDateV2;
    }

    public void setPatientsBirthDateV2(String patientsBirthDateV2) {
        PatientsBirthDateV2 = patientsBirthDateV2;
    }

    public JSONObject getPatientsSexO() {
        return PatientsSexO;
    }

    public void setPatientsSexO(JSONObject patientsSexO) {
        PatientsSexO = patientsSexO;
    }

    public String getPatientsSexT0() {
        return PatientsSexT0;
    }

    public void setPatientsSexT0(String patientsSexT0) {
        PatientsSexT0 = patientsSexT0;
    }

    public String getPatientsSexT1() {
        return PatientsSexT1;
    }

    public void setPatientsSexT1(String patientsSexT1) {
        PatientsSexT1 = patientsSexT1;
    }

    public String getPatientsSexT2() {
        return PatientsSexT2;
    }

    public void setPatientsSexT2(String patientsSexT2) {
        PatientsSexT2 = patientsSexT2;
    }

    public String getPatientsSexV1() {
        return PatientsSexV1;
    }

    public void setPatientsSexV1(String patientsSexV1) {
        PatientsSexV1 = patientsSexV1;
    }

    public String getPatientsSexV2() {
        return PatientsSexV2;
    }

    public void setPatientsSexV2(String patientsSexV2) {
        PatientsSexV2 = patientsSexV2;
    }

    public JSONObject getPregnancyStatusO() {
        return PregnancyStatusO;
    }

    public void setPregnancyStatusO(JSONObject pregnancyStatusO) {
        PregnancyStatusO = pregnancyStatusO;
    }

    public String getPregnancyStatusT0() {
        return PregnancyStatusT0;
    }

    public void setPregnancyStatusT0(String pregnancyStatusT0) {
        PregnancyStatusT0 = pregnancyStatusT0;
    }

    public String getPregnancyStatusT1() {
        return PregnancyStatusT1;
    }

    public void setPregnancyStatusT1(String pregnancyStatusT1) {
        PregnancyStatusT1 = pregnancyStatusT1;
    }

    public String getPregnancyStatusT2() {
        return PregnancyStatusT2;
    }

    public void setPregnancyStatusT2(String pregnancyStatusT2) {
        PregnancyStatusT2 = pregnancyStatusT2;
    }

    public String getPregnancyStatusV1() {
        return PregnancyStatusV1;
    }

    public void setPregnancyStatusV1(String pregnancyStatusV1) {
        PregnancyStatusV1 = pregnancyStatusV1;
    }

    public String getPregnancyStatusV2() {
        return PregnancyStatusV2;
    }

    public void setPregnancyStatusV2(String pregnancyStatusV2) {
        PregnancyStatusV2 = pregnancyStatusV2;
    }

    public JSONObject getStudyInstanceUIDO() {
        return StudyInstanceUIDO;
    }

    public void setStudyInstanceUIDO(JSONObject studyInstanceUIDO) {
        StudyInstanceUIDO = studyInstanceUIDO;
    }

    public String getStudyInstanceUIDT0() {
        return StudyInstanceUIDT0;
    }

    public void setStudyInstanceUIDT0(String studyInstanceUIDT0) {
        StudyInstanceUIDT0 = studyInstanceUIDT0;
    }

    public String getStudyInstanceUIDT1() {
        return StudyInstanceUIDT1;
    }

    public void setStudyInstanceUIDT1(String studyInstanceUIDT1) {
        StudyInstanceUIDT1 = studyInstanceUIDT1;
    }

    public String getStudyInstanceUIDT2() {
        return StudyInstanceUIDT2;
    }

    public void setStudyInstanceUIDT2(String studyInstanceUIDT2) {
        StudyInstanceUIDT2 = studyInstanceUIDT2;
    }

    public String getStudyInstanceUIDV1() {
        return StudyInstanceUIDV1;
    }

    public void setStudyInstanceUIDV1(String studyInstanceUIDV1) {
        StudyInstanceUIDV1 = studyInstanceUIDV1;
    }

    public String getStudyInstanceUIDV2() {
        return StudyInstanceUIDV2;
    }

    public void setStudyInstanceUIDV2(String studyInstanceUIDV2) {
        StudyInstanceUIDV2 = studyInstanceUIDV2;
    }

    public JSONObject getRequestingPhysicianO() {
        return RequestingPhysicianO;
    }

    public void setRequestingPhysicianO(JSONObject requestingPhysicianO) {
        RequestingPhysicianO = requestingPhysicianO;
    }

    public String getRequestingPhysicianT0() {
        return RequestingPhysicianT0;
    }

    public void setRequestingPhysicianT0(String requestingPhysicianT0) {
        RequestingPhysicianT0 = requestingPhysicianT0;
    }

    public String getRequestingPhysicianT1() {
        return RequestingPhysicianT1;
    }

    public void setRequestingPhysicianT1(String requestingPhysicianT1) {
        RequestingPhysicianT1 = requestingPhysicianT1;
    }

    public String getRequestingPhysicianT2() {
        return RequestingPhysicianT2;
    }

    public void setRequestingPhysicianT2(String requestingPhysicianT2) {
        RequestingPhysicianT2 = requestingPhysicianT2;
    }

    public String getRequestingPhysicianT3() {
        return RequestingPhysicianT3;
    }

    public void setRequestingPhysicianT3(String requestingPhysicianT3) {
        RequestingPhysicianT3 = requestingPhysicianT3;
    }

    public String getRequestingPhysicianV1() {
        return RequestingPhysicianV1;
    }

    public void setRequestingPhysicianV1(String requestingPhysicianV1) {
        RequestingPhysicianV1 = requestingPhysicianV1;
    }

    public String getRequestingPhysicianV2() {
        return RequestingPhysicianV2;
    }

    public void setRequestingPhysicianV2(String requestingPhysicianV2) {
        RequestingPhysicianV2 = requestingPhysicianV2;
    }

    public JSONObject getRequestedProcedureDescriptionO() {
        return RequestedProcedureDescriptionO;
    }

    public void setRequestedProcedureDescriptionO(JSONObject requestedProcedureDescriptionO) {
        RequestedProcedureDescriptionO = requestedProcedureDescriptionO;
    }

    public String getRequestedProcedureDescriptionT0() {
        return RequestedProcedureDescriptionT0;
    }

    public void setRequestedProcedureDescriptionT0(String requestedProcedureDescriptionT0) {
        RequestedProcedureDescriptionT0 = requestedProcedureDescriptionT0;
    }

    public String getRequestedProcedureDescriptionT1() {
        return RequestedProcedureDescriptionT1;
    }

    public void setRequestedProcedureDescriptionT1(String requestedProcedureDescriptionT1) {
        RequestedProcedureDescriptionT1 = requestedProcedureDescriptionT1;
    }

    public String getRequestedProcedureDescriptionT2() {
        return RequestedProcedureDescriptionT2;
    }

    public void setRequestedProcedureDescriptionT2(String requestedProcedureDescriptionT2) {
        RequestedProcedureDescriptionT2 = requestedProcedureDescriptionT2;
    }

    public String getRequestedProcedureDescriptionV1() {
        return RequestedProcedureDescriptionV1;
    }

    public void setRequestedProcedureDescriptionV1(String requestedProcedureDescriptionV1) {
        RequestedProcedureDescriptionV1 = requestedProcedureDescriptionV1;
    }

    public String getRequestedProcedureDescriptionV2() {
        return RequestedProcedureDescriptionV2;
    }

    public void setRequestedProcedureDescriptionV2(String requestedProcedureDescriptionV2) {
        RequestedProcedureDescriptionV2 = requestedProcedureDescriptionV2;
    }

    public JSONObject getAdmissionIDO() {
        return AdmissionIDO;
    }

    public void setAdmissionIDO(JSONObject admissionIDO) {
        AdmissionIDO = admissionIDO;
    }

    public String getAdmissionIDT0() {
        return AdmissionIDT0;
    }

    public void setAdmissionIDT0(String admissionIDT0) {
        AdmissionIDT0 = admissionIDT0;
    }

    public String getAdmissionIDT1() {
        return AdmissionIDT1;
    }

    public void setAdmissionIDT1(String admissionIDT1) {
        AdmissionIDT1 = admissionIDT1;
    }

    public String getAdmissionIDT2() {
        return AdmissionIDT2;
    }

    public void setAdmissionIDT2(String admissionIDT2) {
        AdmissionIDT2 = admissionIDT2;
    }

    public String getAdmissionIDV1() {
        return AdmissionIDV1;
    }

    public void setAdmissionIDV1(String admissionIDV1) {
        AdmissionIDV1 = admissionIDV1;
    }

    public String getAdmissionIDV2() {
        return AdmissionIDV2;
    }

    public void setAdmissionIDV2(String admissionIDV2) {
        AdmissionIDV2 = admissionIDV2;
    }

    public JSONObject getScheduledProcedureStepSequenceO() {
        return ScheduledProcedureStepSequenceO;
    }

    public void setScheduledProcedureStepSequenceO(JSONObject scheduledProcedureStepSequenceO) {
        ScheduledProcedureStepSequenceO = scheduledProcedureStepSequenceO;
    }

    public String getScheduledProcedureStepSequenceT0() {
        return ScheduledProcedureStepSequenceT0;
    }

    public void setScheduledProcedureStepSequenceT0(String scheduledProcedureStepSequenceT0) {
        ScheduledProcedureStepSequenceT0 = scheduledProcedureStepSequenceT0;
    }

    public String getScheduledProcedureStepSequenceT1() {
        return ScheduledProcedureStepSequenceT1;
    }

    public void setScheduledProcedureStepSequenceT1(String scheduledProcedureStepSequenceT1) {
        ScheduledProcedureStepSequenceT1 = scheduledProcedureStepSequenceT1;
    }

    public String getScheduledProcedureStepSequenceT2() {
        return ScheduledProcedureStepSequenceT2;
    }

    public void setScheduledProcedureStepSequenceT2(String scheduledProcedureStepSequenceT2) {
        ScheduledProcedureStepSequenceT2 = scheduledProcedureStepSequenceT2;
    }

    public String getScheduledProcedureStepSequenceT3() {
        return ScheduledProcedureStepSequenceT3;
    }

    public void setScheduledProcedureStepSequenceT3(String scheduledProcedureStepSequenceT3) {
        ScheduledProcedureStepSequenceT3 = scheduledProcedureStepSequenceT3;
    }

    public String getScheduledProcedureStepSequenceV1() {
        return ScheduledProcedureStepSequenceV1;
    }

    public void setScheduledProcedureStepSequenceV1(String scheduledProcedureStepSequenceV1) {
        ScheduledProcedureStepSequenceV1 = scheduledProcedureStepSequenceV1;
    }

    public String getScheduledProcedureStepSequenceV2() {
        return ScheduledProcedureStepSequenceV2;
    }

    public void setScheduledProcedureStepSequenceV2(String scheduledProcedureStepSequenceV2) {
        ScheduledProcedureStepSequenceV2 = scheduledProcedureStepSequenceV2;
    }

    public JSONObject getScheduledStationAETitleO() {
        return ScheduledStationAETitleO;
    }

    public void setScheduledStationAETitleO(JSONObject scheduledStationAETitleO) {
        ScheduledStationAETitleO = scheduledStationAETitleO;
    }

    public String getScheduledStationAETitleT0() {
        return ScheduledStationAETitleT0;
    }

    public void setScheduledStationAETitleT0(String scheduledStationAETitleT0) {
        ScheduledStationAETitleT0 = scheduledStationAETitleT0;
    }

    public String getScheduledStationAETitleT1() {
        return ScheduledStationAETitleT1;
    }

    public void setScheduledStationAETitleT1(String scheduledStationAETitleT1) {
        ScheduledStationAETitleT1 = scheduledStationAETitleT1;
    }

    public String getScheduledStationAETitleT2() {
        return ScheduledStationAETitleT2;
    }

    public void setScheduledStationAETitleT2(String scheduledStationAETitleT2) {
        ScheduledStationAETitleT2 = scheduledStationAETitleT2;
    }

    public String getScheduledStationAETitleV1() {
        return ScheduledStationAETitleV1;
    }

    public void setScheduledStationAETitleV1(String scheduledStationAETitleV1) {
        ScheduledStationAETitleV1 = scheduledStationAETitleV1;
    }

    public String getScheduledStationAETitleV2() {
        return ScheduledStationAETitleV2;
    }

    public void setScheduledStationAETitleV2(String scheduledStationAETitleV2) {
        ScheduledStationAETitleV2 = scheduledStationAETitleV2;
    }

    public JSONObject getScheduledProcedureStepStartDateO() {
        return ScheduledProcedureStepStartDateO;
    }

    public void setScheduledProcedureStepStartDateO(JSONObject scheduledProcedureStepStartDateO) {
        ScheduledProcedureStepStartDateO = scheduledProcedureStepStartDateO;
    }

    public String getScheduledProcedureStepStartDateT0() {
        return ScheduledProcedureStepStartDateT0;
    }

    public void setScheduledProcedureStepStartDateT0(String scheduledProcedureStepStartDateT0) {
        ScheduledProcedureStepStartDateT0 = scheduledProcedureStepStartDateT0;
    }

    public String getScheduledProcedureStepStartDateT1() {
        return ScheduledProcedureStepStartDateT1;
    }

    public void setScheduledProcedureStepStartDateT1(String scheduledProcedureStepStartDateT1) {
        ScheduledProcedureStepStartDateT1 = scheduledProcedureStepStartDateT1;
    }

    public String getScheduledProcedureStepStartDateT2() {
        return ScheduledProcedureStepStartDateT2;
    }

    public void setScheduledProcedureStepStartDateT2(String scheduledProcedureStepStartDateT2) {
        ScheduledProcedureStepStartDateT2 = scheduledProcedureStepStartDateT2;
    }

    public String getScheduledProcedureStepStartDateV1() {
        return ScheduledProcedureStepStartDateV1;
    }

    public void setScheduledProcedureStepStartDateV1(String scheduledProcedureStepStartDateV1) {
        ScheduledProcedureStepStartDateV1 = scheduledProcedureStepStartDateV1;
    }

    public String getScheduledProcedureStepStartDateV2() {
        return ScheduledProcedureStepStartDateV2;
    }

    public void setScheduledProcedureStepStartDateV2(String scheduledProcedureStepStartDateV2) {
        ScheduledProcedureStepStartDateV2 = scheduledProcedureStepStartDateV2;
    }

    public JSONObject getScheduledProcedureStepStartTimeO() {
        return ScheduledProcedureStepStartTimeO;
    }

    public void setScheduledProcedureStepStartTimeO(JSONObject scheduledProcedureStepStartTimeO) {
        ScheduledProcedureStepStartTimeO = scheduledProcedureStepStartTimeO;
    }

    public String getScheduledProcedureStepStartTimeT0() {
        return ScheduledProcedureStepStartTimeT0;
    }

    public void setScheduledProcedureStepStartTimeT0(String scheduledProcedureStepStartTimeT0) {
        ScheduledProcedureStepStartTimeT0 = scheduledProcedureStepStartTimeT0;
    }

    public String getScheduledProcedureStepStartTimeT1() {
        return ScheduledProcedureStepStartTimeT1;
    }

    public void setScheduledProcedureStepStartTimeT1(String scheduledProcedureStepStartTimeT1) {
        ScheduledProcedureStepStartTimeT1 = scheduledProcedureStepStartTimeT1;
    }

    public String getScheduledProcedureStepStartTimeT2() {
        return ScheduledProcedureStepStartTimeT2;
    }

    public void setScheduledProcedureStepStartTimeT2(String scheduledProcedureStepStartTimeT2) {
        ScheduledProcedureStepStartTimeT2 = scheduledProcedureStepStartTimeT2;
    }

    public String getScheduledProcedureStepStartTimeV1() {
        return ScheduledProcedureStepStartTimeV1;
    }

    public void setScheduledProcedureStepStartTimeV1(String scheduledProcedureStepStartTimeV1) {
        ScheduledProcedureStepStartTimeV1 = scheduledProcedureStepStartTimeV1;
    }

    public String getScheduledProcedureStepStartTimeV2() {
        return ScheduledProcedureStepStartTimeV2;
    }

    public void setScheduledProcedureStepStartTimeV2(String scheduledProcedureStepStartTimeV2) {
        ScheduledProcedureStepStartTimeV2 = scheduledProcedureStepStartTimeV2;
    }

    public JSONObject getScheduledProtocolCodeSequenceO() {
        return ScheduledProtocolCodeSequenceO;
    }

    public void setScheduledProtocolCodeSequenceO(JSONObject scheduledProtocolCodeSequenceO) {
        ScheduledProtocolCodeSequenceO = scheduledProtocolCodeSequenceO;
    }

    public String getScheduledProtocolCodeSequenceT0() {
        return ScheduledProtocolCodeSequenceT0;
    }

    public void setScheduledProtocolCodeSequenceT0(String scheduledProtocolCodeSequenceT0) {
        ScheduledProtocolCodeSequenceT0 = scheduledProtocolCodeSequenceT0;
    }

    public String getScheduledProtocolCodeSequenceT1() {
        return ScheduledProtocolCodeSequenceT1;
    }

    public void setScheduledProtocolCodeSequenceT1(String scheduledProtocolCodeSequenceT1) {
        ScheduledProtocolCodeSequenceT1 = scheduledProtocolCodeSequenceT1;
    }

    public String getScheduledProtocolCodeSequenceT2() {
        return ScheduledProtocolCodeSequenceT2;
    }

    public void setScheduledProtocolCodeSequenceT2(String scheduledProtocolCodeSequenceT2) {
        ScheduledProtocolCodeSequenceT2 = scheduledProtocolCodeSequenceT2;
    }

    public String getScheduledProtocolCodeSequenceV1() {
        return ScheduledProtocolCodeSequenceV1;
    }

    public void setScheduledProtocolCodeSequenceV1(String scheduledProtocolCodeSequenceV1) {
        ScheduledProtocolCodeSequenceV1 = scheduledProtocolCodeSequenceV1;
    }

    public String getScheduledProtocolCodeSequenceV2() {
        return ScheduledProtocolCodeSequenceV2;
    }

    public void setScheduledProtocolCodeSequenceV2(String scheduledProtocolCodeSequenceV2) {
        ScheduledProtocolCodeSequenceV2 = scheduledProtocolCodeSequenceV2;
    }

    public JSONObject getScheduledProcedureStepIDO() {
        return ScheduledProcedureStepIDO;
    }

    public void setScheduledProcedureStepIDO(JSONObject scheduledProcedureStepIDO) {
        ScheduledProcedureStepIDO = scheduledProcedureStepIDO;
    }

    public String getScheduledProcedureStepIDT0() {
        return ScheduledProcedureStepIDT0;
    }

    public void setScheduledProcedureStepIDT0(String scheduledProcedureStepIDT0) {
        ScheduledProcedureStepIDT0 = scheduledProcedureStepIDT0;
    }

    public String getScheduledProcedureStepIDT1() {
        return ScheduledProcedureStepIDT1;
    }

    public void setScheduledProcedureStepIDT1(String scheduledProcedureStepIDT1) {
        ScheduledProcedureStepIDT1 = scheduledProcedureStepIDT1;
    }

    public String getScheduledProcedureStepIDT2() {
        return ScheduledProcedureStepIDT2;
    }

    public void setScheduledProcedureStepIDT2(String scheduledProcedureStepIDT2) {
        ScheduledProcedureStepIDT2 = scheduledProcedureStepIDT2;
    }

    public String getScheduledProcedureStepIDV1() {
        return ScheduledProcedureStepIDV1;
    }

    public void setScheduledProcedureStepIDV1(String scheduledProcedureStepIDV1) {
        ScheduledProcedureStepIDV1 = scheduledProcedureStepIDV1;
    }

    public String getScheduledProcedureStepIDV2() {
        return ScheduledProcedureStepIDV2;
    }

    public void setScheduledProcedureStepIDV2(String scheduledProcedureStepIDV2) {
        ScheduledProcedureStepIDV2 = scheduledProcedureStepIDV2;
    }

    public JSONObject getScheduledStationNameO() {
        return ScheduledStationNameO;
    }

    public void setScheduledStationNameO(JSONObject scheduledStationNameO) {
        ScheduledStationNameO = scheduledStationNameO;
    }

    public String getScheduledStationNameT0() {
        return ScheduledStationNameT0;
    }

    public void setScheduledStationNameT0(String scheduledStationNameT0) {
        ScheduledStationNameT0 = scheduledStationNameT0;
    }

    public String getScheduledStationNameT1() {
        return ScheduledStationNameT1;
    }

    public void setScheduledStationNameT1(String scheduledStationNameT1) {
        ScheduledStationNameT1 = scheduledStationNameT1;
    }

    public String getScheduledStationNameT2() {
        return ScheduledStationNameT2;
    }

    public void setScheduledStationNameT2(String scheduledStationNameT2) {
        ScheduledStationNameT2 = scheduledStationNameT2;
    }

    public String getScheduledStationNameV1() {
        return ScheduledStationNameV1;
    }

    public void setScheduledStationNameV1(String scheduledStationNameV1) {
        ScheduledStationNameV1 = scheduledStationNameV1;
    }

    public String getScheduledStationNameV2() {
        return ScheduledStationNameV2;
    }

    public void setScheduledStationNameV2(String scheduledStationNameV2) {
        ScheduledStationNameV2 = scheduledStationNameV2;
    }

    public JSONObject getScheduledProcedureStepStatusO() {
        return ScheduledProcedureStepStatusO;
    }

    public void setScheduledProcedureStepStatusO(JSONObject scheduledProcedureStepStatusO) {
        ScheduledProcedureStepStatusO = scheduledProcedureStepStatusO;
    }

    public String getScheduledProcedureStepStatusT0() {
        return ScheduledProcedureStepStatusT0;
    }

    public void setScheduledProcedureStepStatusT0(String scheduledProcedureStepStatusT0) {
        ScheduledProcedureStepStatusT0 = scheduledProcedureStepStatusT0;
    }

    public String getScheduledProcedureStepStatusT1() {
        return ScheduledProcedureStepStatusT1;
    }

    public void setScheduledProcedureStepStatusT1(String scheduledProcedureStepStatusT1) {
        ScheduledProcedureStepStatusT1 = scheduledProcedureStepStatusT1;
    }

    public String getScheduledProcedureStepStatusT2() {
        return ScheduledProcedureStepStatusT2;
    }

    public void setScheduledProcedureStepStatusT2(String scheduledProcedureStepStatusT2) {
        ScheduledProcedureStepStatusT2 = scheduledProcedureStepStatusT2;
    }

    public String getScheduledProcedureStepStatusV1() {
        return ScheduledProcedureStepStatusV1;
    }

    public void setScheduledProcedureStepStatusV1(String scheduledProcedureStepStatusV1) {
        ScheduledProcedureStepStatusV1 = scheduledProcedureStepStatusV1;
    }

    public String getScheduledProcedureStepStatusV2() {
        return ScheduledProcedureStepStatusV2;
    }

    public void setScheduledProcedureStepStatusV2(String scheduledProcedureStepStatusV2) {
        ScheduledProcedureStepStatusV2 = scheduledProcedureStepStatusV2;
    }

    public JSONObject getRequestedProcedureIDO() {
        return RequestedProcedureIDO;
    }

    public void setRequestedProcedureIDO(JSONObject requestedProcedureIDO) {
        RequestedProcedureIDO = requestedProcedureIDO;
    }

    public String getRequestedProcedureIDT0() {
        return RequestedProcedureIDT0;
    }

    public void setRequestedProcedureIDT0(String requestedProcedureIDT0) {
        RequestedProcedureIDT0 = requestedProcedureIDT0;
    }

    public String getRequestedProcedureIDT1() {
        return RequestedProcedureIDT1;
    }

    public void setRequestedProcedureIDT1(String requestedProcedureIDT1) {
        RequestedProcedureIDT1 = requestedProcedureIDT1;
    }

    public String getRequestedProcedureIDT2() {
        return RequestedProcedureIDT2;
    }

    public void setRequestedProcedureIDT2(String requestedProcedureIDT2) {
        RequestedProcedureIDT2 = requestedProcedureIDT2;
    }

    public String getRequestedProcedureIDV1() {
        return RequestedProcedureIDV1;
    }

    public void setRequestedProcedureIDV1(String requestedProcedureIDV1) {
        RequestedProcedureIDV1 = requestedProcedureIDV1;
    }

    public String getRequestedProcedureIDV2() {
        return RequestedProcedureIDV2;
    }

    public void setRequestedProcedureIDV2(String requestedProcedureIDV2) {
        RequestedProcedureIDV2 = requestedProcedureIDV2;
    }

    public JSONObject getRequestedProcedurePriorityO() {
        return RequestedProcedurePriorityO;
    }

    public void setRequestedProcedurePriorityO(JSONObject requestedProcedurePriorityO) {
        RequestedProcedurePriorityO = requestedProcedurePriorityO;
    }

    public String getRequestedProcedurePriorityT0() {
        return RequestedProcedurePriorityT0;
    }

    public void setRequestedProcedurePriorityT0(String requestedProcedurePriorityT0) {
        RequestedProcedurePriorityT0 = requestedProcedurePriorityT0;
    }

    public String getRequestedProcedurePriorityT1() {
        return RequestedProcedurePriorityT1;
    }

    public void setRequestedProcedurePriorityT1(String requestedProcedurePriorityT1) {
        RequestedProcedurePriorityT1 = requestedProcedurePriorityT1;
    }

    public String getRequestedProcedurePriorityT2() {
        return RequestedProcedurePriorityT2;
    }

    public void setRequestedProcedurePriorityT2(String requestedProcedurePriorityT2) {
        RequestedProcedurePriorityT2 = requestedProcedurePriorityT2;
    }

    public String getRequestedProcedurePriorityV1() {
        return RequestedProcedurePriorityV1;
    }

    public void setRequestedProcedurePriorityV1(String requestedProcedurePriorityV1) {
        RequestedProcedurePriorityV1 = requestedProcedurePriorityV1;
    }

    public String getRequestedProcedurePriorityV2() {
        return RequestedProcedurePriorityV2;
    }

    public void setRequestedProcedurePriorityV2(String requestedProcedurePriorityV2) {
        RequestedProcedurePriorityV2 = requestedProcedurePriorityV2;
    }

    String PatientsBirthDateV1;
    String PatientsBirthDateV2;

    //00100040
    JSONObject PatientsSexO = new JSONObject();
    String PatientsSexT0= "00100040";
    String PatientsSexT1= "vr";
    String PatientsSexT2= "Value";
    String PatientsSexV1;
    String PatientsSexV2="";

    //001021C0
    JSONObject PregnancyStatusO = new JSONObject();
    String PregnancyStatusT0= "001021C0";
    String PregnancyStatusT1= "vr";
    String PregnancyStatusT2= "Value";
    String PregnancyStatusV1;
    String PregnancyStatusV2="";

    //0020000D
    JSONObject StudyInstanceUIDO = new JSONObject();
    String StudyInstanceUIDT0= "0020000D";
    String StudyInstanceUIDT1= "vr";
    String StudyInstanceUIDT2= "Value";
    String StudyInstanceUIDV1;
    String StudyInstanceUIDV2="";

    //00321032
    JSONObject RequestingPhysicianO = new JSONObject();
    String RequestingPhysicianT0= "00321032";
    String RequestingPhysicianT1= "vr";
    String RequestingPhysicianT2= "Value";
    String RequestingPhysicianT3= "Alphabetic";
    String RequestingPhysicianV1;
    String RequestingPhysicianV2="";

    //00321060
    JSONObject RequestedProcedureDescriptionO = new JSONObject();
    String RequestedProcedureDescriptionT0= "00321060";
    String RequestedProcedureDescriptionT1= "vr";
    String RequestedProcedureDescriptionT2= "Value";
    String RequestedProcedureDescriptionV1;
    String RequestedProcedureDescriptionV2="";

    //00380010
    JSONObject AdmissionIDO = new JSONObject();
    String AdmissionIDT0= "00380010";
    String AdmissionIDT1= "vr";
    String AdmissionIDT2= "Value";
    String AdmissionIDV1;
    String AdmissionIDV2="";

    //00400100
    JSONObject ScheduledProcedureStepSequenceO = new JSONObject();
    String ScheduledProcedureStepSequenceT0= "00400100";
    String ScheduledProcedureStepSequenceT1= "vr";
    String ScheduledProcedureStepSequenceT2= "Value";
    String ScheduledProcedureStepSequenceT3= "00080060";
    String ScheduledProcedureStepSequenceV1;
    String ScheduledProcedureStepSequenceV2="";

    //00400001
    JSONObject ScheduledStationAETitleO = new JSONObject();
    String ScheduledStationAETitleT0= "00400001";
    String ScheduledStationAETitleT1= "vr";
    String ScheduledStationAETitleT2= "Value";
    String ScheduledStationAETitleV1;
    String ScheduledStationAETitleV2="";


    //00400002
    JSONObject ScheduledProcedureStepStartDateO = new JSONObject();
    String ScheduledProcedureStepStartDateT0= "00400002";
    String ScheduledProcedureStepStartDateT1= "vr";
    String ScheduledProcedureStepStartDateT2= "Value";
    String ScheduledProcedureStepStartDateV1;
    String ScheduledProcedureStepStartDateV2="";


    //00400003
    JSONObject ScheduledProcedureStepStartTimeO = new JSONObject();
    String ScheduledProcedureStepStartTimeT0= "00400003";
    String ScheduledProcedureStepStartTimeT1= "vr";
    String ScheduledProcedureStepStartTimeT2= "Value";
    String ScheduledProcedureStepStartTimeV1;
    String ScheduledProcedureStepStartTimeV2="";


    //00400008
    JSONObject ScheduledProtocolCodeSequenceO = new JSONObject();
    String ScheduledProtocolCodeSequenceT0= "00400008";
    String ScheduledProtocolCodeSequenceT1= "vr";
    String ScheduledProtocolCodeSequenceT2= "Value";
    String ScheduledProtocolCodeSequenceV1;
    String ScheduledProtocolCodeSequenceV2="";

    //00400009
    JSONObject ScheduledProcedureStepIDO = new JSONObject();
    String ScheduledProcedureStepIDT0= "00400009";
    String ScheduledProcedureStepIDT1= "vr";
    String ScheduledProcedureStepIDT2= "Value";
    String ScheduledProcedureStepIDV1;
    String ScheduledProcedureStepIDV2="";

    //00400010
    JSONObject ScheduledStationNameO = new JSONObject();
    String ScheduledStationNameT0= "00400010";
    String ScheduledStationNameT1= "vr";
    String ScheduledStationNameT2= "Value";
    String ScheduledStationNameV1;
    String ScheduledStationNameV2="";

    //00400020
    JSONObject ScheduledProcedureStepStatusO = new JSONObject();
    String ScheduledProcedureStepStatusT0= "00400020";
    String ScheduledProcedureStepStatusT1= "vr";
    String ScheduledProcedureStepStatusT2= "Value";
    String ScheduledProcedureStepStatusV1;
    String ScheduledProcedureStepStatusV2="";

    //00401001
    JSONObject RequestedProcedureIDO = new JSONObject();
    String RequestedProcedureIDT0= "00401001";
    String RequestedProcedureIDT1= "vr";
    String RequestedProcedureIDT2= "Value";
    String RequestedProcedureIDV1;
    String RequestedProcedureIDV2="";

    //00401003
    JSONObject RequestedProcedurePriorityO = new JSONObject();
    String RequestedProcedurePriorityT0= "00401003";
    String RequestedProcedurePriorityT1= "vr";
    String RequestedProcedurePriorityT2= "Value";
    String RequestedProcedurePriorityV1;
    String RequestedProcedurePriorityV2="";

}
