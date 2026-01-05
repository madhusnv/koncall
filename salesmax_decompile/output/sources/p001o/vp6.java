package p001o;

/* loaded from: classes6.dex */
public abstract class vp6 {

    /* renamed from: a */
    public static final rp6 f50692a = new tp6();

    /* renamed from: b */
    public static final rp6 f50693b = m53175c();

    /* renamed from: a */
    public static rp6 m53173a() {
        rp6 rp6Var = f50693b;
        if (rp6Var != null) {
            return rp6Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static rp6 m53174b() {
        return f50692a;
    }

    /* renamed from: c */
    public static rp6 m53175c() {
        try {
            return (rp6) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
