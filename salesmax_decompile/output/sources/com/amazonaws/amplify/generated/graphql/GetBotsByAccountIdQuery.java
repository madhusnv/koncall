package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelChatBotFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetBotsByAccountIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetBotsByAccountId($accountId: ID, $botType: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatBotFilterInput, $limit: Int, $nextToken: String) {\n  getBotsByAccountId(accountId: $accountId, botType: $botType, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      nickName\n      description\n      intent\n      botType\n      userContext\n      systemContext\n      generatedPrompt\n      fallBackResponse\n      status\n      linkedFiles\n      createdById\n      updatedById\n      testChannelId\n      preferredModel\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetBotsByAccountId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetBotsByAccountId($accountId: ID, $botType: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatBotFilterInput, $limit: Int, $nextToken: String) {\n  getBotsByAccountId(accountId: $accountId, botType: $botType, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      nickName\n      description\n      intent\n      botType\n      userContext\n      systemContext\n      generatedPrompt\n      fallBackResponse\n      status\n      linkedFiles\n      createdById\n      updatedById\n      testChannelId\n      preferredModel\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelStringKeyConditionInput botType;
        private ModelChatBotFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder botType(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.botType = modelStringKeyConditionInput;
            return this;
        }

        public GetBotsByAccountIdQuery build() {
            return new GetBotsByAccountIdQuery(this.accountId, this.botType, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelChatBotFilterInput modelChatBotFilterInput) {
            this.filter = modelChatBotFilterInput;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder nextToken(String str) {
            this.nextToken = str;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getBotsByAccountId", "getBotsByAccountId", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("botType", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "botType").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetBotsByAccountId getBotsByAccountId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetBotsByAccountId.Mapper getBotsByAccountIdFieldMapper = new GetBotsByAccountId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetBotsByAccountId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetBotsByAccountId>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetBotsByAccountId read(ResponseReader responseReader2) {
                        return Mapper.this.getBotsByAccountIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetBotsByAccountId getBotsByAccountId) {
            this.getBotsByAccountId = getBotsByAccountId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetBotsByAccountId getBotsByAccountId = this.getBotsByAccountId;
            GetBotsByAccountId getBotsByAccountId2 = ((Data) obj).getBotsByAccountId;
            return getBotsByAccountId == null ? getBotsByAccountId2 == null : getBotsByAccountId.equals(getBotsByAccountId2);
        }

        public GetBotsByAccountId getBotsByAccountId() {
            return this.getBotsByAccountId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetBotsByAccountId getBotsByAccountId = this.getBotsByAccountId;
                this.$hashCode = (getBotsByAccountId == null ? 0 : getBotsByAccountId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetBotsByAccountId getBotsByAccountId = Data.this.getBotsByAccountId;
                    responseWriter.writeObject(responseField, getBotsByAccountId != null ? getBotsByAccountId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getBotsByAccountId=" + this.getBotsByAccountId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetBotsByAccountId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetBotsByAccountId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetBotsByAccountId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetBotsByAccountId.$responseFields;
                return new GetBotsByAccountId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.GetBotsByAccountId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.GetBotsByAccountId.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]));
            }
        }

        public GetBotsByAccountId(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetBotsByAccountId)) {
                return false;
            }
            GetBotsByAccountId getBotsByAccountId = (GetBotsByAccountId) obj;
            if (this.__typename.equals(getBotsByAccountId.__typename) && this.items.equals(getBotsByAccountId.items)) {
                String str = this.nextToken;
                String str2 = getBotsByAccountId.nextToken;
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
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.GetBotsByAccountId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetBotsByAccountId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetBotsByAccountId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetBotsByAccountId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.GetBotsByAccountId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetBotsByAccountId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetBotsByAccountId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Item {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String botType;
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

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readList(responseFieldArr[13], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("nickName", "nickName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("intent", "intent", null, true, Collections.emptyList()), ResponseField.forString("botType", "botType", null, true, Collections.emptyList()), ResponseField.forString("userContext", "userContext", null, true, Collections.emptyList()), ResponseField.forString("systemContext", "systemContext", null, true, Collections.emptyList()), ResponseField.forString("generatedPrompt", "generatedPrompt", null, true, Collections.emptyList()), ResponseField.forString("fallBackResponse", "fallBackResponse", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forList("linkedFiles", "linkedFiles", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("testChannelId", "testChannelId", null, true, customType, Collections.emptyList()), ResponseField.forString("preferredModel", "preferredModel", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<String> list, String str14, String str15, String str16, String str17, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = str2;
            this.accountId = str3;
            this.name = str4;
            this.nickName = str5;
            this.description = str6;
            this.intent = str7;
            this.botType = str8;
            this.userContext = str9;
            this.systemContext = str10;
            this.generatedPrompt = str11;
            this.fallBackResponse = str12;
            this.status = str13;
            this.linkedFiles = list;
            this.createdById = str14;
            this.updatedById = str15;
            this.testChannelId = str16;
            this.preferredModel = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String botType() {
            return this.botType;
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
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            List<String> list;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && ((str = this.id) != null ? str.equals(item.id) : item.id == null) && ((str2 = this.accountId) != null ? str2.equals(item.accountId) : item.accountId == null) && ((str3 = this.name) != null ? str3.equals(item.name) : item.name == null) && ((str4 = this.nickName) != null ? str4.equals(item.nickName) : item.nickName == null) && ((str5 = this.description) != null ? str5.equals(item.description) : item.description == null) && ((str6 = this.intent) != null ? str6.equals(item.intent) : item.intent == null) && ((str7 = this.botType) != null ? str7.equals(item.botType) : item.botType == null) && ((str8 = this.userContext) != null ? str8.equals(item.userContext) : item.userContext == null) && ((str9 = this.systemContext) != null ? str9.equals(item.systemContext) : item.systemContext == null) && ((str10 = this.generatedPrompt) != null ? str10.equals(item.generatedPrompt) : item.generatedPrompt == null) && ((str11 = this.fallBackResponse) != null ? str11.equals(item.fallBackResponse) : item.fallBackResponse == null) && ((str12 = this.status) != null ? str12.equals(item.status) : item.status == null) && ((list = this.linkedFiles) != null ? list.equals(item.linkedFiles) : item.linkedFiles == null) && ((str13 = this.createdById) != null ? str13.equals(item.createdById) : item.createdById == null) && ((str14 = this.updatedById) != null ? str14.equals(item.updatedById) : item.updatedById == null) && ((str15 = this.testChannelId) != null ? str15.equals(item.testChannelId) : item.testChannelId == null) && ((str16 = this.preferredModel) != null ? str16.equals(item.preferredModel) : item.preferredModel == null) && ((str17 = this.createdAt) != null ? str17.equals(item.createdAt) : item.createdAt == null)) {
                String str18 = this.updatedAt;
                String str19 = item.updatedAt;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
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
                String str8 = this.userContext;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.systemContext;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.generatedPrompt;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.fallBackResponse;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.status;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list = this.linkedFiles;
                int iHashCode14 = (iHashCode13 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str13 = this.createdById;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.updatedById;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.testChannelId;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.preferredModel;
                int iHashCode18 = (iHashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdAt;
                int iHashCode19 = (iHashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedAt;
                this.$hashCode = iHashCode19 ^ (str18 != null ? str18.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.name);
                    responseWriter.writeString(responseFieldArr[4], Item.this.nickName);
                    responseWriter.writeString(responseFieldArr[5], Item.this.description);
                    responseWriter.writeString(responseFieldArr[6], Item.this.intent);
                    responseWriter.writeString(responseFieldArr[7], Item.this.botType);
                    responseWriter.writeString(responseFieldArr[8], Item.this.userContext);
                    responseWriter.writeString(responseFieldArr[9], Item.this.systemContext);
                    responseWriter.writeString(responseFieldArr[10], Item.this.generatedPrompt);
                    responseWriter.writeString(responseFieldArr[11], Item.this.fallBackResponse);
                    responseWriter.writeString(responseFieldArr[12], Item.this.status);
                    responseWriter.writeList(responseFieldArr[13], Item.this.linkedFiles, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.testChannelId);
                    responseWriter.writeString(responseFieldArr[17], Item.this.preferredModel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.updatedAt);
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
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", nickName=" + this.nickName + ", description=" + this.description + ", intent=" + this.intent + ", botType=" + this.botType + ", userContext=" + this.userContext + ", systemContext=" + this.systemContext + ", generatedPrompt=" + this.generatedPrompt + ", fallBackResponse=" + this.fallBackResponse + ", status=" + this.status + ", linkedFiles=" + this.linkedFiles + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", testChannelId=" + this.testChannelId + ", preferredModel=" + this.preferredModel + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        private final String accountId;
        private final ModelStringKeyConditionInput botType;
        private final ModelChatBotFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelChatBotFilterInput modelChatBotFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.botType = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelChatBotFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("botType", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelChatBotFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelStringKeyConditionInput botType() {
            return this.botType;
        }

        public ModelChatBotFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBotsByAccountIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("botType", Variables.this.botType != null ? Variables.this.botType.marshaller() : null);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetBotsByAccountIdQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelChatBotFilterInput modelChatBotFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelChatBotFilterInput, num, str2);
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
        return "d2a4868cba82a46cfcdd0f8e50c69c576f7944ed552b0145b42d327ada440019";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetBotsByAccountId($accountId: ID, $botType: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelChatBotFilterInput, $limit: Int, $nextToken: String) {\n  getBotsByAccountId(accountId: $accountId, botType: $botType, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      nickName\n      description\n      intent\n      botType\n      userContext\n      systemContext\n      generatedPrompt\n      fallBackResponse\n      status\n      linkedFiles\n      createdById\n      updatedById\n      testChannelId\n      preferredModel\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
