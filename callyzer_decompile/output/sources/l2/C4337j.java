package l2;

import b2.C0558p;
import k2.AbstractC3967p;
import k2.C3952a;
import k2.InterfaceC3954c;
import k2.y1;
import pg.ma;
import s2.C6735d;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l2.j */
/* loaded from: classes.dex */
public final class C4337j extends i0 {

    /* renamed from: c */
    public static final C4337j f21820c = new C4337j(0, 2, 1);

    @Override // l2.i0
    /* renamed from: a */
    public final void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        int i10;
        C6735d c6735d = (C6735d) c0558p.m1659g(0);
        int iM8734c = y1Var.m8734c((C3952a) c0558p.m1659g(1));
        if (y1Var.f20629t >= iM8734c) {
            AbstractC3967p.m8636c("Check failed");
        }
        ma.m11792a(y1Var, interfaceC3954c, iM8734c);
        int i11 = y1Var.f20629t;
        int iM8715C = y1Var.f20631v;
        while (iM8715C >= 0 && !y1Var.m8753w(iM8715C)) {
            iM8715C = y1Var.m8715C(iM8715C, y1Var.f20611b);
        }
        int iM8749s = iM8715C + 1;
        int iM8721I = 0;
        while (iM8749s < i11) {
            if (y1Var.m8750t(i11, iM8749s)) {
                if (y1Var.m8753w(iM8749s)) {
                    iM8721I = 0;
                }
                iM8749s++;
            } else {
                iM8721I += y1Var.m8753w(iM8749s) ? 1 : y1Var.f20611b[(y1Var.m8747q(iM8749s) * 5) + 1] & 67108863;
                iM8749s += y1Var.m8749s(iM8749s);
            }
        }
        while (true) {
            i10 = y1Var.f20629t;
            if (i10 >= iM8734c) {
                break;
            }
            if (y1Var.m8750t(iM8734c, i10)) {
                int i12 = y1Var.f20629t;
                if (i12 < y1Var.f20630u && (y1Var.f20611b[(y1Var.m8747q(i12) * 5) + 1] & 1073741824) != 0) {
                    interfaceC3954c.mo2736d(y1Var.m8714B(y1Var.f20629t));
                    iM8721I = 0;
                }
                y1Var.m8726N();
            } else {
                iM8721I += y1Var.m8721I();
            }
        }
        if (i10 != iM8734c) {
            AbstractC3967p.m8636c("Check failed");
        }
        c6735d.f32177a = iM8721I;
    }
}
