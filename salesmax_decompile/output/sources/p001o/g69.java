package p001o;

/* loaded from: classes6.dex */
public class g69 extends f69 {

    /* renamed from: o.g69$a */
    public static final class C13629a {

        /* renamed from: a */
        public static final C13629a f24642a = new C13629a();

        /* renamed from: b */
        public static final Integer f24643b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                if (num2.intValue() > 0) {
                    num = num2;
                }
            }
            f24643b = num;
        }
    }

    /* renamed from: d */
    private final boolean m28092d(int i) {
        Integer num = C13629a.f24643b;
        return num == null || num.intValue() >= i;
    }

    @Override // p001o.j9d
    /* renamed from: b */
    public vbe mo28093b() {
        return m28092d(34) ? new bad() : super.mo28093b();
    }
}
