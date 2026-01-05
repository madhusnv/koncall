package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.user.internal.backend.IdentityConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class OutcomeEventsBackendService implements IOutcomeEventsBackendService {
    private final IHttpClient _http;

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsBackendService", m36648f = "OutcomeEventsBackendService.kt", m36649l = {49}, m36650m = "sendOutcomeEvent")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsBackendService$sendOutcomeEvent$1 */
    public static final class C118291 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C118291(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsBackendService.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public OutcomeEventsBackendService(IHttpClient iHttpClient) {
        sq8.m48649h(iHttpClient, "_http");
        this._http = iHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, OutcomeEvent outcomeEvent, n64 n64Var) throws BackendException, JSONException {
        C118291 c118291;
        if (n64Var instanceof C118291) {
            c118291 = (C118291) n64Var;
            int i = c118291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118291.label = i - Integer.MIN_VALUE;
            } else {
                c118291 = new C118291(n64Var);
            }
        }
        Object objPost$default = c118291.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118291.label;
        if (i2 == 0) {
            wre.m54934b(objPost$default);
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put(IdentityConstants.ONESIGNAL_ID, str2).put("subscription", new JSONObject().put(OutcomeConstants.OUTCOME_ID, str3).put("type", str4));
            if (bool != null) {
                jSONObjectPut.put("direct", bool.booleanValue());
            }
            if (outcomeEvent.getNotificationIds() != null && outcomeEvent.getNotificationIds().length() > 0) {
                jSONObjectPut.put("notification_ids", outcomeEvent.getNotificationIds());
            }
            jSONObjectPut.put(OutcomeConstants.OUTCOME_ID, outcomeEvent.getName());
            if (outcomeEvent.getWeight() > 0.0f) {
                jSONObjectPut.put("weight", ml1.m39303c(outcomeEvent.getWeight()));
            }
            if (outcomeEvent.getTimestamp() > 0) {
                jSONObjectPut.put("timestamp", outcomeEvent.getTimestamp());
            }
            if (outcomeEvent.getSessionTime() > 0) {
                jSONObjectPut.put("session_time", outcomeEvent.getSessionTime());
            }
            IHttpClient iHttpClient = this._http;
            sq8.m48648g(jSONObjectPut, "jsonObject");
            c118291.label = 1;
            objPost$default = IHttpClient.DefaultImpls.post$default(iHttpClient, "outcomes/measure", jSONObjectPut, null, c118291, 4, null);
            if (objPost$default == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objPost$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPost$default;
        if (httpResponse.isSuccess()) {
            return y3i.f54824a;
        }
        throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
    }
}
