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
import type.ModelMessageChatBotRoutingConditionInput;
import type.UpdateMessageChatBotRoutingInput;

/* loaded from: classes4.dex */
public final class UpdateMessageChatBotRoutingMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateMessageChatBotRouting($input: UpdateMessageChatBotRoutingInput!, $condition: ModelMessageChatBotRoutingConditionInput) {\n  updateMessageChatBotRouting(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    messagePlatform\n    phoneNumberIdExternal\n    channelId\n    botId\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMessageChatBotRoutingMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateMessageChatBotRouting";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateMessageChatBotRouting($input: UpdateMessageChatBotRoutingInput!, $condition: ModelMessageChatBotRoutingConditionInput) {\n  updateMessageChatBotRouting(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    messagePlatform\n    phoneNumberIdExternal\n    channelId\n    botId\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelMessageChatBotRoutingConditionInput condition;
        private UpdateMessageChatBotRoutingInput input;

        public UpdateMessageChatBotRoutingMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateMessageChatBotRoutingMutation(this.input, this.condition);
        }

        public Builder condition(ModelMessageChatBotRoutingConditionInput modelMessageChatBotRoutingConditionInput) {
            this.condition = modelMessageChatBotRoutingConditionInput;
            return this;
        }

        public Builder input(UpdateMessageChatBotRoutingInput updateMessageChatBotRoutingInput) {
            this.input = updateMessageChatBotRoutingInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateMessageChatBotRouting", "updateMessageChatBotRouting", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateMessageChatBotRouting updateMessageChatBotRouting;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateMessageChatBotRouting.Mapper updateMessageChatBotRoutingFieldMapper = new UpdateMessageChatBotRouting.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateMessageChatBotRouting) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateMessageChatBotRouting>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMessageChatBotRoutingMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateMessageChatBotRouting read(ResponseReader responseReader2) {
                        return Mapper.this.updateMessageChatBotRoutingFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateMessageChatBotRouting updateMessageChatBotRouting) {
            this.updateMessageChatBotRouting = updateMessageChatBotRouting;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateMessageChatBotRouting updateMessageChatBotRouting = this.updateMessageChatBotRouting;
            UpdateMessageChatBotRouting updateMessageChatBotRouting2 = ((Data) obj).updateMessageChatBotRouting;
            return updateMessageChatBotRouting == null ? updateMessageChatBotRouting2 == null : updateMessageChatBotRouting.equals(updateMessageChatBotRouting2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateMessageChatBotRouting updateMessageChatBotRouting = this.updateMessageChatBotRouting;
                this.$hashCode = (updateMessageChatBotRouting == null ? 0 : updateMessageChatBotRouting.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMessageChatBotRoutingMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateMessageChatBotRouting updateMessageChatBotRouting = Data.this.updateMessageChatBotRouting;
                    responseWriter.writeObject(responseField, updateMessageChatBotRouting != null ? updateMessageChatBotRouting.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateMessageChatBotRouting=" + this.updateMessageChatBotRouting + "}";
            }
            return this.$toString;
        }

        public UpdateMessageChatBotRouting updateMessageChatBotRouting() {
            return this.updateMessageChatBotRouting;
        }
    }

