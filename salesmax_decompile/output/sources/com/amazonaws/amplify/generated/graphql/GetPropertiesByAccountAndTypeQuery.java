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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomDataType;
import type.CustomType;
import type.ModelCustomPropertyDefinitionsFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetPropertiesByAccountAndTypeQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetPropertiesByAccountAndType($accountId: ID, $parentObjectType: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCustomPropertyDefinitionsFilterInput, $limit: Int, $nextToken: String) {\n  getPropertiesByAccountAndType(accountId: $accountId, parentObjectType: $parentObjectType, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      propertyName\n      displayName\n      description\n      scalarType\n      dataType\n      isMultiple\n      parentObjectType\n      isSystemProperty\n      isArchived\n      displayOrder\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetPropertiesByAccountAndType";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetPropertiesByAccountAndType($accountId: ID, $parentObjectType: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCustomPropertyDefinitionsFilterInput, $limit: Int, $nextToken: String) {\n  getPropertiesByAccountAndType(accountId: $accountId, parentObjectType: $parentObjectType, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      propertyName\n      displayName\n      description\n      scalarType\n      dataType\n      isMultiple\n      parentObjectType\n      isSystemProperty\n      isArchived\n      displayOrder\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelCustomPropertyDefinitionsFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelStringKeyConditionInput parentObjectType;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetPropertiesByAccountAndTypeQuery build() {
            return new GetPropertiesByAccountAndTypeQuery(this.accountId, this.parentObjectType, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelCustomPropertyDefinitionsFilterInput modelCustomPropertyDefinitionsFilterInput) {
            this.filter = modelCustomPropertyDefinitionsFilterInput;
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

        public Builder parentObjectType(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.parentObjectType = modelStringKeyConditionInput;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getPropertiesByAccountAndType", "getPropertiesByAccountAndType", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("parentObjectType", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "parentObjectType").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetPropertiesByAccountAndType getPropertiesByAccountAndType;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetPropertiesByAccountAndType.Mapper getPropertiesByAccountAndTypeFieldMapper = new GetPropertiesByAccountAndType.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetPropertiesByAccountAndType) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetPropertiesByAccountAndType>() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetPropertiesByAccountAndType read(ResponseReader responseReader2) {
                        return Mapper.this.getPropertiesByAccountAndTypeFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetPropertiesByAccountAndType getPropertiesByAccountAndType) {
            this.getPropertiesByAccountAndType = getPropertiesByAccountAndType;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetPropertiesByAccountAndType getPropertiesByAccountAndType = this.getPropertiesByAccountAndType;
            GetPropertiesByAccountAndType getPropertiesByAccountAndType2 = ((Data) obj).getPropertiesByAccountAndType;
            return getPropertiesByAccountAndType == null ? getPropertiesByAccountAndType2 == null : getPropertiesByAccountAndType.equals(getPropertiesByAccountAndType2);
        }

        public GetPropertiesByAccountAndType getPropertiesByAccountAndType() {
            return this.getPropertiesByAccountAndType;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetPropertiesByAccountAndType getPropertiesByAccountAndType = this.getPropertiesByAccountAndType;
                this.$hashCode = (getPropertiesByAccountAndType == null ? 0 : getPropertiesByAccountAndType.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetPropertiesByAccountAndType getPropertiesByAccountAndType = Data.this.getPropertiesByAccountAndType;
                    responseWriter.writeObject(responseField, getPropertiesByAccountAndType != null ? getPropertiesByAccountAndType.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getPropertiesByAccountAndType=" + this.getPropertiesByAccountAndType + "}";
            }
            return this.$toString;
        }
    }

    public static class GetPropertiesByAccountAndType {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetPropertiesByAccountAndType> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetPropertiesByAccountAndType map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetPropertiesByAccountAndType.$responseFields;
                return new GetPropertiesByAccountAndType(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.GetPropertiesByAccountAndType.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.GetPropertiesByAccountAndType.Mapper.1.1
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

        public GetPropertiesByAccountAndType(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetPropertiesByAccountAndType)) {
                return false;
            }
            GetPropertiesByAccountAndType getPropertiesByAccountAndType = (GetPropertiesByAccountAndType) obj;
            if (this.__typename.equals(getPropertiesByAccountAndType.__typename) && this.items.equals(getPropertiesByAccountAndType.items)) {
                String str = this.nextToken;
                String str2 = getPropertiesByAccountAndType.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.GetPropertiesByAccountAndType.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetPropertiesByAccountAndType.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetPropertiesByAccountAndType.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetPropertiesByAccountAndType.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.GetPropertiesByAccountAndType.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetPropertiesByAccountAndType.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetPropertiesByAccountAndType{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String createdAt;
        final String createdById;
        final CustomDataType dataType;
        final String description;
        final String displayName;
        final Integer displayOrder;
        final String id;
        final Boolean isArchived;
        final Boolean isMultiple;
        final boolean isSystemProperty;
        final String parentObjectType;
        final String propertyName;
        final String scalarType;
        final String updaedById;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                return new Item(string, str, str2, string2, string3, string4, string5, string6 != null ? CustomDataType.valueOf(string6) : null, responseReader.readBoolean(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readBoolean(responseFieldArr[10]).booleanValue(), responseReader.readBoolean(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("propertyName", "propertyName", null, false, Collections.emptyList()), ResponseField.forString("displayName", "displayName", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("scalarType", "scalarType", null, false, Collections.emptyList()), ResponseField.forString("dataType", "dataType", null, true, Collections.emptyList()), ResponseField.forBoolean("isMultiple", "isMultiple", null, true, Collections.emptyList()), ResponseField.forString("parentObjectType", "parentObjectType", null, false, Collections.emptyList()), ResponseField.forBoolean("isSystemProperty", "isSystemProperty", null, false, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forInt("displayOrder", "displayOrder", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updaedById", "updaedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, CustomDataType customDataType, Boolean bool, String str8, boolean z, Boolean bool2, Integer num, String str9, String str10, String str11, String str12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.propertyName = (String) Utils.checkNotNull(str4, "propertyName == null");
            this.displayName = (String) Utils.checkNotNull(str5, "displayName == null");
            this.description = str6;
            this.scalarType = (String) Utils.checkNotNull(str7, "scalarType == null");
            this.dataType = customDataType;
            this.isMultiple = bool;
            this.parentObjectType = (String) Utils.checkNotNull(str8, "parentObjectType == null");
            this.isSystemProperty = z;
            this.isArchived = bool2;
            this.displayOrder = num;
            this.createdById = str9;
            this.updaedById = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
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

        public String createdById() {
            return this.createdById;
        }

        public CustomDataType dataType() {
            return this.dataType;
        }

        public String description() {
            return this.description;
        }

        public String displayName() {
            return this.displayName;
        }

        public Integer displayOrder() {
            return this.displayOrder;
        }

        public boolean equals(Object obj) {
            String str;
            CustomDataType customDataType;
            Boolean bool;
            Boolean bool2;
            Integer num;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.propertyName.equals(item.propertyName) && this.displayName.equals(item.displayName) && ((str = this.description) != null ? str.equals(item.description) : item.description == null) && this.scalarType.equals(item.scalarType) && ((customDataType = this.dataType) != null ? customDataType.equals(item.dataType) : item.dataType == null) && ((bool = this.isMultiple) != null ? bool.equals(item.isMultiple) : item.isMultiple == null) && this.parentObjectType.equals(item.parentObjectType) && this.isSystemProperty == item.isSystemProperty && ((bool2 = this.isArchived) != null ? bool2.equals(item.isArchived) : item.isArchived == null) && ((num = this.displayOrder) != null ? num.equals(item.displayOrder) : item.displayOrder == null) && ((str2 = this.createdById) != null ? str2.equals(item.createdById) : item.createdById == null) && ((str3 = this.updaedById) != null ? str3.equals(item.updaedById) : item.updaedById == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = item.updatedAt;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.propertyName.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003;
                String str = this.description;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.scalarType.hashCode()) * 1000003;
                CustomDataType customDataType = this.dataType;
                int iHashCode3 = (iHashCode2 ^ (customDataType == null ? 0 : customDataType.hashCode())) * 1000003;
                Boolean bool = this.isMultiple;
                int iHashCode4 = (((((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.parentObjectType.hashCode()) * 1000003) ^ Boolean.valueOf(this.isSystemProperty).hashCode()) * 1000003;
                Boolean bool2 = this.isArchived;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num = this.displayOrder;
                int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str2 = this.createdById;
                int iHashCode7 = (iHashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updaedById;
                int iHashCode8 = (iHashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode9 = (iHashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode9 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public Boolean isMultiple() {
            return this.isMultiple;
        }

        public boolean isSystemProperty() {
            return this.isSystemProperty;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.propertyName);
                    responseWriter.writeString(responseFieldArr[4], Item.this.displayName);
                    responseWriter.writeString(responseFieldArr[5], Item.this.description);
                    responseWriter.writeString(responseFieldArr[6], Item.this.scalarType);
                    ResponseField responseField = responseFieldArr[7];
                    CustomDataType customDataType = Item.this.dataType;
                    responseWriter.writeString(responseField, customDataType != null ? customDataType.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[8], Item.this.isMultiple);
                    responseWriter.writeString(responseFieldArr[9], Item.this.parentObjectType);
                    responseWriter.writeBoolean(responseFieldArr[10], Boolean.valueOf(Item.this.isSystemProperty));
                    responseWriter.writeBoolean(responseFieldArr[11], Item.this.isArchived);
                    responseWriter.writeInt(responseFieldArr[12], Item.this.displayOrder);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.updaedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.updatedAt);
                }
            };
        }

        public String parentObjectType() {
            return this.parentObjectType;
        }

        public String propertyName() {
            return this.propertyName;
        }

        public String scalarType() {
            return this.scalarType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", propertyName=" + this.propertyName + ", displayName=" + this.displayName + ", description=" + this.description + ", scalarType=" + this.scalarType + ", dataType=" + this.dataType + ", isMultiple=" + this.isMultiple + ", parentObjectType=" + this.parentObjectType + ", isSystemProperty=" + this.isSystemProperty + ", isArchived=" + this.isArchived + ", displayOrder=" + this.displayOrder + ", createdById=" + this.createdById + ", updaedById=" + this.updaedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updaedById() {
            return this.updaedById;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelCustomPropertyDefinitionsFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelStringKeyConditionInput parentObjectType;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelCustomPropertyDefinitionsFilterInput modelCustomPropertyDefinitionsFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.parentObjectType = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelCustomPropertyDefinitionsFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("parentObjectType", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelCustomPropertyDefinitionsFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelCustomPropertyDefinitionsFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetPropertiesByAccountAndTypeQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("parentObjectType", Variables.this.parentObjectType != null ? Variables.this.parentObjectType.marshaller() : null);
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

        public ModelStringKeyConditionInput parentObjectType() {
            return this.parentObjectType;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetPropertiesByAccountAndTypeQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelCustomPropertyDefinitionsFilterInput modelCustomPropertyDefinitionsFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelCustomPropertyDefinitionsFilterInput, num, str2);
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
        return "dc74104fd0c6d3f81caea1596d71b548c21fbd90fa46b051e08e3251b10f7918";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetPropertiesByAccountAndType($accountId: ID, $parentObjectType: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCustomPropertyDefinitionsFilterInput, $limit: Int, $nextToken: String) {\n  getPropertiesByAccountAndType(accountId: $accountId, parentObjectType: $parentObjectType, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      propertyName\n      displayName\n      description\n      scalarType\n      dataType\n      isMultiple\n      parentObjectType\n      isSystemProperty\n      isArchived\n      displayOrder\n      createdById\n      updaedById\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
