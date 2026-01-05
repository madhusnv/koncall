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
import type.CreateLinkShareInput;
import type.CustomType;
import type.ModelLinkShareConditionInput;

/* loaded from: classes6.dex */
public final class CreateLinkShareMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateLinkShare($input: CreateLinkShareInput!, $condition: ModelLinkShareConditionInput) {\n  createLinkShare(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateLinkShareMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateLinkShare";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateLinkShare($input: CreateLinkShareInput!, $condition: ModelLinkShareConditionInput) {\n  createLinkShare(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelLinkShareConditionInput condition;
        private CreateLinkShareInput input;

        public CreateLinkShareMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateLinkShareMutation(this.input, this.condition);
        }

        public Builder condition(ModelLinkShareConditionInput modelLinkShareConditionInput) {
            this.condition = modelLinkShareConditionInput;
            return this;
        }

        public Builder input(CreateLinkShareInput createLinkShareInput) {
            this.input = createLinkShareInput;
            return this;
        }
    }

    public static class CreateLinkShare {
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

        public static final class Mapper implements ResponseFieldMapper<CreateLinkShare> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateLinkShare map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateLinkShare.$responseFields;
                return new CreateLinkShare(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("contactName", "contactName", null, true, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileKey", "fileKey", null, true, Collections.emptyList()), ResponseField.forString("mimeType", "mimeType", null, true, Collections.emptyList()), ResponseField.forString("externalLink", "externalLink", null, true, Collections.emptyList()), ResponseField.forCustomType("sharedById", "sharedById", null, false, customType, Collections.emptyList()), ResponseField.forString("sharedByName", "sharedByName", null, true, Collections.emptyList()), ResponseField.forString("sharedByEmail", "sharedByEmail", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("accountName", "accountName", null, true, Collections.emptyList()), ResponseField.forString("accountLogoUrl", "accountLogoUrl", null, true, Collections.emptyList()), ResponseField.forString("accountWebsite", "accountWebsite", null, true, Collections.emptyList()), ResponseField.forString("sharedByNumber", "sharedByNumber", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public CreateLinkShare(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
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
            if (!(obj instanceof CreateLinkShare)) {
                return false;
            }
            CreateLinkShare createLinkShare = (CreateLinkShare) obj;
            if (this.__typename.equals(createLinkShare.__typename) && this.id.equals(createLinkShare.id) && this.accountId.equals(createLinkShare.accountId) && this.contactId.equals(createLinkShare.contactId) && ((str = this.contactName) != null ? str.equals(createLinkShare.contactName) : createLinkShare.contactName == null) && this.engagementId.equals(createLinkShare.engagementId) && ((str2 = this.fileKey) != null ? str2.equals(createLinkShare.fileKey) : createLinkShare.fileKey == null) && ((str3 = this.mimeType) != null ? str3.equals(createLinkShare.mimeType) : createLinkShare.mimeType == null) && ((str4 = this.externalLink) != null ? str4.equals(createLinkShare.externalLink) : createLinkShare.externalLink == null) && this.sharedById.equals(createLinkShare.sharedById) && ((str5 = this.sharedByName) != null ? str5.equals(createLinkShare.sharedByName) : createLinkShare.sharedByName == null) && ((str6 = this.sharedByEmail) != null ? str6.equals(createLinkShare.sharedByEmail) : createLinkShare.sharedByEmail == null) && ((str7 = this.templateTitle) != null ? str7.equals(createLinkShare.templateTitle) : createLinkShare.templateTitle == null) && ((str8 = this.accountName) != null ? str8.equals(createLinkShare.accountName) : createLinkShare.accountName == null) && ((str9 = this.accountLogoUrl) != null ? str9.equals(createLinkShare.accountLogoUrl) : createLinkShare.accountLogoUrl == null) && ((str10 = this.accountWebsite) != null ? str10.equals(createLinkShare.accountWebsite) : createLinkShare.accountWebsite == null) && ((str11 = this.sharedByNumber) != null ? str11.equals(createLinkShare.sharedByNumber) : createLinkShare.sharedByNumber == null) && ((str12 = this.createdAt) != null ? str12.equals(createLinkShare.createdAt) : createLinkShare.createdAt == null)) {
                String str13 = this.updatedAt;
                String str14 = createLinkShare.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateLinkShareMutation.CreateLinkShare.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateLinkShare.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateLinkShare.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateLinkShare.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateLinkShare.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateLinkShare.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], CreateLinkShare.this.contactName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CreateLinkShare.this.engagementId);
                    responseWriter.writeString(responseFieldArr[6], CreateLinkShare.this.fileKey);
                    responseWriter.writeString(responseFieldArr[7], CreateLinkShare.this.mimeType);
                    responseWriter.writeString(responseFieldArr[8], CreateLinkShare.this.externalLink);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CreateLinkShare.this.sharedById);
                    responseWriter.writeString(responseFieldArr[10], CreateLinkShare.this.sharedByName);
                    responseWriter.writeString(responseFieldArr[11], CreateLinkShare.this.sharedByEmail);
                    responseWriter.writeString(responseFieldArr[12], CreateLinkShare.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[13], CreateLinkShare.this.accountName);
                    responseWriter.writeString(responseFieldArr[14], CreateLinkShare.this.accountLogoUrl);
                    responseWriter.writeString(responseFieldArr[15], CreateLinkShare.this.accountWebsite);
                    responseWriter.writeString(responseFieldArr[16], CreateLinkShare.this.sharedByNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], CreateLinkShare.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CreateLinkShare.this.updatedAt);
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
                this.$toString = "CreateLinkShare{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", engagementId=" + this.engagementId + ", fileKey=" + this.fileKey + ", mimeType=" + this.mimeType + ", externalLink=" + this.externalLink + ", sharedById=" + this.sharedById + ", sharedByName=" + this.sharedByName + ", sharedByEmail=" + this.sharedByEmail + ", templateTitle=" + this.templateTitle + ", accountName=" + this.accountName + ", accountLogoUrl=" + this.accountLogoUrl + ", accountWebsite=" + this.accountWebsite + ", sharedByNumber=" + this.sharedByNumber + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createLinkShare", "createLinkShare", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateLinkShare createLinkShare;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateLinkShare.Mapper createLinkShareFieldMapper = new CreateLinkShare.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateLinkShare) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateLinkShare>() { // from class: com.amazonaws.amplify.generated.graphql.CreateLinkShareMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateLinkShare read(ResponseReader responseReader2) {
                        return Mapper.this.createLinkShareFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateLinkShare createLinkShare) {
            this.createLinkShare = createLinkShare;
        }

        public CreateLinkShare createLinkShare() {
            return this.createLinkShare;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateLinkShare createLinkShare = this.createLinkShare;
            CreateLinkShare createLinkShare2 = ((Data) obj).createLinkShare;
            return createLinkShare == null ? createLinkShare2 == null : createLinkShare.equals(createLinkShare2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateLinkShare createLinkShare = this.createLinkShare;
                this.$hashCode = (createLinkShare == null ? 0 : createLinkShare.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateLinkShareMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateLinkShare createLinkShare = Data.this.createLinkShare;
                    responseWriter.writeObject(responseField, createLinkShare != null ? createLinkShare.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createLinkShare=" + this.createLinkShare + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelLinkShareConditionInput condition;
        private final CreateLinkShareInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateLinkShareInput createLinkShareInput, ModelLinkShareConditionInput modelLinkShareConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createLinkShareInput;
            this.condition = modelLinkShareConditionInput;
            linkedHashMap.put("input", createLinkShareInput);
            linkedHashMap.put("condition", modelLinkShareConditionInput);
        }

        public ModelLinkShareConditionInput condition() {
            return this.condition;
        }

        public CreateLinkShareInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateLinkShareMutation.Variables.1
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

    public CreateLinkShareMutation(CreateLinkShareInput createLinkShareInput, ModelLinkShareConditionInput modelLinkShareConditionInput) {
        Utils.checkNotNull(createLinkShareInput, "input == null");
        this.variables = new Variables(createLinkShareInput, modelLinkShareConditionInput);
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
        return "be784a98761474d0187cd7b320cc264df2814aae03e108ebd5ac424bc9462f3d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateLinkShare($input: CreateLinkShareInput!, $condition: ModelLinkShareConditionInput) {\n  createLinkShare(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
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
