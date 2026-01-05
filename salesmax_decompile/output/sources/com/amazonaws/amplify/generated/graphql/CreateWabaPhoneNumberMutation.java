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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.ContactAssignmentStatus;
import type.CreateWabaPhoneNumberInput;
import type.CustomType;
import type.EntityListStatus;
import type.EntityListType;
import type.ListCreationType;
import type.ModelWabaPhoneNumberConditionInput;

/* loaded from: classes6.dex */
public final class CreateWabaPhoneNumberMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateWabaPhoneNumber($input: CreateWabaPhoneNumberInput!, $condition: ModelWabaPhoneNumberConditionInput) {\n  createWabaPhoneNumber(input: $input, condition: $condition) {\n    __typename\n    id\n    wabaAccountId\n    accountId\n    phoneNumberId\n    phoneNumber\n    isDefault\n    accessToken\n    name\n    internalName\n    quota\n    currentLimitCategory\n    status\n    qualityRating\n    entityListId\n    createdAt\n    updatedAt\n    welcomeMessage\n    requestedDisplayName\n    displayNameUpdate\n    displayNameUpdateDateTime\n    wabaNumberDecision\n    wabaNumberDecisionTime\n    rejectionReason\n    phoneNumberQualityUpdate\n    phoneNumberQualityUpdateTime\n    createdById\n    updatedById\n    entityList {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateWabaPhoneNumber";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateWabaPhoneNumber($input: CreateWabaPhoneNumberInput!, $condition: ModelWabaPhoneNumberConditionInput) {\n  createWabaPhoneNumber(input: $input, condition: $condition) {\n    __typename\n    id\n    wabaAccountId\n    accountId\n    phoneNumberId\n    phoneNumber\n    isDefault\n    accessToken\n    name\n    internalName\n    quota\n    currentLimitCategory\n    status\n    qualityRating\n    entityListId\n    createdAt\n    updatedAt\n    welcomeMessage\n    requestedDisplayName\n    displayNameUpdate\n    displayNameUpdateDateTime\n    wabaNumberDecision\n    wabaNumberDecisionTime\n    rejectionReason\n    phoneNumberQualityUpdate\n    phoneNumberQualityUpdateTime\n    createdById\n    updatedById\n    entityList {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWabaPhoneNumberConditionInput condition;
        private CreateWabaPhoneNumberInput input;

        public CreateWabaPhoneNumberMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateWabaPhoneNumberMutation(this.input, this.condition);
        }

        public Builder condition(ModelWabaPhoneNumberConditionInput modelWabaPhoneNumberConditionInput) {
            this.condition = modelWabaPhoneNumberConditionInput;
            return this;
        }

        public Builder input(CreateWabaPhoneNumberInput createWabaPhoneNumberInput) {
            this.input = createWabaPhoneNumberInput;
            return this;
        }
    }

    public static class CreateWabaPhoneNumber {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accessToken;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String currentLimitCategory;
        final String displayNameUpdate;
        final String displayNameUpdateDateTime;
        final EntityList entityList;
        final String entityListId;
        final String id;
        final String internalName;
        final Boolean isDefault;
        final String name;
        final String phoneNumber;
        final String phoneNumberId;
        final String phoneNumberQualityUpdate;
        final String phoneNumberQualityUpdateTime;
        final String qualityRating;
        final Integer quota;
        final String rejectionReason;
        final String requestedDisplayName;
        final String status;
        final String updatedAt;
        final String updatedById;
        final String wabaAccountId;
        final String wabaNumberDecision;
        final String wabaNumberDecisionTime;
        final String welcomeMessage;

