package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import p001o.m28;
import p001o.na4;

/* loaded from: classes3.dex */
public final class ja4 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public na4 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            ka4.m35224d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        na4.C15531a c15531a = new na4.C15531a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-bucket-key-enabled");
        c15531a.m40273h(str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null);
        c15531a.m40276k((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-context"));
        c15531a.m40277l((String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID));
        String str2 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        c15531a.m40275j(str2 != null ? dgf.f19804a.m23075a(str2) : null);
        if (bArr != null) {
            ka4.m35223c(c15531a, bArr);
        }
        c15531a.m40267b();
        return c15531a.m40266a();
    }
}
