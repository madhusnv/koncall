package com.amplifyframework.storage.s3.transfer;

import p001o.e2e;
import p001o.g48;
import p001o.j48;
import p001o.n64;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class DownloadProgressListenerInterceptor extends ProgressListenerInterceptor {
    private final ProgressListener progressListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadProgressListenerInterceptor(ProgressListener progressListener) {
        super(progressListener);
        sq8.m48649h(progressListener, "progressListener");
        this.progressListener = progressListener;
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor, p001o.sn8
    public Object modifyBeforeDeserialization(e2e e2eVar, n64 n64Var) {
        return j48.m33187b(((g48) e2eVar.mo24161d()).getStatus(), ((g48) e2eVar.mo24161d()).getHeaders(), convertBodyWithProgressUpdates(((g48) e2eVar.mo24161d()).getBody()));
    }
}
