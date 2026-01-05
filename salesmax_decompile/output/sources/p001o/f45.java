package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class f45 extends e45 {
    public static final ewi.C13274i K0;
    public static final SparseIntArray L0;
    public final b54 A0;
    public final b54 B0;
    public final b54 C0;
    public final b54 D0;
    public final b54 E0;
    public final b54 F0;
    public final b54 G0;
    public final b54 H0;
    public boolean I0;
    public long J0;
    public final ConstraintLayout x0;
    public final LinearLayout y0;
    public final b54 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(21);
        K0 = c13274i;
        int i = p9e.content_shimmer_customize;
        c13274i.m25699a(1, new String[]{"content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize", "content_shimmer_customize"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L0 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 11);
        sparseIntArray.put(z8e.settingsBack, 12);
        sparseIntArray.put(z8e.bookOnboardingCall, 13);
        sparseIntArray.put(z8e.bookOnboardingCallText, 14);
        sparseIntArray.put(z8e.bookOnboardingCallButton, 15);
        sparseIntArray.put(z8e.exactlyOneWinCheck, 16);
        sparseIntArray.put(z8e.exactlyOneLossCheck, 17);
        sparseIntArray.put(z8e.shimmerLayout, 18);
        sparseIntArray.put(z8e.taskDefinitionList, 19);
        sparseIntArray.put(z8e.fabCreateDealStage, 20);
    }

    public f45(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 21, K0, L0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.J0 != 0) {
                return true;
            }
            return this.z0.mo16290E() || this.A0.mo16290E() || this.B0.mo16290E() || this.C0.mo16290E() || this.D0.mo16290E() || this.E0.mo16290E() || this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.J0 = 1L;
        }
        this.z0.mo16291G();
        this.A0.mo16291G();
        this.B0.mo16291G();
        this.C0.mo16291G();
        this.D0.mo16291G();
        this.E0.mo16291G();
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
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
        long j;
        synchronized (this) {
            j = this.J0;
            this.J0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.x0;
            boolean z = this.I0;
            wh1.m54388b(constraintLayout, z, z, z, z, true, true, true, true);
        }
        if (j2 != 0) {
            this.I0 = true;
        }
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
        ewi.m25683r(this.D0);
        ewi.m25683r(this.E0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
    }

    public f45(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ConstraintLayout) objArr[13], (MaterialButton) objArr[15], (MaterialTextView) objArr[14], (MaterialButton) objArr[17], (MaterialButton) objArr[16], (FloatingActionButton) objArr[20], (ShapeableImageView) objArr[12], (MaterialCardView) objArr[11], (ShimmerFrameLayout) objArr[18], (RecyclerView) objArr[19]);
        this.J0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.y0 = linearLayout;
        linearLayout.setTag(null);
        b54 b54Var = (b54) objArr[2];
        this.z0 = b54Var;
        m25693Z(b54Var);
        b54 b54Var2 = (b54) objArr[3];
        this.A0 = b54Var2;
        m25693Z(b54Var2);
        b54 b54Var3 = (b54) objArr[4];
        this.B0 = b54Var3;
        m25693Z(b54Var3);
        b54 b54Var4 = (b54) objArr[5];
        this.C0 = b54Var4;
        m25693Z(b54Var4);
        b54 b54Var5 = (b54) objArr[6];
        this.D0 = b54Var5;
        m25693Z(b54Var5);
        b54 b54Var6 = (b54) objArr[7];
        this.E0 = b54Var6;
        m25693Z(b54Var6);
        b54 b54Var7 = (b54) objArr[8];
        this.F0 = b54Var7;
        m25693Z(b54Var7);
        b54 b54Var8 = (b54) objArr[9];
        this.G0 = b54Var8;
        m25693Z(b54Var8);
        b54 b54Var9 = (b54) objArr[10];
        this.H0 = b54Var9;
        m25693Z(b54Var9);
        a0(view);
        mo16291G();
    }
}
