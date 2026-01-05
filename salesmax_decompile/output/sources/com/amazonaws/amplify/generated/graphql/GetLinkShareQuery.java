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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetLinkShareQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetLinkShare($id: ID!) {\n  getLinkShare(id: $id) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetLinkShareQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetLinkShare";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetLinkShare($id: ID!) {\n  getLinkShare(id: $id) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetLinkShareQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetLinkShareQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getLinkShare", "getLinkShare", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetLinkShare getLinkShare;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetLinkShare.Mapper getLinkShareFieldMapper = new GetLinkShare.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetLinkShare) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetLinkShare>() { // from class: com.amazonaws.amplify.generated.graphql.GetLinkShareQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetLinkShare read(ResponseReader responseReader2) {
                        return Mapper.this.getLinkShareFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetLinkShare getLinkShare) {
            this.getLinkShare = getLinkShare;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetLinkShare getLinkShare = this.getLinkShare;
            GetLinkShare getLinkShare2 = ((Data) obj).getLinkShare;
            return getLinkShare == null ? getLinkShare2 == null : getLinkShare.equals(getLinkShare2);
        }

        public GetLinkShare getLinkShare() {
            return this.getLinkShare;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetLinkShare getLinkShare = this.getLinkShare;
                this.$hashCode = (getLinkShare == null ? 0 : getLinkShare.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetLinkShareQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetLinkShare getLinkShare = Data.this.getLinkShare;
                    responseWriter.writeObject(responseField, getLinkShare != null ? getLinkShare.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getLinkShare=" + this.getLinkShare + "}";
            }
            return this.$toString;
        }
    }

    public static class GetLinkShare {
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

        public static final class Mapper implements ResponseFieldMapper<GetLinkShare> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetLinkShare map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetLinkShare.$responseFields;
                return new GetLinkShare(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("contactName", "contactName", null, true, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileKey", "fileKey", null, true, Collections.emptyList()), ResponseField.forString("mimeType", "mimeType", null, true, Collections.emptyList()), ResponseField.forString("externalLink", "externalLink", null, true, Collections.emptyList()), ResponseField.forCustomType("sharedById", "sharedById", null, false, customType, Collections.emptyList()), ResponseField.forString("sharedByName", "sharedByName", null, true, Collections.emptyList()), ResponseField.forString("sharedByEmail", "sharedByEmail", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("accountName", "accountName", null, true, Collections.emptyList()), ResponseField.forString("accountLogoUrl", "accountLogoUrl", null, true, Collections.emptyList()), ResponseField.forString("accountWebsite", "accountWebsite", null, true, Collections.emptyList()), ResponseField.forString("sharedByNumber", "sharedByNumber", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public GetLinkShare(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
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
            if (!(obj instanceof GetLinkShare)) {
                return false;
            }
            GetLinkShare getLinkShare = (GetLinkShare) obj;
            if (this.__typename.equals(getLinkShare.__typename) && this.id.equals(getLinkShare.id) && this.accountId.equals(getLinkShare.accountId) && this.contactId.equals(getLinkShare.contactId) && ((str = this.contactName) != null ? str.equals(getLinkShare.contactName) : getLinkShare.contactName == null) && this.engagementId.equals(getLinkShare.engagementId) && ((str2 = this.fileKey) != null ? str2.equals(getLinkShare.fileKey) : getLinkShare.fileKey == null) && ((str3 = this.mimeType) != null ? str3.equals(getLinkShare.mimeType) : getLinkShare.mimeType == null) && ((str4 = this.externalLink) != null ? str4.equals(getLinkShare.externalLink) : getLinkShare.externalLink == null) && this.sharedById.equals(getLinkShare.sharedById) && ((str5 = this.sharedByName) != null ? str5.equals(getLinkShare.sharedByName) : getLinkShare.sharedByName == null) && ((str6 = this.sharedByEmail) != null ? str6.equals(getLinkShare.sharedByEmail) : getLinkShare.sharedByEmail == null) && ((str7 = this.templateTitle) != null ? str7.equals(getLinkShare.templateTitle) : getLinkShare.templateTitle == null) && ((str8 = this.accountName) != null ? str8.equals(getLinkShare.accountName) : getLinkShare.accountName == null) && ((str9 = this.accountLogoUrl) != null ? str9.equals(getLinkShare.accountLogoUrl) : getLinkShare.accountLogoUrl == null) && ((str10 = this.accountWebsite) != null ? str10.equals(getLinkShare.accountWebsite) : getLinkShare.accountWebsite == null) && ((str11 = this.sharedByNumber) != null ? str11.equals(getLinkShare.sharedByNumber) : getLinkShare.sharedByNumber == null) && ((str12 = this.createdAt) != null ? str12.equals(getLinkShare.createdAt) : getLinkShare.createdAt == null)) {
                String str13 = this.updatedAt;
                String str14 = getLinkShare.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetLinkShareQuery.GetLinkShare.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetLinkShare.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetLinkShare.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetLinkShare.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetLinkShare.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetLinkShare.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], GetLinkShare.this.contactName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], GetLinkShare.this.engagementId);
                    responseWriter.writeString(responseFieldArr[6], GetLinkShare.this.fileKey);
                    responseWriter.writeString(responseFieldArr[7], GetLinkShare.this.mimeType);
                    responseWriter.writeString(responseFieldArr[8], GetLinkShare.this.externalLink);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], GetLinkShare.this.sharedById);
                    responseWriter.writeString(responseFieldArr[10], GetLinkShare.this.sharedByName);
                    responseWriter.writeString(responseFieldArr[11], GetLinkShare.this.sharedByEmail);
                    responseWriter.writeString(responseFieldArr[12], GetLinkShare.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[13], GetLinkShare.this.accountName);
                    responseWriter.writeString(responseFieldArr[14], GetLinkShare.this.accountLogoUrl);
                    responseWriter.writeString(responseFieldArr[15], GetLinkShare.this.accountWebsite);
                    responseWriter.writeString(responseFieldArr[16], GetLinkShare.this.sharedByNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], GetLinkShare.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], GetLinkShare.this.updatedAt);
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
                this.$toString = "GetLinkShare{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", engagementId=" + this.engagementId + ", fileKey=" + this.fileKey + ", mimeType=" + this.mimeType + ", externalLink=" + this.externalLink + ", sharedById=" + this.sharedById + ", sharedByName=" + this.sharedByName + ", sharedByEmail=" + this.sharedByEmail + ", templateTitle=" + this.templateTitle + ", accountName=" + this.accountName + ", accountLogoUrl=" + this.accountLogoUrl + ", accountWebsite=" + this.accountWebsite + ", sharedByNumber=" + this.sharedByNumber + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetLinkShareQuery.Variables.1
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

    public GetLinkShareQuery(String str) {
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
        return "87b77b33e59139b15cf08f025286d27dd362d1a1a6963ae3b330fd500a31986b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetLinkShare($id: ID!) {\n  getLinkShare(id: $id) {\n    __typename\n    id\n    accountId\n    contactId\n    contactName\n    engagementId\n    fileKey\n    mimeType\n    externalLink\n    sharedById\n    sharedByName\n    sharedByEmail\n    templateTitle\n    accountName\n    accountLogoUrl\n    accountWebsite\n    sharedByNumber\n    createdAt\n    updatedAt\n  }\n}";
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
