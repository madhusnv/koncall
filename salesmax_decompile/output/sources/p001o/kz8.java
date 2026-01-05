package p001o;

import ai.salesmax.model.HomeActivity;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class kz8 extends jz8 {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0 = null;
    public final ConstraintLayout w0;
    public long x0;

    public kz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 8L;
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
        if (73 == i) {
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((HomeActivity) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.v0 = ck6Var;
    }

    public void i0(HomeActivity homeActivity) {
        this.t0 = homeActivity;
        synchronized (this) {
            this.x0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.u0 = num;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        float dimension;
        float dimension2;
        String name;
        String value;
        int tintColor;
        int icon;
        boolean positive;
        String percentage;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        Integer num = this.u0;
        HomeActivity homeActivity = this.t0;
        long j2 = j & 9;
        if (j2 != 0) {
            int iM25674U = ewi.m25674U(num);
            boolean z = iM25674U == 0;
            int i = iM25674U % 2;
            if (j2 != 0) {
                j |= z ? 128L : 64L;
            }
            dimension2 = z ? this.o0.getResources().getDimension(k7e.grid_1_5) : 0.0f;
            boolean z2 = i == 0;
            boolean z3 = i == 1;
            if ((j & 9) != 0) {
                j |= z2 ? 512L : 256L;
            }
            if ((j & 9) != 0) {
                j |= z3 ? 32L : 16L;
            }
            dimension = z2 ? 0.0f : this.n0.getResources().getDimension(k7e.grid_1_5);
            dimension = z3 ? 0.0f : this.n0.getResources().getDimension(k7e.grid_1_5);
        } else {
            dimension = 0.0f;
            dimension2 = 0.0f;
        }
        long j3 = 12 & j;
        if (j3 == 0 || homeActivity == null) {
            name = null;
            value = null;
            tintColor = 0;
            icon = 0;
            positive = false;
            percentage = null;
        } else {
            percentage = homeActivity.getPercentage();
            tintColor = homeActivity.getTintColor();
            icon = homeActivity.getIcon();
            value = homeActivity.getValue();
            positive = homeActivity.getPositive();
            name = homeActivity.getName();
        }
        if ((j & 9) != 0) {
            nr1.k3(this.n0, dimension);
            nr1.l3(this.n0, dimension);
            nr1.m3(this.o0, dimension2);
        }
        if (j3 != 0) {
            nr1.f1(this.p0, name);
            nr1.F0(this.q0, percentage, Boolean.valueOf(positive));
            nr1.E0(this.r0, Integer.valueOf(icon), Integer.valueOf(tintColor));
            fjh.m26938c(this.s0, value);
        }
    }

    public kz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[5], (View) objArr[6], (MaterialTextView) objArr[4], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[2]);
        this.x0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.w0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
