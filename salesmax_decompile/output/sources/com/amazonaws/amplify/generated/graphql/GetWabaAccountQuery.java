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

/* loaded from: classes7.dex */
public final class GetWabaAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetWabaAccount($id: ID!) {\n  getWabaAccount(id: $id) {\n    __typename\n    id\n    wabaAccountId\n    wabaAccountName\n    accessToken\n    accountId\n    remainingFreeTierConversationsOverall\n    remainingBalanceOverall\n    remainingBalanceBroadcast\n    blockedBalanceOverall\n    blockedBalanceBroadcast\n    promptForPaymentThreshold\n    createdAt\n    updatedAt\n    currentLimitCategory\n    maxDailyConversationPerPhone\n    maxPhoneNumbersPerBusiness\n    maxPhoneNumbersPerWaba\n    restrictionInfo {\n      __typename\n      restrictionType\n      restrictionExpiry\n    }\n    wabaBanState\n    wabaBanDate\n    wabaDecision\n    wabaDecisionTime\n    rejectionReason\n    createdById\n    updatedById\n    wabaPhoneNumbers {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetWabaAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetWabaAccount($id: ID!) {\n  getWabaAccount(id: $id) {\n    __typename\n    id\n    wabaAccountId\n    wabaAccountName\n    accessToken\n    accountId\n    remainingFreeTierConversationsOverall\n    remainingBalanceOverall\n    remainingBalanceBroadcast\n    blockedBalanceOverall\n    blockedBalanceBroadcast\n    promptForPaymentThreshold\n    createdAt\n    updatedAt\n    currentLimitCategory\n    maxDailyConversationPerPhone\n    maxPhoneNumbersPerBusiness\n    maxPhoneNumbersPerWaba\n    restrictionInfo {\n      __typename\n      restrictionType\n      restrictionExpiry\n    }\n    wabaBanState\n    wabaBanDate\n    wabaDecision\n    wabaDecisionTime\n    rejectionReason\n    createdById\n    updatedById\n    wabaPhoneNumbers {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetWabaAccountQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetWabaAccountQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getWabaAccount", "getWabaAccount", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetWabaAccount getWabaAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetWabaAccount.Mapper getWabaAccountFieldMapper = new GetWabaAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetWabaAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetWabaAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetWabaAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getWabaAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetWabaAccount getWabaAccount) {
            this.getWabaAccount = getWabaAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetWabaAccount getWabaAccount = this.getWabaAccount;
            GetWabaAccount getWabaAccount2 = ((Data) obj).getWabaAccount;
            return getWabaAccount == null ? getWabaAccount2 == null : getWabaAccount.equals(getWabaAccount2);
        }

