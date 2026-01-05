package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class s45 extends ewi {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final AppBarLayout n0;
    public final FloatingActionButton o0;
    public final LinearLayout p0;
    public final ShapeableImageView q0;
    public final TabLayout r0;
    public final TextInputEditText s0;
    public final TextInputLayout t0;
    public final ShimmerFrameLayout u0;
    public final SwipeRefreshLayout v0;
    public final ViewPager2 w0;
    public final Toolbar x0;
    public boolean y0;
    public boolean z0;

    public s45(Object obj, View view, int i, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton, LinearLayout linearLayout, ShapeableImageView shapeableImageView, TabLayout tabLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ShimmerFrameLayout shimmerFrameLayout, SwipeRefreshLayout swipeRefreshLayout, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = floatingActionButton;
        this.p0 = linearLayout;
        this.q0 = shapeableImageView;
        this.r0 = tabLayout;
        this.s0 = textInputEditText;
        this.t0 = textInputLayout;
        this.u0 = shimmerFrameLayout;
        this.v0 = swipeRefreshLayout;
        this.w0 = viewPager2;
        this.x0 = toolbar;
    }

    public static s45 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static s45 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (s45) ewi.m25668F(layoutInflater, p9e.deal_stages_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.C0;
    }

    public abstract void k0(boolean z);
}
