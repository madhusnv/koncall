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
import type.MutationIntegrationActionsBodyInput;
import type.MutationIntegrationActionsQueryInput;

/* loaded from: classes8.dex */
public final class IntegrationActionsMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation IntegrationActions($query: MutationIntegrationActionsQueryInput, $body: MutationIntegrationActionsBodyInput) {\n  integrationActions(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.IntegrationActionsMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "IntegrationActions";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation IntegrationActions($query: MutationIntegrationActionsQueryInput, $body: MutationIntegrationActionsBodyInput) {\n  integrationActions(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private MutationIntegrationActionsBodyInput body;
        private MutationIntegrationActionsQueryInput query;

        public Builder body(MutationIntegrationActionsBodyInput mutationIntegrationActionsBodyInput) {
            this.body = mutationIntegrationActionsBodyInput;
            return this;
        }

        public IntegrationActionsMutation build() {
            return new IntegrationActionsMutation(this.query, this.body);
        }

        public Builder query(MutationIntegrationActionsQueryInput mutationIntegrationActionsQueryInput) {
            this.query = mutationIntegrationActionsQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("integrationActions", "integrationActions", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String integrationActions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.integrationActions = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.integrationActions;
            String str2 = ((Data) obj).integrationActions;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.integrationActions;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String integrationActions() {
            return this.integrationActions;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.IntegrationActionsMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.integrationActions);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{integrationActions=" + this.integrationActions + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final MutationIntegrationActionsBodyInput body;
        private final MutationIntegrationActionsQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(MutationIntegrationActionsQueryInput mutationIntegrationActionsQueryInput, MutationIntegrationActionsBodyInput mutationIntegrationActionsBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = mutationIntegrationActionsQueryInput;
            this.body = mutationIntegrationActionsBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, mutationIntegrationActionsQueryInput);
            linkedHashMap.put("body", mutationIntegrationActionsBodyInput);
        }

        public MutationIntegrationActionsBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.IntegrationActionsMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public MutationIntegrationActionsQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public IntegrationActionsMutation(MutationIntegrationActionsQueryInput mutationIntegrationActionsQueryInput, MutationIntegrationActionsBodyInput mutationIntegrationActionsBodyInput) {
        this.variables = new Variables(mutationIntegrationActionsQueryInput, mutationIntegrationActionsBodyInput);
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
        return "1bd3dce29f92b971de24e675f91d162e5c89302fff0371bb013511d93c133fca";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation IntegrationActions($query: MutationIntegrationActionsQueryInput, $body: MutationIntegrationActionsBodyInput) {\n  integrationActions(query: $query, body: $body)\n}";
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
