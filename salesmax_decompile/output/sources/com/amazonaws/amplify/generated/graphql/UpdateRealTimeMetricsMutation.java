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
import type.MetricsLevel;
import type.ModelRealTimeMetricsConditionInput;
import type.UpdateRealTimeMetricsInput;

/* loaded from: classes4.dex */
public final class UpdateRealTimeMetricsMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateRealTimeMetrics($input: UpdateRealTimeMetricsInput!, $condition: ModelRealTimeMetricsConditionInput) {\n  updateRealTimeMetrics(input: $input, condition: $condition) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateRealTimeMetricsMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateRealTimeMetrics";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateRealTimeMetrics($input: UpdateRealTimeMetricsInput!, $condition: ModelRealTimeMetricsConditionInput) {\n  updateRealTimeMetrics(input: $input, condition: $condition) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelRealTimeMetricsConditionInput condition;
        private UpdateRealTimeMetricsInput input;

        public UpdateRealTimeMetricsMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateRealTimeMetricsMutation(this.input, this.condition);
        }

        public Builder condition(ModelRealTimeMetricsConditionInput modelRealTimeMetricsConditionInput) {
            this.condition = modelRealTimeMetricsConditionInput;
            return this;
        }

        public Builder input(UpdateRealTimeMetricsInput updateRealTimeMetricsInput) {
            this.input = updateRealTimeMetricsInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateRealTimeMetrics", "updateRealTimeMetrics", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateRealTimeMetrics updateRealTimeMetrics;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateRealTimeMetrics.Mapper updateRealTimeMetricsFieldMapper = new UpdateRealTimeMetrics.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateRealTimeMetrics) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateRealTimeMetrics>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateRealTimeMetricsMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateRealTimeMetrics read(ResponseReader responseReader2) {
                        return Mapper.this.updateRealTimeMetricsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateRealTimeMetrics updateRealTimeMetrics) {
            this.updateRealTimeMetrics = updateRealTimeMetrics;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateRealTimeMetrics updateRealTimeMetrics = this.updateRealTimeMetrics;
            UpdateRealTimeMetrics updateRealTimeMetrics2 = ((Data) obj).updateRealTimeMetrics;
            return updateRealTimeMetrics == null ? updateRealTimeMetrics2 == null : updateRealTimeMetrics.equals(updateRealTimeMetrics2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateRealTimeMetrics updateRealTimeMetrics = this.updateRealTimeMetrics;
                this.$hashCode = (updateRealTimeMetrics == null ? 0 : updateRealTimeMetrics.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateRealTimeMetricsMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateRealTimeMetrics updateRealTimeMetrics = Data.this.updateRealTimeMetrics;
                    responseWriter.writeObject(responseField, updateRealTimeMetrics != null ? updateRealTimeMetrics.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateRealTimeMetrics=" + this.updateRealTimeMetrics + "}";
            }
            return this.$toString;
        }

        public UpdateRealTimeMetrics updateRealTimeMetrics() {
            return this.updateRealTimeMetrics;
        }
    }

    public static class UpdateRealTimeMetrics {
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

        public static final class Mapper implements ResponseFieldMapper<UpdateRealTimeMetrics> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateRealTimeMetrics map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateRealTimeMetrics.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                return new UpdateRealTimeMetrics(string, str, string2 != null ? MetricsLevel.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readDouble(responseFieldArr[6]).doubleValue(), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsLevel", "metricsLevel", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsName", "metricsName", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forDouble("metricValue", "metricValue", null, false, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public UpdateRealTimeMetrics(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, double d, Long l, String str6, String str7) {
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
            if (!(obj instanceof UpdateRealTimeMetrics)) {
                return false;
            }
            UpdateRealTimeMetrics updateRealTimeMetrics = (UpdateRealTimeMetrics) obj;
            if (this.__typename.equals(updateRealTimeMetrics.__typename) && this.accountId.equals(updateRealTimeMetrics.accountId) && this.metricsLevel.equals(updateRealTimeMetrics.metricsLevel) && this.entityId.equals(updateRealTimeMetrics.entityId) && this.metricsName.equals(updateRealTimeMetrics.metricsName) && this.period.equals(updateRealTimeMetrics.period) && Double.doubleToLongBits(this.metricValue) == Double.doubleToLongBits(updateRealTimeMetrics.metricValue) && ((l = this.expirationUnixTime) != null ? l.equals(updateRealTimeMetrics.expirationUnixTime) : updateRealTimeMetrics.expirationUnixTime == null) && ((str = this.createdAt) != null ? str.equals(updateRealTimeMetrics.createdAt) : updateRealTimeMetrics.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = updateRealTimeMetrics.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateRealTimeMetricsMutation.UpdateRealTimeMetrics.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateRealTimeMetrics.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateRealTimeMetrics.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateRealTimeMetrics.this.accountId);
                    responseWriter.writeString(responseFieldArr[2], UpdateRealTimeMetrics.this.metricsLevel.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateRealTimeMetrics.this.entityId);
                    responseWriter.writeString(responseFieldArr[4], UpdateRealTimeMetrics.this.metricsName);
                    responseWriter.writeString(responseFieldArr[5], UpdateRealTimeMetrics.this.period);
                    responseWriter.writeDouble(responseFieldArr[6], Double.valueOf(UpdateRealTimeMetrics.this.metricValue));
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateRealTimeMetrics.this.expirationUnixTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateRealTimeMetrics.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateRealTimeMetrics.this.updatedAt);
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
                this.$toString = "UpdateRealTimeMetrics{__typename=" + this.__typename + ", accountId=" + this.accountId + ", metricsLevel=" + this.metricsLevel + ", entityId=" + this.entityId + ", metricsName=" + this.metricsName + ", period=" + this.period + ", metricValue=" + this.metricValue + ", expirationUnixTime=" + this.expirationUnixTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelRealTimeMetricsConditionInput condition;
        private final UpdateRealTimeMetricsInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateRealTimeMetricsInput updateRealTimeMetricsInput, ModelRealTimeMetricsConditionInput modelRealTimeMetricsConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateRealTimeMetricsInput;
            this.condition = modelRealTimeMetricsConditionInput;
            linkedHashMap.put("input", updateRealTimeMetricsInput);
            linkedHashMap.put("condition", modelRealTimeMetricsConditionInput);
        }

        public ModelRealTimeMetricsConditionInput condition() {
            return this.condition;
        }

        public UpdateRealTimeMetricsInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateRealTimeMetricsMutation.Variables.1
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

    public UpdateRealTimeMetricsMutation(UpdateRealTimeMetricsInput updateRealTimeMetricsInput, ModelRealTimeMetricsConditionInput modelRealTimeMetricsConditionInput) {
        Utils.checkNotNull(updateRealTimeMetricsInput, "input == null");
        this.variables = new Variables(updateRealTimeMetricsInput, modelRealTimeMetricsConditionInput);
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
        return "4fd1047be9394cca294b0b118bc7d3bbf91ab40a28b8291976d8d21e7de3476c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateRealTimeMetrics($input: UpdateRealTimeMetricsInput!, $condition: ModelRealTimeMetricsConditionInput) {\n  updateRealTimeMetrics(input: $input, condition: $condition) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
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
