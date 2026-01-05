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
import type.ModelWabaPhoneNumberNewFilterInput;

/* loaded from: classes4.dex */
public final class ListWabaPhoneNumberNewsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListWabaPhoneNumberNews($filter: ModelWabaPhoneNumberNewFilterInput, $limit: Int, $nextToken: String) {\n  listWabaPhoneNumberNews(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      wabaAccountId\n      accountId\n      phoneNumberId\n      phoneNumber\n      isDefault\n      accessToken\n      name\n      internalName\n      quota\n      currentLimitCategory\n      status\n      qualityRating\n      entityListId\n      createdAt\n      updatedAt\n      welcomeMessage\n      requestedDisplayName\n      displayNameUpdate\n      displayNameUpdateDateTime\n      wabaNumberDecision\n      wabaNumberDecisionTime\n      rejectionReason\n      phoneNumberQualityUpdate\n      phoneNumberQualityUpdateTime\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListWabaPhoneNumberNews";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListWabaPhoneNumberNews($filter: ModelWabaPhoneNumberNewFilterInput, $limit: Int, $nextToken: String) {\n  listWabaPhoneNumberNews(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      wabaAccountId\n      accountId\n      phoneNumberId\n      phoneNumber\n      isDefault\n      accessToken\n      name\n      internalName\n      quota\n      currentLimitCategory\n      status\n      qualityRating\n      entityListId\n      createdAt\n      updatedAt\n      welcomeMessage\n      requestedDisplayName\n      displayNameUpdate\n      displayNameUpdateDateTime\n      wabaNumberDecision\n      wabaNumberDecisionTime\n      rejectionReason\n      phoneNumberQualityUpdate\n      phoneNumberQualityUpdateTime\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelWabaPhoneNumberNewFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListWabaPhoneNumberNewsQuery build() {
            return new ListWabaPhoneNumberNewsQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelWabaPhoneNumberNewFilterInput modelWabaPhoneNumberNewFilterInput) {
            this.filter = modelWabaPhoneNumberNewFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listWabaPhoneNumberNews", "listWabaPhoneNumberNews", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListWabaPhoneNumberNews listWabaPhoneNumberNews;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListWabaPhoneNumberNews.Mapper listWabaPhoneNumberNewsFieldMapper = new ListWabaPhoneNumberNews.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListWabaPhoneNumberNews) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListWabaPhoneNumberNews>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListWabaPhoneNumberNews read(ResponseReader responseReader2) {
                        return Mapper.this.listWabaPhoneNumberNewsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListWabaPhoneNumberNews listWabaPhoneNumberNews) {
            this.listWabaPhoneNumberNews = listWabaPhoneNumberNews;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListWabaPhoneNumberNews listWabaPhoneNumberNews = this.listWabaPhoneNumberNews;
            ListWabaPhoneNumberNews listWabaPhoneNumberNews2 = ((Data) obj).listWabaPhoneNumberNews;
            return listWabaPhoneNumberNews == null ? listWabaPhoneNumberNews2 == null : listWabaPhoneNumberNews.equals(listWabaPhoneNumberNews2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListWabaPhoneNumberNews listWabaPhoneNumberNews = this.listWabaPhoneNumberNews;
                this.$hashCode = (listWabaPhoneNumberNews == null ? 0 : listWabaPhoneNumberNews.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListWabaPhoneNumberNews listWabaPhoneNumberNews() {
            return this.listWabaPhoneNumberNews;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListWabaPhoneNumberNews listWabaPhoneNumberNews = Data.this.listWabaPhoneNumberNews;
                    responseWriter.writeObject(responseField, listWabaPhoneNumberNews != null ? listWabaPhoneNumberNews.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listWabaPhoneNumberNews=" + this.listWabaPhoneNumberNews + "}";
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
        final String accessToken;
        final String accountId;
        final String createdAt;
        final String createdById;
        final String currentLimitCategory;
        final String displayNameUpdate;
        final String displayNameUpdateDateTime;
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

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readInt(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), responseReader.readString(responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[27]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("wabaAccountId", "wabaAccountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumberId", "phoneNumberId", null, false, customType, Collections.emptyList()), ResponseField.forString("phoneNumber", "phoneNumber", null, false, Collections.emptyList()), ResponseField.forBoolean("isDefault", "isDefault", null, true, Collections.emptyList()), ResponseField.forString("accessToken", "accessToken", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString("internalName", "internalName", null, true, Collections.emptyList()), ResponseField.forInt("quota", "quota", null, true, Collections.emptyList()), ResponseField.forString("currentLimitCategory", "currentLimitCategory", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("qualityRating", "qualityRating", null, true, Collections.emptyList()), ResponseField.forCustomType("entityListId", "entityListId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("welcomeMessage", "welcomeMessage", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("requestedDisplayName", "requestedDisplayName", null, true, Collections.emptyList()), ResponseField.forString("displayNameUpdate", "displayNameUpdate", null, true, Collections.emptyList()), ResponseField.forCustomType("displayNameUpdateDateTime", "displayNameUpdateDateTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("wabaNumberDecision", "wabaNumberDecision", null, true, Collections.emptyList()), ResponseField.forCustomType("wabaNumberDecisionTime", "wabaNumberDecisionTime", null, true, customType2, Collections.emptyList()), ResponseField.forString("rejectionReason", "rejectionReason", null, true, Collections.emptyList()), ResponseField.forString("phoneNumberQualityUpdate", "phoneNumberQualityUpdate", null, true, Collections.emptyList()), ResponseField.forCustomType("phoneNumberQualityUpdateTime", "phoneNumberQualityUpdateTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.wabaAccountId.equals(item.wabaAccountId) && this.accountId.equals(item.accountId) && this.phoneNumberId.equals(item.phoneNumberId) && this.phoneNumber.equals(item.phoneNumber) && ((bool = this.isDefault) != null ? bool.equals(item.isDefault) : item.isDefault == null) && ((str = this.accessToken) != null ? str.equals(item.accessToken) : item.accessToken == null) && ((str2 = this.name) != null ? str2.equals(item.name) : item.name == null) && ((str3 = this.internalName) != null ? str3.equals(item.internalName) : item.internalName == null) && ((num = this.quota) != null ? num.equals(item.quota) : item.quota == null) && ((str4 = this.currentLimitCategory) != null ? str4.equals(item.currentLimitCategory) : item.currentLimitCategory == null) && ((str5 = this.status) != null ? str5.equals(item.status) : item.status == null) && ((str6 = this.qualityRating) != null ? str6.equals(item.qualityRating) : item.qualityRating == null) && ((str7 = this.entityListId) != null ? str7.equals(item.entityListId) : item.entityListId == null) && ((str8 = this.createdAt) != null ? str8.equals(item.createdAt) : item.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(item.updatedAt) : item.updatedAt == null) && ((str10 = this.welcomeMessage) != null ? str10.equals(item.welcomeMessage) : item.welcomeMessage == null) && ((str11 = this.requestedDisplayName) != null ? str11.equals(item.requestedDisplayName) : item.requestedDisplayName == null) && ((str12 = this.displayNameUpdate) != null ? str12.equals(item.displayNameUpdate) : item.displayNameUpdate == null) && ((str13 = this.displayNameUpdateDateTime) != null ? str13.equals(item.displayNameUpdateDateTime) : item.displayNameUpdateDateTime == null) && ((str14 = this.wabaNumberDecision) != null ? str14.equals(item.wabaNumberDecision) : item.wabaNumberDecision == null) && ((str15 = this.wabaNumberDecisionTime) != null ? str15.equals(item.wabaNumberDecisionTime) : item.wabaNumberDecisionTime == null) && ((str16 = this.rejectionReason) != null ? str16.equals(item.rejectionReason) : item.rejectionReason == null) && ((str17 = this.phoneNumberQualityUpdate) != null ? str17.equals(item.phoneNumberQualityUpdate) : item.phoneNumberQualityUpdate == null) && ((str18 = this.phoneNumberQualityUpdateTime) != null ? str18.equals(item.phoneNumberQualityUpdateTime) : item.phoneNumberQualityUpdateTime == null) && ((str19 = this.createdById) != null ? str19.equals(item.createdById) : item.createdById == null)) {
                String str20 = this.updatedById;
                String str21 = item.updatedById;
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
                this.$hashCode = iHashCode22 ^ (str20 != null ? str20.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.wabaAccountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.phoneNumberId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.phoneNumber);
                    responseWriter.writeBoolean(responseFieldArr[6], Item.this.isDefault);
                    responseWriter.writeString(responseFieldArr[7], Item.this.accessToken);
                    responseWriter.writeString(responseFieldArr[8], Item.this.name);
                    responseWriter.writeString(responseFieldArr[9], Item.this.internalName);
                    responseWriter.writeInt(responseFieldArr[10], Item.this.quota);
                    responseWriter.writeString(responseFieldArr[11], Item.this.currentLimitCategory);
                    responseWriter.writeString(responseFieldArr[12], Item.this.status);
                    responseWriter.writeString(responseFieldArr[13], Item.this.qualityRating);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.entityListId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.welcomeMessage);
                    responseWriter.writeString(responseFieldArr[18], Item.this.requestedDisplayName);
                    responseWriter.writeString(responseFieldArr[19], Item.this.displayNameUpdate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.displayNameUpdateDateTime);
                    responseWriter.writeString(responseFieldArr[21], Item.this.wabaNumberDecision);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.wabaNumberDecisionTime);
                    responseWriter.writeString(responseFieldArr[23], Item.this.rejectionReason);
                    responseWriter.writeString(responseFieldArr[24], Item.this.phoneNumberQualityUpdate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Item.this.phoneNumberQualityUpdateTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[27], Item.this.updatedById);
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
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", wabaAccountId=" + this.wabaAccountId + ", accountId=" + this.accountId + ", phoneNumberId=" + this.phoneNumberId + ", phoneNumber=" + this.phoneNumber + ", isDefault=" + this.isDefault + ", accessToken=" + this.accessToken + ", name=" + this.name + ", internalName=" + this.internalName + ", quota=" + this.quota + ", currentLimitCategory=" + this.currentLimitCategory + ", status=" + this.status + ", qualityRating=" + this.qualityRating + ", entityListId=" + this.entityListId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", welcomeMessage=" + this.welcomeMessage + ", requestedDisplayName=" + this.requestedDisplayName + ", displayNameUpdate=" + this.displayNameUpdate + ", displayNameUpdateDateTime=" + this.displayNameUpdateDateTime + ", wabaNumberDecision=" + this.wabaNumberDecision + ", wabaNumberDecisionTime=" + this.wabaNumberDecisionTime + ", rejectionReason=" + this.rejectionReason + ", phoneNumberQualityUpdate=" + this.phoneNumberQualityUpdate + ", phoneNumberQualityUpdateTime=" + this.phoneNumberQualityUpdateTime + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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

    public static class ListWabaPhoneNumberNews {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListWabaPhoneNumberNews> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListWabaPhoneNumberNews map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListWabaPhoneNumberNews.$responseFields;
                return new ListWabaPhoneNumberNews(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.ListWabaPhoneNumberNews.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.ListWabaPhoneNumberNews.Mapper.1.1
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

        public ListWabaPhoneNumberNews(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListWabaPhoneNumberNews)) {
                return false;
            }
            ListWabaPhoneNumberNews listWabaPhoneNumberNews = (ListWabaPhoneNumberNews) obj;
            if (this.__typename.equals(listWabaPhoneNumberNews.__typename) && this.items.equals(listWabaPhoneNumberNews.items)) {
                String str = this.nextToken;
                String str2 = listWabaPhoneNumberNews.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.ListWabaPhoneNumberNews.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListWabaPhoneNumberNews.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListWabaPhoneNumberNews.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListWabaPhoneNumberNews.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.ListWabaPhoneNumberNews.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListWabaPhoneNumberNews.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListWabaPhoneNumberNews{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelWabaPhoneNumberNewFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelWabaPhoneNumberNewFilterInput modelWabaPhoneNumberNewFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelWabaPhoneNumberNewFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelWabaPhoneNumberNewFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelWabaPhoneNumberNewFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListWabaPhoneNumberNewsQuery.Variables.1
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

    public ListWabaPhoneNumberNewsQuery(ModelWabaPhoneNumberNewFilterInput modelWabaPhoneNumberNewFilterInput, Integer num, String str) {
        this.variables = new Variables(modelWabaPhoneNumberNewFilterInput, num, str);
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
        return "dd04decd13808e0df98aaa0c972381000757ab41ea47e1b37077e9d4be523694";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListWabaPhoneNumberNews($filter: ModelWabaPhoneNumberNewFilterInput, $limit: Int, $nextToken: String) {\n  listWabaPhoneNumberNews(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      wabaAccountId\n      accountId\n      phoneNumberId\n      phoneNumber\n      isDefault\n      accessToken\n      name\n      internalName\n      quota\n      currentLimitCategory\n      status\n      qualityRating\n      entityListId\n      createdAt\n      updatedAt\n      welcomeMessage\n      requestedDisplayName\n      displayNameUpdate\n      displayNameUpdateDateTime\n      wabaNumberDecision\n      wabaNumberDecisionTime\n      rejectionReason\n      phoneNumberQualityUpdate\n      phoneNumberQualityUpdateTime\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
