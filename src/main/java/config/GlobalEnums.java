package main.java.config;

/**
 * @author lionel.mangoua
 * date: 21/07/20
 */

import main.java.Engine.DriverFactory;

public class GlobalEnums extends DriverFactory {

    public static String httpsString = "https://";
    public static String dogsBaseUrl = httpsString + property.returnPropVal_api(api_fileName, "dogsBaseUrlPath");
    public static String dogsPath = property.returnPropVal_api(api_fileName, "dogsUrlPath");

    //region <API>
    public enum Environment {

        DOGS(dogsBaseUrl, dogsPath, "dogs");

        public final String baseUrl;
        public final String path;
        public final String environmentName;

        //Setters
        Environment(String baseUrl, String path, String environmentName) {

            this.baseUrl = baseUrl;
            this.path = path;
            this.environmentName = environmentName;
        }
    }
    //endregion
}
