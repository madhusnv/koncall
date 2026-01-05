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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class qph extends ewi {
    public final ConstraintLayout A0;
    public final ShapeableImageView B0;
    public final TextView C0;
    public final Toolbar D0;
    public boolean E0;
    public boolean F0;
    public final AppBarLayout n0;
    public final ShapeableImageView o0;
    public final FloatingActionButton p0;
    public final FrameLayout q0;
    public final ShapeableImageView r0;
    public final TextInputEditText s0;
    public final TextInputLayout t0;
    public final SwipeRefreshLayout u0;
    public final MaterialTextView v0;
    public final ShapeableImageView w0;
    public final ViewPager2 x0;
    public final LinearLayout y0;
    public final TabLayout z0;

    public qph(Object obj, View view, int i, AppBarLayout appBarLayout, ShapeableImageView shapeableImageView, FloatingActionButton floatingActionButton, FrameLayout frameLayout, ShapeableImageView shapeableImageView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, SwipeRefreshLayout swipeRefreshLayout, MaterialTextView materialTextView, ShapeableImageView shapeableImageView3, ViewPager2 viewPager2, LinearLayout linearLayout, TabLayout tabLayout, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView4, TextView textView, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = shapeableImageView;
        this.p0 = floatingActionButton;
        this.q0 = frameLayout;
        this.r0 = shapeableImageView2;
        this.s0 = textInputEditText;
        this.t0 = textInputLayout;
        this.u0 = swipeRefreshLayout;
        this.v0 = materialTextView;
        this.w0 = shapeableImageView3;
        this.x0 = viewPager2;
        this.y0 = linearLayout;
        this.z0 = tabLayout;
        this.A0 = constraintLayout;
        this.B0 = shapeableImageView4;
        this.C0 = textView;
        this.D0 = toolbar;
    }

    public static qph j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static qph k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qph) ewi.m25668F(layoutInflater, p9e.todo_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.F0;
    }

    public boolean i0() {
        return this.E0;
    }

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);
}
