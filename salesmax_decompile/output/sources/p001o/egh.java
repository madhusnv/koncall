package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class egh extends ewi {
    public final TextInputLayout A0;
    public final LinearLayout B0;
    public final ViewPager2 C0;
    public final Toolbar D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public final AppBarLayout n0;
    public final FloatingActionButton o0;
    public final RelativeLayout p0;
    public final FloatingActionButton q0;
    public final FloatingActionButton r0;
    public final FloatingActionButton s0;
    public final FloatingActionButton t0;
    public final MaterialTextView u0;
    public final LinearLayout v0;
    public final ShapeableImageView w0;
    public final ShapeableImageView x0;
    public final TabLayout y0;
    public final TextInputEditText z0;

    public egh(Object obj, View view, int i, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton, RelativeLayout relativeLayout, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3, FloatingActionButton floatingActionButton4, FloatingActionButton floatingActionButton5, MaterialTextView materialTextView, LinearLayout linearLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, TabLayout tabLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, LinearLayout linearLayout2, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = floatingActionButton;
        this.p0 = relativeLayout;
        this.q0 = floatingActionButton2;
        this.r0 = floatingActionButton3;
        this.s0 = floatingActionButton4;
        this.t0 = floatingActionButton5;
        this.u0 = materialTextView;
        this.v0 = linearLayout;
        this.w0 = shapeableImageView;
        this.x0 = shapeableImageView2;
        this.y0 = tabLayout;
        this.z0 = textInputEditText;
        this.A0 = textInputLayout;
        this.B0 = linearLayout2;
        this.C0 = viewPager2;
        this.D0 = toolbar;
    }

    public static egh i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static egh j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (egh) ewi.m25668F(layoutInflater, p9e.templates_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.I0;
    }

    public abstract void k0(boolean z);
}
