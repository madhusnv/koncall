package com.onesignal.inAppMessages.internal.backend.impl;

import com.google.firebase.perf.util.Constants;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.backend.GetIAMDataResponse;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.hydrators.InAppHydrator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nk5;
import p001o.o64;
import p001o.sq8;
import p001o.uk7;
import p001o.uq8;
import p001o.wm5;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class InAppBackendService implements IInAppBackendService {
    private final IDeviceService _deviceService;
    private final IHttpClient _httpClient;
    private final InAppHydrator _hydrator;
    private int htmlNetworkRequestAttemptCount;

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {224, 235, 247}, m36650m = "attemptFetchWithRetries")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$attemptFetchWithRetries$1 */
    public static final class C116561 extends o64 {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C116561(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.attemptFetchWithRetries(null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {Constants.MAX_HOST_LENGTH}, m36650m = "fetchInAppMessagesWithoutRywToken")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$fetchInAppMessagesWithoutRywToken$1 */
    public static final class C116571 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116571(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.fetchInAppMessagesWithoutRywToken(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {49}, m36650m = "getIAMData")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$getIAMData$1 */
    public static final class C116581 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116581(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.getIAMData(null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {Opcodes.IASTORE}, m36650m = "getIAMPreviewData")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$getIAMPreviewData$1 */
    public static final class C116591 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116591(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.getIAMPreviewData(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER, 37}, m36650m = "listInAppMessages")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$listInAppMessages$1 */
    public static final class C116601 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C116601(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.listInAppMessages(null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {110}, m36650m = "sendIAMClick")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMClick$1 */
    public static final class C116611 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116611(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {Opcodes.TABLESWITCH}, m36650m = "sendIAMImpression")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMImpression$1 */
    public static final class C116621 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116621(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", m36648f = "InAppBackendService.kt", m36649l = {Opcodes.D2L}, m36650m = "sendIAMPageImpression")
    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMPageImpression$1 */
    public static final class C116631 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116631(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppBackendService.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    public InAppBackendService(IHttpClient iHttpClient, IDeviceService iDeviceService, InAppHydrator inAppHydrator) {
        sq8.m48649h(iHttpClient, "_httpClient");
        sq8.m48649h(iDeviceService, "_deviceService");
        sq8.m48649h(inAppHydrator, "_hydrator");
        this._httpClient = iHttpClient;
        this._deviceService = iDeviceService;
        this._hydrator = inAppHydrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0113 -> B:50:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0130 -> B:50:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptFetchWithRetries(String str, RywData rywData, uk7 uk7Var, n64 n64Var) {
        C116561 c116561;
        InAppBackendService inAppBackendService;
        int i;
        int i2;
        C116561 c1165612;
        InAppBackendService inAppBackendService2;
        Object obj;
        String str2;
        RywData rywData2;
        uk7 uk7Var2;
        InAppBackendService inAppBackendService3;
        String str3;
        RywData rywData3;
        uk7 uk7Var3;
        int i3;
        int iIntValue;
        HttpResponse httpResponse;
        Object obj2;
        if (n64Var instanceof C116561) {
            c116561 = (C116561) n64Var;
            int i4 = c116561.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c116561.label = i4 - Integer.MIN_VALUE;
                inAppBackendService = this;
            } else {
                inAppBackendService = this;
                c116561 = inAppBackendService.new C116561(n64Var);
            }
        }
        Object objFetchInAppMessagesWithoutRywToken = c116561.result;
        Object objM51918f = uq8.m51918f();
        int i5 = c116561.label;
        if (i5 == 0) {
            wre.m54934b(objFetchInAppMessagesWithoutRywToken);
            i = 0;
            i2 = 0;
            c1165612 = c116561;
            inAppBackendService2 = inAppBackendService;
            obj = objM51918f;
            str2 = str;
            rywData2 = rywData;
            uk7Var2 = uk7Var;
            OptionalHeaders optionalHeaders = new OptionalHeaders(null, rywData2.getRywToken(), i <= 0 ? ml1.m39304d(i) : null, ml1.m39305e(((Number) uk7Var2.invoke()).longValue()), 1, null);
            IHttpClient iHttpClient = inAppBackendService2._httpClient;
            c1165612.L$0 = inAppBackendService2;
            c1165612.L$1 = str2;
            c1165612.L$2 = rywData2;
            c1165612.L$3 = uk7Var2;
            c1165612.I$0 = i;
            c1165612.I$1 = i2;
            c1165612.label = 1;
            obj2 = iHttpClient.get(str2, optionalHeaders, c1165612);
            if (obj2 != obj) {
            }
        } else if (i5 == 1) {
            iIntValue = c116561.I$1;
            i3 = c116561.I$0;
            uk7Var3 = (uk7) c116561.L$3;
            rywData3 = (RywData) c116561.L$2;
            str3 = (String) c116561.L$1;
            inAppBackendService3 = (InAppBackendService) c116561.L$0;
            wre.m54934b(objFetchInAppMessagesWithoutRywToken);
            httpResponse = (HttpResponse) objFetchInAppMessagesWithoutRywToken;
            if (httpResponse.isSuccess()) {
            }
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    wre.m54934b(objFetchInAppMessagesWithoutRywToken);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = c116561.I$1;
            i3 = c116561.I$0;
            uk7Var3 = (uk7) c116561.L$3;
            rywData3 = (RywData) c116561.L$2;
            str3 = (String) c116561.L$1;
            inAppBackendService3 = (InAppBackendService) c116561.L$0;
            wre.m54934b(objFetchInAppMessagesWithoutRywToken);
            str2 = str3;
            inAppBackendService2 = inAppBackendService3;
            int i6 = iIntValue;
            C116561 c1165613 = c116561;
            rywData2 = rywData3;
            i2 = i6;
            uk7 uk7Var4 = uk7Var3;
            obj = objM51918f;
            uk7Var2 = uk7Var4;
            int i7 = i3 + 1;
            if (i7 <= i2) {
                c1165613.L$0 = null;
                c1165613.L$1 = null;
                c1165613.L$2 = null;
                c1165613.L$3 = null;
                c1165613.label = 3;
                objFetchInAppMessagesWithoutRywToken = inAppBackendService2.fetchInAppMessagesWithoutRywToken(str2, uk7Var2, c1165613);
                return objFetchInAppMessagesWithoutRywToken == obj ? obj : objFetchInAppMessagesWithoutRywToken;
            }
            c1165612 = c1165613;
            i = i7;
            OptionalHeaders optionalHeaders2 = new OptionalHeaders(null, rywData2.getRywToken(), i <= 0 ? ml1.m39304d(i) : null, ml1.m39305e(((Number) uk7Var2.invoke()).longValue()), 1, null);
            IHttpClient iHttpClient2 = inAppBackendService2._httpClient;
            c1165612.L$0 = inAppBackendService2;
            c1165612.L$1 = str2;
            c1165612.L$2 = rywData2;
            c1165612.L$3 = uk7Var2;
            c1165612.I$0 = i;
            c1165612.I$1 = i2;
            c1165612.label = 1;
            obj2 = iHttpClient2.get(str2, optionalHeaders2, c1165612);
            if (obj2 != obj) {
                return obj;
            }
            inAppBackendService3 = inAppBackendService2;
            str3 = str2;
            objFetchInAppMessagesWithoutRywToken = obj2;
            int i8 = i2;
            rywData3 = rywData2;
            c116561 = c1165612;
            i3 = i;
            iIntValue = i8;
            Object obj3 = obj;
            uk7Var3 = uk7Var2;
            objM51918f = obj3;
            httpResponse = (HttpResponse) objFetchInAppMessagesWithoutRywToken;
            if (httpResponse.isSuccess()) {
                String payload = httpResponse.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                if (jSONObject != null) {
                    return inAppBackendService3.hydrateInAppMessages(jSONObject);
                }
                return null;
            }
            if (httpResponse.getStatusCode() != 425 && httpResponse.getStatusCode() != 429) {
                httpResponse.getStatusCode();
                return null;
            }
            Integer retryLimit = httpResponse.getRetryLimit();
            if (retryLimit != null) {
                iIntValue = retryLimit.intValue();
            }
            if (httpResponse.getRetryAfterSeconds() != null) {
                long jIntValue = r0.intValue() * 1000;
                c116561.L$0 = inAppBackendService3;
                c116561.L$1 = str3;
                c116561.L$2 = rywData3;
                c116561.L$3 = uk7Var3;
                c116561.I$0 = i3;
                c116561.I$1 = iIntValue;
                c116561.label = 2;
                if (nk5.m40720b(jIntValue, c116561) == objM51918f) {
                    return objM51918f;
                }
            }
            str2 = str3;
            inAppBackendService2 = inAppBackendService3;
            int i62 = iIntValue;
            C116561 c11656132 = c116561;
            rywData2 = rywData3;
            i2 = i62;
            uk7 uk7Var42 = uk7Var3;
            obj = objM51918f;
            uk7Var2 = uk7Var42;
            int i72 = i3 + 1;
            if (i72 <= i2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInAppMessagesWithoutRywToken(String str, uk7 uk7Var, n64 n64Var) {
        C116571 c116571;
        InAppBackendService inAppBackendService;
        if (n64Var instanceof C116571) {
            c116571 = (C116571) n64Var;
            int i = c116571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116571.label = i - Integer.MIN_VALUE;
            } else {
                c116571 = new C116571(n64Var);
            }
        }
        Object obj = c116571.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116571.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            IHttpClient iHttpClient = this._httpClient;
            OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, (Long) uk7Var.invoke(), 7, null);
            c116571.L$0 = this;
            c116571.label = 1;
            obj = iHttpClient.get(str, optionalHeaders, c116571);
            if (obj == objM51918f) {
                return objM51918f;
            }
            inAppBackendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppBackendService = (InAppBackendService) c116571.L$0;
            wre.m54934b(obj);
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (!httpResponse.isSuccess()) {
            return null;
        }
        String payload = httpResponse.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        if (jSONObject != null) {
            return inAppBackendService.hydrateInAppMessages(jSONObject);
        }
        return null;
    }

    private final String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            Logging.error$default("Unable to find a variant for in-app message " + str, null, 2, null);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    private final List<InAppMessage> hydrateInAppMessages(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("in_app_messages")) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("in_app_messages");
        InAppHydrator inAppHydrator = this._hydrator;
        sq8.m48648g(jSONArray, "iamMessagesAsJSON");
        return inAppHydrator.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i, String str2) {
        Logging.error$default("Encountered a " + i + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        Logging.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, n64 n64Var) {
        C116581 c116581;
        InAppBackendService inAppBackendService;
        if (n64Var instanceof C116581) {
            c116581 = (C116581) n64Var;
            int i = c116581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116581.label = i - Integer.MIN_VALUE;
            } else {
                c116581 = new C116581(n64Var);
            }
        }
        C116581 c1165812 = c116581;
        Object obj = c1165812.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1165812.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            String strHtmlPathForMessage = htmlPathForMessage(str2, str3, str);
            if (strHtmlPathForMessage == null) {
                return new GetIAMDataResponse(null, false);
            }
            IHttpClient iHttpClient = this._httpClient;
            c1165812.L$0 = this;
            c1165812.label = 1;
            obj = IHttpClient.DefaultImpls.get$default(iHttpClient, strHtmlPathForMessage, null, c1165812, 2, null);
            if (obj == objM51918f) {
                return objM51918f;
            }
            inAppBackendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppBackendService = (InAppBackendService) c1165812.L$0;
            wre.m54934b(obj);
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (httpResponse.isSuccess()) {
            inAppBackendService.htmlNetworkRequestAttemptCount = 0;
            String payload = httpResponse.getPayload();
            sq8.m48646e(payload);
            return new GetIAMDataResponse(inAppBackendService._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
        }
        inAppBackendService.printHttpErrorForInAppMessageRequest(InAppMessageContent.HTML, httpResponse.getStatusCode(), httpResponse.getPayload());
        NetworkUtils networkUtils = NetworkUtils.INSTANCE;
        if (networkUtils.getResponseStatusType(httpResponse.getStatusCode()) != NetworkUtils.ResponseStatusType.RETRYABLE || inAppBackendService.htmlNetworkRequestAttemptCount >= networkUtils.getMaxNetworkRequestAttemptCount()) {
            inAppBackendService.htmlNetworkRequestAttemptCount = 0;
            return new GetIAMDataResponse(null, false);
        }
        inAppBackendService.htmlNetworkRequestAttemptCount++;
        return new GetIAMDataResponse(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, n64 n64Var) {
        C116591 c116591;
        InAppBackendService inAppBackendService;
        if (n64Var instanceof C116591) {
            c116591 = (C116591) n64Var;
            int i = c116591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116591.label = i - Integer.MIN_VALUE;
            } else {
                c116591 = new C116591(n64Var);
            }
        }
        C116591 c1165912 = c116591;
        Object obj = c1165912.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1165912.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            IHttpClient iHttpClient = this._httpClient;
            c1165912.L$0 = this;
            c1165912.label = 1;
            obj = IHttpClient.DefaultImpls.get$default(iHttpClient, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, c1165912, 2, null);
            if (obj == objM51918f) {
                return objM51918f;
            }
            inAppBackendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppBackendService = (InAppBackendService) c1165912.L$0;
            wre.m54934b(obj);
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (!httpResponse.isSuccess()) {
            inAppBackendService.printHttpErrorForInAppMessageRequest(InAppMessageContent.HTML, httpResponse.getStatusCode(), httpResponse.getPayload());
            return null;
        }
        String payload = httpResponse.getPayload();
        sq8.m48646e(payload);
        return inAppBackendService._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, RywData rywData, uk7 uk7Var, n64 n64Var) {
        C116601 c116601;
        InAppBackendService inAppBackendService;
        if (n64Var instanceof C116601) {
            c116601 = (C116601) n64Var;
            int i = c116601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116601.label = i - Integer.MIN_VALUE;
            } else {
                c116601 = new C116601(n64Var);
            }
        }
        Object objAttemptFetchWithRetries = c116601.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116601.label;
        if (i2 == 0) {
            wre.m54934b(objAttemptFetchWithRetries);
            Long rywDelay = rywData.getRywDelay();
            long jLongValue = rywDelay != null ? rywDelay.longValue() : 500L;
            c116601.L$0 = this;
            c116601.L$1 = str;
            c116601.L$2 = str2;
            c116601.L$3 = rywData;
            c116601.L$4 = uk7Var;
            c116601.label = 1;
            if (nk5.m40720b(jLongValue, c116601) == objM51918f) {
                return objM51918f;
            }
            inAppBackendService = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objAttemptFetchWithRetries);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk7Var = (uk7) c116601.L$4;
            rywData = (RywData) c116601.L$3;
            str2 = (String) c116601.L$2;
            str = (String) c116601.L$1;
            inAppBackendService = (InAppBackendService) c116601.L$0;
            wre.m54934b(objAttemptFetchWithRetries);
        }
        c116601.L$0 = null;
        c116601.L$1 = null;
        c116601.L$2 = null;
        c116601.L$3 = null;
        c116601.L$4 = null;
        c116601.label = 2;
        objAttemptFetchWithRetries = inAppBackendService.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", rywData, uk7Var, c116601);
        return objAttemptFetchWithRetries == objM51918f ? objM51918f : objAttemptFetchWithRetries;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(final String str, final String str2, final String str3, String str4, final String str5, final boolean z, n64 n64Var) throws BackendException {
        C116611 c116611;
        InAppBackendService inAppBackendService;
        if (n64Var instanceof C116611) {
            c116611 = (C116611) n64Var;
            int i = c116611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116611.label = i - Integer.MIN_VALUE;
            } else {
                c116611 = new C116611(n64Var);
            }
        }
        C116611 c1166112 = c116611;
        Object objPost$default = c1166112.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1166112.label;
        if (i2 == 0) {
            wre.m54934b(objPost$default);
            JSONObject jSONObject = new JSONObject(str, this, str2, str5, str3, z) { // from class: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMClick$json$1
                {
                    put("app_id", str);
                    put("device_type", this._deviceService.getDeviceType().getValue());
                    put("player_id", str2);
                    put("click_id", str5);
                    put("variant_id", str3);
                    if (z) {
                        put("first_click", true);
                    }
                }
            };
            c1166112.L$0 = this;
            c1166112.label = 1;
            objPost$default = IHttpClient.DefaultImpls.post$default(this._httpClient, "in_app_messages/" + str4 + "/click", jSONObject, null, c1166112, 4, null);
            if (objPost$default == objM51918f) {
                return objM51918f;
            }
            inAppBackendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppBackendService = (InAppBackendService) c1166112.L$0;
            wre.m54934b(objPost$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPost$default;
        if (!httpResponse.isSuccess()) {
            inAppBackendService.printHttpErrorForInAppMessageRequest("engagement", httpResponse.getStatusCode(), httpResponse.getPayload());
            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
        }
        String payload = httpResponse.getPayload();
        sq8.m48646e(payload);
        inAppBackendService.printHttpSuccessForInAppMessageRequest("engagement", payload);
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(final String str, final String str2, final String str3, String str4, n64 n64Var) throws BackendException {
        C116621 c116621;
        InAppBackendService inAppBackendService;
        if (n64Var instanceof C116621) {
            c116621 = (C116621) n64Var;
            int i = c116621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116621.label = i - Integer.MIN_VALUE;
            } else {
                c116621 = new C116621(n64Var);
            }
        }
        C116621 c1166212 = c116621;
        Object objPost$default = c1166212.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1166212.label;
        if (i2 == 0) {
            wre.m54934b(objPost$default);
            JSONObject jSONObject = new JSONObject(str, str2, str3, this) { // from class: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMImpression$json$1
                {
                    put("app_id", str);
                    put("player_id", str2);
                    put("variant_id", str3);
                    put("device_type", this._deviceService.getDeviceType().getValue());
                    put("first_impression", true);
                }
            };
            c1166212.L$0 = this;
            c1166212.label = 1;
            objPost$default = IHttpClient.DefaultImpls.post$default(this._httpClient, "in_app_messages/" + str4 + "/impression", jSONObject, null, c1166212, 4, null);
            if (objPost$default == objM51918f) {
                return objM51918f;
            }
            inAppBackendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppBackendService = (InAppBackendService) c1166212.L$0;
            wre.m54934b(objPost$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPost$default;
        if (!httpResponse.isSuccess()) {
            inAppBackendService.printHttpErrorForInAppMessageRequest("impression", httpResponse.getStatusCode(), httpResponse.getPayload());
            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
        }
        String payload = httpResponse.getPayload();
        sq8.m48646e(payload);
        inAppBackendService.printHttpSuccessForInAppMessageRequest("impression", payload);
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(final String str, final String str2, final String str3, String str4, final String str5, n64 n64Var) throws BackendException {
        C116631 c116631;
        InAppBackendService inAppBackendService;
        if (n64Var instanceof C116631) {
            c116631 = (C116631) n64Var;
            int i = c116631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116631.label = i - Integer.MIN_VALUE;
            } else {
                c116631 = new C116631(n64Var);
            }
        }
        C116631 c1166312 = c116631;
        Object objPost$default = c1166312.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c1166312.label;
        if (i2 == 0) {
            wre.m54934b(objPost$default);
            JSONObject jSONObject = new JSONObject(str, str2, str3, this, str5) { // from class: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMPageImpression$json$1
                {
                    put("app_id", str);
                    put("player_id", str2);
                    put("variant_id", str3);
                    put("device_type", this._deviceService.getDeviceType().getValue());
                    put("page_id", str5);
                }
            };
            c1166312.L$0 = this;
            c1166312.label = 1;
            objPost$default = IHttpClient.DefaultImpls.post$default(this._httpClient, "in_app_messages/" + str4 + "/pageImpression", jSONObject, null, c1166312, 4, null);
            if (objPost$default == objM51918f) {
                return objM51918f;
            }
            inAppBackendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inAppBackendService = (InAppBackendService) c1166312.L$0;
            wre.m54934b(objPost$default);
        }
        HttpResponse httpResponse = (HttpResponse) objPost$default;
        if (!httpResponse.isSuccess()) {
            inAppBackendService.printHttpErrorForInAppMessageRequest("page impression", httpResponse.getStatusCode(), httpResponse.getPayload());
            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
        }
        String payload = httpResponse.getPayload();
        sq8.m48646e(payload);
        inAppBackendService.printHttpSuccessForInAppMessageRequest("page impression", payload);
        return y3i.f54824a;
    }
}
