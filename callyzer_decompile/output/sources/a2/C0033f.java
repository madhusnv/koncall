package a2;

import android.support.v4.media.session.AbstractC0222a;
import ba.AbstractC0638h;
import g4.C2486b;
import g4.InterfaceC2505u;
import g4.o0;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import o4.C5288d;
import og.zf;
import rw.C6668r;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import x1.r0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.f */
/* loaded from: classes.dex */
public final class C0033f {

    /* renamed from: a */
    public String f131a;

    /* renamed from: b */
    public o0 f132b;

    /* renamed from: c */
    public InterfaceC3987h f133c;

    /* renamed from: d */
    public int f134d;

    /* renamed from: e */
    public boolean f135e;

    /* renamed from: f */
    public int f136f;

    /* renamed from: g */
    public int f137g;

    /* renamed from: i */
    public InterfaceC6747c f139i;

    /* renamed from: j */
    public C2486b f140j;

    /* renamed from: k */
    public boolean f141k;

    /* renamed from: l */
    public long f142l;

    /* renamed from: m */
    public C0029b f143m;

    /* renamed from: n */
    public InterfaceC2505u f144n;

    /* renamed from: o */
    public EnumC6757m f145o;

    /* renamed from: h */
    public long f138h = AbstractC0028a.f103a;

    /* renamed from: p */
    public long f146p = AbstractC6746b.m12930h(0, 0, 0, 0);

    /* renamed from: q */
    public int f147q = -1;

    /* renamed from: r */
    public int f148r = -1;

    public C0033f(String str, o0 o0Var, InterfaceC3987h interfaceC3987h, int i10, boolean z6, int i11, int i12) {
        this.f131a = str;
        this.f132b = o0Var;
        this.f133c = interfaceC3987h;
        this.f134d = i10;
        this.f135e = z6;
        this.f136f = i11;
        this.f137g = i12;
        long j6 = 0;
        this.f142l = (j6 & 4294967295L) | (j6 << 32);
    }

    /* renamed from: e */
    public static long m141e(C0033f c0033f, long j6, EnumC6757m enumC6757m) {
        o0 o0Var = c0033f.f132b;
        C0029b c0029b = c0033f.f143m;
        InterfaceC6747c interfaceC6747c = c0033f.f139i;
        AbstractC4154l.m8920c(interfaceC6747c);
        C0029b c0029bM1853a = AbstractC0638h.m1853a(c0029b, enumC6757m, o0Var, interfaceC6747c, c0033f.f133c);
        c0033f.f143m = c0029bM1853a;
        return c0029bM1853a.m105a(c0033f.f137g, j6);
    }

    /* renamed from: a */
    public final int m142a(int i10, EnumC6757m enumC6757m) {
        int i11 = this.f147q;
        int i12 = this.f148r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jM12923a = AbstractC6746b.m12923a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f137g > 1) {
            jM12923a = m141e(this, jM12923a, enumC6757m);
        }
        InterfaceC2505u interfaceC2505uM145d = m145d(enumC6757m);
        long jM548a = AbstractC0222a.m548a(jM12923a, this.f135e, this.f134d, interfaceC2505uM145d.mo214f());
        boolean z6 = this.f135e;
        int i13 = this.f134d;
        int i14 = this.f136f;
        int iM15457q = r0.m15457q(new C2486b((C5288d) interfaceC2505uM145d, ((z6 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jM548a).m6414b());
        int iM12919j = C6745a.m12919j(jM12923a);
        if (iM15457q < iM12919j) {
            iM15457q = iM12919j;
        }
        this.f147q = i10;
        this.f148r = iM15457q;
        return iM15457q;
    }

    /* renamed from: b */
    public final void m143b() {
        this.f140j = null;
        this.f144n = null;
        this.f145o = null;
        this.f147q = -1;
        this.f148r = -1;
        this.f146p = AbstractC6746b.m12930h(0, 0, 0, 0);
        long j6 = 0;
        this.f142l = (j6 & 4294967295L) | (j6 << 32);
        this.f141k = false;
    }

    /* renamed from: c */
    public final void m144c(InterfaceC6747c interfaceC6747c) {
        long jM104a;
        InterfaceC6747c interfaceC6747c2 = this.f139i;
        if (interfaceC6747c != null) {
            int i10 = AbstractC0028a.f104b;
            jM104a = AbstractC0028a.m104a(interfaceC6747c.mo155a(), interfaceC6747c.mo154O());
        } else {
            jM104a = AbstractC0028a.f103a;
        }
        if (interfaceC6747c2 == null) {
            this.f139i = interfaceC6747c;
            this.f138h = jM104a;
        } else if (interfaceC6747c == null || this.f138h != jM104a) {
            this.f139i = interfaceC6747c;
            this.f138h = jM104a;
            m143b();
        }
    }

    /* renamed from: d */
    public final InterfaceC2505u m145d(EnumC6757m enumC6757m) {
        InterfaceC2505u c5288d = this.f144n;
        if (c5288d == null || enumC6757m != this.f145o || c5288d.mo209a()) {
            this.f145o = enumC6757m;
            String str = this.f131a;
            o0 o0VarM11101c = zf.m11101c(this.f132b, enumC6757m);
            InterfaceC6747c interfaceC6747c = this.f139i;
            AbstractC4154l.m8920c(interfaceC6747c);
            InterfaceC3987h interfaceC3987h = this.f133c;
            C6668r c6668r = C6668r.f31943a;
            c5288d = new C5288d(str, o0VarM11101c, c6668r, c6668r, interfaceC3987h, interfaceC6747c);
        }
        this.f144n = c5288d;
        return c5288d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f140j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        long j6 = this.f138h;
        int i10 = AbstractC0028a.f104b;
        sb2.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j6 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j6 & 4294967295L)) + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
