package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import type.CustomType;

/* loaded from: classes4.dex */
public final class OnCreateWabaWebhookEventSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnCreateWabaWebhookEvent {\n  onCreateWabaWebhookEvent {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateWabaWebhookEventSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnCreateWabaWebhookEvent";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnCreateWabaWebhookEvent {\n  onCreateWabaWebhookEvent {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static final class Builder {
        public OnCreateWabaWebhookEventSubscription build() {
            return new OnCreateWabaWebhookEventSubscription();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onCreateWabaWebhookEvent", "onCreateWabaWebhookEvent", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnCreateWabaWebhookEvent onCreateWabaWebhookEvent;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnCreateWabaWebhookEvent.Mapper onCreateWabaWebhookEventFieldMapper = new OnCreateWabaWebhookEvent.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnCreateWabaWebhookEvent) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnCreateWabaWebhookEvent>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateWabaWebhookEventSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnCreateWabaWebhookEvent read(ResponseReader responseReader2) {
                        return Mapper.this.onCreateWabaWebhookEventFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnCreateWabaWebhookEvent onCreateWabaWebhookEvent) {
            this.onCreateWabaWebhookEvent = onCreateWabaWebhookEvent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnCreateWabaWebhookEvent onCreateWabaWebhookEvent = this.onCreateWabaWebhookEvent;
            OnCreateWabaWebhookEvent onCreateWabaWebhookEvent2 = ((Data) obj).onCreateWabaWebhookEvent;
            return onCreateWabaWebhookEvent == null ? onCreateWabaWebhookEvent2 == null : onCreateWabaWebhookEvent.equals(onCreateWabaWebhookEvent2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnCreateWabaWebhookEvent onCreateWabaWebhookEvent = this.onCreateWabaWebhookEvent;
                this.$hashCode = (onCreateWabaWebhookEvent == null ? 0 : onCreateWabaWebhookEvent.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateWabaWebhookEventSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnCreateWabaWebhookEvent onCreateWabaWebhookEvent = Data.this.onCreateWabaWebhookEvent;
                    responseWriter.writeObject(responseField, onCreateWabaWebhookEvent != null ? onCreateWabaWebhookEvent.marshaller() : null);
                }
            };
        }

        public OnCreateWabaWebhookEvent onCreateWabaWebhookEvent() {
            return this.onCreateWabaWebhookEvent;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onCreateWabaWebhookEvent=" + this.onCreateWabaWebhookEvent + "}";
            }
            return this.$toString;
        }
    }

    public static class OnCreateWabaWebhookEvent {
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

        public static final class Mapper implements ResponseFieldMapper<OnCreateWabaWebhookEvent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnCreateWabaWebhookEvent map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnCreateWabaWebhookEvent.$responseFields;
                return new OnCreateWabaWebhookEvent(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("displayPhoneNumber", "displayPhoneNumber", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forString("field", "field", null, true, Collections.emptyList()), ResponseField.forCustomType("payload", "payload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public OnCreateWabaWebhookEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
            if (!(obj instanceof OnCreateWabaWebhookEvent)) {
                return false;
            }
            OnCreateWabaWebhookEvent onCreateWabaWebhookEvent = (OnCreateWabaWebhookEvent) obj;
            return this.__typename.equals(onCreateWabaWebhookEvent.__typename) && this.id.equals(onCreateWabaWebhookEvent.id) && ((str = this.accountId) != null ? str.equals(onCreateWabaWebhookEvent.accountId) : onCreateWabaWebhookEvent.accountId == null) && ((str2 = this.wabaAccountId) != null ? str2.equals(onCreateWabaWebhookEvent.wabaAccountId) : onCreateWabaWebhookEvent.wabaAccountId == null) && ((str3 = this.displayPhoneNumber) != null ? str3.equals(onCreateWabaWebhookEvent.displayPhoneNumber) : onCreateWabaWebhookEvent.displayPhoneNumber == null) && ((str4 = this.phoneNumberId) != null ? str4.equals(onCreateWabaWebhookEvent.phoneNumberId) : onCreateWabaWebhookEvent.phoneNumberId == null) && ((str5 = this.field) != null ? str5.equals(onCreateWabaWebhookEvent.field) : onCreateWabaWebhookEvent.field == null) && ((str6 = this.payload) != null ? str6.equals(onCreateWabaWebhookEvent.payload) : onCreateWabaWebhookEvent.payload == null) && ((str7 = this.createdAt) != null ? str7.equals(onCreateWabaWebhookEvent.createdAt) : onCreateWabaWebhookEvent.createdAt == null) && this.updatedAt.equals(onCreateWabaWebhookEvent.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateWabaWebhookEventSubscription.OnCreateWabaWebhookEvent.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnCreateWabaWebhookEvent.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnCreateWabaWebhookEvent.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnCreateWabaWebhookEvent.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnCreateWabaWebhookEvent.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnCreateWabaWebhookEvent.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], OnCreateWabaWebhookEvent.this.displayPhoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnCreateWabaWebhookEvent.this.phoneNumberId);
                    responseWriter.writeString(responseFieldArr[6], OnCreateWabaWebhookEvent.this.field);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnCreateWabaWebhookEvent.this.payload);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnCreateWabaWebhookEvent.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], OnCreateWabaWebhookEvent.this.updatedAt);
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
                this.$toString = "OnCreateWabaWebhookEvent{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaAccountId=" + this.wabaAccountId + ", displayPhoneNumber=" + this.displayPhoneNumber + ", phoneNumberId=" + this.phoneNumberId + ", field=" + this.field + ", payload=" + this.payload + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "a1cf9faf68099096bb717a546cf5c75a550320c643c7c3358774c75543f295f2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnCreateWabaWebhookEvent {\n  onCreateWabaWebhookEvent {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Operation.Variables variables() {
        return this.variables;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }
}
