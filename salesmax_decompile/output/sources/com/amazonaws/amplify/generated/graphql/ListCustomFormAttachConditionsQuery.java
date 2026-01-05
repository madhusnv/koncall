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
import type.ModelcustomFormAttachConditionFilterInput;

/* loaded from: classes4.dex */
public final class ListCustomFormAttachConditionsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListCustomFormAttachConditions($filter: ModelcustomFormAttachConditionFilterInput, $limit: Int, $nextToken: String) {\n  listCustomFormAttachConditions(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formId\n      formType\n      callOutcome\n      visitOutcome\n      taskInputType\n      taskType\n      taskOutcomeType\n      dealStage\n      paymentStatus\n      documentCategory\n      documentSubCategory\n      isDefaultFormForType\n      hideDefaultNote\n      createdById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListCustomFormAttachConditions";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListCustomFormAttachConditions($filter: ModelcustomFormAttachConditionFilterInput, $limit: Int, $nextToken: String) {\n  listCustomFormAttachConditions(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formId\n      formType\n      callOutcome\n      visitOutcome\n      taskInputType\n      taskType\n      taskOutcomeType\n      dealStage\n      paymentStatus\n      documentCategory\n      documentSubCategory\n      isDefaultFormForType\n      hideDefaultNote\n      createdById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelcustomFormAttachConditionFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListCustomFormAttachConditionsQuery build() {
            return new ListCustomFormAttachConditionsQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelcustomFormAttachConditionFilterInput modelcustomFormAttachConditionFilterInput) {
            this.filter = modelcustomFormAttachConditionFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listCustomFormAttachConditions", "listCustomFormAttachConditions", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListCustomFormAttachConditions listCustomFormAttachConditions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListCustomFormAttachConditions.Mapper listCustomFormAttachConditionsFieldMapper = new ListCustomFormAttachConditions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListCustomFormAttachConditions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListCustomFormAttachConditions>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListCustomFormAttachConditions read(ResponseReader responseReader2) {
                        return Mapper.this.listCustomFormAttachConditionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListCustomFormAttachConditions listCustomFormAttachConditions) {
            this.listCustomFormAttachConditions = listCustomFormAttachConditions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListCustomFormAttachConditions listCustomFormAttachConditions = this.listCustomFormAttachConditions;
            ListCustomFormAttachConditions listCustomFormAttachConditions2 = ((Data) obj).listCustomFormAttachConditions;
            return listCustomFormAttachConditions == null ? listCustomFormAttachConditions2 == null : listCustomFormAttachConditions.equals(listCustomFormAttachConditions2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListCustomFormAttachConditions listCustomFormAttachConditions = this.listCustomFormAttachConditions;
                this.$hashCode = (listCustomFormAttachConditions == null ? 0 : listCustomFormAttachConditions.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListCustomFormAttachConditions listCustomFormAttachConditions() {
            return this.listCustomFormAttachConditions;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListCustomFormAttachConditions listCustomFormAttachConditions = Data.this.listCustomFormAttachConditions;
                    responseWriter.writeObject(responseField, listCustomFormAttachConditions != null ? listCustomFormAttachConditions.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listCustomFormAttachConditions=" + this.listCustomFormAttachConditions + "}";
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
        final String callOutcome;
        final String createdAt;
        final String createdById;
        final String dealStage;
        final String documentCategory;
        final String documentSubCategory;
        final String formId;
        final String formType;
        final Boolean hideDefaultNote;
        final String id;
        final String isDefaultFormForType;
        final String paymentStatus;
        final String taskInputType;
        final String taskOutcomeType;
        final String taskType;
        final String updatedAt;
        final String updatedById;
        final String visitOutcome;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readBoolean(responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("formId", "formId", null, false, customType, Collections.emptyList()), ResponseField.forString("formType", "formType", null, true, Collections.emptyList()), ResponseField.forString("callOutcome", "callOutcome", null, true, Collections.emptyList()), ResponseField.forString("visitOutcome", "visitOutcome", null, true, Collections.emptyList()), ResponseField.forString("taskInputType", "taskInputType", null, true, Collections.emptyList()), ResponseField.forString("taskType", "taskType", null, true, Collections.emptyList()), ResponseField.forString("taskOutcomeType", "taskOutcomeType", null, true, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, true, Collections.emptyList()), ResponseField.forString("paymentStatus", "paymentStatus", null, true, Collections.emptyList()), ResponseField.forString("documentCategory", "documentCategory", null, true, Collections.emptyList()), ResponseField.forString("documentSubCategory", "documentSubCategory", null, true, Collections.emptyList()), ResponseField.forString("isDefaultFormForType", "isDefaultFormForType", null, true, Collections.emptyList()), ResponseField.forBoolean("hideDefaultNote", "hideDefaultNote", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, String str17, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.formId = (String) Utils.checkNotNull(str4, "formId == null");
            this.formType = str5;
            this.callOutcome = str6;
            this.visitOutcome = str7;
            this.taskInputType = str8;
            this.taskType = str9;
            this.taskOutcomeType = str10;
            this.dealStage = str11;
            this.paymentStatus = str12;
            this.documentCategory = str13;
            this.documentSubCategory = str14;
            this.isDefaultFormForType = str15;
            this.hideDefaultNote = bool;
            this.createdById = str16;
            this.updatedById = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String callOutcome() {
            return this.callOutcome;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String dealStage() {
            return this.dealStage;
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
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            Boolean bool;
            String str12;
            String str13;
            String str14;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.formId.equals(item.formId) && ((str = this.formType) != null ? str.equals(item.formType) : item.formType == null) && ((str2 = this.callOutcome) != null ? str2.equals(item.callOutcome) : item.callOutcome == null) && ((str3 = this.visitOutcome) != null ? str3.equals(item.visitOutcome) : item.visitOutcome == null) && ((str4 = this.taskInputType) != null ? str4.equals(item.taskInputType) : item.taskInputType == null) && ((str5 = this.taskType) != null ? str5.equals(item.taskType) : item.taskType == null) && ((str6 = this.taskOutcomeType) != null ? str6.equals(item.taskOutcomeType) : item.taskOutcomeType == null) && ((str7 = this.dealStage) != null ? str7.equals(item.dealStage) : item.dealStage == null) && ((str8 = this.paymentStatus) != null ? str8.equals(item.paymentStatus) : item.paymentStatus == null) && ((str9 = this.documentCategory) != null ? str9.equals(item.documentCategory) : item.documentCategory == null) && ((str10 = this.documentSubCategory) != null ? str10.equals(item.documentSubCategory) : item.documentSubCategory == null) && ((str11 = this.isDefaultFormForType) != null ? str11.equals(item.isDefaultFormForType) : item.isDefaultFormForType == null) && ((bool = this.hideDefaultNote) != null ? bool.equals(item.hideDefaultNote) : item.hideDefaultNote == null) && ((str12 = this.createdById) != null ? str12.equals(item.createdById) : item.createdById == null) && ((str13 = this.updatedById) != null ? str13.equals(item.updatedById) : item.updatedById == null) && ((str14 = this.createdAt) != null ? str14.equals(item.createdAt) : item.createdAt == null)) {
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

        public String formId() {
            return this.formId;
        }

        public String formType() {
            return this.formType;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.formId.hashCode()) * 1000003;
                String str = this.formType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.callOutcome;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.visitOutcome;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.taskInputType;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.taskType;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.taskOutcomeType;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.dealStage;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.paymentStatus;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.documentCategory;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.documentSubCategory;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.isDefaultFormForType;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.hideDefaultNote;
                int iHashCode13 = (iHashCode12 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str12 = this.createdById;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedById;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode16 = (iHashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode16 ^ (str15 != null ? str15.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean hideDefaultNote() {
            return this.hideDefaultNote;
        }

        public String id() {
            return this.id;
        }

        public String isDefaultFormForType() {
            return this.isDefaultFormForType;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.formId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.formType);
                    responseWriter.writeString(responseFieldArr[5], Item.this.callOutcome);
                    responseWriter.writeString(responseFieldArr[6], Item.this.visitOutcome);
                    responseWriter.writeString(responseFieldArr[7], Item.this.taskInputType);
                    responseWriter.writeString(responseFieldArr[8], Item.this.taskType);
                    responseWriter.writeString(responseFieldArr[9], Item.this.taskOutcomeType);
                    responseWriter.writeString(responseFieldArr[10], Item.this.dealStage);
                    responseWriter.writeString(responseFieldArr[11], Item.this.paymentStatus);
                    responseWriter.writeString(responseFieldArr[12], Item.this.documentCategory);
                    responseWriter.writeString(responseFieldArr[13], Item.this.documentSubCategory);
                    responseWriter.writeString(responseFieldArr[14], Item.this.isDefaultFormForType);
                    responseWriter.writeBoolean(responseFieldArr[15], Item.this.hideDefaultNote);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.updatedAt);
                }
            };
        }

        public String paymentStatus() {
            return this.paymentStatus;
        }

        public String taskInputType() {
            return this.taskInputType;
        }

        public String taskOutcomeType() {
            return this.taskOutcomeType;
        }

        public String taskType() {
            return this.taskType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", formId=" + this.formId + ", formType=" + this.formType + ", callOutcome=" + this.callOutcome + ", visitOutcome=" + this.visitOutcome + ", taskInputType=" + this.taskInputType + ", taskType=" + this.taskType + ", taskOutcomeType=" + this.taskOutcomeType + ", dealStage=" + this.dealStage + ", paymentStatus=" + this.paymentStatus + ", documentCategory=" + this.documentCategory + ", documentSubCategory=" + this.documentSubCategory + ", isDefaultFormForType=" + this.isDefaultFormForType + ", hideDefaultNote=" + this.hideDefaultNote + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public String visitOutcome() {
            return this.visitOutcome;
        }
    }

    public static class ListCustomFormAttachConditions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListCustomFormAttachConditions> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListCustomFormAttachConditions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListCustomFormAttachConditions.$responseFields;
                return new ListCustomFormAttachConditions(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.ListCustomFormAttachConditions.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.ListCustomFormAttachConditions.Mapper.1.1
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

        public ListCustomFormAttachConditions(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListCustomFormAttachConditions)) {
                return false;
            }
            ListCustomFormAttachConditions listCustomFormAttachConditions = (ListCustomFormAttachConditions) obj;
            if (this.__typename.equals(listCustomFormAttachConditions.__typename) && this.items.equals(listCustomFormAttachConditions.items)) {
                String str = this.nextToken;
                String str2 = listCustomFormAttachConditions.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.ListCustomFormAttachConditions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListCustomFormAttachConditions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListCustomFormAttachConditions.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListCustomFormAttachConditions.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.ListCustomFormAttachConditions.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListCustomFormAttachConditions.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListCustomFormAttachConditions{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelcustomFormAttachConditionFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelcustomFormAttachConditionFilterInput modelcustomFormAttachConditionFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelcustomFormAttachConditionFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelcustomFormAttachConditionFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelcustomFormAttachConditionFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListCustomFormAttachConditionsQuery.Variables.1
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

    public ListCustomFormAttachConditionsQuery(ModelcustomFormAttachConditionFilterInput modelcustomFormAttachConditionFilterInput, Integer num, String str) {
        this.variables = new Variables(modelcustomFormAttachConditionFilterInput, num, str);
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
        return "3087993d52ef5e755dbc11e2cf1bf8ae6061200ed899258595bb7e38f3173ea3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListCustomFormAttachConditions($filter: ModelcustomFormAttachConditionFilterInput, $limit: Int, $nextToken: String) {\n  listCustomFormAttachConditions(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      formId\n      formType\n      callOutcome\n      visitOutcome\n      taskInputType\n      taskType\n      taskOutcomeType\n      dealStage\n      paymentStatus\n      documentCategory\n      documentSubCategory\n      isDefaultFormForType\n      hideDefaultNote\n      createdById\n      updatedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
