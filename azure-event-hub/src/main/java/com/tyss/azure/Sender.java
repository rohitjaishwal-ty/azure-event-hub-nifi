package com.tyss.azure;

import com.azure.messaging.eventhubs.EventData;

import com.azure.messaging.eventhubs.EventDataBatch;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubProducerClient;

public class Sender {
	public static void main(String[] args) {
		final String connectionString = "Endpoint=sb://myfirstazureeventhub.servicebus.windows.net/;SharedAccessKeyName=<AccessKey>";
		final String eventHubName = "projecthub";
		
		EventHubProducerClient producer = new EventHubClientBuilder()
			    .connectionString(connectionString, eventHubName)
			    .buildProducerClient();
		
		EventDataBatch batch = producer.createBatch();
		batch.tryAdd(new EventData("{\r\n" + 
				"  \"type\": \"insert\",\r\n" + 
				"  \"timestamp\": 1536959101000,\r\n" + 
				"  \"binlog_filename\": \"mysql-bin-changelog.234234\",\r\n" + 
				"  \"binlog_position\": 223,\r\n" + 
				"  \"database\": \"test\",\r\n" + 
				"  \"table_name\": \"demo\",\r\n" + 
				"  \"table_id\": 138,\r\n" + 
				"  \"columns\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 1,\r\n" + 
				"      \"name\": \"id\",\r\n" + 
				"      \"column_type\": 12,\r\n" + 
				"      \"value\": \"IboECKS \"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 2,\r\n" + 
				"      \"name\": \"col2\",\r\n" + 
				"      \"column_type\": 93,\r\n" + 
				"      \"value\": \"Thur Mar 20 14:37:02 UTC 2020\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 3,\r\n" + 
				"      \"name\": \"col3\",\r\n" + 
				"      \"column_type\": 4,\r\n" + 
				"      \"value\": 15\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 4,\r\n" + 
				"      \"name\": \"col4\",\r\n" + 
				"      \"column_type\": 4,\r\n" + 
				"      \"value\": 5\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}"));
		
		
		producer.send(batch);
		producer.close();
	}
}
