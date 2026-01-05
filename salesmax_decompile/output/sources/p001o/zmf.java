package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class zmf extends ewi {
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;
    public final LinearLayout w0;
    public final LinearLayout x0;
    public final LinearLayout y0;
    public final MaterialButtonToggleGroup z0;

    public zmf(Object obj, View view, int i, Button button, Button button2, Button button3, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = materialButton;
        this.r0 = materialButton2;
        this.s0 = materialButton3;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = materialTextView3;
        this.w0 = linearLayout;
        this.x0 = linearLayout2;
        this.y0 = linearLayout3;
        this.z0 = materialButtonToggleGroup;
    }

    public static zmf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static zmf i0(LayoutInflater layoutInflater, Object obj) {
        return (zmf) ewi.m25668F(layoutInflater, p9e.sheet_attendance, null, false, obj);
    }
}
