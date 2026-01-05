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
import type.AssociatedCreationType;
import type.CustomType;
import type.ModelContactBusinessMembershipFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetBusinessByBusinessIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetBusinessByBusinessId($businessId: ID, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactBusinessMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getBusinessByBusinessId(businessId: $businessId, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      businessId\n      contactId\n      contactRelationship\n      department\n      designation\n      associatedCreationType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetBusinessByBusinessId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetBusinessByBusinessId($businessId: ID, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactBusinessMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getBusinessByBusinessId(businessId: $businessId, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      businessId\n      contactId\n      contactRelationship\n      department\n      designation\n      associatedCreationType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelIDKeyConditionInput accountId;
        private String businessId;
        private ModelContactBusinessMembershipFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.accountId = modelIDKeyConditionInput;
            return this;
        }

        public GetBusinessByBusinessIdQuery build() {
            return new GetBusinessByBusinessIdQuery(this.businessId, this.accountId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder businessId(String str) {
            this.businessId = str;
            return this;
        }

        public Builder filter(ModelContactBusinessMembershipFilterInput modelContactBusinessMembershipFilterInput) {
            this.filter = modelContactBusinessMembershipFilterInput;
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

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getBusinessByBusinessId", "getBusinessByBusinessId", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("businessId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "businessId").build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetBusinessByBusinessId getBusinessByBusinessId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetBusinessByBusinessId.Mapper getBusinessByBusinessIdFieldMapper = new GetBusinessByBusinessId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetBusinessByBusinessId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetBusinessByBusinessId>() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetBusinessByBusinessId read(ResponseReader responseReader2) {
                        return Mapper.this.getBusinessByBusinessIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetBusinessByBusinessId getBusinessByBusinessId) {
            this.getBusinessByBusinessId = getBusinessByBusinessId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetBusinessByBusinessId getBusinessByBusinessId = this.getBusinessByBusinessId;
            GetBusinessByBusinessId getBusinessByBusinessId2 = ((Data) obj).getBusinessByBusinessId;
            return getBusinessByBusinessId == null ? getBusinessByBusinessId2 == null : getBusinessByBusinessId.equals(getBusinessByBusinessId2);
        }

        public GetBusinessByBusinessId getBusinessByBusinessId() {
            return this.getBusinessByBusinessId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetBusinessByBusinessId getBusinessByBusinessId = this.getBusinessByBusinessId;
                this.$hashCode = (getBusinessByBusinessId == null ? 0 : getBusinessByBusinessId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetBusinessByBusinessId getBusinessByBusinessId = Data.this.getBusinessByBusinessId;
                    responseWriter.writeObject(responseField, getBusinessByBusinessId != null ? getBusinessByBusinessId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getBusinessByBusinessId=" + this.getBusinessByBusinessId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetBusinessByBusinessId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetBusinessByBusinessId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetBusinessByBusinessId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetBusinessByBusinessId.$responseFields;
                return new GetBusinessByBusinessId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.GetBusinessByBusinessId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.GetBusinessByBusinessId.Mapper.1.1
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

        public GetBusinessByBusinessId(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetBusinessByBusinessId)) {
                return false;
            }
            GetBusinessByBusinessId getBusinessByBusinessId = (GetBusinessByBusinessId) obj;
            if (this.__typename.equals(getBusinessByBusinessId.__typename) && this.items.equals(getBusinessByBusinessId.items)) {
                String str = this.nextToken;
                String str2 = getBusinessByBusinessId.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.GetBusinessByBusinessId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetBusinessByBusinessId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetBusinessByBusinessId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetBusinessByBusinessId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.GetBusinessByBusinessId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetBusinessByBusinessId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetBusinessByBusinessId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final AssociatedCreationType associatedCreationType;
        final String businessId;
        final String contactId;
        final String contactRelationship;
        final String createdAt;
        final String department;
        final String designation;
        final String id;
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
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String string2 = responseReader.readString(responseFieldArr[5]);
                String string3 = responseReader.readString(responseFieldArr[6]);
                String string4 = responseReader.readString(responseFieldArr[7]);
                String string5 = responseReader.readString(responseFieldArr[8]);
                return new Item(string, str, str2, str3, str4, string2, string3, string4, string5 != null ? AssociatedCreationType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("businessId", "businessId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("contactRelationship", "contactRelationship", null, true, Collections.emptyList()), ResponseField.forString("department", "department", null, true, Collections.emptyList()), ResponseField.forString("designation", "designation", null, true, Collections.emptyList()), ResponseField.forString("associatedCreationType", "associatedCreationType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AssociatedCreationType associatedCreationType, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.businessId = (String) Utils.checkNotNull(str4, "businessId == null");
            this.contactId = (String) Utils.checkNotNull(str5, "contactId == null");
            this.contactRelationship = str6;
            this.department = str7;
            this.designation = str8;
            this.associatedCreationType = associatedCreationType;
            this.createdAt = str9;
            this.updatedAt = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public AssociatedCreationType associatedCreationType() {
            return this.associatedCreationType;
        }

        public String businessId() {
            return this.businessId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String contactRelationship() {
            return this.contactRelationship;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String department() {
            return this.department;
        }

        public String designation() {
            return this.designation;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            AssociatedCreationType associatedCreationType;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.businessId.equals(item.businessId) && this.contactId.equals(item.contactId) && ((str = this.contactRelationship) != null ? str.equals(item.contactRelationship) : item.contactRelationship == null) && ((str2 = this.department) != null ? str2.equals(item.department) : item.department == null) && ((str3 = this.designation) != null ? str3.equals(item.designation) : item.designation == null) && ((associatedCreationType = this.associatedCreationType) != null ? associatedCreationType.equals(item.associatedCreationType) : item.associatedCreationType == null) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
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
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.businessId.hashCode()) * 1000003) ^ this.contactId.hashCode()) * 1000003;
                String str = this.contactRelationship;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.department;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.designation;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                AssociatedCreationType associatedCreationType = this.associatedCreationType;
                int iHashCode5 = (iHashCode4 ^ (associatedCreationType == null ? 0 : associatedCreationType.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode6 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.businessId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.contactRelationship);
                    responseWriter.writeString(responseFieldArr[6], Item.this.department);
                    responseWriter.writeString(responseFieldArr[7], Item.this.designation);
                    ResponseField responseField = responseFieldArr[8];
                    AssociatedCreationType associatedCreationType = Item.this.associatedCreationType;
                    responseWriter.writeString(responseField, associatedCreationType != null ? associatedCreationType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.updatedAt);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", businessId=" + this.businessId + ", contactId=" + this.contactId + ", contactRelationship=" + this.contactRelationship + ", department=" + this.department + ", designation=" + this.designation + ", associatedCreationType=" + this.associatedCreationType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelIDKeyConditionInput accountId;
        private final String businessId;
        private final ModelContactBusinessMembershipFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelContactBusinessMembershipFilterInput modelContactBusinessMembershipFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.businessId = str;
            this.accountId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelContactBusinessMembershipFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("businessId", str);
            linkedHashMap.put("accountId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelContactBusinessMembershipFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelIDKeyConditionInput accountId() {
            return this.accountId;
        }

        public String businessId() {
            return this.businessId;
        }

        public ModelContactBusinessMembershipFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetBusinessByBusinessIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("businessId", Variables.this.businessId);
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

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetBusinessByBusinessIdQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelContactBusinessMembershipFilterInput modelContactBusinessMembershipFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelContactBusinessMembershipFilterInput, num, str2);
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
        return "824916975d1e252a5669cb3ddca8a79e5a9e2cb0cc401fedb9b923bab5624ae4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetBusinessByBusinessId($businessId: ID, $accountId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelContactBusinessMembershipFilterInput, $limit: Int, $nextToken: String) {\n  getBusinessByBusinessId(businessId: $businessId, accountId: $accountId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      businessId\n      contactId\n      contactRelationship\n      department\n      designation\n      associatedCreationType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
