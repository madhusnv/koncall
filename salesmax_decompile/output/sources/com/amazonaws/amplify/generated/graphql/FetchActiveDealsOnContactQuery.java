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
import com.google.android.gms.actions.SearchIntents;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.QueryFetchActiveDealsOnContactQueryInput;

/* loaded from: classes7.dex */
public final class FetchActiveDealsOnContactQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query FetchActiveDealsOnContact($query: QueryFetchActiveDealsOnContactQueryInput!) {\n  fetchActiveDealsOnContact(query: $query)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.FetchActiveDealsOnContactQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "FetchActiveDealsOnContact";
        }
    };
    public static final String QUERY_DOCUMENT = "query FetchActiveDealsOnContact($query: QueryFetchActiveDealsOnContactQueryInput!) {\n  fetchActiveDealsOnContact(query: $query)\n}";
    private final Variables variables;

    public static final class Builder {
        private QueryFetchActiveDealsOnContactQueryInput query;

        public FetchActiveDealsOnContactQuery build() {
            Utils.checkNotNull(this.query, "query == null");
            return new FetchActiveDealsOnContactQuery(this.query);
        }

        public Builder query(QueryFetchActiveDealsOnContactQueryInput queryFetchActiveDealsOnContactQueryInput) {
            this.query = queryFetchActiveDealsOnContactQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("fetchActiveDealsOnContact", "fetchActiveDealsOnContact", new UnmodifiableMapBuilder(1).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final List<String> fetchActiveDealsOnContact;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.FetchActiveDealsOnContactQuery.Data.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }));
            }
        }

        public Data(List<String> list) {
            this.fetchActiveDealsOnContact = list;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            List<String> list = this.fetchActiveDealsOnContact;
            List<String> list2 = ((Data) obj).fetchActiveDealsOnContact;
            return list == null ? list2 == null : list.equals(list2);
        }

        public List<String> fetchActiveDealsOnContact() {
            return this.fetchActiveDealsOnContact;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                List<String> list = this.fetchActiveDealsOnContact;
                this.$hashCode = (list == null ? 0 : list.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchActiveDealsOnContactQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.fetchActiveDealsOnContact, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.FetchActiveDealsOnContactQuery.Data.1.1
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
                this.$toString = "Data{fetchActiveDealsOnContact=" + this.fetchActiveDealsOnContact + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final QueryFetchActiveDealsOnContactQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(QueryFetchActiveDealsOnContactQueryInput queryFetchActiveDealsOnContactQueryInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = queryFetchActiveDealsOnContactQueryInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, queryFetchActiveDealsOnContactQueryInput);
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.FetchActiveDealsOnContactQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query.marshaller());
                }
            };
        }

        public QueryFetchActiveDealsOnContactQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public FetchActiveDealsOnContactQuery(QueryFetchActiveDealsOnContactQueryInput queryFetchActiveDealsOnContactQueryInput) {
        Utils.checkNotNull(queryFetchActiveDealsOnContactQueryInput, "query == null");
        this.variables = new Variables(queryFetchActiveDealsOnContactQueryInput);
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
        return "96a7b5ff42ac14aa3b8144da8b98616c85df807f818ac179c726430772c91b32";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query FetchActiveDealsOnContact($query: QueryFetchActiveDealsOnContactQueryInput!) {\n  fetchActiveDealsOnContact(query: $query)\n}";
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
