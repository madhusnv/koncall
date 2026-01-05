package p001o;

/* loaded from: classes2.dex */
public final class if1 {

    /* renamed from: b */
    public static final C14273a f28571b = new C14273a(null);

    /* renamed from: c */
    public static final float f28572c = m32000b(0.5f);

    /* renamed from: d */
    public static final float f28573d = m32000b(-0.5f);

    /* renamed from: e */
    public static final float f28574e = m32000b(0.0f);

    /* renamed from: a */
    public final float f28575a;

    /* renamed from: o.if1$a */
    public static final class C14273a {
        public C14273a() {
        }

        public /* synthetic */ C14273a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ if1(float f) {
        this.f28575a = f;
    }

    /* renamed from: a */
    public static final /* synthetic */ if1 m31999a(float f) {
        return new if1(f);
    }

    /* renamed from: b */
    public static float m32000b(float f) {
        return f;
    }

    /* renamed from: c */
    public static boolean m32001c(float f, Object obj) {
        return (obj instanceof if1) && Float.compare(f, ((if1) obj).m32004f()) == 0;
    }

    /* renamed from: d */
    public static int m32002d(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: e */
    public static String m32003e(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m32001c(this.f28575a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ float m32004f() {
        return this.f28575a;
    }

    public int hashCode() {
        return m32002d(this.f28575a);
    }

    public String toString() {
        return m32003e(this.f28575a);
    }
}
