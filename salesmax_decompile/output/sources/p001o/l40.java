package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class l40 extends ewi {
    public final MaterialButton n0;
    public final MaterialTextView o0;
    public final RecyclerView p0;

    public l40(Object obj, View view, int i, MaterialButton materialButton, MaterialTextView materialTextView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialTextView;
        this.p0 = recyclerView;
    }

    public static l40 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static l40 i0(LayoutInflater layoutInflater, Object obj) {
        return (l40) ewi.m25668F(layoutInflater, p9e.add_task_reminder, null, false, obj);
    }
}
