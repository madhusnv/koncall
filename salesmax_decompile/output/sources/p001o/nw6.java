package p001o;

import ai.salesmax.model.Template;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class nw6 extends ewi {
    public boolean A0;
    public Template B0;
    public Integer C0;
    public ck6 D0;
    public final AppBarLayout n0;
    public final MaterialButton o0;
    public final ShapeableImageView p0;
    public final ShapeableImageView q0;
    public final ViewPager2 r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;
    public final View u0;
    public final LinearLayout v0;
    public final TabLayout w0;
    public final MaterialButton x0;
    public final Toolbar y0;
    public final MaterialButton z0;

    public nw6(Object obj, View view, int i, AppBarLayout appBarLayout, MaterialButton materialButton, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ViewPager2 viewPager2, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view2, LinearLayout linearLayout, TabLayout tabLayout, MaterialButton materialButton2, Toolbar toolbar, MaterialButton materialButton3) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = materialButton;
        this.p0 = shapeableImageView;
        this.q0 = shapeableImageView2;
        this.r0 = viewPager2;
        this.s0 = materialTextView;
        this.t0 = materialTextView2;
        this.u0 = view2;
        this.v0 = linearLayout;
        this.w0 = tabLayout;
        this.x0 = materialButton2;
        this.y0 = toolbar;
        this.z0 = materialButton3;
    }

    public static nw6 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static nw6 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (nw6) ewi.m25668F(layoutInflater, p9e.file_details_fragment, viewGroup, z, obj);
    }

    public abstract void j0(Template template);

    public abstract void k0(boolean z);
}
