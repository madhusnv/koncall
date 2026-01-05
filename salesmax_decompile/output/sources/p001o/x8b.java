package p001o;

import android.os.Handler;
import p001o.qbg;

/* loaded from: classes2.dex */
public interface x8b {

    /* renamed from: o.x8b$a */
    public interface InterfaceC18075a {

        /* renamed from: a */
        public static final InterfaceC18075a f53355a = f9b.f22994b;

        /* renamed from: a */
        default InterfaceC18075a mo6936a(qbg.InterfaceC16329a interfaceC16329a) {
            return this;
        }

        /* renamed from: b */
        default InterfaceC18075a mo6937b(boolean z) {
            return this;
        }

        /* renamed from: c */
        InterfaceC18075a mo6938c(sga sgaVar);

        /* renamed from: d */
        InterfaceC18075a mo6939d(pz5 pz5Var);

        /* renamed from: e */
        x8b mo6940e(s2b s2bVar);
    }

    /* renamed from: o.x8b$b */
    public static final class C18076b {

        /* renamed from: a */
        public final Object f53356a;

        /* renamed from: b */
        public final int f53357b;

        /* renamed from: c */
        public final int f53358c;

        /* renamed from: d */
        public final long f53359d;

        /* renamed from: e */
        public final int f53360e;

        public C18076b(Object obj) {
            this(obj, -1L);
        }

        /* renamed from: a */
        public C18076b m55841a(Object obj) {
            return this.f53356a.equals(obj) ? this : new C18076b(obj, this.f53357b, this.f53358c, this.f53359d, this.f53360e);
        }

        /* renamed from: b */
        public boolean m55842b() {
            return this.f53357b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18076b)) {
                return false;
            }
            C18076b c18076b = (C18076b) obj;
            return this.f53356a.equals(c18076b.f53356a) && this.f53357b == c18076b.f53357b && this.f53358c == c18076b.f53358c && this.f53359d == c18076b.f53359d && this.f53360e == c18076b.f53360e;
        }

        public int hashCode() {
            return ((((((((527 + this.f53356a.hashCode()) * 31) + this.f53357b) * 31) + this.f53358c) * 31) + ((int) this.f53359d)) * 31) + this.f53360e;
        }

        public C18076b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public C18076b(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public C18076b(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        public C18076b(Object obj, int i, int i2, long j, int i3) {
            this.f53356a = obj;
            this.f53357b = i;
            this.f53358c = i2;
            this.f53359d = j;
            this.f53360e = i3;
        }
    }

    /* renamed from: o.x8b$c */
    public interface InterfaceC18077c {
        /* renamed from: a */
        void mo30023a(x8b x8bVar, lmh lmhVar);
    }

    /* renamed from: a */
    x4b mo6931a(C18076b c18076b, ob0 ob0Var, long j);

    /* renamed from: b */
    s2b mo6932b();

    /* renamed from: c */
    void mo18730c(Handler handler, mz5 mz5Var);

    /* renamed from: d */
    void mo18731d(mz5 mz5Var);

    /* renamed from: e */
    void mo6933e(x4b x4bVar);

    /* renamed from: f */
    void mo18732f(InterfaceC18077c interfaceC18077c);

    /* renamed from: g */
    void mo18733g(InterfaceC18077c interfaceC18077c);

    /* renamed from: h */
    void mo18734h(InterfaceC18077c interfaceC18077c, juh juhVar, jbd jbdVar);

    /* renamed from: j */
    void mo6934j();

    /* renamed from: l */
    default boolean mo55839l() {
        return true;
    }

    /* renamed from: n */
    default void mo6935n(s2b s2bVar) {
    }

    /* renamed from: p */
    default lmh mo55840p() {
        return null;
    }

    /* renamed from: q */
    void mo18735q(InterfaceC18077c interfaceC18077c);

    /* renamed from: r */
    void mo18736r(e9b e9bVar);

    /* renamed from: s */
    void mo18737s(Handler handler, e9b e9bVar);
}
