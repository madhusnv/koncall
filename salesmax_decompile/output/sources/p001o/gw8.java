package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class gw8 extends ewi {
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final ShapeableImageView q0;
    public final MaterialCardView r0;
    public final RecyclerView s0;
    public final MaterialButtonToggleGroup t0;

    public gw8(Object obj, View view, int i, Button button, Button button2, Button button3, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, RecyclerView recyclerView, MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = shapeableImageView;
        this.r0 = materialCardView;
        this.s0 = recyclerView;
        this.t0 = materialButtonToggleGroup;
    }

    public static gw8 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static gw8 i0(LayoutInflater layoutInflater, Object obj) {
        return (gw8) ewi.m25668F(layoutInflater, p9e.item_activity_info, null, false, obj);
    }
}
