package p001o;

/* loaded from: classes4.dex */
public abstract class op6 {

    /* renamed from: a */
    public static final Class f38698a = m42536c();

    /* renamed from: a */
    public static pp6 m42534a() {
        pp6 pp6VarM42535b = m42535b("getEmptyRegistry");
        return pp6VarM42535b != null ? pp6VarM42535b : pp6.f40369d;
    }

    /* renamed from: b */
    public static final pp6 m42535b(String str) {
        Class cls = f38698a;
        if (cls == null) {
            return null;
        }
        try {
            return (pp6) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class m42536c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
