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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.MetricsLevel;

/* loaded from: classes7.dex */
public final class GetRealTimeMetricsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetRealTimeMetrics($accountId: ID!, $entityId: ID!, $metricsLevel: MetricsLevel!, $period: String!, $metricsName: String!) {\n  getRealTimeMetrics(accountId: $accountId, entityId: $entityId, metricsLevel: $metricsLevel, period: $period, metricsName: $metricsName) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetRealTimeMetricsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetRealTimeMetrics";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetRealTimeMetrics($accountId: ID!, $entityId: ID!, $metricsLevel: MetricsLevel!, $period: String!, $metricsName: String!) {\n  getRealTimeMetrics(accountId: $accountId, entityId: $entityId, metricsLevel: $metricsLevel, period: $period, metricsName: $metricsName) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String entityId;
        private MetricsLevel metricsLevel;
        private String metricsName;
        private String period;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetRealTimeMetricsQuery build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.entityId, "entityId == null");
            Utils.checkNotNull(this.metricsLevel, "metricsLevel == null");
            Utils.checkNotNull(this.period, "period == null");
            Utils.checkNotNull(this.metricsName, "metricsName == null");
            return new GetRealTimeMetricsQuery(this.accountId, this.entityId, this.metricsLevel, this.period, this.metricsName);
        }

        public Builder entityId(String str) {
            this.entityId = str;
            return this;
        }

        public Builder metricsLevel(MetricsLevel metricsLevel) {
            this.metricsLevel = metricsLevel;
            return this;
        }

        public Builder metricsName(String str) {
            this.metricsName = str;
            return this;
        }

        public Builder period(String str) {
            this.period = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getRealTimeMetrics", "getRealTimeMetrics", new UnmodifiableMapBuilder(5).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("period", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "period").build()).put("metricsName", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "metricsName").build()).put("entityId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "entityId").build()).put("metricsLevel", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "metricsLevel").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetRealTimeMetrics getRealTimeMetrics;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetRealTimeMetrics.Mapper getRealTimeMetricsFieldMapper = new GetRealTimeMetrics.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetRealTimeMetrics) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetRealTimeMetrics>() { // from class: com.amazonaws.amplify.generated.graphql.GetRealTimeMetricsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetRealTimeMetrics read(ResponseReader responseReader2) {
                        return Mapper.this.getRealTimeMetricsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetRealTimeMetrics getRealTimeMetrics) {
            this.getRealTimeMetrics = getRealTimeMetrics;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetRealTimeMetrics getRealTimeMetrics = this.getRealTimeMetrics;
            GetRealTimeMetrics getRealTimeMetrics2 = ((Data) obj).getRealTimeMetrics;
            return getRealTimeMetrics == null ? getRealTimeMetrics2 == null : getRealTimeMetrics.equals(getRealTimeMetrics2);
        }

        public GetRealTimeMetrics getRealTimeMetrics() {
            return this.getRealTimeMetrics;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetRealTimeMetrics getRealTimeMetrics = this.getRealTimeMetrics;
                this.$hashCode = (getRealTimeMetrics == null ? 0 : getRealTimeMetrics.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetRealTimeMetricsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetRealTimeMetrics getRealTimeMetrics = Data.this.getRealTimeMetrics;
                    responseWriter.writeObject(responseField, getRealTimeMetrics != null ? getRealTimeMetrics.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getRealTimeMetrics=" + this.getRealTimeMetrics + "}";
            }
            return this.$toString;
        }
    }

    public static class GetRealTimeMetrics {
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

        public static final class Mapper implements ResponseFieldMapper<GetRealTimeMetrics> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetRealTimeMetrics map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetRealTimeMetrics.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                return new GetRealTimeMetrics(string, str, string2 != null ? MetricsLevel.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readDouble(responseFieldArr[6]).doubleValue(), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsLevel", "metricsLevel", null, false, Collections.emptyList()), ResponseField.forCustomType("entityId", "entityId", null, false, customType, Collections.emptyList()), ResponseField.forString("metricsName", "metricsName", null, false, Collections.emptyList()), ResponseField.forString("period", "period", null, false, Collections.emptyList()), ResponseField.forDouble("metricValue", "metricValue", null, false, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public GetRealTimeMetrics(String str, String str2, MetricsLevel metricsLevel, String str3, String str4, String str5, double d, Long l, String str6, String str7) {
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
            if (!(obj instanceof GetRealTimeMetrics)) {
                return false;
            }
            GetRealTimeMetrics getRealTimeMetrics = (GetRealTimeMetrics) obj;
            if (this.__typename.equals(getRealTimeMetrics.__typename) && this.accountId.equals(getRealTimeMetrics.accountId) && this.metricsLevel.equals(getRealTimeMetrics.metricsLevel) && this.entityId.equals(getRealTimeMetrics.entityId) && this.metricsName.equals(getRealTimeMetrics.metricsName) && this.period.equals(getRealTimeMetrics.period) && Double.doubleToLongBits(this.metricValue) == Double.doubleToLongBits(getRealTimeMetrics.metricValue) && ((l = this.expirationUnixTime) != null ? l.equals(getRealTimeMetrics.expirationUnixTime) : getRealTimeMetrics.expirationUnixTime == null) && ((str = this.createdAt) != null ? str.equals(getRealTimeMetrics.createdAt) : getRealTimeMetrics.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = getRealTimeMetrics.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetRealTimeMetricsQuery.GetRealTimeMetrics.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetRealTimeMetrics.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetRealTimeMetrics.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetRealTimeMetrics.this.accountId);
                    responseWriter.writeString(responseFieldArr[2], GetRealTimeMetrics.this.metricsLevel.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetRealTimeMetrics.this.entityId);
                    responseWriter.writeString(responseFieldArr[4], GetRealTimeMetrics.this.metricsName);
                    responseWriter.writeString(responseFieldArr[5], GetRealTimeMetrics.this.period);
                    responseWriter.writeDouble(responseFieldArr[6], Double.valueOf(GetRealTimeMetrics.this.metricValue));
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], GetRealTimeMetrics.this.expirationUnixTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], GetRealTimeMetrics.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], GetRealTimeMetrics.this.updatedAt);
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
                this.$toString = "GetRealTimeMetrics{__typename=" + this.__typename + ", accountId=" + this.accountId + ", metricsLevel=" + this.metricsLevel + ", entityId=" + this.entityId + ", metricsName=" + this.metricsName + ", period=" + this.period + ", metricValue=" + this.metricValue + ", expirationUnixTime=" + this.expirationUnixTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String entityId;
        private final MetricsLevel metricsLevel;
        private final String metricsName;
        private final String period;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2, MetricsLevel metricsLevel, String str3, String str4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.entityId = str2;
            this.metricsLevel = metricsLevel;
            this.period = str3;
            this.metricsName = str4;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("entityId", str2);
            linkedHashMap.put("metricsLevel", metricsLevel);
            linkedHashMap.put("period", str3);
            linkedHashMap.put("metricsName", str4);
        }

        public String accountId() {
            return this.accountId;
        }

        public String entityId() {
            return this.entityId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetRealTimeMetricsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("entityId", Variables.this.entityId);
                    inputFieldWriter.writeString("metricsLevel", Variables.this.metricsLevel.name());
                    inputFieldWriter.writeString("period", Variables.this.period);
                    inputFieldWriter.writeString("metricsName", Variables.this.metricsName);
                }
            };
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

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetRealTimeMetricsQuery(String str, String str2, MetricsLevel metricsLevel, String str3, String str4) {
        Utils.checkNotNull(str, "accountId == null");
        Utils.checkNotNull(str2, "entityId == null");
        Utils.checkNotNull(metricsLevel, "metricsLevel == null");
        Utils.checkNotNull(str3, "period == null");
        Utils.checkNotNull(str4, "metricsName == null");
        this.variables = new Variables(str, str2, metricsLevel, str3, str4);
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
        return "460c3060593d1dde1b38a485617b35ce4e15cfa7f96bd4c0791bc2d64d21f74d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetRealTimeMetrics($accountId: ID!, $entityId: ID!, $metricsLevel: MetricsLevel!, $period: String!, $metricsName: String!) {\n  getRealTimeMetrics(accountId: $accountId, entityId: $entityId, metricsLevel: $metricsLevel, period: $period, metricsName: $metricsName) {\n    __typename\n    accountId\n    metricsLevel\n    entityId\n    metricsName\n    period\n    metricValue\n    expirationUnixTime\n    createdAt\n    updatedAt\n  }\n}";
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
