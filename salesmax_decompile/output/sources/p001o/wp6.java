package p001o;

/* loaded from: classes4.dex */
public abstract class wp6 {

    /* renamed from: a */
    public static final sp6 f52442a = new up6();

    /* renamed from: b */
    public static final sp6 f52443b = m54789c();

    /* renamed from: a */
    public static sp6 m54787a() {
        sp6 sp6Var = f52443b;
        if (sp6Var != null) {
            return sp6Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static sp6 m54788b() {
        return f52442a;
    }

    /* renamed from: c */
    public static sp6 m54789c() {
        try {
            return (sp6) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
