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
import type.SearchableActivityLocationFilterInput;
import type.SearchableActivityLocationSortInput;

/* loaded from: classes8.dex */
public final class LastKnownLocationQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query LastKnownLocation($filter: SearchableActivityLocationFilterInput, $sort: SearchableActivityLocationSortInput) {\n  lastKnownLocation(filter: $filter, sort: $sort) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      engagementId\n      lat\n      lng\n      ownerId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "LastKnownLocation";
        }
    };
    public static final String QUERY_DOCUMENT = "query LastKnownLocation($filter: SearchableActivityLocationFilterInput, $sort: SearchableActivityLocationSortInput) {\n  lastKnownLocation(filter: $filter, sort: $sort) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      engagementId\n      lat\n      lng\n      ownerId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableActivityLocationFilterInput filter;
        private SearchableActivityLocationSortInput sort;

        public LastKnownLocationQuery build() {
            return new LastKnownLocationQuery(this.filter, this.sort);
        }

        public Builder filter(SearchableActivityLocationFilterInput searchableActivityLocationFilterInput) {
            this.filter = searchableActivityLocationFilterInput;
            return this;
        }

        public Builder sort(SearchableActivityLocationSortInput searchableActivityLocationSortInput) {
            this.sort = searchableActivityLocationSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("lastKnownLocation", "lastKnownLocation", new UnmodifiableMapBuilder(2).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final LastKnownLocation lastKnownLocation;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final LastKnownLocation.Mapper lastKnownLocationFieldMapper = new LastKnownLocation.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((LastKnownLocation) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<LastKnownLocation>() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LastKnownLocation read(ResponseReader responseReader2) {
                        return Mapper.this.lastKnownLocationFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(LastKnownLocation lastKnownLocation) {
            this.lastKnownLocation = lastKnownLocation;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            LastKnownLocation lastKnownLocation = this.lastKnownLocation;
            LastKnownLocation lastKnownLocation2 = ((Data) obj).lastKnownLocation;
            return lastKnownLocation == null ? lastKnownLocation2 == null : lastKnownLocation.equals(lastKnownLocation2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                LastKnownLocation lastKnownLocation = this.lastKnownLocation;
                this.$hashCode = (lastKnownLocation == null ? 0 : lastKnownLocation.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public LastKnownLocation lastKnownLocation() {
            return this.lastKnownLocation;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    LastKnownLocation lastKnownLocation = Data.this.lastKnownLocation;
                    responseWriter.writeObject(responseField, lastKnownLocation != null ? lastKnownLocation.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{lastKnownLocation=" + this.lastKnownLocation + "}";
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
        final String engagementId;
        final String id;
        final String lat;
        final String lng;
        final String ownerId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forString("lat", "lat", null, true, Collections.emptyList()), ResponseField.forString("lng", "lng", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.engagementId = str4;
            this.lat = str5;
            this.lng = str6;
            this.ownerId = (String) Utils.checkNotNull(str7, "ownerId == null");
            this.createdAt = str8;
            this.updatedAt = str9;
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

        public String engagementId() {
            return this.engagementId;
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
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.engagementId) != null ? str.equals(item.engagementId) : item.engagementId == null) && ((str2 = this.lat) != null ? str2.equals(item.lat) : item.lat == null) && ((str3 = this.lng) != null ? str3.equals(item.lng) : item.lng == null) && this.ownerId.equals(item.ownerId) && ((str4 = this.createdAt) != null ? str4.equals(item.createdAt) : item.createdAt == null)) {
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
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.engagementId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.lat;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.lng;
                int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
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

        public String lat() {
            return this.lat;
        }

        public String lng() {
            return this.lng;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.engagementId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.lat);
                    responseWriter.writeString(responseFieldArr[5], Item.this.lng);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.updatedAt);
                }
            };
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", engagementId=" + this.engagementId + ", lat=" + this.lat + ", lng=" + this.lng + ", ownerId=" + this.ownerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class LastKnownLocation {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, true, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<LastKnownLocation> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LastKnownLocation map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LastKnownLocation.$responseFields;
                return new LastKnownLocation(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.LastKnownLocation.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.LastKnownLocation.Mapper.1.1
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

        public LastKnownLocation(String str, List<Item> list, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = list;
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            List<Item> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LastKnownLocation)) {
                return false;
            }
            LastKnownLocation lastKnownLocation = (LastKnownLocation) obj;
            if (this.__typename.equals(lastKnownLocation.__typename) && ((list = this.items) != null ? list.equals(lastKnownLocation.items) : lastKnownLocation.items == null)) {
                String str = this.nextToken;
                String str2 = lastKnownLocation.nextToken;
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
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Item> list = this.items;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.nextToken;
                this.$hashCode = iHashCode2 ^ (str != null ? str.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.LastKnownLocation.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LastKnownLocation.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LastKnownLocation.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], LastKnownLocation.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.LastKnownLocation.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], LastKnownLocation.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastKnownLocation{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableActivityLocationFilterInput filter;
        private final SearchableActivityLocationSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableActivityLocationFilterInput searchableActivityLocationFilterInput, SearchableActivityLocationSortInput searchableActivityLocationSortInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableActivityLocationFilterInput;
            this.sort = searchableActivityLocationSortInput;
            linkedHashMap.put("filter", searchableActivityLocationFilterInput);
            linkedHashMap.put("sort", searchableActivityLocationSortInput);
        }

        public SearchableActivityLocationFilterInput filter() {
            return this.filter;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.LastKnownLocationQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeObject("sort", Variables.this.sort != null ? Variables.this.sort.marshaller() : null);
                }
            };
        }

        public SearchableActivityLocationSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public LastKnownLocationQuery(SearchableActivityLocationFilterInput searchableActivityLocationFilterInput, SearchableActivityLocationSortInput searchableActivityLocationSortInput) {
        this.variables = new Variables(searchableActivityLocationFilterInput, searchableActivityLocationSortInput);
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
        return "12e4d6ab19bd1abdb045d5dd50bae5dd559f6a2dcc43e356fe0c560c6fda4d51";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query LastKnownLocation($filter: SearchableActivityLocationFilterInput, $sort: SearchableActivityLocationSortInput) {\n  lastKnownLocation(filter: $filter, sort: $sort) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      engagementId\n      lat\n      lng\n      ownerId\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
