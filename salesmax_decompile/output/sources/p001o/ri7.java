package p001o;

import ai.salesmax.model.LeadsTeam;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ri7 extends ewi {
    public Boolean A0;
    public Integer B0;
    public ck6 C0;
    public Boolean D0;
    public boolean E0;
    public final View n0;
    public final LinearLayout o0;
    public final ViewPager2 p0;
    public final TabLayout q0;
    public final MaterialButton r0;
    public final ShapeableImageView s0;
    public final MaterialTextView t0;
    public final Toolbar u0;
    public final MaterialTextView v0;
    public final MaterialTextView w0;
    public final ShapeableImageView x0;
    public final MaterialButton y0;
    public LeadsTeam z0;

    public ri7(Object obj, View view, int i, View view2, LinearLayout linearLayout, ViewPager2 viewPager2, TabLayout tabLayout, MaterialButton materialButton, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, Toolbar toolbar, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ShapeableImageView shapeableImageView2, MaterialButton materialButton2) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = linearLayout;
        this.p0 = viewPager2;
        this.q0 = tabLayout;
        this.r0 = materialButton;
        this.s0 = shapeableImageView;
        this.t0 = materialTextView;
        this.u0 = toolbar;
        this.v0 = materialTextView2;
        this.w0 = materialTextView3;
        this.x0 = shapeableImageView2;
        this.y0 = materialButton2;
    }

    public static ri7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ri7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ri7) ewi.m25668F(layoutInflater, p9e.fragment_team_detail, viewGroup, z, obj);
    }

    public abstract void j0(LeadsTeam leadsTeam);

    public abstract void k0(Boolean bool);

    public abstract void l0(boolean z);
}
