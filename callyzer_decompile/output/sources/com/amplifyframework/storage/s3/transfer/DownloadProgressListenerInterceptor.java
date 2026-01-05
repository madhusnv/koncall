package com.amplifyframework.storage.s3.transfer;

import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5945z;
import uc.C7394a;
import uw.InterfaceC7559c;
import zb.InterfaceC8914h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DownloadProgressListenerInterceptor extends ProgressListenerInterceptor {
    private final ProgressListener progressListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadProgressListenerInterceptor(ProgressListener progressListener) {
        super(progressListener);
        AbstractC4154l.m8923f(progressListener, "progressListener");
        this.progressListener = progressListener;
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor, zb.InterfaceC8909c
    public Object modifyBeforeDeserialization(InterfaceC8914h interfaceC8914h, InterfaceC7559c<? super C7394a> interfaceC7559c) {
        return AbstractC5945z.m11956a(interfaceC8914h.mo12201a().f35158a, interfaceC8914h.mo12201a().f35159b, convertBodyWithProgressUpdates(interfaceC8914h.mo12201a().f35160c));
    }
}
