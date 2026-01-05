package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class n5a extends ewi {
    public final ShapeableImageView A0;
    public final ShapeableImageView B0;
    public final ViewPager2 C0;
    public final ShapeableImageView D0;
    public final LinearLayout E0;
    public final TabLayout F0;
    public final TextInputEditText G0;
    public final TextInputLayout H0;
    public final MaterialButton I0;
    public final SwipeRefreshLayout J0;
    public final Toolbar K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public final MaterialButton n0;
    public final AppBarLayout o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final ShapeableImageView s0;
    public final FloatingActionButton t0;
    public final FloatingActionButton u0;
    public final FrameLayout v0;
    public final MaterialTextView w0;
    public final ConstraintLayout x0;
    public final ShapeableImageView y0;
    public final TextView z0;

    public n5a(Object obj, View view, int i, MaterialButton materialButton, AppBarLayout appBarLayout, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, ShapeableImageView shapeableImageView, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FrameLayout frameLayout, MaterialTextView materialTextView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView2, TextView textView, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, ViewPager2 viewPager2, ShapeableImageView shapeableImageView5, LinearLayout linearLayout, TabLayout tabLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButton materialButton5, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = appBarLayout;
        this.p0 = materialButton2;
        this.q0 = materialButton3;
        this.r0 = materialButton4;
        this.s0 = shapeableImageView;
        this.t0 = floatingActionButton;
        this.u0 = floatingActionButton2;
        this.v0 = frameLayout;
        this.w0 = materialTextView;
        this.x0 = constraintLayout;
        this.y0 = shapeableImageView2;
        this.z0 = textView;
        this.A0 = shapeableImageView3;
        this.B0 = shapeableImageView4;
        this.C0 = viewPager2;
        this.D0 = shapeableImageView5;
        this.E0 = linearLayout;
        this.F0 = tabLayout;
        this.G0 = textInputEditText;
        this.H0 = textInputLayout;
        this.I0 = materialButton5;
        this.J0 = swipeRefreshLayout;
        this.K0 = toolbar;
    }

    public static n5a k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return l0(layoutInflater, viewGroup, z, null);
    }

    public static n5a l0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (n5a) ewi.m25668F(layoutInflater, p9e.leads_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.L0;
    }

    public boolean i0() {
        return this.R0;
    }

    public boolean j0() {
        return this.Q0;
    }

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);

    public abstract void p0(boolean z);

    public abstract void q0(boolean z);
}
