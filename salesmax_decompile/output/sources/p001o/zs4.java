package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class zs4 extends ewi {
    public final RecyclerView n0;
    public Integer o0;

    public zs4(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = recyclerView;
    }

    public static zs4 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static zs4 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zs4) ewi.m25668F(layoutInflater, p9e.dashboard_my_fragment, viewGroup, z, obj);
    }

    public abstract void j0(Integer num);
}
