package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class zr5 extends ewi {
    public final ShapeableImageView A0;
    public final ShapeableImageView B0;
    public final MaterialButton C0;
    public final LinearLayout D0;
    public final ConstraintLayout E0;
    public final FrameLayout F0;
    public final ShapeableImageView G0;
    public final View H0;
    public final CardView I0;
    public final ShapeableImageView J0;
    public final ShapeableImageView K0;
    public final ShapeableImageView L0;
    public final LinearLayout M0;
    public final MaterialTextView N0;
    public final ShapeableImageView O0;
    public final MaterialCardView P0;
    public final ShapeableImageView Q0;
    public final MaterialCardView R0;
    public final ShapeableImageView S0;
    public final ShapeableImageView T0;
    public final LinearLayout U0;
    public final MaterialTextView V0;
    public final Chip W0;
    public final MaterialTextView X0;
    public final MaterialButton Y0;
    public final LinearLayout Z0;
    public final LinearLayout a1;
    public final ConstraintLayout b1;
    public final SeekBar c1;
    public final MaterialTextView d1;
    public final MaterialTextView e1;
    public final MaterialTextView f1;
    public final MaterialTextView g1;
    public final MaterialTextView h1;
    public final LinearLayout i1;
    public final LinearLayout j1;
    public final MaterialTextView k1;
    public final MaterialTextView l1;
    public final MaterialTextView m1;
    public final TextView n0;
    public final TextView n1;
    public final MaterialButton o0;
    public final LinearLayout o1;
    public final ImageButton p0;
    public final MaterialButton p1;
    public final Button q0;
    public ChatMessages q1;
    public final Button r0;
    public Leads r1;
    public final Button s0;
    public Integer s1;
    public final Button t0;
    public ck6 t1;
    public final Button u0;
    public rog u1;
    public final Button v0;
    public final MaterialTextView w0;
    public final MaterialButton x0;
    public final MaterialTextView y0;
    public final LinearLayout z0;

    public zr5(Object obj, View view, int i, TextView textView, MaterialButton materialButton, ImageButton imageButton, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, MaterialTextView materialTextView, MaterialButton materialButton2, MaterialTextView materialTextView2, LinearLayout linearLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialButton materialButton3, LinearLayout linearLayout2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ShapeableImageView shapeableImageView3, View view2, CardView cardView, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, ShapeableImageView shapeableImageView6, LinearLayout linearLayout3, MaterialTextView materialTextView3, ShapeableImageView shapeableImageView7, MaterialCardView materialCardView, ShapeableImageView shapeableImageView8, MaterialCardView materialCardView2, ShapeableImageView shapeableImageView9, ShapeableImageView shapeableImageView10, LinearLayout linearLayout4, MaterialTextView materialTextView4, Chip chip, MaterialTextView materialTextView5, MaterialButton materialButton4, LinearLayout linearLayout5, LinearLayout linearLayout6, ConstraintLayout constraintLayout2, SeekBar seekBar, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialTextView materialTextView10, LinearLayout linearLayout7, LinearLayout linearLayout8, MaterialTextView materialTextView11, MaterialTextView materialTextView12, MaterialTextView materialTextView13, TextView textView2, LinearLayout linearLayout9, MaterialButton materialButton5) {
        super(obj, view, i);
        this.n0 = textView;
        this.o0 = materialButton;
        this.p0 = imageButton;
        this.q0 = button;
        this.r0 = button2;
        this.s0 = button3;
        this.t0 = button4;
        this.u0 = button5;
        this.v0 = button6;
        this.w0 = materialTextView;
        this.x0 = materialButton2;
        this.y0 = materialTextView2;
        this.z0 = linearLayout;
        this.A0 = shapeableImageView;
        this.B0 = shapeableImageView2;
        this.C0 = materialButton3;
        this.D0 = linearLayout2;
        this.E0 = constraintLayout;
        this.F0 = frameLayout;
        this.G0 = shapeableImageView3;
        this.H0 = view2;
        this.I0 = cardView;
        this.J0 = shapeableImageView4;
        this.K0 = shapeableImageView5;
        this.L0 = shapeableImageView6;
        this.M0 = linearLayout3;
        this.N0 = materialTextView3;
        this.O0 = shapeableImageView7;
        this.P0 = materialCardView;
        this.Q0 = shapeableImageView8;
        this.R0 = materialCardView2;
        this.S0 = shapeableImageView9;
        this.T0 = shapeableImageView10;
        this.U0 = linearLayout4;
        this.V0 = materialTextView4;
        this.W0 = chip;
        this.X0 = materialTextView5;
        this.Y0 = materialButton4;
        this.Z0 = linearLayout5;
        this.a1 = linearLayout6;
        this.b1 = constraintLayout2;
        this.c1 = seekBar;
        this.d1 = materialTextView6;
        this.e1 = materialTextView7;
        this.f1 = materialTextView8;
        this.g1 = materialTextView9;
        this.h1 = materialTextView10;
        this.i1 = linearLayout7;
        this.j1 = linearLayout8;
        this.k1 = materialTextView11;
        this.l1 = materialTextView12;
        this.m1 = materialTextView13;
        this.n1 = textView2;
        this.o1 = linearLayout9;
        this.p1 = materialButton5;
    }

    public static zr5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static zr5 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zr5) ewi.m25668F(layoutInflater, p9e.dialog_fragment_container, viewGroup, z, obj);
    }

    public Leads h0() {
        return this.r1;
    }

    public abstract void k0(Leads leads);

    public abstract void l0(ChatMessages chatMessages);
}
