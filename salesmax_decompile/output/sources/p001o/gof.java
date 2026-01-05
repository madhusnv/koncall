package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class gof extends ewi {
    public final ConstraintLayout A0;
    public final ConstraintLayout B0;
    public final MaterialTextView n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialTextView r0;
    public final MaterialButton s0;
    public final MaterialTextView t0;
    public final MaterialButton u0;
    public final MaterialButton v0;
    public final MaterialTextView w0;
    public final ConstraintLayout x0;
    public final ConstraintLayout y0;
    public final ConstraintLayout z0;

    public gof(Object obj, View view, int i, MaterialTextView materialTextView, MaterialButton materialButton, MaterialTextView materialTextView2, MaterialButton materialButton2, MaterialTextView materialTextView3, MaterialButton materialButton3, MaterialTextView materialTextView4, MaterialButton materialButton4, MaterialButton materialButton5, MaterialTextView materialTextView5, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialButton;
        this.p0 = materialTextView2;
        this.q0 = materialButton2;
        this.r0 = materialTextView3;
        this.s0 = materialButton3;
        this.t0 = materialTextView4;
        this.u0 = materialButton4;
        this.v0 = materialButton5;
        this.w0 = materialTextView5;
        this.x0 = constraintLayout;
        this.y0 = constraintLayout2;
        this.z0 = constraintLayout3;
        this.A0 = constraintLayout4;
        this.B0 = constraintLayout5;
    }

    public static gof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static gof i0(LayoutInflater layoutInflater, Object obj) {
        return (gof) ewi.m25668F(layoutInflater, p9e.sheet_leads_more, null, false, obj);
    }
}
