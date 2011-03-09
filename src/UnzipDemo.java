import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class UnzipDemo {
    public static void main(String[] args) {
    	int count = 0;
        String zipname = "D:/tulip.zip";
        URL url = null;
        try {
        	url = new URL("http://dl.dropbox.com/u/1042862/content/tulip.zip");
        	
            FileInputStream fis = new FileInputStream(zipname);
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(url.openStream()));
            
            File file;
            try {
            	System.out.println(url.toURI());
            	file = new File(url.getFile());
				ZipFile zipFile= new ZipFile(file);
	            System.out.println(zipFile.size());
			} catch (Exception e) {
				e.printStackTrace();
			}
			ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                //System.out.println("Unzipping: " + entry.getName());
            }

            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}