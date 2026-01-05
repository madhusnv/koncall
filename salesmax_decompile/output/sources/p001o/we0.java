package p001o;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* loaded from: classes6.dex */
public final class we0 extends Handler {

    /* renamed from: a */
    public static final we0 f51826a = new we0();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        sq8.m48649h(logRecord, "record");
        ve0 ve0Var = ve0.f50224a;
        String loggerName = logRecord.getLoggerName();
        sq8.m48648g(loggerName, "getLoggerName(...)");
        int iM56101b = xe0.m56101b(logRecord);
        String message = logRecord.getMessage();
        sq8.m48648g(message, "getMessage(...)");
        ve0Var.m52648a(loggerName, iM56101b, message, logRecord.getThrown());
    }
}
