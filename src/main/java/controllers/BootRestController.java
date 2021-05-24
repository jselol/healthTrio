package controllers;

import com.google.gson.reflect.TypeToken;
import com.healthtrio.demo.Region;
import org.json.simple.parser.ParseException;
import com.google.gson.Gson;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class BootRestController {
    public static final String HEALTH_TRIO_API_URL = "https://dashboard.healthit.gov/api/open-api.php";
    public static final double PERIOD_YEAR = 2014;
    @RequestMapping("/")
    /**
     * to make put/post..etc..
     * @RequestMapping("/", method = RequestMethod.POST)
     */
    public String getRestController(Model model) throws IOException, InterruptedException, ParseException {

        model.addAttribute("message", "testtt.");
        return "region_list";

        //
//        HttpClient hClient = HttpClient.newHttpClient();
//        HttpRequest hRequest = HttpRequest.newBuilder()
//                .GET()
//                .header("accept", "application/json")
//                //    https://dashboard.healthit.gov/api/open-api.php?source=AHA_2008-2015.csv&format=json
//                .uri(URI.create(HEALTH_TRIO_API_URL+"?source=AHA_2008-2015.csv&format=json"))
//                .build();
//
//        HttpResponse<String> response = hClient.send(hRequest, HttpResponse.BodyHandlers.ofString());
//
//        Gson gson = new Gson();
//        String json = gson.toJson(response.body());
//
//        Type collectionType = new TypeToken<Collection<Region>>(){}.getType();
//        List<Region> regionCollection = gson.fromJson(response.body(), collectionType);



    }



    public Collection<Region> getRegionCollection() throws IOException, InterruptedException, ParseException {
        HttpClient hClient = HttpClient.newHttpClient();
        HttpRequest hRequest = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                //    https://dashboard.healthit.gov/api/open-api.php?source=AHA_2008-2015.csv&format=json
                .uri(URI.create(HEALTH_TRIO_API_URL+"?source=AHA_2008-2015.csv&format=json"))
                .build();


        HttpResponse<String> response = hClient.send(hRequest, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        String json = gson.toJson(response.body());

        Type collectionType = new TypeToken<Collection<Region>>(){}.getType();
        Collection<Region> regionCollection = gson.fromJson(response.body(), collectionType);
        return regionCollection;
        /**
         * Print out
         * 1.by state
         * 2. in descending order
         * 3.the prcnt of hospitals that support basic EHR notes
         * 4. in the year 2014
         */

//        Iterator<Region> it = regionCollection.iterator();
//
////        while(it.hasNext()) {
//        for(Region tmpRegion : regionCollection) {
////            Region tmpRegion = it.next();
//            /**
//             * I did not take the time to figure out why the parsing of the JSON was throwing errors if any data type besides
//             * String was used for the member variables of Region class.
//             */
//
//            //Get the period to compare, if not 2014, not needed per the requirements.
//            double tmpRegionPeriod = Double.parseDouble(tmpRegion.getPeriod());
//            if(tmpRegionPeriod != PERIOD_YEAR) {
//                regionCollection.remove(tmpRegion);
//            }
//        }
//        sortByRegion(regionCollection);
////
////        List<Region> sortedUsers = regionCollection.stream()
////                .sorted(Comparator.comparing(Region::getRegion).reversed())
////                .collect(Collectors.toList());
//        String s = "s";
    }

    private Collection<Region> sortByRegion(Collection<Region> regions) {
        return  regions.stream()
                .sorted(Comparator.comparing(Region::getRegion).reversed())
                .collect(Collectors.toList());
    }


}

