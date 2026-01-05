package com.onesignal.notifications.internal.backend.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class NotificationBackendService implements INotificationBackendService {
    private final IHttpClient _httpClient;

    @l75(m36647c = "com.onesignal.notifications.internal.backend.impl.NotificationBackendService", m36648f = "NotificationBackendService.kt", m36649l = {SignatureVisitor.EXTENDS}, m36650m = "updateNotificationAsOpened")
    /* renamed from: com.onesignal.notifications.internal.backend.impl.NotificationBackendService$updateNotificationAsOpened$1 */
    public static final class C117371 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C117371(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationBackendService.this.updateNotificationAsOpened(null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.backend.impl.NotificationBackendService", m36648f = "NotificationBackendService.kt", m36649l = {24}, m36650m = "updateNotificationAsReceived")
    /* renamed from: com.onesignal.notifications.internal.backend.impl.NotificationBackendService$updateNotificationAsReceived$1 */
    public static final class C117381 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C117381(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationBackendService.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public NotificationBackendService(IHttpClient iHttpClient) {
        sq8.m48649h(iHttpClient, "_httpClient");
        this._httpClient = iHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.backend.INotificationBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, n64 n64Var) throws BackendException, JSONException {
        C117371 c117371;
        if (n64Var instanceof C117371) {
            c117371 = (C117371) n64Var;
            int i = c117371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117371.label = i - Integer.MIN_VALUE;
            } else {
                c117371 = new C117371(n64Var);
            }
        }
        C117371 c1173712 = c117371;
        Object objPut$default = c1173712.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1173712.label;
        if (i2 == 0) {
            wre.m54934b(objPut$default);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", str);
            jSONObject.put("player_id", str3);
            jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, true);
            jSONObject.put("device_type", deviceType.getValue());
            c1173712.label = 1;
            objPut$default = IHttpClient.DefaultImpls.put$default(this._httpClient, "notifications/" + str2, jSONObject, null, c1173712, 4, null);
            if (objPut$default == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objPut$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPut$default;
        if (httpResponse.isSuccess()) {
            return y3i.f54824a;
        }
        throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.backend.INotificationBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, IDeviceService.DeviceType deviceType, n64 n64Var) throws BackendException, JSONException {
        C117381 c117381;
        if (n64Var instanceof C117381) {
            c117381 = (C117381) n64Var;
            int i = c117381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117381.label = i - Integer.MIN_VALUE;
            } else {
                c117381 = new C117381(n64Var);
            }
        }
        C117381 c1173812 = c117381;
        Object objPut$default = c1173812.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1173812.label;
        if (i2 == 0) {
            wre.m54934b(objPut$default);
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", deviceType.getValue());
            sq8.m48648g(jSONObjectPut, "JSONObject()\n           …_type\", deviceType.value)");
            c1173812.label = 1;
            objPut$default = IHttpClient.DefaultImpls.put$default(this._httpClient, "notifications/" + str2 + "/report_received", jSONObjectPut, null, c1173812, 4, null);
            if (objPut$default == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objPut$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPut$default;
        if (httpResponse.isSuccess()) {
            return y3i.f54824a;
        }
        throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
    }
}
