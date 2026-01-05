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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.HasParent;
import type.ModelTemplateGalleryConditionInput;
import type.ScopeLevel;
import type.UpdateTemplateGalleryInput;

/* loaded from: classes4.dex */
public final class UpdateTemplateGalleryMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateTemplateGallery($input: UpdateTemplateGalleryInput!, $condition: ModelTemplateGalleryConditionInput) {\n  updateTemplateGallery(input: $input, condition: $condition) {\n    __typename\n    id\n    platform\n    name\n    components {\n      __typename\n    }\n    language\n    status\n    category\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n      sampleValue\n      index\n      sub_type\n    }\n    templateId\n    tags\n    categoryLevelOne\n    categoryLevelTwo\n    applicableForIndustry\n    viewedTimes\n    savedToWorkspaceTimes\n    sentToWhatsappTimes\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateTemplateGallery";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateTemplateGallery($input: UpdateTemplateGalleryInput!, $condition: ModelTemplateGalleryConditionInput) {\n  updateTemplateGallery(input: $input, condition: $condition) {\n    __typename\n    id\n    platform\n    name\n    components {\n      __typename\n    }\n    language\n    status\n    category\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n      sampleValue\n      index\n      sub_type\n    }\n    templateId\n    tags\n    categoryLevelOne\n    categoryLevelTwo\n    applicableForIndustry\n    viewedTimes\n    savedToWorkspaceTimes\n    sentToWhatsappTimes\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelTemplateGalleryConditionInput condition;
        private UpdateTemplateGalleryInput input;

        public UpdateTemplateGalleryMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateTemplateGalleryMutation(this.input, this.condition);
        }

        public Builder condition(ModelTemplateGalleryConditionInput modelTemplateGalleryConditionInput) {
            this.condition = modelTemplateGalleryConditionInput;
            return this;
        }

        public Builder input(UpdateTemplateGalleryInput updateTemplateGalleryInput) {
            this.input = updateTemplateGalleryInput;
            return this;
        }
    }

    public static class Component {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;

        public static final class Mapper implements ResponseFieldMapper<Component> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Component map(ResponseReader responseReader) {
                return new Component(responseReader.readString(Component.$responseFields[0]));
            }
        }

        public Component(String str) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Component) {
                return this.__typename.equals(((Component) obj).__typename);
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                this.$hashCode = this.__typename.hashCode() ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.Component.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Component.$responseFields[0], Component.this.__typename);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Component{__typename=" + this.__typename + "}";
            }
            return this.$toString;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateTemplateGallery", "updateTemplateGallery", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateTemplateGallery updateTemplateGallery;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateTemplateGallery.Mapper updateTemplateGalleryFieldMapper = new UpdateTemplateGallery.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateTemplateGallery) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateTemplateGallery>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateTemplateGallery read(ResponseReader responseReader2) {
                        return Mapper.this.updateTemplateGalleryFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateTemplateGallery updateTemplateGallery) {
            this.updateTemplateGallery = updateTemplateGallery;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateTemplateGallery updateTemplateGallery = this.updateTemplateGallery;
            UpdateTemplateGallery updateTemplateGallery2 = ((Data) obj).updateTemplateGallery;
            return updateTemplateGallery == null ? updateTemplateGallery2 == null : updateTemplateGallery.equals(updateTemplateGallery2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateTemplateGallery updateTemplateGallery = this.updateTemplateGallery;
                this.$hashCode = (updateTemplateGallery == null ? 0 : updateTemplateGallery.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateTemplateGallery updateTemplateGallery = Data.this.updateTemplateGallery;
                    responseWriter.writeObject(responseField, updateTemplateGallery != null ? updateTemplateGallery.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateTemplateGallery=" + this.updateTemplateGallery + "}";
            }
            return this.$toString;
        }

        public UpdateTemplateGallery updateTemplateGallery() {
            return this.updateTemplateGallery;
        }
    }

    public static class DefaultMedia {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String description;
        final String documentCategory;
        final String documentSubCategory;
        final String fileMetaData;
        final String fileMimeType;
        final String fileName;
        final String fileStorageDestination;
        final String fileThumbnailUrl;
        final String fileUrl;
        final HasParent hasParent;
        final String id;
        final String parentFileId;
        final String scopeId;
        final ScopeLevel scopeLevel;
        final List<String> tags;
        final String templateBody;
        final String templateExternalLink;
        final String templateLastUsed;
        final String templateTitle;
        final String templateType;
        final String updatedAt;
        final String uploadSource;
        final String uploadedById;

        public static final class Mapper implements ResponseFieldMapper<DefaultMedia> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DefaultMedia map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DefaultMedia.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                String string7 = responseReader.readString(responseFieldArr[8]);
                List list = responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.DefaultMedia.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String string8 = responseReader.readString(responseFieldArr[10]);
                String string9 = responseReader.readString(responseFieldArr[11]);
                String string10 = responseReader.readString(responseFieldArr[12]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                String string11 = responseReader.readString(responseFieldArr[14]);
                String string12 = responseReader.readString(responseFieldArr[15]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String string13 = responseReader.readString(responseFieldArr[17]);
                String string14 = responseReader.readString(responseFieldArr[18]);
                String string15 = responseReader.readString(responseFieldArr[19]);
                HasParent hasParentValueOf = string15 != null ? HasParent.valueOf(string15) : null;
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]);
                String string16 = responseReader.readString(responseFieldArr[21]);
                return new DefaultMedia(string, str, str2, string2, string3, string4, string5, string6, string7, list, string8, string9, string10, str3, string11, string12, str4, string13, string14, hasParentValueOf, str5, string16 != null ? ScopeLevel.valueOf(string16) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("fileUrl", "fileUrl", null, true, Collections.emptyList()), ResponseField.forString("fileStorageDestination", "fileStorageDestination", null, true, Collections.emptyList()), ResponseField.forString("fileName", "fileName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("templateTitle", "templateTitle", null, true, Collections.emptyList()), ResponseField.forString("templateBody", "templateBody", null, true, Collections.emptyList()), ResponseField.forCustomType("templateLastUsed", "templateLastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forString("templateExternalLink", "templateExternalLink", null, true, Collections.emptyList()), ResponseField.forString("uploadSource", "uploadSource", null, true, Collections.emptyList()), ResponseField.forCustomType("fileMetaData", "fileMetaData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("fileMimeType", "fileMimeType", null, true, Collections.emptyList()), ResponseField.forString("fileThumbnailUrl", "fileThumbnailUrl", null, true, Collections.emptyList()), ResponseField.forString("hasParent", "hasParent", null, true, Collections.emptyList()), ResponseField.forCustomType("parentFileId", "parentFileId", null, true, customType, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("uploadedById", "uploadedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public DefaultMedia(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, HasParent hasParent, String str19, ScopeLevel scopeLevel, String str20, String str21, String str22, String str23) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.fileUrl = str4;
            this.fileStorageDestination = str5;
            this.fileName = str6;
            this.description = str7;
            this.documentCategory = str8;
            this.documentSubCategory = str9;
            this.tags = list;
            this.templateType = str10;
            this.templateTitle = str11;
            this.templateBody = str12;
            this.templateLastUsed = str13;
            this.templateExternalLink = str14;
            this.uploadSource = str15;
            this.fileMetaData = str16;
            this.fileMimeType = str17;
            this.fileThumbnailUrl = str18;
            this.hasParent = hasParent;
            this.parentFileId = str19;
            this.scopeLevel = scopeLevel;
            this.scopeId = str20;
            this.uploadedById = str21;
            this.createdAt = str22;
            this.updatedAt = str23;
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

        public String description() {
            return this.description;
        }

        public String documentCategory() {
            return this.documentCategory;
        }

        public String documentSubCategory() {
            return this.documentSubCategory;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            List<String> list;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            HasParent hasParent;
            String str16;
            ScopeLevel scopeLevel;
            String str17;
            String str18;
            String str19;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DefaultMedia)) {
                return false;
            }
            DefaultMedia defaultMedia = (DefaultMedia) obj;
            if (this.__typename.equals(defaultMedia.__typename) && this.id.equals(defaultMedia.id) && this.accountId.equals(defaultMedia.accountId) && ((str = this.fileUrl) != null ? str.equals(defaultMedia.fileUrl) : defaultMedia.fileUrl == null) && ((str2 = this.fileStorageDestination) != null ? str2.equals(defaultMedia.fileStorageDestination) : defaultMedia.fileStorageDestination == null) && ((str3 = this.fileName) != null ? str3.equals(defaultMedia.fileName) : defaultMedia.fileName == null) && ((str4 = this.description) != null ? str4.equals(defaultMedia.description) : defaultMedia.description == null) && ((str5 = this.documentCategory) != null ? str5.equals(defaultMedia.documentCategory) : defaultMedia.documentCategory == null) && ((str6 = this.documentSubCategory) != null ? str6.equals(defaultMedia.documentSubCategory) : defaultMedia.documentSubCategory == null) && ((list = this.tags) != null ? list.equals(defaultMedia.tags) : defaultMedia.tags == null) && ((str7 = this.templateType) != null ? str7.equals(defaultMedia.templateType) : defaultMedia.templateType == null) && ((str8 = this.templateTitle) != null ? str8.equals(defaultMedia.templateTitle) : defaultMedia.templateTitle == null) && ((str9 = this.templateBody) != null ? str9.equals(defaultMedia.templateBody) : defaultMedia.templateBody == null) && ((str10 = this.templateLastUsed) != null ? str10.equals(defaultMedia.templateLastUsed) : defaultMedia.templateLastUsed == null) && ((str11 = this.templateExternalLink) != null ? str11.equals(defaultMedia.templateExternalLink) : defaultMedia.templateExternalLink == null) && ((str12 = this.uploadSource) != null ? str12.equals(defaultMedia.uploadSource) : defaultMedia.uploadSource == null) && ((str13 = this.fileMetaData) != null ? str13.equals(defaultMedia.fileMetaData) : defaultMedia.fileMetaData == null) && ((str14 = this.fileMimeType) != null ? str14.equals(defaultMedia.fileMimeType) : defaultMedia.fileMimeType == null) && ((str15 = this.fileThumbnailUrl) != null ? str15.equals(defaultMedia.fileThumbnailUrl) : defaultMedia.fileThumbnailUrl == null) && ((hasParent = this.hasParent) != null ? hasParent.equals(defaultMedia.hasParent) : defaultMedia.hasParent == null) && ((str16 = this.parentFileId) != null ? str16.equals(defaultMedia.parentFileId) : defaultMedia.parentFileId == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(defaultMedia.scopeLevel) : defaultMedia.scopeLevel == null) && ((str17 = this.scopeId) != null ? str17.equals(defaultMedia.scopeId) : defaultMedia.scopeId == null) && ((str18 = this.uploadedById) != null ? str18.equals(defaultMedia.uploadedById) : defaultMedia.uploadedById == null) && ((str19 = this.createdAt) != null ? str19.equals(defaultMedia.createdAt) : defaultMedia.createdAt == null)) {
                String str20 = this.updatedAt;
                String str21 = defaultMedia.updatedAt;
                if (str20 == null) {
                    if (str21 == null) {
                        return true;
                    }
                } else if (str20.equals(str21)) {
                    return true;
                }
            }
            return false;
        }

        public String fileMetaData() {
            return this.fileMetaData;
        }

        public String fileMimeType() {
            return this.fileMimeType;
        }

        public String fileName() {
            return this.fileName;
        }

        public String fileStorageDestination() {
            return this.fileStorageDestination;
        }

        public String fileThumbnailUrl() {
            return this.fileThumbnailUrl;
        }

        public String fileUrl() {
            return this.fileUrl;
        }

        public HasParent hasParent() {
            return this.hasParent;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.fileUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fileStorageDestination;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.fileName;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.description;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.documentCategory;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.documentSubCategory;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode8 = (iHashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str7 = this.templateType;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.templateTitle;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.templateBody;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.templateLastUsed;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.templateExternalLink;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.uploadSource;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.fileMetaData;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.fileMimeType;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.fileThumbnailUrl;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                HasParent hasParent = this.hasParent;
                int iHashCode18 = (iHashCode17 ^ (hasParent == null ? 0 : hasParent.hashCode())) * 1000003;
                String str16 = this.parentFileId;
                int iHashCode19 = (iHashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                ScopeLevel scopeLevel = this.scopeLevel;
                int iHashCode20 = (iHashCode19 ^ (scopeLevel == null ? 0 : scopeLevel.hashCode())) * 1000003;
                String str17 = this.scopeId;
                int iHashCode21 = (iHashCode20 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.uploadedById;
                int iHashCode22 = (iHashCode21 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.createdAt;
                int iHashCode23 = (iHashCode22 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.updatedAt;
                this.$hashCode = iHashCode23 ^ (str20 != null ? str20.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.DefaultMedia.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DefaultMedia.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DefaultMedia.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DefaultMedia.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DefaultMedia.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], DefaultMedia.this.fileUrl);
                    responseWriter.writeString(responseFieldArr[4], DefaultMedia.this.fileStorageDestination);
                    responseWriter.writeString(responseFieldArr[5], DefaultMedia.this.fileName);
                    responseWriter.writeString(responseFieldArr[6], DefaultMedia.this.description);
                    responseWriter.writeString(responseFieldArr[7], DefaultMedia.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[8], DefaultMedia.this.documentSubCategory);
                    responseWriter.writeList(responseFieldArr[9], DefaultMedia.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.DefaultMedia.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[10], DefaultMedia.this.templateType);
                    responseWriter.writeString(responseFieldArr[11], DefaultMedia.this.templateTitle);
                    responseWriter.writeString(responseFieldArr[12], DefaultMedia.this.templateBody);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], DefaultMedia.this.templateLastUsed);
                    responseWriter.writeString(responseFieldArr[14], DefaultMedia.this.templateExternalLink);
                    responseWriter.writeString(responseFieldArr[15], DefaultMedia.this.uploadSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], DefaultMedia.this.fileMetaData);
                    responseWriter.writeString(responseFieldArr[17], DefaultMedia.this.fileMimeType);
                    responseWriter.writeString(responseFieldArr[18], DefaultMedia.this.fileThumbnailUrl);
                    ResponseField responseField = responseFieldArr[19];
                    HasParent hasParent = DefaultMedia.this.hasParent;
                    responseWriter.writeString(responseField, hasParent != null ? hasParent.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], DefaultMedia.this.parentFileId);
                    ResponseField responseField2 = responseFieldArr[21];
                    ScopeLevel scopeLevel = DefaultMedia.this.scopeLevel;
                    responseWriter.writeString(responseField2, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], DefaultMedia.this.scopeId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], DefaultMedia.this.uploadedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], DefaultMedia.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], DefaultMedia.this.updatedAt);
                }
            };
        }

        public String parentFileId() {
            return this.parentFileId;
        }

        public String scopeId() {
            return this.scopeId;
        }

        public ScopeLevel scopeLevel() {
            return this.scopeLevel;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String templateBody() {
            return this.templateBody;
        }

        public String templateExternalLink() {
            return this.templateExternalLink;
        }

        public String templateLastUsed() {
            return this.templateLastUsed;
        }

        public String templateTitle() {
            return this.templateTitle;
        }

        public String templateType() {
            return this.templateType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DefaultMedia{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", fileUrl=" + this.fileUrl + ", fileStorageDestination=" + this.fileStorageDestination + ", fileName=" + this.fileName + ", description=" + this.description + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", tags=" + this.tags + ", templateType=" + this.templateType + ", templateTitle=" + this.templateTitle + ", templateBody=" + this.templateBody + ", templateLastUsed=" + this.templateLastUsed + ", templateExternalLink=" + this.templateExternalLink + ", uploadSource=" + this.uploadSource + ", fileMetaData=" + this.fileMetaData + ", fileMimeType=" + this.fileMimeType + ", fileThumbnailUrl=" + this.fileThumbnailUrl + ", hasParent=" + this.hasParent + ", parentFileId=" + this.parentFileId + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", uploadedById=" + this.uploadedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String uploadSource() {
            return this.uploadSource;
        }

        public String uploadedById() {
            return this.uploadedById;
        }
    }

    public static class DefaultVariableMap {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("taType", "taType", null, true, Collections.emptyList()), ResponseField.forString("variableId", "variableId", null, true, Collections.emptyList()), ResponseField.forString("mappedObject", "mappedObject", null, true, Collections.emptyList()), ResponseField.forString("mappedProperty", "mappedProperty", null, true, Collections.emptyList()), ResponseField.forString("fallBackValue", "fallBackValue", null, true, Collections.emptyList()), ResponseField.forString("sampleValue", "sampleValue", null, true, Collections.emptyList()), ResponseField.forInt(FirebaseAnalytics.Param.INDEX, FirebaseAnalytics.Param.INDEX, null, true, Collections.emptyList()), ResponseField.forString("sub_type", "sub_type", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String fallBackValue;
        final Integer index;
        final String mappedObject;
        final String mappedProperty;
        final String sampleValue;
        final String sub_type;
        final String taType;
        final String variableId;

        public static final class Mapper implements ResponseFieldMapper<DefaultVariableMap> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DefaultVariableMap map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DefaultVariableMap.$responseFields;
                return new DefaultVariableMap(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]));
            }
        }

        public DefaultVariableMap(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.taType = str2;
            this.variableId = str3;
            this.mappedObject = str4;
            this.mappedProperty = str5;
            this.fallBackValue = str6;
            this.sampleValue = str7;
            this.index = num;
            this.sub_type = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DefaultVariableMap)) {
                return false;
            }
            DefaultVariableMap defaultVariableMap = (DefaultVariableMap) obj;
            if (this.__typename.equals(defaultVariableMap.__typename) && ((str = this.taType) != null ? str.equals(defaultVariableMap.taType) : defaultVariableMap.taType == null) && ((str2 = this.variableId) != null ? str2.equals(defaultVariableMap.variableId) : defaultVariableMap.variableId == null) && ((str3 = this.mappedObject) != null ? str3.equals(defaultVariableMap.mappedObject) : defaultVariableMap.mappedObject == null) && ((str4 = this.mappedProperty) != null ? str4.equals(defaultVariableMap.mappedProperty) : defaultVariableMap.mappedProperty == null) && ((str5 = this.fallBackValue) != null ? str5.equals(defaultVariableMap.fallBackValue) : defaultVariableMap.fallBackValue == null) && ((str6 = this.sampleValue) != null ? str6.equals(defaultVariableMap.sampleValue) : defaultVariableMap.sampleValue == null) && ((num = this.index) != null ? num.equals(defaultVariableMap.index) : defaultVariableMap.index == null)) {
                String str7 = this.sub_type;
                String str8 = defaultVariableMap.sub_type;
                if (str7 == null) {
                    if (str8 == null) {
                        return true;
                    }
                } else if (str7.equals(str8)) {
                    return true;
                }
            }
            return false;
        }

        public String fallBackValue() {
            return this.fallBackValue;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.taType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.variableId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.mappedObject;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.mappedProperty;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.fallBackValue;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.sampleValue;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num = this.index;
                int iHashCode8 = (iHashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str7 = this.sub_type;
                this.$hashCode = iHashCode8 ^ (str7 != null ? str7.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Integer index() {
            return this.index;
        }

        public String mappedObject() {
            return this.mappedObject;
        }

        public String mappedProperty() {
            return this.mappedProperty;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.DefaultVariableMap.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DefaultVariableMap.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DefaultVariableMap.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], DefaultVariableMap.this.taType);
                    responseWriter.writeString(responseFieldArr[2], DefaultVariableMap.this.variableId);
                    responseWriter.writeString(responseFieldArr[3], DefaultVariableMap.this.mappedObject);
                    responseWriter.writeString(responseFieldArr[4], DefaultVariableMap.this.mappedProperty);
                    responseWriter.writeString(responseFieldArr[5], DefaultVariableMap.this.fallBackValue);
                    responseWriter.writeString(responseFieldArr[6], DefaultVariableMap.this.sampleValue);
                    responseWriter.writeInt(responseFieldArr[7], DefaultVariableMap.this.index);
                    responseWriter.writeString(responseFieldArr[8], DefaultVariableMap.this.sub_type);
                }
            };
        }

        public String sampleValue() {
            return this.sampleValue;
        }

        public String sub_type() {
            return this.sub_type;
        }

        public String taType() {
            return this.taType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DefaultVariableMap{__typename=" + this.__typename + ", taType=" + this.taType + ", variableId=" + this.variableId + ", mappedObject=" + this.mappedObject + ", mappedProperty=" + this.mappedProperty + ", fallBackValue=" + this.fallBackValue + ", sampleValue=" + this.sampleValue + ", index=" + this.index + ", sub_type=" + this.sub_type + "}";
            }
            return this.$toString;
        }

        public String variableId() {
            return this.variableId;
        }
    }

    public static class UpdateTemplateGallery {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<String> applicableForIndustry;
        final String archivedAt;
        final String archivedStatus;
        final String category;
        final String categoryLevelOne;
        final String categoryLevelTwo;
        final List<Component> components;
        final String createdAt;
        final String createdBy;
        final DefaultMedia defaultMedia;
        final String defaultMediaId;
        final List<DefaultVariableMap> defaultVariableMap;
        final String id;
        final String language;
        final String name;
        final String platform;
        final Integer savedToWorkspaceTimes;
        final Integer sentToWhatsappTimes;
        final String status;
        final List<String> tags;
        final String templateId;
        final String updatedAt;
        final String updatedBy;
        final Integer viewedTimes;

        public static final class Mapper implements ResponseFieldMapper<UpdateTemplateGallery> {
            final Component.Mapper componentFieldMapper = new Component.Mapper();
            final DefaultVariableMap.Mapper defaultVariableMapFieldMapper = new DefaultVariableMap.Mapper();
            final DefaultMedia.Mapper defaultMediaFieldMapper = new DefaultMedia.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateTemplateGallery map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateTemplateGallery.$responseFields;
                return new UpdateTemplateGallery(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readList(responseFieldArr[4], new ResponseReader.ListReader<Component>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Component read(ResponseReader.ListItemReader listItemReader) {
                        return (Component) listItemReader.readObject(new ResponseReader.ObjectReader<Component>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Component read(ResponseReader responseReader2) {
                                return Mapper.this.componentFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readList(responseFieldArr[13], new ResponseReader.ListReader<DefaultVariableMap>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public DefaultVariableMap read(ResponseReader.ListItemReader listItemReader) {
                        return (DefaultVariableMap) listItemReader.readObject(new ResponseReader.ObjectReader<DefaultVariableMap>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.Mapper.2.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public DefaultVariableMap read(ResponseReader responseReader2) {
                                return Mapper.this.defaultVariableMapFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[14]), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readInt(responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readInt(responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (DefaultMedia) responseReader.readObject(responseFieldArr[24], new ResponseReader.ObjectReader<DefaultMedia>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DefaultMedia read(ResponseReader responseReader2) {
                        return Mapper.this.defaultMediaFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("platform", "platform", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forList("components", "components", null, true, Collections.emptyList()), ResponseField.forString("language", "language", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forString("archivedStatus", "archivedStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("archivedAt", "archivedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("defaultMediaId", "defaultMediaId", null, true, customType, Collections.emptyList()), ResponseField.forList("defaultVariableMap", "defaultVariableMap", null, true, Collections.emptyList()), ResponseField.forString("templateId", "templateId", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("categoryLevelOne", "categoryLevelOne", null, true, Collections.emptyList()), ResponseField.forString("categoryLevelTwo", "categoryLevelTwo", null, true, Collections.emptyList()), ResponseField.forList("applicableForIndustry", "applicableForIndustry", null, true, Collections.emptyList()), ResponseField.forInt("viewedTimes", "viewedTimes", null, true, Collections.emptyList()), ResponseField.forInt("savedToWorkspaceTimes", "savedToWorkspaceTimes", null, true, Collections.emptyList()), ResponseField.forInt("sentToWhatsappTimes", "sentToWhatsappTimes", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("defaultMedia", "defaultMedia", null, true, Collections.emptyList())};
        }

        public UpdateTemplateGallery(String str, String str2, String str3, String str4, List<Component> list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<DefaultVariableMap> list2, String str13, List<String> list3, String str14, String str15, List<String> list4, Integer num, Integer num2, Integer num3, String str16, String str17, DefaultMedia defaultMedia) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.platform = str3;
            this.name = str4;
            this.components = list;
            this.language = str5;
            this.status = str6;
            this.category = str7;
            this.createdBy = str8;
            this.updatedBy = str9;
            this.archivedStatus = str10;
            this.archivedAt = str11;
            this.defaultMediaId = str12;
            this.defaultVariableMap = list2;
            this.templateId = str13;
            this.tags = list3;
            this.categoryLevelOne = str14;
            this.categoryLevelTwo = str15;
            this.applicableForIndustry = list4;
            this.viewedTimes = num;
            this.savedToWorkspaceTimes = num2;
            this.sentToWhatsappTimes = num3;
            this.createdAt = str16;
            this.updatedAt = str17;
            this.defaultMedia = defaultMedia;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<String> applicableForIndustry() {
            return this.applicableForIndustry;
        }

        public String archivedAt() {
            return this.archivedAt;
        }

        public String archivedStatus() {
            return this.archivedStatus;
        }

        public String category() {
            return this.category;
        }

        public String categoryLevelOne() {
            return this.categoryLevelOne;
        }

        public String categoryLevelTwo() {
            return this.categoryLevelTwo;
        }

        public List<Component> components() {
            return this.components;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public DefaultMedia defaultMedia() {
            return this.defaultMedia;
        }

        public String defaultMediaId() {
            return this.defaultMediaId;
        }

        public List<DefaultVariableMap> defaultVariableMap() {
            return this.defaultVariableMap;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            List<Component> list;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            List<DefaultVariableMap> list2;
            String str11;
            List<String> list3;
            String str12;
            String str13;
            List<String> list4;
            Integer num;
            Integer num2;
            Integer num3;
            String str14;
            String str15;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateTemplateGallery)) {
                return false;
            }
            UpdateTemplateGallery updateTemplateGallery = (UpdateTemplateGallery) obj;
            if (this.__typename.equals(updateTemplateGallery.__typename) && this.id.equals(updateTemplateGallery.id) && ((str = this.platform) != null ? str.equals(updateTemplateGallery.platform) : updateTemplateGallery.platform == null) && ((str2 = this.name) != null ? str2.equals(updateTemplateGallery.name) : updateTemplateGallery.name == null) && ((list = this.components) != null ? list.equals(updateTemplateGallery.components) : updateTemplateGallery.components == null) && ((str3 = this.language) != null ? str3.equals(updateTemplateGallery.language) : updateTemplateGallery.language == null) && ((str4 = this.status) != null ? str4.equals(updateTemplateGallery.status) : updateTemplateGallery.status == null) && ((str5 = this.category) != null ? str5.equals(updateTemplateGallery.category) : updateTemplateGallery.category == null) && ((str6 = this.createdBy) != null ? str6.equals(updateTemplateGallery.createdBy) : updateTemplateGallery.createdBy == null) && ((str7 = this.updatedBy) != null ? str7.equals(updateTemplateGallery.updatedBy) : updateTemplateGallery.updatedBy == null) && ((str8 = this.archivedStatus) != null ? str8.equals(updateTemplateGallery.archivedStatus) : updateTemplateGallery.archivedStatus == null) && ((str9 = this.archivedAt) != null ? str9.equals(updateTemplateGallery.archivedAt) : updateTemplateGallery.archivedAt == null) && ((str10 = this.defaultMediaId) != null ? str10.equals(updateTemplateGallery.defaultMediaId) : updateTemplateGallery.defaultMediaId == null) && ((list2 = this.defaultVariableMap) != null ? list2.equals(updateTemplateGallery.defaultVariableMap) : updateTemplateGallery.defaultVariableMap == null) && ((str11 = this.templateId) != null ? str11.equals(updateTemplateGallery.templateId) : updateTemplateGallery.templateId == null) && ((list3 = this.tags) != null ? list3.equals(updateTemplateGallery.tags) : updateTemplateGallery.tags == null) && ((str12 = this.categoryLevelOne) != null ? str12.equals(updateTemplateGallery.categoryLevelOne) : updateTemplateGallery.categoryLevelOne == null) && ((str13 = this.categoryLevelTwo) != null ? str13.equals(updateTemplateGallery.categoryLevelTwo) : updateTemplateGallery.categoryLevelTwo == null) && ((list4 = this.applicableForIndustry) != null ? list4.equals(updateTemplateGallery.applicableForIndustry) : updateTemplateGallery.applicableForIndustry == null) && ((num = this.viewedTimes) != null ? num.equals(updateTemplateGallery.viewedTimes) : updateTemplateGallery.viewedTimes == null) && ((num2 = this.savedToWorkspaceTimes) != null ? num2.equals(updateTemplateGallery.savedToWorkspaceTimes) : updateTemplateGallery.savedToWorkspaceTimes == null) && ((num3 = this.sentToWhatsappTimes) != null ? num3.equals(updateTemplateGallery.sentToWhatsappTimes) : updateTemplateGallery.sentToWhatsappTimes == null) && ((str14 = this.createdAt) != null ? str14.equals(updateTemplateGallery.createdAt) : updateTemplateGallery.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(updateTemplateGallery.updatedAt) : updateTemplateGallery.updatedAt == null)) {
                DefaultMedia defaultMedia = this.defaultMedia;
                DefaultMedia defaultMedia2 = updateTemplateGallery.defaultMedia;
                if (defaultMedia == null) {
                    if (defaultMedia2 == null) {
                        return true;
                    }
                } else if (defaultMedia.equals(defaultMedia2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.platform;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.name;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                List<Component> list = this.components;
                int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str3 = this.language;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.status;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.category;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.createdBy;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedBy;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.archivedStatus;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.archivedAt;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.defaultMediaId;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                List<DefaultVariableMap> list2 = this.defaultVariableMap;
                int iHashCode13 = (iHashCode12 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str11 = this.templateId;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                List<String> list3 = this.tags;
                int iHashCode15 = (iHashCode14 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str12 = this.categoryLevelOne;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.categoryLevelTwo;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                List<String> list4 = this.applicableForIndustry;
                int iHashCode18 = (iHashCode17 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
                Integer num = this.viewedTimes;
                int iHashCode19 = (iHashCode18 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.savedToWorkspaceTimes;
                int iHashCode20 = (iHashCode19 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sentToWhatsappTimes;
                int iHashCode21 = (iHashCode20 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode22 = (iHashCode21 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode23 = (iHashCode22 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                DefaultMedia defaultMedia = this.defaultMedia;
                this.$hashCode = iHashCode23 ^ (defaultMedia != null ? defaultMedia.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String language() {
            return this.language;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateTemplateGallery.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateTemplateGallery.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateTemplateGallery.this.id);
                    responseWriter.writeString(responseFieldArr[2], UpdateTemplateGallery.this.platform);
                    responseWriter.writeString(responseFieldArr[3], UpdateTemplateGallery.this.name);
                    responseWriter.writeList(responseFieldArr[4], UpdateTemplateGallery.this.components, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Component) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[5], UpdateTemplateGallery.this.language);
                    responseWriter.writeString(responseFieldArr[6], UpdateTemplateGallery.this.status);
                    responseWriter.writeString(responseFieldArr[7], UpdateTemplateGallery.this.category);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], UpdateTemplateGallery.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdateTemplateGallery.this.updatedBy);
                    responseWriter.writeString(responseFieldArr[10], UpdateTemplateGallery.this.archivedStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateTemplateGallery.this.archivedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateTemplateGallery.this.defaultMediaId);
                    responseWriter.writeList(responseFieldArr[13], UpdateTemplateGallery.this.defaultVariableMap, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((DefaultVariableMap) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[14], UpdateTemplateGallery.this.templateId);
                    responseWriter.writeList(responseFieldArr[15], UpdateTemplateGallery.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[16], UpdateTemplateGallery.this.categoryLevelOne);
                    responseWriter.writeString(responseFieldArr[17], UpdateTemplateGallery.this.categoryLevelTwo);
                    responseWriter.writeList(responseFieldArr[18], UpdateTemplateGallery.this.applicableForIndustry, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.UpdateTemplateGallery.1.4
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[19], UpdateTemplateGallery.this.viewedTimes);
                    responseWriter.writeInt(responseFieldArr[20], UpdateTemplateGallery.this.savedToWorkspaceTimes);
                    responseWriter.writeInt(responseFieldArr[21], UpdateTemplateGallery.this.sentToWhatsappTimes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], UpdateTemplateGallery.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], UpdateTemplateGallery.this.updatedAt);
                    ResponseField responseField = responseFieldArr[24];
                    DefaultMedia defaultMedia = UpdateTemplateGallery.this.defaultMedia;
                    responseWriter.writeObject(responseField, defaultMedia != null ? defaultMedia.marshaller() : null);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String platform() {
            return this.platform;
        }

        public Integer savedToWorkspaceTimes() {
            return this.savedToWorkspaceTimes;
        }

        public Integer sentToWhatsappTimes() {
            return this.sentToWhatsappTimes;
        }

        public String status() {
            return this.status;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String templateId() {
            return this.templateId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateTemplateGallery{__typename=" + this.__typename + ", id=" + this.id + ", platform=" + this.platform + ", name=" + this.name + ", components=" + this.components + ", language=" + this.language + ", status=" + this.status + ", category=" + this.category + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", archivedStatus=" + this.archivedStatus + ", archivedAt=" + this.archivedAt + ", defaultMediaId=" + this.defaultMediaId + ", defaultVariableMap=" + this.defaultVariableMap + ", templateId=" + this.templateId + ", tags=" + this.tags + ", categoryLevelOne=" + this.categoryLevelOne + ", categoryLevelTwo=" + this.categoryLevelTwo + ", applicableForIndustry=" + this.applicableForIndustry + ", viewedTimes=" + this.viewedTimes + ", savedToWorkspaceTimes=" + this.savedToWorkspaceTimes + ", sentToWhatsappTimes=" + this.sentToWhatsappTimes + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", defaultMedia=" + this.defaultMedia + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }

        public Integer viewedTimes() {
            return this.viewedTimes;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelTemplateGalleryConditionInput condition;
        private final UpdateTemplateGalleryInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateTemplateGalleryInput updateTemplateGalleryInput, ModelTemplateGalleryConditionInput modelTemplateGalleryConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateTemplateGalleryInput;
            this.condition = modelTemplateGalleryConditionInput;
            linkedHashMap.put("input", updateTemplateGalleryInput);
            linkedHashMap.put("condition", modelTemplateGalleryConditionInput);
        }

        public ModelTemplateGalleryConditionInput condition() {
            return this.condition;
        }

        public UpdateTemplateGalleryInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateTemplateGalleryMutation.Variables.1
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

    public UpdateTemplateGalleryMutation(UpdateTemplateGalleryInput updateTemplateGalleryInput, ModelTemplateGalleryConditionInput modelTemplateGalleryConditionInput) {
        Utils.checkNotNull(updateTemplateGalleryInput, "input == null");
        this.variables = new Variables(updateTemplateGalleryInput, modelTemplateGalleryConditionInput);
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
        return "e47eb1072a0568e3463d832a34ccf0e154d89f3d7a5556ca087735f9ee32e262";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateTemplateGallery($input: UpdateTemplateGalleryInput!, $condition: ModelTemplateGalleryConditionInput) {\n  updateTemplateGallery(input: $input, condition: $condition) {\n    __typename\n    id\n    platform\n    name\n    components {\n      __typename\n    }\n    language\n    status\n    category\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n      sampleValue\n      index\n      sub_type\n    }\n    templateId\n    tags\n    categoryLevelOne\n    categoryLevelTwo\n    applicableForIndustry\n    viewedTimes\n    savedToWorkspaceTimes\n    sentToWhatsappTimes\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
