package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes2.dex */
public class C2405k {

    /* renamed from: b */
    public int f10163b;

    /* renamed from: c */
    public int f10164c;

    /* renamed from: d */
    public int f10165d;

    /* renamed from: e */
    public int f10166e;

    /* renamed from: h */
    public boolean f10169h;

    /* renamed from: i */
    public boolean f10170i;

    /* renamed from: a */
    public boolean f10162a = true;

    /* renamed from: f */
    public int f10167f = 0;

    /* renamed from: g */
    public int f10168g = 0;

    /* renamed from: a */
    public boolean m9605a(RecyclerView.C2389z c2389z) {
        int i = this.f10164c;
        return i >= 0 && i < c2389z.m9344b();
    }

    /* renamed from: b */
    public View m9606b(RecyclerView.C2385v c2385v) {
        View viewM9307o = c2385v.m9307o(this.f10164c);
        this.f10164c += this.f10165d;
        return viewM9307o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f10163b + ", mCurrentPosition=" + this.f10164c + ", mItemDirection=" + this.f10165d + ", mLayoutDirection=" + this.f10166e + ", mStartLine=" + this.f10167f + ", mEndLine=" + this.f10168g + '}';
    }
}
