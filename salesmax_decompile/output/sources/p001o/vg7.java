package p001o;

import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class vg7 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialButton o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final RecyclerView r0;
    public final xz8 s0;
    public final ConstraintLayout t0;
    public final MaterialTextView u0;
    public Leads v0;
    public Integer w0;
    public ck6 x0;

    public vg7(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialButton materialButton, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, RecyclerView recyclerView, xz8 xz8Var, ConstraintLayout constraintLayout, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialButton;
        this.p0 = shapeableImageView2;
        this.q0 = materialTextView;
        this.r0 = recyclerView;
        this.s0 = xz8Var;
        this.t0 = constraintLayout;
        this.u0 = materialTextView2;
    }

    public static vg7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static vg7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vg7) ewi.m25668F(layoutInflater, p9e.fragment_get_event, viewGroup, z, obj);
    }

    public abstract void j0(Leads leads);
}
