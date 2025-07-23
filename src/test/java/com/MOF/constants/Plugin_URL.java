package com.MOF.constants;

import static com.MOFutility.Plugin_Excelutilities.plugindata;

public class Plugin_URL {
    public static String Filepathplugin = "D:\\Desktop backup\\Desktop backup\\Automation\\API\\SCA_AUTO\\src\\test\\resources\\PLUGIN_TEST_DATA.xlsx";

    // Define constants with default values
    public static String url;
    public static String Validusername;
    public static String Invalidusername;
    public static String Blankusername;

    public static String ValidPassword;
    public static String InvalidPassword;
    public static String BlankPassword;

    public static String ValidOrdernumber;
    public static String InvalidOrdernumber;
    public static String MaxOrdernumber;
    public static String MinOrdernumber;
    public static String BlankOrdernumber;
    public static String SpecialOrdernumber;
    public static String AlphaOrdernumber;
    public static String DecimalOrdernumber;

    public static String Validlanguage;
    public static String Invalidlanguage;
    public static String Blanklanguage;

    public static String ValidChannel;
    public static String InvalidChannel;
    public static String BlankChannel;

    public static String ValidgovernmentServices;
    public static String InvalidgovernmentServices;
    public static String BlankgovernmentServices;

    public static String ValidaddTransactionFeesOnTop;
    public static String InvalidaddTransactionFeesOnTop;
    public static String BlankaddTransactionFeesOnTop;

    public static String ValidmerchantSideURL;
    public static String InvalidmerchantSideURL;
    public static String BlankmerchantSideURL;

    public static String Validservicecode;
    public static String Invalidservicecode;
    public static String Alphaservicecode;
    public static String Decimalservicecode;
    public static String Maxservicecode;
    public static String Minservicecode;
    public static String Blankservicecode;

    public static String ValidQuantity;
    public static String InvalidQuantity;
    public static String MaxQuantity;
    public static String MinQuantity;
    public static String BlankQuantity;
    public static String SpecialCharacterQuantity;
    public static String AlphaNumericQuantity;
    public static String DecimalQuantity;

    public static String ValidAmount;
    public static String InvalidAmount;
    public static String MaxAmount;
    public static String MinAmount;
    public static String BlankAmount;
    public static String SpecialCharacterAmount;
    public static String AlphaNumericAmount;
    public static String DecimalAmount;

    public static String ValidCurrency;
    public static String InvalidCurrency;
    public static String BlankCurrency;

    public static String ValidcardName;
    public static String InValidcardName;
    public static String SpecialCharactercardname;
    public static String BlankcardName;

    public static String Validcardnumber;
    public static String InValidcardnumber;
    public static String SpecialCharactercardnumber;
    public static String BlankcardNumber;

    public static String Validcvv;
    public static String InValidcvv;
    public static String SpecialCharactercvv;
    public static String Decimalcvv;
    public static String Blankcvv;

    public static String Validmonth;
    public static String InValidmonth;
    public static String Blankmonth;

    public static String Validyear;
    public static String InValidyear;
    public static String Blankyear;



