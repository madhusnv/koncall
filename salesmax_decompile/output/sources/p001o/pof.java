package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class pof extends oof {
    public static final ewi.C13274i v0;
    public static final SparseIntArray w0;
    public final ConstraintLayout s0;
    public final ConstraintLayout t0;
    public long u0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(6);
        v0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_missed_items"}, new int[]{3}, new int[]{p9e.content_no_missed_items});
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetTitle, 4);
        sparseIntArray.put(z8e.missedActionClose, 5);
    }

    public pof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, v0, w0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.u0 != 0) {
                return true;
            }
            return this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.u0 = 4L;
        }
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((v34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (37 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.oof
    public void j0(boolean z) {
        this.r0 = z;
        synchronized (this) {
            this.u0 |= 2;
        }
        m28509h(37);
        super.m25692R();
    }

    public final boolean k0(v34 v34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.u0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.u0;
            this.u0 = 0L;
        }
        boolean z = this.r0;
        long j4 = j & 6;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z) {
                    j2 = j | 16;
                    j3 = 64;
                } else {
                    j2 = j | 8;
                    j3 = 32;
                }
                j = j2 | j3;
            }
            int i2 = z ? 0 : 8;
            i = z ? 8 : 0;
            i = i2;
        } else {
            i = 0;
        }
        if ((j & 6) != 0) {
            this.n0.m25689B().setVisibility(i);
            this.n0.h0(z);
            this.p0.setVisibility(i);
        }
        ewi.m25683r(this.n0);
    }

    public pof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (v34) objArr[3], (ShapeableImageView) objArr[5], (RecyclerView) objArr[2], (MaterialTextView) objArr[4]);
        this.u0 = -1L;
        m25693Z(this.n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.t0 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.p0.setTag(null);
        a0(view);
        mo16291G();
    }
}
