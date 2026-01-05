package p001o;

import ai.salesmax.model.ActiveProfile;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class nt4 extends ewi {
    public final MaterialCardView A0;
    public final MaterialButton B0;
    public final MaterialTextView C0;
    public final MaterialTextView D0;
    public final MaterialButton E0;
    public final TextView F0;
    public final ShapeableImageView G0;
    public final TextView H0;
    public ActiveProfile I0;
    public Integer J0;
    public final TextView n0;
    public final TextView o0;
    public final MaterialButton p0;
    public final ShapeableImageView q0;
    public final ShapeableImageView r0;
    public final ShapeableImageView s0;
    public final TextView t0;
    public final ShapeableImageView u0;
    public final TextView v0;
    public final TextView w0;
    public final MaterialButton x0;
    public final RecyclerView y0;
    public final ConstraintLayout z0;

    public nt4(Object obj, View view, int i, TextView textView, TextView textView2, MaterialButton materialButton, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, TextView textView3, ShapeableImageView shapeableImageView4, TextView textView4, TextView textView5, MaterialButton materialButton2, RecyclerView recyclerView, ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialButton materialButton4, TextView textView6, ShapeableImageView shapeableImageView5, TextView textView7) {
        super(obj, view, i);
        this.n0 = textView;
        this.o0 = textView2;
        this.p0 = materialButton;
        this.q0 = shapeableImageView;
        this.r0 = shapeableImageView2;
        this.s0 = shapeableImageView3;
        this.t0 = textView3;
        this.u0 = shapeableImageView4;
        this.v0 = textView4;
        this.w0 = textView5;
        this.x0 = materialButton2;
        this.y0 = recyclerView;
        this.z0 = constraintLayout;
        this.A0 = materialCardView;
        this.B0 = materialButton3;
        this.C0 = materialTextView;
        this.D0 = materialTextView2;
        this.E0 = materialButton4;
        this.F0 = textView6;
        this.G0 = shapeableImageView5;
        this.H0 = textView7;
    }

    public static nt4 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static nt4 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (nt4) ewi.m25668F(layoutInflater, p9e.dashboard_trial_expired_fragment, viewGroup, z, obj);
    }

    public abstract void j0(ActiveProfile activeProfile);

    public abstract void k0(Integer num);
}
