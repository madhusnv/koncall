package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class pdh extends odh {
    public static final ewi.C13274i B0;
    public static final SparseIntArray C0;
    public long A0;
    public final ConstraintLayout p0;
    public final LinearLayout q0;
    public final d54 r0;
    public final d54 s0;
    public final d54 t0;
    public final d54 u0;
    public final d54 v0;
    public final d54 w0;
    public final d54 x0;
    public final d54 y0;
    public final d54 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(13);
        B0 = c13274i;
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(1, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(z8e.shimmerLayout, 11);
        sparseIntArray.put(z8e.homeUserStatusList, 12);
    }

    public pdh(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.A0 != 0) {
                return true;
            }
            return this.r0.mo16290E() || this.s0.mo16290E() || this.t0.mo16290E() || this.u0.mo16290E() || this.v0.mo16290E() || this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E() || this.z0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 1L;
        }
        this.r0.mo16291G();
        this.s0.mo16291G();
        this.t0.mo16291G();
        this.u0.mo16291G();
        this.v0.mo16291G();
        this.w0.mo16291G();
        this.x0.mo16291G();
        this.y0.mo16291G();
        this.z0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.A0 = 0L;
        }
        ewi.m25683r(this.r0);
        ewi.m25683r(this.s0);
        ewi.m25683r(this.t0);
        ewi.m25683r(this.u0);
        ewi.m25683r(this.v0);
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
    }

    public pdh(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[12], (ShimmerFrameLayout) objArr[11]);
        this.A0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.p0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.q0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[2];
        this.r0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[3];
        this.s0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[4];
        this.t0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[5];
        this.u0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[6];
        this.v0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[7];
        this.w0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[8];
        this.x0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[9];
        this.y0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[10];
        this.z0 = d54Var9;
        m25693Z(d54Var9);
        a0(view);
        mo16291G();
    }
}
