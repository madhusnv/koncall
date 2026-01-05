package p001o;

import ai.salesmax.model.LeadsUser;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class dj7 extends ewi {
    public final RecyclerView n0;
    public LeadsUser o0;
    public Integer p0;
    public ck6 q0;

    public dj7(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = recyclerView;
    }

    public static dj7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static dj7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (dj7) ewi.m25668F(layoutInflater, p9e.fragment_user_info, viewGroup, z, obj);
    }

    public abstract void j0(LeadsUser leadsUser);
}
