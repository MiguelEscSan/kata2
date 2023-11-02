package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryOrganizationProcess implements OrganizationProcess{

    @Override
    public Map<String, Integer> process(List<Organizations> organizationsList) {
        Map<String, Integer> result = new HashMap<>();
        for(Organizations organizations: organizationsList)  {
            String country = organizations.getCountry();
            result.put(country, result.getOrDefault(country, 0) +1);
        }
        return result;
    }
}
