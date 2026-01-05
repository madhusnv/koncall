package l5;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import k5.C4010e;
import k5.C4013h;
import k5.C4014i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.c */
/* loaded from: classes.dex */
public final class C4384c extends AbstractC4398q {

    /* renamed from: k */
    public final ArrayList f21958k;

    /* renamed from: l */
    public int f21959l;

    public C4384c(C4013h c4013h, int i10) {
        C4013h c4013h2;
        super(c4013h);
        ArrayList arrayList = new ArrayList();
        this.f21958k = arrayList;
        this.f21986f = i10;
        C4013h c4013h3 = this.f21982b;
        C4013h c4013hM8799i = c4013h3.m8799i(i10);
        while (true) {
            c4013h2 = c4013h3;
            c4013h3 = c4013hM8799i;
            if (c4013h3 == null) {
                break;
            } else {
                c4013hM8799i = c4013h3.m8799i(this.f21986f);
            }
        }
        this.f21982b = c4013h2;
        int i11 = this.f21986f;
        arrayList.add(i11 == 0 ? c4013h2.f20762d : i11 == 1 ? c4013h2.f20763e : null);
        C4013h c4013hM8798h = c4013h2.m8798h(this.f21986f);
        while (c4013hM8798h != null) {
            int i12 = this.f21986f;
            arrayList.add(i12 == 0 ? c4013hM8798h.f20762d : i12 == 1 ? c4013hM8798h.f20763e : null);
            c4013hM8798h = c4013hM8798h.m8798h(this.f21986f);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            AbstractC4398q abstractC4398q = (AbstractC4398q) obj;
            int i14 = this.f21986f;
            if (i14 == 0) {
                abstractC4398q.f21982b.f20760b = this;
            } else if (i14 == 1) {
                abstractC4398q.f21982b.f20761c = this;
            }
        }
        if (this.f21986f == 0 && ((C4014i) this.f21982b.f20742J).f44393h0 && arrayList.size() > 1) {
            this.f21982b = ((AbstractC4398q) arrayList.get(arrayList.size() - 1)).f21982b;
        }
        this.f21959l = this.f21986f == 0 ? this.f21982b.f20757Y : this.f21982b.f20758Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01bd A[PHI: r1 r25
      0x01bd: PHI (r1v57 int) = (r1v55 int), (r1v60 int) binds: [B:121:0x01bb, B:112:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r25v1 int) = (r25v0 int), (r25v3 int) binds: [B:121:0x01bb, B:112:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    @Override // l5.InterfaceC4385d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo9155a(l5.InterfaceC4385d r27) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C4384c.mo9155a(l5.d):void");
    }

    @Override // l5.AbstractC4398q
    /* renamed from: d */
    public final void mo9156d() {
        ArrayList arrayList = this.f21958k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC4398q) obj).mo9156d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C4013h c4013h = ((AbstractC4398q) arrayList.get(0)).f21982b;
        C4013h c4013h2 = ((AbstractC4398q) arrayList.get(size2 - 1)).f21982b;
        int i11 = this.f21986f;
        C4387f c4387f = this.f21989i;
        C4387f c4387f2 = this.f21988h;
        if (i11 == 0) {
            C4010e c4010e = c4013h.f20782x;
            C4010e c4010e2 = c4013h2.f20784z;
            C4387f c4387fM9175i = AbstractC4398q.m9175i(c4010e, 0);
            int iM8788b = c4010e.m8788b();
            C4013h c4013hM9161m = m9161m();
            if (c4013hM9161m != null) {
                iM8788b = c4013hM9161m.f20782x.m8788b();
            }
            if (c4387fM9175i != null) {
                AbstractC4398q.m9173b(c4387f2, c4387fM9175i, iM8788b);
            }
            C4387f c4387fM9175i2 = AbstractC4398q.m9175i(c4010e2, 0);
            int iM8788b2 = c4010e2.m8788b();
            C4013h c4013hM9162n = m9162n();
            if (c4013hM9162n != null) {
                iM8788b2 = c4013hM9162n.f20784z.m8788b();
            }
            if (c4387fM9175i2 != null) {
                AbstractC4398q.m9173b(c4387f, c4387fM9175i2, -iM8788b2);
            }
        } else {
            C4010e c4010e3 = c4013h.f20783y;
            C4010e c4010e4 = c4013h2.f20733A;
            C4387f c4387fM9175i3 = AbstractC4398q.m9175i(c4010e3, 1);
            int iM8788b3 = c4010e3.m8788b();
            C4013h c4013hM9161m2 = m9161m();
            if (c4013hM9161m2 != null) {
                iM8788b3 = c4013hM9161m2.f20783y.m8788b();
            }
            if (c4387fM9175i3 != null) {
                AbstractC4398q.m9173b(c4387f2, c4387fM9175i3, iM8788b3);
            }
            C4387f c4387fM9175i4 = AbstractC4398q.m9175i(c4010e4, 1);
            int iM8788b4 = c4010e4.m8788b();
            C4013h c4013hM9162n2 = m9162n();
            if (c4013hM9162n2 != null) {
                iM8788b4 = c4013hM9162n2.f20733A.m8788b();
            }
            if (c4387fM9175i4 != null) {
                AbstractC4398q.m9173b(c4387f, c4387fM9175i4, -iM8788b4);
            }
        }
        c4387f2.f21960a = this;
        c4387f.f21960a = this;
    }

    @Override // l5.AbstractC4398q
    /* renamed from: e */
    public final void mo9157e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21958k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((AbstractC4398q) arrayList.get(i10)).mo9157e();
            i10++;
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: f */
    public final void mo9158f() {
        this.f21983c = null;
        ArrayList arrayList = this.f21958k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((AbstractC4398q) obj).mo9158f();
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: j */
    public final long mo9159j() {
        ArrayList arrayList = this.f21958k;
        int size = arrayList.size();
        long jMo9159j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMo9159j = r5.f21989i.f21965f + ((AbstractC4398q) arrayList.get(i10)).mo9159j() + jMo9159j + r5.f21988h.f21965f;
        }
        return jMo9159j;
    }

    @Override // l5.AbstractC4398q
    /* renamed from: k */
    public final boolean mo9160k() {
        ArrayList arrayList = this.f21958k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((AbstractC4398q) arrayList.get(i10)).mo9160k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C4013h m9161m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21958k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            C4013h c4013h = ((AbstractC4398q) arrayList.get(i10)).f21982b;
            if (c4013h.f20755W != 8) {
                return c4013h;
            }
            i10++;
        }
    }

    /* renamed from: n */
    public final C4013h m9162n() {
        ArrayList arrayList = this.f21958k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C4013h c4013h = ((AbstractC4398q) arrayList.get(size)).f21982b;
            if (c4013h.f20755W != 8) {
                return c4013h;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f21986f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f21958k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            strConcat = AbstractC1452a.m4561h(AbstractC1452a.m4561h(strConcat, "<") + ((AbstractC4398q) obj), "> ");
        }
        return strConcat;
    }
}