        public static final class Mapper implements ResponseFieldMapper<CreateWabaPhoneNumber> {
            final EntityList.Mapper entityListFieldMapper = new EntityList.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateWabaPhoneNumber map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateWabaPhoneNumber.$responseFields;
                return new CreateWabaPhoneNumber(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readInt(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), (EntityList) responseReader.readObject(responseFieldArr[28], new ResponseReader.ObjectReader<EntityList>() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.CreateWabaPhoneNumber.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public EntityList read(ResponseReader responseReader2) {
                        return Mapper.this.entityListFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumber", "phoneNumber", null, false, Collections.emptyList()), ResponseField.forBoolean("isDefault", "isDefault", null, true, Collections.emptyList()), ResponseField.forString("accessToken", "accessToken", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("internalName", "internalName", null, true, Collections.emptyList()), ResponseField.forInt("quota", "quota", null, true, Collections.emptyList()), ResponseField.forString("currentLimitCategory", "currentLimitCategory", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("qualityRating", "qualityRating", null, true, Collections.emptyList()), ResponseField.forCustomType("entityListId", "entityListId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("welcomeMessage", "welcomeMessage", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("requestedDisplayName", "requestedDisplayName", null, true, Collections.emptyList()), ResponseField.forString("displayNameUpdate", "displayNameUpdate", null, true, Collections.emptyList()), ResponseField.forCustomType("displayNameUpdateDateTime", "displayNameUpdateDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("wabaNumberDecision", "wabaNumberDecision", null, true, Collections.emptyList()), ResponseField.forCustomType("wabaNumberDecisionTime", "wabaNumberDecisionTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("rejectionReason", "rejectionReason", null, true, Collections.emptyList()), ResponseField.forString("phoneNumberQualityUpdate", "phoneNumberQualityUpdate", null, true, Collections.emptyList()), ResponseField.forCustomType("phoneNumberQualityUpdateTime", "phoneNumberQualityUpdateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forObject("entityList", "entityList", null, true, Collections.emptyList())};
        }

        public CreateWabaPhoneNumber(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, EntityList entityList) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.wabaAccountId = (String) Utils.checkNotNull(str3, "wabaAccountId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.phoneNumberId = (String) Utils.checkNotNull(str5, "phoneNumberId == null");
            this.phoneNumber = (String) Utils.checkNotNull(str6, "phoneNumber == null");
            this.isDefault = bool;
            this.accessToken = str7;
            this.name = str8;
            this.internalName = str9;
            this.quota = num;
            this.currentLimitCategory = str10;
            this.status = str11;
            this.qualityRating = str12;
            this.entityListId = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
            this.welcomeMessage = str16;
            this.requestedDisplayName = str17;
            this.displayNameUpdate = str18;
            this.displayNameUpdateDateTime = str19;
            this.wabaNumberDecision = str20;
            this.wabaNumberDecisionTime = str21;
            this.rejectionReason = str22;
            this.phoneNumberQualityUpdate = str23;
            this.phoneNumberQualityUpdateTime = str24;
            this.createdById = str25;
            this.updatedById = str26;
            this.entityList = entityList;
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

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String currentLimitCategory() {
            return this.currentLimitCategory;
        }

        public String displayNameUpdate() {
            return this.displayNameUpdate;
        }

        public String displayNameUpdateDateTime() {
            return this.displayNameUpdateDateTime;
        }

        public EntityList entityList() {
            return this.entityList;
        }

        public String entityListId() {
            return this.entityListId;
        }

        public boolean equals(Object obj) {
            Boolean bool;
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
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateWabaPhoneNumber)) {
                return false;
            }
            CreateWabaPhoneNumber createWabaPhoneNumber = (CreateWabaPhoneNumber) obj;
            if (this.__typename.equals(createWabaPhoneNumber.__typename) && this.id.equals(createWabaPhoneNumber.id) && this.wabaAccountId.equals(createWabaPhoneNumber.wabaAccountId) && this.accountId.equals(createWabaPhoneNumber.accountId) && this.phoneNumberId.equals(createWabaPhoneNumber.phoneNumberId) && this.phoneNumber.equals(createWabaPhoneNumber.phoneNumber) && ((bool = this.isDefault) != null ? bool.equals(createWabaPhoneNumber.isDefault) : createWabaPhoneNumber.isDefault == null) && ((str = this.accessToken) != null ? str.equals(createWabaPhoneNumber.accessToken) : createWabaPhoneNumber.accessToken == null) && ((str2 = this.name) != null ? str2.equals(createWabaPhoneNumber.name) : createWabaPhoneNumber.name == null) && ((str3 = this.internalName) != null ? str3.equals(createWabaPhoneNumber.internalName) : createWabaPhoneNumber.internalName == null) && ((num = this.quota) != null ? num.equals(createWabaPhoneNumber.quota) : createWabaPhoneNumber.quota == null) && ((str4 = this.currentLimitCategory) != null ? str4.equals(createWabaPhoneNumber.currentLimitCategory) : createWabaPhoneNumber.currentLimitCategory == null) && ((str5 = this.status) != null ? str5.equals(createWabaPhoneNumber.status) : createWabaPhoneNumber.status == null) && ((str6 = this.qualityRating) != null ? str6.equals(createWabaPhoneNumber.qualityRating) : createWabaPhoneNumber.qualityRating == null) && ((str7 = this.entityListId) != null ? str7.equals(createWabaPhoneNumber.entityListId) : createWabaPhoneNumber.entityListId == null) && ((str8 = this.createdAt) != null ? str8.equals(createWabaPhoneNumber.createdAt) : createWabaPhoneNumber.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(createWabaPhoneNumber.updatedAt) : createWabaPhoneNumber.updatedAt == null) && ((str10 = this.welcomeMessage) != null ? str10.equals(createWabaPhoneNumber.welcomeMessage) : createWabaPhoneNumber.welcomeMessage == null) && ((str11 = this.requestedDisplayName) != null ? str11.equals(createWabaPhoneNumber.requestedDisplayName) : createWabaPhoneNumber.requestedDisplayName == null) && ((str12 = this.displayNameUpdate) != null ? str12.equals(createWabaPhoneNumber.displayNameUpdate) : createWabaPhoneNumber.displayNameUpdate == null) && ((str13 = this.displayNameUpdateDateTime) != null ? str13.equals(createWabaPhoneNumber.displayNameUpdateDateTime) : createWabaPhoneNumber.displayNameUpdateDateTime == null) && ((str14 = this.wabaNumberDecision) != null ? str14.equals(createWabaPhoneNumber.wabaNumberDecision) : createWabaPhoneNumber.wabaNumberDecision == null) && ((str15 = this.wabaNumberDecisionTime) != null ? str15.equals(createWabaPhoneNumber.wabaNumberDecisionTime) : createWabaPhoneNumber.wabaNumberDecisionTime == null) && ((str16 = this.rejectionReason) != null ? str16.equals(createWabaPhoneNumber.rejectionReason) : createWabaPhoneNumber.rejectionReason == null) && ((str17 = this.phoneNumberQualityUpdate) != null ? str17.equals(createWabaPhoneNumber.phoneNumberQualityUpdate) : createWabaPhoneNumber.phoneNumberQualityUpdate == null) && ((str18 = this.phoneNumberQualityUpdateTime) != null ? str18.equals(createWabaPhoneNumber.phoneNumberQualityUpdateTime) : createWabaPhoneNumber.phoneNumberQualityUpdateTime == null) && ((str19 = this.createdById) != null ? str19.equals(createWabaPhoneNumber.createdById) : createWabaPhoneNumber.createdById == null) && ((str20 = this.updatedById) != null ? str20.equals(createWabaPhoneNumber.updatedById) : createWabaPhoneNumber.updatedById == null)) {
                EntityList entityList = this.entityList;
                EntityList entityList2 = createWabaPhoneNumber.entityList;
                if (entityList == null) {
                    if (entityList2 == null) {
                        return true;
                    }
                } else if (entityList.equals(entityList2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.wabaAccountId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.phoneNumberId.hashCode()) * 1000003) ^ this.phoneNumber.hashCode()) * 1000003;
                Boolean bool = this.isDefault;
                int iHashCode2 = (iHashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str = this.accessToken;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.name;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.internalName;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.quota;
                int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str4 = this.currentLimitCategory;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.status;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.qualityRating;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.entityListId;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.welcomeMessage;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.requestedDisplayName;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.displayNameUpdate;
                int iHashCode15 = (iHashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.displayNameUpdateDateTime;
                int iHashCode16 = (iHashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.wabaNumberDecision;
                int iHashCode17 = (iHashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.wabaNumberDecisionTime;
                int iHashCode18 = (iHashCode17 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.rejectionReason;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.phoneNumberQualityUpdate;
                int iHashCode20 = (iHashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.phoneNumberQualityUpdateTime;
                int iHashCode21 = (iHashCode20 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.createdById;
                int iHashCode22 = (iHashCode21 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.updatedById;
                int iHashCode23 = (iHashCode22 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                EntityList entityList = this.entityList;
                this.$hashCode = iHashCode23 ^ (entityList != null ? entityList.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String internalName() {
            return this.internalName;
        }

        public Boolean isDefault() {
            return this.isDefault;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.CreateWabaPhoneNumber.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateWabaPhoneNumber.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateWabaPhoneNumber.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateWabaPhoneNumber.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateWabaPhoneNumber.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateWabaPhoneNumber.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], CreateWabaPhoneNumber.this.phoneNumberId);
                    responseWriter.writeString(responseFieldArr[5], CreateWabaPhoneNumber.this.phoneNumber);
                    responseWriter.writeBoolean(responseFieldArr[6], CreateWabaPhoneNumber.this.isDefault);
                    responseWriter.writeString(responseFieldArr[7], CreateWabaPhoneNumber.this.accessToken);
                    responseWriter.writeString(responseFieldArr[8], CreateWabaPhoneNumber.this.name);
                    responseWriter.writeString(responseFieldArr[9], CreateWabaPhoneNumber.this.internalName);
                    responseWriter.writeInt(responseFieldArr[10], CreateWabaPhoneNumber.this.quota);
                    responseWriter.writeString(responseFieldArr[11], CreateWabaPhoneNumber.this.currentLimitCategory);
                    responseWriter.writeString(responseFieldArr[12], CreateWabaPhoneNumber.this.status);
                    responseWriter.writeString(responseFieldArr[13], CreateWabaPhoneNumber.this.qualityRating);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], CreateWabaPhoneNumber.this.entityListId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], CreateWabaPhoneNumber.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], CreateWabaPhoneNumber.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], CreateWabaPhoneNumber.this.welcomeMessage);
                    responseWriter.writeString(responseFieldArr[18], CreateWabaPhoneNumber.this.requestedDisplayName);
                    responseWriter.writeString(responseFieldArr[19], CreateWabaPhoneNumber.this.displayNameUpdate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], CreateWabaPhoneNumber.this.displayNameUpdateDateTime);
                    responseWriter.writeString(responseFieldArr[21], CreateWabaPhoneNumber.this.wabaNumberDecision);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], CreateWabaPhoneNumber.this.wabaNumberDecisionTime);
                    responseWriter.writeString(responseFieldArr[23], CreateWabaPhoneNumber.this.rejectionReason);
                    responseWriter.writeString(responseFieldArr[24], CreateWabaPhoneNumber.this.phoneNumberQualityUpdate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], CreateWabaPhoneNumber.this.phoneNumberQualityUpdateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], CreateWabaPhoneNumber.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], CreateWabaPhoneNumber.this.updatedById);
                    ResponseField responseField = responseFieldArr[28];
                    EntityList entityList = CreateWabaPhoneNumber.this.entityList;
                    responseWriter.writeObject(responseField, entityList != null ? entityList.marshaller() : null);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String phoneNumber() {
            return this.phoneNumber;
        }

        public String phoneNumberId() {
            return this.phoneNumberId;
        }

        public String phoneNumberQualityUpdate() {
            return this.phoneNumberQualityUpdate;
        }

        public String phoneNumberQualityUpdateTime() {
            return this.phoneNumberQualityUpdateTime;
        }

        public String qualityRating() {
            return this.qualityRating;
        }

        public Integer quota() {
            return this.quota;
        }

        public String rejectionReason() {
            return this.rejectionReason;
        }

        public String requestedDisplayName() {
            return this.requestedDisplayName;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateWabaPhoneNumber{__typename=" + this.__typename + ", id=" + this.id + ", wabaAccountId=" + this.wabaAccountId + ", accountId=" + this.accountId + ", phoneNumberId=" + this.phoneNumberId + ", phoneNumber=" + this.phoneNumber + ", isDefault=" + this.isDefault + ", accessToken=" + this.accessToken + ", name=" + this.name + ", internalName=" + this.internalName + ", quota=" + this.quota + ", currentLimitCategory=" + this.currentLimitCategory + ", status=" + this.status + ", qualityRating=" + this.qualityRating + ", entityListId=" + this.entityListId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", welcomeMessage=" + this.welcomeMessage + ", requestedDisplayName=" + this.requestedDisplayName + ", displayNameUpdate=" + this.displayNameUpdate + ", displayNameUpdateDateTime=" + this.displayNameUpdateDateTime + ", wabaNumberDecision=" + this.wabaNumberDecision + ", wabaNumberDecisionTime=" + this.wabaNumberDecisionTime + ", rejectionReason=" + this.rejectionReason + ", phoneNumberQualityUpdate=" + this.phoneNumberQualityUpdate + ", phoneNumberQualityUpdateTime=" + this.phoneNumberQualityUpdateTime + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", entityList=" + this.entityList + "}";
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

        public String wabaNumberDecision() {
            return this.wabaNumberDecision;
        }

        public String wabaNumberDecisionTime() {
            return this.wabaNumberDecisionTime;
        }

        public String welcomeMessage() {
            return this.welcomeMessage;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createWabaPhoneNumber", "createWabaPhoneNumber", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateWabaPhoneNumber createWabaPhoneNumber;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateWabaPhoneNumber.Mapper createWabaPhoneNumberFieldMapper = new CreateWabaPhoneNumber.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateWabaPhoneNumber) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateWabaPhoneNumber>() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateWabaPhoneNumber read(ResponseReader responseReader2) {
                        return Mapper.this.createWabaPhoneNumberFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateWabaPhoneNumber createWabaPhoneNumber) {
            this.createWabaPhoneNumber = createWabaPhoneNumber;
        }

        public CreateWabaPhoneNumber createWabaPhoneNumber() {
            return this.createWabaPhoneNumber;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateWabaPhoneNumber createWabaPhoneNumber = this.createWabaPhoneNumber;
            CreateWabaPhoneNumber createWabaPhoneNumber2 = ((Data) obj).createWabaPhoneNumber;
            return createWabaPhoneNumber == null ? createWabaPhoneNumber2 == null : createWabaPhoneNumber.equals(createWabaPhoneNumber2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateWabaPhoneNumber createWabaPhoneNumber = this.createWabaPhoneNumber;
                this.$hashCode = (createWabaPhoneNumber == null ? 0 : createWabaPhoneNumber.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateWabaPhoneNumber createWabaPhoneNumber = Data.this.createWabaPhoneNumber;
                    responseWriter.writeObject(responseField, createWabaPhoneNumber != null ? createWabaPhoneNumber.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createWabaPhoneNumber=" + this.createWabaPhoneNumber + "}";
            }
            return this.$toString;
        }
    }

    public static class EntityList {
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

        public static final class Mapper implements ResponseFieldMapper<EntityList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public EntityList map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = EntityList.$responseFields;
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
                return new EntityList(string, str, str2, string2, entityListTypeValueOf, string4, string5, entityListStatusValueOf, num, num2, num3, num4, num5, num6, str3, listCreationTypeValueOf, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18 != null ? ContactAssignmentStatus.valueOf(string18) : null, responseReader.readString(responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.EntityList.Mapper.1
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

        public EntityList(String str, String str2, String str3, String str4, EntityListType entityListType, String str5, String str6, EntityListStatus entityListStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str7, ListCreationType listCreationType, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ContactAssignmentStatus contactAssignmentStatus, String str18, String str19, String str20, String str21, Boolean bool, String str22, String str23, List<String> list, String str24, Boolean bool2, String str25, String str26) {
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
            if (!(obj instanceof EntityList)) {
                return false;
            }
            EntityList entityList = (EntityList) obj;
            if (this.__typename.equals(entityList.__typename) && this.id.equals(entityList.id) && this.accountId.equals(entityList.accountId) && this.entityTypeInList.equals(entityList.entityTypeInList) && this.entityListType.equals(entityList.entityListType) && ((str = this.listName) != null ? str.equals(entityList.listName) : entityList.listName == null) && ((str2 = this.description) != null ? str2.equals(entityList.description) : entityList.description == null) && ((entityListStatus = this.status) != null ? entityListStatus.equals(entityList.status) : entityList.status == null) && ((num = this.successfulCount) != null ? num.equals(entityList.successfulCount) : entityList.successfulCount == null) && ((num2 = this.duplicateCount) != null ? num2.equals(entityList.duplicateCount) : entityList.duplicateCount == null) && ((num3 = this.invalidNumbersCount) != null ? num3.equals(entityList.invalidNumbersCount) : entityList.invalidNumbersCount == null) && ((num4 = this.invalidEmailCount) != null ? num4.equals(entityList.invalidEmailCount) : entityList.invalidEmailCount == null) && ((num5 = this.doNotTrackCount) != null ? num5.equals(entityList.doNotTrackCount) : entityList.doNotTrackCount == null) && ((num6 = this.otherFailedCount) != null ? num6.equals(entityList.otherFailedCount) : entityList.otherFailedCount == null) && this.ownerId.equals(entityList.ownerId) && this.listCreationType.equals(entityList.listCreationType) && ((str3 = this.listCategory) != null ? str3.equals(entityList.listCategory) : entityList.listCategory == null) && ((str4 = this.rawBulkUploadFileRef) != null ? str4.equals(entityList.rawBulkUploadFileRef) : entityList.rawBulkUploadFileRef == null) && ((str5 = this.rawBulkUploadFileHash) != null ? str5.equals(entityList.rawBulkUploadFileHash) : entityList.rawBulkUploadFileHash == null) && ((str6 = this.modifiedBulkUploadFileRef) != null ? str6.equals(entityList.modifiedBulkUploadFileRef) : entityList.modifiedBulkUploadFileRef == null) && ((str7 = this.finalBulkUploadFileRef) != null ? str7.equals(entityList.finalBulkUploadFileRef) : entityList.finalBulkUploadFileRef == null) && ((str8 = this.leadSourceForBulkUpload) != null ? str8.equals(entityList.leadSourceForBulkUpload) : entityList.leadSourceForBulkUpload == null) && ((str9 = this.defaultCountryCode) != null ? str9.equals(entityList.defaultCountryCode) : entityList.defaultCountryCode == null) && ((str10 = this.defaultCountryIso) != null ? str10.equals(entityList.defaultCountryIso) : entityList.defaultCountryIso == null) && ((str11 = this.notificationBody) != null ? str11.equals(entityList.notificationBody) : entityList.notificationBody == null) && ((str12 = this.rule) != null ? str12.equals(entityList.rule) : entityList.rule == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(entityList.toBeAssigned) : entityList.toBeAssigned == null) && ((str13 = this.assignedUserId) != null ? str13.equals(entityList.assignedUserId) : entityList.assignedUserId == null) && ((str14 = this.assignedTeamId) != null ? str14.equals(entityList.assignedTeamId) : entityList.assignedTeamId == null) && ((str15 = this.associatedDistributionId) != null ? str15.equals(entityList.associatedDistributionId) : entityList.associatedDistributionId == null) && ((str16 = this.entityActionDefinitionReference) != null ? str16.equals(entityList.entityActionDefinitionReference) : entityList.entityActionDefinitionReference == null) && ((bool = this.redistributeEntities) != null ? bool.equals(entityList.redistributeEntities) : entityList.redistributeEntities == null) && ((str17 = this.redistributionRequestedAt) != null ? str17.equals(entityList.redistributionRequestedAt) : entityList.redistributionRequestedAt == null) && ((str18 = this.dupliacteLeadList) != null ? str18.equals(entityList.dupliacteLeadList) : entityList.dupliacteLeadList == null) && ((list = this.tags) != null ? list.equals(entityList.tags) : entityList.tags == null) && ((str19 = this.chatMessagePlatform) != null ? str19.equals(entityList.chatMessagePlatform) : entityList.chatMessagePlatform == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(entityList.allowMultiple) : entityList.allowMultiple == null) && ((str20 = this.createdAt) != null ? str20.equals(entityList.createdAt) : entityList.createdAt == null)) {
                String str21 = this.updatedAt;
                String str22 = entityList.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.EntityList.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = EntityList.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], EntityList.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], EntityList.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], EntityList.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], EntityList.this.entityTypeInList);
                    responseWriter.writeString(responseFieldArr[4], EntityList.this.entityListType.name());
                    responseWriter.writeString(responseFieldArr[5], EntityList.this.listName);
                    responseWriter.writeString(responseFieldArr[6], EntityList.this.description);
                    ResponseField responseField = responseFieldArr[7];
                    EntityListStatus entityListStatus = EntityList.this.status;
                    responseWriter.writeString(responseField, entityListStatus != null ? entityListStatus.name() : null);
                    responseWriter.writeInt(responseFieldArr[8], EntityList.this.successfulCount);
                    responseWriter.writeInt(responseFieldArr[9], EntityList.this.duplicateCount);
                    responseWriter.writeInt(responseFieldArr[10], EntityList.this.invalidNumbersCount);
                    responseWriter.writeInt(responseFieldArr[11], EntityList.this.invalidEmailCount);
                    responseWriter.writeInt(responseFieldArr[12], EntityList.this.doNotTrackCount);
                    responseWriter.writeInt(responseFieldArr[13], EntityList.this.otherFailedCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], EntityList.this.ownerId);
                    responseWriter.writeString(responseFieldArr[15], EntityList.this.listCreationType.name());
                    responseWriter.writeString(responseFieldArr[16], EntityList.this.listCategory);
                    responseWriter.writeString(responseFieldArr[17], EntityList.this.rawBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[18], EntityList.this.rawBulkUploadFileHash);
                    responseWriter.writeString(responseFieldArr[19], EntityList.this.modifiedBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[20], EntityList.this.finalBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[21], EntityList.this.leadSourceForBulkUpload);
                    responseWriter.writeString(responseFieldArr[22], EntityList.this.defaultCountryCode);
                    responseWriter.writeString(responseFieldArr[23], EntityList.this.defaultCountryIso);
                    responseWriter.writeString(responseFieldArr[24], EntityList.this.notificationBody);
                    responseWriter.writeString(responseFieldArr[25], EntityList.this.rule);
                    ResponseField responseField2 = responseFieldArr[26];
                    ContactAssignmentStatus contactAssignmentStatus = EntityList.this.toBeAssigned;
                    responseWriter.writeString(responseField2, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[27], EntityList.this.assignedUserId);
                    responseWriter.writeString(responseFieldArr[28], EntityList.this.assignedTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], EntityList.this.associatedDistributionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], EntityList.this.entityActionDefinitionReference);
                    responseWriter.writeBoolean(responseFieldArr[31], EntityList.this.redistributeEntities);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], EntityList.this.redistributionRequestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], EntityList.this.dupliacteLeadList);
                    responseWriter.writeList(responseFieldArr[34], EntityList.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.EntityList.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], EntityList.this.chatMessagePlatform);
                    responseWriter.writeBoolean(responseFieldArr[36], EntityList.this.allowMultiple);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], EntityList.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], EntityList.this.updatedAt);
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
                this.$toString = "EntityList{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", entityTypeInList=" + this.entityTypeInList + ", entityListType=" + this.entityListType + ", listName=" + this.listName + ", description=" + this.description + ", status=" + this.status + ", successfulCount=" + this.successfulCount + ", duplicateCount=" + this.duplicateCount + ", invalidNumbersCount=" + this.invalidNumbersCount + ", invalidEmailCount=" + this.invalidEmailCount + ", doNotTrackCount=" + this.doNotTrackCount + ", otherFailedCount=" + this.otherFailedCount + ", ownerId=" + this.ownerId + ", listCreationType=" + this.listCreationType + ", listCategory=" + this.listCategory + ", rawBulkUploadFileRef=" + this.rawBulkUploadFileRef + ", rawBulkUploadFileHash=" + this.rawBulkUploadFileHash + ", modifiedBulkUploadFileRef=" + this.modifiedBulkUploadFileRef + ", finalBulkUploadFileRef=" + this.finalBulkUploadFileRef + ", leadSourceForBulkUpload=" + this.leadSourceForBulkUpload + ", defaultCountryCode=" + this.defaultCountryCode + ", defaultCountryIso=" + this.defaultCountryIso + ", notificationBody=" + this.notificationBody + ", rule=" + this.rule + ", toBeAssigned=" + this.toBeAssigned + ", assignedUserId=" + this.assignedUserId + ", assignedTeamId=" + this.assignedTeamId + ", associatedDistributionId=" + this.associatedDistributionId + ", entityActionDefinitionReference=" + this.entityActionDefinitionReference + ", redistributeEntities=" + this.redistributeEntities + ", redistributionRequestedAt=" + this.redistributionRequestedAt + ", dupliacteLeadList=" + this.dupliacteLeadList + ", tags=" + this.tags + ", chatMessagePlatform=" + this.chatMessagePlatform + ", allowMultiple=" + this.allowMultiple + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWabaPhoneNumberConditionInput condition;
        private final CreateWabaPhoneNumberInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateWabaPhoneNumberInput createWabaPhoneNumberInput, ModelWabaPhoneNumberConditionInput modelWabaPhoneNumberConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createWabaPhoneNumberInput;
            this.condition = modelWabaPhoneNumberConditionInput;
            linkedHashMap.put("input", createWabaPhoneNumberInput);
            linkedHashMap.put("condition", modelWabaPhoneNumberConditionInput);
        }

        public ModelWabaPhoneNumberConditionInput condition() {
            return this.condition;
        }

        public CreateWabaPhoneNumberInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateWabaPhoneNumberMutation.Variables.1
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

    public CreateWabaPhoneNumberMutation(CreateWabaPhoneNumberInput createWabaPhoneNumberInput, ModelWabaPhoneNumberConditionInput modelWabaPhoneNumberConditionInput) {
        Utils.checkNotNull(createWabaPhoneNumberInput, "input == null");
        this.variables = new Variables(createWabaPhoneNumberInput, modelWabaPhoneNumberConditionInput);
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
        return "a4d7d62f3de220293a3332a80e6f2f8305db979f8cd15aedd222a0bc182d934d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateWabaPhoneNumber($input: CreateWabaPhoneNumberInput!, $condition: ModelWabaPhoneNumberConditionInput) {\n  createWabaPhoneNumber(input: $input, condition: $condition) {\n    __typename\n    id\n    wabaAccountId\n    accountId\n    phoneNumberId\n    phoneNumber\n    isDefault\n    accessToken\n    name\n    internalName\n    quota\n    currentLimitCategory\n    status\n    qualityRating\n    entityListId\n    createdAt\n    updatedAt\n    welcomeMessage\n    requestedDisplayName\n    displayNameUpdate\n    displayNameUpdateDateTime\n    wabaNumberDecision\n    wabaNumberDecisionTime\n    rejectionReason\n    phoneNumberQualityUpdate\n    phoneNumberQualityUpdateTime\n    createdById\n    updatedById\n    entityList {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
