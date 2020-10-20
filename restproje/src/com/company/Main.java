package com.company;

import jj2000.j2k.fileformat.reader.FileFormatReader;
import org.dcm4che3.tool.getscu.GetSCU;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;
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
    //swing frame and panel
    public static JPanel panel;
    public static JFrame metaSoftMain;


    public static void main(String[] args) throws IOException {



        //***********************Query for mwl***********************

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

        //***************************Query for study***********************

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
        //\"&\"
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "$dicom:get -r http://192.168.12.44:8080/dcm4chee-arc/aets/DCM4CHEE/wado?requestType=WADO\"&\"studyUID=2.16.840.114421.80563.9652876562\"&\"seriesUID=2.16.840.114421.80563.9652876578.9684412578\"&\"objectUID=2.16.840.114421.80563.9652876617.9715948617&contentType=application/dicom\"&\"dicomdir=true").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "$dicom:get -r http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE_ADMIN/wado?requestType=WADO&studyUID=1.2.840.20200203.112320.022.0.192168.1282.3088&seriesUID=1.2.840.20200203.112320.022.0.192168.1282.3089&objectUID=1.2.840.20200203.112320.022.0.192168.1282.3090&releatedType=text/xml").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.113:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22patientID=200200200%22%20--query-ext%20%22&includedefaults=false%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22studyUID=1.2.840.20190130.162023.091.0.192168.2491.192.3116%22%20--query-ext%20%22&includedefaults=false%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://%24dicom%3Aget+-w+%22http%3A%2F%2F192.168.12.132%3A8080%2Fweasis-pacs-connector%2FRequestManifest%3Fid%3D48%22+%24weasis%3Aconfig++cdb+cdb-ext%3D%22http%3A%2F%2F192.168.12.132%3A8080%2Fweasis-ext%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://192.168.12.132:8080/weasis-pacs-connector/weasis%3F%26studyUID=1.2.840.20200723.082732.006.0.192168.010.10.17284%26cdb").start();
        //aaProcess process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.113:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22instanceUID=2.25.22844845620423521131597684029765342193%22%20--query-ext%20%22&includedefaults=false%22").start();

        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22patientID=26%22").start();
        //calisti modalities
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22patientID=26%26modalitiesInStudy=PX%22").start();
        //calisti modalite + date
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22patientID=26%26modalitiesInStudy=PX%26upperDateTime=2020-01-01%22").start();

        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/weasis-pacs-connector/weasis%22&26%22patientID=22739754122%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22accessionnumber=1490754%22").start(); //%2E
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22studyUID=1%2E2%2E840%2E20200203%2E112320%2E022%2E0%2E192168%2E1282%2E3088%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22patientID=26%22%20-r%20%22StudyDate=%2D20200107%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs%22%20-r%20%22patientID=26%26studies%3FScheduledProcedureStepSequence%2EScheduledProcedureStepStartDate=20190101%2D20200102%26StudyDate=20190101&2D20200808%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "weasis://$dicom:rs%20--url%20%22http://192.168.12.132:8080/dcm4chee-arc/aets/DCM4CHEE/rs/studies%22%20-r%20%22ScheduledProcedureStepSequence.ScheduledProcedureStepStartDate=%2D20190101%22%26%22patientID=26%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "weasis://%24dicom%3Aget+-w+%22http%3A%2F%2F192.168.12.132%3A8080%2Fweasis-pacs-connector%2FRequestManifest%3Fid%3D78%22+%24weasis%3Aconfig++cdb+cdb-ext%3D%22http%3A%2F%2F192.168.12.132%3A8080%2Fweasis-ext%22", "http://192.168.12.132:8080/weasis-pacs-connector/weasis?&studyUID=1.2.840.20200723.082732.006.0.192168.010.10.17284&cdb").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "weasis%3A%2F%2F%24dicom%3Aget%20--remote%3Dhttp%3A%2F%2F192.168.12.132%3A8080%2Fweasis-pacs-connector%2Fweasis%3F%26studyUID%3D1.2.840.20200723.082732.006.0.192168.010.10.17284%26cdb").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "weasis://$image:get%20--url%20%22http://192.168.12.132:8080/weasis-pacs-connector/weasis?&studyUID=1%2E2%2E840%2E20200723%2E082732%2E006%2E0%2E192168%2E010%2E10%2E17284&cdb").start();
        //calisti
        // Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "weasis://%24dicom%3Aget%20-w%20https%3A%2F%2Fnroduit.github.io%2Fsamples%2FLumbar%2Fmf.xml").start();

        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "$dicom:get%20-w%20%22http://192.168.12.132:8080/weasis-pacs-connector/weasis%3F%26studyUID=1.2.840.20200723.082732.006.0.192168.010.10.17284%26cdb%22").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "weasis://$image:get%20--url%20%22http://192.168.12.132:8080/weasis-pacs-connector/weasis%3F%26studyUID%3D1.2.840.20200723.082732.006.0.192168.010.10.17284%26cdb%22").start();

        //lalalaaa calistii
        Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "$dicom:get -w \"http://192.168.12.132:8080/weasis-pacs-connector/manifest?studyUID=1.2.840.20200203.112320.022.0.192168.1282.3088\"").start();

        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "$dicom:get -w \"http://192.168.12.132:8080/weasis-pacs-connector/manifest?patientID=14950016028\"").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "$dicom:get -w \"http://192.168.12.132:8080/weasis-pacs-connector/manifest?patientID=26&modalitiesStudy=PX\"").start();
        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "$dicom:get -w \"http://192.168.12.132:8080/weasis-pacs-connector/manifest?patientID=26&ScheduledProcedureStepSequence.Modality=PX\"").start();

        //Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe" , "$dicom:get%20-w%20%5C%22http%3A%2F%2F192.168.12.132%3A8080%2Fweasis-pacs-connector%2Fmanifest%3FpatientID%3D26%26modalitiesInStudy%3DPX%5C%22").start();


