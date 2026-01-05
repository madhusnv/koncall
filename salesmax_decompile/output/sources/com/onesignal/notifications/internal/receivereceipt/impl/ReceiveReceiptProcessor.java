package com.onesignal.notifications.internal.receivereceipt.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ReceiveReceiptProcessor implements IReceiveReceiptProcessor {
    private final INotificationBackendService _backend;
    private final IDeviceService _deviceService;

    @l75(m36647c = "com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptProcessor", m36648f = "ReceiveReceiptProcessor.kt", m36649l = {21}, m36650m = "sendReceiveReceipt")
    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptProcessor$sendReceiveReceipt$1 */
    public static final class C118031 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118031(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReceiveReceiptProcessor.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public ReceiveReceiptProcessor(IDeviceService iDeviceService, INotificationBackendService iNotificationBackendService) {
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(iNotificationBackendService, "_backend");
        this._deviceService = iDeviceService;
        this._backend = iNotificationBackendService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, n64 n64Var) {
        C118031 c118031;
        if (n64Var instanceof C118031) {
            c118031 = (C118031) n64Var;
            int i = c118031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118031.label = i - Integer.MIN_VALUE;
            } else {
                c118031 = new C118031(n64Var);
            }
        }
        C118031 c1180312 = c118031;
        Object obj = c1180312.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1180312.label;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                IDeviceService.DeviceType deviceType = this._deviceService.getDeviceType();
                INotificationBackendService iNotificationBackendService = this._backend;
                c1180312.label = 1;
                if (iNotificationBackendService.updateNotificationAsReceived(str, str3, str2, deviceType, c1180312) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
        } catch (BackendException e) {
            Logging.error$default("Receive receipt failed with statusCode: " + e.getStatusCode() + " response: " + e.getResponse(), null, 2, null);
        }
        return y3i.f54824a;
    }
}