        public GetWabaAccount getWabaAccount() {
            return this.getWabaAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetWabaAccount getWabaAccount = this.getWabaAccount;
                this.$hashCode = (getWabaAccount == null ? 0 : getWabaAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetWabaAccount getWabaAccount = Data.this.getWabaAccount;
                    responseWriter.writeObject(responseField, getWabaAccount != null ? getWabaAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getWabaAccount=" + this.getWabaAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetWabaAccount {
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
        final List<RestrictionInfo> restrictionInfo;
        final String updatedAt;
        final String updatedById;
        final String wabaAccountId;
        final String wabaAccountName;
        final String wabaBanDate;
        final String wabaBanState;
        final String wabaDecision;
        final String wabaDecisionTime;
        final WabaPhoneNumbers wabaPhoneNumbers;

        public static final class Mapper implements ResponseFieldMapper<GetWabaAccount> {
            final RestrictionInfo.Mapper restrictionInfoFieldMapper = new RestrictionInfo.Mapper();
            final WabaPhoneNumbers.Mapper wabaPhoneNumbersFieldMapper = new WabaPhoneNumbers.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetWabaAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetWabaAccount.$responseFields;
                return new GetWabaAccount(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), responseReader.readDouble(responseFieldArr[7]), responseReader.readDouble(responseFieldArr[8]), responseReader.readDouble(responseFieldArr[9]), responseReader.readDouble(responseFieldArr[10]), responseReader.readDouble(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readInt(responseFieldArr[15]), responseReader.readInt(responseFieldArr[16]), responseReader.readInt(responseFieldArr[17]), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<RestrictionInfo>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.GetWabaAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public RestrictionInfo read(ResponseReader.ListItemReader listItemReader) {
                        return (RestrictionInfo) listItemReader.readObject(new ResponseReader.ObjectReader<RestrictionInfo>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.GetWabaAccount.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public RestrictionInfo read(ResponseReader responseReader2) {
                                return Mapper.this.restrictionInfoFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (WabaPhoneNumbers) responseReader.readObject(responseFieldArr[26], new ResponseReader.ObjectReader<WabaPhoneNumbers>() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.GetWabaAccount.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public WabaPhoneNumbers read(ResponseReader responseReader2) {
                        return Mapper.this.wabaPhoneNumbersFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, false, customType, Collections.emptyList()), ResponseField.forString("wabaAccountName", "wabaAccountName", null, true, Collections.emptyList()), ResponseField.forString("accessToken", "accessToken", null, true, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forInt("remainingFreeTierConversationsOverall", "remainingFreeTierConversationsOverall", null, true, Collections.emptyList()), ResponseField.forDouble("remainingBalanceOverall", "remainingBalanceOverall", null, true, Collections.emptyList()), ResponseField.forDouble("remainingBalanceBroadcast", "remainingBalanceBroadcast", null, true, Collections.emptyList()), ResponseField.forDouble("blockedBalanceOverall", "blockedBalanceOverall", null, true, Collections.emptyList()), ResponseField.forDouble("blockedBalanceBroadcast", "blockedBalanceBroadcast", null, true, Collections.emptyList()), ResponseField.forDouble("promptForPaymentThreshold", "promptForPaymentThreshold", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("currentLimitCategory", "currentLimitCategory", null, true, Collections.emptyList()), ResponseField.forInt("maxDailyConversationPerPhone", "maxDailyConversationPerPhone", null, true, Collections.emptyList()), ResponseField.forInt("maxPhoneNumbersPerBusiness", "maxPhoneNumbersPerBusiness", null, true, Collections.emptyList()), ResponseField.forInt("maxPhoneNumbersPerWaba", "maxPhoneNumbersPerWaba", null, true, Collections.emptyList()), ResponseField.forList("restrictionInfo", "restrictionInfo", null, true, Collections.emptyList()), ResponseField.forString("wabaBanState", "wabaBanState", null, true, Collections.emptyList()), ResponseField.forCustomType("wabaBanDate", "wabaBanDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("wabaDecision", "wabaDecision", null, true, Collections.emptyList()), ResponseField.forCustomType("wabaDecisionTime", "wabaDecisionTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("rejectionReason", "rejectionReason", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forObject("wabaPhoneNumbers", "wabaPhoneNumbers", null, true, Collections.emptyList())};
        }

        public GetWabaAccount(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, String str7, String str8, String str9, Integer num2, Integer num3, Integer num4, List<RestrictionInfo> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, WabaPhoneNumbers wabaPhoneNumbers) {
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
            this.restrictionInfo = list;
            this.wabaBanState = str10;
            this.wabaBanDate = str11;
            this.wabaDecision = str12;
            this.wabaDecisionTime = str13;
            this.rejectionReason = str14;
            this.createdById = str15;
            this.updatedById = str16;
            this.wabaPhoneNumbers = wabaPhoneNumbers;
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
            List<RestrictionInfo> list;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetWabaAccount)) {
                return false;
            }
            GetWabaAccount getWabaAccount = (GetWabaAccount) obj;
            if (this.__typename.equals(getWabaAccount.__typename) && this.id.equals(getWabaAccount.id) && this.wabaAccountId.equals(getWabaAccount.wabaAccountId) && ((str = this.wabaAccountName) != null ? str.equals(getWabaAccount.wabaAccountName) : getWabaAccount.wabaAccountName == null) && ((str2 = this.accessToken) != null ? str2.equals(getWabaAccount.accessToken) : getWabaAccount.accessToken == null) && this.accountId.equals(getWabaAccount.accountId) && ((num = this.remainingFreeTierConversationsOverall) != null ? num.equals(getWabaAccount.remainingFreeTierConversationsOverall) : getWabaAccount.remainingFreeTierConversationsOverall == null) && ((d = this.remainingBalanceOverall) != null ? d.equals(getWabaAccount.remainingBalanceOverall) : getWabaAccount.remainingBalanceOverall == null) && ((d2 = this.remainingBalanceBroadcast) != null ? d2.equals(getWabaAccount.remainingBalanceBroadcast) : getWabaAccount.remainingBalanceBroadcast == null) && ((d3 = this.blockedBalanceOverall) != null ? d3.equals(getWabaAccount.blockedBalanceOverall) : getWabaAccount.blockedBalanceOverall == null) && ((d4 = this.blockedBalanceBroadcast) != null ? d4.equals(getWabaAccount.blockedBalanceBroadcast) : getWabaAccount.blockedBalanceBroadcast == null) && ((d5 = this.promptForPaymentThreshold) != null ? d5.equals(getWabaAccount.promptForPaymentThreshold) : getWabaAccount.promptForPaymentThreshold == null) && ((str3 = this.createdAt) != null ? str3.equals(getWabaAccount.createdAt) : getWabaAccount.createdAt == null) && ((str4 = this.updatedAt) != null ? str4.equals(getWabaAccount.updatedAt) : getWabaAccount.updatedAt == null) && ((str5 = this.currentLimitCategory) != null ? str5.equals(getWabaAccount.currentLimitCategory) : getWabaAccount.currentLimitCategory == null) && ((num2 = this.maxDailyConversationPerPhone) != null ? num2.equals(getWabaAccount.maxDailyConversationPerPhone) : getWabaAccount.maxDailyConversationPerPhone == null) && ((num3 = this.maxPhoneNumbersPerBusiness) != null ? num3.equals(getWabaAccount.maxPhoneNumbersPerBusiness) : getWabaAccount.maxPhoneNumbersPerBusiness == null) && ((num4 = this.maxPhoneNumbersPerWaba) != null ? num4.equals(getWabaAccount.maxPhoneNumbersPerWaba) : getWabaAccount.maxPhoneNumbersPerWaba == null) && ((list = this.restrictionInfo) != null ? list.equals(getWabaAccount.restrictionInfo) : getWabaAccount.restrictionInfo == null) && ((str6 = this.wabaBanState) != null ? str6.equals(getWabaAccount.wabaBanState) : getWabaAccount.wabaBanState == null) && ((str7 = this.wabaBanDate) != null ? str7.equals(getWabaAccount.wabaBanDate) : getWabaAccount.wabaBanDate == null) && ((str8 = this.wabaDecision) != null ? str8.equals(getWabaAccount.wabaDecision) : getWabaAccount.wabaDecision == null) && ((str9 = this.wabaDecisionTime) != null ? str9.equals(getWabaAccount.wabaDecisionTime) : getWabaAccount.wabaDecisionTime == null) && ((str10 = this.rejectionReason) != null ? str10.equals(getWabaAccount.rejectionReason) : getWabaAccount.rejectionReason == null) && ((str11 = this.createdById) != null ? str11.equals(getWabaAccount.createdById) : getWabaAccount.createdById == null) && ((str12 = this.updatedById) != null ? str12.equals(getWabaAccount.updatedById) : getWabaAccount.updatedById == null)) {
                WabaPhoneNumbers wabaPhoneNumbers = this.wabaPhoneNumbers;
                WabaPhoneNumbers wabaPhoneNumbers2 = getWabaAccount.wabaPhoneNumbers;
                if (wabaPhoneNumbers == null) {
                    if (wabaPhoneNumbers2 == null) {
                        return true;
                    }
                } else if (wabaPhoneNumbers.equals(wabaPhoneNumbers2)) {
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
                List<RestrictionInfo> list = this.restrictionInfo;
                int iHashCode16 = (iHashCode15 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.wabaBanState;
                int iHashCode17 = (iHashCode16 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.wabaBanDate;
                int iHashCode18 = (iHashCode17 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.wabaDecision;
                int iHashCode19 = (iHashCode18 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.wabaDecisionTime;
                int iHashCode20 = (iHashCode19 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.rejectionReason;
                int iHashCode21 = (iHashCode20 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.updatedById;
                int iHashCode23 = (iHashCode22 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                WabaPhoneNumbers wabaPhoneNumbers = this.wabaPhoneNumbers;
                this.$hashCode = iHashCode23 ^ (wabaPhoneNumbers != null ? wabaPhoneNumbers.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.GetWabaAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetWabaAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetWabaAccount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetWabaAccount.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetWabaAccount.this.wabaAccountId);
                    responseWriter.writeString(responseFieldArr[3], GetWabaAccount.this.wabaAccountName);
                    responseWriter.writeString(responseFieldArr[4], GetWabaAccount.this.accessToken);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], GetWabaAccount.this.accountId);
                    responseWriter.writeInt(responseFieldArr[6], GetWabaAccount.this.remainingFreeTierConversationsOverall);
                    responseWriter.writeDouble(responseFieldArr[7], GetWabaAccount.this.remainingBalanceOverall);
                    responseWriter.writeDouble(responseFieldArr[8], GetWabaAccount.this.remainingBalanceBroadcast);
                    responseWriter.writeDouble(responseFieldArr[9], GetWabaAccount.this.blockedBalanceOverall);
                    responseWriter.writeDouble(responseFieldArr[10], GetWabaAccount.this.blockedBalanceBroadcast);
                    responseWriter.writeDouble(responseFieldArr[11], GetWabaAccount.this.promptForPaymentThreshold);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], GetWabaAccount.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], GetWabaAccount.this.updatedAt);
                    responseWriter.writeString(responseFieldArr[14], GetWabaAccount.this.currentLimitCategory);
                    responseWriter.writeInt(responseFieldArr[15], GetWabaAccount.this.maxDailyConversationPerPhone);
                    responseWriter.writeInt(responseFieldArr[16], GetWabaAccount.this.maxPhoneNumbersPerBusiness);
                    responseWriter.writeInt(responseFieldArr[17], GetWabaAccount.this.maxPhoneNumbersPerWaba);
                    responseWriter.writeList(responseFieldArr[18], GetWabaAccount.this.restrictionInfo, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.GetWabaAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((RestrictionInfo) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[19], GetWabaAccount.this.wabaBanState);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], GetWabaAccount.this.wabaBanDate);
                    responseWriter.writeString(responseFieldArr[21], GetWabaAccount.this.wabaDecision);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], GetWabaAccount.this.wabaDecisionTime);
                    responseWriter.writeString(responseFieldArr[23], GetWabaAccount.this.rejectionReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], GetWabaAccount.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], GetWabaAccount.this.updatedById);
                    ResponseField responseField = responseFieldArr[26];
                    WabaPhoneNumbers wabaPhoneNumbers = GetWabaAccount.this.wabaPhoneNumbers;
                    responseWriter.writeObject(responseField, wabaPhoneNumbers != null ? wabaPhoneNumbers.marshaller() : null);
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

        public List<RestrictionInfo> restrictionInfo() {
            return this.restrictionInfo;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetWabaAccount{__typename=" + this.__typename + ", id=" + this.id + ", wabaAccountId=" + this.wabaAccountId + ", wabaAccountName=" + this.wabaAccountName + ", accessToken=" + this.accessToken + ", accountId=" + this.accountId + ", remainingFreeTierConversationsOverall=" + this.remainingFreeTierConversationsOverall + ", remainingBalanceOverall=" + this.remainingBalanceOverall + ", remainingBalanceBroadcast=" + this.remainingBalanceBroadcast + ", blockedBalanceOverall=" + this.blockedBalanceOverall + ", blockedBalanceBroadcast=" + this.blockedBalanceBroadcast + ", promptForPaymentThreshold=" + this.promptForPaymentThreshold + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", currentLimitCategory=" + this.currentLimitCategory + ", maxDailyConversationPerPhone=" + this.maxDailyConversationPerPhone + ", maxPhoneNumbersPerBusiness=" + this.maxPhoneNumbersPerBusiness + ", maxPhoneNumbersPerWaba=" + this.maxPhoneNumbersPerWaba + ", restrictionInfo=" + this.restrictionInfo + ", wabaBanState=" + this.wabaBanState + ", wabaBanDate=" + this.wabaBanDate + ", wabaDecision=" + this.wabaDecision + ", wabaDecisionTime=" + this.wabaDecisionTime + ", rejectionReason=" + this.rejectionReason + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", wabaPhoneNumbers=" + this.wabaPhoneNumbers + "}";
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

        public WabaPhoneNumbers wabaPhoneNumbers() {
            return this.wabaPhoneNumbers;
        }
    }

    public static class RestrictionInfo {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("restrictionType", "restrictionType", null, true, Collections.emptyList()), ResponseField.forCustomType("restrictionExpiry", "restrictionExpiry", null, true, CustomType.AWSDATETIME, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String restrictionExpiry;
        final String restrictionType;

        public static final class Mapper implements ResponseFieldMapper<RestrictionInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public RestrictionInfo map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = RestrictionInfo.$responseFields;
                return new RestrictionInfo(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]));
            }
        }

        public RestrictionInfo(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.restrictionType = str2;
            this.restrictionExpiry = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RestrictionInfo)) {
                return false;
            }
            RestrictionInfo restrictionInfo = (RestrictionInfo) obj;
            if (this.__typename.equals(restrictionInfo.__typename) && ((str = this.restrictionType) != null ? str.equals(restrictionInfo.restrictionType) : restrictionInfo.restrictionType == null)) {
                String str2 = this.restrictionExpiry;
                String str3 = restrictionInfo.restrictionExpiry;
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
                String str = this.restrictionType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.restrictionExpiry;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.RestrictionInfo.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = RestrictionInfo.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], RestrictionInfo.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], RestrictionInfo.this.restrictionType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], RestrictionInfo.this.restrictionExpiry);
                }
            };
        }

