package p001o;

import ai.salesmax.model.FilterData;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.card.MaterialCardView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class cz8 extends bz8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final MaterialCardView r0;
    public final View.OnClickListener s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.searchAutoComplete, 1);
    }

    public cz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 2, u0, v0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.t0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.t0 = 8L;
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
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.q0;
        FilterData filterData = this.o0;
        Integer num = this.p0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), filterData);
        }
    }

    public void h0(ck6 ck6Var) {
        this.q0 = ck6Var;
        synchronized (this) {
            this.t0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(FilterData filterData) {
        this.o0 = filterData;
        synchronized (this) {
            this.t0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.p0 = num;
        synchronized (this) {
            this.t0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        if ((j & 8) != 0) {
            this.r0.setOnClickListener(this.s0);
        }
    }

    public cz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AutoCompleteTextView) objArr[1]);
        this.t0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.r0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        this.s0 = new jbc(this, 1);
        mo16291G();
    }
}
