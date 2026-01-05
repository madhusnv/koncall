package p001o;

import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ho extends ewi {
    public Boolean A0;
    public Leads B0;
    public Tasks C0;
    public AutoCompleteListModel D0;
    public Integer E0;
    public ck6 F0;
    public final MaterialTextView n0;
    public final ConstraintLayout o0;
    public final b34 p0;
    public final RecyclerView q0;
    public final ShimmerFrameLayout r0;
    public final MaterialCardView s0;
    public final RecyclerView t0;
    public final MaterialTextView u0;
    public final TextInputLayout v0;
    public final AutoCompleteTextView w0;
    public final MaterialTextView x0;
    public final MaterialTextView y0;
    public Boolean z0;

    public ho(Object obj, View view, int i, MaterialTextView materialTextView, ConstraintLayout constraintLayout, b34 b34Var, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, MaterialCardView materialCardView, RecyclerView recyclerView2, MaterialTextView materialTextView2, TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = constraintLayout;
        this.p0 = b34Var;
        this.q0 = recyclerView;
        this.r0 = shimmerFrameLayout;
        this.s0 = materialCardView;
        this.t0 = recyclerView2;
        this.u0 = materialTextView2;
        this.v0 = textInputLayout;
        this.w0 = autoCompleteTextView;
        this.x0 = materialTextView3;
        this.y0 = materialTextView4;
    }

    public static ho i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static ho j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ho) ewi.m25668F(layoutInflater, p9e.activity_detail_fragment, viewGroup, z, obj);
    }

    public Leads h0() {
        return this.B0;
    }

    public abstract void k0(Boolean bool);

    public abstract void l0(Boolean bool);

    public abstract void m0(Leads leads);
}
