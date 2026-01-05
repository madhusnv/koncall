package z4;

import b6.C0602c;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import g5.C2514d;
import java.util.Arrays;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z4.b */
/* loaded from: classes.dex */
public final class C8864b {

    /* renamed from: q */
    public static boolean f42649q = false;

    /* renamed from: d */
    public final C8865c f42653d;

    /* renamed from: m */
    public final C7439j f42662m;

    /* renamed from: p */
    public C8863a f42665p;

    /* renamed from: a */
    public int f42650a = IMAPStore.RESPONSE;

    /* renamed from: b */
    public boolean f42651b = false;

    /* renamed from: c */
    public int f42652c = 0;

    /* renamed from: e */
    public int f42654e = 32;

    /* renamed from: f */
    public int f42655f = 32;

    /* renamed from: h */
    public boolean f42657h = false;

    /* renamed from: i */
    public boolean[] f42658i = new boolean[32];

    /* renamed from: j */
    public int f42659j = 1;

    /* renamed from: k */
    public int f42660k = 0;

    /* renamed from: l */
    public int f42661l = 32;

    /* renamed from: n */
    public C8867e[] f42663n = new C8867e[IMAPStore.RESPONSE];

    /* renamed from: o */
    public int f42664o = 0;

    /* renamed from: g */
    public C8863a[] f42656g = new C8863a[32];

    public C8864b() {
        m16365r();
        C7439j c7439j = new C7439j(22);
        c7439j.f35537b = new C0602c((byte) 0, 2);
        c7439j.f35538c = new C0602c((byte) 0, 2);
        c7439j.f35539d = new C8867e[32];
        this.f42662m = c7439j;
        C8865c c8865c = new C8865c(c7439j);
        c8865c.f42666f = new C8867e[128];
        c8865c.f42667g = new C8867e[128];
        c8865c.f42668h = 0;
        c8865c.f42669i = new C0917l(c8865c);
        this.f42653d = c8865c;
        this.f42665p = new C8863a(c7439j);
    }

