package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.k16;
import p001o.xa9;

/* loaded from: classes2.dex */
public abstract class q2g {

    /* renamed from: o.q2g$a */
    public static final class C16274a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f41177a;

        /* renamed from: b */
        public int f41178b;

        public C16274a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f41177a = obj;
            this.f41178b |= Integer.MIN_VALUE;
            return q2g.m44751g(null, null, this);
        }
    }

    /* renamed from: c */
    public static final h2g m44747c(byte[] bArr) {
        gk8 gk8VarM28960d;
        sq8.m48649h(bArr, "json");
        qa9 qa9VarM46476a = ra9.m46476a(bArr);
        try {
            xa9 xa9VarNextToken = qa9VarM46476a.nextToken();
            if (xa9VarNextToken.getClass() != xa9.C18086b.class) {
                throw new an5("expected " + kge.m35689b(xa9.C18086b.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
            }
            String strM55894a = null;
            String strM55894a2 = null;
            String strM55894a3 = null;
            String strM55894a4 = null;
            String strM55894a5 = null;
            gk8 gk8VarM28960d2 = null;
            String strM55894a6 = null;
            String strM55894a7 = null;
            while (true) {
                xa9 xa9VarNextToken2 = qa9VarM46476a.nextToken();
                if (xa9VarNextToken2 instanceof xa9.C18090f) {
                    if (strM55894a2 == null) {
                        throw new av8("missing `accessToken`", null, 2, null);
                    }
                    if (strM55894a == null || (gk8VarM28960d = gk8.f25374b.m28960d(strM55894a)) == null) {
                        throw new av8("missing `expiresAt`", null, 2, null);
                    }
                    return new h2g(strM55894a2, gk8VarM28960d, strM55894a3, strM55894a4, strM55894a5, gk8VarM28960d2, strM55894a6, strM55894a7);
                }
                if (!(xa9VarNextToken2 instanceof xa9.C18091g)) {
                    throw new IllegalStateException("expected either key or end of object".toString());
                }
                String strM55892a = ((xa9.C18091g) xa9VarNextToken2).m55892a();
                switch (strM55892a.hashCode()) {
                    case -1446909349:
                        if (strM55892a.equals("clientSecret")) {
                            xa9 xa9VarNextToken3 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken3.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken3.getClass()));
                            }
                            strM55894a5 = ((xa9.C18094j) xa9VarNextToken3).m55894a();
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    case -1311790642:
                        if (strM55892a.equals("registrationExpiresAt")) {
                            xa9 xa9VarNextToken4 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken4.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken4.getClass()));
                            }
                            gk8VarM28960d2 = gk8.f25374b.m28960d(((xa9.C18094j) xa9VarNextToken4).m55894a());
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    case -1042689291:
                        if (strM55892a.equals("accessToken")) {
                            xa9 xa9VarNextToken5 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken5.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken5.getClass()));
                            }
                            strM55894a2 = ((xa9.C18094j) xa9VarNextToken5).m55894a();
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    case -934795532:
                        if (strM55892a.equals(TransferTable.COLUMN_REGION)) {
                            xa9 xa9VarNextToken6 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken6.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken6.getClass()));
                            }
                            strM55894a6 = ((xa9.C18094j) xa9VarNextToken6).m55894a();
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    case -56506402:
                        if (strM55892a.equals("refreshToken")) {
                            xa9 xa9VarNextToken7 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken7.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken7.getClass()));
                            }
                            strM55894a3 = ((xa9.C18094j) xa9VarNextToken7).m55894a();
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    case 250196615:
                        if (strM55892a.equals("expiresAt")) {
                            xa9 xa9VarNextToken8 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken8.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken8.getClass()));
                            }
                            strM55894a = ((xa9.C18094j) xa9VarNextToken8).m55894a();
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    case 908408390:
                        if (strM55892a.equals("clientId")) {
                            xa9 xa9VarNextToken9 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken9.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken9.getClass()));
                            }
                            strM55894a4 = ((xa9.C18094j) xa9VarNextToken9).m55894a();
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    case 1316787629:
                        if (strM55892a.equals("startUrl")) {
                            xa9 xa9VarNextToken10 = qa9VarM46476a.nextToken();
                            if (xa9VarNextToken10.getClass() != xa9.C18094j.class) {
                                throw new an5("expected " + kge.m35689b(xa9.C18094j.class) + "; found " + kge.m35689b(xa9VarNextToken10.getClass()));
                            }
                            strM55894a7 = ((xa9.C18094j) xa9VarNextToken10).m55894a();
                        } else {
                            qa9VarM46476a.mo41841a();
                        }
                    default:
                        qa9VarM46476a.mo41841a();
                }
            }
        } catch (Exception e) {
            throw new av8("invalid cached SSO token", e);
        }
    }

    /* renamed from: d */
    public static final String m44748d(r9d r9dVar, String... strArr) {
        sq8.m48649h(r9dVar, "<this>");
        sq8.m48649h(strArr, "parts");
        return gp0.r0(strArr, r9dVar.mo18078h(), null, null, 0, null, null, 62, null);
    }

    /* renamed from: e */
    public static final String m44749e(String str) {
        sq8.m48649h(str, "cacheKey");
        return gy7.m29642b(nkf.m40728a(e9g.m24603u(str))) + ".json";
    }

    /* renamed from: f */
    public static final boolean m44750f(h2g h2gVar) {
        return (h2gVar.m29764g() == null || h2gVar.m29765h() == null || h2gVar.m29766i() == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m44751g(String str, r9d r9dVar, n64 n64Var) {
        C16274a c16274a;
        if (n64Var instanceof C16274a) {
            c16274a = (C16274a) n64Var;
            int i = c16274a.f41178b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16274a.f41178b = i - Integer.MIN_VALUE;
            } else {
                c16274a = new C16274a(n64Var);
            }
        }
        Object objMo18076d = c16274a.f41177a;
        Object objM51918f = uq8.m51918f();
        int i2 = c16274a.f41178b;
        if (i2 == 0) {
            wre.m54934b(objMo18076d);
            String strM44748d = m44748d(r9dVar, n71.m40196f(m44748d(r9dVar, "~", ".aws", "sso", "cache"), r9dVar), m44749e(str));
            c16274a.f41178b = 1;
            objMo18076d = r9dVar.mo18076d(strM44748d, c16274a);
            if (objMo18076d == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo18076d);
        }
        byte[] bArr = (byte[]) objMo18076d;
        if (bArr != null) {
            return m44747c(bArr);
        }
        throw new n2e("Invalid or missing SSO session cache. Run `aws sso login` to initiate a new SSO session", null, 2, null);
    }

    /* renamed from: h */
    public static final byte[] m44752h(h2g h2gVar) {
        sq8.m48649h(h2gVar, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sa9 sa9VarM49649a = ta9.m49649a(true);
        sa9VarM49649a.beginObject();
        sa9VarM49649a.mo43177g("accessToken");
        sa9VarM49649a.mo43178h(h2gVar.getToken());
        sa9VarM49649a.mo43177g("expiresAt");
        gk8 gk8VarMo29762c = h2gVar.mo29762c();
        vmh vmhVar = vmh.ISO_8601;
        sa9VarM49649a.mo43178h(gk8VarMo29762c.m28951d(vmhVar));
        m44754j(sa9VarM49649a, "refreshToken", h2gVar.m29766i());
        m44754j(sa9VarM49649a, "clientId", h2gVar.m29764g());
        m44754j(sa9VarM49649a, "clientSecret", h2gVar.m29765h());
        gk8 gk8VarM29768k = h2gVar.m29768k();
        m44754j(sa9VarM49649a, "registrationExpiresAt", gk8VarM29768k != null ? gk8VarM29768k.m28951d(vmhVar) : null);
        m44754j(sa9VarM49649a, TransferTable.COLUMN_REGION, h2gVar.m29767j());
        m44754j(sa9VarM49649a, "startUrl", h2gVar.m29769l());
        sa9VarM49649a.endObject();
        byte[] bArrMo43171a = sa9VarM49649a.mo43171a();
        if (bArrMo43171a != null) {
            return bArrMo43171a;
        }
        throw new IllegalStateException("serializing SsoToken failed".toString());
    }

    /* renamed from: i */
    public static final h2g m44753i(ta4 ta4Var, h2g h2gVar, hb3 hb3Var) {
        String strM49611a = ta4Var.m49611a();
        if (strM49611a == null) {
            throw new IllegalStateException("missing accessToken from CreateTokenResponse".toString());
        }
        gk8 gk8VarMo30148a = hb3Var.mo30148a();
        k16.C14700a c14700a = k16.f31358b;
        return h2gVar.m29763e((248 & 1) != 0 ? h2gVar.f26132b : strM49611a, (248 & 2) != 0 ? h2gVar.f26133c : gk8VarMo30148a.m28956m(m16.m38175s(ta4Var.m49612b(), o16.SECONDS)), (248 & 4) != 0 ? h2gVar.f26134d : ta4Var.m49613c(), (248 & 8) != 0 ? h2gVar.f26135e : null, (248 & 16) != 0 ? h2gVar.f26136f : null, (248 & 32) != 0 ? h2gVar.f26137g : null, (248 & 64) != 0 ? h2gVar.f26138h : null, (248 & 128) != 0 ? h2gVar.f26139i : null);
    }

    /* renamed from: j */
    public static final void m44754j(sa9 sa9Var, String str, String str2) {
        if (str2 == null) {
            return;
        }
        sa9Var.mo43177g(str);
        sa9Var.mo43178h(str2);
    }
}
