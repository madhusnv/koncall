package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.ModelBotActionConditionInput;
import type.UpdateBotActionInput;

/* loaded from: classes4.dex */
public final class UpdateBotActionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateBotAction($input: UpdateBotActionInput!, $condition: ModelBotActionConditionInput) {\n  updateBotAction(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    type\n    endpoint\n    payload\n    description\n    isPaused\n    createdAt\n    updatedAt\n    botMappings {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateBotAction";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateBotAction($input: UpdateBotActionInput!, $condition: ModelBotActionConditionInput) {\n  updateBotAction(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    type\n    endpoint\n    payload\n    description\n    isPaused\n    createdAt\n    updatedAt\n    botMappings {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static class BotMappings {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<BotMappings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public BotMappings map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = BotMappings.$responseFields;
                return new BotMappings(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public BotMappings(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BotMappings)) {
                return false;
            }
            BotMappings botMappings = (BotMappings) obj;
            if (this.__typename.equals(botMappings.__typename)) {
                String str = this.nextToken;
                String str2 = botMappings.nextToken;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionMutation.BotMappings.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = BotMappings.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], BotMappings.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], BotMappings.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BotMappings{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        private ModelBotActionConditionInput condition;
        private UpdateBotActionInput input;

        public UpdateBotActionMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateBotActionMutation(this.input, this.condition);
        }

        public Builder condition(ModelBotActionConditionInput modelBotActionConditionInput) {
            this.condition = modelBotActionConditionInput;
            return this;
        }

        public Builder input(UpdateBotActionInput updateBotActionInput) {
            this.input = updateBotActionInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateBotAction", "updateBotAction", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateBotAction updateBotAction;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateBotAction.Mapper updateBotActionFieldMapper = new UpdateBotAction.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateBotAction) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateBotAction>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateBotAction read(ResponseReader responseReader2) {
                        return Mapper.this.updateBotActionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateBotAction updateBotAction) {
            this.updateBotAction = updateBotAction;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateBotAction updateBotAction = this.updateBotAction;
            UpdateBotAction updateBotAction2 = ((Data) obj).updateBotAction;
            return updateBotAction == null ? updateBotAction2 == null : updateBotAction.equals(updateBotAction2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateBotAction updateBotAction = this.updateBotAction;
                this.$hashCode = (updateBotAction == null ? 0 : updateBotAction.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateBotAction updateBotAction = Data.this.updateBotAction;
                    responseWriter.writeObject(responseField, updateBotAction != null ? updateBotAction.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateBotAction=" + this.updateBotAction + "}";
            }
            return this.$toString;
        }

        public UpdateBotAction updateBotAction() {
            return this.updateBotAction;
        }
    }

    public static class UpdateBotAction {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final BotMappings botMappings;
        final String createdAt;
        final String description;
        final String endpoint;
        final String id;
        final Boolean isPaused;
        final String name;
        final String payload;

        /* renamed from: type, reason: collision with root package name */
        final String f58079type;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateBotAction> {
            final BotMappings.Mapper botMappingsFieldMapper = new BotMappings.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateBotAction map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateBotAction.$responseFields;
                return new UpdateBotAction(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (BotMappings) responseReader.readObject(responseFieldArr[11], new ResponseReader.ObjectReader<BotMappings>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionMutation.UpdateBotAction.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public BotMappings read(ResponseReader responseReader2) {
                        return Mapper.this.botMappingsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("endpoint", "endpoint", null, true, Collections.emptyList()), ResponseField.forCustomType("payload", "payload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forBoolean("isPaused", "isPaused", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("botMappings", "botMappings", null, true, Collections.emptyList())};
        }

        public UpdateBotAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, BotMappings botMappings) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.f58079type = str5;
            this.endpoint = str6;
            this.payload = str7;
            this.description = str8;
            this.isPaused = bool;
            this.createdAt = str9;
            this.updatedAt = str10;
            this.botMappings = botMappings;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public BotMappings botMappings() {
            return this.botMappings;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public String endpoint() {
            return this.endpoint;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Boolean bool;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateBotAction)) {
                return false;
            }
            UpdateBotAction updateBotAction = (UpdateBotAction) obj;
            if (this.__typename.equals(updateBotAction.__typename) && this.id.equals(updateBotAction.id) && this.accountId.equals(updateBotAction.accountId) && ((str = this.name) != null ? str.equals(updateBotAction.name) : updateBotAction.name == null) && ((str2 = this.f58079type) != null ? str2.equals(updateBotAction.f58079type) : updateBotAction.f58079type == null) && ((str3 = this.endpoint) != null ? str3.equals(updateBotAction.endpoint) : updateBotAction.endpoint == null) && ((str4 = this.payload) != null ? str4.equals(updateBotAction.payload) : updateBotAction.payload == null) && ((str5 = this.description) != null ? str5.equals(updateBotAction.description) : updateBotAction.description == null) && ((bool = this.isPaused) != null ? bool.equals(updateBotAction.isPaused) : updateBotAction.isPaused == null) && ((str6 = this.createdAt) != null ? str6.equals(updateBotAction.createdAt) : updateBotAction.createdAt == null) && ((str7 = this.updatedAt) != null ? str7.equals(updateBotAction.updatedAt) : updateBotAction.updatedAt == null)) {
                BotMappings botMappings = this.botMappings;
                BotMappings botMappings2 = updateBotAction.botMappings;
                if (botMappings == null) {
                    if (botMappings2 == null) {
                        return true;
                    }
                } else if (botMappings.equals(botMappings2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.f58079type;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.endpoint;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.payload;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.description;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool = this.isPaused;
                int iHashCode7 = (iHashCode6 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str6 = this.createdAt;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedAt;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                BotMappings botMappings = this.botMappings;
                this.$hashCode = iHashCode9 ^ (botMappings != null ? botMappings.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionMutation.UpdateBotAction.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateBotAction.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateBotAction.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateBotAction.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateBotAction.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UpdateBotAction.this.name);
                    responseWriter.writeString(responseFieldArr[4], UpdateBotAction.this.f58079type);
                    responseWriter.writeString(responseFieldArr[5], UpdateBotAction.this.endpoint);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateBotAction.this.payload);
                    responseWriter.writeString(responseFieldArr[7], UpdateBotAction.this.description);
                    responseWriter.writeBoolean(responseFieldArr[8], UpdateBotAction.this.isPaused);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateBotAction.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateBotAction.this.updatedAt);
                    ResponseField responseField = responseFieldArr[11];
                    BotMappings botMappings = UpdateBotAction.this.botMappings;
                    responseWriter.writeObject(responseField, botMappings != null ? botMappings.marshaller() : null);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String payload() {
            return this.payload;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateBotAction{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", type=" + this.f58079type + ", endpoint=" + this.endpoint + ", payload=" + this.payload + ", description=" + this.description + ", isPaused=" + this.isPaused + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", botMappings=" + this.botMappings + "}";
            }
            return this.$toString;
        }

        public String type() {
            return this.f58079type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelBotActionConditionInput condition;
        private final UpdateBotActionInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateBotActionInput updateBotActionInput, ModelBotActionConditionInput modelBotActionConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateBotActionInput;
            this.condition = modelBotActionConditionInput;
            linkedHashMap.put("input", updateBotActionInput);
            linkedHashMap.put("condition", modelBotActionConditionInput);
        }

        public ModelBotActionConditionInput condition() {
            return this.condition;
        }

        public UpdateBotActionInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBotActionMutation.Variables.1
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

    public UpdateBotActionMutation(UpdateBotActionInput updateBotActionInput, ModelBotActionConditionInput modelBotActionConditionInput) {
        Utils.checkNotNull(updateBotActionInput, "input == null");
        this.variables = new Variables(updateBotActionInput, modelBotActionConditionInput);
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
        return "932c9fa5b866f5c9ec010add4038747964bea120db351d65a67dc27928ec4806";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateBotAction($input: UpdateBotActionInput!, $condition: ModelBotActionConditionInput) {\n  updateBotAction(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    type\n    endpoint\n    payload\n    description\n    isPaused\n    createdAt\n    updatedAt\n    botMappings {\n      __typename\n      nextToken\n    }\n  }\n}";
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
