package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class n40 extends ewi {
    public final MaterialButton n0;
    public final AppCompatImageView o0;
    public final RecyclerView p0;
    public final LinearLayoutCompat q0;
    public final TextInputEditText r0;
    public final TextInputLayout s0;
    public final MaterialTextView t0;

    public n40(Object obj, View view, int i, MaterialButton materialButton, AppCompatImageView appCompatImageView, RecyclerView recyclerView, LinearLayoutCompat linearLayoutCompat, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = appCompatImageView;
        this.p0 = recyclerView;
        this.q0 = linearLayoutCompat;
        this.r0 = textInputEditText;
        this.s0 = textInputLayout;
        this.t0 = materialTextView;
    }

    public static n40 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static n40 i0(LayoutInflater layoutInflater, Object obj) {
        return (n40) ewi.m25668F(layoutInflater, p9e.add_task_search_location, null, false, obj);
    }
}
