package com.amazonaws.amplify.generated.graphql;

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
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.AddedSourceType;
import type.CampaignRunFrequencyUnit;
import type.CampaignStatus;
import type.CampaignType;
import type.CustomType;
import type.UserRegistrationStatus;

/* loaded from: classes7.dex */
public final class GetCampaignRunQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetCampaignRun($id: ID!) {\n  getCampaignRun(id: $id) {\n    __typename\n    id\n    accountId\n    campaignId\n    campaignName\n    campaignType\n    campaignChannelIdentifier\n    name\n    startDate\n    endDate\n    status\n    systemPauseReason\n    leadCount\n    messageCreated\n    sentCount\n    deliveredCount\n    readCount\n    repliedCount\n    failedCount\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    createdAt\n    updatedAt\n    campaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetCampaignRun";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetCampaignRun($id: ID!) {\n  getCampaignRun(id: $id) {\n    __typename\n    id\n    accountId\n    campaignId\n    campaignName\n    campaignType\n    campaignChannelIdentifier\n    name\n    startDate\n    endDate\n    status\n    systemPauseReason\n    leadCount\n    messageCreated\n    sentCount\n    deliveredCount\n    readCount\n    repliedCount\n    failedCount\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    createdAt\n    updatedAt\n    campaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetCampaignRunQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetCampaignRunQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Campaign {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean allowMultiple;
        final String associatedEntityListId;
        final String campaignCategory;
        final String campaignChannelIdentifier;
        final String campaignData;
        final CampaignRunFrequencyUnit campaignRunFrequencyUnit;
        final Integer campaignRunFrequencyValue;
        final String campaignSubCategory;
        final CampaignType campaignType;
        final String createdAt;
        final List<String> daysToSend;
        final Integer deliveredCount;
        final String description;
        final Integer durationOfRunInDays;
        final String endDateOfRun;
        final Integer failedCount;
        final String id;
        final Boolean includeHistoricalMemberships;
        final Integer leadLimit;
        final Integer messageCreated;
        final String name;
        final String ownerId;
        final String primaryTeamId;
        final Integer readCount;
        final Integer repliedCount;
        final Integer sentCount;
        final String startDateOfRun;
        final CampaignStatus status;
        final String systemPauseReason;
        final List<String> tags;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Campaign> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Campaign map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Campaign.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                CampaignType campaignTypeValueOf = string6 != null ? CampaignType.valueOf(string6) : null;
                String string7 = responseReader.readString(responseFieldArr[8]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String string8 = responseReader.readString(responseFieldArr[10]);
                CampaignRunFrequencyUnit campaignRunFrequencyUnitValueOf = string8 != null ? CampaignRunFrequencyUnit.valueOf(string8) : null;
                Integer num = responseReader.readInt(responseFieldArr[11]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                Integer num2 = responseReader.readInt(responseFieldArr[14]);
                List list = responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Campaign.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                String string9 = responseReader.readString(responseFieldArr[18]);
                return new Campaign(string, str, str2, string2, string3, string4, string5, campaignTypeValueOf, string7, str3, campaignRunFrequencyUnitValueOf, num, str4, str5, num2, list, str6, str7, string9 != null ? CampaignStatus.valueOf(string9) : null, responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readBoolean(responseFieldArr[21]), responseReader.readBoolean(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readInt(responseFieldArr[26]), responseReader.readInt(responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readList(responseFieldArr[29], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Campaign.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readInt(responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("campaignCategory", "campaignCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignSubCategory", "campaignSubCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignType", "campaignType", null, false, Collections.emptyList()), ResponseField.forString("campaignChannelIdentifier", "campaignChannelIdentifier", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignData", "campaignData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("campaignRunFrequencyUnit", "campaignRunFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forInt("campaignRunFrequencyValue", "campaignRunFrequencyValue", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateOfRun", "startDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateOfRun", "endDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forInt("durationOfRunInDays", "durationOfRunInDays", null, true, Collections.emptyList()), ResponseField.forList("daysToSend", "daysToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forString("systemPauseReason", "systemPauseReason", null, true, Collections.emptyList()), ResponseField.forCustomType("associatedEntityListId", "associatedEntityListId", null, false, customType, Collections.emptyList()), ResponseField.forBoolean("includeHistoricalMemberships", "includeHistoricalMemberships", null, true, Collections.emptyList()), ResponseField.forBoolean("allowMultiple", "allowMultiple", null, true, Collections.emptyList()), ResponseField.forInt("messageCreated", "messageCreated", null, true, Collections.emptyList()), ResponseField.forInt("sentCount", "sentCount", null, true, Collections.emptyList()), ResponseField.forInt("deliveredCount", "deliveredCount", null, true, Collections.emptyList()), ResponseField.forInt("readCount", "readCount", null, true, Collections.emptyList()), ResponseField.forInt("repliedCount", "repliedCount", null, true, Collections.emptyList()), ResponseField.forInt("failedCount", "failedCount", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forInt("leadLimit", "leadLimit", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Campaign(String str, String str2, String str3, String str4, String str5, String str6, String str7, CampaignType campaignType, String str8, String str9, CampaignRunFrequencyUnit campaignRunFrequencyUnit, Integer num, String str10, String str11, Integer num2, List<String> list, String str12, String str13, CampaignStatus campaignStatus, String str14, String str15, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List<String> list2, Integer num9, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.campaignCategory = str6;
            this.campaignSubCategory = str7;
            this.campaignType = (CampaignType) Utils.checkNotNull(campaignType, "campaignType == null");
            this.campaignChannelIdentifier = str8;
            this.campaignData = str9;
            this.campaignRunFrequencyUnit = campaignRunFrequencyUnit;
            this.campaignRunFrequencyValue = num;
            this.startDateOfRun = str10;
            this.endDateOfRun = str11;
            this.durationOfRunInDays = num2;
            this.daysToSend = list;
            this.ownerId = (String) Utils.checkNotNull(str12, "ownerId == null");
            this.primaryTeamId = str13;
            this.status = (CampaignStatus) Utils.checkNotNull(campaignStatus, "status == null");
            this.systemPauseReason = str14;
            this.associatedEntityListId = (String) Utils.checkNotNull(str15, "associatedEntityListId == null");
            this.includeHistoricalMemberships = bool;
            this.allowMultiple = bool2;
            this.messageCreated = num3;
            this.sentCount = num4;
            this.deliveredCount = num5;
            this.readCount = num6;
            this.repliedCount = num7;
            this.failedCount = num8;
            this.tags = list2;
            this.leadLimit = num9;
            this.createdAt = str16;
            this.updatedAt = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean allowMultiple() {
            return this.allowMultiple;
        }

        public String associatedEntityListId() {
            return this.associatedEntityListId;
        }

        public String campaignCategory() {
            return this.campaignCategory;
        }

        public String campaignChannelIdentifier() {
            return this.campaignChannelIdentifier;
        }

        public String campaignData() {
            return this.campaignData;
        }

        public CampaignRunFrequencyUnit campaignRunFrequencyUnit() {
            return this.campaignRunFrequencyUnit;
        }

        public Integer campaignRunFrequencyValue() {
            return this.campaignRunFrequencyValue;
        }

        public String campaignSubCategory() {
            return this.campaignSubCategory;
        }

        public CampaignType campaignType() {
            return this.campaignType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public List<String> daysToSend() {
            return this.daysToSend;
        }

        public Integer deliveredCount() {
            return this.deliveredCount;
        }

        public String description() {
            return this.description;
        }

        public Integer durationOfRunInDays() {
            return this.durationOfRunInDays;
        }

        public String endDateOfRun() {
            return this.endDateOfRun;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            CampaignRunFrequencyUnit campaignRunFrequencyUnit;
            Integer num;
            String str5;
            String str6;
            Integer num2;
            List<String> list;
            String str7;
            String str8;
            Boolean bool;
            Boolean bool2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            Integer num8;
            List<String> list2;
            Integer num9;
            String str9;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Campaign)) {
                return false;
            }
            Campaign campaign = (Campaign) obj;
            if (this.__typename.equals(campaign.__typename) && this.id.equals(campaign.id) && this.accountId.equals(campaign.accountId) && this.name.equals(campaign.name) && this.description.equals(campaign.description) && ((str = this.campaignCategory) != null ? str.equals(campaign.campaignCategory) : campaign.campaignCategory == null) && ((str2 = this.campaignSubCategory) != null ? str2.equals(campaign.campaignSubCategory) : campaign.campaignSubCategory == null) && this.campaignType.equals(campaign.campaignType) && ((str3 = this.campaignChannelIdentifier) != null ? str3.equals(campaign.campaignChannelIdentifier) : campaign.campaignChannelIdentifier == null) && ((str4 = this.campaignData) != null ? str4.equals(campaign.campaignData) : campaign.campaignData == null) && ((campaignRunFrequencyUnit = this.campaignRunFrequencyUnit) != null ? campaignRunFrequencyUnit.equals(campaign.campaignRunFrequencyUnit) : campaign.campaignRunFrequencyUnit == null) && ((num = this.campaignRunFrequencyValue) != null ? num.equals(campaign.campaignRunFrequencyValue) : campaign.campaignRunFrequencyValue == null) && ((str5 = this.startDateOfRun) != null ? str5.equals(campaign.startDateOfRun) : campaign.startDateOfRun == null) && ((str6 = this.endDateOfRun) != null ? str6.equals(campaign.endDateOfRun) : campaign.endDateOfRun == null) && ((num2 = this.durationOfRunInDays) != null ? num2.equals(campaign.durationOfRunInDays) : campaign.durationOfRunInDays == null) && ((list = this.daysToSend) != null ? list.equals(campaign.daysToSend) : campaign.daysToSend == null) && this.ownerId.equals(campaign.ownerId) && ((str7 = this.primaryTeamId) != null ? str7.equals(campaign.primaryTeamId) : campaign.primaryTeamId == null) && this.status.equals(campaign.status) && ((str8 = this.systemPauseReason) != null ? str8.equals(campaign.systemPauseReason) : campaign.systemPauseReason == null) && this.associatedEntityListId.equals(campaign.associatedEntityListId) && ((bool = this.includeHistoricalMemberships) != null ? bool.equals(campaign.includeHistoricalMemberships) : campaign.includeHistoricalMemberships == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(campaign.allowMultiple) : campaign.allowMultiple == null) && ((num3 = this.messageCreated) != null ? num3.equals(campaign.messageCreated) : campaign.messageCreated == null) && ((num4 = this.sentCount) != null ? num4.equals(campaign.sentCount) : campaign.sentCount == null) && ((num5 = this.deliveredCount) != null ? num5.equals(campaign.deliveredCount) : campaign.deliveredCount == null) && ((num6 = this.readCount) != null ? num6.equals(campaign.readCount) : campaign.readCount == null) && ((num7 = this.repliedCount) != null ? num7.equals(campaign.repliedCount) : campaign.repliedCount == null) && ((num8 = this.failedCount) != null ? num8.equals(campaign.failedCount) : campaign.failedCount == null) && ((list2 = this.tags) != null ? list2.equals(campaign.tags) : campaign.tags == null) && ((num9 = this.leadLimit) != null ? num9.equals(campaign.leadLimit) : campaign.leadLimit == null) && ((str9 = this.createdAt) != null ? str9.equals(campaign.createdAt) : campaign.createdAt == null)) {
                String str10 = this.updatedAt;
                String str11 = campaign.updatedAt;
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

        public Integer failedCount() {
            return this.failedCount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003;
                String str = this.campaignCategory;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.campaignSubCategory;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.campaignType.hashCode()) * 1000003;
                String str3 = this.campaignChannelIdentifier;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.campaignData;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                CampaignRunFrequencyUnit campaignRunFrequencyUnit = this.campaignRunFrequencyUnit;
                int iHashCode6 = (iHashCode5 ^ (campaignRunFrequencyUnit == null ? 0 : campaignRunFrequencyUnit.hashCode())) * 1000003;
                Integer num = this.campaignRunFrequencyValue;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str5 = this.startDateOfRun;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.endDateOfRun;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num2 = this.durationOfRunInDays;
                int iHashCode10 = (iHashCode9 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                List<String> list = this.daysToSend;
                int iHashCode11 = (((iHashCode10 ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str7 = this.primaryTeamId;
                int iHashCode12 = (((iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003;
                String str8 = this.systemPauseReason;
                int iHashCode13 = (((iHashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.associatedEntityListId.hashCode()) * 1000003;
                Boolean bool = this.includeHistoricalMemberships;
                int iHashCode14 = (iHashCode13 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.allowMultiple;
                int iHashCode15 = (iHashCode14 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num3 = this.messageCreated;
                int iHashCode16 = (iHashCode15 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.sentCount;
                int iHashCode17 = (iHashCode16 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.deliveredCount;
                int iHashCode18 = (iHashCode17 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.readCount;
                int iHashCode19 = (iHashCode18 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.repliedCount;
                int iHashCode20 = (iHashCode19 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                Integer num8 = this.failedCount;
                int iHashCode21 = (iHashCode20 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                List<String> list2 = this.tags;
                int iHashCode22 = (iHashCode21 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Integer num9 = this.leadLimit;
                int iHashCode23 = (iHashCode22 ^ (num9 == null ? 0 : num9.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode24 = (iHashCode23 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                this.$hashCode = iHashCode24 ^ (str10 != null ? str10.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean includeHistoricalMemberships() {
            return this.includeHistoricalMemberships;
        }

        public Integer leadLimit() {
            return this.leadLimit;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Campaign.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Campaign.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Campaign.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Campaign.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Campaign.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Campaign.this.name);
                    responseWriter.writeString(responseFieldArr[4], Campaign.this.description);
                    responseWriter.writeString(responseFieldArr[5], Campaign.this.campaignCategory);
                    responseWriter.writeString(responseFieldArr[6], Campaign.this.campaignSubCategory);
                    responseWriter.writeString(responseFieldArr[7], Campaign.this.campaignType.name());
                    responseWriter.writeString(responseFieldArr[8], Campaign.this.campaignChannelIdentifier);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Campaign.this.campaignData);
                    ResponseField responseField = responseFieldArr[10];
                    CampaignRunFrequencyUnit campaignRunFrequencyUnit = Campaign.this.campaignRunFrequencyUnit;
                    responseWriter.writeString(responseField, campaignRunFrequencyUnit != null ? campaignRunFrequencyUnit.name() : null);
                    responseWriter.writeInt(responseFieldArr[11], Campaign.this.campaignRunFrequencyValue);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Campaign.this.startDateOfRun);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Campaign.this.endDateOfRun);
                    responseWriter.writeInt(responseFieldArr[14], Campaign.this.durationOfRunInDays);
                    responseWriter.writeList(responseFieldArr[15], Campaign.this.daysToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Campaign.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Campaign.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Campaign.this.primaryTeamId);
                    responseWriter.writeString(responseFieldArr[18], Campaign.this.status.name());
                    responseWriter.writeString(responseFieldArr[19], Campaign.this.systemPauseReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Campaign.this.associatedEntityListId);
                    responseWriter.writeBoolean(responseFieldArr[21], Campaign.this.includeHistoricalMemberships);
                    responseWriter.writeBoolean(responseFieldArr[22], Campaign.this.allowMultiple);
                    responseWriter.writeInt(responseFieldArr[23], Campaign.this.messageCreated);
                    responseWriter.writeInt(responseFieldArr[24], Campaign.this.sentCount);
                    responseWriter.writeInt(responseFieldArr[25], Campaign.this.deliveredCount);
                    responseWriter.writeInt(responseFieldArr[26], Campaign.this.readCount);
                    responseWriter.writeInt(responseFieldArr[27], Campaign.this.repliedCount);
                    responseWriter.writeInt(responseFieldArr[28], Campaign.this.failedCount);
                    responseWriter.writeList(responseFieldArr[29], Campaign.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Campaign.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[30], Campaign.this.leadLimit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], Campaign.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Campaign.this.updatedAt);
                }
            };
        }

        public Integer messageCreated() {
            return this.messageCreated;
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public Integer readCount() {
            return this.readCount;
        }

        public Integer repliedCount() {
            return this.repliedCount;
        }

        public Integer sentCount() {
            return this.sentCount;
        }

        public String startDateOfRun() {
            return this.startDateOfRun;
        }

        public CampaignStatus status() {
            return this.status;
        }

        public String systemPauseReason() {
            return this.systemPauseReason;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Campaign{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", campaignCategory=" + this.campaignCategory + ", campaignSubCategory=" + this.campaignSubCategory + ", campaignType=" + this.campaignType + ", campaignChannelIdentifier=" + this.campaignChannelIdentifier + ", campaignData=" + this.campaignData + ", campaignRunFrequencyUnit=" + this.campaignRunFrequencyUnit + ", campaignRunFrequencyValue=" + this.campaignRunFrequencyValue + ", startDateOfRun=" + this.startDateOfRun + ", endDateOfRun=" + this.endDateOfRun + ", durationOfRunInDays=" + this.durationOfRunInDays + ", daysToSend=" + this.daysToSend + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", status=" + this.status + ", systemPauseReason=" + this.systemPauseReason + ", associatedEntityListId=" + this.associatedEntityListId + ", includeHistoricalMemberships=" + this.includeHistoricalMemberships + ", allowMultiple=" + this.allowMultiple + ", messageCreated=" + this.messageCreated + ", sentCount=" + this.sentCount + ", deliveredCount=" + this.deliveredCount + ", readCount=" + this.readCount + ", repliedCount=" + this.repliedCount + ", failedCount=" + this.failedCount + ", tags=" + this.tags + ", leadLimit=" + this.leadLimit + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getCampaignRun", "getCampaignRun", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetCampaignRun getCampaignRun;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetCampaignRun.Mapper getCampaignRunFieldMapper = new GetCampaignRun.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetCampaignRun) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetCampaignRun>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetCampaignRun read(ResponseReader responseReader2) {
                        return Mapper.this.getCampaignRunFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetCampaignRun getCampaignRun) {
            this.getCampaignRun = getCampaignRun;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetCampaignRun getCampaignRun = this.getCampaignRun;
            GetCampaignRun getCampaignRun2 = ((Data) obj).getCampaignRun;
            return getCampaignRun == null ? getCampaignRun2 == null : getCampaignRun.equals(getCampaignRun2);
        }

        public GetCampaignRun getCampaignRun() {
            return this.getCampaignRun;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetCampaignRun getCampaignRun = this.getCampaignRun;
                this.$hashCode = (getCampaignRun == null ? 0 : getCampaignRun.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetCampaignRun getCampaignRun = Data.this.getCampaignRun;
                    responseWriter.writeObject(responseField, getCampaignRun != null ? getCampaignRun.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getCampaignRun=" + this.getCampaignRun + "}";
            }
            return this.$toString;
        }
    }

    public static class GetCampaignRun {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Campaign campaign;
        final String campaignChannelIdentifier;
        final String campaignId;
        final String campaignName;
        final CampaignType campaignType;
        final String createdAt;
        final Integer deliveredCount;
        final String endDate;
        final Integer failedCount;
        final String id;
        final Integer leadCount;
        final Integer messageCreated;
        final String name;
        final Owner owner;
        final String ownerId;
        final PrimaryTeam primaryTeam;
        final String primaryTeamId;
        final Integer readCount;
        final Integer repliedCount;
        final Integer sentCount;
        final String startDate;
        final CampaignStatus status;
        final String systemPauseReason;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<GetCampaignRun> {
            final PrimaryTeam.Mapper primaryTeamFieldMapper = new PrimaryTeam.Mapper();
            final Campaign.Mapper campaignFieldMapper = new Campaign.Mapper();
            final Owner.Mapper ownerFieldMapper = new Owner.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetCampaignRun map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetCampaignRun.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                String string3 = responseReader.readString(responseFieldArr[5]);
                CampaignType campaignTypeValueOf = string3 != null ? CampaignType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String string6 = responseReader.readString(responseFieldArr[10]);
                return new GetCampaignRun(string, str, str2, str3, string2, campaignTypeValueOf, string4, string5, str4, str5, string6 != null ? CampaignStatus.valueOf(string6) : null, responseReader.readString(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), responseReader.readInt(responseFieldArr[13]), responseReader.readInt(responseFieldArr[14]), responseReader.readInt(responseFieldArr[15]), responseReader.readInt(responseFieldArr[16]), responseReader.readInt(responseFieldArr[17]), responseReader.readInt(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (PrimaryTeam) responseReader.readObject(responseFieldArr[21], new ResponseReader.ObjectReader<PrimaryTeam>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.GetCampaignRun.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public PrimaryTeam read(ResponseReader responseReader2) {
                        return Mapper.this.primaryTeamFieldMapper.map(responseReader2);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (Campaign) responseReader.readObject(responseFieldArr[24], new ResponseReader.ObjectReader<Campaign>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.GetCampaignRun.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Campaign read(ResponseReader responseReader2) {
                        return Mapper.this.campaignFieldMapper.map(responseReader2);
                    }
                }), (Owner) responseReader.readObject(responseFieldArr[25], new ResponseReader.ObjectReader<Owner>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.GetCampaignRun.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Owner read(ResponseReader responseReader2) {
                        return Mapper.this.ownerFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("campaignId", "campaignId", null, false, customType, Collections.emptyList()), ResponseField.forString("campaignName", "campaignName", null, true, Collections.emptyList()), ResponseField.forString("campaignType", "campaignType", null, true, Collections.emptyList()), ResponseField.forString("campaignChannelIdentifier", "campaignChannelIdentifier", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forCustomType("startDate", "startDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDate", "endDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forString("systemPauseReason", "systemPauseReason", null, true, Collections.emptyList()), ResponseField.forInt("leadCount", "leadCount", null, true, Collections.emptyList()), ResponseField.forInt("messageCreated", "messageCreated", null, true, Collections.emptyList()), ResponseField.forInt("sentCount", "sentCount", null, true, Collections.emptyList()), ResponseField.forInt("deliveredCount", "deliveredCount", null, true, Collections.emptyList()), ResponseField.forInt("readCount", "readCount", null, true, Collections.emptyList()), ResponseField.forInt("repliedCount", "repliedCount", null, true, Collections.emptyList()), ResponseField.forInt("failedCount", "failedCount", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forObject("primaryTeam", "primaryTeam", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("campaign", "campaign", null, true, Collections.emptyList()), ResponseField.forObject("owner", "owner", null, true, Collections.emptyList())};
        }

        public GetCampaignRun(String str, String str2, String str3, String str4, String str5, CampaignType campaignType, String str6, String str7, String str8, String str9, CampaignStatus campaignStatus, String str10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str11, String str12, PrimaryTeam primaryTeam, String str13, String str14, Campaign campaign, Owner owner) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.campaignId = (String) Utils.checkNotNull(str4, "campaignId == null");
            this.campaignName = str5;
            this.campaignType = campaignType;
            this.campaignChannelIdentifier = str6;
            this.name = (String) Utils.checkNotNull(str7, "name == null");
            this.startDate = str8;
            this.endDate = str9;
            this.status = (CampaignStatus) Utils.checkNotNull(campaignStatus, "status == null");
            this.systemPauseReason = str10;
            this.leadCount = num;
            this.messageCreated = num2;
            this.sentCount = num3;
            this.deliveredCount = num4;
            this.readCount = num5;
            this.repliedCount = num6;
            this.failedCount = num7;
            this.ownerId = (String) Utils.checkNotNull(str11, "ownerId == null");
            this.primaryTeamId = str12;
            this.primaryTeam = primaryTeam;
            this.createdAt = str13;
            this.updatedAt = str14;
            this.campaign = campaign;
            this.owner = owner;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Campaign campaign() {
            return this.campaign;
        }

        public String campaignChannelIdentifier() {
            return this.campaignChannelIdentifier;
        }

        public String campaignId() {
            return this.campaignId;
        }

        public String campaignName() {
            return this.campaignName;
        }

        public CampaignType campaignType() {
            return this.campaignType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public Integer deliveredCount() {
            return this.deliveredCount;
        }

        public String endDate() {
            return this.endDate;
        }

        public boolean equals(Object obj) {
            String str;
            CampaignType campaignType;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            String str6;
            PrimaryTeam primaryTeam;
            String str7;
            String str8;
            Campaign campaign;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetCampaignRun)) {
                return false;
            }
            GetCampaignRun getCampaignRun = (GetCampaignRun) obj;
            if (this.__typename.equals(getCampaignRun.__typename) && this.id.equals(getCampaignRun.id) && this.accountId.equals(getCampaignRun.accountId) && this.campaignId.equals(getCampaignRun.campaignId) && ((str = this.campaignName) != null ? str.equals(getCampaignRun.campaignName) : getCampaignRun.campaignName == null) && ((campaignType = this.campaignType) != null ? campaignType.equals(getCampaignRun.campaignType) : getCampaignRun.campaignType == null) && ((str2 = this.campaignChannelIdentifier) != null ? str2.equals(getCampaignRun.campaignChannelIdentifier) : getCampaignRun.campaignChannelIdentifier == null) && this.name.equals(getCampaignRun.name) && ((str3 = this.startDate) != null ? str3.equals(getCampaignRun.startDate) : getCampaignRun.startDate == null) && ((str4 = this.endDate) != null ? str4.equals(getCampaignRun.endDate) : getCampaignRun.endDate == null) && this.status.equals(getCampaignRun.status) && ((str5 = this.systemPauseReason) != null ? str5.equals(getCampaignRun.systemPauseReason) : getCampaignRun.systemPauseReason == null) && ((num = this.leadCount) != null ? num.equals(getCampaignRun.leadCount) : getCampaignRun.leadCount == null) && ((num2 = this.messageCreated) != null ? num2.equals(getCampaignRun.messageCreated) : getCampaignRun.messageCreated == null) && ((num3 = this.sentCount) != null ? num3.equals(getCampaignRun.sentCount) : getCampaignRun.sentCount == null) && ((num4 = this.deliveredCount) != null ? num4.equals(getCampaignRun.deliveredCount) : getCampaignRun.deliveredCount == null) && ((num5 = this.readCount) != null ? num5.equals(getCampaignRun.readCount) : getCampaignRun.readCount == null) && ((num6 = this.repliedCount) != null ? num6.equals(getCampaignRun.repliedCount) : getCampaignRun.repliedCount == null) && ((num7 = this.failedCount) != null ? num7.equals(getCampaignRun.failedCount) : getCampaignRun.failedCount == null) && this.ownerId.equals(getCampaignRun.ownerId) && ((str6 = this.primaryTeamId) != null ? str6.equals(getCampaignRun.primaryTeamId) : getCampaignRun.primaryTeamId == null) && ((primaryTeam = this.primaryTeam) != null ? primaryTeam.equals(getCampaignRun.primaryTeam) : getCampaignRun.primaryTeam == null) && ((str7 = this.createdAt) != null ? str7.equals(getCampaignRun.createdAt) : getCampaignRun.createdAt == null) && ((str8 = this.updatedAt) != null ? str8.equals(getCampaignRun.updatedAt) : getCampaignRun.updatedAt == null) && ((campaign = this.campaign) != null ? campaign.equals(getCampaignRun.campaign) : getCampaignRun.campaign == null)) {
                Owner owner = this.owner;
                Owner owner2 = getCampaignRun.owner;
                if (owner == null) {
                    if (owner2 == null) {
                        return true;
                    }
                } else if (owner.equals(owner2)) {
                    return true;
                }
            }
            return false;
        }

        public Integer failedCount() {
            return this.failedCount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.campaignId.hashCode()) * 1000003;
                String str = this.campaignName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                CampaignType campaignType = this.campaignType;
                int iHashCode3 = (iHashCode2 ^ (campaignType == null ? 0 : campaignType.hashCode())) * 1000003;
                String str2 = this.campaignChannelIdentifier;
                int iHashCode4 = (((iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str3 = this.startDate;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.endDate;
                int iHashCode6 = (((iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003;
                String str5 = this.systemPauseReason;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.leadCount;
                int iHashCode8 = (iHashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.messageCreated;
                int iHashCode9 = (iHashCode8 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sentCount;
                int iHashCode10 = (iHashCode9 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.deliveredCount;
                int iHashCode11 = (iHashCode10 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.readCount;
                int iHashCode12 = (iHashCode11 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.repliedCount;
                int iHashCode13 = (iHashCode12 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.failedCount;
                int iHashCode14 = (((iHashCode13 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str6 = this.primaryTeamId;
                int iHashCode15 = (iHashCode14 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                PrimaryTeam primaryTeam = this.primaryTeam;
                int iHashCode16 = (iHashCode15 ^ (primaryTeam == null ? 0 : primaryTeam.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode17 = (iHashCode16 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                int iHashCode18 = (iHashCode17 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                Campaign campaign = this.campaign;
                int iHashCode19 = (iHashCode18 ^ (campaign == null ? 0 : campaign.hashCode())) * 1000003;
                Owner owner = this.owner;
                this.$hashCode = iHashCode19 ^ (owner != null ? owner.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Integer leadCount() {
            return this.leadCount;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.GetCampaignRun.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetCampaignRun.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetCampaignRun.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetCampaignRun.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetCampaignRun.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetCampaignRun.this.campaignId);
                    responseWriter.writeString(responseFieldArr[4], GetCampaignRun.this.campaignName);
                    ResponseField responseField = responseFieldArr[5];
                    CampaignType campaignType = GetCampaignRun.this.campaignType;
                    responseWriter.writeString(responseField, campaignType != null ? campaignType.name() : null);
                    responseWriter.writeString(responseFieldArr[6], GetCampaignRun.this.campaignChannelIdentifier);
                    responseWriter.writeString(responseFieldArr[7], GetCampaignRun.this.name);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], GetCampaignRun.this.startDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], GetCampaignRun.this.endDate);
                    responseWriter.writeString(responseFieldArr[10], GetCampaignRun.this.status.name());
                    responseWriter.writeString(responseFieldArr[11], GetCampaignRun.this.systemPauseReason);
                    responseWriter.writeInt(responseFieldArr[12], GetCampaignRun.this.leadCount);
                    responseWriter.writeInt(responseFieldArr[13], GetCampaignRun.this.messageCreated);
                    responseWriter.writeInt(responseFieldArr[14], GetCampaignRun.this.sentCount);
                    responseWriter.writeInt(responseFieldArr[15], GetCampaignRun.this.deliveredCount);
                    responseWriter.writeInt(responseFieldArr[16], GetCampaignRun.this.readCount);
                    responseWriter.writeInt(responseFieldArr[17], GetCampaignRun.this.repliedCount);
                    responseWriter.writeInt(responseFieldArr[18], GetCampaignRun.this.failedCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], GetCampaignRun.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], GetCampaignRun.this.primaryTeamId);
                    ResponseField responseField2 = responseFieldArr[21];
                    PrimaryTeam primaryTeam = GetCampaignRun.this.primaryTeam;
                    responseWriter.writeObject(responseField2, primaryTeam != null ? primaryTeam.marshaller() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], GetCampaignRun.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], GetCampaignRun.this.updatedAt);
                    ResponseField responseField3 = responseFieldArr[24];
                    Campaign campaign = GetCampaignRun.this.campaign;
                    responseWriter.writeObject(responseField3, campaign != null ? campaign.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[25];
                    Owner owner = GetCampaignRun.this.owner;
                    responseWriter.writeObject(responseField4, owner != null ? owner.marshaller() : null);
                }
            };
        }

        public Integer messageCreated() {
            return this.messageCreated;
        }

        public String name() {
            return this.name;
        }

        public Owner owner() {
            return this.owner;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public PrimaryTeam primaryTeam() {
            return this.primaryTeam;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public Integer readCount() {
            return this.readCount;
        }

        public Integer repliedCount() {
            return this.repliedCount;
        }

        public Integer sentCount() {
            return this.sentCount;
        }

        public String startDate() {
            return this.startDate;
        }

        public CampaignStatus status() {
            return this.status;
        }

        public String systemPauseReason() {
            return this.systemPauseReason;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetCampaignRun{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", campaignId=" + this.campaignId + ", campaignName=" + this.campaignName + ", campaignType=" + this.campaignType + ", campaignChannelIdentifier=" + this.campaignChannelIdentifier + ", name=" + this.name + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", status=" + this.status + ", systemPauseReason=" + this.systemPauseReason + ", leadCount=" + this.leadCount + ", messageCreated=" + this.messageCreated + ", sentCount=" + this.sentCount + ", deliveredCount=" + this.deliveredCount + ", readCount=" + this.readCount + ", repliedCount=" + this.repliedCount + ", failedCount=" + this.failedCount + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", primaryTeam=" + this.primaryTeam + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", campaign=" + this.campaign + ", owner=" + this.owner + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Owner {
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

        public static final class Mapper implements ResponseFieldMapper<Owner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Owner map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Owner.$responseFields;
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
                return new Owner(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Owner(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) obj;
            if (this.__typename.equals(owner.__typename) && this.id.equals(owner.id) && this.addedSourceType.equals(owner.addedSourceType) && this.name.equals(owner.name) && ((str = this.profilePictureUrl) != null ? str.equals(owner.profilePictureUrl) : owner.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(owner.registeredEmail) : owner.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(owner.registeredEmailVerified) : owner.registeredEmailVerified == null) && this.registeredNumber.equals(owner.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(owner.registeredNumberVerified) : owner.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(owner.secondaryNumber) : owner.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(owner.secondaryNumberVerified) : owner.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(owner.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(owner.lastSelectedAccountWeb) : owner.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(owner.lastSelectedAccountApp) : owner.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(owner.appVersion) : owner.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(owner.deviceModel) : owner.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(owner.deviceManufacturer) : owner.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(owner.androidVersionRelease) : owner.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(owner.createdAt) : owner.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = owner.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Owner.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Owner.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Owner.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Owner.this.id);
                    responseWriter.writeString(responseFieldArr[2], Owner.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], Owner.this.name);
                    responseWriter.writeString(responseFieldArr[4], Owner.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Owner.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], Owner.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Owner.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], Owner.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Owner.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], Owner.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], Owner.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Owner.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Owner.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], Owner.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], Owner.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], Owner.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], Owner.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Owner.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Owner.this.updatedAt);
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
                this.$toString = "Owner{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class PrimaryTeam {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String description;
        final String id;
        final String teamName;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<PrimaryTeam> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public PrimaryTeam map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = PrimaryTeam.$responseFields;
                return new PrimaryTeam(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, false, customType, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, false, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public PrimaryTeam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.createdById = (String) Utils.checkNotNull(str4, "createdById == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.teamName = (String) Utils.checkNotNull(str6, "teamName == null");
            this.updatedById = (String) Utils.checkNotNull(str7, "updatedById == null");
            this.createdAt = str8;
            this.updatedAt = str9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PrimaryTeam)) {
                return false;
            }
            PrimaryTeam primaryTeam = (PrimaryTeam) obj;
            if (this.__typename.equals(primaryTeam.__typename) && this.id.equals(primaryTeam.id) && this.accountId.equals(primaryTeam.accountId) && this.createdById.equals(primaryTeam.createdById) && this.description.equals(primaryTeam.description) && this.teamName.equals(primaryTeam.teamName) && this.updatedById.equals(primaryTeam.updatedById) && ((str = this.createdAt) != null ? str.equals(primaryTeam.createdAt) : primaryTeam.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = primaryTeam.updatedAt;
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
                int iHashCode = (((((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.createdById.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.teamName.hashCode()) * 1000003) ^ this.updatedById.hashCode()) * 1000003;
                String str = this.createdAt;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.PrimaryTeam.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = PrimaryTeam.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], PrimaryTeam.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], PrimaryTeam.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], PrimaryTeam.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], PrimaryTeam.this.createdById);
                    responseWriter.writeString(responseFieldArr[4], PrimaryTeam.this.description);
                    responseWriter.writeString(responseFieldArr[5], PrimaryTeam.this.teamName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], PrimaryTeam.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], PrimaryTeam.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], PrimaryTeam.this.updatedAt);
                }
            };
        }

        public String teamName() {
            return this.teamName;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PrimaryTeam{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", createdById=" + this.createdById + ", description=" + this.description + ", teamName=" + this.teamName + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignRunQuery.Variables.1
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

    public GetCampaignRunQuery(String str) {
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
        return "df2c2523bb70ab4e4c5df91f717f8f8f501a3eec75921911fcf76e5f451b6ea1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetCampaignRun($id: ID!) {\n  getCampaignRun(id: $id) {\n    __typename\n    id\n    accountId\n    campaignId\n    campaignName\n    campaignType\n    campaignChannelIdentifier\n    name\n    startDate\n    endDate\n    status\n    systemPauseReason\n    leadCount\n    messageCreated\n    sentCount\n    deliveredCount\n    readCount\n    repliedCount\n    failedCount\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    createdAt\n    updatedAt\n    campaign {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
