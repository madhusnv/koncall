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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.QueryFetchAggregatedMetricsBodyInput;
import type.QueryFetchAggregatedMetricsQueryInput;

/* loaded from: classes7.dex */
public final class FetchAggregatedMetricsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query FetchAggregatedMetrics($query: QueryFetchAggregatedMetricsQueryInput, $body: QueryFetchAggregatedMetricsBodyInput) {\n  fetchAggregatedMetrics(query: $query, body: $body) {\n    __typename\n    accountId\n    period\n    metricsLevel\n    entityId\n    entityName\n    metricValues {\n      __typename\n      name\n      value\n      asOf\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "FetchAggregatedMetrics";
        }
    };
    public static final String QUERY_DOCUMENT = "query FetchAggregatedMetrics($query: QueryFetchAggregatedMetricsQueryInput, $body: QueryFetchAggregatedMetricsBodyInput) {\n  fetchAggregatedMetrics(query: $query, body: $body) {\n    __typename\n    accountId\n    period\n    metricsLevel\n    entityId\n    entityName\n    metricValues {\n      __typename\n      name\n      value\n      asOf\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private QueryFetchAggregatedMetricsBodyInput body;
        private QueryFetchAggregatedMetricsQueryInput query;

        public Builder body(QueryFetchAggregatedMetricsBodyInput queryFetchAggregatedMetricsBodyInput) {
            this.body = queryFetchAggregatedMetricsBodyInput;
            return this;
        }

        public FetchAggregatedMetricsQuery build() {
            return new FetchAggregatedMetricsQuery(this.query, this.body);
        }

        public Builder query(QueryFetchAggregatedMetricsQueryInput queryFetchAggregatedMetricsQueryInput) {
            this.query = queryFetchAggregatedMetricsQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("fetchAggregatedMetrics", "fetchAggregatedMetrics", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final List<FetchAggregatedMetric> fetchAggregatedMetrics;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final FetchAggregatedMetric.Mapper fetchAggregatedMetricFieldMapper = new FetchAggregatedMetric.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<FetchAggregatedMetric>() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public FetchAggregatedMetric read(ResponseReader.ListItemReader listItemReader) {
                        return (FetchAggregatedMetric) listItemReader.readObject(new ResponseReader.ObjectReader<FetchAggregatedMetric>() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.Data.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public FetchAggregatedMetric read(ResponseReader responseReader2) {
                                return Mapper.this.fetchAggregatedMetricFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }));
            }
        }

        public Data(List<FetchAggregatedMetric> list) {
            this.fetchAggregatedMetrics = list;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            List<FetchAggregatedMetric> list = this.fetchAggregatedMetrics;
            List<FetchAggregatedMetric> list2 = ((Data) obj).fetchAggregatedMetrics;
            return list == null ? list2 == null : list.equals(list2);
        }

