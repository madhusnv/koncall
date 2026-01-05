package p001o;

import ai.salesmax.model.FilterData;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class ez8 extends dz8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0 = null;
    public final MaterialCardView t0;
    public final View.OnClickListener u0;
    public final View.OnClickListener v0;
    public long w0;

    public ez8(yt4 yt4Var, View view) {
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
            this.w0 = 16L;
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
        } else if (67 == i) {
            i0((FilterData) obj);
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (81 != i) {
                return false;
            }
            k0((String) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.s0;
            FilterData filterData = this.p0;
            Integer num = this.q0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), filterData);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.s0;
        FilterData filterData2 = this.p0;
        Integer num2 = this.q0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), filterData2);
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

    public void i0(FilterData filterData) {
        this.p0 = filterData;
        synchronized (this) {
            this.w0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.q0 = num;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    public void k0(String str) {
        this.r0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean zIsSelected;
        String text;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        FilterData filterData = this.p0;
        long j2 = 18 & j;
        if (j2 == 0 || filterData == null) {
            zIsSelected = false;
            text = null;
        } else {
            zIsSelected = filterData.isSelected();
            text = filterData.getText();
        }
        if (j2 != 0) {
            np3.m40895a(this.n0, zIsSelected);
            fjh.m26938c(this.o0, text);
        }
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.v0);
            this.t0.setOnClickListener(this.u0);
        }
    }

    public ez8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (CheckBox) objArr[2], (MaterialTextView) objArr[1]);
        this.w0 = -1L;
        this.n0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.t0 = materialCardView;
        materialCardView.setTag(null);
        this.o0.setTag(null);
        a0(view);
        this.u0 = new jbc(this, 1);
        this.v0 = new jbc(this, 2);
        mo16291G();
    }
}
