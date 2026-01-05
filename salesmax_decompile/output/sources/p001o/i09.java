package p001o;

import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class i09 extends h09 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0 = null;
    public long t0;

    public i09(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, u0, v0));
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
            this.t0 = 4L;
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
        if (67 == i) {
            j0((Leads) obj);
        } else {
            if (73 != i) {
                return false;
            }
            k0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.h09
    public void j0(Leads leads) {
        this.r0 = leads;
        synchronized (this) {
            this.t0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.h09
    public void k0(Integer num) {
        this.s0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        Leads leads = this.r0;
        if ((j & 5) != 0) {
            nr1.d1(this.n0, leads);
            nr1.X0(this.p0, leads);
            nr1.Z0(this.q0, leads);
        }
    }

    public i09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[2], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[3]);
        this.t0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
