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
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelClientAccountFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes4.dex */
public final class ListClientAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListClientAccount($accountId: ID, $clientAccountId: ModelIDKeyConditionInput, $filter: ModelClientAccountFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listClientAccount(accountId: $accountId, clientAccountId: $clientAccountId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      clientAccountId\n      clientAccountType\n      clientAccountStatus\n      clientAccountTrialEndDate\n      clientAccountTrialExtensionTimes\n      billingContactId\n      alternateBillingContactId\n      lastPendingProductAccountBillId\n      lastPaidProductAccountBillId\n      accountSalesOwnerId\n      accountSupportOwnerId\n      currentUserCount\n      freeUserCount\n      currency\n      subscriptionCreationDate\n      accountCreationDate\n      lastBilledCycleStartDate\n      lastBilledCycleEndDate\n      lastBilledDate\n      lastBilledAmmount\n      lastPaidAmount\n      lastPaymentDate\n      lastBillStatus\n      lastPaymentFollowupNote\n      lastPaymentFollowupDoneOn\n      lastPaidUserCount\n      lastBilledUserCount\n      billingPeriod\n      billCycleStartDate\n      billCycleEndDate\n      billingDate\n      paymentDueDate\n      nextBillingCycleStartDate\n      nextBillingCycleEndDate\n      nextBillingDate\n      nextPaymentDueDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListClientAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListClientAccount($accountId: ID, $clientAccountId: ModelIDKeyConditionInput, $filter: ModelClientAccountFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listClientAccount(accountId: $accountId, clientAccountId: $clientAccountId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      clientAccountId\n      clientAccountType\n      clientAccountStatus\n      clientAccountTrialEndDate\n      clientAccountTrialExtensionTimes\n      billingContactId\n      alternateBillingContactId\n      lastPendingProductAccountBillId\n      lastPaidProductAccountBillId\n      accountSalesOwnerId\n      accountSupportOwnerId\n      currentUserCount\n      freeUserCount\n      currency\n      subscriptionCreationDate\n      accountCreationDate\n      lastBilledCycleStartDate\n      lastBilledCycleEndDate\n      lastBilledDate\n      lastBilledAmmount\n      lastPaidAmount\n      lastPaymentDate\n      lastBillStatus\n      lastPaymentFollowupNote\n      lastPaymentFollowupDoneOn\n      lastPaidUserCount\n      lastBilledUserCount\n      billingPeriod\n      billCycleStartDate\n      billCycleEndDate\n      billingDate\n      paymentDueDate\n      nextBillingCycleStartDate\n      nextBillingCycleEndDate\n      nextBillingDate\n      nextPaymentDueDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelIDKeyConditionInput clientAccountId;
        private ModelClientAccountFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public ListClientAccountQuery build() {
            return new ListClientAccountQuery(this.accountId, this.clientAccountId, this.filter, this.limit, this.nextToken, this.sortDirection);
        }

        public Builder clientAccountId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.clientAccountId = modelIDKeyConditionInput;
            return this;
        }

        public Builder filter(ModelClientAccountFilterInput modelClientAccountFilterInput) {
            this.filter = modelClientAccountFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listClientAccount", "listClientAccount", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("clientAccountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "clientAccountId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListClientAccount listClientAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListClientAccount.Mapper listClientAccountFieldMapper = new ListClientAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListClientAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListClientAccount>() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListClientAccount read(ResponseReader responseReader2) {
                        return Mapper.this.listClientAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListClientAccount listClientAccount) {
            this.listClientAccount = listClientAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListClientAccount listClientAccount = this.listClientAccount;
            ListClientAccount listClientAccount2 = ((Data) obj).listClientAccount;
            return listClientAccount == null ? listClientAccount2 == null : listClientAccount.equals(listClientAccount2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListClientAccount listClientAccount = this.listClientAccount;
                this.$hashCode = (listClientAccount == null ? 0 : listClientAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListClientAccount listClientAccount() {
            return this.listClientAccount;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListClientAccount listClientAccount = Data.this.listClientAccount;
                    responseWriter.writeObject(responseField, listClientAccount != null ? listClientAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listClientAccount=" + this.listClientAccount + "}";
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
        final String accountCreationDate;
        final String accountId;
        final String accountSalesOwnerId;
        final String accountSupportOwnerId;
        final String alternateBillingContactId;
        final String billCycleEndDate;
        final String billCycleStartDate;
        final String billingContactId;
        final String billingDate;
        final String billingPeriod;
        final String clientAccountId;
        final String clientAccountStatus;
        final String clientAccountTrialEndDate;
        final Integer clientAccountTrialExtensionTimes;
        final String clientAccountType;
        final String createdAt;
        final String currency;
        final Integer currentUserCount;
        final Integer freeUserCount;
        final String lastBillStatus;
        final Integer lastBilledAmmount;
        final String lastBilledCycleEndDate;
        final String lastBilledCycleStartDate;
        final String lastBilledDate;
        final Integer lastBilledUserCount;
        final Integer lastPaidAmount;
        final String lastPaidProductAccountBillId;
        final Integer lastPaidUserCount;
        final String lastPaymentDate;
        final String lastPaymentFollowupDoneOn;
        final String lastPaymentFollowupNote;
        final String lastPendingProductAccountBillId;
        final String nextBillingCycleEndDate;
        final String nextBillingCycleStartDate;
        final String nextBillingDate;
        final String nextPaymentDueDate;
        final String paymentDueDate;
        final String subscriptionCreationDate;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readInt(responseFieldArr[13]), responseReader.readInt(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), responseReader.readString(responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), responseReader.readInt(responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("clientAccountId", "clientAccountId", null, false, customType, Collections.emptyList()), ResponseField.forString("clientAccountType", "clientAccountType", null, true, Collections.emptyList()), ResponseField.forString("clientAccountStatus", "clientAccountStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("clientAccountTrialEndDate", "clientAccountTrialEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forInt("clientAccountTrialExtensionTimes", "clientAccountTrialExtensionTimes", null, true, Collections.emptyList()), ResponseField.forCustomType("billingContactId", "billingContactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("alternateBillingContactId", "alternateBillingContactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastPendingProductAccountBillId", "lastPendingProductAccountBillId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastPaidProductAccountBillId", "lastPaidProductAccountBillId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountSalesOwnerId", "accountSalesOwnerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountSupportOwnerId", "accountSupportOwnerId", null, true, customType, Collections.emptyList()), ResponseField.forInt("currentUserCount", "currentUserCount", null, true, Collections.emptyList()), ResponseField.forInt("freeUserCount", "freeUserCount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("subscriptionCreationDate", "subscriptionCreationDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("accountCreationDate", "accountCreationDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastBilledCycleStartDate", "lastBilledCycleStartDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastBilledCycleEndDate", "lastBilledCycleEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("lastBilledDate", "lastBilledDate", null, true, customType2, Collections.emptyList()), ResponseField.forInt("lastBilledAmmount", "lastBilledAmmount", null, true, Collections.emptyList()), ResponseField.forInt("lastPaidAmount", "lastPaidAmount", null, true, Collections.emptyList()), ResponseField.forCustomType("lastPaymentDate", "lastPaymentDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastBillStatus", "lastBillStatus", null, true, Collections.emptyList()), ResponseField.forString("lastPaymentFollowupNote", "lastPaymentFollowupNote", null, true, Collections.emptyList()), ResponseField.forCustomType("lastPaymentFollowupDoneOn", "lastPaymentFollowupDoneOn", null, true, customType2, Collections.emptyList()), ResponseField.forInt("lastPaidUserCount", "lastPaidUserCount", null, true, Collections.emptyList()), ResponseField.forInt("lastBilledUserCount", "lastBilledUserCount", null, true, Collections.emptyList()), ResponseField.forString("billingPeriod", "billingPeriod", null, true, Collections.emptyList()), ResponseField.forCustomType("billCycleStartDate", "billCycleStartDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billCycleEndDate", "billCycleEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("billingDate", "billingDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("paymentDueDate", "paymentDueDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextBillingCycleStartDate", "nextBillingCycleStartDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextBillingCycleEndDate", "nextBillingCycleEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextBillingDate", "nextBillingDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextPaymentDueDate", "nextPaymentDueDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, false, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, false, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, Integer num2, Integer num3, String str13, String str14, String str15, String str16, String str17, String str18, Integer num4, Integer num5, String str19, String str20, String str21, String str22, Integer num6, Integer num7, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.clientAccountId = (String) Utils.checkNotNull(str3, "clientAccountId == null");
            this.clientAccountType = str4;
            this.clientAccountStatus = str5;
            this.clientAccountTrialEndDate = str6;
            this.clientAccountTrialExtensionTimes = num;
            this.billingContactId = str7;
            this.alternateBillingContactId = str8;
            this.lastPendingProductAccountBillId = str9;
            this.lastPaidProductAccountBillId = str10;
            this.accountSalesOwnerId = str11;
            this.accountSupportOwnerId = str12;
            this.currentUserCount = num2;
            this.freeUserCount = num3;
            this.currency = str13;
            this.subscriptionCreationDate = str14;
            this.accountCreationDate = str15;
            this.lastBilledCycleStartDate = str16;
            this.lastBilledCycleEndDate = str17;
            this.lastBilledDate = str18;
            this.lastBilledAmmount = num4;
            this.lastPaidAmount = num5;
            this.lastPaymentDate = str19;
            this.lastBillStatus = str20;
            this.lastPaymentFollowupNote = str21;
            this.lastPaymentFollowupDoneOn = str22;
            this.lastPaidUserCount = num6;
            this.lastBilledUserCount = num7;
            this.billingPeriod = str23;
            this.billCycleStartDate = str24;
            this.billCycleEndDate = str25;
            this.billingDate = str26;
            this.paymentDueDate = str27;
            this.nextBillingCycleStartDate = str28;
            this.nextBillingCycleEndDate = str29;
            this.nextBillingDate = str30;
            this.nextPaymentDueDate = str31;
            this.createdAt = (String) Utils.checkNotNull(str32, "createdAt == null");
            this.updatedAt = (String) Utils.checkNotNull(str33, "updatedAt == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountCreationDate() {
            return this.accountCreationDate;
        }

        public String accountId() {
            return this.accountId;
        }

        public String accountSalesOwnerId() {
            return this.accountSalesOwnerId;
        }

        public String accountSupportOwnerId() {
            return this.accountSupportOwnerId;
        }

        public String alternateBillingContactId() {
            return this.alternateBillingContactId;
        }

        public String billCycleEndDate() {
            return this.billCycleEndDate;
        }

        public String billCycleStartDate() {
            return this.billCycleStartDate;
        }

        public String billingContactId() {
            return this.billingContactId;
        }

        public String billingDate() {
            return this.billingDate;
        }

        public String billingPeriod() {
            return this.billingPeriod;
        }

        public String clientAccountId() {
            return this.clientAccountId;
        }

        public String clientAccountStatus() {
            return this.clientAccountStatus;
        }

        public String clientAccountTrialEndDate() {
            return this.clientAccountTrialEndDate;
        }

        public Integer clientAccountTrialExtensionTimes() {
            return this.clientAccountTrialExtensionTimes;
        }

        public String clientAccountType() {
            return this.clientAccountType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String currency() {
            return this.currency;
        }

        public Integer currentUserCount() {
            return this.currentUserCount;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Integer num;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            Integer num2;
            Integer num3;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            Integer num4;
            Integer num5;
            String str16;
            String str17;
            String str18;
            String str19;
            Integer num6;
            Integer num7;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.__typename.equals(item.__typename) && this.accountId.equals(item.accountId) && this.clientAccountId.equals(item.clientAccountId) && ((str = this.clientAccountType) != null ? str.equals(item.clientAccountType) : item.clientAccountType == null) && ((str2 = this.clientAccountStatus) != null ? str2.equals(item.clientAccountStatus) : item.clientAccountStatus == null) && ((str3 = this.clientAccountTrialEndDate) != null ? str3.equals(item.clientAccountTrialEndDate) : item.clientAccountTrialEndDate == null) && ((num = this.clientAccountTrialExtensionTimes) != null ? num.equals(item.clientAccountTrialExtensionTimes) : item.clientAccountTrialExtensionTimes == null) && ((str4 = this.billingContactId) != null ? str4.equals(item.billingContactId) : item.billingContactId == null) && ((str5 = this.alternateBillingContactId) != null ? str5.equals(item.alternateBillingContactId) : item.alternateBillingContactId == null) && ((str6 = this.lastPendingProductAccountBillId) != null ? str6.equals(item.lastPendingProductAccountBillId) : item.lastPendingProductAccountBillId == null) && ((str7 = this.lastPaidProductAccountBillId) != null ? str7.equals(item.lastPaidProductAccountBillId) : item.lastPaidProductAccountBillId == null) && ((str8 = this.accountSalesOwnerId) != null ? str8.equals(item.accountSalesOwnerId) : item.accountSalesOwnerId == null) && ((str9 = this.accountSupportOwnerId) != null ? str9.equals(item.accountSupportOwnerId) : item.accountSupportOwnerId == null) && ((num2 = this.currentUserCount) != null ? num2.equals(item.currentUserCount) : item.currentUserCount == null) && ((num3 = this.freeUserCount) != null ? num3.equals(item.freeUserCount) : item.freeUserCount == null) && ((str10 = this.currency) != null ? str10.equals(item.currency) : item.currency == null) && ((str11 = this.subscriptionCreationDate) != null ? str11.equals(item.subscriptionCreationDate) : item.subscriptionCreationDate == null) && ((str12 = this.accountCreationDate) != null ? str12.equals(item.accountCreationDate) : item.accountCreationDate == null) && ((str13 = this.lastBilledCycleStartDate) != null ? str13.equals(item.lastBilledCycleStartDate) : item.lastBilledCycleStartDate == null) && ((str14 = this.lastBilledCycleEndDate) != null ? str14.equals(item.lastBilledCycleEndDate) : item.lastBilledCycleEndDate == null) && ((str15 = this.lastBilledDate) != null ? str15.equals(item.lastBilledDate) : item.lastBilledDate == null) && ((num4 = this.lastBilledAmmount) != null ? num4.equals(item.lastBilledAmmount) : item.lastBilledAmmount == null) && ((num5 = this.lastPaidAmount) != null ? num5.equals(item.lastPaidAmount) : item.lastPaidAmount == null) && ((str16 = this.lastPaymentDate) != null ? str16.equals(item.lastPaymentDate) : item.lastPaymentDate == null) && ((str17 = this.lastBillStatus) != null ? str17.equals(item.lastBillStatus) : item.lastBillStatus == null) && ((str18 = this.lastPaymentFollowupNote) != null ? str18.equals(item.lastPaymentFollowupNote) : item.lastPaymentFollowupNote == null) && ((str19 = this.lastPaymentFollowupDoneOn) != null ? str19.equals(item.lastPaymentFollowupDoneOn) : item.lastPaymentFollowupDoneOn == null) && ((num6 = this.lastPaidUserCount) != null ? num6.equals(item.lastPaidUserCount) : item.lastPaidUserCount == null) && ((num7 = this.lastBilledUserCount) != null ? num7.equals(item.lastBilledUserCount) : item.lastBilledUserCount == null) && ((str20 = this.billingPeriod) != null ? str20.equals(item.billingPeriod) : item.billingPeriod == null) && ((str21 = this.billCycleStartDate) != null ? str21.equals(item.billCycleStartDate) : item.billCycleStartDate == null) && ((str22 = this.billCycleEndDate) != null ? str22.equals(item.billCycleEndDate) : item.billCycleEndDate == null) && ((str23 = this.billingDate) != null ? str23.equals(item.billingDate) : item.billingDate == null) && ((str24 = this.paymentDueDate) != null ? str24.equals(item.paymentDueDate) : item.paymentDueDate == null) && ((str25 = this.nextBillingCycleStartDate) != null ? str25.equals(item.nextBillingCycleStartDate) : item.nextBillingCycleStartDate == null) && ((str26 = this.nextBillingCycleEndDate) != null ? str26.equals(item.nextBillingCycleEndDate) : item.nextBillingCycleEndDate == null) && ((str27 = this.nextBillingDate) != null ? str27.equals(item.nextBillingDate) : item.nextBillingDate == null) && ((str28 = this.nextPaymentDueDate) != null ? str28.equals(item.nextPaymentDueDate) : item.nextPaymentDueDate == null) && this.createdAt.equals(item.createdAt) && this.updatedAt.equals(item.updatedAt);
        }

        public Integer freeUserCount() {
            return this.freeUserCount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.clientAccountId.hashCode()) * 1000003;
                String str = this.clientAccountType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.clientAccountStatus;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.clientAccountTrialEndDate;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.clientAccountTrialExtensionTimes;
                int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str4 = this.billingContactId;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.alternateBillingContactId;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.lastPendingProductAccountBillId;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.lastPaidProductAccountBillId;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.accountSalesOwnerId;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.accountSupportOwnerId;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                Integer num2 = this.currentUserCount;
                int iHashCode12 = (iHashCode11 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.freeUserCount;
                int iHashCode13 = (iHashCode12 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str10 = this.currency;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.subscriptionCreationDate;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.accountCreationDate;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.lastBilledCycleStartDate;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.lastBilledCycleEndDate;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.lastBilledDate;
                int iHashCode19 = (iHashCode18 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                Integer num4 = this.lastBilledAmmount;
                int iHashCode20 = (iHashCode19 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.lastPaidAmount;
                int iHashCode21 = (iHashCode20 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                String str16 = this.lastPaymentDate;
                int iHashCode22 = (iHashCode21 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.lastBillStatus;
                int iHashCode23 = (iHashCode22 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.lastPaymentFollowupNote;
                int iHashCode24 = (iHashCode23 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.lastPaymentFollowupDoneOn;
                int iHashCode25 = (iHashCode24 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                Integer num6 = this.lastPaidUserCount;
                int iHashCode26 = (iHashCode25 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.lastBilledUserCount;
                int iHashCode27 = (iHashCode26 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                String str20 = this.billingPeriod;
                int iHashCode28 = (iHashCode27 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.billCycleStartDate;
                int iHashCode29 = (iHashCode28 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.billCycleEndDate;
                int iHashCode30 = (iHashCode29 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.billingDate;
                int iHashCode31 = (iHashCode30 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.paymentDueDate;
                int iHashCode32 = (iHashCode31 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.nextBillingCycleStartDate;
                int iHashCode33 = (iHashCode32 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.nextBillingCycleEndDate;
                int iHashCode34 = (iHashCode33 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.nextBillingDate;
                int iHashCode35 = (iHashCode34 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.nextPaymentDueDate;
                this.$hashCode = ((((iHashCode35 ^ (str28 != null ? str28.hashCode() : 0)) * 1000003) ^ this.createdAt.hashCode()) * 1000003) ^ this.updatedAt.hashCode();
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String lastBillStatus() {
            return this.lastBillStatus;
        }

        public Integer lastBilledAmmount() {
            return this.lastBilledAmmount;
        }

        public String lastBilledCycleEndDate() {
            return this.lastBilledCycleEndDate;
        }

        public String lastBilledCycleStartDate() {
            return this.lastBilledCycleStartDate;
        }

        public String lastBilledDate() {
            return this.lastBilledDate;
        }

        public Integer lastBilledUserCount() {
            return this.lastBilledUserCount;
        }

        public Integer lastPaidAmount() {
            return this.lastPaidAmount;
        }

        public String lastPaidProductAccountBillId() {
            return this.lastPaidProductAccountBillId;
        }

        public Integer lastPaidUserCount() {
            return this.lastPaidUserCount;
        }

        public String lastPaymentDate() {
            return this.lastPaymentDate;
        }

        public String lastPaymentFollowupDoneOn() {
            return this.lastPaymentFollowupDoneOn;
        }

        public String lastPaymentFollowupNote() {
            return this.lastPaymentFollowupNote;
        }

        public String lastPendingProductAccountBillId() {
            return this.lastPendingProductAccountBillId;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.clientAccountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.clientAccountType);
                    responseWriter.writeString(responseFieldArr[4], Item.this.clientAccountStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.clientAccountTrialEndDate);
                    responseWriter.writeInt(responseFieldArr[6], Item.this.clientAccountTrialExtensionTimes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.billingContactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.alternateBillingContactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.lastPendingProductAccountBillId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.lastPaidProductAccountBillId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.accountSalesOwnerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.accountSupportOwnerId);
                    responseWriter.writeInt(responseFieldArr[13], Item.this.currentUserCount);
                    responseWriter.writeInt(responseFieldArr[14], Item.this.freeUserCount);
                    responseWriter.writeString(responseFieldArr[15], Item.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.subscriptionCreationDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.accountCreationDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.lastBilledCycleStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.lastBilledCycleEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.lastBilledDate);
                    responseWriter.writeInt(responseFieldArr[21], Item.this.lastBilledAmmount);
                    responseWriter.writeInt(responseFieldArr[22], Item.this.lastPaidAmount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.lastPaymentDate);
                    responseWriter.writeString(responseFieldArr[24], Item.this.lastBillStatus);
                    responseWriter.writeString(responseFieldArr[25], Item.this.lastPaymentFollowupNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], Item.this.lastPaymentFollowupDoneOn);
                    responseWriter.writeInt(responseFieldArr[27], Item.this.lastPaidUserCount);
                    responseWriter.writeInt(responseFieldArr[28], Item.this.lastBilledUserCount);
                    responseWriter.writeString(responseFieldArr[29], Item.this.billingPeriod);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], Item.this.billCycleStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], Item.this.billCycleEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Item.this.billingDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], Item.this.paymentDueDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], Item.this.nextBillingCycleStartDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], Item.this.nextBillingCycleEndDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], Item.this.nextBillingDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], Item.this.nextPaymentDueDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], Item.this.updatedAt);
                }
            };
        }

        public String nextBillingCycleEndDate() {
            return this.nextBillingCycleEndDate;
        }

        public String nextBillingCycleStartDate() {
            return this.nextBillingCycleStartDate;
        }

        public String nextBillingDate() {
            return this.nextBillingDate;
        }

        public String nextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        public String paymentDueDate() {
            return this.paymentDueDate;
        }

        public String subscriptionCreationDate() {
            return this.subscriptionCreationDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", accountId=" + this.accountId + ", clientAccountId=" + this.clientAccountId + ", clientAccountType=" + this.clientAccountType + ", clientAccountStatus=" + this.clientAccountStatus + ", clientAccountTrialEndDate=" + this.clientAccountTrialEndDate + ", clientAccountTrialExtensionTimes=" + this.clientAccountTrialExtensionTimes + ", billingContactId=" + this.billingContactId + ", alternateBillingContactId=" + this.alternateBillingContactId + ", lastPendingProductAccountBillId=" + this.lastPendingProductAccountBillId + ", lastPaidProductAccountBillId=" + this.lastPaidProductAccountBillId + ", accountSalesOwnerId=" + this.accountSalesOwnerId + ", accountSupportOwnerId=" + this.accountSupportOwnerId + ", currentUserCount=" + this.currentUserCount + ", freeUserCount=" + this.freeUserCount + ", currency=" + this.currency + ", subscriptionCreationDate=" + this.subscriptionCreationDate + ", accountCreationDate=" + this.accountCreationDate + ", lastBilledCycleStartDate=" + this.lastBilledCycleStartDate + ", lastBilledCycleEndDate=" + this.lastBilledCycleEndDate + ", lastBilledDate=" + this.lastBilledDate + ", lastBilledAmmount=" + this.lastBilledAmmount + ", lastPaidAmount=" + this.lastPaidAmount + ", lastPaymentDate=" + this.lastPaymentDate + ", lastBillStatus=" + this.lastBillStatus + ", lastPaymentFollowupNote=" + this.lastPaymentFollowupNote + ", lastPaymentFollowupDoneOn=" + this.lastPaymentFollowupDoneOn + ", lastPaidUserCount=" + this.lastPaidUserCount + ", lastBilledUserCount=" + this.lastBilledUserCount + ", billingPeriod=" + this.billingPeriod + ", billCycleStartDate=" + this.billCycleStartDate + ", billCycleEndDate=" + this.billCycleEndDate + ", billingDate=" + this.billingDate + ", paymentDueDate=" + this.paymentDueDate + ", nextBillingCycleStartDate=" + this.nextBillingCycleStartDate + ", nextBillingCycleEndDate=" + this.nextBillingCycleEndDate + ", nextBillingDate=" + this.nextBillingDate + ", nextPaymentDueDate=" + this.nextPaymentDueDate + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListClientAccount {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListClientAccount> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListClientAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListClientAccount.$responseFields;
                return new ListClientAccount(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.ListClientAccount.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.ListClientAccount.Mapper.1.1
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

        public ListClientAccount(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListClientAccount)) {
                return false;
            }
            ListClientAccount listClientAccount = (ListClientAccount) obj;
            if (this.__typename.equals(listClientAccount.__typename) && this.items.equals(listClientAccount.items)) {
                String str = this.nextToken;
                String str2 = listClientAccount.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.ListClientAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListClientAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListClientAccount.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListClientAccount.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.ListClientAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListClientAccount.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListClientAccount{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelIDKeyConditionInput clientAccountId;
        private final ModelClientAccountFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelClientAccountFilterInput modelClientAccountFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.clientAccountId = modelIDKeyConditionInput;
            this.filter = modelClientAccountFilterInput;
            this.limit = num;
            this.nextToken = str2;
            this.sortDirection = modelSortDirection;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("clientAccountId", modelIDKeyConditionInput);
            linkedHashMap.put("filter", modelClientAccountFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
            linkedHashMap.put("sortDirection", modelSortDirection);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelIDKeyConditionInput clientAccountId() {
            return this.clientAccountId;
        }

        public ModelClientAccountFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListClientAccountQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("clientAccountId", Variables.this.clientAccountId != null ? Variables.this.clientAccountId.marshaller() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
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

    public ListClientAccountQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelClientAccountFilterInput modelClientAccountFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelClientAccountFilterInput, num, str2, modelSortDirection);
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
        return "11719c9fc9d65ec37a0277553c470119d94eeb89deed1e6c7a189e4cb5d7a34d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListClientAccount($accountId: ID, $clientAccountId: ModelIDKeyConditionInput, $filter: ModelClientAccountFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listClientAccount(accountId: $accountId, clientAccountId: $clientAccountId, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      clientAccountId\n      clientAccountType\n      clientAccountStatus\n      clientAccountTrialEndDate\n      clientAccountTrialExtensionTimes\n      billingContactId\n      alternateBillingContactId\n      lastPendingProductAccountBillId\n      lastPaidProductAccountBillId\n      accountSalesOwnerId\n      accountSupportOwnerId\n      currentUserCount\n      freeUserCount\n      currency\n      subscriptionCreationDate\n      accountCreationDate\n      lastBilledCycleStartDate\n      lastBilledCycleEndDate\n      lastBilledDate\n      lastBilledAmmount\n      lastPaidAmount\n      lastPaymentDate\n      lastBillStatus\n      lastPaymentFollowupNote\n      lastPaymentFollowupDoneOn\n      lastPaidUserCount\n      lastBilledUserCount\n      billingPeriod\n      billCycleStartDate\n      billCycleEndDate\n      billingDate\n      paymentDueDate\n      nextBillingCycleStartDate\n      nextBillingCycleEndDate\n      nextBillingDate\n      nextPaymentDueDate\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
