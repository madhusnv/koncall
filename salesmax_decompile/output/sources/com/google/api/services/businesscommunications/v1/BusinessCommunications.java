package com.google.api.services.businesscommunications.v1;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;
import com.google.api.services.businesscommunications.v1.model.Agent;
import com.google.api.services.businesscommunications.v1.model.AgentLaunch;
import com.google.api.services.businesscommunications.v1.model.AgentVerification;
import com.google.api.services.businesscommunications.v1.model.Brand;
import com.google.api.services.businesscommunications.v1.model.Empty;
import com.google.api.services.businesscommunications.v1.model.ListAgentsResponse;
import com.google.api.services.businesscommunications.v1.model.ListBrandsResponse;
import com.google.api.services.businesscommunications.v1.model.ListLocationsResponse;
import com.google.api.services.businesscommunications.v1.model.Location;
import com.google.api.services.businesscommunications.v1.model.LocationLaunch;
import com.google.api.services.businesscommunications.v1.model.LocationVerification;
import com.google.api.services.businesscommunications.v1.model.Partner;
import com.google.api.services.businesscommunications.v1.model.RequestAgentLaunchRequest;
import com.google.api.services.businesscommunications.v1.model.RequestAgentVerificationRequest;
import com.google.api.services.businesscommunications.v1.model.RequestLocationLaunchRequest;
import com.google.api.services.businesscommunications.v1.model.RequestLocationVerificationRequest;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class BusinessCommunications extends AbstractGoogleJsonClient {
    public static final String DEFAULT_BASE_URL = "https://businesscommunications.googleapis.com/";
    public static final String DEFAULT_BATCH_PATH = "batch";
    public static final String DEFAULT_ROOT_URL = "https://businesscommunications.googleapis.com/";
    public static final String DEFAULT_SERVICE_PATH = "";

    public class Brands {

        public class Agents {

            public class Create extends BusinessCommunicationsRequest<Agent> {
                private static final String REST_PATH = "v1/{+parent}/agents";
                private final Pattern PARENT_PATTERN;

                @Key
                private String parent;

                public Create(String str, Agent agent) {
                    super(BusinessCommunications.this, "POST", REST_PATH, agent, Agent.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+$");
                    this.PARENT_PATTERN = patternCompile;
                    this.parent = (String) Preconditions.checkNotNull(str, "Required parameter parent must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                }

                public String getParent() {
                    return this.parent;
                }

                public Create setParent(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.PARENT_PATTERN.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                    }
                    this.parent = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> set$Xgafv2(String str) {
                    return (Create) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setAccessToken2(String str) {
                    return (Create) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setAlt2(String str) {
                    return (Create) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setCallback2(String str) {
                    return (Create) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setFields2(String str) {
                    return (Create) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setKey2(String str) {
                    return (Create) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setOauthToken2(String str) {
                    return (Create) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setPrettyPrint2(Boolean bool) {
                    return (Create) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setQuotaUser2(String str) {
                    return (Create) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setUploadProtocol2(String str) {
                    return (Create) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType, reason: merged with bridge method [inline-methods] */
                public BusinessCommunicationsRequest<Agent> setUploadType2(String str) {
                    return (Create) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Create set(String str, Object obj) {
                    return (Create) super.set(str, obj);
                }
            }

            public class Delete extends BusinessCommunicationsRequest<Empty> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public Delete(String str) {
                    super(BusinessCommunications.this, "DELETE", REST_PATH, null, Empty.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public Delete setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<Empty> set$Xgafv2(String str) {
                    return (Delete) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<Empty> setAccessToken2(String str) {
                    return (Delete) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<Empty> setAlt2(String str) {
                    return (Delete) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<Empty> setCallback2(String str) {
                    return (Delete) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<Empty> setFields2(String str) {
                    return (Delete) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<Empty> setKey2(String str) {
                    return (Delete) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<Empty> setOauthToken2(String str) {
                    return (Delete) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<Empty> setPrettyPrint2(Boolean bool) {
                    return (Delete) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<Empty> setQuotaUser2(String str) {
                    return (Delete) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<Empty> setUploadProtocol2(String str) {
                    return (Delete) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<Empty> setUploadType2(String str) {
                    return (Delete) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Delete set(String str, Object obj) {
                    return (Delete) super.set(str, obj);
                }
            }

            public class Get extends BusinessCommunicationsRequest<Agent> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public Get(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, Agent.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public String getName() {
                    return this.name;
                }

                public Get setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<Agent> set$Xgafv2(String str) {
                    return (Get) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<Agent> setAccessToken2(String str) {
                    return (Get) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<Agent> setAlt2(String str) {
                    return (Get) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<Agent> setCallback2(String str) {
                    return (Get) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<Agent> setFields2(String str) {
                    return (Get) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<Agent> setKey2(String str) {
                    return (Get) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<Agent> setOauthToken2(String str) {
                    return (Get) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<Agent> setPrettyPrint2(Boolean bool) {
                    return (Get) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<Agent> setQuotaUser2(String str) {
                    return (Get) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<Agent> setUploadProtocol2(String str) {
                    return (Get) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<Agent> setUploadType2(String str) {
                    return (Get) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Get set(String str, Object obj) {
                    return (Get) super.set(str, obj);
                }
            }

            public class GetLaunch extends BusinessCommunicationsRequest<AgentLaunch> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public GetLaunch(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, AgentLaunch.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+/launch$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/launch$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public String getName() {
                    return this.name;
                }

                public GetLaunch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/launch$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<AgentLaunch> set$Xgafv2(String str) {
                    return (GetLaunch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<AgentLaunch> setAccessToken2(String str) {
                    return (GetLaunch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<AgentLaunch> setAlt2(String str) {
                    return (GetLaunch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<AgentLaunch> setCallback2(String str) {
                    return (GetLaunch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<AgentLaunch> setFields2(String str) {
                    return (GetLaunch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<AgentLaunch> setKey2(String str) {
                    return (GetLaunch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<AgentLaunch> setOauthToken2(String str) {
                    return (GetLaunch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<AgentLaunch> setPrettyPrint2(Boolean bool) {
                    return (GetLaunch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<AgentLaunch> setQuotaUser2(String str) {
                    return (GetLaunch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<AgentLaunch> setUploadProtocol2(String str) {
                    return (GetLaunch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<AgentLaunch> setUploadType2(String str) {
                    return (GetLaunch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public GetLaunch set(String str, Object obj) {
                    return (GetLaunch) super.set(str, obj);
                }
            }

            public class GetVerification extends BusinessCommunicationsRequest<AgentVerification> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public GetVerification(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, AgentVerification.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+/verification$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/verification$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public String getName() {
                    return this.name;
                }

                public GetVerification setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/verification$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<AgentVerification> set$Xgafv2(String str) {
                    return (GetVerification) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<AgentVerification> setAccessToken2(String str) {
                    return (GetVerification) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<AgentVerification> setAlt2(String str) {
                    return (GetVerification) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<AgentVerification> setCallback2(String str) {
                    return (GetVerification) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<AgentVerification> setFields2(String str) {
                    return (GetVerification) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<AgentVerification> setKey2(String str) {
                    return (GetVerification) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<AgentVerification> setOauthToken2(String str) {
                    return (GetVerification) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<AgentVerification> setPrettyPrint2(Boolean bool) {
                    return (GetVerification) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<AgentVerification> setQuotaUser2(String str) {
                    return (GetVerification) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<AgentVerification> setUploadProtocol2(String str) {
                    return (GetVerification) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<AgentVerification> setUploadType2(String str) {
                    return (GetVerification) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public GetVerification set(String str, Object obj) {
                    return (GetVerification) super.set(str, obj);
                }
            }

            public class List extends BusinessCommunicationsRequest<ListAgentsResponse> {
                private static final String REST_PATH = "v1/{+parent}/agents";
                private final Pattern PARENT_PATTERN;

                @Key
                private Integer pageSize;

                @Key
                private String pageToken;

                @Key
                private String parent;

                public List(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, ListAgentsResponse.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+$");
                    this.PARENT_PATTERN = patternCompile;
                    this.parent = (String) Preconditions.checkNotNull(str, "Required parameter parent must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public Integer getPageSize() {
                    return this.pageSize;
                }

                public String getPageToken() {
                    return this.pageToken;
                }

                public String getParent() {
                    return this.parent;
                }

                public List setPageSize(Integer num) {
                    this.pageSize = num;
                    return this;
                }

                public List setPageToken(String str) {
                    this.pageToken = str;
                    return this;
                }

                public List setParent(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.PARENT_PATTERN.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                    }
                    this.parent = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<ListAgentsResponse> set$Xgafv2(String str) {
                    return (List) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<ListAgentsResponse> setAccessToken2(String str) {
                    return (List) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<ListAgentsResponse> setAlt2(String str) {
                    return (List) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<ListAgentsResponse> setCallback2(String str) {
                    return (List) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<ListAgentsResponse> setFields2(String str) {
                    return (List) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<ListAgentsResponse> setKey2(String str) {
                    return (List) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<ListAgentsResponse> setOauthToken2(String str) {
                    return (List) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<ListAgentsResponse> setPrettyPrint2(Boolean bool) {
                    return (List) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<ListAgentsResponse> setQuotaUser2(String str) {
                    return (List) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<ListAgentsResponse> setUploadProtocol2(String str) {
                    return (List) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<ListAgentsResponse> setUploadType2(String str) {
                    return (List) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public List set(String str, Object obj) {
                    return (List) super.set(str, obj);
                }
            }

            public class Patch extends BusinessCommunicationsRequest<Agent> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                @Key
                private String updateMask;

                public Patch(String str, Agent agent) {
                    super(BusinessCommunications.this, "PATCH", REST_PATH, agent, Agent.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public String getUpdateMask() {
                    return this.updateMask;
                }

                public Patch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                public Patch setUpdateMask(String str) {
                    this.updateMask = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<Agent> set$Xgafv2(String str) {
                    return (Patch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<Agent> setAccessToken2(String str) {
                    return (Patch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<Agent> setAlt2(String str) {
                    return (Patch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<Agent> setCallback2(String str) {
                    return (Patch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<Agent> setFields2(String str) {
                    return (Patch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<Agent> setKey2(String str) {
                    return (Patch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<Agent> setOauthToken2(String str) {
                    return (Patch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<Agent> setPrettyPrint2(Boolean bool) {
                    return (Patch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<Agent> setQuotaUser2(String str) {
                    return (Patch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<Agent> setUploadProtocol2(String str) {
                    return (Patch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<Agent> setUploadType2(String str) {
                    return (Patch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Patch set(String str, Object obj) {
                    return (Patch) super.set(str, obj);
                }
            }

            public class RequestLaunch extends BusinessCommunicationsRequest<AgentLaunch> {
                private static final String REST_PATH = "v1/{+name}:requestLaunch";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public RequestLaunch(String str, RequestAgentLaunchRequest requestAgentLaunchRequest) {
                    super(BusinessCommunications.this, "POST", REST_PATH, requestAgentLaunchRequest, AgentLaunch.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public RequestLaunch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<AgentLaunch> set$Xgafv2(String str) {
                    return (RequestLaunch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<AgentLaunch> setAccessToken2(String str) {
                    return (RequestLaunch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<AgentLaunch> setAlt2(String str) {
                    return (RequestLaunch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<AgentLaunch> setCallback2(String str) {
                    return (RequestLaunch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<AgentLaunch> setFields2(String str) {
                    return (RequestLaunch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<AgentLaunch> setKey2(String str) {
                    return (RequestLaunch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<AgentLaunch> setOauthToken2(String str) {
                    return (RequestLaunch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<AgentLaunch> setPrettyPrint2(Boolean bool) {
                    return (RequestLaunch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<AgentLaunch> setQuotaUser2(String str) {
                    return (RequestLaunch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<AgentLaunch> setUploadProtocol2(String str) {
                    return (RequestLaunch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<AgentLaunch> setUploadType2(String str) {
                    return (RequestLaunch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public RequestLaunch set(String str, Object obj) {
                    return (RequestLaunch) super.set(str, obj);
                }
            }

            public class RequestVerification extends BusinessCommunicationsRequest<AgentVerification> {
                private static final String REST_PATH = "v1/{+name}:requestVerification";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public RequestVerification(String str, RequestAgentVerificationRequest requestAgentVerificationRequest) {
                    super(BusinessCommunications.this, "POST", REST_PATH, requestAgentVerificationRequest, AgentVerification.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public RequestVerification setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<AgentVerification> set$Xgafv2(String str) {
                    return (RequestVerification) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<AgentVerification> setAccessToken2(String str) {
                    return (RequestVerification) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<AgentVerification> setAlt2(String str) {
                    return (RequestVerification) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<AgentVerification> setCallback2(String str) {
                    return (RequestVerification) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<AgentVerification> setFields2(String str) {
                    return (RequestVerification) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<AgentVerification> setKey2(String str) {
                    return (RequestVerification) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<AgentVerification> setOauthToken2(String str) {
                    return (RequestVerification) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<AgentVerification> setPrettyPrint2(Boolean bool) {
                    return (RequestVerification) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<AgentVerification> setQuotaUser2(String str) {
                    return (RequestVerification) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<AgentVerification> setUploadProtocol2(String str) {
                    return (RequestVerification) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<AgentVerification> setUploadType2(String str) {
                    return (RequestVerification) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public RequestVerification set(String str, Object obj) {
                    return (RequestVerification) super.set(str, obj);
                }
            }

            public class UpdateLaunch extends BusinessCommunicationsRequest<AgentLaunch> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                @Key
                private String updateMask;

                public UpdateLaunch(String str, AgentLaunch agentLaunch) {
                    super(BusinessCommunications.this, "PATCH", REST_PATH, agentLaunch, AgentLaunch.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+/launch$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/launch$");
                }

                public String getName() {
                    return this.name;
                }

                public String getUpdateMask() {
                    return this.updateMask;
                }

                public UpdateLaunch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/launch$");
                    }
                    this.name = str;
                    return this;
                }

                public UpdateLaunch setUpdateMask(String str) {
                    this.updateMask = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<AgentLaunch> set$Xgafv2(String str) {
                    return (UpdateLaunch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<AgentLaunch> setAccessToken2(String str) {
                    return (UpdateLaunch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<AgentLaunch> setAlt2(String str) {
                    return (UpdateLaunch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<AgentLaunch> setCallback2(String str) {
                    return (UpdateLaunch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<AgentLaunch> setFields2(String str) {
                    return (UpdateLaunch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<AgentLaunch> setKey2(String str) {
                    return (UpdateLaunch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<AgentLaunch> setOauthToken2(String str) {
                    return (UpdateLaunch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<AgentLaunch> setPrettyPrint2(Boolean bool) {
                    return (UpdateLaunch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<AgentLaunch> setQuotaUser2(String str) {
                    return (UpdateLaunch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<AgentLaunch> setUploadProtocol2(String str) {
                    return (UpdateLaunch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<AgentLaunch> setUploadType2(String str) {
                    return (UpdateLaunch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public UpdateLaunch set(String str, Object obj) {
                    return (UpdateLaunch) super.set(str, obj);
                }
            }

            public class UpdateVerification extends BusinessCommunicationsRequest<AgentVerification> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                @Key
                private String updateMask;

                public UpdateVerification(String str, AgentVerification agentVerification) {
                    super(BusinessCommunications.this, "PATCH", REST_PATH, agentVerification, AgentVerification.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/agents/[^/]+/verification$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/verification$");
                }

                public String getName() {
                    return this.name;
                }

                public String getUpdateMask() {
                    return this.updateMask;
                }

                public UpdateVerification setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/agents/[^/]+/verification$");
                    }
                    this.name = str;
                    return this;
                }

                public UpdateVerification setUpdateMask(String str) {
                    this.updateMask = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<AgentVerification> set$Xgafv2(String str) {
                    return (UpdateVerification) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<AgentVerification> setAccessToken2(String str) {
                    return (UpdateVerification) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<AgentVerification> setAlt2(String str) {
                    return (UpdateVerification) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<AgentVerification> setCallback2(String str) {
                    return (UpdateVerification) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<AgentVerification> setFields2(String str) {
                    return (UpdateVerification) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<AgentVerification> setKey2(String str) {
                    return (UpdateVerification) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<AgentVerification> setOauthToken2(String str) {
                    return (UpdateVerification) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<AgentVerification> setPrettyPrint2(Boolean bool) {
                    return (UpdateVerification) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<AgentVerification> setQuotaUser2(String str) {
                    return (UpdateVerification) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<AgentVerification> setUploadProtocol2(String str) {
                    return (UpdateVerification) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<AgentVerification> setUploadType2(String str) {
                    return (UpdateVerification) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public UpdateVerification set(String str, Object obj) {
                    return (UpdateVerification) super.set(str, obj);
                }
            }

            public Agents() {
            }

            public Create create(String str, Agent agent) {
                Create create = new Create(str, agent);
                BusinessCommunications.this.initialize(create);
                return create;
            }

            public Delete delete(String str) {
                Delete delete = new Delete(str);
                BusinessCommunications.this.initialize(delete);
                return delete;
            }

            public Get get(String str) {
                Get get = new Get(str);
                BusinessCommunications.this.initialize(get);
                return get;
            }

            public GetLaunch getLaunch(String str) {
                GetLaunch getLaunch = new GetLaunch(str);
                BusinessCommunications.this.initialize(getLaunch);
                return getLaunch;
            }

            public GetVerification getVerification(String str) {
                GetVerification getVerification = new GetVerification(str);
                BusinessCommunications.this.initialize(getVerification);
                return getVerification;
            }

            public List list(String str) {
                List list = new List(str);
                BusinessCommunications.this.initialize(list);
                return list;
            }

            public Patch patch(String str, Agent agent) {
                Patch patch = new Patch(str, agent);
                BusinessCommunications.this.initialize(patch);
                return patch;
            }

            public RequestLaunch requestLaunch(String str, RequestAgentLaunchRequest requestAgentLaunchRequest) {
                RequestLaunch requestLaunch = new RequestLaunch(str, requestAgentLaunchRequest);
                BusinessCommunications.this.initialize(requestLaunch);
                return requestLaunch;
            }

            public RequestVerification requestVerification(String str, RequestAgentVerificationRequest requestAgentVerificationRequest) {
                RequestVerification requestVerification = new RequestVerification(str, requestAgentVerificationRequest);
                BusinessCommunications.this.initialize(requestVerification);
                return requestVerification;
            }

            public UpdateLaunch updateLaunch(String str, AgentLaunch agentLaunch) {
                UpdateLaunch updateLaunch = new UpdateLaunch(str, agentLaunch);
                BusinessCommunications.this.initialize(updateLaunch);
                return updateLaunch;
            }

            public UpdateVerification updateVerification(String str, AgentVerification agentVerification) {
                UpdateVerification updateVerification = new UpdateVerification(str, agentVerification);
                BusinessCommunications.this.initialize(updateVerification);
                return updateVerification;
            }
        }

        public class Create extends BusinessCommunicationsRequest<Brand> {
            private static final String REST_PATH = "v1/brands";

            public Create(Brands brands, Brand brand) {
                super(BusinessCommunications.this, "POST", REST_PATH, brand, Brand.class);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: set$Xgafv */
            public BusinessCommunicationsRequest<Brand> set$Xgafv2(String str) {
                return (Create) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAccessToken */
            public BusinessCommunicationsRequest<Brand> setAccessToken2(String str) {
                return (Create) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAlt */
            public BusinessCommunicationsRequest<Brand> setAlt2(String str) {
                return (Create) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setCallback */
            public BusinessCommunicationsRequest<Brand> setCallback2(String str) {
                return (Create) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setFields */
            public BusinessCommunicationsRequest<Brand> setFields2(String str) {
                return (Create) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setKey */
            public BusinessCommunicationsRequest<Brand> setKey2(String str) {
                return (Create) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setOauthToken */
            public BusinessCommunicationsRequest<Brand> setOauthToken2(String str) {
                return (Create) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setPrettyPrint */
            public BusinessCommunicationsRequest<Brand> setPrettyPrint2(Boolean bool) {
                return (Create) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setQuotaUser */
            public BusinessCommunicationsRequest<Brand> setQuotaUser2(String str) {
                return (Create) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadProtocol */
            public BusinessCommunicationsRequest<Brand> setUploadProtocol2(String str) {
                return (Create) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadType */
            public BusinessCommunicationsRequest<Brand> setUploadType2(String str) {
                return (Create) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Create set(String str, Object obj) {
                return (Create) super.set(str, obj);
            }
        }

        public class Delete extends BusinessCommunicationsRequest<Empty> {
            private static final String REST_PATH = "v1/{+name}";
            private final Pattern NAME_PATTERN;

            @Key
            private Boolean force;

            @Key
            private String name;

            public Delete(String str) {
                super(BusinessCommunications.this, "DELETE", REST_PATH, null, Empty.class);
                Pattern patternCompile = Pattern.compile("^brands/[^/]+$");
                this.NAME_PATTERN = patternCompile;
                this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                if (BusinessCommunications.this.getSuppressPatternChecks()) {
                    return;
                }
                Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+$");
            }

            public Boolean getForce() {
                return this.force;
            }

            public String getName() {
                return this.name;
            }

            public Delete setForce(Boolean bool) {
                this.force = bool;
                return this;
            }

            public Delete setName(String str) {
                if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                    Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+$");
                }
                this.name = str;
                return this;
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: set$Xgafv */
            public BusinessCommunicationsRequest<Empty> set$Xgafv2(String str) {
                return (Delete) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAccessToken */
            public BusinessCommunicationsRequest<Empty> setAccessToken2(String str) {
                return (Delete) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAlt */
            public BusinessCommunicationsRequest<Empty> setAlt2(String str) {
                return (Delete) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setCallback */
            public BusinessCommunicationsRequest<Empty> setCallback2(String str) {
                return (Delete) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setFields */
            public BusinessCommunicationsRequest<Empty> setFields2(String str) {
                return (Delete) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setKey */
            public BusinessCommunicationsRequest<Empty> setKey2(String str) {
                return (Delete) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setOauthToken */
            public BusinessCommunicationsRequest<Empty> setOauthToken2(String str) {
                return (Delete) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setPrettyPrint */
            public BusinessCommunicationsRequest<Empty> setPrettyPrint2(Boolean bool) {
                return (Delete) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setQuotaUser */
            public BusinessCommunicationsRequest<Empty> setQuotaUser2(String str) {
                return (Delete) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadProtocol */
            public BusinessCommunicationsRequest<Empty> setUploadProtocol2(String str) {
                return (Delete) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadType */
            public BusinessCommunicationsRequest<Empty> setUploadType2(String str) {
                return (Delete) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Delete set(String str, Object obj) {
                return (Delete) super.set(str, obj);
            }
        }

        public class Get extends BusinessCommunicationsRequest<Brand> {
            private static final String REST_PATH = "v1/{+name}";
            private final Pattern NAME_PATTERN;

            @Key
            private String name;

            public Get(String str) {
                super(BusinessCommunications.this, "GET", REST_PATH, null, Brand.class);
                Pattern patternCompile = Pattern.compile("^brands/[^/]+$");
                this.NAME_PATTERN = patternCompile;
                this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                if (BusinessCommunications.this.getSuppressPatternChecks()) {
                    return;
                }
                Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+$");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getName() {
                return this.name;
            }

            public Get setName(String str) {
                if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                    Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+$");
                }
                this.name = str;
                return this;
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: set$Xgafv */
            public BusinessCommunicationsRequest<Brand> set$Xgafv2(String str) {
                return (Get) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAccessToken */
            public BusinessCommunicationsRequest<Brand> setAccessToken2(String str) {
                return (Get) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAlt */
            public BusinessCommunicationsRequest<Brand> setAlt2(String str) {
                return (Get) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setCallback */
            public BusinessCommunicationsRequest<Brand> setCallback2(String str) {
                return (Get) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setFields */
            public BusinessCommunicationsRequest<Brand> setFields2(String str) {
                return (Get) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setKey */
            public BusinessCommunicationsRequest<Brand> setKey2(String str) {
                return (Get) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setOauthToken */
            public BusinessCommunicationsRequest<Brand> setOauthToken2(String str) {
                return (Get) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setPrettyPrint */
            public BusinessCommunicationsRequest<Brand> setPrettyPrint2(Boolean bool) {
                return (Get) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setQuotaUser */
            public BusinessCommunicationsRequest<Brand> setQuotaUser2(String str) {
                return (Get) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadProtocol */
            public BusinessCommunicationsRequest<Brand> setUploadProtocol2(String str) {
                return (Get) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadType */
            public BusinessCommunicationsRequest<Brand> setUploadType2(String str) {
                return (Get) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }
        }

        public class List extends BusinessCommunicationsRequest<ListBrandsResponse> {
            private static final String REST_PATH = "v1/brands";

            @Key
            private Integer pageSize;

            @Key
            private String pageToken;

            public List(Brands brands) {
                super(BusinessCommunications.this, "GET", REST_PATH, null, ListBrandsResponse.class);
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public Integer getPageSize() {
                return this.pageSize;
            }

            public String getPageToken() {
                return this.pageToken;
            }

            public List setPageSize(Integer num) {
                this.pageSize = num;
                return this;
            }

            public List setPageToken(String str) {
                this.pageToken = str;
                return this;
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: set$Xgafv */
            public BusinessCommunicationsRequest<ListBrandsResponse> set$Xgafv2(String str) {
                return (List) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAccessToken */
            public BusinessCommunicationsRequest<ListBrandsResponse> setAccessToken2(String str) {
                return (List) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAlt */
            public BusinessCommunicationsRequest<ListBrandsResponse> setAlt2(String str) {
                return (List) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setCallback */
            public BusinessCommunicationsRequest<ListBrandsResponse> setCallback2(String str) {
                return (List) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setFields */
            public BusinessCommunicationsRequest<ListBrandsResponse> setFields2(String str) {
                return (List) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setKey */
            public BusinessCommunicationsRequest<ListBrandsResponse> setKey2(String str) {
                return (List) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setOauthToken */
            public BusinessCommunicationsRequest<ListBrandsResponse> setOauthToken2(String str) {
                return (List) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setPrettyPrint */
            public BusinessCommunicationsRequest<ListBrandsResponse> setPrettyPrint2(Boolean bool) {
                return (List) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setQuotaUser */
            public BusinessCommunicationsRequest<ListBrandsResponse> setQuotaUser2(String str) {
                return (List) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadProtocol */
            public BusinessCommunicationsRequest<ListBrandsResponse> setUploadProtocol2(String str) {
                return (List) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadType */
            public BusinessCommunicationsRequest<ListBrandsResponse> setUploadType2(String str) {
                return (List) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public List set(String str, Object obj) {
                return (List) super.set(str, obj);
            }
        }

        public class Locations {

            public class Create extends BusinessCommunicationsRequest<Location> {
                private static final String REST_PATH = "v1/{+parent}/locations";
                private final Pattern PARENT_PATTERN;

                @Key
                private String parent;

                public Create(String str, Location location) {
                    super(BusinessCommunications.this, "POST", REST_PATH, location, Location.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+$");
                    this.PARENT_PATTERN = patternCompile;
                    this.parent = (String) Preconditions.checkNotNull(str, "Required parameter parent must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                }

                public String getParent() {
                    return this.parent;
                }

                public Create setParent(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.PARENT_PATTERN.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                    }
                    this.parent = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<Location> set$Xgafv2(String str) {
                    return (Create) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<Location> setAccessToken2(String str) {
                    return (Create) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<Location> setAlt2(String str) {
                    return (Create) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<Location> setCallback2(String str) {
                    return (Create) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<Location> setFields2(String str) {
                    return (Create) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<Location> setKey2(String str) {
                    return (Create) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<Location> setOauthToken2(String str) {
                    return (Create) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<Location> setPrettyPrint2(Boolean bool) {
                    return (Create) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<Location> setQuotaUser2(String str) {
                    return (Create) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<Location> setUploadProtocol2(String str) {
                    return (Create) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<Location> setUploadType2(String str) {
                    return (Create) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Create set(String str, Object obj) {
                    return (Create) super.set(str, obj);
                }
            }

            public class Delete extends BusinessCommunicationsRequest<Empty> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public Delete(String str) {
                    super(BusinessCommunications.this, "DELETE", REST_PATH, null, Empty.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public Delete setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<Empty> set$Xgafv2(String str) {
                    return (Delete) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<Empty> setAccessToken2(String str) {
                    return (Delete) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<Empty> setAlt2(String str) {
                    return (Delete) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<Empty> setCallback2(String str) {
                    return (Delete) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<Empty> setFields2(String str) {
                    return (Delete) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<Empty> setKey2(String str) {
                    return (Delete) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<Empty> setOauthToken2(String str) {
                    return (Delete) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<Empty> setPrettyPrint2(Boolean bool) {
                    return (Delete) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<Empty> setQuotaUser2(String str) {
                    return (Delete) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<Empty> setUploadProtocol2(String str) {
                    return (Delete) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<Empty> setUploadType2(String str) {
                    return (Delete) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Delete set(String str, Object obj) {
                    return (Delete) super.set(str, obj);
                }
            }

            public class Get extends BusinessCommunicationsRequest<Location> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public Get(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, Location.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public String getName() {
                    return this.name;
                }

                public Get setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<Location> set$Xgafv2(String str) {
                    return (Get) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<Location> setAccessToken2(String str) {
                    return (Get) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<Location> setAlt2(String str) {
                    return (Get) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<Location> setCallback2(String str) {
                    return (Get) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<Location> setFields2(String str) {
                    return (Get) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<Location> setKey2(String str) {
                    return (Get) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<Location> setOauthToken2(String str) {
                    return (Get) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<Location> setPrettyPrint2(Boolean bool) {
                    return (Get) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<Location> setQuotaUser2(String str) {
                    return (Get) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<Location> setUploadProtocol2(String str) {
                    return (Get) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<Location> setUploadType2(String str) {
                    return (Get) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Get set(String str, Object obj) {
                    return (Get) super.set(str, obj);
                }
            }

            public class GetLaunch extends BusinessCommunicationsRequest<LocationLaunch> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public GetLaunch(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, LocationLaunch.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+/launch$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+/launch$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public String getName() {
                    return this.name;
                }

                public GetLaunch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+/launch$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<LocationLaunch> set$Xgafv2(String str) {
                    return (GetLaunch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<LocationLaunch> setAccessToken2(String str) {
                    return (GetLaunch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<LocationLaunch> setAlt2(String str) {
                    return (GetLaunch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<LocationLaunch> setCallback2(String str) {
                    return (GetLaunch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<LocationLaunch> setFields2(String str) {
                    return (GetLaunch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<LocationLaunch> setKey2(String str) {
                    return (GetLaunch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<LocationLaunch> setOauthToken2(String str) {
                    return (GetLaunch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<LocationLaunch> setPrettyPrint2(Boolean bool) {
                    return (GetLaunch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<LocationLaunch> setQuotaUser2(String str) {
                    return (GetLaunch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<LocationLaunch> setUploadProtocol2(String str) {
                    return (GetLaunch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<LocationLaunch> setUploadType2(String str) {
                    return (GetLaunch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public GetLaunch set(String str, Object obj) {
                    return (GetLaunch) super.set(str, obj);
                }
            }

            public class GetVerification extends BusinessCommunicationsRequest<LocationVerification> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public GetVerification(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, LocationVerification.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+/verification$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+/verification$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public String getName() {
                    return this.name;
                }

                public GetVerification setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+/verification$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<LocationVerification> set$Xgafv2(String str) {
                    return (GetVerification) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<LocationVerification> setAccessToken2(String str) {
                    return (GetVerification) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<LocationVerification> setAlt2(String str) {
                    return (GetVerification) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<LocationVerification> setCallback2(String str) {
                    return (GetVerification) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<LocationVerification> setFields2(String str) {
                    return (GetVerification) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<LocationVerification> setKey2(String str) {
                    return (GetVerification) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<LocationVerification> setOauthToken2(String str) {
                    return (GetVerification) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<LocationVerification> setPrettyPrint2(Boolean bool) {
                    return (GetVerification) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<LocationVerification> setQuotaUser2(String str) {
                    return (GetVerification) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<LocationVerification> setUploadProtocol2(String str) {
                    return (GetVerification) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<LocationVerification> setUploadType2(String str) {
                    return (GetVerification) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public GetVerification set(String str, Object obj) {
                    return (GetVerification) super.set(str, obj);
                }
            }

            public class List extends BusinessCommunicationsRequest<ListLocationsResponse> {
                private static final String REST_PATH = "v1/{+parent}/locations";
                private final Pattern PARENT_PATTERN;

                @Key
                private Integer pageSize;

                @Key
                private String pageToken;

                @Key
                private String parent;

                public List(String str) {
                    super(BusinessCommunications.this, "GET", REST_PATH, null, ListLocationsResponse.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+$");
                    this.PARENT_PATTERN = patternCompile;
                    this.parent = (String) Preconditions.checkNotNull(str, "Required parameter parent must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpRequest buildHttpRequestUsingHead() {
                    return super.buildHttpRequestUsingHead();
                }

                @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
                public HttpResponse executeUsingHead() {
                    return super.executeUsingHead();
                }

                public Integer getPageSize() {
                    return this.pageSize;
                }

                public String getPageToken() {
                    return this.pageToken;
                }

                public String getParent() {
                    return this.parent;
                }

                public List setPageSize(Integer num) {
                    this.pageSize = num;
                    return this;
                }

                public List setPageToken(String str) {
                    this.pageToken = str;
                    return this;
                }

                public List setParent(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.PARENT_PATTERN.matcher(str).matches(), "Parameter parent must conform to the pattern ^brands/[^/]+$");
                    }
                    this.parent = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<ListLocationsResponse> set$Xgafv2(String str) {
                    return (List) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<ListLocationsResponse> setAccessToken2(String str) {
                    return (List) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<ListLocationsResponse> setAlt2(String str) {
                    return (List) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<ListLocationsResponse> setCallback2(String str) {
                    return (List) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<ListLocationsResponse> setFields2(String str) {
                    return (List) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<ListLocationsResponse> setKey2(String str) {
                    return (List) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<ListLocationsResponse> setOauthToken2(String str) {
                    return (List) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<ListLocationsResponse> setPrettyPrint2(Boolean bool) {
                    return (List) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<ListLocationsResponse> setQuotaUser2(String str) {
                    return (List) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<ListLocationsResponse> setUploadProtocol2(String str) {
                    return (List) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<ListLocationsResponse> setUploadType2(String str) {
                    return (List) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public List set(String str, Object obj) {
                    return (List) super.set(str, obj);
                }
            }

            public class Patch extends BusinessCommunicationsRequest<Location> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                @Key
                private String updateMask;

                public Patch(String str, Location location) {
                    super(BusinessCommunications.this, "PATCH", REST_PATH, location, Location.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public String getUpdateMask() {
                    return this.updateMask;
                }

                public Patch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                public Patch setUpdateMask(String str) {
                    this.updateMask = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<Location> set$Xgafv2(String str) {
                    return (Patch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<Location> setAccessToken2(String str) {
                    return (Patch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<Location> setAlt2(String str) {
                    return (Patch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<Location> setCallback2(String str) {
                    return (Patch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<Location> setFields2(String str) {
                    return (Patch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<Location> setKey2(String str) {
                    return (Patch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<Location> setOauthToken2(String str) {
                    return (Patch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<Location> setPrettyPrint2(Boolean bool) {
                    return (Patch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<Location> setQuotaUser2(String str) {
                    return (Patch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<Location> setUploadProtocol2(String str) {
                    return (Patch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<Location> setUploadType2(String str) {
                    return (Patch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public Patch set(String str, Object obj) {
                    return (Patch) super.set(str, obj);
                }
            }

            public class RequestLaunch extends BusinessCommunicationsRequest<LocationLaunch> {
                private static final String REST_PATH = "v1/{+name}:requestLaunch";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public RequestLaunch(String str, RequestLocationLaunchRequest requestLocationLaunchRequest) {
                    super(BusinessCommunications.this, "POST", REST_PATH, requestLocationLaunchRequest, LocationLaunch.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public RequestLaunch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<LocationLaunch> set$Xgafv2(String str) {
                    return (RequestLaunch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<LocationLaunch> setAccessToken2(String str) {
                    return (RequestLaunch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<LocationLaunch> setAlt2(String str) {
                    return (RequestLaunch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<LocationLaunch> setCallback2(String str) {
                    return (RequestLaunch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<LocationLaunch> setFields2(String str) {
                    return (RequestLaunch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<LocationLaunch> setKey2(String str) {
                    return (RequestLaunch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<LocationLaunch> setOauthToken2(String str) {
                    return (RequestLaunch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<LocationLaunch> setPrettyPrint2(Boolean bool) {
                    return (RequestLaunch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<LocationLaunch> setQuotaUser2(String str) {
                    return (RequestLaunch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<LocationLaunch> setUploadProtocol2(String str) {
                    return (RequestLaunch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<LocationLaunch> setUploadType2(String str) {
                    return (RequestLaunch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public RequestLaunch set(String str, Object obj) {
                    return (RequestLaunch) super.set(str, obj);
                }
            }

            public class RequestVerification extends BusinessCommunicationsRequest<LocationVerification> {
                private static final String REST_PATH = "v1/{+name}:requestVerification";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                public RequestVerification(String str, RequestLocationVerificationRequest requestLocationVerificationRequest) {
                    super(BusinessCommunications.this, "POST", REST_PATH, requestLocationVerificationRequest, LocationVerification.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                }

                public String getName() {
                    return this.name;
                }

                public RequestVerification setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+$");
                    }
                    this.name = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<LocationVerification> set$Xgafv2(String str) {
                    return (RequestVerification) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<LocationVerification> setAccessToken2(String str) {
                    return (RequestVerification) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<LocationVerification> setAlt2(String str) {
                    return (RequestVerification) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<LocationVerification> setCallback2(String str) {
                    return (RequestVerification) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<LocationVerification> setFields2(String str) {
                    return (RequestVerification) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<LocationVerification> setKey2(String str) {
                    return (RequestVerification) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<LocationVerification> setOauthToken2(String str) {
                    return (RequestVerification) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<LocationVerification> setPrettyPrint2(Boolean bool) {
                    return (RequestVerification) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<LocationVerification> setQuotaUser2(String str) {
                    return (RequestVerification) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<LocationVerification> setUploadProtocol2(String str) {
                    return (RequestVerification) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<LocationVerification> setUploadType2(String str) {
                    return (RequestVerification) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public RequestVerification set(String str, Object obj) {
                    return (RequestVerification) super.set(str, obj);
                }
            }

            public class UpdateLaunch extends BusinessCommunicationsRequest<LocationLaunch> {
                private static final String REST_PATH = "v1/{+name}";
                private final Pattern NAME_PATTERN;

                @Key
                private String name;

                @Key
                private String updateMask;

                public UpdateLaunch(String str, LocationLaunch locationLaunch) {
                    super(BusinessCommunications.this, "PATCH", REST_PATH, locationLaunch, LocationLaunch.class);
                    Pattern patternCompile = Pattern.compile("^brands/[^/]+/locations/[^/]+/launch$");
                    this.NAME_PATTERN = patternCompile;
                    this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                    if (BusinessCommunications.this.getSuppressPatternChecks()) {
                        return;
                    }
                    Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+/launch$");
                }

                public String getName() {
                    return this.name;
                }

                public String getUpdateMask() {
                    return this.updateMask;
                }

                public UpdateLaunch setName(String str) {
                    if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                        Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+/locations/[^/]+/launch$");
                    }
                    this.name = str;
                    return this;
                }

                public UpdateLaunch setUpdateMask(String str) {
                    this.updateMask = str;
                    return this;
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: set$Xgafv */
                public BusinessCommunicationsRequest<LocationLaunch> set$Xgafv2(String str) {
                    return (UpdateLaunch) super.set$Xgafv2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAccessToken */
                public BusinessCommunicationsRequest<LocationLaunch> setAccessToken2(String str) {
                    return (UpdateLaunch) super.setAccessToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setAlt */
                public BusinessCommunicationsRequest<LocationLaunch> setAlt2(String str) {
                    return (UpdateLaunch) super.setAlt2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setCallback */
                public BusinessCommunicationsRequest<LocationLaunch> setCallback2(String str) {
                    return (UpdateLaunch) super.setCallback2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setFields */
                public BusinessCommunicationsRequest<LocationLaunch> setFields2(String str) {
                    return (UpdateLaunch) super.setFields2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setKey */
                public BusinessCommunicationsRequest<LocationLaunch> setKey2(String str) {
                    return (UpdateLaunch) super.setKey2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setOauthToken */
                public BusinessCommunicationsRequest<LocationLaunch> setOauthToken2(String str) {
                    return (UpdateLaunch) super.setOauthToken2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setPrettyPrint */
                public BusinessCommunicationsRequest<LocationLaunch> setPrettyPrint2(Boolean bool) {
                    return (UpdateLaunch) super.setPrettyPrint2(bool);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setQuotaUser */
                public BusinessCommunicationsRequest<LocationLaunch> setQuotaUser2(String str) {
                    return (UpdateLaunch) super.setQuotaUser2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadProtocol */
                public BusinessCommunicationsRequest<LocationLaunch> setUploadProtocol2(String str) {
                    return (UpdateLaunch) super.setUploadProtocol2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
                /* renamed from: setUploadType */
                public BusinessCommunicationsRequest<LocationLaunch> setUploadType2(String str) {
                    return (UpdateLaunch) super.setUploadType2(str);
                }

                @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
                public UpdateLaunch set(String str, Object obj) {
                    return (UpdateLaunch) super.set(str, obj);
                }
            }

            public Locations() {
            }

            public Create create(String str, Location location) {
                Create create = new Create(str, location);
                BusinessCommunications.this.initialize(create);
                return create;
            }

            public Delete delete(String str) {
                Delete delete = new Delete(str);
                BusinessCommunications.this.initialize(delete);
                return delete;
            }

            public Get get(String str) {
                Get get = new Get(str);
                BusinessCommunications.this.initialize(get);
                return get;
            }

            public GetLaunch getLaunch(String str) {
                GetLaunch getLaunch = new GetLaunch(str);
                BusinessCommunications.this.initialize(getLaunch);
                return getLaunch;
            }

            public GetVerification getVerification(String str) {
                GetVerification getVerification = new GetVerification(str);
                BusinessCommunications.this.initialize(getVerification);
                return getVerification;
            }

            public List list(String str) {
                List list = new List(str);
                BusinessCommunications.this.initialize(list);
                return list;
            }

            public Patch patch(String str, Location location) {
                Patch patch = new Patch(str, location);
                BusinessCommunications.this.initialize(patch);
                return patch;
            }

            public RequestLaunch requestLaunch(String str, RequestLocationLaunchRequest requestLocationLaunchRequest) {
                RequestLaunch requestLaunch = new RequestLaunch(str, requestLocationLaunchRequest);
                BusinessCommunications.this.initialize(requestLaunch);
                return requestLaunch;
            }

            public RequestVerification requestVerification(String str, RequestLocationVerificationRequest requestLocationVerificationRequest) {
                RequestVerification requestVerification = new RequestVerification(str, requestLocationVerificationRequest);
                BusinessCommunications.this.initialize(requestVerification);
                return requestVerification;
            }

            public UpdateLaunch updateLaunch(String str, LocationLaunch locationLaunch) {
                UpdateLaunch updateLaunch = new UpdateLaunch(str, locationLaunch);
                BusinessCommunications.this.initialize(updateLaunch);
                return updateLaunch;
            }
        }

        public class Patch extends BusinessCommunicationsRequest<Brand> {
            private static final String REST_PATH = "v1/{+name}";
            private final Pattern NAME_PATTERN;

            @Key
            private String name;

            @Key
            private String updateMask;

            public Patch(String str, Brand brand) {
                super(BusinessCommunications.this, "PATCH", REST_PATH, brand, Brand.class);
                Pattern patternCompile = Pattern.compile("^brands/[^/]+$");
                this.NAME_PATTERN = patternCompile;
                this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                if (BusinessCommunications.this.getSuppressPatternChecks()) {
                    return;
                }
                Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+$");
            }

            public String getName() {
                return this.name;
            }

            public String getUpdateMask() {
                return this.updateMask;
            }

            public Patch setName(String str) {
                if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                    Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^brands/[^/]+$");
                }
                this.name = str;
                return this;
            }

            public Patch setUpdateMask(String str) {
                this.updateMask = str;
                return this;
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: set$Xgafv */
            public BusinessCommunicationsRequest<Brand> set$Xgafv2(String str) {
                return (Patch) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAccessToken */
            public BusinessCommunicationsRequest<Brand> setAccessToken2(String str) {
                return (Patch) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAlt */
            public BusinessCommunicationsRequest<Brand> setAlt2(String str) {
                return (Patch) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setCallback */
            public BusinessCommunicationsRequest<Brand> setCallback2(String str) {
                return (Patch) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setFields */
            public BusinessCommunicationsRequest<Brand> setFields2(String str) {
                return (Patch) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setKey */
            public BusinessCommunicationsRequest<Brand> setKey2(String str) {
                return (Patch) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setOauthToken */
            public BusinessCommunicationsRequest<Brand> setOauthToken2(String str) {
                return (Patch) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setPrettyPrint */
            public BusinessCommunicationsRequest<Brand> setPrettyPrint2(Boolean bool) {
                return (Patch) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setQuotaUser */
            public BusinessCommunicationsRequest<Brand> setQuotaUser2(String str) {
                return (Patch) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadProtocol */
            public BusinessCommunicationsRequest<Brand> setUploadProtocol2(String str) {
                return (Patch) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadType */
            public BusinessCommunicationsRequest<Brand> setUploadType2(String str) {
                return (Patch) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }
        }

        public Brands() {
        }

        public Agents agents() {
            return new Agents();
        }

        public Create create(Brand brand) {
            Create create = new Create(this, brand);
            BusinessCommunications.this.initialize(create);
            return create;
        }

        public Delete delete(String str) {
            Delete delete = new Delete(str);
            BusinessCommunications.this.initialize(delete);
            return delete;
        }

        public Get get(String str) {
            Get get = new Get(str);
            BusinessCommunications.this.initialize(get);
            return get;
        }

        public List list() {
            List list = new List(this);
            BusinessCommunications.this.initialize(list);
            return list;
        }

        public Locations locations() {
            return new Locations();
        }

        public Patch patch(String str, Brand brand) {
            Patch patch = new Patch(str, brand);
            BusinessCommunications.this.initialize(patch);
            return patch;
        }
    }

    public static final class Builder extends AbstractGoogleJsonClient.Builder {
        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
            super(httpTransport, jsonFactory, "https://businesscommunications.googleapis.com/", "", httpRequestInitializer, false);
            setBatchPath("batch");
        }

        public Builder setBusinessCommunicationsRequestInitializer(BusinessCommunicationsRequestInitializer businessCommunicationsRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer((GoogleClientRequestInitializer) businessCommunicationsRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setBatchPath(String str) {
            return (Builder) super.setBatchPath(str);
        }

        @Override // com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder, com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public BusinessCommunications build() {
            return new BusinessCommunications(this);
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

    public class Partners {

        public class Get extends BusinessCommunicationsRequest<Partner> {
            private static final String REST_PATH = "v1/{+name}";
            private final Pattern NAME_PATTERN;

            @Key
            private String name;

            public Get(String str) {
                super(BusinessCommunications.this, "GET", REST_PATH, null, Partner.class);
                Pattern patternCompile = Pattern.compile("^partners/[^/]+$");
                this.NAME_PATTERN = patternCompile;
                this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                if (BusinessCommunications.this.getSuppressPatternChecks()) {
                    return;
                }
                Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^partners/[^/]+$");
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpRequest buildHttpRequestUsingHead() {
                return super.buildHttpRequestUsingHead();
            }

            @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
            public HttpResponse executeUsingHead() {
                return super.executeUsingHead();
            }

            public String getName() {
                return this.name;
            }

            public Get setName(String str) {
                if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                    Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^partners/[^/]+$");
                }
                this.name = str;
                return this;
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: set$Xgafv */
            public BusinessCommunicationsRequest<Partner> set$Xgafv2(String str) {
                return (Get) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAccessToken */
            public BusinessCommunicationsRequest<Partner> setAccessToken2(String str) {
                return (Get) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAlt */
            public BusinessCommunicationsRequest<Partner> setAlt2(String str) {
                return (Get) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setCallback */
            public BusinessCommunicationsRequest<Partner> setCallback2(String str) {
                return (Get) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setFields */
            public BusinessCommunicationsRequest<Partner> setFields2(String str) {
                return (Get) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setKey */
            public BusinessCommunicationsRequest<Partner> setKey2(String str) {
                return (Get) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setOauthToken */
            public BusinessCommunicationsRequest<Partner> setOauthToken2(String str) {
                return (Get) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setPrettyPrint */
            public BusinessCommunicationsRequest<Partner> setPrettyPrint2(Boolean bool) {
                return (Get) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setQuotaUser */
            public BusinessCommunicationsRequest<Partner> setQuotaUser2(String str) {
                return (Get) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadProtocol */
            public BusinessCommunicationsRequest<Partner> setUploadProtocol2(String str) {
                return (Get) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadType */
            public BusinessCommunicationsRequest<Partner> setUploadType2(String str) {
                return (Get) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Get set(String str, Object obj) {
                return (Get) super.set(str, obj);
            }
        }

        public class Patch extends BusinessCommunicationsRequest<Partner> {
            private static final String REST_PATH = "v1/{+name}";
            private final Pattern NAME_PATTERN;

            @Key
            private String name;

            @Key
            private String updateMask;

            public Patch(String str, Partner partner) {
                super(BusinessCommunications.this, "PATCH", REST_PATH, partner, Partner.class);
                Pattern patternCompile = Pattern.compile("^partners/[^/]+$");
                this.NAME_PATTERN = patternCompile;
                this.name = (String) Preconditions.checkNotNull(str, "Required parameter name must be specified.");
                if (BusinessCommunications.this.getSuppressPatternChecks()) {
                    return;
                }
                Preconditions.checkArgument(patternCompile.matcher(str).matches(), "Parameter name must conform to the pattern ^partners/[^/]+$");
            }

            public String getName() {
                return this.name;
            }

            public String getUpdateMask() {
                return this.updateMask;
            }

            public Patch setName(String str) {
                if (!BusinessCommunications.this.getSuppressPatternChecks()) {
                    Preconditions.checkArgument(this.NAME_PATTERN.matcher(str).matches(), "Parameter name must conform to the pattern ^partners/[^/]+$");
                }
                this.name = str;
                return this;
            }

            public Patch setUpdateMask(String str) {
                this.updateMask = str;
                return this;
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: set$Xgafv */
            public BusinessCommunicationsRequest<Partner> set$Xgafv2(String str) {
                return (Patch) super.set$Xgafv2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAccessToken */
            public BusinessCommunicationsRequest<Partner> setAccessToken2(String str) {
                return (Patch) super.setAccessToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setAlt */
            public BusinessCommunicationsRequest<Partner> setAlt2(String str) {
                return (Patch) super.setAlt2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setCallback */
            public BusinessCommunicationsRequest<Partner> setCallback2(String str) {
                return (Patch) super.setCallback2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setFields */
            public BusinessCommunicationsRequest<Partner> setFields2(String str) {
                return (Patch) super.setFields2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setKey */
            public BusinessCommunicationsRequest<Partner> setKey2(String str) {
                return (Patch) super.setKey2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setOauthToken */
            public BusinessCommunicationsRequest<Partner> setOauthToken2(String str) {
                return (Patch) super.setOauthToken2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setPrettyPrint */
            public BusinessCommunicationsRequest<Partner> setPrettyPrint2(Boolean bool) {
                return (Patch) super.setPrettyPrint2(bool);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setQuotaUser */
            public BusinessCommunicationsRequest<Partner> setQuotaUser2(String str) {
                return (Patch) super.setQuotaUser2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadProtocol */
            public BusinessCommunicationsRequest<Partner> setUploadProtocol2(String str) {
                return (Patch) super.setUploadProtocol2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest
            /* renamed from: setUploadType */
            public BusinessCommunicationsRequest<Partner> setUploadType2(String str) {
                return (Patch) super.setUploadType2(str);
            }

            @Override // com.google.api.services.businesscommunications.v1.BusinessCommunicationsRequest, com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest, com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
            public Patch set(String str, Object obj) {
                return (Patch) super.set(str, obj);
            }
        }

        public Partners() {
        }

        public Get get(String str) {
            Get get = new Get(str);
            BusinessCommunications.this.initialize(get);
            return get;
        }

        public Patch patch(String str, Partner partner) {
            Patch patch = new Patch(str, partner);
            BusinessCommunications.this.initialize(patch);
            return patch;
        }
    }

    static {
        Preconditions.checkState(GoogleUtils.MAJOR_VERSION.intValue() == 1 && GoogleUtils.MINOR_VERSION.intValue() >= 15, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.25.0-SNAPSHOT of the Business Communications library.", GoogleUtils.VERSION);
    }

    public BusinessCommunications(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
        this(new Builder(httpTransport, jsonFactory, httpRequestInitializer));
    }

    public Brands brands() {
        return new Brands();
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClient
    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) {
        super.initialize(abstractGoogleClientRequest);
    }

    public Partners partners() {
        return new Partners();
    }

    public BusinessCommunications(Builder builder) {
        super(builder);
    }
}
