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
import type.QueryGetClickToCallUrlBodyInput;
import type.QueryGetClickToCallUrlQueryInput;

/* loaded from: classes7.dex */
public final class GetClickToCallUrlQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetClickToCallUrl($query: QueryGetClickToCallUrlQueryInput, $body: QueryGetClickToCallUrlBodyInput) {\n  getClickToCallUrl(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetClickToCallUrlQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetClickToCallUrl";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetClickToCallUrl($query: QueryGetClickToCallUrlQueryInput, $body: QueryGetClickToCallUrlBodyInput) {\n  getClickToCallUrl(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private QueryGetClickToCallUrlBodyInput body;
        private QueryGetClickToCallUrlQueryInput query;

        public Builder body(QueryGetClickToCallUrlBodyInput queryGetClickToCallUrlBodyInput) {
            this.body = queryGetClickToCallUrlBodyInput;
            return this;
        }

        public GetClickToCallUrlQuery build() {
            return new GetClickToCallUrlQuery(this.query, this.body);
        }

        public Builder query(QueryGetClickToCallUrlQueryInput queryGetClickToCallUrlQueryInput) {
            this.query = queryGetClickToCallUrlQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("getClickToCallUrl", "getClickToCallUrl", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String getClickToCallUrl;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.getClickToCallUrl = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.getClickToCallUrl;
            String str2 = ((Data) obj).getClickToCallUrl;
            return str == null ? str2 == null : str.equals(str2);
        }

        public String getClickToCallUrl() {
            return this.getClickToCallUrl;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.getClickToCallUrl;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetClickToCallUrlQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.getClickToCallUrl);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getClickToCallUrl=" + this.getClickToCallUrl + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final QueryGetClickToCallUrlBodyInput body;
        private final QueryGetClickToCallUrlQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryGetClickToCallUrlQueryInput queryGetClickToCallUrlQueryInput, QueryGetClickToCallUrlBodyInput queryGetClickToCallUrlBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = queryGetClickToCallUrlQueryInput;
            this.body = queryGetClickToCallUrlBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, queryGetClickToCallUrlQueryInput);
            linkedHashMap.put("body", queryGetClickToCallUrlBodyInput);
        }

        public QueryGetClickToCallUrlBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetClickToCallUrlQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public QueryGetClickToCallUrlQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetClickToCallUrlQuery(QueryGetClickToCallUrlQueryInput queryGetClickToCallUrlQueryInput, QueryGetClickToCallUrlBodyInput queryGetClickToCallUrlBodyInput) {
        this.variables = new Variables(queryGetClickToCallUrlQueryInput, queryGetClickToCallUrlBodyInput);
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
        return "1f2fcbd75afa1f4f67cd14f90fc4d6bbfb0172e236e0bcf8aa31da13aa195e05";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetClickToCallUrl($query: QueryGetClickToCallUrlQueryInput, $body: QueryGetClickToCallUrlBodyInput) {\n  getClickToCallUrl(query: $query, body: $body)\n}";
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
