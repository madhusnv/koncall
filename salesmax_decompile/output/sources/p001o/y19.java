package p001o;

import ai.salesmax.model.ProductServiceSummary;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class y19 extends x19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0 = null;
    public final View.OnClickListener w0;
    public long x0;

    public y19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 16L;
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
            i0((ck6) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (7 == i) {
            h0((rog) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ProductServiceSummary) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.u0;
        ProductServiceSummary productServiceSummary = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), productServiceSummary);
        }
    }

    public void h0(rog rogVar) {
        this.v0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(ProductServiceSummary productServiceSummary) {
        this.s0 = productServiceSummary;
        synchronized (this) {
            this.x0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.x0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String type2;
        String str;
        String name;
        int i;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        ProductServiceSummary productServiceSummary = this.s0;
        long j2 = j & 24;
        String str2 = null;
        if (j2 != 0) {
            if (productServiceSummary != null) {
                String description = productServiceSummary.getDescription();
                String hsCode = productServiceSummary.getHsCode();
                name = productServiceSummary.getName();
                type2 = productServiceSummary.getType();
                str = description;
                str2 = hsCode;
            } else {
                type2 = null;
                str = null;
                name = null;
            }
            boolean z = str2 == "";
            boolean z2 = type2 != "";
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            if ((j & 24) != 0) {
                j |= z2 ? 256L : 128L;
            }
            int i2 = z ? 8 : 0;
            i = z2 ? 0 : 8;
            i = i2;
        } else {
            type2 = null;
            str = null;
            name = null;
            i = 0;
        }
        if ((24 & j) != 0) {
            this.n0.setVisibility(i);
            fjh.m26938c(this.n0, str2);
            this.p0.setVisibility(i);
            nr1.g1(this.p0, type2);
            fjh.m26938c(this.q0, str);
            nr1.f1(this.r0, name);
        }
        if ((j & 16) != 0) {
            this.o0.setOnClickListener(this.w0);
        }
    }

    public y19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[4], (MaterialCardView) objArr[0], (Chip) objArr[3], (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.x0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.w0 = new jbc(this, 1);
        mo16291G();
    }
}
