package p001o;

import ai.salesmax.services.model.ActivityMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zi7 extends ewi {
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final View q0;
    public final RecyclerView r0;
    public final MaterialButtonToggleGroup s0;
    public ArrayList t0;
    public ActivityMetrics.Period u0;
    public Integer v0;
    public ck6 w0;

    public zi7(Object obj, View view, int i, Button button, Button button2, Button button3, View view2, RecyclerView recyclerView, MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = view2;
        this.r0 = recyclerView;
        this.s0 = materialButtonToggleGroup;
    }

    public static zi7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static zi7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zi7) ewi.m25668F(layoutInflater, p9e.fragment_user_activity, viewGroup, z, obj);
    }

    public abstract void j0(ActivityMetrics.Period period);
}