        public String restrictionExpiry() {
            return this.restrictionExpiry;
        }

        public String restrictionType() {
            return this.restrictionType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RestrictionInfo{__typename=" + this.__typename + ", restrictionType=" + this.restrictionType + ", restrictionExpiry=" + this.restrictionExpiry + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String id;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.id = str;
            linkedHashMap.put(OutcomeConstants.OUTCOME_ID, str);
        }

        public String id() {
            return this.id;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, Variables.this.id);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public static class WabaPhoneNumbers {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<WabaPhoneNumbers> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public WabaPhoneNumbers map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = WabaPhoneNumbers.$responseFields;
                return new WabaPhoneNumbers(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public WabaPhoneNumbers(String str, String str2) {
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
            if (!(obj instanceof WabaPhoneNumbers)) {
                return false;
            }
            WabaPhoneNumbers wabaPhoneNumbers = (WabaPhoneNumbers) obj;
            if (this.__typename.equals(wabaPhoneNumbers.__typename)) {
                String str = this.nextToken;
                String str2 = wabaPhoneNumbers.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetWabaAccountQuery.WabaPhoneNumbers.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = WabaPhoneNumbers.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], WabaPhoneNumbers.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], WabaPhoneNumbers.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "WabaPhoneNumbers{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public GetWabaAccountQuery(String str) {
        Utils.checkNotNull(str, "id == null");
        this.variables = new Variables(str);
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
        return "f3efb4ff6ed0c77fcf2c281e173580d893010867d0c5d186677f9ed4831f914a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetWabaAccount($id: ID!) {\n  getWabaAccount(id: $id) {\n    __typename\n    id\n    wabaAccountId\n    wabaAccountName\n    accessToken\n    accountId\n    remainingFreeTierConversationsOverall\n    remainingBalanceOverall\n    remainingBalanceBroadcast\n    blockedBalanceOverall\n    blockedBalanceBroadcast\n    promptForPaymentThreshold\n    createdAt\n    updatedAt\n    currentLimitCategory\n    maxDailyConversationPerPhone\n    maxPhoneNumbersPerBusiness\n    maxPhoneNumbersPerWaba\n    restrictionInfo {\n      __typename\n      restrictionType\n      restrictionExpiry\n    }\n    wabaBanState\n    wabaBanDate\n    wabaDecision\n    wabaDecisionTime\n    rejectionReason\n    createdById\n    updatedById\n    wabaPhoneNumbers {\n      __typename\n      nextToken\n    }\n  }\n}";
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
