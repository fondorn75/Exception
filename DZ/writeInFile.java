package DZ;

import java.io.File;
import java.io.FileWriter;

public class writeInFile {

    public void writeInFile(String output) {

        File file = new File("DZ/names.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);

            try {

                fw.append(output + "\n");

            } finally {

                fw.flush();
                fw.close();

            }
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }

}
