package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ws4 extends ewi {
    public final CoordinatorLayout A0;
    public final TabLayout B0;
    public final FloatingActionButton C0;
    public final FloatingActionButton D0;
    public final RelativeLayout E0;
    public final FloatingActionButton F0;
    public final FloatingActionButton G0;
    public final FloatingActionButton H0;
    public final FloatingActionButton I0;
    public final MaterialTextView J0;
    public final TextInputEditText K0;
    public final TextInputLayout L0;
    public final LinearLayout M0;
    public final MaterialTextView N0;
    public final MaterialTextView O0;
    public final ShimmerFrameLayout P0;
    public final ShapeableImageView Q0;
    public final ShapeableImageView R0;
    public final ShapeableImageView S0;
    public final ShapeableImageView T0;
    public final MaterialTextView U0;
    public final SwipeRefreshLayout V0;
    public final Toolbar W0;
    public final ConstraintLayout X0;
    public final MaterialTextView Y0;
    public final MaterialTextView Z0;
    public final ConstraintLayout a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public Integer i1;
    public final ShapeableImageView n0;
    public final ShapeableImageView o0;
    public final ShapeableImageView p0;
    public final FloatingActionButton q0;
    public final ShapeableImageView r0;
    public final AppBarLayout s0;
    public final n19 t0;
    public final h44 u0;
    public final n54 v0;
    public final ConstraintLayout w0;
    public final ShapeableImageView x0;
    public final ShapeableImageView y0;
    public final ViewPager2 z0;

    public ws4(Object obj, View view, int i, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView4, AppBarLayout appBarLayout, n19 n19Var, h44 h44Var, n54 n54Var, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView5, ShapeableImageView shapeableImageView6, ViewPager2 viewPager2, CoordinatorLayout coordinatorLayout, TabLayout tabLayout, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3, RelativeLayout relativeLayout, FloatingActionButton floatingActionButton4, FloatingActionButton floatingActionButton5, FloatingActionButton floatingActionButton6, FloatingActionButton floatingActionButton7, MaterialTextView materialTextView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, LinearLayout linearLayout, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ShimmerFrameLayout shimmerFrameLayout, ShapeableImageView shapeableImageView7, ShapeableImageView shapeableImageView8, ShapeableImageView shapeableImageView9, ShapeableImageView shapeableImageView10, MaterialTextView materialTextView4, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, ConstraintLayout constraintLayout2, MaterialTextView materialTextView5, MaterialTextView materialTextView6, ConstraintLayout constraintLayout3) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = shapeableImageView2;
        this.p0 = shapeableImageView3;
        this.q0 = floatingActionButton;
        this.r0 = shapeableImageView4;
        this.s0 = appBarLayout;
        this.t0 = n19Var;
        this.u0 = h44Var;
        this.v0 = n54Var;
        this.w0 = constraintLayout;
        this.x0 = shapeableImageView5;
        this.y0 = shapeableImageView6;
        this.z0 = viewPager2;
        this.A0 = coordinatorLayout;
        this.B0 = tabLayout;
        this.C0 = floatingActionButton2;
        this.D0 = floatingActionButton3;
        this.E0 = relativeLayout;
        this.F0 = floatingActionButton4;
        this.G0 = floatingActionButton5;
        this.H0 = floatingActionButton6;
        this.I0 = floatingActionButton7;
        this.J0 = materialTextView;
        this.K0 = textInputEditText;
        this.L0 = textInputLayout;
        this.M0 = linearLayout;
        this.N0 = materialTextView2;
        this.O0 = materialTextView3;
        this.P0 = shimmerFrameLayout;
        this.Q0 = shapeableImageView7;
        this.R0 = shapeableImageView8;
        this.S0 = shapeableImageView9;
        this.T0 = shapeableImageView10;
        this.U0 = materialTextView4;
        this.V0 = swipeRefreshLayout;
        this.W0 = toolbar;
        this.X0 = constraintLayout2;
        this.Y0 = materialTextView5;
        this.Z0 = materialTextView6;
        this.a1 = constraintLayout3;
    }

    public static ws4 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ws4 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ws4) ewi.m25668F(layoutInflater, p9e.dashboard_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);
}
