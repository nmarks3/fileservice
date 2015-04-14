/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

/**
 *
 * @author sawyer
 */
public class Demo {
    public static void main(String[] args) {
        FileService fileService = new FileService(
            new TextFileReader("src/mydata.csv", new CsvFileFormat()),
            new TextFileWriter("src/mydata.csv", new CsvFileFormat()));
    }}