package p001o;

import ai.salesmax.model.LeadsUser;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class bj7 extends ewi {
    public final Toolbar A0;
    public final MaterialTextView B0;
    public final MaterialTextView C0;
    public final MaterialTextView D0;
    public final ShapeableImageView E0;
    public final ShapeableImageView F0;
    public final MaterialButton G0;
    public final MaterialButton H0;
    public LeadsUser I0;
    public Boolean J0;
    public Integer K0;
    public ck6 L0;
    public Boolean M0;
    public boolean N0;
    public final MaterialButton n0;
    public final MaterialCardView o0;
    public final FloatingActionButton p0;
    public final ShapeableImageView q0;
    public final View r0;
    public final LinearLayout s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MaterialButton v0;
    public final ViewPager2 w0;
    public final TabLayout x0;
    public final MaterialButton y0;
    public final MaterialTextView z0;

    public bj7(Object obj, View view, int i, MaterialButton materialButton, MaterialCardView materialCardView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, View view2, LinearLayout linearLayout, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, ViewPager2 viewPager2, TabLayout tabLayout, MaterialButton materialButton5, MaterialTextView materialTextView, Toolbar toolbar, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, MaterialButton materialButton6, MaterialButton materialButton7) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialCardView;
        this.p0 = floatingActionButton;
        this.q0 = shapeableImageView;
        this.r0 = view2;
        this.s0 = linearLayout;
        this.t0 = materialButton2;
        this.u0 = materialButton3;
        this.v0 = materialButton4;
        this.w0 = viewPager2;
        this.x0 = tabLayout;
        this.y0 = materialButton5;
        this.z0 = materialTextView;
        this.A0 = toolbar;
        this.B0 = materialTextView2;
        this.C0 = materialTextView3;
        this.D0 = materialTextView4;
        this.E0 = shapeableImageView2;
        this.F0 = shapeableImageView3;
        this.G0 = materialButton6;
        this.H0 = materialButton7;
    }

    public static bj7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static bj7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bj7) ewi.m25668F(layoutInflater, p9e.fragment_user_detail, viewGroup, z, obj);
    }

    public abstract void j0(LeadsUser leadsUser);

    public abstract void k0(Boolean bool);

    public abstract void l0(boolean z);
}