    // Static initialization block to read values from Excel
    static {
        try {
            url = plugindata(Filepathplugin, "Plugin", 0, 1);
            Validusername = plugindata(Filepathplugin, "Plugin", 1, 1);
            Invalidusername = plugindata(Filepathplugin, "Plugin", 2, 1);
            Blankusername = plugindata(Filepathplugin, "Plugin", 3, 1);

            ValidPassword = plugindata(Filepathplugin, "Plugin", 4, 1);
            InvalidPassword = plugindata(Filepathplugin, "Plugin", 5, 1);
            BlankPassword = plugindata(Filepathplugin, "Plugin", 6, 1);

            ValidOrdernumber = plugindata(Filepathplugin, "Plugin", 7, 1);
            InvalidOrdernumber = plugindata(Filepathplugin, "Plugin", 8, 1);
            MaxOrdernumber = plugindata(Filepathplugin, "Plugin", 9, 1);
            MinOrdernumber = plugindata(Filepathplugin, "Plugin", 10, 1);
            BlankOrdernumber = plugindata(Filepathplugin, "Plugin", 11, 1);
            SpecialOrdernumber = plugindata(Filepathplugin, "Plugin", 12, 1);
            AlphaOrdernumber = plugindata(Filepathplugin, "Plugin", 13, 1);
            DecimalOrdernumber = plugindata(Filepathplugin, "Plugin", 14, 1);

            ValidChannel=plugindata(Filepathplugin, "Plugin", 15, 1);
            InvalidChannel=plugindata(Filepathplugin, "Plugin", 16, 1);
            BlankChannel=plugindata(Filepathplugin, "Plugin", 17, 1);

            ValidgovernmentServices=plugindata(Filepathplugin, "Plugin", 18, 1);
            InvalidgovernmentServices=plugindata(Filepathplugin, "Plugin", 19, 1);
            BlankgovernmentServices=plugindata(Filepathplugin, "Plugin", 20, 1);

            ValidaddTransactionFeesOnTop=plugindata(Filepathplugin, "Plugin", 21, 1);
            InvalidaddTransactionFeesOnTop=plugindata(Filepathplugin, "Plugin", 22, 1);
            BlankaddTransactionFeesOnTop=plugindata(Filepathplugin, "Plugin", 23, 1);

            ValidmerchantSideURL=plugindata(Filepathplugin, "Plugin", 24, 1);
            InvalidmerchantSideURL=plugindata(Filepathplugin, "Plugin", 25, 1);
            BlankmerchantSideURL=plugindata(Filepathplugin, "Plugin", 26, 1);

            Validlanguage = plugindata(Filepathplugin, "Plugin", 27, 1);
            Invalidlanguage = plugindata(Filepathplugin, "Plugin", 28, 1);
            Blanklanguage = plugindata(Filepathplugin, "Plugin", 29, 1);

            Validservicecode = plugindata(Filepathplugin, "Plugin", 30, 1);
            Invalidservicecode = plugindata(Filepathplugin, "Plugin", 31, 1);
            Alphaservicecode = plugindata(Filepathplugin, "Plugin", 32, 1);
            Decimalservicecode = plugindata(Filepathplugin, "Plugin", 33, 1);
            Maxservicecode = plugindata(Filepathplugin, "Plugin", 34, 1);
            Minservicecode = plugindata(Filepathplugin, "Plugin", 35, 1);
            Blankservicecode = plugindata(Filepathplugin, "Plugin", 36, 1);

            ValidQuantity = plugindata(Filepathplugin, "Plugin", 37, 1);
            InvalidQuantity = plugindata(Filepathplugin, "Plugin", 38, 1);
            MaxQuantity = plugindata(Filepathplugin, "Plugin", 39, 1);
            MinQuantity = plugindata(Filepathplugin, "Plugin", 40, 1);
            BlankQuantity = plugindata(Filepathplugin, "Plugin", 41, 1);
            SpecialCharacterQuantity = plugindata(Filepathplugin, "Plugin", 42, 1);
            AlphaNumericQuantity = plugindata(Filepathplugin, "Plugin", 43, 1);
            DecimalQuantity = plugindata(Filepathplugin, "Plugin", 44, 1);

            ValidAmount = plugindata(Filepathplugin, "Plugin", 45, 1);
            InvalidAmount = plugindata(Filepathplugin, "Plugin", 46, 1);
            MaxAmount = plugindata(Filepathplugin, "Plugin", 47, 1);
            MinAmount = plugindata(Filepathplugin, "Plugin", 48, 1);
            BlankAmount = plugindata(Filepathplugin, "Plugin", 49, 1);
            SpecialCharacterAmount = plugindata(Filepathplugin, "Plugin", 50, 1);
            AlphaNumericAmount = plugindata(Filepathplugin, "Plugin", 51, 1);
            DecimalAmount = plugindata(Filepathplugin, "Plugin", 52, 1);

            ValidCurrency=plugindata(Filepathplugin, "Plugin", 53, 1);
            InvalidCurrency=plugindata(Filepathplugin, "Plugin", 54, 1);
            BlankCurrency=plugindata(Filepathplugin, "Plugin", 55, 1);

            ValidcardName= plugindata(Filepathplugin, "Plugin", 56, 1);
            InValidcardName = plugindata(Filepathplugin, "Plugin", 57, 1);
            BlankcardName = plugindata(Filepathplugin, "Plugin", 58, 1);
            SpecialCharactercardnumber = plugindata(Filepathplugin, "Plugin", 59, 1);

            Validcardnumber = plugindata(Filepathplugin, "Plugin", 60, 1);
            InValidcardnumber = plugindata(Filepathplugin, "Plugin", 61, 1);
            BlankcardNumber = plugindata(Filepathplugin, "Plugin", 62, 1);
            SpecialCharactercardnumber = plugindata(Filepathplugin, "Plugin", 63, 1);

            Validcvv = plugindata(Filepathplugin, "Plugin", 64, 1);
            InValidcvv = plugindata(Filepathplugin, "Plugin", 65, 1);
            Blankcvv = plugindata(Filepathplugin, "Plugin", 66, 1);
            SpecialCharactercvv = plugindata(Filepathplugin, "Plugin", 67, 1);
            Decimalcvv = plugindata(Filepathplugin, "Plugin", 68, 1);

            Validmonth=plugindata(Filepathplugin, "Plugin", 69, 1);
            InValidmonth=plugindata(Filepathplugin, "Plugin", 70, 1);
            Blankmonth=plugindata(Filepathplugin, "Plugin", 71, 1);

            Validyear=plugindata(Filepathplugin, "Plugin", 72, 1);
            InValidyear=plugindata(Filepathplugin, "Plugin", 73, 1);
            Blankyear=plugindata(Filepathplugin, "Plugin", 74, 1);





        } catch (Exception e) {
            // Log the exception and provide default values
            System.err.println("Error initializing Plugin_URL constants: " + e.getMessage());
            e.printStackTrace();

            // Provide default values to avoid NullPointerException
            url = "http://default-url.com";
            Validusername = "default-valid-username";
            Invalidusername = "default-invalid-username";
            Blankusername = "default-blank-username";

            ValidPassword = "default-min-password";
            InvalidPassword = "default-invalid-password";
            BlankPassword = "default-blank-password";

            ValidOrdernumber = "default-valid-Order-number";
            InvalidOrdernumber = "default-invalid-Order-number";
            MaxOrdernumber = "default-max-Order-number";
            MinOrdernumber = "default-min-Order-number";
            BlankOrdernumber = "default-blank-Order-number";
            SpecialOrdernumber = "default-special-char-Order-number";
            AlphaOrdernumber = "default-alpha-Order-number";
            DecimalOrdernumber = "default-decimal-Order-number";

            Validlanguage = "default-valid-language";
            Invalidlanguage = "default-invalid-language";
            Blanklanguage = "default-blank-language";

            Validservicecode = "default-valid-service-code";
            Invalidservicecode = "default-invalid-service-code";
            Alphaservicecode = "default-alphanumeric-service-code";
            Decimalservicecode = "default-decimal-service-code";
            Maxservicecode = "default-max-service-code";
            Minservicecode = "default-min-service-code";
            Blankservicecode = "default-blank-service-code";

            ValidQuantity = "default-valid-quantity";
            InvalidQuantity = "default-invalid-quantity";
            MaxQuantity = "default-max-quantity";
            MinQuantity = "default-min-quantity";
            BlankQuantity = "default-blank-quantity";
            SpecialCharacterQuantity = "default-special-char-quantity";
            AlphaNumericQuantity = "default-alphanumeric-quantity";
            DecimalQuantity = "default-decimal-quantity";

            ValidAmount = "default-valid-amount";
            InvalidAmount = "default-invalid-amount";
            MaxAmount = "default-max-amount";
            MinAmount = "default-min-amount";
            BlankAmount = "default-blank-amount";
            SpecialCharacterAmount = "default-special-char-amount";
            AlphaNumericAmount = "default-alphanumeric-amount";
            DecimalAmount = "default-decimal-amount";

            ValidcardName = "default-valid-card-name";
            InValidcardName = "default-invalid-card-name";
            SpecialCharactercardname = "default-special-char-card-name";
            BlankcardName = "default-blank-card-name";

            Validcardnumber = "default-valid-card-name";
            InValidcardnumber = "default-invalid-card-number";
            SpecialCharactercardnumber = "default-special-char-card-number";
            BlankcardNumber = "default-blank-card-number";

            Validcvv = "default-valid-cvv";
            InValidcvv = "default-invalid-cvv";
            SpecialCharactercvv = "default-special-char-cvv";
            Decimalcvv = "default-decimal-cvv";
            Blankcvv = "default-blank-char-cvv";

            Validmonth="default-valid-month";
            InValidmonth="default-invalid-month";
            Blankmonth="default-blank-month";

            Validyear="default-valid-year";
            InValidyear="default-invalid-year";
            Blankyear="default-blank-year";




        }
    }
}


