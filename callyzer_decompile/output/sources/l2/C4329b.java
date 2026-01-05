package l2;

import java.util.ArrayList;
import k2.AbstractC3967p;
import k2.C3966o;
import k2.l0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l2.b */
/* loaded from: classes.dex */
public final class C4329b {

    /* renamed from: a */
    public final C3966o f21791a;

    /* renamed from: b */
    public C4328a f21792b;

    /* renamed from: c */
    public boolean f21793c;

    /* renamed from: f */
    public int f21796f;

    /* renamed from: g */
    public int f21797g;

    /* renamed from: l */
    public int f21802l;

    /* renamed from: d */
    public final l0 f21794d = new l0();

    /* renamed from: e */
    public boolean f21795e = true;

    /* renamed from: h */
    public final ArrayList f21798h = new ArrayList();

    /* renamed from: i */
    public int f21799i = -1;

    /* renamed from: j */
    public int f21800j = -1;

    /* renamed from: k */
    public int f21801k = -1;

    public C4329b(C3966o c3966o, C4328a c4328a) {
        this.f21791a = c3966o;
        this.f21792b = c4328a;
    }

    /* renamed from: a */
    public final void m9057a() {
        m9059c();
        ArrayList arrayList = this.f21798h;
        if (arrayList.isEmpty()) {
            this.f21797g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* renamed from: b */
    public final void m9058b() {
        int i10 = this.f21797g;
        if (i10 > 0) {
            j0 j0Var = this.f21792b.f21789a;
            j0Var.m9066g(g0.f21814c);
            j0Var.f21823c[j0Var.f21824d - j0Var.f21821a[j0Var.f21822b - 1].f21818a] = i10;
            this.f21797g = 0;
        }
        ArrayList arrayList = this.f21798h;
        if (arrayList.isEmpty()) {
            return;
        }
        C4328a c4328a = this.f21792b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        c4328a.getClass();
        if (size != 0) {
            j0 j0Var2 = c4328a.f21789a;
            j0Var2.m9066g(C4338k.f21827c);
            sc.c0.m12976b(j0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    /* renamed from: c */
    public final void m9059c() {
        int i10 = this.f21802l;
        if (i10 > 0) {
            int i11 = this.f21799i;
            if (i11 >= 0) {
                m9058b();
                j0 j0Var = this.f21792b.f21789a;
                j0Var.m9066g(C4352y.f21845c);
                int i12 = j0Var.f21824d - j0Var.f21821a[j0Var.f21822b - 1].f21818a;
                int[] iArr = j0Var.f21823c;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f21799i = -1;
            } else {
                int i13 = this.f21801k;
                int i14 = this.f21800j;
                m9058b();
                j0 j0Var2 = this.f21792b.f21789a;
                j0Var2.m9066g(C4349v.f21842c);
                int i15 = j0Var2.f21824d - j0Var2.f21821a[j0Var2.f21822b - 1].f21818a;
                int[] iArr2 = j0Var2.f21823c;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.f21800j = -1;
                this.f21801k = -1;
            }
            this.f21802l = 0;
        }
    }

    /* renamed from: d */
    public final void m9060d(boolean z6) {
        C3966o c3966o = this.f21791a;
        int i10 = z6 ? c3966o.f20452F.f20585i : c3966o.f20452F.f20583g;
        int i11 = i10 - this.f21796f;
        if (i11 < 0) {
            AbstractC3967p.m8636c("Tried to seek backward");
        }
        if (i11 > 0) {
            j0 j0Var = this.f21792b.f21789a;
            j0Var.m9066g(C4331d.f21807c);
            j0Var.f21823c[j0Var.f21824d - j0Var.f21821a[j0Var.f21822b - 1].f21818a] = i11;
            this.f21796f = i10;
        }
    }

    /* renamed from: e */
    public final void m9061e(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                AbstractC3967p.m8636c("Invalid remove index " + i10);
            }
            if (this.f21799i == i10) {
                this.f21802l += i11;
                return;
            }
            m9059c();
            this.f21799i = i10;
            this.f21802l = i11;
        }
    }
}
