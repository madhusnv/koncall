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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.PropertyMapInput;

/* loaded from: classes7.dex */
public final class EnrichPropertiesQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query EnrichProperties($input: propertyMapInput) {\n  enrichProperties(input: $input)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.EnrichPropertiesQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "EnrichProperties";
        }
    };
    public static final String QUERY_DOCUMENT = "query EnrichProperties($input: propertyMapInput) {\n  enrichProperties(input: $input)\n}";
    private final Variables variables;

    public static final class Builder {
        private PropertyMapInput input;

        public EnrichPropertiesQuery build() {
            return new EnrichPropertiesQuery(this.input);
        }

        public Builder input(PropertyMapInput propertyMapInput) {
            this.input = propertyMapInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("enrichProperties", "enrichProperties", new UnmodifiableMapBuilder(1).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String enrichProperties;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.enrichProperties = str;
        }

        public String enrichProperties() {
            return this.enrichProperties;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.enrichProperties;
            String str2 = ((Data) obj).enrichProperties;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.enrichProperties;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.EnrichPropertiesQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.enrichProperties);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{enrichProperties=" + this.enrichProperties + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final PropertyMapInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(PropertyMapInput propertyMapInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = propertyMapInput;
            linkedHashMap.put("input", propertyMapInput);
        }

        public PropertyMapInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.EnrichPropertiesQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input != null ? Variables.this.input.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public EnrichPropertiesQuery(PropertyMapInput propertyMapInput) {
        this.variables = new Variables(propertyMapInput);
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
        return "df971d61e1ad20aa80420fd7e0bc6604bbde57e12ef7bcd753915a5915745e54";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query EnrichProperties($input: propertyMapInput) {\n  enrichProperties(input: $input)\n}";
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
