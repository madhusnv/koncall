package p001o;

import ai.salesmax.services.model.ActivityMetrics;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.ArrayList;
import p001o.ewi;

/* loaded from: classes.dex */
public class ki7 extends ji7 {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final ConstraintLayout x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.btnToday, 2);
        sparseIntArray.put(z8e.btnWeek, 3);
        sparseIntArray.put(z8e.btnMonth, 4);
        sparseIntArray.put(z8e.homeActivitiesBorder1, 5);
        sparseIntArray.put(z8e.homeActivitiesList, 6);
    }

    public ki7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, z0, A0));
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
            this.y0 = 16L;
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
            k0((ck6) obj);
        } else if (73 == i) {
            m0((Integer) obj);
        } else if (72 == i) {
            j0((ActivityMetrics.Period) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((ArrayList) obj);
        }
        return true;
    }

    @Override // p001o.ji7
    public void j0(ActivityMetrics.Period period) {
        this.u0 = period;
        synchronized (this) {
            this.y0 |= 4;
        }
        m28509h(72);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.w0 = ck6Var;
    }

    public void l0(ArrayList arrayList) {
        this.t0 = arrayList;
    }

    public void m0(Integer num) {
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
        if ((j & 20) != 0) {
            nr1.m40939J(this.s0, period);
        }
    }

    public ki7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[4], (Button) objArr[2], (Button) objArr[3], (View) objArr[5], (RecyclerView) objArr[6], (MaterialButtonToggleGroup) objArr[1]);
        this.y0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        this.s0.setTag(null);
        a0(view);
        mo16291G();
    }
}
