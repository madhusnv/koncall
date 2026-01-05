package p001o;

import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class o1c extends ewi {
    public final MaterialTextView A0;
    public final MaterialButton B0;
    public final ConstraintLayout C0;
    public final View D0;
    public final View E0;
    public final MaterialButton F0;
    public final RecyclerView G0;
    public final MaterialButton H0;
    public final MaterialTextView I0;
    public final ShimmerFrameLayout J0;
    public final MaterialTextView K0;
    public final MaterialTextView L0;
    public Tasks M0;
    public Integer N0;
    public ck6 O0;
    public final ShapeableImageView n0;
    public final ShapeableImageView o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final ConstraintLayout r0;
    public final LinearLayout s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MentionAutoCompleteTextView v0;
    public final TextInputLayout w0;
    public final RecyclerView x0;
    public final MaterialTextView y0;
    public final MaterialTextView z0;

    public o1c(Object obj, View view, int i, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, MaterialTextView materialTextView, ConstraintLayout constraintLayout, LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MentionAutoCompleteTextView mentionAutoCompleteTextView, TextInputLayout textInputLayout, RecyclerView recyclerView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialButton materialButton3, ConstraintLayout constraintLayout2, View view2, View view3, MaterialButton materialButton4, RecyclerView recyclerView2, MaterialButton materialButton5, MaterialTextView materialTextView5, ShimmerFrameLayout shimmerFrameLayout, MaterialTextView materialTextView6, MaterialTextView materialTextView7) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = shapeableImageView2;
        this.p0 = shapeableImageView3;
        this.q0 = materialTextView;
        this.r0 = constraintLayout;
        this.s0 = linearLayout;
        this.t0 = materialButton;
        this.u0 = materialButton2;
        this.v0 = mentionAutoCompleteTextView;
        this.w0 = textInputLayout;
        this.x0 = recyclerView;
        this.y0 = materialTextView2;
        this.z0 = materialTextView3;
        this.A0 = materialTextView4;
        this.B0 = materialButton3;
        this.C0 = constraintLayout2;
        this.D0 = view2;
        this.E0 = view3;
        this.F0 = materialButton4;
        this.G0 = recyclerView2;
        this.H0 = materialButton5;
        this.I0 = materialTextView5;
        this.J0 = shimmerFrameLayout;
        this.K0 = materialTextView6;
        this.L0 = materialTextView7;
    }

    public static o1c h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static o1c i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (o1c) ewi.m25668F(layoutInflater, p9e.notes_details_fragment, viewGroup, z, obj);
    }

    public abstract void j0(Tasks tasks);
}
