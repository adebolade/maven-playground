package bertrandbo.playground;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyJavaApp {

    public static void main(String[] args) {
        log.info("Start Application");
        new MyVersion().getProgramVersion();
    }

}
