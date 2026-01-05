package com.amazonaws.amplify.generated.graphql;

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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;

/* loaded from: classes.dex */
public final class AggregateSearchableQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query AggregateSearchableQuery($accountId: ID!, $typename: String, $filter: AWSJSON, $pivotOnAttribute: [String], $aggregateOnField: String, $aggregationType: String, $interval: String, $dateBuckets: AWSJSON) {\n  aggregateSearchableQuery(accountId: $accountId, typename: $typename, filter: $filter, pivotOnAttribute: $pivotOnAttribute, aggregateOnField: $aggregateOnField, aggregationType: $aggregationType, interval: $interval, dateBuckets: $dateBuckets)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.AggregateSearchableQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "AggregateSearchableQuery";
        }
    };
    public static final String QUERY_DOCUMENT = "query AggregateSearchableQuery($accountId: ID!, $typename: String, $filter: AWSJSON, $pivotOnAttribute: [String], $aggregateOnField: String, $aggregationType: String, $interval: String, $dateBuckets: AWSJSON) {\n  aggregateSearchableQuery(accountId: $accountId, typename: $typename, filter: $filter, pivotOnAttribute: $pivotOnAttribute, aggregateOnField: $aggregateOnField, aggregationType: $aggregationType, interval: $interval, dateBuckets: $dateBuckets)\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String aggregateOnField;
        private String aggregationType;
        private String dateBuckets;
        private String filter;
        private String interval;
        private List<String> pivotOnAttribute;
        private String typename;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder aggregateOnField(String str) {
            this.aggregateOnField = str;
            return this;
        }

        public Builder aggregationType(String str) {
            this.aggregationType = str;
            return this;
        }

        public AggregateSearchableQuery build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new AggregateSearchableQuery(this.accountId, this.typename, this.filter, this.pivotOnAttribute, this.aggregateOnField, this.aggregationType, this.interval, this.dateBuckets);
        }

        public Builder dateBuckets(String str) {
            this.dateBuckets = str;
            return this;
        }

        public Builder filter(String str) {
            this.filter = str;
            return this;
        }

        public Builder interval(String str) {
            this.interval = str;
            return this;
        }

        public Builder pivotOnAttribute(List<String> list) {
            this.pivotOnAttribute = list;
            return this;
        }

        public Builder typename(String str) {
            this.typename = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("aggregateSearchableQuery", "aggregateSearchableQuery", new UnmodifiableMapBuilder(8).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("dateBuckets", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "dateBuckets").build()).put("aggregationType", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "aggregationType").build()).put("aggregateOnField", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "aggregateOnField").build()).put("interval", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "interval").build()).put("typename", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "typename").build()).put("pivotOnAttribute", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "pivotOnAttribute").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String aggregateSearchableQuery;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.aggregateSearchableQuery = str;
        }

        public String aggregateSearchableQuery() {
            return this.aggregateSearchableQuery;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.aggregateSearchableQuery;
            String str2 = ((Data) obj).aggregateSearchableQuery;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.aggregateSearchableQuery;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.AggregateSearchableQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.aggregateSearchableQuery);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{aggregateSearchableQuery=" + this.aggregateSearchableQuery + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String aggregateOnField;
        private final String aggregationType;
        private final String dateBuckets;
        private final String filter;
        private final String interval;
        private final List<String> pivotOnAttribute;
        private final String typename;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.typename = str2;
            this.filter = str3;
            this.pivotOnAttribute = list;
            this.aggregateOnField = str4;
            this.aggregationType = str5;
            this.interval = str6;
            this.dateBuckets = str7;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("typename", str2);
            linkedHashMap.put("filter", str3);
            linkedHashMap.put("pivotOnAttribute", list);
            linkedHashMap.put("aggregateOnField", str4);
            linkedHashMap.put("aggregationType", str5);
            linkedHashMap.put("interval", str6);
            linkedHashMap.put("dateBuckets", str7);
        }

        public String accountId() {
            return this.accountId;
        }

        public String aggregateOnField() {
            return this.aggregateOnField;
        }

        public String aggregationType() {
            return this.aggregationType;
        }

        public String dateBuckets() {
            return this.dateBuckets;
        }

        public String filter() {
            return this.filter;
        }

        public String interval() {
            return this.interval;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.AggregateSearchableQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("typename", Variables.this.typename);
                    inputFieldWriter.writeString("filter", Variables.this.filter);
                    inputFieldWriter.writeList("pivotOnAttribute", Variables.this.pivotOnAttribute != null ? new InputFieldWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.AggregateSearchableQuery.Variables.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = Variables.this.pivotOnAttribute.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    } : null);
                    inputFieldWriter.writeString("aggregateOnField", Variables.this.aggregateOnField);
                    inputFieldWriter.writeString("aggregationType", Variables.this.aggregationType);
                    inputFieldWriter.writeString("interval", Variables.this.interval);
                    inputFieldWriter.writeString("dateBuckets", Variables.this.dateBuckets);
                }
            };
        }

        public List<String> pivotOnAttribute() {
            return this.pivotOnAttribute;
        }

        public String typename() {
            return this.typename;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public AggregateSearchableQuery(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7) {
        Utils.checkNotNull(str, "accountId == null");
        this.variables = new Variables(str, str2, str3, list, str4, str5, str6, str7);
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
        return "ea26cb52c32af65d9f6306b13b3551d413d95310952f10bdf7c1992b761fb7f6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query AggregateSearchableQuery($accountId: ID!, $typename: String, $filter: AWSJSON, $pivotOnAttribute: [String], $aggregateOnField: String, $aggregationType: String, $interval: String, $dateBuckets: AWSJSON) {\n  aggregateSearchableQuery(accountId: $accountId, typename: $typename, filter: $filter, pivotOnAttribute: $pivotOnAttribute, aggregateOnField: $aggregateOnField, aggregationType: $aggregationType, interval: $interval, dateBuckets: $dateBuckets)\n}";
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
