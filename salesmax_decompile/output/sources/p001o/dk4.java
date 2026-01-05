package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.WhatsAppTemplates;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class dk4 extends ewi {
    public final MaterialCardView A0;
    public final ShapeableImageView B0;
    public final MaterialCardView C0;
    public final ShapeableImageView D0;
    public final ShapeableImageView E0;
    public final LinearLayout F0;
    public final LinearLayout G0;
    public final LinearLayout H0;
    public final MaterialButton I0;
    public final MaterialButton J0;
    public final MaterialSwitch K0;
    public final MaterialButton L0;
    public final MaterialButton M0;
    public final MaterialButton N0;
    public final MaterialTextView O0;
    public final MaterialTextView P0;
    public final MaterialTextView Q0;
    public final LinearLayout R0;
    public final LinearLayout S0;
    public final ConstraintLayout T0;
    public final MaterialTextView U0;
    public final MaterialTextView V0;
    public final MaterialTextView W0;
    public final RecyclerView X0;
    public final MaterialTextView Y0;
    public final LinearLayout Z0;
    public final LinearLayout a1;
    public ChatMessages b1;
    public WhatsAppTemplates c1;
    public Integer d1;
    public ck6 e1;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final Button s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final CardView v0;
    public final ShapeableImageView w0;
    public final LinearLayout x0;
    public final MaterialTextView y0;
    public final ShapeableImageView z0;

    public dk4(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, MaterialButton materialButton, MaterialButton materialButton2, CardView cardView, ShapeableImageView shapeableImageView, LinearLayout linearLayout, MaterialTextView materialTextView, ShapeableImageView shapeableImageView2, MaterialCardView materialCardView, ShapeableImageView shapeableImageView3, MaterialCardView materialCardView2, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, MaterialButton materialButton3, MaterialButton materialButton4, MaterialSwitch materialSwitch, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, LinearLayout linearLayout5, LinearLayout linearLayout6, ConstraintLayout constraintLayout, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, RecyclerView recyclerView, MaterialTextView materialTextView8, LinearLayout linearLayout7, LinearLayout linearLayout8) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = button6;
        this.t0 = materialButton;
        this.u0 = materialButton2;
        this.v0 = cardView;
        this.w0 = shapeableImageView;
        this.x0 = linearLayout;
        this.y0 = materialTextView;
        this.z0 = shapeableImageView2;
        this.A0 = materialCardView;
        this.B0 = shapeableImageView3;
        this.C0 = materialCardView2;
        this.D0 = shapeableImageView4;
        this.E0 = shapeableImageView5;
        this.F0 = linearLayout2;
        this.G0 = linearLayout3;
        this.H0 = linearLayout4;
        this.I0 = materialButton3;
        this.J0 = materialButton4;
        this.K0 = materialSwitch;
        this.L0 = materialButton5;
        this.M0 = materialButton6;
        this.N0 = materialButton7;
        this.O0 = materialTextView2;
        this.P0 = materialTextView3;
        this.Q0 = materialTextView4;
        this.R0 = linearLayout5;
        this.S0 = linearLayout6;
        this.T0 = constraintLayout;
        this.U0 = materialTextView5;
        this.V0 = materialTextView6;
        this.W0 = materialTextView7;
        this.X0 = recyclerView;
        this.Y0 = materialTextView8;
        this.Z0 = linearLayout7;
        this.a1 = linearLayout8;
    }

    public static dk4 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static dk4 i0(LayoutInflater layoutInflater, Object obj) {
        return (dk4) ewi.m25668F(layoutInflater, p9e.customize_template_wa, null, false, obj);
    }

    public abstract void j0(ChatMessages chatMessages);

    public abstract void k0(WhatsAppTemplates whatsAppTemplates);
}
