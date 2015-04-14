/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author sawyer
 */
public class CsvFileFormat implements FileFormatStrategy{

    @Override
    public List<LinkedHashMap<String, String>> decodeAll(String data) {
        List<LinkedHashMap<String, String>> records = new ArrayList<LinkedHashMap<String, String>>();
        
        String[] lines = data.split("\\n");
        String[] header = lines[0].split(",");
        
        for (int i = 1; i < lines.length; i++) {
            LinkedHashMap<String, String> record = new LinkedHashMap<String, String>();
            String[] rowData = lines[i].split(",");
            for (int j = 0; j < rowData.length; j++) {
                record.put(header[j], rowData[j]);
            }
            records.add(record);
        }
        return records;
    }

    @Override
    public String encodeAll(List<LinkedHashMap<String, String>> updatedFilecontent, boolean useHeader) {
        StringBuilder encodedData = new StringBuilder();
    }

    @Override
    public String encodeRecord(LinkedHashMap<String, String> updatedFileContent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
