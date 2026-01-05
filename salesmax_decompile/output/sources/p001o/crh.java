package p001o;

import p001o.k16;
import p001o.s48;

/* loaded from: classes2.dex */
public final class crh implements klb {

    /* renamed from: a */
    public final i7f f18538a;

    /* renamed from: b */
    public final ye8 f18539b;

    /* renamed from: c */
    public final long f18540c;

    /* renamed from: d */
    public final hb3 f18541d;

    /* renamed from: e */
    public ks1 f18542e;

    /* renamed from: o.crh$a */
    public static final class C12731a extends o64 {

        /* renamed from: a */
        public Object f18543a;

        /* renamed from: b */
        public Object f18544b;

        /* renamed from: c */
        public Object f18545c;

        /* renamed from: d */
        public long f18546d;

        /* renamed from: e */
        public /* synthetic */ Object f18547e;

        /* renamed from: g */
        public int f18549g;

        public C12731a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f18547e = obj;
            this.f18549g |= Integer.MIN_VALUE;
            return crh.this.m21639f(null, null, this);
        }
    }

    /* renamed from: o.crh$b */
    public static final class C12732b extends o64 {

        /* renamed from: a */
        public Object f18550a;

        /* renamed from: b */
        public /* synthetic */ Object f18551b;

        /* renamed from: d */
        public int f18553d;

        public C12732b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f18551b = obj;
            this.f18553d |= Integer.MIN_VALUE;
            return crh.this.mo21638b(null, this);
        }
    }

    /* renamed from: o.crh$c */
    public static final class C12733c extends jgg implements xk7 {

        /* renamed from: a */
        public int f18554a;

        /* renamed from: c */
        public final /* synthetic */ zdc f18556c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12733c(zdc zdcVar, n64 n64Var) {
            super(1, n64Var);
            this.f18556c = zdcVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return crh.this.new C12733c(this.f18556c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM51918f = uq8.m51918f();
            int i = this.f18554a;
            if (i == 0) {
                wre.m54934b(obj);
                crh crhVar = crh.this;
                hb3 hb3Var = crhVar.f18541d;
                zdc zdcVar = this.f18556c;
                this.f18554a = 1;
                obj = crhVar.m21639f(hb3Var, zdcVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            arh arhVar = (arh) obj;
            return new yo6(arhVar, arhVar.m17725a());
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C12733c) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public /* synthetic */ crh(i7f i7fVar, ye8 ye8Var, long j, hb3 hb3Var, id5 id5Var) {
        this(i7fVar, ye8Var, j, hb3Var);
    }

    /* renamed from: g */
    public static final String m21636g() {
        return "refreshing IMDS token";
    }

    @Override // p001o.klb
    /* renamed from: a */
    public void mo21637a(j7f j7fVar) {
        sq8.m48649h(j7fVar, "op");
        n6d.m40147g(j7fVar.m33383c().m51145e(), this, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0129 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:20:0x005e, B:47:0x0156, B:49:0x015a, B:55:0x017e, B:56:0x0185, B:39:0x0115, B:41:0x0129, B:43:0x0139, B:57:0x0186, B:58:0x018d, B:59:0x018e, B:63:0x01a5, B:64:0x01b6), top: B:72:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:20:0x005e, B:47:0x0156, B:49:0x015a, B:55:0x017e, B:56:0x0185, B:39:0x0115, B:41:0x0129, B:43:0x0139, B:57:0x0186, B:58:0x018d, B:59:0x018e, B:63:0x01a5, B:64:0x01b6), top: B:72:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e A[Catch: all -> 0x0063, TRY_ENTER, TryCatch #0 {all -> 0x0063, blocks: (B:20:0x005e, B:47:0x0156, B:49:0x015a, B:55:0x017e, B:56:0x0185, B:39:0x0115, B:41:0x0129, B:43:0x0139, B:57:0x0186, B:58:0x018d, B:59:0x018e, B:63:0x01a5, B:64:0x01b6), top: B:72:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:20:0x005e, B:47:0x0156, B:49:0x015a, B:55:0x017e, B:56:0x0185, B:39:0x0115, B:41:0x0129, B:43:0x0139, B:57:0x0186, B:58:0x018d, B:59:0x018e, B:63:0x01a5, B:64:0x01b6), top: B:72:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, o.o18] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m21639f(hb3 hb3Var, zdc zdcVar, n64 n64Var) throws Throwable {
        C12731a c12731a;
        z38 z38Var;
        hb3 hb3Var2;
        crh crhVar;
        o18 o18Var;
        s48 status;
        s48.C16740b c16740b;
        long j;
        hb3 hb3Var3;
        byte[] bArr;
        if (n64Var instanceof C12731a) {
            c12731a = (C12731a) n64Var;
            int i = c12731a.f18549g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12731a.f18549g = i - Integer.MIN_VALUE;
            } else {
                c12731a = new C12731a(n64Var);
            }
        }
        Object objM57700m = c12731a.f18547e;
        Object objM51918f = uq8.m51918f();
        ?? r4 = c12731a.f18549g;
        try {
            if (r4 == 0) {
                wre.m54934b(objM57700m);
                q74 context = c12731a.getContext();
                uk7 uk7Var = new uk7() { // from class: o.brh
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return crh.m21636g();
                    }
                };
                fja fjaVar = fja.Trace;
                String strMo26336c = kge.m35689b(crh.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
                z38Var = new z38();
                z38Var.m58673j(o38.PUT);
                z38Var.m58668e().m59796c("x-aws-ec2-metadata-token-ttl-seconds", String.valueOf(k16.m34856B(this.f18540c)));
                String str = (String) ((z38) zdcVar.m59255d()).m58668e().m59804l("User-Agent");
                if (str != null) {
                    z38Var.m58668e().m59796c("User-Agent", str);
                }
                z38Var.m58671h().m36767h().m48016m("/latest/api/token");
                ye8 ye8Var = this.f18539b;
                c12731a.f18543a = this;
                hb3Var2 = hb3Var;
                c12731a.f18544b = hb3Var2;
                c12731a.f18545c = z38Var;
                c12731a.f18549g = 1;
                objM57700m = ye8Var.m57700m(c12731a);
                if (objM57700m == objM51918f) {
                    return objM51918f;
                }
                crhVar = this;
            } else if (r4 == 1) {
                z38Var = (z38) c12731a.f18545c;
                hb3 hb3Var4 = (hb3) c12731a.f18544b;
                crh crhVar2 = (crh) c12731a.f18543a;
                wre.m54934b(objM57700m);
                hb3Var2 = hb3Var4;
                crhVar = crhVar2;
            } else {
                if (r4 != 2) {
                    if (r4 != 3) {
                        if (r4 == 4) {
                            arh arhVar = (arh) c12731a.f18543a;
                            wre.m54934b(objM57700m);
                            return arhVar;
                        }
                        if (r4 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) c12731a.f18543a;
                        wre.m54934b(objM57700m);
                        throw th;
                    }
                    j = c12731a.f18546d;
                    o18Var = (o18) c12731a.f18544b;
                    hb3Var3 = (hb3) c12731a.f18543a;
                    wre.m54934b(objM57700m);
                    bArr = (byte[]) objM57700m;
                    if (bArr != null) {
                        throw new o26(200, "No token provided in IMDS response");
                    }
                    gk8 gk8VarMo30148a = hb3Var3.mo30148a();
                    k16.C14700a c14700a = k16.f31358b;
                    arh arhVar2 = new arh(bArr, gk8VarMo30148a.m28956m(m16.m38176t(j, o16.SECONDS)));
                    c12731a.f18543a = arhVar2;
                    c12731a.f18544b = null;
                    c12731a.f18549g = 4;
                    return q18.m44672b(o18Var, c12731a) == objM51918f ? objM51918f : arhVar2;
                }
                hb3 hb3Var5 = (hb3) c12731a.f18543a;
                wre.m54934b(objM57700m);
                hb3Var2 = hb3Var5;
                o18Var = (o18) objM57700m;
                status = o18Var.m41347f().getStatus();
                c16740b = s48.f44774c;
                if (sq8.m48644c(status, c16740b.m47773E())) {
                    throw new o26(o18Var.m41347f().getStatus().h0(), sq8.m48644c(o18Var.m41347f().getStatus(), c16740b.m47804j()) ? "Request forbidden: IMDS is disabled or the caller has insufficient permissions." : "Failed to retrieve IMDS token");
                }
                String str2 = (String) o18Var.m41347f().getHeaders().get("x-aws-ec2-metadata-token-ttl-seconds");
                if (str2 == null) {
                    throw new o26(200, "No TTL provided in IMDS response");
                }
                long j2 = Long.parseLong(str2);
                m18 body = o18Var.m41347f().getBody();
                c12731a.f18543a = hb3Var2;
                c12731a.f18544b = o18Var;
                c12731a.f18546d = j2;
                c12731a.f18549g = 3;
                objM57700m = n18.m39980a(body, c12731a);
                if (objM57700m == objM51918f) {
                    return objM51918f;
                }
                j = j2;
                hb3Var3 = hb3Var2;
                bArr = (byte[]) objM57700m;
                if (bArr != null) {
                }
            }
            sdc.m48264b(new zdc(z38Var), (b86) objM57700m);
            i7f i7fVar = crhVar.f18538a;
            c12731a.f18543a = hb3Var2;
            c12731a.f18544b = null;
            c12731a.f18545c = null;
            c12731a.f18549g = 2;
            objM57700m = i7fVar.m31695c(z38Var, c12731a);
            if (objM57700m == objM51918f) {
                return objM51918f;
            }
            o18Var = (o18) objM57700m;
            status = o18Var.m41347f().getStatus();
            c16740b = s48.f44774c;
            if (sq8.m48644c(status, c16740b.m47773E())) {
            }
        } catch (Throwable th2) {
            c12731a.f18543a = th2;
            c12731a.f18544b = null;
            c12731a.f18549g = 5;
            if (q18.m44672b(r4, c12731a) == objM51918f) {
                return objM51918f;
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.jlb
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo21638b(zdc zdcVar, n64 n64Var) throws Throwable {
        C12732b c12732b;
        if (n64Var instanceof C12732b) {
            c12732b = (C12732b) n64Var;
            int i = c12732b.f18553d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12732b.f18553d = i - Integer.MIN_VALUE;
            } else {
                c12732b = new C12732b(n64Var);
            }
        }
        Object objM36182a = c12732b.f18551b;
        Object objM51918f = uq8.m51918f();
        int i2 = c12732b.f18553d;
        if (i2 == 0) {
            wre.m54934b(objM36182a);
            ks1 ks1Var = this.f18542e;
            C12733c c12733c = new C12733c(zdcVar, null);
            c12732b.f18550a = zdcVar;
            c12732b.f18553d = 1;
            objM36182a = ks1Var.m36182a(c12733c, c12732b);
            if (objM36182a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdcVar = (zdc) c12732b.f18550a;
            wre.m54934b(objM36182a);
        }
        ((z38) zdcVar.m59255d()).m58668e().m59796c("x-aws-ec2-metadata-token", e9g.m24600r(((arh) objM36182a).m17726b()));
        return zdcVar;
    }

    public crh(i7f i7fVar, ye8 ye8Var, long j, hb3 hb3Var) {
        sq8.m48649h(i7fVar, "httpClient");
        sq8.m48649h(ye8Var, "endpointProvider");
        sq8.m48649h(hb3Var, "clock");
        this.f18538a = i7fVar;
        this.f18539b = ye8Var;
        this.f18540c = j;
        this.f18541d = hb3Var;
        k16.C14700a c14700a = k16.f31358b;
        this.f18542e = new ks1(null, m16.m38175s(120, o16.SECONDS), hb3Var, null);
    }
}
