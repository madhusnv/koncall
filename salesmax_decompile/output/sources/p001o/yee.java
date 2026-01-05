package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class yee extends xee {
    public static final ewi.C13274i C0;
    public static final SparseIntArray D0;
    public final z44 A0;
    public long B0;
    public final ConstraintLayout u0;
    public final LinearLayout v0;
    public final z44 w0;
    public final z44 x0;
    public final z44 y0;
    public final z44 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(14);
        C0 = c13274i;
        int i = p9e.content_shimmer_comment;
        c13274i.m25699a(1, new String[]{"content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment"}, new int[]{2, 3, 4, 5, 6}, new int[]{i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(z8e.tvTemplatesTitle, 7);
        sparseIntArray.put(z8e.templatesClose, 8);
        sparseIntArray.put(z8e.shimmerLayout, 9);
        sparseIntArray.put(z8e.rvPaymentTypeList, 10);
        sparseIntArray.put(z8e.paymentTypeSelection, 11);
        sparseIntArray.put(z8e.paymentTypeRazorpay, 12);
        sparseIntArray.put(z8e.paymentTypeOffline, 13);
    }

    public yee(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 14, C0, D0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.B0 != 0) {
                return true;
            }
            return this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B0 = 1L;
        }
        this.w0.mo16291G();
        this.x0.mo16291G();
        this.y0.mo16291G();
        this.z0.mo16291G();
        this.A0.mo16291G();
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
            this.B0 = 0L;
        }
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
    }

    public yee(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[13], (Chip) objArr[12], (ChipGroup) objArr[11], (HorizontalScrollView) objArr[10], (ShimmerFrameLayout) objArr[9], (ShapeableImageView) objArr[8], (MaterialTextView) objArr[7]);
        this.B0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.v0 = linearLayout;
        linearLayout.setTag(null);
        z44 z44Var = (z44) objArr[2];
        this.w0 = z44Var;
        m25693Z(z44Var);
        z44 z44Var2 = (z44) objArr[3];
        this.x0 = z44Var2;
        m25693Z(z44Var2);
        z44 z44Var3 = (z44) objArr[4];
        this.y0 = z44Var3;
        m25693Z(z44Var3);
        z44 z44Var4 = (z44) objArr[5];
        this.z0 = z44Var4;
        m25693Z(z44Var4);
        z44 z44Var5 = (z44) objArr[6];
        this.A0 = z44Var5;
        m25693Z(z44Var5);
        a0(view);
        mo16291G();
    }
}
