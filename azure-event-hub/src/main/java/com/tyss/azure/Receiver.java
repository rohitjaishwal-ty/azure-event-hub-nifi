package com.tyss.azure;

import java.util.function.Consumer;

import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventProcessorClient;
import com.azure.messaging.eventhubs.EventProcessorClientBuilder;
import com.azure.messaging.eventhubs.models.ErrorContext;
import com.azure.messaging.eventhubs.models.EventContext;

public class Receiver {

	final static String connectionString = "Endpoint=sb://myfirstazureeventhub.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=<AccessKey>";
	final static String eventHubName = "<EventHubName>";

	public static void main(String[] args) throws Exception {

		// function to process events
		Consumer<EventContext> processEvent = eventContext -> {
			System.out.print("Received event: ");
			// print the body of the event
			System.out.println(eventContext.getEventData().getBodyAsString());
			eventContext.updateCheckpoint();
		};

		// function to process errors
		Consumer<ErrorContext> processError = errorContext -> {
			// print the error message
			System.out.println(errorContext.getThrowable().getMessage());
		};

		EventProcessorClient eventProcessorClient = new EventProcessorClientBuilder()
				.connectionString(connectionString, eventHubName)
				.processEvent(processEvent)
				.processError(processError)
				.consumerGroup(EventHubClientBuilder.DEFAULT_CONSUMER_GROUP_NAME)
				.checkpointStore(new InMemoryCheckpointStore())
				.buildEventProcessorClient();

		System.out.println("Starting event processor");
		eventProcessorClient.start();

		System.out.println("Press enter to stop.");
		System.in.read();

		System.out.println("Stopping event processor");
		eventProcessorClient.stop();
		System.out.println("Event processor stopped.");

		System.out.println("Exiting process");
	}
}