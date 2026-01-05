package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import p001o.c1f;
import p001o.sq8;
import p001o.xca;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes2.dex */
public final class C2152u implements InterfaceC2142k {

    /* renamed from: a */
    public final c1f f7758a;

    public C2152u(c1f c1fVar) {
        sq8.m48649h(c1fVar, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        this.f7758a = c1fVar;
    }

    @Override // androidx.lifecycle.InterfaceC2142k
    /* renamed from: o */
    public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(xcaVar, "source");
        sq8.m48649h(aVar, "event");
        if (aVar == AbstractC2139h.a.ON_CREATE) {
            xcaVar.getLifecycle().mo6524d(this);
            this.f7758a.m20071d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
