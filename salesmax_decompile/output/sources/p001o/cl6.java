package p001o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class cl6 {
    /* renamed from: a */
    public static final void m21376a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(th, "<this>");
        sq8.m48649h(th2, "exception");
        if (th != th2) {
            k9d.f31711a.mo26205a(th, th2);
        }
    }

    /* renamed from: b */
    public static final List m21377b(Throwable th) {
        sq8.m48649h(th, "<this>");
        return k9d.f31711a.mo26206c(th);
    }

    /* renamed from: c */
    public static final String m21378c(Throwable th) {
        sq8.m48649h(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
