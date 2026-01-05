package com.amplifyframework.storage.s3.transfer;

import jc.AbstractC3745u;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5927h;
import tc.C7117b;
import tc.InterfaceC7116a;
import uw.InterfaceC7559c;
import zb.InterfaceC8913g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UploadProgressListenerInterceptor extends ProgressListenerInterceptor {
    private final ProgressListener progressListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressListenerInterceptor(ProgressListener progressListener) {
        super(progressListener);
        AbstractC4154l.m8923f(progressListener, "progressListener");
        this.progressListener = progressListener;
    }

    @Override // com.amplifyframework.storage.s3.transfer.ProgressListenerInterceptor, zb.InterfaceC8909c
    public Object modifyBeforeTransmit(InterfaceC8913g interfaceC8913g, InterfaceC7559c<? super InterfaceC7116a> interfaceC7559c) {
        C7117b c7117bM11670b = AbstractC5927h.m11670b(interfaceC8913g.mo12204d());
        AbstractC3745u abstractC3745uConvertBodyWithProgressUpdates = convertBodyWithProgressUpdates(c7117bM11670b.f34313d);
        AbstractC4154l.m8923f(abstractC3745uConvertBodyWithProgressUpdates, "<set-?>");
        c7117bM11670b.f34313d = abstractC3745uConvertBodyWithProgressUpdates;
        return c7117bM11670b.m13401a();
    }
}
