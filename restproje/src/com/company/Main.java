package com.company;

import org.dcm4che3.tool.getscu.GetSCU;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.event.*;
import java.io.*;
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


    public static void main(String[] args) throws IOException {

        //Query for mwl

//        MwlQuery query = new MwlQuery();
//        QueryProcess response = new QueryProcess();
//        MwlData mwlData = new MwlData();
//        ArrayList<MwlData> dataList;
//        //query.MwlQuery(response.QueryProcessMethod().toString());
//        dataList=query.MwlQueryParse(response.QueryProcessMethod().toString());
//
//        for (int i = 0 ; i<dataList.size();i++) {
//            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
//            System.out.println(dataList.get(i).SpecificCharacterSetV2);
//            System.out.println(dataList.get(i).AccessionNumberV2);
//            System.out.println(dataList.get(i).ReferringPhysiciansNameV2);
//            System.out.println(dataList.get(i).RetrieveURLV2);
//            System.out.println(dataList.get(i).PatientsNameV2);
//            System.out.println(dataList.get(i).PatientsIDV2);
//            System.out.println(dataList.get(i).PatientsBirthDateV2);
//            System.out.println(dataList.get(i).PatientsSexV2);
//            System.out.println(dataList.get(i).PregnancyStatusV2);
//            System.out.println(dataList.get(i).StudyInstanceUIDV2);
//            System.out.println(dataList.get(i).RequestingPhysicianV2);
//            System.out.println(dataList.get(i).RequestedProcedureDescriptionV2);
//            System.out.println(dataList.get(i).AdmissionIDV2);
//            System.out.println(dataList.get(i).ScheduledProcedureStepSequenceV2);
//            System.out.println(dataList.get(i).ScheduledStationAETitleV2);
//            System.out.println(dataList.get(i).ScheduledProcedureStepStartDateV2);
//            System.out.println(dataList.get(i).ScheduledProcedureStepStartTimeV2);
//            System.out.println(dataList.get(i).ScheduledProtocolCodeSequenceV2);
//            System.out.println(dataList.get(i).ScheduledProcedureStepIDV2);
//            System.out.println(dataList.get(i).ScheduledStationNameV2);
//            System.out.println(dataList.get(i).ScheduledProcedureStepStatusV2);
//            System.out.println(dataList.get(i).RequestedProcedureIDV2);
//            System.out.println(dataList.get(i).RequestedProcedurePriorityV2);
//            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
//        }

        StudyQuery query = new StudyQuery();
        QueryProcess response = new QueryProcess();
        StudyData studyData = new StudyData();
        ArrayList<StudyData> dataList;
        dataList=query.StudyQueryParse(response.QueryProcessMethod().toString());

        String[][] result = new String[dataList.size()][16];
        for (int i =0 ;i < dataList.size() ; i++) {
                result[i][0] = dataList.get(i).SpecificCharacterSetV2.toString();
                result[i][1] = dataList.get(i).StudyDateV2.toString();
                result[i][2] = dataList.get(i).AccessionNumberV2.toString();
                result[i][3] = dataList.get(i).RetrieveAETitleV2.toString();
                result[i][4] = dataList.get(i).InstanceAvailabilityV2.toString();
                result[i][5] = dataList.get(i).ModalitiesInStudyV2.toString();
                result[i][6] = dataList.get(i).ReferringPhysiciansNameV2.toString();
                result[i][7] = dataList.get(i).RetrieveURLV2.toString();
                result[i][8] = dataList.get(i).PatientsNameV2.toString();
                result[i][9] = dataList.get(i).PatientsIDV2.toString();
                result[i][10] = dataList.get(i).PatientsBirthDateV2.toString();
                result[i][11] = dataList.get(i).PatientsSexV2.toString();
                result[i][12] = dataList.get(i).StudyInstanceUIDV2.toString();
                result[i][13] = dataList.get(i).StudyIDV2.toString();
                result[i][14] = dataList.get(i).NumberofStudyRelatedSeriesV2.toString();
                result[i][15] = dataList.get(i).NumberofStudyRelatedInstancesV2.toString();

        }
        String[] columnNames = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};

        //swing frame
        JFrame metaSoftMain=new JFrame();
        metaSoftMain.setLayout(null);//using no layout managers
        metaSoftMain.setSize(1000,1000);//400 width and 500 height
        metaSoftMain.setVisible(true);//making the frame visible
        JTable table = new JTable(result,columnNames);
        table.setBounds(0, 100, 1000, 300);

        JButton goruntuleriAc=new JButton("Goruntuleri Ac");//creating instance of JButton
        goruntuleriAc.setBounds(10,10,200, 40);//x axis, y axis, width, height

        metaSoftMain.add(goruntuleriAc);//adding button in JFrame
        metaSoftMain.add(table);
        metaSoftMain.setVisible(true);
        System.out.println("lalalalala");

        metaSoftMain.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {


            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        final int[] row = new int[1];
        final int[] column = new int[1];

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {

                if (me.getClickCount() == 1) {     // to detect doble click events
                    row[0] = table.getSelectedRow(); // select a row
                    column[0] = table.getSelectedColumn(); // select a column
                    JOptionPane.showMessageDialog(null, table.getValueAt(row[0], column[0])); // get the value of a row and column.
                    System.out.println("row: "+ row[0] + "   column: "+ column[0]);
                }
            }
        });
        System.out.println(row[0] + "****" + column[0]);

        goruntuleriAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO goruntuleri study id ye gore indirme metodu gelecek
                String id = result[row[0]][column[0]].toString();
                String[] command3 = new String[6];
                command3[0] = "-c";
                command3[1] = "DCM4CHEE@192.168.12.44:11112";
                command3[2] = "-m";
                command3[3] = "StudyInstanceUID="+id;
                command3[4] = "--directory";
                command3[5] = "D:\\a\\a";
                GetSCU.main(command3);


                try {
                    Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "$dicom:get -l \"D:/a/a\"").start();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }



            }
        });


        //Query for study

