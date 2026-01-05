package p001o;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.C2182b;
import androidx.media3.common.Metadata;
import java.util.List;
import p001o.k27;

/* loaded from: classes2.dex */
public interface mad {

    /* renamed from: o.mad$b */
    public static final class C15264b {

        /* renamed from: b */
        public static final C15264b f35062b = new a().m38649e();

        /* renamed from: c */
        public static final String f35063c = sqi.B0(0);

        /* renamed from: a */
        public final k27 f35064a;

        /* renamed from: o.mad$b$a */
        public static final class a {

            /* renamed from: b */
            public static final int[] f35065b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a */
            public final k27.C14706b f35066a = new k27.C14706b();

            /* renamed from: a */
            public a m38645a(int i) {
                this.f35066a.m34926a(i);
                return this;
            }

            /* renamed from: b */
            public a m38646b(C15264b c15264b) {
                this.f35066a.m34927b(c15264b.f35064a);
                return this;
            }

            /* renamed from: c */
            public a m38647c(int... iArr) {
                this.f35066a.m34928c(iArr);
                return this;
            }

            /* renamed from: d */
            public a m38648d(int i, boolean z) {
                this.f35066a.m34929d(i, z);
                return this;
            }

            /* renamed from: e */
            public C15264b m38649e() {
                return new C15264b(this.f35066a.m34930e());
            }
        }

        /* renamed from: b */
        public boolean m38644b(int i) {
            return this.f35064a.m34922a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15264b) {
                return this.f35064a.equals(((C15264b) obj).f35064a);
            }
            return false;
        }

        public int hashCode() {
            return this.f35064a.hashCode();
        }

