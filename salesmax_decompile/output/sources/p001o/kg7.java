package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class kg7 extends ewi {
    public final TabLayout A0;
    public final TabLayout B0;
    public final TextInputEditText C0;
    public final TextInputLayout D0;
    public final SwipeRefreshLayout E0;
    public final FrameLayout F0;
    public final ViewPager2 G0;
    public final Toolbar H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public final ShapeableImageView n0;
    public final AppBarLayout o0;
    public final ShapeableImageView p0;
    public final ShapeableImageView q0;
    public final ShapeableImageView r0;
    public final ShapeableImageView s0;
    public final MaterialTextView t0;
    public final ShapeableImageView u0;
    public final FloatingActionButton v0;
    public final MaterialTextView w0;
    public final LinearLayout x0;
    public final ShapeableImageView y0;
    public final LinearLayout z0;

    public kg7(Object obj, View view, int i, ShapeableImageView shapeableImageView, AppBarLayout appBarLayout, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, MaterialTextView materialTextView, ShapeableImageView shapeableImageView6, FloatingActionButton floatingActionButton, MaterialTextView materialTextView2, LinearLayout linearLayout, ShapeableImageView shapeableImageView7, LinearLayout linearLayout2, TabLayout tabLayout, TabLayout tabLayout2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, SwipeRefreshLayout swipeRefreshLayout, FrameLayout frameLayout, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = appBarLayout;
        this.p0 = shapeableImageView2;
        this.q0 = shapeableImageView3;
        this.r0 = shapeableImageView4;
        this.s0 = shapeableImageView5;
        this.t0 = materialTextView;
        this.u0 = shapeableImageView6;
        this.v0 = floatingActionButton;
        this.w0 = materialTextView2;
        this.x0 = linearLayout;
        this.y0 = shapeableImageView7;
        this.z0 = linearLayout2;
        this.A0 = tabLayout;
        this.B0 = tabLayout2;
        this.C0 = textInputEditText;
        this.D0 = textInputLayout;
        this.E0 = swipeRefreshLayout;
        this.F0 = frameLayout;
        this.G0 = viewPager2;
        this.H0 = toolbar;
    }

    public static kg7 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static kg7 k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kg7) ewi.m25668F(layoutInflater, p9e.fragment_chat, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.O0;
    }

    public boolean i0() {
        return this.N0;
    }

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);
}
