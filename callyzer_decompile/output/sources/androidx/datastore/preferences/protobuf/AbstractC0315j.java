package androidx.datastore.preferences.protobuf;

import c6.y1;
import c9.C0917l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.j */
/* loaded from: classes.dex */
public abstract class AbstractC0315j {

    /* renamed from: a */
    public int f2354a;

    /* renamed from: b */
    public Object f2355b;

    public AbstractC0315j(int i10) {
        this.f2354a = i10;
    }

    /* renamed from: A */
    public abstract int mo873A();

    /* renamed from: B */
    public abstract long mo874B();

    /* renamed from: C */
    public abstract boolean mo875C(int i10);

    /* renamed from: D */
    public void m924D() {
        int iMo903z;
        do {
            iMo903z = mo903z();
            if (iMo903z == 0) {
                return;
            }
            int i10 = this.f2354a;
            if (i10 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f2354a = i10 + 1;
            this.f2354a--;
        } while (mo875C(iMo903z));
    }

    /* renamed from: a */
    public abstract void mo883a(int i10);

    /* renamed from: b */
    public abstract int mo884b();

    /* renamed from: c */
    public abstract boolean mo885c();

    /* renamed from: g */
    public abstract y1 mo927g(y1 y1Var);

    /* renamed from: h */
    public abstract C0917l mo928h(C0917l c0917l);

    /* renamed from: i */
    public abstract void mo886i(int i10);

    /* renamed from: j */
    public abstract int mo887j(int i10);

    /* renamed from: k */
    public abstract boolean mo888k();

    /* renamed from: l */
    public abstract C0312g mo889l();

    /* renamed from: m */
    public abstract double mo890m();

    /* renamed from: n */
    public abstract int mo891n();

    /* renamed from: o */
    public abstract int mo892o();

    /* renamed from: p */
    public abstract long mo893p();

    /* renamed from: q */
    public abstract float mo894q();

    /* renamed from: r */
    public abstract int mo895r();

    /* renamed from: s */
    public abstract long mo896s();

    /* renamed from: t */
    public abstract int mo897t();

    /* renamed from: u */
    public abstract long mo898u();

    /* renamed from: v */
    public abstract int mo899v();

    /* renamed from: w */
    public abstract long mo900w();

    /* renamed from: x */
    public abstract String mo901x();

    /* renamed from: y */
    public abstract String mo902y();

    /* renamed from: z */
    public abstract int mo903z();

    /* renamed from: f */
    public void mo926f() {
    }

    /* renamed from: d */
    public void mo925d(c6.i1 i1Var) {
    }
}
