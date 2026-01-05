package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class bfd extends ewi {
    public final MaterialTextView A0;
    public final LinearLayout B0;
    public final Chip C0;
    public final ShapeableImageView D0;
    public final ChipGroup E0;
    public final LinearLayout F0;
    public final Chip G0;
    public final TextInputEditText H0;
    public final TextInputLayout I0;
    public final Chip J0;
    public final Chip K0;
    public final Chip L0;
    public final Chip M0;
    public final CardView N0;
    public final ShapeableImageView O0;
    public final Chip P0;
    public final MaterialCardView Q0;
    public final Chip R0;
    public final View S0;
    public final Chip T0;
    public final Chip U0;
    public final Chip V0;
    public final Chip W0;
    public final Chip X0;
    public final MaterialTextView Y0;
    public final MaterialTextView Z0;
    public final MaterialTextView a1;
    public final Chip b1;
    public final Chip c1;
    public Leads d1;
    public Tasks e1;
    public Integer f1;
    public ck6 g1;
    public final Chip n0;
    public final MaterialTextView o0;
    public final MaterialTextView p0;
    public final LinearLayout q0;
    public final LinearLayout r0;
    public final Chip s0;
    public final MaterialTextView t0;
    public final Chip u0;
    public final Chip v0;
    public final Chip w0;
    public final LinearLayout x0;
    public final LinearLayout y0;
    public final LinearLayout z0;

    public bfd(Object obj, View view, int i, Chip chip, MaterialTextView materialTextView, MaterialTextView materialTextView2, LinearLayout linearLayout, LinearLayout linearLayout2, Chip chip2, MaterialTextView materialTextView3, Chip chip3, Chip chip4, Chip chip5, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, MaterialTextView materialTextView4, LinearLayout linearLayout6, Chip chip6, ShapeableImageView shapeableImageView, ChipGroup chipGroup, LinearLayout linearLayout7, Chip chip7, TextInputEditText textInputEditText, TextInputLayout textInputLayout, Chip chip8, Chip chip9, Chip chip10, Chip chip11, CardView cardView, ShapeableImageView shapeableImageView2, Chip chip12, MaterialCardView materialCardView, Chip chip13, View view2, Chip chip14, Chip chip15, Chip chip16, Chip chip17, Chip chip18, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, Chip chip19, Chip chip20) {
        super(obj, view, i);
        this.n0 = chip;
        this.o0 = materialTextView;
        this.p0 = materialTextView2;
        this.q0 = linearLayout;
        this.r0 = linearLayout2;
        this.s0 = chip2;
        this.t0 = materialTextView3;
        this.u0 = chip3;
        this.v0 = chip4;
        this.w0 = chip5;
        this.x0 = linearLayout3;
        this.y0 = linearLayout4;
        this.z0 = linearLayout5;
        this.A0 = materialTextView4;
        this.B0 = linearLayout6;
        this.C0 = chip6;
        this.D0 = shapeableImageView;
        this.E0 = chipGroup;
        this.F0 = linearLayout7;
        this.G0 = chip7;
        this.H0 = textInputEditText;
        this.I0 = textInputLayout;
        this.J0 = chip8;
        this.K0 = chip9;
        this.L0 = chip10;
        this.M0 = chip11;
        this.N0 = cardView;
        this.O0 = shapeableImageView2;
        this.P0 = chip12;
        this.Q0 = materialCardView;
        this.R0 = chip13;
        this.S0 = view2;
        this.T0 = chip14;
        this.U0 = chip15;
        this.V0 = chip16;
        this.W0 = chip17;
        this.X0 = chip18;
        this.Y0 = materialTextView5;
        this.Z0 = materialTextView6;
        this.a1 = materialTextView7;
        this.b1 = chip19;
        this.c1 = chip20;
    }

    public static bfd h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static bfd i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bfd) ewi.m25668F(layoutInflater, p9e.post_call_activity_locked, viewGroup, z, obj);
    }

    public abstract void j0(Tasks tasks);

    public abstract void k0(ck6 ck6Var);

    public abstract void l0(Leads leads);

    public abstract void m0(Integer num);
}
