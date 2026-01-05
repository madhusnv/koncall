package p001o;

/* loaded from: classes6.dex */
public abstract class np6 {

    /* renamed from: a */
    public static final Class f37131a = m40903c();

    /* renamed from: a */
    public static qp6 m40901a() {
        qp6 qp6VarM40902b = m40902b("getEmptyRegistry");
        return qp6VarM40902b != null ? qp6VarM40902b : qp6.f42267d;
    }

    /* renamed from: b */
    public static final qp6 m40902b(String str) {
        Class cls = f37131a;
        if (cls == null) {
            return null;
        }
        try {
            return (qp6) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class m40903c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
