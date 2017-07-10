package bertrandbo.playground;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.jar.Manifest;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class MyVersion {

    private static final String VERSION = "Version";
    
    public void getProgramVersion() {
        try (InputStream stream = getClass().getResourceAsStream("/META-INF/MANIFEST.MF")) {
            Manifest manifest = new Manifest(stream);
            log.info("Version {} at {}", manifest.getMainAttributes().getValue(VERSION), LocalDateTime.now());
        } catch (IOException e) {
            log.error("Error on MANIFEST opening", e);
        }
    }
}
