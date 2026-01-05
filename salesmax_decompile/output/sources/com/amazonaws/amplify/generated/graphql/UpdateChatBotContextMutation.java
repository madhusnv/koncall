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
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelChatBotContextConditionInput;
import type.UpdateChatBotContextInput;

/* loaded from: classes4.dex */
public final class UpdateChatBotContextMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateChatBotContext($input: UpdateChatBotContextInput!, $condition: ModelChatBotContextConditionInput) {\n  updateChatBotContext(input: $input, condition: $condition) {\n    __typename\n    id\n    handlerChatBot\n    masterChatBot\n    accountId\n    contactId\n    userId\n    channelId\n    lastChatMessageId\n    createdAt\n    updatedAt\n    isPaused\n    pausedBy\n    pausedById\n    pausedAt\n    currentIntent\n    intentList\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatBotContextMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateChatBotContext";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateChatBotContext($input: UpdateChatBotContextInput!, $condition: ModelChatBotContextConditionInput) {\n  updateChatBotContext(input: $input, condition: $condition) {\n    __typename\n    id\n    handlerChatBot\n    masterChatBot\n    accountId\n    contactId\n    userId\n    channelId\n    lastChatMessageId\n    createdAt\n    updatedAt\n    isPaused\n    pausedBy\n    pausedById\n    pausedAt\n    currentIntent\n    intentList\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelChatBotContextConditionInput condition;
        private UpdateChatBotContextInput input;

        public UpdateChatBotContextMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateChatBotContextMutation(this.input, this.condition);
        }

        public Builder condition(ModelChatBotContextConditionInput modelChatBotContextConditionInput) {
            this.condition = modelChatBotContextConditionInput;
            return this;
        }

        public Builder input(UpdateChatBotContextInput updateChatBotContextInput) {
            this.input = updateChatBotContextInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateChatBotContext", "updateChatBotContext", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateChatBotContext updateChatBotContext;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateChatBotContext.Mapper updateChatBotContextFieldMapper = new UpdateChatBotContext.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateChatBotContext) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateChatBotContext>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatBotContextMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateChatBotContext read(ResponseReader responseReader2) {
                        return Mapper.this.updateChatBotContextFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateChatBotContext updateChatBotContext) {
            this.updateChatBotContext = updateChatBotContext;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateChatBotContext updateChatBotContext = this.updateChatBotContext;
            UpdateChatBotContext updateChatBotContext2 = ((Data) obj).updateChatBotContext;
            return updateChatBotContext == null ? updateChatBotContext2 == null : updateChatBotContext.equals(updateChatBotContext2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateChatBotContext updateChatBotContext = this.updateChatBotContext;
                this.$hashCode = (updateChatBotContext == null ? 0 : updateChatBotContext.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatBotContextMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateChatBotContext updateChatBotContext = Data.this.updateChatBotContext;
                    responseWriter.writeObject(responseField, updateChatBotContext != null ? updateChatBotContext.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateChatBotContext=" + this.updateChatBotContext + "}";
            }
            return this.$toString;
        }

        public UpdateChatBotContext updateChatBotContext() {
            return this.updateChatBotContext;
        }
    }

