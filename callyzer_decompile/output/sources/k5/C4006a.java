package k5;

import com.sun.mail.util.AbstractC1452a;
import j5.C3586c;
import j5.C3588e;
import j5.C3592i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k5.a */
/* loaded from: classes.dex */
public final class C4006a extends C4013h {

    /* renamed from: d0, reason: collision with root package name */
    public C4013h[] f44381d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f44382e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f44383f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f44384g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f44385h0;

    @Override // k5.C4013h
    /* renamed from: a */
    public final void mo8785a(C3588e c3588e) {
        boolean z6;
        int i10;
        int i11;
        C4010e[] c4010eArr = this.f20738F;
        C4010e c4010e = this.f20782x;
        c4010eArr[0] = c4010e;
        int i12 = 2;
        C4010e c4010e2 = this.f20783y;
        c4010eArr[2] = c4010e2;
        C4010e c4010e3 = this.f20784z;
        c4010eArr[1] = c4010e3;
        C4010e c4010e4 = this.f20733A;
        c4010eArr[3] = c4010e4;
        for (C4010e c4010e5 : c4010eArr) {
            c4010e5.f20730g = c3588e.m8141j(c4010e5);
        }
        int i13 = this.f44383f0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        C4010e c4010e6 = c4010eArr[i13];
        for (int i14 = 0; i14 < this.f44382e0; i14++) {
            C4013h c4013h = this.f44381d0[i14];
            if ((this.f44384g0 || c4013h.mo8786b()) && ((((i11 = this.f44383f0) == 0 || i11 == 1) && c4013h.f20741I[0] == EnumC4012g.MATCH_CONSTRAINT && c4013h.f20782x.f20727d != null && c4013h.f20784z.f20727d != null) || ((i11 == 2 || i11 == 3) && c4013h.f20741I[1] == EnumC4012g.MATCH_CONSTRAINT && c4013h.f20783y.f20727d != null && c4013h.f20733A.f20727d != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z10 = c4010e.m8789c() || c4010e3.m8789c();
        boolean z11 = c4010e2.m8789c() || c4010e4.m8789c();
        int i15 = !(!z6 && (((i10 = this.f44383f0) == 0 && z10) || ((i10 == 2 && z11) || ((i10 == 1 && z10) || (i10 == 3 && z11))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f44382e0) {
            C4013h c4013h2 = this.f44381d0[i16];
            if (this.f44384g0 || c4013h2.mo8786b()) {
                C3592i c3592iM8141j = c3588e.m8141j(c4013h2.f20738F[this.f44383f0]);
                C4010e[] c4010eArr2 = c4013h2.f20738F;
                int i17 = this.f44383f0;
                C4010e c4010e7 = c4010eArr2[i17];
                c4010e7.f20730g = c3592iM8141j;
                C4010e c4010e8 = c4010e7.f20727d;
                int i18 = (c4010e8 == null || c4010e8.f20725b != this) ? 0 : c4010e7.f20728e;
                if (i17 == 0 || i17 == i12) {
                    C3592i c3592i = c4010e6.f20730g;
                    int i19 = this.f44385h0 - i18;
                    C3586c c3586cM8142k = c3588e.m8142k();
                    C3592i c3592iM8143l = c3588e.m8143l();
                    c3592iM8143l.f19194d = 0;
                    c3586cM8142k.m8125c(c3592i, c3592iM8141j, c3592iM8143l, i19);
                    c3588e.m8134c(c3586cM8142k);
                } else {
                    C3592i c3592i2 = c4010e6.f20730g;
                    int i20 = this.f44385h0 + i18;
                    C3586c c3586cM8142k2 = c3588e.m8142k();
                    C3592i c3592iM8143l2 = c3588e.m8143l();
                    c3592iM8143l2.f19194d = 0;
                    c3586cM8142k2.m8124b(c3592i2, c3592iM8141j, c3592iM8143l2, i20);
                    c3588e.m8134c(c3586cM8142k2);
                }
                c3588e.m8136e(c4010e6.f20730g, c3592iM8141j, this.f44385h0 + i18, i15);
            }
            i16++;
            i12 = 2;
        }
        int i21 = this.f44383f0;
        if (i21 == 0) {
            c3588e.m8136e(c4010e3.f20730g, c4010e.f20730g, 0, 8);
            c3588e.m8136e(c4010e.f20730g, this.f20742J.f20784z.f20730g, 0, 4);
            c3588e.m8136e(c4010e.f20730g, this.f20742J.f20782x.f20730g, 0, 0);
            return;
        }
        if (i21 == 1) {
            c3588e.m8136e(c4010e.f20730g, c4010e3.f20730g, 0, 8);
            c3588e.m8136e(c4010e.f20730g, this.f20742J.f20782x.f20730g, 0, 4);
            c3588e.m8136e(c4010e.f20730g, this.f20742J.f20784z.f20730g, 0, 0);
        } else if (i21 == 2) {
            c3588e.m8136e(c4010e4.f20730g, c4010e2.f20730g, 0, 8);
            c3588e.m8136e(c4010e2.f20730g, this.f20742J.f20733A.f20730g, 0, 4);
            c3588e.m8136e(c4010e2.f20730g, this.f20742J.f20783y.f20730g, 0, 0);
        } else if (i21 == 3) {
            c3588e.m8136e(c4010e2.f20730g, c4010e4.f20730g, 0, 8);
            c3588e.m8136e(c4010e2.f20730g, this.f20742J.f20783y.f20730g, 0, 4);
            c3588e.m8136e(c4010e2.f20730g, this.f20742J.f20733A.f20730g, 0, 0);
        }
    }

    @Override // k5.C4013h
    /* renamed from: b */
    public final boolean mo8786b() {
        return true;
    }

    @Override // k5.C4013h
    public final String toString() {
        String strM4564k = AbstractC1452a.m4564k(new StringBuilder("[Barrier] "), this.f20756X, " {");
        for (int i10 = 0; i10 < this.f44382e0; i10++) {
            C4013h c4013h = this.f44381d0[i10];
            if (i10 > 0) {
                strM4564k = AbstractC1452a.m4561h(strM4564k, ", ");
            }
            StringBuilder sbM4568o = AbstractC1452a.m4568o(strM4564k);
            sbM4568o.append(c4013h.f20756X);
            strM4564k = sbM4568o.toString();
        }
        return AbstractC1452a.m4561h(strM4564k, "}");
    }
}
