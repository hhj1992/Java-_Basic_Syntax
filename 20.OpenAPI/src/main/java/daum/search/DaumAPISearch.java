package daum.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class DaumAPISearch {

    public static void main(String[] args) throws Exception{
        
        	//웹검색
        	//String apiURL = "https://dapi.kakao.com/v2/search/image?query=java&page=1&size=1";
        	
        	//이미지검색 URL
            String text = URLEncoder.encode("다람쥐", "UTF-8");
            String daumOpenAPIURL = "https://dapi.kakao.com/v2/search/image?query="+text+"&page=1&size=1";
        	
            // java API 를 이용 HttpRequest
            URL url = new URL(daumOpenAPIURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "KakaoAK 50fd6358febcc04ec6f5ba45432c1a1c");
            
            // Response Code GET
            int responseCode = con.getResponseCode();
            
            BufferedReader br = null;
            
            if(responseCode==200) { 
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            
            //JSON Data 읽기
            String jsonData = "";
            StringBuffer response = new StringBuffer();
            
            while ((jsonData = br.readLine()) != null) {
                response.append(jsonData);
            }
            
            br.close();
            
            // Console 확인
            System.out.println(response.toString());

    }
}