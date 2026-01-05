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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CreateRealTimeMetricsInput;
import type.CustomType;
import type.MetricsLevel;

/* loaded from: classes.dex */
public final class BatchCreateRealTimeMetricsMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation BatchCreateRealTimeMetrics($input: [CreateRealTimeMetricsInput!]!) {\n  batchCreateRealTimeMetrics(input: $input) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "BatchCreateRealTimeMetrics";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation BatchCreateRealTimeMetrics($input: [CreateRealTimeMetricsInput!]!) {\n  batchCreateRealTimeMetrics(input: $input) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static class BatchCreateRealTimeMetric {
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

        public static final class Mapper implements ResponseFieldMapper<BatchCreateRealTimeMetric> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public BatchCreateRealTimeMetric map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = BatchCreateRealTimeMetric.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                return new BatchCreateRealTimeMetric(string, str, string2 != null ? MetricsLevel.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readDouble(responseFieldArr[6]).doubleValue(), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsLevel", "metricsLevel", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsName", "metricsName", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forDouble("metricValue", "metricValue", null, false, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public BatchCreateRealTimeMetric(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, double d, Long l, String str6, String str7) {
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
            if (!(obj instanceof BatchCreateRealTimeMetric)) {
                return false;
            }
            BatchCreateRealTimeMetric batchCreateRealTimeMetric = (BatchCreateRealTimeMetric) obj;
            if (this.__typename.equals(batchCreateRealTimeMetric.__typename) && this.accountId.equals(batchCreateRealTimeMetric.accountId) && this.metricsLevel.equals(batchCreateRealTimeMetric.metricsLevel) && this.entityId.equals(batchCreateRealTimeMetric.entityId) && this.metricsName.equals(batchCreateRealTimeMetric.metricsName) && this.period.equals(batchCreateRealTimeMetric.period) && Double.doubleToLongBits(this.metricValue) == Double.doubleToLongBits(batchCreateRealTimeMetric.metricValue) && ((l = this.expirationUnixTime) != null ? l.equals(batchCreateRealTimeMetric.expirationUnixTime) : batchCreateRealTimeMetric.expirationUnixTime == null) && ((str = this.createdAt) != null ? str.equals(batchCreateRealTimeMetric.createdAt) : batchCreateRealTimeMetric.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = batchCreateRealTimeMetric.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.BatchCreateRealTimeMetric.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = BatchCreateRealTimeMetric.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], BatchCreateRealTimeMetric.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], BatchCreateRealTimeMetric.this.accountId);
                    responseWriter.writeString(responseFieldArr[2], BatchCreateRealTimeMetric.this.metricsLevel.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], BatchCreateRealTimeMetric.this.entityId);
                    responseWriter.writeString(responseFieldArr[4], BatchCreateRealTimeMetric.this.metricsName);
                    responseWriter.writeString(responseFieldArr[5], BatchCreateRealTimeMetric.this.period);
                    responseWriter.writeDouble(responseFieldArr[6], Double.valueOf(BatchCreateRealTimeMetric.this.metricValue));
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], BatchCreateRealTimeMetric.this.expirationUnixTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], BatchCreateRealTimeMetric.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], BatchCreateRealTimeMetric.this.updatedAt);
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
                this.$toString = "BatchCreateRealTimeMetric{__typename=" + this.__typename + ", accountId=" + this.accountId + ", metricsLevel=" + this.metricsLevel + ", entityId=" + this.entityId + ", metricsName=" + this.metricsName + ", period=" + this.period + ", metricValue=" + this.metricValue + ", expirationUnixTime=" + this.expirationUnixTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Builder {
        private List<CreateRealTimeMetricsInput> input;

        public BatchCreateRealTimeMetricsMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new BatchCreateRealTimeMetricsMutation(this.input);
        }

        public Builder input(List<CreateRealTimeMetricsInput> list) {
            this.input = list;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("batchCreateRealTimeMetrics", "batchCreateRealTimeMetrics", new UnmodifiableMapBuilder(1).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final List<BatchCreateRealTimeMetric> batchCreateRealTimeMetrics;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final BatchCreateRealTimeMetric.Mapper batchCreateRealTimeMetricFieldMapper = new BatchCreateRealTimeMetric.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<BatchCreateRealTimeMetric>() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public BatchCreateRealTimeMetric read(ResponseReader.ListItemReader listItemReader) {
                        return (BatchCreateRealTimeMetric) listItemReader.readObject(new ResponseReader.ObjectReader<BatchCreateRealTimeMetric>() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.Data.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public BatchCreateRealTimeMetric read(ResponseReader responseReader2) {
                                return Mapper.this.batchCreateRealTimeMetricFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }));
            }
        }

        public Data(List<BatchCreateRealTimeMetric> list) {
            this.batchCreateRealTimeMetrics = list;
        }

        public List<BatchCreateRealTimeMetric> batchCreateRealTimeMetrics() {
            return this.batchCreateRealTimeMetrics;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            List<BatchCreateRealTimeMetric> list = this.batchCreateRealTimeMetrics;
            List<BatchCreateRealTimeMetric> list2 = ((Data) obj).batchCreateRealTimeMetrics;
            return list == null ? list2 == null : list.equals(list2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                List<BatchCreateRealTimeMetric> list = this.batchCreateRealTimeMetrics;
                this.$hashCode = (list == null ? 0 : list.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.batchCreateRealTimeMetrics, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.Data.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((BatchCreateRealTimeMetric) obj).marshaller());
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{batchCreateRealTimeMetrics=" + this.batchCreateRealTimeMetrics + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final List<CreateRealTimeMetricsInput> input;
        private final transient Map<String, Object> valueMap;

        public Variables(List<CreateRealTimeMetricsInput> list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = list;
            linkedHashMap.put("input", list);
        }

        public List<CreateRealTimeMetricsInput> input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeList("input", new InputFieldWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.BatchCreateRealTimeMetricsMutation.Variables.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = Variables.this.input.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((CreateRealTimeMetricsInput) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public BatchCreateRealTimeMetricsMutation(List<CreateRealTimeMetricsInput> list) {
        Utils.checkNotNull(list, "input == null");
        this.variables = new Variables(list);
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
        return "c550bbba881c8a21f7449e2594b2eb8cd0f20cd5a50aa1d8bf533720c326ea77";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation BatchCreateRealTimeMetrics($input: [CreateRealTimeMetricsInput!]!) {\n  batchCreateRealTimeMetrics(input: $input) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
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
