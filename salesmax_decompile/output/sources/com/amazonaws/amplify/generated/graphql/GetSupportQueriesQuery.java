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
import com.google.android.gms.actions.SearchIntents;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetSupportQueriesQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetSupportQueries($id: ID!) {\n  getSupportQueries(id: $id) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetSupportQueriesQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetSupportQueries";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetSupportQueries($id: ID!) {\n  getSupportQueries(id: $id) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetSupportQueriesQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetSupportQueriesQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getSupportQueries", "getSupportQueries", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetSupportQueries getSupportQueries;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetSupportQueries.Mapper getSupportQueriesFieldMapper = new GetSupportQueries.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetSupportQueries) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetSupportQueries>() { // from class: com.amazonaws.amplify.generated.graphql.GetSupportQueriesQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetSupportQueries read(ResponseReader responseReader2) {
                        return Mapper.this.getSupportQueriesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetSupportQueries getSupportQueries) {
            this.getSupportQueries = getSupportQueries;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetSupportQueries getSupportQueries = this.getSupportQueries;
            GetSupportQueries getSupportQueries2 = ((Data) obj).getSupportQueries;
            return getSupportQueries == null ? getSupportQueries2 == null : getSupportQueries.equals(getSupportQueries2);
        }

        public GetSupportQueries getSupportQueries() {
            return this.getSupportQueries;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetSupportQueries getSupportQueries = this.getSupportQueries;
                this.$hashCode = (getSupportQueries == null ? 0 : getSupportQueries.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSupportQueriesQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetSupportQueries getSupportQueries = Data.this.getSupportQueries;
                    responseWriter.writeObject(responseField, getSupportQueries != null ? getSupportQueries.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getSupportQueries=" + this.getSupportQueries + "}";
            }
            return this.$toString;
        }
    }

    public static class GetSupportQueries {
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

        public static final class Mapper implements ResponseFieldMapper<GetSupportQueries> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetSupportQueries map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetSupportQueries.$responseFields;
                return new GetSupportQueries(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forString(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forString("queryType", "queryType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public GetSupportQueries(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof GetSupportQueries)) {
                return false;
            }
            GetSupportQueries getSupportQueries = (GetSupportQueries) obj;
            return this.__typename.equals(getSupportQueries.__typename) && this.id.equals(getSupportQueries.id) && ((str = this.accountId) != null ? str.equals(getSupportQueries.accountId) : getSupportQueries.accountId == null) && ((str2 = this.userId) != null ? str2.equals(getSupportQueries.userId) : getSupportQueries.userId == null) && ((str3 = this.query) != null ? str3.equals(getSupportQueries.query) : getSupportQueries.query == null) && ((str4 = this.category) != null ? str4.equals(getSupportQueries.category) : getSupportQueries.category == null) && ((str5 = this.queryType) != null ? str5.equals(getSupportQueries.queryType) : getSupportQueries.queryType == null) && ((str6 = this.createdAt) != null ? str6.equals(getSupportQueries.createdAt) : getSupportQueries.createdAt == null) && this.updatedAt.equals(getSupportQueries.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSupportQueriesQuery.GetSupportQueries.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetSupportQueries.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetSupportQueries.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetSupportQueries.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetSupportQueries.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetSupportQueries.this.userId);
                    responseWriter.writeString(responseFieldArr[4], GetSupportQueries.this.query);
                    responseWriter.writeString(responseFieldArr[5], GetSupportQueries.this.category);
                    responseWriter.writeString(responseFieldArr[6], GetSupportQueries.this.queryType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], GetSupportQueries.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], GetSupportQueries.this.updatedAt);
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
                this.$toString = "GetSupportQueries{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", query=" + this.query + ", category=" + this.category + ", queryType=" + this.queryType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSupportQueriesQuery.Variables.1
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

    public GetSupportQueriesQuery(String str) {
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
        return "1ac4bc4ba2fb731193efda5197fc5d8b18ae3e2d98a46b07a0980157a66834cb";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetSupportQueries($id: ID!) {\n  getSupportQueries(id: $id) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
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
