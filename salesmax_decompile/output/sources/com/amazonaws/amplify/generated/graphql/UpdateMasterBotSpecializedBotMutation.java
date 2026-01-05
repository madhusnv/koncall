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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.ModelMasterBotSpecializedBotConditionInput;
import type.UpdateMasterBotSpecializedBotInput;

/* loaded from: classes4.dex */
public final class UpdateMasterBotSpecializedBotMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateMasterBotSpecializedBot($input: UpdateMasterBotSpecializedBotInput!, $condition: ModelMasterBotSpecializedBotConditionInput) {\n  updateMasterBotSpecializedBot(input: $input, condition: $condition) {\n    __typename\n    id\n    masterBotId\n    specializedBotId\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMasterBotSpecializedBotMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateMasterBotSpecializedBot";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateMasterBotSpecializedBot($input: UpdateMasterBotSpecializedBotInput!, $condition: ModelMasterBotSpecializedBotConditionInput) {\n  updateMasterBotSpecializedBot(input: $input, condition: $condition) {\n    __typename\n    id\n    masterBotId\n    specializedBotId\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelMasterBotSpecializedBotConditionInput condition;
        private UpdateMasterBotSpecializedBotInput input;

        public UpdateMasterBotSpecializedBotMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateMasterBotSpecializedBotMutation(this.input, this.condition);
        }

        public Builder condition(ModelMasterBotSpecializedBotConditionInput modelMasterBotSpecializedBotConditionInput) {
            this.condition = modelMasterBotSpecializedBotConditionInput;
            return this;
        }

        public Builder input(UpdateMasterBotSpecializedBotInput updateMasterBotSpecializedBotInput) {
            this.input = updateMasterBotSpecializedBotInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateMasterBotSpecializedBot", "updateMasterBotSpecializedBot", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateMasterBotSpecializedBot.Mapper updateMasterBotSpecializedBotFieldMapper = new UpdateMasterBotSpecializedBot.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateMasterBotSpecializedBot) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateMasterBotSpecializedBot>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMasterBotSpecializedBotMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateMasterBotSpecializedBot read(ResponseReader responseReader2) {
                        return Mapper.this.updateMasterBotSpecializedBotFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot) {
            this.updateMasterBotSpecializedBot = updateMasterBotSpecializedBot;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot = this.updateMasterBotSpecializedBot;
            UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot2 = ((Data) obj).updateMasterBotSpecializedBot;
            return updateMasterBotSpecializedBot == null ? updateMasterBotSpecializedBot2 == null : updateMasterBotSpecializedBot.equals(updateMasterBotSpecializedBot2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot = this.updateMasterBotSpecializedBot;
                this.$hashCode = (updateMasterBotSpecializedBot == null ? 0 : updateMasterBotSpecializedBot.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMasterBotSpecializedBotMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot = Data.this.updateMasterBotSpecializedBot;
                    responseWriter.writeObject(responseField, updateMasterBotSpecializedBot != null ? updateMasterBotSpecializedBot.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateMasterBotSpecializedBot=" + this.updateMasterBotSpecializedBot + "}";
            }
            return this.$toString;
        }

        public UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot() {
            return this.updateMasterBotSpecializedBot;
        }
    }

    public static class UpdateMasterBotSpecializedBot {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String createdAt;
        final String id;
        final String masterBotId;
        final String specializedBotId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateMasterBotSpecializedBot> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateMasterBotSpecializedBot map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateMasterBotSpecializedBot.$responseFields;
                return new UpdateMasterBotSpecializedBot(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("masterBotId", "masterBotId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("specializedBotId", "specializedBotId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public UpdateMasterBotSpecializedBot(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.masterBotId = (String) Utils.checkNotNull(str3, "masterBotId == null");
            this.specializedBotId = (String) Utils.checkNotNull(str4, "specializedBotId == null");
            this.createdAt = (String) Utils.checkNotNull(str5, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str6, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateMasterBotSpecializedBot)) {
                return false;
            }
            UpdateMasterBotSpecializedBot updateMasterBotSpecializedBot = (UpdateMasterBotSpecializedBot) obj;
            return this.__typename.equals(updateMasterBotSpecializedBot.__typename) && this.id.equals(updateMasterBotSpecializedBot.id) && this.masterBotId.equals(updateMasterBotSpecializedBot.masterBotId) && this.specializedBotId.equals(updateMasterBotSpecializedBot.specializedBotId) && this.createdAt.equals(updateMasterBotSpecializedBot.createdAt) && this.updatedAt.equals(updateMasterBotSpecializedBot.updatedAt);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                this.$hashCode = ((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.masterBotId.hashCode()) * 1000003) ^ this.specializedBotId.hashCode()) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMasterBotSpecializedBotMutation.UpdateMasterBotSpecializedBot.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateMasterBotSpecializedBot.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateMasterBotSpecializedBot.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateMasterBotSpecializedBot.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateMasterBotSpecializedBot.this.masterBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateMasterBotSpecializedBot.this.specializedBotId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], UpdateMasterBotSpecializedBot.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateMasterBotSpecializedBot.this.updatedAt);
                }
            };
        }

        public String masterBotId() {
            return this.masterBotId;
        }

        public String specializedBotId() {
            return this.specializedBotId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateMasterBotSpecializedBot{__typename=" + this.__typename + ", id=" + this.id + ", masterBotId=" + this.masterBotId + ", specializedBotId=" + this.specializedBotId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelMasterBotSpecializedBotConditionInput condition;
        private final UpdateMasterBotSpecializedBotInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateMasterBotSpecializedBotInput updateMasterBotSpecializedBotInput, ModelMasterBotSpecializedBotConditionInput modelMasterBotSpecializedBotConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateMasterBotSpecializedBotInput;
            this.condition = modelMasterBotSpecializedBotConditionInput;
            linkedHashMap.put("input", updateMasterBotSpecializedBotInput);
            linkedHashMap.put("condition", modelMasterBotSpecializedBotConditionInput);
        }

        public ModelMasterBotSpecializedBotConditionInput condition() {
            return this.condition;
        }

        public UpdateMasterBotSpecializedBotInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMasterBotSpecializedBotMutation.Variables.1
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

    public UpdateMasterBotSpecializedBotMutation(UpdateMasterBotSpecializedBotInput updateMasterBotSpecializedBotInput, ModelMasterBotSpecializedBotConditionInput modelMasterBotSpecializedBotConditionInput) {
        Utils.checkNotNull(updateMasterBotSpecializedBotInput, "input == null");
        this.variables = new Variables(updateMasterBotSpecializedBotInput, modelMasterBotSpecializedBotConditionInput);
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
        return "4f4859d92ad06439aa2da56d5ab850641fa0924802259623df8a097391f2874a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateMasterBotSpecializedBot($input: UpdateMasterBotSpecializedBotInput!, $condition: ModelMasterBotSpecializedBotConditionInput) {\n  updateMasterBotSpecializedBot(input: $input, condition: $condition) {\n    __typename\n    id\n    masterBotId\n    specializedBotId\n    createdAt\n    updatedAt\n  }\n}";
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
