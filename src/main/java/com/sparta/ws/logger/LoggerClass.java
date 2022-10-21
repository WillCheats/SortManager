package com.sparta.ws.logger;
import java.io.IOException;
import java.util.logging.*;

import static java.util.logging.Level.INFO;

public class LoggerClass {
    public FileHandler fh = new FileHandler("src/main/resources/logger.log");

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public LoggerClass() throws IOException {
    }

    public void makeSomeLog(String message) throws IOException {

        fh.setFormatter(new MyFormatter());
        fh.setFilter(new MyFilter());
        LOGGER.addHandler(fh);
    }
    public static void Logger1(String message) throws IOException {
        LoggerClass obj = new LoggerClass();
        obj.makeSomeLog(message);
        LogManager lgmngr = LogManager.getLogManager();
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
        log.log(Level.INFO, message);
    }


}
