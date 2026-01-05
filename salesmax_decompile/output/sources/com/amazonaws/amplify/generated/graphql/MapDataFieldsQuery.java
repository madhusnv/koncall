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

/* loaded from: classes4.dex */
public final class MapDataFieldsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query MapDataFields($input: AWSJSON, $objectModel: AWSJSON, $accountId: ID, $userId: ID) {\n  mapDataFields(input: $input, objectModel: $objectModel, accountId: $accountId, userId: $userId)\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.MapDataFieldsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "MapDataFields";
        }
    };
    public static final String QUERY_DOCUMENT = "query MapDataFields($input: AWSJSON, $objectModel: AWSJSON, $accountId: ID, $userId: ID) {\n  mapDataFields(input: $input, objectModel: $objectModel, accountId: $accountId, userId: $userId)\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private String input;
        private String objectModel;
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public MapDataFieldsQuery build() {
            return new MapDataFieldsQuery(this.input, this.objectModel, this.accountId, this.userId);
        }

        public Builder input(String str) {
            this.input = str;
            return this;
        }

        public Builder objectModel(String str) {
            this.objectModel = str;
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forCustomType("mapDataFields", "mapDataFields", new UnmodifiableMapBuilder(4).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("objectModel", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "objectModel").build()).put("userId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "userId").build()).build(), true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String mapDataFields;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((String) responseReader.readCustomType((ResponseField.CustomTypeField) Data.$responseFields[0]));
            }
        }

        public Data(String str) {
            this.mapDataFields = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            String str = this.mapDataFields;
            String str2 = ((Data) obj).mapDataFields;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                String str = this.mapDataFields;
                this.$hashCode = (str == null ? 0 : str.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String mapDataFields() {
            return this.mapDataFields;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.MapDataFieldsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeCustom((ResponseField.CustomTypeField) Data.$responseFields[0], Data.this.mapDataFields);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{mapDataFields=" + this.mapDataFields + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final String input;
        private final String objectModel;
        private final String userId;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, String str2, String str3, String str4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = str;
            this.objectModel = str2;
            this.accountId = str3;
            this.userId = str4;
            linkedHashMap.put("input", str);
            linkedHashMap.put("objectModel", str2);
            linkedHashMap.put("accountId", str3);
            linkedHashMap.put("userId", str4);
        }

        public String accountId() {
            return this.accountId;
        }

        public String input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.MapDataFieldsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("input", Variables.this.input);
                    inputFieldWriter.writeString("objectModel", Variables.this.objectModel);
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeString("userId", Variables.this.userId);
                }
            };
        }

        public String objectModel() {
            return this.objectModel;
        }

        public String userId() {
            return this.userId;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public MapDataFieldsQuery(String str, String str2, String str3, String str4) {
        this.variables = new Variables(str, str2, str3, str4);
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
        return "74f94e843669fd2d4f0c1dfebf1d481a90109434f91db65294443386f3a9796d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query MapDataFields($input: AWSJSON, $objectModel: AWSJSON, $accountId: ID, $userId: ID) {\n  mapDataFields(input: $input, objectModel: $objectModel, accountId: $accountId, userId: $userId)\n}";
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
