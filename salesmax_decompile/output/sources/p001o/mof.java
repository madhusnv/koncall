package p001o;

import ai.salesmax.model.ChatMessages;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class mof extends ewi {
    public final ConstraintLayout A0;
    public final ConstraintLayout B0;
    public final ConstraintLayout C0;
    public ChatMessages D0;
    public final ShapeableImageView n0;
    public final MaterialTextView o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialTextView r0;
    public final ConstraintLayout s0;
    public final MaterialTextView t0;
    public final MaterialButton u0;
    public final MaterialTextView v0;
    public final MaterialTextView w0;
    public final MaterialButton x0;
    public final MaterialTextView y0;
    public final kx8 z0;

    public mof(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialButton materialButton, MaterialTextView materialTextView3, ConstraintLayout constraintLayout, MaterialTextView materialTextView4, MaterialButton materialButton2, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialButton materialButton3, MaterialTextView materialTextView7, kx8 kx8Var, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialTextView;
        this.p0 = materialTextView2;
        this.q0 = materialButton;
        this.r0 = materialTextView3;
        this.s0 = constraintLayout;
        this.t0 = materialTextView4;
        this.u0 = materialButton2;
        this.v0 = materialTextView5;
        this.w0 = materialTextView6;
        this.x0 = materialButton3;
        this.y0 = materialTextView7;
        this.z0 = kx8Var;
        this.A0 = constraintLayout2;
        this.B0 = constraintLayout3;
        this.C0 = constraintLayout4;
    }

    public static mof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static mof i0(LayoutInflater layoutInflater, Object obj) {
        return (mof) ewi.m25668F(layoutInflater, p9e.sheet_message_info, null, false, obj);
    }

    public abstract void j0(ChatMessages chatMessages);
}
