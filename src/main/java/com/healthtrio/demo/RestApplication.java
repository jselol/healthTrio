package com.healthtrio.demo;

import controllers.BootRestController;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class RestApplication {
	public static final double PERIOD_YEAR = 2014;
	public static void main(String[] args) throws IOException, InterruptedException, ParseException {

		BootRestController brc = new BootRestController();
////		brc.getRestController();
//
//
//		Collection<Region> regionCollection = brc.getRegionCollection();
//		Collection<Region> periodSortedRegions = remove(regionCollection);

		SpringApplication.run(RestApplication.class, args);
	}

	private static Collection<Region> remove(Collection<Region> tmpRegionCollection){

		if(tmpRegionCollection.size() > 0) {
			Iterator<Region> it = tmpRegionCollection.iterator();
			List<Region> regionsToRemove = new ArrayList<Region>();

			while(it.hasNext()) {
				Region tmpRegion = it.next();
				if(tmpRegion.getPeriod() != null) {
					double tmpRegionPeriod = Double.parseDouble(tmpRegion.getPeriod());
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

}

