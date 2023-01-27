/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phishingwebsite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Debug;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author USER
 */
public class MyRandomForestModel extends MyKnowledgeModel {
    RandomForest rndF;

    public MyRandomForestModel() {
        super();
    }

    public MyRandomForestModel(String filename, String m_options, String d_options) throws Exception {
        super(filename, m_options, d_options);
    }
    public void buildRandomForest() throws Exception{
    // Doc train set vao bo nho
    this.trainset =  divideTrainTestResample(this.dataset, 70, false);
    this.testset = divideTrainTestResample(this.dataset, 70, true); 
    this.trainset.setClassIndex(this.trainset.numAttributes() - 1);
    this.testset.setClassIndex(this.testset.numAttributes() - 1);
    //Huan luyen mo hinh    
    this.rndF = new RandomForest();
    rndF.setOptions(this.model_options);
    rndF.buildClassifier(this.trainset);

    }
   public void evaluateRandomForest() throws Exception{

    //Danh gia mo hinh 10 fold
    Debug.Random rnd = new Debug.Random(1);
    int folds = 10;
    Evaluation eval = new Evaluation(this.trainset);
    eval.crossValidateModel(rndF,this.testset, folds, rnd);
    System.out.println(eval.toSummaryString(
        "\nKết quả đánh giá mô hình 10-fold cros validation RandomForest\n-----\n",false));
    
//Evaluation evaluation = new Evaluation(this.trainset);
// evaluation.evaluateModel(rndF, this.testset);
// System.out.println(evaluation.toSummaryString());
    } 
   
   public void predictClassLabel(String fileIn, String fileOut) throws Exception{
    //Đọc dữ liệu cần dự đoán vào bộ nhớ
    ConverterUtils.DataSource ds = new ConverterUtils.DataSource(fileIn);
    Instances unlabel = ds.getDataSet();
    unlabel.setClassIndex(unlabel.numAttributes() - 1);
    //Dự đoán classLabel cho từng instance
    for(int i = 0; i< unlabel.numInstances(); i++)
    {
        double predict = rndF.classifyInstance(unlabel.instance(i));
        unlabel.instance(i).setClassValue(predict);
    }
        try ( //Xuất kết quả ra file out
                BufferedWriter outWriter = new BufferedWriter(new FileWriter(fileOut))) {
            outWriter.write(unlabel.toString());
            outWriter.newLine();
            outWriter.flush();
        }
    }

    @Override
    public String toString() {
        return this.rndF.toString(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
