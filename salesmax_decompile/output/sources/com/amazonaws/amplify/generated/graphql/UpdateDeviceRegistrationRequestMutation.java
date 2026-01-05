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
import type.CustomType;
import type.DeviceRequestStatus;
import type.ModelDeviceRegistrationRequestConditionInput;
import type.UpdateDeviceRegistrationRequestInput;

/* loaded from: classes4.dex */
public final class UpdateDeviceRegistrationRequestMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateDeviceRegistrationRequest($input: UpdateDeviceRegistrationRequestInput!, $condition: ModelDeviceRegistrationRequestConditionInput) {\n  updateDeviceRegistrationRequest(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDeviceRegistrationRequestMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateDeviceRegistrationRequest";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateDeviceRegistrationRequest($input: UpdateDeviceRegistrationRequestInput!, $condition: ModelDeviceRegistrationRequestConditionInput) {\n  updateDeviceRegistrationRequest(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelDeviceRegistrationRequestConditionInput condition;
        private UpdateDeviceRegistrationRequestInput input;

        public UpdateDeviceRegistrationRequestMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateDeviceRegistrationRequestMutation(this.input, this.condition);
        }

        public Builder condition(ModelDeviceRegistrationRequestConditionInput modelDeviceRegistrationRequestConditionInput) {
            this.condition = modelDeviceRegistrationRequestConditionInput;
            return this;
        }

        public Builder input(UpdateDeviceRegistrationRequestInput updateDeviceRegistrationRequestInput) {
            this.input = updateDeviceRegistrationRequestInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateDeviceRegistrationRequest", "updateDeviceRegistrationRequest", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateDeviceRegistrationRequest.Mapper updateDeviceRegistrationRequestFieldMapper = new UpdateDeviceRegistrationRequest.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateDeviceRegistrationRequest) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateDeviceRegistrationRequest>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDeviceRegistrationRequestMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateDeviceRegistrationRequest read(ResponseReader responseReader2) {
                        return Mapper.this.updateDeviceRegistrationRequestFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest) {
            this.updateDeviceRegistrationRequest = updateDeviceRegistrationRequest;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest = this.updateDeviceRegistrationRequest;
            UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest2 = ((Data) obj).updateDeviceRegistrationRequest;
            return updateDeviceRegistrationRequest == null ? updateDeviceRegistrationRequest2 == null : updateDeviceRegistrationRequest.equals(updateDeviceRegistrationRequest2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest = this.updateDeviceRegistrationRequest;
                this.$hashCode = (updateDeviceRegistrationRequest == null ? 0 : updateDeviceRegistrationRequest.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDeviceRegistrationRequestMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest = Data.this.updateDeviceRegistrationRequest;
                    responseWriter.writeObject(responseField, updateDeviceRegistrationRequest != null ? updateDeviceRegistrationRequest.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateDeviceRegistrationRequest=" + this.updateDeviceRegistrationRequest + "}";
            }
            return this.$toString;
        }

        public UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest() {
            return this.updateDeviceRegistrationRequest;
        }
    }

    public static class UpdateDeviceRegistrationRequest {
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

