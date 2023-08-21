import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
public DynamodbConnection{
    public void makeDBCall(){
BasicAWSCredentials credentials = new BasicAWSCredentials("AKIAVRS5FCV2XRXVA2WE", "A0Y/e+HFCiuAZ1g6RCrjBybAnPAqKyyqIfbJKmaz");
AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
    .withCredentials(new AWSStaticCredentialsProvider(credentials))
    .withRegion(Regions.US_EAST_1) // Replace with your desired region
    .build();
  DynamoDB dynamoDB = new DynamoDB(client);
Table table = dynamoDB.getTable("TUser");

// Put an item into the table
Item item = new Item()
    .withPrimaryKey("id", 123)
    .withString("name", "John Doe");

table.putItem(item);
}
}
