package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class i2j extends h2j {
    public static final ewi.C13274i E0;
    public static final SparseIntArray F0;
    public final b54 A0;
    public final b54 B0;
    public final b54 C0;
    public long D0;
    public final ConstraintLayout s0;
    public final LinearLayout t0;
    public final b54 u0;
    public final b54 v0;
    public final b54 w0;
    public final b54 x0;
    public final b54 y0;
    public final b54 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(16);
        E0 = c13274i;
        int i = p9e.content_shimmer_customize;
        c13274i.m25699a(1, new String[]{"content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 11);
        sparseIntArray.put(z8e.settingsBack, 12);
        sparseIntArray.put(z8e.shimmerLayout, 13);
        sparseIntArray.put(z8e.visitOutcomeDefinitionList, 14);
        sparseIntArray.put(z8e.fabCreateCallOutcomeDefinition, 15);
    }

    public i2j(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.D0 != 0) {
                return true;
            }
            return this.u0.mo16290E() || this.v0.mo16290E() || this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E() || this.B0.mo16290E() || this.C0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 1L;
        }
        this.u0.mo16291G();
        this.v0.mo16291G();
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
        ewi.m25683r(this.u0);
        ewi.m25683r(this.v0);
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
    }

    public i2j(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (FloatingActionButton) objArr[15], (ShapeableImageView) objArr[12], (MaterialCardView) objArr[11], (ShimmerFrameLayout) objArr[13], (RecyclerView) objArr[14]);
        this.D0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.t0 = linearLayout;
        linearLayout.setTag(null);
        b54 b54Var = (b54) objArr[2];
        this.u0 = b54Var;
        m25693Z(b54Var);
        b54 b54Var2 = (b54) objArr[3];
        this.v0 = b54Var2;
        m25693Z(b54Var2);
        b54 b54Var3 = (b54) objArr[4];
        this.w0 = b54Var3;
        m25693Z(b54Var3);
        b54 b54Var4 = (b54) objArr[5];
        this.x0 = b54Var4;
        m25693Z(b54Var4);
        b54 b54Var5 = (b54) objArr[6];
        this.y0 = b54Var5;
        m25693Z(b54Var5);
        b54 b54Var6 = (b54) objArr[7];
        this.z0 = b54Var6;
        m25693Z(b54Var6);
        b54 b54Var7 = (b54) objArr[8];
        this.A0 = b54Var7;
        m25693Z(b54Var7);
        b54 b54Var8 = (b54) objArr[9];
        this.B0 = b54Var8;
        m25693Z(b54Var8);
        b54 b54Var9 = (b54) objArr[10];
        this.C0 = b54Var9;
        m25693Z(b54Var9);
        a0(view);
        mo16291G();
    }
}
