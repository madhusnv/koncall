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
import type.ModelTemplateGalleryFilterInput;

/* loaded from: classes4.dex */
public final class ListTemplateGallerysQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListTemplateGallerys($filter: ModelTemplateGalleryFilterInput, $limit: Int, $nextToken: String) {\n  listTemplateGallerys(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      platform\n      name\n      language\n      status\n      category\n      createdBy\n      updatedBy\n      archivedStatus\n      archivedAt\n      defaultMediaId\n      templateId\n      tags\n      categoryLevelOne\n      categoryLevelTwo\n      applicableForIndustry\n      viewedTimes\n      savedToWorkspaceTimes\n      sentToWhatsappTimes\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListTemplateGallerys";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListTemplateGallerys($filter: ModelTemplateGalleryFilterInput, $limit: Int, $nextToken: String) {\n  listTemplateGallerys(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      platform\n      name\n      language\n      status\n      category\n      createdBy\n      updatedBy\n      archivedStatus\n      archivedAt\n      defaultMediaId\n      templateId\n      tags\n      categoryLevelOne\n      categoryLevelTwo\n      applicableForIndustry\n      viewedTimes\n      savedToWorkspaceTimes\n      sentToWhatsappTimes\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelTemplateGalleryFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListTemplateGallerysQuery build() {
            return new ListTemplateGallerysQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelTemplateGalleryFilterInput modelTemplateGalleryFilterInput) {
            this.filter = modelTemplateGalleryFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listTemplateGallerys", "listTemplateGallerys", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListTemplateGallerys listTemplateGallerys;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListTemplateGallerys.Mapper listTemplateGallerysFieldMapper = new ListTemplateGallerys.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListTemplateGallerys) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListTemplateGallerys>() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListTemplateGallerys read(ResponseReader responseReader2) {
                        return Mapper.this.listTemplateGallerysFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListTemplateGallerys listTemplateGallerys) {
            this.listTemplateGallerys = listTemplateGallerys;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListTemplateGallerys listTemplateGallerys = this.listTemplateGallerys;
            ListTemplateGallerys listTemplateGallerys2 = ((Data) obj).listTemplateGallerys;
            return listTemplateGallerys == null ? listTemplateGallerys2 == null : listTemplateGallerys.equals(listTemplateGallerys2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListTemplateGallerys listTemplateGallerys = this.listTemplateGallerys;
                this.$hashCode = (listTemplateGallerys == null ? 0 : listTemplateGallerys.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListTemplateGallerys listTemplateGallerys() {
            return this.listTemplateGallerys;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListTemplateGallerys listTemplateGallerys = Data.this.listTemplateGallerys;
                    responseWriter.writeObject(responseField, listTemplateGallerys != null ? listTemplateGallerys.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listTemplateGallerys=" + this.listTemplateGallerys + "}";
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
        final List<String> applicableForIndustry;
        final String archivedAt;
        final String archivedStatus;
        final String category;
        final String categoryLevelOne;
        final String categoryLevelTwo;
        final String createdAt;
        final String createdBy;
        final String defaultMediaId;
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

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readList(responseFieldArr[13], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readList(responseFieldArr[16], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Item.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readInt(responseFieldArr[17]), responseReader.readInt(responseFieldArr[18]), responseReader.readInt(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("platform", "platform", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("language", "language", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("category", "category", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forString("archivedStatus", "archivedStatus", null, true, Collections.emptyList()), ResponseField.forCustomType("archivedAt", "archivedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("defaultMediaId", "defaultMediaId", null, true, customType, Collections.emptyList()), ResponseField.forString("templateId", "templateId", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("categoryLevelOne", "categoryLevelOne", null, true, Collections.emptyList()), ResponseField.forString("categoryLevelTwo", "categoryLevelTwo", null, true, Collections.emptyList()), ResponseField.forList("applicableForIndustry", "applicableForIndustry", null, true, Collections.emptyList()), ResponseField.forInt("viewedTimes", "viewedTimes", null, true, Collections.emptyList()), ResponseField.forInt("savedToWorkspaceTimes", "savedToWorkspaceTimes", null, true, Collections.emptyList()), ResponseField.forInt("sentToWhatsappTimes", "sentToWhatsappTimes", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<String> list, String str14, String str15, List<String> list2, Integer num, Integer num2, Integer num3, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.platform = str3;
            this.name = str4;
            this.language = str5;
            this.status = str6;
            this.category = str7;
            this.createdBy = str8;
            this.updatedBy = str9;
            this.archivedStatus = str10;
            this.archivedAt = str11;
            this.defaultMediaId = str12;
            this.templateId = str13;
            this.tags = list;
            this.categoryLevelOne = str14;
            this.categoryLevelTwo = str15;
            this.applicableForIndustry = list2;
            this.viewedTimes = num;
            this.savedToWorkspaceTimes = num2;
            this.sentToWhatsappTimes = num3;
            this.createdAt = str16;
            this.updatedAt = str17;
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
            List<String> list;
            String str12;
            String str13;
            List<String> list2;
            Integer num;
            Integer num2;
            Integer num3;
            String str14;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && ((str = this.platform) != null ? str.equals(item.platform) : item.platform == null) && ((str2 = this.name) != null ? str2.equals(item.name) : item.name == null) && ((str3 = this.language) != null ? str3.equals(item.language) : item.language == null) && ((str4 = this.status) != null ? str4.equals(item.status) : item.status == null) && ((str5 = this.category) != null ? str5.equals(item.category) : item.category == null) && ((str6 = this.createdBy) != null ? str6.equals(item.createdBy) : item.createdBy == null) && ((str7 = this.updatedBy) != null ? str7.equals(item.updatedBy) : item.updatedBy == null) && ((str8 = this.archivedStatus) != null ? str8.equals(item.archivedStatus) : item.archivedStatus == null) && ((str9 = this.archivedAt) != null ? str9.equals(item.archivedAt) : item.archivedAt == null) && ((str10 = this.defaultMediaId) != null ? str10.equals(item.defaultMediaId) : item.defaultMediaId == null) && ((str11 = this.templateId) != null ? str11.equals(item.templateId) : item.templateId == null) && ((list = this.tags) != null ? list.equals(item.tags) : item.tags == null) && ((str12 = this.categoryLevelOne) != null ? str12.equals(item.categoryLevelOne) : item.categoryLevelOne == null) && ((str13 = this.categoryLevelTwo) != null ? str13.equals(item.categoryLevelTwo) : item.categoryLevelTwo == null) && ((list2 = this.applicableForIndustry) != null ? list2.equals(item.applicableForIndustry) : item.applicableForIndustry == null) && ((num = this.viewedTimes) != null ? num.equals(item.viewedTimes) : item.viewedTimes == null) && ((num2 = this.savedToWorkspaceTimes) != null ? num2.equals(item.savedToWorkspaceTimes) : item.savedToWorkspaceTimes == null) && ((num3 = this.sentToWhatsappTimes) != null ? num3.equals(item.sentToWhatsappTimes) : item.sentToWhatsappTimes == null) && ((str14 = this.createdAt) != null ? str14.equals(item.createdAt) : item.createdAt == null)) {
                String str15 = this.updatedAt;
                String str16 = item.updatedAt;
                if (str15 == null) {
                    if (str16 == null) {
                        return true;
                    }
                } else if (str15.equals(str16)) {
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
                String str3 = this.language;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.status;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.category;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.createdBy;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedBy;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.archivedStatus;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.archivedAt;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.defaultMediaId;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.templateId;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode13 = (iHashCode12 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str12 = this.categoryLevelOne;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.categoryLevelTwo;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                List<String> list2 = this.applicableForIndustry;
                int iHashCode16 = (iHashCode15 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Integer num = this.viewedTimes;
                int iHashCode17 = (iHashCode16 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.savedToWorkspaceTimes;
                int iHashCode18 = (iHashCode17 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sentToWhatsappTimes;
                int iHashCode19 = (iHashCode18 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode20 = (iHashCode19 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode20 ^ (str15 != null ? str15.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeString(responseFieldArr[2], Item.this.platform);
                    responseWriter.writeString(responseFieldArr[3], Item.this.name);
                    responseWriter.writeString(responseFieldArr[4], Item.this.language);
                    responseWriter.writeString(responseFieldArr[5], Item.this.status);
                    responseWriter.writeString(responseFieldArr[6], Item.this.category);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.updatedBy);
                    responseWriter.writeString(responseFieldArr[9], Item.this.archivedStatus);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.archivedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.defaultMediaId);
                    responseWriter.writeString(responseFieldArr[12], Item.this.templateId);
                    responseWriter.writeList(responseFieldArr[13], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[14], Item.this.categoryLevelOne);
                    responseWriter.writeString(responseFieldArr[15], Item.this.categoryLevelTwo);
                    responseWriter.writeList(responseFieldArr[16], Item.this.applicableForIndustry, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Item.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[17], Item.this.viewedTimes);
                    responseWriter.writeInt(responseFieldArr[18], Item.this.savedToWorkspaceTimes);
                    responseWriter.writeInt(responseFieldArr[19], Item.this.sentToWhatsappTimes);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.updatedAt);
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
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", platform=" + this.platform + ", name=" + this.name + ", language=" + this.language + ", status=" + this.status + ", category=" + this.category + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", archivedStatus=" + this.archivedStatus + ", archivedAt=" + this.archivedAt + ", defaultMediaId=" + this.defaultMediaId + ", templateId=" + this.templateId + ", tags=" + this.tags + ", categoryLevelOne=" + this.categoryLevelOne + ", categoryLevelTwo=" + this.categoryLevelTwo + ", applicableForIndustry=" + this.applicableForIndustry + ", viewedTimes=" + this.viewedTimes + ", savedToWorkspaceTimes=" + this.savedToWorkspaceTimes + ", sentToWhatsappTimes=" + this.sentToWhatsappTimes + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class ListTemplateGallerys {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListTemplateGallerys> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListTemplateGallerys map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListTemplateGallerys.$responseFields;
                return new ListTemplateGallerys(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.ListTemplateGallerys.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.ListTemplateGallerys.Mapper.1.1
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

        public ListTemplateGallerys(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListTemplateGallerys)) {
                return false;
            }
            ListTemplateGallerys listTemplateGallerys = (ListTemplateGallerys) obj;
            if (this.__typename.equals(listTemplateGallerys.__typename) && this.items.equals(listTemplateGallerys.items)) {
                String str = this.nextToken;
                String str2 = listTemplateGallerys.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.ListTemplateGallerys.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListTemplateGallerys.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListTemplateGallerys.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListTemplateGallerys.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.ListTemplateGallerys.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListTemplateGallerys.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListTemplateGallerys{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelTemplateGalleryFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelTemplateGalleryFilterInput modelTemplateGalleryFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelTemplateGalleryFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelTemplateGalleryFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelTemplateGalleryFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListTemplateGallerysQuery.Variables.1
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

    public ListTemplateGallerysQuery(ModelTemplateGalleryFilterInput modelTemplateGalleryFilterInput, Integer num, String str) {
        this.variables = new Variables(modelTemplateGalleryFilterInput, num, str);
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
        return "b4ecdaa59c1fb0630ceacfaf428fa51dda4c79d7586dd54292f189e6290ca5af";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListTemplateGallerys($filter: ModelTemplateGalleryFilterInput, $limit: Int, $nextToken: String) {\n  listTemplateGallerys(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      platform\n      name\n      language\n      status\n      category\n      createdBy\n      updatedBy\n      archivedStatus\n      archivedAt\n      defaultMediaId\n      templateId\n      tags\n      categoryLevelOne\n      categoryLevelTwo\n      applicableForIndustry\n      viewedTimes\n      savedToWorkspaceTimes\n      sentToWhatsappTimes\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
