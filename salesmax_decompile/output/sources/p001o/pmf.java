package p001o;

import ai.salesmax.model.Tasks;
import ai.salesmax.view.NoSwipePager;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class pmf extends ewi {
    public final NoSwipePager n0;
    public final ConstraintLayout o0;
    public final f40 p0;
    public final g40 q0;
    public Tasks r0;

    public pmf(Object obj, View view, int i, NoSwipePager noSwipePager, ConstraintLayout constraintLayout, f40 f40Var, g40 g40Var) {
        super(obj, view, i);
        this.n0 = noSwipePager;
        this.o0 = constraintLayout;
        this.p0 = f40Var;
        this.q0 = g40Var;
    }

    public static pmf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static pmf i0(LayoutInflater layoutInflater, Object obj) {
        return (pmf) ewi.m25668F(layoutInflater, p9e.sheet_add_tasks, null, false, obj);
    }

    public abstract void j0(Tasks tasks);
}
