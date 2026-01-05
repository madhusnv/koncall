package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class w10 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialCardView q0;
    public final RecyclerView r0;
    public final MaterialTextView s0;

    public w10(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialCardView materialCardView, RecyclerView recyclerView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialTextView;
        this.q0 = materialCardView;
        this.r0 = recyclerView;
        this.s0 = materialTextView2;
    }

    public static w10 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static w10 i0(LayoutInflater layoutInflater, Object obj) {
        return (w10) ewi.m25668F(layoutInflater, p9e.add_tag_fragment, null, false, obj);
    }
}
