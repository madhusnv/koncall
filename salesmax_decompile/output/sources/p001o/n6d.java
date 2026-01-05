package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n6d implements ueb {

    /* renamed from: a */
    public final oo0 f36448a = new oo0();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.n6d$a */
    public static final class EnumC15515a {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC15515a[] $VALUES;
        public static final EnumC15515a Before = new EnumC15515a("Before", 0);
        public static final EnumC15515a After = new EnumC15515a("After", 1);

        private static final /* synthetic */ EnumC15515a[] $values() {
            return new EnumC15515a[]{Before, After};
        }

        static {
            EnumC15515a[] enumC15515aArr$values = $values();
            $VALUES = enumC15515aArr$values;
            $ENTRIES = hi6.m30609a(enumC15515aArr$values);
        }

        private EnumC15515a(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC15515a valueOf(String str) {
            return (EnumC15515a) Enum.valueOf(EnumC15515a.class, str);
        }

        public static EnumC15515a[] values() {
            return (EnumC15515a[]) $VALUES.clone();
        }
    }

    /* renamed from: o.n6d$b */
    public /* synthetic */ class C15516b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36449a;

        static {
            int[] iArr = new int[EnumC15515a.values().length];
            try {
                iArr[EnumC15515a.Before.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15515a.After.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36449a = iArr;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m40146f(n6d n6dVar, ueb uebVar, EnumC15515a enumC15515a, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC15515a = EnumC15515a.After;
        }
        n6dVar.m40149d(uebVar, enumC15515a);
    }

    /* renamed from: g */
    public static /* synthetic */ void m40147g(n6d n6dVar, jlb jlbVar, EnumC15515a enumC15515a, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC15515a = EnumC15515a.After;
        }
        n6dVar.m40150e(jlbVar, enumC15515a);
    }

    @Override // p001o.ueb
    /* renamed from: b */
    public Object mo36732b(Object obj, jw7 jw7Var, n64 n64Var) {
        if (this.f36448a.isEmpty()) {
            return jw7Var.mo21441a(obj, n64Var);
        }
        ueb[] uebVarArr = (ueb[]) this.f36448a.toArray(new ueb[0]);
        return veb.m52663a(jw7Var, (ueb[]) Arrays.copyOf(uebVarArr, uebVarArr.length)).mo21441a(obj, n64Var);
    }

    /* renamed from: c */
    public final void m40148c(EnumC15515a enumC15515a, ql7 ql7Var) {
        sq8.m48649h(enumC15515a, "order");
        sq8.m48649h(ql7Var, "interceptor");
        m40149d(new web(ql7Var), enumC15515a);
    }

    /* renamed from: d */
    public final void m40149d(ueb uebVar, EnumC15515a enumC15515a) {
        sq8.m48649h(uebVar, "middleware");
        sq8.m48649h(enumC15515a, "order");
        int i = C15516b.f36449a[enumC15515a.ordinal()];
        if (i == 1) {
            this.f36448a.m42480j(uebVar);
        } else {
            if (i != 2) {
                throw new szb();
            }
            this.f36448a.m42481o(uebVar);
        }
    }

    /* renamed from: e */
    public final void m40150e(jlb jlbVar, EnumC15515a enumC15515a) {
        sq8.m48649h(jlbVar, "transform");
        sq8.m48649h(enumC15515a, "order");
        m40149d(new llb(jlbVar), enumC15515a);
    }
}