/*
        String s = "http://192.168.12.132:8080/weasis-pacs-connector/weasis?&studyUID=1.2.840.20200723.082732.006.0.192168.010.10.17284&cdb";
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(URI.create(s));

 */




/*
        Runtime rt = Runtime.getRuntime();
        String url = "http://192.168.12.132:8080/weasis-pacs-connector/weasis?&studyUID=1.2.840.20200723.082732.006.0.192168.010.10.17284&cdb";
        rt.exec("rundll32 url.dll,FileProtocolHandler " + url);

 */

        /*
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

         */

        /*
        String[] columnNames = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
        metaSoftMain.setLayout(null);
        metaSoftMain.setSize(1000,1000);
        metaSoftMain.setVisible(true);
        JTable table = new JTable(result,columnNames);
        table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
        table.setBounds(0, 100, 1000, 300);

        JScrollPane scrollPane = new JScrollPane(table);
        metaSoftMain.add(scrollPane);
        metaSoftMain.add(panel);
        metaSoftMain.setSize(600,400);

        //goruntuleri ac butonu
        JButton goruntuleriAc=new JButton("Goruntuleri Ac");
        goruntuleriAc.setBounds(10,10,200, 40);

        //mwl getirme butonu
        JButton mwlGetir=new JButton("Mwl Getir");
        mwlGetir.setBounds(250,10,200, 40);

        //butonlari ve tabloyu jframe icine ekliyoruz
        metaSoftMain.add(goruntuleriAc);
        metaSoftMain.add(mwlGetir);
        //metaSoftMain.add(table);
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
*/
        /*
        //sadece tabloyu dinleyen click listener metodu
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {

                if (me.getClickCount() == 1) {     // to detect doble click events
                    row[0] = table.getSelectedRow(); // select a row
                    column[0] = table.getSelectedColumn(); // select a column
                    JOptionPane.showMessageDialog(null, table.getValueAt(row[0], 12)); // get the value of a row and column.
                    System.out.println("row: "+ row[0] + "   column: "+ column[0]);
                }
            }
        });


         */
        /*
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

                //auto open for directory
                try {
                    Process process = new ProcessBuilder("C:\\Program Files\\Weasis\\Weasis.exe", "$dicom:get -l \"D:/a/a\"").start();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }



            }
        });




         */

        /*
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    jTableKullanimi frame = new jTableKullanimi();
                    metaSoftMain.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


         */



    }

    /*
    private static void table(ArrayList<StudyData> dataList, String[] columnNames) {

    }
     */

    /*
    public class jTableKullanimi() {

        setTitle(“JTable Kullanlanımı”);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 28, 396, 173);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        //—–


        //Dizileri model kısmına aktarıyoruz.
        TableModel tablemodel=new DefaultTableModel(ikincidizi,ilkdizi);

        //Modelide Table aktarıyoruz.
        table.setModel(tablemodel);
        //—–
    }

     */




}

