package p001o;

import ai.salesmax.model.LeadInteractionsSummary;
import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.Date;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class sz8 extends rz8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0 = null;
    public final ConstraintLayout v0;
    public final View.OnClickListener w0;
    public long x0;

    public sz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, y0, z0));
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
            this.x0 = 8L;
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
            i0((LeadInteractionsSummary) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.u0;
        LeadInteractionsSummary leadInteractionsSummary = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leadInteractionsSummary);
        }
    }

    public void h0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(LeadInteractionsSummary leadInteractionsSummary) {
        this.s0 = leadInteractionsSummary;
        synchronized (this) {
            this.x0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
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
        int i;
        String interactionTitle;
        Date engagementTime;
        String outcome;
        String profilePic;
        LeadsUser engagementUser;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        LeadInteractionsSummary leadInteractionsSummary = this.s0;
        long j2 = j & 12;
        String name = null;
        if (j2 != 0) {
            if (leadInteractionsSummary != null) {
                interactionTitle = leadInteractionsSummary.getInteractionTitle();
                engagementUser = leadInteractionsSummary.getEngagementUser();
                engagementTime = leadInteractionsSummary.getEngagementTime();
                outcome = leadInteractionsSummary.getOutcome();
            } else {
                interactionTitle = null;
                engagementUser = null;
                engagementTime = null;
                outcome = null;
            }
            if (engagementUser != null) {
                name = engagementUser.getName();
                profilePic = engagementUser.getProfilePic();
            } else {
                profilePic = null;
            }
            boolean z = engagementUser == null;
            boolean z2 = outcome == null;
            if (j2 != 0) {
                j |= z ? 128L : 64L;
            }
            if ((j & 12) != 0) {
                j |= z2 ? 32L : 16L;
            }
            int i2 = z ? 8 : 0;
            i = z2 ? 8 : 0;
            i = i2;
        } else {
            i = 0;
            interactionTitle = null;
            engagementTime = null;
            outcome = null;
            profilePic = null;
        }
        if ((12 & j) != 0) {
            fjh.m26938c(this.n0, name);
            nr1.m40940K(this.n0, profilePic);
            this.n0.setVisibility(i);
            nr1.Y2(this.o0, leadInteractionsSummary);
            fjh.m26938c(this.p0, interactionTitle);
            nr1.f1(this.q0, outcome);
            this.q0.setVisibility(i);
            nr1.j2(this.r0, engagementTime);
        }
        if ((j & 8) != 0) {
            this.v0.setOnClickListener(this.w0);
        }
    }

    public sz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[3], (ShapeableImageView) objArr[2], (MaterialTextView) objArr[1], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4]);
        this.x0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        this.w0 = new jbc(this, 1);
        mo16291G();
    }
}
