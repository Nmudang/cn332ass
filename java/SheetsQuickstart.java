//
//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
//import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
//import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
//import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.client.util.store.FileDataStoreFactory;
//import com.google.api.services.sheets.v4.Sheets;
//import com.google.api.services.sheets.v4.SheetsScopes;
//import com.google.api.services.sheets.v4.model.ValueRange;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.security.GeneralSecurityException;
//import java.util.Collections;
//import java.util.List;
//import java.util.Arrays;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.services.sheets.v4.model.AppendValuesResponse;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class SheetsQuickstart {
//
//    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
//    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//    private static final String TOKENS_DIRECTORY_PATH = "tokens";
//    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
//    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";
//  
//    private static Credential getCredentials(HttpTransport HTTP_TRANSPORT) throws IOException {
//        // Load client secrets.
//        InputStream in = SheetsQuickstart.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
//        if (in == null) {
//            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
//        }
//        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
//
//        // Build flow and trigger user authorization request.
//        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
//            HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
//        .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
//        .setAccessType("offline")
//        .build();
//        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
//        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
//    }
//    public static void main(String[] args) throws IOException, GeneralSecurityException {
//        // Build a new authorized API client service.
//        NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
//        String spreadsheetId = "1dh2AtDl30CMvDG_yNW0dZVz29MdB326nEGlxqHOfPZE";
//        String range = "A1";
//        ValueRange requestBody = new ValueRange();
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formatDateTime = now.format(formatter);
//        requestBody.setValues(Arrays.asList(Arrays.asList(formatDateTime,"content")));
//        Sheets sheetsService = createSheetsService();
//        String valueInputOption = "USER_ENTERED";
//        String insertDataOption = "OVERWRITE";
//        Sheets.Spreadsheets.Values.Append request =
//        sheetsService.spreadsheets().values().append(spreadsheetId, range, requestBody);
//        request.setValueInputOption(valueInputOption);
//        request.setInsertDataOption(insertDataOption);
//        AppendValuesResponse response = request.execute();
//        System.out.println(response);
//        
//        requestBody.setValues(Arrays.asList(Arrays.asList("time","content1")));
//        
//        sheetsService.spreadsheets().values().append(spreadsheetId, range, requestBody);
//        request.setValueInputOption(valueInputOption);
//        request.setInsertDataOption(insertDataOption);
//        request.execute();
//        
//        
//    }
//    public static Sheets createSheetsService() throws IOException, GeneralSecurityException {
//        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//        JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();
//        Credential credential = getCredentials(httpTransport);
//
//        return new Sheets.Builder(httpTransport, jsonFactory, credential)
//        .setApplicationName("Google-SheetsSample/0.1")
//        .build();
//    }
//    
//}