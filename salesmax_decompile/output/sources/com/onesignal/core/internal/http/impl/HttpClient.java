package com.onesignal.core.internal.http.impl;

import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHeaders;
import org.apache.http.message.TokenParser;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.d9g;
import p001o.eu5;
import p001o.gge;
import p001o.h84;
import p001o.id5;
import p001o.jgg;
import p001o.kh3;
import p001o.kt7;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nk5;
import p001o.nl7;
import p001o.o64;
import p001o.omh;
import p001o.p69;
import p001o.rm1;
import p001o.rmh;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class HttpClient implements IHttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final ConfigModelStore _configModelStore;
    private final IHttpConnectionFactory _connectionFactory;
    private final IInstallIdService _installIdService;
    private final IPreferencesService _prefs;
    private final ITime _time;
    private long delayNewRequestsUntil;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.http.impl.HttpClient", m36648f = "HttpClient.kt", m36649l = {Opcodes.DUP, Opcodes.DUP2}, m36650m = "makeRequest")
    /* renamed from: com.onesignal.core.internal.http.impl.HttpClient$makeRequest$1 */
    public static final class C116151 extends o64 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C116151(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClient.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequest$2", m36648f = "HttpClient.kt", m36649l = {Opcodes.DUP2_X1}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.http.impl.HttpClient$makeRequest$2 */
    public static final class C116162 extends jgg implements nl7 {
        final /* synthetic */ OptionalHeaders $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116162(String str, String str2, JSONObject jSONObject, int i, OptionalHeaders optionalHeaders, n64 n64Var) {
            super(2, n64Var);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i;
            this.$headers = optionalHeaders;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return HttpClient.this.new C116162(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                HttpClient httpClient = HttpClient.this;
                String str = this.$url;
                String str2 = this.$method;
                JSONObject jSONObject = this.$jsonBody;
                int i2 = this.$timeout;
                OptionalHeaders optionalHeaders = this.$headers;
                this.label = 1;
                obj = httpClient.makeRequestIODispatcher(str, str2, jSONObject, i2, optionalHeaders, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116162) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.http.impl.HttpClient", m36648f = "HttpClient.kt", m36649l = {286}, m36650m = "makeRequestIODispatcher")
    /* renamed from: com.onesignal.core.internal.http.impl.HttpClient$makeRequestIODispatcher$1 */
    public static final class C116171 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116171(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClient.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    public HttpClient(IHttpConnectionFactory iHttpConnectionFactory, IPreferencesService iPreferencesService, ConfigModelStore configModelStore, ITime iTime, IInstallIdService iInstallIdService) {
        sq8.m48649h(iHttpConnectionFactory, "_connectionFactory");
        sq8.m48649h(iPreferencesService, "_prefs");
        sq8.m48649h(configModelStore, "_configModelStore");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(iInstallIdService, "_installIdService");
        this._connectionFactory = iHttpConnectionFactory;
        this._prefs = iPreferencesService;
        this._configModelStore = configModelStore;
        this._time = iTime;
        this._installIdService = iInstallIdService;
    }

    private final int getThreadTimeout(int i) {
        return i + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String strP0 = kh3.p0(map.entrySet(), null, null, null, 0, null, null, 63, null);
        if (str == null) {
            str = "GET";
        }
        Logging.debug$default("HttpClient: Request Sent = " + str + TokenParser.SP + url + " - Body: " + (jSONObject != null ? JSONUtils.INSTANCE.toUnescapedEUIDString(jSONObject) : null) + " - Headers: " + strP0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i, OptionalHeaders optionalHeaders, n64 n64Var) {
        C116151 c116151;
        int i2;
        String str3;
        HttpClient httpClient;
        String str4;
        JSONObject jSONObject2;
        OptionalHeaders optionalHeaders2;
        JSONObject jSONObject3;
        OptionalHeaders optionalHeaders3;
        HttpClient httpClient2;
        omh omhVar;
        String str5;
        String str6 = str2;
        if (n64Var instanceof C116151) {
            c116151 = (C116151) n64Var;
            int i3 = c116151.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c116151.label = i3 - Integer.MIN_VALUE;
            } else {
                c116151 = new C116151(n64Var);
            }
        }
        Object objM46984c = c116151.result;
        Object objM51918f = uq8.m51918f();
        int i4 = c116151.label;
        try {
            try {
                if (i4 == 0) {
                    wre.m54934b(objM46984c);
                    if (str6 != null && sq8.m48644c(this._configModelStore.getModel().getConsentRequired(), ml1.m39301a(true)) && !sq8.m48644c(this._configModelStore.getModel().getConsentGiven(), ml1.m39301a(true))) {
                        Logging.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                        return new HttpResponse(0, null, null, null, null, 24, null);
                    }
                    long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                    if (currentTimeMillis <= 0) {
                        i2 = i;
                        str3 = str;
                        httpClient = this;
                        str4 = str6;
                        jSONObject2 = jSONObject;
                        optionalHeaders2 = optionalHeaders;
                        long threadTimeout = httpClient.getThreadTimeout(i2);
                        C116162 c116162 = httpClient.new C116162(str3, str4, jSONObject2, i2, optionalHeaders2, null);
                        c116151.L$0 = str3;
                        c116151.L$1 = null;
                        c116151.L$2 = null;
                        c116151.L$3 = null;
                        c116151.L$4 = null;
                        c116151.label = 2;
                        objM46984c = rmh.m46984c(threadTimeout, c116162, c116151);
                        if (objM46984c == objM51918f) {
                            return objM51918f;
                        }
                        return objM46984c;
                    }
                    c116151.L$0 = this;
                    c116151.L$1 = str;
                    c116151.L$2 = str6;
                    jSONObject3 = jSONObject;
                    c116151.L$3 = jSONObject3;
                    optionalHeaders3 = optionalHeaders;
                    c116151.L$4 = optionalHeaders3;
                    i2 = i;
                    c116151.I$0 = i2;
                    c116151.label = 1;
                    if (nk5.m40720b(currentTimeMillis, c116151) == objM51918f) {
                        return objM51918f;
                    }
                    str3 = str;
                    httpClient2 = this;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str5 = (String) c116151.L$0;
                        try {
                            wre.m54934b(objM46984c);
                            return objM46984c;
                        } catch (omh e) {
                            omhVar = e;
                            Logging.error("HttpClient: Request timed out: " + str5, omhVar);
                            return new HttpResponse(0, null, omhVar, null, null, 24, null);
                        }
                    }
                    int i5 = c116151.I$0;
                    OptionalHeaders optionalHeaders4 = (OptionalHeaders) c116151.L$4;
                    JSONObject jSONObject4 = (JSONObject) c116151.L$3;
                    String str7 = (String) c116151.L$2;
                    str3 = (String) c116151.L$1;
                    httpClient2 = (HttpClient) c116151.L$0;
                    wre.m54934b(objM46984c);
                    i2 = i5;
                    jSONObject3 = jSONObject4;
                    optionalHeaders3 = optionalHeaders4;
                    str6 = str7;
                }
                long threadTimeout2 = httpClient.getThreadTimeout(i2);
                C116162 c1161622 = httpClient.new C116162(str3, str4, jSONObject2, i2, optionalHeaders2, null);
                c116151.L$0 = str3;
                c116151.L$1 = null;
                c116151.L$2 = null;
                c116151.L$3 = null;
                c116151.L$4 = null;
                c116151.label = 2;
                objM46984c = rmh.m46984c(threadTimeout2, c1161622, c116151);
                if (objM46984c == objM51918f) {
                }
                return objM46984c;
            } catch (omh e2) {
                omhVar = e2;
                str5 = str3;
                Logging.error("HttpClient: Request timed out: " + str5, omhVar);
                return new HttpResponse(0, null, omhVar, null, null, 24, null);
            }
            str4 = str6;
            jSONObject2 = jSONObject3;
            optionalHeaders2 = optionalHeaders3;
            httpClient = httpClient2;
        } catch (Throwable th) {
            return new HttpResponse(0, null, th, null, null, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i, OptionalHeaders optionalHeaders, n64 n64Var) {
        C116171 c116171;
        gge ggeVar;
        if (n64Var instanceof C116171) {
            c116171 = (C116171) n64Var;
            int i2 = c116171.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c116171.label = i2 - Integer.MIN_VALUE;
            } else {
                c116171 = new C116171(n64Var);
            }
        }
        Object obj = c116171.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c116171.label;
        if (i3 == 0) {
            wre.m54934b(obj);
            gge ggeVar2 = new gge();
            p69 p69VarM46952d = rm1.m46952d(kt7.f32697a, eu5.m25611b(), null, new HttpClient$makeRequestIODispatcher$job$1(this, str, i, jSONObject, str2, optionalHeaders, ggeVar2, null), 2, null);
            c116171.L$0 = ggeVar2;
            c116171.label = 1;
            if (p69VarM46952d.d0(c116171) == objM51918f) {
                return objM51918f;
            }
            ggeVar = ggeVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) c116171.L$0;
            wre.m54934b(obj);
        }
        Object obj2 = ggeVar.f25106a;
        sq8.m48646e(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.RETRY_AFTER);
        if (headerField == null) {
            if (httpURLConnection.getResponseCode() == 429) {
                return Integer.valueOf(this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
            }
            return null;
        }
        Logging.debug$default("HttpClient: Response Retry-After: " + headerField, null, 2, null);
        Integer numM22638l = d9g.m22638l(headerField);
        return Integer.valueOf(numM22638l != null ? numM22638l.intValue() : this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        Logging.debug$default("HttpClient: Response OneSignal-Retry-Limit: " + headerField, null, 2, null);
        return d9g.m22638l(headerField);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object delete(String str, OptionalHeaders optionalHeaders, n64 n64Var) {
        return makeRequest(str, "DELETE", null, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, n64Var);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object get(String str, OptionalHeaders optionalHeaders, n64 n64Var) {
        return makeRequest(str, null, null, this._configModelStore.getModel().getHttpGetTimeout(), optionalHeaders, n64Var);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object patch(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var) {
        return makeRequest(str, "PATCH", jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, n64Var);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object post(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var) {
        return makeRequest(str, "POST", jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, n64Var);
    }

    @Override // com.onesignal.core.internal.http.IHttpClient
    public Object put(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var) {
        return makeRequest(str, "PUT", jSONObject, this._configModelStore.getModel().getHttpTimeout(), optionalHeaders, n64Var);
    }
}
