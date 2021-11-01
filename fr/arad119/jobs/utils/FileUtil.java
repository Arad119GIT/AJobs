package fr.arad119.jobs.utils;

import java.util.*;
import java.io.*;

public class FileUtil
{
    private final Map<String, File> fileMap;
    
    public FileUtil() {
        this.fileMap = new HashMap<String, File>();
    }
    
    public File createFile(final String path, final String extension) {
        final String fileEmplacement = path + "." + extension;
        final File file = new File(fileEmplacement);
        if (!file.exists()) {
            try {
                if (file.getParentFile() != null) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.fileMap.put(fileEmplacement, file);
        return file;
    }
    
    public String getFileContent(final File file) {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            final StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public File getFile(final String path, final String extension) {
        return this.fileMap.get(path + "." + extension);
    }
    
    public List<File> getFilesOfDirectory(final String dirPath) {
        final File file = new File(dirPath);
        if (file.listFiles() == null) {
            return new ArrayList<File>();
        }
        return new ArrayList<File>(Arrays.asList(file.listFiles()));
    }
    
    public void setFileContent(final File file, final String content) {
        try {
            final FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
