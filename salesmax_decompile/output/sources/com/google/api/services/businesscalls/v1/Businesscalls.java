package com.google.api.services.businesscalls.v1;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Preconditions;
import com.google.api.services.businesscalls.v1.model.C11272xae9adc5e;
import com.google.api.services.businesscalls.v1.model.C11273x27e86452;
import com.google.api.services.businesscalls.v1.model.GoogleCommunicationsBusinesscallsV1SendVcallStateRequest;
import com.google.api.services.businesscalls.v1.model.GoogleCommunicationsBusinesscallsV1SendVcallStateResponse;
import com.google.api.services.businesscalls.v1.model.GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest;
import com.google.api.services.businesscalls.v1.model.GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse;

/* loaded from: classes3.dex */
public class Businesscalls extends AbstractGoogleJsonClient {
    public static final String DEFAULT_BASE_URL = "https://businesscalls.googleapis.com/";
    public static final String DEFAULT_BATCH_PATH = "batch";
    public static final String DEFAULT_ROOT_URL = "https://businesscalls.googleapis.com/";
    public static final String DEFAULT_SERVICE_PATH = "";

    public static final class Builder extends AbstractGoogleJsonClient.Builder {
        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
            super(httpTransport, jsonFactory, "https://businesscalls.googleapis.com/", "", httpRequestInitializer, false);
            setBatchPath("batch");
        }

