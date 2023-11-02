package software.ulpgc.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvOrganizationsLoader implements OrganizationsLoader{

    private final File file;

    public CsvOrganizationsLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Organizations> load() throws FileNotFoundException {
        return load(new FileReader(file));
    }

    private List<Organizations> load(FileReader fileReader) {
        try {
            return load(new BufferedReader(fileReader));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Organizations> load(BufferedReader bufferedReader) throws IOException {
        List<Organizations> result = new ArrayList<>();
        String line = bufferedReader.readLine();
        while((line = bufferedReader.readLine())  != null) {
            Organizations organizations = toOrganization(line);
            result.add(organizations);
        }
        return result;
    }

    private Organizations toOrganization(String line) {
        return toOrganization(line.split(";"));
    }

    private Organizations toOrganization(String[] split) {
        return new Organizations(
                    split[0],
                    split[1],
                    split[2],
                    split[3],
                    split[4],
                    Integer.parseInt(split[5]),
                    split[6],
                    Integer.parseInt(split[7])
        );
    }
}
