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
public class inf extends hnf {
    public static final ewi.C13274i C0;
    public static final SparseIntArray D0;
    public final z44 A0;
    public long B0;
    public final ConstraintLayout t0;
    public final ConstraintLayout u0;
    public final LinearLayout v0;
    public final z44 w0;
    public final z44 x0;
    public final z44 y0;
    public final z44 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(13);
        C0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_mentions"}, new int[]{8}, new int[]{p9e.content_no_mentions});
        int i = p9e.content_shimmer_comment;
        c13274i.m25699a(2, new String[]{"content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment"}, new int[]{3, 4, 5, 6, 7}, new int[]{i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(z8e.tvCommentsTitle, 9);
        sparseIntArray.put(z8e.commentsClose, 10);
        sparseIntArray.put(z8e.shimmerLayout, 11);
        sparseIntArray.put(z8e.homeCommentList, 12);
    }

    public inf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, C0, D0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.B0 != 0) {
                return true;
            }
            return this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E() || this.o0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B0 = 4L;
        }
        this.w0.mo16291G();
        this.x0.mo16291G();
        this.y0.mo16291G();
        this.z0.mo16291G();
        this.A0.mo16291G();
        this.o0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((t34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (87 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.hnf
    public void j0(boolean z) {
        this.s0 = z;
        synchronized (this) {
            this.B0 |= 2;
        }
        m28509h(87);
        super.m25692R();
    }

    public final boolean k0(t34 t34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.B0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        boolean z = this.s0;
        if ((j & 6) != 0) {
            this.o0.h0(z);
        }
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.o0);
    }

    public inf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ShapeableImageView) objArr[10], (t34) objArr[8], (RecyclerView) objArr[12], (ShimmerFrameLayout) objArr[11], (MaterialTextView) objArr[9]);
        this.B0 = -1L;
        m25693Z(this.o0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.t0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.u0 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.v0 = linearLayout;
        linearLayout.setTag(null);
        z44 z44Var = (z44) objArr[3];
        this.w0 = z44Var;
        m25693Z(z44Var);
        z44 z44Var2 = (z44) objArr[4];
        this.x0 = z44Var2;
        m25693Z(z44Var2);
        z44 z44Var3 = (z44) objArr[5];
        this.y0 = z44Var3;
        m25693Z(z44Var3);
        z44 z44Var4 = (z44) objArr[6];
        this.z0 = z44Var4;
        m25693Z(z44Var4);
        z44 z44Var5 = (z44) objArr[7];
        this.A0 = z44Var5;
        m25693Z(z44Var5);
        a0(view);
        mo16291G();
    }
}
