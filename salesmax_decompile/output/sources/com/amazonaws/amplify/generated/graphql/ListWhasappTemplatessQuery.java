package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
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
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelWhasappTemplatesFilterInput;

/* loaded from: classes4.dex */
public final class ListWhasappTemplatessQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListWhasappTemplatess($filter: ModelWhasappTemplatesFilterInput, $limit: Int, $nextToken: String) {\n  listWhasappTemplatess(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      whatsappBusinessAccount\n      templateType\n      snippetType\n      platform\n      name\n      language\n      status\n      category\n      subCategory\n      snippetCategory\n      snippetSubCategory\n      createdBy\n      updatedBy\n      archivedStatus\n      archivedAt\n      defaultMediaId\n      templateId\n      tags\n      isSample\n      messageType\n      messageSubType\n      text\n      locationObjectToSend\n      headerText\n      footerText\n      headerType\n      messageTemplateQualityNew\n      messageTemplateQualityPrevious\n      messageTemplateQualityUpdatedAt\n      messageTemplateStatusUpdatedAt\n      stausUpdateReason\n      otherDetail\n      lastUsed\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListWhasappTemplatess";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListWhasappTemplatess($filter: ModelWhasappTemplatesFilterInput, $limit: Int, $nextToken: String) {\n  listWhasappTemplatess(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      whatsappBusinessAccount\n      templateType\n      snippetType\n      platform\n      name\n      language\n      status\n      category\n      subCategory\n      snippetCategory\n      snippetSubCategory\n      createdBy\n      updatedBy\n      archivedStatus\n      archivedAt\n      defaultMediaId\n      templateId\n      tags\n      isSample\n      messageType\n      messageSubType\n      text\n      locationObjectToSend\n      headerText\n      footerText\n      headerType\n      messageTemplateQualityNew\n      messageTemplateQualityPrevious\n      messageTemplateQualityUpdatedAt\n      messageTemplateStatusUpdatedAt\n      stausUpdateReason\n      otherDetail\n      lastUsed\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWhasappTemplatesFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListWhasappTemplatessQuery build() {
            return new ListWhasappTemplatessQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelWhasappTemplatesFilterInput modelWhasappTemplatesFilterInput) {
            this.filter = modelWhasappTemplatesFilterInput;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listWhasappTemplatess", "listWhasappTemplatess", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListWhasappTemplatess listWhasappTemplatess;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListWhasappTemplatess.Mapper listWhasappTemplatessFieldMapper = new ListWhasappTemplatess.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListWhasappTemplatess) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListWhasappTemplatess>() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListWhasappTemplatess read(ResponseReader responseReader2) {
                        return Mapper.this.listWhasappTemplatessFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListWhasappTemplatess listWhasappTemplatess) {
            this.listWhasappTemplatess = listWhasappTemplatess;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListWhasappTemplatess listWhasappTemplatess = this.listWhasappTemplatess;
            ListWhasappTemplatess listWhasappTemplatess2 = ((Data) obj).listWhasappTemplatess;
            return listWhasappTemplatess == null ? listWhasappTemplatess2 == null : listWhasappTemplatess.equals(listWhasappTemplatess2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListWhasappTemplatess listWhasappTemplatess = this.listWhasappTemplatess;
                this.$hashCode = (listWhasappTemplatess == null ? 0 : listWhasappTemplatess.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListWhasappTemplatess listWhasappTemplatess() {
            return this.listWhasappTemplatess;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListWhasappTemplatess listWhasappTemplatess = Data.this.listWhasappTemplatess;
                    responseWriter.writeObject(responseField, listWhasappTemplatess != null ? listWhasappTemplatess.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listWhasappTemplatess=" + this.listWhasappTemplatess + "}";
            }
            return this.$toString;
        }
    }

    public static class Item {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String archivedAt;
        final String archivedStatus;
        final String category;
        final String createdAt;
        final String createdBy;
        final String defaultMediaId;
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

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), responseReader.readString(responseFieldArr[19]), responseReader.readList(responseFieldArr[20], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readBoolean(responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), responseReader.readString(responseFieldArr[26]), responseReader.readString(responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), responseReader.readString(responseFieldArr[29]), responseReader.readString(responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), responseReader.readString(responseFieldArr[33]), responseReader.readString(responseFieldArr[34]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[35]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("whatsappBusinessAccount", "whatsappBusinessAccount", null, true, customType, Collections.emptyList()), ResponseField.forString("templateType", "templateType", null, true, Collections.emptyList()), ResponseField.forString("snippetType", "snippetType", null, true, Collections.emptyList()), ResponseField.forString("platform", "platform", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("language", "language", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forString("subCategory", "subCategory", null, true, Collections.emptyList()), ResponseField.forString("snippetCategory", "snippetCategory", null, true, Collections.emptyList()), ResponseField.forString("snippetSubCategory", "snippetSubCategory", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forString("archivedStatus", "archivedStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("archivedAt", "archivedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("defaultMediaId", "defaultMediaId", null, true, customType, Collections.emptyList()), ResponseField.forString("templateId", "templateId", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forBoolean("isSample", "isSample", null, true, Collections.emptyList()), ResponseField.forString("messageType", "messageType", null, true, Collections.emptyList()), ResponseField.forString("messageSubType", "messageSubType", null, true, Collections.emptyList()), ResponseField.forString("text", "text", null, true, Collections.emptyList()), ResponseField.forCustomType("locationObjectToSend", "locationObjectToSend", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("headerText", "headerText", null, true, Collections.emptyList()), ResponseField.forString("footerText", "footerText", null, true, Collections.emptyList()), ResponseField.forString("headerType", "headerType", null, true, Collections.emptyList()), ResponseField.forString("messageTemplateQualityNew", "messageTemplateQualityNew", null, true, Collections.emptyList()), ResponseField.forString("messageTemplateQualityPrevious", "messageTemplateQualityPrevious", null, true, Collections.emptyList()), ResponseField.forCustomType("messageTemplateQualityUpdatedAt", "messageTemplateQualityUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("messageTemplateStatusUpdatedAt", "messageTemplateStatusUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("stausUpdateReason", "stausUpdateReason", null, true, Collections.emptyList()), ResponseField.forString("otherDetail", "otherDetail", null, true, Collections.emptyList()), ResponseField.forCustomType("lastUsed", "lastUsed", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List<String> list, Boolean bool, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.whatsappBusinessAccount = str4;
            this.templateType = str5;
            this.snippetType = str6;
            this.platform = str7;
            this.name = str8;
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
            this.templateId = str20;
            this.tags = list;
            this.isSample = bool;
            this.messageType = str21;
            this.messageSubType = str22;
            this.text = str23;
            this.locationObjectToSend = str24;
            this.headerText = str25;
            this.footerText = str26;
            this.headerType = str27;
            this.messageTemplateQualityNew = str28;
            this.messageTemplateQualityPrevious = str29;
            this.messageTemplateQualityUpdatedAt = str30;
            this.messageTemplateStatusUpdatedAt = str31;
            this.stausUpdateReason = str32;
            this.otherDetail = str33;
            this.lastUsed = str34;
            this.createdAt = str35;
            this.updatedAt = str36;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
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

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public String defaultMediaId() {
            return this.defaultMediaId;
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
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            List<String> list;
            Boolean bool;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            String str31;
            String str32;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.whatsappBusinessAccount) != null ? str.equals(item.whatsappBusinessAccount) : item.whatsappBusinessAccount == null) && ((str2 = this.templateType) != null ? str2.equals(item.templateType) : item.templateType == null) && ((str3 = this.snippetType) != null ? str3.equals(item.snippetType) : item.snippetType == null) && ((str4 = this.platform) != null ? str4.equals(item.platform) : item.platform == null) && ((str5 = this.name) != null ? str5.equals(item.name) : item.name == null) && ((str6 = this.language) != null ? str6.equals(item.language) : item.language == null) && ((str7 = this.status) != null ? str7.equals(item.status) : item.status == null) && ((str8 = this.category) != null ? str8.equals(item.category) : item.category == null) && ((str9 = this.subCategory) != null ? str9.equals(item.subCategory) : item.subCategory == null) && ((str10 = this.snippetCategory) != null ? str10.equals(item.snippetCategory) : item.snippetCategory == null) && ((str11 = this.snippetSubCategory) != null ? str11.equals(item.snippetSubCategory) : item.snippetSubCategory == null) && ((str12 = this.createdBy) != null ? str12.equals(item.createdBy) : item.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(item.updatedBy) : item.updatedBy == null) && ((str14 = this.archivedStatus) != null ? str14.equals(item.archivedStatus) : item.archivedStatus == null) && ((str15 = this.archivedAt) != null ? str15.equals(item.archivedAt) : item.archivedAt == null) && ((str16 = this.defaultMediaId) != null ? str16.equals(item.defaultMediaId) : item.defaultMediaId == null) && ((str17 = this.templateId) != null ? str17.equals(item.templateId) : item.templateId == null) && ((list = this.tags) != null ? list.equals(item.tags) : item.tags == null) && ((bool = this.isSample) != null ? bool.equals(item.isSample) : item.isSample == null) && ((str18 = this.messageType) != null ? str18.equals(item.messageType) : item.messageType == null) && ((str19 = this.messageSubType) != null ? str19.equals(item.messageSubType) : item.messageSubType == null) && ((str20 = this.text) != null ? str20.equals(item.text) : item.text == null) && ((str21 = this.locationObjectToSend) != null ? str21.equals(item.locationObjectToSend) : item.locationObjectToSend == null) && ((str22 = this.headerText) != null ? str22.equals(item.headerText) : item.headerText == null) && ((str23 = this.footerText) != null ? str23.equals(item.footerText) : item.footerText == null) && ((str24 = this.headerType) != null ? str24.equals(item.headerType) : item.headerType == null) && ((str25 = this.messageTemplateQualityNew) != null ? str25.equals(item.messageTemplateQualityNew) : item.messageTemplateQualityNew == null) && ((str26 = this.messageTemplateQualityPrevious) != null ? str26.equals(item.messageTemplateQualityPrevious) : item.messageTemplateQualityPrevious == null) && ((str27 = this.messageTemplateQualityUpdatedAt) != null ? str27.equals(item.messageTemplateQualityUpdatedAt) : item.messageTemplateQualityUpdatedAt == null) && ((str28 = this.messageTemplateStatusUpdatedAt) != null ? str28.equals(item.messageTemplateStatusUpdatedAt) : item.messageTemplateStatusUpdatedAt == null) && ((str29 = this.stausUpdateReason) != null ? str29.equals(item.stausUpdateReason) : item.stausUpdateReason == null) && ((str30 = this.otherDetail) != null ? str30.equals(item.otherDetail) : item.otherDetail == null) && ((str31 = this.lastUsed) != null ? str31.equals(item.lastUsed) : item.lastUsed == null) && ((str32 = this.createdAt) != null ? str32.equals(item.createdAt) : item.createdAt == null)) {
                String str33 = this.updatedAt;
                String str34 = item.updatedAt;
                if (str33 == null) {
                    if (str34 == null) {
                        return true;
                    }
                } else if (str33.equals(str34)) {
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
                String str6 = this.language;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.status;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.category;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.subCategory;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.snippetCategory;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.snippetSubCategory;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.createdBy;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedBy;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.archivedStatus;
                int iHashCode15 = (iHashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.archivedAt;
                int iHashCode16 = (iHashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.defaultMediaId;
                int iHashCode17 = (iHashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.templateId;
                int iHashCode18 = (iHashCode17 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode19 = (iHashCode18 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Boolean bool = this.isSample;
                int iHashCode20 = (iHashCode19 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str18 = this.messageType;
                int iHashCode21 = (iHashCode20 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.messageSubType;
                int iHashCode22 = (iHashCode21 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.text;
                int iHashCode23 = (iHashCode22 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.locationObjectToSend;
                int iHashCode24 = (iHashCode23 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.headerText;
                int iHashCode25 = (iHashCode24 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.footerText;
                int iHashCode26 = (iHashCode25 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.headerType;
                int iHashCode27 = (iHashCode26 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.messageTemplateQualityNew;
                int iHashCode28 = (iHashCode27 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.messageTemplateQualityPrevious;
                int iHashCode29 = (iHashCode28 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.messageTemplateQualityUpdatedAt;
                int iHashCode30 = (iHashCode29 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.messageTemplateStatusUpdatedAt;
                int iHashCode31 = (iHashCode30 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                String str29 = this.stausUpdateReason;
                int iHashCode32 = (iHashCode31 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                String str30 = this.otherDetail;
                int iHashCode33 = (iHashCode32 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                String str31 = this.lastUsed;
                int iHashCode34 = (iHashCode33 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.createdAt;
                int iHashCode35 = (iHashCode34 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                String str33 = this.updatedAt;
                this.$hashCode = iHashCode35 ^ (str33 != null ? str33.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.whatsappBusinessAccount);
                    responseWriter.writeString(responseFieldArr[4], Item.this.templateType);
                    responseWriter.writeString(responseFieldArr[5], Item.this.snippetType);
                    responseWriter.writeString(responseFieldArr[6], Item.this.platform);
                    responseWriter.writeString(responseFieldArr[7], Item.this.name);
                    responseWriter.writeString(responseFieldArr[8], Item.this.language);
                    responseWriter.writeString(responseFieldArr[9], Item.this.status);
                    responseWriter.writeString(responseFieldArr[10], Item.this.category);
                    responseWriter.writeString(responseFieldArr[11], Item.this.subCategory);
                    responseWriter.writeString(responseFieldArr[12], Item.this.snippetCategory);
                    responseWriter.writeString(responseFieldArr[13], Item.this.snippetSubCategory);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedBy);
                    responseWriter.writeString(responseFieldArr[16], Item.this.archivedStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.archivedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.defaultMediaId);
                    responseWriter.writeString(responseFieldArr[19], Item.this.templateId);
                    responseWriter.writeList(responseFieldArr[20], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeBoolean(responseFieldArr[21], Item.this.isSample);
                    responseWriter.writeString(responseFieldArr[22], Item.this.messageType);
                    responseWriter.writeString(responseFieldArr[23], Item.this.messageSubType);
                    responseWriter.writeString(responseFieldArr[24], Item.this.text);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Item.this.locationObjectToSend);
                    responseWriter.writeString(responseFieldArr[26], Item.this.headerText);
                    responseWriter.writeString(responseFieldArr[27], Item.this.footerText);
                    responseWriter.writeString(responseFieldArr[28], Item.this.headerType);
                    responseWriter.writeString(responseFieldArr[29], Item.this.messageTemplateQualityNew);
                    responseWriter.writeString(responseFieldArr[30], Item.this.messageTemplateQualityPrevious);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], Item.this.messageTemplateQualityUpdatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Item.this.messageTemplateStatusUpdatedAt);
                    responseWriter.writeString(responseFieldArr[33], Item.this.stausUpdateReason);
                    responseWriter.writeString(responseFieldArr[34], Item.this.otherDetail);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[35], Item.this.lastUsed);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[36], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], Item.this.updatedAt);
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
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", whatsappBusinessAccount=" + this.whatsappBusinessAccount + ", templateType=" + this.templateType + ", snippetType=" + this.snippetType + ", platform=" + this.platform + ", name=" + this.name + ", language=" + this.language + ", status=" + this.status + ", category=" + this.category + ", subCategory=" + this.subCategory + ", snippetCategory=" + this.snippetCategory + ", snippetSubCategory=" + this.snippetSubCategory + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", archivedStatus=" + this.archivedStatus + ", archivedAt=" + this.archivedAt + ", defaultMediaId=" + this.defaultMediaId + ", templateId=" + this.templateId + ", tags=" + this.tags + ", isSample=" + this.isSample + ", messageType=" + this.messageType + ", messageSubType=" + this.messageSubType + ", text=" + this.text + ", locationObjectToSend=" + this.locationObjectToSend + ", headerText=" + this.headerText + ", footerText=" + this.footerText + ", headerType=" + this.headerType + ", messageTemplateQualityNew=" + this.messageTemplateQualityNew + ", messageTemplateQualityPrevious=" + this.messageTemplateQualityPrevious + ", messageTemplateQualityUpdatedAt=" + this.messageTemplateQualityUpdatedAt + ", messageTemplateStatusUpdatedAt=" + this.messageTemplateStatusUpdatedAt + ", stausUpdateReason=" + this.stausUpdateReason + ", otherDetail=" + this.otherDetail + ", lastUsed=" + this.lastUsed + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class ListWhasappTemplatess {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListWhasappTemplatess> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListWhasappTemplatess map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListWhasappTemplatess.$responseFields;
                return new ListWhasappTemplatess(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.ListWhasappTemplatess.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.ListWhasappTemplatess.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]));
            }
        }

        public ListWhasappTemplatess(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListWhasappTemplatess)) {
                return false;
            }
            ListWhasappTemplatess listWhasappTemplatess = (ListWhasappTemplatess) obj;
            if (this.__typename.equals(listWhasappTemplatess.__typename) && this.items.equals(listWhasappTemplatess.items)) {
                String str = this.nextToken;
                String str2 = listWhasappTemplatess.nextToken;
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
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.ListWhasappTemplatess.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListWhasappTemplatess.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListWhasappTemplatess.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListWhasappTemplatess.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.ListWhasappTemplatess.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListWhasappTemplatess.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListWhasappTemplatess{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWhasappTemplatesFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelWhasappTemplatesFilterInput modelWhasappTemplatesFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelWhasappTemplatesFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelWhasappTemplatesFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelWhasappTemplatesFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWhasappTemplatessQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListWhasappTemplatessQuery(ModelWhasappTemplatesFilterInput modelWhasappTemplatesFilterInput, Integer num, String str) {
        this.variables = new Variables(modelWhasappTemplatesFilterInput, num, str);
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
        return "7ad077d88ba5ea6203b56095aafc96798154455e82cf426817e4269e982b13e2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListWhasappTemplatess($filter: ModelWhasappTemplatesFilterInput, $limit: Int, $nextToken: String) {\n  listWhasappTemplatess(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      whatsappBusinessAccount\n      templateType\n      snippetType\n      platform\n      name\n      language\n      status\n      category\n      subCategory\n      snippetCategory\n      snippetSubCategory\n      createdBy\n      updatedBy\n      archivedStatus\n      archivedAt\n      defaultMediaId\n      templateId\n      tags\n      isSample\n      messageType\n      messageSubType\n      text\n      locationObjectToSend\n      headerText\n      footerText\n      headerType\n      messageTemplateQualityNew\n      messageTemplateQualityPrevious\n      messageTemplateQualityUpdatedAt\n      messageTemplateStatusUpdatedAt\n      stausUpdateReason\n      otherDetail\n      lastUsed\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
