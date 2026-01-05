package p001o;

import com.amplifyframework.storage.ObjectMetadata;
import p001o.da4;
import p001o.m28;

/* loaded from: classes3.dex */
public final class y94 implements m28.InterfaceC15203a {
    @Override // p001o.m28.InterfaceC15203a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public da4 mo16296b(jl6 jl6Var, o18 o18Var, byte[] bArr) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(o18Var, "call");
        g48 g48VarM41347f = o18Var.m41347f();
        if (!t48.m49282c(g48VarM41347f.getStatus())) {
            z94.m58974d(jl6Var, o18Var, bArr);
            throw new qe9();
        }
        da4.C12851a c12851a = new da4.C12851a();
        String str = (String) g48VarM41347f.getHeaders().get("x-amz-abort-date");
        c12851a.m22666p(str != null ? gk8.f25374b.m28961e(str) : null);
        c12851a.m22667q((String) g48VarM41347f.getHeaders().get("x-amz-abort-rule-id"));
        String str2 = (String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-bucket-key-enabled");
        c12851a.m22669s(str2 != null ? Boolean.valueOf(Boolean.parseBoolean(str2)) : null);
        String str3 = (String) g48VarM41347f.getHeaders().get("x-amz-checksum-algorithm");
        c12851a.m22670t(str3 != null ? t83.f46609a.m49557a(str3) : null);
        String str4 = (String) g48VarM41347f.getHeaders().get("x-amz-request-charged");
        c12851a.m22672v(str4 != null ? ame.f14997a.m17462a(str4) : null);
        c12851a.m22674x((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-algorithm"));
        c12851a.m22675y((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-customer-key-MD5"));
        c12851a.m22676z((String) g48VarM41347f.getHeaders().get("x-amz-server-side-encryption-context"));
        c12851a.m22649A((String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION_KMS_KEY_ID));
        String str5 = (String) g48VarM41347f.getHeaders().get(ObjectMetadata.SERVER_SIDE_ENCRYPTION);
        c12851a.m22673w(str5 != null ? dgf.f19804a.m23075a(str5) : null);
        if (bArr != null) {
            z94.m58973c(c12851a, bArr);
        }
        c12851a.m22652b();
        return c12851a.m22651a();
    }
}
