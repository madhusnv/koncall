package og;

import j3.C3552f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import rw.C6668r;
import yw.AbstractC8806a;
import zw.AbstractC9100a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class md {

    /* renamed from: a */
    public static C3552f f26655a;

    /* renamed from: a */
    public static void m10764a(Throwable th2, Throwable exception) {
        AbstractC4154l.m8923f(th2, "<this>");
        AbstractC4154l.m8923f(exception, "exception");
        if (th2 != exception) {
            Integer num = AbstractC9100a.f43651a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = AbstractC8806a.f42476a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }

    /* renamed from: b */
    public static List m10765b(Exception exc) {
        Object objInvoke;
        Integer num = AbstractC9100a.f43651a;
        if (num != null && num.intValue() < 19) {
            Method method = AbstractC8806a.f42477b;
            return (method == null || (objInvoke = method.invoke(exc, null)) == null) ? C6668r.f31943a : AbstractC6662l.m12711a((Throwable[]) objInvoke);
        }
        Throwable[] suppressed = exc.getSuppressed();
        AbstractC4154l.m8922e(suppressed, "getSuppressed(...)");
        return AbstractC6662l.m12711a(suppressed);
    }

    /* renamed from: c */
    public static String m10766c(Throwable th2) {
        AbstractC4154l.m8923f(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
