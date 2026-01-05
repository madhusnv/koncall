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
import com.google.android.gms.actions.SearchIntents;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import type.CustomType;

/* loaded from: classes4.dex */
public final class OnCreateSupportQueriesSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnCreateSupportQueries {\n  onCreateSupportQueries {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateSupportQueriesSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnCreateSupportQueries";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnCreateSupportQueries {\n  onCreateSupportQueries {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static final class Builder {
        public OnCreateSupportQueriesSubscription build() {
            return new OnCreateSupportQueriesSubscription();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("onCreateSupportQueries", "onCreateSupportQueries", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnCreateSupportQueries onCreateSupportQueries;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnCreateSupportQueries.Mapper onCreateSupportQueriesFieldMapper = new OnCreateSupportQueries.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnCreateSupportQueries) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnCreateSupportQueries>() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateSupportQueriesSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnCreateSupportQueries read(ResponseReader responseReader2) {
                        return Mapper.this.onCreateSupportQueriesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnCreateSupportQueries onCreateSupportQueries) {
            this.onCreateSupportQueries = onCreateSupportQueries;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnCreateSupportQueries onCreateSupportQueries = this.onCreateSupportQueries;
            OnCreateSupportQueries onCreateSupportQueries2 = ((Data) obj).onCreateSupportQueries;
            return onCreateSupportQueries == null ? onCreateSupportQueries2 == null : onCreateSupportQueries.equals(onCreateSupportQueries2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnCreateSupportQueries onCreateSupportQueries = this.onCreateSupportQueries;
                this.$hashCode = (onCreateSupportQueries == null ? 0 : onCreateSupportQueries.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateSupportQueriesSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnCreateSupportQueries onCreateSupportQueries = Data.this.onCreateSupportQueries;
                    responseWriter.writeObject(responseField, onCreateSupportQueries != null ? onCreateSupportQueries.marshaller() : null);
                }
            };
        }

        public OnCreateSupportQueries onCreateSupportQueries() {
            return this.onCreateSupportQueries;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onCreateSupportQueries=" + this.onCreateSupportQueries + "}";
            }
            return this.$toString;
        }
    }

    public static class OnCreateSupportQueries {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String category;
        final String createdAt;
        final String id;
        final String query;
        final String queryType;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<OnCreateSupportQueries> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnCreateSupportQueries map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnCreateSupportQueries.$responseFields;
                return new OnCreateSupportQueries(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forString(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forString("queryType", "queryType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public OnCreateSupportQueries(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = str3;
            this.userId = str4;
            this.query = str5;
            this.category = str6;
            this.queryType = str7;
            this.createdAt = str8;
            this.updatedAt = (String) Utils.checkNotNull(str9, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String category() {
            return this.category;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnCreateSupportQueries)) {
                return false;
            }
            OnCreateSupportQueries onCreateSupportQueries = (OnCreateSupportQueries) obj;
            return this.__typename.equals(onCreateSupportQueries.__typename) && this.id.equals(onCreateSupportQueries.id) && ((str = this.accountId) != null ? str.equals(onCreateSupportQueries.accountId) : onCreateSupportQueries.accountId == null) && ((str2 = this.userId) != null ? str2.equals(onCreateSupportQueries.userId) : onCreateSupportQueries.userId == null) && ((str3 = this.query) != null ? str3.equals(onCreateSupportQueries.query) : onCreateSupportQueries.query == null) && ((str4 = this.category) != null ? str4.equals(onCreateSupportQueries.category) : onCreateSupportQueries.category == null) && ((str5 = this.queryType) != null ? str5.equals(onCreateSupportQueries.queryType) : onCreateSupportQueries.queryType == null) && ((str6 = this.createdAt) != null ? str6.equals(onCreateSupportQueries.createdAt) : onCreateSupportQueries.createdAt == null) && this.updatedAt.equals(onCreateSupportQueries.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.accountId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.userId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.query;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.category;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.queryType;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.createdAt;
                this.$hashCode = ((iHashCode6 ^ (str6 != null ? str6.hashCode() : 0)) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnCreateSupportQueriesSubscription.OnCreateSupportQueries.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnCreateSupportQueries.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnCreateSupportQueries.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnCreateSupportQueries.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnCreateSupportQueries.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnCreateSupportQueries.this.userId);
                    responseWriter.writeString(responseFieldArr[4], OnCreateSupportQueries.this.query);
                    responseWriter.writeString(responseFieldArr[5], OnCreateSupportQueries.this.category);
                    responseWriter.writeString(responseFieldArr[6], OnCreateSupportQueries.this.queryType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], OnCreateSupportQueries.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], OnCreateSupportQueries.this.updatedAt);
                }
            };
        }

        public String query() {
            return this.query;
        }

        public String queryType() {
            return this.queryType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnCreateSupportQueries{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", query=" + this.query + ", category=" + this.category + ", queryType=" + this.queryType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.Operation
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String operationId() {
        return "e8c6fc0a7d734a11d87386dd9725d38e5db5a4831f57d07ddbb471ae7f8fc504";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnCreateSupportQueries {\n  onCreateSupportQueries {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
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
