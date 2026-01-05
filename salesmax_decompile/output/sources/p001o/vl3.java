package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import p001o.bm3;
import p001o.m28;

/* loaded from: classes3.dex */
public final class vl3 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bm3 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            wl3.m54677d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        bm3.C12452a c12452a = new bm3.C12452a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-bucket-key-enabled");
        c12452a.m19361r(str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null);
        c12452a.m19367x((String) g48VarM41347f.getHeaders().get("x-amz-expiration"));
        String str2 = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c12452a.m19340A(str2 != null ? ame.f14997a.m17462a(str2) : null);
        c12452a.m19342C((String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID));
        String str3 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        c12452a.m19341B(str3 != null ? dgf.f19804a.m23075a(str3) : null);
        c12452a.m19343D((String) g48VarM41347f.getHeaders().get("x-amz-version-id"));
        if (bArr != null) {
            wl3.m54676c(c12452a, bArr);
        }
        c12452a.m19345b();
        return c12452a.m19344a();
    }
}
