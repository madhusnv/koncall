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
import type.ModelCloudTelephonyAccountFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetTelephonyAccountByNumberQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetTelephonyAccountByNumber($providerName: String, $displayNumber: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudTelephonyAccountFilterInput, $limit: Int, $nextToken: String) {\n  getTelephonyAccountByNumber(providerName: $providerName, displayNumber: $displayNumber, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      providerName\n      telephonyNumber\n      providerAccountId\n      displayNumber\n      hasOutbound\n      createNewLead\n      accessToken\n      cloudTelephonySubdomain\n      cloudTelephonyAccountSid\n      createdAt\n      updatedAt\n      entityListId\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetTelephonyAccountByNumber";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetTelephonyAccountByNumber($providerName: String, $displayNumber: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudTelephonyAccountFilterInput, $limit: Int, $nextToken: String) {\n  getTelephonyAccountByNumber(providerName: $providerName, displayNumber: $displayNumber, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      providerName\n      telephonyNumber\n      providerAccountId\n      displayNumber\n      hasOutbound\n      createNewLead\n      accessToken\n      cloudTelephonySubdomain\n      cloudTelephonyAccountSid\n      createdAt\n      updatedAt\n      entityListId\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelStringKeyConditionInput displayNumber;
        private ModelCloudTelephonyAccountFilterInput filter;
        private Integer limit;
        private String nextToken;
        private String providerName;
        private ModelSortDirection sortDirection;

        public GetTelephonyAccountByNumberQuery build() {
            return new GetTelephonyAccountByNumberQuery(this.providerName, this.displayNumber, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder displayNumber(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.displayNumber = modelStringKeyConditionInput;
            return this;
        }

        public Builder filter(ModelCloudTelephonyAccountFilterInput modelCloudTelephonyAccountFilterInput) {
            this.filter = modelCloudTelephonyAccountFilterInput;
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

        public Builder providerName(String str) {
            this.providerName = str;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getTelephonyAccountByNumber", "getTelephonyAccountByNumber", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("displayNumber", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "displayNumber").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("providerName", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "providerName").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetTelephonyAccountByNumber getTelephonyAccountByNumber;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetTelephonyAccountByNumber.Mapper getTelephonyAccountByNumberFieldMapper = new GetTelephonyAccountByNumber.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetTelephonyAccountByNumber) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetTelephonyAccountByNumber>() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetTelephonyAccountByNumber read(ResponseReader responseReader2) {
                        return Mapper.this.getTelephonyAccountByNumberFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetTelephonyAccountByNumber getTelephonyAccountByNumber) {
            this.getTelephonyAccountByNumber = getTelephonyAccountByNumber;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetTelephonyAccountByNumber getTelephonyAccountByNumber = this.getTelephonyAccountByNumber;
            GetTelephonyAccountByNumber getTelephonyAccountByNumber2 = ((Data) obj).getTelephonyAccountByNumber;
            return getTelephonyAccountByNumber == null ? getTelephonyAccountByNumber2 == null : getTelephonyAccountByNumber.equals(getTelephonyAccountByNumber2);
        }

        public GetTelephonyAccountByNumber getTelephonyAccountByNumber() {
            return this.getTelephonyAccountByNumber;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetTelephonyAccountByNumber getTelephonyAccountByNumber = this.getTelephonyAccountByNumber;
                this.$hashCode = (getTelephonyAccountByNumber == null ? 0 : getTelephonyAccountByNumber.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetTelephonyAccountByNumber getTelephonyAccountByNumber = Data.this.getTelephonyAccountByNumber;
                    responseWriter.writeObject(responseField, getTelephonyAccountByNumber != null ? getTelephonyAccountByNumber.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getTelephonyAccountByNumber=" + this.getTelephonyAccountByNumber + "}";
            }
            return this.$toString;
        }
    }

    public static class GetTelephonyAccountByNumber {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetTelephonyAccountByNumber> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetTelephonyAccountByNumber map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetTelephonyAccountByNumber.$responseFields;
                return new GetTelephonyAccountByNumber(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.GetTelephonyAccountByNumber.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.GetTelephonyAccountByNumber.Mapper.1.1
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

        public GetTelephonyAccountByNumber(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetTelephonyAccountByNumber)) {
                return false;
            }
            GetTelephonyAccountByNumber getTelephonyAccountByNumber = (GetTelephonyAccountByNumber) obj;
            if (this.__typename.equals(getTelephonyAccountByNumber.__typename) && this.items.equals(getTelephonyAccountByNumber.items)) {
                String str = this.nextToken;
                String str2 = getTelephonyAccountByNumber.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.GetTelephonyAccountByNumber.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetTelephonyAccountByNumber.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetTelephonyAccountByNumber.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetTelephonyAccountByNumber.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.GetTelephonyAccountByNumber.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetTelephonyAccountByNumber.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetTelephonyAccountByNumber{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String cloudTelephonyAccountSid;
        final String cloudTelephonySubdomain;
        final Boolean createNewLead;
        final String createdAt;
        final String createdById;
        final String displayNumber;
        final String entityListId;
        final Boolean hasOutbound;
        final String id;
        final String providerAccountId;
        final String providerName;
        final String telephonyNumber;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("providerName", "providerName", null, false, Collections.emptyList()), ResponseField.forString("telephonyNumber", "telephonyNumber", null, true, Collections.emptyList()), ResponseField.forString("providerAccountId", "providerAccountId", null, true, Collections.emptyList()), ResponseField.forString("displayNumber", "displayNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("hasOutbound", "hasOutbound", null, true, Collections.emptyList()), ResponseField.forBoolean("createNewLead", "createNewLead", null, true, Collections.emptyList()), ResponseField.forString("accessToken", "accessToken", null, true, Collections.emptyList()), ResponseField.forString("cloudTelephonySubdomain", "cloudTelephonySubdomain", null, true, Collections.emptyList()), ResponseField.forString("cloudTelephonyAccountSid", "cloudTelephonyAccountSid", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("entityListId", "entityListId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.providerName = (String) Utils.checkNotNull(str4, "providerName == null");
            this.telephonyNumber = str5;
            this.providerAccountId = str6;
            this.displayNumber = str7;
            this.hasOutbound = bool;
            this.createNewLead = bool2;
            this.accessToken = str8;
            this.cloudTelephonySubdomain = str9;
            this.cloudTelephonyAccountSid = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.entityListId = str13;
            this.createdById = str14;
            this.updatedById = str15;
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

        public String cloudTelephonyAccountSid() {
            return this.cloudTelephonyAccountSid;
        }

        public String cloudTelephonySubdomain() {
            return this.cloudTelephonySubdomain;
        }

        public Boolean createNewLead() {
            return this.createNewLead;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String displayNumber() {
            return this.displayNumber;
        }

        public String entityListId() {
            return this.entityListId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Boolean bool;
            Boolean bool2;
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
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.providerName.equals(item.providerName) && ((str = this.telephonyNumber) != null ? str.equals(item.telephonyNumber) : item.telephonyNumber == null) && ((str2 = this.providerAccountId) != null ? str2.equals(item.providerAccountId) : item.providerAccountId == null) && ((str3 = this.displayNumber) != null ? str3.equals(item.displayNumber) : item.displayNumber == null) && ((bool = this.hasOutbound) != null ? bool.equals(item.hasOutbound) : item.hasOutbound == null) && ((bool2 = this.createNewLead) != null ? bool2.equals(item.createNewLead) : item.createNewLead == null) && ((str4 = this.accessToken) != null ? str4.equals(item.accessToken) : item.accessToken == null) && ((str5 = this.cloudTelephonySubdomain) != null ? str5.equals(item.cloudTelephonySubdomain) : item.cloudTelephonySubdomain == null) && ((str6 = this.cloudTelephonyAccountSid) != null ? str6.equals(item.cloudTelephonyAccountSid) : item.cloudTelephonyAccountSid == null) && ((str7 = this.createdAt) != null ? str7.equals(item.createdAt) : item.createdAt == null) && ((str8 = this.updatedAt) != null ? str8.equals(item.updatedAt) : item.updatedAt == null) && ((str9 = this.entityListId) != null ? str9.equals(item.entityListId) : item.entityListId == null) && ((str10 = this.createdById) != null ? str10.equals(item.createdById) : item.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = item.updatedById;
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

        public Boolean hasOutbound() {
            return this.hasOutbound;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.providerName.hashCode()) * 1000003;
                String str = this.telephonyNumber;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.providerAccountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.displayNumber;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool = this.hasOutbound;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.createNewLead;
                int iHashCode6 = (iHashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str4 = this.accessToken;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.cloudTelephonySubdomain;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.cloudTelephonyAccountSid;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.entityListId;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdById;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedById;
                this.$hashCode = iHashCode13 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.providerName);
                    responseWriter.writeString(responseFieldArr[4], Item.this.telephonyNumber);
                    responseWriter.writeString(responseFieldArr[5], Item.this.providerAccountId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.displayNumber);
                    responseWriter.writeBoolean(responseFieldArr[7], Item.this.hasOutbound);
                    responseWriter.writeBoolean(responseFieldArr[8], Item.this.createNewLead);
                    responseWriter.writeString(responseFieldArr[9], Item.this.accessToken);
                    responseWriter.writeString(responseFieldArr[10], Item.this.cloudTelephonySubdomain);
                    responseWriter.writeString(responseFieldArr[11], Item.this.cloudTelephonyAccountSid);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.entityListId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.updatedById);
                }
            };
        }

        public String providerAccountId() {
            return this.providerAccountId;
        }

        public String providerName() {
            return this.providerName;
        }

        public String telephonyNumber() {
            return this.telephonyNumber;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", providerName=" + this.providerName + ", telephonyNumber=" + this.telephonyNumber + ", providerAccountId=" + this.providerAccountId + ", displayNumber=" + this.displayNumber + ", hasOutbound=" + this.hasOutbound + ", createNewLead=" + this.createNewLead + ", accessToken=" + this.accessToken + ", cloudTelephonySubdomain=" + this.cloudTelephonySubdomain + ", cloudTelephonyAccountSid=" + this.cloudTelephonyAccountSid + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", entityListId=" + this.entityListId + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelStringKeyConditionInput displayNumber;
        private final ModelCloudTelephonyAccountFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final String providerName;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelCloudTelephonyAccountFilterInput modelCloudTelephonyAccountFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.providerName = str;
            this.displayNumber = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelCloudTelephonyAccountFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("providerName", str);
            linkedHashMap.put("displayNumber", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelCloudTelephonyAccountFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelStringKeyConditionInput displayNumber() {
            return this.displayNumber;
        }

        public ModelCloudTelephonyAccountFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetTelephonyAccountByNumberQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("providerName", Variables.this.providerName);
                    inputFieldWriter.writeObject("displayNumber", Variables.this.displayNumber != null ? Variables.this.displayNumber.marshaller() : null);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String providerName() {
            return this.providerName;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetTelephonyAccountByNumberQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelCloudTelephonyAccountFilterInput modelCloudTelephonyAccountFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelCloudTelephonyAccountFilterInput, num, str2);
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
        return "0667f44bbbcac6e114dfe268dc4a913802417b96a368971f5f92f91916964e03";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetTelephonyAccountByNumber($providerName: String, $displayNumber: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudTelephonyAccountFilterInput, $limit: Int, $nextToken: String) {\n  getTelephonyAccountByNumber(providerName: $providerName, displayNumber: $displayNumber, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      providerName\n      telephonyNumber\n      providerAccountId\n      displayNumber\n      hasOutbound\n      createNewLead\n      accessToken\n      cloudTelephonySubdomain\n      cloudTelephonyAccountSid\n      createdAt\n      updatedAt\n      entityListId\n      createdById\n      updatedById\n    }\n    nextToken\n  }\n}";
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
