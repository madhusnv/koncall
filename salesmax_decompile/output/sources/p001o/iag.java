package p001o;

import p001o.k16;
import p001o.qja;
import p001o.sr0;
import p001o.z9g;

/* loaded from: classes2.dex */
public final class iag implements qc4 {

    /* renamed from: e */
    public static final C14230a f28350e = new C14230a(null);

    /* renamed from: a */
    public final rr0 f28351a;

    /* renamed from: b */
    public final String f28352b;

    /* renamed from: c */
    public final r9d f28353c;

    /* renamed from: d */
    public final t18 f28354d;

    /* renamed from: o.iag$a */
    public static final class C14230a {
        public C14230a() {
        }

        public /* synthetic */ C14230a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ iag m31808b(C14230a c14230a, String str, String str2, String str3, String str4, long j, r9d r9dVar, t18 t18Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                k16.C14700a c14700a = k16.f31358b;
                j = m16.m38175s(900, o16.SECONDS);
            }
            if ((i & 32) != 0) {
                r9dVar = r9d.f43250a.m46382a();
            }
            if ((i & 64) != 0) {
                t18Var = null;
            }
            return c14230a.m31809a(str, str2, str3, str4, j, r9dVar, t18Var);
        }

        /* renamed from: a */
        public final iag m31809a(String str, String str2, String str3, String str4, long j, r9d r9dVar, t18 t18Var) {
            Object objM19237f;
            Object objM19237f2;
            sq8.m48649h(r9dVar, "platformProvider");
            o81 o81Var = o81.f37890a;
            zi6 zi6VarM41745r = o81Var.m41745r();
            if (str == null) {
                objM19237f = bj6.m19237f(zi6VarM41745r, r9dVar);
                if (objM19237f == null) {
                    throw new n2e("Required field `roleArn` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `" + zi6VarM41745r.m59491d() + "`, or set the JVM system property `" + zi6VarM41745r.m59493f() + '`', null, 2, null);
                }
            } else {
                objM19237f = str;
            }
            String str5 = (String) objM19237f;
            zi6 zi6VarM41753z = o81Var.m41753z();
            if (str2 == null) {
                objM19237f2 = bj6.m19237f(zi6VarM41753z, r9dVar);
                if (objM19237f2 == null) {
                    throw new n2e("Required field `webIdentityTokenFilePath` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `" + zi6VarM41753z.m59491d() + "`, or set the JVM system property `" + zi6VarM41753z.m59493f() + '`', null, 2, null);
                }
            } else {
                objM19237f2 = str2;
            }
            return new iag(str5, (String) objM19237f2, str3 == null ? (String) bj6.m19237f(o81Var.m41743p(), r9dVar) : str3, str4, j, r9dVar, t18Var, null);
        }
    }

    /* renamed from: o.iag$b */
    public static final class C14231b extends o64 {

        /* renamed from: a */
        public Object f28355a;

        /* renamed from: b */
        public Object f28356b;

        /* renamed from: c */
        public Object f28357c;

        /* renamed from: d */
        public Object f28358d;

        /* renamed from: e */
        public Object f28359e;

        /* renamed from: f */
        public /* synthetic */ Object f28360f;

        /* renamed from: h */
        public int f28362h;

        public C14231b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f28360f = obj;
            this.f28362h |= Integer.MIN_VALUE;
            return iag.this.resolve(null, this);
        }
    }

    public /* synthetic */ iag(String str, String str2, String str3, String str4, long j, r9d r9dVar, t18 t18Var, id5 id5Var) {
        this(str, str2, str3, str4, j, r9dVar, t18Var);
    }

    /* renamed from: f */
    public static final String m31803f() {
        return "retrieving assumed credentials via web identity";
    }

    /* renamed from: g */
    public static final y3i m31804g(iag iagVar, vdh vdhVar, qx0 qx0Var, z9g.C18593c.a aVar) {
        sq8.m48649h(aVar, "$this$fromEnvironment");
        aVar.mo20132h(iagVar.f28352b);
        aVar.mo20126b(iagVar.f28354d);
        aVar.m59021A(vdhVar);
        aVar.mo20136l((gja) qx0Var.mo18191b(e7f.f21127a.m24496c()));
        return y3i.f54824a;
    }

    /* renamed from: h */
    public static final String m31805h() {
        return "sts refused to grant assumed role credentials from web identity";
    }

    /* renamed from: i */
    public static final String m31806i(gc4 gc4Var) {
        return "obtained assumed credentials via web identity; expiration=" + gc4Var.m28391b().m28951d(vmh.ISO_8601);
    }

    /* renamed from: e */
    public final r9d m31807e() {
        return this.f28353c;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0117 A[Catch: all -> 0x0199, Exception -> 0x019c, TryCatch #4 {Exception -> 0x019c, all -> 0x0199, blocks: (B:39:0x00f2, B:41:0x0117, B:42:0x011f), top: B:75:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(qx0 qx0Var, n64 n64Var) throws Throwable {
        C14231b c14231b;
        qja qjaVarM52400e;
        final qx0 qx0Var2;
        rr0 rr0Var;
        iag iagVar;
        final iag iagVar2;
        String strM24600r;
        iag iagVar3;
        String str;
        z9g z9gVar;
        z9g z9gVar2;
        qja qjaVar;
        String strM47081h;
        final gc4 gc4VarM50393b;
        String strM51942a;
        ho0 ho0VarM30870a;
        if (n64Var instanceof C14231b) {
            c14231b = (C14231b) n64Var;
            int i = c14231b.f28362h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14231b.f28362h = i - Integer.MIN_VALUE;
            } else {
                c14231b = new C14231b(n64Var);
            }
        }
        Object objG0 = c14231b.f28360f;
        Object objM51918f = uq8.m51918f();
        int i2 = c14231b.f28362h;
        String strM30858a = null;
        if (i2 == 0) {
            wre.m54934b(objG0);
            q74 context = c14231b.getContext();
            String strMo26336c = kge.m35689b(u9g.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qjaVarM52400e = v74.m52400e(context, strMo26336c);
            qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.eag
                @Override // p001o.uk7
                public final Object invoke() {
                    return iag.m31803f();
                }
            }, 1, null);
            rr0 rr0Var2 = this.f28351a;
            r9d r9dVar = this.f28353c;
            String strM47082i = rr0Var2.m47082i();
            c14231b.f28355a = this;
            qx0Var2 = qx0Var;
            c14231b.f28356b = qx0Var2;
            c14231b.f28357c = qjaVarM52400e;
            c14231b.f28358d = this;
            c14231b.f28359e = rr0Var2;
            c14231b.f28362h = 1;
            Object objMo18076d = r9dVar.mo18076d(strM47082i, c14231b);
            if (objMo18076d == objM51918f) {
                return objM51918f;
            }
            rr0Var = rr0Var2;
            iagVar = this;
            objG0 = objMo18076d;
            iagVar2 = iagVar;
        } else if (i2 == 1) {
            rr0 rr0Var3 = (rr0) c14231b.f28359e;
            iag iagVar4 = (iag) c14231b.f28358d;
            qjaVarM52400e = (qja) c14231b.f28357c;
            qx0Var2 = (qx0) c14231b.f28356b;
            iagVar = (iag) c14231b.f28355a;
            wre.m54934b(objG0);
            rr0Var = rr0Var3;
            iagVar2 = iagVar4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z9gVar2 = (z9g) c14231b.f28356b;
                qjaVar = (qja) c14231b.f28355a;
                try {
                    try {
                        wre.m54934b(objG0);
                        tr0 tr0Var = (tr0) objG0;
                        z9gVar2.close();
                        gc4VarM50393b = tr0Var.m50393b();
                        if (gc4VarM50393b != null) {
                            throw new sc4("STS credentials must not be null", null, 2, null);
                        }
                        qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.hag
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return iag.m31806i(gc4VarM50393b);
                            }
                        }, 1, null);
                        ur0 ur0VarM50392a = tr0Var.m50392a();
                        if (ur0VarM50392a != null && (strM51942a = ur0VarM50392a.m51942a()) != null && (ho0VarM30870a = ho0.f27228f.m30870a(strM51942a)) != null) {
                            strM30858a = ho0VarM30870a.m30858a();
                        }
                        return mc4.m38705a(gc4VarM50393b.m28390a(), gc4VarM50393b.m28392c(), gc4VarM50393b.m28393d(), gc4VarM50393b.m28391b(), "WebIdentityToken", strM30858a);
                    } catch (Exception e) {
                        e = e;
                        qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.gag
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return iag.m31805h();
                            }
                        }, 1, null);
                        throw new sc4("STS failed to assume role from web identity", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    z9gVar2.close();
                    throw th;
                }
            }
            str = (String) c14231b.f28358d;
            rr0Var = (rr0) c14231b.f28357c;
            qjaVarM52400e = (qja) c14231b.f28356b;
            iagVar3 = (iag) c14231b.f28355a;
            wre.m54934b(objG0);
            z9gVar = (z9g) objG0;
            try {
                sr0.C16896a c16896a = new sr0.C16896a();
                c16896a.m48768m(rr0Var.m47080g());
                c16896a.m48770o(str);
                c16896a.m48764i(ml1.m39304d((int) k16.m34856B(rr0Var.m47077d())));
                strM47081h = rr0Var.m47081h();
                if (strM47081h == null) {
                    strM47081h = v9g.m52477a(iagVar3.m31807e());
                }
                c16896a.m48769n(strM47081h);
                c16896a.m48767l(rr0Var.m47079f());
                c16896a.m48766k(rr0Var.m47076c());
                c16896a.m48765j(rr0Var.m47078e());
                sr0 sr0VarM48756a = c16896a.m48756a();
                c14231b.f28355a = qjaVarM52400e;
                c14231b.f28356b = z9gVar;
                c14231b.f28357c = null;
                c14231b.f28358d = null;
                c14231b.f28362h = 3;
                objG0 = z9gVar.g0(sr0VarM48756a, c14231b);
                if (objG0 != objM51918f) {
                    return objM51918f;
                }
                qjaVar = qjaVarM52400e;
                z9gVar2 = z9gVar;
                tr0 tr0Var2 = (tr0) objG0;
                z9gVar2.close();
                gc4VarM50393b = tr0Var2.m50393b();
                if (gc4VarM50393b != null) {
                }
            } catch (Exception e2) {
                e = e2;
                qjaVar = qjaVarM52400e;
                z9gVar2 = z9gVar;
                qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.gag
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return iag.m31805h();
                    }
                }, 1, null);
                throw new sc4("STS failed to assume role from web identity", e);
            } catch (Throwable th2) {
                th = th2;
                z9gVar2 = z9gVar;
                z9gVar2.close();
                throw th;
            }
        }
        byte[] bArr = (byte[]) objG0;
        if (bArr == null || (strM24600r = e9g.m24600r(bArr)) == null) {
            throw new sc4("failed to read webIdentityToken from " + rr0Var.m47082i(), null, 2, null);
        }
        final vdh vdhVarM56098a = xdh.m56098a(c14231b.getContext());
        z9g.C18592b c18592b = z9g.d0;
        xk7 xk7Var = new xk7() { // from class: o.fag
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return iag.m31804g(this.f23058a, vdhVarM56098a, qx0Var2, (z9g.C18593c.a) obj);
            }
        };
        c14231b.f28355a = iagVar;
        c14231b.f28356b = qjaVarM52400e;
        c14231b.f28357c = rr0Var;
        c14231b.f28358d = strM24600r;
        c14231b.f28359e = null;
        c14231b.f28362h = 2;
        Object objM47891g = c18592b.m47891g(xk7Var, c14231b);
        if (objM47891g == objM51918f) {
            return objM51918f;
        }
        iagVar3 = iagVar;
        str = strM24600r;
        objG0 = objM47891g;
        z9gVar = (z9g) objG0;
        sr0.C16896a c16896a2 = new sr0.C16896a();
        c16896a2.m48768m(rr0Var.m47080g());
        c16896a2.m48770o(str);
        c16896a2.m48764i(ml1.m39304d((int) k16.m34856B(rr0Var.m47077d())));
        strM47081h = rr0Var.m47081h();
        if (strM47081h == null) {
        }
        c16896a2.m48769n(strM47081h);
        c16896a2.m48767l(rr0Var.m47079f());
        c16896a2.m48766k(rr0Var.m47076c());
        c16896a2.m48765j(rr0Var.m47078e());
        sr0 sr0VarM48756a2 = c16896a2.m48756a();
        c14231b.f28355a = qjaVarM52400e;
        c14231b.f28356b = z9gVar;
        c14231b.f28357c = null;
        c14231b.f28358d = null;
        c14231b.f28362h = 3;
        objG0 = z9gVar.g0(sr0VarM48756a2, c14231b);
        if (objG0 != objM51918f) {
        }
    }

    public iag(rr0 rr0Var, String str, r9d r9dVar, t18 t18Var) {
        sq8.m48649h(rr0Var, "webIdentityParameters");
        sq8.m48649h(r9dVar, "platformProvider");
        this.f28351a = rr0Var;
        this.f28352b = str;
        this.f28353c = r9dVar;
        this.f28354d = t18Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iag(String str, String str2, String str3, String str4, long j, r9d r9dVar, t18 t18Var, int i, id5 id5Var) {
        long jM38175s;
        String str5 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            k16.C14700a c14700a = k16.f31358b;
            jM38175s = m16.m38175s(900, o16.SECONDS);
        } else {
            jM38175s = j;
        }
        this(str, str2, str3, str5, jM38175s, (i & 32) != 0 ? r9d.f43250a.m46382a() : r9dVar, (i & 64) != 0 ? null : t18Var, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iag(String str, String str2, String str3, String str4, long j, r9d r9dVar, t18 t18Var) {
        this(new rr0(str, str2, str4, j, null, null, null, 112, null), str3, r9dVar, t18Var);
        sq8.m48649h(str, "roleArn");
        sq8.m48649h(str2, "webIdentityTokenFilePath");
        sq8.m48649h(r9dVar, "platformProvider");
    }
}
