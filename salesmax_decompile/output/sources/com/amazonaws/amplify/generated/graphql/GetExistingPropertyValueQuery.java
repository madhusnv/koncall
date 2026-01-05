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
import type.C19104x7c6cf3d8;
import type.CustomType;
import type.ModelCustomPropertyValuesFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetExistingPropertyValueQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetExistingPropertyValue($accountId: ID, $parentObjectIdPropertyDefinitionId: ModelCustomPropertyValuesExistinPropertyValueCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCustomPropertyValuesFilterInput, $limit: Int, $nextToken: String) {\n  getExistingPropertyValue(accountId: $accountId, parentObjectIdPropertyDefinitionId: $parentObjectIdPropertyDefinitionId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      propertyDefinitionId\n      accountId\n      parentObjectId\n      parentObject\n      value\n      createSourceId\n      createSourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetExistingPropertyValue";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetExistingPropertyValue($accountId: ID, $parentObjectIdPropertyDefinitionId: ModelCustomPropertyValuesExistinPropertyValueCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCustomPropertyValuesFilterInput, $limit: Int, $nextToken: String) {\n  getExistingPropertyValue(accountId: $accountId, parentObjectIdPropertyDefinitionId: $parentObjectIdPropertyDefinitionId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      propertyDefinitionId\n      accountId\n      parentObjectId\n      parentObject\n      value\n      createSourceId\n      createSourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelCustomPropertyValuesFilterInput filter;
        private Integer limit;
        private String nextToken;
        private C19104x7c6cf3d8 parentObjectIdPropertyDefinitionId;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetExistingPropertyValueQuery build() {
            return new GetExistingPropertyValueQuery(this.accountId, this.parentObjectIdPropertyDefinitionId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelCustomPropertyValuesFilterInput modelCustomPropertyValuesFilterInput) {
            this.filter = modelCustomPropertyValuesFilterInput;
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

        public Builder parentObjectIdPropertyDefinitionId(C19104x7c6cf3d8 c19104x7c6cf3d8) {
            this.parentObjectIdPropertyDefinitionId = c19104x7c6cf3d8;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getExistingPropertyValue", "getExistingPropertyValue", new UnmodifiableMapBuilder(6).put("parentObjectIdPropertyDefinitionId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "parentObjectIdPropertyDefinitionId").build()).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetExistingPropertyValue getExistingPropertyValue;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetExistingPropertyValue.Mapper getExistingPropertyValueFieldMapper = new GetExistingPropertyValue.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetExistingPropertyValue) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetExistingPropertyValue>() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetExistingPropertyValue read(ResponseReader responseReader2) {
                        return Mapper.this.getExistingPropertyValueFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetExistingPropertyValue getExistingPropertyValue) {
            this.getExistingPropertyValue = getExistingPropertyValue;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetExistingPropertyValue getExistingPropertyValue = this.getExistingPropertyValue;
            GetExistingPropertyValue getExistingPropertyValue2 = ((Data) obj).getExistingPropertyValue;
            return getExistingPropertyValue == null ? getExistingPropertyValue2 == null : getExistingPropertyValue.equals(getExistingPropertyValue2);
        }

        public GetExistingPropertyValue getExistingPropertyValue() {
            return this.getExistingPropertyValue;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetExistingPropertyValue getExistingPropertyValue = this.getExistingPropertyValue;
                this.$hashCode = (getExistingPropertyValue == null ? 0 : getExistingPropertyValue.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetExistingPropertyValue getExistingPropertyValue = Data.this.getExistingPropertyValue;
                    responseWriter.writeObject(responseField, getExistingPropertyValue != null ? getExistingPropertyValue.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getExistingPropertyValue=" + this.getExistingPropertyValue + "}";
            }
            return this.$toString;
        }
    }

    public static class GetExistingPropertyValue {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetExistingPropertyValue> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetExistingPropertyValue map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetExistingPropertyValue.$responseFields;
                return new GetExistingPropertyValue(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.GetExistingPropertyValue.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.GetExistingPropertyValue.Mapper.1.1
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

        public GetExistingPropertyValue(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetExistingPropertyValue)) {
                return false;
            }
            GetExistingPropertyValue getExistingPropertyValue = (GetExistingPropertyValue) obj;
            if (this.__typename.equals(getExistingPropertyValue.__typename) && this.items.equals(getExistingPropertyValue.items)) {
                String str = this.nextToken;
                String str2 = getExistingPropertyValue.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.GetExistingPropertyValue.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetExistingPropertyValue.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetExistingPropertyValue.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetExistingPropertyValue.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.GetExistingPropertyValue.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetExistingPropertyValue.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetExistingPropertyValue{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String createSourceId;
        final String createSourceType;
        final String createdAt;
        final String id;
        final String parentObject;
        final String parentObjectId;
        final String propertyDefinitionId;
        final String updatedAt;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("propertyDefinitionId", "propertyDefinitionId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("parentObjectId", "parentObjectId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("parentObject", "parentObject", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("value", "value", null, false, Collections.emptyList()), ResponseField.forCustomType("createSourceId", "createSourceId", null, true, customType, Collections.emptyList()), ResponseField.forString("createSourceType", "createSourceType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.propertyDefinitionId = (String) Utils.checkNotNull(str3, "propertyDefinitionId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.parentObjectId = (String) Utils.checkNotNull(str5, "parentObjectId == null");
            this.parentObject = str6;
            this.value = (String) Utils.checkNotNull(str7, "value == null");
            this.createSourceId = str8;
            this.createSourceType = str9;
            this.createdAt = str10;
            this.updatedAt = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createSourceId() {
            return this.createSourceId;
        }

        public String createSourceType() {
            return this.createSourceType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
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
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.propertyDefinitionId.equals(item.propertyDefinitionId) && this.accountId.equals(item.accountId) && this.parentObjectId.equals(item.parentObjectId) && ((str = this.parentObject) != null ? str.equals(item.parentObject) : item.parentObject == null) && this.value.equals(item.value) && ((str2 = this.createSourceId) != null ? str2.equals(item.createSourceId) : item.createSourceId == null) && ((str3 = this.createSourceType) != null ? str3.equals(item.createSourceType) : item.createSourceType == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
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
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.propertyDefinitionId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.parentObjectId.hashCode()) * 1000003;
                String str = this.parentObject;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.value.hashCode()) * 1000003;
                String str2 = this.createSourceId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.createSourceType;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.propertyDefinitionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.parentObjectId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.parentObject);
                    responseWriter.writeString(responseFieldArr[6], Item.this.value);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createSourceId);
                    responseWriter.writeString(responseFieldArr[8], Item.this.createSourceType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.updatedAt);
                }
            };
        }

        public String parentObject() {
            return this.parentObject;
        }

        public String parentObjectId() {
            return this.parentObjectId;
        }

        public String propertyDefinitionId() {
            return this.propertyDefinitionId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", propertyDefinitionId=" + this.propertyDefinitionId + ", accountId=" + this.accountId + ", parentObjectId=" + this.parentObjectId + ", parentObject=" + this.parentObject + ", value=" + this.value + ", createSourceId=" + this.createSourceId + ", createSourceType=" + this.createSourceType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String value() {
            return this.value;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelCustomPropertyValuesFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final C19104x7c6cf3d8 parentObjectIdPropertyDefinitionId;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, C19104x7c6cf3d8 c19104x7c6cf3d8, ModelSortDirection modelSortDirection, ModelCustomPropertyValuesFilterInput modelCustomPropertyValuesFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.parentObjectIdPropertyDefinitionId = c19104x7c6cf3d8;
            this.sortDirection = modelSortDirection;
            this.filter = modelCustomPropertyValuesFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("parentObjectIdPropertyDefinitionId", c19104x7c6cf3d8);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelCustomPropertyValuesFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelCustomPropertyValuesFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExistingPropertyValueQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("parentObjectIdPropertyDefinitionId", Variables.this.parentObjectIdPropertyDefinitionId != null ? Variables.this.parentObjectIdPropertyDefinitionId.marshaller() : null);
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

        public C19104x7c6cf3d8 parentObjectIdPropertyDefinitionId() {
            return this.parentObjectIdPropertyDefinitionId;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetExistingPropertyValueQuery(String str, C19104x7c6cf3d8 c19104x7c6cf3d8, ModelSortDirection modelSortDirection, ModelCustomPropertyValuesFilterInput modelCustomPropertyValuesFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, c19104x7c6cf3d8, modelSortDirection, modelCustomPropertyValuesFilterInput, num, str2);
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
        return "bd880ac01a46bb2cd0fdafc8562a6f7728f09f3e8cca5df8b0e32641aa0f3e95";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetExistingPropertyValue($accountId: ID, $parentObjectIdPropertyDefinitionId: ModelCustomPropertyValuesExistinPropertyValueCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCustomPropertyValuesFilterInput, $limit: Int, $nextToken: String) {\n  getExistingPropertyValue(accountId: $accountId, parentObjectIdPropertyDefinitionId: $parentObjectIdPropertyDefinitionId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      propertyDefinitionId\n      accountId\n      parentObjectId\n      parentObject\n      value\n      createSourceId\n      createSourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
