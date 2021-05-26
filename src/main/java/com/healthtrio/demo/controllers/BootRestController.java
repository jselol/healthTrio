package com.healthtrio.demo.controllers;

import com.google.gson.reflect.TypeToken;
import com.healthtrio.demo.Region.Region;
import org.json.simple.parser.ParseException;
import com.google.gson.Gson;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

@Controller
public class BootRestController {
    public static final String HEALTH_TRIO_API_URL = "https://dashboard.healthit.gov/api/open-api.php";
    public static final double PERIOD_YEAR = 2014;

    /**
     * Main function for logic implementation.  The regions will be obtained via the endpoint, regions not in the correct
     * period year will be removed, and the list will be sorted to descending order by region.
     * @param model
     * @return
     * @throws IOException
     * @throws ParseException
     * @throws InterruptedException
     */
    @GetMapping("/")
    public String getRegions(Model model) throws IOException, ParseException, InterruptedException {

        //Obtain the collection via service endpoint.  JSON is obtained and parsed into a list.
        Collection<Region> regionCollection = getRegionCollection();

        //Remove regions not in the specific year.
        regionCollection = removeRegions(regionCollection);

        //Convert to ArrayList to use the Collections.sort logic below.
        ArrayList<Region> listForSortByDesc = new ArrayList<>(regionCollection);

        //Sort list by region
        Collections.sort(listForSortByDesc, Comparator.comparing(Region::getRegion));

        //Reverse for descending order
        Collections.reverse(listForSortByDesc);

        //Add the list to the model for use in the view
        model.addAttribute("regions", listForSortByDesc);

        //Return the view
        return "regions";
    }

    /**
     * Remove entries in Collection that are not of the specified year.
     * @param tmpRegionCollection
     * @return
     */
    private static Collection<Region> removeRegions(Collection<Region> tmpRegionCollection){
        //Ensure list is not empty
        if(tmpRegionCollection.size() > 0) {

            //Obtain iterator
            Iterator<Region> it = tmpRegionCollection.iterator();
            List<Region> regionsToRemove = new ArrayList<Region>();

            while(it.hasNext()) {
                Region tmpRegion = it.next();
                if(tmpRegion.getPeriod() != null) {

                    //The data type was left as Strign in the class definition, could have been converted upon instantiation.
                    int tmpRegionPeriod = Integer.parseInt(tmpRegion.getPeriod());

                    //If the period year is not of the one specified per requirements, remove it
                    if(tmpRegionPeriod != PERIOD_YEAR) {
                        it.remove();
                    }
                }
            }
            return tmpRegionCollection;
        } else {
            return tmpRegionCollection;
        }
    }

    /**
     * Obtain the initial collection of all regions via the service endpoint provided.  Parse the JSON into Region objects
     * for further manipulation per requirements.
     * @return
     * @throws IOException
     * @throws InterruptedException
     * @throws ParseException
     */
    public Collection<Region> getRegionCollection() throws IOException, InterruptedException, ParseException {
        //Form the request for the raw JSON.
        HttpClient hClient = HttpClient.newHttpClient();
        HttpRequest hRequest = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(HEALTH_TRIO_API_URL+"?source=AHA_2008-2015.csv&format=json"))
                .build();

        //Obtain JSON as response
        HttpResponse<String> response = hClient.send(hRequest, HttpResponse.BodyHandlers.ofString());

        //Using Gson library to parse the JSON.
        Gson gson = new Gson();
        String json = gson.toJson(response.body());

        //Port the JSON into the Region data type and insert all Region objects into a collection to be used.
        Type collectionType = new TypeToken<Collection<Region>>(){}.getType();
        Collection<Region> regionCollection = gson.fromJson(response.body(), collectionType);
        return regionCollection;
    }
}

