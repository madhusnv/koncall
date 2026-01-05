package com.amplifyframework.storage.s3.service;

import bd.C0645a;
import ex.InterfaceC2141e;
import gb.C2552b;
import gb.InterfaceC2556f;
import hq.C3009n;
import mb.j0;
import mb.k0;
import nf.C5047i;
import ob.C5333a;
import og.bb;
import og.od;
import oj.C5392d;
import ox.C5770a;
import ox.EnumC5772c;
import pb.AbstractC5870b;
import qw.a0;
import sc.AbstractC6791k;
import tb.AbstractC7107r;
import tb.C7105p;
import tc.C7117b;
import tc.InterfaceC7116a;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.service.AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1", m15344f = "AWSS3StorageService.kt", m15345l = {80}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1 extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ int $expires;
    final /* synthetic */ InterfaceC2556f $it;
    final /* synthetic */ String $serviceKey;
    int label;
    final /* synthetic */ AWSS3StorageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1(InterfaceC2556f interfaceC2556f, int i10, AWSS3StorageService aWSS3StorageService, String str, InterfaceC7559c<? super AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$it = interfaceC2556f;
        this.$expires = i10;
        this.this$0 = aWSS3StorageService;
        this.$serviceKey = str;
    }

    private static final a0 invokeSuspend$lambda$0(AWSS3StorageService aWSS3StorageService, String str, j0 j0Var) {
        j0Var.f23258a = aWSS3StorageService.s3BucketName;
        j0Var.f23259b = str;
        return a0.f30746a;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1(this.$it, this.$expires, this.this$0, this.$serviceKey, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        InterfaceC2556f interfaceC2556f = this.$it;
        AWSS3StorageService aWSS3StorageService = this.this$0;
        String str = this.$serviceKey;
        j0 j0Var = new j0();
        invokeSuspend$lambda$0(aWSS3StorageService, str, j0Var);
        k0 k0Var = new k0(j0Var);
        int i11 = C5770a.f28335d;
        long jM10551g = bb.m10551g(this.$expires, EnumC5772c.SECONDS);
        this.label = 1;
        C5333a c5333a = new C5333a(0, jM10551g);
        C7105p c7105p = AbstractC7107r.f34293a;
        C0645a c0645a = new C0645a();
        c0645a.mo1862b(AbstractC8923q.f42882a, "GetObject");
        c0645a.mo1862b(AbstractC6791k.f32295d, k0Var);
        C7117b c7117bM11113l = C5392d.m11113l(c0645a, k0Var);
        C2552b c2552b = (C2552b) interfaceC2556f;
        Object objM11499b = AbstractC5870b.m11499b(c7117bM11113l, c0645a, c2552b.f13884a.f13940j, new C5047i(c2552b.f13884a), c7105p, new C3009n(16, interfaceC2556f, c5333a), this);
        return objM11499b == enumC7794a ? enumC7794a : objM11499b;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
        return ((AWSS3StorageService$getPresignedUrl$presignUrlRequest$2$1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
