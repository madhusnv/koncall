package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class qbi extends ewi {
    public final Toolbar A0;
    public final TabLayout B0;
    public String C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public final ShapeableImageView n0;
    public final ShapeableImageView o0;
    public final ShapeableImageView p0;
    public final ShapeableImageView q0;
    public final AppBarLayout r0;
    public final l34 s0;
    public final h44 t0;
    public final FloatingActionButton u0;
    public final TextInputEditText v0;
    public final LinearLayout w0;
    public final TextInputLayout x0;
    public final ViewPager2 y0;
    public final SwipeRefreshLayout z0;

    public qbi(Object obj, View view, int i, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, AppBarLayout appBarLayout, l34 l34Var, h44 h44Var, FloatingActionButton floatingActionButton, TextInputEditText textInputEditText, LinearLayout linearLayout, TextInputLayout textInputLayout, ViewPager2 viewPager2, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, TabLayout tabLayout) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = shapeableImageView2;
        this.p0 = shapeableImageView3;
        this.q0 = shapeableImageView4;
        this.r0 = appBarLayout;
        this.s0 = l34Var;
        this.t0 = h44Var;
        this.u0 = floatingActionButton;
        this.v0 = textInputEditText;
        this.w0 = linearLayout;
        this.x0 = textInputLayout;
        this.y0 = viewPager2;
        this.z0 = swipeRefreshLayout;
        this.A0 = toolbar;
        this.B0 = tabLayout;
    }

    public static qbi i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static qbi j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qbi) ewi.m25668F(layoutInflater, p9e.user_and_team_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.G0;
    }

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);

    public abstract void p0(boolean z);
}
