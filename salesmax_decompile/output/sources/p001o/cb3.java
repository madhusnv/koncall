package p001o;

import p001o.gja;

/* loaded from: classes3.dex */
public final class cb3 {

    /* renamed from: a */
    public static final cb3 f17670a = new cb3();

    /* renamed from: b */
    public static final zi6 f17671b = (zi6) bj6.m19234c().invoke("sdk.maxAttempts", "SDK_MAX_ATTEMPTS");

    /* renamed from: c */
    public static final zi6 f17672c = new zi6(C12602b.f17675a, "SDK_MIN_TLS", "sdk.minTls", null, 8, null);

    /* renamed from: d */
    public static final zi6 f17673d = new zi6(C12603c.f17676a, "sdk.retryMode", "SDK_RETRY_MODE", null, 8, null);

    /* renamed from: e */
    public static final zi6 f17674e = new zi6(new C12601a(gja.f25330b), "sdk.logMode", "SDK_LOG_MODE", gja.C13753c.f25332c);

    /* renamed from: o.cb3$a */
    public /* synthetic */ class C12601a extends dm7 implements xk7 {
        public C12601a(Object obj) {
            super(1, obj, gja.C13751a.class, "fromString", "fromString(Ljava/lang/String;)Laws/smithy/kotlin/runtime/client/LogMode;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gja invoke(String str) {
            sq8.m48649h(str, "p0");
            return ((gja.C13751a) this.receiver).m28863b(str);
        }
    }

    /* renamed from: o.cb3$b */
    public static final class C12602b implements xk7 {

        /* renamed from: a */
        public static final C12602b f17675a = new C12602b();

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Enum invoke(String str) {
            enh enhVar;
            sq8.m48649h(str, "strValue");
            enh[] enhVarArrValues = enh.values();
            int length = enhVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enhVar = null;
                    break;
                }
                enhVar = enhVarArrValues[i];
                if (e9g.m24606x(enhVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (enhVar != null) {
                return enhVar;
            }
            throw new xa3("Value " + str + " is not supported, should be one of " + gp0.r0(enhVarArrValues, ", ", null, null, 0, null, null, 62, null));
        }
    }

    /* renamed from: o.cb3$c */
    public static final class C12603c implements xk7 {

        /* renamed from: a */
        public static final C12603c f17676a = new C12603c();

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Enum invoke(String str) {
            qse qseVar;
            sq8.m48649h(str, "strValue");
            qse[] qseVarArrValues = qse.values();
            int length = qseVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    qseVar = null;
                    break;
                }
                qseVar = qseVarArrValues[i];
                if (e9g.m24606x(qseVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (qseVar != null) {
                return qseVar;
            }
            throw new xa3("Value " + str + " is not supported, should be one of " + gp0.r0(qseVarArrValues, ", ", null, null, 0, null, null, 62, null));
        }
    }

    /* renamed from: a */
    public final zi6 m20638a() {
        return f17674e;
    }

    /* renamed from: b */
    public final zi6 m20639b() {
        return f17672c;
    }
}
