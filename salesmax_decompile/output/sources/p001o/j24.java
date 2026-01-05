package p001o;

import ai.salesmax.model.HomeProgress;
import ai.salesmax.model.HomeProgressList;
import ai.salesmax.view.ViewProgressCard2;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class j24 extends i24 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0 = null;
    public final ConstraintLayout u0;
    public final View.OnClickListener v0;
    public final View.OnClickListener w0;
    public final View.OnClickListener x0;
    public final View.OnClickListener y0;
    public long z0;

    public j24(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.z0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 8L;
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
            i0((HomeProgressList) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t0;
            HomeProgressList homeProgressList = this.r0;
            Integer num = this.s0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), homeProgressList);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.t0;
            HomeProgressList homeProgressList2 = this.r0;
            Integer num2 = this.s0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), homeProgressList2);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var3 = this.t0;
            HomeProgressList homeProgressList3 = this.r0;
            Integer num3 = this.s0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), homeProgressList3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var4 = this.t0;
        HomeProgressList homeProgressList4 = this.r0;
        Integer num4 = this.s0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), homeProgressList4);
        }
    }

    public void h0(ck6 ck6Var) {
        this.t0 = ck6Var;
        synchronized (this) {
            this.z0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(HomeProgressList homeProgressList) {
        this.r0 = homeProgressList;
        synchronized (this) {
            this.z0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.s0 = num;
        synchronized (this) {
            this.z0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        String progressTitle;
        boolean z;
        int progressPercent;
        int progressColor;
        int i;
        boolean z2;
        int i2;
        int progressColor2;
        int i3;
        int progressIcon;
        int progressIcon2;
        int progressColor3;
        int progressIcon3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        String str2;
        HomeProgress progressOne;
        HomeProgress progressThree;
        HomeProgress progressFour;
        HomeProgress progressTwo;
        boolean hasNewCounts;
        int progressPercent2;
        int progressColor4;
        int progressIcon4;
        String progressTitle2;
        boolean hasNewCounts2;
        String progressTitle3;
        int progressPercent3;
        boolean hasNewCounts3;
        synchronized (this) {
            j = this.z0;
            this.z0 = 0L;
        }
        HomeProgressList homeProgressList = this.r0;
        long j2 = 12 & j;
        String str3 = null;
        if (j2 != 0) {
            if (homeProgressList != null) {
                progressThree = homeProgressList.getProgressThree();
                progressFour = homeProgressList.getProgressFour();
                progressTwo = homeProgressList.getProgressTwo();
                progressOne = homeProgressList.getProgressOne();
            } else {
                progressOne = null;
                progressThree = null;
                progressFour = null;
                progressTwo = null;
            }
            if (progressThree != null) {
                progressPercent2 = progressThree.getProgressPercent();
                progressColor4 = progressThree.getProgressColor();
                progressTitle = progressThree.getProgressTitle();
                progressIcon4 = progressThree.getProgressIcon();
                hasNewCounts = progressThree.getHasNewCounts();
            } else {
                progressTitle = null;
                hasNewCounts = false;
                progressPercent2 = 0;
                progressColor4 = 0;
                progressIcon4 = 0;
            }
            if (progressFour != null) {
                progressColor2 = progressFour.getProgressColor();
                progressTitle2 = progressFour.getProgressTitle();
                hasNewCounts2 = progressFour.getHasNewCounts();
                progressIcon = progressFour.getProgressIcon();
                progressPercent = progressFour.getProgressPercent();
            } else {
                progressTitle2 = null;
                progressPercent = 0;
                progressColor2 = 0;
                hasNewCounts2 = false;
                progressIcon = 0;
            }
            if (progressTwo != null) {
                hasNewCounts3 = progressTwo.getHasNewCounts();
                progressIcon2 = progressTwo.getProgressIcon();
                progressTitle3 = progressTwo.getProgressTitle();
                progressColor3 = progressTwo.getProgressColor();
                progressPercent3 = progressTwo.getProgressPercent();
            } else {
                progressTitle3 = null;
                progressPercent3 = 0;
                hasNewCounts3 = false;
                progressIcon2 = 0;
                progressColor3 = 0;
            }
            if (progressOne != null) {
                boolean hasNewCounts4 = progressOne.getHasNewCounts();
                int progressPercent4 = progressOne.getProgressPercent();
                progressIcon3 = progressOne.getProgressIcon();
                String progressTitle4 = progressOne.getProgressTitle();
                z3 = hasNewCounts;
                i5 = progressPercent3;
                i4 = progressPercent2;
                z = hasNewCounts2;
                z4 = hasNewCounts3;
                progressColor = progressOne.getProgressColor();
                i = progressPercent4;
                str3 = progressTitle2;
                str = progressTitle4;
                i3 = progressIcon4;
                i2 = progressColor4;
                z2 = hasNewCounts4;
                str2 = progressTitle3;
            } else {
                str = null;
                progressIcon3 = 0;
                z3 = hasNewCounts;
                i5 = progressPercent3;
                i4 = progressPercent2;
                str3 = progressTitle2;
                z = hasNewCounts2;
                z4 = hasNewCounts3;
                progressColor = 0;
                i = 0;
                i3 = progressIcon4;
                i2 = progressColor4;
                str2 = progressTitle3;
                z2 = false;
            }
        } else {
            str = null;
            progressTitle = null;
            z = false;
            progressPercent = 0;
            progressColor = 0;
            i = 0;
            z2 = false;
            i2 = 0;
            progressColor2 = 0;
            i3 = 0;
            progressIcon = 0;
            progressIcon2 = 0;
            progressColor3 = 0;
            progressIcon3 = 0;
            i4 = 0;
            z3 = false;
            i5 = 0;
            z4 = false;
            str2 = null;
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.y0);
            this.o0.setOnClickListener(this.v0);
            this.p0.setOnClickListener(this.w0);
            this.q0.setOnClickListener(this.x0);
        }
        if (j2 != 0) {
            nr1.X1(this.n0, Integer.valueOf(progressColor2));
            nr1.Z1(this.n0, Integer.valueOf(progressIcon));
            nr1.a2(this.n0, progressPercent);
            nr1.e2(this.n0, str3);
            nr1.c2(this.n0, Integer.valueOf(progressPercent));
            nr1.Y1(this.n0, z);
            nr1.X1(this.o0, Integer.valueOf(progressColor));
            nr1.Z1(this.o0, Integer.valueOf(progressIcon3));
            nr1.a2(this.o0, i);
            nr1.e2(this.o0, str);
            nr1.c2(this.o0, Integer.valueOf(i));
            nr1.Y1(this.o0, z2);
            nr1.X1(this.p0, Integer.valueOf(i2));
            nr1.Z1(this.p0, Integer.valueOf(i3));
            int i6 = i4;
            nr1.a2(this.p0, i6);
            nr1.e2(this.p0, progressTitle);
            nr1.c2(this.p0, Integer.valueOf(i6));
            nr1.Y1(this.p0, z3);
            nr1.X1(this.q0, Integer.valueOf(progressColor3));
            nr1.Z1(this.q0, Integer.valueOf(progressIcon2));
            int i7 = i5;
            nr1.a2(this.q0, i7);
            nr1.e2(this.q0, str2);
            nr1.c2(this.q0, Integer.valueOf(i7));
            nr1.Y1(this.q0, z4);
        }
    }

    public j24(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ViewProgressCard2) objArr[4], (ViewProgressCard2) objArr[1], (ViewProgressCard2) objArr[3], (ViewProgressCard2) objArr[2]);
        this.z0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 1);
        this.w0 = new jbc(this, 3);
        this.x0 = new jbc(this, 2);
        this.y0 = new jbc(this, 4);
        mo16291G();
    }
}
