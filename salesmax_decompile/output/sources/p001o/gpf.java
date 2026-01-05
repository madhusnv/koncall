package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class gpf extends ewi {
    public ArrayList A0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final LinearLayout p0;
    public final View q0;
    public final RecyclerView r0;
    public final RecyclerView s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final RecyclerView v0;
    public final MaterialButton w0;
    public final MaterialTextView x0;
    public final MaterialTextView y0;
    public final MaterialTextView z0;

    public gpf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout, View view2, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialButton materialButton3, MaterialButton materialButton4, RecyclerView recyclerView3, MaterialButton materialButton5, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = linearLayout;
        this.q0 = view2;
        this.r0 = recyclerView;
        this.s0 = recyclerView2;
        this.t0 = materialButton3;
        this.u0 = materialButton4;
        this.v0 = recyclerView3;
        this.w0 = materialButton5;
        this.x0 = materialTextView;
        this.y0 = materialTextView2;
        this.z0 = materialTextView3;
    }

    public static gpf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static gpf i0(LayoutInflater layoutInflater, Object obj) {
        return (gpf) ewi.m25668F(layoutInflater, p9e.sheet_upload_files, null, false, obj);
    }

    public abstract void j0(ArrayList arrayList);
}
