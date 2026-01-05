package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.auth.AuthCredentialsProvider;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.configuration.StorageAccessLevelAwarePrefixResolver$resolvePrefix$identityId$1$1", m15344f = "AWSS3PluginPrefixResolver.kt", m15345l = {62}, m15346m = "invokeSuspend")
/* renamed from: com.amplifyframework.storage.s3.configuration.StorageAccessLevelAwarePrefixResolver$resolvePrefix$identityId$1$1 */
/* loaded from: classes.dex */
public final class C1231xea76060c extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ StorageAccessLevelAwarePrefixResolver $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231xea76060c(StorageAccessLevelAwarePrefixResolver storageAccessLevelAwarePrefixResolver, InterfaceC7559c<? super C1231xea76060c> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$this_runCatching = storageAccessLevelAwarePrefixResolver;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new C1231xea76060c(this.$this_runCatching, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        AuthCredentialsProvider authCredentialsProvider = this.$this_runCatching.authCredentialsProvider;
        this.label = 1;
        Object identityId = authCredentialsProvider.getIdentityId(this);
        return identityId == enumC7794a ? enumC7794a : identityId;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super String> interfaceC7559c) {
        return ((C1231xea76060c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
