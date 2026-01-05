package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;

/* loaded from: classes.dex */
public abstract class gcj extends ewi {
    public final MaterialSwitch n0;
    public final ShapeableImageView o0;
    public final MaterialCardView p0;
    public final RecyclerView q0;

    public gcj(Object obj, View view, int i, MaterialSwitch materialSwitch, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = materialSwitch;
        this.o0 = shapeableImageView;
        this.p0 = materialCardView;
        this.q0 = recyclerView;
    }

    public static gcj h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static gcj i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (gcj) ewi.m25668F(layoutInflater, p9e.working_hours_fragment, viewGroup, z, obj);
    }
}
