package com.company;

import org.json.JSONObject;

public class StudyData {

    //00080005
    JSONObject SpecificCharacterSetO = new JSONObject();
    String SpecificCharacterSetT0= "00080005";
    String SpecificCharacterSetT1= "vr";
    String SpecificCharacterSetT2= "Value";
    String SpecificCharacterSetV1;
    String SpecificCharacterSetV2 = "";

    //00080020
    JSONObject 	StudyDateO = new JSONObject();
    String StudyDateT0= "00080020";
    String StudyDateT1= "vr";
    String StudyDateT2= "Value";
    String StudyDateV1;
    String StudyDateV2 = "";

    //00080050
    JSONObject AccessionNumberO = new JSONObject();
    String AccessionNumberT0= "00080050";
    String AccessionNumberT1= "vr";
    String AccessionNumberT2= "Value";
    String AccessionNumberV1;
    String AccessionNumberV2 = "";

    //00080054
    JSONObject 	RetrieveAETitleO = new JSONObject();
    String RetrieveAETitleT0= "00080054";
    String RetrieveAETitleT1= "vr";
    String RetrieveAETitleT2= "Value";
    String RetrieveAETitleT3= "Alphabetic";
    String RetrieveAETitleV1;
    String RetrieveAETitleV2 = "";

    //00080056
    JSONObject 	InstanceAvailabilityO = new JSONObject();
    String InstanceAvailabilityT0= "00080056";
    String InstanceAvailabilityT1= "vr";
    String InstanceAvailabilityT2= "Value";
    String InstanceAvailabilityV1;
    String InstanceAvailabilityV2 = "";

    //00080061
    JSONObject 	ModalitiesInStudyO = new JSONObject();
    String ModalitiesInStudyT0= "00080061";
    String ModalitiesInStudyT1= "vr";
    String ModalitiesInStudyT2= "Value";
    String ModalitiesInStudyT3= "Alphabetic";
    String ModalitiesInStudyV1;
    String ModalitiesInStudyV2 = "";

    //00080090
    JSONObject ReferringPhysiciansNameO = new JSONObject();
    String ReferringPhysiciansNameT0= "00080090";
    String ReferringPhysiciansNameT1= "vr";
    String ReferringPhysiciansNameT2= "Value";
    String ReferringPhysiciansNameT3= "Alphabetic";
    String ReferringPhysiciansNameV1;
    String ReferringPhysiciansNameV2 = "";

    //00081190
    JSONObject RetrieveURLO = new JSONObject();
    String RetrieveURLT0= "00081190";
    String RetrieveURLT1= "vr";
    String RetrieveURLT2= "Value";
    String RetrieveURLV1;
    String RetrieveURLV2 = "";

    //00100010
    JSONObject PatientsNameO = new JSONObject();
    String PatientsNameT0= "00100010";
    String PatientsNameT1= "vr";
    String PatientsNameT2= "Value";
    String PatientsNameT3= "Alphabetic";
    String PatientsNameV1;
    String PatientsNameV2 = "";

    //00100020
    JSONObject PatientsIDO = new JSONObject();
    String PatientsIDT0= "00100020";
    String PatientsIDT1= "vr";
    String PatientsIDT2= "Value";
    String PatientsIDV1;
    String PatientsIDV2 = "";

    //00100030
    JSONObject PatientsBirthDateO = new JSONObject();
    String PatientsBirthDateT0= "00100030";
    String PatientsBirthDateT1= "vr";
    String PatientsBirthDateT2= "Value";
    String PatientsBirthDateV1;
    String PatientsBirthDateV2 = "";

    //00100040
    JSONObject PatientsSexO = new JSONObject();
    String PatientsSexT0= "00100040";
    String PatientsSexT1= "vr";
    String PatientsSexT2= "Value";
    String PatientsSexV1;
    String PatientsSexV2 = "";

    //0020000D
    JSONObject 	StudyInstanceUIDO = new JSONObject();
    String StudyInstanceUIDT0= "0020000D";
    String StudyInstanceUIDT1= "vr";
    String StudyInstanceUIDT2= "Value";
    String StudyInstanceUIDV1;
    String StudyInstanceUIDV2 = "";

