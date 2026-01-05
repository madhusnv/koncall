package p001o;

import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.services.model.ActivityMetrics;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import p001o.ewi;

/* loaded from: classes.dex */
public class f24 extends e24 {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final ConstraintLayout x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.homeActivitiesTitle, 3);
        sparseIntArray.put(z8e.homeActivitiesStatus, 4);
        sparseIntArray.put(z8e.homeActivitiesBorder1, 5);
    }

    public f24(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 32L;
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
            j0((ck6) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else if (72 == i) {
            i0((ActivityMetrics.Period) obj);
        } else if (67 == i) {
            h0((ArrayList) obj);
        } else {
            if (68 != i) {
                return false;
            }
            k0((HomeTasksStatus) obj);
        }
        return true;
    }

    @Override // p001o.e24
    public void h0(ArrayList arrayList) {
        this.s0 = arrayList;
        synchronized (this) {
            this.y0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.e24
    public void i0(ActivityMetrics.Period period) {
        this.u0 = period;
        synchronized (this) {
            this.y0 |= 4;
        }
        m28509h(72);
        super.m25692R();
    }

    public void j0(ck6 ck6Var) {
        this.w0 = ck6Var;
    }

    public void k0(HomeTasksStatus homeTasksStatus) {
        this.t0 = homeTasksStatus;
    }

    public void l0(Integer num) {
        this.v0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.y0;
            this.y0 = 0L;
        }
        ActivityMetrics.Period period = this.u0;
        ArrayList arrayList = this.s0;
        long j2 = 36 & j;
        String string = (j2 == 0 || period == null) ? null : period.toString();
        if ((j & 40) != 0) {
            ez7.m25880d(this.o0, arrayList);
        }
        if (j2 != 0) {
            fjh.m26938c(this.p0, string);
        }
    }

    public f24(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[5], (RecyclerView) objArr[2], (MaterialTextView) objArr[1], (MaterialButton) objArr[4], (MaterialTextView) objArr[3]);
        this.y0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
