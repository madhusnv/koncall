package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class akd extends ewi {
    public final RecyclerView n0;
    public final FloatingActionButton o0;
    public final ShapeableImageView p0;
    public final MaterialCardView q0;

    public akd(Object obj, View view, int i, RecyclerView recyclerView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = floatingActionButton;
        this.p0 = shapeableImageView;
        this.q0 = materialCardView;
    }

    public static akd h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static akd i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (akd) ewi.m25668F(layoutInflater, p9e.product_fragment, viewGroup, z, obj);
    }
}
