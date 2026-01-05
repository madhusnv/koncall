package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class it4 extends ewi {
    public final ShapeableImageView n0;
    public final l34 o0;
    public final ShapeableImageView p0;
    public final LinearLayout q0;
    public final ViewPager2 r0;
    public final TabLayout s0;
    public final TextInputEditText t0;
    public final TextInputLayout u0;
    public String v0;
    public boolean w0;

    public it4(Object obj, View view, int i, ShapeableImageView shapeableImageView, l34 l34Var, ShapeableImageView shapeableImageView2, LinearLayout linearLayout, ViewPager2 viewPager2, TabLayout tabLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = l34Var;
        this.p0 = shapeableImageView2;
        this.q0 = linearLayout;
        this.r0 = viewPager2;
        this.s0 = tabLayout;
        this.t0 = textInputEditText;
        this.u0 = textInputLayout;
    }

    public static it4 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static it4 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (it4) ewi.m25668F(layoutInflater, p9e.dashboard_search_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);
}
