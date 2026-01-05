package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import org.apache.http.HttpHeaders;
import p001o.m28;
import p001o.t3e;

/* loaded from: classes3.dex */
public final class o3e implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t3e mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            p3e.m42951b(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        t3e.C16982a c16982a = new t3e.C16982a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-bucket-key-enabled");
        c16982a.m49244r(str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null);
        c16982a.m49245s((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32"));
        c16982a.m49246t((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32c"));
        c16982a.m49247u((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha1"));
        c16982a.m49248v((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha256"));
        c16982a.m49249w((String) g48VarM41347f.getHeaders().get(HttpHeaders.ETAG));
        c16982a.m49250x((String) g48VarM41347f.getHeaders().get("x-amz-expiration"));
        String str2 = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c16982a.m49251y(str2 != null ? ame.f14997a.m17462a(str2) : null);
        c16982a.m49222B((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-algorithm"));
        c16982a.m49223C((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-key-MD5"));
        c16982a.m49224D((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-context"));
        c16982a.m49225E((String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID));
        String str3 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        c16982a.m49252z(str3 != null ? dgf.f19804a.m23075a(str3) : null);
        String str4 = (String) g48VarM41347f.getHeaders().get("x-amz-object-size");
        c16982a.m49221A(str4 != null ? Long.valueOf(Long.parseLong(str4)) : null);
        c16982a.m49226F((String) g48VarM41347f.getHeaders().get("x-amz-version-id"));
        c16982a.m49228b();
        return c16982a.m49227a();
    }
}
