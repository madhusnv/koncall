package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
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
public abstract class li7 extends ewi {
    public final TextInputLayout A0;
    public final SwipeRefreshLayout B0;
    public final ViewPager2 C0;
    public final Toolbar D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public final AppBarLayout n0;
    public final MaterialButton o0;
    public final ShapeableImageView p0;
    public final FloatingActionButton q0;
    public final FloatingActionButton r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;
    public final LinearLayout u0;
    public final ShapeableImageView v0;
    public final ShapeableImageView w0;
    public final LinearLayout x0;
    public final TabLayout y0;
    public final TextInputEditText z0;

    public li7(Object obj, View view, int i, AppBarLayout appBarLayout, MaterialButton materialButton, ShapeableImageView shapeableImageView, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, MaterialTextView materialTextView, MaterialTextView materialTextView2, LinearLayout linearLayout, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, LinearLayout linearLayout2, TabLayout tabLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, SwipeRefreshLayout swipeRefreshLayout, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = materialButton;
        this.p0 = shapeableImageView;
        this.q0 = floatingActionButton;
        this.r0 = floatingActionButton2;
        this.s0 = materialTextView;
        this.t0 = materialTextView2;
        this.u0 = linearLayout;
        this.v0 = shapeableImageView2;
        this.w0 = shapeableImageView3;
        this.x0 = linearLayout2;
        this.y0 = tabLayout;
        this.z0 = textInputEditText;
        this.A0 = textInputLayout;
        this.B0 = swipeRefreshLayout;
        this.C0 = viewPager2;
        this.D0 = toolbar;
    }

    public static li7 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static li7 k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (li7) ewi.m25668F(layoutInflater, p9e.fragment_team_chat, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.K0;
    }

    public boolean i0() {
        return this.J0;
    }

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);
}
