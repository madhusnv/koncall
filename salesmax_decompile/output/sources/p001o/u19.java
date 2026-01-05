package p001o;

import ai.salesmax.model.LeadSource;
import android.R;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class u19 extends t19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0 = null;
    public final View.OnClickListener t0;
    public final View.OnClickListener u0;
    public final View.OnClickListener v0;
    public long w0;

    public u19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.w0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 8L;
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
        if (33 == i) {
            h0((ck6) obj);
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((LeadSource) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.s0;
            LeadSource leadSource = this.q0;
            Integer num = this.r0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leadSource);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.s0;
            LeadSource leadSource2 = this.q0;
            Integer num2 = this.r0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), leadSource2);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var3 = this.s0;
        LeadSource leadSource3 = this.q0;
        Integer num3 = this.r0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), leadSource3);
        }
    }

    public void h0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.w0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(LeadSource leadSource) {
        this.q0 = leadSource;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.r0 = num;
        synchronized (this) {
            this.w0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        LeadSource leadSource = this.q0;
        long j2 = j & 12;
        int iM25688z = 0;
        boolean zIsSelected = false;
        String name = null;
        if (j2 != 0) {
            if (leadSource != null) {
                zIsSelected = leadSource.isSelected();
                name = leadSource.getName();
            }
            if (j2 != 0) {
                j |= zIsSelected ? 32L : 16L;
            }
            iM25688z = ewi.m25688z(this.p0, zIsSelected ? u6e.superfone_purple_10 : R.color.transparent);
        }
        if ((8 & j) != 0) {
            this.n0.setOnClickListener(this.v0);
            this.o0.setOnClickListener(this.t0);
            this.p0.setOnClickListener(this.u0);
        }
        if ((j & 12) != 0) {
            nr1.H1(this.n0, name);
            fjh.m26938c(this.o0, name);
            if (ewi.m25687y() >= 21) {
                this.p0.setBackgroundTintList(b74.m18212a(iM25688z));
            }
        }
    }

    public u19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[1], (MaterialTextView) objArr[2], (LinearLayout) objArr[0]);
        this.w0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        a0(view);
        this.t0 = new jbc(this, 3);
        this.u0 = new jbc(this, 1);
        this.v0 = new jbc(this, 2);
        mo16291G();
    }
}
