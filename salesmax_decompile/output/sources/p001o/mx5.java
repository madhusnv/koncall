package p001o;

/* loaded from: classes5.dex */
public abstract class mx5 {

    /* renamed from: a */
    public static final mx5 f36063a = new C15440a();

    /* renamed from: b */
    public static final mx5 f36064b = new C15441b();

    /* renamed from: c */
    public static final mx5 f36065c = new C15444e();

    /* renamed from: d */
    public static final mx5 f36066d = new C15442c();

    /* renamed from: e */
    public static final mx5 f36067e;

    /* renamed from: f */
    public static final mx5 f36068f;

    /* renamed from: g */
    public static final mx5 f36069g;

    /* renamed from: h */
    public static final mec f36070h;

    /* renamed from: i */
    public static final boolean f36071i;

    /* renamed from: o.mx5$a */
    public static class C15440a extends mx5 {
        @Override // p001o.mx5
        /* renamed from: a */
        public EnumC15446g mo39754a(int i, int i2, int i3, int i4) {
            return EnumC15446g.QUALITY;
        }

        @Override // p001o.mx5
        /* renamed from: b */
        public float mo39755b(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: o.mx5$b */
    public static class C15441b extends mx5 {
        @Override // p001o.mx5
        /* renamed from: a */
        public EnumC15446g mo39754a(int i, int i2, int i3, int i4) {
            return EnumC15446g.MEMORY;
        }

        @Override // p001o.mx5
        /* renamed from: b */
        public float mo39755b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* renamed from: o.mx5$c */
    public static class C15442c extends mx5 {
        @Override // p001o.mx5
        /* renamed from: a */
        public EnumC15446g mo39754a(int i, int i2, int i3, int i4) {
            return mo39755b(i, i2, i3, i4) == 1.0f ? EnumC15446g.QUALITY : mx5.f36065c.mo39754a(i, i2, i3, i4);
        }

        @Override // p001o.mx5
        /* renamed from: b */
        public float mo39755b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, mx5.f36065c.mo39755b(i, i2, i3, i4));
        }
    }

    /* renamed from: o.mx5$d */
    public static class C15443d extends mx5 {
        @Override // p001o.mx5
        /* renamed from: a */
        public EnumC15446g mo39754a(int i, int i2, int i3, int i4) {
            return EnumC15446g.QUALITY;
        }

        @Override // p001o.mx5
        /* renamed from: b */
        public float mo39755b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* renamed from: o.mx5$e */
    public static class C15444e extends mx5 {
        @Override // p001o.mx5
        /* renamed from: a */
        public EnumC15446g mo39754a(int i, int i2, int i3, int i4) {
            return mx5.f36071i ? EnumC15446g.QUALITY : EnumC15446g.MEMORY;
        }

        @Override // p001o.mx5
        /* renamed from: b */
        public float mo39755b(int i, int i2, int i3, int i4) {
            if (mx5.f36071i) {
                return Math.min(i3 / i, i4 / i2);
            }
            if (Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: o.mx5$f */
    public static class C15445f extends mx5 {
        @Override // p001o.mx5
        /* renamed from: a */
        public EnumC15446g mo39754a(int i, int i2, int i3, int i4) {
            return EnumC15446g.QUALITY;
        }

        @Override // p001o.mx5
        /* renamed from: b */
        public float mo39755b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: o.mx5$g */
    public enum EnumC15446g {
        MEMORY,
        QUALITY
    }

    static {
        C15443d c15443d = new C15443d();
        f36067e = c15443d;
        f36068f = new C15445f();
        f36069g = c15443d;
        f36070h = mec.m38833f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c15443d);
        f36071i = true;
    }

    /* renamed from: a */
    public abstract EnumC15446g mo39754a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo39755b(int i, int i2, int i3, int i4);
}
