package p001o;

/* loaded from: classes6.dex */
public abstract class si9 {

    /* renamed from: o.si9$a */
    public /* synthetic */ class C16848a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45455a;

        static {
            int[] iArr = new int[cj9.values().length];
            try {
                iArr[cj9.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cj9.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cj9.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45455a = iArr;
        }
    }

    /* renamed from: a */
    public static final gi9 m48360a(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "initializer");
        return new ghg(uk7Var, null, 2, null);
    }

    /* renamed from: b */
    public static final gi9 m48361b(cj9 cj9Var, uk7 uk7Var) {
        sq8.m48649h(cj9Var, "mode");
        sq8.m48649h(uk7Var, "initializer");
        int i = C16848a.f45455a[cj9Var.ordinal()];
        if (i == 1) {
            return new ghg(uk7Var, null, 2, null);
        }
        if (i == 2) {
            return new f0f(uk7Var);
        }
        if (i == 3) {
            return new y4i(uk7Var);
        }
        throw new szb();
    }
}
