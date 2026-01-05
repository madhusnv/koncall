package p001o;

import com.google.android.gms.cast.MediaStatus;

/* loaded from: classes3.dex */
public abstract class z6f {

    /* renamed from: o.z6f$a */
    public static final class C18561a extends jgg implements nl7 {

        /* renamed from: a */
        public Object f56595a;

        /* renamed from: b */
        public long f56596b;

        /* renamed from: c */
        public int f56597c;

        /* renamed from: d */
        public final /* synthetic */ f8f f56598d;

        /* renamed from: e */
        public final /* synthetic */ y6f f56599e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18561a(f8f f8fVar, y6f y6fVar, n64 n64Var) {
            super(2, n64Var);
            this.f56598d = f8fVar;
            this.f56599e = y6fVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C18561a(this.f56598d, this.f56599e, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:13:0x0049). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            u6f u6fVarM38492a;
            C18561a c18561a;
            Object obj2;
            Object objM51918f = uq8.m51918f();
            int i = this.f56597c;
            if (i == 0) {
                wre.m54934b(obj);
                j = 0;
                u6fVarM38492a = m7f.m38492a(this.f56598d);
                c18561a = this;
                y6f y6fVar = c18561a.f56599e;
                t6f buffer = u6fVarM38492a.getBuffer();
                c18561a.f56595a = u6fVarM38492a;
                c18561a.f56596b = j;
                c18561a.f56597c = 1;
                obj2 = y6fVar.read(buffer, MediaStatus.COMMAND_LIKE, c18561a);
                if (obj2 != objM51918f) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = this.f56596b;
                u6f u6fVar = (u6f) this.f56595a;
                wre.m54934b(obj);
                long j3 = j2;
                u6f u6fVar2 = u6fVar;
                Object obj3 = objM51918f;
                C18561a c18561a2 = this;
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue == -1) {
                    u6fVar2.mo49488b();
                    c18561a = c18561a2;
                    objM51918f = obj3;
                    u6fVarM38492a = u6fVar2;
                    j = j3 + jLongValue;
                    y6f y6fVar2 = c18561a.f56599e;
                    t6f buffer2 = u6fVarM38492a.getBuffer();
                    c18561a.f56595a = u6fVarM38492a;
                    c18561a.f56596b = j;
                    c18561a.f56597c = 1;
                    obj2 = y6fVar2.read(buffer2, MediaStatus.COMMAND_LIKE, c18561a);
                    if (obj2 != objM51918f) {
                        return objM51918f;
                    }
                    Object obj4 = objM51918f;
                    c18561a2 = c18561a;
                    obj = obj2;
                    j3 = j;
                    u6fVar2 = u6fVarM38492a;
                    obj3 = obj4;
                    long jLongValue2 = ((Number) obj).longValue();
                    if (jLongValue2 == -1) {
                        u6fVar2.mo49488b();
                        return ml1.m39305e(j3);
                    }
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C18561a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.z6f$b */
    public static final class C18562b extends o64 {

        /* renamed from: a */
        public Object f56600a;

        /* renamed from: b */
        public Object f56601b;

        /* renamed from: c */
        public /* synthetic */ Object f56602c;

        /* renamed from: d */
        public int f56603d;

        public C18562b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f56602c = obj;
            this.f56603d |= Integer.MIN_VALUE;
            return z6f.m58852b(null, null, this);
        }
    }

    /* renamed from: o.z6f$c */
    public static final class C18563c extends o64 {

        /* renamed from: a */
        public Object f56604a;

        /* renamed from: b */
        public /* synthetic */ Object f56605b;

        /* renamed from: c */
        public int f56606c;

        public C18563c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f56605b = obj;
            this.f56606c |= Integer.MIN_VALUE;
            return z6f.m58853c(null, this);
        }
    }

    /* renamed from: a */
    public static final Object m58851a(y6f y6fVar, f8f f8fVar, n64 n64Var) {
        return pm1.m43867g(g7f.f24695a.m28153a(), new C18561a(f8fVar, y6fVar, null), n64Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m58852b(p001o.y6f r7, p001o.t6f r8, p001o.n64 r9) {
        /*
            boolean r0 = r9 instanceof p001o.z6f.C18562b
            if (r0 == 0) goto L13
            r0 = r9
            o.z6f$b r0 = (p001o.z6f.C18562b) r0
            int r1 = r0.f56603d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56603d = r1
            goto L18
        L13:
            o.z6f$b r0 = new o.z6f$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f56602c
            java.lang.Object r1 = p001o.uq8.m51918f()
            int r2 = r0.f56603d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f56601b
            o.t6f r7 = (p001o.t6f) r7
            java.lang.Object r8 = r0.f56600a
            o.y6f r8 = (p001o.y6f) r8
            p001o.wre.m54934b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L51
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            p001o.wre.m54934b(r9)
        L3f:
            r0.f56600a = r7
            r0.f56601b = r8
            r0.f56603d = r3
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = r7.read(r8, r4, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            boolean r9 = r7.isClosedForRead()
            if (r9 == 0) goto L3f
            o.y3i r7 = p001o.y3i.f54824a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p001o.z6f.m58852b(o.y6f, o.t6f, o.n64):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m58853c(y6f y6fVar, n64 n64Var) {
        C18563c c18563c;
        if (n64Var instanceof C18563c) {
            c18563c = (C18563c) n64Var;
            int i = c18563c.f56606c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18563c.f56606c = i - Integer.MIN_VALUE;
            } else {
                c18563c = new C18563c(n64Var);
            }
        }
        Object obj = c18563c.f56605b;
        Object objM51918f = uq8.m51918f();
        int i2 = c18563c.f56606c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t6f t6fVar = (t6f) c18563c.f56604a;
            wre.m54934b(obj);
            return t6fVar;
        }
        wre.m54934b(obj);
        t6f t6fVar2 = new t6f();
        c18563c.f56604a = t6fVar2;
        c18563c.f56606c = 1;
        return m58852b(y6fVar, t6fVar2, c18563c) == objM51918f ? objM51918f : t6fVar2;
    }
}
