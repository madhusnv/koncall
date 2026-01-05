package p001o;

import p001o.nqb;
import p001o.vre;

/* loaded from: classes3.dex */
public final class fuf {

    /* renamed from: a */
    public final nqb f24088a = tqb.m50340b(false, 1, null);

    /* renamed from: b */
    public cl3 f24089b;

    /* renamed from: c */
    public int f24090c;

    /* renamed from: o.fuf$a */
    public static final class C13558a extends o64 {

        /* renamed from: a */
        public Object f24091a;

        /* renamed from: b */
        public Object f24092b;

        /* renamed from: c */
        public Object f24093c;

        /* renamed from: d */
        public /* synthetic */ Object f24094d;

        /* renamed from: f */
        public int f24096f;

        public C13558a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f24094d = obj;
            this.f24096f |= Integer.MIN_VALUE;
            return fuf.this.m27524a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:35:0x00b0, B:37:0x00b8, B:38:0x00ba), top: B:64:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27524a(xk7 xk7Var, n64 n64Var) {
        C13558a c13558a;
        fuf fufVar;
        cl3 cl3Var;
        Throwable th;
        cl3 cl3Var2;
        Object objInvoke;
        fuf fufVar2;
        cl3 cl3Var3;
        nqb nqbVar;
        int i;
        Object objM53351b;
        if (n64Var instanceof C13558a) {
            c13558a = (C13558a) n64Var;
            int i2 = c13558a.f24096f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13558a.f24096f = i2 - Integer.MIN_VALUE;
            } else {
                c13558a = new C13558a(n64Var);
            }
        }
        Object objMo21334s = c13558a.f24094d;
        Object objM51918f = uq8.m51918f();
        switch (c13558a.f24096f) {
            case 0:
                wre.m54934b(objMo21334s);
                nqb nqbVar2 = this.f24088a;
                c13558a.f24091a = this;
                c13558a.f24092b = xk7Var;
                c13558a.f24096f = 1;
                if (nqb.C15628a.m40924a(nqbVar2, null, c13558a, 1, null) == objM51918f) {
                    return objM51918f;
                }
                fufVar = this;
                cl3Var = fufVar.f24089b;
                if (cl3Var == null) {
                    fufVar.f24090c++;
                    nqb.C15628a.m40925b(fufVar.f24088a, null, 1, null);
                    c13558a.f24091a = fufVar;
                    c13558a.f24092b = cl3Var;
                    c13558a.f24096f = 2;
                    if (cl3Var.d0(c13558a) == objM51918f) {
                        return objM51918f;
                    }
                    fufVar2 = fufVar;
                    cl3Var3 = cl3Var;
                    nqbVar = fufVar2.f24088a;
                    c13558a.f24091a = fufVar2;
                    c13558a.f24092b = cl3Var3;
                    c13558a.f24093c = nqbVar;
                    c13558a.f24096f = 3;
                    if (nqbVar.mo40922b(null, c13558a) == objM51918f) {
                        return objM51918f;
                    }
                    try {
                        i = fufVar2.f24090c - 1;
                        fufVar2.f24090c = i;
                        if (i == 0) {
                            fufVar2.f24089b = null;
                        }
                        y3i y3iVar = y3i.f54824a;
                        nqbVar.mo40923c(null);
                        c13558a.f24091a = null;
                        c13558a.f24092b = null;
                        c13558a.f24093c = null;
                        c13558a.f24096f = 4;
                        objMo21334s = cl3Var3.mo21334s(c13558a);
                        if (objMo21334s == objM51918f) {
                            return objM51918f;
                        }
                        Object objM53359j = ((vre) objMo21334s).m53359j();
                        wre.m54934b(objM53359j);
                        return objM53359j;
                    } catch (Throwable th2) {
                        nqbVar.mo40923c(null);
                        throw th2;
                    }
                }
                cl3 cl3VarM25197b = el3.m25197b(null, 1, null);
                fufVar.f24089b = cl3VarM25197b;
                nqb.C15628a.m40925b(fufVar.f24088a, null, 1, null);
                try {
                    vre.C17665a c17665a = vre.f50797b;
                    c13558a.f24091a = cl3VarM25197b;
                    c13558a.f24092b = null;
                    c13558a.f24096f = 5;
                    objInvoke = xk7Var.invoke(c13558a);
                } catch (Throwable th3) {
                    th = th3;
                    cl3Var2 = cl3VarM25197b;
                    vre.C17665a c17665a2 = vre.f50797b;
                    objM53351b = vre.m53351b(wre.m54933a(th));
                    cl3Var2.complete(vre.m53350a(objM53351b));
                    c13558a.f24091a = null;
                    c13558a.f24092b = null;
                    c13558a.f24096f = 6;
                    objMo21334s = cl3Var2.mo21334s(c13558a);
                    if (objMo21334s == objM51918f) {
                    }
                    Object objM53359j2 = ((vre) objMo21334s).m53359j();
                    wre.m54934b(objM53359j2);
                    return objM53359j2;
                }
                if (objInvoke == objM51918f) {
                    return objM51918f;
                }
                objMo21334s = objInvoke;
                cl3Var2 = cl3VarM25197b;
                objM53351b = vre.m53351b(objMo21334s);
                cl3Var2.complete(vre.m53350a(objM53351b));
                c13558a.f24091a = null;
                c13558a.f24092b = null;
                c13558a.f24096f = 6;
                objMo21334s = cl3Var2.mo21334s(c13558a);
                if (objMo21334s == objM51918f) {
                    return objM51918f;
                }
                Object objM53359j22 = ((vre) objMo21334s).m53359j();
                wre.m54934b(objM53359j22);
                return objM53359j22;
            case 1:
                xk7Var = (xk7) c13558a.f24092b;
                fufVar = (fuf) c13558a.f24091a;
                wre.m54934b(objMo21334s);
                cl3Var = fufVar.f24089b;
                if (cl3Var == null) {
                }
                break;
            case 2:
                cl3 cl3Var4 = (cl3) c13558a.f24092b;
                fuf fufVar3 = (fuf) c13558a.f24091a;
                wre.m54934b(objMo21334s);
                fufVar2 = fufVar3;
                cl3Var3 = cl3Var4;
                nqbVar = fufVar2.f24088a;
                c13558a.f24091a = fufVar2;
                c13558a.f24092b = cl3Var3;
                c13558a.f24093c = nqbVar;
                c13558a.f24096f = 3;
                if (nqbVar.mo40922b(null, c13558a) == objM51918f) {
                }
                i = fufVar2.f24090c - 1;
                fufVar2.f24090c = i;
                if (i == 0) {
                }
                y3i y3iVar2 = y3i.f54824a;
                nqbVar.mo40923c(null);
                c13558a.f24091a = null;
                c13558a.f24092b = null;
                c13558a.f24093c = null;
                c13558a.f24096f = 4;
                objMo21334s = cl3Var3.mo21334s(c13558a);
                if (objMo21334s == objM51918f) {
                }
                Object objM53359j3 = ((vre) objMo21334s).m53359j();
                wre.m54934b(objM53359j3);
                return objM53359j3;
            case 3:
                nqbVar = (nqb) c13558a.f24093c;
                cl3Var3 = (cl3) c13558a.f24092b;
                fufVar2 = (fuf) c13558a.f24091a;
                wre.m54934b(objMo21334s);
                i = fufVar2.f24090c - 1;
                fufVar2.f24090c = i;
                if (i == 0) {
                }
                y3i y3iVar22 = y3i.f54824a;
                nqbVar.mo40923c(null);
                c13558a.f24091a = null;
                c13558a.f24092b = null;
                c13558a.f24093c = null;
                c13558a.f24096f = 4;
                objMo21334s = cl3Var3.mo21334s(c13558a);
                if (objMo21334s == objM51918f) {
                }
                Object objM53359j32 = ((vre) objMo21334s).m53359j();
                wre.m54934b(objM53359j32);
                return objM53359j32;
            case 4:
                wre.m54934b(objMo21334s);
                Object objM53359j322 = ((vre) objMo21334s).m53359j();
                wre.m54934b(objM53359j322);
                return objM53359j322;
            case 5:
                cl3Var2 = (cl3) c13558a.f24091a;
                try {
                    wre.m54934b(objMo21334s);
                    objM53351b = vre.m53351b(objMo21334s);
                } catch (Throwable th4) {
                    th = th4;
                    vre.C17665a c17665a22 = vre.f50797b;
                    objM53351b = vre.m53351b(wre.m54933a(th));
                    cl3Var2.complete(vre.m53350a(objM53351b));
                    c13558a.f24091a = null;
                    c13558a.f24092b = null;
                    c13558a.f24096f = 6;
                    objMo21334s = cl3Var2.mo21334s(c13558a);
                    if (objMo21334s == objM51918f) {
                    }
                    Object objM53359j222 = ((vre) objMo21334s).m53359j();
                    wre.m54934b(objM53359j222);
                    return objM53359j222;
                }
                cl3Var2.complete(vre.m53350a(objM53351b));
                c13558a.f24091a = null;
                c13558a.f24092b = null;
                c13558a.f24096f = 6;
                objMo21334s = cl3Var2.mo21334s(c13558a);
                if (objMo21334s == objM51918f) {
                }
                Object objM53359j2222 = ((vre) objMo21334s).m53359j();
                wre.m54934b(objM53359j2222);
                return objM53359j2222;
            case 6:
                wre.m54934b(objMo21334s);
                Object objM53359j22222 = ((vre) objMo21334s).m53359j();
                wre.m54934b(objM53359j22222);
                return objM53359j22222;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
