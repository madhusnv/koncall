package com.amazonaws.logging;

import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class LogFactory {
    private static final String TAG = "LogFactory";
    private static final Map<String, Log> logMap = new HashMap();
    private static Level globalLogLevel = null;

    public enum Level {
        ALL(Integer.MIN_VALUE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(Api.BaseClientBuilder.API_PRIORITY_OTHER);

        private final int value;

        Level(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static Level getLevel() {
        return globalLogLevel;
    }

    public static synchronized Log getLog(Class<?> cls) {
        return getLog(getTruncatedLogTag(cls.getSimpleName()));
    }

    private static String getTruncatedLogTag(String str) {
        if (str.length() <= 23) {
            return str;
        }
        getLog(TAG).warn("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
        return str.substring(0, 23);
    }

    public static void setLevel(Level level) {
        globalLogLevel = level;
    }

    public static synchronized Log getLog(String str) {
        String truncatedLogTag = getTruncatedLogTag(str);
        Map<String, Log> map = logMap;
        Log log = map.get(truncatedLogTag);
        if (log != null) {
            return log;
        }
        Log consoleLog = Environment.isJUnitTest() ? new ConsoleLog(truncatedLogTag) : new AndroidLog(truncatedLogTag);
        map.put(truncatedLogTag, consoleLog);
        return consoleLog;
    }
}
