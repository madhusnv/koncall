package p001o;

import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ct1 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialButton o0;
    public final CardView p0;
    public final ShapeableImageView q0;
    public final MaterialCardView r0;
    public final p44 s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;
    public final MaterialTextView w0;
    public Leads x0;
    public Integer y0;
    public ck6 z0;

    public ct1(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialButton materialButton, CardView cardView, ShapeableImageView shapeableImageView2, MaterialCardView materialCardView, p44 p44Var, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialButton;
        this.p0 = cardView;
        this.q0 = shapeableImageView2;
        this.r0 = materialCardView;
        this.s0 = p44Var;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = materialTextView3;
        this.w0 = materialTextView4;
    }

    public static ct1 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ct1 i0(LayoutInflater layoutInflater, Object obj) {
        return (ct1) ewi.m25668F(layoutInflater, p9e.call_activity, null, false, obj);
    }

    public abstract void j0(ck6 ck6Var);

    public abstract void k0(Leads leads);

    public abstract void l0(Integer num);
}