    public static class UpdateMessageChatBotRouting {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String botId;
        final String channelId;
        final String createdAt;
        final String createdById;
        final String id;
        final String messagePlatform;
        final String phoneNumberIdExternal;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<UpdateMessageChatBotRouting> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateMessageChatBotRouting map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateMessageChatBotRouting.$responseFields;
                return new UpdateMessageChatBotRouting(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forString("messagePlatform", "messagePlatform", null, true, Collections.emptyList()), ResponseField.forString("phoneNumberIdExternal", "phoneNumberIdExternal", null, true, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("botId", "botId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public UpdateMessageChatBotRouting(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = str2;
            this.accountId = str3;
            this.messagePlatform = str4;
            this.phoneNumberIdExternal = str5;
            this.channelId = str6;
            this.botId = str7;
            this.createdById = str8;
            this.updatedById = str9;
            this.createdAt = str10;
            this.updatedAt = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String botId() {
            return this.botId;
        }

        public String channelId() {
            return this.channelId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateMessageChatBotRouting)) {
                return false;
            }
            UpdateMessageChatBotRouting updateMessageChatBotRouting = (UpdateMessageChatBotRouting) obj;
            if (this.__typename.equals(updateMessageChatBotRouting.__typename) && ((str = this.id) != null ? str.equals(updateMessageChatBotRouting.id) : updateMessageChatBotRouting.id == null) && ((str2 = this.accountId) != null ? str2.equals(updateMessageChatBotRouting.accountId) : updateMessageChatBotRouting.accountId == null) && ((str3 = this.messagePlatform) != null ? str3.equals(updateMessageChatBotRouting.messagePlatform) : updateMessageChatBotRouting.messagePlatform == null) && ((str4 = this.phoneNumberIdExternal) != null ? str4.equals(updateMessageChatBotRouting.phoneNumberIdExternal) : updateMessageChatBotRouting.phoneNumberIdExternal == null) && ((str5 = this.channelId) != null ? str5.equals(updateMessageChatBotRouting.channelId) : updateMessageChatBotRouting.channelId == null) && ((str6 = this.botId) != null ? str6.equals(updateMessageChatBotRouting.botId) : updateMessageChatBotRouting.botId == null) && ((str7 = this.createdById) != null ? str7.equals(updateMessageChatBotRouting.createdById) : updateMessageChatBotRouting.createdById == null) && ((str8 = this.updatedById) != null ? str8.equals(updateMessageChatBotRouting.updatedById) : updateMessageChatBotRouting.updatedById == null) && ((str9 = this.createdAt) != null ? str9.equals(updateMessageChatBotRouting.createdAt) : updateMessageChatBotRouting.createdAt == null)) {
                String str10 = this.updatedAt;
                String str11 = updateMessageChatBotRouting.updatedAt;
                if (str10 == null) {
                    if (str11 == null) {
                        return true;
                    }
                } else if (str10.equals(str11)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.id;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.accountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.messagePlatform;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.phoneNumberIdExternal;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.channelId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.botId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdById;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedById;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                this.$hashCode = iHashCode10 ^ (str10 != null ? str10.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMessageChatBotRoutingMutation.UpdateMessageChatBotRouting.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateMessageChatBotRouting.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateMessageChatBotRouting.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateMessageChatBotRouting.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateMessageChatBotRouting.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UpdateMessageChatBotRouting.this.messagePlatform);
                    responseWriter.writeString(responseFieldArr[4], UpdateMessageChatBotRouting.this.phoneNumberIdExternal);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateMessageChatBotRouting.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateMessageChatBotRouting.this.botId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateMessageChatBotRouting.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateMessageChatBotRouting.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateMessageChatBotRouting.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateMessageChatBotRouting.this.updatedAt);
                }
            };
        }

        public String messagePlatform() {
            return this.messagePlatform;
        }

        public String phoneNumberIdExternal() {
            return this.phoneNumberIdExternal;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateMessageChatBotRouting{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", messagePlatform=" + this.messagePlatform + ", phoneNumberIdExternal=" + this.phoneNumberIdExternal + ", channelId=" + this.channelId + ", botId=" + this.botId + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelMessageChatBotRoutingConditionInput condition;
        private final UpdateMessageChatBotRoutingInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateMessageChatBotRoutingInput updateMessageChatBotRoutingInput, ModelMessageChatBotRoutingConditionInput modelMessageChatBotRoutingConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateMessageChatBotRoutingInput;
            this.condition = modelMessageChatBotRoutingConditionInput;
            linkedHashMap.put("input", updateMessageChatBotRoutingInput);
            linkedHashMap.put("condition", modelMessageChatBotRoutingConditionInput);
        }

        public ModelMessageChatBotRoutingConditionInput condition() {
            return this.condition;
        }

        public UpdateMessageChatBotRoutingInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateMessageChatBotRoutingMutation.Variables.1
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

    public UpdateMessageChatBotRoutingMutation(UpdateMessageChatBotRoutingInput updateMessageChatBotRoutingInput, ModelMessageChatBotRoutingConditionInput modelMessageChatBotRoutingConditionInput) {
        Utils.checkNotNull(updateMessageChatBotRoutingInput, "input == null");
        this.variables = new Variables(updateMessageChatBotRoutingInput, modelMessageChatBotRoutingConditionInput);
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
        return "f9edb358f88dafafebd1cb9e16d0c0d6927252ba2a32129add40675769b6568d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateMessageChatBotRouting($input: UpdateMessageChatBotRoutingInput!, $condition: ModelMessageChatBotRoutingConditionInput) {\n  updateMessageChatBotRouting(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    messagePlatform\n    phoneNumberIdExternal\n    channelId\n    botId\n    createdById\n    updatedById\n    createdAt\n    updatedAt\n  }\n}";
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
