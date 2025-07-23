package com.MOF.constants;

public class
API_POST_REQUEST_DATA {
	public static final String GetServiceAuth = "{\r\n" + "\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\"\r\n" + "\r\n" + "}";
	public static final String minGetServiceAuthID = "{\r\n" + "\"authId\":\"1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\"\r\n" + "\r\n" + "}";
	public static final String maxGetServiceAuthID = "{\r\n"
			+ "\"authId\":\"1dadERDTgyubudsibubdsfdfsdfdsfdsfdfsdfrtctydvsaubdsadb2808202334567890abcdefjuid12808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\"\r\n" + "\r\n" + "}";
	public static final String minGetServiceAuthpwd = "{\r\n" + "\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"1\"\r\n" + "\r\n" + "}";
	public static final String maxGetServiceAuthpwd = "{\r\n" + "\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"1dadERDTgyubudsibubdsfdfsdfdsfdsfdfsdfrtctydvsaubdsadb\"\r\n" + "\r\n" + "}";
	public static final String blankGetServiceAuthID = "{\r\n" + "\"authId\":\"\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\"\r\n" + "\r\n" + "}";
	public static final String blankGetServiceAuthpwd = "{\r\n" + "\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"\"\r\n" + "\r\n" + "}";
	public static final String deciGetServiceAuthID = "{\r\n" + "\"authId\":\"28082023345678.90abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\"\r\n" + "\r\n" + "}";
	public static final String deciGetServiceAuthpwd = "{\r\n" + "\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"280820233456.7890abcd\"\r\n" + "\r\n" + "}";
	public static final String InvalidGetServiceAuth = "{\r\n" + "\"authId\":\"TestAdmin\",\r\n"
			+ "\"authPassword\":\"Welcome@280820233\"\r\n" + "\r\n" + "}";


	public static final String minPostServiceInquiryAmt = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\r\n" + "\"serviceId\":\"20230828\",\r\n"
			+ "\"uniqueId\":\"28082023\", \"serviceAmount\":0.1 ,\"quantity\":1}";
	public static final String blankPostServiceInquiryAmt = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\r\n" + "\"serviceId\":\"20230828\",\r\n"
			+ "\"uniqueId\":\"28082023\", \"serviceAmount\":\"\" ,\"quantity\":1}";
	public static final String maxPostServiceInquiryAmt = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\r\n" + "\"serviceId\":\"20230828\",\r\n"
			+ "\"uniqueId\":\"28082023\", \"serviceAmount\":10000000000000000000000000000 ,\"quantity\":1}";
	public static final String decimalPostServiceInquiryAmt = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\r\n" + "\"serviceId\":\"20230828\",\r\n"
			+ "\"uniqueId\":\"28082023\", \"serviceAmount\":1.280820233456628082023345662808202334566280820233456628082023345662808202334566 ,\"quantity\":1}";
	public static final String InvalidPostServiceInquiryAmt = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\r\n" + "\"serviceId\":\"20230828\",\r\n"
			+ "\"uniqueId\":\"28082023\", \"serviceAmount\":\"TESTAUTO\" ,\"quantity\":1}";


	public static final String invalidPostServiceIDInquirylist = "{\r\n" + "    \"authId\": \"2808202334567890abcdefjuid1\",\r\n"
			+ "    \"authPassword\": \"2808202334567890abcd\",\r\n" + "    \"uniqueId\": \"87655433322233\",\r\n"
			+ "    \"serviceList\": [\r\n" + "        {\r\n" + "            \"serviceId\": \"28082023280820232808202328082023\",\r\n"
			+ "            \"quantity\": 1\r\n" + "        },\r\n" + "        {\r\n"
			+ "            \"serviceId\": \"20230828\",\r\n" + "            \"quantity\": 2,\r\n"
			+ "            \"serviceAmount\": 100\r\n" + "        }\r\n" + "    ]\r\n" + "}";
	public static final String blankPostServiceIDInquirylist = "{\r\n" + "    \"authId\": \"2808202334567890abcdefjuid1\",\r\n"
			+ "    \"authPassword\": \"2808202334567890abcd\",\r\n" + "    \"uniqueId\": \"28082023\",\r\n"
			+ "    \"serviceList\": [\r\n" + "        {\r\n" + "            \"serviceId\": \"\",\r\n"
			+ "            \"quantity\": 1\r\n" + "        },\r\n" + "        {\r\n"
			+ "            \"serviceId\": \"\",\r\n" + "            \"quantity\": 2,\r\n"
			+ "            \"serviceAmount\": 100\r\n" + "        }\r\n" + "    ]\r\n" + "}";
	public static final String deciPostServiceIDInquirylist = "{\r\n" + "    \"authId\": \"2808202334567890abcdefjuid1\",\r\n"
			+ "    \"authPassword\": \"2808202334567890abcd\",\r\n" + "    \"uniqueId\": \"28082023\",\r\n"
			+ "    \"serviceList\": [\r\n" + "        {\r\n" + "            \"serviceId\": \"28082023\",\r\n"
			+ "            \"quantity\": 1\r\n" + "        },\r\n" + "        {\r\n"
			+ "            \"serviceId\": \"28082023.28082023\",\r\n" + "            \"quantity\": 2,\r\n"
			+ "            \"serviceAmount\": 100\r\n" + "        }\r\n" + "    ]\r\n" + "}";
	public static final String blankServicelistPostServiceInquirylist = "{\r\n" + "    \"authId\": \"2808202334567890abcdefjuid1\",\r\n"
			+ "    \"authPassword\": \"2808202334567890abcd\",\r\n" + "    \"uniqueId\": \"28082023\",\r\n"
			+ "    \"\": [\r\n" + "        {\r\n" + "            \"serviceId\": \"\",\r\n"
			+ "            \"quantity\": 1\r\n" + "        },\r\n" + "        {\r\n"
			+ "            \"serviceId\": \"\",\r\n" + "            \"quantity\": 2,\r\n"
			+ "            \"serviceAmount\": 100\r\n" + "        }\r\n" + "    ]\r\n" + "}";
	public static final String blankUniqueIDPostServiceInquirylist = "{\r\n" + "    \"authId\": \"2808202334567890abcdefjuid1\",\r\n"
			+ "    \"authPassword\": \"2808202334567890abcd\",\r\n" + "    \"uniqueId\": \"\",\r\n"
			+ "    \"serviceList\": [\r\n" + "        {\r\n" + "            \"serviceId\": \"28082023\",\r\n"
			+ "            \"quantity\": 1\r\n" + "        },\r\n" + "        {\r\n"
			+ "            \"serviceId\": \"20230828\",\r\n" + "            \"quantity\": 2,\r\n"
			+ "            \"serviceAmount\": 100\r\n" + "        }\r\n" + "    ]\r\n" + "}";


	public static final String minPostServiceInquiryQty = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\",\"quantity\":\"01\"}";
	public static final String blankPostServiceInquiryQty = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\",\"quantity\":\"\"}";
	public static final String maxPostServiceInquiryQty = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\",\"quantity\":1000000}";
	public static final String decimalPostServiceInquiryQty = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\",\"quantity\":1.7000000}";
	public static final String InvalidPostServiceInquiryQty = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n"
			+ "\"authPassword\":\"2808202334567890abcd\",\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\",\"quantity\":\"TESTAUTO\"}";


	public static final String PostServiceInquiryQty = "{\r\n"
			+ "\"serviceId\":\"1034280820231160\",\"uniqueId\":\"28082023\",\"quantity\":1}";

	public static final String PostServiceInquiryAmt = "{\r\n" + "\"serviceId\":\"28082023\",\r\n"
			+ "\"uniqueId\":\"87655433322233\", \"serviceAmount\":100 ,\"quantity\":1}";

	public static final String PostServiceInquirylist = "{\r\n" + "    \"uniqueId\": \"28082023\",\r\n"
			+ "    \"serviceList\": [\r\n" + "        {\r\n" + "            \"serviceId\": \"28082023\",\r\n"
			+ "            \"quantity\": 1\r\n" + "        },\r\n" + "        {\r\n"
			+ "            \"serviceId\": \"28082023\",\r\n" + "            \"quantity\": 2,\r\n"
			+ "            \"serviceAmount\": 100\r\n" + "        }\r\n" + "    ]\r\n" + "}";

	public static final String PostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"41813355-3db9-4563-a483-1ae4218b402d\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	// ************************************************************Inquiry List
	// positive and negative ******************************

	public static final String PostServiceInquiryList_Null_quantity = "{\"uniqueId\":\"28082023\",\"serviceList\":"
			+ "[{\"serviceId\":\"28082023\",\"quantity\":null},\r\n"
			+ "{\"serviceId\":\"23\",\"quantity\":7,\"serviceAmount\":100000}]}";

	public static final String PostServiceInquiryList__Specialchar_serviceId = "{\"uniqueId\":\"28082023\",\"serviceList\":"
			+ "[{\"serviceId\":\"!@#$%^\",\"quantity\":2},\r\n"
			+ "{\"serviceId\":\"23\",\"quantity\":7,\"serviceAmount\":100000}]}";

	public static final String PostServiceInquiryList_Specialchar_uniqueId = "{\"uniqueId\":\"!@#$%^\",\"serviceList\":"
			+ "[{\"serviceId\":\"28082023\",\"quantity\":2},\r\n"
			+ "{\"serviceId\":\"28082023\",\"quantity\":7,\"serviceAmount\":100000}]}";

	public static final String PostServiceInquiryList_Null_uniqueId = "{\"uniqueId\":\"\",\"serviceList\":"
			+ "[{\"serviceId\":\"28082023\",\"quantity\":2},\r\n"
			+ "{\"serviceId\":\"28082023\",\"quantity\":7,\"serviceAmount\":100000}]}";

	public static final String PostServiceInquiryList_Null_Amount = "{\"uniqueId\":\"28082023\",\"serviceList\":"
			+ "[{\"serviceId\":\"28082023\",\"quantity\":2},\r\n"
			+ "{\"serviceId\":\"28082023\",\"quantity\":7,\"serviceAmount\":null}]}";

	public static final String PostServiceInquiryList_blank_Amount = "{\"uniqueId\":\"28082023\",\"serviceList\":"
			+ "[{\"serviceId\":\"28082023\",\"quantity\":2},\r\n"
			+ "{\"serviceId\":\"28082023\",\"quantity\":7,\"serviceAmount\":}]}";

	public static final String PostServiceInquiryList_Fixed_Amount = "{\"uniqueId\":\"28082023\",\"serviceList\":"
			+ "[{\"serviceId\":\"28082023\",\"quantity\":2,\"serviceAmount\":100000},\r\n"
			+ "{\"serviceId\":\"28082023\",\"quantity\":7,\"serviceAmount\":100}]}";

	public static final String PostServiceInquiryList_Dynamic_Amount = "{\"uniqueId\":\"28082023\",\"serviceList\":"
			+ "[{\"serviceId\":\"28082023\",\"quantity\":2},\r\n" + "{\"serviceId\":\"28082023\",\"quantity\":7}]}";

	// ***********************************************Service Inquiry Fixed Negative
	// Data*********************************************************//

	public static final String PostServiceInquiry_Specialchar_serviceId
			= "{\"serviceId\":\"!@#$%^&*\",\"uniqueId\":\"28082023\",\"quantity\":1}";

	public static final String PostServiceInquiry_Invalid_serviceId
			= "{\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\",\"quantity\":1}";

	public static final String PostService_Specialchar_UniqueID
			= "{\"serviceId\":\"28082023\",\"uniqueId\":\"!@#$%^&\",\"quantity\":1}";

	public static final String PostService_Null_UniqueID
			= "{\"serviceId\":\"28082023\",\"uniqueId\":\" \",\"quantity\":1}";

	public static final String PostService_Null_quantity
			= "{\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\",\"quantity\":null}";

	// public static final String PostService_Null_quantity =
	// "{\"serviceId\":\"3\",\"uniqueId\":\"87655433322233\",\"quantity\":null}";
	// Need to check for '0' for quantity.

	public static final String PostServiceInquiryAmt__quantity5_Dynamic
			= "{\"serviceId\":\"28082023\",\"uniqueId\":\"28082023\", \"serviceAmount\":1000 ,\"quantity\":5}";

	// *****************************************************************Service
	// Inquiry Dynamic amount
	// Positive**************************************************************************

	public static final String PostServiceInquiryAmt__Specialchar_serviceId_Dynamic
			= "{\"serviceId\":\"!@#$%^\",\"uniqueId\":\"28082023\", \"serviceAmount\":10000000 ,\"quantity\":1}";

	public static final String PostServiceInquiryAmt_Specialchar_uniqueId_Dynamic
			= "{\"serviceId\":\"20230828\",\"uniqueId\":\"!@#$%^\", \"serviceAmount\":10000000 ,\"quantity\":1}";

	public static final String PostServiceInquiryAmt_Null_uniqueId_Dynamic
			= "{\"serviceId\":\"20230828\",\"uniqueId\":\"\", \"serviceAmount\":10000000 ,\"quantity\":1}";

	public static final String PostServiceInquiryAmt_Null_quantity_Dynamic
			= "{\"serviceId\":\"20230828\",\"uniqueId\":\"28082023\", \"serviceAmount\":10000000 ,\"quantity\":null}";

	public static final String PostServiceInquiryAmt_Null_Amount_Dynamic
			= "{\"serviceId\":\"20230828\",\"uniqueId\":\"28082023\", \"serviceAmount\":null ,\"quantity\":1}";

	public static final String PostServiceInquiry_quantity5 = "{\"authId\":\"2808202334567890abcdefjuid1\",\r\n" +
			"\"authPassword\":\"2808202334567890abcd\",\r\n" +
			"\"serviceId\":\"20230828\",\"uniqueId\":\"28082023\",\"quantity\":5}";

	// ***********************************************Transaction Status Negative
	// Data********************************************************
	public static final String InvaliduniqueIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";

	public static final String InvalidCatIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"@@@@@@@@@@@\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String InvalidacqTrxnstatusIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"@@@@@@@@@@@\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String InvalidacqTrxnIDIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"@@@@@@@@@@@\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String InvalidacqTrxnamtIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": @@@@,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String InvalidacqTrxndateIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"@@@@@@@@@@@\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String InvalidacqpaymentmodeIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"@@\"}";
	public static final String InvalidacqRRnIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": @@@@@,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";


	public static final String BlankuniqueIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";

	public static final String BlankCatIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String BlankacqTrxnstatusIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String BlankacqTrxnIDIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String BlankacqTrxnamtIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": ,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String BlankacqTrxndateIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";

	public static final String BlankacqpaymentmodeIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"\"}";
	public static final String BlankacqRRnIDPostTransactionStatus = "{\r\n" + "\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": ,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String minuniqueIDPostTransactionStatus = "{\r\n" +"\"uniqueId\":1 \"\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";

	public static final String minCatIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"1\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String minacqTrxnstatusIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"C\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String minacqTrxnIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"1\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String minacqTrxnamtIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1 ,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String minacqTrxndateIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": 1 \"\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String minacqpaymentmodeIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 1,\r\n" +
			"    \"acqPaymentMode\": \"\"}";
	public static final String minacqRRnIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": ,\r\n" +
			"    \"acqPaymentMode\": \"C\"}";
	public static final String maxuniqueIDPostTransactionStatus = "{\r\n" +"\"uniqueId\":\"28082023280820231111111 \"\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";

	public static final String blanktransactionIDPostTransactionStatus = "{\r\n" +"\"uniqueId\":\"28082023280820231111111 \"\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String maxtransactionIDPostTransactionStatus = "{\r\n" +"\"uniqueId\":\"1111111111111111 \"\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"280820232808202311111111111111111\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String mintransactionIDPostTransactionStatus = "{\r\n" +"\"uniqueId\":\"111111111111111 \"\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"1\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String duplicatecatIDPostTransactionStatus = "{\r\n" +"\"uniqueId\":\"28082023280820231111111 \"\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"1111\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";

	public static final String maxCatIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"2808202328082023111111111111111\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String maxacqTrxnstatusIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTUREDCAPTUREDCAPTUREDCAPTUREDCAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +	
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String maxacqTrxnIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"28082023280820231111111111111111111111111\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String maxacqTrxnamtIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 280820232808202311111111111111111111111111111 ,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String maxacqTrxndateIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": 2808202328082023111111111111111111 \"\",\r\n" +
			"    \"acqRRN\": 345634,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
	public static final String maxacqpaymentmodeIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 1,\r\n" +
			"    \"acqPaymentMode\":CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC \"\"}";
	public static final String maxacqRRnIDPostTransactionStatus = "{\r\n" +"\"uniqueId\": \"28082023\",\r\n" +
			"    \"catalogueTransactionId\": \"f2c855d5-a52c-4018-9bcf-322a6db374ed\",\r\n" +
			"    \"acqTransactionstatus\": \"CAPTURED\",\r\n" +
			"    \"acqErrorCode\": \"\",\r\n" +
			"    \"acqErrorText\": \"\",\r\n" +
			"    \"acqTransactionId\": \"201935166561280820232\",\r\n" +
			"    \"acqTransactionAmount\": 1000,\r\n" +
			"    \"acqTransactionCompletionDate\": \"2023-04-19 28082023:23:10\",\r\n" +
			"    \"acqRRN\": 2808202328082023111111111 ,\r\n" +
			"    \"acqPaymentMode\": \"CC\"}";
}

