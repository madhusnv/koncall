package p001o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class hoe extends pd4 {

    /* renamed from: q */
    public int f27256q;

    /* renamed from: s */
    public int f27257s;

    /* renamed from: x */
    public LayoutInflater f27258x;

    public hoe(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f27257s = i;
        this.f27256q = i;
        this.f27258x = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p001o.pd4
    /* renamed from: g */
    public View mo30887g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f27258x.inflate(this.f27257s, viewGroup, false);
    }

    @Override // p001o.pd4
    /* renamed from: h */
    public View mo20861h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f27258x.inflate(this.f27256q, viewGroup, false);
    }
}
