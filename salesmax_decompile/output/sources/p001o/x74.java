package p001o;

/* loaded from: classes.dex */
public abstract class x74 {

    /* renamed from: a */
    public static final String f53297a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m55793b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f53297a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
