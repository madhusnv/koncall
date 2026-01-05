package p001o;

import ai.salesmax.model.TodoViewCounts;
import ai.salesmax.view.ViewProgressCard;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class i39 extends h39 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0 = null;
    public final LinearLayout u0;
    public long v0;

    public i39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 8L;
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
            i0((TodoViewCounts) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.t0 = ck6Var;
    }

    public void i0(TodoViewCounts todoViewCounts) {
        this.r0 = todoViewCounts;
        synchronized (this) {
            this.v0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.s0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int iCallTaskInPercentage;
        String strCallTaskCount;
        String strCompletedTaskCount;
        String strOpenTaskCount;
        String strVisitTaskCount;
        int iOpenTaskInPercentage;
        int iCompletedTaskInPercentage;
        int iVisitTaskInPercentage;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        TodoViewCounts todoViewCounts = this.r0;
        long j2 = j & 12;
        if (j2 == 0 || todoViewCounts == null) {
            iCallTaskInPercentage = 0;
            strCallTaskCount = null;
            strCompletedTaskCount = null;
            strOpenTaskCount = null;
            strVisitTaskCount = null;
            iOpenTaskInPercentage = 0;
            iCompletedTaskInPercentage = 0;
            iVisitTaskInPercentage = 0;
        } else {
            strCallTaskCount = todoViewCounts.callTaskCount();
            iCallTaskInPercentage = todoViewCounts.callTaskInPercentage();
            strCompletedTaskCount = todoViewCounts.completedTaskCount();
            iCompletedTaskInPercentage = todoViewCounts.completedTaskInPercentage();
            iVisitTaskInPercentage = todoViewCounts.visitTaskInPercentage();
            strOpenTaskCount = todoViewCounts.openTaskCount();
            strVisitTaskCount = todoViewCounts.visitTaskCount();
            iOpenTaskInPercentage = todoViewCounts.openTaskInPercentage();
        }
        if (j2 != 0) {
            nr1.b2(this.n0, iCompletedTaskInPercentage);
            nr1.d2(this.n0, strCompletedTaskCount);
            nr1.b2(this.o0, iCallTaskInPercentage);
            nr1.d2(this.o0, strCallTaskCount);
            nr1.b2(this.p0, iOpenTaskInPercentage);
            nr1.d2(this.p0, strOpenTaskCount);
            nr1.b2(this.q0, iVisitTaskInPercentage);
            nr1.d2(this.q0, strVisitTaskCount);
        }
    }

    public i39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ViewProgressCard) objArr[3], (ViewProgressCard) objArr[2], (ViewProgressCard) objArr[1], (ViewProgressCard) objArr[4]);
        this.v0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.u0 = linearLayout;
        linearLayout.setTag(null);
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
