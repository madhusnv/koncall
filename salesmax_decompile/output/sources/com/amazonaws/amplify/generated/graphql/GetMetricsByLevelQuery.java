package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.MetricsLevel;
import type.ModelRealTimeMetricsFilterInput;
import type.ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetMetricsByLevelQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetMetricsByLevel($accountId: ID, $metricsLevelPeriod: ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelRealTimeMetricsFilterInput, $limit: Int, $nextToken: String) {\n  getMetricsByLevel(accountId: $accountId, metricsLevelPeriod: $metricsLevelPeriod, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      accountId\n      metricsLevel\n      entityId\n      metricsName\n      period\n      metricValue\n      expirationUnixTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetMetricsByLevel";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetMetricsByLevel($accountId: ID, $metricsLevelPeriod: ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelRealTimeMetricsFilterInput, $limit: Int, $nextToken: String) {\n  getMetricsByLevel(accountId: $accountId, metricsLevelPeriod: $metricsLevelPeriod, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      accountId\n      metricsLevel\n      entityId\n      metricsName\n      period\n      metricValue\n      expirationUnixTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelRealTimeMetricsFilterInput filter;
        private Integer limit;
        private ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput metricsLevelPeriod;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetMetricsByLevelQuery build() {
            return new GetMetricsByLevelQuery(this.accountId, this.metricsLevelPeriod, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelRealTimeMetricsFilterInput modelRealTimeMetricsFilterInput) {
            this.filter = modelRealTimeMetricsFilterInput;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder metricsLevelPeriod(ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput modelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput) {
            this.metricsLevelPeriod = modelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput;
            return this;
        }

        public Builder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getMetricsByLevel", "getMetricsByLevel", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("metricsLevelPeriod", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "metricsLevelPeriod").build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetMetricsByLevel getMetricsByLevel;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetMetricsByLevel.Mapper getMetricsByLevelFieldMapper = new GetMetricsByLevel.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetMetricsByLevel) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetMetricsByLevel>() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetMetricsByLevel read(ResponseReader responseReader2) {
                        return Mapper.this.getMetricsByLevelFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetMetricsByLevel getMetricsByLevel) {
            this.getMetricsByLevel = getMetricsByLevel;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetMetricsByLevel getMetricsByLevel = this.getMetricsByLevel;
            GetMetricsByLevel getMetricsByLevel2 = ((Data) obj).getMetricsByLevel;
            return getMetricsByLevel == null ? getMetricsByLevel2 == null : getMetricsByLevel.equals(getMetricsByLevel2);
        }

        public GetMetricsByLevel getMetricsByLevel() {
            return this.getMetricsByLevel;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetMetricsByLevel getMetricsByLevel = this.getMetricsByLevel;
                this.$hashCode = (getMetricsByLevel == null ? 0 : getMetricsByLevel.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetMetricsByLevel getMetricsByLevel = Data.this.getMetricsByLevel;
                    responseWriter.writeObject(responseField, getMetricsByLevel != null ? getMetricsByLevel.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getMetricsByLevel=" + this.getMetricsByLevel + "}";
            }
            return this.$toString;
        }
    }

    public static class GetMetricsByLevel {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetMetricsByLevel> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetMetricsByLevel map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetMetricsByLevel.$responseFields;
                return new GetMetricsByLevel(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.GetMetricsByLevel.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.GetMetricsByLevel.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]));
            }
        }

        public GetMetricsByLevel(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetMetricsByLevel)) {
                return false;
            }
            GetMetricsByLevel getMetricsByLevel = (GetMetricsByLevel) obj;
            if (this.__typename.equals(getMetricsByLevel.__typename) && this.items.equals(getMetricsByLevel.items)) {
                String str = this.nextToken;
                String str2 = getMetricsByLevel.nextToken;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.GetMetricsByLevel.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetMetricsByLevel.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetMetricsByLevel.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetMetricsByLevel.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.GetMetricsByLevel.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetMetricsByLevel.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetMetricsByLevel{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Item {
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

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                return new Item(string, str, string2 != null ? MetricsLevel.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readDouble(responseFieldArr[6]).doubleValue(), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsLevel", "metricsLevel", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsName", "metricsName", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forDouble("metricValue", "metricValue", null, false, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, double d, Long l, String str6, String str7) {
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
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.accountId.equals(item.accountId) && this.metricsLevel.equals(item.metricsLevel) && this.entityId.equals(item.entityId) && this.metricsName.equals(item.metricsName) && this.period.equals(item.period) && Double.doubleToLongBits(this.metricValue) == Double.doubleToLongBits(item.metricValue) && ((l = this.expirationUnixTime) != null ? l.equals(item.expirationUnixTime) : item.expirationUnixTime == null) && ((str = this.createdAt) != null ? str.equals(item.createdAt) : item.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = item.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[2], Item.this.metricsLevel.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.entityId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.metricsName);
                    responseWriter.writeString(responseFieldArr[5], Item.this.period);
                    responseWriter.writeDouble(responseFieldArr[6], Double.valueOf(Item.this.metricValue));
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.expirationUnixTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.updatedAt);
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
                this.$toString = "Item{__typename=" + this.__typename + ", accountId=" + this.accountId + ", metricsLevel=" + this.metricsLevel + ", entityId=" + this.entityId + ", metricsName=" + this.metricsName + ", period=" + this.period + ", metricValue=" + this.metricValue + ", expirationUnixTime=" + this.expirationUnixTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelRealTimeMetricsFilterInput filter;
        private final Integer limit;
        private final ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput metricsLevelPeriod;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput modelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelRealTimeMetricsFilterInput modelRealTimeMetricsFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.metricsLevelPeriod = modelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelRealTimeMetricsFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("metricsLevelPeriod", modelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelRealTimeMetricsFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelRealTimeMetricsFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetMetricsByLevelQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("metricsLevelPeriod", Variables.this.metricsLevelPeriod != null ? Variables.this.metricsLevelPeriod.marshaller() : null);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput metricsLevelPeriod() {
            return this.metricsLevelPeriod;
        }

        public String nextToken() {
            return this.nextToken;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetMetricsByLevelQuery(String str, ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput modelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelRealTimeMetricsFilterInput modelRealTimeMetricsFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput, modelSortDirection, modelRealTimeMetricsFilterInput, num, str2);
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
        return "f7d59261731acf4a70c797399018ca672858419c3d676a246f6952e06cd5b2a2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetMetricsByLevel($accountId: ID, $metricsLevelPeriod: ModelRealTimeMetricsMetricsByLevelCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelRealTimeMetricsFilterInput, $limit: Int, $nextToken: String) {\n  getMetricsByLevel(accountId: $accountId, metricsLevelPeriod: $metricsLevelPeriod, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      accountId\n      metricsLevel\n      entityId\n      metricsName\n      period\n      metricValue\n      expirationUnixTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
