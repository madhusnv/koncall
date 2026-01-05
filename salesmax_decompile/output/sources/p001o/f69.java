package p001o;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class f69 extends j9d {

    /* renamed from: o.f69$a */
    public static final class C13349a {

        /* renamed from: a */
        public static final C13349a f22797a = new C13349a();

        /* renamed from: b */
        public static final Integer f22798b;

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
            f22798b = num;
        }
    }

    @Override // p001o.j9d
    /* renamed from: a */
    public void mo26205a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(th, "cause");
        sq8.m48649h(th2, "exception");
        if (m26207d(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo26205a(th, th2);
        }
    }

    @Override // p001o.j9d
    /* renamed from: c */
    public List mo26206c(Throwable th) {
        sq8.m48649h(th, "exception");
        if (!m26207d(19)) {
            return super.mo26206c(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        sq8.m48648g(suppressed, "getSuppressed(...)");
        return fp0.m27255d(suppressed);
    }

    /* renamed from: d */
    public final boolean m26207d(int i) {
        Integer num = C13349a.f22798b;
        return num == null || num.intValue() >= i;
    }
}
