package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class o19 extends n19 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public boolean s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.page_logo, 1);
        sparseIntArray.put(z8e.no_internet_heading, 2);
        sparseIntArray.put(z8e.no_internet_text, 3);
    }

    public o19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, u0, v0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.t0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.t0 = 2L;
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
        if (35 != i) {
            return false;
        }
        h0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.n19
    public void h0(boolean z) {
        this.r0 = z;
        synchronized (this) {
            this.t0 |= 1;
        }
        m28509h(35);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        boolean z = this.r0;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 8L : 4L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.q0.setVisibility(i);
        }
        long j3 = j & 2;
        if (j3 != 0) {
            ConstraintLayout constraintLayout = this.q0;
            boolean z2 = this.s0;
            wh1.m54388b(constraintLayout, false, z2, false, z2, false, true, false, true);
        }
        if (j3 != 0) {
            this.s0 = true;
        }
    }

    public o19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[2], (TextView) objArr[3], (ShapeableImageView) objArr[1], (ConstraintLayout) objArr[0]);
        this.t0 = -1L;
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
