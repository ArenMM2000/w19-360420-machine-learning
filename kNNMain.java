import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label
	String PATH_TO_DATA = args[0];
	System.out.println(PATH_TO_DATA);
	List <DataPoint> i = DataSet.readDataSet(PATH_TO_DATA);
	DataPoint dp = i.get(37);
	String printableX = Arrays.toString(dp.getX());
	System.out.println(dp.getLabel());
	System.out.println(printableX);
	
	
    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
	List<DataPoint> testSet = DataPoint.getTestSet(i, 0.3);
	List<DataPoint> trainingSet = DataPoint.getTrainingSet(i, 0.7);


    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}