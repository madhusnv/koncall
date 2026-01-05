package p001o;

/* loaded from: classes6.dex */
public abstract class ura {

    /* renamed from: a */
    public static final qra f49406a = m51964c();

    /* renamed from: b */
    public static final qra f49407b = new sra();

    /* renamed from: a */
    public static qra m51962a() {
        return f49406a;
    }

    /* renamed from: b */
    public static qra m51963b() {
        return f49407b;
    }

    /* renamed from: c */
    public static qra m51964c() {
        try {
            return (qra) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
