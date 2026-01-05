package p001o;

import ai.salesmax.model.FilterData;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class gy8 extends fy8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0 = null;
    public final MaterialCardView t0;
    public final View.OnClickListener u0;
    public long v0;

    public gy8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 8L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((FilterData) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.s0;
        FilterData filterData = this.q0;
        Integer num = this.r0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), filterData);
        }
    }

    public void h0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.v0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(FilterData filterData) {
        this.q0 = filterData;
        synchronized (this) {
            this.v0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.r0 = num;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        String str;
        Long l;
        boolean z;
        boolean z2;
        int i;
        long j2;
        long j3;
        String text;
        Long startFrom;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        FilterData filterData = this.q0;
        long j4 = j & 12;
        int i2 = 0;
        if (j4 != 0) {
            if (filterData != null) {
                text = filterData.getText();
                startFrom = filterData.getStartFrom();
            } else {
                text = null;
                startFrom = null;
            }
            z = ewi.m25675V(startFrom) == -1;
            if (j4 != 0) {
                j = z ? j | 32 : j | 16;
            }
            str = text;
            l = startFrom;
        } else {
            str = null;
            l = null;
            z = false;
        }
        if ((32 & j) == 0) {
            z2 = false;
        } else {
            if (ewi.m25675V(filterData != null ? filterData.getEndTo() : null) == -1) {
                z2 = true;
            }
        }
        long j5 = j & 12;
        if (j5 != 0) {
            if (!z) {
                z2 = false;
            }
            if (j5 != 0) {
                if (z2) {
                    j2 = j | 128;
                    j3 = 512;
                } else {
                    j2 = j | 64;
                    j3 = 256;
                }
                j = j2 | j3;
            }
            i = z2 ? 8 : 0;
            if (!z2) {
                i2 = 8;
            }
        } else {
            i = 0;
        }
        if ((8 & j) != 0) {
            this.t0.setOnClickListener(this.u0);
        }
        if ((j & 12) != 0) {
            this.n0.setVisibility(i2);
            fjh.m26938c(this.o0, str);
            nr1.o0(this.p0, l);
            this.p0.setVisibility(i);
        }
    }

    public gy8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[2], (MaterialTextView) objArr[1], (MaterialTextView) objArr[3]);
        this.v0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.t0 = materialCardView;
        materialCardView.setTag(null);
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        a0(view);
        this.u0 = new jbc(this, 1);
        mo16291G();
    }
}
