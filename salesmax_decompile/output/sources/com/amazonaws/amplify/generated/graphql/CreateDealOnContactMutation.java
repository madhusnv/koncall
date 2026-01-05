package com.amazonaws.amplify.generated.graphql;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
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
import type.MutationCreateDealOnContactBodyInput;
import type.MutationCreateDealOnContactQueryInput;

/* loaded from: classes6.dex */
public final class CreateDealOnContactMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateDealOnContact($query: MutationCreateDealOnContactQueryInput, $body: MutationCreateDealOnContactBodyInput) {\n  createDealOnContact(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateDealOnContactMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateDealOnContact";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateDealOnContact($query: MutationCreateDealOnContactQueryInput, $body: MutationCreateDealOnContactBodyInput) {\n  createDealOnContact(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private MutationCreateDealOnContactBodyInput body;
        private MutationCreateDealOnContactQueryInput query;

        public Builder body(MutationCreateDealOnContactBodyInput mutationCreateDealOnContactBodyInput) {
            this.body = mutationCreateDealOnContactBodyInput;
            return this;
        }

        public CreateDealOnContactMutation build() {
            return new CreateDealOnContactMutation(this.query, this.body);
        }

        public Builder query(MutationCreateDealOnContactQueryInput mutationCreateDealOnContactQueryInput) {
            this.query = mutationCreateDealOnContactQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("createDealOnContact", "createDealOnContact", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String createDealOnContact;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.createDealOnContact = str;
        }

        public String createDealOnContact() {
            return this.createDealOnContact;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.createDealOnContact;
            String str2 = ((Data) obj).createDealOnContact;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.createDealOnContact;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateDealOnContactMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.createDealOnContact);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createDealOnContact=" + this.createDealOnContact + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final MutationCreateDealOnContactBodyInput body;
        private final MutationCreateDealOnContactQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(MutationCreateDealOnContactQueryInput mutationCreateDealOnContactQueryInput, MutationCreateDealOnContactBodyInput mutationCreateDealOnContactBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = mutationCreateDealOnContactQueryInput;
            this.body = mutationCreateDealOnContactBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, mutationCreateDealOnContactQueryInput);
            linkedHashMap.put("body", mutationCreateDealOnContactBodyInput);
        }

        public MutationCreateDealOnContactBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateDealOnContactMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public MutationCreateDealOnContactQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public CreateDealOnContactMutation(MutationCreateDealOnContactQueryInput mutationCreateDealOnContactQueryInput, MutationCreateDealOnContactBodyInput mutationCreateDealOnContactBodyInput) {
        this.variables = new Variables(mutationCreateDealOnContactQueryInput, mutationCreateDealOnContactBodyInput);
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
        return "c306a3183e79dbba925d5654f64dd7d05da5485330014470d3ea2cf61a8c8f65";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateDealOnContact($query: MutationCreateDealOnContactQueryInput, $body: MutationCreateDealOnContactBodyInput) {\n  createDealOnContact(query: $query, body: $body)\n}";
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