    public static class UpdateChatBotContext {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String channelId;
        final String contactId;
        final String createdAt;
        final String currentIntent;
        final String handlerChatBot;
        final String id;
        final List<String> intentList;
        final Boolean isPaused;
        final String lastChatMessageId;
        final String masterChatBot;
        final String pausedAt;
        final String pausedBy;
        final String pausedById;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<UpdateChatBotContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateChatBotContext map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateChatBotContext.$responseFields;
                return new UpdateChatBotContext(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), responseReader.readBoolean(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readList(responseFieldArr[16], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatBotContextMutation.UpdateChatBotContext.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, true, customType, Collections.emptyList()), ResponseField.forCustomType("handlerChatBot", "handlerChatBot", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("masterChatBot", "masterChatBot", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("channelId", "channelId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastChatMessageId", "lastChatMessageId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isPaused", "isPaused", null, true, Collections.emptyList()), ResponseField.forString("pausedBy", "pausedBy", null, true, Collections.emptyList()), ResponseField.forCustomType("pausedById", "pausedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("pausedAt", "pausedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("currentIntent", "currentIntent", null, true, Collections.emptyList()), ResponseField.forList("intentList", "intentList", null, true, Collections.emptyList())};
        }

        public UpdateChatBotContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, String str14, String str15, List<String> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = str2;
            this.handlerChatBot = str3;
            this.masterChatBot = str4;
            this.accountId = str5;
            this.contactId = str6;
            this.userId = str7;
            this.channelId = str8;
            this.lastChatMessageId = str9;
            this.createdAt = str10;
            this.updatedAt = str11;
            this.isPaused = bool;
            this.pausedBy = str12;
            this.pausedById = str13;
            this.pausedAt = str14;
            this.currentIntent = str15;
            this.intentList = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String channelId() {
            return this.channelId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currentIntent() {
            return this.currentIntent;
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
            String str10;
            Boolean bool;
            String str11;
            String str12;
            String str13;
            String str14;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateChatBotContext)) {
                return false;
            }
            UpdateChatBotContext updateChatBotContext = (UpdateChatBotContext) obj;
            if (this.__typename.equals(updateChatBotContext.__typename) && ((str = this.id) != null ? str.equals(updateChatBotContext.id) : updateChatBotContext.id == null) && ((str2 = this.handlerChatBot) != null ? str2.equals(updateChatBotContext.handlerChatBot) : updateChatBotContext.handlerChatBot == null) && ((str3 = this.masterChatBot) != null ? str3.equals(updateChatBotContext.masterChatBot) : updateChatBotContext.masterChatBot == null) && ((str4 = this.accountId) != null ? str4.equals(updateChatBotContext.accountId) : updateChatBotContext.accountId == null) && ((str5 = this.contactId) != null ? str5.equals(updateChatBotContext.contactId) : updateChatBotContext.contactId == null) && ((str6 = this.userId) != null ? str6.equals(updateChatBotContext.userId) : updateChatBotContext.userId == null) && ((str7 = this.channelId) != null ? str7.equals(updateChatBotContext.channelId) : updateChatBotContext.channelId == null) && ((str8 = this.lastChatMessageId) != null ? str8.equals(updateChatBotContext.lastChatMessageId) : updateChatBotContext.lastChatMessageId == null) && ((str9 = this.createdAt) != null ? str9.equals(updateChatBotContext.createdAt) : updateChatBotContext.createdAt == null) && ((str10 = this.updatedAt) != null ? str10.equals(updateChatBotContext.updatedAt) : updateChatBotContext.updatedAt == null) && ((bool = this.isPaused) != null ? bool.equals(updateChatBotContext.isPaused) : updateChatBotContext.isPaused == null) && ((str11 = this.pausedBy) != null ? str11.equals(updateChatBotContext.pausedBy) : updateChatBotContext.pausedBy == null) && ((str12 = this.pausedById) != null ? str12.equals(updateChatBotContext.pausedById) : updateChatBotContext.pausedById == null) && ((str13 = this.pausedAt) != null ? str13.equals(updateChatBotContext.pausedAt) : updateChatBotContext.pausedAt == null) && ((str14 = this.currentIntent) != null ? str14.equals(updateChatBotContext.currentIntent) : updateChatBotContext.currentIntent == null)) {
                List<String> list = this.intentList;
                List<String> list2 = updateChatBotContext.intentList;
                if (list == null) {
                    if (list2 == null) {
                        return true;
                    }
                } else if (list.equals(list2)) {
                    return true;
                }
            }
            return false;
        }

        public String handlerChatBot() {
            return this.handlerChatBot;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.id;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.handlerChatBot;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.masterChatBot;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.accountId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.contactId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.userId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.channelId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lastChatMessageId;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                Boolean bool = this.isPaused;
                int iHashCode12 = (iHashCode11 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str11 = this.pausedBy;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.pausedById;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.pausedAt;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.currentIntent;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                List<String> list = this.intentList;
                this.$hashCode = iHashCode16 ^ (list != null ? list.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public List<String> intentList() {
            return this.intentList;
        }

        public Boolean isPaused() {
            return this.isPaused;
        }

        public String lastChatMessageId() {
            return this.lastChatMessageId;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatBotContextMutation.UpdateChatBotContext.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateChatBotContext.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateChatBotContext.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateChatBotContext.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateChatBotContext.this.handlerChatBot);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateChatBotContext.this.masterChatBot);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], UpdateChatBotContext.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateChatBotContext.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], UpdateChatBotContext.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateChatBotContext.this.channelId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateChatBotContext.this.lastChatMessageId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateChatBotContext.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], UpdateChatBotContext.this.updatedAt);
                    responseWriter.writeBoolean(responseFieldArr[11], UpdateChatBotContext.this.isPaused);
                    responseWriter.writeString(responseFieldArr[12], UpdateChatBotContext.this.pausedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdateChatBotContext.this.pausedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateChatBotContext.this.pausedAt);
                    responseWriter.writeString(responseFieldArr[15], UpdateChatBotContext.this.currentIntent);
                    responseWriter.writeList(responseFieldArr[16], UpdateChatBotContext.this.intentList, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatBotContextMutation.UpdateChatBotContext.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                }
            };
        }

        public String masterChatBot() {
            return this.masterChatBot;
        }

        public String pausedAt() {
            return this.pausedAt;
        }

        public String pausedBy() {
            return this.pausedBy;
        }

        public String pausedById() {
            return this.pausedById;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateChatBotContext{__typename=" + this.__typename + ", id=" + this.id + ", handlerChatBot=" + this.handlerChatBot + ", masterChatBot=" + this.masterChatBot + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", userId=" + this.userId + ", channelId=" + this.channelId + ", lastChatMessageId=" + this.lastChatMessageId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", isPaused=" + this.isPaused + ", pausedBy=" + this.pausedBy + ", pausedById=" + this.pausedById + ", pausedAt=" + this.pausedAt + ", currentIntent=" + this.currentIntent + ", intentList=" + this.intentList + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelChatBotContextConditionInput condition;
        private final UpdateChatBotContextInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateChatBotContextInput updateChatBotContextInput, ModelChatBotContextConditionInput modelChatBotContextConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateChatBotContextInput;
            this.condition = modelChatBotContextConditionInput;
            linkedHashMap.put("input", updateChatBotContextInput);
            linkedHashMap.put("condition", modelChatBotContextConditionInput);
        }

        public ModelChatBotContextConditionInput condition() {
            return this.condition;
        }

        public UpdateChatBotContextInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateChatBotContextMutation.Variables.1
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

    public UpdateChatBotContextMutation(UpdateChatBotContextInput updateChatBotContextInput, ModelChatBotContextConditionInput modelChatBotContextConditionInput) {
        Utils.checkNotNull(updateChatBotContextInput, "input == null");
        this.variables = new Variables(updateChatBotContextInput, modelChatBotContextConditionInput);
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
        return "2f42a5ac148365cab6209ff44d2c69bfb2762103cebb88d1e304b942de58e842";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateChatBotContext($input: UpdateChatBotContextInput!, $condition: ModelChatBotContextConditionInput) {\n  updateChatBotContext(input: $input, condition: $condition) {\n    __typename\n    id\n    handlerChatBot\n    masterChatBot\n    accountId\n    contactId\n    userId\n    channelId\n    lastChatMessageId\n    createdAt\n    updatedAt\n    isPaused\n    pausedBy\n    pausedById\n    pausedAt\n    currentIntent\n    intentList\n  }\n}";
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
