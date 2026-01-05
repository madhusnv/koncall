package p001o;

import ai.salesmax.model.ChatChannel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;

/* loaded from: classes.dex */
public abstract class pi7 extends ewi {
    public final ShapeableImageView A0;
    public final ShapeableImageView B0;
    public final MaterialTextView C0;
    public final MaterialTextView D0;
    public final ImageView E0;
    public final ShapeableImageView F0;
    public final FloatingActionButton G0;
    public final View H0;
    public final FrameLayout I0;
    public final TouchImageView J0;
    public final ShapeableImageView K0;
    public final LinearLayout L0;
    public final LinearLayout M0;
    public final LinearLayout N0;
    public final MaterialTextView O0;
    public final TextInputLayout P0;
    public final RelativeLayout Q0;
    public final Chip R0;
    public final ShapeableImageView S0;
    public final ShapeableImageView T0;
    public final ConstraintLayout U0;
    public final ConstraintLayout V0;
    public final RecyclerView W0;
    public final ShapeableImageView X0;
    public final ShapeableImageView Y0;
    public final ShimmerFrameLayout Z0;
    public final AppCompatAutoCompleteTextView a1;
    public final MaterialTextView b1;
    public final MaterialTextView c1;
    public final MaterialTextView d1;
    public final MaterialTextView e1;
    public boolean f1;
    public Integer g1;
    public ChatChannel h1;
    public Integer i1;
    public Boolean j1;
    public String k1;
    public ck6 l1;
    public final ShapeableImageView n0;
    public final MaterialCardView o0;
    public final ShapeableImageView p0;
    public final ShapeableImageView q0;
    public final ShapeableImageView r0;
    public final ShapeableImageView s0;
    public final ShapeableImageView t0;
    public final ConstraintLayout u0;
    public final ConstraintLayout v0;
    public final ShapeableImageView w0;
    public final ShapeableImageView x0;
    public final ShapeableImageView y0;
    public final ShapeableImageView z0;

    public pi7(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, ShapeableImageView shapeableImageView6, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ShapeableImageView shapeableImageView7, ShapeableImageView shapeableImageView8, ShapeableImageView shapeableImageView9, ShapeableImageView shapeableImageView10, ShapeableImageView shapeableImageView11, ShapeableImageView shapeableImageView12, MaterialTextView materialTextView, MaterialTextView materialTextView2, ImageView imageView, ShapeableImageView shapeableImageView13, FloatingActionButton floatingActionButton, View view2, FrameLayout frameLayout, TouchImageView touchImageView, ShapeableImageView shapeableImageView14, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MaterialTextView materialTextView3, TextInputLayout textInputLayout, RelativeLayout relativeLayout, Chip chip, ShapeableImageView shapeableImageView15, ShapeableImageView shapeableImageView16, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, RecyclerView recyclerView, ShapeableImageView shapeableImageView17, ShapeableImageView shapeableImageView18, ShimmerFrameLayout shimmerFrameLayout, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialCardView;
        this.p0 = shapeableImageView2;
        this.q0 = shapeableImageView3;
        this.r0 = shapeableImageView4;
        this.s0 = shapeableImageView5;
        this.t0 = shapeableImageView6;
        this.u0 = constraintLayout;
        this.v0 = constraintLayout2;
        this.w0 = shapeableImageView7;
        this.x0 = shapeableImageView8;
        this.y0 = shapeableImageView9;
        this.z0 = shapeableImageView10;
        this.A0 = shapeableImageView11;
        this.B0 = shapeableImageView12;
        this.C0 = materialTextView;
        this.D0 = materialTextView2;
        this.E0 = imageView;
        this.F0 = shapeableImageView13;
        this.G0 = floatingActionButton;
        this.H0 = view2;
        this.I0 = frameLayout;
        this.J0 = touchImageView;
        this.K0 = shapeableImageView14;
        this.L0 = linearLayout;
        this.M0 = linearLayout2;
        this.N0 = linearLayout3;
        this.O0 = materialTextView3;
        this.P0 = textInputLayout;
        this.Q0 = relativeLayout;
        this.R0 = chip;
        this.S0 = shapeableImageView15;
        this.T0 = shapeableImageView16;
        this.U0 = constraintLayout3;
        this.V0 = constraintLayout4;
        this.W0 = recyclerView;
        this.X0 = shapeableImageView17;
        this.Y0 = shapeableImageView18;
        this.Z0 = shimmerFrameLayout;
        this.a1 = appCompatAutoCompleteTextView;
        this.b1 = materialTextView4;
        this.c1 = materialTextView5;
        this.d1 = materialTextView6;
        this.e1 = materialTextView7;
    }

    public static pi7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static pi7 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (pi7) ewi.m25668F(layoutInflater, p9e.fragment_team_chat_window, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.f1;
    }

    public abstract void k0(ChatChannel chatChannel);

    public abstract void l0(String str);

    public abstract void m0(Boolean bool);

    public abstract void n0(Integer num);

    public abstract void p0(boolean z);
}
