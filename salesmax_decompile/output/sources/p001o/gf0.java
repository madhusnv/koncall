package p001o;

/* loaded from: classes2.dex */
public final class gf0 implements qcd {

    /* renamed from: b */
    public final int f25055b;

    public gf0(int i) {
        this.f25055b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(gf0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f25055b == ((gf0) obj).f25055b;
    }

    public int hashCode() {
        return this.f25055b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f25055b + ')';
    }
}
