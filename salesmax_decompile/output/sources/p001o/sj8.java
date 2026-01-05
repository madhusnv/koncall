package p001o;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class sj8 {

    /* renamed from: e */
    public static final sj8 f45476e = new sj8(0, 0, 0, 0);

    /* renamed from: a */
    public final int f45477a;

    /* renamed from: b */
    public final int f45478b;

    /* renamed from: c */
    public final int f45479c;

    /* renamed from: d */
    public final int f45480d;

    /* renamed from: o.sj8$a */
    public static class C16850a {
        /* renamed from: a */
        public static Insets m48378a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public sj8(int i, int i2, int i3, int i4) {
        this.f45477a = i;
        this.f45478b = i2;
        this.f45479c = i3;
        this.f45480d = i4;
    }

    /* renamed from: a */
    public static sj8 m48373a(sj8 sj8Var, sj8 sj8Var2) {
        return m48374b(Math.max(sj8Var.f45477a, sj8Var2.f45477a), Math.max(sj8Var.f45478b, sj8Var2.f45478b), Math.max(sj8Var.f45479c, sj8Var2.f45479c), Math.max(sj8Var.f45480d, sj8Var2.f45480d));
    }

    /* renamed from: b */
    public static sj8 m48374b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f45476e : new sj8(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static sj8 m48375c(Rect rect) {
        return m48374b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static sj8 m48376d(Insets insets) {
        return m48374b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m48377e() {
        return C16850a.m48378a(this.f45477a, this.f45478b, this.f45479c, this.f45480d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sj8.class != obj.getClass()) {
            return false;
        }
        sj8 sj8Var = (sj8) obj;
        return this.f45480d == sj8Var.f45480d && this.f45477a == sj8Var.f45477a && this.f45479c == sj8Var.f45479c && this.f45478b == sj8Var.f45478b;
    }

    public int hashCode() {
        return (((((this.f45477a * 31) + this.f45478b) * 31) + this.f45479c) * 31) + this.f45480d;
    }

    public String toString() {
        return "Insets{left=" + this.f45477a + ", top=" + this.f45478b + ", right=" + this.f45479c + ", bottom=" + this.f45480d + '}';
    }
}
