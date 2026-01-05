package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class rle extends qle {
    public static final ewi.C13274i E0;
    public static final SparseIntArray F0;
    public final j54 A0;
    public final j54 B0;
    public final j54 C0;
    public long D0;
    public final ConstraintLayout u0;
    public final LinearLayout v0;
    public final j54 w0;
    public final j54 x0;
    public final j54 y0;
    public final j54 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(16);
        E0 = c13274i;
        int i = p9e.content_shimmer_user;
        c13274i.m25699a(1, new String[]{"content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user", "content_shimmer_user"}, new int[]{2, 3, 4, 5, 6, 7, 8}, new int[]{i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.homeuserStatusCard, 9);
        sparseIntArray.put(z8e.userActiveCount, 10);
        sparseIntArray.put(z8e.userInactiveCount, 11);
        sparseIntArray.put(z8e.userInvitedCount, 12);
        sparseIntArray.put(z8e.notesBorder1, 13);
        sparseIntArray.put(z8e.shimmerLayout, 14);
        sparseIntArray.put(z8e.homeUserStatusList, 15);
    }

    public rle(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.D0 != 0) {
                return true;
            }
            return this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E() || this.B0.mo16290E() || this.C0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 1L;
        }
        this.w0.mo16291G();
        this.x0.mo16291G();
        this.y0.mo16291G();
        this.z0.mo16291G();
        this.A0.mo16291G();
        this.B0.mo16291G();
        this.C0.mo16291G();
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
            this.D0 = 0L;
        }
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
    }

    public rle(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[15], (LinearLayout) objArr[9], (View) objArr[13], (ShimmerFrameLayout) objArr[14], (MaterialTextView) objArr[10], (MaterialTextView) objArr[11], (MaterialTextView) objArr[12]);
        this.D0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.v0 = linearLayout;
        linearLayout.setTag(null);
        j54 j54Var = (j54) objArr[2];
        this.w0 = j54Var;
        m25693Z(j54Var);
        j54 j54Var2 = (j54) objArr[3];
        this.x0 = j54Var2;
        m25693Z(j54Var2);
        j54 j54Var3 = (j54) objArr[4];
        this.y0 = j54Var3;
        m25693Z(j54Var3);
        j54 j54Var4 = (j54) objArr[5];
        this.z0 = j54Var4;
        m25693Z(j54Var4);
        j54 j54Var5 = (j54) objArr[6];
        this.A0 = j54Var5;
        m25693Z(j54Var5);
        j54 j54Var6 = (j54) objArr[7];
        this.B0 = j54Var6;
        m25693Z(j54Var6);
        j54 j54Var7 = (j54) objArr[8];
        this.C0 = j54Var7;
        m25693Z(j54Var7);
        a0(view);
        mo16291G();
    }
}
