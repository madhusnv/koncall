package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class s4c extends r4c {
    public static final ewi.C13274i x0;
    public static final SparseIntArray y0;
    public final CoordinatorLayout t0;
    public final ConstraintLayout u0;
    public boolean v0;
    public long w0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(7);
        x0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_notification"}, new int[]{2}, new int[]{p9e.content_no_notification});
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.notificationAppbar, 3);
        sparseIntArray.put(z8e.backButton, 4);
        sparseIntArray.put(z8e.settings, 5);
        sparseIntArray.put(z8e.rvNotificationList, 6);
    }

    public s4c(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.w0 != 0) {
                return true;
            }
            return this.o0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 4L;
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
        return k0((x34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (44 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.r4c
    public void j0(boolean z) {
        this.s0 = z;
        synchronized (this) {
            this.w0 |= 2;
        }
        m28509h(44);
        super.m25692R();
    }

    public final boolean k0(x34 x34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.w0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        boolean z = this.s0;
        if ((6 & j) != 0) {
            this.o0.h0(z);
        }
        long j2 = j & 4;
        if (j2 != 0) {
            wh1.m54388b(this.t0, false, this.v0, false, false, false, true, false, false);
        }
        if (j2 != 0) {
            this.v0 = true;
        }
        ewi.m25683r(this.o0);
    }

    public s4c(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ShapeableImageView) objArr[4], (x34) objArr[2], (LinearLayout) objArr[3], (RecyclerView) objArr[6], (ShapeableImageView) objArr[5]);
        this.w0 = -1L;
        m25693Z(this.o0);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.t0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
