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
import com.google.android.gms.actions.SearchIntents;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.QueryFetchDealAmountBodyInput;
import type.QueryFetchDealAmountQueryInput;

/* loaded from: classes7.dex */
public final class FetchDealAmountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query FetchDealAmount($query: QueryFetchDealAmountQueryInput, $body: QueryFetchDealAmountBodyInput) {\n  fetchDealAmount(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.FetchDealAmountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "FetchDealAmount";
        }
    };
    public static final String QUERY_DOCUMENT = "query FetchDealAmount($query: QueryFetchDealAmountQueryInput, $body: QueryFetchDealAmountBodyInput) {\n  fetchDealAmount(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private QueryFetchDealAmountBodyInput body;
        private QueryFetchDealAmountQueryInput query;

        public Builder body(QueryFetchDealAmountBodyInput queryFetchDealAmountBodyInput) {
            this.body = queryFetchDealAmountBodyInput;
            return this;
        }

        public FetchDealAmountQuery build() {
            return new FetchDealAmountQuery(this.query, this.body);
        }

        public Builder query(QueryFetchDealAmountQueryInput queryFetchDealAmountQueryInput) {
            this.query = queryFetchDealAmountQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("fetchDealAmount", "fetchDealAmount", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final List<String> fetchDealAmount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.FetchDealAmountQuery.Data.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }));
            }
        }

        public Data(List<String> list) {
            this.fetchDealAmount = list;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            List<String> list = this.fetchDealAmount;
            List<String> list2 = ((Data) obj).fetchDealAmount;
            return list == null ? list2 == null : list.equals(list2);
        }

        public List<String> fetchDealAmount() {
            return this.fetchDealAmount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                List<String> list = this.fetchDealAmount;
                this.$hashCode = (list == null ? 0 : list.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchDealAmountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.fetchDealAmount, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.FetchDealAmountQuery.Data.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{fetchDealAmount=" + this.fetchDealAmount + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final QueryFetchDealAmountBodyInput body;
        private final QueryFetchDealAmountQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryFetchDealAmountQueryInput queryFetchDealAmountQueryInput, QueryFetchDealAmountBodyInput queryFetchDealAmountBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = queryFetchDealAmountQueryInput;
            this.body = queryFetchDealAmountBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, queryFetchDealAmountQueryInput);
            linkedHashMap.put("body", queryFetchDealAmountBodyInput);
        }

        public QueryFetchDealAmountBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchDealAmountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public QueryFetchDealAmountQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public FetchDealAmountQuery(QueryFetchDealAmountQueryInput queryFetchDealAmountQueryInput, QueryFetchDealAmountBodyInput queryFetchDealAmountBodyInput) {
        this.variables = new Variables(queryFetchDealAmountQueryInput, queryFetchDealAmountBodyInput);
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
        return "189a9e72887f4279d824d513af9f7332a5d1e4a3cb51f4189fcbe0c01a03c424";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query FetchDealAmount($query: QueryFetchDealAmountQueryInput, $body: QueryFetchDealAmountBodyInput) {\n  fetchDealAmount(query: $query, body: $body)\n}";
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
