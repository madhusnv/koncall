package p001o;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class ll1 {

    /* renamed from: a */
    public final int f33991a;

    /* renamed from: b */
    public final int f33992b;

    /* renamed from: c */
    public final int f33993c;

    /* renamed from: d */
    public final int f33994d;

    public ll1(int i, int i2, int i3, int i4) {
        this.f33991a = i;
        this.f33992b = i2;
        this.f33993c = i3;
        this.f33994d = i4;
    }

    /* renamed from: a */
    public final int m37415a() {
        return this.f33994d - this.f33992b;
    }

    /* renamed from: b */
    public final int m37416b() {
        return this.f33991a;
    }

    /* renamed from: c */
    public final int m37417c() {
        return this.f33992b;
    }

    /* renamed from: d */
    public final int m37418d() {
        return this.f33993c - this.f33991a;
    }

    /* renamed from: e */
    public final boolean m37419e() {
        return m37415a() == 0 && m37418d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(ll1.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        ll1 ll1Var = (ll1) obj;
        return this.f33991a == ll1Var.f33991a && this.f33992b == ll1Var.f33992b && this.f33993c == ll1Var.f33993c && this.f33994d == ll1Var.f33994d;
    }

    /* renamed from: f */
    public final Rect m37420f() {
        return new Rect(this.f33991a, this.f33992b, this.f33993c, this.f33994d);
    }

    public int hashCode() {
        return (((((this.f33991a * 31) + this.f33992b) * 31) + this.f33993c) * 31) + this.f33994d;
    }

    public String toString() {
        return ((Object) ll1.class.getSimpleName()) + " { [" + this.f33991a + ',' + this.f33992b + ',' + this.f33993c + ',' + this.f33994d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ll1(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        sq8.m48649h(rect, "rect");
    }
}
