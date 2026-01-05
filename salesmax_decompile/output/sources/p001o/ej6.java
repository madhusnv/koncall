package p001o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class ej6 {

    /* renamed from: o.ej6$a */
    public static final class C13203a extends ej6 implements Serializable {

        /* renamed from: a */
        public static final C13203a f21754a = new C13203a();

        private Object readResolve() {
            return f21754a;
        }

        @Override // p001o.ej6
        /* renamed from: a */
        public boolean mo25126a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // p001o.ej6
        /* renamed from: b */
        public int mo25127b(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: o.ej6$b */
    public static final class C13204b extends ej6 implements Serializable {

        /* renamed from: a */
        public static final C13204b f21755a = new C13204b();

        private Object readResolve() {
            return f21755a;
        }

        @Override // p001o.ej6
        /* renamed from: a */
        public boolean mo25126a(Object obj, Object obj2) {
            return false;
        }

        @Override // p001o.ej6
        /* renamed from: b */
        public int mo25127b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* renamed from: c */
    public static ej6 m25124c() {
        return C13203a.f21754a;
    }

    /* renamed from: f */
    public static ej6 m25125f() {
        return C13204b.f21755a;
    }

    /* renamed from: a */
    public abstract boolean mo25126a(Object obj, Object obj2);

    /* renamed from: b */
    public abstract int mo25127b(Object obj);

    /* renamed from: d */
    public final boolean m25128d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return mo25126a(obj, obj2);
    }

    /* renamed from: e */
    public final int m25129e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return mo25127b(obj);
    }
}