        public List<FetchAggregatedMetric> fetchAggregatedMetrics() {
            return this.fetchAggregatedMetrics;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                List<FetchAggregatedMetric> list = this.fetchAggregatedMetrics;
                this.$hashCode = (list == null ? 0 : list.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.fetchAggregatedMetrics, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.Data.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((FetchAggregatedMetric) obj).marshaller());
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{fetchAggregatedMetrics=" + this.fetchAggregatedMetrics + "}";
            }
            return this.$toString;
        }
    }

    public static class FetchAggregatedMetric {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String entityId;
        final String entityName;
        final List<MetricValue> metricValues;
        final String metricsLevel;
        final String period;

        public static final class Mapper implements ResponseFieldMapper<FetchAggregatedMetric> {
            final MetricValue.Mapper metricValueFieldMapper = new MetricValue.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public FetchAggregatedMetric map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = FetchAggregatedMetric.$responseFields;
                return new FetchAggregatedMetric(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readList(responseFieldArr[6], new ResponseReader.ListReader<MetricValue>() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.FetchAggregatedMetric.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public MetricValue read(ResponseReader.ListItemReader listItemReader) {
                        return (MetricValue) listItemReader.readObject(new ResponseReader.ObjectReader<MetricValue>() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.FetchAggregatedMetric.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public MetricValue read(ResponseReader responseReader2) {
                                return Mapper.this.metricValueFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forString("metricsLevel", "metricsLevel", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, true, customType, Collections.emptyList()), ResponseField.forString("entityName", "entityName", null, true, Collections.emptyList()), ResponseField.forList("metricValues", "metricValues", null, true, Collections.emptyList())};
        }

        public FetchAggregatedMetric(String str, String str2, String str3, String str4, String str5, String str6, List<MetricValue> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.period = (String) Utils.checkNotNull(str3, "period == null");
            this.metricsLevel = (String) Utils.checkNotNull(str4, "metricsLevel == null");
            this.entityId = str5;
            this.entityName = str6;
            this.metricValues = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String entityId() {
            return this.entityId;
        }

        public String entityName() {
            return this.entityName;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FetchAggregatedMetric)) {
                return false;
            }
            FetchAggregatedMetric fetchAggregatedMetric = (FetchAggregatedMetric) obj;
            if (this.__typename.equals(fetchAggregatedMetric.__typename) && this.accountId.equals(fetchAggregatedMetric.accountId) && this.period.equals(fetchAggregatedMetric.period) && this.metricsLevel.equals(fetchAggregatedMetric.metricsLevel) && ((str = this.entityId) != null ? str.equals(fetchAggregatedMetric.entityId) : fetchAggregatedMetric.entityId == null) && ((str2 = this.entityName) != null ? str2.equals(fetchAggregatedMetric.entityName) : fetchAggregatedMetric.entityName == null)) {
                List<MetricValue> list = this.metricValues;
                List<MetricValue> list2 = fetchAggregatedMetric.metricValues;
                if (list == null) {
                    if (list2 == null) {
                        return true;
                    }
                } else if (list.equals(list2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.period.hashCode()) * 1000003) ^ this.metricsLevel.hashCode()) * 1000003;
                String str = this.entityId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.entityName;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                List<MetricValue> list = this.metricValues;
                this.$hashCode = iHashCode3 ^ (list != null ? list.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.FetchAggregatedMetric.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = FetchAggregatedMetric.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], FetchAggregatedMetric.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], FetchAggregatedMetric.this.accountId);
                    responseWriter.writeString(responseFieldArr[2], FetchAggregatedMetric.this.period);
                    responseWriter.writeString(responseFieldArr[3], FetchAggregatedMetric.this.metricsLevel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], FetchAggregatedMetric.this.entityId);
                    responseWriter.writeString(responseFieldArr[5], FetchAggregatedMetric.this.entityName);
                    responseWriter.writeList(responseFieldArr[6], FetchAggregatedMetric.this.metricValues, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.FetchAggregatedMetric.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((MetricValue) obj).marshaller());
                        }
                    });
                }
            };
        }

        public List<MetricValue> metricValues() {
            return this.metricValues;
        }

        public String metricsLevel() {
            return this.metricsLevel;
        }

        public String period() {
            return this.period;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FetchAggregatedMetric{__typename=" + this.__typename + ", accountId=" + this.accountId + ", period=" + this.period + ", metricsLevel=" + this.metricsLevel + ", entityId=" + this.entityId + ", entityName=" + this.entityName + ", metricValues=" + this.metricValues + "}";
            }
            return this.$toString;
        }
    }

    public static class MetricValue {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forDouble("value", "value", null, true, Collections.emptyList()), ResponseField.forCustomType("asOf", "asOf", null, true, CustomType.AWSDATE, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String asOf;
        final String name;
        final Double value;

        public static final class Mapper implements ResponseFieldMapper<MetricValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public MetricValue map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = MetricValue.$responseFields;
                return new MetricValue(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readDouble(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]));
            }
        }

        public MetricValue(String str, String str2, Double d, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.name = str2;
            this.value = d;
            this.asOf = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String asOf() {
            return this.asOf;
        }

        public boolean equals(Object obj) {
            String str;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricValue)) {
                return false;
            }
            MetricValue metricValue = (MetricValue) obj;
            if (this.__typename.equals(metricValue.__typename) && ((str = this.name) != null ? str.equals(metricValue.name) : metricValue.name == null) && ((d = this.value) != null ? d.equals(metricValue.value) : metricValue.value == null)) {
                String str2 = this.asOf;
                String str3 = metricValue.asOf;
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

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.value;
                int iHashCode3 = (iHashCode2 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str2 = this.asOf;
                this.$hashCode = iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.MetricValue.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = MetricValue.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], MetricValue.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], MetricValue.this.name);
                    responseWriter.writeDouble(responseFieldArr[2], MetricValue.this.value);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], MetricValue.this.asOf);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MetricValue{__typename=" + this.__typename + ", name=" + this.name + ", value=" + this.value + ", asOf=" + this.asOf + "}";
            }
            return this.$toString;
        }

        public Double value() {
            return this.value;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final QueryFetchAggregatedMetricsBodyInput body;
        private final QueryFetchAggregatedMetricsQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryFetchAggregatedMetricsQueryInput queryFetchAggregatedMetricsQueryInput, QueryFetchAggregatedMetricsBodyInput queryFetchAggregatedMetricsBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = queryFetchAggregatedMetricsQueryInput;
            this.body = queryFetchAggregatedMetricsBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, queryFetchAggregatedMetricsQueryInput);
            linkedHashMap.put("body", queryFetchAggregatedMetricsBodyInput);
        }

        public QueryFetchAggregatedMetricsBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchAggregatedMetricsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public QueryFetchAggregatedMetricsQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public FetchAggregatedMetricsQuery(QueryFetchAggregatedMetricsQueryInput queryFetchAggregatedMetricsQueryInput, QueryFetchAggregatedMetricsBodyInput queryFetchAggregatedMetricsBodyInput) {
        this.variables = new Variables(queryFetchAggregatedMetricsQueryInput, queryFetchAggregatedMetricsBodyInput);
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
        return "4733d6f909e028d269c20766c5a82c093c71aa50233e88a5e09937bd161d82e1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query FetchAggregatedMetrics($query: QueryFetchAggregatedMetricsQueryInput, $body: QueryFetchAggregatedMetricsBodyInput) {\n  fetchAggregatedMetrics(query: $query, body: $body) {\n    __typename\n    accountId\n    period\n    metricsLevel\n    entityId\n    entityName\n    metricValues {\n      __typename\n      name\n      value\n      asOf\n    }\n  }\n}";
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
