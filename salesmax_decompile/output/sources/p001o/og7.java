package p001o;

import ai.salesmax.model.ChatChannel;
import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;

/* loaded from: classes.dex */
public abstract class og7 extends ewi {
    public final ShapeableImageView A0;
    public final MaterialTextView B0;
    public final MaterialTextView C0;
    public final ImageView D0;
    public final ShapeableImageView E0;
    public final FloatingActionButton F0;
    public final View G0;
    public final FrameLayout H0;
    public final TouchImageView I0;
    public final ShapeableImageView J0;
    public final LinearLayout K0;
    public final LinearLayout L0;
    public final LinearLayout M0;
    public final LinearLayout N0;
    public final TextInputLayout O0;
    public final RelativeLayout P0;
    public final Chip Q0;
    public final ShapeableImageView R0;
    public final ShapeableImageView S0;
    public final CircularProgressIndicator T0;
    public final ConstraintLayout U0;
    public final ConstraintLayout V0;
    public final RecyclerView W0;
    public final ShapeableImageView X0;
    public final ShapeableImageView Y0;
    public final ShapeableImageView Z0;
    public final MaterialButton a1;
    public final ShimmerFrameLayout b1;
    public final AppCompatAutoCompleteTextView c1;
    public final MaterialTextView d1;
    public final MaterialTextView e1;
    public final MaterialTextView f1;
    public final MaterialTextView g1;
    public final TextView h1;
    public final MaterialTextView i1;
    public final MaterialTextView j1;
    public boolean k1;
    public Integer l1;
    public ChatChannel m1;
    public final ShapeableImageView n0;
    public Leads n1;
    public final MaterialCardView o0;
    public Integer o1;
    public final ShapeableImageView p0;
    public Boolean p1;
    public final ShapeableImageView q0;
    public String q1;
    public final ShapeableImageView r0;
    public ck6 r1;
    public final ShapeableImageView s0;
    public final ConstraintLayout t0;
    public final ConstraintLayout u0;
    public final ShapeableImageView v0;
    public final ShapeableImageView w0;
    public final ShapeableImageView x0;
    public final ShapeableImageView y0;
    public final ShapeableImageView z0;

    public og7(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ShapeableImageView shapeableImageView6, ShapeableImageView shapeableImageView7, ShapeableImageView shapeableImageView8, ShapeableImageView shapeableImageView9, ShapeableImageView shapeableImageView10, ShapeableImageView shapeableImageView11, MaterialTextView materialTextView, MaterialTextView materialTextView2, ImageView imageView, ShapeableImageView shapeableImageView12, FloatingActionButton floatingActionButton, View view2, FrameLayout frameLayout, TouchImageView touchImageView, ShapeableImageView shapeableImageView13, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextInputLayout textInputLayout, RelativeLayout relativeLayout, Chip chip, ShapeableImageView shapeableImageView14, ShapeableImageView shapeableImageView15, CircularProgressIndicator circularProgressIndicator, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, RecyclerView recyclerView, ShapeableImageView shapeableImageView16, ShapeableImageView shapeableImageView17, ShapeableImageView shapeableImageView18, MaterialButton materialButton, ShimmerFrameLayout shimmerFrameLayout, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, TextView textView, MaterialTextView materialTextView7, MaterialTextView materialTextView8) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialCardView;
        this.p0 = shapeableImageView2;
        this.q0 = shapeableImageView3;
        this.r0 = shapeableImageView4;
        this.s0 = shapeableImageView5;
        this.t0 = constraintLayout;
        this.u0 = constraintLayout2;
        this.v0 = shapeableImageView6;
        this.w0 = shapeableImageView7;
        this.x0 = shapeableImageView8;
        this.y0 = shapeableImageView9;
        this.z0 = shapeableImageView10;
        this.A0 = shapeableImageView11;
        this.B0 = materialTextView;
        this.C0 = materialTextView2;
        this.D0 = imageView;
        this.E0 = shapeableImageView12;
        this.F0 = floatingActionButton;
        this.G0 = view2;
        this.H0 = frameLayout;
        this.I0 = touchImageView;
        this.J0 = shapeableImageView13;
        this.K0 = linearLayout;
        this.L0 = linearLayout2;
        this.M0 = linearLayout3;
        this.N0 = linearLayout4;
        this.O0 = textInputLayout;
        this.P0 = relativeLayout;
        this.Q0 = chip;
        this.R0 = shapeableImageView14;
        this.S0 = shapeableImageView15;
        this.T0 = circularProgressIndicator;
        this.U0 = constraintLayout3;
        this.V0 = constraintLayout4;
        this.W0 = recyclerView;
        this.X0 = shapeableImageView16;
        this.Y0 = shapeableImageView17;
        this.Z0 = shapeableImageView18;
        this.a1 = materialButton;
        this.b1 = shimmerFrameLayout;
        this.c1 = appCompatAutoCompleteTextView;
        this.d1 = materialTextView3;
        this.e1 = materialTextView4;
        this.f1 = materialTextView5;
        this.g1 = materialTextView6;
        this.h1 = textView;
        this.i1 = materialTextView7;
        this.j1 = materialTextView8;
    }

    public static og7 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static og7 k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (og7) ewi.m25668F(layoutInflater, p9e.fragment_chat_window, viewGroup, z, obj);
    }

    public Leads h0() {
        return this.n1;
    }

    public boolean i0() {
        return this.k1;
    }

    public abstract void l0(ChatChannel chatChannel);

    public abstract void m0(String str);

    public abstract void n0(Boolean bool);

    public abstract void p0(Leads leads);

    public abstract void q0(Integer num);

    public abstract void s0(boolean z);
}
