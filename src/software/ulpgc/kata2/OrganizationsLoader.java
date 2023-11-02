package software.ulpgc.kata2;

import java.io.FileNotFoundException;
import java.util.List;

public interface OrganizationsLoader {
    List<Organizations> load() throws FileNotFoundException;
}
