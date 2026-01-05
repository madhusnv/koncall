package p001o;

import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;

/* loaded from: classes.dex */
public abstract class yo9 extends ewi {
    public final MaterialCardView A0;
    public Boolean A1;
    public final MaterialTextView B0;
    public Boolean B1;
    public final MaterialTextView C0;
    public String C1;
    public final FloatingActionButton D0;
    public Boolean D1;
    public final FloatingActionButton E0;
    public Integer E1;
    public final FloatingActionButton F0;
    public ck6 F1;
    public final FloatingActionButton G0;
    public final FrameLayout H0;
    public final ShapeableImageView I0;
    public final FrameLayout J0;
    public final TouchImageView K0;
    public final LinearLayout L0;
    public final ShapeableImageView M0;
    public final ShapeableImageView N0;
    public final ShapeableImageView O0;
    public final MaterialButton P0;
    public final LinearLayout Q0;
    public final MaterialButton R0;
    public final View S0;
    public final HorizontalScrollView T0;
    public final LinearLayout U0;
    public final ShapeableImageView V0;
    public final ShapeableImageView W0;
    public final LinearLayout X0;
    public final MaterialTextView Y0;
    public final MaterialTextView Z0;
    public final ShapeableImageView a1;
    public final FrameLayout b1;
    public final MaterialButton c1;
    public final Chip d1;
    public final Chip e1;
    public final MaterialTextView f1;
    public final MaterialButton g1;
    public final Chip h1;
    public final MaterialButton i1;
    public final MaterialButton j1;
    public final MaterialButton k1;
    public final MaterialButton l1;
    public final ViewPager2 m1;
    public final MaterialCardView n0;
    public final TabLayout n1;
    public final AppBarLayout o0;
    public final MaterialCardView o1;
    public final MaterialTextView p0;
    public final MaterialCardView p1;
    public final MaterialTextView q0;
    public final MaterialTextView q1;
    public final MaterialTextView r0;
    public final MaterialTextView r1;
    public final MaterialTextView s0;
    public final MaterialCardView s1;
    public final MaterialCardView t0;
    public final MaterialTextView t1;
    public final MaterialCardView u0;
    public final p44 u1;
    public final MaterialCardView v0;
    public final RecyclerView v1;
    public final MaterialCardView w0;
    public final SwipeRefreshLayout w1;
    public final LinearLayout x0;
    public final Toolbar x1;
    public final ImageView y0;
    public final MaterialTextView y1;
    public final t14 z0;
    public Leads z1;

    public yo9(Object obj, View view, int i, MaterialCardView materialCardView, AppBarLayout appBarLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, LinearLayout linearLayout, ImageView imageView, t14 t14Var, MaterialCardView materialCardView6, MaterialTextView materialTextView5, MaterialTextView materialTextView6, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3, FloatingActionButton floatingActionButton4, FrameLayout frameLayout, ShapeableImageView shapeableImageView, FrameLayout frameLayout2, TouchImageView touchImageView, LinearLayout linearLayout2, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, MaterialButton materialButton, LinearLayout linearLayout3, MaterialButton materialButton2, View view2, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout4, ShapeableImageView shapeableImageView5, ShapeableImageView shapeableImageView6, LinearLayout linearLayout5, MaterialTextView materialTextView7, MaterialTextView materialTextView8, ShapeableImageView shapeableImageView7, FrameLayout frameLayout3, MaterialButton materialButton3, Chip chip, Chip chip2, MaterialTextView materialTextView9, MaterialButton materialButton4, Chip chip3, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7, MaterialButton materialButton8, ViewPager2 viewPager2, TabLayout tabLayout, MaterialCardView materialCardView7, MaterialCardView materialCardView8, MaterialTextView materialTextView10, MaterialTextView materialTextView11, MaterialCardView materialCardView9, MaterialTextView materialTextView12, p44 p44Var, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, MaterialTextView materialTextView13) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = appBarLayout;
        this.p0 = materialTextView;
        this.q0 = materialTextView2;
        this.r0 = materialTextView3;
        this.s0 = materialTextView4;
        this.t0 = materialCardView2;
        this.u0 = materialCardView3;
        this.v0 = materialCardView4;
        this.w0 = materialCardView5;
        this.x0 = linearLayout;
        this.y0 = imageView;
        this.z0 = t14Var;
        this.A0 = materialCardView6;
        this.B0 = materialTextView5;
        this.C0 = materialTextView6;
        this.D0 = floatingActionButton;
        this.E0 = floatingActionButton2;
        this.F0 = floatingActionButton3;
        this.G0 = floatingActionButton4;
        this.H0 = frameLayout;
        this.I0 = shapeableImageView;
        this.J0 = frameLayout2;
        this.K0 = touchImageView;
        this.L0 = linearLayout2;
        this.M0 = shapeableImageView2;
        this.N0 = shapeableImageView3;
        this.O0 = shapeableImageView4;
        this.P0 = materialButton;
        this.Q0 = linearLayout3;
        this.R0 = materialButton2;
        this.S0 = view2;
        this.T0 = horizontalScrollView;
        this.U0 = linearLayout4;
        this.V0 = shapeableImageView5;
        this.W0 = shapeableImageView6;
        this.X0 = linearLayout5;
        this.Y0 = materialTextView7;
        this.Z0 = materialTextView8;
        this.a1 = shapeableImageView7;
        this.b1 = frameLayout3;
        this.c1 = materialButton3;
        this.d1 = chip;
        this.e1 = chip2;
        this.f1 = materialTextView9;
        this.g1 = materialButton4;
        this.h1 = chip3;
        this.i1 = materialButton5;
        this.j1 = materialButton6;
        this.k1 = materialButton7;
        this.l1 = materialButton8;
        this.m1 = viewPager2;
        this.n1 = tabLayout;
        this.o1 = materialCardView7;
        this.p1 = materialCardView8;
        this.q1 = materialTextView10;
        this.r1 = materialTextView11;
        this.s1 = materialCardView9;
        this.t1 = materialTextView12;
        this.u1 = p44Var;
        this.v1 = recyclerView;
        this.w1 = swipeRefreshLayout;
        this.x1 = toolbar;
        this.y1 = materialTextView13;
    }

    public static yo9 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static yo9 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yo9) ewi.m25668F(layoutInflater, p9e.lead_details_fragment, viewGroup, z, obj);
    }

    public abstract void j0(Boolean bool);

    public abstract void k0(Boolean bool);

    public abstract void l0(String str);

    public abstract void m0(Boolean bool);

    public abstract void n0(Leads leads);
}
