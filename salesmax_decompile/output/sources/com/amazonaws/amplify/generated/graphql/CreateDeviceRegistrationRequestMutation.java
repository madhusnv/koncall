package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
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
import type.CreateDeviceRegistrationRequestInput;
import type.CustomType;
import type.DeviceRequestStatus;
import type.ModelDeviceRegistrationRequestConditionInput;

/* loaded from: classes6.dex */
public final class CreateDeviceRegistrationRequestMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateDeviceRegistrationRequest($input: CreateDeviceRegistrationRequestInput!, $condition: ModelDeviceRegistrationRequestConditionInput) {\n  createDeviceRegistrationRequest(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateDeviceRegistrationRequestMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateDeviceRegistrationRequest";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateDeviceRegistrationRequest($input: CreateDeviceRegistrationRequestInput!, $condition: ModelDeviceRegistrationRequestConditionInput) {\n  createDeviceRegistrationRequest(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelDeviceRegistrationRequestConditionInput condition;
        private CreateDeviceRegistrationRequestInput input;

        public CreateDeviceRegistrationRequestMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateDeviceRegistrationRequestMutation(this.input, this.condition);
        }

        public Builder condition(ModelDeviceRegistrationRequestConditionInput modelDeviceRegistrationRequestConditionInput) {
            this.condition = modelDeviceRegistrationRequestConditionInput;
            return this;
        }

