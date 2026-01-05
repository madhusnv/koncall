package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.storage.s3.transfer.TransferTable;
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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AccountStatus;
import type.AccountType;
import type.AddedSourceType;
import type.CustomType;
import type.Day;
import type.DealOutcome;
import type.DealState;
import type.UserRegistrationStatus;

/* loaded from: classes7.dex */
public final class GetAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetAccount($id: ID!) {\n  getAccount(id: $id) {\n    __typename\n    id\n    accountName\n    accountType\n    deviceKey\n    deviceKeyLastUpdated\n    accountStatus\n    businessLogoUrl\n    createdById\n    dateFormat\n    dateTimeViewStyle\n    defaultCurrency\n    denomination\n    industry\n    nameOfBusiness\n    productOrService\n    timeFormat\n    timeZone\n    plan\n    paidUpTo\n    seats\n    freeSeats\n    currentTotalUsers\n    currentActiveUsers\n    extraActiveUsers\n    pricePerSeat\n    allowAddingSeat\n    allowAddingSeatTill\n    seatReductionMarkedForNextCycle\n    billingCurrency\n    billingEmail\n    taxId\n    taxIdType\n    trialAccountEndDate\n    trialExtensionTimes\n    eligibleForExtension\n    paidForTillDate\n    updatedById\n    website\n    workingHours {\n      __typename\n      day\n      startTime\n      endTime\n    }\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    permissions\n    enableCustomCharts\n    createdAt\n    updatedAt\n    dealMode\n    openAiApiKey\n    salesmaxSalesContacts\n    salesmaxSupportContacts\n    chatWidgetConfig\n    onboardingStatus\n    integrationNeeded\n    matchingDealId\n    relatedAccountIds\n    accountStats {\n      __typename\n      callSevenDays\n      wabaConversationSevenDays\n      wabaBroadcastSevenDays\n      paymentSevenDays\n      taskSevenDays\n      callPreviousSevenDays\n      wabaConversationPreviousSevenDays\n      contactCreatedPreviousSevenDays\n      bulkActionsSeventDays\n      bulkActionsSeventDays_BULK_UPLOAD\n      bulkActionsSeventDays_CREATE_TAG\n      bulkActionsSeventDays_CAMPAIGN_WITH_RULE\n      bulkActionsSeventDays_BULK_UPDATE\n      bulkActionsSeventDays_GENERATE_REPORT\n      bulkActionsSeventDays_REMOVE_USER\n      bulkActionsPreviousSeventDays\n      onboardingStepsDone\n    }\n    lastChurnDate\n    lastChurnReason\n    possibleReactivationDate\n    locationPeriodicFrequency\n    lastPaymentDataId\n    lastPaymentDataCreatedAt\n    nextRenewalDateIfPaid\n    lastPaymentStatus\n    partPaymentAmountIfAny\n    subscriptions {\n      __typename\n      nextToken\n    }\n    lastPaymentData {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    matchingDeal {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    createdByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetAccount($id: ID!) {\n  getAccount(id: $id) {\n    __typename\n    id\n    accountName\n    accountType\n    deviceKey\n    deviceKeyLastUpdated\n    accountStatus\n    businessLogoUrl\n    createdById\n    dateFormat\n    dateTimeViewStyle\n    defaultCurrency\n    denomination\n    industry\n    nameOfBusiness\n    productOrService\n    timeFormat\n    timeZone\n    plan\n    paidUpTo\n    seats\n    freeSeats\n    currentTotalUsers\n    currentActiveUsers\n    extraActiveUsers\n    pricePerSeat\n    allowAddingSeat\n    allowAddingSeatTill\n    seatReductionMarkedForNextCycle\n    billingCurrency\n    billingEmail\n    taxId\n    taxIdType\n    trialAccountEndDate\n    trialExtensionTimes\n    eligibleForExtension\n    paidForTillDate\n    updatedById\n    website\n    workingHours {\n      __typename\n      day\n      startTime\n      endTime\n    }\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    permissions\n    enableCustomCharts\n    createdAt\n    updatedAt\n    dealMode\n    openAiApiKey\n    salesmaxSalesContacts\n    salesmaxSupportContacts\n    chatWidgetConfig\n    onboardingStatus\n    integrationNeeded\n    matchingDealId\n    relatedAccountIds\n    accountStats {\n      __typename\n      callSevenDays\n      wabaConversationSevenDays\n      wabaBroadcastSevenDays\n      paymentSevenDays\n      taskSevenDays\n      callPreviousSevenDays\n      wabaConversationPreviousSevenDays\n      contactCreatedPreviousSevenDays\n      bulkActionsSeventDays\n      bulkActionsSeventDays_BULK_UPLOAD\n      bulkActionsSeventDays_CREATE_TAG\n      bulkActionsSeventDays_CAMPAIGN_WITH_RULE\n      bulkActionsSeventDays_BULK_UPDATE\n      bulkActionsSeventDays_GENERATE_REPORT\n      bulkActionsSeventDays_REMOVE_USER\n      bulkActionsPreviousSeventDays\n      onboardingStepsDone\n    }\n    lastChurnDate\n    lastChurnReason\n    possibleReactivationDate\n    locationPeriodicFrequency\n    lastPaymentDataId\n    lastPaymentDataCreatedAt\n    nextRenewalDateIfPaid\n    lastPaymentStatus\n    partPaymentAmountIfAny\n    subscriptions {\n      __typename\n      nextToken\n    }\n    lastPaymentData {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    matchingDeal {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    createdByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static class AccountStats {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forInt("callSevenDays", "callSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("wabaConversationSevenDays", "wabaConversationSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("wabaBroadcastSevenDays", "wabaBroadcastSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("paymentSevenDays", "paymentSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("taskSevenDays", "taskSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("callPreviousSevenDays", "callPreviousSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("wabaConversationPreviousSevenDays", "wabaConversationPreviousSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("contactCreatedPreviousSevenDays", "contactCreatedPreviousSevenDays", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsSeventDays", "bulkActionsSeventDays", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsSeventDays_BULK_UPLOAD", "bulkActionsSeventDays_BULK_UPLOAD", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsSeventDays_CREATE_TAG", "bulkActionsSeventDays_CREATE_TAG", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsSeventDays_CAMPAIGN_WITH_RULE", "bulkActionsSeventDays_CAMPAIGN_WITH_RULE", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsSeventDays_BULK_UPDATE", "bulkActionsSeventDays_BULK_UPDATE", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsSeventDays_GENERATE_REPORT", "bulkActionsSeventDays_GENERATE_REPORT", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsSeventDays_REMOVE_USER", "bulkActionsSeventDays_REMOVE_USER", null, true, Collections.emptyList()), ResponseField.forInt("bulkActionsPreviousSeventDays", "bulkActionsPreviousSeventDays", null, true, Collections.emptyList()), ResponseField.forInt("onboardingStepsDone", "onboardingStepsDone", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Integer bulkActionsPreviousSeventDays;
        final Integer bulkActionsSeventDays;
        final Integer bulkActionsSeventDays_BULK_UPDATE;
        final Integer bulkActionsSeventDays_BULK_UPLOAD;
        final Integer bulkActionsSeventDays_CAMPAIGN_WITH_RULE;
        final Integer bulkActionsSeventDays_CREATE_TAG;
        final Integer bulkActionsSeventDays_GENERATE_REPORT;
        final Integer bulkActionsSeventDays_REMOVE_USER;
        final Integer callPreviousSevenDays;
        final Integer callSevenDays;
        final Integer contactCreatedPreviousSevenDays;
        final Integer onboardingStepsDone;
        final Integer paymentSevenDays;
        final Integer taskSevenDays;
        final Integer wabaBroadcastSevenDays;
        final Integer wabaConversationPreviousSevenDays;
        final Integer wabaConversationSevenDays;

        public static final class Mapper implements ResponseFieldMapper<AccountStats> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AccountStats map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AccountStats.$responseFields;
                return new AccountStats(responseReader.readString(responseFieldArr[0]), responseReader.readInt(responseFieldArr[1]), responseReader.readInt(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]), responseReader.readInt(responseFieldArr[4]), responseReader.readInt(responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readInt(responseFieldArr[9]), responseReader.readInt(responseFieldArr[10]), responseReader.readInt(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), responseReader.readInt(responseFieldArr[13]), responseReader.readInt(responseFieldArr[14]), responseReader.readInt(responseFieldArr[15]), responseReader.readInt(responseFieldArr[16]), responseReader.readInt(responseFieldArr[17]));
            }
        }

        public AccountStats(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.callSevenDays = num;
            this.wabaConversationSevenDays = num2;
            this.wabaBroadcastSevenDays = num3;
            this.paymentSevenDays = num4;
            this.taskSevenDays = num5;
            this.callPreviousSevenDays = num6;
            this.wabaConversationPreviousSevenDays = num7;
            this.contactCreatedPreviousSevenDays = num8;
            this.bulkActionsSeventDays = num9;
            this.bulkActionsSeventDays_BULK_UPLOAD = num10;
            this.bulkActionsSeventDays_CREATE_TAG = num11;
            this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE = num12;
            this.bulkActionsSeventDays_BULK_UPDATE = num13;
            this.bulkActionsSeventDays_GENERATE_REPORT = num14;
            this.bulkActionsSeventDays_REMOVE_USER = num15;
            this.bulkActionsPreviousSeventDays = num16;
            this.onboardingStepsDone = num17;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer bulkActionsPreviousSeventDays() {
            return this.bulkActionsPreviousSeventDays;
        }

        public Integer bulkActionsSeventDays() {
            return this.bulkActionsSeventDays;
        }

        public Integer bulkActionsSeventDays_BULK_UPDATE() {
            return this.bulkActionsSeventDays_BULK_UPDATE;
        }

        public Integer bulkActionsSeventDays_BULK_UPLOAD() {
            return this.bulkActionsSeventDays_BULK_UPLOAD;
        }

        public Integer bulkActionsSeventDays_CAMPAIGN_WITH_RULE() {
            return this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE;
        }

        public Integer bulkActionsSeventDays_CREATE_TAG() {
            return this.bulkActionsSeventDays_CREATE_TAG;
        }

        public Integer bulkActionsSeventDays_GENERATE_REPORT() {
            return this.bulkActionsSeventDays_GENERATE_REPORT;
        }

        public Integer bulkActionsSeventDays_REMOVE_USER() {
            return this.bulkActionsSeventDays_REMOVE_USER;
        }

        public Integer callPreviousSevenDays() {
            return this.callPreviousSevenDays;
        }

        public Integer callSevenDays() {
            return this.callSevenDays;
        }

        public Integer contactCreatedPreviousSevenDays() {
            return this.contactCreatedPreviousSevenDays;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            Integer num8;
            Integer num9;
            Integer num10;
            Integer num11;
            Integer num12;
            Integer num13;
            Integer num14;
            Integer num15;
            Integer num16;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountStats)) {
                return false;
            }
            AccountStats accountStats = (AccountStats) obj;
            if (this.__typename.equals(accountStats.__typename) && ((num = this.callSevenDays) != null ? num.equals(accountStats.callSevenDays) : accountStats.callSevenDays == null) && ((num2 = this.wabaConversationSevenDays) != null ? num2.equals(accountStats.wabaConversationSevenDays) : accountStats.wabaConversationSevenDays == null) && ((num3 = this.wabaBroadcastSevenDays) != null ? num3.equals(accountStats.wabaBroadcastSevenDays) : accountStats.wabaBroadcastSevenDays == null) && ((num4 = this.paymentSevenDays) != null ? num4.equals(accountStats.paymentSevenDays) : accountStats.paymentSevenDays == null) && ((num5 = this.taskSevenDays) != null ? num5.equals(accountStats.taskSevenDays) : accountStats.taskSevenDays == null) && ((num6 = this.callPreviousSevenDays) != null ? num6.equals(accountStats.callPreviousSevenDays) : accountStats.callPreviousSevenDays == null) && ((num7 = this.wabaConversationPreviousSevenDays) != null ? num7.equals(accountStats.wabaConversationPreviousSevenDays) : accountStats.wabaConversationPreviousSevenDays == null) && ((num8 = this.contactCreatedPreviousSevenDays) != null ? num8.equals(accountStats.contactCreatedPreviousSevenDays) : accountStats.contactCreatedPreviousSevenDays == null) && ((num9 = this.bulkActionsSeventDays) != null ? num9.equals(accountStats.bulkActionsSeventDays) : accountStats.bulkActionsSeventDays == null) && ((num10 = this.bulkActionsSeventDays_BULK_UPLOAD) != null ? num10.equals(accountStats.bulkActionsSeventDays_BULK_UPLOAD) : accountStats.bulkActionsSeventDays_BULK_UPLOAD == null) && ((num11 = this.bulkActionsSeventDays_CREATE_TAG) != null ? num11.equals(accountStats.bulkActionsSeventDays_CREATE_TAG) : accountStats.bulkActionsSeventDays_CREATE_TAG == null) && ((num12 = this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE) != null ? num12.equals(accountStats.bulkActionsSeventDays_CAMPAIGN_WITH_RULE) : accountStats.bulkActionsSeventDays_CAMPAIGN_WITH_RULE == null) && ((num13 = this.bulkActionsSeventDays_BULK_UPDATE) != null ? num13.equals(accountStats.bulkActionsSeventDays_BULK_UPDATE) : accountStats.bulkActionsSeventDays_BULK_UPDATE == null) && ((num14 = this.bulkActionsSeventDays_GENERATE_REPORT) != null ? num14.equals(accountStats.bulkActionsSeventDays_GENERATE_REPORT) : accountStats.bulkActionsSeventDays_GENERATE_REPORT == null) && ((num15 = this.bulkActionsSeventDays_REMOVE_USER) != null ? num15.equals(accountStats.bulkActionsSeventDays_REMOVE_USER) : accountStats.bulkActionsSeventDays_REMOVE_USER == null) && ((num16 = this.bulkActionsPreviousSeventDays) != null ? num16.equals(accountStats.bulkActionsPreviousSeventDays) : accountStats.bulkActionsPreviousSeventDays == null)) {
                Integer num17 = this.onboardingStepsDone;
                Integer num18 = accountStats.onboardingStepsDone;
                if (num17 == null) {
                    if (num18 == null) {
                        return true;
                    }
                } else if (num17.equals(num18)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.callSevenDays;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.wabaConversationSevenDays;
                int iHashCode3 = (iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.wabaBroadcastSevenDays;
                int iHashCode4 = (iHashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.paymentSevenDays;
                int iHashCode5 = (iHashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.taskSevenDays;
                int iHashCode6 = (iHashCode5 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.callPreviousSevenDays;
                int iHashCode7 = (iHashCode6 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.wabaConversationPreviousSevenDays;
                int iHashCode8 = (iHashCode7 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                Integer num8 = this.contactCreatedPreviousSevenDays;
                int iHashCode9 = (iHashCode8 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                Integer num9 = this.bulkActionsSeventDays;
                int iHashCode10 = (iHashCode9 ^ (num9 == null ? 0 : num9.hashCode())) * 1000003;
                Integer num10 = this.bulkActionsSeventDays_BULK_UPLOAD;
                int iHashCode11 = (iHashCode10 ^ (num10 == null ? 0 : num10.hashCode())) * 1000003;
                Integer num11 = this.bulkActionsSeventDays_CREATE_TAG;
                int iHashCode12 = (iHashCode11 ^ (num11 == null ? 0 : num11.hashCode())) * 1000003;
                Integer num12 = this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE;
                int iHashCode13 = (iHashCode12 ^ (num12 == null ? 0 : num12.hashCode())) * 1000003;
                Integer num13 = this.bulkActionsSeventDays_BULK_UPDATE;
                int iHashCode14 = (iHashCode13 ^ (num13 == null ? 0 : num13.hashCode())) * 1000003;
                Integer num14 = this.bulkActionsSeventDays_GENERATE_REPORT;
                int iHashCode15 = (iHashCode14 ^ (num14 == null ? 0 : num14.hashCode())) * 1000003;
                Integer num15 = this.bulkActionsSeventDays_REMOVE_USER;
                int iHashCode16 = (iHashCode15 ^ (num15 == null ? 0 : num15.hashCode())) * 1000003;
                Integer num16 = this.bulkActionsPreviousSeventDays;
                int iHashCode17 = (iHashCode16 ^ (num16 == null ? 0 : num16.hashCode())) * 1000003;
                Integer num17 = this.onboardingStepsDone;
                this.$hashCode = iHashCode17 ^ (num17 != null ? num17.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.AccountStats.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AccountStats.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AccountStats.this.__typename);
                    responseWriter.writeInt(responseFieldArr[1], AccountStats.this.callSevenDays);
                    responseWriter.writeInt(responseFieldArr[2], AccountStats.this.wabaConversationSevenDays);
                    responseWriter.writeInt(responseFieldArr[3], AccountStats.this.wabaBroadcastSevenDays);
                    responseWriter.writeInt(responseFieldArr[4], AccountStats.this.paymentSevenDays);
                    responseWriter.writeInt(responseFieldArr[5], AccountStats.this.taskSevenDays);
                    responseWriter.writeInt(responseFieldArr[6], AccountStats.this.callPreviousSevenDays);
                    responseWriter.writeInt(responseFieldArr[7], AccountStats.this.wabaConversationPreviousSevenDays);
                    responseWriter.writeInt(responseFieldArr[8], AccountStats.this.contactCreatedPreviousSevenDays);
                    responseWriter.writeInt(responseFieldArr[9], AccountStats.this.bulkActionsSeventDays);
                    responseWriter.writeInt(responseFieldArr[10], AccountStats.this.bulkActionsSeventDays_BULK_UPLOAD);
                    responseWriter.writeInt(responseFieldArr[11], AccountStats.this.bulkActionsSeventDays_CREATE_TAG);
                    responseWriter.writeInt(responseFieldArr[12], AccountStats.this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE);
                    responseWriter.writeInt(responseFieldArr[13], AccountStats.this.bulkActionsSeventDays_BULK_UPDATE);
                    responseWriter.writeInt(responseFieldArr[14], AccountStats.this.bulkActionsSeventDays_GENERATE_REPORT);
                    responseWriter.writeInt(responseFieldArr[15], AccountStats.this.bulkActionsSeventDays_REMOVE_USER);
                    responseWriter.writeInt(responseFieldArr[16], AccountStats.this.bulkActionsPreviousSeventDays);
                    responseWriter.writeInt(responseFieldArr[17], AccountStats.this.onboardingStepsDone);
                }
            };
        }

        public Integer onboardingStepsDone() {
            return this.onboardingStepsDone;
        }

        public Integer paymentSevenDays() {
            return this.paymentSevenDays;
        }

        public Integer taskSevenDays() {
            return this.taskSevenDays;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AccountStats{__typename=" + this.__typename + ", callSevenDays=" + this.callSevenDays + ", wabaConversationSevenDays=" + this.wabaConversationSevenDays + ", wabaBroadcastSevenDays=" + this.wabaBroadcastSevenDays + ", paymentSevenDays=" + this.paymentSevenDays + ", taskSevenDays=" + this.taskSevenDays + ", callPreviousSevenDays=" + this.callPreviousSevenDays + ", wabaConversationPreviousSevenDays=" + this.wabaConversationPreviousSevenDays + ", contactCreatedPreviousSevenDays=" + this.contactCreatedPreviousSevenDays + ", bulkActionsSeventDays=" + this.bulkActionsSeventDays + ", bulkActionsSeventDays_BULK_UPLOAD=" + this.bulkActionsSeventDays_BULK_UPLOAD + ", bulkActionsSeventDays_CREATE_TAG=" + this.bulkActionsSeventDays_CREATE_TAG + ", bulkActionsSeventDays_CAMPAIGN_WITH_RULE=" + this.bulkActionsSeventDays_CAMPAIGN_WITH_RULE + ", bulkActionsSeventDays_BULK_UPDATE=" + this.bulkActionsSeventDays_BULK_UPDATE + ", bulkActionsSeventDays_GENERATE_REPORT=" + this.bulkActionsSeventDays_GENERATE_REPORT + ", bulkActionsSeventDays_REMOVE_USER=" + this.bulkActionsSeventDays_REMOVE_USER + ", bulkActionsPreviousSeventDays=" + this.bulkActionsPreviousSeventDays + ", onboardingStepsDone=" + this.onboardingStepsDone + "}";
            }
            return this.$toString;
        }

        public Integer wabaBroadcastSevenDays() {
            return this.wabaBroadcastSevenDays;
        }

        public Integer wabaConversationPreviousSevenDays() {
            return this.wabaConversationPreviousSevenDays;
        }

        public Integer wabaConversationSevenDays() {
            return this.wabaConversationSevenDays;
        }
    }

    public static final class Builder {
        private String id;

        public GetAccountQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetAccountQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class CreatedByUser {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<CreatedByUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreatedByUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreatedByUser.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new CreatedByUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public CreatedByUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreatedByUser)) {
                return false;
            }
            CreatedByUser createdByUser = (CreatedByUser) obj;
            if (this.__typename.equals(createdByUser.__typename) && this.id.equals(createdByUser.id) && this.addedSourceType.equals(createdByUser.addedSourceType) && this.name.equals(createdByUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(createdByUser.profilePictureUrl) : createdByUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(createdByUser.registeredEmail) : createdByUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(createdByUser.registeredEmailVerified) : createdByUser.registeredEmailVerified == null) && this.registeredNumber.equals(createdByUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(createdByUser.registeredNumberVerified) : createdByUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(createdByUser.secondaryNumber) : createdByUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(createdByUser.secondaryNumberVerified) : createdByUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(createdByUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(createdByUser.lastSelectedAccountWeb) : createdByUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(createdByUser.lastSelectedAccountApp) : createdByUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(createdByUser.appVersion) : createdByUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(createdByUser.deviceModel) : createdByUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(createdByUser.deviceManufacturer) : createdByUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(createdByUser.androidVersionRelease) : createdByUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(createdByUser.createdAt) : createdByUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = createdByUser.updatedAt;
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
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.CreatedByUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreatedByUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreatedByUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreatedByUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], CreatedByUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], CreatedByUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], CreatedByUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CreatedByUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], CreatedByUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreatedByUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], CreatedByUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreatedByUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], CreatedByUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], CreatedByUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CreatedByUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], CreatedByUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], CreatedByUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], CreatedByUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], CreatedByUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], CreatedByUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CreatedByUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], CreatedByUser.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreatedByUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getAccount", "getAccount", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetAccount getAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetAccount.Mapper getAccountFieldMapper = new GetAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetAccount getAccount) {
            this.getAccount = getAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetAccount getAccount = this.getAccount;
            GetAccount getAccount2 = ((Data) obj).getAccount;
            return getAccount == null ? getAccount2 == null : getAccount.equals(getAccount2);
        }

