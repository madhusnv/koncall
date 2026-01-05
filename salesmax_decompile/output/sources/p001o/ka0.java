package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class ka0 extends ewi {
    public final FloatingActionButton n0;
    public final RecyclerView o0;
    public final RecyclerView p0;
    public final ShapeableImageView q0;
    public final MaterialCardView r0;

    public ka0(Object obj, View view, int i, FloatingActionButton floatingActionButton, RecyclerView recyclerView, RecyclerView recyclerView2, ShapeableImageView shapeableImageView, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.n0 = floatingActionButton;
        this.o0 = recyclerView;
        this.p0 = recyclerView2;
        this.q0 = shapeableImageView;
        this.r0 = materialCardView;
    }

    public static ka0 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ka0 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ka0) ewi.m25668F(layoutInflater, p9e.all_custom_forms_fragment, viewGroup, z, obj);
    }
}
