package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chaos.view.PinView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class v46 extends ewi {
    public final ShapeableImageView n0;
    public final ShapeableImageView o0;
    public final MaterialButton p0;
    public final ConstraintLayout q0;
    public final ShapeableImageView r0;
    public final PinView s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;

    public v46(Object obj, View view, int i, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialButton materialButton, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView3, PinView pinView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = shapeableImageView2;
        this.p0 = materialButton;
        this.q0 = constraintLayout;
        this.r0 = shapeableImageView3;
        this.s0 = pinView;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = materialTextView3;
    }

    public static v46 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static v46 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (v46) ewi.m25668F(layoutInflater, p9e.email_otp_fragment, viewGroup, z, obj);
    }
}
