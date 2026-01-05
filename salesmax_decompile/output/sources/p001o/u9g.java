package p001o;

import p001o.k16;
import p001o.kr0;
import p001o.qja;
import p001o.z9g;

/* loaded from: classes2.dex */
public final class u9g implements qc4 {

    /* renamed from: a */
    public final qc4 f48610a;

    /* renamed from: b */
    public final jr0 f48611b;

    /* renamed from: c */
    public final String f48612c;

    /* renamed from: d */
    public final t18 f48613d;

    /* renamed from: o.u9g$a */
    public static final class C17342a extends o64 {

        /* renamed from: a */
        public Object f48614a;

        /* renamed from: b */
        public Object f48615b;

        /* renamed from: c */
        public /* synthetic */ Object f48616c;

        /* renamed from: e */
        public int f48618e;

        public C17342a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f48616c = obj;
            this.f48618e |= Integer.MIN_VALUE;
            return u9g.this.resolve(null, this);
        }
    }

    public /* synthetic */ u9g(qc4 qc4Var, String str, String str2, String str3, String str4, long j, t18 t18Var, id5 id5Var) {
        this(qc4Var, str, str2, str3, str4, j, t18Var);
    }

    /* renamed from: f */
    public static final String m51259f() {
        return "retrieving assumed credentials";
    }

    /* renamed from: g */
    public static final y3i m51260g(u9g u9gVar, vdh vdhVar, qx0 qx0Var, z9g.C18593c.a aVar) {
        sq8.m48649h(aVar, "$this$fromEnvironment");
        String str = u9gVar.f48612c;
        if (str == null) {
            str = "aws-global";
        }
        aVar.mo20132h(str);
        aVar.m59033y(u9gVar.f48610a);
        aVar.mo20126b(u9gVar.f48613d);
        aVar.m59021A(vdhVar);
        aVar.mo20136l((gja) qx0Var.mo18191b(e7f.f21127a.m24496c()));
        return y3i.f54824a;
    }

    /* renamed from: h */
    public static final String m51261h() {
        return "sts refused to grant assumed role credentials";
    }

    /* renamed from: i */
    public static final String m51262i(gc4 gc4Var) {
        return "obtained assumed credentials; expiration=" + gc4Var.m28391b().m28951d(vmh.ISO_8601);
    }

    /* renamed from: e */
    public final jr0 m51263e() {
        return this.f48611b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x0031, B:36:0x010a, B:53:0x015f, B:55:0x016b, B:56:0x018e, B:57:0x018f, B:58:0x0196), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x0031, B:36:0x010a, B:53:0x015f, B:55:0x016b, B:56:0x018e, B:57:0x018f, B:58:0x0196), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v0, types: [o.qx0] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(final qx0 qx0Var, n64 n64Var) throws Throwable {
        C17342a c17342a;
        qja qjaVar;
        u9g u9gVar;
        z9g z9gVar;
        qja qjaVar2;
        Exception e;
        z9g z9gVar2;
        final gc4 gc4VarM37790b;
        String strM51942a;
        if (n64Var instanceof C17342a) {
            c17342a = (C17342a) n64Var;
            int i = c17342a.f48618e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17342a.f48618e = i - Integer.MIN_VALUE;
            } else {
                c17342a = new C17342a(n64Var);
            }
        }
        Object obj = c17342a.f48616c;
        Object objM51918f = uq8.m51918f();
        int i2 = c17342a.f48618e;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                q74 context = c17342a.getContext();
                String strMo26336c = kge.m35689b(u9g.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                }
                qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
                qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.q9g
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return u9g.m51259f();
                    }
                }, 1, null);
                final vdh vdhVarM56098a = xdh.m56098a(c17342a.getContext());
                z9g.C18592b c18592b = z9g.d0;
                xk7 xk7Var = new xk7() { // from class: o.r9g
                    @Override // p001o.xk7
                    public final Object invoke(Object obj2) {
                        return u9g.m51260g(this.f43254a, vdhVarM56098a, qx0Var, (z9g.C18593c.a) obj2);
                    }
                };
                c17342a.f48614a = qjaVarM52400e;
                c17342a.f48615b = this;
                c17342a.f48618e = 1;
                Object objM47891g = c18592b.m47891g(xk7Var, c17342a);
                if (objM47891g == objM51918f) {
                    return objM51918f;
                }
                qjaVar = qjaVarM52400e;
                obj = objM47891g;
                u9gVar = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z9gVar2 = (z9g) c17342a.f48615b;
                    qjaVar2 = (qja) c17342a.f48614a;
                    try {
                        wre.m54934b(obj);
                        lr0 lr0Var = (lr0) obj;
                        z9gVar2.close();
                        gc4VarM37790b = lr0Var.m37790b();
                        if (gc4VarM37790b != null) {
                            throw new sc4("STS credentials must not be null", null, 2, null);
                        }
                        ur0 ur0VarM37789a = lr0Var.m37789a();
                        String strM30858a = (ur0VarM37789a == null || (strM51942a = ur0VarM37789a.m51942a()) == null) ? null : ho0.f27228f.m30870a(strM51942a).m30858a();
                        qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.t9g
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return u9g.m51262i(gc4VarM37790b);
                            }
                        }, 1, null);
                        return mc4.m38705a(gc4VarM37790b.m28390a(), gc4VarM37790b.m28392c(), gc4VarM37790b.m28393d(), gc4VarM37790b.m28391b(), "AssumeRoleProvider", strM30858a);
                    } catch (Exception e2) {
                        e = e2;
                        qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.s9g
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return u9g.m51261h();
                            }
                        }, 1, null);
                        if (e instanceof tge) {
                            throw new sc4("failed to assume role from STS", e);
                        }
                        throw new n2e("STS is not activated in the requested region (" + z9gVar2.getConfig().m59016l() + "). Please check your configuration and activate STS in the target region if necessary", e);
                    }
                }
                u9gVar = (u9g) c17342a.f48615b;
                qjaVar = (qja) c17342a.f48614a;
                wre.m54934b(obj);
            }
            kr0.C14903a c14903a = new kr0.C14903a();
            jr0 jr0VarM51263e = u9gVar.m51263e();
            c14903a.m36085r(jr0VarM51263e.m34352j());
            c14903a.m36082o(jr0VarM51263e.m34350h());
            String strM34353k = jr0VarM51263e.m34353k();
            if (strM34353k == null) {
                strM34353k = v9g.m52478b(null, 1, null);
            }
            c14903a.m36086s(strM34353k);
            c14903a.m36081n(ml1.m39304d((int) k16.m34856B(jr0VarM51263e.m34349g())));
            c14903a.m36084q(jr0VarM51263e.m34347e());
            c14903a.m36083p(jr0VarM51263e.m34351i());
            c14903a.m36089v(jr0VarM51263e.m34348f());
            c14903a.m36091x(jr0VarM51263e.m34357o());
            c14903a.m36087t(jr0VarM51263e.m34354l());
            c14903a.m36090w(jr0VarM51263e.m34356n());
            c14903a.m36088u(jr0VarM51263e.m34355m());
            kr0 kr0VarM36068a = c14903a.m36068a();
            c17342a.f48614a = qjaVar;
            c17342a.f48615b = z9gVar;
            c17342a.f48618e = 2;
            Object objL1 = z9gVar.l1(kr0VarM36068a, c17342a);
            if (objL1 == objM51918f) {
                return objM51918f;
            }
            qjaVar2 = qjaVar;
            obj = objL1;
            z9gVar2 = z9gVar;
            lr0 lr0Var2 = (lr0) obj;
            z9gVar2.close();
            gc4VarM37790b = lr0Var2.m37790b();
            if (gc4VarM37790b != null) {
            }
        } catch (Exception e3) {
            qjaVar2 = qjaVar;
            e = e3;
            z9gVar2 = z9gVar;
            qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.s9g
                @Override // p001o.uk7
                public final Object invoke() {
                    return u9g.m51261h();
                }
            }, 1, null);
            if (e instanceof tge) {
            }
        } catch (Throwable th2) {
            th = th2;
            qx0Var = z9gVar;
            qx0Var.close();
            throw th;
        }
        z9gVar = (z9g) obj;
    }

    public u9g(qc4 qc4Var, jr0 jr0Var, String str, t18 t18Var) {
        sq8.m48649h(qc4Var, "bootstrapCredentialsProvider");
        sq8.m48649h(jr0Var, "assumeRoleParameters");
        this.f48610a = qc4Var;
        this.f48611b = jr0Var;
        this.f48612c = str;
        this.f48613d = t18Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u9g(qc4 qc4Var, String str, String str2, String str3, String str4, long j, t18 t18Var, int i, id5 id5Var) {
        long jM38175s;
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        String str7 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            k16.C14700a c14700a = k16.f31358b;
            jM38175s = m16.m38175s(900, o16.SECONDS);
        } else {
            jM38175s = j;
        }
        this(qc4Var, str, str5, str6, str7, jM38175s, (i & 64) != 0 ? null : t18Var, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u9g(qc4 qc4Var, String str, String str2, String str3, String str4, long j, t18 t18Var) {
        this(qc4Var, new jr0(str, str3, str4, j, null, null, null, null, null, null, null, 2032, null), str2, t18Var);
        sq8.m48649h(qc4Var, "bootstrapCredentialsProvider");
        sq8.m48649h(str, "roleArn");
    }
}
