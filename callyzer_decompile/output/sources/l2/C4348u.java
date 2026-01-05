package l2;

import b2.C0558p;
import java.util.ArrayList;
import k2.AbstractC3967p;
import k2.C3952a;
import k2.InterfaceC3954c;
import k2.x1;
import k2.y1;
import rw.AbstractC6662l;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l2.u */
/* loaded from: classes.dex */
public final class C4348u extends i0 {

    /* renamed from: c */
    public static final C4348u f21841c = new C4348u(1, 0, 2);

    @Override // l2.i0
    /* renamed from: a */
    public final void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        C3952a c3952a;
        int iM8734c;
        int iM1658f = c0558p.m1658f(0);
        if (y1Var.f20623n != 0) {
            AbstractC3967p.m8636c("Cannot move a group while inserting");
        }
        if (iM1658f < 0) {
            AbstractC3967p.m8636c("Parameter offset is out of bounds");
        }
        if (iM1658f == 0) {
            return;
        }
        int i10 = y1Var.f20629t;
        int i11 = y1Var.f20631v;
        int i12 = y1Var.f20630u;
        int i13 = i10;
        while (iM1658f > 0) {
            i13 += y1Var.f20611b[(y1Var.m8747q(i13) * 5) + 3];
            if (i13 > i12) {
                AbstractC3967p.m8636c("Parameter offset is out of bounds");
            }
            iM1658f--;
        }
        int i14 = y1Var.f20611b[(y1Var.m8747q(i13) * 5) + 3];
        int iM8737f = y1Var.m8737f(y1Var.m8747q(y1Var.f20629t), y1Var.f20611b);
        int iM8737f2 = y1Var.m8737f(y1Var.m8747q(i13), y1Var.f20611b);
        int i15 = i13 + i14;
        int iM8737f3 = y1Var.m8737f(y1Var.m8747q(i15), y1Var.f20611b);
        int i16 = iM8737f3 - iM8737f2;
        y1Var.m8752v(i16, Math.max(y1Var.f20629t - 1, 0));
        y1Var.m8751u(i14);
        int[] iArr = y1Var.f20611b;
        int iM8747q = y1Var.m8747q(i15) * 5;
        AbstractC6662l.m12717g(y1Var.m8747q(i10) * 5, iArr, iM8747q, (i14 * 5) + iM8747q, iArr);
        if (i16 > 0) {
            Object[] objArr = y1Var.f20612c;
            int iM8738g = y1Var.m8738g(iM8737f2 + i16);
            System.arraycopy(objArr, iM8738g, objArr, iM8737f, y1Var.m8738g(iM8737f3 + i16) - iM8738g);
        }
        int i17 = iM8737f2 + i16;
        int i18 = i17 - iM8737f;
        int i19 = y1Var.f20620k;
        int i20 = y1Var.f20621l;
        int length = y1Var.f20612c.length;
        int i21 = y1Var.f20622m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iM8747q2 = y1Var.m8747q(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(iM8747q2 * 5) + 4] = y1.m8711h(y1.m8711h(y1Var.m8737f(iM8747q2, iArr) - i24, i21 < iM8747q2 ? 0 : i19, i20, length), y1Var.f20620k, y1Var.f20621l, y1Var.f20612c.length);
            i23++;
            i18 = i24;
            i19 = i19;
            iArr = iArr2;
        }
        int i25 = i15 + i14;
        int iM8744n = y1Var.m8744n();
        int iM8706b = x1.m8706b(y1Var.f20613d, i15, iM8744n);
        ArrayList arrayList = new ArrayList();
        if (iM8706b >= 0) {
            while (iM8706b < y1Var.f20613d.size() && (iM8734c = y1Var.m8734c((c3952a = (C3952a) y1Var.f20613d.get(iM8706b)))) >= i15 && iM8734c < i25) {
                arrayList.add(c3952a);
                y1Var.f20613d.remove(iM8706b);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            C3952a c3952a2 = (C3952a) arrayList.get(i27);
            int iM8734c2 = y1Var.m8734c(c3952a2) + i26;
            if (iM8734c2 >= y1Var.f20616g) {
                c3952a2.f20343a = -(iM8744n - iM8734c2);
            } else {
                c3952a2.f20343a = iM8734c2;
            }
            y1Var.f20613d.add(x1.m8706b(y1Var.f20613d, iM8734c2, iM8744n), c3952a2);
        }
        if (y1Var.m8719G(i15, i14)) {
            AbstractC3967p.m8636c("Unexpectedly removed anchors");
        }
        y1Var.m8742l(i11, y1Var.f20630u, i10);
        if (i16 > 0) {
            y1Var.m8720H(i17, i16, i15 - 1);
        }
    }
}
