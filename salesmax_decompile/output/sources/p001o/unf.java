package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class unf extends ewi {
    public final View n0;
    public final ShapeableImageView o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final RecyclerView r0;

    public unf(Object obj, View view, int i, View view2, ShapeableImageView shapeableImageView, MaterialButton materialButton, MaterialButton materialButton2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = shapeableImageView;
        this.p0 = materialButton;
        this.q0 = materialButton2;
        this.r0 = recyclerView;
    }

    public static unf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static unf i0(LayoutInflater layoutInflater, Object obj) {
        return (unf) ewi.m25668F(layoutInflater, p9e.sheet_filter, null, false, obj);
    }
}
