package j5;

import c9.C0919n;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j5.c */
/* loaded from: classes.dex */
public class C3586c {

    /* renamed from: d */
    public InterfaceC3585b f19167d;

    /* renamed from: a */
    public C3592i f19164a = null;

    /* renamed from: b */
    public float f19165b = DefinitionKt.NO_Float_VALUE;

    /* renamed from: c */
    public ArrayList f19166c = new ArrayList();

    /* renamed from: e */
    public boolean f19168e = false;

    public C3586c(C0919n c0919n) {
        this.f19167d = new C3584a(this, c0919n);
    }

    /* renamed from: a */
    public final void m8123a(C3588e c3588e, int i10) {
        this.f19167d.mo8113f(c3588e.m8140i(i10), 1.0f);
        this.f19167d.mo8113f(c3588e.m8140i(i10), -1.0f);
    }

    /* renamed from: b */
    public final void m8124b(C3592i c3592i, C3592i c3592i2, C3592i c3592i3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f19165b = i10;
        }
        if (z6) {
            this.f19167d.mo8113f(c3592i, 1.0f);
            this.f19167d.mo8113f(c3592i2, -1.0f);
            this.f19167d.mo8113f(c3592i3, -1.0f);
        } else {
            this.f19167d.mo8113f(c3592i, -1.0f);
            this.f19167d.mo8113f(c3592i2, 1.0f);
            this.f19167d.mo8113f(c3592i3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m8125c(C3592i c3592i, C3592i c3592i2, C3592i c3592i3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f19165b = i10;
        }
        if (z6) {
            this.f19167d.mo8113f(c3592i, 1.0f);
            this.f19167d.mo8113f(c3592i2, -1.0f);
            this.f19167d.mo8113f(c3592i3, 1.0f);
        } else {
            this.f19167d.mo8113f(c3592i, -1.0f);
            this.f19167d.mo8113f(c3592i2, 1.0f);
            this.f19167d.mo8113f(c3592i3, -1.0f);
        }
    }

    /* renamed from: d */
    public C3592i mo8126d(boolean[] zArr) {
        return m8127e(zArr, null);
    }

    /* renamed from: e */
    public final C3592i m8127e(boolean[] zArr, C3592i c3592i) {
        EnumC3591h enumC3591h;
        int iMo8109b = this.f19167d.mo8109b();
        C3592i c3592i2 = null;
        float f6 = 0.0f;
        for (int i10 = 0; i10 < iMo8109b; i10++) {
            float fMo8115h = this.f19167d.mo8115h(i10);
            if (fMo8115h < DefinitionKt.NO_Float_VALUE) {
                C3592i c3592iMo8112e = this.f19167d.mo8112e(i10);
                if ((zArr == null || !zArr[c3592iMo8112e.f19192b]) && c3592iMo8112e != c3592i && (((enumC3591h = c3592iMo8112e.f19199i) == EnumC3591h.SLACK || enumC3591h == EnumC3591h.ERROR) && fMo8115h < f6)) {
                    f6 = fMo8115h;
                    c3592i2 = c3592iMo8112e;
                }
            }
        }
        return c3592i2;
    }

    /* renamed from: f */
    public final void m8128f(C3592i c3592i) {
        C3592i c3592i2 = this.f19164a;
        if (c3592i2 != null) {
            this.f19167d.mo8113f(c3592i2, -1.0f);
            this.f19164a = null;
        }
        float fMo8111d = this.f19167d.mo8111d(c3592i, true) * (-1.0f);
        this.f19164a = c3592i;
        if (fMo8111d == 1.0f) {
            return;
        }
        this.f19165b /= fMo8111d;
        this.f19167d.mo8117j(fMo8111d);
    }

    /* renamed from: g */
    public final void m8129g(C3592i c3592i, boolean z6) {
        if (c3592i.f19196f) {
            float fMo8110c = this.f19167d.mo8110c(c3592i);
            this.f19165b = (c3592i.f19195e * fMo8110c) + this.f19165b;
            this.f19167d.mo8111d(c3592i, z6);
            if (z6) {
                c3592i.m8152b(this);
            }
        }
    }

    /* renamed from: h */
    public void mo8130h(C3586c c3586c, boolean z6) {
        float fMo8116i = this.f19167d.mo8116i(c3586c, z6);
        this.f19165b = (c3586c.f19165b * fMo8116i) + this.f19165b;
        if (z6) {
            c3586c.f19164a.m8152b(this);
        }
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
            j5.i r0 = r10.f19164a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            j5.i r1 = r10.f19164a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.sun.mail.util.AbstractC1452a.m4561h(r0, r1)
            float r1 = r10.f19165b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = com.sun.mail.util.AbstractC1452a.m4568o(r0)
            float r1 = r10.f19165b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            j5.b r5 = r10.f19167d
            int r5 = r5.mo8109b()
        L3c:
            if (r3 >= r5) goto L9c
            j5.b r6 = r10.f19167d
            j5.i r6 = r6.mo8112e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            j5.b r7 = r10.f19167d
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
        throw new UnsupportedOperationException("Method not decompiled: j5.C3586c.toString():java.lang.String");
    }
}