        public Builder setBusinesscallsRequestInitializer(BusinesscallsRequestInitializer businesscallsRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer((GoogleClientRequestInitializer) businesscallsRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setBatchPath(String str) {
            return (Builder) super.setBatchPath(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Businesscalls build() {
            return new Businesscalls(this);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setApplicationName(String str) {
            return (Builder) super.setApplicationName(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleClientRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setRootUrl(String str) {
            return (Builder) super.setRootUrl(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setServicePath(String str) {
            return (Builder) super.setServicePath(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressAllChecks(boolean z) {
            return (Builder) super.setSuppressAllChecks(z);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressPatternChecks(boolean z) {
            return (Builder) super.setSuppressPatternChecks(z);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressRequiredParameterChecks(boolean z) {
            return (Builder) super.setSuppressRequiredParameterChecks(z);
        }
    }

    public class V1 {

        public class CheckVcallDeviceReachable extends BusinesscallsRequest<C11273x27e86452> {
            private static final String REST_PATH = "v1:checkVcallDeviceReachable";

            public CheckVcallDeviceReachable(V1 v1, C11272xae9adc5e c11272xae9adc5e) {
                super(Businesscalls.this, "POST", REST_PATH, c11272xae9adc5e, C11273x27e86452.class);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: set$Xgafv, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> set$Xgafv2(String str) {
                return (CheckVcallDeviceReachable) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setAccessToken, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setAccessToken2(String str) {
                return (CheckVcallDeviceReachable) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setAlt, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setAlt2(String str) {
                return (CheckVcallDeviceReachable) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setCallback, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setCallback2(String str) {
                return (CheckVcallDeviceReachable) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setFields, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setFields2(String str) {
                return (CheckVcallDeviceReachable) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setKey, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setKey2(String str) {
                return (CheckVcallDeviceReachable) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setOauthToken, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setOauthToken2(String str) {
                return (CheckVcallDeviceReachable) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setPrettyPrint, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setPrettyPrint2(Boolean bool) {
                return (CheckVcallDeviceReachable) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setQuotaUser, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setQuotaUser2(String str) {
                return (CheckVcallDeviceReachable) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setUploadProtocol, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setUploadProtocol2(String str) {
                return (CheckVcallDeviceReachable) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setUploadType, reason: merged with bridge method [inline-methods] */
            public BusinesscallsRequest<C11273x27e86452> setUploadType2(String str) {
                return (CheckVcallDeviceReachable) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public CheckVcallDeviceReachable set(String str, Object obj) {
                return (CheckVcallDeviceReachable) super.set(str, obj);
            }
        }

        public class SendVcallState extends BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> {
            private static final String REST_PATH = "v1:sendVcallState";

            public SendVcallState(V1 v1, GoogleCommunicationsBusinesscallsV1SendVcallStateRequest googleCommunicationsBusinesscallsV1SendVcallStateRequest) {
                super(Businesscalls.this, "POST", REST_PATH, googleCommunicationsBusinesscallsV1SendVcallStateRequest, GoogleCommunicationsBusinesscallsV1SendVcallStateResponse.class);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: set$Xgafv */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> set$Xgafv2(String str) {
                return (SendVcallState) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setAccessToken */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setAccessToken2(String str) {
                return (SendVcallState) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setAlt */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setAlt2(String str) {
                return (SendVcallState) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setCallback */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setCallback2(String str) {
                return (SendVcallState) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setFields */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setFields2(String str) {
                return (SendVcallState) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setKey */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setKey2(String str) {
                return (SendVcallState) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setOauthToken */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setOauthToken2(String str) {
                return (SendVcallState) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setPrettyPrint */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setPrettyPrint2(Boolean bool) {
                return (SendVcallState) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setQuotaUser */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setQuotaUser2(String str) {
                return (SendVcallState) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setUploadProtocol */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setUploadProtocol2(String str) {
                return (SendVcallState) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setUploadType */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallStateResponse> setUploadType2(String str) {
                return (SendVcallState) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public SendVcallState set(String str, Object obj) {
                return (SendVcallState) super.set(str, obj);
            }
        }

        public class SendVcallVerification extends BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> {
            private static final String REST_PATH = "v1:sendVcallVerification";

            public SendVcallVerification(V1 v1, GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest googleCommunicationsBusinesscallsV1SendVcallVerificationRequest) {
                super(Businesscalls.this, "POST", REST_PATH, googleCommunicationsBusinesscallsV1SendVcallVerificationRequest, GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse.class);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: set$Xgafv */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> set$Xgafv2(String str) {
                return (SendVcallVerification) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setAccessToken */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setAccessToken2(String str) {
                return (SendVcallVerification) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setAlt */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setAlt2(String str) {
                return (SendVcallVerification) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setCallback */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setCallback2(String str) {
                return (SendVcallVerification) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setFields */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setFields2(String str) {
                return (SendVcallVerification) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setKey */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setKey2(String str) {
                return (SendVcallVerification) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setOauthToken */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setOauthToken2(String str) {
                return (SendVcallVerification) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setPrettyPrint */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setPrettyPrint2(Boolean bool) {
                return (SendVcallVerification) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setQuotaUser */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setQuotaUser2(String str) {
                return (SendVcallVerification) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setUploadProtocol */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setUploadProtocol2(String str) {
                return (SendVcallVerification) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest
            /* renamed from: setUploadType */
            public BusinesscallsRequest<GoogleCommunicationsBusinesscallsV1SendVcallVerificationResponse> setUploadType2(String str) {
                return (SendVcallVerification) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscalls.v1.BusinesscallsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public SendVcallVerification set(String str, Object obj) {
                return (SendVcallVerification) super.set(str, obj);
            }
        }

        public V1() {
        }

        public CheckVcallDeviceReachable checkVcallDeviceReachable(C11272xae9adc5e c11272xae9adc5e) {
            CheckVcallDeviceReachable checkVcallDeviceReachable = new CheckVcallDeviceReachable(this, c11272xae9adc5e);
            Businesscalls.this.initialize(checkVcallDeviceReachable);
            return checkVcallDeviceReachable;
        }

        public SendVcallState sendVcallState(GoogleCommunicationsBusinesscallsV1SendVcallStateRequest googleCommunicationsBusinesscallsV1SendVcallStateRequest) {
            SendVcallState sendVcallState = new SendVcallState(this, googleCommunicationsBusinesscallsV1SendVcallStateRequest);
            Businesscalls.this.initialize(sendVcallState);
            return sendVcallState;
        }

        public SendVcallVerification sendVcallVerification(GoogleCommunicationsBusinesscallsV1SendVcallVerificationRequest googleCommunicationsBusinesscallsV1SendVcallVerificationRequest) {
            SendVcallVerification sendVcallVerification = new SendVcallVerification(this, googleCommunicationsBusinesscallsV1SendVcallVerificationRequest);
            Businesscalls.this.initialize(sendVcallVerification);
            return sendVcallVerification;
        }
    }

    static {
        Preconditions.checkState(GoogleUtils.MAJOR_VERSION.intValue() == 1 && GoogleUtils.MINOR_VERSION.intValue() >= 15, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.25.0-SNAPSHOT of the Business Calls API library.", GoogleUtils.VERSION);
    }

    public Businesscalls(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
        this(new Builder(httpTransport, jsonFactory, httpRequestInitializer));
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClient
    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) {
        super.initialize(abstractGoogleClientRequest);
    }

    public V1 v1() {
        return new V1();
    }

    public Businesscalls(Builder builder) {
        super(builder);
    }
}
