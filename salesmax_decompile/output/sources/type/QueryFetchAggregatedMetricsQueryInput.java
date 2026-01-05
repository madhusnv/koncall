package type;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class QueryFetchAggregatedMetricsQueryInput implements InputType {
    private final Input<String> accountId;
    private final Input<Boolean> aggregate;
    private final Input<List<String>> entityId;
    private final Input<String> entityType;
    private final Input<String> fromDt;
    private final Input<Integer> limit;
    private final Input<String> metricLevel;
    private final Input<List<String>> metricName;
    private final Input<String> nextToken;
    private final Input<String> orderByMetricsName;
    private final Input<String> orderDirection;
    private final Input<String> period;
    private final Input<String> prevToken;
    private final Input<String> statisticsName;
    private final Input<String> toDt;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<List<String>> entityId = Input.absent();
        private Input<String> entityType = Input.absent();
        private Input<String> fromDt = Input.absent();
        private Input<String> toDt = Input.absent();
        private Input<List<String>> metricName = Input.absent();
        private Input<String> metricLevel = Input.absent();
        private Input<String> orderByMetricsName = Input.absent();
        private Input<String> period = Input.absent();
        private Input<Boolean> aggregate = Input.absent();
        private Input<String> orderDirection = Input.absent();
        private Input<Integer> limit = Input.absent();
        private Input<String> nextToken = Input.absent();
        private Input<String> prevToken = Input.absent();
        private Input<String> statisticsName = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder aggregate(Boolean bool) {
            this.aggregate = Input.fromNullable(bool);
            return this;
        }

        public QueryFetchAggregatedMetricsQueryInput build() {
            return new QueryFetchAggregatedMetricsQueryInput(this.accountId, this.entityId, this.entityType, this.fromDt, this.toDt, this.metricName, this.metricLevel, this.orderByMetricsName, this.period, this.aggregate, this.orderDirection, this.limit, this.nextToken, this.prevToken, this.statisticsName);
        }

        public Builder entityId(List<String> list) {
            this.entityId = Input.fromNullable(list);
            return this;
        }

        public Builder entityType(String str) {
            this.entityType = Input.fromNullable(str);
            return this;
        }

        public Builder fromDt(String str) {
            this.fromDt = Input.fromNullable(str);
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = Input.fromNullable(num);
            return this;
        }

        public Builder metricLevel(String str) {
            this.metricLevel = Input.fromNullable(str);
            return this;
        }

        public Builder metricName(List<String> list) {
            this.metricName = Input.fromNullable(list);
            return this;
        }

        public Builder nextToken(String str) {
            this.nextToken = Input.fromNullable(str);
            return this;
        }

        public Builder orderByMetricsName(String str) {
            this.orderByMetricsName = Input.fromNullable(str);
            return this;
        }

        public Builder orderDirection(String str) {
            this.orderDirection = Input.fromNullable(str);
            return this;
        }

        public Builder period(String str) {
            this.period = Input.fromNullable(str);
            return this;
        }

        public Builder prevToken(String str) {
            this.prevToken = Input.fromNullable(str);
            return this;
        }

        public Builder statisticsName(String str) {
            this.statisticsName = Input.fromNullable(str);
            return this;
        }

        public Builder toDt(String str) {
            this.toDt = Input.fromNullable(str);
            return this;
        }
    }

    public QueryFetchAggregatedMetricsQueryInput(Input<String> input, Input<List<String>> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<List<String>> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<Boolean> input10, Input<String> input11, Input<Integer> input12, Input<String> input13, Input<String> input14, Input<String> input15) {
        this.accountId = input;
        this.entityId = input2;
        this.entityType = input3;
        this.fromDt = input4;
        this.toDt = input5;
        this.metricName = input6;
        this.metricLevel = input7;
        this.orderByMetricsName = input8;
        this.period = input9;
        this.aggregate = input10;
        this.orderDirection = input11;
        this.limit = input12;
        this.nextToken = input13;
        this.prevToken = input14;
        this.statisticsName = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public Boolean aggregate() {
        return this.aggregate.value;
    }

    public List<String> entityId() {
        return this.entityId.value;
    }

    public String entityType() {
        return this.entityType.value;
    }

    public String fromDt() {
        return this.fromDt.value;
    }

    public Integer limit() {
        return this.limit.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryFetchAggregatedMetricsQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryFetchAggregatedMetricsQueryInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) QueryFetchAggregatedMetricsQueryInput.this.accountId.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.entityId.defined) {
                    inputFieldWriter.writeList("entityId", QueryFetchAggregatedMetricsQueryInput.this.entityId.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.QueryFetchAggregatedMetricsQueryInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) QueryFetchAggregatedMetricsQueryInput.this.entityId.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.entityType.defined) {
                    inputFieldWriter.writeString("entityType", (String) QueryFetchAggregatedMetricsQueryInput.this.entityType.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.fromDt.defined) {
                    inputFieldWriter.writeString("fromDt", (String) QueryFetchAggregatedMetricsQueryInput.this.fromDt.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.toDt.defined) {
                    inputFieldWriter.writeString("toDt", (String) QueryFetchAggregatedMetricsQueryInput.this.toDt.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.metricName.defined) {
                    inputFieldWriter.writeList("metricName", QueryFetchAggregatedMetricsQueryInput.this.metricName.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.QueryFetchAggregatedMetricsQueryInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) QueryFetchAggregatedMetricsQueryInput.this.metricName.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.metricLevel.defined) {
                    inputFieldWriter.writeString("metricLevel", (String) QueryFetchAggregatedMetricsQueryInput.this.metricLevel.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.orderByMetricsName.defined) {
                    inputFieldWriter.writeString("orderByMetricsName", (String) QueryFetchAggregatedMetricsQueryInput.this.orderByMetricsName.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) QueryFetchAggregatedMetricsQueryInput.this.period.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.aggregate.defined) {
                    inputFieldWriter.writeBoolean("aggregate", (Boolean) QueryFetchAggregatedMetricsQueryInput.this.aggregate.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.orderDirection.defined) {
                    inputFieldWriter.writeString("orderDirection", (String) QueryFetchAggregatedMetricsQueryInput.this.orderDirection.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.limit.defined) {
                    inputFieldWriter.writeInt("limit", (Integer) QueryFetchAggregatedMetricsQueryInput.this.limit.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.nextToken.defined) {
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, (String) QueryFetchAggregatedMetricsQueryInput.this.nextToken.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.prevToken.defined) {
                    inputFieldWriter.writeString("prevToken", (String) QueryFetchAggregatedMetricsQueryInput.this.prevToken.value);
                }
                if (QueryFetchAggregatedMetricsQueryInput.this.statisticsName.defined) {
                    inputFieldWriter.writeString("statisticsName", (String) QueryFetchAggregatedMetricsQueryInput.this.statisticsName.value);
                }
            }
        };
    }

    public String metricLevel() {
        return this.metricLevel.value;
    }

    public List<String> metricName() {
        return this.metricName.value;
    }

    public String nextToken() {
        return this.nextToken.value;
    }

    public String orderByMetricsName() {
        return this.orderByMetricsName.value;
    }

    public String orderDirection() {
        return this.orderDirection.value;
    }

    public String period() {
        return this.period.value;
    }

    public String prevToken() {
        return this.prevToken.value;
    }

    public String statisticsName() {
        return this.statisticsName.value;
    }

    public String toDt() {
        return this.toDt.value;
    }
}
