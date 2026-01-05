package p001o;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes6.dex */
public abstract class xe0 {
    /* renamed from: b */
    public static final int m56101b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
