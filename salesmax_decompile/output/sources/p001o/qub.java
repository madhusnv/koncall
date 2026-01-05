package p001o;

/* loaded from: classes4.dex */
public abstract class qub {

    /* renamed from: a */
    public static final mub f42452a = m45859c();

    /* renamed from: b */
    public static final mub f42453b = new oub();

    /* renamed from: a */
    public static mub m45857a() {
        return f42452a;
    }

    /* renamed from: b */
    public static mub m45858b() {
        return f42453b;
    }

    /* renamed from: c */
    public static mub m45859c() {
        try {
            return (mub) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