        public GetAccount getAccount() {
            return this.getAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetAccount getAccount = this.getAccount;
                this.$hashCode = (getAccount == null ? 0 : getAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetAccount getAccount = Data.this.getAccount;
                    responseWriter.writeObject(responseField, getAccount != null ? getAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getAccount=" + this.getAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetAccount {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountName;
        final AccountStats accountStats;
        final AccountStatus accountStatus;
        final AccountType accountType;
        final Boolean allowAddingSeat;
        final String allowAddingSeatTill;
        final String billingCurrency;
        final String billingEmail;
        final String businessLogoUrl;
        final String chatWidgetConfig;
        final String createdAt;
        final String createdById;
        final CreatedByUser createdByUser;
        final Integer currentActiveUsers;
        final Integer currentTotalUsers;
        final String dateFormat;
        final String dateTimeViewStyle;
        final String dealMode;
        final String defaultCurrency;
        final String denomination;
        final String deviceKey;
        final String deviceKeyLastUpdated;
        final Boolean eligibleForExtension;
        final Boolean enableCustomCharts;
        final Integer extraActiveUsers;
        final Integer freeSeats;
        final String id;
        final String industry;
        final String integrationNeeded;
        final String lastChurnDate;
        final String lastChurnReason;
        final LastPaymentData lastPaymentData;
        final String lastPaymentDataCreatedAt;
        final String lastPaymentDataId;
        final String lastPaymentStatus;
        final Double locationPeriodicFrequency;
        final MatchingDeal matchingDeal;
        final String matchingDealId;
        final String nameOfBusiness;
        final String nextRenewalDateIfPaid;
        final String onboardingStatus;
        final String openAiApiKey;
        final String paidForTillDate;
        final String paidUpTo;
        final Integer partPaymentAmountIfAny;
        final List<String> permissions;
        final String plan;
        final String possibleReactivationDate;
        final Integer pricePerSeat;
        final List<String> productOrService;
        final List<String> relatedAccountIds;
        final List<String> salesmaxSalesContacts;
        final List<String> salesmaxSupportContacts;
        final Integer seatReductionMarkedForNextCycle;
        final Integer seats;
        final Subscriptions subscriptions;
        final String taxId;
        final String taxIdType;
        final String timeFormat;
        final String timeZone;
        final String trialAccountEndDate;
        final Integer trialExtensionTimes;
        final String updatedAt;
        final String updatedById;
        final UpdatedByUser updatedByUser;
        final List<WebPreference> webPreferences;
        final String website;
        final List<WorkingHour> workingHours;

        public static final class Mapper implements ResponseFieldMapper<GetAccount> {
            final WorkingHour.Mapper workingHourFieldMapper = new WorkingHour.Mapper();
            final WebPreference.Mapper webPreferenceFieldMapper = new WebPreference.Mapper();
            final AccountStats.Mapper accountStatsFieldMapper = new AccountStats.Mapper();
            final Subscriptions.Mapper subscriptionsFieldMapper = new Subscriptions.Mapper();
            final LastPaymentData.Mapper lastPaymentDataFieldMapper = new LastPaymentData.Mapper();
            final MatchingDeal.Mapper matchingDealFieldMapper = new MatchingDeal.Mapper();
            final CreatedByUser.Mapper createdByUserFieldMapper = new CreatedByUser.Mapper();
            final UpdatedByUser.Mapper updatedByUserFieldMapper = new UpdatedByUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetAccount.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                String string3 = responseReader.readString(responseFieldArr[3]);
                AccountType accountTypeValueOf = string3 != null ? AccountType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                return new GetAccount(string, str, string2, accountTypeValueOf, string4, str2, string5 != null ? AccountStatus.valueOf(string5) : null, responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), responseReader.readInt(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readBoolean(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readString(responseFieldArr[31]), responseReader.readString(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readInt(responseFieldArr[34]), responseReader.readBoolean(responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), responseReader.readList(responseFieldArr[39], new ResponseReader.ListReader<WorkingHour>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public WorkingHour read(ResponseReader.ListItemReader listItemReader) {
                        return (WorkingHour) listItemReader.readObject(new ResponseReader.ObjectReader<WorkingHour>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.2.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public WorkingHour read(ResponseReader responseReader2) {
                                return Mapper.this.workingHourFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readList(responseFieldArr[40], new ResponseReader.ListReader<WebPreference>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public WebPreference read(ResponseReader.ListItemReader listItemReader) {
                        return (WebPreference) listItemReader.readObject(new ResponseReader.ObjectReader<WebPreference>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.3.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public WebPreference read(ResponseReader responseReader2) {
                                return Mapper.this.webPreferenceFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readList(responseFieldArr[41], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readBoolean(responseFieldArr[42]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[43]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[44]), responseReader.readString(responseFieldArr[45]), responseReader.readString(responseFieldArr[46]), responseReader.readList(responseFieldArr[47], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.5
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[48], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.6
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[49]), responseReader.readString(responseFieldArr[50]), responseReader.readString(responseFieldArr[51]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[52]), responseReader.readList(responseFieldArr[53], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.7
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), (AccountStats) responseReader.readObject(responseFieldArr[54], new ResponseReader.ObjectReader<AccountStats>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AccountStats read(ResponseReader responseReader2) {
                        return Mapper.this.accountStatsFieldMapper.map(responseReader2);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[55]), responseReader.readString(responseFieldArr[56]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[57]), responseReader.readDouble(responseFieldArr[58]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[59]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[60]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[61]), responseReader.readString(responseFieldArr[62]), responseReader.readInt(responseFieldArr[63]), (Subscriptions) responseReader.readObject(responseFieldArr[64], new ResponseReader.ObjectReader<Subscriptions>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Subscriptions read(ResponseReader responseReader2) {
                        return Mapper.this.subscriptionsFieldMapper.map(responseReader2);
                    }
                }), (LastPaymentData) responseReader.readObject(responseFieldArr[65], new ResponseReader.ObjectReader<LastPaymentData>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastPaymentData read(ResponseReader responseReader2) {
                        return Mapper.this.lastPaymentDataFieldMapper.map(responseReader2);
                    }
                }), (MatchingDeal) responseReader.readObject(responseFieldArr[66], new ResponseReader.ObjectReader<MatchingDeal>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public MatchingDeal read(ResponseReader responseReader2) {
                        return Mapper.this.matchingDealFieldMapper.map(responseReader2);
                    }
                }), (CreatedByUser) responseReader.readObject(responseFieldArr[67], new ResponseReader.ObjectReader<CreatedByUser>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.12
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreatedByUser read(ResponseReader responseReader2) {
                        return Mapper.this.createdByUserFieldMapper.map(responseReader2);
                    }
                }), (UpdatedByUser) responseReader.readObject(responseFieldArr[68], new ResponseReader.ObjectReader<UpdatedByUser>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.Mapper.13
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdatedByUser read(ResponseReader responseReader2) {
                        return Mapper.this.updatedByUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("accountName", "accountName", null, false, Collections.emptyList()), ResponseField.forString("accountType", "accountType", null, false, Collections.emptyList()), ResponseField.forString("deviceKey", "deviceKey", null, true, Collections.emptyList()), ResponseField.forCustomType("deviceKeyLastUpdated", "deviceKeyLastUpdated", null, true, customType2, Collections.emptyList()), ResponseField.forString("accountStatus", "accountStatus", null, true, Collections.emptyList()), ResponseField.forString("businessLogoUrl", "businessLogoUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forString("dateFormat", "dateFormat", null, true, Collections.emptyList()), ResponseField.forString("dateTimeViewStyle", "dateTimeViewStyle", null, true, Collections.emptyList()), ResponseField.forString("defaultCurrency", "defaultCurrency", null, true, Collections.emptyList()), ResponseField.forString("denomination", "denomination", null, true, Collections.emptyList()), ResponseField.forString("industry", "industry", null, true, Collections.emptyList()), ResponseField.forString("nameOfBusiness", "nameOfBusiness", null, true, Collections.emptyList()), ResponseField.forList("productOrService", "productOrService", null, true, Collections.emptyList()), ResponseField.forString("timeFormat", "timeFormat", null, true, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, RemoteConfigConstants.RequestFieldKey.TIME_ZONE, null, true, Collections.emptyList()), ResponseField.forString("plan", "plan", null, true, Collections.emptyList()), ResponseField.forCustomType("paidUpTo", "paidUpTo", null, true, customType2, Collections.emptyList()), ResponseField.forInt("seats", "seats", null, true, Collections.emptyList()), ResponseField.forInt("freeSeats", "freeSeats", null, true, Collections.emptyList()), ResponseField.forInt("currentTotalUsers", "currentTotalUsers", null, true, Collections.emptyList()), ResponseField.forInt("currentActiveUsers", "currentActiveUsers", null, true, Collections.emptyList()), ResponseField.forInt("extraActiveUsers", "extraActiveUsers", null, true, Collections.emptyList()), ResponseField.forInt("pricePerSeat", "pricePerSeat", null, true, Collections.emptyList()), ResponseField.forBoolean("allowAddingSeat", "allowAddingSeat", null, true, Collections.emptyList()), ResponseField.forCustomType("allowAddingSeatTill", "allowAddingSeatTill", null, true, customType2, Collections.emptyList()), ResponseField.forInt("seatReductionMarkedForNextCycle", "seatReductionMarkedForNextCycle", null, true, Collections.emptyList()), ResponseField.forString("billingCurrency", "billingCurrency", null, true, Collections.emptyList()), ResponseField.forCustomType("billingEmail", "billingEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forString("taxId", "taxId", null, true, Collections.emptyList()), ResponseField.forString("taxIdType", "taxIdType", null, true, Collections.emptyList()), ResponseField.forCustomType("trialAccountEndDate", "trialAccountEndDate", null, true, customType2, Collections.emptyList()), ResponseField.forInt("trialExtensionTimes", "trialExtensionTimes", null, true, Collections.emptyList()), ResponseField.forBoolean("eligibleForExtension", "eligibleForExtension", null, true, Collections.emptyList()), ResponseField.forCustomType("paidForTillDate", "paidForTillDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("website", "website", null, true, CustomType.AWSURL, Collections.emptyList()), ResponseField.forList("workingHours", "workingHours", null, true, Collections.emptyList()), ResponseField.forList("webPreferences", "webPreferences", null, true, Collections.emptyList()), ResponseField.forList("permissions", "permissions", null, true, Collections.emptyList()), ResponseField.forBoolean("enableCustomCharts", "enableCustomCharts", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealMode", "dealMode", null, true, Collections.emptyList()), ResponseField.forString("openAiApiKey", "openAiApiKey", null, true, Collections.emptyList()), ResponseField.forList("salesmaxSalesContacts", "salesmaxSalesContacts", null, true, Collections.emptyList()), ResponseField.forList("salesmaxSupportContacts", "salesmaxSupportContacts", null, true, Collections.emptyList()), ResponseField.forCustomType("chatWidgetConfig", "chatWidgetConfig", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("onboardingStatus", "onboardingStatus", null, true, Collections.emptyList()), ResponseField.forString("integrationNeeded", "integrationNeeded", null, true, Collections.emptyList()), ResponseField.forCustomType("matchingDealId", "matchingDealId", null, true, customType, Collections.emptyList()), ResponseField.forList("relatedAccountIds", "relatedAccountIds", null, true, Collections.emptyList()), ResponseField.forObject("accountStats", "accountStats", null, true, Collections.emptyList()), ResponseField.forCustomType("lastChurnDate", "lastChurnDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastChurnReason", "lastChurnReason", null, true, Collections.emptyList()), ResponseField.forCustomType("possibleReactivationDate", "possibleReactivationDate", null, true, customType2, Collections.emptyList()), ResponseField.forDouble("locationPeriodicFrequency", "locationPeriodicFrequency", null, true, Collections.emptyList()), ResponseField.forCustomType("lastPaymentDataId", "lastPaymentDataId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastPaymentDataCreatedAt", "lastPaymentDataCreatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("nextRenewalDateIfPaid", "nextRenewalDateIfPaid", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forInt("partPaymentAmountIfAny", "partPaymentAmountIfAny", null, true, Collections.emptyList()), ResponseField.forObject("subscriptions", "subscriptions", null, true, Collections.emptyList()), ResponseField.forObject("lastPaymentData", "lastPaymentData", null, true, Collections.emptyList()), ResponseField.forObject("matchingDeal", "matchingDeal", null, true, Collections.emptyList()), ResponseField.forObject("createdByUser", "createdByUser", null, true, Collections.emptyList()), ResponseField.forObject("updatedByUser", "updatedByUser", null, true, Collections.emptyList())};
        }

        public GetAccount(String str, String str2, String str3, AccountType accountType, String str4, String str5, AccountStatus accountStatus, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<String> list, String str14, String str15, String str16, String str17, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, String str18, Integer num7, String str19, String str20, String str21, String str22, String str23, Integer num8, Boolean bool2, String str24, String str25, String str26, List<WorkingHour> list2, List<WebPreference> list3, List<String> list4, Boolean bool3, String str27, String str28, String str29, String str30, List<String> list5, List<String> list6, String str31, String str32, String str33, String str34, List<String> list7, AccountStats accountStats, String str35, String str36, String str37, Double d, String str38, String str39, String str40, String str41, Integer num9, Subscriptions subscriptions, LastPaymentData lastPaymentData, MatchingDeal matchingDeal, CreatedByUser createdByUser, UpdatedByUser updatedByUser) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountName = (String) Utils.checkNotNull(str3, "accountName == null");
            this.accountType = (AccountType) Utils.checkNotNull(accountType, "accountType == null");
            this.deviceKey = str4;
            this.deviceKeyLastUpdated = str5;
            this.accountStatus = accountStatus;
            this.businessLogoUrl = str6;
            this.createdById = str7;
            this.dateFormat = str8;
            this.dateTimeViewStyle = str9;
            this.defaultCurrency = str10;
            this.denomination = str11;
            this.industry = str12;
            this.nameOfBusiness = str13;
            this.productOrService = list;
            this.timeFormat = str14;
            this.timeZone = str15;
            this.plan = str16;
            this.paidUpTo = str17;
            this.seats = num;
            this.freeSeats = num2;
            this.currentTotalUsers = num3;
            this.currentActiveUsers = num4;
            this.extraActiveUsers = num5;
            this.pricePerSeat = num6;
            this.allowAddingSeat = bool;
            this.allowAddingSeatTill = str18;
            this.seatReductionMarkedForNextCycle = num7;
            this.billingCurrency = str19;
            this.billingEmail = str20;
            this.taxId = str21;
            this.taxIdType = str22;
            this.trialAccountEndDate = str23;
            this.trialExtensionTimes = num8;
            this.eligibleForExtension = bool2;
            this.paidForTillDate = str24;
            this.updatedById = str25;
            this.website = str26;
            this.workingHours = list2;
            this.webPreferences = list3;
            this.permissions = list4;
            this.enableCustomCharts = bool3;
            this.createdAt = str27;
            this.updatedAt = str28;
            this.dealMode = str29;
            this.openAiApiKey = str30;
            this.salesmaxSalesContacts = list5;
            this.salesmaxSupportContacts = list6;
            this.chatWidgetConfig = str31;
            this.onboardingStatus = str32;
            this.integrationNeeded = str33;
            this.matchingDealId = str34;
            this.relatedAccountIds = list7;
            this.accountStats = accountStats;
            this.lastChurnDate = str35;
            this.lastChurnReason = str36;
            this.possibleReactivationDate = str37;
            this.locationPeriodicFrequency = d;
            this.lastPaymentDataId = str38;
            this.lastPaymentDataCreatedAt = str39;
            this.nextRenewalDateIfPaid = str40;
            this.lastPaymentStatus = str41;
            this.partPaymentAmountIfAny = num9;
            this.subscriptions = subscriptions;
            this.lastPaymentData = lastPaymentData;
            this.matchingDeal = matchingDeal;
            this.createdByUser = createdByUser;
            this.updatedByUser = updatedByUser;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountName() {
            return this.accountName;
        }

        public AccountStats accountStats() {
            return this.accountStats;
        }

        public AccountStatus accountStatus() {
            return this.accountStatus;
        }

        public AccountType accountType() {
            return this.accountType;
        }

        public Boolean allowAddingSeat() {
            return this.allowAddingSeat;
        }

        public String allowAddingSeatTill() {
            return this.allowAddingSeatTill;
        }

        public String billingCurrency() {
            return this.billingCurrency;
        }

        public String billingEmail() {
            return this.billingEmail;
        }

        public String businessLogoUrl() {
            return this.businessLogoUrl;
        }

        public String chatWidgetConfig() {
            return this.chatWidgetConfig;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public CreatedByUser createdByUser() {
            return this.createdByUser;
        }

        public Integer currentActiveUsers() {
            return this.currentActiveUsers;
        }

        public Integer currentTotalUsers() {
            return this.currentTotalUsers;
        }

        public String dateFormat() {
            return this.dateFormat;
        }

        public String dateTimeViewStyle() {
            return this.dateTimeViewStyle;
        }

        public String dealMode() {
            return this.dealMode;
        }

        public String defaultCurrency() {
            return this.defaultCurrency;
        }

        public String denomination() {
            return this.denomination;
        }

        public String deviceKey() {
            return this.deviceKey;
        }

        public String deviceKeyLastUpdated() {
            return this.deviceKeyLastUpdated;
        }

        public Boolean eligibleForExtension() {
            return this.eligibleForExtension;
        }

        public Boolean enableCustomCharts() {
            return this.enableCustomCharts;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            AccountStatus accountStatus;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            List<String> list;
            String str11;
            String str12;
            String str13;
            String str14;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Boolean bool;
            String str15;
            Integer num7;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            Integer num8;
            Boolean bool2;
            String str21;
            String str22;
            String str23;
            List<WorkingHour> list2;
            List<WebPreference> list3;
            List<String> list4;
            Boolean bool3;
            String str24;
            String str25;
            String str26;
            String str27;
            List<String> list5;
            List<String> list6;
            String str28;
            String str29;
            String str30;
            String str31;
            List<String> list7;
            AccountStats accountStats;
            String str32;
            String str33;
            String str34;
            Double d;
            String str35;
            String str36;
            String str37;
            String str38;
            Integer num9;
            Subscriptions subscriptions;
            LastPaymentData lastPaymentData;
            MatchingDeal matchingDeal;
            CreatedByUser createdByUser;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAccount)) {
                return false;
            }
            GetAccount getAccount = (GetAccount) obj;
            if (this.__typename.equals(getAccount.__typename) && this.id.equals(getAccount.id) && this.accountName.equals(getAccount.accountName) && this.accountType.equals(getAccount.accountType) && ((str = this.deviceKey) != null ? str.equals(getAccount.deviceKey) : getAccount.deviceKey == null) && ((str2 = this.deviceKeyLastUpdated) != null ? str2.equals(getAccount.deviceKeyLastUpdated) : getAccount.deviceKeyLastUpdated == null) && ((accountStatus = this.accountStatus) != null ? accountStatus.equals(getAccount.accountStatus) : getAccount.accountStatus == null) && ((str3 = this.businessLogoUrl) != null ? str3.equals(getAccount.businessLogoUrl) : getAccount.businessLogoUrl == null) && ((str4 = this.createdById) != null ? str4.equals(getAccount.createdById) : getAccount.createdById == null) && ((str5 = this.dateFormat) != null ? str5.equals(getAccount.dateFormat) : getAccount.dateFormat == null) && ((str6 = this.dateTimeViewStyle) != null ? str6.equals(getAccount.dateTimeViewStyle) : getAccount.dateTimeViewStyle == null) && ((str7 = this.defaultCurrency) != null ? str7.equals(getAccount.defaultCurrency) : getAccount.defaultCurrency == null) && ((str8 = this.denomination) != null ? str8.equals(getAccount.denomination) : getAccount.denomination == null) && ((str9 = this.industry) != null ? str9.equals(getAccount.industry) : getAccount.industry == null) && ((str10 = this.nameOfBusiness) != null ? str10.equals(getAccount.nameOfBusiness) : getAccount.nameOfBusiness == null) && ((list = this.productOrService) != null ? list.equals(getAccount.productOrService) : getAccount.productOrService == null) && ((str11 = this.timeFormat) != null ? str11.equals(getAccount.timeFormat) : getAccount.timeFormat == null) && ((str12 = this.timeZone) != null ? str12.equals(getAccount.timeZone) : getAccount.timeZone == null) && ((str13 = this.plan) != null ? str13.equals(getAccount.plan) : getAccount.plan == null) && ((str14 = this.paidUpTo) != null ? str14.equals(getAccount.paidUpTo) : getAccount.paidUpTo == null) && ((num = this.seats) != null ? num.equals(getAccount.seats) : getAccount.seats == null) && ((num2 = this.freeSeats) != null ? num2.equals(getAccount.freeSeats) : getAccount.freeSeats == null) && ((num3 = this.currentTotalUsers) != null ? num3.equals(getAccount.currentTotalUsers) : getAccount.currentTotalUsers == null) && ((num4 = this.currentActiveUsers) != null ? num4.equals(getAccount.currentActiveUsers) : getAccount.currentActiveUsers == null) && ((num5 = this.extraActiveUsers) != null ? num5.equals(getAccount.extraActiveUsers) : getAccount.extraActiveUsers == null) && ((num6 = this.pricePerSeat) != null ? num6.equals(getAccount.pricePerSeat) : getAccount.pricePerSeat == null) && ((bool = this.allowAddingSeat) != null ? bool.equals(getAccount.allowAddingSeat) : getAccount.allowAddingSeat == null) && ((str15 = this.allowAddingSeatTill) != null ? str15.equals(getAccount.allowAddingSeatTill) : getAccount.allowAddingSeatTill == null) && ((num7 = this.seatReductionMarkedForNextCycle) != null ? num7.equals(getAccount.seatReductionMarkedForNextCycle) : getAccount.seatReductionMarkedForNextCycle == null) && ((str16 = this.billingCurrency) != null ? str16.equals(getAccount.billingCurrency) : getAccount.billingCurrency == null) && ((str17 = this.billingEmail) != null ? str17.equals(getAccount.billingEmail) : getAccount.billingEmail == null) && ((str18 = this.taxId) != null ? str18.equals(getAccount.taxId) : getAccount.taxId == null) && ((str19 = this.taxIdType) != null ? str19.equals(getAccount.taxIdType) : getAccount.taxIdType == null) && ((str20 = this.trialAccountEndDate) != null ? str20.equals(getAccount.trialAccountEndDate) : getAccount.trialAccountEndDate == null) && ((num8 = this.trialExtensionTimes) != null ? num8.equals(getAccount.trialExtensionTimes) : getAccount.trialExtensionTimes == null) && ((bool2 = this.eligibleForExtension) != null ? bool2.equals(getAccount.eligibleForExtension) : getAccount.eligibleForExtension == null) && ((str21 = this.paidForTillDate) != null ? str21.equals(getAccount.paidForTillDate) : getAccount.paidForTillDate == null) && ((str22 = this.updatedById) != null ? str22.equals(getAccount.updatedById) : getAccount.updatedById == null) && ((str23 = this.website) != null ? str23.equals(getAccount.website) : getAccount.website == null) && ((list2 = this.workingHours) != null ? list2.equals(getAccount.workingHours) : getAccount.workingHours == null) && ((list3 = this.webPreferences) != null ? list3.equals(getAccount.webPreferences) : getAccount.webPreferences == null) && ((list4 = this.permissions) != null ? list4.equals(getAccount.permissions) : getAccount.permissions == null) && ((bool3 = this.enableCustomCharts) != null ? bool3.equals(getAccount.enableCustomCharts) : getAccount.enableCustomCharts == null) && ((str24 = this.createdAt) != null ? str24.equals(getAccount.createdAt) : getAccount.createdAt == null) && ((str25 = this.updatedAt) != null ? str25.equals(getAccount.updatedAt) : getAccount.updatedAt == null) && ((str26 = this.dealMode) != null ? str26.equals(getAccount.dealMode) : getAccount.dealMode == null) && ((str27 = this.openAiApiKey) != null ? str27.equals(getAccount.openAiApiKey) : getAccount.openAiApiKey == null) && ((list5 = this.salesmaxSalesContacts) != null ? list5.equals(getAccount.salesmaxSalesContacts) : getAccount.salesmaxSalesContacts == null) && ((list6 = this.salesmaxSupportContacts) != null ? list6.equals(getAccount.salesmaxSupportContacts) : getAccount.salesmaxSupportContacts == null) && ((str28 = this.chatWidgetConfig) != null ? str28.equals(getAccount.chatWidgetConfig) : getAccount.chatWidgetConfig == null) && ((str29 = this.onboardingStatus) != null ? str29.equals(getAccount.onboardingStatus) : getAccount.onboardingStatus == null) && ((str30 = this.integrationNeeded) != null ? str30.equals(getAccount.integrationNeeded) : getAccount.integrationNeeded == null) && ((str31 = this.matchingDealId) != null ? str31.equals(getAccount.matchingDealId) : getAccount.matchingDealId == null) && ((list7 = this.relatedAccountIds) != null ? list7.equals(getAccount.relatedAccountIds) : getAccount.relatedAccountIds == null) && ((accountStats = this.accountStats) != null ? accountStats.equals(getAccount.accountStats) : getAccount.accountStats == null) && ((str32 = this.lastChurnDate) != null ? str32.equals(getAccount.lastChurnDate) : getAccount.lastChurnDate == null) && ((str33 = this.lastChurnReason) != null ? str33.equals(getAccount.lastChurnReason) : getAccount.lastChurnReason == null) && ((str34 = this.possibleReactivationDate) != null ? str34.equals(getAccount.possibleReactivationDate) : getAccount.possibleReactivationDate == null) && ((d = this.locationPeriodicFrequency) != null ? d.equals(getAccount.locationPeriodicFrequency) : getAccount.locationPeriodicFrequency == null) && ((str35 = this.lastPaymentDataId) != null ? str35.equals(getAccount.lastPaymentDataId) : getAccount.lastPaymentDataId == null) && ((str36 = this.lastPaymentDataCreatedAt) != null ? str36.equals(getAccount.lastPaymentDataCreatedAt) : getAccount.lastPaymentDataCreatedAt == null) && ((str37 = this.nextRenewalDateIfPaid) != null ? str37.equals(getAccount.nextRenewalDateIfPaid) : getAccount.nextRenewalDateIfPaid == null) && ((str38 = this.lastPaymentStatus) != null ? str38.equals(getAccount.lastPaymentStatus) : getAccount.lastPaymentStatus == null) && ((num9 = this.partPaymentAmountIfAny) != null ? num9.equals(getAccount.partPaymentAmountIfAny) : getAccount.partPaymentAmountIfAny == null) && ((subscriptions = this.subscriptions) != null ? subscriptions.equals(getAccount.subscriptions) : getAccount.subscriptions == null) && ((lastPaymentData = this.lastPaymentData) != null ? lastPaymentData.equals(getAccount.lastPaymentData) : getAccount.lastPaymentData == null) && ((matchingDeal = this.matchingDeal) != null ? matchingDeal.equals(getAccount.matchingDeal) : getAccount.matchingDeal == null) && ((createdByUser = this.createdByUser) != null ? createdByUser.equals(getAccount.createdByUser) : getAccount.createdByUser == null)) {
                UpdatedByUser updatedByUser = this.updatedByUser;
                UpdatedByUser updatedByUser2 = getAccount.updatedByUser;
                if (updatedByUser == null) {
                    if (updatedByUser2 == null) {
                        return true;
                    }
                } else if (updatedByUser.equals(updatedByUser2)) {
                    return true;
                }
            }
            return false;
        }

        public Integer extraActiveUsers() {
            return this.extraActiveUsers;
        }

        public Integer freeSeats() {
            return this.freeSeats;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountName.hashCode()) * 1000003) ^ this.accountType.hashCode()) * 1000003;
                String str = this.deviceKey;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.deviceKeyLastUpdated;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                AccountStatus accountStatus = this.accountStatus;
                int iHashCode4 = (iHashCode3 ^ (accountStatus == null ? 0 : accountStatus.hashCode())) * 1000003;
                String str3 = this.businessLogoUrl;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdById;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.dateFormat;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.dateTimeViewStyle;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.defaultCurrency;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.denomination;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.industry;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.nameOfBusiness;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                List<String> list = this.productOrService;
                int iHashCode13 = (iHashCode12 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str11 = this.timeFormat;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.timeZone;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.plan;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.paidUpTo;
                int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                Integer num = this.seats;
                int iHashCode18 = (iHashCode17 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.freeSeats;
                int iHashCode19 = (iHashCode18 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.currentTotalUsers;
                int iHashCode20 = (iHashCode19 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.currentActiveUsers;
                int iHashCode21 = (iHashCode20 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.extraActiveUsers;
                int iHashCode22 = (iHashCode21 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.pricePerSeat;
                int iHashCode23 = (iHashCode22 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Boolean bool = this.allowAddingSeat;
                int iHashCode24 = (iHashCode23 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str15 = this.allowAddingSeatTill;
                int iHashCode25 = (iHashCode24 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                Integer num7 = this.seatReductionMarkedForNextCycle;
                int iHashCode26 = (iHashCode25 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                String str16 = this.billingCurrency;
                int iHashCode27 = (iHashCode26 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.billingEmail;
                int iHashCode28 = (iHashCode27 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.taxId;
                int iHashCode29 = (iHashCode28 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.taxIdType;
                int iHashCode30 = (iHashCode29 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.trialAccountEndDate;
                int iHashCode31 = (iHashCode30 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                Integer num8 = this.trialExtensionTimes;
                int iHashCode32 = (iHashCode31 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                Boolean bool2 = this.eligibleForExtension;
                int iHashCode33 = (iHashCode32 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str21 = this.paidForTillDate;
                int iHashCode34 = (iHashCode33 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.updatedById;
                int iHashCode35 = (iHashCode34 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.website;
                int iHashCode36 = (iHashCode35 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                List<WorkingHour> list2 = this.workingHours;
                int iHashCode37 = (iHashCode36 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<WebPreference> list3 = this.webPreferences;
                int iHashCode38 = (iHashCode37 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                List<String> list4 = this.permissions;
                int iHashCode39 = (iHashCode38 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                Boolean bool3 = this.enableCustomCharts;
                int iHashCode40 = (iHashCode39 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                String str24 = this.createdAt;
                int iHashCode41 = (iHashCode40 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.updatedAt;
                int iHashCode42 = (iHashCode41 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.dealMode;
                int iHashCode43 = (iHashCode42 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.openAiApiKey;
                int iHashCode44 = (iHashCode43 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                List<String> list5 = this.salesmaxSalesContacts;
                int iHashCode45 = (iHashCode44 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
                List<String> list6 = this.salesmaxSupportContacts;
                int iHashCode46 = (iHashCode45 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003;
                String str28 = this.chatWidgetConfig;
                int iHashCode47 = (iHashCode46 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.onboardingStatus;
                int iHashCode48 = (iHashCode47 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.integrationNeeded;
                int iHashCode49 = (iHashCode48 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                String str31 = this.matchingDealId;
                int iHashCode50 = (iHashCode49 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                List<String> list7 = this.relatedAccountIds;
                int iHashCode51 = (iHashCode50 ^ (list7 == null ? 0 : list7.hashCode())) * 1000003;
                AccountStats accountStats = this.accountStats;
                int iHashCode52 = (iHashCode51 ^ (accountStats == null ? 0 : accountStats.hashCode())) * 1000003;
                String str32 = this.lastChurnDate;
                int iHashCode53 = (iHashCode52 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.lastChurnReason;
                int iHashCode54 = (iHashCode53 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.possibleReactivationDate;
                int iHashCode55 = (iHashCode54 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                Double d = this.locationPeriodicFrequency;
                int iHashCode56 = (iHashCode55 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str35 = this.lastPaymentDataId;
                int iHashCode57 = (iHashCode56 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.lastPaymentDataCreatedAt;
                int iHashCode58 = (iHashCode57 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                String str37 = this.nextRenewalDateIfPaid;
                int iHashCode59 = (iHashCode58 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                String str38 = this.lastPaymentStatus;
                int iHashCode60 = (iHashCode59 ^ (str38 == null ? 0 : str38.hashCode())) * 1000003;
                Integer num9 = this.partPaymentAmountIfAny;
                int iHashCode61 = (iHashCode60 ^ (num9 == null ? 0 : num9.hashCode())) * 1000003;
                Subscriptions subscriptions = this.subscriptions;
                int iHashCode62 = (iHashCode61 ^ (subscriptions == null ? 0 : subscriptions.hashCode())) * 1000003;
                LastPaymentData lastPaymentData = this.lastPaymentData;
                int iHashCode63 = (iHashCode62 ^ (lastPaymentData == null ? 0 : lastPaymentData.hashCode())) * 1000003;
                MatchingDeal matchingDeal = this.matchingDeal;
                int iHashCode64 = (iHashCode63 ^ (matchingDeal == null ? 0 : matchingDeal.hashCode())) * 1000003;
                CreatedByUser createdByUser = this.createdByUser;
                int iHashCode65 = (iHashCode64 ^ (createdByUser == null ? 0 : createdByUser.hashCode())) * 1000003;
                UpdatedByUser updatedByUser = this.updatedByUser;
                this.$hashCode = iHashCode65 ^ (updatedByUser != null ? updatedByUser.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String industry() {
            return this.industry;
        }

        public String integrationNeeded() {
            return this.integrationNeeded;
        }

        public String lastChurnDate() {
            return this.lastChurnDate;
        }

        public String lastChurnReason() {
            return this.lastChurnReason;
        }

        public LastPaymentData lastPaymentData() {
            return this.lastPaymentData;
        }

        public String lastPaymentDataCreatedAt() {
            return this.lastPaymentDataCreatedAt;
        }

        public String lastPaymentDataId() {
            return this.lastPaymentDataId;
        }

        public String lastPaymentStatus() {
            return this.lastPaymentStatus;
        }

        public Double locationPeriodicFrequency() {
            return this.locationPeriodicFrequency;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetAccount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetAccount.this.id);
                    responseWriter.writeString(responseFieldArr[2], GetAccount.this.accountName);
                    responseWriter.writeString(responseFieldArr[3], GetAccount.this.accountType.name());
                    responseWriter.writeString(responseFieldArr[4], GetAccount.this.deviceKey);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], GetAccount.this.deviceKeyLastUpdated);
                    ResponseField responseField = responseFieldArr[6];
                    AccountStatus accountStatus = GetAccount.this.accountStatus;
                    responseWriter.writeString(responseField, accountStatus != null ? accountStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[7], GetAccount.this.businessLogoUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], GetAccount.this.createdById);
                    responseWriter.writeString(responseFieldArr[9], GetAccount.this.dateFormat);
                    responseWriter.writeString(responseFieldArr[10], GetAccount.this.dateTimeViewStyle);
                    responseWriter.writeString(responseFieldArr[11], GetAccount.this.defaultCurrency);
                    responseWriter.writeString(responseFieldArr[12], GetAccount.this.denomination);
                    responseWriter.writeString(responseFieldArr[13], GetAccount.this.industry);
                    responseWriter.writeString(responseFieldArr[14], GetAccount.this.nameOfBusiness);
                    responseWriter.writeList(responseFieldArr[15], GetAccount.this.productOrService, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[16], GetAccount.this.timeFormat);
                    responseWriter.writeString(responseFieldArr[17], GetAccount.this.timeZone);
                    responseWriter.writeString(responseFieldArr[18], GetAccount.this.plan);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], GetAccount.this.paidUpTo);
                    responseWriter.writeInt(responseFieldArr[20], GetAccount.this.seats);
                    responseWriter.writeInt(responseFieldArr[21], GetAccount.this.freeSeats);
                    responseWriter.writeInt(responseFieldArr[22], GetAccount.this.currentTotalUsers);
                    responseWriter.writeInt(responseFieldArr[23], GetAccount.this.currentActiveUsers);
                    responseWriter.writeInt(responseFieldArr[24], GetAccount.this.extraActiveUsers);
                    responseWriter.writeInt(responseFieldArr[25], GetAccount.this.pricePerSeat);
                    responseWriter.writeBoolean(responseFieldArr[26], GetAccount.this.allowAddingSeat);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], GetAccount.this.allowAddingSeatTill);
                    responseWriter.writeInt(responseFieldArr[28], GetAccount.this.seatReductionMarkedForNextCycle);
                    responseWriter.writeString(responseFieldArr[29], GetAccount.this.billingCurrency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], GetAccount.this.billingEmail);
                    responseWriter.writeString(responseFieldArr[31], GetAccount.this.taxId);
                    responseWriter.writeString(responseFieldArr[32], GetAccount.this.taxIdType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], GetAccount.this.trialAccountEndDate);
                    responseWriter.writeInt(responseFieldArr[34], GetAccount.this.trialExtensionTimes);
                    responseWriter.writeBoolean(responseFieldArr[35], GetAccount.this.eligibleForExtension);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], GetAccount.this.paidForTillDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], GetAccount.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], GetAccount.this.website);
                    responseWriter.writeList(responseFieldArr[39], GetAccount.this.workingHours, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((WorkingHour) obj).marshaller());
                        }
                    });
                    responseWriter.writeList(responseFieldArr[40], GetAccount.this.webPreferences, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((WebPreference) obj).marshaller());
                        }
                    });
                    responseWriter.writeList(responseFieldArr[41], GetAccount.this.permissions, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeBoolean(responseFieldArr[42], GetAccount.this.enableCustomCharts);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[43], GetAccount.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[44], GetAccount.this.updatedAt);
                    responseWriter.writeString(responseFieldArr[45], GetAccount.this.dealMode);
                    responseWriter.writeString(responseFieldArr[46], GetAccount.this.openAiApiKey);
                    responseWriter.writeList(responseFieldArr[47], GetAccount.this.salesmaxSalesContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1.5
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[48], GetAccount.this.salesmaxSupportContacts, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1.6
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[49], GetAccount.this.chatWidgetConfig);
                    responseWriter.writeString(responseFieldArr[50], GetAccount.this.onboardingStatus);
                    responseWriter.writeString(responseFieldArr[51], GetAccount.this.integrationNeeded);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[52], GetAccount.this.matchingDealId);
                    responseWriter.writeList(responseFieldArr[53], GetAccount.this.relatedAccountIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.GetAccount.1.7
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    ResponseField responseField2 = responseFieldArr[54];
                    AccountStats accountStats = GetAccount.this.accountStats;
                    responseWriter.writeObject(responseField2, accountStats != null ? accountStats.marshaller() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[55], GetAccount.this.lastChurnDate);
                    responseWriter.writeString(responseFieldArr[56], GetAccount.this.lastChurnReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[57], GetAccount.this.possibleReactivationDate);
                    responseWriter.writeDouble(responseFieldArr[58], GetAccount.this.locationPeriodicFrequency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[59], GetAccount.this.lastPaymentDataId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[60], GetAccount.this.lastPaymentDataCreatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[61], GetAccount.this.nextRenewalDateIfPaid);
                    responseWriter.writeString(responseFieldArr[62], GetAccount.this.lastPaymentStatus);
                    responseWriter.writeInt(responseFieldArr[63], GetAccount.this.partPaymentAmountIfAny);
                    ResponseField responseField3 = responseFieldArr[64];
                    Subscriptions subscriptions = GetAccount.this.subscriptions;
                    responseWriter.writeObject(responseField3, subscriptions != null ? subscriptions.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[65];
                    LastPaymentData lastPaymentData = GetAccount.this.lastPaymentData;
                    responseWriter.writeObject(responseField4, lastPaymentData != null ? lastPaymentData.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[66];
                    MatchingDeal matchingDeal = GetAccount.this.matchingDeal;
                    responseWriter.writeObject(responseField5, matchingDeal != null ? matchingDeal.marshaller() : null);
                    ResponseField responseField6 = responseFieldArr[67];
                    CreatedByUser createdByUser = GetAccount.this.createdByUser;
                    responseWriter.writeObject(responseField6, createdByUser != null ? createdByUser.marshaller() : null);
                    ResponseField responseField7 = responseFieldArr[68];
                    UpdatedByUser updatedByUser = GetAccount.this.updatedByUser;
                    responseWriter.writeObject(responseField7, updatedByUser != null ? updatedByUser.marshaller() : null);
                }
            };
        }

        public MatchingDeal matchingDeal() {
            return this.matchingDeal;
        }

        public String matchingDealId() {
            return this.matchingDealId;
        }

        public String nameOfBusiness() {
            return this.nameOfBusiness;
        }

        public String nextRenewalDateIfPaid() {
            return this.nextRenewalDateIfPaid;
        }

        public String onboardingStatus() {
            return this.onboardingStatus;
        }

        public String openAiApiKey() {
            return this.openAiApiKey;
        }

        public String paidForTillDate() {
            return this.paidForTillDate;
        }

        public String paidUpTo() {
            return this.paidUpTo;
        }

        public Integer partPaymentAmountIfAny() {
            return this.partPaymentAmountIfAny;
        }

        public List<String> permissions() {
            return this.permissions;
        }

        public String plan() {
            return this.plan;
        }

        public String possibleReactivationDate() {
            return this.possibleReactivationDate;
        }

        public Integer pricePerSeat() {
            return this.pricePerSeat;
        }

        public List<String> productOrService() {
            return this.productOrService;
        }

        public List<String> relatedAccountIds() {
            return this.relatedAccountIds;
        }

        public List<String> salesmaxSalesContacts() {
            return this.salesmaxSalesContacts;
        }

        public List<String> salesmaxSupportContacts() {
            return this.salesmaxSupportContacts;
        }

        public Integer seatReductionMarkedForNextCycle() {
            return this.seatReductionMarkedForNextCycle;
        }

        public Integer seats() {
            return this.seats;
        }

        public Subscriptions subscriptions() {
            return this.subscriptions;
        }

        public String taxId() {
            return this.taxId;
        }

        public String taxIdType() {
            return this.taxIdType;
        }

        public String timeFormat() {
            return this.timeFormat;
        }

        public String timeZone() {
            return this.timeZone;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetAccount{__typename=" + this.__typename + ", id=" + this.id + ", accountName=" + this.accountName + ", accountType=" + this.accountType + ", deviceKey=" + this.deviceKey + ", deviceKeyLastUpdated=" + this.deviceKeyLastUpdated + ", accountStatus=" + this.accountStatus + ", businessLogoUrl=" + this.businessLogoUrl + ", createdById=" + this.createdById + ", dateFormat=" + this.dateFormat + ", dateTimeViewStyle=" + this.dateTimeViewStyle + ", defaultCurrency=" + this.defaultCurrency + ", denomination=" + this.denomination + ", industry=" + this.industry + ", nameOfBusiness=" + this.nameOfBusiness + ", productOrService=" + this.productOrService + ", timeFormat=" + this.timeFormat + ", timeZone=" + this.timeZone + ", plan=" + this.plan + ", paidUpTo=" + this.paidUpTo + ", seats=" + this.seats + ", freeSeats=" + this.freeSeats + ", currentTotalUsers=" + this.currentTotalUsers + ", currentActiveUsers=" + this.currentActiveUsers + ", extraActiveUsers=" + this.extraActiveUsers + ", pricePerSeat=" + this.pricePerSeat + ", allowAddingSeat=" + this.allowAddingSeat + ", allowAddingSeatTill=" + this.allowAddingSeatTill + ", seatReductionMarkedForNextCycle=" + this.seatReductionMarkedForNextCycle + ", billingCurrency=" + this.billingCurrency + ", billingEmail=" + this.billingEmail + ", taxId=" + this.taxId + ", taxIdType=" + this.taxIdType + ", trialAccountEndDate=" + this.trialAccountEndDate + ", trialExtensionTimes=" + this.trialExtensionTimes + ", eligibleForExtension=" + this.eligibleForExtension + ", paidForTillDate=" + this.paidForTillDate + ", updatedById=" + this.updatedById + ", website=" + this.website + ", workingHours=" + this.workingHours + ", webPreferences=" + this.webPreferences + ", permissions=" + this.permissions + ", enableCustomCharts=" + this.enableCustomCharts + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", dealMode=" + this.dealMode + ", openAiApiKey=" + this.openAiApiKey + ", salesmaxSalesContacts=" + this.salesmaxSalesContacts + ", salesmaxSupportContacts=" + this.salesmaxSupportContacts + ", chatWidgetConfig=" + this.chatWidgetConfig + ", onboardingStatus=" + this.onboardingStatus + ", integrationNeeded=" + this.integrationNeeded + ", matchingDealId=" + this.matchingDealId + ", relatedAccountIds=" + this.relatedAccountIds + ", accountStats=" + this.accountStats + ", lastChurnDate=" + this.lastChurnDate + ", lastChurnReason=" + this.lastChurnReason + ", possibleReactivationDate=" + this.possibleReactivationDate + ", locationPeriodicFrequency=" + this.locationPeriodicFrequency + ", lastPaymentDataId=" + this.lastPaymentDataId + ", lastPaymentDataCreatedAt=" + this.lastPaymentDataCreatedAt + ", nextRenewalDateIfPaid=" + this.nextRenewalDateIfPaid + ", lastPaymentStatus=" + this.lastPaymentStatus + ", partPaymentAmountIfAny=" + this.partPaymentAmountIfAny + ", subscriptions=" + this.subscriptions + ", lastPaymentData=" + this.lastPaymentData + ", matchingDeal=" + this.matchingDeal + ", createdByUser=" + this.createdByUser + ", updatedByUser=" + this.updatedByUser + "}";
            }
            return this.$toString;
        }

        public String trialAccountEndDate() {
            return this.trialAccountEndDate;
        }

        public Integer trialExtensionTimes() {
            return this.trialExtensionTimes;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public UpdatedByUser updatedByUser() {
            return this.updatedByUser;
        }

        public List<WebPreference> webPreferences() {
            return this.webPreferences;
        }

        public String website() {
            return this.website;
        }

        public List<WorkingHour> workingHours() {
            return this.workingHours;
        }
    }

    public static class LastPaymentData {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Integer amount;
        final Integer amountPaid;
        final String contactId;
        final String createdAt;
        final String createdById;
        final String currency;
        final String customPaymentData;
        final String engagementId;
        final String finalPaymentDate;
        final String id;
        final String lastPaymentStatus;
        final String note;
        final String orderId;
        final String orderIdInPaymentProvider;
        final List<String> paidByContactIds;
        final String paymentLinkId;
        final String paymentLinkUrl;
        final String paymentProvider;
        final String paymentRequestType;
        final String status;
        final List<String> transactionId;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<LastPaymentData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastPaymentData map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastPaymentData.$responseFields;
                return new LastPaymentData(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readInt(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readList(responseFieldArr[17], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.LastPaymentData.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.ID);
                    }
                }), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.LastPaymentData.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentRequestType", "paymentRequestType", null, true, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentProvider", "paymentProvider", null, true, Collections.emptyList()), ResponseField.forString("orderIdInPaymentProvider", "orderIdInPaymentProvider", null, true, Collections.emptyList()), ResponseField.forCustomType("orderId", "orderId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("paymentLinkId", "paymentLinkId", null, true, customType, Collections.emptyList()), ResponseField.forString("paymentLinkUrl", "paymentLinkUrl", null, true, Collections.emptyList()), ResponseField.forInt("amount", "amount", null, true, Collections.emptyList()), ResponseField.forInt("amountPaid", "amountPaid", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("lastPaymentStatus", "lastPaymentStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("finalPaymentDate", "finalPaymentDate", null, true, customType2, Collections.emptyList()), ResponseField.forList("paidByContactIds", "paidByContactIds", null, true, Collections.emptyList()), ResponseField.forList("transactionId", "transactionId", null, true, Collections.emptyList()), ResponseField.forString("note", "note", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("customPaymentData", "customPaymentData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public LastPaymentData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, String str15, List<String> list, List<String> list2, String str16, String str17, String str18, String str19, String str20, String str21) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = str4;
            this.paymentRequestType = str5;
            this.engagementId = str6;
            this.paymentProvider = str7;
            this.orderIdInPaymentProvider = str8;
            this.orderId = str9;
            this.paymentLinkId = str10;
            this.paymentLinkUrl = str11;
            this.amount = num;
            this.amountPaid = num2;
            this.currency = str12;
            this.status = str13;
            this.lastPaymentStatus = str14;
            this.finalPaymentDate = str15;
            this.paidByContactIds = list;
            this.transactionId = list2;
            this.note = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
            this.customPaymentData = str19;
            this.createdById = str20;
            this.updatedById = str21;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Integer amount() {
            return this.amount;
        }

        public Integer amountPaid() {
            return this.amountPaid;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String currency() {
            return this.currency;
        }

        public String customPaymentData() {
            return this.customPaymentData;
        }

        public String engagementId() {
            return this.engagementId;
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
            Integer num;
            Integer num2;
            String str9;
            String str10;
            String str11;
            String str12;
            List<String> list;
            List<String> list2;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LastPaymentData)) {
                return false;
            }
            LastPaymentData lastPaymentData = (LastPaymentData) obj;
            if (this.__typename.equals(lastPaymentData.__typename) && this.id.equals(lastPaymentData.id) && this.accountId.equals(lastPaymentData.accountId) && ((str = this.contactId) != null ? str.equals(lastPaymentData.contactId) : lastPaymentData.contactId == null) && ((str2 = this.paymentRequestType) != null ? str2.equals(lastPaymentData.paymentRequestType) : lastPaymentData.paymentRequestType == null) && ((str3 = this.engagementId) != null ? str3.equals(lastPaymentData.engagementId) : lastPaymentData.engagementId == null) && ((str4 = this.paymentProvider) != null ? str4.equals(lastPaymentData.paymentProvider) : lastPaymentData.paymentProvider == null) && ((str5 = this.orderIdInPaymentProvider) != null ? str5.equals(lastPaymentData.orderIdInPaymentProvider) : lastPaymentData.orderIdInPaymentProvider == null) && ((str6 = this.orderId) != null ? str6.equals(lastPaymentData.orderId) : lastPaymentData.orderId == null) && ((str7 = this.paymentLinkId) != null ? str7.equals(lastPaymentData.paymentLinkId) : lastPaymentData.paymentLinkId == null) && ((str8 = this.paymentLinkUrl) != null ? str8.equals(lastPaymentData.paymentLinkUrl) : lastPaymentData.paymentLinkUrl == null) && ((num = this.amount) != null ? num.equals(lastPaymentData.amount) : lastPaymentData.amount == null) && ((num2 = this.amountPaid) != null ? num2.equals(lastPaymentData.amountPaid) : lastPaymentData.amountPaid == null) && ((str9 = this.currency) != null ? str9.equals(lastPaymentData.currency) : lastPaymentData.currency == null) && ((str10 = this.status) != null ? str10.equals(lastPaymentData.status) : lastPaymentData.status == null) && ((str11 = this.lastPaymentStatus) != null ? str11.equals(lastPaymentData.lastPaymentStatus) : lastPaymentData.lastPaymentStatus == null) && ((str12 = this.finalPaymentDate) != null ? str12.equals(lastPaymentData.finalPaymentDate) : lastPaymentData.finalPaymentDate == null) && ((list = this.paidByContactIds) != null ? list.equals(lastPaymentData.paidByContactIds) : lastPaymentData.paidByContactIds == null) && ((list2 = this.transactionId) != null ? list2.equals(lastPaymentData.transactionId) : lastPaymentData.transactionId == null) && ((str13 = this.note) != null ? str13.equals(lastPaymentData.note) : lastPaymentData.note == null) && ((str14 = this.createdAt) != null ? str14.equals(lastPaymentData.createdAt) : lastPaymentData.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(lastPaymentData.updatedAt) : lastPaymentData.updatedAt == null) && ((str16 = this.customPaymentData) != null ? str16.equals(lastPaymentData.customPaymentData) : lastPaymentData.customPaymentData == null) && ((str17 = this.createdById) != null ? str17.equals(lastPaymentData.createdById) : lastPaymentData.createdById == null)) {
                String str18 = this.updatedById;
                String str19 = lastPaymentData.updatedById;
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

        public String finalPaymentDate() {
            return this.finalPaymentDate;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.paymentRequestType;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.engagementId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.paymentProvider;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.orderIdInPaymentProvider;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.orderId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.paymentLinkId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.paymentLinkUrl;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                Integer num = this.amount;
                int iHashCode10 = (iHashCode9 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.amountPaid;
                int iHashCode11 = (iHashCode10 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str9 = this.currency;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.status;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.lastPaymentStatus;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.finalPaymentDate;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list = this.paidByContactIds;
                int iHashCode16 = (iHashCode15 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.transactionId;
                int iHashCode17 = (iHashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str13 = this.note;
                int iHashCode18 = (iHashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode19 = (iHashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode20 = (iHashCode19 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.customPaymentData;
                int iHashCode21 = (iHashCode20 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedById;
                this.$hashCode = iHashCode22 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastPaymentStatus() {
            return this.lastPaymentStatus;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.LastPaymentData.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastPaymentData.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastPaymentData.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], LastPaymentData.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], LastPaymentData.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], LastPaymentData.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], LastPaymentData.this.paymentRequestType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], LastPaymentData.this.engagementId);
                    responseWriter.writeString(responseFieldArr[6], LastPaymentData.this.paymentProvider);
                    responseWriter.writeString(responseFieldArr[7], LastPaymentData.this.orderIdInPaymentProvider);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], LastPaymentData.this.orderId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], LastPaymentData.this.paymentLinkId);
                    responseWriter.writeString(responseFieldArr[10], LastPaymentData.this.paymentLinkUrl);
                    responseWriter.writeInt(responseFieldArr[11], LastPaymentData.this.amount);
                    responseWriter.writeInt(responseFieldArr[12], LastPaymentData.this.amountPaid);
                    responseWriter.writeString(responseFieldArr[13], LastPaymentData.this.currency);
                    responseWriter.writeString(responseFieldArr[14], LastPaymentData.this.status);
                    responseWriter.writeString(responseFieldArr[15], LastPaymentData.this.lastPaymentStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], LastPaymentData.this.finalPaymentDate);
                    responseWriter.writeList(responseFieldArr[17], LastPaymentData.this.paidByContactIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.LastPaymentData.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.ID, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[18], LastPaymentData.this.transactionId, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.LastPaymentData.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[19], LastPaymentData.this.note);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], LastPaymentData.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], LastPaymentData.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], LastPaymentData.this.customPaymentData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], LastPaymentData.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], LastPaymentData.this.updatedById);
                }
            };
        }

        public String note() {
            return this.note;
        }

        public String orderId() {
            return this.orderId;
        }

        public String orderIdInPaymentProvider() {
            return this.orderIdInPaymentProvider;
        }

        public List<String> paidByContactIds() {
            return this.paidByContactIds;
        }

        public String paymentLinkId() {
            return this.paymentLinkId;
        }

        public String paymentLinkUrl() {
            return this.paymentLinkUrl;
        }

        public String paymentProvider() {
            return this.paymentProvider;
        }

        public String paymentRequestType() {
            return this.paymentRequestType;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastPaymentData{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", paymentRequestType=" + this.paymentRequestType + ", engagementId=" + this.engagementId + ", paymentProvider=" + this.paymentProvider + ", orderIdInPaymentProvider=" + this.orderIdInPaymentProvider + ", orderId=" + this.orderId + ", paymentLinkId=" + this.paymentLinkId + ", paymentLinkUrl=" + this.paymentLinkUrl + ", amount=" + this.amount + ", amountPaid=" + this.amountPaid + ", currency=" + this.currency + ", status=" + this.status + ", lastPaymentStatus=" + this.lastPaymentStatus + ", finalPaymentDate=" + this.finalPaymentDate + ", paidByContactIds=" + this.paidByContactIds + ", transactionId=" + this.transactionId + ", note=" + this.note + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", customPaymentData=" + this.customPaymentData + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public List<String> transactionId() {
            return this.transactionId;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static class MatchingDeal {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Double amount;
        final String createdAt;
        final String createdByUser;
        final String currency;
        final String customDealData;
        final String dealLostReason;
        final DealOutcome dealOutcome;
        final String dealStage;
        final String dealStageUpdatedAt;
        final DealState dealState;
        final String description;
        final String id;
        final String lastActivity;
        final String lastUpdatedByUser;
        final String name;
        final String openTaskDetail;
        final String ownerId;
        final String primaryTeamId;
        final List<String> recentEngagements;
        final String recentEngagementsUpdatedAt;
        final List<String> tags;
        final List<String> transitionSummary;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<MatchingDeal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public MatchingDeal map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = MatchingDeal.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                DealState dealStateValueOf = string5 != null ? DealState.valueOf(string5) : null;
                String string6 = responseReader.readString(responseFieldArr[8]);
                return new MatchingDeal(string, str, str2, string2, string3, string4, str3, dealStateValueOf, string6 != null ? DealOutcome.valueOf(string6) : null, responseReader.readString(responseFieldArr[9]), responseReader.readDouble(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readList(responseFieldArr[17], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.MatchingDeal.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.MatchingDeal.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readList(responseFieldArr[21], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.MatchingDeal.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("dealStageUpdatedAt", "dealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealState", "dealState", null, true, Collections.emptyList()), ResponseField.forString("dealOutcome", "dealOutcome", null, true, Collections.emptyList()), ResponseField.forString("dealLostReason", "dealLostReason", null, true, Collections.emptyList()), ResponseField.forDouble("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("createdByUser", "createdByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastUpdatedByUser", "lastUpdatedByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forList("transitionSummary", "transitionSummary", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastActivity", "lastActivity", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forCustomType("customDealData", "customDealData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public MatchingDeal(String str, String str2, String str3, String str4, String str5, String str6, String str7, DealState dealState, DealOutcome dealOutcome, String str8, Double d, String str9, String str10, String str11, String str12, String str13, String str14, List<String> list, List<String> list2, String str15, String str16, List<String> list3, String str17, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.dealStage = str6;
            this.dealStageUpdatedAt = str7;
            this.dealState = dealState;
            this.dealOutcome = dealOutcome;
            this.dealLostReason = str8;
            this.amount = d;
            this.currency = str9;
            this.createdByUser = str10;
            this.lastUpdatedByUser = str11;
            this.ownerId = str12;
            this.primaryTeamId = str13;
            this.openTaskDetail = str14;
            this.transitionSummary = list;
            this.recentEngagements = list2;
            this.recentEngagementsUpdatedAt = str15;
            this.lastActivity = str16;
            this.tags = list3;
            this.customDealData = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Double amount() {
            return this.amount;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdByUser() {
            return this.createdByUser;
        }

        public String currency() {
            return this.currency;
        }

        public String customDealData() {
            return this.customDealData;
        }

        public String dealLostReason() {
            return this.dealLostReason;
        }

        public DealOutcome dealOutcome() {
            return this.dealOutcome;
        }

        public String dealStage() {
            return this.dealStage;
        }

        public String dealStageUpdatedAt() {
            return this.dealStageUpdatedAt;
        }

        public DealState dealState() {
            return this.dealState;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            DealState dealState;
            DealOutcome dealOutcome;
            String str5;
            Double d;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            List<String> list;
            List<String> list2;
            String str12;
            String str13;
            List<String> list3;
            String str14;
            String str15;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchingDeal)) {
                return false;
            }
            MatchingDeal matchingDeal = (MatchingDeal) obj;
            if (this.__typename.equals(matchingDeal.__typename) && this.id.equals(matchingDeal.id) && this.accountId.equals(matchingDeal.accountId) && ((str = this.name) != null ? str.equals(matchingDeal.name) : matchingDeal.name == null) && ((str2 = this.description) != null ? str2.equals(matchingDeal.description) : matchingDeal.description == null) && ((str3 = this.dealStage) != null ? str3.equals(matchingDeal.dealStage) : matchingDeal.dealStage == null) && ((str4 = this.dealStageUpdatedAt) != null ? str4.equals(matchingDeal.dealStageUpdatedAt) : matchingDeal.dealStageUpdatedAt == null) && ((dealState = this.dealState) != null ? dealState.equals(matchingDeal.dealState) : matchingDeal.dealState == null) && ((dealOutcome = this.dealOutcome) != null ? dealOutcome.equals(matchingDeal.dealOutcome) : matchingDeal.dealOutcome == null) && ((str5 = this.dealLostReason) != null ? str5.equals(matchingDeal.dealLostReason) : matchingDeal.dealLostReason == null) && ((d = this.amount) != null ? d.equals(matchingDeal.amount) : matchingDeal.amount == null) && ((str6 = this.currency) != null ? str6.equals(matchingDeal.currency) : matchingDeal.currency == null) && ((str7 = this.createdByUser) != null ? str7.equals(matchingDeal.createdByUser) : matchingDeal.createdByUser == null) && ((str8 = this.lastUpdatedByUser) != null ? str8.equals(matchingDeal.lastUpdatedByUser) : matchingDeal.lastUpdatedByUser == null) && ((str9 = this.ownerId) != null ? str9.equals(matchingDeal.ownerId) : matchingDeal.ownerId == null) && ((str10 = this.primaryTeamId) != null ? str10.equals(matchingDeal.primaryTeamId) : matchingDeal.primaryTeamId == null) && ((str11 = this.openTaskDetail) != null ? str11.equals(matchingDeal.openTaskDetail) : matchingDeal.openTaskDetail == null) && ((list = this.transitionSummary) != null ? list.equals(matchingDeal.transitionSummary) : matchingDeal.transitionSummary == null) && ((list2 = this.recentEngagements) != null ? list2.equals(matchingDeal.recentEngagements) : matchingDeal.recentEngagements == null) && ((str12 = this.recentEngagementsUpdatedAt) != null ? str12.equals(matchingDeal.recentEngagementsUpdatedAt) : matchingDeal.recentEngagementsUpdatedAt == null) && ((str13 = this.lastActivity) != null ? str13.equals(matchingDeal.lastActivity) : matchingDeal.lastActivity == null) && ((list3 = this.tags) != null ? list3.equals(matchingDeal.tags) : matchingDeal.tags == null) && ((str14 = this.customDealData) != null ? str14.equals(matchingDeal.customDealData) : matchingDeal.customDealData == null) && ((str15 = this.createdAt) != null ? str15.equals(matchingDeal.createdAt) : matchingDeal.createdAt == null)) {
                String str16 = this.updatedAt;
                String str17 = matchingDeal.updatedAt;
                if (str16 == null) {
                    if (str17 == null) {
                        return true;
                    }
                } else if (str16.equals(str17)) {
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
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.dealStage;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.dealStageUpdatedAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                DealState dealState = this.dealState;
                int iHashCode6 = (iHashCode5 ^ (dealState == null ? 0 : dealState.hashCode())) * 1000003;
                DealOutcome dealOutcome = this.dealOutcome;
                int iHashCode7 = (iHashCode6 ^ (dealOutcome == null ? 0 : dealOutcome.hashCode())) * 1000003;
                String str5 = this.dealLostReason;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.amount;
                int iHashCode9 = (iHashCode8 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str6 = this.currency;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdByUser;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lastUpdatedByUser;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.ownerId;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.primaryTeamId;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.openTaskDetail;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                List<String> list = this.transitionSummary;
                int iHashCode16 = (iHashCode15 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.recentEngagements;
                int iHashCode17 = (iHashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str12 = this.recentEngagementsUpdatedAt;
                int iHashCode18 = (iHashCode17 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.lastActivity;
                int iHashCode19 = (iHashCode18 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                List<String> list3 = this.tags;
                int iHashCode20 = (iHashCode19 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str14 = this.customDealData;
                int iHashCode21 = (iHashCode20 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.createdAt;
                int iHashCode22 = (iHashCode21 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.updatedAt;
                this.$hashCode = iHashCode22 ^ (str16 != null ? str16.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastActivity() {
            return this.lastActivity;
        }

        public String lastUpdatedByUser() {
            return this.lastUpdatedByUser;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.MatchingDeal.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = MatchingDeal.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], MatchingDeal.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], MatchingDeal.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], MatchingDeal.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], MatchingDeal.this.name);
                    responseWriter.writeString(responseFieldArr[4], MatchingDeal.this.description);
                    responseWriter.writeString(responseFieldArr[5], MatchingDeal.this.dealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], MatchingDeal.this.dealStageUpdatedAt);
                    ResponseField responseField = responseFieldArr[7];
                    DealState dealState = MatchingDeal.this.dealState;
                    responseWriter.writeString(responseField, dealState != null ? dealState.name() : null);
                    ResponseField responseField2 = responseFieldArr[8];
                    DealOutcome dealOutcome = MatchingDeal.this.dealOutcome;
                    responseWriter.writeString(responseField2, dealOutcome != null ? dealOutcome.name() : null);
                    responseWriter.writeString(responseFieldArr[9], MatchingDeal.this.dealLostReason);
                    responseWriter.writeDouble(responseFieldArr[10], MatchingDeal.this.amount);
                    responseWriter.writeString(responseFieldArr[11], MatchingDeal.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], MatchingDeal.this.createdByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], MatchingDeal.this.lastUpdatedByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], MatchingDeal.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], MatchingDeal.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], MatchingDeal.this.openTaskDetail);
                    responseWriter.writeList(responseFieldArr[17], MatchingDeal.this.transitionSummary, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.MatchingDeal.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[18], MatchingDeal.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.MatchingDeal.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], MatchingDeal.this.recentEngagementsUpdatedAt);
                    responseWriter.writeString(responseFieldArr[20], MatchingDeal.this.lastActivity);
                    responseWriter.writeList(responseFieldArr[21], MatchingDeal.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.MatchingDeal.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], MatchingDeal.this.customDealData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], MatchingDeal.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], MatchingDeal.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String openTaskDetail() {
            return this.openTaskDetail;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public List<String> recentEngagements() {
            return this.recentEngagements;
        }

        public String recentEngagementsUpdatedAt() {
            return this.recentEngagementsUpdatedAt;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchingDeal{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", dealStage=" + this.dealStage + ", dealStageUpdatedAt=" + this.dealStageUpdatedAt + ", dealState=" + this.dealState + ", dealOutcome=" + this.dealOutcome + ", dealLostReason=" + this.dealLostReason + ", amount=" + this.amount + ", currency=" + this.currency + ", createdByUser=" + this.createdByUser + ", lastUpdatedByUser=" + this.lastUpdatedByUser + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", openTaskDetail=" + this.openTaskDetail + ", transitionSummary=" + this.transitionSummary + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", lastActivity=" + this.lastActivity + ", tags=" + this.tags + ", customDealData=" + this.customDealData + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public List<String> transitionSummary() {
            return this.transitionSummary;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Subscriptions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Subscriptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Subscriptions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Subscriptions.$responseFields;
                return new Subscriptions(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Subscriptions(String str, String str2) {
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
            if (!(obj instanceof Subscriptions)) {
                return false;
            }
            Subscriptions subscriptions = (Subscriptions) obj;
            if (this.__typename.equals(subscriptions.__typename)) {
                String str = this.nextToken;
                String str2 = subscriptions.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.Subscriptions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Subscriptions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Subscriptions.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Subscriptions.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Subscriptions{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class UpdatedByUser {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<UpdatedByUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdatedByUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdatedByUser.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new UpdatedByUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public UpdatedByUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdatedByUser)) {
                return false;
            }
            UpdatedByUser updatedByUser = (UpdatedByUser) obj;
            if (this.__typename.equals(updatedByUser.__typename) && this.id.equals(updatedByUser.id) && this.addedSourceType.equals(updatedByUser.addedSourceType) && this.name.equals(updatedByUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(updatedByUser.profilePictureUrl) : updatedByUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(updatedByUser.registeredEmail) : updatedByUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(updatedByUser.registeredEmailVerified) : updatedByUser.registeredEmailVerified == null) && this.registeredNumber.equals(updatedByUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(updatedByUser.registeredNumberVerified) : updatedByUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(updatedByUser.secondaryNumber) : updatedByUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(updatedByUser.secondaryNumberVerified) : updatedByUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(updatedByUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(updatedByUser.lastSelectedAccountWeb) : updatedByUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(updatedByUser.lastSelectedAccountApp) : updatedByUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(updatedByUser.appVersion) : updatedByUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(updatedByUser.deviceModel) : updatedByUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(updatedByUser.deviceManufacturer) : updatedByUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(updatedByUser.androidVersionRelease) : updatedByUser.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(updatedByUser.createdAt) : updatedByUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = updatedByUser.updatedAt;
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
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.UpdatedByUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdatedByUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdatedByUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdatedByUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], UpdatedByUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], UpdatedByUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], UpdatedByUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdatedByUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], UpdatedByUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdatedByUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], UpdatedByUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdatedByUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], UpdatedByUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], UpdatedByUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdatedByUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdatedByUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], UpdatedByUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], UpdatedByUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], UpdatedByUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], UpdatedByUser.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], UpdatedByUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], UpdatedByUser.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdatedByUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.Variables.1
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

    public static class WebPreference {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(TransferTable.COLUMN_KEY, TransferTable.COLUMN_KEY, null, true, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String key;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<WebPreference> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public WebPreference map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = WebPreference.$responseFields;
                return new WebPreference(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]));
            }
        }

        public WebPreference(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.key = str2;
            this.value = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WebPreference)) {
                return false;
            }
            WebPreference webPreference = (WebPreference) obj;
            if (this.__typename.equals(webPreference.__typename) && ((str = this.key) != null ? str.equals(webPreference.key) : webPreference.key == null)) {
                String str2 = this.value;
                String str3 = webPreference.value;
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
                String str = this.key;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.value;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String key() {
            return this.key;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.WebPreference.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = WebPreference.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], WebPreference.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], WebPreference.this.key);
                    responseWriter.writeString(responseFieldArr[2], WebPreference.this.value);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "WebPreference{__typename=" + this.__typename + ", key=" + this.key + ", value=" + this.value + "}";
            }
            return this.$toString;
        }

        public String value() {
            return this.value;
        }
    }

    public static class WorkingHour {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Day day;
        final String endTime;
        final String startTime;

        public static final class Mapper implements ResponseFieldMapper<WorkingHour> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public WorkingHour map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = WorkingHour.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String string2 = responseReader.readString(responseFieldArr[1]);
                return new WorkingHour(string, string2 != null ? Day.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]));
            }
        }

        static {
            CustomType customType = CustomType.AWSTIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("day", "day", null, true, Collections.emptyList()), ResponseField.forCustomType("startTime", "startTime", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("endTime", "endTime", null, true, customType, Collections.emptyList())};
        }

        public WorkingHour(String str, Day day, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.day = day;
            this.startTime = str2;
            this.endTime = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Day day() {
            return this.day;
        }

        public String endTime() {
            return this.endTime;
        }

        public boolean equals(Object obj) {
            Day day;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorkingHour)) {
                return false;
            }
            WorkingHour workingHour = (WorkingHour) obj;
            if (this.__typename.equals(workingHour.__typename) && ((day = this.day) != null ? day.equals(workingHour.day) : workingHour.day == null) && ((str = this.startTime) != null ? str.equals(workingHour.startTime) : workingHour.startTime == null)) {
                String str2 = this.endTime;
                String str3 = workingHour.endTime;
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
                Day day = this.day;
                int iHashCode2 = (iHashCode ^ (day == null ? 0 : day.hashCode())) * 1000003;
                String str = this.startTime;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.endTime;
                this.$hashCode = iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetAccountQuery.WorkingHour.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = WorkingHour.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], WorkingHour.this.__typename);
                    ResponseField responseField = responseFieldArr[1];
                    Day day = WorkingHour.this.day;
                    responseWriter.writeString(responseField, day != null ? day.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], WorkingHour.this.startTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], WorkingHour.this.endTime);
                }
            };
        }

        public String startTime() {
            return this.startTime;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "WorkingHour{__typename=" + this.__typename + ", day=" + this.day + ", startTime=" + this.startTime + ", endTime=" + this.endTime + "}";
            }
            return this.$toString;
        }
    }

    public GetAccountQuery(String str) {
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
        return "8cb8e361bac6bcf1925674f51e4b949d12628db0d05a291b7c1dddcd31436b57";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetAccount($id: ID!) {\n  getAccount(id: $id) {\n    __typename\n    id\n    accountName\n    accountType\n    deviceKey\n    deviceKeyLastUpdated\n    accountStatus\n    businessLogoUrl\n    createdById\n    dateFormat\n    dateTimeViewStyle\n    defaultCurrency\n    denomination\n    industry\n    nameOfBusiness\n    productOrService\n    timeFormat\n    timeZone\n    plan\n    paidUpTo\n    seats\n    freeSeats\n    currentTotalUsers\n    currentActiveUsers\n    extraActiveUsers\n    pricePerSeat\n    allowAddingSeat\n    allowAddingSeatTill\n    seatReductionMarkedForNextCycle\n    billingCurrency\n    billingEmail\n    taxId\n    taxIdType\n    trialAccountEndDate\n    trialExtensionTimes\n    eligibleForExtension\n    paidForTillDate\n    updatedById\n    website\n    workingHours {\n      __typename\n      day\n      startTime\n      endTime\n    }\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    permissions\n    enableCustomCharts\n    createdAt\n    updatedAt\n    dealMode\n    openAiApiKey\n    salesmaxSalesContacts\n    salesmaxSupportContacts\n    chatWidgetConfig\n    onboardingStatus\n    integrationNeeded\n    matchingDealId\n    relatedAccountIds\n    accountStats {\n      __typename\n      callSevenDays\n      wabaConversationSevenDays\n      wabaBroadcastSevenDays\n      paymentSevenDays\n      taskSevenDays\n      callPreviousSevenDays\n      wabaConversationPreviousSevenDays\n      contactCreatedPreviousSevenDays\n      bulkActionsSeventDays\n      bulkActionsSeventDays_BULK_UPLOAD\n      bulkActionsSeventDays_CREATE_TAG\n      bulkActionsSeventDays_CAMPAIGN_WITH_RULE\n      bulkActionsSeventDays_BULK_UPDATE\n      bulkActionsSeventDays_GENERATE_REPORT\n      bulkActionsSeventDays_REMOVE_USER\n      bulkActionsPreviousSeventDays\n      onboardingStepsDone\n    }\n    lastChurnDate\n    lastChurnReason\n    possibleReactivationDate\n    locationPeriodicFrequency\n    lastPaymentDataId\n    lastPaymentDataCreatedAt\n    nextRenewalDateIfPaid\n    lastPaymentStatus\n    partPaymentAmountIfAny\n    subscriptions {\n      __typename\n      nextToken\n    }\n    lastPaymentData {\n      __typename\n      id\n      accountId\n      contactId\n      paymentRequestType\n      engagementId\n      paymentProvider\n      orderIdInPaymentProvider\n      orderId\n      paymentLinkId\n      paymentLinkUrl\n      amount\n      amountPaid\n      currency\n      status\n      lastPaymentStatus\n      finalPaymentDate\n      paidByContactIds\n      transactionId\n      note\n      createdAt\n      updatedAt\n      customPaymentData\n      createdById\n      updatedById\n    }\n    matchingDeal {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    createdByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedByUser {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