        public static final class Mapper implements ResponseFieldMapper<UpdateDeviceRegistrationRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateDeviceRegistrationRequest map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateDeviceRegistrationRequest.$responseFields;
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
                return new UpdateDeviceRegistrationRequest(string, str, str2, str3, string2, string3, string4, string5, string6, string7 != null ? DeviceRequestStatus.valueOf(string7) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, false, customType, Collections.emptyList()), ResponseField.forString("requestedDeviceId", "requestedDeviceId", null, false, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("osVersion", "osVersion", null, true, Collections.emptyList()), ResponseField.forString("ipAddress", "ipAddress", null, true, Collections.emptyList()), ResponseField.forString("reason", "reason", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forCustomType("requestedAt", "requestedAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("approvedBy", "approvedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("approvedAt", "approvedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public UpdateDeviceRegistrationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DeviceRequestStatus deviceRequestStatus, String str10, String str11, String str12, String str13, String str14) {
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
            if (!(obj instanceof UpdateDeviceRegistrationRequest)) {
                return false;
            }
            UpdateDeviceRegistrationRequest updateDeviceRegistrationRequest = (UpdateDeviceRegistrationRequest) obj;
            if (this.__typename.equals(updateDeviceRegistrationRequest.__typename) && this.id.equals(updateDeviceRegistrationRequest.id) && this.accountId.equals(updateDeviceRegistrationRequest.accountId) && this.userId.equals(updateDeviceRegistrationRequest.userId) && this.requestedDeviceId.equals(updateDeviceRegistrationRequest.requestedDeviceId) && ((str = this.deviceModel) != null ? str.equals(updateDeviceRegistrationRequest.deviceModel) : updateDeviceRegistrationRequest.deviceModel == null) && ((str2 = this.osVersion) != null ? str2.equals(updateDeviceRegistrationRequest.osVersion) : updateDeviceRegistrationRequest.osVersion == null) && ((str3 = this.ipAddress) != null ? str3.equals(updateDeviceRegistrationRequest.ipAddress) : updateDeviceRegistrationRequest.ipAddress == null) && ((str4 = this.reason) != null ? str4.equals(updateDeviceRegistrationRequest.reason) : updateDeviceRegistrationRequest.reason == null) && this.status.equals(updateDeviceRegistrationRequest.status) && this.requestedAt.equals(updateDeviceRegistrationRequest.requestedAt) && ((str5 = this.approvedBy) != null ? str5.equals(updateDeviceRegistrationRequest.approvedBy) : updateDeviceRegistrationRequest.approvedBy == null) && ((str6 = this.approvedAt) != null ? str6.equals(updateDeviceRegistrationRequest.approvedAt) : updateDeviceRegistrationRequest.approvedAt == null) && ((str7 = this.createdAt) != null ? str7.equals(updateDeviceRegistrationRequest.createdAt) : updateDeviceRegistrationRequest.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = updateDeviceRegistrationRequest.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDeviceRegistrationRequestMutation.UpdateDeviceRegistrationRequest.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateDeviceRegistrationRequest.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateDeviceRegistrationRequest.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateDeviceRegistrationRequest.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateDeviceRegistrationRequest.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateDeviceRegistrationRequest.this.userId);
                    responseWriter.writeString(responseFieldArr[4], UpdateDeviceRegistrationRequest.this.requestedDeviceId);
                    responseWriter.writeString(responseFieldArr[5], UpdateDeviceRegistrationRequest.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[6], UpdateDeviceRegistrationRequest.this.osVersion);
                    responseWriter.writeString(responseFieldArr[7], UpdateDeviceRegistrationRequest.this.ipAddress);
                    responseWriter.writeString(responseFieldArr[8], UpdateDeviceRegistrationRequest.this.reason);
                    responseWriter.writeString(responseFieldArr[9], UpdateDeviceRegistrationRequest.this.status.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateDeviceRegistrationRequest.this.requestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateDeviceRegistrationRequest.this.approvedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateDeviceRegistrationRequest.this.approvedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdateDeviceRegistrationRequest.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateDeviceRegistrationRequest.this.updatedAt);
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
                this.$toString = "UpdateDeviceRegistrationRequest{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", requestedDeviceId=" + this.requestedDeviceId + ", deviceModel=" + this.deviceModel + ", osVersion=" + this.osVersion + ", ipAddress=" + this.ipAddress + ", reason=" + this.reason + ", status=" + this.status + ", requestedAt=" + this.requestedAt + ", approvedBy=" + this.approvedBy + ", approvedAt=" + this.approvedAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final ModelDeviceRegistrationRequestConditionInput condition;
        private final UpdateDeviceRegistrationRequestInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateDeviceRegistrationRequestInput updateDeviceRegistrationRequestInput, ModelDeviceRegistrationRequestConditionInput modelDeviceRegistrationRequestConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateDeviceRegistrationRequestInput;
            this.condition = modelDeviceRegistrationRequestConditionInput;
            linkedHashMap.put("input", updateDeviceRegistrationRequestInput);
            linkedHashMap.put("condition", modelDeviceRegistrationRequestConditionInput);
        }

        public ModelDeviceRegistrationRequestConditionInput condition() {
            return this.condition;
        }

        public UpdateDeviceRegistrationRequestInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDeviceRegistrationRequestMutation.Variables.1
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

    public UpdateDeviceRegistrationRequestMutation(UpdateDeviceRegistrationRequestInput updateDeviceRegistrationRequestInput, ModelDeviceRegistrationRequestConditionInput modelDeviceRegistrationRequestConditionInput) {
        Utils.checkNotNull(updateDeviceRegistrationRequestInput, "input == null");
        this.variables = new Variables(updateDeviceRegistrationRequestInput, modelDeviceRegistrationRequestConditionInput);
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
        return "2fd65bde7b79392c53b11ec53fb18fb9d0ae183586b9c38186add1300a377af4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateDeviceRegistrationRequest($input: UpdateDeviceRegistrationRequestInput!, $condition: ModelDeviceRegistrationRequestConditionInput) {\n  updateDeviceRegistrationRequest(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    requestedDeviceId\n    deviceModel\n    osVersion\n    ipAddress\n    reason\n    status\n    requestedAt\n    approvedBy\n    approvedAt\n    createdAt\n    updatedAt\n  }\n}";
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
