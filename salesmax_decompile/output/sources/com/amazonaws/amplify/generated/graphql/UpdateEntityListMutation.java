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
import type.ContactAssignmentStatus;
import type.CustomType;
import type.DistributedEntityType;
import type.DistributionCreationType;
import type.EntityListStatus;
import type.EntityListType;
import type.IfOwnerExists;
import type.ListCreationType;
import type.ModelEntityListConditionInput;
import type.UpdateEntityListInput;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class UpdateEntityListMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateEntityList($input: UpdateEntityListInput!, $condition: ModelEntityListConditionInput) {\n  updateEntityList(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    entityTypeInList\n    entityListType\n    listName\n    description\n    status\n    successfulCount\n    duplicateCount\n    invalidNumbersCount\n    invalidEmailCount\n    doNotTrackCount\n    otherFailedCount\n    ownerId\n    listCreationType\n    listCategory\n    rawBulkUploadFileRef\n    rawBulkUploadFileHash\n    modifiedBulkUploadFileRef\n    finalBulkUploadFileRef\n    leadSourceForBulkUpload\n    defaultCountryCode\n    defaultCountryIso\n    notificationBody\n    rule\n    toBeAssigned\n    assignedUserId\n    assignedTeamId\n    associatedDistributionId\n    entityActionDefinitionReference\n    redistributeEntities\n    redistributionRequestedAt\n    dupliacteLeadList\n    tags\n    chatMessagePlatform\n    allowMultiple\n    createdAt\n    updatedAt\n    associatedDistribution {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    entityActionDefinition {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateEntityList";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateEntityList($input: UpdateEntityListInput!, $condition: ModelEntityListConditionInput) {\n  updateEntityList(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    entityTypeInList\n    entityListType\n    listName\n    description\n    status\n    successfulCount\n    duplicateCount\n    invalidNumbersCount\n    invalidEmailCount\n    doNotTrackCount\n    otherFailedCount\n    ownerId\n    listCreationType\n    listCategory\n    rawBulkUploadFileRef\n    rawBulkUploadFileHash\n    modifiedBulkUploadFileRef\n    finalBulkUploadFileRef\n    leadSourceForBulkUpload\n    defaultCountryCode\n    defaultCountryIso\n    notificationBody\n    rule\n    toBeAssigned\n    assignedUserId\n    assignedTeamId\n    associatedDistributionId\n    entityActionDefinitionReference\n    redistributeEntities\n    redistributionRequestedAt\n    dupliacteLeadList\n    tags\n    chatMessagePlatform\n    allowMultiple\n    createdAt\n    updatedAt\n    associatedDistribution {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    entityActionDefinition {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static class AssociatedDistribution {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean assignLeadOwnerToTask;
        final String createdAt;
        final String description;
        final List<DistributedEntityType> distributedEntityType;
        final DistributionCreationType distributionCreationType;
        final String id;
        final IfOwnerExists ifOwnerExists;
        final String name;
        final String ownerId;
        final Boolean remeberAssigneeInDistributionScope;
        final Boolean remeberAssigneeInGlobalScope;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<AssociatedDistribution> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AssociatedDistribution map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AssociatedDistribution.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<DistributedEntityType>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.AssociatedDistribution.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public DistributedEntityType read(ResponseReader.ListItemReader listItemReader) {
                        return DistributedEntityType.valueOf(listItemReader.readString());
                    }
                });
                String string4 = responseReader.readString(responseFieldArr[6]);
                IfOwnerExists ifOwnerExistsValueOf = string4 != null ? IfOwnerExists.valueOf(string4) : null;
                Boolean bool = responseReader.readBoolean(responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[9]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new AssociatedDistribution(string, str, str2, string2, string3, list, ifOwnerExistsValueOf, bool, bool2, bool3, str3, string5 != null ? DistributionCreationType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forList("distributedEntityType", "distributedEntityType", null, false, Collections.emptyList()), ResponseField.forString("ifOwnerExists", "ifOwnerExists", null, true, Collections.emptyList()), ResponseField.forBoolean("assignLeadOwnerToTask", "assignLeadOwnerToTask", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInDistributionScope", "remeberAssigneeInDistributionScope", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInGlobalScope", "remeberAssigneeInGlobalScope", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("distributionCreationType", "distributionCreationType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public AssociatedDistribution(String str, String str2, String str3, String str4, String str5, List<DistributedEntityType> list, IfOwnerExists ifOwnerExists, Boolean bool, Boolean bool2, Boolean bool3, String str6, DistributionCreationType distributionCreationType, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.distributedEntityType = (List) Utils.checkNotNull(list, "distributedEntityType == null");
            this.ifOwnerExists = ifOwnerExists;
            this.assignLeadOwnerToTask = bool;
            this.remeberAssigneeInDistributionScope = bool2;
            this.remeberAssigneeInGlobalScope = bool3;
            this.ownerId = (String) Utils.checkNotNull(str6, "ownerId == null");
            this.distributionCreationType = distributionCreationType;
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean assignLeadOwnerToTask() {
            return this.assignLeadOwnerToTask;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public List<DistributedEntityType> distributedEntityType() {
            return this.distributedEntityType;
        }

        public DistributionCreationType distributionCreationType() {
            return this.distributionCreationType;
        }

        public boolean equals(Object obj) {
            IfOwnerExists ifOwnerExists;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            DistributionCreationType distributionCreationType;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssociatedDistribution)) {
                return false;
            }
            AssociatedDistribution associatedDistribution = (AssociatedDistribution) obj;
            if (this.__typename.equals(associatedDistribution.__typename) && this.id.equals(associatedDistribution.id) && this.accountId.equals(associatedDistribution.accountId) && this.name.equals(associatedDistribution.name) && this.description.equals(associatedDistribution.description) && this.distributedEntityType.equals(associatedDistribution.distributedEntityType) && ((ifOwnerExists = this.ifOwnerExists) != null ? ifOwnerExists.equals(associatedDistribution.ifOwnerExists) : associatedDistribution.ifOwnerExists == null) && ((bool = this.assignLeadOwnerToTask) != null ? bool.equals(associatedDistribution.assignLeadOwnerToTask) : associatedDistribution.assignLeadOwnerToTask == null) && ((bool2 = this.remeberAssigneeInDistributionScope) != null ? bool2.equals(associatedDistribution.remeberAssigneeInDistributionScope) : associatedDistribution.remeberAssigneeInDistributionScope == null) && ((bool3 = this.remeberAssigneeInGlobalScope) != null ? bool3.equals(associatedDistribution.remeberAssigneeInGlobalScope) : associatedDistribution.remeberAssigneeInGlobalScope == null) && this.ownerId.equals(associatedDistribution.ownerId) && ((distributionCreationType = this.distributionCreationType) != null ? distributionCreationType.equals(associatedDistribution.distributionCreationType) : associatedDistribution.distributionCreationType == null) && ((str = this.createdAt) != null ? str.equals(associatedDistribution.createdAt) : associatedDistribution.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = associatedDistribution.updatedAt;
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
                int iHashCode = (((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.distributedEntityType.hashCode()) * 1000003;
                IfOwnerExists ifOwnerExists = this.ifOwnerExists;
                int iHashCode2 = (iHashCode ^ (ifOwnerExists == null ? 0 : ifOwnerExists.hashCode())) * 1000003;
                Boolean bool = this.assignLeadOwnerToTask;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.remeberAssigneeInDistributionScope;
                int iHashCode4 = (iHashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.remeberAssigneeInGlobalScope;
                int iHashCode5 = (((iHashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                DistributionCreationType distributionCreationType = this.distributionCreationType;
                int iHashCode6 = (iHashCode5 ^ (distributionCreationType == null ? 0 : distributionCreationType.hashCode())) * 1000003;
                String str = this.createdAt;
                int iHashCode7 = (iHashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode7 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public IfOwnerExists ifOwnerExists() {
            return this.ifOwnerExists;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.AssociatedDistribution.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AssociatedDistribution.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AssociatedDistribution.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AssociatedDistribution.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], AssociatedDistribution.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], AssociatedDistribution.this.name);
                    responseWriter.writeString(responseFieldArr[4], AssociatedDistribution.this.description);
                    responseWriter.writeList(responseFieldArr[5], AssociatedDistribution.this.distributedEntityType, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.AssociatedDistribution.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((DistributedEntityType) obj).name());
                        }
                    });
                    ResponseField responseField = responseFieldArr[6];
                    IfOwnerExists ifOwnerExists = AssociatedDistribution.this.ifOwnerExists;
                    responseWriter.writeString(responseField, ifOwnerExists != null ? ifOwnerExists.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[7], AssociatedDistribution.this.assignLeadOwnerToTask);
                    responseWriter.writeBoolean(responseFieldArr[8], AssociatedDistribution.this.remeberAssigneeInDistributionScope);
                    responseWriter.writeBoolean(responseFieldArr[9], AssociatedDistribution.this.remeberAssigneeInGlobalScope);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], AssociatedDistribution.this.ownerId);
                    ResponseField responseField2 = responseFieldArr[11];
                    DistributionCreationType distributionCreationType = AssociatedDistribution.this.distributionCreationType;
                    responseWriter.writeString(responseField2, distributionCreationType != null ? distributionCreationType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], AssociatedDistribution.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], AssociatedDistribution.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Boolean remeberAssigneeInDistributionScope() {
            return this.remeberAssigneeInDistributionScope;
        }

        public Boolean remeberAssigneeInGlobalScope() {
            return this.remeberAssigneeInGlobalScope;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AssociatedDistribution{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", distributedEntityType=" + this.distributedEntityType + ", ifOwnerExists=" + this.ifOwnerExists + ", assignLeadOwnerToTask=" + this.assignLeadOwnerToTask + ", remeberAssigneeInDistributionScope=" + this.remeberAssigneeInDistributionScope + ", remeberAssigneeInGlobalScope=" + this.remeberAssigneeInGlobalScope + ", ownerId=" + this.ownerId + ", distributionCreationType=" + this.distributionCreationType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Builder {
        private ModelEntityListConditionInput condition;
        private UpdateEntityListInput input;

        public UpdateEntityListMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateEntityListMutation(this.input, this.condition);
        }

        public Builder condition(ModelEntityListConditionInput modelEntityListConditionInput) {
            this.condition = modelEntityListConditionInput;
            return this;
        }

        public Builder input(UpdateEntityListInput updateEntityListInput) {
            this.input = updateEntityListInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateEntityList", "updateEntityList", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateEntityList updateEntityList;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateEntityList.Mapper updateEntityListFieldMapper = new UpdateEntityList.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateEntityList) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateEntityList>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateEntityList read(ResponseReader responseReader2) {
                        return Mapper.this.updateEntityListFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateEntityList updateEntityList) {
            this.updateEntityList = updateEntityList;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateEntityList updateEntityList = this.updateEntityList;
            UpdateEntityList updateEntityList2 = ((Data) obj).updateEntityList;
            return updateEntityList == null ? updateEntityList2 == null : updateEntityList.equals(updateEntityList2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateEntityList updateEntityList = this.updateEntityList;
                this.$hashCode = (updateEntityList == null ? 0 : updateEntityList.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateEntityList updateEntityList = Data.this.updateEntityList;
                    responseWriter.writeObject(responseField, updateEntityList != null ? updateEntityList.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateEntityList=" + this.updateEntityList + "}";
            }
            return this.$toString;
        }

        public UpdateEntityList updateEntityList() {
            return this.updateEntityList;
        }
    }

    public static class EntityActionDefinition {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String action;
        final String createdAt;
        final String createdBy;
        final String description;
        final String endDateTime;
        final String id;
        final String name;
        final String ownerId;
        final Integer periodicFrequency;
        final String periodicFrequencyUnit;
        final String startDateTime;
        final String status;
        final String subscriptionType;
        final String target;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<EntityActionDefinition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public EntityActionDefinition map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = EntityActionDefinition.$responseFields;
                return new EntityActionDefinition(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("action", "action", null, true, Collections.emptyList()), ResponseField.forString("target", "target", null, true, Collections.emptyList()), ResponseField.forString("subscriptionType", "subscriptionType", null, true, Collections.emptyList()), ResponseField.forInt("periodicFrequency", "periodicFrequency", null, true, Collections.emptyList()), ResponseField.forString("periodicFrequencyUnit", "periodicFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateTime", "startDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateTime", "endDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList())};
        }

        public EntityActionDefinition(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.action = str6;
            this.target = str7;
            this.subscriptionType = str8;
            this.periodicFrequency = num;
            this.periodicFrequencyUnit = str9;
            this.startDateTime = str10;
            this.endDateTime = str11;
            this.status = str12;
            this.ownerId = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
            this.createdBy = str16;
            this.updatedBy = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String action() {
            return this.action;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public String description() {
            return this.description;
        }

        public String endDateTime() {
            return this.endDateTime;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityActionDefinition)) {
                return false;
            }
            EntityActionDefinition entityActionDefinition = (EntityActionDefinition) obj;
            if (this.__typename.equals(entityActionDefinition.__typename) && this.id.equals(entityActionDefinition.id) && this.accountId.equals(entityActionDefinition.accountId) && ((str = this.name) != null ? str.equals(entityActionDefinition.name) : entityActionDefinition.name == null) && ((str2 = this.description) != null ? str2.equals(entityActionDefinition.description) : entityActionDefinition.description == null) && ((str3 = this.action) != null ? str3.equals(entityActionDefinition.action) : entityActionDefinition.action == null) && ((str4 = this.target) != null ? str4.equals(entityActionDefinition.target) : entityActionDefinition.target == null) && ((str5 = this.subscriptionType) != null ? str5.equals(entityActionDefinition.subscriptionType) : entityActionDefinition.subscriptionType == null) && ((num = this.periodicFrequency) != null ? num.equals(entityActionDefinition.periodicFrequency) : entityActionDefinition.periodicFrequency == null) && ((str6 = this.periodicFrequencyUnit) != null ? str6.equals(entityActionDefinition.periodicFrequencyUnit) : entityActionDefinition.periodicFrequencyUnit == null) && ((str7 = this.startDateTime) != null ? str7.equals(entityActionDefinition.startDateTime) : entityActionDefinition.startDateTime == null) && ((str8 = this.endDateTime) != null ? str8.equals(entityActionDefinition.endDateTime) : entityActionDefinition.endDateTime == null) && ((str9 = this.status) != null ? str9.equals(entityActionDefinition.status) : entityActionDefinition.status == null) && ((str10 = this.ownerId) != null ? str10.equals(entityActionDefinition.ownerId) : entityActionDefinition.ownerId == null) && ((str11 = this.createdAt) != null ? str11.equals(entityActionDefinition.createdAt) : entityActionDefinition.createdAt == null) && ((str12 = this.updatedAt) != null ? str12.equals(entityActionDefinition.updatedAt) : entityActionDefinition.updatedAt == null) && ((str13 = this.createdBy) != null ? str13.equals(entityActionDefinition.createdBy) : entityActionDefinition.createdBy == null)) {
                String str14 = this.updatedBy;
                String str15 = entityActionDefinition.updatedBy;
                if (str14 == null) {
                    if (str15 == null) {
                        return true;
                    }
                } else if (str14.equals(str15)) {
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
                String str3 = this.action;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.target;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.subscriptionType;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.periodicFrequency;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str6 = this.periodicFrequencyUnit;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.startDateTime;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.endDateTime;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.status;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.ownerId;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.createdAt;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.updatedAt;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.createdBy;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.updatedBy;
                this.$hashCode = iHashCode15 ^ (str14 != null ? str14.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.EntityActionDefinition.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = EntityActionDefinition.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], EntityActionDefinition.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], EntityActionDefinition.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], EntityActionDefinition.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], EntityActionDefinition.this.name);
                    responseWriter.writeString(responseFieldArr[4], EntityActionDefinition.this.description);
                    responseWriter.writeString(responseFieldArr[5], EntityActionDefinition.this.action);
                    responseWriter.writeString(responseFieldArr[6], EntityActionDefinition.this.target);
                    responseWriter.writeString(responseFieldArr[7], EntityActionDefinition.this.subscriptionType);
                    responseWriter.writeInt(responseFieldArr[8], EntityActionDefinition.this.periodicFrequency);
                    responseWriter.writeString(responseFieldArr[9], EntityActionDefinition.this.periodicFrequencyUnit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], EntityActionDefinition.this.startDateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], EntityActionDefinition.this.endDateTime);
                    responseWriter.writeString(responseFieldArr[12], EntityActionDefinition.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], EntityActionDefinition.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], EntityActionDefinition.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], EntityActionDefinition.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], EntityActionDefinition.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], EntityActionDefinition.this.updatedBy);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Integer periodicFrequency() {
            return this.periodicFrequency;
        }

        public String periodicFrequencyUnit() {
            return this.periodicFrequencyUnit;
        }

        public String startDateTime() {
            return this.startDateTime;
        }

        public String status() {
            return this.status;
        }

        public String subscriptionType() {
            return this.subscriptionType;
        }

        public String target() {
            return this.target;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "EntityActionDefinition{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", action=" + this.action + ", target=" + this.target + ", subscriptionType=" + this.subscriptionType + ", periodicFrequency=" + this.periodicFrequency + ", periodicFrequencyUnit=" + this.periodicFrequencyUnit + ", startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ", status=" + this.status + ", ownerId=" + this.ownerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.Owner.1
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

    public static class UpdateEntityList {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Boolean allowMultiple;
        final String assignedTeamId;
        final String assignedUserId;
        final AssociatedDistribution associatedDistribution;
        final String associatedDistributionId;
        final String chatMessagePlatform;
        final String createdAt;
        final String defaultCountryCode;
        final String defaultCountryIso;
        final String description;
        final Integer doNotTrackCount;
        final String dupliacteLeadList;
        final Integer duplicateCount;
        final EntityActionDefinition entityActionDefinition;
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
        final Owner owner;
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

        public static final class Mapper implements ResponseFieldMapper<UpdateEntityList> {
            final AssociatedDistribution.Mapper associatedDistributionFieldMapper = new AssociatedDistribution.Mapper();
            final EntityActionDefinition.Mapper entityActionDefinitionFieldMapper = new EntityActionDefinition.Mapper();
            final Owner.Mapper ownerFieldMapper = new Owner.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateEntityList map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateEntityList.$responseFields;
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
                return new UpdateEntityList(string, str, str2, string2, entityListTypeValueOf, string4, string5, entityListStatusValueOf, num, num2, num3, num4, num5, num6, str3, listCreationTypeValueOf, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18 != null ? ContactAssignmentStatus.valueOf(string18) : null, responseReader.readString(responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.UpdateEntityList.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[35]), responseReader.readBoolean(responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), (AssociatedDistribution) responseReader.readObject(responseFieldArr[39], new ResponseReader.ObjectReader<AssociatedDistribution>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.UpdateEntityList.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AssociatedDistribution read(ResponseReader responseReader2) {
                        return Mapper.this.associatedDistributionFieldMapper.map(responseReader2);
                    }
                }), (EntityActionDefinition) responseReader.readObject(responseFieldArr[40], new ResponseReader.ObjectReader<EntityActionDefinition>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.UpdateEntityList.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public EntityActionDefinition read(ResponseReader responseReader2) {
                        return Mapper.this.entityActionDefinitionFieldMapper.map(responseReader2);
                    }
                }), (Owner) responseReader.readObject(responseFieldArr[41], new ResponseReader.ObjectReader<Owner>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.UpdateEntityList.Mapper.4
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
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("entityTypeInList", "entityTypeInList", null, false, Collections.emptyList()), ResponseField.forString("entityListType", "entityListType", null, false, Collections.emptyList()), ResponseField.forString("listName", "listName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forInt("successfulCount", "successfulCount", null, true, Collections.emptyList()), ResponseField.forInt("duplicateCount", "duplicateCount", null, true, Collections.emptyList()), ResponseField.forInt("invalidNumbersCount", "invalidNumbersCount", null, true, Collections.emptyList()), ResponseField.forInt("invalidEmailCount", "invalidEmailCount", null, true, Collections.emptyList()), ResponseField.forInt("doNotTrackCount", "doNotTrackCount", null, true, Collections.emptyList()), ResponseField.forInt("otherFailedCount", "otherFailedCount", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("listCreationType", "listCreationType", null, false, Collections.emptyList()), ResponseField.forString("listCategory", "listCategory", null, true, Collections.emptyList()), ResponseField.forString("rawBulkUploadFileRef", "rawBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("rawBulkUploadFileHash", "rawBulkUploadFileHash", null, true, Collections.emptyList()), ResponseField.forString("modifiedBulkUploadFileRef", "modifiedBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("finalBulkUploadFileRef", "finalBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("leadSourceForBulkUpload", "leadSourceForBulkUpload", null, true, Collections.emptyList()), ResponseField.forString("defaultCountryCode", "defaultCountryCode", null, true, Collections.emptyList()), ResponseField.forString("defaultCountryIso", "defaultCountryIso", null, true, Collections.emptyList()), ResponseField.forString("notificationBody", "notificationBody", null, true, Collections.emptyList()), ResponseField.forString("rule", "rule", null, true, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forString("assignedUserId", "assignedUserId", null, true, Collections.emptyList()), ResponseField.forString("assignedTeamId", "assignedTeamId", null, true, Collections.emptyList()), ResponseField.forCustomType("associatedDistributionId", "associatedDistributionId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("entityActionDefinitionReference", "entityActionDefinitionReference", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("redistributeEntities", "redistributeEntities", null, true, Collections.emptyList()), ResponseField.forCustomType("redistributionRequestedAt", "redistributionRequestedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("dupliacteLeadList", "dupliacteLeadList", null, true, customType, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("chatMessagePlatform", "chatMessagePlatform", null, true, Collections.emptyList()), ResponseField.forBoolean("allowMultiple", "allowMultiple", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("associatedDistribution", "associatedDistribution", null, true, Collections.emptyList()), ResponseField.forObject("entityActionDefinition", "entityActionDefinition", null, true, Collections.emptyList()), ResponseField.forObject("owner", "owner", null, true, Collections.emptyList())};
        }

        public UpdateEntityList(String str, String str2, String str3, String str4, EntityListType entityListType, String str5, String str6, EntityListStatus entityListStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str7, ListCreationType listCreationType, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ContactAssignmentStatus contactAssignmentStatus, String str18, String str19, String str20, String str21, Boolean bool, String str22, String str23, List<String> list, String str24, Boolean bool2, String str25, String str26, AssociatedDistribution associatedDistribution, EntityActionDefinition entityActionDefinition, Owner owner) {
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
            this.associatedDistribution = associatedDistribution;
            this.entityActionDefinition = entityActionDefinition;
            this.owner = owner;
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

        public AssociatedDistribution associatedDistribution() {
            return this.associatedDistribution;
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

        public EntityActionDefinition entityActionDefinition() {
            return this.entityActionDefinition;
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
            String str21;
            AssociatedDistribution associatedDistribution;
            EntityActionDefinition entityActionDefinition;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateEntityList)) {
                return false;
            }
            UpdateEntityList updateEntityList = (UpdateEntityList) obj;
            if (this.__typename.equals(updateEntityList.__typename) && this.id.equals(updateEntityList.id) && this.accountId.equals(updateEntityList.accountId) && this.entityTypeInList.equals(updateEntityList.entityTypeInList) && this.entityListType.equals(updateEntityList.entityListType) && ((str = this.listName) != null ? str.equals(updateEntityList.listName) : updateEntityList.listName == null) && ((str2 = this.description) != null ? str2.equals(updateEntityList.description) : updateEntityList.description == null) && ((entityListStatus = this.status) != null ? entityListStatus.equals(updateEntityList.status) : updateEntityList.status == null) && ((num = this.successfulCount) != null ? num.equals(updateEntityList.successfulCount) : updateEntityList.successfulCount == null) && ((num2 = this.duplicateCount) != null ? num2.equals(updateEntityList.duplicateCount) : updateEntityList.duplicateCount == null) && ((num3 = this.invalidNumbersCount) != null ? num3.equals(updateEntityList.invalidNumbersCount) : updateEntityList.invalidNumbersCount == null) && ((num4 = this.invalidEmailCount) != null ? num4.equals(updateEntityList.invalidEmailCount) : updateEntityList.invalidEmailCount == null) && ((num5 = this.doNotTrackCount) != null ? num5.equals(updateEntityList.doNotTrackCount) : updateEntityList.doNotTrackCount == null) && ((num6 = this.otherFailedCount) != null ? num6.equals(updateEntityList.otherFailedCount) : updateEntityList.otherFailedCount == null) && this.ownerId.equals(updateEntityList.ownerId) && this.listCreationType.equals(updateEntityList.listCreationType) && ((str3 = this.listCategory) != null ? str3.equals(updateEntityList.listCategory) : updateEntityList.listCategory == null) && ((str4 = this.rawBulkUploadFileRef) != null ? str4.equals(updateEntityList.rawBulkUploadFileRef) : updateEntityList.rawBulkUploadFileRef == null) && ((str5 = this.rawBulkUploadFileHash) != null ? str5.equals(updateEntityList.rawBulkUploadFileHash) : updateEntityList.rawBulkUploadFileHash == null) && ((str6 = this.modifiedBulkUploadFileRef) != null ? str6.equals(updateEntityList.modifiedBulkUploadFileRef) : updateEntityList.modifiedBulkUploadFileRef == null) && ((str7 = this.finalBulkUploadFileRef) != null ? str7.equals(updateEntityList.finalBulkUploadFileRef) : updateEntityList.finalBulkUploadFileRef == null) && ((str8 = this.leadSourceForBulkUpload) != null ? str8.equals(updateEntityList.leadSourceForBulkUpload) : updateEntityList.leadSourceForBulkUpload == null) && ((str9 = this.defaultCountryCode) != null ? str9.equals(updateEntityList.defaultCountryCode) : updateEntityList.defaultCountryCode == null) && ((str10 = this.defaultCountryIso) != null ? str10.equals(updateEntityList.defaultCountryIso) : updateEntityList.defaultCountryIso == null) && ((str11 = this.notificationBody) != null ? str11.equals(updateEntityList.notificationBody) : updateEntityList.notificationBody == null) && ((str12 = this.rule) != null ? str12.equals(updateEntityList.rule) : updateEntityList.rule == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(updateEntityList.toBeAssigned) : updateEntityList.toBeAssigned == null) && ((str13 = this.assignedUserId) != null ? str13.equals(updateEntityList.assignedUserId) : updateEntityList.assignedUserId == null) && ((str14 = this.assignedTeamId) != null ? str14.equals(updateEntityList.assignedTeamId) : updateEntityList.assignedTeamId == null) && ((str15 = this.associatedDistributionId) != null ? str15.equals(updateEntityList.associatedDistributionId) : updateEntityList.associatedDistributionId == null) && ((str16 = this.entityActionDefinitionReference) != null ? str16.equals(updateEntityList.entityActionDefinitionReference) : updateEntityList.entityActionDefinitionReference == null) && ((bool = this.redistributeEntities) != null ? bool.equals(updateEntityList.redistributeEntities) : updateEntityList.redistributeEntities == null) && ((str17 = this.redistributionRequestedAt) != null ? str17.equals(updateEntityList.redistributionRequestedAt) : updateEntityList.redistributionRequestedAt == null) && ((str18 = this.dupliacteLeadList) != null ? str18.equals(updateEntityList.dupliacteLeadList) : updateEntityList.dupliacteLeadList == null) && ((list = this.tags) != null ? list.equals(updateEntityList.tags) : updateEntityList.tags == null) && ((str19 = this.chatMessagePlatform) != null ? str19.equals(updateEntityList.chatMessagePlatform) : updateEntityList.chatMessagePlatform == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(updateEntityList.allowMultiple) : updateEntityList.allowMultiple == null) && ((str20 = this.createdAt) != null ? str20.equals(updateEntityList.createdAt) : updateEntityList.createdAt == null) && ((str21 = this.updatedAt) != null ? str21.equals(updateEntityList.updatedAt) : updateEntityList.updatedAt == null) && ((associatedDistribution = this.associatedDistribution) != null ? associatedDistribution.equals(updateEntityList.associatedDistribution) : updateEntityList.associatedDistribution == null) && ((entityActionDefinition = this.entityActionDefinition) != null ? entityActionDefinition.equals(updateEntityList.entityActionDefinition) : updateEntityList.entityActionDefinition == null)) {
                Owner owner = this.owner;
                Owner owner2 = updateEntityList.owner;
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
                int iHashCode33 = (iHashCode32 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                AssociatedDistribution associatedDistribution = this.associatedDistribution;
                int iHashCode34 = (iHashCode33 ^ (associatedDistribution == null ? 0 : associatedDistribution.hashCode())) * 1000003;
                EntityActionDefinition entityActionDefinition = this.entityActionDefinition;
                int iHashCode35 = (iHashCode34 ^ (entityActionDefinition == null ? 0 : entityActionDefinition.hashCode())) * 1000003;
                Owner owner = this.owner;
                this.$hashCode = iHashCode35 ^ (owner != null ? owner.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.UpdateEntityList.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateEntityList.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateEntityList.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateEntityList.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateEntityList.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UpdateEntityList.this.entityTypeInList);
                    responseWriter.writeString(responseFieldArr[4], UpdateEntityList.this.entityListType.name());
                    responseWriter.writeString(responseFieldArr[5], UpdateEntityList.this.listName);
                    responseWriter.writeString(responseFieldArr[6], UpdateEntityList.this.description);
                    ResponseField responseField = responseFieldArr[7];
                    EntityListStatus entityListStatus = UpdateEntityList.this.status;
                    responseWriter.writeString(responseField, entityListStatus != null ? entityListStatus.name() : null);
                    responseWriter.writeInt(responseFieldArr[8], UpdateEntityList.this.successfulCount);
                    responseWriter.writeInt(responseFieldArr[9], UpdateEntityList.this.duplicateCount);
                    responseWriter.writeInt(responseFieldArr[10], UpdateEntityList.this.invalidNumbersCount);
                    responseWriter.writeInt(responseFieldArr[11], UpdateEntityList.this.invalidEmailCount);
                    responseWriter.writeInt(responseFieldArr[12], UpdateEntityList.this.doNotTrackCount);
                    responseWriter.writeInt(responseFieldArr[13], UpdateEntityList.this.otherFailedCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateEntityList.this.ownerId);
                    responseWriter.writeString(responseFieldArr[15], UpdateEntityList.this.listCreationType.name());
                    responseWriter.writeString(responseFieldArr[16], UpdateEntityList.this.listCategory);
                    responseWriter.writeString(responseFieldArr[17], UpdateEntityList.this.rawBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[18], UpdateEntityList.this.rawBulkUploadFileHash);
                    responseWriter.writeString(responseFieldArr[19], UpdateEntityList.this.modifiedBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[20], UpdateEntityList.this.finalBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[21], UpdateEntityList.this.leadSourceForBulkUpload);
                    responseWriter.writeString(responseFieldArr[22], UpdateEntityList.this.defaultCountryCode);
                    responseWriter.writeString(responseFieldArr[23], UpdateEntityList.this.defaultCountryIso);
                    responseWriter.writeString(responseFieldArr[24], UpdateEntityList.this.notificationBody);
                    responseWriter.writeString(responseFieldArr[25], UpdateEntityList.this.rule);
                    ResponseField responseField2 = responseFieldArr[26];
                    ContactAssignmentStatus contactAssignmentStatus = UpdateEntityList.this.toBeAssigned;
                    responseWriter.writeString(responseField2, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[27], UpdateEntityList.this.assignedUserId);
                    responseWriter.writeString(responseFieldArr[28], UpdateEntityList.this.assignedTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], UpdateEntityList.this.associatedDistributionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], UpdateEntityList.this.entityActionDefinitionReference);
                    responseWriter.writeBoolean(responseFieldArr[31], UpdateEntityList.this.redistributeEntities);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], UpdateEntityList.this.redistributionRequestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], UpdateEntityList.this.dupliacteLeadList);
                    responseWriter.writeList(responseFieldArr[34], UpdateEntityList.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.UpdateEntityList.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], UpdateEntityList.this.chatMessagePlatform);
                    responseWriter.writeBoolean(responseFieldArr[36], UpdateEntityList.this.allowMultiple);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], UpdateEntityList.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], UpdateEntityList.this.updatedAt);
                    ResponseField responseField3 = responseFieldArr[39];
                    AssociatedDistribution associatedDistribution = UpdateEntityList.this.associatedDistribution;
                    responseWriter.writeObject(responseField3, associatedDistribution != null ? associatedDistribution.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[40];
                    EntityActionDefinition entityActionDefinition = UpdateEntityList.this.entityActionDefinition;
                    responseWriter.writeObject(responseField4, entityActionDefinition != null ? entityActionDefinition.marshaller() : null);
                    ResponseField responseField5 = responseFieldArr[41];
                    Owner owner = UpdateEntityList.this.owner;
                    responseWriter.writeObject(responseField5, owner != null ? owner.marshaller() : null);
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

        public Owner owner() {
            return this.owner;
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
                this.$toString = "UpdateEntityList{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", entityTypeInList=" + this.entityTypeInList + ", entityListType=" + this.entityListType + ", listName=" + this.listName + ", description=" + this.description + ", status=" + this.status + ", successfulCount=" + this.successfulCount + ", duplicateCount=" + this.duplicateCount + ", invalidNumbersCount=" + this.invalidNumbersCount + ", invalidEmailCount=" + this.invalidEmailCount + ", doNotTrackCount=" + this.doNotTrackCount + ", otherFailedCount=" + this.otherFailedCount + ", ownerId=" + this.ownerId + ", listCreationType=" + this.listCreationType + ", listCategory=" + this.listCategory + ", rawBulkUploadFileRef=" + this.rawBulkUploadFileRef + ", rawBulkUploadFileHash=" + this.rawBulkUploadFileHash + ", modifiedBulkUploadFileRef=" + this.modifiedBulkUploadFileRef + ", finalBulkUploadFileRef=" + this.finalBulkUploadFileRef + ", leadSourceForBulkUpload=" + this.leadSourceForBulkUpload + ", defaultCountryCode=" + this.defaultCountryCode + ", defaultCountryIso=" + this.defaultCountryIso + ", notificationBody=" + this.notificationBody + ", rule=" + this.rule + ", toBeAssigned=" + this.toBeAssigned + ", assignedUserId=" + this.assignedUserId + ", assignedTeamId=" + this.assignedTeamId + ", associatedDistributionId=" + this.associatedDistributionId + ", entityActionDefinitionReference=" + this.entityActionDefinitionReference + ", redistributeEntities=" + this.redistributeEntities + ", redistributionRequestedAt=" + this.redistributionRequestedAt + ", dupliacteLeadList=" + this.dupliacteLeadList + ", tags=" + this.tags + ", chatMessagePlatform=" + this.chatMessagePlatform + ", allowMultiple=" + this.allowMultiple + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", associatedDistribution=" + this.associatedDistribution + ", entityActionDefinition=" + this.entityActionDefinition + ", owner=" + this.owner + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelEntityListConditionInput condition;
        private final UpdateEntityListInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateEntityListInput updateEntityListInput, ModelEntityListConditionInput modelEntityListConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateEntityListInput;
            this.condition = modelEntityListConditionInput;
            linkedHashMap.put("input", updateEntityListInput);
            linkedHashMap.put("condition", modelEntityListConditionInput);
        }

        public ModelEntityListConditionInput condition() {
            return this.condition;
        }

        public UpdateEntityListInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateEntityListMutation.Variables.1
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

    public UpdateEntityListMutation(UpdateEntityListInput updateEntityListInput, ModelEntityListConditionInput modelEntityListConditionInput) {
        Utils.checkNotNull(updateEntityListInput, "input == null");
        this.variables = new Variables(updateEntityListInput, modelEntityListConditionInput);
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
        return "7967fbd125d9330fcba8a7c183f14d353c570d799eae757e044f31dfa59f34fc";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateEntityList($input: UpdateEntityListInput!, $condition: ModelEntityListConditionInput) {\n  updateEntityList(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    entityTypeInList\n    entityListType\n    listName\n    description\n    status\n    successfulCount\n    duplicateCount\n    invalidNumbersCount\n    invalidEmailCount\n    doNotTrackCount\n    otherFailedCount\n    ownerId\n    listCreationType\n    listCategory\n    rawBulkUploadFileRef\n    rawBulkUploadFileHash\n    modifiedBulkUploadFileRef\n    finalBulkUploadFileRef\n    leadSourceForBulkUpload\n    defaultCountryCode\n    defaultCountryIso\n    notificationBody\n    rule\n    toBeAssigned\n    assignedUserId\n    assignedTeamId\n    associatedDistributionId\n    entityActionDefinitionReference\n    redistributeEntities\n    redistributionRequestedAt\n    dupliacteLeadList\n    tags\n    chatMessagePlatform\n    allowMultiple\n    createdAt\n    updatedAt\n    associatedDistribution {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    entityActionDefinition {\n      __typename\n      id\n      accountId\n      name\n      description\n      action\n      target\n      subscriptionType\n      periodicFrequency\n      periodicFrequencyUnit\n      startDateTime\n      endDateTime\n      status\n      ownerId\n      createdAt\n      updatedAt\n      createdBy\n      updatedBy\n    }\n    owner {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
