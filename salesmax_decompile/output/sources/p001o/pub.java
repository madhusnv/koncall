package p001o;

/* loaded from: classes6.dex */
public abstract class pub {

    /* renamed from: a */
    public static final lub f40606a = m44212c();

    /* renamed from: b */
    public static final lub f40607b = new nub();

    /* renamed from: a */
    public static lub m44210a() {
        return f40606a;
    }

    /* renamed from: b */
    public static lub m44211b() {
        return f40607b;
    }

    /* renamed from: c */
    public static lub m44212c() {
        try {
            return (lub) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
