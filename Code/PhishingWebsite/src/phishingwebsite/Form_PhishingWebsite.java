/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phishingwebsite;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.core.converters.CSVSaver;




public class Form_PhishingWebsite extends javax.swing.JFrame {

    public Form_PhishingWebsite() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Table_KetQua = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Txt_numFeatures = new javax.swing.JTextField();
        lb_numFeatures = new javax.swing.JLabel();
        Txt_numslots = new javax.swing.JTextField();
        lb_numExecutionSlots = new javax.swing.JLabel();
        Txt_seed = new javax.swing.JTextField();
        lb__seed = new javax.swing.JLabel();
        Bt_DuDoan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Txt_DataSet = new javax.swing.JTextField();
        Bt_Chon_DataSet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Txt_UnlabelSet = new javax.swing.JTextField();
        Bt_Chon_UnlabelSet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phát hiện website lừa đảo dựa trên Random Forest");

        Table_KetQua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Table_KetQua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Table_KetQua);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Bảng kết quả");

        Txt_numFeatures.setText("0");

        lb_numFeatures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_numFeatures.setText("numFeatures:");

        Txt_numslots.setText("1");

        lb_numExecutionSlots.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_numExecutionSlots.setText("numExecutionSlots:");

        Txt_seed.setText("1");

        lb__seed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb__seed.setText("seed:");

        Bt_DuDoan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bt_DuDoan.setText("Dự đoán");
        Bt_DuDoan.setName("Bt_DuDoan"); // NOI18N
        Bt_DuDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DuDoanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Data Set:");

        Txt_DataSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Txt_DataSet.setEnabled(false);
        Txt_DataSet.setName("Txt_DataSet"); // NOI18N

        Bt_Chon_DataSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bt_Chon_DataSet.setText("Brower...");
        Bt_Chon_DataSet.setName("Bt_Chon_DataSet"); // NOI18N
        Bt_Chon_DataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Chon_DataSetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Unlabel Set:");

        Txt_UnlabelSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Txt_UnlabelSet.setEnabled(false);
        Txt_UnlabelSet.setName("Txt_UnlabelSet"); // NOI18N

        Bt_Chon_UnlabelSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bt_Chon_UnlabelSet.setText("Brower...");
        Bt_Chon_UnlabelSet.setName("Bt_Chon_UnlabelSet"); // NOI18N
        Bt_Chon_UnlabelSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Chon_UnlabelSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_DataSet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt_Chon_DataSet))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_UnlabelSet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bt_Chon_UnlabelSet)))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_numExecutionSlots, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_numFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_numslots, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_numFeatures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(lb__seed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_seed, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bt_DuDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 411, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_numFeatures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(Txt_DataSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bt_Chon_DataSet)
                                    .addComponent(lb_numExecutionSlots)
                                    .addComponent(Txt_numslots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb__seed)
                                    .addComponent(Txt_seed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Txt_UnlabelSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bt_Chon_UnlabelSet)
                                    .addComponent(lb_numFeatures)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Bt_DuDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_DuDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DuDoanActionPerformed
        if(Txt_DataSet.getText().length() == 0){ 
        JOptionPane.showMessageDialog(null,"Bạn chưa chọn Data Set","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if ( Txt_UnlabelSet.getText().length() == 0)
            {
            JOptionPane.showMessageDialog(null,"Bạn chưa chọn Unlabel Set","Thông báo",JOptionPane.ERROR_MESSAGE);
            }
            else 
            {    
                if(Txt_numslots.getText().length() == 0)
                {
                    JOptionPane.showMessageDialog(null,"Giá trị numExecutionSlots không được để trống!","Thông báo",JOptionPane.ERROR_MESSAGE);
                }
                else
                { 
                    if(Txt_numFeatures.getText().length() == 0)
                    {
                        JOptionPane.showMessageDialog(null,"Giá trị numFeatures không được để trống!","Thông báo",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        if(Txt_seed.getText().length() ==0)
                        {
                            JOptionPane.showMessageDialog(null,"Giá trị seed không được để trống!","Thông báo",JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            try 
                                {
                                    String model_options = "-P 100 -I 100 -num-slots "+ Txt_numslots.getText() +" -K "+ Txt_numFeatures.getText()+" -M 1.0 -V 0.001 -S "+Txt_seed.getText();
                                    MyRandomForestModel model = new MyRandomForestModel(Txt_DataSet.getText(),model_options,null);
                                    model.buildRandomForest();
                                    model.evaluateRandomForest();
                                    model.predictClassLabel(Txt_UnlabelSet.getText(), "C:\\Users\\USER\\Desktop\\PhishingData\\DataSet\\PredictSet\\PredictSet.arff");
                                    ArffConvertCSV();
                                    ImportCSVtoTable();                               
                                    JOptionPane.showMessageDialog(null,"Dự đoán thành công");
                                    
                                } 
                            catch (Exception e) 
                                {
                                    JOptionPane.showMessageDialog(null, e);
                                }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_Bt_DuDoanActionPerformed

    private void Bt_Chon_UnlabelSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Chon_UnlabelSetActionPerformed
        JFileChooser filechooser = new JFileChooser(new File("C:\\"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arff File", "arff");
        filechooser.setFileFilter(filter);
        filechooser.setMultiSelectionEnabled(false);
        filechooser.setDialogTitle("save");
        int action = filechooser.showOpenDialog(this);
        if (action == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = filechooser.getSelectedFile();
            String LinkFile = selectedFile.getAbsolutePath();
            Txt_UnlabelSet.setText(LinkFile);
        }
    }//GEN-LAST:event_Bt_Chon_UnlabelSetActionPerformed

    private void Bt_Chon_DataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Chon_DataSetActionPerformed
        JFileChooser filechooser = new JFileChooser(new File("C:\\"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arff File", "arff");
        filechooser.setFileFilter(filter);
        filechooser.setMultiSelectionEnabled(false);
        filechooser.setDialogTitle("save");
        int action = filechooser.showOpenDialog(this);
        if (action == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = filechooser.getSelectedFile();
            String LinkFile = selectedFile.getAbsolutePath();
            Txt_DataSet.setText(LinkFile);
        }
    }//GEN-LAST:event_Bt_Chon_DataSetActionPerformed
    
    
 
    public void ArffConvertCSV() throws IOException
    { 
        ArffLoader Loader = new ArffLoader();
        Loader.setSource(new File("C:\\Users\\USER\\Desktop\\PhishingData\\DataSet\\PredictSet\\PredictSet.arff"));
        Instances data = Loader.getDataSet();
        CSVSaver saver = new CSVSaver();
        saver.setInstances(data);
        saver.setFile(new File("C:\\Users\\USER\\Desktop\\PhishingData\\DataSet\\PredictSet\\PredictSet.csv"));
        saver.writeBatch();
      
    }
   
    public void ImportCSVtoTable()
    {
         try {
             List<String[]> elements;
             try (BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\USER\\Desktop\\PhishingData\\DataSet\\PredictSet\\PredictSet.csv")))) 
             {
                 elements = new ArrayList<>();
                 String line = null;
                 while((line = br.readLine())!=null) 
                 {
                     String[] splitted = line.split(",");
                     elements.add(splitted);
                 }
             }

            String[] columNames = new String[] {
                    "having_IP_Address ", 
                    "URL_Length", 
                    "Shortining_Service", 
                    "having_At_Symbol", 
                    "double_slash_redirecting", 
                    "Prefix_Suffix", 
                    "having_Sub_Domain", 
                    "SSLfinal_State", 
                    "Domain_registeration_length", 
                    "Favicon",
                    "port", 
                    "HTTPS_token", 
                    "Request_URL", 
                    "URL_of_Anchor", 
                    "Links_in_tags", 
                    "SFH", 
                    "Submitting_to_email", 
                    "Abnormal_URL", 
                    "Redirect", 
                    "on_mouseover",
                    "RightClick", 
                    "popUpWidnow", 
                    "Iframe", 
                    "age_of_domain", 
                    "DNSRecord", 
                    "web_traffic", 
                    "Page_Rank", 
                    "Google_Index", 
                    "Links_pointing_to_page", 
                    "Statistical_report",
                    "Result"   
                };
            
            Object[][] content = new Object[elements.size()][31];
            for(int i=1; i<elements.size(); i++) {
                content[i][0] = elements.get(i)[0];
                content[i][1] = elements.get(i)[1];
                content[i][2] = elements.get(i)[2];
                content[i][3] = elements.get(i)[3];
                content[i][4] = elements.get(i)[4];
                content[i][5] = elements.get(i)[5];
                content[i][6] = elements.get(i)[6];
                content[i][7] = elements.get(i)[7];
                content[i][8] = elements.get(i)[8];
                content[i][9] = elements.get(i)[9];
                content[i][10] = elements.get(i)[10];
                content[i][11] = elements.get(i)[11];
                content[i][12] = elements.get(i)[12];
                content[i][13] = elements.get(i)[13];
                content[i][14] = elements.get(i)[14];
                content[i][15] = elements.get(i)[15];
                content[i][16] = elements.get(i)[16];
                content[i][17] = elements.get(i)[17];
                content[i][18] = elements.get(i)[18];
                content[i][19] = elements.get(i)[19];
                content[i][20] = elements.get(i)[20];
                content[i][21] = elements.get(i)[21];
                content[i][22] = elements.get(i)[22];
                content[i][23] = elements.get(i)[23];
                content[i][24] = elements.get(i)[24];
                content[i][25] = elements.get(i)[25];
                content[i][26] = elements.get(i)[26];
                content[i][27] = elements.get(i)[27];
                content[i][28] = elements.get(i)[28];
                content[i][29] = elements.get(i)[29];
                content[i][30] = elements.get(i)[30];
            }
            Table_KetQua.setModel(new DefaultTableModel(content,columNames));
            Table_KetQua.getModel();
           
        } catch (IOException e) 
            {
            JOptionPane.showMessageDialog(null, e);
            }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Form_PhishingWebsite().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Chon_DataSet;
    private javax.swing.JButton Bt_Chon_UnlabelSet;
    private javax.swing.JButton Bt_DuDoan;
    private javax.swing.JTable Table_KetQua;
    private javax.swing.JTextField Txt_DataSet;
    private javax.swing.JTextField Txt_UnlabelSet;
    private javax.swing.JTextField Txt_numFeatures;
    private javax.swing.JTextField Txt_numslots;
    private javax.swing.JTextField Txt_seed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb__seed;
    private javax.swing.JLabel lb_numExecutionSlots;
    private javax.swing.JLabel lb_numFeatures;
    // End of variables declaration//GEN-END:variables
}