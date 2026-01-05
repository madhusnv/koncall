package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chaos.view.PinView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ufc extends ewi {
    public final View n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final ConstraintLayout q0;
    public final ShapeableImageView r0;
    public final PinView s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final MaterialCardView v0;
    public final MaterialTextView w0;

    public ufc(Object obj, View view, int i, View view2, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, PinView pinView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialCardView materialCardView, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = materialButton;
        this.p0 = materialButton2;
        this.q0 = constraintLayout;
        this.r0 = shapeableImageView;
        this.s0 = pinView;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = materialCardView;
        this.w0 = materialTextView3;
    }

    public static ufc h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ufc i0(LayoutInflater layoutInflater, Object obj) {
        return (ufc) ewi.m25668F(layoutInflater, p9e.otp_number_change_fragment, null, false, obj);
    }
}
