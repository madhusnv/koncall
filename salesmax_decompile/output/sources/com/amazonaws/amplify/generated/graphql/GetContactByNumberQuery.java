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
import type.ContactNumberType;
import type.CustomType;
import type.ModelContactNumberFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetContactByNumberQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetContactByNumber($phoneNumber: AWSPhone, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactNumberFilterInput, $limit: Int, $nextToken: String) {\n  getContactByNumber(phoneNumber: $phoneNumber, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      contactId\n      accountId\n      contactNumberType\n      isPrimary\n      isValid\n      isVerified\n      isWhatsappNumber\n      isWrongNumber\n      isSpam\n      doNotTrack\n      doNotTrackSetBy\n      phoneNumber\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetContactByNumber";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetContactByNumber($phoneNumber: AWSPhone, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactNumberFilterInput, $limit: Int, $nextToken: String) {\n  getContactByNumber(phoneNumber: $phoneNumber, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      contactId\n      accountId\n      contactNumberType\n      isPrimary\n      isValid\n      isVerified\n      isWhatsappNumber\n      isWrongNumber\n      isSpam\n      doNotTrack\n      doNotTrackSetBy\n      phoneNumber\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelIDKeyConditionInput accountId;
        private ModelContactNumberFilterInput filter;
        private Integer limit;
        private String nextToken;
        private String phoneNumber;
        private ModelSortDirection sortDirection;

        public Builder accountId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.accountId = modelIDKeyConditionInput;
            return this;
        }

        public GetContactByNumberQuery build() {
            return new GetContactByNumberQuery(this.phoneNumber, this.accountId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelContactNumberFilterInput modelContactNumberFilterInput) {
            this.filter = modelContactNumberFilterInput;
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

        public Builder phoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getContactByNumber", "getContactByNumber", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("phoneNumber", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "phoneNumber").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetContactByNumber getContactByNumber;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetContactByNumber.Mapper getContactByNumberFieldMapper = new GetContactByNumber.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetContactByNumber) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetContactByNumber>() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetContactByNumber read(ResponseReader responseReader2) {
                        return Mapper.this.getContactByNumberFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetContactByNumber getContactByNumber) {
            this.getContactByNumber = getContactByNumber;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetContactByNumber getContactByNumber = this.getContactByNumber;
            GetContactByNumber getContactByNumber2 = ((Data) obj).getContactByNumber;
            return getContactByNumber == null ? getContactByNumber2 == null : getContactByNumber.equals(getContactByNumber2);
        }

        public GetContactByNumber getContactByNumber() {
            return this.getContactByNumber;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetContactByNumber getContactByNumber = this.getContactByNumber;
                this.$hashCode = (getContactByNumber == null ? 0 : getContactByNumber.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetContactByNumber getContactByNumber = Data.this.getContactByNumber;
                    responseWriter.writeObject(responseField, getContactByNumber != null ? getContactByNumber.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getContactByNumber=" + this.getContactByNumber + "}";
            }
            return this.$toString;
        }
    }

    public static class GetContactByNumber {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetContactByNumber> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetContactByNumber map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetContactByNumber.$responseFields;
                return new GetContactByNumber(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.GetContactByNumber.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.GetContactByNumber.Mapper.1.1
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

        public GetContactByNumber(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetContactByNumber)) {
                return false;
            }
            GetContactByNumber getContactByNumber = (GetContactByNumber) obj;
            if (this.__typename.equals(getContactByNumber.__typename) && this.items.equals(getContactByNumber.items)) {
                String str = this.nextToken;
                String str2 = getContactByNumber.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.GetContactByNumber.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetContactByNumber.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetContactByNumber.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetContactByNumber.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.GetContactByNumber.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetContactByNumber.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetContactByNumber{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String contactId;
        final ContactNumberType contactNumberType;
        final String createdAt;
        final Boolean doNotTrack;
        final String doNotTrackSetBy;
        final String id;
        final Boolean isPrimary;
        final Boolean isSpam;
        final Boolean isValid;
        final Boolean isVerified;
        final Boolean isWhatsappNumber;
        final Boolean isWrongNumber;
        final String phoneNumber;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String string2 = responseReader.readString(responseFieldArr[4]);
                return new Item(string, str, str2, str3, string2 != null ? ContactNumberType.valueOf(string2) : null, responseReader.readBoolean(responseFieldArr[5]), responseReader.readBoolean(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]), responseReader.readBoolean(responseFieldArr[9]), responseReader.readBoolean(responseFieldArr[10]), responseReader.readBoolean(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("contactNumberType", "contactNumberType", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrimary", "isPrimary", null, true, Collections.emptyList()), ResponseField.forBoolean("isValid", "isValid", null, true, Collections.emptyList()), ResponseField.forBoolean("isVerified", "isVerified", null, true, Collections.emptyList()), ResponseField.forBoolean("isWhatsappNumber", "isWhatsappNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("isWrongNumber", "isWrongNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("isSpam", "isSpam", null, true, Collections.emptyList()), ResponseField.forBoolean("doNotTrack", "doNotTrack", null, true, Collections.emptyList()), ResponseField.forCustomType("doNotTrackSetBy", "doNotTrackSetBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("phoneNumber", "phoneNumber", null, false, CustomType.AWSPHONE, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, ContactNumberType contactNumberType, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.contactId = str3;
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.contactNumberType = contactNumberType;
            this.isPrimary = bool;
            this.isValid = bool2;
            this.isVerified = bool3;
            this.isWhatsappNumber = bool4;
            this.isWrongNumber = bool5;
            this.isSpam = bool6;
            this.doNotTrack = bool7;
            this.doNotTrackSetBy = str5;
            this.phoneNumber = (String) Utils.checkNotNull(str6, "phoneNumber == null");
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String contactId() {
            return this.contactId;
        }

        public ContactNumberType contactNumberType() {
            return this.contactNumberType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public Boolean doNotTrack() {
            return this.doNotTrack;
        }

        public String doNotTrackSetBy() {
            return this.doNotTrackSetBy;
        }

        public boolean equals(Object obj) {
            String str;
            ContactNumberType contactNumberType;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && ((str = this.contactId) != null ? str.equals(item.contactId) : item.contactId == null) && this.accountId.equals(item.accountId) && ((contactNumberType = this.contactNumberType) != null ? contactNumberType.equals(item.contactNumberType) : item.contactNumberType == null) && ((bool = this.isPrimary) != null ? bool.equals(item.isPrimary) : item.isPrimary == null) && ((bool2 = this.isValid) != null ? bool2.equals(item.isValid) : item.isValid == null) && ((bool3 = this.isVerified) != null ? bool3.equals(item.isVerified) : item.isVerified == null) && ((bool4 = this.isWhatsappNumber) != null ? bool4.equals(item.isWhatsappNumber) : item.isWhatsappNumber == null) && ((bool5 = this.isWrongNumber) != null ? bool5.equals(item.isWrongNumber) : item.isWrongNumber == null) && ((bool6 = this.isSpam) != null ? bool6.equals(item.isSpam) : item.isSpam == null) && ((bool7 = this.doNotTrack) != null ? bool7.equals(item.doNotTrack) : item.doNotTrack == null) && ((str2 = this.doNotTrackSetBy) != null ? str2.equals(item.doNotTrackSetBy) : item.doNotTrackSetBy == null) && this.phoneNumber.equals(item.phoneNumber) && ((str3 = this.createdAt) != null ? str3.equals(item.createdAt) : item.createdAt == null)) {
                String str4 = this.updatedAt;
                String str5 = item.updatedAt;
                if (str4 == null) {
                    if (str5 == null) {
                        return true;
                    }
                } else if (str4.equals(str5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                ContactNumberType contactNumberType = this.contactNumberType;
                int iHashCode3 = (iHashCode2 ^ (contactNumberType == null ? 0 : contactNumberType.hashCode())) * 1000003;
                Boolean bool = this.isPrimary;
                int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isValid;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isVerified;
                int iHashCode6 = (iHashCode5 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.isWhatsappNumber;
                int iHashCode7 = (iHashCode6 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.isWrongNumber;
                int iHashCode8 = (iHashCode7 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.isSpam;
                int iHashCode9 = (iHashCode8 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                Boolean bool7 = this.doNotTrack;
                int iHashCode10 = (iHashCode9 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
                String str2 = this.doNotTrackSetBy;
                int iHashCode11 = (((iHashCode10 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.phoneNumber.hashCode()) * 1000003;
                String str3 = this.createdAt;
                int iHashCode12 = (iHashCode11 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.updatedAt;
                this.$hashCode = iHashCode12 ^ (str4 != null ? str4.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isPrimary() {
            return this.isPrimary;
        }

        public Boolean isSpam() {
            return this.isSpam;
        }

        public Boolean isValid() {
            return this.isValid;
        }

        public Boolean isVerified() {
            return this.isVerified;
        }

        public Boolean isWhatsappNumber() {
            return this.isWhatsappNumber;
        }

        public Boolean isWrongNumber() {
            return this.isWrongNumber;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    ResponseField responseField = responseFieldArr[4];
                    ContactNumberType contactNumberType = Item.this.contactNumberType;
                    responseWriter.writeString(responseField, contactNumberType != null ? contactNumberType.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[5], Item.this.isPrimary);
                    responseWriter.writeBoolean(responseFieldArr[6], Item.this.isValid);
                    responseWriter.writeBoolean(responseFieldArr[7], Item.this.isVerified);
                    responseWriter.writeBoolean(responseFieldArr[8], Item.this.isWhatsappNumber);
                    responseWriter.writeBoolean(responseFieldArr[9], Item.this.isWrongNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], Item.this.isSpam);
                    responseWriter.writeBoolean(responseFieldArr[11], Item.this.doNotTrack);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.doNotTrackSetBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.phoneNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.updatedAt);
                }
            };
        }

        public String phoneNumber() {
            return this.phoneNumber;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", contactId=" + this.contactId + ", accountId=" + this.accountId + ", contactNumberType=" + this.contactNumberType + ", isPrimary=" + this.isPrimary + ", isValid=" + this.isValid + ", isVerified=" + this.isVerified + ", isWhatsappNumber=" + this.isWhatsappNumber + ", isWrongNumber=" + this.isWrongNumber + ", isSpam=" + this.isSpam + ", doNotTrack=" + this.doNotTrack + ", doNotTrackSetBy=" + this.doNotTrackSetBy + ", phoneNumber=" + this.phoneNumber + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelIDKeyConditionInput accountId;
        private final ModelContactNumberFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final String phoneNumber;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelContactNumberFilterInput modelContactNumberFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.phoneNumber = str;
            this.accountId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelContactNumberFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("phoneNumber", str);
            linkedHashMap.put("accountId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelContactNumberFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelIDKeyConditionInput accountId() {
            return this.accountId;
        }

        public ModelContactNumberFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetContactByNumberQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("phoneNumber", Variables.this.phoneNumber);
                    inputFieldWriter.writeObject("accountId", Variables.this.accountId != null ? Variables.this.accountId.marshaller() : null);
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

        public String phoneNumber() {
            return this.phoneNumber;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetContactByNumberQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelContactNumberFilterInput modelContactNumberFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelContactNumberFilterInput, num, str2);
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
        return "c220fa8483dba509e1bcf9c7784bb1558a1ec00a3a6b1a8f946e02fc97c62cac";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetContactByNumber($phoneNumber: AWSPhone, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactNumberFilterInput, $limit: Int, $nextToken: String) {\n  getContactByNumber(phoneNumber: $phoneNumber, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      contactId\n      accountId\n      contactNumberType\n      isPrimary\n      isValid\n      isVerified\n      isWhatsappNumber\n      isWrongNumber\n      isSpam\n      doNotTrack\n      doNotTrackSetBy\n      phoneNumber\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
