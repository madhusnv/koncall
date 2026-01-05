package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class kpf extends ewi {
    public final MaterialButton n0;
    public final h44 o0;
    public final ShapeableImageView p0;
    public final RecyclerView q0;
    public final MaterialTextView r0;
    public String s0;
    public boolean t0;
    public boolean u0;

    public kpf(Object obj, View view, int i, MaterialButton materialButton, h44 h44Var, ShapeableImageView shapeableImageView, RecyclerView recyclerView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = h44Var;
        this.p0 = shapeableImageView;
        this.q0 = recyclerView;
        this.r0 = materialTextView;
    }

    public static kpf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static kpf i0(LayoutInflater layoutInflater, Object obj) {
        return (kpf) ewi.m25668F(layoutInflater, p9e.sheet_user_actions, null, false, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(String str);
}
