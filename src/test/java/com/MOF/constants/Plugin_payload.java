package com.MOF.constants;

public class Plugin_payload extends Plugin_URL {
    public static final String requestPayload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency + "\r\n" +
            "}";
    public static final String Invalidusername_payload = "{\r\n" +
            "\"userName\": \"" + Plugin_URL.Invalidusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";
    public static final String Blankusername_payload = "{\r\n" +
            "\"userName\": \"" + Plugin_URL.Blankusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String InvalidPassword_Payload = "{\r\n" +
            "\"userName\": \"" + Plugin_URL.Validusername + "\",\r\n" +
            "\"password\": \"" + InvalidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";
    public static final String BlankPassword_Payload = "{\r\n" +
            "\"userName\": \"" + Plugin_URL.Validusername + "\",\r\n" +
            "\"password\": \"" + BlankPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String InvalidOrdernumber_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + Plugin_URL.InvalidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Blankordernumber_Payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + BlankOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String Maxordernumber_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + MaxOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String Minordernumber_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + MinOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String specialchar_ordernumber_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + SpecialOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Alphanumeric_ordernumber_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + AlphaOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Decimalordernumber_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + DecimalOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Invalidlanguage_Payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Invalidlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Blanklanguage_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Blanklanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\\r\n" +
            "}";
    public static final String invalidchannel = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ InvalidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String blankchannel = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ BlankChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String invalidgovernmentServices = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ InvalidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";
    public static final String blankgovernmentServices = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ BlankgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String invalidaddTransactionFeesOnTop = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ InvalidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String blankaddTransactionFeesOnTop = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ BlankaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";
    public static final String invalidmerchantSideURL = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ InvalidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";
    public static final String blankmerchantSideURL = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ BlankmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String Invalidservicecode_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Invalidservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String Blankservicecode_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Blankservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Minservicecode_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Minservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";

    public static final String Maxservicecode_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Maxservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Decimalservicecode_Payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Decimalservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Alphanumericservicecode_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Alphaservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\":"+ ValidCurrency +"\r\n" +
            "}";


    public static final String Invalidquantity_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": \""+ ValidgovernmentServices +"\",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": "+ ValidmerchantSideURL +",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + InvalidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Blankquantity_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + BlankQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Minquantity_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + MinQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Maxquantity_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + MaxQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Specialcharquantity_Payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + SpecialCharacterQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String alphanumericquantity_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + AlphaNumericQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Decimalquantity_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + DecimalQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Invalidamount_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + InvalidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Blankamount_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + BlankAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Maxamount_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + MaxAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Minamount_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + MaxAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Specialcharamount_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + SpecialCharacterAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String alphanumericamount_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + AlphaNumericAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";


    public static final String Decimalamount_payload = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + DecimalAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ ValidCurrency +"\r\n" +
            "}";
    public static final String invalidcurrency = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ InvalidCurrency +"\r\n" +
            "}";

    public static final String blankcurrency = "{\r\n" +
            "\"userName\": \"" + Validusername + "\",\r\n" +
            "\"password\": \"" + ValidPassword + "\",\r\n" +
            "\"orderNumber\": \"" + ValidOrdernumber + "\",\r\n" +
            "\"paymentMethodList\": [\r\n" +
            "    \"" + "EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "NON_EDIRHAM_CARD" + "\",\r\n" +
            "    \"" + "EDIRHAM_INSTANT" + "\"\r\n" +
            "],\r\n" +
            "\"channel\": \""+ ValidChannel +"\",\r\n" +
            "\"governmentServices\": "+ ValidgovernmentServices +",\r\n" +
            "\"addTransactionFeesOnTop\": "+ ValidaddTransactionFeesOnTop +",\r\n" +
            "\"merchantSiteUrl\": \""+ ValidmerchantSideURL +"\",\r\n" +
            "\"language\": \"" + Validlanguage + "\",\r\n" +
            "\"purchaseDetails\": {\r\n" +
            "    \"service\": [\r\n" +
            "        {\r\n" +
            "            \"serviceCode\": \"" + Validservicecode + "\",\r\n" +
            "            \"quantity\": " + ValidQuantity + ",\r\n" +
            "            \"serviceAmount\": " + ValidAmount + "\r\n" +
            "        }\r\n" +
            "    ]\r\n" +
            "},\r\n" +
            "\"currency\": "+ BlankCurrency +"\r\n" +
            "}";
}