    //00200010
    JSONObject 	StudyIDO = new JSONObject();
    String StudyIDT0= "00200010";
    String StudyIDT1= "vr";
    String StudyIDT2= "Value";
    String StudyIDV1;
    String StudyIDV2 = "";

    //00201206
    JSONObject 	NumberofStudyRelatedSeriesO = new JSONObject();
    String NumberofStudyRelatedSeriesT0= "00201206";
    String NumberofStudyRelatedSeriesT1= "vr";
    String NumberofStudyRelatedSeriesT2= "Value";
    String NumberofStudyRelatedSeriesV1;
    String NumberofStudyRelatedSeriesV2 = "";


    //00201208
    JSONObject NumberofStudyRelatedInstancesO = new JSONObject();
    String NumberofStudyRelatedInstancesT0= "00201208";
    String NumberofStudyRelatedInstancesT1= "vr";
    String NumberofStudyRelatedInstancesT2= "Value";
    String NumberofStudyRelatedInstancesV1;
    String NumberofStudyRelatedInstancesV2 = "";

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

    public JSONObject getStudyDateO() {
        return StudyDateO;
    }

    public void setStudyDateO(JSONObject studyDateO) {
        StudyDateO = studyDateO;
    }

    public String getStudyDateT0() {
        return StudyDateT0;
    }

    public void setStudyDateT0(String studyDateT0) {
        StudyDateT0 = studyDateT0;
    }

    public String getStudyDateT1() {
        return StudyDateT1;
    }

    public void setStudyDateT1(String studyDateT1) {
        StudyDateT1 = studyDateT1;
    }

    public String getStudyDateT2() {
        return StudyDateT2;
    }

    public void setStudyDateT2(String studyDateT2) {
        StudyDateT2 = studyDateT2;
    }

    public String getStudyDateV1() {
        return StudyDateV1;
    }

    public void setStudyDateV1(String studyDateV1) {
        StudyDateV1 = studyDateV1;
    }

    public String getStudyDateV2() {
        return StudyDateV2;
    }

