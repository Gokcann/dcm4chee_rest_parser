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
    String PatientsBirthDateV1;
    String PatientsBirthDateV2;

    //00100040
    JSONObject PatientsSexO = new JSONObject();
    String PatientsSexT0= "00100040";
    String PatientsSexT1= "vr";
    String PatientsSexT2= "Value";
    String PatientsSexV1;
    String PatientsSexV2;

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
    String StudyInstanceUIDV2;

    //00321032
    JSONObject RequestingPhysicianO = new JSONObject();
    String RequestingPhysicianT0= "00321032";
    String RequestingPhysicianT1= "vr";
    String RequestingPhysicianT2= "Value";
    String RequestingPhysicianT3= "Alphabetic";
    String RequestingPhysicianV1;
    String RequestingPhysicianV2;

    //00321060
    JSONObject RequestedProcedureDescriptionO = new JSONObject();
    String RequestedProcedureDescriptionT0= "00321060";
    String RequestedProcedureDescriptionT1= "vr";
    String RequestedProcedureDescriptionT2= "Value";
    String RequestedProcedureDescriptionV1;
    String RequestedProcedureDescriptionV2;

    //00380010
    JSONObject AdmissionIDO = new JSONObject();
    String AdmissionIDT0= "00380010";
    String AdmissionIDT1= "vr";
    String AdmissionIDT2= "Value";
    String AdmissionIDV1;
    String AdmissionIDV2;

    //00400100
    JSONObject ScheduledProcedureStepSequenceO = new JSONObject();
    String ScheduledProcedureStepSequenceT0= "00400100";
    String ScheduledProcedureStepSequenceT1= "vr";
    String ScheduledProcedureStepSequenceT2= "Value";
    String ScheduledProcedureStepSequenceT3= "00080060";
    String ScheduledProcedureStepSequenceV1;
    String ScheduledProcedureStepSequenceV2;

    //00400001
    JSONObject ScheduledStationAETitleO = new JSONObject();
    String ScheduledStationAETitleT0= "00400001";
    String ScheduledStationAETitleT1= "vr";
    String ScheduledStationAETitleT2= "Value";
    String ScheduledStationAETitleV1;
    String ScheduledStationAETitleV2;


    //00400002
    JSONObject ScheduledProcedureStepStartDateO = new JSONObject();
    String ScheduledProcedureStepStartDateT0= "00400002";
    String ScheduledProcedureStepStartDateT1= "vr";
    String ScheduledProcedureStepStartDateT2= "Value";
    String ScheduledProcedureStepStartDateV1;
    String ScheduledProcedureStepStartDateV2;


    //00400003
    JSONObject ScheduledProcedureStepStartTimeO = new JSONObject();
    String ScheduledProcedureStepStartTimeT0= "00400003";
    String ScheduledProcedureStepStartTimeT1= "vr";
    String ScheduledProcedureStepStartTimeT2= "Value";
    String ScheduledProcedureStepStartTimeV1;
    String ScheduledProcedureStepStartTimeV2;


    //00400008
    JSONObject ScheduledProtocolCodeSequenceO = new JSONObject();
    String ScheduledProtocolCodeSequenceT0= "00400008";
    String ScheduledProtocolCodeSequenceT1= "vr";
    String ScheduledProtocolCodeSequenceT2= "Value";
    String ScheduledProtocolCodeSequenceV1;
    String ScheduledProtocolCodeSequenceV2;

    //00400009
    JSONObject ScheduledProcedureStepIDO = new JSONObject();
    String ScheduledProcedureStepIDT0= "00400009";
    String ScheduledProcedureStepIDT1= "vr";
    String ScheduledProcedureStepIDT2= "Value";
    String ScheduledProcedureStepIDV1;
    String ScheduledProcedureStepIDV2;

    //00400010
    JSONObject ScheduledStationNameO = new JSONObject();
    String ScheduledStationNameT0= "00400010";
    String ScheduledStationNameT1= "vr";
    String ScheduledStationNameT2= "Value";
    String ScheduledStationNameV1;
    String ScheduledStationNameV2;

    //00400020
    JSONObject ScheduledProcedureStepStatusO = new JSONObject();
    String ScheduledProcedureStepStatusT0= "00400020";
    String ScheduledProcedureStepStatusT1= "vr";
    String ScheduledProcedureStepStatusT2= "Value";
    String ScheduledProcedureStepStatusV1;
    String ScheduledProcedureStepStatusV2;

    //00401001
    JSONObject RequestedProcedureIDO = new JSONObject();
    String RequestedProcedureIDT0= "00401001";
    String RequestedProcedureIDT1= "vr";
    String RequestedProcedureIDT2= "Value";
    String RequestedProcedureIDV1;
    String RequestedProcedureIDV2;

    //00401003
    JSONObject RequestedProcedurePriorityO = new JSONObject();
    String RequestedProcedurePriorityT0= "00401003";
    String RequestedProcedurePriorityT1= "vr";
    String RequestedProcedurePriorityT2= "Value";
    String RequestedProcedurePriorityV1;
    String RequestedProcedurePriorityV2;

}
