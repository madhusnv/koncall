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
import type.MutationPaymentActionBodyInput;
import type.MutationPaymentActionQueryInput;

/* loaded from: classes4.dex */
public final class PaymentActionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation PaymentAction($query: MutationPaymentActionQueryInput, $body: MutationPaymentActionBodyInput) {\n  paymentAction(query: $query, body: $body)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.PaymentActionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "PaymentAction";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation PaymentAction($query: MutationPaymentActionQueryInput, $body: MutationPaymentActionBodyInput) {\n  paymentAction(query: $query, body: $body)\n}";
    private final Variables variables;

    public static final class Builder {
        private MutationPaymentActionBodyInput body;
        private MutationPaymentActionQueryInput query;

        public Builder body(MutationPaymentActionBodyInput mutationPaymentActionBodyInput) {
            this.body = mutationPaymentActionBodyInput;
            return this;
        }

        public PaymentActionMutation build() {
            return new PaymentActionMutation(this.query, this.body);
        }

        public Builder query(MutationPaymentActionQueryInput mutationPaymentActionQueryInput) {
            this.query = mutationPaymentActionQueryInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("paymentAction", "paymentAction", new UnmodifiableMapBuilder(2).put(SearchIntents.EXTRA_QUERY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, SearchIntents.EXTRA_QUERY).build()).put("body", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "body").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String paymentAction;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.paymentAction = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.paymentAction;
            String str2 = ((Data) obj).paymentAction;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.paymentAction;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.PaymentActionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.paymentAction);
                }
            };
        }

        public String paymentAction() {
            return this.paymentAction;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{paymentAction=" + this.paymentAction + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final MutationPaymentActionBodyInput body;
        private final MutationPaymentActionQueryInput query;
        private final transient Map<String, Object> valueMap;

        public Variables(MutationPaymentActionQueryInput mutationPaymentActionQueryInput, MutationPaymentActionBodyInput mutationPaymentActionBodyInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.query = mutationPaymentActionQueryInput;
            this.body = mutationPaymentActionBodyInput;
            linkedHashMap.put(SearchIntents.EXTRA_QUERY, mutationPaymentActionQueryInput);
            linkedHashMap.put("body", mutationPaymentActionBodyInput);
        }

        public MutationPaymentActionBodyInput body() {
            return this.body;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.PaymentActionMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject(SearchIntents.EXTRA_QUERY, Variables.this.query != null ? Variables.this.query.marshaller() : null);
                    inputFieldWriter.writeObject("body", Variables.this.body != null ? Variables.this.body.marshaller() : null);
                }
            };
        }

        public MutationPaymentActionQueryInput query() {
            return this.query;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public PaymentActionMutation(MutationPaymentActionQueryInput mutationPaymentActionQueryInput, MutationPaymentActionBodyInput mutationPaymentActionBodyInput) {
        this.variables = new Variables(mutationPaymentActionQueryInput, mutationPaymentActionBodyInput);
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
        return "21023929da4fc57bb92af7ba71b2b6d7f989f4b6ea19caab0015bb0fa0fa63ca";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation PaymentAction($query: MutationPaymentActionQueryInput, $body: MutationPaymentActionBodyInput) {\n  paymentAction(query: $query, body: $body)\n}";
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
