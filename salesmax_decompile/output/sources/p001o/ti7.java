package p001o;

import ai.salesmax.model.LeadsTeam;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class ti7 extends ewi {
    public final j44 n0;
    public final RecyclerView o0;
    public boolean p0;
    public LeadsTeam q0;
    public Integer r0;
    public ck6 s0;

    public ti7(Object obj, View view, int i, j44 j44Var, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = j44Var;
        this.o0 = recyclerView;
    }

    public static ti7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ti7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ti7) ewi.m25668F(layoutInflater, p9e.fragment_team_info, viewGroup, z, obj);
    }

    public abstract void j0(LeadsTeam leadsTeam);

    public abstract void k0(boolean z);
}
