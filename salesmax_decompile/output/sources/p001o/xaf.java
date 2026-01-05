package p001o;

/* loaded from: classes2.dex */
public abstract class xaf {

    /* renamed from: o.xaf$a */
    public /* synthetic */ class C18096a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53436a;

        static {
            int[] iArr = new int[waf.values().length];
            try {
                iArr[waf.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[waf.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[waf.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53436a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m55917a(waf wafVar, boolean z) {
        sq8.m48649h(wafVar, "<this>");
        int i = C18096a.f53436a[wafVar.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new szb();
    }
}
