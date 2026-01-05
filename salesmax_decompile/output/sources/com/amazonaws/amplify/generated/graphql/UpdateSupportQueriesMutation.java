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
import com.google.android.gms.actions.SearchIntents;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.ModelSupportQueriesConditionInput;
import type.UpdateSupportQueriesInput;

/* loaded from: classes4.dex */
public final class UpdateSupportQueriesMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateSupportQueries($input: UpdateSupportQueriesInput!, $condition: ModelSupportQueriesConditionInput) {\n  updateSupportQueries(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateSupportQueriesMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateSupportQueries";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateSupportQueries($input: UpdateSupportQueriesInput!, $condition: ModelSupportQueriesConditionInput) {\n  updateSupportQueries(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelSupportQueriesConditionInput condition;
        private UpdateSupportQueriesInput input;

        public UpdateSupportQueriesMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateSupportQueriesMutation(this.input, this.condition);
        }

        public Builder condition(ModelSupportQueriesConditionInput modelSupportQueriesConditionInput) {
            this.condition = modelSupportQueriesConditionInput;
            return this;
        }

        public Builder input(UpdateSupportQueriesInput updateSupportQueriesInput) {
            this.input = updateSupportQueriesInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateSupportQueries", "updateSupportQueries", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateSupportQueries updateSupportQueries;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateSupportQueries.Mapper updateSupportQueriesFieldMapper = new UpdateSupportQueries.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateSupportQueries) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateSupportQueries>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateSupportQueriesMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateSupportQueries read(ResponseReader responseReader2) {
                        return Mapper.this.updateSupportQueriesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateSupportQueries updateSupportQueries) {
            this.updateSupportQueries = updateSupportQueries;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateSupportQueries updateSupportQueries = this.updateSupportQueries;
            UpdateSupportQueries updateSupportQueries2 = ((Data) obj).updateSupportQueries;
            return updateSupportQueries == null ? updateSupportQueries2 == null : updateSupportQueries.equals(updateSupportQueries2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateSupportQueries updateSupportQueries = this.updateSupportQueries;
                this.$hashCode = (updateSupportQueries == null ? 0 : updateSupportQueries.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateSupportQueriesMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateSupportQueries updateSupportQueries = Data.this.updateSupportQueries;
                    responseWriter.writeObject(responseField, updateSupportQueries != null ? updateSupportQueries.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateSupportQueries=" + this.updateSupportQueries + "}";
            }
            return this.$toString;
        }

        public UpdateSupportQueries updateSupportQueries() {
            return this.updateSupportQueries;
        }
    }

    public static class UpdateSupportQueries {
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

        public static final class Mapper implements ResponseFieldMapper<UpdateSupportQueries> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateSupportQueries map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateSupportQueries.$responseFields;
                return new UpdateSupportQueries(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forString(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forString("queryType", "queryType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public UpdateSupportQueries(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof UpdateSupportQueries)) {
                return false;
            }
            UpdateSupportQueries updateSupportQueries = (UpdateSupportQueries) obj;
            return this.__typename.equals(updateSupportQueries.__typename) && this.id.equals(updateSupportQueries.id) && ((str = this.accountId) != null ? str.equals(updateSupportQueries.accountId) : updateSupportQueries.accountId == null) && ((str2 = this.userId) != null ? str2.equals(updateSupportQueries.userId) : updateSupportQueries.userId == null) && ((str3 = this.query) != null ? str3.equals(updateSupportQueries.query) : updateSupportQueries.query == null) && ((str4 = this.category) != null ? str4.equals(updateSupportQueries.category) : updateSupportQueries.category == null) && ((str5 = this.queryType) != null ? str5.equals(updateSupportQueries.queryType) : updateSupportQueries.queryType == null) && ((str6 = this.createdAt) != null ? str6.equals(updateSupportQueries.createdAt) : updateSupportQueries.createdAt == null) && this.updatedAt.equals(updateSupportQueries.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateSupportQueriesMutation.UpdateSupportQueries.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateSupportQueries.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateSupportQueries.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateSupportQueries.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateSupportQueries.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateSupportQueries.this.userId);
                    responseWriter.writeString(responseFieldArr[4], UpdateSupportQueries.this.query);
                    responseWriter.writeString(responseFieldArr[5], UpdateSupportQueries.this.category);
                    responseWriter.writeString(responseFieldArr[6], UpdateSupportQueries.this.queryType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateSupportQueries.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateSupportQueries.this.updatedAt);
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
                this.$toString = "UpdateSupportQueries{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", query=" + this.query + ", category=" + this.category + ", queryType=" + this.queryType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final ModelSupportQueriesConditionInput condition;
        private final UpdateSupportQueriesInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateSupportQueriesInput updateSupportQueriesInput, ModelSupportQueriesConditionInput modelSupportQueriesConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateSupportQueriesInput;
            this.condition = modelSupportQueriesConditionInput;
            linkedHashMap.put("input", updateSupportQueriesInput);
            linkedHashMap.put("condition", modelSupportQueriesConditionInput);
        }

        public ModelSupportQueriesConditionInput condition() {
            return this.condition;
        }

        public UpdateSupportQueriesInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateSupportQueriesMutation.Variables.1
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

    public UpdateSupportQueriesMutation(UpdateSupportQueriesInput updateSupportQueriesInput, ModelSupportQueriesConditionInput modelSupportQueriesConditionInput) {
        Utils.checkNotNull(updateSupportQueriesInput, "input == null");
        this.variables = new Variables(updateSupportQueriesInput, modelSupportQueriesConditionInput);
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
        return "21cf2fccf88281b0c1c2a29feb617f42ee633d811d8d1c4165dd0ca75df6221a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateSupportQueries($input: UpdateSupportQueriesInput!, $condition: ModelSupportQueriesConditionInput) {\n  updateSupportQueries(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
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
