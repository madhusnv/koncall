package p001o;

import ai.salesmax.model.ChatChannel;
import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class xg7 extends ewi {
    public final ShapeableImageView n0;
    public final ConstraintLayout o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final RecyclerView r0;
    public boolean s0;
    public Integer t0;
    public ChatChannel u0;
    public Leads v0;
    public Integer w0;
    public Boolean x0;
    public ck6 y0;

    public xg7(Object obj, View view, int i, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = constraintLayout;
        this.p0 = shapeableImageView2;
        this.q0 = materialTextView;
        this.r0 = recyclerView;
    }

    public static xg7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static xg7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (xg7) ewi.m25668F(layoutInflater, p9e.fragment_get_started, viewGroup, z, obj);
    }
}