        public C15264b(k27 k27Var) {
            this.f35064a = k27Var;
        }
    }

    /* renamed from: o.mad$c */
    public static final class C15265c {

        /* renamed from: a */
        public final k27 f35067a;

        public C15265c(k27 k27Var) {
            this.f35067a = k27Var;
        }

        /* renamed from: a */
        public boolean m38650a(int i) {
            return this.f35067a.m34922a(i);
        }

        /* renamed from: b */
        public boolean m38651b(int... iArr) {
            return this.f35067a.m34923b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15265c) {
                return this.f35067a.equals(((C15265c) obj).f35067a);
            }
            return false;
        }

        public int hashCode() {
            return this.f35067a.hashCode();
        }
    }

    /* renamed from: o.mad$d */
    public interface InterfaceC15266d {
        /* renamed from: B */
        default void mo38652B(int i) {
        }

        /* renamed from: C */
        default void mo38653C(boolean z) {
        }

        /* renamed from: D */
        default void mo7823D(euh euhVar) {
        }

        /* renamed from: F */
        default void mo734F(int i) {
        }

        /* renamed from: I */
        default void mo38654I(boolean z) {
        }

        /* renamed from: J */
        default void mo7824J(C15267e c15267e, C15267e c15267e2, int i) {
        }

        /* renamed from: K */
        default void mo735K(iad iadVar) {
        }

        /* renamed from: M */
        default void mo736M(lmh lmhVar, int i) {
        }

        /* renamed from: O */
        default void mo38655O(int i, boolean z) {
        }

        /* renamed from: P */
        default void mo38656P(C2182b c2182b) {
        }

        /* renamed from: Q */
        default void mo38657Q(wx0 wx0Var) {
        }

        /* renamed from: S */
        default void mo7825S() {
        }

        /* renamed from: V */
        default void mo7826V(int i, int i2) {
        }

        /* renamed from: W */
        default void mo38658W(C15264b c15264b) {
        }

        /* renamed from: X */
        default void mo7684X(mad madVar, C15265c c15265c) {
        }

        default void a0(int i) {
        }

        /* renamed from: c */
        default void mo7827c(bvi bviVar) {
        }

        default void c0(iad iadVar) {
        }

        /* renamed from: d */
        default void mo38659d(boolean z) {
        }

        default void e0(boolean z) {
        }

        default void f0(yth ythVar) {
        }

        default void k0(boolean z, int i) {
        }

        /* renamed from: l */
        default void mo38660l(List list) {
        }

        default void l0(sq5 sq5Var) {
        }

        default void o0(boolean z, int i) {
        }

        default void p0(s2b s2bVar, int i) {
        }

        /* renamed from: q */
        default void mo38661q(kad kadVar) {
        }

        default void q0(boolean z) {
        }

        /* renamed from: u */
        default void mo7828u(hd4 hd4Var) {
        }

        /* renamed from: v */
        default void mo38662v(int i) {
        }

        /* renamed from: w */
        default void mo38663w(Metadata metadata) {
        }
    }

    /* renamed from: o.mad$e */
    public static final class C15267e {

        /* renamed from: k */
        public static final String f35068k = sqi.B0(0);

        /* renamed from: l */
        public static final String f35069l = sqi.B0(1);

        /* renamed from: m */
        public static final String f35070m = sqi.B0(2);

        /* renamed from: n */
        public static final String f35071n = sqi.B0(3);

        /* renamed from: o */
        public static final String f35072o = sqi.B0(4);

        /* renamed from: p */
        public static final String f35073p = sqi.B0(5);

        /* renamed from: q */
        public static final String f35074q = sqi.B0(6);

        /* renamed from: a */
        public final Object f35075a;

        /* renamed from: b */
        public final int f35076b;

        /* renamed from: c */
        public final int f35077c;

        /* renamed from: d */
        public final s2b f35078d;

        /* renamed from: e */
        public final Object f35079e;

        /* renamed from: f */
        public final int f35080f;

        /* renamed from: g */
        public final long f35081g;

        /* renamed from: h */
        public final long f35082h;

        /* renamed from: i */
        public final int f35083i;

        /* renamed from: j */
        public final int f35084j;

        public C15267e(Object obj, int i, s2b s2bVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f35075a = obj;
            this.f35076b = i;
            this.f35077c = i;
            this.f35078d = s2bVar;
            this.f35079e = obj2;
            this.f35080f = i2;
            this.f35081g = j;
            this.f35082h = j2;
            this.f35083i = i3;
            this.f35084j = i4;
        }

        /* renamed from: a */
        public boolean m38664a(C15267e c15267e) {
            return this.f35077c == c15267e.f35077c && this.f35080f == c15267e.f35080f && this.f35081g == c15267e.f35081g && this.f35082h == c15267e.f35082h && this.f35083i == c15267e.f35083i && this.f35084j == c15267e.f35084j && r6c.m46255a(this.f35078d, c15267e.f35078d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C15267e.class != obj.getClass()) {
                return false;
            }
            C15267e c15267e = (C15267e) obj;
            return m38664a(c15267e) && r6c.m46255a(this.f35075a, c15267e.f35075a) && r6c.m46255a(this.f35079e, c15267e.f35079e);
        }

        public int hashCode() {
            return r6c.m46256b(this.f35075a, Integer.valueOf(this.f35077c), this.f35078d, this.f35079e, Integer.valueOf(this.f35080f), Long.valueOf(this.f35081g), Long.valueOf(this.f35082h), Integer.valueOf(this.f35083i), Integer.valueOf(this.f35084j));
        }
    }

    /* renamed from: A */
    lmh mo7112A();

    /* renamed from: B */
    void mo7113B(InterfaceC15266d interfaceC15266d);

    /* renamed from: C */
    Looper mo7114C();

    /* renamed from: D */
    yth mo7115D();

    /* renamed from: E */
    void mo31977E();

    /* renamed from: F */
    void mo7116F(TextureView textureView);

    /* renamed from: G */
    void mo7117G(InterfaceC15266d interfaceC15266d);

    /* renamed from: H */
    void mo31978H(int i, long j);

    /* renamed from: I */
    C15264b mo7118I();

    /* renamed from: J */
    boolean mo7119J();

    /* renamed from: K */
    void mo7120K(boolean z);

    /* renamed from: L */
    long mo7121L();

    /* renamed from: M */
    long mo31979M();

    /* renamed from: N */
    int mo7122N();

    /* renamed from: O */
    void mo7123O(TextureView textureView);

    /* renamed from: P */
    bvi mo7124P();

    /* renamed from: Q */
    boolean mo31980Q();

    /* renamed from: R */
    int mo7125R();

    /* renamed from: S */
    long mo7126S();

    /* renamed from: T */
    long mo7127T();

    /* renamed from: U */
    boolean mo31981U();

    /* renamed from: V */
    boolean mo31982V();

    /* renamed from: W */
    int mo7128W();

    /* renamed from: X */
    void mo7129X(SurfaceView surfaceView);

    /* renamed from: Y */
    boolean mo7130Y();

    /* renamed from: Z */
    long mo7131Z();

    /* renamed from: a */
    void mo7132a(yth ythVar);

    void a0(wx0 wx0Var, boolean z);

    /* renamed from: b */
    boolean mo7133b();

    void b0();

    /* renamed from: c */
    int mo7134c();

    void c0();

    /* renamed from: d */
    void mo7135d(kad kadVar);

    C2182b d0();

    /* renamed from: e */
    kad mo7136e();

    long e0();

    /* renamed from: f */
    void mo7137f();

    long f0();

    /* renamed from: g */
    void mo31983g();

    boolean g0();

    long getDuration();

    /* renamed from: h */
    void mo31984h(long j);

    /* renamed from: i */
    long mo7138i();

    /* renamed from: j */
    void mo7139j(int i);

    /* renamed from: k */
    void mo31985k();

    /* renamed from: l */
    int mo7140l();

    /* renamed from: m */
    void mo7141m(List list, boolean z);

    /* renamed from: n */
    void mo31986n(s2b s2bVar);

    /* renamed from: o */
    void mo7142o(SurfaceView surfaceView);

    /* renamed from: p */
    void mo31987p();

    void pause();

    /* renamed from: r */
    iad mo7143r();

    /* renamed from: s */
    void mo7144s(boolean z);

    /* renamed from: t */
    euh mo7145t();

    /* renamed from: u */
    boolean mo31988u();

    /* renamed from: v */
    hd4 mo7146v();

    /* renamed from: w */
    int mo7147w();

    /* renamed from: x */
    boolean mo31989x(int i);

    /* renamed from: y */
    boolean mo31990y();

    /* renamed from: z */
    int mo7148z();
}
