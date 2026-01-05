package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class k70 extends j70 {
    public static final ewi.C13274i t0 = null;
    public static final SparseIntArray u0;
    public final ConstraintLayout q0;
    public boolean r0;
    public long s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 1);
        sparseIntArray.put(z8e.settingsBack, 2);
        sparseIntArray.put(z8e.userActionList, 3);
    }

    public k70(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, t0, u0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.s0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.s0 = 1L;
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
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.s0;
            this.s0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.q0;
            boolean z = this.r0;
            wh1.m54388b(constraintLayout, z, z, z, z, true, true, true, true);
        }
        if (j2 != 0) {
            this.r0 = true;
        }
    }

    public k70(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[2], (MaterialCardView) objArr[1], (RecyclerView) objArr[3]);
        this.s0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.q0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