        public Builder input(CreateDeviceRegistrationRequestInput createDeviceRegistrationRequestInput) {
            this.input = createDeviceRegistrationRequestInput;
            return this;
        }
    }

    public static class CreateDeviceRegistrationRequest {
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

        public static final class Mapper implements ResponseFieldMapper<CreateDeviceRegistrationRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateDeviceRegistrationRequest map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateDeviceRegistrationRequest.$responseFields;
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
                return new CreateDeviceRegistrationRequest(string, str, str2, str3, string2, string3, string4, string5, string6, string7 != null ? DeviceRequestStatus.valueOf(string7) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("requestedDeviceId", "requestedDeviceId", null, false, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("osVersion", "osVersion", null, true, Collections.emptyList()), ResponseField.forString("ipAddress", "ipAddress", null, true, Collections.emptyList()), ResponseField.forString("reason", "reason", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forCustomType("requestedAt", "requestedAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("approvedBy", "approvedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("approvedAt", "approvedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public CreateDeviceRegistrationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DeviceRequestStatus deviceRequestStatus, String str10, String str11, String str12, String str13, String str14) {
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
            if (!(obj instanceof CreateDeviceRegistrationRequest)) {
                return false;
            }
            CreateDeviceRegistrationRequest createDeviceRegistrationRequest = (CreateDeviceRegistrationRequest) obj;
            if (this.__typename.equals(createDeviceRegistrationRequest.__typename) && this.id.equals(createDeviceRegistrationRequest.id) && this.accountId.equals(createDeviceRegistrationRequest.accountId) && this.userId.equals(createDeviceRegistrationRequest.userId) && this.requestedDeviceId.equals(createDeviceRegistrationRequest.requestedDeviceId) && ((str = this.deviceModel) != null ? str.equals(createDeviceRegistrationRequest.deviceModel) : createDeviceRegistrationRequest.deviceModel == null) && ((str2 = this.osVersion) != null ? str2.equals(createDeviceRegistrationRequest.osVersion) : createDeviceRegistrationRequest.osVersion == null) && ((str3 = this.ipAddress) != null ? str3.equals(createDeviceRegistrationRequest.ipAddress) : createDeviceRegistrationRequest.ipAddress == null) && ((str4 = this.reason) != null ? str4.equals(createDeviceRegistrationRequest.reason) : createDeviceRegistrationRequest.reason == null) && this.status.equals(createDeviceRegistrationRequest.status) && this.requestedAt.equals(createDeviceRegistrationRequest.requestedAt) && ((str5 = this.approvedBy) != null ? str5.equals(createDeviceRegistrationRequest.approvedBy) : createDeviceRegistrationRequest.approvedBy == null) && ((str6 = this.approvedAt) != null ? str6.equals(createDeviceRegistrationRequest.approvedAt) : createDeviceRegistrationRequest.approvedAt == null) && ((str7 = this.createdAt) != null ? str7.equals(createDeviceRegistrationRequest.createdAt) : createDeviceRegistrationRequest.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = createDeviceRegistrationRequest.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateDeviceRegistrationRequestMutation.CreateDeviceRegistrationRequest.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateDeviceRegistrationRequest.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateDeviceRegistrationRequest.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateDeviceRegistrationRequest.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateDeviceRegistrationRequest.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateDeviceRegistrationRequest.this.userId);
                    responseWriter.writeString(responseFieldArr[4], CreateDeviceRegistrationRequest.this.requestedDeviceId);
                    responseWriter.writeString(responseFieldArr[5], CreateDeviceRegistrationRequest.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[6], CreateDeviceRegistrationRequest.this.osVersion);
                    responseWriter.writeString(responseFieldArr[7], CreateDeviceRegistrationRequest.this.ipAddress);
                    responseWriter.writeString(responseFieldArr[8], CreateDeviceRegistrationRequest.this.reason);
                    responseWriter.writeString(responseFieldArr[9], CreateDeviceRegistrationRequest.this.status.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], CreateDeviceRegistrationRequest.this.requestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], CreateDeviceRegistrationRequest.this.approvedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreateDeviceRegistrationRequest.this.approvedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], CreateDeviceRegistrationRequest.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], CreateDeviceRegistrationRequest.this.updatedAt);
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
                this.$toString = "CreateDeviceRegistrationRequest{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", requestedDeviceId=" + this.requestedDeviceId + ", deviceModel=" + this.deviceModel + ", osVersion=" + this.osVersion + ", ipAddress=" + this.ipAddress + ", reason=" + this.reason + ", status=" + this.status + ", requestedAt=" + this.requestedAt + ", approvedBy=" + this.approvedBy + ", approvedAt=" + this.approvedAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createDeviceRegistrationRequest", "createDeviceRegistrationRequest", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateDeviceRegistrationRequest createDeviceRegistrationRequest;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateDeviceRegistrationRequest.Mapper createDeviceRegistrationRequestFieldMapper = new CreateDeviceRegistrationRequest.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateDeviceRegistrationRequest) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateDeviceRegistrationRequest>() { // from class: com.amazonaws.amplify.generated.graphql.CreateDeviceRegistrationRequestMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateDeviceRegistrationRequest read(ResponseReader responseReader2) {
                        return Mapper.this.createDeviceRegistrationRequestFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateDeviceRegistrationRequest createDeviceRegistrationRequest) {
            this.createDeviceRegistrationRequest = createDeviceRegistrationRequest;
        }

        public CreateDeviceRegistrationRequest createDeviceRegistrationRequest() {
            return this.createDeviceRegistrationRequest;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateDeviceRegistrationRequest createDeviceRegistrationRequest = this.createDeviceRegistrationRequest;
            CreateDeviceRegistrationRequest createDeviceRegistrationRequest2 = ((Data) obj).createDeviceRegistrationRequest;
            return createDeviceRegistrationRequest == null ? createDeviceRegistrationRequest2 == null : createDeviceRegistrationRequest.equals(createDeviceRegistrationRequest2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateDeviceRegistrationRequest createDeviceRegistrationRequest = this.createDeviceRegistrationRequest;
                this.$hashCode = (createDeviceRegistrationRequest == null ? 0 : createDeviceRegistrationRequest.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateDeviceRegistrationRequestMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateDeviceRegistrationRequest createDeviceRegistrationRequest = Data.this.createDeviceRegistrationRequest;
                    responseWriter.writeObject(responseField, createDeviceRegistrationRequest != null ? createDeviceRegistrationRequest.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createDeviceRegistrationRequest=" + this.createDeviceRegistrationRequest + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelDeviceRegistrationRequestConditionInput condition;
        private final CreateDeviceRegistrationRequestInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateDeviceRegistrationRequestInput createDeviceRegistrationRequestInput, ModelDeviceRegistrationRequestConditionInput modelDeviceRegistrationRequestConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createDeviceRegistrationRequestInput;
            this.condition = modelDeviceRegistrationRequestConditionInput;
            linkedHashMap.put("input", createDeviceRegistrationRequestInput);
            linkedHashMap.put("condition", modelDeviceRegistrationRequestConditionInput);
        }

        public ModelDeviceRegistrationRequestConditionInput condition() {
            return this.condition;
        }

        public CreateDeviceRegistrationRequestInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateDeviceRegistrationRequestMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public CreateDeviceRegistrationRequestMutation(CreateDeviceRegistrationRequestInput createDeviceRegistrationRequestInput, ModelDeviceRegistrationRequestConditionInput modelDeviceRegistrationRequestConditionInput) {
        Utils.checkNotNull(createDeviceRegistrationRequestInput, "input == null");
        this.variables = new Variables(createDeviceRegistrationRequestInput, modelDeviceRegistrationRequestConditionInput);
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
        return "5b509a07c380c3d3024b8dbd71be7d0ddc60fe2a7eec30fe879c542bd1370bb4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateDeviceRegistrationRequest($input: CreateDeviceRegistrationRequestInput!, $condition: ModelDeviceRegistrationRequestConditionInput) {\n  createDeviceRegistrationRequest(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
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
