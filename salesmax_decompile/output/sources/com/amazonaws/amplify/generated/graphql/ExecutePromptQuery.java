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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;

/* loaded from: classes7.dex */
public final class ExecutePromptQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ExecutePrompt($actionName: String!, $prompt: String!, $additionalSystemPrompt: String) {\n  executePrompt(actionName: $actionName, prompt: $prompt, additionalSystemPrompt: $additionalSystemPrompt)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ExecutePromptQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ExecutePrompt";
        }
    };
    public static final String QUERY_DOCUMENT = "query ExecutePrompt($actionName: String!, $prompt: String!, $additionalSystemPrompt: String) {\n  executePrompt(actionName: $actionName, prompt: $prompt, additionalSystemPrompt: $additionalSystemPrompt)\n}";
    private final Variables variables;

    public static final class Builder {
        private String actionName;
        private String additionalSystemPrompt;
        private String prompt;

        public Builder actionName(String str) {
            this.actionName = str;
            return this;
        }

        public Builder additionalSystemPrompt(String str) {
            this.additionalSystemPrompt = str;
            return this;
        }

        public ExecutePromptQuery build() {
            Utils.checkNotNull(this.actionName, "actionName == null");
            Utils.checkNotNull(this.prompt, "prompt == null");
            return new ExecutePromptQuery(this.actionName, this.prompt, this.additionalSystemPrompt);
        }

        public Builder prompt(String str) {
            this.prompt = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("executePrompt", "executePrompt", new UnmodifiableMapBuilder(3).put("additionalSystemPrompt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "additionalSystemPrompt").build()).put("prompt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "prompt").build()).put("actionName", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "actionName").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String executePrompt;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.executePrompt = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.executePrompt;
            String str2 = ((Data) obj).executePrompt;
            return str == null ? str2 == null : str.equals(str2);
        }

        public String executePrompt() {
            return this.executePrompt;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.executePrompt;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ExecutePromptQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.executePrompt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{executePrompt=" + this.executePrompt + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String actionName;
        private final String additionalSystemPrompt;
        private final String prompt;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2, String str3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.actionName = str;
            this.prompt = str2;
            this.additionalSystemPrompt = str3;
            linkedHashMap.put("actionName", str);
            linkedHashMap.put("prompt", str2);
            linkedHashMap.put("additionalSystemPrompt", str3);
        }

        public String actionName() {
            return this.actionName;
        }

        public String additionalSystemPrompt() {
            return this.additionalSystemPrompt;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ExecutePromptQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("actionName", Variables.this.actionName);
                    inputFieldWriter.writeString("prompt", Variables.this.prompt);
                    inputFieldWriter.writeString("additionalSystemPrompt", Variables.this.additionalSystemPrompt);
                }
            };
        }

        public String prompt() {
            return this.prompt;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ExecutePromptQuery(String str, String str2, String str3) {
        Utils.checkNotNull(str, "actionName == null");
        Utils.checkNotNull(str2, "prompt == null");
        this.variables = new Variables(str, str2, str3);
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
        return "df02bf272d0211c233a6f88c4f7aad8eaa61e9a30190480b680cea1f87ae3928";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ExecutePrompt($actionName: String!, $prompt: String!, $additionalSystemPrompt: String) {\n  executePrompt(actionName: $actionName, prompt: $prompt, additionalSystemPrompt: $additionalSystemPrompt)\n}";
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
