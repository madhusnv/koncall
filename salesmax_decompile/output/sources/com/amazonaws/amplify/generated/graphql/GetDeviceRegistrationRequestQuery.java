package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.DeviceRequestStatus;

/* loaded from: classes7.dex */
public final class GetDeviceRegistrationRequestQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetDeviceRegistrationRequest($id: ID!) {\n  getDeviceRegistrationRequest(id: $id) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetDeviceRegistrationRequestQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetDeviceRegistrationRequest";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetDeviceRegistrationRequest($id: ID!) {\n  getDeviceRegistrationRequest(id: $id) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetDeviceRegistrationRequestQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetDeviceRegistrationRequestQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getDeviceRegistrationRequest", "getDeviceRegistrationRequest", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetDeviceRegistrationRequest getDeviceRegistrationRequest;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetDeviceRegistrationRequest.Mapper getDeviceRegistrationRequestFieldMapper = new GetDeviceRegistrationRequest.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetDeviceRegistrationRequest) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetDeviceRegistrationRequest>() { // from class: com.amazonaws.amplify.generated.graphql.GetDeviceRegistrationRequestQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetDeviceRegistrationRequest read(ResponseReader responseReader2) {
                        return Mapper.this.getDeviceRegistrationRequestFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetDeviceRegistrationRequest getDeviceRegistrationRequest) {
            this.getDeviceRegistrationRequest = getDeviceRegistrationRequest;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetDeviceRegistrationRequest getDeviceRegistrationRequest = this.getDeviceRegistrationRequest;
            GetDeviceRegistrationRequest getDeviceRegistrationRequest2 = ((Data) obj).getDeviceRegistrationRequest;
            return getDeviceRegistrationRequest == null ? getDeviceRegistrationRequest2 == null : getDeviceRegistrationRequest.equals(getDeviceRegistrationRequest2);
        }

        public GetDeviceRegistrationRequest getDeviceRegistrationRequest() {
            return this.getDeviceRegistrationRequest;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetDeviceRegistrationRequest getDeviceRegistrationRequest = this.getDeviceRegistrationRequest;
                this.$hashCode = (getDeviceRegistrationRequest == null ? 0 : getDeviceRegistrationRequest.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetDeviceRegistrationRequestQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetDeviceRegistrationRequest getDeviceRegistrationRequest = Data.this.getDeviceRegistrationRequest;
                    responseWriter.writeObject(responseField, getDeviceRegistrationRequest != null ? getDeviceRegistrationRequest.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getDeviceRegistrationRequest=" + this.getDeviceRegistrationRequest + "}";
            }
            return this.$toString;
        }
    }

    public static class GetDeviceRegistrationRequest {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String approvedAt;
        final String approvedBy;
        final String createdAt;
        final String deviceModel;
        final String id;
        final String ipAddress;
        final String osVersion;
        final String reason;
        final String requestedAt;
        final String requestedDeviceId;
        final DeviceRequestStatus status;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<GetDeviceRegistrationRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetDeviceRegistrationRequest map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetDeviceRegistrationRequest.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                String string3 = responseReader.readString(responseFieldArr[5]);
                String string4 = responseReader.readString(responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                String string6 = responseReader.readString(responseFieldArr[8]);
                String string7 = responseReader.readString(responseFieldArr[9]);
                return new GetDeviceRegistrationRequest(string, str, str2, str3, string2, string3, string4, string5, string6, string7 != null ? DeviceRequestStatus.valueOf(string7) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("requestedDeviceId", "requestedDeviceId", null, false, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("osVersion", "osVersion", null, true, Collections.emptyList()), ResponseField.forString("ipAddress", "ipAddress", null, true, Collections.emptyList()), ResponseField.forString("reason", "reason", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forCustomType("requestedAt", "requestedAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("approvedBy", "approvedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("approvedAt", "approvedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public GetDeviceRegistrationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DeviceRequestStatus deviceRequestStatus, String str10, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.userId = (String) Utils.checkNotNull(str4, "userId == null");
            this.requestedDeviceId = (String) Utils.checkNotNull(str5, "requestedDeviceId == null");
            this.deviceModel = str6;
            this.osVersion = str7;
            this.ipAddress = str8;
            this.reason = str9;
            this.status = (DeviceRequestStatus) Utils.checkNotNull(deviceRequestStatus, "status == null");
            this.requestedAt = (String) Utils.checkNotNull(str10, "requestedAt == null");
            this.approvedBy = str11;
            this.approvedAt = str12;
            this.createdAt = str13;
            this.updatedAt = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String approvedAt() {
            return this.approvedAt;
        }

        public String approvedBy() {
            return this.approvedBy;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetDeviceRegistrationRequest)) {
                return false;
            }
            GetDeviceRegistrationRequest getDeviceRegistrationRequest = (GetDeviceRegistrationRequest) obj;
            if (this.__typename.equals(getDeviceRegistrationRequest.__typename) && this.id.equals(getDeviceRegistrationRequest.id) && this.accountId.equals(getDeviceRegistrationRequest.accountId) && this.userId.equals(getDeviceRegistrationRequest.userId) && this.requestedDeviceId.equals(getDeviceRegistrationRequest.requestedDeviceId) && ((str = this.deviceModel) != null ? str.equals(getDeviceRegistrationRequest.deviceModel) : getDeviceRegistrationRequest.deviceModel == null) && ((str2 = this.osVersion) != null ? str2.equals(getDeviceRegistrationRequest.osVersion) : getDeviceRegistrationRequest.osVersion == null) && ((str3 = this.ipAddress) != null ? str3.equals(getDeviceRegistrationRequest.ipAddress) : getDeviceRegistrationRequest.ipAddress == null) && ((str4 = this.reason) != null ? str4.equals(getDeviceRegistrationRequest.reason) : getDeviceRegistrationRequest.reason == null) && this.status.equals(getDeviceRegistrationRequest.status) && this.requestedAt.equals(getDeviceRegistrationRequest.requestedAt) && ((str5 = this.approvedBy) != null ? str5.equals(getDeviceRegistrationRequest.approvedBy) : getDeviceRegistrationRequest.approvedBy == null) && ((str6 = this.approvedAt) != null ? str6.equals(getDeviceRegistrationRequest.approvedAt) : getDeviceRegistrationRequest.approvedAt == null) && ((str7 = this.createdAt) != null ? str7.equals(getDeviceRegistrationRequest.createdAt) : getDeviceRegistrationRequest.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = getDeviceRegistrationRequest.updatedAt;
                if (str8 == null) {
                    if (str9 == null) {
                        return true;
                    }
                } else if (str8.equals(str9)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.requestedDeviceId.hashCode()) * 1000003;
                String str = this.deviceModel;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.osVersion;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ipAddress;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.reason;
                int iHashCode5 = (((((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003) ^ this.requestedAt.hashCode()) * 1000003;
                String str5 = this.approvedBy;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.approvedAt;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                this.$hashCode = iHashCode8 ^ (str8 != null ? str8.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String ipAddress() {
            return this.ipAddress;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetDeviceRegistrationRequestQuery.GetDeviceRegistrationRequest.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetDeviceRegistrationRequest.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetDeviceRegistrationRequest.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetDeviceRegistrationRequest.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetDeviceRegistrationRequest.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetDeviceRegistrationRequest.this.userId);
                    responseWriter.writeString(responseFieldArr[4], GetDeviceRegistrationRequest.this.requestedDeviceId);
                    responseWriter.writeString(responseFieldArr[5], GetDeviceRegistrationRequest.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[6], GetDeviceRegistrationRequest.this.osVersion);
                    responseWriter.writeString(responseFieldArr[7], GetDeviceRegistrationRequest.this.ipAddress);
                    responseWriter.writeString(responseFieldArr[8], GetDeviceRegistrationRequest.this.reason);
                    responseWriter.writeString(responseFieldArr[9], GetDeviceRegistrationRequest.this.status.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], GetDeviceRegistrationRequest.this.requestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], GetDeviceRegistrationRequest.this.approvedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], GetDeviceRegistrationRequest.this.approvedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], GetDeviceRegistrationRequest.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], GetDeviceRegistrationRequest.this.updatedAt);
                }
            };
        }

        public String osVersion() {
            return this.osVersion;
        }

        public String reason() {
            return this.reason;
        }

        public String requestedAt() {
            return this.requestedAt;
        }

        public String requestedDeviceId() {
            return this.requestedDeviceId;
        }

        public DeviceRequestStatus status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetDeviceRegistrationRequest{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", requestedDeviceId=" + this.requestedDeviceId + ", deviceModel=" + this.deviceModel + ", osVersion=" + this.osVersion + ", ipAddress=" + this.ipAddress + ", reason=" + this.reason + ", status=" + this.status + ", requestedAt=" + this.requestedAt + ", approvedBy=" + this.approvedBy + ", approvedAt=" + this.approvedAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String id;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.id = str;
            linkedHashMap.put(OutcomeConstants.OUTCOME_ID, str);
        }

        public String id() {
            return this.id;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetDeviceRegistrationRequestQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, Variables.this.id);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetDeviceRegistrationRequestQuery(String str) {
        Utils.checkNotNull(str, "id == null");
        this.variables = new Variables(str);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "465e28b26998782106a66822d6fb77770dcbbcf7a4b26f87d0677fa304737119";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetDeviceRegistrationRequest($id: ID!) {\n  getDeviceRegistrationRequest(id: $id) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Variables variables() {
        return this.variables;
    }
}
