/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phishingwebsite;

import java.io.File;
import java.io.IOException;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NominalToBinary;
import weka.filters.unsupervised.attribute.NumericToNominal;
import weka.filters.unsupervised.attribute.Remove;
import weka.filters.unsupervised.instance.RemovePercentage;
import weka.filters.unsupervised.instance.Resample;

/**
 *
 * @author USER
 */
public class MyKnowledgeModel {
    DataSource source;
    Instances dataset;
    String[] model_options;
    String[] data_options; //dữ liệu bị loại bỏ
    
    Instances trainset;
    Instances testset;

    public MyKnowledgeModel() {
    }
   
     public MyKnowledgeModel(String filename,
             String m_options,
             String d_options) throws Exception {
         this.source = new DataSource(filename);
         this.dataset = source.getDataSet();
         
         if (filename.isEmpty()){
           this.source = new DataSource(filename);
           this.dataset = source.getDataSet();
         }
         if (m_options != null)
         {
           this.model_options = weka.core.Utils.splitOptions(m_options);  
         }
         if (d_options != null)
         {
             this.data_options = weka.core.Utils.splitOptions(d_options);
         }
         
    }

    MyKnowledgeModel(String cProgram_FilesWeka38datairisarff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     // Xóa dữ liệu không phải norminal
     public Instances removeData(Instances originalData) throws Exception{
         Remove remove = new Remove();
         remove.setOptions(data_options);
         remove.setInputFormat(originalData);
         return Filter.useFilter(originalData, remove);
     }
     
     // chuyển dữ liệu từ numeric sang nominal
     public Instances convertData(Instances originalData) throws Exception{
     NumericToNominal n2n = new NumericToNominal();
     n2n.setOptions(data_options);
     n2n.setInputFormat(originalData);
     return Filter.useFilter(originalData, n2n);
     }
     
     // chuyển dữ liệu từ nominal sang biary
     public Instances convert2Binary(Instances originalData) throws Exception{
     NominalToBinary n2b = new NominalToBinary();
     n2b.setOptions(data_options);
     n2b.setBinaryAttributesNominal(true);
     n2b.setInputFormat(originalData);
     return Filter.useFilter(originalData, n2b);
     }
     
     // Xuất dữ liệu ra file
     public void saveData(String filename) throws IOException{
     ArffSaver outData = new ArffSaver();
     outData.setInstances(this.dataset);
     outData.setFile(new File(filename));
     outData.writeBatch();
     System.out.println("Ket thuc");
     }
     public void saveDatatoCSV(String filename) throws IOException{
     CSVSaver outData = new CSVSaver();
     outData.setInstances(this.dataset);
     outData.setFile(new File(filename));
     outData.writeBatch();
     System.out.println("Da chuyen xong");
     }
     
     public Instances divideTrainTest(Instances originalSet, double percent, boolean isTest) throws Exception{
     RemovePercentage rp = new RemovePercentage();
     rp.setPercentage(percent);
     rp.setInvertSelection(isTest);
     rp.setInputFormat(originalSet);
     return Filter.useFilter(originalSet, rp);
     }
     
     //bộ lọc Resample
      public Instances divideTrainTestResample(Instances originalSet, double percent, boolean isTest) throws Exception{
     Resample resample = new Resample();
     resample.setNoReplacement(true);
     resample.setSampleSizePercent(percent);
     resample.setInvertSelection(isTest);
     resample.setInputFormat(originalSet);
     return Filter.useFilter(originalSet, resample);
     }
      
    //Luu tru mo hinh
    public void saveModel(String filename, Object model) throws Exception{
    weka.core.SerializationHelper.write(filename, model);
    
    } 
    
    public Object loadModel(String filename) throws Exception{
        return weka.core.SerializationHelper.read(filename);
    }
    
    //Doc du lieu train vao bo nho
    public void setTrainset (String filename) throws Exception{
        DataSource trainSource = new DataSource(filename);
        this.trainset = trainSource.getDataSet(); 
    }
    
    //Doc du lieu test vao bo nho
    public void setTestset (String filename) throws Exception{
        DataSource testSource = new DataSource(filename);
        this.testset = testSource.getDataSet(); 
    }
    @Override
    public String toString() {
        return dataset.toSummaryString();
    }
}
