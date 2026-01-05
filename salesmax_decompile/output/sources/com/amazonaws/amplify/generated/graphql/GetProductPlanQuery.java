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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetProductPlanQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetProductPlan($id: ID!) {\n  getProductPlan(id: $id) {\n    __typename\n    id\n    accountId\n    productId\n    planDescription\n    planStatus\n    period\n    fee\n    proRataFee\n    currency\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetProductPlanQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetProductPlan";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetProductPlan($id: ID!) {\n  getProductPlan(id: $id) {\n    __typename\n    id\n    accountId\n    productId\n    planDescription\n    planStatus\n    period\n    fee\n    proRataFee\n    currency\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetProductPlanQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetProductPlanQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getProductPlan", "getProductPlan", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetProductPlan getProductPlan;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetProductPlan.Mapper getProductPlanFieldMapper = new GetProductPlan.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetProductPlan) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetProductPlan>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductPlanQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetProductPlan read(ResponseReader responseReader2) {
                        return Mapper.this.getProductPlanFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetProductPlan getProductPlan) {
            this.getProductPlan = getProductPlan;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetProductPlan getProductPlan = this.getProductPlan;
            GetProductPlan getProductPlan2 = ((Data) obj).getProductPlan;
            return getProductPlan == null ? getProductPlan2 == null : getProductPlan.equals(getProductPlan2);
        }

        public GetProductPlan getProductPlan() {
            return this.getProductPlan;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetProductPlan getProductPlan = this.getProductPlan;
                this.$hashCode = (getProductPlan == null ? 0 : getProductPlan.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductPlanQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetProductPlan getProductPlan = Data.this.getProductPlan;
                    responseWriter.writeObject(responseField, getProductPlan != null ? getProductPlan.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getProductPlan=" + this.getProductPlan + "}";
            }
            return this.$toString;
        }
    }

    public static class GetProductPlan {
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

        public static final class Mapper implements ResponseFieldMapper<GetProductPlan> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetProductPlan map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetProductPlan.$responseFields;
                return new GetProductPlan(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]).intValue(), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, customType, Collections.emptyList()), ResponseField.forString("planDescription", "planDescription", null, true, Collections.emptyList()), ResponseField.forString("planStatus", "planStatus", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forInt("fee", "fee", null, false, Collections.emptyList()), ResponseField.forInt("proRataFee", "proRataFee", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, false, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public GetProductPlan(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Integer num, String str8, String str9, String str10) {
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
            if (!(obj instanceof GetProductPlan)) {
                return false;
            }
            GetProductPlan getProductPlan = (GetProductPlan) obj;
            return this.__typename.equals(getProductPlan.__typename) && this.id.equals(getProductPlan.id) && this.accountId.equals(getProductPlan.accountId) && this.productId.equals(getProductPlan.productId) && ((str = this.planDescription) != null ? str.equals(getProductPlan.planDescription) : getProductPlan.planDescription == null) && this.planStatus.equals(getProductPlan.planStatus) && this.period.equals(getProductPlan.period) && this.fee == getProductPlan.fee && ((num = this.proRataFee) != null ? num.equals(getProductPlan.proRataFee) : getProductPlan.proRataFee == null) && this.currency.equals(getProductPlan.currency) && this.createdAt.equals(getProductPlan.createdAt) && this.updatedAt.equals(getProductPlan.updatedAt);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductPlanQuery.GetProductPlan.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetProductPlan.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetProductPlan.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetProductPlan.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetProductPlan.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetProductPlan.this.productId);
                    responseWriter.writeString(responseFieldArr[4], GetProductPlan.this.planDescription);
                    responseWriter.writeString(responseFieldArr[5], GetProductPlan.this.planStatus);
                    responseWriter.writeString(responseFieldArr[6], GetProductPlan.this.period);
                    responseWriter.writeInt(responseFieldArr[7], Integer.valueOf(GetProductPlan.this.fee));
                    responseWriter.writeInt(responseFieldArr[8], GetProductPlan.this.proRataFee);
                    responseWriter.writeString(responseFieldArr[9], GetProductPlan.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], GetProductPlan.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], GetProductPlan.this.updatedAt);
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
                this.$toString = "GetProductPlan{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", productId=" + this.productId + ", planDescription=" + this.planDescription + ", planStatus=" + this.planStatus + ", period=" + this.period + ", fee=" + this.fee + ", proRataFee=" + this.proRataFee + ", currency=" + this.currency + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductPlanQuery.Variables.1
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

    public GetProductPlanQuery(String str) {
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
        return "e4abc77c6a03c7adb2363515277657528cf425840e4f1b34d164d72e47a89ce8";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetProductPlan($id: ID!) {\n  getProductPlan(id: $id) {\n    __typename\n    id\n    accountId\n    productId\n    planDescription\n    planStatus\n    period\n    fee\n    proRataFee\n    currency\n    createdAt\n    updatedAt\n  }\n}";
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
