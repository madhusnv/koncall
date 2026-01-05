package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class np extends ewi {
    public boolean A0;
    public final ViewPager2 n0;
    public final ConstraintLayout o0;
    public final ShapeableImageView p0;
    public final TextView q0;
    public final AppBarLayout r0;
    public final FloatingActionButton s0;
    public final FrameLayout t0;
    public final ShapeableImageView u0;
    public final TextInputEditText v0;
    public final TextInputLayout w0;
    public final SwipeRefreshLayout x0;
    public final TabLayout y0;
    public final Toolbar z0;

    public np(Object obj, View view, int i, ViewPager2 viewPager2, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton, FrameLayout frameLayout, ShapeableImageView shapeableImageView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, SwipeRefreshLayout swipeRefreshLayout, TabLayout tabLayout, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = viewPager2;
        this.o0 = constraintLayout;
        this.p0 = shapeableImageView;
        this.q0 = textView;
        this.r0 = appBarLayout;
        this.s0 = floatingActionButton;
        this.t0 = frameLayout;
        this.u0 = shapeableImageView2;
        this.v0 = textInputEditText;
        this.w0 = textInputLayout;
        this.x0 = swipeRefreshLayout;
        this.y0 = tabLayout;
        this.z0 = toolbar;
    }

    public static np i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static np j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (np) ewi.m25668F(layoutInflater, p9e.activity_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.A0;
    }

    public abstract void k0(boolean z);
}
