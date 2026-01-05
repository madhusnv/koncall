package p001o;

/* loaded from: classes3.dex */
public abstract class vvf {

    /* renamed from: o.vvf$a */
    public /* synthetic */ class C17681a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50930a;

        static {
            int[] iArr = new int[fja.values().length];
            try {
                iArr[fja.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fja.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fja.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fja.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fja.Trace.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f50930a = iArr;
        }
    }

    /* renamed from: b */
    public static final wba m53487b(fja fjaVar) {
        int i = C17681a.f50930a[fjaVar.ordinal()];
        if (i == 1) {
            return wba.ERROR;
        }
        if (i == 2) {
            return wba.WARN;
        }
        if (i == 3) {
            return wba.INFO;
        }
        if (i == 4) {
            return wba.DEBUG;
        }
        if (i == 5) {
            return wba.TRACE;
        }
        throw new szb();
    }
}
