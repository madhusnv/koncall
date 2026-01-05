package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ldf extends ewi {
    public final MaterialTextView n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final ConstraintLayout q0;
    public final ShapeableImageView r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;
    public final ShapeableImageView u0;

    public ldf(Object obj, View view, int i, MaterialTextView materialTextView, MaterialButton materialButton, MaterialTextView materialTextView2, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ShapeableImageView shapeableImageView2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialButton;
        this.p0 = materialTextView2;
        this.q0 = constraintLayout;
        this.r0 = shapeableImageView;
        this.s0 = materialTextView3;
        this.t0 = materialTextView4;
        this.u0 = shapeableImageView2;
    }

    public static ldf h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ldf i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ldf) ewi.m25668F(layoutInflater, p9e.send_email_otp_fragment, viewGroup, z, obj);
    }
}
