package p001o;

/* loaded from: classes3.dex */
public interface sn8 {

    /* renamed from: o.sn8$a */
    public static final class C16877a {
        /* renamed from: a */
        public static Object m48563a(sn8 sn8Var, ere ereVar, n64 n64Var) {
            return ereVar.mo25521e();
        }

        /* renamed from: b */
        public static Object m48564b(sn8 sn8Var, ere ereVar, n64 n64Var) {
            return ereVar.mo25521e();
        }

        /* renamed from: c */
        public static Object m48565c(sn8 sn8Var, e2e e2eVar, n64 n64Var) {
            return e2eVar.mo24161d();
        }

        /* renamed from: d */
        public static Object m48566d(sn8 sn8Var, c2e c2eVar, n64 n64Var) {
            return c2eVar.mo20099c();
        }

        /* renamed from: e */
        public static Object m48567e(sn8 sn8Var, eme emeVar, n64 n64Var) {
            return emeVar.mo25340a();
        }

        /* renamed from: f */
        public static Object m48568f(sn8 sn8Var, c2e c2eVar, n64 n64Var) {
            return c2eVar.mo20099c();
        }

        /* renamed from: g */
        public static Object m48569g(sn8 sn8Var, c2e c2eVar, n64 n64Var) {
            return c2eVar.mo20099c();
        }

        /* renamed from: h */
        public static void m48570h(sn8 sn8Var, ere ereVar) {
            sq8.m48649h(ereVar, "context");
        }

        /* renamed from: i */
        public static void m48571i(sn8 sn8Var, ere ereVar) {
            sq8.m48649h(ereVar, "context");
        }

        /* renamed from: j */
        public static void m48572j(sn8 sn8Var, ere ereVar) {
            sq8.m48649h(ereVar, "context");
        }

        /* renamed from: k */
        public static void m48573k(sn8 sn8Var, c2e c2eVar) {
            sq8.m48649h(c2eVar, "context");
        }

        /* renamed from: l */
        public static void m48574l(sn8 sn8Var, c2e c2eVar) {
            sq8.m48649h(c2eVar, "context");
        }

        /* renamed from: m */
        public static void m48575m(sn8 sn8Var, e2e e2eVar) {
            sq8.m48649h(e2eVar, "context");
        }

        /* renamed from: n */
        public static void m48576n(sn8 sn8Var, c2e c2eVar) {
            sq8.m48649h(c2eVar, "context");
        }

        /* renamed from: o */
        public static void m48577o(sn8 sn8Var, e2e e2eVar) {
            sq8.m48649h(e2eVar, "context");
        }

        /* renamed from: p */
        public static void m48578p(sn8 sn8Var, eme emeVar) {
            sq8.m48649h(emeVar, "context");
        }

        /* renamed from: q */
        public static void m48579q(sn8 sn8Var, eme emeVar) {
            sq8.m48649h(emeVar, "context");
        }

        /* renamed from: r */
        public static void m48580r(sn8 sn8Var, c2e c2eVar) {
            sq8.m48649h(c2eVar, "context");
        }

        /* renamed from: s */
        public static void m48581s(sn8 sn8Var, c2e c2eVar) {
            sq8.m48649h(c2eVar, "context");
        }
    }

    /* renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    Object mo68712modifyBeforeAttemptCompletiongIAlus(ere ereVar, n64 n64Var);

    /* renamed from: modifyBeforeCompletion-gIAlu-s */
    Object mo68713modifyBeforeCompletiongIAlus(ere ereVar, n64 n64Var);

    Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var);

    Object modifyBeforeRetryLoop(c2e c2eVar, n64 n64Var);

    Object modifyBeforeSerialization(eme emeVar, n64 n64Var);

    Object modifyBeforeSigning(c2e c2eVar, n64 n64Var);

    Object modifyBeforeTransmit(c2e c2eVar, n64 n64Var);

    void readAfterAttempt(ere ereVar);

    void readAfterDeserialization(ere ereVar);

    void readAfterExecution(ere ereVar);

    void readAfterSerialization(c2e c2eVar);

    void readAfterSigning(c2e c2eVar);

    void readAfterTransmit(e2e e2eVar);

    void readBeforeAttempt(c2e c2eVar);

    void readBeforeDeserialization(e2e e2eVar);

    void readBeforeExecution(eme emeVar);

    void readBeforeSerialization(eme emeVar);

    void readBeforeSigning(c2e c2eVar);

    void readBeforeTransmit(c2e c2eVar);
}
