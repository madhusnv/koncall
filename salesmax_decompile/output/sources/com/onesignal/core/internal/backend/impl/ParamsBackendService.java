package com.onesignal.core.internal.backend.impl;

import com.onesignal.common.IDManager;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.backend.FCMParamsObject;
import com.onesignal.core.internal.backend.IParamsBackendService;
import com.onesignal.core.internal.backend.InfluenceParamsObject;
import com.onesignal.core.internal.backend.ParamsObject;
import com.onesignal.core.internal.http.CacheKeys;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.gge;
import p001o.kf9;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class ParamsBackendService implements IParamsBackendService {
    private final IHttpClient _http;

    @l75(m36647c = "com.onesignal.core.internal.backend.impl.ParamsBackendService", m36648f = "ParamsBackendService.kt", m36649l = {35}, m36650m = "fetchParams")
    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$fetchParams$1 */
    public static final class C116021 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116021(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ParamsBackendService.this.fetchParams(null, null, this);
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$fetchParams$2 */
    public static final class C116032 extends kf9 implements xk7 {
        final /* synthetic */ gge $influenceParams;
        final /* synthetic */ ParamsBackendService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116032(gge ggeVar, ParamsBackendService paramsBackendService) {
            super(1);
            this.$influenceParams = ggeVar;
            this.this$0 = paramsBackendService;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return y3i.f54824a;
        }

        public final void invoke(JSONObject jSONObject) {
            sq8.m48649h(jSONObject, "it");
            this.$influenceParams.f25106a = this.this$0.processOutcomeJson(jSONObject);
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$fetchParams$3 */
    public static final class C116043 extends kf9 implements xk7 {
        final /* synthetic */ gge $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116043(gge ggeVar) {
            super(1);
            this.$fcmParams = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return y3i.f54824a;
        }

        public final void invoke(JSONObject jSONObject) {
            sq8.m48649h(jSONObject, "it");
            gge ggeVar = this.$fcmParams;
            String strSafeString = JSONObjectExtensionsKt.safeString(jSONObject, "api_key");
            ggeVar.f25106a = new FCMParamsObject(JSONObjectExtensionsKt.safeString(jSONObject, "project_id"), JSONObjectExtensionsKt.safeString(jSONObject, "app_id"), strSafeString);
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$1 */
    public static final class C116051 extends kf9 implements xk7 {
        final /* synthetic */ gge $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116051(gge ggeVar) {
            super(1);
            this.$isDirectEnabled = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return y3i.f54824a;
        }

        public final void invoke(JSONObject jSONObject) {
            sq8.m48649h(jSONObject, "it");
            this.$isDirectEnabled.f25106a = JSONObjectExtensionsKt.safeBool(jSONObject, "enabled");
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2 */
    public static final class C116062 extends kf9 implements xk7 {
        final /* synthetic */ gge $iamLimit;
        final /* synthetic */ gge $indirectIAMAttributionWindow;
        final /* synthetic */ gge $indirectNotificationAttributionWindow;
        final /* synthetic */ gge $isIndirectEnabled;
        final /* synthetic */ gge $notificationLimit;

        /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ gge $indirectNotificationAttributionWindow;
            final /* synthetic */ gge $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(gge ggeVar, gge ggeVar2) {
                super(1);
                this.$indirectNotificationAttributionWindow = ggeVar;
                this.$notificationLimit = ggeVar2;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return y3i.f54824a;
            }

            public final void invoke(JSONObject jSONObject) {
                sq8.m48649h(jSONObject, "it");
                this.$indirectNotificationAttributionWindow.f25106a = JSONObjectExtensionsKt.safeInt(jSONObject, "minutes_since_displayed");
                this.$notificationLimit.f25106a = JSONObjectExtensionsKt.safeInt(jSONObject, "limit");
            }
        }

        /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends kf9 implements xk7 {
            final /* synthetic */ gge $iamLimit;
            final /* synthetic */ gge $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(gge ggeVar, gge ggeVar2) {
                super(1);
                this.$indirectIAMAttributionWindow = ggeVar;
                this.$iamLimit = ggeVar2;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return y3i.f54824a;
            }

            public final void invoke(JSONObject jSONObject) {
                sq8.m48649h(jSONObject, "it");
                this.$indirectIAMAttributionWindow.f25106a = JSONObjectExtensionsKt.safeInt(jSONObject, "minutes_since_displayed");
                this.$iamLimit.f25106a = JSONObjectExtensionsKt.safeInt(jSONObject, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116062(gge ggeVar, gge ggeVar2, gge ggeVar3, gge ggeVar4, gge ggeVar5) {
            super(1);
            this.$isIndirectEnabled = ggeVar;
            this.$indirectNotificationAttributionWindow = ggeVar2;
            this.$notificationLimit = ggeVar3;
            this.$indirectIAMAttributionWindow = ggeVar4;
            this.$iamLimit = ggeVar5;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return y3i.f54824a;
        }

        public final void invoke(JSONObject jSONObject) throws JSONException {
            sq8.m48649h(jSONObject, "indirectJSON");
            this.$isIndirectEnabled.f25106a = JSONObjectExtensionsKt.safeBool(jSONObject, "enabled");
            JSONObjectExtensionsKt.expandJSONObject(jSONObject, "notification_attribution", new AnonymousClass1(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            JSONObjectExtensionsKt.expandJSONObject(jSONObject, "in_app_message_attribution", new AnonymousClass2(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$3 */
    public static final class C116073 extends kf9 implements xk7 {
        final /* synthetic */ gge $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116073(gge ggeVar) {
            super(1);
            this.$isUnattributedEnabled = ggeVar;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return y3i.f54824a;
        }

        public final void invoke(JSONObject jSONObject) {
            sq8.m48649h(jSONObject, "it");
            this.$isUnattributedEnabled.f25106a = JSONObjectExtensionsKt.safeBool(jSONObject, "enabled");
        }
    }

    public ParamsBackendService(IHttpClient iHttpClient) {
        sq8.m48649h(iHttpClient, "_http");
        this._http = iHttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfluenceParamsObject processOutcomeJson(JSONObject jSONObject) throws JSONException {
        gge ggeVar = new gge();
        gge ggeVar2 = new gge();
        gge ggeVar3 = new gge();
        gge ggeVar4 = new gge();
        gge ggeVar5 = new gge();
        gge ggeVar6 = new gge();
        gge ggeVar7 = new gge();
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, "direct", new C116051(ggeVar5));
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, "indirect", new C116062(ggeVar6, ggeVar, ggeVar2, ggeVar3, ggeVar4));
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, "unattributed", new C116073(ggeVar7));
        return new InfluenceParamsObject((Integer) ggeVar.f25106a, (Integer) ggeVar2.f25106a, (Integer) ggeVar3.f25106a, (Integer) ggeVar4.f25106a, (Boolean) ggeVar5.f25106a, (Boolean) ggeVar6.f25106a, (Boolean) ggeVar7.f25106a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.onesignal.core.internal.backend.IParamsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, n64 n64Var) throws BackendException, JSONException {
        C116021 c116021;
        ParamsBackendService paramsBackendService;
        if (n64Var instanceof C116021) {
            c116021 = (C116021) n64Var;
            int i = c116021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116021.label = i - Integer.MIN_VALUE;
            } else {
                c116021 = new C116021(n64Var);
            }
        }
        Object obj = c116021.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116021.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            Logging.log(LogLevel.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
            StringBuilder sb = new StringBuilder();
            sb.append("apps/");
            sb.append(str);
            sb.append("/android_params.js");
            String string = sb.toString();
            if (str2 != null && !IDManager.INSTANCE.isLocalId(str2)) {
                string = string + "?player_id=" + str2;
            }
            IHttpClient iHttpClient = this._http;
            OptionalHeaders optionalHeaders = new OptionalHeaders(CacheKeys.REMOTE_PARAMS, null, null, null, 14, null);
            c116021.L$0 = this;
            c116021.label = 1;
            obj = iHttpClient.get(string, optionalHeaders, c116021);
            if (obj == objM51918f) {
                return objM51918f;
            }
            paramsBackendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paramsBackendService = (ParamsBackendService) c116021.L$0;
            wre.m54934b(obj);
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (!httpResponse.isSuccess()) {
            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
        }
        String payload = httpResponse.getPayload();
        sq8.m48646e(payload);
        JSONObject jSONObject = new JSONObject(payload);
        gge ggeVar = new gge();
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, "outcomes", new C116032(ggeVar, paramsBackendService));
        gge ggeVar2 = new gge();
        JSONObjectExtensionsKt.expandJSONObject(jSONObject, "fcm", new C116043(ggeVar2));
        String strSafeString = JSONObjectExtensionsKt.safeString(jSONObject, "android_sender_id");
        Boolean boolSafeBool = JSONObjectExtensionsKt.safeBool(jSONObject, "enterp");
        Boolean boolSafeBool2 = JSONObjectExtensionsKt.safeBool(jSONObject, "require_ident_auth");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("chnl_lst");
        Boolean boolSafeBool3 = JSONObjectExtensionsKt.safeBool(jSONObject, "fba");
        Boolean boolSafeBool4 = JSONObjectExtensionsKt.safeBool(jSONObject, "restore_ttl_filter");
        Boolean boolSafeBool5 = JSONObjectExtensionsKt.safeBool(jSONObject, "clear_group_on_summary_click");
        Boolean boolSafeBool6 = JSONObjectExtensionsKt.safeBool(jSONObject, "receive_receipts_enable");
        Boolean boolSafeBool7 = JSONObjectExtensionsKt.safeBool(jSONObject, "disable_gms_missing_prompt");
        Boolean boolSafeBool8 = JSONObjectExtensionsKt.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
        Boolean boolSafeBool9 = JSONObjectExtensionsKt.safeBool(jSONObject, "location_shared");
        Boolean boolSafeBool10 = JSONObjectExtensionsKt.safeBool(jSONObject, "requires_user_privacy_consent");
        Long lSafeLong = JSONObjectExtensionsKt.safeLong(jSONObject, "oprepo_execution_interval");
        InfluenceParamsObject influenceParamsObject = (InfluenceParamsObject) ggeVar.f25106a;
        InfluenceParamsObject influenceParamsObject2 = influenceParamsObject == null ? new InfluenceParamsObject(null, null, null, null, null, null, null, Opcodes.LAND, null) : influenceParamsObject;
        FCMParamsObject fCMParamsObject = (FCMParamsObject) ggeVar2.f25106a;
        return new ParamsObject(strSafeString, boolSafeBool, boolSafeBool2, jSONArrayOptJSONArray, boolSafeBool3, boolSafeBool4, boolSafeBool5, boolSafeBool6, boolSafeBool7, boolSafeBool8, boolSafeBool9, boolSafeBool10, lSafeLong, influenceParamsObject2, fCMParamsObject == null ? new FCMParamsObject(null, null, null, 7, null) : fCMParamsObject);
    }
}
