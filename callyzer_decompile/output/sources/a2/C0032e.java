package a2;

import a9.C0073l;
import android.support.v4.media.session.AbstractC0222a;
import ba.AbstractC0638h;
import g4.C2492h;
import g4.C2501q;
import g4.k0;
import g4.l0;
import g4.o0;
import java.util.List;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import og.zf;
import rw.C6668r;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import x1.r0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.e */
/* loaded from: classes.dex */
public final class C0032e {

    /* renamed from: a */
    public C2492h f115a;

    /* renamed from: b */
    public InterfaceC3987h f116b;

    /* renamed from: c */
    public int f117c;

    /* renamed from: d */
    public boolean f118d;

    /* renamed from: e */
    public int f119e;

    /* renamed from: f */
    public int f120f;

    /* renamed from: g */
    public List f121g;

    /* renamed from: h */
    public C0029b f122h;

    /* renamed from: j */
    public InterfaceC6747c f124j;

    /* renamed from: k */
    public o0 f125k;

    /* renamed from: l */
    public C0073l f126l;

    /* renamed from: m */
    public EnumC6757m f127m;

    /* renamed from: n */
    public l0 f128n;

    /* renamed from: i */
    public long f123i = AbstractC0028a.f103a;

    /* renamed from: o */
    public int f129o = -1;

    /* renamed from: p */
    public int f130p = -1;

    public C0032e(C2492h c2492h, o0 o0Var, InterfaceC3987h interfaceC3987h, int i10, boolean z6, int i11, int i12, List list) {
        this.f115a = c2492h;
        this.f116b = interfaceC3987h;
        this.f117c = i10;
        this.f118d = z6;
        this.f119e = i11;
        this.f120f = i12;
        this.f121g = list;
        this.f125k = o0Var;
    }

    /* renamed from: a */
    public final int m136a(int i10, EnumC6757m enumC6757m) {
        int i11 = this.f129o;
        int i12 = this.f130p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jM12923a = AbstractC6746b.m12923a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f120f > 1) {
            C0029b c0029b = this.f122h;
            o0 o0Var = this.f125k;
            InterfaceC6747c interfaceC6747c = this.f124j;
            AbstractC4154l.m8920c(interfaceC6747c);
            C0029b c0029bM1853a = AbstractC0638h.m1853a(c0029b, enumC6757m, o0Var, interfaceC6747c, this.f116b);
            this.f122h = c0029bM1853a;
            jM12923a = c0029bM1853a.m105a(this.f120f, jM12923a);
        }
        int iM15457q = r0.m15457q(m137b(jM12923a, enumC6757m).f13701e);
        int iM12919j = C6745a.m12919j(jM12923a);
        if (iM15457q < iM12919j) {
            iM15457q = iM12919j;
        }
        this.f129o = i10;
        this.f130p = iM15457q;
        return iM15457q;
    }

    /* renamed from: b */
    public final C2501q m137b(long j6, EnumC6757m enumC6757m) {
        C0073l c0073lM139d = m139d(enumC6757m);
        long jM548a = AbstractC0222a.m548a(j6, this.f118d, this.f117c, c0073lM139d.mo214f());
        boolean z6 = this.f118d;
        int i10 = this.f117c;
        int i11 = this.f119e;
        return new C2501q(c0073lM139d, jM548a, ((z6 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10);
    }

    /* renamed from: c */
    public final void m138c(InterfaceC6747c interfaceC6747c) {
        long jM104a;
        InterfaceC6747c interfaceC6747c2 = this.f124j;
        if (interfaceC6747c != null) {
            int i10 = AbstractC0028a.f104b;
            jM104a = AbstractC0028a.m104a(interfaceC6747c.mo155a(), interfaceC6747c.mo154O());
        } else {
            jM104a = AbstractC0028a.f103a;
        }
        if (interfaceC6747c2 == null) {
            this.f124j = interfaceC6747c;
            this.f123i = jM104a;
        } else if (interfaceC6747c == null || this.f123i != jM104a) {
            this.f124j = interfaceC6747c;
            this.f123i = jM104a;
            this.f126l = null;
            this.f128n = null;
            this.f130p = -1;
            this.f129o = -1;
        }
    }

    /* renamed from: d */
    public final C0073l m139d(EnumC6757m enumC6757m) {
        C0073l c0073l = this.f126l;
        if (c0073l == null || enumC6757m != this.f127m || c0073l.mo209a()) {
            this.f127m = enumC6757m;
            C2492h c2492h = this.f115a;
            o0 o0VarM11101c = zf.m11101c(this.f125k, enumC6757m);
            InterfaceC6747c interfaceC6747c = this.f124j;
            AbstractC4154l.m8920c(interfaceC6747c);
            InterfaceC3987h interfaceC3987h = this.f116b;
            List list = this.f121g;
            if (list == null) {
                list = C6668r.f31943a;
            }
            c0073l = new C0073l(c2492h, o0VarM11101c, list, interfaceC6747c, interfaceC3987h);
        }
        this.f126l = c0073l;
        return c0073l;
    }

    /* renamed from: e */
    public final l0 m140e(EnumC6757m enumC6757m, long j6, C2501q c2501q) {
        float fMin = Math.min(c2501q.f13697a.mo214f(), c2501q.f13700d);
        C2492h c2492h = this.f115a;
        o0 o0Var = this.f125k;
        List list = this.f121g;
        if (list == null) {
            list = C6668r.f31943a;
        }
        int i10 = this.f119e;
        boolean z6 = this.f118d;
        int i11 = this.f117c;
        InterfaceC6747c interfaceC6747c = this.f124j;
        AbstractC4154l.m8920c(interfaceC6747c);
        return new l0(new k0(c2492h, o0Var, list, i10, z6, i11, interfaceC6747c, enumC6757m, this.f116b, j6), c2501q, AbstractC6746b.m12926d(j6, (r0.m15457q(fMin) << 32) | (r0.m15457q(c2501q.f13701e) & 4294967295L)));
    }
}
