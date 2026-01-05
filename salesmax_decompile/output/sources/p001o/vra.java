package p001o;

/* loaded from: classes4.dex */
public abstract class vra {

    /* renamed from: a */
    public static final rra f50792a = m53344c();

    /* renamed from: b */
    public static final rra f50793b = new tra();

    /* renamed from: a */
    public static rra m53342a() {
        return f50792a;
    }

    /* renamed from: b */
    public static rra m53343b() {
        return f50793b;
    }

    /* renamed from: c */
    public static rra m53344c() {
        try {
            return (rra) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