    public void setStudyDateV2(String studyDateV2) {
        StudyDateV2 = studyDateV2;
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

    public JSONObject getRetrieveAETitleO() {
        return RetrieveAETitleO;
    }

    public void setRetrieveAETitleO(JSONObject retrieveAETitleO) {
        RetrieveAETitleO = retrieveAETitleO;
    }

    public String getRetrieveAETitleT0() {
        return RetrieveAETitleT0;
    }

    public void setRetrieveAETitleT0(String retrieveAETitleT0) {
        RetrieveAETitleT0 = retrieveAETitleT0;
    }

    public String getRetrieveAETitleT1() {
        return RetrieveAETitleT1;
    }

    public void setRetrieveAETitleT1(String retrieveAETitleT1) {
        RetrieveAETitleT1 = retrieveAETitleT1;
    }

    public String getRetrieveAETitleT2() {
        return RetrieveAETitleT2;
    }

    public void setRetrieveAETitleT2(String retrieveAETitleT2) {
        RetrieveAETitleT2 = retrieveAETitleT2;
    }

    public String getRetrieveAETitleT3() {
        return RetrieveAETitleT3;
    }

    public void setRetrieveAETitleT3(String retrieveAETitleT3) {
        RetrieveAETitleT3 = retrieveAETitleT3;
    }

    public String getRetrieveAETitleV1() {
        return RetrieveAETitleV1;
    }

    public void setRetrieveAETitleV1(String retrieveAETitleV1) {
        RetrieveAETitleV1 = retrieveAETitleV1;
    }

    public String getRetrieveAETitleV2() {
        return RetrieveAETitleV2;
    }

    public void setRetrieveAETitleV2(String retrieveAETitleV2) {
        RetrieveAETitleV2 = retrieveAETitleV2;
    }

    public JSONObject getInstanceAvailabilityO() {
        return InstanceAvailabilityO;
    }

    public void setInstanceAvailabilityO(JSONObject instanceAvailabilityO) {
        InstanceAvailabilityO = instanceAvailabilityO;
    }

    public String getInstanceAvailabilityT0() {
        return InstanceAvailabilityT0;
    }

    public void setInstanceAvailabilityT0(String instanceAvailabilityT0) {
        InstanceAvailabilityT0 = instanceAvailabilityT0;
    }

    public String getInstanceAvailabilityT1() {
        return InstanceAvailabilityT1;
    }

    public void setInstanceAvailabilityT1(String instanceAvailabilityT1) {
        InstanceAvailabilityT1 = instanceAvailabilityT1;
    }

    public String getInstanceAvailabilityT2() {
        return InstanceAvailabilityT2;
    }

    public void setInstanceAvailabilityT2(String instanceAvailabilityT2) {
        InstanceAvailabilityT2 = instanceAvailabilityT2;
    }

    public String getInstanceAvailabilityV1() {
        return InstanceAvailabilityV1;
    }

    public void setInstanceAvailabilityV1(String instanceAvailabilityV1) {
        InstanceAvailabilityV1 = instanceAvailabilityV1;
    }

    public String getInstanceAvailabilityV2() {
        return InstanceAvailabilityV2;
    }

    public void setInstanceAvailabilityV2(String instanceAvailabilityV2) {
        InstanceAvailabilityV2 = instanceAvailabilityV2;
    }

    public JSONObject getModalitiesInStudyO() {
        return ModalitiesInStudyO;
    }

    public void setModalitiesInStudyO(JSONObject modalitiesInStudyO) {
        ModalitiesInStudyO = modalitiesInStudyO;
    }

    public String getModalitiesInStudyT0() {
        return ModalitiesInStudyT0;
    }

    public void setModalitiesInStudyT0(String modalitiesInStudyT0) {
        ModalitiesInStudyT0 = modalitiesInStudyT0;
    }

    public String getModalitiesInStudyT1() {
        return ModalitiesInStudyT1;
    }

    public void setModalitiesInStudyT1(String modalitiesInStudyT1) {
        ModalitiesInStudyT1 = modalitiesInStudyT1;
    }

    public String getModalitiesInStudyT2() {
        return ModalitiesInStudyT2;
    }

    public void setModalitiesInStudyT2(String modalitiesInStudyT2) {
        ModalitiesInStudyT2 = modalitiesInStudyT2;
    }

    public String getModalitiesInStudyT3() {
        return ModalitiesInStudyT3;
    }

    public void setModalitiesInStudyT3(String modalitiesInStudyT3) {
        ModalitiesInStudyT3 = modalitiesInStudyT3;
    }

    public String getModalitiesInStudyV1() {
        return ModalitiesInStudyV1;
    }

    public void setModalitiesInStudyV1(String modalitiesInStudyV1) {
        ModalitiesInStudyV1 = modalitiesInStudyV1;
    }

    public String getModalitiesInStudyV2() {
        return ModalitiesInStudyV2;
    }

    public void setModalitiesInStudyV2(String modalitiesInStudyV2) {
        ModalitiesInStudyV2 = modalitiesInStudyV2;
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

    public JSONObject getStudyIDO() {
        return StudyIDO;
    }

    public void setStudyIDO(JSONObject studyIDO) {
        StudyIDO = studyIDO;
    }

    public String getStudyIDT0() {
        return StudyIDT0;
    }

    public void setStudyIDT0(String studyIDT0) {
        StudyIDT0 = studyIDT0;
    }

    public String getStudyIDT1() {
        return StudyIDT1;
    }

    public void setStudyIDT1(String studyIDT1) {
        StudyIDT1 = studyIDT1;
    }

    public String getStudyIDT2() {
        return StudyIDT2;
    }

    public void setStudyIDT2(String studyIDT2) {
        StudyIDT2 = studyIDT2;
    }

    public String getStudyIDV1() {
        return StudyIDV1;
    }

    public void setStudyIDV1(String studyIDV1) {
        StudyIDV1 = studyIDV1;
    }

    public String getStudyIDV2() {
        return StudyIDV2;
    }

    public void setStudyIDV2(String studyIDV2) {
        StudyIDV2 = studyIDV2;
    }

    public JSONObject getNumberofStudyRelatedSeriesO() {
        return NumberofStudyRelatedSeriesO;
    }

    public void setNumberofStudyRelatedSeriesO(JSONObject numberofStudyRelatedSeriesO) {
        NumberofStudyRelatedSeriesO = numberofStudyRelatedSeriesO;
    }

    public String getNumberofStudyRelatedSeriesT0() {
        return NumberofStudyRelatedSeriesT0;
    }

    public void setNumberofStudyRelatedSeriesT0(String numberofStudyRelatedSeriesT0) {
        NumberofStudyRelatedSeriesT0 = numberofStudyRelatedSeriesT0;
    }

    public String getNumberofStudyRelatedSeriesT1() {
        return NumberofStudyRelatedSeriesT1;
    }

    public void setNumberofStudyRelatedSeriesT1(String numberofStudyRelatedSeriesT1) {
        NumberofStudyRelatedSeriesT1 = numberofStudyRelatedSeriesT1;
    }

    public String getNumberofStudyRelatedSeriesT2() {
        return NumberofStudyRelatedSeriesT2;
    }

    public void setNumberofStudyRelatedSeriesT2(String numberofStudyRelatedSeriesT2) {
        NumberofStudyRelatedSeriesT2 = numberofStudyRelatedSeriesT2;
    }

    public String getNumberofStudyRelatedSeriesV1() {
        return NumberofStudyRelatedSeriesV1;
    }

    public void setNumberofStudyRelatedSeriesV1(String numberofStudyRelatedSeriesV1) {
        NumberofStudyRelatedSeriesV1 = numberofStudyRelatedSeriesV1;
    }

    public String getNumberofStudyRelatedSeriesV2() {
        return NumberofStudyRelatedSeriesV2;
    }

    public void setNumberofStudyRelatedSeriesV2(String numberofStudyRelatedSeriesV2) {
        NumberofStudyRelatedSeriesV2 = numberofStudyRelatedSeriesV2;
    }

    public JSONObject getNumberofStudyRelatedInstancesO() {
        return NumberofStudyRelatedInstancesO;
    }

    public void setNumberofStudyRelatedInstancesO(JSONObject numberofStudyRelatedInstancesO) {
        NumberofStudyRelatedInstancesO = numberofStudyRelatedInstancesO;
    }

    public String getNumberofStudyRelatedInstancesT0() {
        return NumberofStudyRelatedInstancesT0;
    }

    public void setNumberofStudyRelatedInstancesT0(String numberofStudyRelatedInstancesT0) {
        NumberofStudyRelatedInstancesT0 = numberofStudyRelatedInstancesT0;
    }

    public String getNumberofStudyRelatedInstancesT1() {
        return NumberofStudyRelatedInstancesT1;
    }

    public void setNumberofStudyRelatedInstancesT1(String numberofStudyRelatedInstancesT1) {
        NumberofStudyRelatedInstancesT1 = numberofStudyRelatedInstancesT1;
    }

    public String getNumberofStudyRelatedInstancesT2() {
        return NumberofStudyRelatedInstancesT2;
    }

    public void setNumberofStudyRelatedInstancesT2(String numberofStudyRelatedInstancesT2) {
        NumberofStudyRelatedInstancesT2 = numberofStudyRelatedInstancesT2;
    }

    public String getNumberofStudyRelatedInstancesV1() {
        return NumberofStudyRelatedInstancesV1;
    }

    public void setNumberofStudyRelatedInstancesV1(String numberofStudyRelatedInstancesV1) {
        NumberofStudyRelatedInstancesV1 = numberofStudyRelatedInstancesV1;
    }

    public String getNumberofStudyRelatedInstancesV2() {
        return NumberofStudyRelatedInstancesV2;
    }

    public void setNumberofStudyRelatedInstancesV2(String numberofStudyRelatedInstancesV2) {
        NumberofStudyRelatedInstancesV2 = numberofStudyRelatedInstancesV2;
    }
}
