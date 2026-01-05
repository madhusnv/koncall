package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.Utils;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.List;
import type.CustomType;
import type.HasParent;
import type.ScopeLevel;

/* loaded from: classes4.dex */
public final class OnUpdateWhasappTemplatesSubscription implements Subscription<Data, Data, Operation.Variables> {
    public static final String OPERATION_DEFINITION = "subscription OnUpdateWhasappTemplates {\n  onUpdateWhasappTemplates {\n    __typename\n    id\n    accountId\n    whatsappBusinessAccount\n    templateType\n    snippetType\n    platform\n    name\n    components {\n      __typename\n    }\n    language\n    status\n    category\n    subCategory\n    snippetCategory\n    snippetSubCategory\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n      sampleValue\n      index\n      sub_type\n    }\n    templateId\n    tags\n    isSample\n    messageType\n    messageSubType\n    text\n    locationObjectToSend\n    headerText\n    footerText\n    headerType\n    actionInteractive {\n      __typename\n      actionName\n      display_text\n      ctaUrl\n      addressCountry\n      savedAddresses\n      button\n      catalog_id\n      product_retailer_id\n      flow_mode\n      flow_message_version\n      flow_token\n      flow_id\n      flow_cta\n      flow_action\n    }\n    messageTemplateQualityNew\n    messageTemplateQualityPrevious\n    messageTemplateQualityUpdatedAt\n    messageTemplateStatusUpdatedAt\n    stausUpdateReason\n    otherDetail\n    lastUsed\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "OnUpdateWhasappTemplates";
        }
    };
    public static final String QUERY_DOCUMENT = "subscription OnUpdateWhasappTemplates {\n  onUpdateWhasappTemplates {\n    __typename\n    id\n    accountId\n    whatsappBusinessAccount\n    templateType\n    snippetType\n    platform\n    name\n    components {\n      __typename\n    }\n    language\n    status\n    category\n    subCategory\n    snippetCategory\n    snippetSubCategory\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n      sampleValue\n      index\n      sub_type\n    }\n    templateId\n    tags\n    isSample\n    messageType\n    messageSubType\n    text\n    locationObjectToSend\n    headerText\n    footerText\n    headerType\n    actionInteractive {\n      __typename\n      actionName\n      display_text\n      ctaUrl\n      addressCountry\n      savedAddresses\n      button\n      catalog_id\n      product_retailer_id\n      flow_mode\n      flow_message_version\n      flow_token\n      flow_id\n      flow_cta\n      flow_action\n    }\n    messageTemplateQualityNew\n    messageTemplateQualityPrevious\n    messageTemplateQualityUpdatedAt\n    messageTemplateStatusUpdatedAt\n    stausUpdateReason\n    otherDetail\n    lastUsed\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    public static class ActionInteractive {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("actionName", "actionName", null, true, Collections.emptyList()), ResponseField.forString("display_text", "display_text", null, true, Collections.emptyList()), ResponseField.forCustomType("ctaUrl", "ctaUrl", null, true, CustomType.AWSURL, Collections.emptyList()), ResponseField.forString("addressCountry", "addressCountry", null, true, Collections.emptyList()), ResponseField.forList("savedAddresses", "savedAddresses", null, true, Collections.emptyList()), ResponseField.forString("button", "button", null, true, Collections.emptyList()), ResponseField.forString("catalog_id", "catalog_id", null, true, Collections.emptyList()), ResponseField.forString("product_retailer_id", "product_retailer_id", null, true, Collections.emptyList()), ResponseField.forString("flow_mode", "flow_mode", null, true, Collections.emptyList()), ResponseField.forString("flow_message_version", "flow_message_version", null, true, Collections.emptyList()), ResponseField.forString("flow_token", "flow_token", null, true, Collections.emptyList()), ResponseField.forString("flow_id", "flow_id", null, true, Collections.emptyList()), ResponseField.forString("flow_cta", "flow_cta", null, true, Collections.emptyList()), ResponseField.forString("flow_action", "flow_action", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String actionName;
        final String addressCountry;
        final String button;
        final String catalog_id;
        final String ctaUrl;
        final String display_text;
        final String flow_action;
        final String flow_cta;
        final String flow_id;
        final String flow_message_version;
        final String flow_mode;
        final String flow_token;
        final String product_retailer_id;
        final List<String> savedAddresses;

        public static final class Mapper implements ResponseFieldMapper<ActionInteractive> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ActionInteractive map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ActionInteractive.$responseFields;
                return new ActionInteractive(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.ActionInteractive.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]));
            }
        }

        public ActionInteractive(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.actionName = str2;
            this.display_text = str3;
            this.ctaUrl = str4;
            this.addressCountry = str5;
            this.savedAddresses = list;
            this.button = str6;
            this.catalog_id = str7;
            this.product_retailer_id = str8;
            this.flow_mode = str9;
            this.flow_message_version = str10;
            this.flow_token = str11;
            this.flow_id = str12;
            this.flow_cta = str13;
            this.flow_action = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String actionName() {
            return this.actionName;
        }

        public String addressCountry() {
            return this.addressCountry;
        }

        public String button() {
            return this.button;
        }

        public String catalog_id() {
            return this.catalog_id;
        }

        public String ctaUrl() {
            return this.ctaUrl;
        }

        public String display_text() {
            return this.display_text;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            List<String> list;
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
            if (!(obj instanceof ActionInteractive)) {
                return false;
            }
            ActionInteractive actionInteractive = (ActionInteractive) obj;
            if (this.__typename.equals(actionInteractive.__typename) && ((str = this.actionName) != null ? str.equals(actionInteractive.actionName) : actionInteractive.actionName == null) && ((str2 = this.display_text) != null ? str2.equals(actionInteractive.display_text) : actionInteractive.display_text == null) && ((str3 = this.ctaUrl) != null ? str3.equals(actionInteractive.ctaUrl) : actionInteractive.ctaUrl == null) && ((str4 = this.addressCountry) != null ? str4.equals(actionInteractive.addressCountry) : actionInteractive.addressCountry == null) && ((list = this.savedAddresses) != null ? list.equals(actionInteractive.savedAddresses) : actionInteractive.savedAddresses == null) && ((str5 = this.button) != null ? str5.equals(actionInteractive.button) : actionInteractive.button == null) && ((str6 = this.catalog_id) != null ? str6.equals(actionInteractive.catalog_id) : actionInteractive.catalog_id == null) && ((str7 = this.product_retailer_id) != null ? str7.equals(actionInteractive.product_retailer_id) : actionInteractive.product_retailer_id == null) && ((str8 = this.flow_mode) != null ? str8.equals(actionInteractive.flow_mode) : actionInteractive.flow_mode == null) && ((str9 = this.flow_message_version) != null ? str9.equals(actionInteractive.flow_message_version) : actionInteractive.flow_message_version == null) && ((str10 = this.flow_token) != null ? str10.equals(actionInteractive.flow_token) : actionInteractive.flow_token == null) && ((str11 = this.flow_id) != null ? str11.equals(actionInteractive.flow_id) : actionInteractive.flow_id == null) && ((str12 = this.flow_cta) != null ? str12.equals(actionInteractive.flow_cta) : actionInteractive.flow_cta == null)) {
                String str13 = this.flow_action;
                String str14 = actionInteractive.flow_action;
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

        public String flow_action() {
            return this.flow_action;
        }

        public String flow_cta() {
            return this.flow_cta;
        }

        public String flow_id() {
            return this.flow_id;
        }

        public String flow_message_version() {
            return this.flow_message_version;
        }

        public String flow_mode() {
            return this.flow_mode;
        }

        public String flow_token() {
            return this.flow_token;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.actionName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.display_text;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ctaUrl;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.addressCountry;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                List<String> list = this.savedAddresses;
                int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str5 = this.button;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.catalog_id;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.product_retailer_id;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.flow_mode;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.flow_message_version;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.flow_token;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.flow_id;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.flow_cta;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.flow_action;
                this.$hashCode = iHashCode14 ^ (str13 != null ? str13.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.ActionInteractive.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ActionInteractive.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ActionInteractive.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ActionInteractive.this.actionName);
                    responseWriter.writeString(responseFieldArr[2], ActionInteractive.this.display_text);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], ActionInteractive.this.ctaUrl);
                    responseWriter.writeString(responseFieldArr[4], ActionInteractive.this.addressCountry);
                    responseWriter.writeList(responseFieldArr[5], ActionInteractive.this.savedAddresses, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.ActionInteractive.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[6], ActionInteractive.this.button);
                    responseWriter.writeString(responseFieldArr[7], ActionInteractive.this.catalog_id);
                    responseWriter.writeString(responseFieldArr[8], ActionInteractive.this.product_retailer_id);
                    responseWriter.writeString(responseFieldArr[9], ActionInteractive.this.flow_mode);
                    responseWriter.writeString(responseFieldArr[10], ActionInteractive.this.flow_message_version);
                    responseWriter.writeString(responseFieldArr[11], ActionInteractive.this.flow_token);
                    responseWriter.writeString(responseFieldArr[12], ActionInteractive.this.flow_id);
                    responseWriter.writeString(responseFieldArr[13], ActionInteractive.this.flow_cta);
                    responseWriter.writeString(responseFieldArr[14], ActionInteractive.this.flow_action);
                }
            };
        }

        public String product_retailer_id() {
            return this.product_retailer_id;
        }

        public List<String> savedAddresses() {
            return this.savedAddresses;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ActionInteractive{__typename=" + this.__typename + ", actionName=" + this.actionName + ", display_text=" + this.display_text + ", ctaUrl=" + this.ctaUrl + ", addressCountry=" + this.addressCountry + ", savedAddresses=" + this.savedAddresses + ", button=" + this.button + ", catalog_id=" + this.catalog_id + ", product_retailer_id=" + this.product_retailer_id + ", flow_mode=" + this.flow_mode + ", flow_message_version=" + this.flow_message_version + ", flow_token=" + this.flow_token + ", flow_id=" + this.flow_id + ", flow_cta=" + this.flow_cta + ", flow_action=" + this.flow_action + "}";
            }
            return this.$toString;
        }
    }

    public static final class Builder {
        public OnUpdateWhasappTemplatesSubscription build() {
            return new OnUpdateWhasappTemplatesSubscription();
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.Component.1
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("onUpdateWhasappTemplates", "onUpdateWhasappTemplates", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final OnUpdateWhasappTemplates onUpdateWhasappTemplates;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final OnUpdateWhasappTemplates.Mapper onUpdateWhasappTemplatesFieldMapper = new OnUpdateWhasappTemplates.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((OnUpdateWhasappTemplates) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<OnUpdateWhasappTemplates>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public OnUpdateWhasappTemplates read(ResponseReader responseReader2) {
                        return Mapper.this.onUpdateWhasappTemplatesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(OnUpdateWhasappTemplates onUpdateWhasappTemplates) {
            this.onUpdateWhasappTemplates = onUpdateWhasappTemplates;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            OnUpdateWhasappTemplates onUpdateWhasappTemplates = this.onUpdateWhasappTemplates;
            OnUpdateWhasappTemplates onUpdateWhasappTemplates2 = ((Data) obj).onUpdateWhasappTemplates;
            return onUpdateWhasappTemplates == null ? onUpdateWhasappTemplates2 == null : onUpdateWhasappTemplates.equals(onUpdateWhasappTemplates2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                OnUpdateWhasappTemplates onUpdateWhasappTemplates = this.onUpdateWhasappTemplates;
                this.$hashCode = (onUpdateWhasappTemplates == null ? 0 : onUpdateWhasappTemplates.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    OnUpdateWhasappTemplates onUpdateWhasappTemplates = Data.this.onUpdateWhasappTemplates;
                    responseWriter.writeObject(responseField, onUpdateWhasappTemplates != null ? onUpdateWhasappTemplates.marshaller() : null);
                }
            };
        }

        public OnUpdateWhasappTemplates onUpdateWhasappTemplates() {
            return this.onUpdateWhasappTemplates;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{onUpdateWhasappTemplates=" + this.onUpdateWhasappTemplates + "}";
            }
            return this.$toString;
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
                List list = responseReader.readList(responseFieldArr[9], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.DefaultMedia.Mapper.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.DefaultMedia.1
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
                    responseWriter.writeList(responseFieldArr[9], DefaultMedia.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.DefaultMedia.1.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.DefaultVariableMap.1
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

    public static class OnUpdateWhasappTemplates {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final ActionInteractive actionInteractive;
        final String archivedAt;
        final String archivedStatus;
        final String category;
        final List<Component> components;
        final String createdAt;
        final String createdBy;
        final DefaultMedia defaultMedia;
        final String defaultMediaId;
        final List<DefaultVariableMap> defaultVariableMap;
        final String footerText;
        final String headerText;
        final String headerType;
        final String id;
        final Boolean isSample;
        final String language;
        final String lastUsed;
        final String locationObjectToSend;
        final String messageSubType;
        final String messageTemplateQualityNew;
        final String messageTemplateQualityPrevious;
        final String messageTemplateQualityUpdatedAt;
        final String messageTemplateStatusUpdatedAt;
        final String messageType;
        final String name;
        final String otherDetail;
        final String platform;
        final String snippetCategory;
        final String snippetSubCategory;
        final String snippetType;
        final String status;
        final String stausUpdateReason;
        final String subCategory;
        final List<String> tags;
        final String templateId;
        final String templateType;
        final String text;
        final String updatedAt;
        final String updatedBy;
        final String whatsappBusinessAccount;

        public static final class Mapper implements ResponseFieldMapper<OnUpdateWhasappTemplates> {
            final Component.Mapper componentFieldMapper = new Component.Mapper();
            final DefaultVariableMap.Mapper defaultVariableMapFieldMapper = new DefaultVariableMap.Mapper();
            final ActionInteractive.Mapper actionInteractiveFieldMapper = new ActionInteractive.Mapper();
            final DefaultMedia.Mapper defaultMediaFieldMapper = new DefaultMedia.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public OnUpdateWhasappTemplates map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = OnUpdateWhasappTemplates.$responseFields;
                return new OnUpdateWhasappTemplates(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readList(responseFieldArr[8], new ResponseReader.ListReader<Component>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Component read(ResponseReader.ListItemReader listItemReader) {
                        return (Component) listItemReader.readObject(new ResponseReader.ObjectReader<Component>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Component read(ResponseReader responseReader2) {
                                return Mapper.this.componentFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readList(responseFieldArr[20], new ResponseReader.ListReader<DefaultVariableMap>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public DefaultVariableMap read(ResponseReader.ListItemReader listItemReader) {
                        return (DefaultVariableMap) listItemReader.readObject(new ResponseReader.ObjectReader<DefaultVariableMap>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.Mapper.2.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public DefaultVariableMap read(ResponseReader responseReader2) {
                                return Mapper.this.defaultVariableMapFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[21]), responseReader.readList(responseFieldArr[22], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readBoolean(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), responseReader.readString(responseFieldArr[25]), responseReader.readString(responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), responseReader.readString(responseFieldArr[30]), (ActionInteractive) responseReader.readObject(responseFieldArr[31], new ResponseReader.ObjectReader<ActionInteractive>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ActionInteractive read(ResponseReader responseReader2) {
                        return Mapper.this.actionInteractiveFieldMapper.map(responseReader2);
                    }
                }), responseReader.readString(responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]), responseReader.readString(responseFieldArr[36]), responseReader.readString(responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[39]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[40]), (DefaultMedia) responseReader.readObject(responseFieldArr[41], new ResponseReader.ObjectReader<DefaultMedia>() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.Mapper.5
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
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("whatsappBusinessAccount", "whatsappBusinessAccount", null, true, customType, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("snippetType", "snippetType", null, true, Collections.emptyList()), ResponseField.forString("platform", "platform", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forList("components", "components", null, true, Collections.emptyList()), ResponseField.forString("language", "language", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forString("subCategory", "subCategory", null, true, Collections.emptyList()), ResponseField.forString("snippetCategory", "snippetCategory", null, true, Collections.emptyList()), ResponseField.forString("snippetSubCategory", "snippetSubCategory", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forString("archivedStatus", "archivedStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("archivedAt", "archivedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("defaultMediaId", "defaultMediaId", null, true, customType, Collections.emptyList()), ResponseField.forList("defaultVariableMap", "defaultVariableMap", null, true, Collections.emptyList()), ResponseField.forString("templateId", "templateId", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forBoolean("isSample", "isSample", null, true, Collections.emptyList()), ResponseField.forString("messageType", "messageType", null, true, Collections.emptyList()), ResponseField.forString("messageSubType", "messageSubType", null, true, Collections.emptyList()), ResponseField.forString("text", "text", null, true, Collections.emptyList()), ResponseField.forCustomType("locationObjectToSend", "locationObjectToSend", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("headerText", "headerText", null, true, Collections.emptyList()), ResponseField.forString("footerText", "footerText", null, true, Collections.emptyList()), ResponseField.forString("headerType", "headerType", null, true, Collections.emptyList()), ResponseField.forObject("actionInteractive", "actionInteractive", null, true, Collections.emptyList()), ResponseField.forString("messageTemplateQualityNew", "messageTemplateQualityNew", null, true, Collections.emptyList()), ResponseField.forString("messageTemplateQualityPrevious", "messageTemplateQualityPrevious", null, true, Collections.emptyList()), ResponseField.forCustomType("messageTemplateQualityUpdatedAt", "messageTemplateQualityUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("messageTemplateStatusUpdatedAt", "messageTemplateStatusUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("stausUpdateReason", "stausUpdateReason", null, true, Collections.emptyList()), ResponseField.forString("otherDetail", "otherDetail", null, true, Collections.emptyList()), ResponseField.forCustomType("lastUsed", "lastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("defaultMedia", "defaultMedia", null, true, Collections.emptyList())};
        }

        public OnUpdateWhasappTemplates(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Component> list, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List<DefaultVariableMap> list2, String str20, List<String> list3, Boolean bool, String str21, String str22, String str23, String str24, String str25, String str26, String str27, ActionInteractive actionInteractive, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, DefaultMedia defaultMedia) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.whatsappBusinessAccount = str4;
            this.templateType = str5;
            this.snippetType = str6;
            this.platform = str7;
            this.name = str8;
            this.components = list;
            this.language = str9;
            this.status = str10;
            this.category = str11;
            this.subCategory = str12;
            this.snippetCategory = str13;
            this.snippetSubCategory = str14;
            this.createdBy = str15;
            this.updatedBy = str16;
            this.archivedStatus = str17;
            this.archivedAt = str18;
            this.defaultMediaId = str19;
            this.defaultVariableMap = list2;
            this.templateId = str20;
            this.tags = list3;
            this.isSample = bool;
            this.messageType = str21;
            this.messageSubType = str22;
            this.text = str23;
            this.locationObjectToSend = str24;
            this.headerText = str25;
            this.footerText = str26;
            this.headerType = str27;
            this.actionInteractive = actionInteractive;
            this.messageTemplateQualityNew = str28;
            this.messageTemplateQualityPrevious = str29;
            this.messageTemplateQualityUpdatedAt = str30;
            this.messageTemplateStatusUpdatedAt = str31;
            this.stausUpdateReason = str32;
            this.otherDetail = str33;
            this.lastUsed = str34;
            this.createdAt = str35;
            this.updatedAt = str36;
            this.defaultMedia = defaultMedia;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ActionInteractive actionInteractive() {
            return this.actionInteractive;
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
            String str3;
            String str4;
            String str5;
            List<Component> list;
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
            List<DefaultVariableMap> list2;
            String str17;
            List<String> list3;
            Boolean bool;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            ActionInteractive actionInteractive;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            String str31;
            String str32;
            String str33;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnUpdateWhasappTemplates)) {
                return false;
            }
            OnUpdateWhasappTemplates onUpdateWhasappTemplates = (OnUpdateWhasappTemplates) obj;
            if (this.__typename.equals(onUpdateWhasappTemplates.__typename) && this.id.equals(onUpdateWhasappTemplates.id) && this.accountId.equals(onUpdateWhasappTemplates.accountId) && ((str = this.whatsappBusinessAccount) != null ? str.equals(onUpdateWhasappTemplates.whatsappBusinessAccount) : onUpdateWhasappTemplates.whatsappBusinessAccount == null) && ((str2 = this.templateType) != null ? str2.equals(onUpdateWhasappTemplates.templateType) : onUpdateWhasappTemplates.templateType == null) && ((str3 = this.snippetType) != null ? str3.equals(onUpdateWhasappTemplates.snippetType) : onUpdateWhasappTemplates.snippetType == null) && ((str4 = this.platform) != null ? str4.equals(onUpdateWhasappTemplates.platform) : onUpdateWhasappTemplates.platform == null) && ((str5 = this.name) != null ? str5.equals(onUpdateWhasappTemplates.name) : onUpdateWhasappTemplates.name == null) && ((list = this.components) != null ? list.equals(onUpdateWhasappTemplates.components) : onUpdateWhasappTemplates.components == null) && ((str6 = this.language) != null ? str6.equals(onUpdateWhasappTemplates.language) : onUpdateWhasappTemplates.language == null) && ((str7 = this.status) != null ? str7.equals(onUpdateWhasappTemplates.status) : onUpdateWhasappTemplates.status == null) && ((str8 = this.category) != null ? str8.equals(onUpdateWhasappTemplates.category) : onUpdateWhasappTemplates.category == null) && ((str9 = this.subCategory) != null ? str9.equals(onUpdateWhasappTemplates.subCategory) : onUpdateWhasappTemplates.subCategory == null) && ((str10 = this.snippetCategory) != null ? str10.equals(onUpdateWhasappTemplates.snippetCategory) : onUpdateWhasappTemplates.snippetCategory == null) && ((str11 = this.snippetSubCategory) != null ? str11.equals(onUpdateWhasappTemplates.snippetSubCategory) : onUpdateWhasappTemplates.snippetSubCategory == null) && ((str12 = this.createdBy) != null ? str12.equals(onUpdateWhasappTemplates.createdBy) : onUpdateWhasappTemplates.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(onUpdateWhasappTemplates.updatedBy) : onUpdateWhasappTemplates.updatedBy == null) && ((str14 = this.archivedStatus) != null ? str14.equals(onUpdateWhasappTemplates.archivedStatus) : onUpdateWhasappTemplates.archivedStatus == null) && ((str15 = this.archivedAt) != null ? str15.equals(onUpdateWhasappTemplates.archivedAt) : onUpdateWhasappTemplates.archivedAt == null) && ((str16 = this.defaultMediaId) != null ? str16.equals(onUpdateWhasappTemplates.defaultMediaId) : onUpdateWhasappTemplates.defaultMediaId == null) && ((list2 = this.defaultVariableMap) != null ? list2.equals(onUpdateWhasappTemplates.defaultVariableMap) : onUpdateWhasappTemplates.defaultVariableMap == null) && ((str17 = this.templateId) != null ? str17.equals(onUpdateWhasappTemplates.templateId) : onUpdateWhasappTemplates.templateId == null) && ((list3 = this.tags) != null ? list3.equals(onUpdateWhasappTemplates.tags) : onUpdateWhasappTemplates.tags == null) && ((bool = this.isSample) != null ? bool.equals(onUpdateWhasappTemplates.isSample) : onUpdateWhasappTemplates.isSample == null) && ((str18 = this.messageType) != null ? str18.equals(onUpdateWhasappTemplates.messageType) : onUpdateWhasappTemplates.messageType == null) && ((str19 = this.messageSubType) != null ? str19.equals(onUpdateWhasappTemplates.messageSubType) : onUpdateWhasappTemplates.messageSubType == null) && ((str20 = this.text) != null ? str20.equals(onUpdateWhasappTemplates.text) : onUpdateWhasappTemplates.text == null) && ((str21 = this.locationObjectToSend) != null ? str21.equals(onUpdateWhasappTemplates.locationObjectToSend) : onUpdateWhasappTemplates.locationObjectToSend == null) && ((str22 = this.headerText) != null ? str22.equals(onUpdateWhasappTemplates.headerText) : onUpdateWhasappTemplates.headerText == null) && ((str23 = this.footerText) != null ? str23.equals(onUpdateWhasappTemplates.footerText) : onUpdateWhasappTemplates.footerText == null) && ((str24 = this.headerType) != null ? str24.equals(onUpdateWhasappTemplates.headerType) : onUpdateWhasappTemplates.headerType == null) && ((actionInteractive = this.actionInteractive) != null ? actionInteractive.equals(onUpdateWhasappTemplates.actionInteractive) : onUpdateWhasappTemplates.actionInteractive == null) && ((str25 = this.messageTemplateQualityNew) != null ? str25.equals(onUpdateWhasappTemplates.messageTemplateQualityNew) : onUpdateWhasappTemplates.messageTemplateQualityNew == null) && ((str26 = this.messageTemplateQualityPrevious) != null ? str26.equals(onUpdateWhasappTemplates.messageTemplateQualityPrevious) : onUpdateWhasappTemplates.messageTemplateQualityPrevious == null) && ((str27 = this.messageTemplateQualityUpdatedAt) != null ? str27.equals(onUpdateWhasappTemplates.messageTemplateQualityUpdatedAt) : onUpdateWhasappTemplates.messageTemplateQualityUpdatedAt == null) && ((str28 = this.messageTemplateStatusUpdatedAt) != null ? str28.equals(onUpdateWhasappTemplates.messageTemplateStatusUpdatedAt) : onUpdateWhasappTemplates.messageTemplateStatusUpdatedAt == null) && ((str29 = this.stausUpdateReason) != null ? str29.equals(onUpdateWhasappTemplates.stausUpdateReason) : onUpdateWhasappTemplates.stausUpdateReason == null) && ((str30 = this.otherDetail) != null ? str30.equals(onUpdateWhasappTemplates.otherDetail) : onUpdateWhasappTemplates.otherDetail == null) && ((str31 = this.lastUsed) != null ? str31.equals(onUpdateWhasappTemplates.lastUsed) : onUpdateWhasappTemplates.lastUsed == null) && ((str32 = this.createdAt) != null ? str32.equals(onUpdateWhasappTemplates.createdAt) : onUpdateWhasappTemplates.createdAt == null) && ((str33 = this.updatedAt) != null ? str33.equals(onUpdateWhasappTemplates.updatedAt) : onUpdateWhasappTemplates.updatedAt == null)) {
                DefaultMedia defaultMedia = this.defaultMedia;
                DefaultMedia defaultMedia2 = onUpdateWhasappTemplates.defaultMedia;
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

        public String footerText() {
            return this.footerText;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.whatsappBusinessAccount;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.templateType;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.snippetType;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.platform;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.name;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<Component> list = this.components;
                int iHashCode7 = (iHashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.language;
                int iHashCode8 = (iHashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.status;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.category;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.subCategory;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.snippetCategory;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.snippetSubCategory;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.createdBy;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedBy;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.archivedStatus;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.archivedAt;
                int iHashCode17 = (iHashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.defaultMediaId;
                int iHashCode18 = (iHashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                List<DefaultVariableMap> list2 = this.defaultVariableMap;
                int iHashCode19 = (iHashCode18 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str17 = this.templateId;
                int iHashCode20 = (iHashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                List<String> list3 = this.tags;
                int iHashCode21 = (iHashCode20 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                Boolean bool = this.isSample;
                int iHashCode22 = (iHashCode21 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str18 = this.messageType;
                int iHashCode23 = (iHashCode22 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.messageSubType;
                int iHashCode24 = (iHashCode23 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.text;
                int iHashCode25 = (iHashCode24 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.locationObjectToSend;
                int iHashCode26 = (iHashCode25 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.headerText;
                int iHashCode27 = (iHashCode26 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.footerText;
                int iHashCode28 = (iHashCode27 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.headerType;
                int iHashCode29 = (iHashCode28 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                ActionInteractive actionInteractive = this.actionInteractive;
                int iHashCode30 = (iHashCode29 ^ (actionInteractive == null ? 0 : actionInteractive.hashCode())) * 1000003;
                String str25 = this.messageTemplateQualityNew;
                int iHashCode31 = (iHashCode30 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.messageTemplateQualityPrevious;
                int iHashCode32 = (iHashCode31 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.messageTemplateQualityUpdatedAt;
                int iHashCode33 = (iHashCode32 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.messageTemplateStatusUpdatedAt;
                int iHashCode34 = (iHashCode33 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.stausUpdateReason;
                int iHashCode35 = (iHashCode34 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.otherDetail;
                int iHashCode36 = (iHashCode35 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                String str31 = this.lastUsed;
                int iHashCode37 = (iHashCode36 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.createdAt;
                int iHashCode38 = (iHashCode37 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.updatedAt;
                int iHashCode39 = (iHashCode38 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                DefaultMedia defaultMedia = this.defaultMedia;
                this.$hashCode = iHashCode39 ^ (defaultMedia != null ? defaultMedia.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String headerText() {
            return this.headerText;
        }

        public String headerType() {
            return this.headerType;
        }

        public String id() {
            return this.id;
        }

        public Boolean isSample() {
            return this.isSample;
        }

        public String language() {
            return this.language;
        }

        public String lastUsed() {
            return this.lastUsed;
        }

        public String locationObjectToSend() {
            return this.locationObjectToSend;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = OnUpdateWhasappTemplates.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], OnUpdateWhasappTemplates.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], OnUpdateWhasappTemplates.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], OnUpdateWhasappTemplates.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], OnUpdateWhasappTemplates.this.whatsappBusinessAccount);
                    responseWriter.writeString(responseFieldArr[4], OnUpdateWhasappTemplates.this.templateType);
                    responseWriter.writeString(responseFieldArr[5], OnUpdateWhasappTemplates.this.snippetType);
                    responseWriter.writeString(responseFieldArr[6], OnUpdateWhasappTemplates.this.platform);
                    responseWriter.writeString(responseFieldArr[7], OnUpdateWhasappTemplates.this.name);
                    responseWriter.writeList(responseFieldArr[8], OnUpdateWhasappTemplates.this.components, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Component) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[9], OnUpdateWhasappTemplates.this.language);
                    responseWriter.writeString(responseFieldArr[10], OnUpdateWhasappTemplates.this.status);
                    responseWriter.writeString(responseFieldArr[11], OnUpdateWhasappTemplates.this.category);
                    responseWriter.writeString(responseFieldArr[12], OnUpdateWhasappTemplates.this.subCategory);
                    responseWriter.writeString(responseFieldArr[13], OnUpdateWhasappTemplates.this.snippetCategory);
                    responseWriter.writeString(responseFieldArr[14], OnUpdateWhasappTemplates.this.snippetSubCategory);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], OnUpdateWhasappTemplates.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], OnUpdateWhasappTemplates.this.updatedBy);
                    responseWriter.writeString(responseFieldArr[17], OnUpdateWhasappTemplates.this.archivedStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], OnUpdateWhasappTemplates.this.archivedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], OnUpdateWhasappTemplates.this.defaultMediaId);
                    responseWriter.writeList(responseFieldArr[20], OnUpdateWhasappTemplates.this.defaultVariableMap, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((DefaultVariableMap) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[21], OnUpdateWhasappTemplates.this.templateId);
                    responseWriter.writeList(responseFieldArr[22], OnUpdateWhasappTemplates.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.OnUpdateWhasappTemplatesSubscription.OnUpdateWhasappTemplates.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeBoolean(responseFieldArr[23], OnUpdateWhasappTemplates.this.isSample);
                    responseWriter.writeString(responseFieldArr[24], OnUpdateWhasappTemplates.this.messageType);
                    responseWriter.writeString(responseFieldArr[25], OnUpdateWhasappTemplates.this.messageSubType);
                    responseWriter.writeString(responseFieldArr[26], OnUpdateWhasappTemplates.this.text);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], OnUpdateWhasappTemplates.this.locationObjectToSend);
                    responseWriter.writeString(responseFieldArr[28], OnUpdateWhasappTemplates.this.headerText);
                    responseWriter.writeString(responseFieldArr[29], OnUpdateWhasappTemplates.this.footerText);
                    responseWriter.writeString(responseFieldArr[30], OnUpdateWhasappTemplates.this.headerType);
                    ResponseField responseField = responseFieldArr[31];
                    ActionInteractive actionInteractive = OnUpdateWhasappTemplates.this.actionInteractive;
                    responseWriter.writeObject(responseField, actionInteractive != null ? actionInteractive.marshaller() : null);
                    responseWriter.writeString(responseFieldArr[32], OnUpdateWhasappTemplates.this.messageTemplateQualityNew);
                    responseWriter.writeString(responseFieldArr[33], OnUpdateWhasappTemplates.this.messageTemplateQualityPrevious);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[34], OnUpdateWhasappTemplates.this.messageTemplateQualityUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], OnUpdateWhasappTemplates.this.messageTemplateStatusUpdatedAt);
                    responseWriter.writeString(responseFieldArr[36], OnUpdateWhasappTemplates.this.stausUpdateReason);
                    responseWriter.writeString(responseFieldArr[37], OnUpdateWhasappTemplates.this.otherDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], OnUpdateWhasappTemplates.this.lastUsed);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[39], OnUpdateWhasappTemplates.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[40], OnUpdateWhasappTemplates.this.updatedAt);
                    ResponseField responseField2 = responseFieldArr[41];
                    DefaultMedia defaultMedia = OnUpdateWhasappTemplates.this.defaultMedia;
                    responseWriter.writeObject(responseField2, defaultMedia != null ? defaultMedia.marshaller() : null);
                }
            };
        }

        public String messageSubType() {
            return this.messageSubType;
        }

        public String messageTemplateQualityNew() {
            return this.messageTemplateQualityNew;
        }

        public String messageTemplateQualityPrevious() {
            return this.messageTemplateQualityPrevious;
        }

        public String messageTemplateQualityUpdatedAt() {
            return this.messageTemplateQualityUpdatedAt;
        }

        public String messageTemplateStatusUpdatedAt() {
            return this.messageTemplateStatusUpdatedAt;
        }

        public String messageType() {
            return this.messageType;
        }

        public String name() {
            return this.name;
        }

        public String otherDetail() {
            return this.otherDetail;
        }

        public String platform() {
            return this.platform;
        }

        public String snippetCategory() {
            return this.snippetCategory;
        }

        public String snippetSubCategory() {
            return this.snippetSubCategory;
        }

        public String snippetType() {
            return this.snippetType;
        }

        public String status() {
            return this.status;
        }

        public String stausUpdateReason() {
            return this.stausUpdateReason;
        }

        public String subCategory() {
            return this.subCategory;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String templateId() {
            return this.templateId;
        }

        public String templateType() {
            return this.templateType;
        }

        public String text() {
            return this.text;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OnUpdateWhasappTemplates{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", whatsappBusinessAccount=" + this.whatsappBusinessAccount + ", templateType=" + this.templateType + ", snippetType=" + this.snippetType + ", platform=" + this.platform + ", name=" + this.name + ", components=" + this.components + ", language=" + this.language + ", status=" + this.status + ", category=" + this.category + ", subCategory=" + this.subCategory + ", snippetCategory=" + this.snippetCategory + ", snippetSubCategory=" + this.snippetSubCategory + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", archivedStatus=" + this.archivedStatus + ", archivedAt=" + this.archivedAt + ", defaultMediaId=" + this.defaultMediaId + ", defaultVariableMap=" + this.defaultVariableMap + ", templateId=" + this.templateId + ", tags=" + this.tags + ", isSample=" + this.isSample + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", text=" + this.text + ", locationObjectToSend=" + this.locationObjectToSend + ", headerText=" + this.headerText + ", footerText=" + this.footerText + ", headerType=" + this.headerType + ", actionInteractive=" + this.actionInteractive + ", messageTemplateQualityNew=" + this.messageTemplateQualityNew + ", messageTemplateQualityPrevious=" + this.messageTemplateQualityPrevious + ", messageTemplateQualityUpdatedAt=" + this.messageTemplateQualityUpdatedAt + ", messageTemplateStatusUpdatedAt=" + this.messageTemplateStatusUpdatedAt + ", stausUpdateReason=" + this.stausUpdateReason + ", otherDetail=" + this.otherDetail + ", lastUsed=" + this.lastUsed + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", defaultMedia=" + this.defaultMedia + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }

        public String whatsappBusinessAccount() {
            return this.whatsappBusinessAccount;
        }
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
        return "3ab82ce01771ea988ab47c7f836579538e08d4f29e2184889a8a746f7fc22ffb";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "subscription OnUpdateWhasappTemplates {\n  onUpdateWhasappTemplates {\n    __typename\n    id\n    accountId\n    whatsappBusinessAccount\n    templateType\n    snippetType\n    platform\n    name\n    components {\n      __typename\n    }\n    language\n    status\n    category\n    subCategory\n    snippetCategory\n    snippetSubCategory\n    createdBy\n    updatedBy\n    archivedStatus\n    archivedAt\n    defaultMediaId\n    defaultVariableMap {\n      __typename\n      taType\n      variableId\n      mappedObject\n      mappedProperty\n      fallBackValue\n      sampleValue\n      index\n      sub_type\n    }\n    templateId\n    tags\n    isSample\n    messageType\n    messageSubType\n    text\n    locationObjectToSend\n    headerText\n    footerText\n    headerType\n    actionInteractive {\n      __typename\n      actionName\n      display_text\n      ctaUrl\n      addressCountry\n      savedAddresses\n      button\n      catalog_id\n      product_retailer_id\n      flow_mode\n      flow_message_version\n      flow_token\n      flow_id\n      flow_cta\n      flow_action\n    }\n    messageTemplateQualityNew\n    messageTemplateQualityPrevious\n    messageTemplateQualityUpdatedAt\n    messageTemplateStatusUpdatedAt\n    stausUpdateReason\n    otherDetail\n    lastUsed\n    createdAt\n    updatedAt\n    defaultMedia {\n      __typename\n      id\n      accountId\n      fileUrl\n      fileStorageDestination\n      fileName\n      description\n      documentCategory\n      documentSubCategory\n      tags\n      templateType\n      templateTitle\n      templateBody\n      templateLastUsed\n      templateExternalLink\n      uploadSource\n      fileMetaData\n      fileMimeType\n      fileThumbnailUrl\n      hasParent\n      parentFileId\n      scopeLevel\n      scopeId\n      uploadedById\n      createdAt\n      updatedAt\n    }\n  }\n}";
    }

    @Override // com.apollographql.apollo.api.Operation
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    @Override // com.apollographql.apollo.api.Operation
    public Operation.Variables variables() {
        return this.variables;
    }

    @Override // com.apollographql.apollo.api.Operation
    public Data wrapData(Data data) {
        return data;
    }
}
