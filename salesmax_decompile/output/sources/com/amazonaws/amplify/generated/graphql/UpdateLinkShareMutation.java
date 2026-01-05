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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.ModelLinkShareConditionInput;
import type.UpdateLinkShareInput;

/* loaded from: classes4.dex */
public final class UpdateLinkShareMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateLinkShare($input: UpdateLinkShareInput!, $condition: ModelLinkShareConditionInput) {\n  updateLinkShare(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateLinkShareMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateLinkShare";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateLinkShare($input: UpdateLinkShareInput!, $condition: ModelLinkShareConditionInput) {\n  updateLinkShare(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelLinkShareConditionInput condition;
        private UpdateLinkShareInput input;

        public UpdateLinkShareMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateLinkShareMutation(this.input, this.condition);
        }

        public Builder condition(ModelLinkShareConditionInput modelLinkShareConditionInput) {
            this.condition = modelLinkShareConditionInput;
            return this;
        }

        public Builder input(UpdateLinkShareInput updateLinkShareInput) {
            this.input = updateLinkShareInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateLinkShare", "updateLinkShare", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateLinkShare updateLinkShare;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateLinkShare.Mapper updateLinkShareFieldMapper = new UpdateLinkShare.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateLinkShare) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateLinkShare>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateLinkShareMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateLinkShare read(ResponseReader responseReader2) {
                        return Mapper.this.updateLinkShareFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateLinkShare updateLinkShare) {
            this.updateLinkShare = updateLinkShare;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateLinkShare updateLinkShare = this.updateLinkShare;
            UpdateLinkShare updateLinkShare2 = ((Data) obj).updateLinkShare;
            return updateLinkShare == null ? updateLinkShare2 == null : updateLinkShare.equals(updateLinkShare2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateLinkShare updateLinkShare = this.updateLinkShare;
                this.$hashCode = (updateLinkShare == null ? 0 : updateLinkShare.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateLinkShareMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateLinkShare updateLinkShare = Data.this.updateLinkShare;
                    responseWriter.writeObject(responseField, updateLinkShare != null ? updateLinkShare.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateLinkShare=" + this.updateLinkShare + "}";
            }
            return this.$toString;
        }

        public UpdateLinkShare updateLinkShare() {
            return this.updateLinkShare;
        }
    }

    public static class UpdateLinkShare {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String accountLogoUrl;
        final String accountName;
        final String accountWebsite;
        final String contactId;
        final String contactName;
        final String createdAt;
        final String engagementId;
        final String externalLink;
        final String fileKey;
        final String id;
        final String mimeType;
        final String sharedByEmail;
        final String sharedById;
        final String sharedByName;
        final String sharedByNumber;
        final String templateTitle;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<UpdateLinkShare> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateLinkShare map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateLinkShare.$responseFields;
                return new UpdateLinkShare(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("contactName", "contactName", null, true, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileKey", "fileKey", null, true, Collections.emptyList()), ResponseField.forString("mimeType", "mimeType", null, true, Collections.emptyList()), ResponseField.forString("externalLink", "externalLink", null, true, Collections.emptyList()), ResponseField.forCustomType("sharedById", "sharedById", null, false, customType, Collections.emptyList()), ResponseField.forString("sharedByName", "sharedByName", null, true, Collections.emptyList()), ResponseField.forString("sharedByEmail", "sharedByEmail", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("accountName", "accountName", null, true, Collections.emptyList()), ResponseField.forString("accountLogoUrl", "accountLogoUrl", null, true, Collections.emptyList()), ResponseField.forString("accountWebsite", "accountWebsite", null, true, Collections.emptyList()), ResponseField.forString("sharedByNumber", "sharedByNumber", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public UpdateLinkShare(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = (String) Utils.checkNotNull(str4, "contactId == null");
            this.contactName = str5;
            this.engagementId = (String) Utils.checkNotNull(str6, "engagementId == null");
            this.fileKey = str7;
            this.mimeType = str8;
            this.externalLink = str9;
            this.sharedById = (String) Utils.checkNotNull(str10, "sharedById == null");
            this.sharedByName = str11;
            this.sharedByEmail = str12;
            this.templateTitle = str13;
            this.accountName = str14;
            this.accountLogoUrl = str15;
            this.accountWebsite = str16;
            this.sharedByNumber = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String accountLogoUrl() {
            return this.accountLogoUrl;
        }

        public String accountName() {
            return this.accountName;
        }

        public String accountWebsite() {
            return this.accountWebsite;
        }

        public String contactId() {
            return this.contactId;
        }

        public String contactName() {
            return this.contactName;
        }

        public String createdAt() {
            return this.createdAt;
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
            String str9;
            String str10;
            String str11;
            String str12;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateLinkShare)) {
                return false;
            }
            UpdateLinkShare updateLinkShare = (UpdateLinkShare) obj;
            if (this.__typename.equals(updateLinkShare.__typename) && this.id.equals(updateLinkShare.id) && this.accountId.equals(updateLinkShare.accountId) && this.contactId.equals(updateLinkShare.contactId) && ((str = this.contactName) != null ? str.equals(updateLinkShare.contactName) : updateLinkShare.contactName == null) && this.engagementId.equals(updateLinkShare.engagementId) && ((str2 = this.fileKey) != null ? str2.equals(updateLinkShare.fileKey) : updateLinkShare.fileKey == null) && ((str3 = this.mimeType) != null ? str3.equals(updateLinkShare.mimeType) : updateLinkShare.mimeType == null) && ((str4 = this.externalLink) != null ? str4.equals(updateLinkShare.externalLink) : updateLinkShare.externalLink == null) && this.sharedById.equals(updateLinkShare.sharedById) && ((str5 = this.sharedByName) != null ? str5.equals(updateLinkShare.sharedByName) : updateLinkShare.sharedByName == null) && ((str6 = this.sharedByEmail) != null ? str6.equals(updateLinkShare.sharedByEmail) : updateLinkShare.sharedByEmail == null) && ((str7 = this.templateTitle) != null ? str7.equals(updateLinkShare.templateTitle) : updateLinkShare.templateTitle == null) && ((str8 = this.accountName) != null ? str8.equals(updateLinkShare.accountName) : updateLinkShare.accountName == null) && ((str9 = this.accountLogoUrl) != null ? str9.equals(updateLinkShare.accountLogoUrl) : updateLinkShare.accountLogoUrl == null) && ((str10 = this.accountWebsite) != null ? str10.equals(updateLinkShare.accountWebsite) : updateLinkShare.accountWebsite == null) && ((str11 = this.sharedByNumber) != null ? str11.equals(updateLinkShare.sharedByNumber) : updateLinkShare.sharedByNumber == null) && ((str12 = this.createdAt) != null ? str12.equals(updateLinkShare.createdAt) : updateLinkShare.createdAt == null)) {
                String str13 = this.updatedAt;
                String str14 = updateLinkShare.updatedAt;
                if (str13 == null) {
                    if (str14 == null) {
                        return true;
                    }
                } else if (str13.equals(str14)) {
                    return true;
                }
            }
            return false;
        }

