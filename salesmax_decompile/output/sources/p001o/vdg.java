package p001o;

import ai.salesmax.view.ViewProfileData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class vdg extends ewi {
    public final HorizontalScrollView n0;
    public final MaterialButton o0;
    public final ViewProfileData p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final ViewProfileData s0;
    public final MaterialTextView t0;
    public final MaterialButton u0;
    public final LinearLayout v0;

    public vdg(Object obj, View view, int i, HorizontalScrollView horizontalScrollView, MaterialButton materialButton, ViewProfileData viewProfileData, MaterialButton materialButton2, MaterialButton materialButton3, ViewProfileData viewProfileData2, MaterialTextView materialTextView, MaterialButton materialButton4, LinearLayout linearLayout) {
        super(obj, view, i);
        this.n0 = horizontalScrollView;
        this.o0 = materialButton;
        this.p0 = viewProfileData;
        this.q0 = materialButton2;
        this.r0 = materialButton3;
        this.s0 = viewProfileData2;
        this.t0 = materialTextView;
        this.u0 = materialButton4;
        this.v0 = linearLayout;
    }

    public static vdg h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static vdg i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vdg) ewi.m25668F(layoutInflater, p9e.support_fragment, viewGroup, z, obj);
    }
}
