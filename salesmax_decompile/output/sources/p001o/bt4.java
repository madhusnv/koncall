package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class bt4 extends ewi {
    public final MaterialButton n0;
    public final TextView o0;
    public final ShapeableImageView p0;
    public final TextView q0;
    public final ShapeableImageView r0;
    public final TextView s0;
    public final ShapeableImageView t0;
    public final TextView u0;
    public final TextView v0;
    public final MaterialButton w0;
    public final RecyclerView x0;
    public Integer y0;

    public bt4(Object obj, View view, int i, MaterialButton materialButton, TextView textView, ShapeableImageView shapeableImageView, TextView textView2, ShapeableImageView shapeableImageView2, TextView textView3, ShapeableImageView shapeableImageView3, TextView textView4, TextView textView5, MaterialButton materialButton2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = textView;
        this.p0 = shapeableImageView;
        this.q0 = textView2;
        this.r0 = shapeableImageView2;
        this.s0 = textView3;
        this.t0 = shapeableImageView3;
        this.u0 = textView4;
        this.v0 = textView5;
        this.w0 = materialButton2;
        this.x0 = recyclerView;
    }

    public static bt4 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static bt4 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bt4) ewi.m25668F(layoutInflater, p9e.dashboard_no_team_account_fragment, viewGroup, z, obj);
    }

    public abstract void j0(Integer num);
}
