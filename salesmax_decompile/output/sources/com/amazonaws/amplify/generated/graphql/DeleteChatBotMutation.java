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
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.DeleteChatBotInput;
import type.ModelChatBotConditionInput;

/* loaded from: classes6.dex */
public final class DeleteChatBotMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteChatBot($input: DeleteChatBotInput!, $condition: ModelChatBotConditionInput) {\n  deleteChatBot(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    nickName\n    description\n    intent\n    botType\n    childIntentList {\n      __typename\n      childBotId\n      intent\n    }\n    userContext\n    systemContext\n    generatedPrompt\n    fallBackResponse\n    status\n    linkedFiles\n    createdById\n    updatedById\n    testChannelId\n    preferredModel\n    createdAt\n    updatedAt\n    childBots {\n      __typename\n      nextToken\n    }\n    botActions {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteChatBot";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteChatBot($input: DeleteChatBotInput!, $condition: ModelChatBotConditionInput) {\n  deleteChatBot(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    nickName\n    description\n    intent\n    botType\n    childIntentList {\n      __typename\n      childBotId\n      intent\n    }\n    userContext\n    systemContext\n    generatedPrompt\n    fallBackResponse\n    status\n    linkedFiles\n    createdById\n    updatedById\n    testChannelId\n    preferredModel\n    createdAt\n    updatedAt\n    childBots {\n      __typename\n      nextToken\n    }\n    botActions {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static class BotActions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<BotActions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public BotActions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = BotActions.$responseFields;
                return new BotActions(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public BotActions(String str, String str2) {
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
            if (!(obj instanceof BotActions)) {
                return false;
            }
            BotActions botActions = (BotActions) obj;
            if (this.__typename.equals(botActions.__typename)) {
                String str = this.nextToken;
                String str2 = botActions.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.BotActions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = BotActions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], BotActions.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], BotActions.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BotActions{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        private ModelChatBotConditionInput condition;
        private DeleteChatBotInput input;

        public DeleteChatBotMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteChatBotMutation(this.input, this.condition);
        }

        public Builder condition(ModelChatBotConditionInput modelChatBotConditionInput) {
            this.condition = modelChatBotConditionInput;
            return this;
        }

        public Builder input(DeleteChatBotInput deleteChatBotInput) {
            this.input = deleteChatBotInput;
            return this;
        }
    }

    public static class ChildBots {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ChildBots> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChildBots map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChildBots.$responseFields;
                return new ChildBots(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public ChildBots(String str, String str2) {
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
            if (!(obj instanceof ChildBots)) {
                return false;
            }
            ChildBots childBots = (ChildBots) obj;
            if (this.__typename.equals(childBots.__typename)) {
                String str = this.nextToken;
                String str2 = childBots.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.ChildBots.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChildBots.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChildBots.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ChildBots.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ChildBots{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class ChildIntentList {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("childBotId", "childBotId", null, true, CustomType.ID, Collections.emptyList()), ResponseField.forString("intent", "intent", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String childBotId;
        final String intent;

        public static final class Mapper implements ResponseFieldMapper<ChildIntentList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChildIntentList map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChildIntentList.$responseFields;
                return new ChildIntentList(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readString(responseFieldArr[2]));
            }
        }

        public ChildIntentList(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.childBotId = str2;
            this.intent = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String childBotId() {
            return this.childBotId;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChildIntentList)) {
                return false;
            }
            ChildIntentList childIntentList = (ChildIntentList) obj;
            if (this.__typename.equals(childIntentList.__typename) && ((str = this.childBotId) != null ? str.equals(childIntentList.childBotId) : childIntentList.childBotId == null)) {
                String str2 = this.intent;
                String str3 = childIntentList.intent;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.childBotId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.intent;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String intent() {
            return this.intent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.ChildIntentList.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChildIntentList.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChildIntentList.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ChildIntentList.this.childBotId);
                    responseWriter.writeString(responseFieldArr[2], ChildIntentList.this.intent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ChildIntentList{__typename=" + this.__typename + ", childBotId=" + this.childBotId + ", intent=" + this.intent + "}";
            }
            return this.$toString;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteChatBot", "deleteChatBot", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteChatBot deleteChatBot;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteChatBot.Mapper deleteChatBotFieldMapper = new DeleteChatBot.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteChatBot) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteChatBot>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteChatBot read(ResponseReader responseReader2) {
                        return Mapper.this.deleteChatBotFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteChatBot deleteChatBot) {
            this.deleteChatBot = deleteChatBot;
        }

        public DeleteChatBot deleteChatBot() {
            return this.deleteChatBot;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteChatBot deleteChatBot = this.deleteChatBot;
            DeleteChatBot deleteChatBot2 = ((Data) obj).deleteChatBot;
            return deleteChatBot == null ? deleteChatBot2 == null : deleteChatBot.equals(deleteChatBot2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteChatBot deleteChatBot = this.deleteChatBot;
                this.$hashCode = (deleteChatBot == null ? 0 : deleteChatBot.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteChatBot deleteChatBot = Data.this.deleteChatBot;
                    responseWriter.writeObject(responseField, deleteChatBot != null ? deleteChatBot.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteChatBot=" + this.deleteChatBot + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteChatBot {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final BotActions botActions;
        final String botType;
        final ChildBots childBots;
        final List<ChildIntentList> childIntentList;
        final String createdAt;
        final String createdById;
        final String description;
        final String fallBackResponse;
        final String generatedPrompt;
        final String id;
        final String intent;
        final List<String> linkedFiles;
        final String name;
        final String nickName;
        final String preferredModel;
        final String status;
        final String systemContext;
        final String testChannelId;
        final String updatedAt;
        final String updatedById;
        final String userContext;

        public static final class Mapper implements ResponseFieldMapper<DeleteChatBot> {
            final ChildIntentList.Mapper childIntentListFieldMapper = new ChildIntentList.Mapper();
            final ChildBots.Mapper childBotsFieldMapper = new ChildBots.Mapper();
            final BotActions.Mapper botActionsFieldMapper = new BotActions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteChatBot map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteChatBot.$responseFields;
                return new DeleteChatBot(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readList(responseFieldArr[8], new ResponseReader.ListReader<ChildIntentList>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ChildIntentList read(ResponseReader.ListItemReader listItemReader) {
                        return (ChildIntentList) listItemReader.readObject(new ResponseReader.ObjectReader<ChildIntentList>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public ChildIntentList read(ResponseReader responseReader2) {
                                return Mapper.this.childIntentListFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readList(responseFieldArr[14], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (ChildBots) responseReader.readObject(responseFieldArr[21], new ResponseReader.ObjectReader<ChildBots>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChildBots read(ResponseReader responseReader2) {
                        return Mapper.this.childBotsFieldMapper.map(responseReader2);
                    }
                }), (BotActions) responseReader.readObject(responseFieldArr[22], new ResponseReader.ObjectReader<BotActions>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public BotActions read(ResponseReader responseReader2) {
                        return Mapper.this.botActionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("nickName", "nickName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("intent", "intent", null, true, Collections.emptyList()), ResponseField.forString("botType", "botType", null, true, Collections.emptyList()), ResponseField.forList("childIntentList", "childIntentList", null, true, Collections.emptyList()), ResponseField.forString("userContext", "userContext", null, true, Collections.emptyList()), ResponseField.forString("systemContext", "systemContext", null, true, Collections.emptyList()), ResponseField.forString("generatedPrompt", "generatedPrompt", null, true, Collections.emptyList()), ResponseField.forString("fallBackResponse", "fallBackResponse", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forList("linkedFiles", "linkedFiles", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("testChannelId", "testChannelId", null, true, customType, Collections.emptyList()), ResponseField.forString("preferredModel", "preferredModel", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("childBots", "childBots", null, true, Collections.emptyList()), ResponseField.forObject("botActions", "botActions", null, true, Collections.emptyList())};
        }

        public DeleteChatBot(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<ChildIntentList> list, String str9, String str10, String str11, String str12, String str13, List<String> list2, String str14, String str15, String str16, String str17, String str18, String str19, ChildBots childBots, BotActions botActions) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = str2;
            this.accountId = str3;
            this.name = str4;
            this.nickName = str5;
            this.description = str6;
            this.intent = str7;
            this.botType = str8;
            this.childIntentList = list;
            this.userContext = str9;
            this.systemContext = str10;
            this.generatedPrompt = str11;
            this.fallBackResponse = str12;
            this.status = str13;
            this.linkedFiles = list2;
            this.createdById = str14;
            this.updatedById = str15;
            this.testChannelId = str16;
            this.preferredModel = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
            this.childBots = childBots;
            this.botActions = botActions;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public BotActions botActions() {
            return this.botActions;
        }

        public String botType() {
            return this.botType;
        }

        public ChildBots childBots() {
            return this.childBots;
        }

        public List<ChildIntentList> childIntentList() {
            return this.childIntentList;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            List<ChildIntentList> list;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            List<String> list2;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            ChildBots childBots;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteChatBot)) {
                return false;
            }
            DeleteChatBot deleteChatBot = (DeleteChatBot) obj;
            if (this.__typename.equals(deleteChatBot.__typename) && ((str = this.id) != null ? str.equals(deleteChatBot.id) : deleteChatBot.id == null) && ((str2 = this.accountId) != null ? str2.equals(deleteChatBot.accountId) : deleteChatBot.accountId == null) && ((str3 = this.name) != null ? str3.equals(deleteChatBot.name) : deleteChatBot.name == null) && ((str4 = this.nickName) != null ? str4.equals(deleteChatBot.nickName) : deleteChatBot.nickName == null) && ((str5 = this.description) != null ? str5.equals(deleteChatBot.description) : deleteChatBot.description == null) && ((str6 = this.intent) != null ? str6.equals(deleteChatBot.intent) : deleteChatBot.intent == null) && ((str7 = this.botType) != null ? str7.equals(deleteChatBot.botType) : deleteChatBot.botType == null) && ((list = this.childIntentList) != null ? list.equals(deleteChatBot.childIntentList) : deleteChatBot.childIntentList == null) && ((str8 = this.userContext) != null ? str8.equals(deleteChatBot.userContext) : deleteChatBot.userContext == null) && ((str9 = this.systemContext) != null ? str9.equals(deleteChatBot.systemContext) : deleteChatBot.systemContext == null) && ((str10 = this.generatedPrompt) != null ? str10.equals(deleteChatBot.generatedPrompt) : deleteChatBot.generatedPrompt == null) && ((str11 = this.fallBackResponse) != null ? str11.equals(deleteChatBot.fallBackResponse) : deleteChatBot.fallBackResponse == null) && ((str12 = this.status) != null ? str12.equals(deleteChatBot.status) : deleteChatBot.status == null) && ((list2 = this.linkedFiles) != null ? list2.equals(deleteChatBot.linkedFiles) : deleteChatBot.linkedFiles == null) && ((str13 = this.createdById) != null ? str13.equals(deleteChatBot.createdById) : deleteChatBot.createdById == null) && ((str14 = this.updatedById) != null ? str14.equals(deleteChatBot.updatedById) : deleteChatBot.updatedById == null) && ((str15 = this.testChannelId) != null ? str15.equals(deleteChatBot.testChannelId) : deleteChatBot.testChannelId == null) && ((str16 = this.preferredModel) != null ? str16.equals(deleteChatBot.preferredModel) : deleteChatBot.preferredModel == null) && ((str17 = this.createdAt) != null ? str17.equals(deleteChatBot.createdAt) : deleteChatBot.createdAt == null) && ((str18 = this.updatedAt) != null ? str18.equals(deleteChatBot.updatedAt) : deleteChatBot.updatedAt == null) && ((childBots = this.childBots) != null ? childBots.equals(deleteChatBot.childBots) : deleteChatBot.childBots == null)) {
                BotActions botActions = this.botActions;
                BotActions botActions2 = deleteChatBot.botActions;
                if (botActions == null) {
                    if (botActions2 == null) {
                        return true;
                    }
                } else if (botActions.equals(botActions2)) {
                    return true;
                }
            }
            return false;
        }

        public String fallBackResponse() {
            return this.fallBackResponse;
        }

        public String generatedPrompt() {
            return this.generatedPrompt;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.id;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.accountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.name;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.nickName;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.description;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.intent;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.botType;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                List<ChildIntentList> list = this.childIntentList;
                int iHashCode9 = (iHashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str8 = this.userContext;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.systemContext;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.generatedPrompt;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.fallBackResponse;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.status;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list2 = this.linkedFiles;
                int iHashCode15 = (iHashCode14 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str13 = this.createdById;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.updatedById;
                int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.testChannelId;
                int iHashCode18 = (iHashCode17 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.preferredModel;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdAt;
                int iHashCode20 = (iHashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedAt;
                int iHashCode21 = (iHashCode20 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                ChildBots childBots = this.childBots;
                int iHashCode22 = (iHashCode21 ^ (childBots == null ? 0 : childBots.hashCode())) * 1000003;
                BotActions botActions = this.botActions;
                this.$hashCode = iHashCode22 ^ (botActions != null ? botActions.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String intent() {
            return this.intent;
        }

        public List<String> linkedFiles() {
            return this.linkedFiles;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteChatBot.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteChatBot.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteChatBot.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteChatBot.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], DeleteChatBot.this.name);
                    responseWriter.writeString(responseFieldArr[4], DeleteChatBot.this.nickName);
                    responseWriter.writeString(responseFieldArr[5], DeleteChatBot.this.description);
                    responseWriter.writeString(responseFieldArr[6], DeleteChatBot.this.intent);
                    responseWriter.writeString(responseFieldArr[7], DeleteChatBot.this.botType);
                    responseWriter.writeList(responseFieldArr[8], DeleteChatBot.this.childIntentList, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ChildIntentList) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[9], DeleteChatBot.this.userContext);
                    responseWriter.writeString(responseFieldArr[10], DeleteChatBot.this.systemContext);
                    responseWriter.writeString(responseFieldArr[11], DeleteChatBot.this.generatedPrompt);
                    responseWriter.writeString(responseFieldArr[12], DeleteChatBot.this.fallBackResponse);
                    responseWriter.writeString(responseFieldArr[13], DeleteChatBot.this.status);
                    responseWriter.writeList(responseFieldArr[14], DeleteChatBot.this.linkedFiles, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.DeleteChatBot.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], DeleteChatBot.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], DeleteChatBot.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], DeleteChatBot.this.testChannelId);
                    responseWriter.writeString(responseFieldArr[18], DeleteChatBot.this.preferredModel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], DeleteChatBot.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], DeleteChatBot.this.updatedAt);
                    ResponseField responseField = responseFieldArr[21];
                    ChildBots childBots = DeleteChatBot.this.childBots;
                    responseWriter.writeObject(responseField, childBots != null ? childBots.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[22];
                    BotActions botActions = DeleteChatBot.this.botActions;
                    responseWriter.writeObject(responseField2, botActions != null ? botActions.marshaller() : null);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String nickName() {
            return this.nickName;
        }

        public String preferredModel() {
            return this.preferredModel;
        }

        public String status() {
            return this.status;
        }

        public String systemContext() {
            return this.systemContext;
        }

        public String testChannelId() {
            return this.testChannelId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DeleteChatBot{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", nickName=" + this.nickName + ", description=" + this.description + ", intent=" + this.intent + ", botType=" + this.botType + ", childIntentList=" + this.childIntentList + ", userContext=" + this.userContext + ", systemContext=" + this.systemContext + ", generatedPrompt=" + this.generatedPrompt + ", fallBackResponse=" + this.fallBackResponse + ", status=" + this.status + ", linkedFiles=" + this.linkedFiles + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", testChannelId=" + this.testChannelId + ", preferredModel=" + this.preferredModel + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", childBots=" + this.childBots + ", botActions=" + this.botActions + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String userContext() {
            return this.userContext;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelChatBotConditionInput condition;
        private final DeleteChatBotInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteChatBotInput deleteChatBotInput, ModelChatBotConditionInput modelChatBotConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteChatBotInput;
            this.condition = modelChatBotConditionInput;
            linkedHashMap.put("input", deleteChatBotInput);
            linkedHashMap.put("condition", modelChatBotConditionInput);
        }

        public ModelChatBotConditionInput condition() {
            return this.condition;
        }

        public DeleteChatBotInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteChatBotMutation.Variables.1
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

    public DeleteChatBotMutation(DeleteChatBotInput deleteChatBotInput, ModelChatBotConditionInput modelChatBotConditionInput) {
        Utils.checkNotNull(deleteChatBotInput, "input == null");
        this.variables = new Variables(deleteChatBotInput, modelChatBotConditionInput);
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
        return "a7409efa467b6fab37cef8f66aa65b97ef93dd6e6817fa3ac7b7364f85193adf";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteChatBot($input: DeleteChatBotInput!, $condition: ModelChatBotConditionInput) {\n  deleteChatBot(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    nickName\n    description\n    intent\n    botType\n    childIntentList {\n      __typename\n      childBotId\n      intent\n    }\n    userContext\n    systemContext\n    generatedPrompt\n    fallBackResponse\n    status\n    linkedFiles\n    createdById\n    updatedById\n    testChannelId\n    preferredModel\n    createdAt\n    updatedAt\n    childBots {\n      __typename\n      nextToken\n    }\n    botActions {\n      __typename\n      nextToken\n    }\n  }\n}";
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
