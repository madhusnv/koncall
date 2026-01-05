package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class c3g extends ewi {
    public ck6 A0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialCardView p0;
    public final r14 q0;
    public final View r0;
    public final MaterialButton s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final ShapeableImageView v0;
    public final MaterialTextView w0;
    public Leads x0;
    public FormFields y0;
    public Integer z0;

    public c3g(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialCardView materialCardView, r14 r14Var, View view2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialCardView;
        this.q0 = r14Var;
        this.r0 = view2;
        this.s0 = materialButton3;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = shapeableImageView;
        this.w0 = materialTextView3;
    }

    public static c3g i0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return j0(layoutInflater, null);
    }

    public static c3g j0(LayoutInflater layoutInflater, Object obj) {
        return (c3g) ewi.m25668F(layoutInflater, p9e.standalone_custom_values, null, false, obj);
    }

    public FormFields h0() {
        return this.y0;
    }

    public abstract void k0(FormFields formFields);

    public abstract void l0(ck6 ck6Var);

    public abstract void m0(Leads leads);
}
