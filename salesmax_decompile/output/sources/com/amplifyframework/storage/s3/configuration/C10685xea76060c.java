package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.auth.AuthCredentialsProvider;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.storage.s3.configuration.StorageAccessLevelAwarePrefixResolver$resolvePrefix$identityId$1$1", m36648f = "AWSS3PluginPrefixResolver.kt", m36649l = {62}, m36650m = "invokeSuspend")
/* renamed from: com.amplifyframework.storage.s3.configuration.StorageAccessLevelAwarePrefixResolver$resolvePrefix$identityId$1$1 */
/* loaded from: classes5.dex */
public final class C10685xea76060c extends jgg implements nl7 {
    final /* synthetic */ StorageAccessLevelAwarePrefixResolver $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10685xea76060c(StorageAccessLevelAwarePrefixResolver storageAccessLevelAwarePrefixResolver, n64 n64Var) {
        super(2, n64Var);
        this.$this_runCatching = storageAccessLevelAwarePrefixResolver;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new C10685xea76060c(this.$this_runCatching, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            AuthCredentialsProvider authCredentialsProvider = this.$this_runCatching.authCredentialsProvider;
            this.label = 1;
            obj = authCredentialsProvider.getIdentityId(this);
            if (obj == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        return obj;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((C10685xea76060c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
