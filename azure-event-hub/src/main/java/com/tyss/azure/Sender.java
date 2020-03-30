package com.tyss.azure;

import com.azure.messaging.eventhubs.EventData;

import com.azure.messaging.eventhubs.EventDataBatch;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubProducerClient;

public class Sender {
	public static void main(String[] args) {
		
		final String connectionString = "Endpoint=sb://myfirstazureeventhub.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=<AccessKey>";
		final String eventHubName = "<EventHubName>";
		
		EventHubProducerClient producer = new EventHubClientBuilder()
			    .connectionString(connectionString, eventHubName)
			    .buildProducerClient();
		
		EventDataBatch batch = producer.createBatch();
		batch.tryAdd(new EventData("{\r\n" + 
				"  \"meta\": {\r\n" + 
				"    \"timeStamp\": \"2020-02-02T03:18:30Z\",\r\n" + 
				"    \"transactionId\": null\r\n" + 
				"  },\r\n" + 
				"  \"customer\": {\r\n" + 
				"    \"stripesInstance\": \"ap\",\r\n" + 
				"    \"identity\": {\r\n" + 
				"      \"id\": \"ap-163995\",\r\n" + 
				"      \"number\": \"163994\",\r\n" + 
				"      \"internalName\": \"VAT te-toggle-resync\",\r\n" + 
				"      \"legalName\": \"2OVI CHEMICALS SDN. BHD.xp30-case2\",\r\n" + 
				"      \"tradingName\": \"\",\r\n" + 
				"      \"accountGroup\": {\r\n" + 
				"        \"code\": \"0001\"\r\n" + 
				"      },\r\n" + 
				"      \"salesforceId\": \"0014100001hsFV8\"\r\n" + 
				"    },\r\n" + 
				"    \"externalIds\": {\r\n" + 
				"      \"salesforceLubesId\": \"\",\r\n" + 
				"      \"salesforceFuelsId\": \"\"\r\n" + 
				"    },\r\n" + 
				"    \"status\": \"active\",\r\n" + 
				"    \"customerType\": \"\",\r\n" + 
				"    \"blocking\": {\r\n" + 
				"      \"order\": {\r\n" + 
				"        \"details\": {\r\n" + 
				"          \"code\": \"Z9\",\r\n" + 
				"          \"desc\": \"CMWF block\"\r\n" + 
				"        },\r\n" + 
				"        \"blocked\": \"true\"\r\n" + 
				"      },\r\n" + 
				"      \"delivery\": {\r\n" + 
				"        \"details\": {\r\n" + 
				"          \"code\": \"Z9\",\r\n" + 
				"          \"desc\": \"CMWF block\"\r\n" + 
				"        },\r\n" + 
				"        \"blocked\": \"true\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"streetAddress\": \"No. 10, Jalan Sultan Alauddin\",\r\n" + 
				"      \"district\": \"5/KU17, Bandar Sultan Suleiman\",\r\n" + 
				"      \"city\": \"Phase 4, Port Klang, Selangor D.E\",\r\n" + 
				"      \"postalCode\": \"42000\",\r\n" + 
				"      \"region\": {\r\n" + 
				"        \"code\": \"02\",\r\n" + 
				"        \"desc\": \"Sabah\"\r\n" + 
				"      },\r\n" + 
				"      \"country\": {\r\n" + 
				"        \"name\": \"Malaysia\",\r\n" + 
				"        \"ISOcode\": \"MY\"\r\n" + 
				"      },\r\n" + 
				"      \"PObox\": \"BOX1\",\r\n" + 
				"      \"POboxPostalCode\": \"43007\",\r\n" + 
				"      \"timeZone\": \"UTC+8\",\r\n" + 
				"      \"latitude\": 3.00104,\r\n" + 
				"      \"longitude\": 101.425,\r\n" + 
				"      \"zoneCode\": \"AP\",\r\n" + 
				"      \"standardTimeZone\": {\r\n" + 
				"        \"offset\": 28800,\r\n" + 
				"        \"utcDiff\": \"+08:00\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"delivery\": {\r\n" + 
				"      \"transportationZone\": {\r\n" + 
				"        \"code\": \"MY0001\",\r\n" + 
				"        \"desc\": \"MY LPG Saberkat\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"segmentation\": {\r\n" + 
				"      \"customerSegment\": {\r\n" + 
				"        \"code\": \"OPTIMISE\",\r\n" + 
				"        \"desc\": \"Optimise\"\r\n" + 
				"      },\r\n" + 
				"      \"marketSegment\": {\r\n" + 
				"        \"code\": \"BOARDSIZING EMULSION\",\r\n" + 
				"        \"desc\": \"BOARDSIZING EMULSION\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"hierarchy\": {\r\n" + 
				"      \"parent\": {\r\n" + 
				"        \"name\": \"YANKEE\"\r\n" + 
				"      },\r\n" + 
				"      \"highestParent\": {\r\n" + 
				"        \"name\": \"11VITESTXPHIGHTPARENT\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"contact\": {\r\n" + 
				"      \"general\": {\r\n" + 
				"        \"primaryLanguage\": {\r\n" + 
				"          \"name\": \"English\",\r\n" + 
				"          \"ISOcode\": \"EN\"\r\n" + 
				"        },\r\n" + 
				"        \"telephones\": [\r\n" + 
				"          {\r\n" + 
				"            \"countryCode\": \"MY\",\r\n" + 
				"            \"number\": \"+6060331790819\",\r\n" + 
				"            \"extension\": \"\",\r\n" + 
				"            \"type\": \"\",\r\n" + 
				"            \"default\": true\r\n" + 
				"          }\r\n" + 
				"        ],\r\n" + 
				"        \"emails\": [\r\n" + 
				"          {\r\n" + 
				"            \"address\": \"rebecca.samuel@govi.com\",\r\n" + 
				"            \"default\": true\r\n" + 
				"          }\r\n" + 
				"        ]\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"marketing\": {\r\n" + 
				"      \"industry\": {\r\n" + 
				"        \"code\": \"390\",\r\n" + 
				"        \"desc\": \"Traders\"\r\n" + 
				"      },\r\n" + 
				"      \"industry1\": null\r\n" + 
				"    },\r\n" + 
				"    \"salesAreas\": [\r\n" + 
				"      {\r\n" + 
				"        \"salesAreaStatus\": \"active\",\r\n" + 
				"        \"salesOrganization\": {\r\n" + 
				"          \"code\": \"1775\",\r\n" + 
				"          \"desc\": \"EM Asia Pac Pte Ltd\"\r\n" + 
				"        },\r\n" + 
				"        \"distributionChannel\": {\r\n" + 
				"          \"code\": \"03\",\r\n" + 
				"          \"desc\": \"Non-Retail\"\r\n" + 
				"        },\r\n" + 
				"        \"division\": {\r\n" + 
				"          \"code\": \"04\",\r\n" + 
				"          \"desc\": \"Lubes\"\r\n" + 
				"        },\r\n" + 
				"        \"blocking\": {\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"details\": null,\r\n" + 
				"            \"blocked\": false\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"marketing\": {\r\n" + 
				"          \"customerGroup\": {\r\n" + 
				"            \"code\": \"W4\",\r\n" + 
				"            \"desc\": \"Other Specialties\",\r\n" + 
				"            \"distributorFlag\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"salesDistrict\": {\r\n" + 
				"            \"code\": \"G00000\",\r\n" + 
				"            \"desc\": \"Dummy value for GMB\"\r\n" + 
				"          },\r\n" + 
				"          \"salesGroup\": {\r\n" + 
				"            \"code\": \"X11\",\r\n" + 
				"            \"desc\": \"Ex Sales Singapore\"\r\n" + 
				"          },\r\n" + 
				"          \"salesOffice\": {\r\n" + 
				"            \"code\": \"G0A\",\r\n" + 
				"            \"desc\": \"SPECIALTY LUBES CUST\"\r\n" + 
				"          },\r\n" + 
				"          \"salesforceAccount\": null,\r\n" + 
				"          \"customerGroup1\": {\r\n" + 
				"            \"code\": \"YJ\",\r\n" + 
				"            \"desc\": \"International\"\r\n" + 
				"          },\r\n" + 
				"          \"customerGroup2\": null,\r\n" + 
				"          \"valueChain\": {\r\n" + 
				"            \"LVC\": {\r\n" + 
				"              \"businessUnit\": \"Specialty\",\r\n" + 
				"              \"MBU\": \"B&S MBU\",\r\n" + 
				"              \"GBU\": \"Basestocks & Specialties\"\r\n" + 
				"            },\r\n" + 
				"            \"FVC\": null\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"partners\": {\r\n" + 
				"          \"deliveryAddresses\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-163994\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/deliveryAddresses/ap-163994\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-173594\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/deliveryAddresses/ap-173594\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-218984\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/deliveryAddresses/ap-218984\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-234419\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/deliveryAddresses/ap-234419\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"brokerCommissions\": [],\r\n" + 
				"          \"distributors\": [],\r\n" + 
				"          \"orderDCPs\": [],\r\n" + 
				"          \"supervisorDCPs\": [],\r\n" + 
				"          \"payers\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-163994\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/payers/ap-163994\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"salesReps\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-10294\",\r\n" + 
				"              \"number\": \"10294\",\r\n" + 
				"              \"name\": \"Christy Wang\",\r\n" + 
				"              \"additionalName\": \"\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"MSDSrecipients\": [],\r\n" + 
				"          \"nationalSalesReps\": []\r\n" + 
				"        },\r\n" + 
				"        \"pricing\": {\r\n" + 
				"          \"priceGroup\": {\r\n" + 
				"            \"code\": \"XB\",\r\n" + 
				"            \"desc\": \"AM CHILE PCIMA EMLT\"\r\n" + 
				"          },\r\n" + 
				"          \"priceList\": null,\r\n" + 
				"          \"pricingProcedure\": {\r\n" + 
				"            \"code\": \"8\",\r\n" + 
				"            \"desc\": \"CRM Lubes Direct\"\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"delivery\": {\r\n" + 
				"          \"deliveringPlant\": {\r\n" + 
				"            \"code\": \"0Z34\",\r\n" + 
				"            \"desc\": \"\"\r\n" + 
				"          },\r\n" + 
				"          \"deliveryPriority\": {\r\n" + 
				"            \"code\": \"02\",\r\n" + 
				"            \"desc\": \"Group B\"\r\n" + 
				"          },\r\n" + 
				"          \"shippingCondition\": {\r\n" + 
				"            \"code\": \"60\",\r\n" + 
				"            \"desc\": \"Road Pickup\"\r\n" + 
				"          },\r\n" + 
				"          \"partialDelivery\": {\r\n" + 
				"            \"code\": \"\",\r\n" + 
				"            \"desc\": \"Partial delivery allowed\",\r\n" + 
				"            \"maximumPartialDeliveries\": \"0\",\r\n" + 
				"            \"completeDeliveryRequired\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"modeOfTransportation\": {\r\n" + 
				"            \"code\": \"A1\",\r\n" + 
				"            \"desc\": \"AIR\"\r\n" + 
				"          },\r\n" + 
				"          \"GOMlocation\": {\r\n" + 
				"            \"code\": \"RFSGAYC01\",\r\n" + 
				"            \"desc\": \"SINGAPORE REFINERY (PAC), SINGAPORE\"\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"billing\": {\r\n" + 
				"          \"incoterms\": {\r\n" + 
				"            \"code\": \" -\",\r\n" + 
				"            \"desc\": \"See clause(s) below\"\r\n" + 
				"          },\r\n" + 
				"          \"currency\": {\r\n" + 
				"            \"desc\": \"US Dollars\",\r\n" + 
				"            \"ISOcode\": \"USD\"\r\n" + 
				"          },\r\n" + 
				"          \"paymentTerms\": {\r\n" + 
				"            \"code\": \"Y073\",\r\n" + 
				"            \"desc\": \"Due 15 next mth of invoice\"\r\n" + 
				"          },\r\n" + 
				"          \"invoiceGrouping\": {\r\n" + 
				"            \"code\": \"004\",\r\n" + 
				"            \"desc\": \"Sales Order number\"\r\n" + 
				"          },\r\n" + 
				"          \"invoiceSchedule\": null\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"salesAreaStatus\": \"inactive\",\r\n" + 
				"        \"salesOrganization\": {\r\n" + 
				"          \"code\": \"1775\",\r\n" + 
				"          \"desc\": \"EM Asia Pac Pte Ltd\"\r\n" + 
				"        },\r\n" + 
				"        \"distributionChannel\": {\r\n" + 
				"          \"code\": \"04\",\r\n" + 
				"          \"desc\": \"Supply & Refining\"\r\n" + 
				"        },\r\n" + 
				"        \"division\": {\r\n" + 
				"          \"code\": \"04\",\r\n" + 
				"          \"desc\": \"Lubes\"\r\n" + 
				"        },\r\n" + 
				"        \"blocking\": {\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"details\": {\r\n" + 
				"              \"code\": \"Z1\",\r\n" + 
				"              \"desc\": \"C.Master block\"\r\n" + 
				"            },\r\n" + 
				"            \"blocked\": true\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"marketing\": {\r\n" + 
				"          \"customerGroup\": {\r\n" + 
				"            \"code\": \"K0\",\r\n" + 
				"            \"desc\": \"Export\",\r\n" + 
				"            \"distributorFlag\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"salesDistrict\": {\r\n" + 
				"            \"code\": \"G00000\",\r\n" + 
				"            \"desc\": \"Dummy value for GMB\"\r\n" + 
				"          },\r\n" + 
				"          \"salesGroup\": {\r\n" + 
				"            \"code\": \"X11\",\r\n" + 
				"            \"desc\": \"Ex Sales Singapore\"\r\n" + 
				"          },\r\n" + 
				"          \"salesOffice\": {\r\n" + 
				"            \"code\": \"G07\",\r\n" + 
				"            \"desc\": \"WAX CUSTOMERS\"\r\n" + 
				"          },\r\n" + 
				"          \"salesforceAccount\": null,\r\n" + 
				"          \"customerGroup1\": {\r\n" + 
				"            \"code\": \"YJ\",\r\n" + 
				"            \"desc\": \"International\"\r\n" + 
				"          },\r\n" + 
				"          \"customerGroup2\": null,\r\n" + 
				"          \"valueChain\": {\r\n" + 
				"            \"LVC\": null,\r\n" + 
				"            \"FVC\": null\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"partners\": {\r\n" + 
				"          \"deliveryAddresses\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-163994\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/deliveryAddresses/ap-163994\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"brokerCommissions\": [],\r\n" + 
				"          \"distributors\": [],\r\n" + 
				"          \"orderDCPs\": [],\r\n" + 
				"          \"supervisorDCPs\": [],\r\n" + 
				"          \"payers\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-163994\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/payers/ap-163994\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"salesReps\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-10300\",\r\n" + 
				"              \"number\": \"10300\",\r\n" + 
				"              \"name\": \"Mohamad Rashed\",\r\n" + 
				"              \"additionalName\": \"\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"MSDSrecipients\": [],\r\n" + 
				"          \"nationalSalesReps\": []\r\n" + 
				"        },\r\n" + 
				"        \"pricing\": {\r\n" + 
				"          \"priceGroup\": {\r\n" + 
				"            \"code\": \"XB\",\r\n" + 
				"            \"desc\": \"AM CHILE PCIMA EMLT\"\r\n" + 
				"          },\r\n" + 
				"          \"priceList\": null,\r\n" + 
				"          \"pricingProcedure\": {\r\n" + 
				"            \"code\": \"8\",\r\n" + 
				"            \"desc\": \"CRM Lubes Direct\"\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"delivery\": {\r\n" + 
				"          \"deliveringPlant\": {\r\n" + 
				"            \"code\": \"0Z39\",\r\n" + 
				"            \"desc\": \"BASESTOCK & SPEC PAC:EOT:1775\"\r\n" + 
				"          },\r\n" + 
				"          \"deliveryPriority\": {\r\n" + 
				"            \"code\": \"02\",\r\n" + 
				"            \"desc\": \"Group B\"\r\n" + 
				"          },\r\n" + 
				"          \"shippingCondition\": {\r\n" + 
				"            \"code\": \"02\",\r\n" + 
				"            \"desc\": \"Road Del Unmtr/Pkg\"\r\n" + 
				"          },\r\n" + 
				"          \"partialDelivery\": {\r\n" + 
				"            \"code\": \"\",\r\n" + 
				"            \"desc\": \"Partial delivery allowed\",\r\n" + 
				"            \"maximumPartialDeliveries\": \"9\",\r\n" + 
				"            \"completeDeliveryRequired\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"modeOfTransportation\": null,\r\n" + 
				"          \"GOMlocation\": {\r\n" + 
				"            \"code\": \"RFSGAYC01\",\r\n" + 
				"            \"desc\": \"SINGAPORE REFINERY (PAC), SINGAPORE\"\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"billing\": {\r\n" + 
				"          \"incoterms\": {\r\n" + 
				"            \"code\": \" -\",\r\n" + 
				"            \"desc\": \"See clause(s) below\"\r\n" + 
				"          },\r\n" + 
				"          \"currency\": {\r\n" + 
				"            \"desc\": \"US Dollars\",\r\n" + 
				"            \"ISOcode\": \"USD\"\r\n" + 
				"          },\r\n" + 
				"          \"paymentTerms\": {\r\n" + 
				"            \"code\": \"Y001\",\r\n" + 
				"            \"desc\": \"\"\r\n" + 
				"          },\r\n" + 
				"          \"invoiceGrouping\": {\r\n" + 
				"            \"code\": \"004\",\r\n" + 
				"            \"desc\": \"Sales Order number\"\r\n" + 
				"          },\r\n" + 
				"          \"invoiceSchedule\": null\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"salesAreaStatus\": \"active\",\r\n" + 
				"        \"salesOrganization\": {\r\n" + 
				"          \"code\": \"1775\",\r\n" + 
				"          \"desc\": \"EM Asia Pac Pte Ltd\"\r\n" + 
				"        },\r\n" + 
				"        \"distributionChannel\": {\r\n" + 
				"          \"code\": \"04\",\r\n" + 
				"          \"desc\": \"Supply & Refining\"\r\n" + 
				"        },\r\n" + 
				"        \"division\": {\r\n" + 
				"          \"code\": \"09\",\r\n" + 
				"          \"desc\": \"Non-Petrol/Services\"\r\n" + 
				"        },\r\n" + 
				"        \"blocking\": {\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"details\": {\r\n" + 
				"              \"code\": \"Z2\",\r\n" + 
				"              \"desc\": \"All order block\"\r\n" + 
				"            },\r\n" + 
				"            \"blocked\": true\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"marketing\": {\r\n" + 
				"          \"customerGroup\": {\r\n" + 
				"            \"code\": \"K0\",\r\n" + 
				"            \"desc\": \"Export\",\r\n" + 
				"            \"distributorFlag\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"salesDistrict\": {\r\n" + 
				"            \"code\": \"G00000\",\r\n" + 
				"            \"desc\": \"Dummy value for GMB\"\r\n" + 
				"          },\r\n" + 
				"          \"salesGroup\": {\r\n" + 
				"            \"code\": \"Z11\",\r\n" + 
				"            \"desc\": \"XOM - Singapore\"\r\n" + 
				"          },\r\n" + 
				"          \"salesOffice\": {\r\n" + 
				"            \"code\": \"G0B\",\r\n" + 
				"            \"desc\": \"L&OF\"\r\n" + 
				"          },\r\n" + 
				"          \"salesforceAccount\": null,\r\n" + 
				"          \"customerGroup1\": null,\r\n" + 
				"          \"customerGroup2\": null,\r\n" + 
				"          \"valueChain\": {\r\n" + 
				"            \"LVC\": null,\r\n" + 
				"            \"FVC\": null\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"partners\": {\r\n" + 
				"          \"deliveryAddresses\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-163994\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/deliveryAddresses/ap-163994\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"brokerCommissions\": [],\r\n" + 
				"          \"distributors\": [],\r\n" + 
				"          \"orderDCPs\": [],\r\n" + 
				"          \"supervisorDCPs\": [],\r\n" + 
				"          \"payers\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-163994\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/payers/ap-163994\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"salesReps\": [],\r\n" + 
				"          \"MSDSrecipients\": [],\r\n" + 
				"          \"nationalSalesReps\": []\r\n" + 
				"        },\r\n" + 
				"        \"pricing\": {\r\n" + 
				"          \"priceGroup\": {\r\n" + 
				"            \"code\": \"XB\",\r\n" + 
				"            \"desc\": \"AM CHILE PCIMA EMLT\"\r\n" + 
				"          },\r\n" + 
				"          \"priceList\": null,\r\n" + 
				"          \"pricingProcedure\": {\r\n" + 
				"            \"code\": \"1\",\r\n" + 
				"            \"desc\": \"Direct Sale\"\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"delivery\": {\r\n" + 
				"          \"deliveringPlant\": null,\r\n" + 
				"          \"deliveryPriority\": null,\r\n" + 
				"          \"shippingCondition\": null,\r\n" + 
				"          \"partialDelivery\": {\r\n" + 
				"            \"code\": \"\",\r\n" + 
				"            \"desc\": \"Partial delivery allowed\",\r\n" + 
				"            \"maximumPartialDeliveries\": \"0\",\r\n" + 
				"            \"completeDeliveryRequired\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"modeOfTransportation\": {\r\n" + 
				"            \"code\": \"E2\",\r\n" + 
				"            \"desc\": \"Rail\"\r\n" + 
				"          },\r\n" + 
				"          \"GOMlocation\": {\r\n" + 
				"            \"code\": \"RFSGAYC01\",\r\n" + 
				"            \"desc\": \"SINGAPORE REFINERY (PAC), SINGAPORE\"\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"billing\": {\r\n" + 
				"          \"incoterms\": {\r\n" + 
				"            \"code\": \" -\",\r\n" + 
				"            \"desc\": \"See clause(s) below\"\r\n" + 
				"          },\r\n" + 
				"          \"currency\": {\r\n" + 
				"            \"desc\": \"US Dollars\",\r\n" + 
				"            \"ISOcode\": \"USD\"\r\n" + 
				"          },\r\n" + 
				"          \"paymentTerms\": {\r\n" + 
				"            \"code\": \"Y001\",\r\n" + 
				"            \"desc\": \"\"\r\n" + 
				"          },\r\n" + 
				"          \"invoiceGrouping\": null,\r\n" + 
				"          \"invoiceSchedule\": null\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"companyData\": [\r\n" + 
				"      {\r\n" + 
				"        \"companyCode\": {\r\n" + 
				"          \"code\": \"1775\",\r\n" + 
				"          \"desc\": \"ExxonMobil Asia Pac. P L\"\r\n" + 
				"        },\r\n" + 
				"        \"lockbox\": null,\r\n" + 
				"        \"paymentTerms\": {\r\n" + 
				"          \"code\": \"Y073\",\r\n" + 
				"          \"desc\": \"Due 15 next mth of invoice\"\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  },\r\n" + 
				"  \"delivery\": {\r\n" + 
				"    \"stripesInstance\": \"ap\",\r\n" + 
				"    \"identity\": {\r\n" + 
				"      \"id\": \"ap-219008\",\r\n" + 
				"      \"number\": \"219008\",\r\n" + 
				"      \"internalName\": \"H&R CHINA (NINGBO) CO., LTD.\",\r\n" + 
				"      \"legalName\": \"H&R CHINA (NINGBO) CO., LTD.\",\r\n" + 
				"      \"tradingName\": \"\",\r\n" + 
				"      \"accountGroup\": {\r\n" + 
				"        \"code\": \"0002\"\r\n" + 
				"      },\r\n" + 
				"      \"customer\": {\r\n" + 
				"        \"id\": \"ap-166144\",\r\n" + 
				"        \"number\": \"166144\",\r\n" + 
				"        \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/customers/ap-166144\"\r\n" + 
				"      },\r\n" + 
				"      \"salesforceId\": \"\"\r\n" + 
				"    },\r\n" + 
				"    \"externalIds\": {\r\n" + 
				"      \"salesforceLubesId\": \"\",\r\n" + 
				"      \"salesforceFuelsId\": \"\"\r\n" + 
				"    },\r\n" + 
				"    \"status\": \"active\",\r\n" + 
				"    \"blocking\": {\r\n" + 
				"      \"order\": {\r\n" + 
				"        \"details\": {\r\n" + 
				"          \"code\": \"Z9\",\r\n" + 
				"          \"desc\": \"CMWF block\"\r\n" + 
				"        },\r\n" + 
				"        \"blocked\": \"true\"\r\n" + 
				"      },\r\n" + 
				"      \"delivery\": {\r\n" + 
				"        \"details\": {\r\n" + 
				"          \"code\": \"Z9\",\r\n" + 
				"          \"desc\": \"CMWF block\"\r\n" + 
				"        },\r\n" + 
				"        \"blocked\": \"true\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"streetAddress\": \"#18, 6 CHUANGYE ROAD,\",\r\n" + 
				"      \"district\": \"FREE-TRADE WEST-ZONE\",\r\n" + 
				"      \"city\": \"NINGBO\",\r\n" + 
				"      \"postalCode\": \"315800\",\r\n" + 
				"      \"region\": null,\r\n" + 
				"      \"country\": {\r\n" + 
				"        \"name\": \"China\",\r\n" + 
				"        \"ISOcode\": \"CN\"\r\n" + 
				"      },\r\n" + 
				"      \"PObox\": \"\",\r\n" + 
				"      \"POboxPostalCode\": \"\",\r\n" + 
				"      \"timeZone\": \"UTC+8\",\r\n" + 
				"      \"latitude\": 30.126018,\r\n" + 
				"      \"longitude\": 91.354875,\r\n" + 
				"      \"zoneCode\": \"AP\",\r\n" + 
				"      \"standardTimeZone\": {\r\n" + 
				"        \"offset\": 28800,\r\n" + 
				"        \"utcDiff\": \"+08:00\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"delivery\": {\r\n" + 
				"      \"transportationZone\": {\r\n" + 
				"        \"code\": \"CN0000\",\r\n" + 
				"        \"desc\": \"China General\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"contact\": {\r\n" + 
				"      \"general\": {\r\n" + 
				"        \"primaryLanguage\": {\r\n" + 
				"          \"name\": \"English\",\r\n" + 
				"          \"ISOcode\": \"EN\"\r\n" + 
				"        },\r\n" + 
				"        \"emails\": [],\r\n" + 
				"        \"telephones\": [\r\n" + 
				"          {\r\n" + 
				"            \"countryCode\": \"CN\",\r\n" + 
				"            \"number\": \"+8657426883938\",\r\n" + 
				"            \"extension\": \"\",\r\n" + 
				"            \"type\": \"\",\r\n" + 
				"            \"default\": true\r\n" + 
				"          }\r\n" + 
				"        ]\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"marketing\": {\r\n" + 
				"      \"industry\": {\r\n" + 
				"        \"code\": \"400\",\r\n" + 
				"        \"desc\": \"Petroleum Refiners\"\r\n" + 
				"      },\r\n" + 
				"      \"industry1\": {\r\n" + 
				"        \"code\": \"T41\",\r\n" + 
				"        \"desc\": \"Lubes Blending Plant\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"salesAreas\": [\r\n" + 
				"      {\r\n" + 
				"        \"salesAreaStatus\": \"active\",\r\n" + 
				"        \"salesOrganization\": {\r\n" + 
				"          \"code\": \"1775\",\r\n" + 
				"          \"desc\": \"EM Asia Pac Pte Ltd\"\r\n" + 
				"        },\r\n" + 
				"        \"distributionChannel\": {\r\n" + 
				"          \"code\": \"03\",\r\n" + 
				"          \"desc\": \"Non-Retail\"\r\n" + 
				"        },\r\n" + 
				"        \"division\": {\r\n" + 
				"          \"code\": \"04\",\r\n" + 
				"          \"desc\": \"Lubes\"\r\n" + 
				"        },\r\n" + 
				"        \"blocking\": {\r\n" + 
				"          \"order\": {\r\n" + 
				"            \"details\": null,\r\n" + 
				"            \"blocked\": false\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"marketing\": {\r\n" + 
				"          \"customerGroup\": {\r\n" + 
				"            \"code\": \"W4\",\r\n" + 
				"            \"desc\": \"Other Specialties\",\r\n" + 
				"            \"distributorFlag\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"salesDistrict\": {\r\n" + 
				"            \"code\": \"G00000\",\r\n" + 
				"            \"desc\": \"Dummy value for GMB\"\r\n" + 
				"          },\r\n" + 
				"          \"salesGroup\": {\r\n" + 
				"            \"code\": \"X31\",\r\n" + 
				"            \"desc\": \"Ex Sales China\"\r\n" + 
				"          },\r\n" + 
				"          \"salesOffice\": {\r\n" + 
				"            \"code\": \"G0A\",\r\n" + 
				"            \"desc\": \"SPECIALTY LUBES CUST\"\r\n" + 
				"          },\r\n" + 
				"          \"salesforceAccount\": null,\r\n" + 
				"          \"customerGroup1\": {\r\n" + 
				"            \"code\": \"YJ\",\r\n" + 
				"            \"desc\": \"International\"\r\n" + 
				"          },\r\n" + 
				"          \"customerGroup2\": null,\r\n" + 
				"          \"valueChain\": {\r\n" + 
				"            \"LVC\": {\r\n" + 
				"              \"businessUnit\": \"Specialty\",\r\n" + 
				"              \"MBU\": \"B&S MBU\",\r\n" + 
				"              \"GBU\": \"Basestocks & Specialties\"\r\n" + 
				"            },\r\n" + 
				"            \"FVC\": null\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"partners\": {\r\n" + 
				"          \"payers\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-173516\",\r\n" + 
				"              \"ref\": \"https://core-customer-service-flcit-cst-uat.apphn.ocp.na.xom.com/v2/payers/ap-173516\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"brokerCommissions\": [],\r\n" + 
				"          \"distributors\": [],\r\n" + 
				"          \"orderDCPs\": [],\r\n" + 
				"          \"supervisorDCPs\": [],\r\n" + 
				"          \"salesReps\": [\r\n" + 
				"            {\r\n" + 
				"              \"id\": \"ap-22229\",\r\n" + 
				"              \"number\": \"22229\",\r\n" + 
				"              \"name\": \"DAWSON HE\",\r\n" + 
				"              \"additionalName\": \"\"\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"MSDSrecipients\": [],\r\n" + 
				"          \"nationalSalesReps\": []\r\n" + 
				"        },\r\n" + 
				"        \"pricing\": {\r\n" + 
				"          \"priceGroup\": {\r\n" + 
				"            \"code\": \"XB\",\r\n" + 
				"            \"desc\": \"AM CHILE PCIMA EMLT\"\r\n" + 
				"          },\r\n" + 
				"          \"pricingProcedure\": {\r\n" + 
				"            \"code\": \"8\",\r\n" + 
				"            \"desc\": \"CRM Lubes Direct\"\r\n" + 
				"          },\r\n" + 
				"          \"priceList\": null\r\n" + 
				"        },\r\n" + 
				"        \"delivery\": {\r\n" + 
				"          \"deliveringPlant\": {\r\n" + 
				"            \"code\": \"0Z34\",\r\n" + 
				"            \"desc\": \"\"\r\n" + 
				"          },\r\n" + 
				"          \"deliveryPriority\": {\r\n" + 
				"            \"code\": \"02\",\r\n" + 
				"            \"desc\": \"Group B\"\r\n" + 
				"          },\r\n" + 
				"          \"shippingCondition\": {\r\n" + 
				"            \"code\": \"60\",\r\n" + 
				"            \"desc\": \"Road Pickup\"\r\n" + 
				"          },\r\n" + 
				"          \"partialDelivery\": {\r\n" + 
				"            \"code\": \"\",\r\n" + 
				"            \"desc\": \"Partial delivery allowed\",\r\n" + 
				"            \"maximumPartialDeliveries\": \"9\",\r\n" + 
				"            \"completeDeliveryRequired\": \"false\"\r\n" + 
				"          },\r\n" + 
				"          \"modeOfTransportation\": null,\r\n" + 
				"          \"GOMlocation\": {\r\n" + 
				"            \"code\": \"RFSGAYC01\",\r\n" + 
				"            \"desc\": \"SINGAPORE REFINERY (PAC), SINGAPORE\"\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"billing\": {\r\n" + 
				"          \"incoterms\": {\r\n" + 
				"            \"code\": \"FCA\",\r\n" + 
				"            \"desc\": \"Free Carrier\"\r\n" + 
				"          },\r\n" + 
				"          \"currency\": {\r\n" + 
				"            \"desc\": \"Singapore Dollar\",\r\n" + 
				"            \"ISOcode\": \"SGD\"\r\n" + 
				"          },\r\n" + 
				"          \"paymentTerms\": null,\r\n" + 
				"          \"invoiceGrouping\": null\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"externalSystem\": {\r\n" + 
				"      \"ASRrelevant\": null\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}"));
		
		
		producer.send(batch);
		producer.close();
	}
}
