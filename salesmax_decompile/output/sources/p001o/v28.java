package p001o;

import p001o.n28;
import p001o.v28;
import p001o.x18;

/* loaded from: classes3.dex */
public final class v28 implements n28 {

    /* renamed from: a */
    public final t18 f49803a;

    /* renamed from: o.v28$a */
    public static final class C17502a implements n28.InterfaceC15480a {

        /* renamed from: a */
        public xk7 f49804a = new xk7() { // from class: o.o28
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return v28.C17502a.m52296n((x18.InterfaceC18030a) obj);
            }
        };

        /* renamed from: b */
        public xk7 f49805b = b.f49810a;

        /* renamed from: c */
        public uk7 f49806c = new uk7() { // from class: o.p28
            @Override // p001o.uk7
            public final Object invoke() {
                return v28.C17502a.m52297o(this.f39207a);
            }
        };

        /* renamed from: d */
        public EnumC17503b f49807d = EnumC17503b.NOT_INITIALIZED;

        /* renamed from: e */
        public t18 f49808e;

        /* renamed from: o.v28$a$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f49809a;

            static {
                int[] iArr = new int[EnumC17503b.values().length];
                try {
                    iArr[EnumC17503b.NOT_INITIALIZED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17503b.EXPLICIT_ENGINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f49809a = iArr;
            }
        }

        /* renamed from: o.v28$a$b */
        public /* synthetic */ class b extends dm7 implements xk7 {

            /* renamed from: a */
            public static final b f49810a = new b();

            public b() {
                super(1, ne5.class, "DefaultHttpEngine", "DefaultHttpEngine(Lkotlin/jvm/functions/Function1;)Laws/smithy/kotlin/runtime/http/engine/CloseableHttpClientEngine;", 1);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sb3 invoke(xk7 xk7Var) {
                return ne5.m40413a(xk7Var);
            }
        }

        /* renamed from: o.v28$a$c */
        public /* synthetic */ class c extends dm7 implements xk7 {

            /* renamed from: a */
            public static final c f49811a = new c();

            public c() {
                super(1, ne5.class, "DefaultHttpEngine", "DefaultHttpEngine(Lkotlin/jvm/functions/Function1;)Laws/smithy/kotlin/runtime/http/engine/CloseableHttpClientEngine;", 1);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sb3 invoke(xk7 xk7Var) {
                return ne5.m40413a(xk7Var);
            }
        }

        /* renamed from: i */
        public static final t18 m52292i(C17502a c17502a) {
            return wpa.m54798a((t18) c17502a.f49805b.invoke(new xk7() { // from class: o.t28
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return v28.C17502a.m52293j((x18.InterfaceC18030a) obj);
                }
            }));
        }

        /* renamed from: j */
        public static final y3i m52293j(x18.InterfaceC18030a interfaceC18030a) {
            sq8.m48649h(interfaceC18030a, "$this$engineConstructor");
            return y3i.f54824a;
        }

        /* renamed from: k */
        public static final t18 m52294k(t18 t18Var) {
            return t18Var;
        }

        /* renamed from: l */
        public static final y3i m52295l(x18.InterfaceC18030a interfaceC18030a) {
            sq8.m48649h(interfaceC18030a, "<this>");
            return y3i.f54824a;
        }

        /* renamed from: n */
        public static final y3i m52296n(x18.InterfaceC18030a interfaceC18030a) {
            sq8.m48649h(interfaceC18030a, "<this>");
            return y3i.f54824a;
        }

        /* renamed from: o */
        public static final t18 m52297o(C17502a c17502a) {
            return wpa.m54798a((t18) c17502a.f49805b.invoke(new xk7() { // from class: o.u28
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return v28.C17502a.m52298p((x18.InterfaceC18030a) obj);
                }
            }));
        }

        /* renamed from: p */
        public static final y3i m52298p(x18.InterfaceC18030a interfaceC18030a) {
            sq8.m48649h(interfaceC18030a, "$this$engineConstructor");
            return y3i.f54824a;
        }

        @Override // p001o.n28.InterfaceC15480a
        /* renamed from: b */
        public void mo20126b(final t18 t18Var) {
            uk7 uk7Var;
            xk7 xk7VarMo38632a;
            x18 config;
            this.f49807d = a.f49809a[this.f49807d.ordinal()] == 1 ? EnumC17503b.INITIALIZED : EnumC17503b.EXPLICIT_ENGINE;
            this.f49808e = t18Var;
            if (t18Var == null) {
                this.f49805b = c.f49811a;
                uk7Var = new uk7() { // from class: o.q28
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return v28.C17502a.m52292i(this.f41172a);
                    }
                };
            } else {
                uk7Var = new uk7() { // from class: o.r28
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return v28.C17502a.m52294k(t18Var);
                    }
                };
            }
            this.f49806c = uk7Var;
            if (t18Var == null || (config = t18Var.getConfig()) == null || (xk7VarMo38632a = config.mo38632a()) == null) {
                xk7VarMo38632a = new xk7() { // from class: o.s28
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return v28.C17502a.m52295l((x18.InterfaceC18030a) obj);
                    }
                };
            }
            this.f49804a = xk7VarMo38632a;
        }

        /* renamed from: m */
        public n28 m52299m() {
            return new v28((t18) this.f49806c.invoke(), null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.v28$b */
    public static final class EnumC17503b {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC17503b[] $VALUES;
        public static final EnumC17503b NOT_INITIALIZED = new EnumC17503b("NOT_INITIALIZED", 0);
        public static final EnumC17503b INITIALIZED = new EnumC17503b("INITIALIZED", 1);
        public static final EnumC17503b EXPLICIT_CONFIG = new EnumC17503b("EXPLICIT_CONFIG", 2);
        public static final EnumC17503b EXPLICIT_ENGINE = new EnumC17503b("EXPLICIT_ENGINE", 3);

        private static final /* synthetic */ EnumC17503b[] $values() {
            return new EnumC17503b[]{NOT_INITIALIZED, INITIALIZED, EXPLICIT_CONFIG, EXPLICIT_ENGINE};
        }

        static {
            EnumC17503b[] enumC17503bArr$values = $values();
            $VALUES = enumC17503bArr$values;
            $ENTRIES = hi6.m30609a(enumC17503bArr$values);
        }

        private EnumC17503b(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC17503b valueOf(String str) {
            return (EnumC17503b) Enum.valueOf(EnumC17503b.class, str);
        }

        public static EnumC17503b[] values() {
            return (EnumC17503b[]) $VALUES.clone();
        }
    }

    public /* synthetic */ v28(t18 t18Var, id5 id5Var) {
        this(t18Var);
    }

    @Override // p001o.n28
    /* renamed from: b */
    public t18 mo20110b() {
        return this.f49803a;
    }

    public v28(t18 t18Var) {
        this.f49803a = t18Var;
    }
}
