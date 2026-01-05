package p001o;

/* loaded from: classes2.dex */
public class uj7 {

    /* renamed from: a */
    public final ph3 f48984a;

    /* renamed from: b */
    public final int f48985b;

    /* renamed from: c */
    public final int f48986c;

    /* renamed from: d */
    public final float f48987d;

    /* renamed from: e */
    public final long f48988e;

    /* renamed from: o.uj7$b */
    public static final class C17385b {

        /* renamed from: a */
        public ph3 f48989a;

        /* renamed from: b */
        public int f48990b;

        /* renamed from: c */
        public int f48991c;

        /* renamed from: d */
        public float f48992d = 1.0f;

        /* renamed from: e */
        public long f48993e;

        public C17385b(ph3 ph3Var, int i, int i2) {
            this.f48989a = ph3Var;
            this.f48990b = i;
            this.f48991c = i2;
        }

        /* renamed from: a */
        public uj7 m51648a() {
            return new uj7(this.f48989a, this.f48990b, this.f48991c, this.f48992d, this.f48993e);
        }

        /* renamed from: b */
        public C17385b m51649b(float f) {
            this.f48992d = f;
            return this;
        }
    }

    public uj7(ph3 ph3Var, int i, int i2, float f, long j) {
        op0.m42512b(i > 0, "width must be positive, but is: " + i);
        op0.m42512b(i2 > 0, "height must be positive, but is: " + i2);
        this.f48984a = ph3Var;
        this.f48985b = i;
        this.f48986c = i2;
        this.f48987d = f;
        this.f48988e = j;
    }
}
