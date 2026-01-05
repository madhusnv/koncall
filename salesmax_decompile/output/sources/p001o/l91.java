package p001o;

import android.window.BackEvent;

/* loaded from: classes2.dex */
public final class l91 {

    /* renamed from: e */
    public static final C15039a f33490e = new C15039a(null);

    /* renamed from: a */
    public final float f33491a;

    /* renamed from: b */
    public final float f33492b;

    /* renamed from: c */
    public final float f33493c;

    /* renamed from: d */
    public final int f33494d;

    /* renamed from: o.l91$a */
    public static final class C15039a {
        public C15039a() {
        }

        public /* synthetic */ C15039a(id5 id5Var) {
            this();
        }
    }

    public l91(float f, float f2, float f3, int i) {
        this.f33491a = f;
        this.f33492b = f2;
        this.f33493c = f3;
        this.f33494d = i;
    }

    /* renamed from: a */
    public final float m36806a() {
        return this.f33493c;
    }

    /* renamed from: b */
    public final int m36807b() {
        return this.f33494d;
    }

    /* renamed from: c */
    public final float m36808c() {
        return this.f33492b;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f33491a + ", touchY=" + this.f33492b + ", progress=" + this.f33493c + ", swipeEdge=" + this.f33494d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l91(BackEvent backEvent) {
        sq8.m48649h(backEvent, "backEvent");
        zh0 zh0Var = zh0.f57186a;
        this(zh0Var.m59394d(backEvent), zh0Var.m59395e(backEvent), zh0Var.m59392b(backEvent), zh0Var.m59393c(backEvent));
    }
}
