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
import type.CustomType;
import type.DeleteBotActionMappingInput;
import type.ModelBotActionMappingConditionInput;

/* loaded from: classes6.dex */
public final class DeleteBotActionMappingMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteBotActionMapping($input: DeleteBotActionMappingInput!, $condition: ModelBotActionMappingConditionInput) {\n  deleteBotActionMapping(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteBotActionMappingMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteBotActionMapping";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteBotActionMapping($input: DeleteBotActionMappingInput!, $condition: ModelBotActionMappingConditionInput) {\n  deleteBotActionMapping(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelBotActionMappingConditionInput condition;
        private DeleteBotActionMappingInput input;

        public DeleteBotActionMappingMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteBotActionMappingMutation(this.input, this.condition);
        }

        public Builder condition(ModelBotActionMappingConditionInput modelBotActionMappingConditionInput) {
            this.condition = modelBotActionMappingConditionInput;
            return this;
        }

        public Builder input(DeleteBotActionMappingInput deleteBotActionMappingInput) {
            this.input = deleteBotActionMappingInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteBotActionMapping", "deleteBotActionMapping", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteBotActionMapping deleteBotActionMapping;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteBotActionMapping.Mapper deleteBotActionMappingFieldMapper = new DeleteBotActionMapping.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteBotActionMapping) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteBotActionMapping>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteBotActionMappingMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteBotActionMapping read(ResponseReader responseReader2) {
                        return Mapper.this.deleteBotActionMappingFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteBotActionMapping deleteBotActionMapping) {
            this.deleteBotActionMapping = deleteBotActionMapping;
        }

        public DeleteBotActionMapping deleteBotActionMapping() {
            return this.deleteBotActionMapping;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteBotActionMapping deleteBotActionMapping = this.deleteBotActionMapping;
            DeleteBotActionMapping deleteBotActionMapping2 = ((Data) obj).deleteBotActionMapping;
            return deleteBotActionMapping == null ? deleteBotActionMapping2 == null : deleteBotActionMapping.equals(deleteBotActionMapping2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteBotActionMapping deleteBotActionMapping = this.deleteBotActionMapping;
                this.$hashCode = (deleteBotActionMapping == null ? 0 : deleteBotActionMapping.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteBotActionMappingMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteBotActionMapping deleteBotActionMapping = Data.this.deleteBotActionMapping;
                    responseWriter.writeObject(responseField, deleteBotActionMapping != null ? deleteBotActionMapping.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteBotActionMapping=" + this.deleteBotActionMapping + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteBotActionMapping {
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

        public static final class Mapper implements ResponseFieldMapper<DeleteBotActionMapping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteBotActionMapping map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteBotActionMapping.$responseFields;
                return new DeleteBotActionMapping(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("botId", "botId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("context", "context", null, true, Collections.emptyList()), ResponseField.forBoolean("isPaused", "isPaused", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public DeleteBotActionMapping(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8) {
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
            if (!(obj instanceof DeleteBotActionMapping)) {
                return false;
            }
            DeleteBotActionMapping deleteBotActionMapping = (DeleteBotActionMapping) obj;
            if (this.__typename.equals(deleteBotActionMapping.__typename) && this.id.equals(deleteBotActionMapping.id) && this.accountId.equals(deleteBotActionMapping.accountId) && this.botId.equals(deleteBotActionMapping.botId) && this.actionId.equals(deleteBotActionMapping.actionId) && ((str = this.context) != null ? str.equals(deleteBotActionMapping.context) : deleteBotActionMapping.context == null) && ((bool = this.isPaused) != null ? bool.equals(deleteBotActionMapping.isPaused) : deleteBotActionMapping.isPaused == null) && ((str2 = this.createdAt) != null ? str2.equals(deleteBotActionMapping.createdAt) : deleteBotActionMapping.createdAt == null)) {
                String str3 = this.updatedAt;
                String str4 = deleteBotActionMapping.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteBotActionMappingMutation.DeleteBotActionMapping.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteBotActionMapping.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteBotActionMapping.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteBotActionMapping.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteBotActionMapping.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], DeleteBotActionMapping.this.botId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], DeleteBotActionMapping.this.actionId);
                    responseWriter.writeString(responseFieldArr[5], DeleteBotActionMapping.this.context);
                    responseWriter.writeBoolean(responseFieldArr[6], DeleteBotActionMapping.this.isPaused);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteBotActionMapping.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], DeleteBotActionMapping.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteBotActionMapping{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", botId=" + this.botId + ", actionId=" + this.actionId + ", context=" + this.context + ", isPaused=" + this.isPaused + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelBotActionMappingConditionInput condition;
        private final DeleteBotActionMappingInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteBotActionMappingInput deleteBotActionMappingInput, ModelBotActionMappingConditionInput modelBotActionMappingConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteBotActionMappingInput;
            this.condition = modelBotActionMappingConditionInput;
            linkedHashMap.put("input", deleteBotActionMappingInput);
            linkedHashMap.put("condition", modelBotActionMappingConditionInput);
        }

        public ModelBotActionMappingConditionInput condition() {
            return this.condition;
        }

        public DeleteBotActionMappingInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteBotActionMappingMutation.Variables.1
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

    public DeleteBotActionMappingMutation(DeleteBotActionMappingInput deleteBotActionMappingInput, ModelBotActionMappingConditionInput modelBotActionMappingConditionInput) {
        Utils.checkNotNull(deleteBotActionMappingInput, "input == null");
        this.variables = new Variables(deleteBotActionMappingInput, modelBotActionMappingConditionInput);
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
        return "9b9365bd62a78a63c406028f9a2b00254e76993b864ab1ed3eeb743d80aef472";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteBotActionMapping($input: DeleteBotActionMappingInput!, $condition: ModelBotActionMappingConditionInput) {\n  deleteBotActionMapping(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    botId\n    actionId\n    context\n    isPaused\n    createdAt\n    updatedAt\n  }\n}";
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
