package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes.dex */
public abstract class qv5 extends ewi {
    public final TextInputEditText n0;
    public final ShapeableImageView o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final ConstraintLayout r0;
    public final ConstraintLayout s0;
    public final RecyclerView t0;

    public qv5(Object obj, View view, int i, TextInputEditText textInputEditText, ShapeableImageView shapeableImageView, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = textInputEditText;
        this.o0 = shapeableImageView;
        this.p0 = materialButton;
        this.q0 = materialButton2;
        this.r0 = constraintLayout;
        this.s0 = constraintLayout2;
        this.t0 = recyclerView;
    }

    public static qv5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static qv5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qv5) ewi.m25668F(layoutInflater, p9e.do_not_track_fragment, viewGroup, z, obj);
    }
}
