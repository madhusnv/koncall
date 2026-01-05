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
import type.QueryGetObjectPropertiesBodyInput;
import type.QueryGetObjectPropertiesQueryInput;

/* loaded from: classes7.dex */
public final class GetObjectPropertiesQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetObjectProperties($query: QueryGetObjectPropertiesQueryInput, $body: QueryGetObjectPropertiesBodyInput) {\n  getObjectProperties(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetObjectPropertiesQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetObjectProperties";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetObjectProperties($query: QueryGetObjectPropertiesQueryInput, $body: QueryGetObjectPropertiesBodyInput) {\n  getObjectProperties(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private QueryGetObjectPropertiesBodyInput body;
        private QueryGetObjectPropertiesQueryInput query;

        public Builder body(QueryGetObjectPropertiesBodyInput queryGetObjectPropertiesBodyInput) {
            this.body = queryGetObjectPropertiesBodyInput;
            return this;
        }

        public GetObjectPropertiesQuery build() {
            return new GetObjectPropertiesQuery(this.query, this.body);
        }

        public Builder query(QueryGetObjectPropertiesQueryInput queryGetObjectPropertiesQueryInput) {
            this.query = queryGetObjectPropertiesQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("getObjectProperties", "getObjectProperties", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String getObjectProperties;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.getObjectProperties = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.getObjectProperties;
            String str2 = ((Data) obj).getObjectProperties;
            return str == null ? str2 == null : str.equals(str2);
        }

        public String getObjectProperties() {
            return this.getObjectProperties;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.getObjectProperties;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetObjectPropertiesQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.getObjectProperties);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getObjectProperties=" + this.getObjectProperties + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final QueryGetObjectPropertiesBodyInput body;
        private final QueryGetObjectPropertiesQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryGetObjectPropertiesQueryInput queryGetObjectPropertiesQueryInput, QueryGetObjectPropertiesBodyInput queryGetObjectPropertiesBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = queryGetObjectPropertiesQueryInput;
            this.body = queryGetObjectPropertiesBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, queryGetObjectPropertiesQueryInput);
            linkedHashMap.put("body", queryGetObjectPropertiesBodyInput);
        }

        public QueryGetObjectPropertiesBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetObjectPropertiesQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public QueryGetObjectPropertiesQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetObjectPropertiesQuery(QueryGetObjectPropertiesQueryInput queryGetObjectPropertiesQueryInput, QueryGetObjectPropertiesBodyInput queryGetObjectPropertiesBodyInput) {
        this.variables = new Variables(queryGetObjectPropertiesQueryInput, queryGetObjectPropertiesBodyInput);
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
        return "8a017a1db611451094d8490fedf9a0c04e8709df84fca05ce1b466446360184a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetObjectProperties($query: QueryGetObjectPropertiesQueryInput, $body: QueryGetObjectPropertiesBodyInput) {\n  getObjectProperties(query: $query, body: $body)\n}";
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
