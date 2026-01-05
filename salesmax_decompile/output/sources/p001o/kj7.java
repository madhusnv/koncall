package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class kj7 extends ewi {
    public final AppBarLayout n0;
    public final ProgressBar o0;
    public final ShapeableImageView p0;
    public final ShapeableImageView q0;
    public final MaterialTextView r0;
    public final View s0;
    public final ViewPager2 t0;
    public final Toolbar u0;
    public String v0;

    public kj7(Object obj, View view, int i, AppBarLayout appBarLayout, ProgressBar progressBar, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, View view2, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = progressBar;
        this.p0 = shapeableImageView;
        this.q0 = shapeableImageView2;
        this.r0 = materialTextView;
        this.s0 = view2;
        this.t0 = viewPager2;
        this.u0 = toolbar;
    }

    public static kj7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static kj7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kj7) ewi.m25668F(layoutInflater, p9e.fragment_view_pdf_pager, viewGroup, z, obj);
    }
}
