package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class rmf extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialTextView q0;
    public final LinearLayout r0;
    public final LinearLayout s0;

    public rmf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialTextView materialTextView2, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialTextView;
        this.q0 = materialTextView2;
        this.r0 = linearLayout;
        this.s0 = linearLayout2;
    }

    public static rmf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static rmf i0(LayoutInflater layoutInflater, Object obj) {
        return (rmf) ewi.m25668F(layoutInflater, p9e.sheet_add_templates, null, false, obj);
    }
}
