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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelSavedTableViewsFilterInput;
import type.ModelSavedTableViewsPrimaryCompositeKeyConditionInput;
import type.ModelSortDirection;
import type.ScopeLevel;

/* loaded from: classes4.dex */
public final class ListSavedTableViewssQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListSavedTableViewss($accountId: ID, $ownerIdTableNameViewName: ModelSavedTableViewsPrimaryCompositeKeyConditionInput, $filter: ModelSavedTableViewsFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listSavedTableViewss(accountId: $accountId, ownerIdTableNameViewName: $ownerIdTableNameViewName, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      tableName\n      viewName\n      isSystemCreated\n      includeAll\n      filterModel\n      sortModel\n      columnState\n      hiddenColumnms\n      scopeLevel\n      scopeId\n      forUserIds\n      forTeamIds\n      forAuthorizations\n      isMetrics\n      isOnlyMetrics\n      dbFilterModel\n      showMetricsOnDashboard\n      showMetricsInApp\n      addedToAppHomeOn\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListSavedTableViewss";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListSavedTableViewss($accountId: ID, $ownerIdTableNameViewName: ModelSavedTableViewsPrimaryCompositeKeyConditionInput, $filter: ModelSavedTableViewsFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listSavedTableViewss(accountId: $accountId, ownerIdTableNameViewName: $ownerIdTableNameViewName, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      tableName\n      viewName\n      isSystemCreated\n      includeAll\n      filterModel\n      sortModel\n      columnState\n      hiddenColumnms\n      scopeLevel\n      scopeId\n      forUserIds\n      forTeamIds\n      forAuthorizations\n      isMetrics\n      isOnlyMetrics\n      dbFilterModel\n      showMetricsOnDashboard\n      showMetricsInApp\n      addedToAppHomeOn\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelSavedTableViewsFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSavedTableViewsPrimaryCompositeKeyConditionInput ownerIdTableNameViewName;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public ListSavedTableViewssQuery build() {
            return new ListSavedTableViewssQuery(this.accountId, this.ownerIdTableNameViewName, this.filter, this.limit, this.nextToken, this.sortDirection);
        }

        public Builder filter(ModelSavedTableViewsFilterInput modelSavedTableViewsFilterInput) {
            this.filter = modelSavedTableViewsFilterInput;
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

        public Builder ownerIdTableNameViewName(ModelSavedTableViewsPrimaryCompositeKeyConditionInput modelSavedTableViewsPrimaryCompositeKeyConditionInput) {
            this.ownerIdTableNameViewName = modelSavedTableViewsPrimaryCompositeKeyConditionInput;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("listSavedTableViewss", "listSavedTableViewss", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("ownerIdTableNameViewName", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "ownerIdTableNameViewName").build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListSavedTableViewss listSavedTableViewss;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListSavedTableViewss.Mapper listSavedTableViewssFieldMapper = new ListSavedTableViewss.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListSavedTableViewss) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListSavedTableViewss>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListSavedTableViewss read(ResponseReader responseReader2) {
                        return Mapper.this.listSavedTableViewssFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListSavedTableViewss listSavedTableViewss) {
            this.listSavedTableViewss = listSavedTableViewss;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListSavedTableViewss listSavedTableViewss = this.listSavedTableViewss;
            ListSavedTableViewss listSavedTableViewss2 = ((Data) obj).listSavedTableViewss;
            return listSavedTableViewss == null ? listSavedTableViewss2 == null : listSavedTableViewss.equals(listSavedTableViewss2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListSavedTableViewss listSavedTableViewss = this.listSavedTableViewss;
                this.$hashCode = (listSavedTableViewss == null ? 0 : listSavedTableViewss.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListSavedTableViewss listSavedTableViewss() {
            return this.listSavedTableViewss;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListSavedTableViewss listSavedTableViewss = Data.this.listSavedTableViewss;
                    responseWriter.writeObject(responseField, listSavedTableViewss != null ? listSavedTableViewss.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listSavedTableViewss=" + this.listSavedTableViewss + "}";
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
        final String addedToAppHomeOn;
        final String columnState;
        final String createdAt;
        final String dbFilterModel;
        final String filterModel;
        final List<String> forAuthorizations;
        final List<String> forTeamIds;
        final List<String> forUserIds;
        final String hiddenColumnms;
        final Boolean includeAll;
        final Boolean isMetrics;
        final Boolean isOnlyMetrics;
        final Boolean isSystemCreated;
        final String ownerId;
        final String scopeId;
        final ScopeLevel scopeLevel;
        final Boolean showMetricsInApp;
        final Boolean showMetricsOnDashboard;
        final String sortModel;
        final String tableName;
        final String updatedAt;
        final String viewName;

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
                Boolean bool = responseReader.readBoolean(responseFieldArr[5]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[10]);
                String string4 = responseReader.readString(responseFieldArr[11]);
                return new Item(string, str, str2, string2, string3, bool, bool2, str3, str4, str5, str6, string4 != null ? ScopeLevel.valueOf(string4) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readList(responseFieldArr[13], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[14], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Item.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Item.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readBoolean(responseFieldArr[16]), responseReader.readBoolean(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), responseReader.readBoolean(responseFieldArr[19]), responseReader.readBoolean(responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("tableName", "tableName", null, false, Collections.emptyList()), ResponseField.forString("viewName", "viewName", null, false, Collections.emptyList()), ResponseField.forBoolean("isSystemCreated", "isSystemCreated", null, true, Collections.emptyList()), ResponseField.forBoolean("includeAll", "includeAll", null, true, Collections.emptyList()), ResponseField.forCustomType("filterModel", "filterModel", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("sortModel", "sortModel", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("columnState", "columnState", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("hiddenColumnms", "hiddenColumnms", null, true, customType2, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forList("forUserIds", "forUserIds", null, true, Collections.emptyList()), ResponseField.forList("forTeamIds", "forTeamIds", null, true, Collections.emptyList()), ResponseField.forList("forAuthorizations", "forAuthorizations", null, true, Collections.emptyList()), ResponseField.forBoolean("isMetrics", "isMetrics", null, true, Collections.emptyList()), ResponseField.forBoolean("isOnlyMetrics", "isOnlyMetrics", null, true, Collections.emptyList()), ResponseField.forCustomType("dbFilterModel", "dbFilterModel", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("showMetricsOnDashboard", "showMetricsOnDashboard", null, true, Collections.emptyList()), ResponseField.forBoolean("showMetricsInApp", "showMetricsInApp", null, true, Collections.emptyList()), ResponseField.forCustomType("addedToAppHomeOn", "addedToAppHomeOn", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, String str9, ScopeLevel scopeLevel, String str10, List<String> list, List<String> list2, List<String> list3, Boolean bool3, Boolean bool4, String str11, Boolean bool5, Boolean bool6, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.accountId = (String) Utils.checkNotNull(str2, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str3, "ownerId == null");
            this.tableName = (String) Utils.checkNotNull(str4, "tableName == null");
            this.viewName = (String) Utils.checkNotNull(str5, "viewName == null");
            this.isSystemCreated = bool;
            this.includeAll = bool2;
            this.filterModel = str6;
            this.sortModel = str7;
            this.columnState = str8;
            this.hiddenColumnms = str9;
            this.scopeLevel = scopeLevel;
            this.scopeId = str10;
            this.forUserIds = list;
            this.forTeamIds = list2;
            this.forAuthorizations = list3;
            this.isMetrics = bool3;
            this.isOnlyMetrics = bool4;
            this.dbFilterModel = str11;
            this.showMetricsOnDashboard = bool5;
            this.showMetricsInApp = bool6;
            this.addedToAppHomeOn = str12;
            this.createdAt = str13;
            this.updatedAt = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String addedToAppHomeOn() {
            return this.addedToAppHomeOn;
        }

        public String columnState() {
            return this.columnState;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String dbFilterModel() {
            return this.dbFilterModel;
        }

        public boolean equals(Object obj) {
            Boolean bool;
            Boolean bool2;
            String str;
            String str2;
            String str3;
            String str4;
            ScopeLevel scopeLevel;
            String str5;
            List<String> list;
            List<String> list2;
            List<String> list3;
            Boolean bool3;
            Boolean bool4;
            String str6;
            Boolean bool5;
            Boolean bool6;
            String str7;
            String str8;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.accountId.equals(item.accountId) && this.ownerId.equals(item.ownerId) && this.tableName.equals(item.tableName) && this.viewName.equals(item.viewName) && ((bool = this.isSystemCreated) != null ? bool.equals(item.isSystemCreated) : item.isSystemCreated == null) && ((bool2 = this.includeAll) != null ? bool2.equals(item.includeAll) : item.includeAll == null) && ((str = this.filterModel) != null ? str.equals(item.filterModel) : item.filterModel == null) && ((str2 = this.sortModel) != null ? str2.equals(item.sortModel) : item.sortModel == null) && ((str3 = this.columnState) != null ? str3.equals(item.columnState) : item.columnState == null) && ((str4 = this.hiddenColumnms) != null ? str4.equals(item.hiddenColumnms) : item.hiddenColumnms == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(item.scopeLevel) : item.scopeLevel == null) && ((str5 = this.scopeId) != null ? str5.equals(item.scopeId) : item.scopeId == null) && ((list = this.forUserIds) != null ? list.equals(item.forUserIds) : item.forUserIds == null) && ((list2 = this.forTeamIds) != null ? list2.equals(item.forTeamIds) : item.forTeamIds == null) && ((list3 = this.forAuthorizations) != null ? list3.equals(item.forAuthorizations) : item.forAuthorizations == null) && ((bool3 = this.isMetrics) != null ? bool3.equals(item.isMetrics) : item.isMetrics == null) && ((bool4 = this.isOnlyMetrics) != null ? bool4.equals(item.isOnlyMetrics) : item.isOnlyMetrics == null) && ((str6 = this.dbFilterModel) != null ? str6.equals(item.dbFilterModel) : item.dbFilterModel == null) && ((bool5 = this.showMetricsOnDashboard) != null ? bool5.equals(item.showMetricsOnDashboard) : item.showMetricsOnDashboard == null) && ((bool6 = this.showMetricsInApp) != null ? bool6.equals(item.showMetricsInApp) : item.showMetricsInApp == null) && ((str7 = this.addedToAppHomeOn) != null ? str7.equals(item.addedToAppHomeOn) : item.addedToAppHomeOn == null) && ((str8 = this.createdAt) != null ? str8.equals(item.createdAt) : item.createdAt == null)) {
                String str9 = this.updatedAt;
                String str10 = item.updatedAt;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public String filterModel() {
            return this.filterModel;
        }

        public List<String> forAuthorizations() {
            return this.forAuthorizations;
        }

        public List<String> forTeamIds() {
            return this.forTeamIds;
        }

        public List<String> forUserIds() {
            return this.forUserIds;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003) ^ this.tableName.hashCode()) * 1000003) ^ this.viewName.hashCode()) * 1000003;
                Boolean bool = this.isSystemCreated;
                int iHashCode2 = (iHashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.includeAll;
                int iHashCode3 = (iHashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str = this.filterModel;
                int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.sortModel;
                int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.columnState;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.hiddenColumnms;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                ScopeLevel scopeLevel = this.scopeLevel;
                int iHashCode8 = (iHashCode7 ^ (scopeLevel == null ? 0 : scopeLevel.hashCode())) * 1000003;
                String str5 = this.scopeId;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.forUserIds;
                int iHashCode10 = (iHashCode9 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.forTeamIds;
                int iHashCode11 = (iHashCode10 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<String> list3 = this.forAuthorizations;
                int iHashCode12 = (iHashCode11 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                Boolean bool3 = this.isMetrics;
                int iHashCode13 = (iHashCode12 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.isOnlyMetrics;
                int iHashCode14 = (iHashCode13 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                String str6 = this.dbFilterModel;
                int iHashCode15 = (iHashCode14 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Boolean bool5 = this.showMetricsOnDashboard;
                int iHashCode16 = (iHashCode15 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.showMetricsInApp;
                int iHashCode17 = (iHashCode16 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                String str7 = this.addedToAppHomeOn;
                int iHashCode18 = (iHashCode17 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode19 = (iHashCode18 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                this.$hashCode = iHashCode19 ^ (str9 != null ? str9.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String hiddenColumnms() {
            return this.hiddenColumnms;
        }

        public Boolean includeAll() {
            return this.includeAll;
        }

        public Boolean isMetrics() {
            return this.isMetrics;
        }

        public Boolean isOnlyMetrics() {
            return this.isOnlyMetrics;
        }

        public Boolean isSystemCreated() {
            return this.isSystemCreated;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.ownerId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.tableName);
                    responseWriter.writeString(responseFieldArr[4], Item.this.viewName);
                    responseWriter.writeBoolean(responseFieldArr[5], Item.this.isSystemCreated);
                    responseWriter.writeBoolean(responseFieldArr[6], Item.this.includeAll);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.filterModel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.sortModel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.columnState);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[10], Item.this.hiddenColumnms);
                    ResponseField responseField = responseFieldArr[11];
                    ScopeLevel scopeLevel = Item.this.scopeLevel;
                    responseWriter.writeString(responseField, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.scopeId);
                    responseWriter.writeList(responseFieldArr[13], Item.this.forUserIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[14], Item.this.forTeamIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Item.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[15], Item.this.forAuthorizations, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Item.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeBoolean(responseFieldArr[16], Item.this.isMetrics);
                    responseWriter.writeBoolean(responseFieldArr[17], Item.this.isOnlyMetrics);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.dbFilterModel);
                    responseWriter.writeBoolean(responseFieldArr[19], Item.this.showMetricsOnDashboard);
                    responseWriter.writeBoolean(responseFieldArr[20], Item.this.showMetricsInApp);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.addedToAppHomeOn);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.updatedAt);
                }
            };
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String scopeId() {
            return this.scopeId;
        }

        public ScopeLevel scopeLevel() {
            return this.scopeLevel;
        }

        public Boolean showMetricsInApp() {
            return this.showMetricsInApp;
        }

        public Boolean showMetricsOnDashboard() {
            return this.showMetricsOnDashboard;
        }

        public String sortModel() {
            return this.sortModel;
        }

        public String tableName() {
            return this.tableName;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", tableName=" + this.tableName + ", viewName=" + this.viewName + ", isSystemCreated=" + this.isSystemCreated + ", includeAll=" + this.includeAll + ", filterModel=" + this.filterModel + ", sortModel=" + this.sortModel + ", columnState=" + this.columnState + ", hiddenColumnms=" + this.hiddenColumnms + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", forUserIds=" + this.forUserIds + ", forTeamIds=" + this.forTeamIds + ", forAuthorizations=" + this.forAuthorizations + ", isMetrics=" + this.isMetrics + ", isOnlyMetrics=" + this.isOnlyMetrics + ", dbFilterModel=" + this.dbFilterModel + ", showMetricsOnDashboard=" + this.showMetricsOnDashboard + ", showMetricsInApp=" + this.showMetricsInApp + ", addedToAppHomeOn=" + this.addedToAppHomeOn + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String viewName() {
            return this.viewName;
        }
    }

    public static class ListSavedTableViewss {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListSavedTableViewss> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListSavedTableViewss map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListSavedTableViewss.$responseFields;
                return new ListSavedTableViewss(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.ListSavedTableViewss.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.ListSavedTableViewss.Mapper.1.1
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

        public ListSavedTableViewss(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListSavedTableViewss)) {
                return false;
            }
            ListSavedTableViewss listSavedTableViewss = (ListSavedTableViewss) obj;
            if (this.__typename.equals(listSavedTableViewss.__typename) && this.items.equals(listSavedTableViewss.items)) {
                String str = this.nextToken;
                String str2 = listSavedTableViewss.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.ListSavedTableViewss.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListSavedTableViewss.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListSavedTableViewss.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListSavedTableViewss.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.ListSavedTableViewss.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListSavedTableViewss.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListSavedTableViewss{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelSavedTableViewsFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSavedTableViewsPrimaryCompositeKeyConditionInput ownerIdTableNameViewName;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelSavedTableViewsPrimaryCompositeKeyConditionInput modelSavedTableViewsPrimaryCompositeKeyConditionInput, ModelSavedTableViewsFilterInput modelSavedTableViewsFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.ownerIdTableNameViewName = modelSavedTableViewsPrimaryCompositeKeyConditionInput;
            this.filter = modelSavedTableViewsFilterInput;
            this.limit = num;
            this.nextToken = str2;
            this.sortDirection = modelSortDirection;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("ownerIdTableNameViewName", modelSavedTableViewsPrimaryCompositeKeyConditionInput);
            linkedHashMap.put("filter", modelSavedTableViewsFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
            linkedHashMap.put("sortDirection", modelSortDirection);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelSavedTableViewsFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedTableViewssQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("ownerIdTableNameViewName", Variables.this.ownerIdTableNameViewName != null ? Variables.this.ownerIdTableNameViewName.marshaller() : null);
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                    inputFieldWriter.writeString("sortDirection", Variables.this.sortDirection != null ? Variables.this.sortDirection.name() : null);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public ModelSavedTableViewsPrimaryCompositeKeyConditionInput ownerIdTableNameViewName() {
            return this.ownerIdTableNameViewName;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public ListSavedTableViewssQuery(String str, ModelSavedTableViewsPrimaryCompositeKeyConditionInput modelSavedTableViewsPrimaryCompositeKeyConditionInput, ModelSavedTableViewsFilterInput modelSavedTableViewsFilterInput, Integer num, String str2, ModelSortDirection modelSortDirection) {
        this.variables = new Variables(str, modelSavedTableViewsPrimaryCompositeKeyConditionInput, modelSavedTableViewsFilterInput, num, str2, modelSortDirection);
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
        return "17d43c8ecd91d583487901827e460b07cc3bee3193cdc5f5fba3058182b58536";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListSavedTableViewss($accountId: ID, $ownerIdTableNameViewName: ModelSavedTableViewsPrimaryCompositeKeyConditionInput, $filter: ModelSavedTableViewsFilterInput, $limit: Int, $nextToken: String, $sortDirection: ModelSortDirection) {\n  listSavedTableViewss(accountId: $accountId, ownerIdTableNameViewName: $ownerIdTableNameViewName, filter: $filter, limit: $limit, nextToken: $nextToken, sortDirection: $sortDirection) {\n    __typename\n    items {\n      __typename\n      accountId\n      ownerId\n      tableName\n      viewName\n      isSystemCreated\n      includeAll\n      filterModel\n      sortModel\n      columnState\n      hiddenColumnms\n      scopeLevel\n      scopeId\n      forUserIds\n      forTeamIds\n      forAuthorizations\n      isMetrics\n      isOnlyMetrics\n      dbFilterModel\n      showMetricsOnDashboard\n      showMetricsInApp\n      addedToAppHomeOn\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
