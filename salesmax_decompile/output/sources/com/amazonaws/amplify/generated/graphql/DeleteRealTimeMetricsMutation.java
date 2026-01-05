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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.DeleteRealTimeMetricsInput;
import type.MetricsLevel;
import type.ModelRealTimeMetricsConditionInput;

/* loaded from: classes7.dex */
public final class DeleteRealTimeMetricsMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteRealTimeMetrics($input: DeleteRealTimeMetricsInput!, $condition: ModelRealTimeMetricsConditionInput) {\n  deleteRealTimeMetrics(input: $input, condition: $condition) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteRealTimeMetricsMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteRealTimeMetrics";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteRealTimeMetrics($input: DeleteRealTimeMetricsInput!, $condition: ModelRealTimeMetricsConditionInput) {\n  deleteRealTimeMetrics(input: $input, condition: $condition) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelRealTimeMetricsConditionInput condition;
        private DeleteRealTimeMetricsInput input;

        public DeleteRealTimeMetricsMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteRealTimeMetricsMutation(this.input, this.condition);
        }

        public Builder condition(ModelRealTimeMetricsConditionInput modelRealTimeMetricsConditionInput) {
            this.condition = modelRealTimeMetricsConditionInput;
            return this;
        }

        public Builder input(DeleteRealTimeMetricsInput deleteRealTimeMetricsInput) {
            this.input = deleteRealTimeMetricsInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteRealTimeMetrics", "deleteRealTimeMetrics", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteRealTimeMetrics deleteRealTimeMetrics;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteRealTimeMetrics.Mapper deleteRealTimeMetricsFieldMapper = new DeleteRealTimeMetrics.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteRealTimeMetrics) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteRealTimeMetrics>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteRealTimeMetricsMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteRealTimeMetrics read(ResponseReader responseReader2) {
                        return Mapper.this.deleteRealTimeMetricsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteRealTimeMetrics deleteRealTimeMetrics) {
            this.deleteRealTimeMetrics = deleteRealTimeMetrics;
        }

        public DeleteRealTimeMetrics deleteRealTimeMetrics() {
            return this.deleteRealTimeMetrics;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteRealTimeMetrics deleteRealTimeMetrics = this.deleteRealTimeMetrics;
            DeleteRealTimeMetrics deleteRealTimeMetrics2 = ((Data) obj).deleteRealTimeMetrics;
            return deleteRealTimeMetrics == null ? deleteRealTimeMetrics2 == null : deleteRealTimeMetrics.equals(deleteRealTimeMetrics2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteRealTimeMetrics deleteRealTimeMetrics = this.deleteRealTimeMetrics;
                this.$hashCode = (deleteRealTimeMetrics == null ? 0 : deleteRealTimeMetrics.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteRealTimeMetricsMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteRealTimeMetrics deleteRealTimeMetrics = Data.this.deleteRealTimeMetrics;
                    responseWriter.writeObject(responseField, deleteRealTimeMetrics != null ? deleteRealTimeMetrics.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteRealTimeMetrics=" + this.deleteRealTimeMetrics + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteRealTimeMetrics {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String entityId;
        final Long expirationUnixTime;
        final double metricValue;
        final MetricsLevel metricsLevel;
        final String metricsName;
        final String period;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<DeleteRealTimeMetrics> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteRealTimeMetrics map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteRealTimeMetrics.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                return new DeleteRealTimeMetrics(string, str, string2 != null ? MetricsLevel.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readDouble(responseFieldArr[6]).doubleValue(), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsLevel", "metricsLevel", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsName", "metricsName", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forDouble("metricValue", "metricValue", null, false, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public DeleteRealTimeMetrics(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, double d, Long l, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.metricsLevel = (MetricsLevel) Utils.checkNotNull(metricsLevel, "metricsLevel == null");
            this.entityId = (String) Utils.checkNotNull(str3, "entityId == null");
            this.metricsName = (String) Utils.checkNotNull(str4, "metricsName == null");
            this.period = (String) Utils.checkNotNull(str5, "period == null");
            this.metricValue = d;
            this.expirationUnixTime = l;
            this.createdAt = str6;
            this.updatedAt = str7;
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

        public String entityId() {
            return this.entityId;
        }

        public boolean equals(Object obj) {
            Long l;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteRealTimeMetrics)) {
                return false;
            }
            DeleteRealTimeMetrics deleteRealTimeMetrics = (DeleteRealTimeMetrics) obj;
            if (this.__typename.equals(deleteRealTimeMetrics.__typename) && this.accountId.equals(deleteRealTimeMetrics.accountId) && this.metricsLevel.equals(deleteRealTimeMetrics.metricsLevel) && this.entityId.equals(deleteRealTimeMetrics.entityId) && this.metricsName.equals(deleteRealTimeMetrics.metricsName) && this.period.equals(deleteRealTimeMetrics.period) && Double.doubleToLongBits(this.metricValue) == Double.doubleToLongBits(deleteRealTimeMetrics.metricValue) && ((l = this.expirationUnixTime) != null ? l.equals(deleteRealTimeMetrics.expirationUnixTime) : deleteRealTimeMetrics.expirationUnixTime == null) && ((str = this.createdAt) != null ? str.equals(deleteRealTimeMetrics.createdAt) : deleteRealTimeMetrics.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = deleteRealTimeMetrics.updatedAt;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public Long expirationUnixTime() {
            return this.expirationUnixTime;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.metricsLevel.hashCode()) * 1000003) ^ this.entityId.hashCode()) * 1000003) ^ this.metricsName.hashCode()) * 1000003) ^ this.period.hashCode()) * 1000003) ^ Double.valueOf(this.metricValue).hashCode()) * 1000003;
                Long l = this.expirationUnixTime;
                int iHashCode2 = (iHashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
                String str = this.createdAt;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteRealTimeMetricsMutation.DeleteRealTimeMetrics.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteRealTimeMetrics.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteRealTimeMetrics.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteRealTimeMetrics.this.accountId);
                    responseWriter.writeString(responseFieldArr[2], DeleteRealTimeMetrics.this.metricsLevel.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteRealTimeMetrics.this.entityId);
                    responseWriter.writeString(responseFieldArr[4], DeleteRealTimeMetrics.this.metricsName);
                    responseWriter.writeString(responseFieldArr[5], DeleteRealTimeMetrics.this.period);
                    responseWriter.writeDouble(responseFieldArr[6], Double.valueOf(DeleteRealTimeMetrics.this.metricValue));
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteRealTimeMetrics.this.expirationUnixTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], DeleteRealTimeMetrics.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], DeleteRealTimeMetrics.this.updatedAt);
                }
            };
        }

        public double metricValue() {
            return this.metricValue;
        }

        public MetricsLevel metricsLevel() {
            return this.metricsLevel;
        }

        public String metricsName() {
            return this.metricsName;
        }

        public String period() {
            return this.period;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteRealTimeMetrics{__typename=" + this.__typename + ", accountId=" + this.accountId + ", metricsLevel=" + this.metricsLevel + ", entityId=" + this.entityId + ", metricsName=" + this.metricsName + ", period=" + this.period + ", metricValue=" + this.metricValue + ", expirationUnixTime=" + this.expirationUnixTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelRealTimeMetricsConditionInput condition;
        private final DeleteRealTimeMetricsInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteRealTimeMetricsInput deleteRealTimeMetricsInput, ModelRealTimeMetricsConditionInput modelRealTimeMetricsConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteRealTimeMetricsInput;
            this.condition = modelRealTimeMetricsConditionInput;
            linkedHashMap.put("input", deleteRealTimeMetricsInput);
            linkedHashMap.put("condition", modelRealTimeMetricsConditionInput);
        }

        public ModelRealTimeMetricsConditionInput condition() {
            return this.condition;
        }

        public DeleteRealTimeMetricsInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteRealTimeMetricsMutation.Variables.1
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

    public DeleteRealTimeMetricsMutation(DeleteRealTimeMetricsInput deleteRealTimeMetricsInput, ModelRealTimeMetricsConditionInput modelRealTimeMetricsConditionInput) {
        Utils.checkNotNull(deleteRealTimeMetricsInput, "input == null");
        this.variables = new Variables(deleteRealTimeMetricsInput, modelRealTimeMetricsConditionInput);
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
        return "085f0e493c2a1d1bd62ab6681fb983083b71ca6e4ca67d76359dad6ce5165310";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteRealTimeMetrics($input: DeleteRealTimeMetricsInput!, $condition: ModelRealTimeMetricsConditionInput) {\n  deleteRealTimeMetrics(input: $input, condition: $condition) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
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
