package p001o;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes6.dex */
public final class sx8 {

    /* renamed from: a */
    public final ViewGroup f46087a;

    /* renamed from: b */
    public final View f46088b;

    /* renamed from: c */
    public final View f46089c;

    /* renamed from: d */
    public final List f46090d;

    public sx8(ViewGroup viewGroup, View view, View view2, List list) {
        sq8.m48649h(viewGroup, "itemView");
        sq8.m48649h(list, "weekHolders");
        this.f46087a = viewGroup;
        this.f46088b = view;
        this.f46089c = view2;
        this.f46090d = list;
    }

    /* renamed from: a */
    public final View m49072a() {
        return this.f46089c;
    }

    /* renamed from: b */
    public final View m49073b() {
        return this.f46088b;
    }

    /* renamed from: c */
    public final ViewGroup m49074c() {
        return this.f46087a;
    }

    /* renamed from: d */
    public final List m49075d() {
        return this.f46090d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx8)) {
            return false;
        }
        sx8 sx8Var = (sx8) obj;
        return sq8.m48644c(this.f46087a, sx8Var.f46087a) && sq8.m48644c(this.f46088b, sx8Var.f46088b) && sq8.m48644c(this.f46089c, sx8Var.f46089c) && sq8.m48644c(this.f46090d, sx8Var.f46090d);
    }

    public int hashCode() {
        int iHashCode = this.f46087a.hashCode() * 31;
        View view = this.f46088b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f46089c;
        return ((iHashCode2 + (view2 != null ? view2.hashCode() : 0)) * 31) + this.f46090d.hashCode();
    }

    public String toString() {
        return "ItemContent(itemView=" + this.f46087a + ", headerView=" + this.f46088b + ", footerView=" + this.f46089c + ", weekHolders=" + this.f46090d + ")";
    }
}
