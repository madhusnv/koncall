package p001o;

import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class pw8 extends ow8 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0 = null;
    public long t0;

    public pw8(yt4 yt4Var, View view) {
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
            j0((LeadsUser) obj);
        } else {
            if (73 != i) {
                return false;
            }
            k0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.ow8
    public void j0(LeadsUser leadsUser) {
        this.r0 = leadsUser;
        synchronized (this) {
            this.t0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ow8
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
        LeadsUser leadsUser = this.r0;
        long j2 = j & 5;
        String name = (j2 == 0 || leadsUser == null) ? null : leadsUser.getName();
        if (j2 != 0) {
            nr1.f1(this.n0, name);
            nr1.V0(this.p0, leadsUser);
            nr1.L2(this.q0, leadsUser);
        }
    }

    public pw8(yt4 yt4Var, View view, Object[] objArr) {
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
