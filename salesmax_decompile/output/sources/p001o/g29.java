package p001o;

import ai.salesmax.model.LeadsUser;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class g29 extends f29 implements jbc.InterfaceC14485a {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final MaterialTextView v0;
    public final View.OnClickListener w0;
    public final View.OnClickListener x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.myRankPosition, 5);
    }

    public g29(yt4 yt4Var, View view) {
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
            this.y0 = 8L;
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
            i0((Integer) obj);
        } else if (33 == i) {
            j0((ck6) obj);
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
        if (i == 1) {
            ck6 ck6Var = this.u0;
            LeaderboardActivityMetrics leaderboardActivityMetrics = this.s0;
            Integer num = this.t0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leaderboardActivityMetrics);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.u0;
        LeaderboardActivityMetrics leaderboardActivityMetrics2 = this.s0;
        Integer num2 = this.t0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), leaderboardActivityMetrics2);
        }
    }

    @Override // p001o.f29
    public void h0(LeaderboardActivityMetrics leaderboardActivityMetrics) {
        this.s0 = leaderboardActivityMetrics;
        synchronized (this) {
            this.y0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.f29
    public void i0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.y0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    public void j0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.y0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[PHI: r2 r14
      0x0069: PHI (r2v1 long) = (r2v0 long), (r2v6 long) binds: [B:11:0x0037, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r14v2 int) = (r14v1 int), (r14v4 int) binds: [B:11:0x0037, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        String str;
        String name;
        String str2;
        synchronized (this) {
            j = this.y0;
            this.y0 = 0L;
        }
        Integer num = this.t0;
        LeaderboardActivityMetrics leaderboardActivityMetrics = this.s0;
        String str3 = null;
        if ((j & 9) != 0) {
            str = "" + (ewi.m25674U(num) + 1);
        } else {
            str = null;
        }
        long j2 = j & 12;
        if (j2 == 0) {
            name = null;
            str2 = null;
        } else {
            boolean z = leaderboardActivityMetrics != null;
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            LeadsUser leadUser = leaderboardActivityMetrics != null ? leaderboardActivityMetrics.getLeadUser() : null;
            i = z ? 0 : 8;
            if (leadUser != null) {
                String profilePic = leadUser.getProfilePic();
                String designation = leadUser.getDesignation();
                name = leadUser.getName();
                str3 = designation;
                str2 = profilePic;
            }
        }
        if ((12 & j) != 0) {
            fjh.m26938c(this.n0, str3);
            nr1.f1(this.o0, name);
            nr1.J2(this.p0, str2);
            this.q0.setVisibility(i);
        }
        if ((8 & j) != 0) {
            this.p0.setOnClickListener(this.x0);
            this.q0.setOnClickListener(this.w0);
        }
        if ((j & 9) != 0) {
            fjh.m26938c(this.v0, str);
        }
    }

    public g29(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[4], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[1], (MaterialCardView) objArr[0], (MaterialCardView) objArr[5]);
        this.y0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        MaterialTextView materialTextView = (MaterialTextView) objArr[2];
        this.v0 = materialTextView;
        materialTextView.setTag(null);
        a0(view);
        this.w0 = new jbc(this, 1);
        this.x0 = new jbc(this, 2);
        mo16291G();
    }
}
