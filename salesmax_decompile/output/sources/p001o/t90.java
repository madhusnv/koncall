package p001o;

/* loaded from: classes2.dex */
public abstract class t90 {

    /* renamed from: a */
    public static final v08 f46642a = new v08(C17030a.f46644a);

    /* renamed from: b */
    public static final v08 f46643b = new v08(C17031b.f46645a);

    /* renamed from: o.t90$a */
    public /* synthetic */ class C17030a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17030a f46644a = new C17030a();

        public C17030a() {
            super(2, jza.class, "min", "min(II)I", 1);
        }

        /* renamed from: b */
        public final Integer m49570b(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m49570b(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.t90$b */
    public /* synthetic */ class C17031b extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17031b f46645a = new C17031b();

        public C17031b() {
            super(2, jza.class, "max", "max(II)I", 1);
        }

        /* renamed from: b */
        public final Integer m49571b(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m49571b(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* renamed from: a */
    public static final int m49569a(s90 s90Var, int i, int i2) {
        sq8.m48649h(s90Var, "<this>");
        return ((Number) s90Var.m48030a().invoke(Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }
}
