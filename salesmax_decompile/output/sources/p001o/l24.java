package p001o;

import ai.salesmax.model.HomeActivity;
import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.view.WrapContentViewPager;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class l24 extends k24 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i G0;
    public static final SparseIntArray H0;
    public final ConstraintLayout B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public long F0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        G0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_home_pager_calls", "content_home_pager_visits", "content_home_pager_leads"}, new int[]{6, 7, 8}, new int[]{p9e.content_home_pager_calls, p9e.content_home_pager_visits, p9e.content_home_pager_leads});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H0 = sparseIntArray;
        sparseIntArray.put(z8e.tabLayoutParent, 9);
        sparseIntArray.put(z8e.pagerTab, 10);
        sparseIntArray.put(z8e.homePagerCard, 11);
    }

    public l24(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, G0, H0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.F0 != 0) {
                return true;
            }
            return this.s0.mo16290E() || this.u0.mo16290E() || this.t0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.F0 = 64L;
        }
        this.s0.mo16291G();
        this.u0.mo16291G();
        this.t0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return i0((e24) obj, i2);
        }
        if (i == 1) {
            return j0((g24) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return h0((c24) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            m0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((HomeTasksStatus) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.A0;
            HomeTasksStatus homeTasksStatus = this.y0;
            Integer num = this.z0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), homeTasksStatus);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.A0;
            HomeTasksStatus homeTasksStatus2 = this.y0;
            Integer num2 = this.z0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), homeTasksStatus2);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var3 = this.A0;
        HomeTasksStatus homeTasksStatus3 = this.y0;
        Integer num3 = this.z0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), homeTasksStatus3);
        }
    }

    public final boolean h0(c24 c24Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.F0 |= 4;
        }
        return true;
    }

    public final boolean i0(e24 e24Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.F0 |= 1;
        }
        return true;
    }

    public final boolean j0(g24 g24Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.F0 |= 2;
        }
        return true;
    }

    public void k0(ck6 ck6Var) {
        this.A0 = ck6Var;
        synchronized (this) {
            this.F0 |= 16;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(HomeTasksStatus homeTasksStatus) {
        this.y0 = homeTasksStatus;
        synchronized (this) {
            this.F0 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    public void m0(Integer num) {
        this.z0 = num;
        synchronized (this) {
            this.F0 |= 8;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() throws Resources.NotFoundException {
        long j;
        int i;
        int i2;
        ActivityMetrics.Period period;
        ArrayList<HomeActivity> arrayList;
        ArrayList<HomeActivity> arrayList2;
        ActivityMetrics.Period period2;
        ArrayList<HomeActivity> activities;
        ArrayList<HomeActivity> visits;
        synchronized (this) {
            j = this.F0;
            this.F0 = 0L;
        }
        Integer num = this.z0;
        ck6 ck6Var = this.A0;
        HomeTasksStatus homeTasksStatus = this.y0;
        boolean showUniqueCalls = false;
        if ((j & 64) != 0) {
            i = z8e.homePager;
            i2 = z8e.pagerTab;
        } else {
            i = 0;
            i2 = 0;
        }
        long j2 = j & 96;
        if (j2 != 0) {
            if (homeTasksStatus != null) {
                showUniqueCalls = homeTasksStatus.getShowUniqueCalls();
                period2 = homeTasksStatus.getPeriod();
                activities = homeTasksStatus.getActivities();
                visits = homeTasksStatus.getVisits();
            } else {
                period2 = null;
                activities = null;
                visits = null;
            }
            if (j2 != 0) {
                j = showUniqueCalls ? j | 256 : j | 128;
            }
            period = period2;
            arrayList = activities;
            arrayList2 = visits;
        } else {
            period = null;
            arrayList = null;
            arrayList2 = null;
        }
        long j3 = 96 & j;
        ArrayList<HomeActivity> uniqueCalls = j3 != 0 ? showUniqueCalls ? ((j & 256) == 0 || homeTasksStatus == null) ? null : homeTasksStatus.getUniqueCalls() : ((j & 128) == 0 || homeTasksStatus == null) ? null : homeTasksStatus.getCalls() : null;
        if ((64 & j) != 0) {
            this.n0.setOnClickListener(this.E0);
            this.o0.setOnClickListener(this.D0);
            this.p0.setOnClickListener(this.C0);
            ez7.m25879c(this.B0, Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (j3 != 0) {
            this.s0.i0(uniqueCalls);
            this.s0.j0(period);
            this.s0.l0(Boolean.valueOf(showUniqueCalls));
            this.t0.h0(arrayList);
            this.t0.i0(period);
            this.u0.h0(arrayList2);
            this.u0.i0(period);
            nr1.m40939J(this.x0, period);
        }
        if ((80 & j) != 0) {
            this.s0.h0(ck6Var);
        }
        if ((j & 72) != 0) {
            this.s0.k0(num);
        }
        ewi.m25683r(this.s0);
        ewi.m25683r(this.u0);
        ewi.m25683r(this.t0);
    }

    public l24(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 3, (Button) objArr[5], (Button) objArr[3], (Button) objArr[4], (WrapContentViewPager) objArr[1], (MaterialCardView) objArr[11], (c24) objArr[6], (e24) objArr[8], (g24) objArr[7], (TabLayout) objArr[10], (FrameLayout) objArr[9], (MaterialButtonToggleGroup) objArr[2]);
        this.F0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B0 = constraintLayout;
        constraintLayout.setTag(null);
        m25693Z(this.s0);
        m25693Z(this.t0);
        m25693Z(this.u0);
        this.x0.setTag(null);
        a0(view);
        this.C0 = new jbc(this, 2);
        this.D0 = new jbc(this, 1);
        this.E0 = new jbc(this, 3);
        mo16291G();
    }
}
