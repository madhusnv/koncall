package p001o;

import ai.salesmax.model.EngagementUpdateSummary;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class e19 extends d19 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final MaterialCardView s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.updateTitle, 2);
    }

    public e19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, u0, v0));
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
            i0((EngagementUpdateSummary) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.r0 = ck6Var;
    }

    public void i0(EngagementUpdateSummary engagementUpdateSummary) {
        this.p0 = engagementUpdateSummary;
        synchronized (this) {
            this.t0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.q0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long createdAt;
        synchronized (this) {
            j = this.t0;
            createdAt = 0;
            this.t0 = 0L;
        }
        EngagementUpdateSummary engagementUpdateSummary = this.p0;
        long j2 = j & 10;
        if (j2 != 0 && engagementUpdateSummary != null) {
            createdAt = engagementUpdateSummary.getCreatedAt();
        }
        if (j2 != 0) {
            nr1.h0(this.o0, Long.valueOf(createdAt));
        }
    }

    public e19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.t0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.s0 = materialCardView;
        materialCardView.setTag(null);
        this.o0.setTag(null);
        a0(view);
        mo16291G();
    }
}
