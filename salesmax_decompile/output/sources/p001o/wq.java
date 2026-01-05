package p001o;

import ai.salesmax.model.ProfileView;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import p001o.ewi;

/* loaded from: classes.dex */
public class wq extends vq {
    public static final ewi.C13274i x0;
    public static final SparseIntArray y0;
    public boolean v0;
    public long w0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(6);
        x0 = c13274i;
        c13274i.m25699a(1, new String[]{"navigation_view"}, new int[]{2}, new int[]{p9e.navigation_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.nav_host, 3);
        sparseIntArray.put(z8e.loadingView, 4);
        sparseIntArray.put(z8e.bottom_nav, 5);
    }

    public wq(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.w0 != 0) {
                return true;
            }
            return this.p0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 8L;
        }
        this.p0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((vsb) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            l0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ProfileView) obj);
        }
        return true;
    }

    @Override // p001o.vq
    public void j0(ProfileView profileView) {
        this.t0 = profileView;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean k0(vsb vsbVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.w0 |= 1;
        }
        return true;
    }

    public void l0(ck6 ck6Var) {
        this.u0 = ck6Var;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        ProfileView profileView = this.t0;
        long j2 = 12 & j;
        long j3 = j & 8;
        if (j3 != 0) {
            wh1.m54389c(this.o0, this.v0, true);
        }
        if (j2 != 0) {
            this.p0.h0(profileView);
        }
        if (j3 != 0) {
            this.v0 = true;
        }
        ewi.m25683r(this.p0);
    }

    public wq(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (BottomNavigationView) objArr[5], (DrawerLayout) objArr[0], (vsb) objArr[2], (LottieAnimationView) objArr[4], (FragmentContainerView) objArr[3], (ConstraintLayout) objArr[1]);
        this.w0 = -1L;
        this.o0.setTag(null);
        m25693Z(this.p0);
        this.s0.setTag(null);
        a0(view);
        mo16291G();
    }
}
