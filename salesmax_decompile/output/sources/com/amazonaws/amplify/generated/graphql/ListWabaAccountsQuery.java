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
import type.CustomType;
import type.ModelWabaAccountFilterInput;

/* loaded from: classes4.dex */
public final class ListWabaAccountsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListWabaAccounts($filter: ModelWabaAccountFilterInput, $limit: Int, $nextToken: String) {\n  listWabaAccounts(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      wabaAccountId\n      wabaAccountName\n      accessToken\n      accountId\n      remainingFreeTierConversationsOverall\n      remainingBalanceOverall\n      remainingBalanceBroadcast\n      blockedBalanceOverall\n      blockedBalanceBroadcast\n      promptForPaymentThreshold\n      createdAt\n      updatedAt\n      currentLimitCategory\n      maxDailyConversationPerPhone\n      maxPhoneNumbersPerBusiness\n      maxPhoneNumbersPerWaba\n      wabaBanState\n      wabaBanDate\n      wabaDecision\n      wabaDecisionTime\n      rejectionReason\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListWabaAccounts";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListWabaAccounts($filter: ModelWabaAccountFilterInput, $limit: Int, $nextToken: String) {\n  listWabaAccounts(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      wabaAccountId\n      wabaAccountName\n      accessToken\n      accountId\n      remainingFreeTierConversationsOverall\n      remainingBalanceOverall\n      remainingBalanceBroadcast\n      blockedBalanceOverall\n      blockedBalanceBroadcast\n      promptForPaymentThreshold\n      createdAt\n      updatedAt\n      currentLimitCategory\n      maxDailyConversationPerPhone\n      maxPhoneNumbersPerBusiness\n      maxPhoneNumbersPerWaba\n      wabaBanState\n      wabaBanDate\n      wabaDecision\n      wabaDecisionTime\n      rejectionReason\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWabaAccountFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListWabaAccountsQuery build() {
            return new ListWabaAccountsQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelWabaAccountFilterInput modelWabaAccountFilterInput) {
            this.filter = modelWabaAccountFilterInput;
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
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listWabaAccounts", "listWabaAccounts", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListWabaAccounts listWabaAccounts;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListWabaAccounts.Mapper listWabaAccountsFieldMapper = new ListWabaAccounts.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListWabaAccounts) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListWabaAccounts>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListWabaAccounts read(ResponseReader responseReader2) {
                        return Mapper.this.listWabaAccountsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListWabaAccounts listWabaAccounts) {
            this.listWabaAccounts = listWabaAccounts;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListWabaAccounts listWabaAccounts = this.listWabaAccounts;
            ListWabaAccounts listWabaAccounts2 = ((Data) obj).listWabaAccounts;
            return listWabaAccounts == null ? listWabaAccounts2 == null : listWabaAccounts.equals(listWabaAccounts2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListWabaAccounts listWabaAccounts = this.listWabaAccounts;
                this.$hashCode = (listWabaAccounts == null ? 0 : listWabaAccounts.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListWabaAccounts listWabaAccounts() {
            return this.listWabaAccounts;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListWabaAccounts listWabaAccounts = Data.this.listWabaAccounts;
                    responseWriter.writeObject(responseField, listWabaAccounts != null ? listWabaAccounts.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listWabaAccounts=" + this.listWabaAccounts + "}";
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
        final String accessToken;
        final String accountId;
        final Double blockedBalanceBroadcast;
        final Double blockedBalanceOverall;
        final String createdAt;
        final String createdById;
        final String currentLimitCategory;
        final String id;
        final Integer maxDailyConversationPerPhone;
        final Integer maxPhoneNumbersPerBusiness;
        final Integer maxPhoneNumbersPerWaba;
        final Double promptForPaymentThreshold;
        final String rejectionReason;
        final Double remainingBalanceBroadcast;
        final Double remainingBalanceOverall;
        final Integer remainingFreeTierConversationsOverall;
        final String updatedAt;
        final String updatedById;
        final String wabaAccountId;
        final String wabaAccountName;
        final String wabaBanDate;
        final String wabaBanState;
        final String wabaDecision;
        final String wabaDecisionTime;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), responseReader.readDouble(responseFieldArr[7]), responseReader.readDouble(responseFieldArr[8]), responseReader.readDouble(responseFieldArr[9]), responseReader.readDouble(responseFieldArr[10]), responseReader.readDouble(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readInt(responseFieldArr[15]), responseReader.readInt(responseFieldArr[16]), responseReader.readInt(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, false, customType, Collections.emptyList()), ResponseField.forString("wabaAccountName", "wabaAccountName", null, true, Collections.emptyList()), ResponseField.forString("accessToken", "accessToken", null, true, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forInt("remainingFreeTierConversationsOverall", "remainingFreeTierConversationsOverall", null, true, Collections.emptyList()), ResponseField.forDouble("remainingBalanceOverall", "remainingBalanceOverall", null, true, Collections.emptyList()), ResponseField.forDouble("remainingBalanceBroadcast", "remainingBalanceBroadcast", null, true, Collections.emptyList()), ResponseField.forDouble("blockedBalanceOverall", "blockedBalanceOverall", null, true, Collections.emptyList()), ResponseField.forDouble("blockedBalanceBroadcast", "blockedBalanceBroadcast", null, true, Collections.emptyList()), ResponseField.forDouble("promptForPaymentThreshold", "promptForPaymentThreshold", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("currentLimitCategory", "currentLimitCategory", null, true, Collections.emptyList()), ResponseField.forInt("maxDailyConversationPerPhone", "maxDailyConversationPerPhone", null, true, Collections.emptyList()), ResponseField.forInt("maxPhoneNumbersPerBusiness", "maxPhoneNumbersPerBusiness", null, true, Collections.emptyList()), ResponseField.forInt("maxPhoneNumbersPerWaba", "maxPhoneNumbersPerWaba", null, true, Collections.emptyList()), ResponseField.forString("wabaBanState", "wabaBanState", null, true, Collections.emptyList()), ResponseField.forCustomType("wabaBanDate", "wabaBanDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("wabaDecision", "wabaDecision", null, true, Collections.emptyList()), ResponseField.forCustomType("wabaDecisionTime", "wabaDecisionTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("rejectionReason", "rejectionReason", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, String str7, String str8, String str9, Integer num2, Integer num3, Integer num4, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.wabaAccountId = (String) Utils.checkNotNull(str3, "wabaAccountId == null");
            this.wabaAccountName = str4;
            this.accessToken = str5;
            this.accountId = (String) Utils.checkNotNull(str6, "accountId == null");
            this.remainingFreeTierConversationsOverall = num;
            this.remainingBalanceOverall = d;
            this.remainingBalanceBroadcast = d2;
            this.blockedBalanceOverall = d3;
            this.blockedBalanceBroadcast = d4;
            this.promptForPaymentThreshold = d5;
            this.createdAt = str7;
            this.updatedAt = str8;
            this.currentLimitCategory = str9;
            this.maxDailyConversationPerPhone = num2;
            this.maxPhoneNumbersPerBusiness = num3;
            this.maxPhoneNumbersPerWaba = num4;
            this.wabaBanState = str10;
            this.wabaBanDate = str11;
            this.wabaDecision = str12;
            this.wabaDecisionTime = str13;
            this.rejectionReason = str14;
            this.createdById = str15;
            this.updatedById = str16;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accessToken() {
            return this.accessToken;
        }

        public String accountId() {
            return this.accountId;
        }

        public Double blockedBalanceBroadcast() {
            return this.blockedBalanceBroadcast;
        }

        public Double blockedBalanceOverall() {
            return this.blockedBalanceOverall;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String currentLimitCategory() {
            return this.currentLimitCategory;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Integer num;
            Double d;
            Double d2;
            Double d3;
            Double d4;
            Double d5;
            String str3;
            String str4;
            String str5;
            Integer num2;
            Integer num3;
            Integer num4;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.wabaAccountId.equals(item.wabaAccountId) && ((str = this.wabaAccountName) != null ? str.equals(item.wabaAccountName) : item.wabaAccountName == null) && ((str2 = this.accessToken) != null ? str2.equals(item.accessToken) : item.accessToken == null) && this.accountId.equals(item.accountId) && ((num = this.remainingFreeTierConversationsOverall) != null ? num.equals(item.remainingFreeTierConversationsOverall) : item.remainingFreeTierConversationsOverall == null) && ((d = this.remainingBalanceOverall) != null ? d.equals(item.remainingBalanceOverall) : item.remainingBalanceOverall == null) && ((d2 = this.remainingBalanceBroadcast) != null ? d2.equals(item.remainingBalanceBroadcast) : item.remainingBalanceBroadcast == null) && ((d3 = this.blockedBalanceOverall) != null ? d3.equals(item.blockedBalanceOverall) : item.blockedBalanceOverall == null) && ((d4 = this.blockedBalanceBroadcast) != null ? d4.equals(item.blockedBalanceBroadcast) : item.blockedBalanceBroadcast == null) && ((d5 = this.promptForPaymentThreshold) != null ? d5.equals(item.promptForPaymentThreshold) : item.promptForPaymentThreshold == null) && ((str3 = this.createdAt) != null ? str3.equals(item.createdAt) : item.createdAt == null) && ((str4 = this.updatedAt) != null ? str4.equals(item.updatedAt) : item.updatedAt == null) && ((str5 = this.currentLimitCategory) != null ? str5.equals(item.currentLimitCategory) : item.currentLimitCategory == null) && ((num2 = this.maxDailyConversationPerPhone) != null ? num2.equals(item.maxDailyConversationPerPhone) : item.maxDailyConversationPerPhone == null) && ((num3 = this.maxPhoneNumbersPerBusiness) != null ? num3.equals(item.maxPhoneNumbersPerBusiness) : item.maxPhoneNumbersPerBusiness == null) && ((num4 = this.maxPhoneNumbersPerWaba) != null ? num4.equals(item.maxPhoneNumbersPerWaba) : item.maxPhoneNumbersPerWaba == null) && ((str6 = this.wabaBanState) != null ? str6.equals(item.wabaBanState) : item.wabaBanState == null) && ((str7 = this.wabaBanDate) != null ? str7.equals(item.wabaBanDate) : item.wabaBanDate == null) && ((str8 = this.wabaDecision) != null ? str8.equals(item.wabaDecision) : item.wabaDecision == null) && ((str9 = this.wabaDecisionTime) != null ? str9.equals(item.wabaDecisionTime) : item.wabaDecisionTime == null) && ((str10 = this.rejectionReason) != null ? str10.equals(item.rejectionReason) : item.rejectionReason == null) && ((str11 = this.createdById) != null ? str11.equals(item.createdById) : item.createdById == null)) {
                String str12 = this.updatedById;
                String str13 = item.updatedById;
                if (str12 == null) {
                    if (str13 == null) {
                        return true;
                    }
                } else if (str12.equals(str13)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.wabaAccountId.hashCode()) * 1000003;
                String str = this.wabaAccountName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.accessToken;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                Integer num = this.remainingFreeTierConversationsOverall;
                int iHashCode4 = (iHashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Double d = this.remainingBalanceOverall;
                int iHashCode5 = (iHashCode4 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.remainingBalanceBroadcast;
                int iHashCode6 = (iHashCode5 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                Double d3 = this.blockedBalanceOverall;
                int iHashCode7 = (iHashCode6 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.blockedBalanceBroadcast;
                int iHashCode8 = (iHashCode7 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                Double d5 = this.promptForPaymentThreshold;
                int iHashCode9 = (iHashCode8 ^ (d5 == null ? 0 : d5.hashCode())) * 1000003;
                String str3 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.currentLimitCategory;
                int iHashCode12 = (iHashCode11 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num2 = this.maxDailyConversationPerPhone;
                int iHashCode13 = (iHashCode12 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.maxPhoneNumbersPerBusiness;
                int iHashCode14 = (iHashCode13 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.maxPhoneNumbersPerWaba;
                int iHashCode15 = (iHashCode14 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                String str6 = this.wabaBanState;
                int iHashCode16 = (iHashCode15 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.wabaBanDate;
                int iHashCode17 = (iHashCode16 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.wabaDecision;
                int iHashCode18 = (iHashCode17 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.wabaDecisionTime;
                int iHashCode19 = (iHashCode18 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.rejectionReason;
                int iHashCode20 = (iHashCode19 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.createdById;
                int iHashCode21 = (iHashCode20 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.updatedById;
                this.$hashCode = iHashCode21 ^ (str12 != null ? str12.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.wabaAccountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.wabaAccountName);
                    responseWriter.writeString(responseFieldArr[4], Item.this.accessToken);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.accountId);
                    responseWriter.writeInt(responseFieldArr[6], Item.this.remainingFreeTierConversationsOverall);
                    responseWriter.writeDouble(responseFieldArr[7], Item.this.remainingBalanceOverall);
                    responseWriter.writeDouble(responseFieldArr[8], Item.this.remainingBalanceBroadcast);
                    responseWriter.writeDouble(responseFieldArr[9], Item.this.blockedBalanceOverall);
                    responseWriter.writeDouble(responseFieldArr[10], Item.this.blockedBalanceBroadcast);
                    responseWriter.writeDouble(responseFieldArr[11], Item.this.promptForPaymentThreshold);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.updatedAt);
                    responseWriter.writeString(responseFieldArr[14], Item.this.currentLimitCategory);
                    responseWriter.writeInt(responseFieldArr[15], Item.this.maxDailyConversationPerPhone);
                    responseWriter.writeInt(responseFieldArr[16], Item.this.maxPhoneNumbersPerBusiness);
                    responseWriter.writeInt(responseFieldArr[17], Item.this.maxPhoneNumbersPerWaba);
                    responseWriter.writeString(responseFieldArr[18], Item.this.wabaBanState);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.wabaBanDate);
                    responseWriter.writeString(responseFieldArr[20], Item.this.wabaDecision);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.wabaDecisionTime);
                    responseWriter.writeString(responseFieldArr[22], Item.this.rejectionReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Item.this.updatedById);
                }
            };
        }

        public Integer maxDailyConversationPerPhone() {
            return this.maxDailyConversationPerPhone;
        }

        public Integer maxPhoneNumbersPerBusiness() {
            return this.maxPhoneNumbersPerBusiness;
        }

        public Integer maxPhoneNumbersPerWaba() {
            return this.maxPhoneNumbersPerWaba;
        }

        public Double promptForPaymentThreshold() {
            return this.promptForPaymentThreshold;
        }

        public String rejectionReason() {
            return this.rejectionReason;
        }

        public Double remainingBalanceBroadcast() {
            return this.remainingBalanceBroadcast;
        }

        public Double remainingBalanceOverall() {
            return this.remainingBalanceOverall;
        }

        public Integer remainingFreeTierConversationsOverall() {
            return this.remainingFreeTierConversationsOverall;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", wabaAccountId=" + this.wabaAccountId + ", wabaAccountName=" + this.wabaAccountName + ", accessToken=" + this.accessToken + ", accountId=" + this.accountId + ", remainingFreeTierConversationsOverall=" + this.remainingFreeTierConversationsOverall + ", remainingBalanceOverall=" + this.remainingBalanceOverall + ", remainingBalanceBroadcast=" + this.remainingBalanceBroadcast + ", blockedBalanceOverall=" + this.blockedBalanceOverall + ", blockedBalanceBroadcast=" + this.blockedBalanceBroadcast + ", promptForPaymentThreshold=" + this.promptForPaymentThreshold + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", currentLimitCategory=" + this.currentLimitCategory + ", maxDailyConversationPerPhone=" + this.maxDailyConversationPerPhone + ", maxPhoneNumbersPerBusiness=" + this.maxPhoneNumbersPerBusiness + ", maxPhoneNumbersPerWaba=" + this.maxPhoneNumbersPerWaba + ", wabaBanState=" + this.wabaBanState + ", wabaBanDate=" + this.wabaBanDate + ", wabaDecision=" + this.wabaDecision + ", wabaDecisionTime=" + this.wabaDecisionTime + ", rejectionReason=" + this.rejectionReason + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String wabaAccountId() {
            return this.wabaAccountId;
        }

        public String wabaAccountName() {
            return this.wabaAccountName;
        }

        public String wabaBanDate() {
            return this.wabaBanDate;
        }

        public String wabaBanState() {
            return this.wabaBanState;
        }

        public String wabaDecision() {
            return this.wabaDecision;
        }

        public String wabaDecisionTime() {
            return this.wabaDecisionTime;
        }
    }

    public static class ListWabaAccounts {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListWabaAccounts> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListWabaAccounts map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListWabaAccounts.$responseFields;
                return new ListWabaAccounts(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.ListWabaAccounts.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.ListWabaAccounts.Mapper.1.1
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

        public ListWabaAccounts(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListWabaAccounts)) {
                return false;
            }
            ListWabaAccounts listWabaAccounts = (ListWabaAccounts) obj;
            if (this.__typename.equals(listWabaAccounts.__typename) && this.items.equals(listWabaAccounts.items)) {
                String str = this.nextToken;
                String str2 = listWabaAccounts.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.ListWabaAccounts.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListWabaAccounts.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListWabaAccounts.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListWabaAccounts.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.ListWabaAccounts.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListWabaAccounts.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListWabaAccounts{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWabaAccountFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelWabaAccountFilterInput modelWabaAccountFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelWabaAccountFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelWabaAccountFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelWabaAccountFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaAccountsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListWabaAccountsQuery(ModelWabaAccountFilterInput modelWabaAccountFilterInput, Integer num, String str) {
        this.variables = new Variables(modelWabaAccountFilterInput, num, str);
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
        return "1e7ed9a3a8af5c741d54c2cab6cad3c39f17acccb57a1879d9e78d98def01291";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListWabaAccounts($filter: ModelWabaAccountFilterInput, $limit: Int, $nextToken: String) {\n  listWabaAccounts(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      wabaAccountId\n      wabaAccountName\n      accessToken\n      accountId\n      remainingFreeTierConversationsOverall\n      remainingBalanceOverall\n      remainingBalanceBroadcast\n      blockedBalanceOverall\n      blockedBalanceBroadcast\n      promptForPaymentThreshold\n      createdAt\n      updatedAt\n      currentLimitCategory\n      maxDailyConversationPerPhone\n      maxPhoneNumbersPerBusiness\n      maxPhoneNumbersPerWaba\n      wabaBanState\n      wabaBanDate\n      wabaDecision\n      wabaDecisionTime\n      rejectionReason\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
