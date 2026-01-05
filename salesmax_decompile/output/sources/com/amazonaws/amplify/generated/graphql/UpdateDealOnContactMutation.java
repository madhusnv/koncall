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
import type.MutationUpdateDealOnContactBodyInput;
import type.MutationUpdateDealOnContactQueryInput;

/* loaded from: classes4.dex */
public final class UpdateDealOnContactMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateDealOnContact($query: MutationUpdateDealOnContactQueryInput, $body: MutationUpdateDealOnContactBodyInput) {\n  updateDealOnContact(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealOnContactMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateDealOnContact";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateDealOnContact($query: MutationUpdateDealOnContactQueryInput, $body: MutationUpdateDealOnContactBodyInput) {\n  updateDealOnContact(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private MutationUpdateDealOnContactBodyInput body;
        private MutationUpdateDealOnContactQueryInput query;

        public Builder body(MutationUpdateDealOnContactBodyInput mutationUpdateDealOnContactBodyInput) {
            this.body = mutationUpdateDealOnContactBodyInput;
            return this;
        }

        public UpdateDealOnContactMutation build() {
            return new UpdateDealOnContactMutation(this.query, this.body);
        }

        public Builder query(MutationUpdateDealOnContactQueryInput mutationUpdateDealOnContactQueryInput) {
            this.query = mutationUpdateDealOnContactQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("updateDealOnContact", "updateDealOnContact", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String updateDealOnContact;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.updateDealOnContact = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.updateDealOnContact;
            String str2 = ((Data) obj).updateDealOnContact;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.updateDealOnContact;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealOnContactMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.updateDealOnContact);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateDealOnContact=" + this.updateDealOnContact + "}";
            }
            return this.$toString;
        }

        public String updateDealOnContact() {
            return this.updateDealOnContact;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final MutationUpdateDealOnContactBodyInput body;
        private final MutationUpdateDealOnContactQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(MutationUpdateDealOnContactQueryInput mutationUpdateDealOnContactQueryInput, MutationUpdateDealOnContactBodyInput mutationUpdateDealOnContactBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = mutationUpdateDealOnContactQueryInput;
            this.body = mutationUpdateDealOnContactBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, mutationUpdateDealOnContactQueryInput);
            linkedHashMap.put("body", mutationUpdateDealOnContactBodyInput);
        }

        public MutationUpdateDealOnContactBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateDealOnContactMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public MutationUpdateDealOnContactQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public UpdateDealOnContactMutation(MutationUpdateDealOnContactQueryInput mutationUpdateDealOnContactQueryInput, MutationUpdateDealOnContactBodyInput mutationUpdateDealOnContactBodyInput) {
        this.variables = new Variables(mutationUpdateDealOnContactQueryInput, mutationUpdateDealOnContactBodyInput);
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
        return "d7892df24bdb15ac529b4bc380a419ddde2a72317cd03fd0143a6d49f8e41016";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateDealOnContact($query: MutationUpdateDealOnContactQueryInput, $body: MutationUpdateDealOnContactBodyInput) {\n  updateDealOnContact(query: $query, body: $body)\n}";
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
