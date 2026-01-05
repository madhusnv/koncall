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
import p001o.jbc;

/* loaded from: classes.dex */
public class d24 extends c24 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public long C0;
    public final ConstraintLayout z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.homeActivitiesStatus, 5);
        sparseIntArray.put(z8e.homeActivitiesBorder1, 6);
    }

    public d24(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 64L;
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
            k0((Integer) obj);
        } else if (72 == i) {
            j0((ActivityMetrics.Period) obj);
        } else if (67 == i) {
            i0((ArrayList) obj);
        } else if (68 == i) {
            m0((HomeTasksStatus) obj);
        } else {
            if (92 != i) {
                return false;
            }
            l0((Boolean) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.y0;
            ArrayList arrayList = this.t0;
            Integer num = this.w0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), arrayList);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.y0;
        ArrayList arrayList2 = this.t0;
        Integer num2 = this.w0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), arrayList2);
        }
    }

    @Override // p001o.c24
    public void h0(ck6 ck6Var) {
        this.y0 = ck6Var;
        synchronized (this) {
            this.C0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.c24
    public void i0(ArrayList arrayList) {
        this.t0 = arrayList;
        synchronized (this) {
            this.C0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.c24
    public void j0(ActivityMetrics.Period period) {
        this.v0 = period;
        synchronized (this) {
            this.C0 |= 4;
        }
        m28509h(72);
        super.m25692R();
    }

    @Override // p001o.c24
    public void k0(Integer num) {
        this.w0 = num;
        synchronized (this) {
            this.C0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.c24
    public void l0(Boolean bool) {
        this.x0 = bool;
        synchronized (this) {
            this.C0 |= 32;
        }
        m28509h(92);
        super.m25692R();
    }

    public void m0(HomeTasksStatus homeTasksStatus) {
        this.u0 = homeTasksStatus;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        ActivityMetrics.Period period = this.v0;
        ArrayList arrayList = this.t0;
        Boolean bool = this.x0;
        String str = null;
        String string = ((j & 68) == 0 || period == null) ? null : period.toString();
        long j2 = j & 96;
        if (j2 != 0) {
            boolean zM25676W = ewi.m25676W(bool);
            if (j2 != 0) {
                j |= zM25676W ? 256L : 128L;
            }
            str = zM25676W ? "Unique" : "Calls";
        }
        if ((72 & j) != 0) {
            ez7.m25880d(this.o0, arrayList);
        }
        if ((j & 68) != 0) {
            fjh.m26938c(this.p0, string);
        }
        if ((64 & j) != 0) {
            this.r0.setOnClickListener(this.B0);
            this.s0.setOnClickListener(this.A0);
        }
        if ((j & 96) != 0) {
            fjh.m26938c(this.r0, str);
        }
    }

    public d24(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[6], (RecyclerView) objArr[4], (MaterialTextView) objArr[3], (MaterialButton) objArr[5], (MaterialTextView) objArr[1], (MaterialButton) objArr[2]);
        this.C0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.r0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.z0 = constraintLayout;
        constraintLayout.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.A0 = new jbc(this, 2);
        this.B0 = new jbc(this, 1);
        mo16291G();
    }
}
