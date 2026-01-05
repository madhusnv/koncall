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

/* loaded from: classes7.dex */
public final class GetWabaWebhookEventQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetWabaWebhookEvent($id: ID!) {\n  getWabaWebhookEvent(id: $id) {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaWebhookEventQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetWabaWebhookEvent";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetWabaWebhookEvent($id: ID!) {\n  getWabaWebhookEvent(id: $id) {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetWabaWebhookEventQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetWabaWebhookEventQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    /* loaded from: classes8.dex */
    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getWabaWebhookEvent", "getWabaWebhookEvent", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetWabaWebhookEvent getWabaWebhookEvent;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetWabaWebhookEvent.Mapper getWabaWebhookEventFieldMapper = new GetWabaWebhookEvent.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetWabaWebhookEvent) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetWabaWebhookEvent>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaWebhookEventQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetWabaWebhookEvent read(ResponseReader responseReader2) {
                        return Mapper.this.getWabaWebhookEventFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetWabaWebhookEvent getWabaWebhookEvent) {
            this.getWabaWebhookEvent = getWabaWebhookEvent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetWabaWebhookEvent getWabaWebhookEvent = this.getWabaWebhookEvent;
            GetWabaWebhookEvent getWabaWebhookEvent2 = ((Data) obj).getWabaWebhookEvent;
            return getWabaWebhookEvent == null ? getWabaWebhookEvent2 == null : getWabaWebhookEvent.equals(getWabaWebhookEvent2);
        }

        public GetWabaWebhookEvent getWabaWebhookEvent() {
            return this.getWabaWebhookEvent;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetWabaWebhookEvent getWabaWebhookEvent = this.getWabaWebhookEvent;
                this.$hashCode = (getWabaWebhookEvent == null ? 0 : getWabaWebhookEvent.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaWebhookEventQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetWabaWebhookEvent getWabaWebhookEvent = Data.this.getWabaWebhookEvent;
                    responseWriter.writeObject(responseField, getWabaWebhookEvent != null ? getWabaWebhookEvent.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getWabaWebhookEvent=" + this.getWabaWebhookEvent + "}";
            }
            return this.$toString;
        }
    }

    /* loaded from: classes8.dex */
    public static class GetWabaWebhookEvent {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String displayPhoneNumber;
        final String field;
        final String id;
        final String payload;
        final String phoneNumberId;
        final String updatedAt;
        final String wabaAccountId;

        public static final class Mapper implements ResponseFieldMapper<GetWabaWebhookEvent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetWabaWebhookEvent map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetWabaWebhookEvent.$responseFields;
                return new GetWabaWebhookEvent(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("displayPhoneNumber", "displayPhoneNumber", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forString("field", "field", null, true, Collections.emptyList()), ResponseField.forCustomType("payload", "payload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public GetWabaWebhookEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = str3;
            this.wabaAccountId = str4;
            this.displayPhoneNumber = str5;
            this.phoneNumberId = str6;
            this.field = str7;
            this.payload = str8;
            this.createdAt = str9;
            this.updatedAt = (String) Utils.checkNotNull(str10, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String displayPhoneNumber() {
            return this.displayPhoneNumber;
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
            if (!(obj instanceof GetWabaWebhookEvent)) {
                return false;
            }
            GetWabaWebhookEvent getWabaWebhookEvent = (GetWabaWebhookEvent) obj;
            return this.__typename.equals(getWabaWebhookEvent.__typename) && this.id.equals(getWabaWebhookEvent.id) && ((str = this.accountId) != null ? str.equals(getWabaWebhookEvent.accountId) : getWabaWebhookEvent.accountId == null) && ((str2 = this.wabaAccountId) != null ? str2.equals(getWabaWebhookEvent.wabaAccountId) : getWabaWebhookEvent.wabaAccountId == null) && ((str3 = this.displayPhoneNumber) != null ? str3.equals(getWabaWebhookEvent.displayPhoneNumber) : getWabaWebhookEvent.displayPhoneNumber == null) && ((str4 = this.phoneNumberId) != null ? str4.equals(getWabaWebhookEvent.phoneNumberId) : getWabaWebhookEvent.phoneNumberId == null) && ((str5 = this.field) != null ? str5.equals(getWabaWebhookEvent.field) : getWabaWebhookEvent.field == null) && ((str6 = this.payload) != null ? str6.equals(getWabaWebhookEvent.payload) : getWabaWebhookEvent.payload == null) && ((str7 = this.createdAt) != null ? str7.equals(getWabaWebhookEvent.createdAt) : getWabaWebhookEvent.createdAt == null) && this.updatedAt.equals(getWabaWebhookEvent.updatedAt);
        }

        public String field() {
            return this.field;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.accountId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.wabaAccountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.displayPhoneNumber;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.phoneNumberId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.field;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.payload;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                this.$hashCode = ((iHashCode7 ^ (str7 != null ? str7.hashCode() : 0)) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaWebhookEventQuery.GetWabaWebhookEvent.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetWabaWebhookEvent.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetWabaWebhookEvent.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetWabaWebhookEvent.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetWabaWebhookEvent.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetWabaWebhookEvent.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], GetWabaWebhookEvent.this.displayPhoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], GetWabaWebhookEvent.this.phoneNumberId);
                    responseWriter.writeString(responseFieldArr[6], GetWabaWebhookEvent.this.field);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], GetWabaWebhookEvent.this.payload);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], GetWabaWebhookEvent.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], GetWabaWebhookEvent.this.updatedAt);
                }
            };
        }

        public String payload() {
            return this.payload;
        }

        public String phoneNumberId() {
            return this.phoneNumberId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetWabaWebhookEvent{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaAccountId=" + this.wabaAccountId + ", displayPhoneNumber=" + this.displayPhoneNumber + ", phoneNumberId=" + this.phoneNumberId + ", field=" + this.field + ", payload=" + this.payload + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String wabaAccountId() {
            return this.wabaAccountId;
        }
    }

    /* loaded from: classes8.dex */
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaWebhookEventQuery.Variables.1
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

    public GetWabaWebhookEventQuery(String str) {
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
        return "e5a8d49fc02a0c7ce3d0eac39b7860bc665019582f70036e06567d84a290c602";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetWabaWebhookEvent($id: ID!) {\n  getWabaWebhookEvent(id: $id) {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
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
