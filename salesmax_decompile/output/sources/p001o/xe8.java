package p001o;

import java.io.IOException;
import p001o.hb3;
import p001o.k16;
import p001o.w79;

/* loaded from: classes2.dex */
public final class xe8 implements rb3 {

    /* renamed from: a */
    public final String f53620a;

    /* renamed from: b */
    public final gi9 f53621b;

    /* renamed from: c */
    public final f9d f53622c;

    /* renamed from: d */
    public final hb3 f53623d;

    /* renamed from: e */
    public ic4 f53624e;

    /* renamed from: f */
    public gk8 f53625f;

    /* renamed from: g */
    public final nqb f53626g;

    /* renamed from: o.xe8$a */
    public static final class C18123a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f53627a;

        /* renamed from: c */
        public int f53629c;

        public C18123a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53627a = obj;
            this.f53629c |= Integer.MIN_VALUE;
            return xe8.this.m56165k(this);
        }
    }

    /* renamed from: o.xe8$b */
    public static final class C18124b extends o64 {

        /* renamed from: a */
        public Object f53630a;

        /* renamed from: b */
        public Object f53631b;

        /* renamed from: c */
        public Object f53632c;

        /* renamed from: d */
        public Object f53633d;

        /* renamed from: e */
        public /* synthetic */ Object f53634e;

        /* renamed from: g */
        public int f53636g;

        public C18124b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53634e = obj;
            this.f53636g |= Integer.MIN_VALUE;
            return xe8.this.resolve(null, this);
        }
    }

    /* renamed from: o.xe8$c */
    public static final class C18125c extends o64 {

        /* renamed from: a */
        public Object f53637a;

        /* renamed from: b */
        public Object f53638b;

        /* renamed from: c */
        public /* synthetic */ Object f53639c;

        /* renamed from: e */
        public int f53641e;

        public C18125c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53639c = obj;
            this.f53641e |= Integer.MIN_VALUE;
            return xe8.this.m56166s(null, this);
        }
    }

    public xe8(String str, gi9 gi9Var, f9d f9dVar, hb3 hb3Var) {
        sq8.m48649h(gi9Var, "client");
        sq8.m48649h(f9dVar, "platformProvider");
        sq8.m48649h(hb3Var, "clock");
        this.f53620a = str;
        this.f53621b = gi9Var;
        this.f53622c = f9dVar;
        this.f53623d = hb3Var;
        this.f53626g = tqb.m50340b(false, 1, null);
    }

    /* renamed from: f */
    public static final te8 m56160f() {
        return new te8();
    }

    /* renamed from: o */
    public static final String m56163o() {
        return "Received 404 from IMDS when loading profile information. Hint: This instance may not have an IAM role associated.";
    }

    /* renamed from: r */
    public static final String m56164r() {
        return "Attempting credential expiration extension due to a credential service availability issue. A refresh of these credentials will be attempted again in 15 minutes.";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f53621b.isInitialized()) {
            ((fk8) this.f53621b.getValue()).close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m56165k(n64 n64Var) {
        C18123a c18123a;
        if (n64Var instanceof C18123a) {
            c18123a = (C18123a) n64Var;
            int i = c18123a.f53629c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18123a.f53629c = i - Integer.MIN_VALUE;
            } else {
                c18123a = new C18123a(n64Var);
            }
        }
        Object objE0 = c18123a.f53627a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18123a.f53629c;
        try {
            if (i2 == 0) {
                wre.m54934b(objE0);
                fk8 fk8Var = (fk8) this.f53621b.getValue();
                c18123a.f53629c = 1;
                objE0 = fk8Var.e0("/latest/meta-data/iam/security-credentials/", c18123a);
                if (objE0 == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objE0);
            }
            return (String) objE0;
        } catch (o26 e) {
            if (e.m41350e() == s48.f44774c.m47770B().h0()) {
                q74 context = c18123a.getContext();
                uk7 uk7Var = new uk7() { // from class: o.we8
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return xe8.m56163o();
                    }
                };
                fja fjaVar = fja.Info;
                String strMo26336c = kge.m35689b(xe8.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[Catch: all -> 0x0277, TRY_LEAVE, TryCatch #0 {all -> 0x0277, blocks: (B:33:0x00b5, B:35:0x00b9, B:37:0x00bd, B:45:0x00d1), top: B:117:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1 A[Catch: Exception -> 0x0077, TryCatch #2 {Exception -> 0x0077, blocks: (B:22:0x0072, B:54:0x00ee, B:49:0x00dd, B:51:0x00e1), top: B:121:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        C18124b c18124b;
        Exception exc;
        Exception exc2;
        nqb nqbVar;
        xe8 xe8Var;
        String str;
        gk8 gk8Var;
        xe8 xe8Var2;
        xe8 xe8Var3;
        w79 w79Var;
        gk8 gk8VarM28956m;
        xe8 xe8Var4;
        nqb nqbVar2;
        ic4 ic4Var;
        ic4 ic4Var2;
        if (n64Var instanceof C18124b) {
            c18124b = (C18124b) n64Var;
            int i = c18124b.f53636g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18124b.f53636g = i - Integer.MIN_VALUE;
            } else {
                c18124b = new C18124b(n64Var);
            }
        }
        Object objM56165k = c18124b.f53634e;
        Object objM51918f = uq8.m51918f();
        xe8 xe8Var5 = c18124b.f53636g;
        boolean z = true;
        try {
            try {
            } catch (Exception e) {
                c18124b.f53630a = e;
                c18124b.f53631b = null;
                c18124b.f53636g = 3;
                Object objM56166s = xe8Var5.m56166s(e, c18124b);
                if (objM56166s == objM51918f) {
                    return objM51918f;
                }
                exc2 = e;
                objM56165k = objM56166s;
            }
        } catch (Exception e2) {
            c18124b.f53630a = e2;
            c18124b.f53631b = null;
            c18124b.f53636g = 5;
            Object objM56166s2 = xe8Var5.m56166s(e2, c18124b);
            if (objM56166s2 == objM51918f) {
                return objM51918f;
            }
            exc = e2;
            objM56165k = objM56166s2;
        }
        switch (xe8Var5) {
            case 0:
                wre.m54934b(objM56165k);
                if (sq8.m48644c(bj6.m19237f(o81.f37890a.m41736i(), this.f53622c), ml1.m39301a(true))) {
                    throw new pc4("AWS EC2 metadata is explicitly disabled; credentials not loaded", null, 2, null);
                }
                nqb nqbVar3 = this.f53626g;
                c18124b.f53630a = this;
                c18124b.f53631b = nqbVar3;
                c18124b.f53636g = 1;
                if (nqbVar3.mo40922b(null, c18124b) == objM51918f) {
                    return objM51918f;
                }
                nqbVar = nqbVar3;
                xe8Var = this;
                try {
                    if (xe8Var.f53624e != null && (gk8Var = xe8Var.f53625f) != null) {
                        if (xe8Var.f53623d.mo30148a().compareTo(gk8Var) < 0) {
                            z = false;
                        }
                        if (z) {
                            gk8Var = null;
                        }
                        if (gk8Var != null) {
                            ic4 ic4Var3 = xe8Var.f53624e;
                            sq8.m48646e(ic4Var3);
                            return ic4Var3;
                        }
                    }
                    str = xe8Var.f53620a;
                    xe8Var2 = xe8Var;
                    if (str == null) {
                        c18124b.f53630a = xe8Var;
                        c18124b.f53631b = null;
                        c18124b.f53636g = 2;
                        objM56165k = xe8Var.m56165k(c18124b);
                        xe8Var5 = xe8Var;
                        if (objM56165k == objM51918f) {
                            return objM51918f;
                        }
                        str = (String) objM56165k;
                        xe8Var2 = xe8Var5;
                    }
                    c18124b.f53630a = xe8Var2;
                    c18124b.f53631b = null;
                    c18124b.f53636g = 4;
                    objM56165k = ((fk8) xe8Var2.f53621b.getValue()).e0("/latest/meta-data/iam/security-credentials/" + str, c18124b);
                    xe8Var5 = xe8Var2;
                    if (objM56165k == objM51918f) {
                        return objM51918f;
                    }
                    i89 i89Var = new i89(e9g.m24603u((String) objM56165k));
                    c18124b.f53630a = xe8Var5;
                    c18124b.f53636g = 6;
                    objM56165k = v79.m52407a(i89Var, c18124b);
                    xe8Var3 = xe8Var5;
                    if (objM56165k == objM51918f) {
                        return objM51918f;
                    }
                    w79Var = (w79) objM56165k;
                    if (!(w79Var instanceof w79.C17794b)) {
                        if (!(w79Var instanceof w79.C17793a)) {
                            throw new szb();
                        }
                        w79.C17793a c17793a = (w79.C17793a) w79Var;
                        if (!sq8.m48644c(c17793a.m54036a(), "AssumeRoleUnauthorizedAccess")) {
                            throw new sc4("Error retrieving credentials from IMDS: code=" + c17793a.m54036a() + "; " + c17793a.m54037b(), null, 2, null);
                        }
                        throw new n2e("Incorrect IMDS/IAM configuration: [" + c17793a.m54036a() + "] " + c17793a.m54037b() + ". Hint: Does this role have a trust relationship with EC2?", null, 2, null);
                    }
                    w79.C17794b c17794b = (w79.C17794b) w79Var;
                    if (c17794b.m54040c() == null || c17794b.m54040c().compareTo(xe8Var3.f53623d.mo30148a()) >= 0) {
                        gk8VarM28956m = null;
                    } else {
                        q74 context = c18124b.getContext();
                        uk7 uk7Var = new uk7() { // from class: o.ve8
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return xe8.m56164r();
                            }
                        };
                        fja fjaVar = fja.Warning;
                        String strMo26336c = kge.m35689b(xe8.class).mo26336c();
                        if (strMo26336c == null) {
                            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                        }
                        v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
                        gk8 gk8VarMo30148a = xe8Var3.f53623d.mo30148a();
                        k16.C14700a c14700a = k16.f31358b;
                        gk8VarM28956m = gk8VarMo30148a.m28956m(m16.m38175s(900, o16.SECONDS));
                    }
                    xe8Var3.f53625f = gk8VarM28956m;
                    ic4 ic4VarM31900a = ic4.f28446a.m31900a(c17794b.m54038a(), c17794b.m54041d(), (16 & 4) != 0 ? null : c17794b.m54042e(), (16 & 8) != 0 ? null : c17794b.m54040c(), (16 & 16) != 0 ? null : "IMDSv2", (16 & 32) != 0 ? null : null);
                    nqb nqbVar4 = xe8Var3.f53626g;
                    c18124b.f53630a = xe8Var3;
                    c18124b.f53631b = ic4VarM31900a;
                    c18124b.f53632c = ic4VarM31900a;
                    c18124b.f53633d = nqbVar4;
                    c18124b.f53636g = 7;
                    if (nqbVar4.mo40922b(null, c18124b) == objM51918f) {
                        return objM51918f;
                    }
                    xe8Var4 = xe8Var3;
                    nqbVar2 = nqbVar4;
                    ic4Var = ic4VarM31900a;
                    ic4Var2 = ic4Var;
                    try {
                        xe8Var4.f53624e = ic4Var;
                        y3i y3iVar = y3i.f54824a;
                        return ic4Var2;
                    } finally {
                    }
                } finally {
                }
            case 1:
                nqb nqbVar5 = (nqb) c18124b.f53631b;
                xe8 xe8Var6 = (xe8) c18124b.f53630a;
                wre.m54934b(objM56165k);
                nqbVar = nqbVar5;
                xe8Var = xe8Var6;
                if (xe8Var.f53624e != null) {
                    if (xe8Var.f53623d.mo30148a().compareTo(gk8Var) < 0) {
                    }
                    if (z) {
                    }
                    if (gk8Var != null) {
                    }
                    break;
                }
                str = xe8Var.f53620a;
                xe8Var2 = xe8Var;
                if (str == null) {
                }
                c18124b.f53630a = xe8Var2;
                c18124b.f53631b = null;
                c18124b.f53636g = 4;
                objM56165k = ((fk8) xe8Var2.f53621b.getValue()).e0("/latest/meta-data/iam/security-credentials/" + str, c18124b);
                xe8Var5 = xe8Var2;
                if (objM56165k == objM51918f) {
                }
                i89 i89Var2 = new i89(e9g.m24603u((String) objM56165k));
                c18124b.f53630a = xe8Var5;
                c18124b.f53636g = 6;
                objM56165k = v79.m52407a(i89Var2, c18124b);
                xe8Var3 = xe8Var5;
                if (objM56165k == objM51918f) {
                }
                w79Var = (w79) objM56165k;
                if (!(w79Var instanceof w79.C17794b)) {
                }
                break;
            case 2:
                xe8 xe8Var7 = (xe8) c18124b.f53630a;
                wre.m54934b(objM56165k);
                xe8Var5 = xe8Var7;
                str = (String) objM56165k;
                xe8Var2 = xe8Var5;
                c18124b.f53630a = xe8Var2;
                c18124b.f53631b = null;
                c18124b.f53636g = 4;
                objM56165k = ((fk8) xe8Var2.f53621b.getValue()).e0("/latest/meta-data/iam/security-credentials/" + str, c18124b);
                xe8Var5 = xe8Var2;
                if (objM56165k == objM51918f) {
                }
                i89 i89Var22 = new i89(e9g.m24603u((String) objM56165k));
                c18124b.f53630a = xe8Var5;
                c18124b.f53636g = 6;
                objM56165k = v79.m52407a(i89Var22, c18124b);
                xe8Var3 = xe8Var5;
                if (objM56165k == objM51918f) {
                }
                w79Var = (w79) objM56165k;
                if (!(w79Var instanceof w79.C17794b)) {
                }
                break;
            case 3:
                exc2 = (Exception) c18124b.f53630a;
                wre.m54934b(objM56165k);
                ic4 ic4Var4 = (ic4) objM56165k;
                if (ic4Var4 != null) {
                    return ic4Var4;
                }
                throw new sc4("failed to load instance profile", exc2);
            case 4:
                xe8 xe8Var8 = (xe8) c18124b.f53630a;
                wre.m54934b(objM56165k);
                xe8Var5 = xe8Var8;
                i89 i89Var222 = new i89(e9g.m24603u((String) objM56165k));
                c18124b.f53630a = xe8Var5;
                c18124b.f53636g = 6;
                objM56165k = v79.m52407a(i89Var222, c18124b);
                xe8Var3 = xe8Var5;
                if (objM56165k == objM51918f) {
                }
                w79Var = (w79) objM56165k;
                if (!(w79Var instanceof w79.C17794b)) {
                }
                break;
            case 5:
                exc = (Exception) c18124b.f53630a;
                wre.m54934b(objM56165k);
                ic4 ic4Var5 = (ic4) objM56165k;
                if (ic4Var5 != null) {
                    return ic4Var5;
                }
                throw new sc4("failed to load credentials", exc);
            case 6:
                xe8 xe8Var9 = (xe8) c18124b.f53630a;
                wre.m54934b(objM56165k);
                xe8Var3 = xe8Var9;
                w79Var = (w79) objM56165k;
                if (!(w79Var instanceof w79.C17794b)) {
                }
                break;
            case 7:
                nqbVar2 = (nqb) c18124b.f53633d;
                ic4Var = (ic4) c18124b.f53632c;
                ic4Var2 = (ic4) c18124b.f53631b;
                xe8Var4 = (xe8) c18124b.f53630a;
                wre.m54934b(objM56165k);
                xe8Var4.f53624e = ic4Var;
                y3i y3iVar2 = y3i.f54824a;
                return ic4Var2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m56166s(Exception exc, n64 n64Var) {
        C18125c c18125c;
        nqb nqbVar;
        xe8 xe8Var;
        if (n64Var instanceof C18125c) {
            c18125c = (C18125c) n64Var;
            int i = c18125c.f53641e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18125c.f53641e = i - Integer.MIN_VALUE;
            } else {
                c18125c = new C18125c(n64Var);
            }
        }
        Object obj = c18125c.f53639c;
        Object objM51918f = uq8.m51918f();
        int i2 = c18125c.f53641e;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (!(exc instanceof IOException) && (!(exc instanceof o26) || ((o26) exc).m41350e() != s48.f44774c.m47809o().h0())) {
                return null;
            }
            nqbVar = this.f53626g;
            c18125c.f53637a = this;
            c18125c.f53638b = nqbVar;
            c18125c.f53641e = 1;
            if (nqbVar.mo40922b(null, c18125c) == objM51918f) {
                return objM51918f;
            }
            xe8Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqbVar = (nqb) c18125c.f53638b;
            xe8Var = (xe8) c18125c.f53637a;
            wre.m54934b(obj);
        }
        try {
            ic4 ic4Var = xe8Var.f53624e;
            if (ic4Var != null) {
                gk8 gk8VarMo30148a = xe8Var.f53623d.mo30148a();
                k16.C14700a c14700a = k16.f31358b;
                xe8Var.f53625f = gk8VarMo30148a.m28956m(m16.m38175s(900, o16.SECONDS));
            } else {
                ic4Var = null;
            }
            nqbVar.mo40923c(null);
            return ic4Var;
        } catch (Throwable th) {
            nqbVar.mo40923c(null);
            throw th;
        }
    }

    public /* synthetic */ xe8(String str, gi9 gi9Var, f9d f9dVar, hb3 hb3Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? si9.m48360a(new uk7() { // from class: o.ue8
            @Override // p001o.uk7
            public final Object invoke() {
                return xe8.m56160f();
            }
        }) : gi9Var, (i & 4) != 0 ? r9d.f43250a.m46382a() : f9dVar, (i & 8) != 0 ? hb3.C13904a.f26578a : hb3Var);
    }
}
