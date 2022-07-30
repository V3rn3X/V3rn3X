package PL.SDA.streams.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Contains information about whole CSV file
 */
public class CsvFile implements Iterable<CsvLine> {
    private final List<CsvLine> lines;

    public CsvFile() {
        lines = new ArrayList<>();
    }

    /**
     * Appends this file with new CSV line
     *
     * @param line to be added
     */
    public void addLine(CsvLine line) {
        lines.add(line);
    }

    /**
     * Returns line at specified position
     *
     * @param lineNumber 0-based index
     * @return Found @{@link CsvLine} or null if not found
     */
    public CsvLine getLineAt(int lineNumber) {
        if (lineNumber < lines.size()) {
            return lines.get(lineNumber);
        }
        return null;
    }

    public List<CsvLine> getLines() {
        return new ArrayList<>(lines);
    }

    /**
     * Attempts to read provided file in order to convert it to CSV File representation
     *
     * @param inputLocation file that contains data.
     * @return Cnverted file, never null. File might actually does not contain any data.
     */
    public static CsvFile fromFile(File inputLocation) {
        CsvFile convertedFile = new CsvFile();
        try (FileReader inputStream = new FileReader(inputLocation)) {
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            String readLine = null;
            while ((readLine = bufferedReader.readLine()) != null) {
                convertedFile.addLine(CsvLine.fromTextLine(readLine));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convertedFile;
    }

    @Override
    public Iterator<CsvLine> iterator() {
        return lines.iterator();
    }
}
