package software.ulpgc.kata2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        OrganizationsLoader csvOrganizationsLoader = new CsvOrganizationsLoader(new File("organizations-10000.csv"));
        List<Organizations> organizationsList = csvOrganizationsLoader.load();
        Map<String, Integer> barchart = new CountryOrganizationProcess().process(organizationsList);
        for(String country: barchart.keySet()) {
            System.out.println(country + "=" + barchart.get(country));
        }
    }
}