//        StudyQuery query = new StudyQuery();
//        QueryProcess response = new QueryProcess();
//        StudyData studyData = new StudyData();
//        ArrayList<StudyData> dataList;
//        //query.MwlQuery(response.QueryProcessMethod().toString());
//        dataList=query.StudyQueryParse(response.QueryProcessMethod().toString());
//
//        for (int i = 0 ; i<dataList.size();i++) {
//            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
//            System.out.println(dataList.get(i).SpecificCharacterSetV2);
//            System.out.println(dataList.get(i).StudyDateV2);
//            System.out.println(dataList.get(i).AccessionNumberV2);
//            System.out.println(dataList.get(i).RetrieveAETitleV2);
//            System.out.println(dataList.get(i).InstanceAvailabilityV2);
//            System.out.println(dataList.get(i).ModalitiesInStudyV2);
//            System.out.println(dataList.get(i).ReferringPhysiciansNameV2);
//            System.out.println(dataList.get(i).RetrieveURLV2);
//            System.out.println(dataList.get(i).PatientsNameV2);
//            System.out.println(dataList.get(i).PatientsIDV2);
//            System.out.println(dataList.get(i).PatientsBirthDateV2);
//            System.out.println(dataList.get(i).PatientsSexV2);
//            System.out.println(dataList.get(i).StudyInstanceUIDV2);
//            System.out.println(dataList.get(i).StudyIDV2);
//            System.out.println(dataList.get(i).NumberofStudyRelatedSeriesV2);
//            System.out.println(dataList.get(i).NumberofStudyRelatedInstancesV2);
//            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
//        }

        //auto open
//        ProcessBuilder pb = new ProcessBuilder("");
//        pb.directory(new File("C:\\Program Files\\Weasis\\Weasis.exe"));
//        Process p = pb.start();

        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe").command("$dicom:get -l \"D:/a/\"").start();
        //auto open weasis for given directory
        //auto open weasis with directory
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "$dicom:get -l \"D:/a/a\"").start();

    }

    private static void table(ArrayList<StudyData> dataList, String[] columnNames) {
    }
}

