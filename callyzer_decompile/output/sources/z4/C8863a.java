package z4;

import com.skydoves.balloon.internals.DefinitionKt;
import j5.C3584a;
import java.util.ArrayList;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z4.a */
/* loaded from: classes.dex */
public class C8863a {

    /* renamed from: d */
    public final C3584a f42647d;

    /* renamed from: a */
    public C8867e f42644a = null;

    /* renamed from: b */
    public float f42645b = DefinitionKt.NO_Float_VALUE;

    /* renamed from: c */
    public final ArrayList f42646c = new ArrayList();

    /* renamed from: e */
    public boolean f42648e = false;

    public C8863a(C7439j c7439j) {
        this.f42647d = new C3584a(this, c7439j);
    }

    /* renamed from: a */
    public final void m16339a(C8864b c8864b, int i10) {
        this.f42647d.m8121n(c8864b.m16358j(i10), 1.0f);
        this.f42647d.m8121n(c8864b.m16358j(i10), -1.0f);
    }

    /* renamed from: b */
    public final void m16340b(C8867e c8867e, C8867e c8867e2, C8867e c8867e3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f42645b = i10;
        }
        if (z6) {
            this.f42647d.m8121n(c8867e, 1.0f);
            this.f42647d.m8121n(c8867e2, -1.0f);
            this.f42647d.m8121n(c8867e3, -1.0f);
        } else {
            this.f42647d.m8121n(c8867e, -1.0f);
            this.f42647d.m8121n(c8867e2, 1.0f);
            this.f42647d.m8121n(c8867e3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m16341c(C8867e c8867e, C8867e c8867e2, C8867e c8867e3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f42645b = i10;
        }
        if (z6) {
            this.f42647d.m8121n(c8867e, 1.0f);
            this.f42647d.m8121n(c8867e2, -1.0f);
            this.f42647d.m8121n(c8867e3, 1.0f);
        } else {
            this.f42647d.m8121n(c8867e, -1.0f);
            this.f42647d.m8121n(c8867e2, 1.0f);
            this.f42647d.m8121n(c8867e3, -1.0f);
        }
    }

    /* renamed from: d */
    public C8867e mo16342d(boolean[] zArr) {
        return m16344f(zArr, null);
    }

    /* renamed from: e */
    public boolean mo16343e() {
        return this.f42644a == null && this.f42645b == DefinitionKt.NO_Float_VALUE && this.f42647d.mo8109b() == 0;
    }

    /* renamed from: f */
    public final C8867e m16344f(boolean[] zArr, C8867e c8867e) {
        EnumC8866d enumC8866d;
        int iMo8109b = this.f42647d.mo8109b();
        C8867e c8867e2 = null;
        float f6 = 0.0f;
        for (int i10 = 0; i10 < iMo8109b; i10++) {
            float fMo8115h = this.f42647d.mo8115h(i10);
            if (fMo8115h < DefinitionKt.NO_Float_VALUE) {
                C8867e c8867eM8120m = this.f42647d.m8120m(i10);
                if ((zArr == null || !zArr[c8867eM8120m.f42671b]) && c8867eM8120m != c8867e && (((enumC8866d = c8867eM8120m.f42678j) == EnumC8866d.SLACK || enumC8866d == EnumC8866d.ERROR) && fMo8115h < f6)) {
                    f6 = fMo8115h;
                    c8867e2 = c8867eM8120m;
                }
            }
        }
        return c8867e2;
    }

    /* renamed from: g */
    public final void m16345g(C8867e c8867e) {
        C8867e c8867e2 = this.f42644a;
        if (c8867e2 != null) {
            this.f42647d.m8121n(c8867e2, -1.0f);
            this.f42644a.f42672c = -1;
            this.f42644a = null;
        }
        float fM8122o = this.f42647d.m8122o(c8867e, true) * (-1.0f);
        this.f42644a = c8867e;
        if (fM8122o == 1.0f) {
            return;
        }
        this.f42645b /= fM8122o;
        this.f42647d.mo8117j(fM8122o);
    }

    /* renamed from: h */
    public final void m16346h(C8864b c8864b, C8867e c8867e, boolean z6) {
        if (c8867e.f42675f) {
            float fM8119l = this.f42647d.m8119l(c8867e);
            this.f42645b = (c8867e.f42674e * fM8119l) + this.f42645b;
            this.f42647d.m8122o(c8867e, z6);
            if (z6) {
                c8867e.m16370b(this);
            }
            if (this.f42647d.mo8109b() == 0) {
                this.f42648e = true;
                c8864b.f42651b = true;
            }
        }
    }

    /* renamed from: i */
    public void mo16347i(C8864b c8864b, C8863a c8863a, boolean z6) {
        C3584a c3584a = this.f42647d;
        c3584a.getClass();
        float fM8119l = c3584a.m8119l(c8863a.f42644a);
        c3584a.m8122o(c8863a.f42644a, z6);
        C3584a c3584a2 = c8863a.f42647d;
        int iMo8109b = c3584a2.mo8109b();
        for (int i10 = 0; i10 < iMo8109b; i10++) {
            C8867e c8867eM8120m = c3584a2.m8120m(i10);
            c3584a.m8118k(c8867eM8120m, c3584a2.m8119l(c8867eM8120m) * fM8119l, z6);
        }
        this.f42645b = (c8863a.f42645b * fM8119l) + this.f42645b;
        if (z6) {
            c8863a.f42644a.m16370b(this);
        }
        if (this.f42644a == null || this.f42647d.mo8109b() != 0) {
            return;
        }
        this.f42648e = true;
        c8864b.f42651b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            z4.e r0 = r10.f42644a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            z4.e r1 = r10.f42644a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4561h(r0, r1)
            float r1 = r10.f42645b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = com.sun.mail.util.AbstractC1452a.m4568o(r0)
            float r1 = r10.f42645b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            j5.a r5 = r10.f42647d
            int r5 = r5.mo8109b()
        L3c:
            if (r3 >= r5) goto L9c
            j5.a r6 = r10.f42647d
            z4.e r6 = r6.m8120m(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            j5.a r7 = r10.f42647d
            float r7 = r7.mo8115h(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4561h(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4561h(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4561h(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4561h(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4561h(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C8863a.toString():java.lang.String");
    }
}
