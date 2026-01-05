package type;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class QueryFetchAggregatedMetricsBodyInput implements InputType {
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

        public QueryFetchAggregatedMetricsBodyInput build() {
            return new QueryFetchAggregatedMetricsBodyInput(this.accountId, this.entityId, this.entityType, this.fromDt, this.toDt, this.metricName, this.metricLevel, this.orderByMetricsName, this.period, this.aggregate, this.orderDirection, this.limit, this.nextToken, this.prevToken, this.statisticsName);
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

    public QueryFetchAggregatedMetricsBodyInput(Input<String> input, Input<List<String>> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<List<String>> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<Boolean> input10, Input<String> input11, Input<Integer> input12, Input<String> input13, Input<String> input14, Input<String> input15) {
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
        return new InputFieldMarshaller() { // from class: type.QueryFetchAggregatedMetricsBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryFetchAggregatedMetricsBodyInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) QueryFetchAggregatedMetricsBodyInput.this.accountId.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.entityId.defined) {
                    inputFieldWriter.writeList("entityId", QueryFetchAggregatedMetricsBodyInput.this.entityId.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.QueryFetchAggregatedMetricsBodyInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) QueryFetchAggregatedMetricsBodyInput.this.entityId.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeCustom(CustomType.ID, (String) it.next());
                            }
                        }
                    } : null);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.entityType.defined) {
                    inputFieldWriter.writeString("entityType", (String) QueryFetchAggregatedMetricsBodyInput.this.entityType.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.fromDt.defined) {
                    inputFieldWriter.writeString("fromDt", (String) QueryFetchAggregatedMetricsBodyInput.this.fromDt.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.toDt.defined) {
                    inputFieldWriter.writeString("toDt", (String) QueryFetchAggregatedMetricsBodyInput.this.toDt.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.metricName.defined) {
                    inputFieldWriter.writeList("metricName", QueryFetchAggregatedMetricsBodyInput.this.metricName.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.QueryFetchAggregatedMetricsBodyInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) QueryFetchAggregatedMetricsBodyInput.this.metricName.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.metricLevel.defined) {
                    inputFieldWriter.writeString("metricLevel", (String) QueryFetchAggregatedMetricsBodyInput.this.metricLevel.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.orderByMetricsName.defined) {
                    inputFieldWriter.writeString("orderByMetricsName", (String) QueryFetchAggregatedMetricsBodyInput.this.orderByMetricsName.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) QueryFetchAggregatedMetricsBodyInput.this.period.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.aggregate.defined) {
                    inputFieldWriter.writeBoolean("aggregate", (Boolean) QueryFetchAggregatedMetricsBodyInput.this.aggregate.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.orderDirection.defined) {
                    inputFieldWriter.writeString("orderDirection", (String) QueryFetchAggregatedMetricsBodyInput.this.orderDirection.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.limit.defined) {
                    inputFieldWriter.writeInt("limit", (Integer) QueryFetchAggregatedMetricsBodyInput.this.limit.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.nextToken.defined) {
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, (String) QueryFetchAggregatedMetricsBodyInput.this.nextToken.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.prevToken.defined) {
                    inputFieldWriter.writeString("prevToken", (String) QueryFetchAggregatedMetricsBodyInput.this.prevToken.value);
                }
                if (QueryFetchAggregatedMetricsBodyInput.this.statisticsName.defined) {
                    inputFieldWriter.writeString("statisticsName", (String) QueryFetchAggregatedMetricsBodyInput.this.statisticsName.value);
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
