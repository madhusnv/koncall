package com.amplifyframework.storage.s3.transfer;

import p001o.c2e;
import p001o.f48;
import p001o.n64;
import p001o.sq8;
import p001o.y38;
import p001o.z38;

/* loaded from: classes5.dex */
public final class UploadProgressListenerInterceptor extends ProgressListenerInterceptor {
    private final ProgressListener progressListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressListenerInterceptor(ProgressListener progressListener) {
        super(progressListener);
        sq8.m48649h(progressListener, "progressListener");
        this.progressListener = progressListener;
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor, p001o.sn8
    public Object modifyBeforeTransmit(c2e c2eVar, n64 n64Var) {
        z38 z38VarM26053c = f48.m26053c((y38) c2eVar.mo20099c());
        z38VarM26053c.m58672i(convertBodyWithProgressUpdates(z38VarM26053c.m58667d()));
        return z38VarM26053c.m58665b();
    }
}
