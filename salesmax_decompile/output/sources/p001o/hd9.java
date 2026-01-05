package p001o;

/* loaded from: classes4.dex */
public final class hd9 {

    /* renamed from: a */
    public final id9 f26680a;

    /* renamed from: o.hd9$a */
    public static /* synthetic */ class C13916a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26681a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26682b;

        static {
            int[] iArr = new int[EnumC13917b.values().length];
            f26682b = iArr;
            try {
                iArr[EnumC13917b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26682b[EnumC13917b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26682b[EnumC13917b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26682b[EnumC13917b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[kgc.values().length];
            f26681a = iArr2;
            try {
                iArr2[kgc.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26681a[kgc.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26681a[kgc.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26681a[kgc.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: o.hd9$b */
    public enum EnumC13917b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public hd9(id9 id9Var) {
        this.f26680a = id9Var;
    }

    /* renamed from: a */
    public static hd9 m30253a(String str, byte[] bArr, EnumC13917b enumC13917b) {
        return new hd9((id9) id9.m31926N().m31934u(str).m31935v(yq1.m58080j(bArr)).m31933t(m30254c(enumC13917b)).m53060i());
    }

    /* renamed from: c */
    public static kgc m30254c(EnumC13917b enumC13917b) {
        int i = C13916a.f26682b[enumC13917b.ordinal()];
        if (i == 1) {
            return kgc.TINK;
        }
        if (i == 2) {
            return kgc.LEGACY;
        }
        if (i == 3) {
            return kgc.RAW;
        }
        if (i == 4) {
            return kgc.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* renamed from: b */
    public id9 m30255b() {
        return this.f26680a;
    }
}
