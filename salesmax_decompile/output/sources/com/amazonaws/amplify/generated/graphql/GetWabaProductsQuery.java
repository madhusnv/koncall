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
import java.util.Map;
import type.CustomType;
import type.QueryGetWabaProductsBodyInput;
import type.QueryGetWabaProductsQueryInput;

/* loaded from: classes7.dex */
public final class GetWabaProductsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetWabaProducts($query: QueryGetWabaProductsQueryInput, $body: QueryGetWabaProductsBodyInput) {\n  getWabaProducts(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaProductsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetWabaProducts";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetWabaProducts($query: QueryGetWabaProductsQueryInput, $body: QueryGetWabaProductsBodyInput) {\n  getWabaProducts(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private QueryGetWabaProductsBodyInput body;
        private QueryGetWabaProductsQueryInput query;

        public Builder body(QueryGetWabaProductsBodyInput queryGetWabaProductsBodyInput) {
            this.body = queryGetWabaProductsBodyInput;
            return this;
        }

        public GetWabaProductsQuery build() {
            return new GetWabaProductsQuery(this.query, this.body);
        }

        public Builder query(QueryGetWabaProductsQueryInput queryGetWabaProductsQueryInput) {
            this.query = queryGetWabaProductsQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("getWabaProducts", "getWabaProducts", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String getWabaProducts;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.getWabaProducts = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.getWabaProducts;
            String str2 = ((Data) obj).getWabaProducts;
            return str == null ? str2 == null : str.equals(str2);
        }

        public String getWabaProducts() {
            return this.getWabaProducts;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.getWabaProducts;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaProductsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.getWabaProducts);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getWabaProducts=" + this.getWabaProducts + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final QueryGetWabaProductsBodyInput body;
        private final QueryGetWabaProductsQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryGetWabaProductsQueryInput queryGetWabaProductsQueryInput, QueryGetWabaProductsBodyInput queryGetWabaProductsBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = queryGetWabaProductsQueryInput;
            this.body = queryGetWabaProductsBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, queryGetWabaProductsQueryInput);
            linkedHashMap.put("body", queryGetWabaProductsBodyInput);
        }

        public QueryGetWabaProductsBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaProductsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public QueryGetWabaProductsQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetWabaProductsQuery(QueryGetWabaProductsQueryInput queryGetWabaProductsQueryInput, QueryGetWabaProductsBodyInput queryGetWabaProductsBodyInput) {
        this.variables = new Variables(queryGetWabaProductsQueryInput, queryGetWabaProductsBodyInput);
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
        return "3ada2982e63fcbc68eea526593c4514585c77d7f927d57ed8481fe7abd9819e3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetWabaProducts($query: QueryGetWabaProductsQueryInput, $body: QueryGetWabaProductsBodyInput) {\n  getWabaProducts(query: $query, body: $body)\n}";
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