    /* renamed from: n */
    public static int m16348n(Object obj) {
        C8867e c8867e = ((C2514d) obj).f13759i;
        if (c8867e != null) {
            return (int) (c8867e.f42674e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C8867e m16349a(EnumC8866d enumC8866d) {
        C0602c c0602c = (C0602c) this.f42662m.f35538c;
        int i10 = c0602c.f3989c;
        C8867e c8867e = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = c0602c.f3988b;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            c0602c.f3989c = i11;
            c8867e = r42;
        }
        C8867e c8867e2 = c8867e;
        if (c8867e2 == null) {
            c8867e2 = new C8867e(enumC8866d);
            c8867e2.f42678j = enumC8866d;
        } else {
            c8867e2.m16371c();
            c8867e2.f42678j = enumC8866d;
        }
        int i12 = this.f42664o;
        int i13 = this.f42650a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f42650a = i14;
            this.f42663n = (C8867e[]) Arrays.copyOf(this.f42663n, i14);
        }
        C8867e[] c8867eArr = this.f42663n;
        int i15 = this.f42664o;
        this.f42664o = i15 + 1;
        c8867eArr[i15] = c8867e2;
        return c8867e2;
    }

    /* renamed from: b */
    public final void m16350b(C8867e c8867e, C8867e c8867e2, int i10, float f6, C8867e c8867e3, C8867e c8867e4, int i11, int i12) {
        C8863a c8863aM16360l = m16360l();
        if (c8867e2 == c8867e3) {
            c8863aM16360l.f42647d.m8121n(c8867e, 1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e4, 1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e2, -2.0f);
        } else if (f6 == 0.5f) {
            c8863aM16360l.f42647d.m8121n(c8867e, 1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e2, -1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e3, -1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                c8863aM16360l.f42645b = (-i10) + i11;
            }
        } else if (f6 <= DefinitionKt.NO_Float_VALUE) {
            c8863aM16360l.f42647d.m8121n(c8867e, -1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e2, 1.0f);
            c8863aM16360l.f42645b = i10;
        } else if (f6 >= 1.0f) {
            c8863aM16360l.f42647d.m8121n(c8867e4, -1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e3, 1.0f);
            c8863aM16360l.f42645b = -i11;
        } else {
            float f10 = 1.0f - f6;
            c8863aM16360l.f42647d.m8121n(c8867e, f10 * 1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e2, f10 * (-1.0f));
            c8863aM16360l.f42647d.m8121n(c8867e3, (-1.0f) * f6);
            c8863aM16360l.f42647d.m8121n(c8867e4, 1.0f * f6);
            if (i10 > 0 || i11 > 0) {
                c8863aM16360l.f42645b = (i11 * f6) + ((-i10) * f10);
            }
        }
        if (i12 != 8) {
            c8863aM16360l.m16339a(this, i12);
        }
        m16351c(c8863aM16360l);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16351c(z4.C8863a r18) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C8864b.m16351c(z4.a):void");
    }

    /* renamed from: d */
    public final void m16352d(C8867e c8867e, int i10) {
        int i11 = c8867e.f42672c;
        if (i11 == -1) {
            c8867e.m16372d(this, i10);
            for (int i12 = 0; i12 < this.f42652c + 1; i12++) {
                C8867e c8867e2 = ((C8867e[]) this.f42662m.f35539d)[i12];
            }
            return;
        }
        if (i11 == -1) {
            C8863a c8863aM16360l = m16360l();
            c8863aM16360l.f42644a = c8867e;
            float f6 = i10;
            c8867e.f42674e = f6;
            c8863aM16360l.f42645b = f6;
            c8863aM16360l.f42648e = true;
            m16351c(c8863aM16360l);
            return;
        }
        C8863a c8863a = this.f42656g[i11];
        if (c8863a.f42648e) {
            c8863a.f42645b = i10;
            return;
        }
        if (c8863a.f42647d.mo8109b() == 0) {
            c8863a.f42648e = true;
            c8863a.f42645b = i10;
            return;
        }
        C8863a c8863aM16360l2 = m16360l();
        if (i10 < 0) {
            c8863aM16360l2.f42645b = i10 * (-1);
            c8863aM16360l2.f42647d.m8121n(c8867e, 1.0f);
        } else {
            c8863aM16360l2.f42645b = i10;
            c8863aM16360l2.f42647d.m8121n(c8867e, -1.0f);
        }
        m16351c(c8863aM16360l2);
    }

    /* renamed from: e */
    public final void m16353e(C8867e c8867e, C8867e c8867e2, int i10, int i11) {
        if (i11 == 8 && c8867e2.f42675f && c8867e.f42672c == -1) {
            c8867e.m16372d(this, c8867e2.f42674e + i10);
            return;
        }
        C8863a c8863aM16360l = m16360l();
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            c8863aM16360l.f42645b = i10;
        }
        if (z6) {
            c8863aM16360l.f42647d.m8121n(c8867e, 1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e2, -1.0f);
        } else {
            c8863aM16360l.f42647d.m8121n(c8867e, -1.0f);
            c8863aM16360l.f42647d.m8121n(c8867e2, 1.0f);
        }
        if (i11 != 8) {
            c8863aM16360l.m16339a(this, i11);
        }
        m16351c(c8863aM16360l);
    }

    /* renamed from: f */
    public final void m16354f(C8867e c8867e, C8867e c8867e2, int i10, int i11) {
        C8863a c8863aM16360l = m16360l();
        C8867e c8867eM16361m = m16361m();
        c8867eM16361m.f42673d = 0;
        c8863aM16360l.m16340b(c8867e, c8867e2, c8867eM16361m, i10);
        if (i11 != 8) {
            c8863aM16360l.f42647d.m8121n(m16358j(i11), (int) (c8863aM16360l.f42647d.m8119l(c8867eM16361m) * (-1.0f)));
        }
        m16351c(c8863aM16360l);
    }

    /* renamed from: g */
    public final void m16355g(C8867e c8867e, C8867e c8867e2, int i10, int i11) {
        C8863a c8863aM16360l = m16360l();
        C8867e c8867eM16361m = m16361m();
        c8867eM16361m.f42673d = 0;
        c8863aM16360l.m16341c(c8867e, c8867e2, c8867eM16361m, i10);
        if (i11 != 8) {
            c8863aM16360l.f42647d.m8121n(m16358j(i11), (int) (c8863aM16360l.f42647d.m8119l(c8867eM16361m) * (-1.0f)));
        }
        m16351c(c8863aM16360l);
    }

