package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class lpf extends kpf {
    public static final ewi.C13274i y0;
    public static final SparseIntArray z0;
    public final ConstraintLayout v0;
    public final ConstraintLayout w0;
    public long x0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(7);
        y0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_team"}, new int[]{2}, new int[]{p9e.content_no_team});
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetTitle, 3);
        sparseIntArray.put(z8e.buttonDone, 4);
        sparseIntArray.put(z8e.missedActionClose, 5);
        sparseIntArray.put(z8e.rvUserActionsList, 6);
    }

    public lpf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.x0 != 0) {
                return true;
            }
            return this.o0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 16L;
        }
        this.o0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m0((h44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (102 == i) {
            l0((String) obj);
        } else if (89 == i) {
            k0(((Boolean) obj).booleanValue());
        } else {
            if (85 != i) {
                return false;
            }
            j0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.kpf
    public void j0(boolean z) {
        this.u0 = z;
        synchronized (this) {
            this.x0 |= 8;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.kpf
    public void k0(boolean z) {
        this.t0 = z;
        synchronized (this) {
            this.x0 |= 4;
        }
        m28509h(89);
        super.m25692R();
    }

    @Override // p001o.kpf
    public void l0(String str) {
        this.s0 = str;
    }

    public final boolean m0(h44 h44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.x0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        boolean z = this.t0;
        boolean z2 = this.u0;
        long j2 = 20 & j;
        long j3 = j & 24;
        if (j2 != 0) {
            this.o0.i0(z);
        }
        if (j3 != 0) {
            this.o0.h0(z2);
        }
        ewi.m25683r(this.o0);
    }

    public lpf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialButton) objArr[4], (h44) objArr[2], (ShapeableImageView) objArr[5], (RecyclerView) objArr[6], (MaterialTextView) objArr[3]);
        this.x0 = -1L;
        m25693Z(this.o0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.w0 = constraintLayout2;
        constraintLayout2.setTag(null);
        a0(view);
        mo16291G();
    }
}
