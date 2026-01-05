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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreateProductPlanInput;
import type.CustomType;
import type.ModelProductPlanConditionInput;

/* loaded from: classes6.dex */
public final class CreateProductPlanMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateProductPlan($input: CreateProductPlanInput!, $condition: ModelProductPlanConditionInput) {\n  createProductPlan(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    productId\n    planDescription\n    planStatus\n    period\n    fee\n    proRataFee\n    currency\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductPlanMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateProductPlan";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateProductPlan($input: CreateProductPlanInput!, $condition: ModelProductPlanConditionInput) {\n  createProductPlan(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    productId\n    planDescription\n    planStatus\n    period\n    fee\n    proRataFee\n    currency\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelProductPlanConditionInput condition;
        private CreateProductPlanInput input;

        public CreateProductPlanMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateProductPlanMutation(this.input, this.condition);
        }

        public Builder condition(ModelProductPlanConditionInput modelProductPlanConditionInput) {
            this.condition = modelProductPlanConditionInput;
            return this;
        }

        public Builder input(CreateProductPlanInput createProductPlanInput) {
            this.input = createProductPlanInput;
            return this;
        }
    }

    public static class CreateProductPlan {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String currency;
        final int fee;
        final String id;
        final String period;
        final String planDescription;
        final String planStatus;
        final Integer proRataFee;
        final String productId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<CreateProductPlan> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateProductPlan map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateProductPlan.$responseFields;
                return new CreateProductPlan(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]).intValue(), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, customType, Collections.emptyList()), ResponseField.forString("planDescription", "planDescription", null, true, Collections.emptyList()), ResponseField.forString("planStatus", "planStatus", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forInt("fee", "fee", null, false, Collections.emptyList()), ResponseField.forInt("proRataFee", "proRataFee", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, false, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public CreateProductPlan(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Integer num, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.productId = (String) Utils.checkNotNull(str4, "productId == null");
            this.planDescription = str5;
            this.planStatus = (String) Utils.checkNotNull(str6, "planStatus == null");
            this.period = (String) Utils.checkNotNull(str7, "period == null");
            this.fee = i;
            this.proRataFee = num;
            this.currency = (String) Utils.checkNotNull(str8, "currency == null");
            this.createdAt = (String) Utils.checkNotNull(str9, "createdAt == null");
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

        public String currency() {
            return this.currency;
        }

        public boolean equals(Object obj) {
            String str;
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateProductPlan)) {
                return false;
            }
            CreateProductPlan createProductPlan = (CreateProductPlan) obj;
            return this.__typename.equals(createProductPlan.__typename) && this.id.equals(createProductPlan.id) && this.accountId.equals(createProductPlan.accountId) && this.productId.equals(createProductPlan.productId) && ((str = this.planDescription) != null ? str.equals(createProductPlan.planDescription) : createProductPlan.planDescription == null) && this.planStatus.equals(createProductPlan.planStatus) && this.period.equals(createProductPlan.period) && this.fee == createProductPlan.fee && ((num = this.proRataFee) != null ? num.equals(createProductPlan.proRataFee) : createProductPlan.proRataFee == null) && this.currency.equals(createProductPlan.currency) && this.createdAt.equals(createProductPlan.createdAt) && this.updatedAt.equals(createProductPlan.updatedAt);
        }

        public int fee() {
            return this.fee;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003;
                String str = this.planDescription;
                int iHashCode2 = (((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.planStatus.hashCode()) * 1000003) ^ this.period.hashCode()) * 1000003) ^ this.fee) * 1000003;
                Integer num = this.proRataFee;
                this.$hashCode = ((((((iHashCode2 ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.currency.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductPlanMutation.CreateProductPlan.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateProductPlan.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateProductPlan.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateProductPlan.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateProductPlan.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateProductPlan.this.productId);
                    responseWriter.writeString(responseFieldArr[4], CreateProductPlan.this.planDescription);
                    responseWriter.writeString(responseFieldArr[5], CreateProductPlan.this.planStatus);
                    responseWriter.writeString(responseFieldArr[6], CreateProductPlan.this.period);
                    responseWriter.writeInt(responseFieldArr[7], Integer.valueOf(CreateProductPlan.this.fee));
                    responseWriter.writeInt(responseFieldArr[8], CreateProductPlan.this.proRataFee);
                    responseWriter.writeString(responseFieldArr[9], CreateProductPlan.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], CreateProductPlan.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], CreateProductPlan.this.updatedAt);
                }
            };
        }

        public String period() {
            return this.period;
        }

        public String planDescription() {
            return this.planDescription;
        }

        public String planStatus() {
            return this.planStatus;
        }

        public Integer proRataFee() {
            return this.proRataFee;
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateProductPlan{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productId=" + this.productId + ", planDescription=" + this.planDescription + ", planStatus=" + this.planStatus + ", period=" + this.period + ", fee=" + this.fee + ", proRataFee=" + this.proRataFee + ", currency=" + this.currency + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createProductPlan", "createProductPlan", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateProductPlan createProductPlan;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateProductPlan.Mapper createProductPlanFieldMapper = new CreateProductPlan.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateProductPlan) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateProductPlan>() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductPlanMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateProductPlan read(ResponseReader responseReader2) {
                        return Mapper.this.createProductPlanFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateProductPlan createProductPlan) {
            this.createProductPlan = createProductPlan;
        }

        public CreateProductPlan createProductPlan() {
            return this.createProductPlan;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateProductPlan createProductPlan = this.createProductPlan;
            CreateProductPlan createProductPlan2 = ((Data) obj).createProductPlan;
            return createProductPlan == null ? createProductPlan2 == null : createProductPlan.equals(createProductPlan2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateProductPlan createProductPlan = this.createProductPlan;
                this.$hashCode = (createProductPlan == null ? 0 : createProductPlan.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductPlanMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateProductPlan createProductPlan = Data.this.createProductPlan;
                    responseWriter.writeObject(responseField, createProductPlan != null ? createProductPlan.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createProductPlan=" + this.createProductPlan + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelProductPlanConditionInput condition;
        private final CreateProductPlanInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateProductPlanInput createProductPlanInput, ModelProductPlanConditionInput modelProductPlanConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createProductPlanInput;
            this.condition = modelProductPlanConditionInput;
            linkedHashMap.put("input", createProductPlanInput);
            linkedHashMap.put("condition", modelProductPlanConditionInput);
        }

        public ModelProductPlanConditionInput condition() {
            return this.condition;
        }

        public CreateProductPlanInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateProductPlanMutation.Variables.1
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

    public CreateProductPlanMutation(CreateProductPlanInput createProductPlanInput, ModelProductPlanConditionInput modelProductPlanConditionInput) {
        Utils.checkNotNull(createProductPlanInput, "input == null");
        this.variables = new Variables(createProductPlanInput, modelProductPlanConditionInput);
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
        return "986d628cf67be94fc9f5dd3e331fd68e4dc69920d2d7ea7f561902e26e0afd8c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateProductPlan($input: CreateProductPlanInput!, $condition: ModelProductPlanConditionInput) {\n  createProductPlan(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    productId\n    planDescription\n    planStatus\n    period\n    fee\n    proRataFee\n    currency\n    createdAt\n    updatedAt\n  }\n}";
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
