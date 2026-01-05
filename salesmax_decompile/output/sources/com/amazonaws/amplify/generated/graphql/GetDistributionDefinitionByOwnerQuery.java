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
import type.C19129xf2f0a77f;
import type.CustomType;
import type.DistributedEntityType;
import type.DistributionCreationType;
import type.IfOwnerExists;
import type.ModelDistributionDefinitionFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetDistributionDefinitionByOwnerQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetDistributionDefinitionByOwner($accountId: ID, $ownerIdUpdatedAt: ModelDistributionDefinitionByDistributionOwnerCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDistributionDefinitionFilterInput, $limit: Int, $nextToken: String) {\n  getDistributionDefinitionByOwner(accountId: $accountId, ownerIdUpdatedAt: $ownerIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetDistributionDefinitionByOwner";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetDistributionDefinitionByOwner($accountId: ID, $ownerIdUpdatedAt: ModelDistributionDefinitionByDistributionOwnerCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDistributionDefinitionFilterInput, $limit: Int, $nextToken: String) {\n  getDistributionDefinitionByOwner(accountId: $accountId, ownerIdUpdatedAt: $ownerIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelDistributionDefinitionFilterInput filter;
        private Integer limit;
        private String nextToken;
        private C19129xf2f0a77f ownerIdUpdatedAt;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetDistributionDefinitionByOwnerQuery build() {
            return new GetDistributionDefinitionByOwnerQuery(this.accountId, this.ownerIdUpdatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelDistributionDefinitionFilterInput modelDistributionDefinitionFilterInput) {
            this.filter = modelDistributionDefinitionFilterInput;
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

        public Builder ownerIdUpdatedAt(C19129xf2f0a77f c19129xf2f0a77f) {
            this.ownerIdUpdatedAt = c19129xf2f0a77f;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getDistributionDefinitionByOwner", "getDistributionDefinitionByOwner", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("ownerIdUpdatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "ownerIdUpdatedAt").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetDistributionDefinitionByOwner getDistributionDefinitionByOwner;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetDistributionDefinitionByOwner.Mapper getDistributionDefinitionByOwnerFieldMapper = new GetDistributionDefinitionByOwner.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetDistributionDefinitionByOwner) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetDistributionDefinitionByOwner>() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetDistributionDefinitionByOwner read(ResponseReader responseReader2) {
                        return Mapper.this.getDistributionDefinitionByOwnerFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetDistributionDefinitionByOwner getDistributionDefinitionByOwner) {
            this.getDistributionDefinitionByOwner = getDistributionDefinitionByOwner;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetDistributionDefinitionByOwner getDistributionDefinitionByOwner = this.getDistributionDefinitionByOwner;
            GetDistributionDefinitionByOwner getDistributionDefinitionByOwner2 = ((Data) obj).getDistributionDefinitionByOwner;
            return getDistributionDefinitionByOwner == null ? getDistributionDefinitionByOwner2 == null : getDistributionDefinitionByOwner.equals(getDistributionDefinitionByOwner2);
        }

        public GetDistributionDefinitionByOwner getDistributionDefinitionByOwner() {
            return this.getDistributionDefinitionByOwner;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetDistributionDefinitionByOwner getDistributionDefinitionByOwner = this.getDistributionDefinitionByOwner;
                this.$hashCode = (getDistributionDefinitionByOwner == null ? 0 : getDistributionDefinitionByOwner.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetDistributionDefinitionByOwner getDistributionDefinitionByOwner = Data.this.getDistributionDefinitionByOwner;
                    responseWriter.writeObject(responseField, getDistributionDefinitionByOwner != null ? getDistributionDefinitionByOwner.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getDistributionDefinitionByOwner=" + this.getDistributionDefinitionByOwner + "}";
            }
            return this.$toString;
        }
    }

    public static class GetDistributionDefinitionByOwner {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetDistributionDefinitionByOwner> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetDistributionDefinitionByOwner map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetDistributionDefinitionByOwner.$responseFields;
                return new GetDistributionDefinitionByOwner(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.GetDistributionDefinitionByOwner.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.GetDistributionDefinitionByOwner.Mapper.1.1
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

        public GetDistributionDefinitionByOwner(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetDistributionDefinitionByOwner)) {
                return false;
            }
            GetDistributionDefinitionByOwner getDistributionDefinitionByOwner = (GetDistributionDefinitionByOwner) obj;
            if (this.__typename.equals(getDistributionDefinitionByOwner.__typename) && this.items.equals(getDistributionDefinitionByOwner.items)) {
                String str = this.nextToken;
                String str2 = getDistributionDefinitionByOwner.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.GetDistributionDefinitionByOwner.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetDistributionDefinitionByOwner.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetDistributionDefinitionByOwner.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetDistributionDefinitionByOwner.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.GetDistributionDefinitionByOwner.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetDistributionDefinitionByOwner.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetDistributionDefinitionByOwner{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final Boolean assignLeadOwnerToTask;
        final String createdAt;
        final String description;
        final List<DistributedEntityType> distributedEntityType;
        final DistributionCreationType distributionCreationType;
        final String id;
        final IfOwnerExists ifOwnerExists;
        final String name;
        final String ownerId;
        final Boolean remeberAssigneeInDistributionScope;
        final Boolean remeberAssigneeInGlobalScope;
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
                List list = responseReader.readList(responseFieldArr[5], new ResponseReader.ListReader<DistributedEntityType>() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public DistributedEntityType read(ResponseReader.ListItemReader listItemReader) {
                        return DistributedEntityType.valueOf(listItemReader.readString());
                    }
                });
                String string4 = responseReader.readString(responseFieldArr[6]);
                IfOwnerExists ifOwnerExistsValueOf = string4 != null ? IfOwnerExists.valueOf(string4) : null;
                Boolean bool = responseReader.readBoolean(responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[9]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new Item(string, str, str2, string2, string3, list, ifOwnerExistsValueOf, bool, bool2, bool3, str3, string5 != null ? DistributionCreationType.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forList("distributedEntityType", "distributedEntityType", null, false, Collections.emptyList()), ResponseField.forString("ifOwnerExists", "ifOwnerExists", null, true, Collections.emptyList()), ResponseField.forBoolean("assignLeadOwnerToTask", "assignLeadOwnerToTask", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInDistributionScope", "remeberAssigneeInDistributionScope", null, true, Collections.emptyList()), ResponseField.forBoolean("remeberAssigneeInGlobalScope", "remeberAssigneeInGlobalScope", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("distributionCreationType", "distributionCreationType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, List<DistributedEntityType> list, IfOwnerExists ifOwnerExists, Boolean bool, Boolean bool2, Boolean bool3, String str6, DistributionCreationType distributionCreationType, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.distributedEntityType = (List) Utils.checkNotNull(list, "distributedEntityType == null");
            this.ifOwnerExists = ifOwnerExists;
            this.assignLeadOwnerToTask = bool;
            this.remeberAssigneeInDistributionScope = bool2;
            this.remeberAssigneeInGlobalScope = bool3;
            this.ownerId = (String) Utils.checkNotNull(str6, "ownerId == null");
            this.distributionCreationType = distributionCreationType;
            this.createdAt = str7;
            this.updatedAt = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean assignLeadOwnerToTask() {
            return this.assignLeadOwnerToTask;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String description() {
            return this.description;
        }

        public List<DistributedEntityType> distributedEntityType() {
            return this.distributedEntityType;
        }

        public DistributionCreationType distributionCreationType() {
            return this.distributionCreationType;
        }

        public boolean equals(Object obj) {
            IfOwnerExists ifOwnerExists;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            DistributionCreationType distributionCreationType;
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.name.equals(item.name) && this.description.equals(item.description) && this.distributedEntityType.equals(item.distributedEntityType) && ((ifOwnerExists = this.ifOwnerExists) != null ? ifOwnerExists.equals(item.ifOwnerExists) : item.ifOwnerExists == null) && ((bool = this.assignLeadOwnerToTask) != null ? bool.equals(item.assignLeadOwnerToTask) : item.assignLeadOwnerToTask == null) && ((bool2 = this.remeberAssigneeInDistributionScope) != null ? bool2.equals(item.remeberAssigneeInDistributionScope) : item.remeberAssigneeInDistributionScope == null) && ((bool3 = this.remeberAssigneeInGlobalScope) != null ? bool3.equals(item.remeberAssigneeInGlobalScope) : item.remeberAssigneeInGlobalScope == null) && this.ownerId.equals(item.ownerId) && ((distributionCreationType = this.distributionCreationType) != null ? distributionCreationType.equals(item.distributionCreationType) : item.distributionCreationType == null) && ((str = this.createdAt) != null ? str.equals(item.createdAt) : item.createdAt == null)) {
                String str2 = this.updatedAt;
                String str3 = item.updatedAt;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.distributedEntityType.hashCode()) * 1000003;
                IfOwnerExists ifOwnerExists = this.ifOwnerExists;
                int iHashCode2 = (iHashCode ^ (ifOwnerExists == null ? 0 : ifOwnerExists.hashCode())) * 1000003;
                Boolean bool = this.assignLeadOwnerToTask;
                int iHashCode3 = (iHashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.remeberAssigneeInDistributionScope;
                int iHashCode4 = (iHashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.remeberAssigneeInGlobalScope;
                int iHashCode5 = (((iHashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                DistributionCreationType distributionCreationType = this.distributionCreationType;
                int iHashCode6 = (iHashCode5 ^ (distributionCreationType == null ? 0 : distributionCreationType.hashCode())) * 1000003;
                String str = this.createdAt;
                int iHashCode7 = (iHashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.updatedAt;
                this.$hashCode = iHashCode7 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public IfOwnerExists ifOwnerExists() {
            return this.ifOwnerExists;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.name);
                    responseWriter.writeString(responseFieldArr[4], Item.this.description);
                    responseWriter.writeList(responseFieldArr[5], Item.this.distributedEntityType, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(((DistributedEntityType) obj).name());
                        }
                    });
                    ResponseField responseField = responseFieldArr[6];
                    IfOwnerExists ifOwnerExists = Item.this.ifOwnerExists;
                    responseWriter.writeString(responseField, ifOwnerExists != null ? ifOwnerExists.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[7], Item.this.assignLeadOwnerToTask);
                    responseWriter.writeBoolean(responseFieldArr[8], Item.this.remeberAssigneeInDistributionScope);
                    responseWriter.writeBoolean(responseFieldArr[9], Item.this.remeberAssigneeInGlobalScope);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.ownerId);
                    ResponseField responseField2 = responseFieldArr[11];
                    DistributionCreationType distributionCreationType = Item.this.distributionCreationType;
                    responseWriter.writeString(responseField2, distributionCreationType != null ? distributionCreationType.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Boolean remeberAssigneeInDistributionScope() {
            return this.remeberAssigneeInDistributionScope;
        }

        public Boolean remeberAssigneeInGlobalScope() {
            return this.remeberAssigneeInGlobalScope;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", distributedEntityType=" + this.distributedEntityType + ", ifOwnerExists=" + this.ifOwnerExists + ", assignLeadOwnerToTask=" + this.assignLeadOwnerToTask + ", remeberAssigneeInDistributionScope=" + this.remeberAssigneeInDistributionScope + ", remeberAssigneeInGlobalScope=" + this.remeberAssigneeInGlobalScope + ", ownerId=" + this.ownerId + ", distributionCreationType=" + this.distributionCreationType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelDistributionDefinitionFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final C19129xf2f0a77f ownerIdUpdatedAt;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, C19129xf2f0a77f c19129xf2f0a77f, ModelSortDirection modelSortDirection, ModelDistributionDefinitionFilterInput modelDistributionDefinitionFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.ownerIdUpdatedAt = c19129xf2f0a77f;
            this.sortDirection = modelSortDirection;
            this.filter = modelDistributionDefinitionFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("ownerIdUpdatedAt", c19129xf2f0a77f);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelDistributionDefinitionFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelDistributionDefinitionFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetDistributionDefinitionByOwnerQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("ownerIdUpdatedAt", Variables.this.ownerIdUpdatedAt != null ? Variables.this.ownerIdUpdatedAt.marshaller() : null);
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

        public C19129xf2f0a77f ownerIdUpdatedAt() {
            return this.ownerIdUpdatedAt;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetDistributionDefinitionByOwnerQuery(String str, C19129xf2f0a77f c19129xf2f0a77f, ModelSortDirection modelSortDirection, ModelDistributionDefinitionFilterInput modelDistributionDefinitionFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, c19129xf2f0a77f, modelSortDirection, modelDistributionDefinitionFilterInput, num, str2);
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
        return "54c700a5c8a95017b375932201955ea86066e367ac8bb18ee55c7903818df3af";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetDistributionDefinitionByOwner($accountId: ID, $ownerIdUpdatedAt: ModelDistributionDefinitionByDistributionOwnerCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelDistributionDefinitionFilterInput, $limit: Int, $nextToken: String) {\n  getDistributionDefinitionByOwner(accountId: $accountId, ownerIdUpdatedAt: $ownerIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      distributedEntityType\n      ifOwnerExists\n      assignLeadOwnerToTask\n      remeberAssigneeInDistributionScope\n      remeberAssigneeInGlobalScope\n      ownerId\n      distributionCreationType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