    /* renamed from: h */
    public final void m16356h(C8863a c8863a) {
        int i10;
        if (c8863a.f42648e) {
            c8863a.f42644a.m16372d(this, c8863a.f42645b);
        } else {
            C8863a[] c8863aArr = this.f42656g;
            int i11 = this.f42660k;
            c8863aArr[i11] = c8863a;
            C8867e c8867e = c8863a.f42644a;
            c8867e.f42672c = i11;
            this.f42660k = i11 + 1;
            c8867e.m16373e(this, c8863a);
        }
        if (this.f42651b) {
            int i12 = 0;
            while (i12 < this.f42660k) {
                if (this.f42656g[i12] == null) {
                    System.out.println("WTF");
                }
                C8863a c8863a2 = this.f42656g[i12];
                if (c8863a2 != null && c8863a2.f42648e) {
                    c8863a2.f42644a.m16372d(this, c8863a2.f42645b);
                    ((C0602c) this.f42662m.f35537b).m1764c(c8863a2);
                    this.f42656g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f42660k;
                        if (i13 >= i10) {
                            break;
                        }
                        C8863a[] c8863aArr2 = this.f42656g;
                        int i15 = i13 - 1;
                        C8863a c8863a3 = c8863aArr2[i13];
                        c8863aArr2[i15] = c8863a3;
                        C8867e c8867e2 = c8863a3.f42644a;
                        if (c8867e2.f42672c == i13) {
                            c8867e2.f42672c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f42656g[i14] = null;
                    }
                    this.f42660k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f42651b = false;
        }
    }

    /* renamed from: i */
    public final void m16357i() {
        for (int i10 = 0; i10 < this.f42660k; i10++) {
            C8863a c8863a = this.f42656g[i10];
            c8863a.f42644a.f42674e = c8863a.f42645b;
        }
    }

    /* renamed from: j */
    public final C8867e m16358j(int i10) {
        if (this.f42659j + 1 >= this.f42655f) {
            m16362o();
        }
        C8867e c8867eM16349a = m16349a(EnumC8866d.ERROR);
        float[] fArr = c8867eM16349a.f42677h;
        int i11 = this.f42652c + 1;
        this.f42652c = i11;
        this.f42659j++;
        c8867eM16349a.f42671b = i11;
        c8867eM16349a.f42673d = i10;
        ((C8867e[]) this.f42662m.f35539d)[i11] = c8867eM16349a;
        C8865c c8865c = this.f42653d;
        c8865c.f42669i.f5594b = c8867eM16349a;
        Arrays.fill(fArr, DefinitionKt.NO_Float_VALUE);
        fArr[c8867eM16349a.f42673d] = 1.0f;
        c8865c.m16367j(c8867eM16349a);
        return c8867eM16349a;
    }

    /* renamed from: k */
    public final C8867e m16359k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f42659j + 1 >= this.f42655f) {
            m16362o();
        }
        if (!(obj instanceof C2514d)) {
            return null;
        }
        C2514d c2514d = (C2514d) obj;
        C8867e c8867e = c2514d.f13759i;
        if (c8867e == null) {
            c2514d.m6499j();
            c8867e = c2514d.f13759i;
        }
        int i10 = c8867e.f42671b;
        C7439j c7439j = this.f42662m;
        if (i10 != -1 && i10 <= this.f42652c && ((C8867e[]) c7439j.f35539d)[i10] != null) {
            return c8867e;
        }
        if (i10 != -1) {
            c8867e.m16371c();
        }
        int i11 = this.f42652c + 1;
        this.f42652c = i11;
        this.f42659j++;
        c8867e.f42671b = i11;
        c8867e.f42678j = EnumC8866d.UNRESTRICTED;
        ((C8867e[]) c7439j.f35539d)[i11] = c8867e;
        return c8867e;
    }

