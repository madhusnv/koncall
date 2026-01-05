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
import type.CreateSupportQueriesInput;
import type.CustomType;
import type.ModelSupportQueriesConditionInput;

/* loaded from: classes6.dex */
public final class CreateSupportQueriesMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateSupportQueries($input: CreateSupportQueriesInput!, $condition: ModelSupportQueriesConditionInput) {\n  createSupportQueries(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateSupportQueriesMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateSupportQueries";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateSupportQueries($input: CreateSupportQueriesInput!, $condition: ModelSupportQueriesConditionInput) {\n  createSupportQueries(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelSupportQueriesConditionInput condition;
        private CreateSupportQueriesInput input;

        public CreateSupportQueriesMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateSupportQueriesMutation(this.input, this.condition);
        }

        public Builder condition(ModelSupportQueriesConditionInput modelSupportQueriesConditionInput) {
            this.condition = modelSupportQueriesConditionInput;
            return this;
        }

        public Builder input(CreateSupportQueriesInput createSupportQueriesInput) {
            this.input = createSupportQueriesInput;
            return this;
        }
    }

    public static class CreateSupportQueries {
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

        public static final class Mapper implements ResponseFieldMapper<CreateSupportQueries> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateSupportQueries map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateSupportQueries.$responseFields;
                return new CreateSupportQueries(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forString(SearchIntents.EXTRA_QUERY, SearchIntents.EXTRA_QUERY, null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forString("queryType", "queryType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public CreateSupportQueries(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof CreateSupportQueries)) {
                return false;
            }
            CreateSupportQueries createSupportQueries = (CreateSupportQueries) obj;
            return this.__typename.equals(createSupportQueries.__typename) && this.id.equals(createSupportQueries.id) && ((str = this.accountId) != null ? str.equals(createSupportQueries.accountId) : createSupportQueries.accountId == null) && ((str2 = this.userId) != null ? str2.equals(createSupportQueries.userId) : createSupportQueries.userId == null) && ((str3 = this.query) != null ? str3.equals(createSupportQueries.query) : createSupportQueries.query == null) && ((str4 = this.category) != null ? str4.equals(createSupportQueries.category) : createSupportQueries.category == null) && ((str5 = this.queryType) != null ? str5.equals(createSupportQueries.queryType) : createSupportQueries.queryType == null) && ((str6 = this.createdAt) != null ? str6.equals(createSupportQueries.createdAt) : createSupportQueries.createdAt == null) && this.updatedAt.equals(createSupportQueries.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateSupportQueriesMutation.CreateSupportQueries.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateSupportQueries.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateSupportQueries.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateSupportQueries.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateSupportQueries.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateSupportQueries.this.userId);
                    responseWriter.writeString(responseFieldArr[4], CreateSupportQueries.this.query);
                    responseWriter.writeString(responseFieldArr[5], CreateSupportQueries.this.category);
                    responseWriter.writeString(responseFieldArr[6], CreateSupportQueries.this.queryType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreateSupportQueries.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], CreateSupportQueries.this.updatedAt);
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
                this.$toString = "CreateSupportQueries{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", userId=" + this.userId + ", query=" + this.query + ", category=" + this.category + ", queryType=" + this.queryType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("createSupportQueries", "createSupportQueries", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateSupportQueries createSupportQueries;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateSupportQueries.Mapper createSupportQueriesFieldMapper = new CreateSupportQueries.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateSupportQueries) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateSupportQueries>() { // from class: com.amazonaws.amplify.generated.graphql.CreateSupportQueriesMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateSupportQueries read(ResponseReader responseReader2) {
                        return Mapper.this.createSupportQueriesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateSupportQueries createSupportQueries) {
            this.createSupportQueries = createSupportQueries;
        }

        public CreateSupportQueries createSupportQueries() {
            return this.createSupportQueries;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateSupportQueries createSupportQueries = this.createSupportQueries;
            CreateSupportQueries createSupportQueries2 = ((Data) obj).createSupportQueries;
            return createSupportQueries == null ? createSupportQueries2 == null : createSupportQueries.equals(createSupportQueries2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateSupportQueries createSupportQueries = this.createSupportQueries;
                this.$hashCode = (createSupportQueries == null ? 0 : createSupportQueries.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateSupportQueriesMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateSupportQueries createSupportQueries = Data.this.createSupportQueries;
                    responseWriter.writeObject(responseField, createSupportQueries != null ? createSupportQueries.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createSupportQueries=" + this.createSupportQueries + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelSupportQueriesConditionInput condition;
        private final CreateSupportQueriesInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateSupportQueriesInput createSupportQueriesInput, ModelSupportQueriesConditionInput modelSupportQueriesConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createSupportQueriesInput;
            this.condition = modelSupportQueriesConditionInput;
            linkedHashMap.put("input", createSupportQueriesInput);
            linkedHashMap.put("condition", modelSupportQueriesConditionInput);
        }

        public ModelSupportQueriesConditionInput condition() {
            return this.condition;
        }

        public CreateSupportQueriesInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateSupportQueriesMutation.Variables.1
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

    public CreateSupportQueriesMutation(CreateSupportQueriesInput createSupportQueriesInput, ModelSupportQueriesConditionInput modelSupportQueriesConditionInput) {
        Utils.checkNotNull(createSupportQueriesInput, "input == null");
        this.variables = new Variables(createSupportQueriesInput, modelSupportQueriesConditionInput);
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
        return "32f947f10560129cbca538791d6f14c46c717d220aef3e6df6b99ffb6227018a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateSupportQueries($input: CreateSupportQueriesInput!, $condition: ModelSupportQueriesConditionInput) {\n  createSupportQueries(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    userId\n    query\n    category\n    queryType\n    createdAt\n    updatedAt\n  }\n}";
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
