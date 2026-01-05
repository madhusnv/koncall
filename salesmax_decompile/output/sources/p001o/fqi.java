package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class fqi extends eqi {
    public static final ewi.C13274i A0;
    public static final SparseIntArray B0;
    public final ConstraintLayout q0;
    public final LinearLayout r0;
    public final j54 s0;
    public final j54 t0;
    public final j54 u0;
    public final j54 v0;
    public final j54 w0;
    public final j54 x0;
    public final j54 y0;
    public long z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        A0 = c13274i;
        int i = p9e.content_shimmer_user;
        c13274i.m25699a(1, new String[]{"content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user"}, new int[]{2, 3, 4, 5, 6, 7, 8}, new int[]{i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B0 = sparseIntArray;
        sparseIntArray.put(z8e.notesBorder1, 9);
        sparseIntArray.put(z8e.shimmerLayout, 10);
        sparseIntArray.put(z8e.homeUserStatusList, 11);
    }

    public fqi(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.z0 != 0) {
                return true;
            }
            return this.s0.mo16290E() || this.t0.mo16290E() || this.u0.mo16290E() || this.v0.mo16290E() || this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 1L;
        }
        this.s0.mo16291G();
        this.t0.mo16291G();
        this.u0.mo16291G();
        this.v0.mo16291G();
        this.w0.mo16291G();
        this.x0.mo16291G();
        this.y0.mo16291G();
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
            this.z0 = 0L;
        }
        ewi.m25683r(this.s0);
        ewi.m25683r(this.t0);
        ewi.m25683r(this.u0);
        ewi.m25683r(this.v0);
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
    }

    public fqi(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[11], (View) objArr[9], (ShimmerFrameLayout) objArr[10]);
        this.z0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.q0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.r0 = linearLayout;
        linearLayout.setTag(null);
        j54 j54Var = (j54) objArr[2];
        this.s0 = j54Var;
        m25693Z(j54Var);
        j54 j54Var2 = (j54) objArr[3];
        this.t0 = j54Var2;
        m25693Z(j54Var2);
        j54 j54Var3 = (j54) objArr[4];
        this.u0 = j54Var3;
        m25693Z(j54Var3);
        j54 j54Var4 = (j54) objArr[5];
        this.v0 = j54Var4;
        m25693Z(j54Var4);
        j54 j54Var5 = (j54) objArr[6];
        this.w0 = j54Var5;
        m25693Z(j54Var5);
        j54 j54Var6 = (j54) objArr[7];
        this.x0 = j54Var6;
        m25693Z(j54Var6);
        j54 j54Var7 = (j54) objArr[8];
        this.y0 = j54Var7;
        m25693Z(j54Var7);
        a0(view);
        mo16291G();
    }
}
