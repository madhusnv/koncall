package p001o;

/* loaded from: classes2.dex */
public abstract class sv {

    /* renamed from: b */
    public static final C16923d f45989b = new C16923d(null);

    /* renamed from: c */
    public static final sv f45990c = new C16920a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d */
    public static final sv f45991d = new C16922c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e */
    public static final sv f45992e = new C16921b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a */
    public final float[] f45993a;

    /* renamed from: o.sv$a */
    public static final class C16920a extends sv {
        public C16920a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* renamed from: o.sv$b */
    public static final class C16921b extends sv {
        public C16921b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* renamed from: o.sv$c */
    public static final class C16922c extends sv {
        public C16922c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* renamed from: o.sv$d */
    public static final class C16923d {
        public C16923d() {
        }

        public /* synthetic */ C16923d(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final sv m48954a() {
            return sv.f45990c;
        }
    }

    public /* synthetic */ sv(float[] fArr, id5 id5Var) {
        this(fArr);
    }

    /* renamed from: b */
    public final float[] m48953b() {
        return this.f45993a;
    }

    public sv(float[] fArr) {
        this.f45993a = fArr;
    }
}
