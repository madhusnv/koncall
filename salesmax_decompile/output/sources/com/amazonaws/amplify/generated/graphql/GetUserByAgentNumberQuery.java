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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.C19075x32ad419c;
import type.CustomType;
import type.ModelCloudTelephonyUserFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetUserByAgentNumberQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetUserByAgentNumber($accountId: ID, $agentNumberProviderName: ModelCloudTelephonyUserUserByAgentNumberCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudTelephonyUserFilterInput, $limit: Int, $nextToken: String) {\n  getUserByAgentNumber(accountId: $accountId, agentNumberProviderName: $agentNumberProviderName, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      userId\n      remoteUserId\n      accountId\n      cloudTelephonyAccount\n      agentNumber\n      agentId\n      providerName\n      agentStatus\n      ouboundEnabled\n      allowedOutboundNumbers\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetUserByAgentNumber";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetUserByAgentNumber($accountId: ID, $agentNumberProviderName: ModelCloudTelephonyUserUserByAgentNumberCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudTelephonyUserFilterInput, $limit: Int, $nextToken: String) {\n  getUserByAgentNumber(accountId: $accountId, agentNumberProviderName: $agentNumberProviderName, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      userId\n      remoteUserId\n      accountId\n      cloudTelephonyAccount\n      agentNumber\n      agentId\n      providerName\n      agentStatus\n      ouboundEnabled\n      allowedOutboundNumbers\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private C19075x32ad419c agentNumberProviderName;
        private ModelCloudTelephonyUserFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder agentNumberProviderName(C19075x32ad419c c19075x32ad419c) {
            this.agentNumberProviderName = c19075x32ad419c;
            return this;
        }

        public GetUserByAgentNumberQuery build() {
            return new GetUserByAgentNumberQuery(this.accountId, this.agentNumberProviderName, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelCloudTelephonyUserFilterInput modelCloudTelephonyUserFilterInput) {
            this.filter = modelCloudTelephonyUserFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getUserByAgentNumber", "getUserByAgentNumber", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("agentNumberProviderName", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "agentNumberProviderName").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetUserByAgentNumber getUserByAgentNumber;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetUserByAgentNumber.Mapper getUserByAgentNumberFieldMapper = new GetUserByAgentNumber.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetUserByAgentNumber) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetUserByAgentNumber>() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetUserByAgentNumber read(ResponseReader responseReader2) {
                        return Mapper.this.getUserByAgentNumberFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetUserByAgentNumber getUserByAgentNumber) {
            this.getUserByAgentNumber = getUserByAgentNumber;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetUserByAgentNumber getUserByAgentNumber = this.getUserByAgentNumber;
            GetUserByAgentNumber getUserByAgentNumber2 = ((Data) obj).getUserByAgentNumber;
            return getUserByAgentNumber == null ? getUserByAgentNumber2 == null : getUserByAgentNumber.equals(getUserByAgentNumber2);
        }

        public GetUserByAgentNumber getUserByAgentNumber() {
            return this.getUserByAgentNumber;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetUserByAgentNumber getUserByAgentNumber = this.getUserByAgentNumber;
                this.$hashCode = (getUserByAgentNumber == null ? 0 : getUserByAgentNumber.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetUserByAgentNumber getUserByAgentNumber = Data.this.getUserByAgentNumber;
                    responseWriter.writeObject(responseField, getUserByAgentNumber != null ? getUserByAgentNumber.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getUserByAgentNumber=" + this.getUserByAgentNumber + "}";
            }
            return this.$toString;
        }
    }

    public static class GetUserByAgentNumber {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetUserByAgentNumber> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetUserByAgentNumber map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetUserByAgentNumber.$responseFields;
                return new GetUserByAgentNumber(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.GetUserByAgentNumber.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.GetUserByAgentNumber.Mapper.1.1
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

        public GetUserByAgentNumber(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetUserByAgentNumber)) {
                return false;
            }
            GetUserByAgentNumber getUserByAgentNumber = (GetUserByAgentNumber) obj;
            if (this.__typename.equals(getUserByAgentNumber.__typename) && this.items.equals(getUserByAgentNumber.items)) {
                String str = this.nextToken;
                String str2 = getUserByAgentNumber.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.GetUserByAgentNumber.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetUserByAgentNumber.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetUserByAgentNumber.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetUserByAgentNumber.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.GetUserByAgentNumber.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetUserByAgentNumber.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetUserByAgentNumber{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String agentId;
        final String agentNumber;
        final String agentStatus;
        final List<String> allowedOutboundNumbers;
        final String cloudTelephonyAccount;
        final String createdAt;
        final String createdById;
        final String id;
        final Boolean ouboundEnabled;
        final String providerName;
        final String remoteUserId;
        final String updatedAt;
        final String updatedById;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readBoolean(responseFieldArr[10]), responseReader.readList(responseFieldArr[11], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forString("remoteUserId", "remoteUserId", null, true, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("cloudTelephonyAccount", "cloudTelephonyAccount", null, true, customType, Collections.emptyList()), ResponseField.forString("agentNumber", "agentNumber", null, true, Collections.emptyList()), ResponseField.forString("agentId", "agentId", null, true, Collections.emptyList()), ResponseField.forString("providerName", "providerName", null, true, Collections.emptyList()), ResponseField.forString("agentStatus", "agentStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("ouboundEnabled", "ouboundEnabled", null, true, Collections.emptyList()), ResponseField.forList("allowedOutboundNumbers", "allowedOutboundNumbers", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, List<String> list, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.userId = str3;
            this.remoteUserId = str4;
            this.accountId = (String) Utils.checkNotNull(str5, "accountId == null");
            this.cloudTelephonyAccount = str6;
            this.agentNumber = str7;
            this.agentId = str8;
            this.providerName = str9;
            this.agentStatus = str10;
            this.ouboundEnabled = bool;
            this.allowedOutboundNumbers = list;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.createdById = str13;
            this.updatedById = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String agentId() {
            return this.agentId;
        }

        public String agentNumber() {
            return this.agentNumber;
        }

        public String agentStatus() {
            return this.agentStatus;
        }

        public List<String> allowedOutboundNumbers() {
            return this.allowedOutboundNumbers;
        }

        public String cloudTelephonyAccount() {
            return this.cloudTelephonyAccount;
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
            Boolean bool;
            List<String> list;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && ((str = this.userId) != null ? str.equals(item.userId) : item.userId == null) && ((str2 = this.remoteUserId) != null ? str2.equals(item.remoteUserId) : item.remoteUserId == null) && this.accountId.equals(item.accountId) && ((str3 = this.cloudTelephonyAccount) != null ? str3.equals(item.cloudTelephonyAccount) : item.cloudTelephonyAccount == null) && ((str4 = this.agentNumber) != null ? str4.equals(item.agentNumber) : item.agentNumber == null) && ((str5 = this.agentId) != null ? str5.equals(item.agentId) : item.agentId == null) && ((str6 = this.providerName) != null ? str6.equals(item.providerName) : item.providerName == null) && ((str7 = this.agentStatus) != null ? str7.equals(item.agentStatus) : item.agentStatus == null) && ((bool = this.ouboundEnabled) != null ? bool.equals(item.ouboundEnabled) : item.ouboundEnabled == null) && ((list = this.allowedOutboundNumbers) != null ? list.equals(item.allowedOutboundNumbers) : item.allowedOutboundNumbers == null) && ((str8 = this.createdAt) != null ? str8.equals(item.createdAt) : item.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(item.updatedAt) : item.updatedAt == null) && ((str10 = this.createdById) != null ? str10.equals(item.createdById) : item.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = item.updatedById;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.userId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.remoteUserId;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str3 = this.cloudTelephonyAccount;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.agentNumber;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.agentId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.providerName;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.agentStatus;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                Boolean bool = this.ouboundEnabled;
                int iHashCode9 = (iHashCode8 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                List<String> list = this.allowedOutboundNumbers;
                int iHashCode10 = (iHashCode9 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdById;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedById;
                this.$hashCode = iHashCode13 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.userId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.remoteUserId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.cloudTelephonyAccount);
                    responseWriter.writeString(responseFieldArr[6], Item.this.agentNumber);
                    responseWriter.writeString(responseFieldArr[7], Item.this.agentId);
                    responseWriter.writeString(responseFieldArr[8], Item.this.providerName);
                    responseWriter.writeString(responseFieldArr[9], Item.this.agentStatus);
                    responseWriter.writeBoolean(responseFieldArr[10], Item.this.ouboundEnabled);
                    responseWriter.writeList(responseFieldArr[11], Item.this.allowedOutboundNumbers, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedById);
                }
            };
        }

        public Boolean ouboundEnabled() {
            return this.ouboundEnabled;
        }

        public String providerName() {
            return this.providerName;
        }

        public String remoteUserId() {
            return this.remoteUserId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", userId=" + this.userId + ", remoteUserId=" + this.remoteUserId + ", accountId=" + this.accountId + ", cloudTelephonyAccount=" + this.cloudTelephonyAccount + ", agentNumber=" + this.agentNumber + ", agentId=" + this.agentId + ", providerName=" + this.providerName + ", agentStatus=" + this.agentStatus + ", ouboundEnabled=" + this.ouboundEnabled + ", allowedOutboundNumbers=" + this.allowedOutboundNumbers + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final C19075x32ad419c agentNumberProviderName;
        private final ModelCloudTelephonyUserFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, C19075x32ad419c c19075x32ad419c, ModelSortDirection modelSortDirection, ModelCloudTelephonyUserFilterInput modelCloudTelephonyUserFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.agentNumberProviderName = c19075x32ad419c;
            this.sortDirection = modelSortDirection;
            this.filter = modelCloudTelephonyUserFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("agentNumberProviderName", c19075x32ad419c);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelCloudTelephonyUserFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public C19075x32ad419c agentNumberProviderName() {
            return this.agentNumberProviderName;
        }

        public ModelCloudTelephonyUserFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetUserByAgentNumberQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("agentNumberProviderName", Variables.this.agentNumberProviderName != null ? Variables.this.agentNumberProviderName.marshaller() : null);
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

    public GetUserByAgentNumberQuery(String str, C19075x32ad419c c19075x32ad419c, ModelSortDirection modelSortDirection, ModelCloudTelephonyUserFilterInput modelCloudTelephonyUserFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, c19075x32ad419c, modelSortDirection, modelCloudTelephonyUserFilterInput, num, str2);
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
        return "ccc4124251b0ea71198cac29ea72d1a963d42dfe062c01df83b876aa838602ef";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetUserByAgentNumber($accountId: ID, $agentNumberProviderName: ModelCloudTelephonyUserUserByAgentNumberCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudTelephonyUserFilterInput, $limit: Int, $nextToken: String) {\n  getUserByAgentNumber(accountId: $accountId, agentNumberProviderName: $agentNumberProviderName, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      userId\n      remoteUserId\n      accountId\n      cloudTelephonyAccount\n      agentNumber\n      agentId\n      providerName\n      agentStatus\n      ouboundEnabled\n      allowedOutboundNumbers\n      createdAt\n      updatedAt\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
