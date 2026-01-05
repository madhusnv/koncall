package p001o;

import ai.salesmax.model.EngagementUpdateSummary;
import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class v49 extends t49 {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final ConstraintLayout u0;
    public final LinearLayout v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.updateContent, 5);
    }

    public v49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, x0, y0));
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
        if (73 == i) {
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((EngagementUpdateSummary) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.t0 = ck6Var;
    }

    public void i0(EngagementUpdateSummary engagementUpdateSummary) {
        this.r0 = engagementUpdateSummary;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.s0 = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View, android.widget.LinearLayout] */
    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long createdAt;
        String name;
        String str;
        boolean z;
        boolean z2;
        ?? r0;
        String note;
        LeadsUser updatedBy;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        EngagementUpdateSummary engagementUpdateSummary = this.r0;
        long j2 = j & 12;
        if (j2 != 0) {
            if (engagementUpdateSummary != null) {
                note = engagementUpdateSummary.getNote();
                updatedBy = engagementUpdateSummary.getUpdatedBy();
                createdAt = engagementUpdateSummary.getCreatedAt();
            } else {
                createdAt = 0;
                note = null;
                updatedBy = null;
            }
            z = note != null;
            z2 = note == null;
            if (j2 != 0) {
                j = z ? j | 32 : j | 16;
            }
            if ((j & 12) != 0) {
                j = z2 ? j | 128 : j | 64;
            }
            name = updatedBy != null ? updatedBy.getName() : null;
            str = note;
        } else {
            createdAt = 0;
            name = null;
            str = null;
            z = false;
            z2 = false;
        }
        boolean zM50930a = ((64 & j) == 0 || str == null) ? false : u49.m50930a(str);
        boolean z3 = ((32 & j) == 0 || str == "") ? false : true;
        long j3 = j & 12;
        if (j3 != 0) {
            if (!z) {
                z3 = false;
            }
            boolean z4 = z2 ? true : zM50930a;
            if (j3 != 0) {
                j |= z3 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 12) != 0) {
                j |= z4 ? 512L : 256L;
            }
            r0 = z3 ? false : 8;
            z = z4;
        } else {
            r0 = 0;
        }
        long j4 = j & 12;
        String str2 = j4 != 0 ? z ? "Scheduled a Follow up" : str : null;
        if (j4 != 0) {
            this.v0.setVisibility(r0);
            fjh.m26938c(this.n0, name);
            fjh.m26938c(this.p0, str2);
            nr1.h0(this.q0, Long.valueOf(createdAt));
        }
    }

    public v49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[1], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4], (MaterialTextView) objArr[2]);
        this.w0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        this.v0 = linearLayout;
        linearLayout.setTag(null);
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
