package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class l6 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final LinearLayout t0;

    public l6(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, LinearLayout linearLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialButton4;
        this.r0 = materialButton5;
        this.s0 = materialButton6;
        this.t0 = linearLayout;
    }

    public static l6 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static l6 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l6) ewi.m25668F(layoutInflater, p9e.about_fragment, viewGroup, z, obj);
    }
}
