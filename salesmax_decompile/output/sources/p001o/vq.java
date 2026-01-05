package p001o;

import ai.salesmax.model.ProfileView;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* loaded from: classes.dex */
public abstract class vq extends ewi {
    public final BottomNavigationView n0;
    public final DrawerLayout o0;
    public final vsb p0;
    public final LottieAnimationView q0;
    public final FragmentContainerView r0;
    public final ConstraintLayout s0;
    public ProfileView t0;
    public ck6 u0;

    public vq(Object obj, View view, int i, BottomNavigationView bottomNavigationView, DrawerLayout drawerLayout, vsb vsbVar, LottieAnimationView lottieAnimationView, FragmentContainerView fragmentContainerView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = bottomNavigationView;
        this.o0 = drawerLayout;
        this.p0 = vsbVar;
        this.q0 = lottieAnimationView;
        this.r0 = fragmentContainerView;
        this.s0 = constraintLayout;
    }

    public static vq h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static vq i0(LayoutInflater layoutInflater, Object obj) {
        return (vq) ewi.m25668F(layoutInflater, p9e.activity_main, null, false, obj);
    }

    public abstract void j0(ProfileView profileView);
}
