package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class eeg extends ewi {
    public final AppBarLayout n0;
    public final MaterialTextView o0;
    public final LinearLayout p0;
    public final ShapeableImageView q0;
    public final TabLayout r0;
    public final ViewPager2 s0;
    public final Toolbar t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;

    public eeg(Object obj, View view, int i, AppBarLayout appBarLayout, MaterialTextView materialTextView, LinearLayout linearLayout, ShapeableImageView shapeableImageView, TabLayout tabLayout, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = materialTextView;
        this.p0 = linearLayout;
        this.q0 = shapeableImageView;
        this.r0 = tabLayout;
        this.s0 = viewPager2;
        this.t0 = toolbar;
    }

    public static eeg i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static eeg j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (eeg) ewi.m25668F(layoutInflater, p9e.support_resources_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.y0;
    }

    public abstract void k0(boolean z);
}
