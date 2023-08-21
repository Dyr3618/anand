import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
public DynamodbConnection{
BasicAWSCredentials credentials = new BasicAWSCredentials("AKIAVRS5FCV2XRXVA2WE", "A0Y/e+HFCiuAZ1g6RCrjBybAnPAqKyyqIfbJKmaz");
AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
    .withCredentials(new AWSStaticCredentialsProvider(credentials))
    .withRegion(Regions.US_EAST_1) // Replace with your desired region
    .build();
  
}
