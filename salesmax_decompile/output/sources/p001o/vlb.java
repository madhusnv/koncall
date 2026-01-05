package p001o;

import j$.time.YearMonth;

/* loaded from: classes6.dex */
public abstract class vlb {

    /* renamed from: o.vlb$a */
    public /* synthetic */ class C17614a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50490a;

        static {
            int[] iArr = new int[d05.values().length];
            try {
                iArr[d05.InDate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d05.MonthDate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d05.OutDate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50490a = iArr;
        }
    }

    /* renamed from: a */
    public static final YearMonth m52914a(ps1 ps1Var) {
        sq8.m48649h(ps1Var, "<this>");
        int i = C17614a.f50490a[ps1Var.m44103b().ordinal()];
        if (i == 1) {
            return yp6.m58061e(yp6.m58063g(ps1Var.m44102a()));
        }
        if (i == 2) {
            return yp6.m58063g(ps1Var.m44102a());
        }
        if (i == 3) {
            return yp6.m58062f(yp6.m58063g(ps1Var.m44102a()));
        }
        throw new szb();
    }
}
