package software.ulpgc.kata2;

import java.util.List;
import java.util.Map;

public interface OrganizationProcess {
    Map<String, Integer> process(List<Organizations> organizationsList);
}
