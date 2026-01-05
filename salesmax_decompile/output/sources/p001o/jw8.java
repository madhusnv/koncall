package p001o;

import ai.salesmax.model.ActivitiesStatus;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class jw8 extends iw8 {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0 = null;
    public final ConstraintLayout v0;
    public long w0;

    public jw8(yt4 yt4Var, View view) {
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
        if (33 == i) {
            h0((ck6) obj);
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((ActivitiesStatus) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.u0 = ck6Var;
    }

    public void i0(ActivitiesStatus activitiesStatus) {
        this.s0 = activitiesStatus;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.t0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        int color;
        String str;
        String str2;
        Integer icon;
        boolean zIsBetterThanPrevious;
        long metricsValue;
        String str3;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        ActivitiesStatus activitiesStatus = this.s0;
        long j2 = j & 12;
        boolean z = false;
        int i2 = 0;
        String str4 = null;
        if (j2 != 0) {
            if (activitiesStatus != null) {
                String metricsName = activitiesStatus.getMetricsName();
                int percentage = activitiesStatus.getPercentage();
                color = activitiesStatus.getColor();
                metricsValue = activitiesStatus.getMetricsValue();
                icon = activitiesStatus.getIcon();
                zIsBetterThanPrevious = activitiesStatus.isBetterThanPrevious();
                str3 = metricsName;
                i2 = percentage;
            } else {
                zIsBetterThanPrevious = false;
                icon = null;
                metricsValue = 0;
                str3 = null;
                color = 0;
            }
            str2 = metricsValue + "";
            str4 = i2 + "";
            String str5 = str3;
            i = i2;
            z = zIsBetterThanPrevious;
            str = str5;
        } else {
            i = 0;
            color = 0;
            str = null;
            str2 = null;
            icon = null;
        }
        if (j2 != 0) {
            nr1.F0(this.n0, str4, Boolean.valueOf(z));
            nr1.m40980y(this.o0, icon);
            nr1.m40978w(this.o0, Integer.valueOf(color));
            fjh.m26938c(this.p0, str);
            this.q0.setProgress(i);
            nr1.m40979x(this.q0, Integer.valueOf(color));
            fjh.m26938c(this.r0, str2);
        }
    }

    public jw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[5], (MaterialButton) objArr[3], (MaterialTextView) objArr[1], (LinearProgressIndicator) objArr[2], (MaterialTextView) objArr[4]);
        this.w0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
