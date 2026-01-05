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
import type.ContactAssignmentStatus;
import type.CustomType;
import type.EntityListStatus;
import type.EntityListType;
import type.ListCreationType;
import type.ModelCampaignDefinitionConditionInput;
import type.UpdateCampaignDefinitionInput;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class UpdateCampaignDefinitionMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateCampaignDefinition($input: UpdateCampaignDefinitionInput!, $condition: ModelCampaignDefinitionConditionInput) {\n  updateCampaignDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    campaignCategory\n    campaignSubCategory\n    campaignType\n    campaignChannelIdentifier\n    campaignData\n    campaignRunFrequencyUnit\n    campaignRunFrequencyValue\n    startDateOfRun\n    endDateOfRun\n    durationOfRunInDays\n    daysToSend\n    timeSlotToSend {\n      __typename\n      timeStart\n      timeEnd\n    }\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    status\n    systemPauseReason\n    associatedEntityListId\n    includeHistoricalMemberships\n    allowMultiple\n    messageCreated\n    sentCount\n    deliveredCount\n    readCount\n    repliedCount\n    failedCount\n    tags\n    leadLimit\n    createdAt\n    updatedAt\n    associatedList {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n    campaignOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateCampaignDefinition";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateCampaignDefinition($input: UpdateCampaignDefinitionInput!, $condition: ModelCampaignDefinitionConditionInput) {\n  updateCampaignDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    campaignCategory\n    campaignSubCategory\n    campaignType\n    campaignChannelIdentifier\n    campaignData\n    campaignRunFrequencyUnit\n    campaignRunFrequencyValue\n    startDateOfRun\n    endDateOfRun\n    durationOfRunInDays\n    daysToSend\n    timeSlotToSend {\n      __typename\n      timeStart\n      timeEnd\n    }\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    status\n    systemPauseReason\n    associatedEntityListId\n    includeHistoricalMemberships\n    allowMultiple\n    messageCreated\n    sentCount\n    deliveredCount\n    readCount\n    repliedCount\n    failedCount\n    tags\n    leadLimit\n    createdAt\n    updatedAt\n    associatedList {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n    campaignOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static class AssociatedList {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean allowMultiple;
        final String assignedTeamId;
        final String assignedUserId;
        final String associatedDistributionId;
        final String chatMessagePlatform;
        final String createdAt;
        final String defaultCountryCode;
        final String defaultCountryIso;
        final String description;
        final Integer doNotTrackCount;
        final String dupliacteLeadList;
        final Integer duplicateCount;
        final String entityActionDefinitionReference;
        final EntityListType entityListType;
        final String entityTypeInList;
        final String finalBulkUploadFileRef;
        final String id;
        final Integer invalidEmailCount;
        final Integer invalidNumbersCount;
        final String leadSourceForBulkUpload;
        final String listCategory;
        final ListCreationType listCreationType;
        final String listName;
        final String modifiedBulkUploadFileRef;
        final String notificationBody;
        final Integer otherFailedCount;
        final String ownerId;
        final String rawBulkUploadFileHash;
        final String rawBulkUploadFileRef;
        final Boolean redistributeEntities;
        final String redistributionRequestedAt;
        final String rule;
        final EntityListStatus status;
        final Integer successfulCount;
        final List<String> tags;
        final ContactAssignmentStatus toBeAssigned;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<AssociatedList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AssociatedList map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AssociatedList.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                EntityListType entityListTypeValueOf = string3 != null ? EntityListType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                EntityListStatus entityListStatusValueOf = string6 != null ? EntityListStatus.valueOf(string6) : null;
                Integer num = responseReader.readInt(responseFieldArr[8]);
                Integer num2 = responseReader.readInt(responseFieldArr[9]);
                Integer num3 = responseReader.readInt(responseFieldArr[10]);
                Integer num4 = responseReader.readInt(responseFieldArr[11]);
                Integer num5 = responseReader.readInt(responseFieldArr[12]);
                Integer num6 = responseReader.readInt(responseFieldArr[13]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]);
                String string7 = responseReader.readString(responseFieldArr[15]);
                ListCreationType listCreationTypeValueOf = string7 != null ? ListCreationType.valueOf(string7) : null;
                String string8 = responseReader.readString(responseFieldArr[16]);
                String string9 = responseReader.readString(responseFieldArr[17]);
                String string10 = responseReader.readString(responseFieldArr[18]);
                String string11 = responseReader.readString(responseFieldArr[19]);
                String string12 = responseReader.readString(responseFieldArr[20]);
                String string13 = responseReader.readString(responseFieldArr[21]);
                String string14 = responseReader.readString(responseFieldArr[22]);
                String string15 = responseReader.readString(responseFieldArr[23]);
                String string16 = responseReader.readString(responseFieldArr[24]);
                String string17 = responseReader.readString(responseFieldArr[25]);
                String string18 = responseReader.readString(responseFieldArr[26]);
                return new AssociatedList(string, str, str2, string2, entityListTypeValueOf, string4, string5, entityListStatusValueOf, num, num2, num3, num4, num5, num6, str3, listCreationTypeValueOf, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18 != null ? ContactAssignmentStatus.valueOf(string18) : null, responseReader.readString(responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.AssociatedList.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[35]), responseReader.readBoolean(responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("entityTypeInList", "entityTypeInList", null, false, Collections.emptyList()), ResponseField.forString("entityListType", "entityListType", null, false, Collections.emptyList()), ResponseField.forString("listName", "listName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forInt("successfulCount", "successfulCount", null, true, Collections.emptyList()), ResponseField.forInt("duplicateCount", "duplicateCount", null, true, Collections.emptyList()), ResponseField.forInt("invalidNumbersCount", "invalidNumbersCount", null, true, Collections.emptyList()), ResponseField.forInt("invalidEmailCount", "invalidEmailCount", null, true, Collections.emptyList()), ResponseField.forInt("doNotTrackCount", "doNotTrackCount", null, true, Collections.emptyList()), ResponseField.forInt("otherFailedCount", "otherFailedCount", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("listCreationType", "listCreationType", null, false, Collections.emptyList()), ResponseField.forString("listCategory", "listCategory", null, true, Collections.emptyList()), ResponseField.forString("rawBulkUploadFileRef", "rawBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("rawBulkUploadFileHash", "rawBulkUploadFileHash", null, true, Collections.emptyList()), ResponseField.forString("modifiedBulkUploadFileRef", "modifiedBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("finalBulkUploadFileRef", "finalBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("leadSourceForBulkUpload", "leadSourceForBulkUpload", null, true, Collections.emptyList()), ResponseField.forString("defaultCountryCode", "defaultCountryCode", null, true, Collections.emptyList()), ResponseField.forString("defaultCountryIso", "defaultCountryIso", null, true, Collections.emptyList()), ResponseField.forString("notificationBody", "notificationBody", null, true, Collections.emptyList()), ResponseField.forString("rule", "rule", null, true, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forString("assignedUserId", "assignedUserId", null, true, Collections.emptyList()), ResponseField.forString("assignedTeamId", "assignedTeamId", null, true, Collections.emptyList()), ResponseField.forCustomType("associatedDistributionId", "associatedDistributionId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("entityActionDefinitionReference", "entityActionDefinitionReference", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("redistributeEntities", "redistributeEntities", null, true, Collections.emptyList()), ResponseField.forCustomType("redistributionRequestedAt", "redistributionRequestedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("dupliacteLeadList", "dupliacteLeadList", null, true, customType, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("chatMessagePlatform", "chatMessagePlatform", null, true, Collections.emptyList()), ResponseField.forBoolean("allowMultiple", "allowMultiple", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public AssociatedList(String str, String str2, String str3, String str4, EntityListType entityListType, String str5, String str6, EntityListStatus entityListStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str7, ListCreationType listCreationType, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ContactAssignmentStatus contactAssignmentStatus, String str18, String str19, String str20, String str21, Boolean bool, String str22, String str23, List<String> list, String str24, Boolean bool2, String str25, String str26) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.entityTypeInList = (String) Utils.checkNotNull(str4, "entityTypeInList == null");
            this.entityListType = (EntityListType) Utils.checkNotNull(entityListType, "entityListType == null");
            this.listName = str5;
            this.description = str6;
            this.status = entityListStatus;
            this.successfulCount = num;
            this.duplicateCount = num2;
            this.invalidNumbersCount = num3;
            this.invalidEmailCount = num4;
            this.doNotTrackCount = num5;
            this.otherFailedCount = num6;
            this.ownerId = (String) Utils.checkNotNull(str7, "ownerId == null");
            this.listCreationType = (ListCreationType) Utils.checkNotNull(listCreationType, "listCreationType == null");
            this.listCategory = str8;
            this.rawBulkUploadFileRef = str9;
            this.rawBulkUploadFileHash = str10;
            this.modifiedBulkUploadFileRef = str11;
            this.finalBulkUploadFileRef = str12;
            this.leadSourceForBulkUpload = str13;
            this.defaultCountryCode = str14;
            this.defaultCountryIso = str15;
            this.notificationBody = str16;
            this.rule = str17;
            this.toBeAssigned = contactAssignmentStatus;
            this.assignedUserId = str18;
            this.assignedTeamId = str19;
            this.associatedDistributionId = str20;
            this.entityActionDefinitionReference = str21;
            this.redistributeEntities = bool;
            this.redistributionRequestedAt = str22;
            this.dupliacteLeadList = str23;
            this.tags = list;
            this.chatMessagePlatform = str24;
            this.allowMultiple = bool2;
            this.createdAt = str25;
            this.updatedAt = str26;
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

        public String assignedTeamId() {
            return this.assignedTeamId;
        }

        public String assignedUserId() {
            return this.assignedUserId;
        }

        public String associatedDistributionId() {
            return this.associatedDistributionId;
        }

        public String chatMessagePlatform() {
            return this.chatMessagePlatform;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String defaultCountryCode() {
            return this.defaultCountryCode;
        }

        public String defaultCountryIso() {
            return this.defaultCountryIso;
        }

        public String description() {
            return this.description;
        }

        public Integer doNotTrackCount() {
            return this.doNotTrackCount;
        }

        public String dupliacteLeadList() {
            return this.dupliacteLeadList;
        }

        public Integer duplicateCount() {
            return this.duplicateCount;
        }

        public String entityActionDefinitionReference() {
            return this.entityActionDefinitionReference;
        }

        public EntityListType entityListType() {
            return this.entityListType;
        }

        public String entityTypeInList() {
            return this.entityTypeInList;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            EntityListStatus entityListStatus;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
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
            ContactAssignmentStatus contactAssignmentStatus;
            String str13;
            String str14;
            String str15;
            String str16;
            Boolean bool;
            String str17;
            String str18;
            List<String> list;
            String str19;
            Boolean bool2;
            String str20;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssociatedList)) {
                return false;
            }
            AssociatedList associatedList = (AssociatedList) obj;
            if (this.__typename.equals(associatedList.__typename) && this.id.equals(associatedList.id) && this.accountId.equals(associatedList.accountId) && this.entityTypeInList.equals(associatedList.entityTypeInList) && this.entityListType.equals(associatedList.entityListType) && ((str = this.listName) != null ? str.equals(associatedList.listName) : associatedList.listName == null) && ((str2 = this.description) != null ? str2.equals(associatedList.description) : associatedList.description == null) && ((entityListStatus = this.status) != null ? entityListStatus.equals(associatedList.status) : associatedList.status == null) && ((num = this.successfulCount) != null ? num.equals(associatedList.successfulCount) : associatedList.successfulCount == null) && ((num2 = this.duplicateCount) != null ? num2.equals(associatedList.duplicateCount) : associatedList.duplicateCount == null) && ((num3 = this.invalidNumbersCount) != null ? num3.equals(associatedList.invalidNumbersCount) : associatedList.invalidNumbersCount == null) && ((num4 = this.invalidEmailCount) != null ? num4.equals(associatedList.invalidEmailCount) : associatedList.invalidEmailCount == null) && ((num5 = this.doNotTrackCount) != null ? num5.equals(associatedList.doNotTrackCount) : associatedList.doNotTrackCount == null) && ((num6 = this.otherFailedCount) != null ? num6.equals(associatedList.otherFailedCount) : associatedList.otherFailedCount == null) && this.ownerId.equals(associatedList.ownerId) && this.listCreationType.equals(associatedList.listCreationType) && ((str3 = this.listCategory) != null ? str3.equals(associatedList.listCategory) : associatedList.listCategory == null) && ((str4 = this.rawBulkUploadFileRef) != null ? str4.equals(associatedList.rawBulkUploadFileRef) : associatedList.rawBulkUploadFileRef == null) && ((str5 = this.rawBulkUploadFileHash) != null ? str5.equals(associatedList.rawBulkUploadFileHash) : associatedList.rawBulkUploadFileHash == null) && ((str6 = this.modifiedBulkUploadFileRef) != null ? str6.equals(associatedList.modifiedBulkUploadFileRef) : associatedList.modifiedBulkUploadFileRef == null) && ((str7 = this.finalBulkUploadFileRef) != null ? str7.equals(associatedList.finalBulkUploadFileRef) : associatedList.finalBulkUploadFileRef == null) && ((str8 = this.leadSourceForBulkUpload) != null ? str8.equals(associatedList.leadSourceForBulkUpload) : associatedList.leadSourceForBulkUpload == null) && ((str9 = this.defaultCountryCode) != null ? str9.equals(associatedList.defaultCountryCode) : associatedList.defaultCountryCode == null) && ((str10 = this.defaultCountryIso) != null ? str10.equals(associatedList.defaultCountryIso) : associatedList.defaultCountryIso == null) && ((str11 = this.notificationBody) != null ? str11.equals(associatedList.notificationBody) : associatedList.notificationBody == null) && ((str12 = this.rule) != null ? str12.equals(associatedList.rule) : associatedList.rule == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(associatedList.toBeAssigned) : associatedList.toBeAssigned == null) && ((str13 = this.assignedUserId) != null ? str13.equals(associatedList.assignedUserId) : associatedList.assignedUserId == null) && ((str14 = this.assignedTeamId) != null ? str14.equals(associatedList.assignedTeamId) : associatedList.assignedTeamId == null) && ((str15 = this.associatedDistributionId) != null ? str15.equals(associatedList.associatedDistributionId) : associatedList.associatedDistributionId == null) && ((str16 = this.entityActionDefinitionReference) != null ? str16.equals(associatedList.entityActionDefinitionReference) : associatedList.entityActionDefinitionReference == null) && ((bool = this.redistributeEntities) != null ? bool.equals(associatedList.redistributeEntities) : associatedList.redistributeEntities == null) && ((str17 = this.redistributionRequestedAt) != null ? str17.equals(associatedList.redistributionRequestedAt) : associatedList.redistributionRequestedAt == null) && ((str18 = this.dupliacteLeadList) != null ? str18.equals(associatedList.dupliacteLeadList) : associatedList.dupliacteLeadList == null) && ((list = this.tags) != null ? list.equals(associatedList.tags) : associatedList.tags == null) && ((str19 = this.chatMessagePlatform) != null ? str19.equals(associatedList.chatMessagePlatform) : associatedList.chatMessagePlatform == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(associatedList.allowMultiple) : associatedList.allowMultiple == null) && ((str20 = this.createdAt) != null ? str20.equals(associatedList.createdAt) : associatedList.createdAt == null)) {
                String str21 = this.updatedAt;
                String str22 = associatedList.updatedAt;
                if (str21 == null) {
                    if (str22 == null) {
                        return true;
                    }
                } else if (str21.equals(str22)) {
                    return true;
                }
            }
            return false;
        }

        public String finalBulkUploadFileRef() {
            return this.finalBulkUploadFileRef;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.entityTypeInList.hashCode()) * 1000003) ^ this.entityListType.hashCode()) * 1000003;
                String str = this.listName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                EntityListStatus entityListStatus = this.status;
                int iHashCode4 = (iHashCode3 ^ (entityListStatus == null ? 0 : entityListStatus.hashCode())) * 1000003;
                Integer num = this.successfulCount;
                int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.duplicateCount;
                int iHashCode6 = (iHashCode5 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.invalidNumbersCount;
                int iHashCode7 = (iHashCode6 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.invalidEmailCount;
                int iHashCode8 = (iHashCode7 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.doNotTrackCount;
                int iHashCode9 = (iHashCode8 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.otherFailedCount;
                int iHashCode10 = (((((iHashCode9 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003) ^ this.listCreationType.hashCode()) * 1000003;
                String str3 = this.listCategory;
                int iHashCode11 = (iHashCode10 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.rawBulkUploadFileRef;
                int iHashCode12 = (iHashCode11 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.rawBulkUploadFileHash;
                int iHashCode13 = (iHashCode12 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.modifiedBulkUploadFileRef;
                int iHashCode14 = (iHashCode13 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.finalBulkUploadFileRef;
                int iHashCode15 = (iHashCode14 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.leadSourceForBulkUpload;
                int iHashCode16 = (iHashCode15 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.defaultCountryCode;
                int iHashCode17 = (iHashCode16 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.defaultCountryIso;
                int iHashCode18 = (iHashCode17 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.notificationBody;
                int iHashCode19 = (iHashCode18 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.rule;
                int iHashCode20 = (iHashCode19 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                ContactAssignmentStatus contactAssignmentStatus = this.toBeAssigned;
                int iHashCode21 = (iHashCode20 ^ (contactAssignmentStatus == null ? 0 : contactAssignmentStatus.hashCode())) * 1000003;
                String str13 = this.assignedUserId;
                int iHashCode22 = (iHashCode21 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.assignedTeamId;
                int iHashCode23 = (iHashCode22 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.associatedDistributionId;
                int iHashCode24 = (iHashCode23 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.entityActionDefinitionReference;
                int iHashCode25 = (iHashCode24 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                Boolean bool = this.redistributeEntities;
                int iHashCode26 = (iHashCode25 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str17 = this.redistributionRequestedAt;
                int iHashCode27 = (iHashCode26 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.dupliacteLeadList;
                int iHashCode28 = (iHashCode27 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode29 = (iHashCode28 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str19 = this.chatMessagePlatform;
                int iHashCode30 = (iHashCode29 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                Boolean bool2 = this.allowMultiple;
                int iHashCode31 = (iHashCode30 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str20 = this.createdAt;
                int iHashCode32 = (iHashCode31 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.updatedAt;
                this.$hashCode = iHashCode32 ^ (str21 != null ? str21.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Integer invalidEmailCount() {
            return this.invalidEmailCount;
        }

        public Integer invalidNumbersCount() {
            return this.invalidNumbersCount;
        }

        public String leadSourceForBulkUpload() {
            return this.leadSourceForBulkUpload;
        }

        public String listCategory() {
            return this.listCategory;
        }

        public ListCreationType listCreationType() {
            return this.listCreationType;
        }

        public String listName() {
            return this.listName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.AssociatedList.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AssociatedList.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AssociatedList.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AssociatedList.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], AssociatedList.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], AssociatedList.this.entityTypeInList);
                    responseWriter.writeString(responseFieldArr[4], AssociatedList.this.entityListType.name());
                    responseWriter.writeString(responseFieldArr[5], AssociatedList.this.listName);
                    responseWriter.writeString(responseFieldArr[6], AssociatedList.this.description);
                    ResponseField responseField = responseFieldArr[7];
                    EntityListStatus entityListStatus = AssociatedList.this.status;
                    responseWriter.writeString(responseField, entityListStatus != null ? entityListStatus.name() : null);
                    responseWriter.writeInt(responseFieldArr[8], AssociatedList.this.successfulCount);
                    responseWriter.writeInt(responseFieldArr[9], AssociatedList.this.duplicateCount);
                    responseWriter.writeInt(responseFieldArr[10], AssociatedList.this.invalidNumbersCount);
                    responseWriter.writeInt(responseFieldArr[11], AssociatedList.this.invalidEmailCount);
                    responseWriter.writeInt(responseFieldArr[12], AssociatedList.this.doNotTrackCount);
                    responseWriter.writeInt(responseFieldArr[13], AssociatedList.this.otherFailedCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], AssociatedList.this.ownerId);
                    responseWriter.writeString(responseFieldArr[15], AssociatedList.this.listCreationType.name());
                    responseWriter.writeString(responseFieldArr[16], AssociatedList.this.listCategory);
                    responseWriter.writeString(responseFieldArr[17], AssociatedList.this.rawBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[18], AssociatedList.this.rawBulkUploadFileHash);
                    responseWriter.writeString(responseFieldArr[19], AssociatedList.this.modifiedBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[20], AssociatedList.this.finalBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[21], AssociatedList.this.leadSourceForBulkUpload);
                    responseWriter.writeString(responseFieldArr[22], AssociatedList.this.defaultCountryCode);
                    responseWriter.writeString(responseFieldArr[23], AssociatedList.this.defaultCountryIso);
                    responseWriter.writeString(responseFieldArr[24], AssociatedList.this.notificationBody);
                    responseWriter.writeString(responseFieldArr[25], AssociatedList.this.rule);
                    ResponseField responseField2 = responseFieldArr[26];
                    ContactAssignmentStatus contactAssignmentStatus = AssociatedList.this.toBeAssigned;
                    responseWriter.writeString(responseField2, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[27], AssociatedList.this.assignedUserId);
                    responseWriter.writeString(responseFieldArr[28], AssociatedList.this.assignedTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], AssociatedList.this.associatedDistributionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], AssociatedList.this.entityActionDefinitionReference);
                    responseWriter.writeBoolean(responseFieldArr[31], AssociatedList.this.redistributeEntities);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], AssociatedList.this.redistributionRequestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], AssociatedList.this.dupliacteLeadList);
                    responseWriter.writeList(responseFieldArr[34], AssociatedList.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.AssociatedList.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], AssociatedList.this.chatMessagePlatform);
                    responseWriter.writeBoolean(responseFieldArr[36], AssociatedList.this.allowMultiple);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], AssociatedList.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], AssociatedList.this.updatedAt);
                }
            };
        }

        public String modifiedBulkUploadFileRef() {
            return this.modifiedBulkUploadFileRef;
        }

        public String notificationBody() {
            return this.notificationBody;
        }

        public Integer otherFailedCount() {
            return this.otherFailedCount;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String rawBulkUploadFileHash() {
            return this.rawBulkUploadFileHash;
        }

        public String rawBulkUploadFileRef() {
            return this.rawBulkUploadFileRef;
        }

        public Boolean redistributeEntities() {
            return this.redistributeEntities;
        }

        public String redistributionRequestedAt() {
            return this.redistributionRequestedAt;
        }

        public String rule() {
            return this.rule;
        }

        public EntityListStatus status() {
            return this.status;
        }

        public Integer successfulCount() {
            return this.successfulCount;
        }

        public List<String> tags() {
            return this.tags;
        }

        public ContactAssignmentStatus toBeAssigned() {
            return this.toBeAssigned;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AssociatedList{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", entityTypeInList=" + this.entityTypeInList + ", entityListType=" + this.entityListType + ", listName=" + this.listName + ", description=" + this.description + ", status=" + this.status + ", successfulCount=" + this.successfulCount + ", duplicateCount=" + this.duplicateCount + ", invalidNumbersCount=" + this.invalidNumbersCount + ", invalidEmailCount=" + this.invalidEmailCount + ", doNotTrackCount=" + this.doNotTrackCount + ", otherFailedCount=" + this.otherFailedCount + ", ownerId=" + this.ownerId + ", listCreationType=" + this.listCreationType + ", listCategory=" + this.listCategory + ", rawBulkUploadFileRef=" + this.rawBulkUploadFileRef + ", rawBulkUploadFileHash=" + this.rawBulkUploadFileHash + ", modifiedBulkUploadFileRef=" + this.modifiedBulkUploadFileRef + ", finalBulkUploadFileRef=" + this.finalBulkUploadFileRef + ", leadSourceForBulkUpload=" + this.leadSourceForBulkUpload + ", defaultCountryCode=" + this.defaultCountryCode + ", defaultCountryIso=" + this.defaultCountryIso + ", notificationBody=" + this.notificationBody + ", rule=" + this.rule + ", toBeAssigned=" + this.toBeAssigned + ", assignedUserId=" + this.assignedUserId + ", assignedTeamId=" + this.assignedTeamId + ", associatedDistributionId=" + this.associatedDistributionId + ", entityActionDefinitionReference=" + this.entityActionDefinitionReference + ", redistributeEntities=" + this.redistributeEntities + ", redistributionRequestedAt=" + this.redistributionRequestedAt + ", dupliacteLeadList=" + this.dupliacteLeadList + ", tags=" + this.tags + ", chatMessagePlatform=" + this.chatMessagePlatform + ", allowMultiple=" + this.allowMultiple + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Builder {
        private ModelCampaignDefinitionConditionInput condition;
        private UpdateCampaignDefinitionInput input;

        public UpdateCampaignDefinitionMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateCampaignDefinitionMutation(this.input, this.condition);
        }

        public Builder condition(ModelCampaignDefinitionConditionInput modelCampaignDefinitionConditionInput) {
            this.condition = modelCampaignDefinitionConditionInput;
            return this;
        }

        public Builder input(UpdateCampaignDefinitionInput updateCampaignDefinitionInput) {
            this.input = updateCampaignDefinitionInput;
            return this;
        }
    }

    public static class CampaignOwner {
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

        public static final class Mapper implements ResponseFieldMapper<CampaignOwner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CampaignOwner map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CampaignOwner.$responseFields;
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
                return new CampaignOwner(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public CampaignOwner(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof CampaignOwner)) {
                return false;
            }
            CampaignOwner campaignOwner = (CampaignOwner) obj;
            if (this.__typename.equals(campaignOwner.__typename) && this.id.equals(campaignOwner.id) && this.addedSourceType.equals(campaignOwner.addedSourceType) && this.name.equals(campaignOwner.name) && ((str = this.profilePictureUrl) != null ? str.equals(campaignOwner.profilePictureUrl) : campaignOwner.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(campaignOwner.registeredEmail) : campaignOwner.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(campaignOwner.registeredEmailVerified) : campaignOwner.registeredEmailVerified == null) && this.registeredNumber.equals(campaignOwner.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(campaignOwner.registeredNumberVerified) : campaignOwner.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(campaignOwner.secondaryNumber) : campaignOwner.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(campaignOwner.secondaryNumberVerified) : campaignOwner.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(campaignOwner.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(campaignOwner.lastSelectedAccountWeb) : campaignOwner.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(campaignOwner.lastSelectedAccountApp) : campaignOwner.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(campaignOwner.appVersion) : campaignOwner.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(campaignOwner.deviceModel) : campaignOwner.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(campaignOwner.deviceManufacturer) : campaignOwner.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(campaignOwner.androidVersionRelease) : campaignOwner.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(campaignOwner.createdAt) : campaignOwner.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = campaignOwner.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.CampaignOwner.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CampaignOwner.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CampaignOwner.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CampaignOwner.this.id);
                    responseWriter.writeString(responseFieldArr[2], CampaignOwner.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], CampaignOwner.this.name);
                    responseWriter.writeString(responseFieldArr[4], CampaignOwner.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CampaignOwner.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], CampaignOwner.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CampaignOwner.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], CampaignOwner.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CampaignOwner.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], CampaignOwner.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], CampaignOwner.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CampaignOwner.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], CampaignOwner.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], CampaignOwner.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], CampaignOwner.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], CampaignOwner.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], CampaignOwner.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CampaignOwner.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], CampaignOwner.this.updatedAt);
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
                this.$toString = "CampaignOwner{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateCampaignDefinition", "updateCampaignDefinition", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateCampaignDefinition updateCampaignDefinition;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateCampaignDefinition.Mapper updateCampaignDefinitionFieldMapper = new UpdateCampaignDefinition.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateCampaignDefinition) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateCampaignDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateCampaignDefinition read(ResponseReader responseReader2) {
                        return Mapper.this.updateCampaignDefinitionFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateCampaignDefinition updateCampaignDefinition) {
            this.updateCampaignDefinition = updateCampaignDefinition;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateCampaignDefinition updateCampaignDefinition = this.updateCampaignDefinition;
            UpdateCampaignDefinition updateCampaignDefinition2 = ((Data) obj).updateCampaignDefinition;
            return updateCampaignDefinition == null ? updateCampaignDefinition2 == null : updateCampaignDefinition.equals(updateCampaignDefinition2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateCampaignDefinition updateCampaignDefinition = this.updateCampaignDefinition;
                this.$hashCode = (updateCampaignDefinition == null ? 0 : updateCampaignDefinition.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateCampaignDefinition updateCampaignDefinition = Data.this.updateCampaignDefinition;
                    responseWriter.writeObject(responseField, updateCampaignDefinition != null ? updateCampaignDefinition.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateCampaignDefinition=" + this.updateCampaignDefinition + "}";
            }
            return this.$toString;
        }

        public UpdateCampaignDefinition updateCampaignDefinition() {
            return this.updateCampaignDefinition;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.PrimaryTeam.1
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

    public static class TimeSlotToSend {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String timeEnd;
        final String timeStart;

        public static final class Mapper implements ResponseFieldMapper<TimeSlotToSend> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public TimeSlotToSend map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = TimeSlotToSend.$responseFields;
                return new TimeSlotToSend(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]));
            }
        }

        static {
            CustomType customType = CustomType.AWSTIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("timeStart", "timeStart", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("timeEnd", "timeEnd", null, true, customType, Collections.emptyList())};
        }

        public TimeSlotToSend(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.timeStart = str2;
            this.timeEnd = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimeSlotToSend)) {
                return false;
            }
            TimeSlotToSend timeSlotToSend = (TimeSlotToSend) obj;
            if (this.__typename.equals(timeSlotToSend.__typename) && ((str = this.timeStart) != null ? str.equals(timeSlotToSend.timeStart) : timeSlotToSend.timeStart == null)) {
                String str2 = this.timeEnd;
                String str3 = timeSlotToSend.timeEnd;
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
                String str = this.timeStart;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.timeEnd;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.TimeSlotToSend.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = TimeSlotToSend.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], TimeSlotToSend.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], TimeSlotToSend.this.timeStart);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], TimeSlotToSend.this.timeEnd);
                }
            };
        }

        public String timeEnd() {
            return this.timeEnd;
        }

        public String timeStart() {
            return this.timeStart;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TimeSlotToSend{__typename=" + this.__typename + ", timeStart=" + this.timeStart + ", timeEnd=" + this.timeEnd + "}";
            }
            return this.$toString;
        }
    }

    public static class UpdateCampaignDefinition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean allowMultiple;
        final String associatedEntityListId;
        final AssociatedList associatedList;
        final String campaignCategory;
        final String campaignChannelIdentifier;
        final String campaignData;
        final CampaignOwner campaignOwner;
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
        final PrimaryTeam primaryTeam;
        final String primaryTeamId;
        final Integer readCount;
        final Integer repliedCount;
        final Integer sentCount;
        final String startDateOfRun;
        final CampaignStatus status;
        final String systemPauseReason;
        final List<String> tags;
        final List<TimeSlotToSend> timeSlotToSend;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateCampaignDefinition> {
            final TimeSlotToSend.Mapper timeSlotToSendFieldMapper = new TimeSlotToSend.Mapper();
            final PrimaryTeam.Mapper primaryTeamFieldMapper = new PrimaryTeam.Mapper();
            final AssociatedList.Mapper associatedListFieldMapper = new AssociatedList.Mapper();
            final CampaignOwner.Mapper campaignOwnerFieldMapper = new CampaignOwner.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateCampaignDefinition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateCampaignDefinition.$responseFields;
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
                List list = responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                List list2 = responseReader.readList(responseFieldArr[16], new ResponseReader.ListReader<TimeSlotToSend>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public TimeSlotToSend read(ResponseReader.ListItemReader listItemReader) {
                        return (TimeSlotToSend) listItemReader.readObject(new ResponseReader.ObjectReader<TimeSlotToSend>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.Mapper.2.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public TimeSlotToSend read(ResponseReader responseReader2) {
                                return Mapper.this.timeSlotToSendFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]);
                PrimaryTeam primaryTeam = (PrimaryTeam) responseReader.readObject(responseFieldArr[19], new ResponseReader.ObjectReader<PrimaryTeam>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public PrimaryTeam read(ResponseReader responseReader2) {
                        return Mapper.this.primaryTeamFieldMapper.map(responseReader2);
                    }
                });
                String string9 = responseReader.readString(responseFieldArr[20]);
                return new UpdateCampaignDefinition(string, str, str2, string2, string3, string4, string5, campaignTypeValueOf, string7, str3, campaignRunFrequencyUnitValueOf, num, str4, str5, num2, list, list2, str6, str7, primaryTeam, string9 != null ? CampaignStatus.valueOf(string9) : null, responseReader.readString(responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), responseReader.readBoolean(responseFieldArr[23]), responseReader.readBoolean(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readInt(responseFieldArr[26]), responseReader.readInt(responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readInt(responseFieldArr[29]), responseReader.readInt(responseFieldArr[30]), responseReader.readList(responseFieldArr[31], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readInt(responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (AssociatedList) responseReader.readObject(responseFieldArr[35], new ResponseReader.ObjectReader<AssociatedList>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AssociatedList read(ResponseReader responseReader2) {
                        return Mapper.this.associatedListFieldMapper.map(responseReader2);
                    }
                }), (CampaignOwner) responseReader.readObject(responseFieldArr[36], new ResponseReader.ObjectReader<CampaignOwner>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CampaignOwner read(ResponseReader responseReader2) {
                        return Mapper.this.campaignOwnerFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("campaignCategory", "campaignCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignSubCategory", "campaignSubCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignType", "campaignType", null, false, Collections.emptyList()), ResponseField.forString("campaignChannelIdentifier", "campaignChannelIdentifier", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignData", "campaignData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("campaignRunFrequencyUnit", "campaignRunFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forInt("campaignRunFrequencyValue", "campaignRunFrequencyValue", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateOfRun", "startDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateOfRun", "endDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forInt("durationOfRunInDays", "durationOfRunInDays", null, true, Collections.emptyList()), ResponseField.forList("daysToSend", "daysToSend", null, true, Collections.emptyList()), ResponseField.forList("timeSlotToSend", "timeSlotToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forObject("primaryTeam", "primaryTeam", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forString("systemPauseReason", "systemPauseReason", null, true, Collections.emptyList()), ResponseField.forCustomType("associatedEntityListId", "associatedEntityListId", null, false, customType, Collections.emptyList()), ResponseField.forBoolean("includeHistoricalMemberships", "includeHistoricalMemberships", null, true, Collections.emptyList()), ResponseField.forBoolean("allowMultiple", "allowMultiple", null, true, Collections.emptyList()), ResponseField.forInt("messageCreated", "messageCreated", null, true, Collections.emptyList()), ResponseField.forInt("sentCount", "sentCount", null, true, Collections.emptyList()), ResponseField.forInt("deliveredCount", "deliveredCount", null, true, Collections.emptyList()), ResponseField.forInt("readCount", "readCount", null, true, Collections.emptyList()), ResponseField.forInt("repliedCount", "repliedCount", null, true, Collections.emptyList()), ResponseField.forInt("failedCount", "failedCount", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forInt("leadLimit", "leadLimit", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("associatedList", "associatedList", null, true, Collections.emptyList()), ResponseField.forObject("campaignOwner", "campaignOwner", null, true, Collections.emptyList())};
        }

        public UpdateCampaignDefinition(String str, String str2, String str3, String str4, String str5, String str6, String str7, CampaignType campaignType, String str8, String str9, CampaignRunFrequencyUnit campaignRunFrequencyUnit, Integer num, String str10, String str11, Integer num2, List<String> list, List<TimeSlotToSend> list2, String str12, String str13, PrimaryTeam primaryTeam, CampaignStatus campaignStatus, String str14, String str15, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List<String> list3, Integer num9, String str16, String str17, AssociatedList associatedList, CampaignOwner campaignOwner) {
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
            this.timeSlotToSend = list2;
            this.ownerId = (String) Utils.checkNotNull(str12, "ownerId == null");
            this.primaryTeamId = str13;
            this.primaryTeam = primaryTeam;
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
            this.tags = list3;
            this.leadLimit = num9;
            this.createdAt = str16;
            this.updatedAt = str17;
            this.associatedList = associatedList;
            this.campaignOwner = campaignOwner;
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

        public AssociatedList associatedList() {
            return this.associatedList;
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

        public CampaignOwner campaignOwner() {
            return this.campaignOwner;
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
            List<TimeSlotToSend> list2;
            String str7;
            PrimaryTeam primaryTeam;
            String str8;
            Boolean bool;
            Boolean bool2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            Integer num8;
            List<String> list3;
            Integer num9;
            String str9;
            String str10;
            AssociatedList associatedList;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateCampaignDefinition)) {
                return false;
            }
            UpdateCampaignDefinition updateCampaignDefinition = (UpdateCampaignDefinition) obj;
            if (this.__typename.equals(updateCampaignDefinition.__typename) && this.id.equals(updateCampaignDefinition.id) && this.accountId.equals(updateCampaignDefinition.accountId) && this.name.equals(updateCampaignDefinition.name) && this.description.equals(updateCampaignDefinition.description) && ((str = this.campaignCategory) != null ? str.equals(updateCampaignDefinition.campaignCategory) : updateCampaignDefinition.campaignCategory == null) && ((str2 = this.campaignSubCategory) != null ? str2.equals(updateCampaignDefinition.campaignSubCategory) : updateCampaignDefinition.campaignSubCategory == null) && this.campaignType.equals(updateCampaignDefinition.campaignType) && ((str3 = this.campaignChannelIdentifier) != null ? str3.equals(updateCampaignDefinition.campaignChannelIdentifier) : updateCampaignDefinition.campaignChannelIdentifier == null) && ((str4 = this.campaignData) != null ? str4.equals(updateCampaignDefinition.campaignData) : updateCampaignDefinition.campaignData == null) && ((campaignRunFrequencyUnit = this.campaignRunFrequencyUnit) != null ? campaignRunFrequencyUnit.equals(updateCampaignDefinition.campaignRunFrequencyUnit) : updateCampaignDefinition.campaignRunFrequencyUnit == null) && ((num = this.campaignRunFrequencyValue) != null ? num.equals(updateCampaignDefinition.campaignRunFrequencyValue) : updateCampaignDefinition.campaignRunFrequencyValue == null) && ((str5 = this.startDateOfRun) != null ? str5.equals(updateCampaignDefinition.startDateOfRun) : updateCampaignDefinition.startDateOfRun == null) && ((str6 = this.endDateOfRun) != null ? str6.equals(updateCampaignDefinition.endDateOfRun) : updateCampaignDefinition.endDateOfRun == null) && ((num2 = this.durationOfRunInDays) != null ? num2.equals(updateCampaignDefinition.durationOfRunInDays) : updateCampaignDefinition.durationOfRunInDays == null) && ((list = this.daysToSend) != null ? list.equals(updateCampaignDefinition.daysToSend) : updateCampaignDefinition.daysToSend == null) && ((list2 = this.timeSlotToSend) != null ? list2.equals(updateCampaignDefinition.timeSlotToSend) : updateCampaignDefinition.timeSlotToSend == null) && this.ownerId.equals(updateCampaignDefinition.ownerId) && ((str7 = this.primaryTeamId) != null ? str7.equals(updateCampaignDefinition.primaryTeamId) : updateCampaignDefinition.primaryTeamId == null) && ((primaryTeam = this.primaryTeam) != null ? primaryTeam.equals(updateCampaignDefinition.primaryTeam) : updateCampaignDefinition.primaryTeam == null) && this.status.equals(updateCampaignDefinition.status) && ((str8 = this.systemPauseReason) != null ? str8.equals(updateCampaignDefinition.systemPauseReason) : updateCampaignDefinition.systemPauseReason == null) && this.associatedEntityListId.equals(updateCampaignDefinition.associatedEntityListId) && ((bool = this.includeHistoricalMemberships) != null ? bool.equals(updateCampaignDefinition.includeHistoricalMemberships) : updateCampaignDefinition.includeHistoricalMemberships == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(updateCampaignDefinition.allowMultiple) : updateCampaignDefinition.allowMultiple == null) && ((num3 = this.messageCreated) != null ? num3.equals(updateCampaignDefinition.messageCreated) : updateCampaignDefinition.messageCreated == null) && ((num4 = this.sentCount) != null ? num4.equals(updateCampaignDefinition.sentCount) : updateCampaignDefinition.sentCount == null) && ((num5 = this.deliveredCount) != null ? num5.equals(updateCampaignDefinition.deliveredCount) : updateCampaignDefinition.deliveredCount == null) && ((num6 = this.readCount) != null ? num6.equals(updateCampaignDefinition.readCount) : updateCampaignDefinition.readCount == null) && ((num7 = this.repliedCount) != null ? num7.equals(updateCampaignDefinition.repliedCount) : updateCampaignDefinition.repliedCount == null) && ((num8 = this.failedCount) != null ? num8.equals(updateCampaignDefinition.failedCount) : updateCampaignDefinition.failedCount == null) && ((list3 = this.tags) != null ? list3.equals(updateCampaignDefinition.tags) : updateCampaignDefinition.tags == null) && ((num9 = this.leadLimit) != null ? num9.equals(updateCampaignDefinition.leadLimit) : updateCampaignDefinition.leadLimit == null) && ((str9 = this.createdAt) != null ? str9.equals(updateCampaignDefinition.createdAt) : updateCampaignDefinition.createdAt == null) && ((str10 = this.updatedAt) != null ? str10.equals(updateCampaignDefinition.updatedAt) : updateCampaignDefinition.updatedAt == null) && ((associatedList = this.associatedList) != null ? associatedList.equals(updateCampaignDefinition.associatedList) : updateCampaignDefinition.associatedList == null)) {
                CampaignOwner campaignOwner = this.campaignOwner;
                CampaignOwner campaignOwner2 = updateCampaignDefinition.campaignOwner;
                if (campaignOwner == null) {
                    if (campaignOwner2 == null) {
                        return true;
                    }
                } else if (campaignOwner.equals(campaignOwner2)) {
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
                int iHashCode11 = (iHashCode10 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<TimeSlotToSend> list2 = this.timeSlotToSend;
                int iHashCode12 = (((iHashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str7 = this.primaryTeamId;
                int iHashCode13 = (iHashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                PrimaryTeam primaryTeam = this.primaryTeam;
                int iHashCode14 = (((iHashCode13 ^ (primaryTeam == null ? 0 : primaryTeam.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003;
                String str8 = this.systemPauseReason;
                int iHashCode15 = (((iHashCode14 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.associatedEntityListId.hashCode()) * 1000003;
                Boolean bool = this.includeHistoricalMemberships;
                int iHashCode16 = (iHashCode15 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.allowMultiple;
                int iHashCode17 = (iHashCode16 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num3 = this.messageCreated;
                int iHashCode18 = (iHashCode17 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.sentCount;
                int iHashCode19 = (iHashCode18 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.deliveredCount;
                int iHashCode20 = (iHashCode19 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.readCount;
                int iHashCode21 = (iHashCode20 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.repliedCount;
                int iHashCode22 = (iHashCode21 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                Integer num8 = this.failedCount;
                int iHashCode23 = (iHashCode22 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                List<String> list3 = this.tags;
                int iHashCode24 = (iHashCode23 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                Integer num9 = this.leadLimit;
                int iHashCode25 = (iHashCode24 ^ (num9 == null ? 0 : num9.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode26 = (iHashCode25 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                int iHashCode27 = (iHashCode26 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                AssociatedList associatedList = this.associatedList;
                int iHashCode28 = (iHashCode27 ^ (associatedList == null ? 0 : associatedList.hashCode())) * 1000003;
                CampaignOwner campaignOwner = this.campaignOwner;
                this.$hashCode = iHashCode28 ^ (campaignOwner != null ? campaignOwner.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateCampaignDefinition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateCampaignDefinition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateCampaignDefinition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateCampaignDefinition.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UpdateCampaignDefinition.this.name);
                    responseWriter.writeString(responseFieldArr[4], UpdateCampaignDefinition.this.description);
                    responseWriter.writeString(responseFieldArr[5], UpdateCampaignDefinition.this.campaignCategory);
                    responseWriter.writeString(responseFieldArr[6], UpdateCampaignDefinition.this.campaignSubCategory);
                    responseWriter.writeString(responseFieldArr[7], UpdateCampaignDefinition.this.campaignType.name());
                    responseWriter.writeString(responseFieldArr[8], UpdateCampaignDefinition.this.campaignChannelIdentifier);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateCampaignDefinition.this.campaignData);
                    ResponseField responseField = responseFieldArr[10];
                    CampaignRunFrequencyUnit campaignRunFrequencyUnit = UpdateCampaignDefinition.this.campaignRunFrequencyUnit;
                    responseWriter.writeString(responseField, campaignRunFrequencyUnit != null ? campaignRunFrequencyUnit.name() : null);
                    responseWriter.writeInt(responseFieldArr[11], UpdateCampaignDefinition.this.campaignRunFrequencyValue);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateCampaignDefinition.this.startDateOfRun);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdateCampaignDefinition.this.endDateOfRun);
                    responseWriter.writeInt(responseFieldArr[14], UpdateCampaignDefinition.this.durationOfRunInDays);
                    responseWriter.writeList(responseFieldArr[15], UpdateCampaignDefinition.this.daysToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[16], UpdateCampaignDefinition.this.timeSlotToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((TimeSlotToSend) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], UpdateCampaignDefinition.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], UpdateCampaignDefinition.this.primaryTeamId);
                    ResponseField responseField2 = responseFieldArr[19];
                    PrimaryTeam primaryTeam = UpdateCampaignDefinition.this.primaryTeam;
                    responseWriter.writeObject(responseField2, primaryTeam != null ? primaryTeam.marshaller() : null);
                    responseWriter.writeString(responseFieldArr[20], UpdateCampaignDefinition.this.status.name());
                    responseWriter.writeString(responseFieldArr[21], UpdateCampaignDefinition.this.systemPauseReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], UpdateCampaignDefinition.this.associatedEntityListId);
                    responseWriter.writeBoolean(responseFieldArr[23], UpdateCampaignDefinition.this.includeHistoricalMemberships);
                    responseWriter.writeBoolean(responseFieldArr[24], UpdateCampaignDefinition.this.allowMultiple);
                    responseWriter.writeInt(responseFieldArr[25], UpdateCampaignDefinition.this.messageCreated);
                    responseWriter.writeInt(responseFieldArr[26], UpdateCampaignDefinition.this.sentCount);
                    responseWriter.writeInt(responseFieldArr[27], UpdateCampaignDefinition.this.deliveredCount);
                    responseWriter.writeInt(responseFieldArr[28], UpdateCampaignDefinition.this.readCount);
                    responseWriter.writeInt(responseFieldArr[29], UpdateCampaignDefinition.this.repliedCount);
                    responseWriter.writeInt(responseFieldArr[30], UpdateCampaignDefinition.this.failedCount);
                    responseWriter.writeList(responseFieldArr[31], UpdateCampaignDefinition.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.UpdateCampaignDefinition.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[32], UpdateCampaignDefinition.this.leadLimit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], UpdateCampaignDefinition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], UpdateCampaignDefinition.this.updatedAt);
                    ResponseField responseField3 = responseFieldArr[35];
                    AssociatedList associatedList = UpdateCampaignDefinition.this.associatedList;
                    responseWriter.writeObject(responseField3, associatedList != null ? associatedList.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[36];
                    CampaignOwner campaignOwner = UpdateCampaignDefinition.this.campaignOwner;
                    responseWriter.writeObject(responseField4, campaignOwner != null ? campaignOwner.marshaller() : null);
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

        public List<TimeSlotToSend> timeSlotToSend() {
            return this.timeSlotToSend;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateCampaignDefinition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", campaignCategory=" + this.campaignCategory + ", campaignSubCategory=" + this.campaignSubCategory + ", campaignType=" + this.campaignType + ", campaignChannelIdentifier=" + this.campaignChannelIdentifier + ", campaignData=" + this.campaignData + ", campaignRunFrequencyUnit=" + this.campaignRunFrequencyUnit + ", campaignRunFrequencyValue=" + this.campaignRunFrequencyValue + ", startDateOfRun=" + this.startDateOfRun + ", endDateOfRun=" + this.endDateOfRun + ", durationOfRunInDays=" + this.durationOfRunInDays + ", daysToSend=" + this.daysToSend + ", timeSlotToSend=" + this.timeSlotToSend + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", primaryTeam=" + this.primaryTeam + ", status=" + this.status + ", systemPauseReason=" + this.systemPauseReason + ", associatedEntityListId=" + this.associatedEntityListId + ", includeHistoricalMemberships=" + this.includeHistoricalMemberships + ", allowMultiple=" + this.allowMultiple + ", messageCreated=" + this.messageCreated + ", sentCount=" + this.sentCount + ", deliveredCount=" + this.deliveredCount + ", readCount=" + this.readCount + ", repliedCount=" + this.repliedCount + ", failedCount=" + this.failedCount + ", tags=" + this.tags + ", leadLimit=" + this.leadLimit + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", associatedList=" + this.associatedList + ", campaignOwner=" + this.campaignOwner + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelCampaignDefinitionConditionInput condition;
        private final UpdateCampaignDefinitionInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateCampaignDefinitionInput updateCampaignDefinitionInput, ModelCampaignDefinitionConditionInput modelCampaignDefinitionConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateCampaignDefinitionInput;
            this.condition = modelCampaignDefinitionConditionInput;
            linkedHashMap.put("input", updateCampaignDefinitionInput);
            linkedHashMap.put("condition", modelCampaignDefinitionConditionInput);
        }

        public ModelCampaignDefinitionConditionInput condition() {
            return this.condition;
        }

        public UpdateCampaignDefinitionInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateCampaignDefinitionMutation.Variables.1
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

    public UpdateCampaignDefinitionMutation(UpdateCampaignDefinitionInput updateCampaignDefinitionInput, ModelCampaignDefinitionConditionInput modelCampaignDefinitionConditionInput) {
        Utils.checkNotNull(updateCampaignDefinitionInput, "input == null");
        this.variables = new Variables(updateCampaignDefinitionInput, modelCampaignDefinitionConditionInput);
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
        return "49d599c180f1d94f1789bf01de746fc4743cfd9ef8670bede29fa11d05c19bf9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateCampaignDefinition($input: UpdateCampaignDefinitionInput!, $condition: ModelCampaignDefinitionConditionInput) {\n  updateCampaignDefinition(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    description\n    campaignCategory\n    campaignSubCategory\n    campaignType\n    campaignChannelIdentifier\n    campaignData\n    campaignRunFrequencyUnit\n    campaignRunFrequencyValue\n    startDateOfRun\n    endDateOfRun\n    durationOfRunInDays\n    daysToSend\n    timeSlotToSend {\n      __typename\n      timeStart\n      timeEnd\n    }\n    ownerId\n    primaryTeamId\n    primaryTeam {\n      __typename\n      id\n      accountId\n      createdById\n      description\n      teamName\n      updatedById\n      createdAt\n      updatedAt\n    }\n    status\n    systemPauseReason\n    associatedEntityListId\n    includeHistoricalMemberships\n    allowMultiple\n    messageCreated\n    sentCount\n    deliveredCount\n    readCount\n    repliedCount\n    failedCount\n    tags\n    leadLimit\n    createdAt\n    updatedAt\n    associatedList {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n    campaignOwner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
