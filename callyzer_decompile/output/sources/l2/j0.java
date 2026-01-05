package l2;

import b2.C0558p;
import k2.InterfaceC3954c;
import k2.y1;
import rw.AbstractC6662l;
import s2.C6739h;
import td.AbstractC7136m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends AbstractC7136m {

    /* renamed from: b */
    public int f21822b;

    /* renamed from: d */
    public int f21824d;

    /* renamed from: f */
    public int f21826f;

    /* renamed from: a */
    public i0[] f21821a = new i0[16];

    /* renamed from: c */
    public int[] f21823c = new int[16];

    /* renamed from: e */
    public Object[] f21825e = new Object[16];

    /* renamed from: c */
    public final void m9062c() {
        this.f21822b = 0;
        this.f21824d = 0;
        AbstractC6662l.m12726p(this.f21825e, 0, this.f21826f, null);
        this.f21826f = 0;
    }

    /* renamed from: d */
    public final void m9063d(InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        int i10;
        int i11;
        if (m9065f()) {
            C0558p c0558p = new C0558p(this);
            j0 j0Var = (j0) c0558p.f3798e;
            do {
                j0Var.f21821a[c0558p.f3795b].mo9056a(c0558p, interfaceC3954c, y1Var, c6739h);
                int i12 = c0558p.f3795b;
                i10 = j0Var.f21822b;
                if (i12 >= i10) {
                    break;
                }
                i0 i0Var = j0Var.f21821a[i12];
                c0558p.f3796c += i0Var.f21818a;
                c0558p.f3797d += i0Var.f21819b;
                i11 = i12 + 1;
                c0558p.f3795b = i11;
            } while (i11 < i10);
        }
        m9062c();
    }

    /* renamed from: e */
    public final boolean m9064e() {
        return this.f21822b == 0;
    }

    /* renamed from: f */
    public final boolean m9065f() {
        return this.f21822b != 0;
    }

    /* renamed from: g */
    public final void m9066g(i0 i0Var) {
        int i10 = this.f21822b;
        i0[] i0VarArr = this.f21821a;
        if (i10 == i0VarArr.length) {
            i0[] i0VarArr2 = new i0[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(i0VarArr, 0, i0VarArr2, 0, i10);
            this.f21821a = i0VarArr2;
        }
        int i11 = this.f21824d;
        int i12 = i0Var.f21818a;
        int i13 = i0Var.f21819b;
        int i14 = i11 + i12;
        int[] iArr = this.f21823c;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = (length > 1024 ? 1024 : length) + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            AbstractC6662l.m12717g(0, iArr, 0, length, iArr2);
            this.f21823c = iArr2;
        }
        int i16 = this.f21826f + i13;
        Object[] objArr = this.f21825e;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f21825e = objArr2;
        }
        i0[] i0VarArr3 = this.f21821a;
        int i18 = this.f21822b;
        this.f21822b = i18 + 1;
        i0VarArr3[i18] = i0Var;
        this.f21824d += i0Var.f21818a;
        this.f21826f += i13;
    }
}