        public String externalLink() {
            return this.externalLink;
        }

        public String fileKey() {
            return this.fileKey;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.contactId.hashCode()) * 1000003;
                String str = this.contactName;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.engagementId.hashCode()) * 1000003;
                String str2 = this.fileKey;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.mimeType;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.externalLink;
                int iHashCode5 = (((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.sharedById.hashCode()) * 1000003;
                String str5 = this.sharedByName;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.sharedByEmail;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.templateTitle;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.accountName;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.accountLogoUrl;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.accountWebsite;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.sharedByNumber;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.createdAt;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedAt;
                this.$hashCode = iHashCode13 ^ (str13 != null ? str13.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateLinkShareMutation.UpdateLinkShare.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateLinkShare.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateLinkShare.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateLinkShare.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateLinkShare.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], UpdateLinkShare.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], UpdateLinkShare.this.contactName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdateLinkShare.this.engagementId);
                    responseWriter.writeString(responseFieldArr[6], UpdateLinkShare.this.fileKey);
                    responseWriter.writeString(responseFieldArr[7], UpdateLinkShare.this.mimeType);
                    responseWriter.writeString(responseFieldArr[8], UpdateLinkShare.this.externalLink);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateLinkShare.this.sharedById);
                    responseWriter.writeString(responseFieldArr[10], UpdateLinkShare.this.sharedByName);
                    responseWriter.writeString(responseFieldArr[11], UpdateLinkShare.this.sharedByEmail);
                    responseWriter.writeString(responseFieldArr[12], UpdateLinkShare.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[13], UpdateLinkShare.this.accountName);
                    responseWriter.writeString(responseFieldArr[14], UpdateLinkShare.this.accountLogoUrl);
                    responseWriter.writeString(responseFieldArr[15], UpdateLinkShare.this.accountWebsite);
                    responseWriter.writeString(responseFieldArr[16], UpdateLinkShare.this.sharedByNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], UpdateLinkShare.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], UpdateLinkShare.this.updatedAt);
                }
            };
        }

        public String mimeType() {
            return this.mimeType;
        }

        public String sharedByEmail() {
            return this.sharedByEmail;
        }

        public String sharedById() {
            return this.sharedById;
        }

        public String sharedByName() {
            return this.sharedByName;
        }

        public String sharedByNumber() {
            return this.sharedByNumber;
        }

        public String templateTitle() {
            return this.templateTitle;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateLinkShare{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", engagementId=" + this.engagementId + ", fileKey=" + this.fileKey + ", mimeType=" + this.mimeType + ", externalLink=" + this.externalLink + ", sharedById=" + this.sharedById + ", sharedByName=" + this.sharedByName + ", sharedByEmail=" + this.sharedByEmail + ", templateTitle=" + this.templateTitle + ", accountName=" + this.accountName + ", accountLogoUrl=" + this.accountLogoUrl + ", accountWebsite=" + this.accountWebsite + ", sharedByNumber=" + this.sharedByNumber + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelLinkShareConditionInput condition;
        private final UpdateLinkShareInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateLinkShareInput updateLinkShareInput, ModelLinkShareConditionInput modelLinkShareConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateLinkShareInput;
            this.condition = modelLinkShareConditionInput;
            linkedHashMap.put("input", updateLinkShareInput);
            linkedHashMap.put("condition", modelLinkShareConditionInput);
        }

        public ModelLinkShareConditionInput condition() {
            return this.condition;
        }

        public UpdateLinkShareInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateLinkShareMutation.Variables.1
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

    public UpdateLinkShareMutation(UpdateLinkShareInput updateLinkShareInput, ModelLinkShareConditionInput modelLinkShareConditionInput) {
        Utils.checkNotNull(updateLinkShareInput, "input == null");
        this.variables = new Variables(updateLinkShareInput, modelLinkShareConditionInput);
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
        return "419aae4006dd3f23b0c3e8b8951d7c7967c0388c70d776b11b48ea3b7391327c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateLinkShare($input: UpdateLinkShareInput!, $condition: ModelLinkShareConditionInput) {\n  updateLinkShare(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
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
