package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class fo2 extends ewi {
    public final RecyclerView n0;
    public final FloatingActionButton o0;
    public final ShapeableImageView p0;
    public final MaterialCardView q0;

    public fo2(Object obj, View view, int i, RecyclerView recyclerView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = floatingActionButton;
        this.p0 = shapeableImageView;
        this.q0 = materialCardView;
    }

    public static fo2 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static fo2 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (fo2) ewi.m25668F(layoutInflater, p9e.chat_label_definition_fragment, viewGroup, z, obj);
    }
}
