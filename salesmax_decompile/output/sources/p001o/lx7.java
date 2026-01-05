package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import org.apache.http.HttpHeaders;
import p001o.m28;
import p001o.rx7;

/* loaded from: classes3.dex */
public final class lx7 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public rx7 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            mx7.m39757b(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        rx7.C16675a c16675a = new rx7.C16675a();
        c16675a.m47230L((String) g48VarM41347f.getHeaders().get("accept-ranges"));
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-archive-status");
        c16675a.m47231M(str != null ? fo0.f23748a.m27163a(str) : null);
        String str2 = (String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-bucket-key-enabled");
        c16675a.m47232N(str2 != null ? Boolean.valueOf(Boolean.parseBoolean(str2)) : null);
        c16675a.m47233O((String) g48VarM41347f.getHeaders().get("Cache-Control"));
        c16675a.m47234P((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32"));
        c16675a.m47235Q((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32c"));
        c16675a.m47236R((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha1"));
        c16675a.m47237S((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha256"));
        c16675a.m47238T((String) g48VarM41347f.getHeaders().get(ObjectMetadata.CONTENT_DISPOSITION));
        c16675a.m47239U((String) g48VarM41347f.getHeaders().get("Content-Encoding"));
        c16675a.m47240V((String) g48VarM41347f.getHeaders().get(HttpHeaders.CONTENT_LANGUAGE));
        String str3 = (String) g48VarM41347f.getHeaders().get("Content-Length");
        c16675a.m47241W(str3 != null ? Long.valueOf(Long.parseLong(str3)) : null);
        c16675a.m47242X((String) g48VarM41347f.getHeaders().get("Content-Type"));
        String str4 = (String) g48VarM41347f.getHeaders().get("x-amz-delete-marker");
        c16675a.m47243Y(str4 != null ? Boolean.valueOf(Boolean.parseBoolean(str4)) : null);
        c16675a.m47244Z((String) g48VarM41347f.getHeaders().get(HttpHeaders.ETAG));
        c16675a.a0((String) g48VarM41347f.getHeaders().get("x-amz-expiration"));
        String str5 = (String) g48VarM41347f.getHeaders().get(HttpHeaders.EXPIRES);
        c16675a.b0(str5 != null ? gk8.f25374b.m28961e(str5) : null);
        c16675a.c0((String) g48VarM41347f.getHeaders().get("ExpiresString"));
        String str6 = (String) g48VarM41347f.getHeaders().get(HttpHeaders.LAST_MODIFIED);
        c16675a.d0(str6 != null ? gk8.f25374b.m28961e(str6) : null);
        String str7 = (String) g48VarM41347f.getHeaders().get("x-amz-missing-meta");
        c16675a.f0(str7 != null ? Integer.valueOf(Integer.parseInt(str7)) : null);
        String str8 = (String) g48VarM41347f.getHeaders().get("x-amz-object-lock-legal-hold");
        c16675a.g0(str8 != null ? m6c.f34854a.m38412a(str8) : null);
        String str9 = (String) g48VarM41347f.getHeaders().get("x-amz-object-lock-mode");
        c16675a.h0(str9 != null ? n6c.f36441a.m40145a(str9) : null);
        String str10 = (String) g48VarM41347f.getHeaders().get("x-amz-object-lock-retain-until-date");
        c16675a.i0(str10 != null ? gk8.f25374b.m28960d(str10) : null);
        String str11 = (String) g48VarM41347f.getHeaders().get("x-amz-mp-parts-count");
        c16675a.j0(str11 != null ? Integer.valueOf(Integer.parseInt(str11)) : null);
        String str12 = (String) g48VarM41347f.getHeaders().get("x-amz-replication-status");
        c16675a.k0(str12 != null ? vke.f50471a.m52901a(str12) : null);
        String str13 = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c16675a.l0(str13 != null ? ame.f14997a.m17462a(str13) : null);
        c16675a.m0((String) g48VarM41347f.getHeaders().get("x-amz-restore"));
        c16675a.o0((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-algorithm"));
        c16675a.p0((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-key-MD5"));
        c16675a.q0((String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID));
        String str14 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        c16675a.n0(str14 != null ? dgf.f19804a.m23075a(str14) : null);
        String str15 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.STORAGE_CLASS);
        c16675a.r0(str15 != null ? h6g.f26258a.m29845a(str15) : null);
        c16675a.s0((String) g48VarM41347f.getHeaders().get("x-amz-version-id"));
        c16675a.t0((String) g48VarM41347f.getHeaders().get(ObjectMetadata.REDIRECT_LOCATION));
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
            c16675a.e0(linkedHashMap);
        } else {
            c16675a.e0(isa.m32681h());
        }
        c16675a.m47246b();
        return c16675a.m47245a();
    }
}
