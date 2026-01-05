package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import org.apache.http.HttpHeaders;
import p001o.d7i;
import p001o.m28;

/* loaded from: classes3.dex */
public final class x6i implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7i mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            y6i.m57320b(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        d7i.C12807a c12807a = new d7i.C12807a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-bucket-key-enabled");
        c12807a.m22474n(str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null);
        c12807a.m22475o((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32"));
        c12807a.m22476p((String) g48VarM41347f.getHeaders().get("x-amz-checksum-crc32c"));
        c12807a.m22477q((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha1"));
        c12807a.m22478r((String) g48VarM41347f.getHeaders().get("x-amz-checksum-sha256"));
        c12807a.m22479s((String) g48VarM41347f.getHeaders().get(HttpHeaders.ETAG));
        String str2 = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c12807a.m22480t(str2 != null ? ame.f14997a.m17462a(str2) : null);
        c12807a.m22482v((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-algorithm"));
        c12807a.m22483w((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-key-MD5"));
        c12807a.m22484x((String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID));
        String str3 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        c12807a.m22481u(str3 != null ? dgf.f19804a.m23075a(str3) : null);
        c12807a.m22462b();
        return c12807a.m22461a();
    }
}
