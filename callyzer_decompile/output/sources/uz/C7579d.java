package uz;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.d */
/* loaded from: classes3.dex */
public final class C7579d extends Handler {

    /* renamed from: a */
    public static final C7579d f36456a = new C7579d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        AbstractC4154l.m8923f(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC7578c.f36454a;
        String loggerName = record.getLoggerName();
        AbstractC4154l.m8922e(loggerName, "getLoggerName(...)");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i10 = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        AbstractC4154l.m8922e(message, "getMessage(...)");
        AbstractC7578c.m14313a(loggerName, i10, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
