package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import org.apache.http.HttpHeaders;
import p001o.m28;
import p001o.xq7;

/* loaded from: classes3.dex */
public final class rq7 implements m28.InterfaceC15204b {

    /* renamed from: o.rq7$a */
    public static final class C16650a extends o64 {

        /* renamed from: a */
        public Object f43954a;

        /* renamed from: b */
        public Object f43955b;

        /* renamed from: c */
        public /* synthetic */ Object f43956c;

        /* renamed from: e */
        public int f43958e;

        public C16650a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f43956c = obj;
            this.f43958e |= Integer.MIN_VALUE;
            return rq7.this.mo38219a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.m28.InterfaceC15204b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo38219a(jl6 jl6Var, o18 o18Var, n64 n64Var) throws Throwable {
        C16650a c16650a;
        if (n64Var instanceof C16650a) {
            c16650a = (C16650a) n64Var;
            int i = c16650a.f43958e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16650a.f43958e = i - Integer.MIN_VALUE;
            } else {
                c16650a = new C16650a(n64Var);
            }
        }
        Object objM39980a = c16650a.f43956c;
        Object objM51918f = uq8.m51918f();
        int i2 = c16650a.f43958e;
        if (i2 == 0) {
            wre.m54934b(objM39980a);
            g48 g48VarM41347f = o18Var.m41347f();
            if (t48.m49282c(g48VarM41347f.getStatus())) {
                xq7.C18221a c18221a = new xq7.C18221a();
                c18221a.m56622N((String) g48VarM41347f.getHeaders().get("accept-ranges"));
                String str = (String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-bucket-key-enabled");
                c18221a.m56624P(str != null ? ml1.m39301a(Boolean.parseBoolean(str)) : null);
                c18221a.m56625Q((String) g48VarM41347f.getHeaders().get("Cache-Control"));
                c18221a.m56626R((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32"));
                c18221a.m56627S((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32c"));
                c18221a.m56628T((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha1"));
                c18221a.m56629U((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha256"));
                c18221a.m56630V((String) g48VarM41347f.getHeaders().get(ObjectMetadata.CONTENT_DISPOSITION));
                c18221a.m56631W((String) g48VarM41347f.getHeaders().get("Content-Encoding"));
                c18221a.m56632X((String) g48VarM41347f.getHeaders().get(HttpHeaders.CONTENT_LANGUAGE));
                String str2 = (String) g48VarM41347f.getHeaders().get("Content-Length");
                c18221a.m56633Y(str2 != null ? ml1.m39305e(Long.parseLong(str2)) : null);
                c18221a.m56634Z((String) g48VarM41347f.getHeaders().get(HttpHeaders.CONTENT_RANGE));
                c18221a.a0((String) g48VarM41347f.getHeaders().get("Content-Type"));
                String str3 = (String) g48VarM41347f.getHeaders().get("x-amz-delete-marker");
                c18221a.b0(str3 != null ? ml1.m39301a(Boolean.parseBoolean(str3)) : null);
                c18221a.c0((String) g48VarM41347f.getHeaders().get(HttpHeaders.ETAG));
                c18221a.d0((String) g48VarM41347f.getHeaders().get("x-amz-expiration"));
                String str4 = (String) g48VarM41347f.getHeaders().get(HttpHeaders.EXPIRES);
                c18221a.e0(str4 != null ? gk8.f25374b.m28961e(str4) : null);
                c18221a.f0((String) g48VarM41347f.getHeaders().get("ExpiresString"));
                String str5 = (String) g48VarM41347f.getHeaders().get(HttpHeaders.LAST_MODIFIED);
                c18221a.g0(str5 != null ? gk8.f25374b.m28961e(str5) : null);
                String str6 = (String) g48VarM41347f.getHeaders().get("x-amz-missing-meta");
                c18221a.i0(str6 != null ? ml1.m39304d(Integer.parseInt(str6)) : null);
                String str7 = (String) g48VarM41347f.getHeaders().get("x-amz-object-lock-legal-hold");
                c18221a.j0(str7 != null ? m6c.f34854a.m38412a(str7) : null);
                String str8 = (String) g48VarM41347f.getHeaders().get("x-amz-object-lock-mode");
                c18221a.k0(str8 != null ? n6c.f36441a.m40145a(str8) : null);
                String str9 = (String) g48VarM41347f.getHeaders().get("x-amz-object-lock-retain-until-date");
                c18221a.l0(str9 != null ? gk8.f25374b.m28960d(str9) : null);
                String str10 = (String) g48VarM41347f.getHeaders().get("x-amz-mp-parts-count");
                c18221a.m0(str10 != null ? ml1.m39304d(Integer.parseInt(str10)) : null);
                String str11 = (String) g48VarM41347f.getHeaders().get("x-amz-replication-status");
                c18221a.n0(str11 != null ? vke.f50471a.m52901a(str11) : null);
                String str12 = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
                c18221a.o0(str12 != null ? ame.f14997a.m17462a(str12) : null);
                c18221a.p0((String) g48VarM41347f.getHeaders().get("x-amz-restore"));
                c18221a.r0((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-algorithm"));
                c18221a.s0((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-key-MD5"));
                c18221a.t0((String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID));
                String str13 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
                c18221a.q0(str13 != null ? dgf.f19804a.m23075a(str13) : null);
                String str14 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.STORAGE_CLASS);
                c18221a.u0(str14 != null ? h6g.f26258a.m29845a(str14) : null);
                String str15 = (String) g48VarM41347f.getHeaders().get("x-amz-tagging-count");
                c18221a.v0(str15 != null ? ml1.m39304d(Integer.parseInt(str15)) : null);
                c18221a.w0((String) g48VarM41347f.getHeaders().get("x-amz-version-id"));
                c18221a.x0((String) g48VarM41347f.getHeaders().get(ObjectMetadata.REDIRECT_LOCATION));
                Set setNames = g48VarM41347f.getHeaders().names();
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj : setNames) {
                    if (e9g.m24597K((String) obj, "x-amz-meta-", false, 2, null)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str16 : arrayList) {
                        String str17 = (String) g48VarM41347f.getHeaders().get(str16);
                        if (str17 != null) {
                            linkedHashMap.put(f9g.u0(str16, "x-amz-meta-"), str17);
                        }
                    }
                    c18221a.h0(linkedHashMap);
                } else {
                    c18221a.h0(isa.m32681h());
                }
                c18221a.m56623O(n18.m39981b(g48VarM41347f.getBody()));
                c18221a.m56636b();
                return c18221a.m56635a();
            }
            m18 body = g48VarM41347f.getBody();
            c16650a.f43954a = jl6Var;
            c16650a.f43955b = o18Var;
            c16650a.f43958e = 1;
            objM39980a = n18.m39980a(body, c16650a);
            if (objM39980a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o18Var = (o18) c16650a.f43955b;
            jl6Var = (jl6) c16650a.f43954a;
            wre.m54934b(objM39980a);
        }
        sq7.m48641b(jl6Var, o18Var, (byte[]) objM39980a);
        throw new qe9();
    }
}
