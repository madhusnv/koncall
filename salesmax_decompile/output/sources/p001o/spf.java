package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class spf extends rpf {
    public static final ewi.C13274i E0;
    public static final SparseIntArray F0;
    public final z44 A0;
    public final z44 B0;
    public final z44 C0;
    public long D0;
    public final ConstraintLayout v0;
    public final ConstraintLayout w0;
    public final LinearLayout x0;
    public final z44 y0;
    public final z44 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(15);
        E0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_waba_phone_numbers"}, new int[]{8}, new int[]{p9e.content_no_waba_phone_numbers});
        int i = p9e.content_shimmer_comment;
        c13274i.m25699a(2, new String[]{"content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment"}, new int[]{3, 4, 5, 6, 7}, new int[]{i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.wabaPhoneNumbersTitle, 9);
        sparseIntArray.put(z8e.wabaPhoneNumbersClose, 10);
        sparseIntArray.put(z8e.seeAllWabaPhoneNumbers, 11);
        sparseIntArray.put(z8e.shimmerLayout, 12);
        sparseIntArray.put(z8e.speechToTextMessage, 13);
        sparseIntArray.put(z8e.rvWabaPhoneNumberList, 14);
    }

    public spf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 15, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.D0 != 0) {
                return true;
            }
            return this.y0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E() || this.B0.mo16290E() || this.C0.mo16290E() || this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 4L;
        }
        this.y0.mo16291G();
        this.z0.mo16291G();
        this.A0.mo16291G();
        this.B0.mo16291G();
        this.C0.mo16291G();
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return h0((n44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (87 != i) {
            return false;
        }
        i0(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean h0(n44 n44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.D0 |= 1;
        }
        return true;
    }

    public void i0(boolean z) {
        this.u0 = z;
        synchronized (this) {
            this.D0 |= 2;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        boolean z = this.u0;
        if ((j & 6) != 0) {
            this.n0.h0(z);
        }
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
        ewi.m25683r(this.n0);
    }

    public spf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (n44) objArr[8], (RecyclerView) objArr[14], (MaterialTextView) objArr[11], (ShimmerFrameLayout) objArr[12], (ShapeableImageView) objArr[13], (ShapeableImageView) objArr[10], (MaterialTextView) objArr[9]);
        this.D0 = -1L;
        m25693Z(this.n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.w0 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.x0 = linearLayout;
        linearLayout.setTag(null);
        z44 z44Var = (z44) objArr[3];
        this.y0 = z44Var;
        m25693Z(z44Var);
        z44 z44Var2 = (z44) objArr[4];
        this.z0 = z44Var2;
        m25693Z(z44Var2);
        z44 z44Var3 = (z44) objArr[5];
        this.A0 = z44Var3;
        m25693Z(z44Var3);
        z44 z44Var4 = (z44) objArr[6];
        this.B0 = z44Var4;
        m25693Z(z44Var4);
        z44 z44Var5 = (z44) objArr[7];
        this.C0 = z44Var5;
        m25693Z(z44Var5);
        a0(view);
        mo16291G();
    }
}