    /* renamed from: l */
    public final C8863a m16360l() {
        Object obj;
        C7439j c7439j = this.f42662m;
        C0602c c0602c = (C0602c) c7439j.f35537b;
        int i10 = c0602c.f3989c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = c0602c.f3988b;
            obj = objArr[i11];
            objArr[i11] = null;
            c0602c.f3989c = i11;
        } else {
            obj = null;
        }
        C8863a c8863a = (C8863a) obj;
        if (c8863a == null) {
            return new C8863a(c7439j);
        }
        c8863a.f42644a = null;
        c8863a.f42647d.clear();
        c8863a.f42645b = DefinitionKt.NO_Float_VALUE;
        c8863a.f42648e = false;
        return c8863a;
    }

    /* renamed from: m */
    public final C8867e m16361m() {
        if (this.f42659j + 1 >= this.f42655f) {
            m16362o();
        }
        C8867e c8867eM16349a = m16349a(EnumC8866d.SLACK);
        int i10 = this.f42652c + 1;
        this.f42652c = i10;
        this.f42659j++;
        c8867eM16349a.f42671b = i10;
        ((C8867e[]) this.f42662m.f35539d)[i10] = c8867eM16349a;
        return c8867eM16349a;
    }

    /* renamed from: o */
    public final void m16362o() {
        int i10 = this.f42654e * 2;
        this.f42654e = i10;
        this.f42656g = (C8863a[]) Arrays.copyOf(this.f42656g, i10);
        C7439j c7439j = this.f42662m;
        c7439j.f35539d = (C8867e[]) Arrays.copyOf((C8867e[]) c7439j.f35539d, this.f42654e);
        int i11 = this.f42654e;
        this.f42658i = new boolean[i11];
        this.f42655f = i11;
        this.f42661l = i11;
    }

    /* renamed from: p */
    public final void m16363p(C8865c c8865c) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.f42660k) {
                break;
            }
            C8863a c8863a = this.f42656g[i10];
            if (c8863a.f42644a.f42678j != EnumC8866d.UNRESTRICTED) {
                float f6 = c8863a.f42645b;
                float f10 = DefinitionKt.NO_Float_VALUE;
                if (f6 < DefinitionKt.NO_Float_VALUE) {
                    boolean z6 = false;
                    int i11 = 0;
                    while (!z6) {
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f42660k) {
                            C8863a c8863a2 = this.f42656g[i14];
                            if (c8863a2.f42644a.f42678j != EnumC8866d.UNRESTRICTED && !c8863a2.f42648e && c8863a2.f42645b < f10) {
                                int iMo8109b = c8863a2.f42647d.mo8109b();
                                int i16 = 0;
                                while (i16 < iMo8109b) {
                                    C8867e c8867eM8120m = c8863a2.f42647d.m8120m(i16);
                                    float fM8119l = c8863a2.f42647d.m8119l(c8867eM8120m);
                                    if (fM8119l > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = c8867eM8120m.f42676g[i17] / fM8119l;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = c8867eM8120m.f42671b;
                                                i12 = i14;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = DefinitionKt.NO_Float_VALUE;
                                }
                            }
                            i14++;
                            f10 = DefinitionKt.NO_Float_VALUE;
                        }
                        if (i12 != -1) {
                            C8863a c8863a3 = this.f42656g[i12];
                            c8863a3.f42644a.f42672c = -1;
                            c8863a3.m16345g(((C8867e[]) this.f42662m.f35539d)[i13]);
                            C8867e c8867e = c8863a3.f42644a;
                            c8867e.f42672c = i12;
                            c8867e.m16373e(this, c8863a3);
                        } else {
                            z6 = true;
                        }
                        if (i11 > this.f42659j / 2) {
                            z6 = true;
                        }
                        f10 = DefinitionKt.NO_Float_VALUE;
                    }
                }
            }
            i10++;
        }
        m16364q(c8865c);
        m16357i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094 A[SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16364q(z4.C8863a r17) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C8864b.m16364q(z4.a):void");
    }

    /* renamed from: r */
    public final void m16365r() {
        for (int i10 = 0; i10 < this.f42660k; i10++) {
            C8863a c8863a = this.f42656g[i10];
            if (c8863a != null) {
                ((C0602c) this.f42662m.f35537b).m1764c(c8863a);
            }
            this.f42656g[i10] = null;
        }
    }

    /* renamed from: s */
    public final void m16366s() {
        C7439j c7439j;
        int i10 = 0;
        while (true) {
            c7439j = this.f42662m;
            C8867e[] c8867eArr = (C8867e[]) c7439j.f35539d;
            if (i10 >= c8867eArr.length) {
                break;
            }
            C8867e c8867e = c8867eArr[i10];
            if (c8867e != null) {
                c8867e.m16371c();
            }
            i10++;
        }
        C0602c c0602c = (C0602c) c7439j.f35538c;
        C8867e[] c8867eArr2 = this.f42663n;
        int length = this.f42664o;
        c0602c.getClass();
        if (length > c8867eArr2.length) {
            length = c8867eArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            C8867e c8867e2 = c8867eArr2[i11];
            int i12 = c0602c.f3989c;
            Object[] objArr = c0602c.f3988b;
            if (i12 < objArr.length) {
                objArr[i12] = c8867e2;
                c0602c.f3989c = i12 + 1;
            }
        }
        this.f42664o = 0;
        Arrays.fill((C8867e[]) c7439j.f35539d, (Object) null);
        this.f42652c = 0;
        C8865c c8865c = this.f42653d;
        c8865c.f42668h = 0;
        c8865c.f42645b = DefinitionKt.NO_Float_VALUE;
        this.f42659j = 1;
        for (int i13 = 0; i13 < this.f42660k; i13++) {
            C8863a c8863a = this.f42656g[i13];
        }
        m16365r();
        this.f42660k = 0;
        this.f42665p = new C8863a(c7439j);
    }
}
