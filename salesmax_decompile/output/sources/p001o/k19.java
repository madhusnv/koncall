package p001o;

import ai.salesmax.model.LeadsUser;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class k19 extends j19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i I0 = null;
    public static final SparseIntArray J0;
    public final View.OnClickListener B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public final View.OnClickListener G0;
    public long H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J0 = sparseIntArray;
        sparseIntArray.put(z8e.myRank, 8);
        sparseIntArray.put(z8e.myRankPosition, 9);
        sparseIntArray.put(z8e.performanceStatus, 10);
    }

    public k19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 11, I0, J0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.H0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.H0 = 8L;
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
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            h0((LeaderboardActivityMetrics) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.A0;
                LeaderboardActivityMetrics leaderboardActivityMetrics = this.y0;
                Integer num = this.z0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leaderboardActivityMetrics);
                    break;
                }
                break;
            case 2:
                ck6 ck6Var2 = this.A0;
                LeaderboardActivityMetrics leaderboardActivityMetrics2 = this.y0;
                Integer num2 = this.z0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leaderboardActivityMetrics2);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var3 = this.A0;
                LeaderboardActivityMetrics leaderboardActivityMetrics3 = this.y0;
                Integer num3 = this.z0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leaderboardActivityMetrics3);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var4 = this.A0;
                LeaderboardActivityMetrics leaderboardActivityMetrics4 = this.y0;
                Integer num4 = this.z0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leaderboardActivityMetrics4);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var5 = this.A0;
                LeaderboardActivityMetrics leaderboardActivityMetrics5 = this.y0;
                Integer num5 = this.z0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leaderboardActivityMetrics5);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var6 = this.A0;
                LeaderboardActivityMetrics leaderboardActivityMetrics6 = this.y0;
                Integer num6 = this.z0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leaderboardActivityMetrics6);
                    break;
                }
                break;
        }
    }

    @Override // p001o.j19
    public void h0(LeaderboardActivityMetrics leaderboardActivityMetrics) {
        this.y0 = leaderboardActivityMetrics;
        synchronized (this) {
            this.H0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.A0 = ck6Var;
        synchronized (this) {
            this.H0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.z0 = num;
        synchronized (this) {
            this.H0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        LeadsUser leadUser;
        ActivityMetrics visitLogged;
        ActivityMetrics tasksCompleted;
        ActivityMetrics notesAdded;
        ActivityMetrics callLogged;
        String str7;
        String designation;
        synchronized (this) {
            j = this.H0;
            this.H0 = 0L;
        }
        LeaderboardActivityMetrics leaderboardActivityMetrics = this.y0;
        long j2 = 12 & j;
        String name = null;
        if (j2 != 0) {
            if (leaderboardActivityMetrics != null) {
                visitLogged = leaderboardActivityMetrics.getVisitLogged();
                tasksCompleted = leaderboardActivityMetrics.getTasksCompleted();
                notesAdded = leaderboardActivityMetrics.getNotesAdded();
                callLogged = leaderboardActivityMetrics.getCallLogged();
                leadUser = leaderboardActivityMetrics.getLeadUser();
            } else {
                leadUser = null;
                visitLogged = null;
                tasksCompleted = null;
                notesAdded = null;
                callLogged = null;
            }
            Long metricsValue = visitLogged != null ? visitLogged.getMetricsValue() : null;
            Long metricsValue2 = tasksCompleted != null ? tasksCompleted.getMetricsValue() : null;
            Long metricsValue3 = notesAdded != null ? notesAdded.getMetricsValue() : null;
            Long metricsValue4 = callLogged != null ? callLogged.getMetricsValue() : null;
            if (leadUser != null) {
                String profilePic = leadUser.getProfilePic();
                designation = leadUser.getDesignation();
                name = leadUser.getName();
                str7 = profilePic;
            } else {
                str7 = null;
                designation = null;
            }
            String str8 = metricsValue + "";
            str3 = metricsValue2 + "";
            str4 = metricsValue3 + "";
            str5 = metricsValue4 + "";
            str2 = str7;
            str = name;
            name = designation;
            str6 = str8;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        if (j2 != 0) {
            fjh.m26938c(this.n0, name);
            fjh.m26938c(this.o0, str);
            nr1.J2(this.p0, str2);
            fjh.m26938c(this.r0, str5);
            fjh.m26938c(this.s0, str4);
            fjh.m26938c(this.t0, str3);
            fjh.m26938c(this.u0, str6);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.C0);
            this.q0.setOnClickListener(this.F0);
            this.r0.setOnClickListener(this.E0);
            this.s0.setOnClickListener(this.D0);
            this.t0.setOnClickListener(this.G0);
            this.u0.setOnClickListener(this.B0);
        }
    }

    public k19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (ShapeableImageView) objArr[1], (MaterialCardView) objArr[0], (MaterialButton) objArr[4], (MaterialButton) objArr[7], (MaterialButton) objArr[6], (MaterialButton) objArr[5], (MaterialTextView) objArr[8], (MaterialCardView) objArr[9], (MaterialButton) objArr[10]);
        this.H0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        a0(view);
        this.B0 = new jbc(this, 4);
        this.C0 = new jbc(this, 2);
        this.D0 = new jbc(this, 6);
        this.E0 = new jbc(this, 3);
        this.F0 = new jbc(this, 1);
        this.G0 = new jbc(this, 5);
        mo16291G();
    }
}
