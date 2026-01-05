package y7;

import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.o */
/* loaded from: classes.dex */
public final class C8580o {

    /* renamed from: a */
    public AbstractC8586u f41724a;

    /* renamed from: b */
    public int f41725b;

    /* renamed from: c */
    public int f41726c;

    /* renamed from: d */
    public boolean f41727d;

    /* renamed from: e */
    public boolean f41728e;

    public C8580o() {
        m15889d();
    }

    /* renamed from: a */
    public final void m15886a() {
        this.f41726c = this.f41727d ? this.f41724a.mo15907i() : this.f41724a.mo15911m();
    }

    /* renamed from: b */
    public final void m15887b(int i10, View view) {
        if (this.f41727d) {
            int iMo15902d = this.f41724a.mo15902d(view);
            AbstractC8586u abstractC8586u = this.f41724a;
            this.f41726c = (Integer.MIN_VALUE == abstractC8586u.f41810a ? 0 : abstractC8586u.mo15912n() - abstractC8586u.f41810a) + iMo15902d;
        } else {
            this.f41726c = this.f41724a.mo15905g(view);
        }
        this.f41725b = i10;
    }

    /* renamed from: c */
    public final void m15888c(int i10, View view) {
        AbstractC8586u abstractC8586u = this.f41724a;
        int iMo15912n = Integer.MIN_VALUE == abstractC8586u.f41810a ? 0 : abstractC8586u.mo15912n() - abstractC8586u.f41810a;
        if (iMo15912n >= 0) {
            m15887b(i10, view);
            return;
        }
        this.f41725b = i10;
        if (!this.f41727d) {
            int iMo15905g = this.f41724a.mo15905g(view);
            int iMo15911m = iMo15905g - this.f41724a.mo15911m();
            this.f41726c = iMo15905g;
            if (iMo15911m > 0) {
                int iMo15907i = (this.f41724a.mo15907i() - Math.min(0, (this.f41724a.mo15907i() - iMo15912n) - this.f41724a.mo15902d(view))) - (this.f41724a.mo15903e(view) + iMo15905g);
                if (iMo15907i < 0) {
                    this.f41726c -= Math.min(iMo15911m, -iMo15907i);
                    return;
                }
                return;
            }
            return;
        }
        int iMo15907i2 = (this.f41724a.mo15907i() - iMo15912n) - this.f41724a.mo15902d(view);
        this.f41726c = this.f41724a.mo15907i() - iMo15907i2;
        if (iMo15907i2 > 0) {
            int iMo15903e = this.f41726c - this.f41724a.mo15903e(view);
            int iMo15911m2 = this.f41724a.mo15911m();
            int iMin = iMo15903e - (Math.min(this.f41724a.mo15905g(view) - iMo15911m2, 0) + iMo15911m2);
            if (iMin < 0) {
                this.f41726c = Math.min(iMo15907i2, -iMin) + this.f41726c;
            }
        }
    }

    /* renamed from: d */
    public final void m15889d() {
        this.f41725b = -1;
        this.f41726c = Integer.MIN_VALUE;
        this.f41727d = false;
        this.f41728e = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.f41725b);
        sb2.append(", mCoordinate=");
        sb2.append(this.f41726c);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.f41727d);
        sb2.append(", mValid=");
        return i0.m0.m7382o(sb2, this.f41728e, '}');
    }
}
