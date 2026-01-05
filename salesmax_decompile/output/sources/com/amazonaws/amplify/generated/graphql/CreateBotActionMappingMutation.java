package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
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
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CreateBotActionMappingInput;
import type.CustomType;
import type.ModelBotActionMappingConditionInput;

/* loaded from: classes3.dex */
public final class CreateBotActionMappingMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateBotActionMapping($input: CreateBotActionMappingInput!, $condition: ModelBotActionMappingConditionInput) {\n  createBotActionMapping(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMappingMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateBotActionMapping";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateBotActionMapping($input: CreateBotActionMappingInput!, $condition: ModelBotActionMappingConditionInput) {\n  createBotActionMapping(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelBotActionMappingConditionInput condition;
        private CreateBotActionMappingInput input;

        public CreateBotActionMappingMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateBotActionMappingMutation(this.input, this.condition);
        }

        public Builder condition(ModelBotActionMappingConditionInput modelBotActionMappingConditionInput) {
            this.condition = modelBotActionMappingConditionInput;
            return this;
        }

        public Builder input(CreateBotActionMappingInput createBotActionMappingInput) {
            this.input = createBotActionMappingInput;
            return this;
        }
    }

    public static class CreateBotActionMapping {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String actionId;
        final String botId;
        final String context;
        final String createdAt;
        final String id;
        final Boolean isPaused;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<CreateBotActionMapping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateBotActionMapping map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateBotActionMapping.$responseFields;
                return new CreateBotActionMapping(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("botId", "botId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("context", "context", null, true, Collections.emptyList()), ResponseField.forBoolean("isPaused", "isPaused", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public CreateBotActionMapping(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.botId = (String) Utils.checkNotNull(str4, "botId == null");
            this.actionId = (String) Utils.checkNotNull(str5, "actionId == null");
            this.context = str6;
            this.isPaused = bool;
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String actionId() {
            return this.actionId;
        }

        public String botId() {
            return this.botId;
        }

        public String context() {
            return this.context;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateBotActionMapping)) {
                return false;
            }
            CreateBotActionMapping createBotActionMapping = (CreateBotActionMapping) obj;
            if (this.__typename.equals(createBotActionMapping.__typename) && this.id.equals(createBotActionMapping.id) && this.accountId.equals(createBotActionMapping.accountId) && this.botId.equals(createBotActionMapping.botId) && this.actionId.equals(createBotActionMapping.actionId) && ((str = this.context) != null ? str.equals(createBotActionMapping.context) : createBotActionMapping.context == null) && ((bool = this.isPaused) != null ? bool.equals(createBotActionMapping.isPaused) : createBotActionMapping.isPaused == null) && ((str2 = this.createdAt) != null ? str2.equals(createBotActionMapping.createdAt) : createBotActionMapping.createdAt == null)) {
                String str3 = this.updatedAt;
                String str4 = createBotActionMapping.updatedAt;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.botId.hashCode()) * 1000003) ^ this.actionId.hashCode()) * 1000003;
                String str = this.context;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.isPaused;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.createdAt;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                this.$hashCode = iHashCode4 ^ (str3 != null ? str3.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isPaused() {
            return this.isPaused;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMappingMutation.CreateBotActionMapping.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateBotActionMapping.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateBotActionMapping.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateBotActionMapping.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateBotActionMapping.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateBotActionMapping.this.botId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], CreateBotActionMapping.this.actionId);
                    responseWriter.writeString(responseFieldArr[5], CreateBotActionMapping.this.context);
                    responseWriter.writeBoolean(responseFieldArr[6], CreateBotActionMapping.this.isPaused);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreateBotActionMapping.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], CreateBotActionMapping.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateBotActionMapping{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", botId=" + this.botId + ", actionId=" + this.actionId + ", context=" + this.context + ", isPaused=" + this.isPaused + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createBotActionMapping", "createBotActionMapping", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateBotActionMapping createBotActionMapping;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateBotActionMapping.Mapper createBotActionMappingFieldMapper = new CreateBotActionMapping.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateBotActionMapping) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateBotActionMapping>() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMappingMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateBotActionMapping read(ResponseReader responseReader2) {
                        return Mapper.this.createBotActionMappingFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateBotActionMapping createBotActionMapping) {
            this.createBotActionMapping = createBotActionMapping;
        }

        public CreateBotActionMapping createBotActionMapping() {
            return this.createBotActionMapping;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateBotActionMapping createBotActionMapping = this.createBotActionMapping;
            CreateBotActionMapping createBotActionMapping2 = ((Data) obj).createBotActionMapping;
            return createBotActionMapping == null ? createBotActionMapping2 == null : createBotActionMapping.equals(createBotActionMapping2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateBotActionMapping createBotActionMapping = this.createBotActionMapping;
                this.$hashCode = (createBotActionMapping == null ? 0 : createBotActionMapping.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMappingMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateBotActionMapping createBotActionMapping = Data.this.createBotActionMapping;
                    responseWriter.writeObject(responseField, createBotActionMapping != null ? createBotActionMapping.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createBotActionMapping=" + this.createBotActionMapping + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelBotActionMappingConditionInput condition;
        private final CreateBotActionMappingInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateBotActionMappingInput createBotActionMappingInput, ModelBotActionMappingConditionInput modelBotActionMappingConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createBotActionMappingInput;
            this.condition = modelBotActionMappingConditionInput;
            linkedHashMap.put("input", createBotActionMappingInput);
            linkedHashMap.put("condition", modelBotActionMappingConditionInput);
        }

        public ModelBotActionMappingConditionInput condition() {
            return this.condition;
        }

        public CreateBotActionMappingInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateBotActionMappingMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public CreateBotActionMappingMutation(CreateBotActionMappingInput createBotActionMappingInput, ModelBotActionMappingConditionInput modelBotActionMappingConditionInput) {
        Utils.checkNotNull(createBotActionMappingInput, "input == null");
        this.variables = new Variables(createBotActionMappingInput, modelBotActionMappingConditionInput);
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
        return "48eb8feb45dbc7d663edbcb5f3dcdbdce67ff174ed56a385c53719538353d6d8";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateBotActionMapping($input: CreateBotActionMappingInput!, $condition: ModelBotActionMappingConditionInput) {\n  createBotActionMapping(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
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
