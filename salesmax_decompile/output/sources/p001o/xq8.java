package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.androidpoet.materialintro.MaterialIntroFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class xq8 extends ewi {
    public final MaterialButton n0;
    public final MaterialIntroFragment o0;
    public final MaterialButton p0;
    public final TabLayout q0;

    public xq8(Object obj, View view, int i, MaterialButton materialButton, MaterialIntroFragment materialIntroFragment, MaterialButton materialButton2, TabLayout tabLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialIntroFragment;
        this.p0 = materialButton2;
        this.q0 = tabLayout;
    }

    public static xq8 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static xq8 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (xq8) ewi.m25668F(layoutInflater, p9e.intro_fragment, viewGroup, z, obj);
    }
}
