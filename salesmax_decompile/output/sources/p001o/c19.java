package p001o;

import ai.salesmax.model.ResultsItem;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class c19 extends b19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0 = null;
    public final View.OnClickListener u0;
    public final View.OnClickListener v0;
    public long w0;

    public c19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, x0, y0));
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
            i0((ResultsItem) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t0;
            ResultsItem resultsItem = this.r0;
            Integer num = this.s0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), resultsItem);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.t0;
        ResultsItem resultsItem2 = this.r0;
        Integer num2 = this.s0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), resultsItem2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.t0 = ck6Var;
        synchronized (this) {
            this.w0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(ResultsItem resultsItem) {
        this.r0 = resultsItem;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.s0 = num;
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
        String formatted_address;
        String name;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        ResultsItem resultsItem = this.r0;
        long j2 = 12 & j;
        if (j2 == 0 || resultsItem == null) {
            formatted_address = null;
            name = null;
        } else {
            formatted_address = resultsItem.getFormatted_address();
            name = resultsItem.getName();
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.v0);
            this.q0.setOnClickListener(this.u0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.o0, formatted_address);
            nr1.f1(this.p0, name);
        }
    }

    public c19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[0], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (ShapeableImageView) objArr[1]);
        this.w0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.u0 = new jbc(this, 2);
        this.v0 = new jbc(this, 1);
        mo16291G();
    }
}
