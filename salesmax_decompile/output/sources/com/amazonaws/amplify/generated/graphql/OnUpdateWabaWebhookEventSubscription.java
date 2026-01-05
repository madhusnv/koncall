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
public final class OnUpdateWabaWebhookEventSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateWabaWebhookEvent {\n  onUpdateWabaWebhookEvent {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaWebhookEventSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateWabaWebhookEvent";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateWabaWebhookEvent {\n  onUpdateWabaWebhookEvent {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static final class Builder {
        public OnUpdateWabaWebhookEventSubscription build() {
            return new OnUpdateWabaWebhookEventSubscription();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateWabaWebhookEvent", "onUpdateWabaWebhookEvent", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateWabaWebhookEvent.Mapper onUpdateWabaWebhookEventFieldMapper = new OnUpdateWabaWebhookEvent.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateWabaWebhookEvent) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateWabaWebhookEvent>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaWebhookEventSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateWabaWebhookEvent read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateWabaWebhookEventFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent) {
            this.onUpdateWabaWebhookEvent = onUpdateWabaWebhookEvent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent = this.onUpdateWabaWebhookEvent;
            OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent2 = ((Data) obj).onUpdateWabaWebhookEvent;
            return onUpdateWabaWebhookEvent == null ? onUpdateWabaWebhookEvent2 == null : onUpdateWabaWebhookEvent.equals(onUpdateWabaWebhookEvent2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent = this.onUpdateWabaWebhookEvent;
                this.$hashCode = (onUpdateWabaWebhookEvent == null ? 0 : onUpdateWabaWebhookEvent.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaWebhookEventSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent = Data.this.onUpdateWabaWebhookEvent;
                    responseWriter.writeObject(responseField, onUpdateWabaWebhookEvent != null ? onUpdateWabaWebhookEvent.marshaller() : null);
                }
            };
        }

        public OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent() {
            return this.onUpdateWabaWebhookEvent;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateWabaWebhookEvent=" + this.onUpdateWabaWebhookEvent + "}";
            }
            return this.$toString;
        }
    }

    public static class OnUpdateWabaWebhookEvent {
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

        public static final class Mapper implements ResponseFieldMapper<OnUpdateWabaWebhookEvent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateWabaWebhookEvent map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateWabaWebhookEvent.$responseFields;
                return new OnUpdateWabaWebhookEvent(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("displayPhoneNumber", "displayPhoneNumber", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, true, customType, Collections.emptyList()), ResponseField.forString("field", "field", null, true, Collections.emptyList()), ResponseField.forCustomType("payload", "payload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public OnUpdateWabaWebhookEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
            if (!(obj instanceof OnUpdateWabaWebhookEvent)) {
                return false;
            }
            OnUpdateWabaWebhookEvent onUpdateWabaWebhookEvent = (OnUpdateWabaWebhookEvent) obj;
            return this.__typename.equals(onUpdateWabaWebhookEvent.__typename) && this.id.equals(onUpdateWabaWebhookEvent.id) && ((str = this.accountId) != null ? str.equals(onUpdateWabaWebhookEvent.accountId) : onUpdateWabaWebhookEvent.accountId == null) && ((str2 = this.wabaAccountId) != null ? str2.equals(onUpdateWabaWebhookEvent.wabaAccountId) : onUpdateWabaWebhookEvent.wabaAccountId == null) && ((str3 = this.displayPhoneNumber) != null ? str3.equals(onUpdateWabaWebhookEvent.displayPhoneNumber) : onUpdateWabaWebhookEvent.displayPhoneNumber == null) && ((str4 = this.phoneNumberId) != null ? str4.equals(onUpdateWabaWebhookEvent.phoneNumberId) : onUpdateWabaWebhookEvent.phoneNumberId == null) && ((str5 = this.field) != null ? str5.equals(onUpdateWabaWebhookEvent.field) : onUpdateWabaWebhookEvent.field == null) && ((str6 = this.payload) != null ? str6.equals(onUpdateWabaWebhookEvent.payload) : onUpdateWabaWebhookEvent.payload == null) && ((str7 = this.createdAt) != null ? str7.equals(onUpdateWabaWebhookEvent.createdAt) : onUpdateWabaWebhookEvent.createdAt == null) && this.updatedAt.equals(onUpdateWabaWebhookEvent.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWabaWebhookEventSubscription.OnUpdateWabaWebhookEvent.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateWabaWebhookEvent.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateWabaWebhookEvent.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateWabaWebhookEvent.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateWabaWebhookEvent.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnUpdateWabaWebhookEvent.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], OnUpdateWabaWebhookEvent.this.displayPhoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], OnUpdateWabaWebhookEvent.this.phoneNumberId);
                    responseWriter.writeString(responseFieldArr[6], OnUpdateWabaWebhookEvent.this.field);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnUpdateWabaWebhookEvent.this.payload);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnUpdateWabaWebhookEvent.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], OnUpdateWabaWebhookEvent.this.updatedAt);
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
                this.$toString = "OnUpdateWabaWebhookEvent{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", wabaAccountId=" + this.wabaAccountId + ", displayPhoneNumber=" + this.displayPhoneNumber + ", phoneNumberId=" + this.phoneNumberId + ", field=" + this.field + ", payload=" + this.payload + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        return "70bfb1a3d6f5a1415eb5e98ab365d2140d3828ef6cd149c3c09d53ba14652637";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateWabaWebhookEvent {\n  onUpdateWabaWebhookEvent {\n    __typename\n    id\n    accountId\n    wabaAccountId\n    displayPhoneNumber\n    phoneNumberId\n    field\n    payload\n    createdAt\n    updatedAt\n  }\n}";
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
