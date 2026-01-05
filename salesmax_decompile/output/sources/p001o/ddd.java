package p001o;

/* loaded from: classes2.dex */
public final class ddd {

    /* renamed from: a */
    public final int f19615a;

    public /* synthetic */ ddd(int i) {
        this.f19615a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ ddd m22821a(int i) {
        return new ddd(i);
    }

    /* renamed from: b */
    public static int m22822b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m22823c(int i, Object obj) {
        return (obj instanceof ddd) && i == ((ddd) obj).m22826f();
    }

    /* renamed from: d */
    public static int m22824d(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: e */
    public static String m22825e(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m22823c(this.f19615a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int m22826f() {
        return this.f19615a;
    }

    public int hashCode() {
        return m22824d(this.f19615a);
    }

    public String toString() {
        return m22825e(this.f19615a);
    }
}
