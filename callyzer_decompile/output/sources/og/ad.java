package og;

import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import qd.InterfaceC6187g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ad {

    /* renamed from: a */
    public static final /* synthetic */ int f26321a = 0;

    /* renamed from: a */
    public static final void m10529a(InterfaceC6187g interfaceC6187g, Exception exc) {
        AbstractC4154l.m8923f(interfaceC6187g, "<this>");
        String strM8913b = kotlin.jvm.internal.a0.m8901a(exc.getClass()).m8913b();
        if (strM8913b == null) {
            strM8913b = kotlin.jvm.internal.a0.m8901a(exc.getClass()).m8914c();
        }
        Boolean bool = Boolean.TRUE;
        m10530b(interfaceC6187g, "error", bool);
        String message = exc.getMessage();
        if (message != null) {
            m10530b(interfaceC6187g, "exception.message", message);
        }
        if (strM8913b != null) {
            m10530b(interfaceC6187g, "exception.type", strM8913b);
        }
        m10530b(interfaceC6187g, "exception.stacktrace", md.m10766c(exc));
        Throwable cause = exc.getCause();
        if (cause != null) {
            m10530b(interfaceC6187g, "exception.cause", cause.toString());
        }
        m10530b(interfaceC6187g, "exception.escaped", bool);
    }

    /* renamed from: b */
    public static final void m10530b(InterfaceC6187g interfaceC6187g, String str, Object value) {
        AbstractC4154l.m8923f(interfaceC6187g, "<this>");
        AbstractC4154l.m8923f(value, "value");
        if (AbstractC5178p.m10101L(str)) {
            throw new IllegalArgumentException("AttributeKey name must not be blank");
        }
    }
}
