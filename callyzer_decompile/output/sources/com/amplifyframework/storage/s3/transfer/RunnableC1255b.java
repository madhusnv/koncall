package com.amplifyframework.storage.s3.transfer;

import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import i0.AbstractC3084o;
import i0.C3088s;
import i0.InterfaceC3093x;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import p004e.C1876k;
import p007h.C2753e;
import p007h.InterfaceC2750b;
import p020v.C7597g;
import p020v.C7607q;
import ub.C7392h;
import uf.C7427b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.storage.s3.transfer.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1255b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5929a;

    /* renamed from: b */
    public final /* synthetic */ int f5930b;

    /* renamed from: c */
    public final /* synthetic */ Object f5931c;

    /* renamed from: d */
    public final /* synthetic */ Object f5932d;

    public /* synthetic */ RunnableC1255b(TransferStatusUpdater transferStatusUpdater, int i10, TransferListener transferListener) {
        this.f5929a = 1;
        this.f5932d = transferStatusUpdater;
        this.f5930b = i10;
        this.f5931c = transferListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5929a) {
            case 0:
                ((TransferListener) this.f5931c).onError(this.f5930b, (Exception) this.f5932d);
                break;
            case 1:
                TransferStatusUpdater.unregisterListener$lambda$18((TransferStatusUpdater) this.f5932d, this.f5930b, (TransferListener) this.f5931c);
                break;
            case 2:
                C1876k c1876k = (C1876k) this.f5931c;
                Serializable serializable = (Serializable) ((C5047i) this.f5932d).f24823b;
                String str = (String) c1876k.f15308a.get(Integer.valueOf(this.f5930b));
                if (str != null) {
                    C2753e c2753e = (C2753e) c1876k.f15312e.get(str);
                    if ((c2753e != null ? c2753e.f15299a : null) != null) {
                        InterfaceC2750b interfaceC2750b = c2753e.f15299a;
                        AbstractC4154l.m8921d(interfaceC2750b, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c1876k.f15311d.remove(str)) {
                            interfaceC2750b.mo24a(serializable);
                            break;
                        }
                    } else {
                        c1876k.f15314g.remove(str);
                        c1876k.f15313f.put(str, serializable);
                        break;
                    }
                }
                break;
            case 3:
                ((C1876k) this.f5931c).m6750a(this.f5930b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f5932d));
                break;
            case 4:
                ((AbstractC3084o) this.f5931c).mo84c(this.f5930b, (C3088s) this.f5932d);
                break;
            case 5:
                ((AbstractC3084o) this.f5931c).mo83b(this.f5930b, (InterfaceC3093x) this.f5932d);
                break;
            case 6:
                ((CameraCaptureSession.CaptureCallback) ((C7597g) this.f5931c).f36542b).onCaptureSequenceAborted((CameraCaptureSession) this.f5932d, this.f5930b);
                break;
            case 7:
                ((CameraDevice.StateCallback) ((C7607q) this.f5931c).f36666b).onError((CameraDevice) this.f5932d, this.f5930b);
                break;
            default:
                ((C7427b) ((C7392h) this.f5931c).f35152c).m13816k(this.f5930b, this.f5932d);
                break;
        }
    }

    public /* synthetic */ RunnableC1255b(Object obj, int i10, Object obj2, int i11) {
        this.f5929a = i11;
        this.f5931c = obj;
        this.f5930b = i10;
        this.f5932d = obj2;
    }

    public /* synthetic */ RunnableC1255b(Object obj, AutoCloseable autoCloseable, int i10, int i11) {
        this.f5929a = i11;
        this.f5931c = obj;
        this.f5932d = autoCloseable;
        this.f5930b = i10;
    }
}
