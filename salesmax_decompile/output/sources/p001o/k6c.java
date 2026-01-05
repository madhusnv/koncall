package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class k6c {

    /* renamed from: a */
    public static final kh1 f31533a = new C14719a();

    /* renamed from: o.k6c$a */
    public static final class C14719a implements kh1 {
        @Override // p001o.kh1
        /* renamed from: a */
        public boolean mo35039a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    /* renamed from: a */
    public static kh1 m35037a() {
        return f31533a;
    }

    /* renamed from: b */
    public static int m35038b(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
