package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class oof extends ewi {
    public final v34 n0;
    public final ShapeableImageView o0;
    public final RecyclerView p0;
    public final MaterialTextView q0;
    public boolean r0;

    public oof(Object obj, View view, int i, v34 v34Var, ShapeableImageView shapeableImageView, RecyclerView recyclerView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = v34Var;
        this.o0 = shapeableImageView;
        this.p0 = recyclerView;
        this.q0 = materialTextView;
    }

    public static oof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static oof i0(LayoutInflater layoutInflater, Object obj) {
        return (oof) ewi.m25668F(layoutInflater, p9e.sheet_missing_actions, null, false, obj);
    }

    public abstract void j0(boolean z);
}
