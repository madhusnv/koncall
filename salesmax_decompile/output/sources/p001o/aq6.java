package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public abstract class aq6 {
    /* renamed from: a */
    public static final View m17652a(ViewGroup viewGroup, int i, boolean z) {
        sq8.m48649h(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        sq8.m48648g(viewInflate, "from(context).inflate(la…tRes, this, attachToRoot)");
        return viewInflate;
    }

    /* renamed from: b */
    public static /* synthetic */ View m17653b(ViewGroup viewGroup, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m17652a(viewGroup, i, z);
    }
}
