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
import type.ModelSavedChartViewsFilterInput;
import type.ScopeLevel;

/* loaded from: classes4.dex */
public final class ListSavedChartViewssQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query ListSavedChartViewss($filter: ModelSavedChartViewsFilterInput, $limit: Int, $nextToken: String) {\n  listSavedChartViewss(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      ownerId\n      targetComponent\n      reportCategory\n      chartTitle\n      isSystemCreated\n      includeAll\n      gridType\n      aggregateOnField\n      aggregationType\n      defaultPivotOnAttribute\n      timeFilterAttributeName\n      objectTypeName\n      appliedFilter\n      filterModel\n      dateBuckets\n      scopeLevel\n      scopeId\n      forUserIds\n      forTeamIds\n      forAuthorizations\n      displayInformation\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "ListSavedChartViewss";
        }
    };
    public static final String QUERY_DOCUMENT = "query ListSavedChartViewss($filter: ModelSavedChartViewsFilterInput, $limit: Int, $nextToken: String) {\n  listSavedChartViewss(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      ownerId\n      targetComponent\n      reportCategory\n      chartTitle\n      isSystemCreated\n      includeAll\n      gridType\n      aggregateOnField\n      aggregationType\n      defaultPivotOnAttribute\n      timeFilterAttributeName\n      objectTypeName\n      appliedFilter\n      filterModel\n      dateBuckets\n      scopeLevel\n      scopeId\n      forUserIds\n      forTeamIds\n      forAuthorizations\n      displayInformation\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelSavedChartViewsFilterInput filter;
        private Integer limit;
        private String nextToken;

        public ListSavedChartViewssQuery build() {
            return new ListSavedChartViewssQuery(this.filter, this.limit, this.nextToken);
        }

        public Builder filter(ModelSavedChartViewsFilterInput modelSavedChartViewsFilterInput) {
            this.filter = modelSavedChartViewsFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("listSavedChartViewss", "listSavedChartViewss", new UnmodifiableMapBuilder(3).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final ListSavedChartViewss listSavedChartViewss;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ListSavedChartViewss.Mapper listSavedChartViewssFieldMapper = new ListSavedChartViewss.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((ListSavedChartViewss) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ListSavedChartViewss>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ListSavedChartViewss read(ResponseReader responseReader2) {
                        return Mapper.this.listSavedChartViewssFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(ListSavedChartViewss listSavedChartViewss) {
            this.listSavedChartViewss = listSavedChartViewss;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            ListSavedChartViewss listSavedChartViewss = this.listSavedChartViewss;
            ListSavedChartViewss listSavedChartViewss2 = ((Data) obj).listSavedChartViewss;
            return listSavedChartViewss == null ? listSavedChartViewss2 == null : listSavedChartViewss.equals(listSavedChartViewss2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ListSavedChartViewss listSavedChartViewss = this.listSavedChartViewss;
                this.$hashCode = (listSavedChartViewss == null ? 0 : listSavedChartViewss.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ListSavedChartViewss listSavedChartViewss() {
            return this.listSavedChartViewss;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    ListSavedChartViewss listSavedChartViewss = Data.this.listSavedChartViewss;
                    responseWriter.writeObject(responseField, listSavedChartViewss != null ? listSavedChartViewss.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listSavedChartViewss=" + this.listSavedChartViewss + "}";
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
        final String aggregateOnField;
        final String aggregationType;
        final String appliedFilter;
        final String chartTitle;
        final String createdAt;
        final String dateBuckets;
        final String defaultPivotOnAttribute;
        final String displayInformation;
        final String filterModel;
        final List<String> forAuthorizations;
        final List<String> forTeamIds;
        final List<String> forUserIds;
        final String gridType;
        final String id;
        final Boolean includeAll;
        final Boolean isSystemCreated;
        final String objectTypeName;
        final String ownerId;
        final String reportCategory;
        final String scopeId;
        final ScopeLevel scopeLevel;
        final String targetComponent;
        final String timeFilterAttributeName;
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
                String string3 = responseReader.readString(responseFieldArr[5]);
                String string4 = responseReader.readString(responseFieldArr[6]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String string5 = responseReader.readString(responseFieldArr[9]);
                String string6 = responseReader.readString(responseFieldArr[10]);
                String string7 = responseReader.readString(responseFieldArr[11]);
                String string8 = responseReader.readString(responseFieldArr[12]);
                String string9 = responseReader.readString(responseFieldArr[13]);
                String string10 = responseReader.readString(responseFieldArr[14]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                String string11 = responseReader.readString(responseFieldArr[18]);
                return new Item(string, str, str2, str3, string2, string3, string4, bool, bool2, string5, string6, string7, string8, string9, string10, str4, str5, str6, string11 != null ? ScopeLevel.valueOf(string11) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readList(responseFieldArr[20], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[21], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Item.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[22], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Item.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("targetComponent", "targetComponent", null, true, Collections.emptyList()), ResponseField.forString("reportCategory", "reportCategory", null, true, Collections.emptyList()), ResponseField.forString("chartTitle", "chartTitle", null, false, Collections.emptyList()), ResponseField.forBoolean("isSystemCreated", "isSystemCreated", null, true, Collections.emptyList()), ResponseField.forBoolean("includeAll", "includeAll", null, true, Collections.emptyList()), ResponseField.forString("gridType", "gridType", null, true, Collections.emptyList()), ResponseField.forString("aggregateOnField", "aggregateOnField", null, true, Collections.emptyList()), ResponseField.forString("aggregationType", "aggregationType", null, true, Collections.emptyList()), ResponseField.forString("defaultPivotOnAttribute", "defaultPivotOnAttribute", null, true, Collections.emptyList()), ResponseField.forString("timeFilterAttributeName", "timeFilterAttributeName", null, true, Collections.emptyList()), ResponseField.forString("objectTypeName", "objectTypeName", null, true, Collections.emptyList()), ResponseField.forCustomType("appliedFilter", "appliedFilter", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("filterModel", "filterModel", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("dateBuckets", "dateBuckets", null, true, customType2, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forList("forUserIds", "forUserIds", null, true, Collections.emptyList()), ResponseField.forList("forTeamIds", "forTeamIds", null, true, Collections.emptyList()), ResponseField.forList("forAuthorizations", "forAuthorizations", null, true, Collections.emptyList()), ResponseField.forCustomType("displayInformation", "displayInformation", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ScopeLevel scopeLevel, String str17, List<String> list, List<String> list2, List<String> list3, String str18, String str19, String str20) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str4, "ownerId == null");
            this.targetComponent = str5;
            this.reportCategory = str6;
            this.chartTitle = (String) Utils.checkNotNull(str7, "chartTitle == null");
            this.isSystemCreated = bool;
            this.includeAll = bool2;
            this.gridType = str8;
            this.aggregateOnField = str9;
            this.aggregationType = str10;
            this.defaultPivotOnAttribute = str11;
            this.timeFilterAttributeName = str12;
            this.objectTypeName = str13;
            this.appliedFilter = str14;
            this.filterModel = str15;
            this.dateBuckets = str16;
            this.scopeLevel = scopeLevel;
            this.scopeId = str17;
            this.forUserIds = list;
            this.forTeamIds = list2;
            this.forAuthorizations = list3;
            this.displayInformation = str18;
            this.createdAt = str19;
            this.updatedAt = str20;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String aggregateOnField() {
            return this.aggregateOnField;
        }

        public String aggregationType() {
            return this.aggregationType;
        }

        public String appliedFilter() {
            return this.appliedFilter;
        }

        public String chartTitle() {
            return this.chartTitle;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String dateBuckets() {
            return this.dateBuckets;
        }

        public String defaultPivotOnAttribute() {
            return this.defaultPivotOnAttribute;
        }

        public String displayInformation() {
            return this.displayInformation;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            ScopeLevel scopeLevel;
            String str12;
            List<String> list;
            List<String> list2;
            List<String> list3;
            String str13;
            String str14;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.ownerId.equals(item.ownerId) && ((str = this.targetComponent) != null ? str.equals(item.targetComponent) : item.targetComponent == null) && ((str2 = this.reportCategory) != null ? str2.equals(item.reportCategory) : item.reportCategory == null) && this.chartTitle.equals(item.chartTitle) && ((bool = this.isSystemCreated) != null ? bool.equals(item.isSystemCreated) : item.isSystemCreated == null) && ((bool2 = this.includeAll) != null ? bool2.equals(item.includeAll) : item.includeAll == null) && ((str3 = this.gridType) != null ? str3.equals(item.gridType) : item.gridType == null) && ((str4 = this.aggregateOnField) != null ? str4.equals(item.aggregateOnField) : item.aggregateOnField == null) && ((str5 = this.aggregationType) != null ? str5.equals(item.aggregationType) : item.aggregationType == null) && ((str6 = this.defaultPivotOnAttribute) != null ? str6.equals(item.defaultPivotOnAttribute) : item.defaultPivotOnAttribute == null) && ((str7 = this.timeFilterAttributeName) != null ? str7.equals(item.timeFilterAttributeName) : item.timeFilterAttributeName == null) && ((str8 = this.objectTypeName) != null ? str8.equals(item.objectTypeName) : item.objectTypeName == null) && ((str9 = this.appliedFilter) != null ? str9.equals(item.appliedFilter) : item.appliedFilter == null) && ((str10 = this.filterModel) != null ? str10.equals(item.filterModel) : item.filterModel == null) && ((str11 = this.dateBuckets) != null ? str11.equals(item.dateBuckets) : item.dateBuckets == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(item.scopeLevel) : item.scopeLevel == null) && ((str12 = this.scopeId) != null ? str12.equals(item.scopeId) : item.scopeId == null) && ((list = this.forUserIds) != null ? list.equals(item.forUserIds) : item.forUserIds == null) && ((list2 = this.forTeamIds) != null ? list2.equals(item.forTeamIds) : item.forTeamIds == null) && ((list3 = this.forAuthorizations) != null ? list3.equals(item.forAuthorizations) : item.forAuthorizations == null) && ((str13 = this.displayInformation) != null ? str13.equals(item.displayInformation) : item.displayInformation == null) && ((str14 = this.createdAt) != null ? str14.equals(item.createdAt) : item.createdAt == null)) {
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

        public String gridType() {
            return this.gridType;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str = this.targetComponent;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.reportCategory;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.chartTitle.hashCode()) * 1000003;
                Boolean bool = this.isSystemCreated;
                int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.includeAll;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.gridType;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.aggregateOnField;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.aggregationType;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.defaultPivotOnAttribute;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.timeFilterAttributeName;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.objectTypeName;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.appliedFilter;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.filterModel;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.dateBuckets;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                ScopeLevel scopeLevel = this.scopeLevel;
                int iHashCode15 = (iHashCode14 ^ (scopeLevel == null ? 0 : scopeLevel.hashCode())) * 1000003;
                String str12 = this.scopeId;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list = this.forUserIds;
                int iHashCode17 = (iHashCode16 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.forTeamIds;
                int iHashCode18 = (iHashCode17 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<String> list3 = this.forAuthorizations;
                int iHashCode19 = (iHashCode18 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str13 = this.displayInformation;
                int iHashCode20 = (iHashCode19 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode21 = (iHashCode20 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode21 ^ (str15 != null ? str15.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean includeAll() {
            return this.includeAll;
        }

        public Boolean isSystemCreated() {
            return this.isSystemCreated;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.ownerId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.targetComponent);
                    responseWriter.writeString(responseFieldArr[5], Item.this.reportCategory);
                    responseWriter.writeString(responseFieldArr[6], Item.this.chartTitle);
                    responseWriter.writeBoolean(responseFieldArr[7], Item.this.isSystemCreated);
                    responseWriter.writeBoolean(responseFieldArr[8], Item.this.includeAll);
                    responseWriter.writeString(responseFieldArr[9], Item.this.gridType);
                    responseWriter.writeString(responseFieldArr[10], Item.this.aggregateOnField);
                    responseWriter.writeString(responseFieldArr[11], Item.this.aggregationType);
                    responseWriter.writeString(responseFieldArr[12], Item.this.defaultPivotOnAttribute);
                    responseWriter.writeString(responseFieldArr[13], Item.this.timeFilterAttributeName);
                    responseWriter.writeString(responseFieldArr[14], Item.this.objectTypeName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.appliedFilter);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.filterModel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.dateBuckets);
                    ResponseField responseField = responseFieldArr[18];
                    ScopeLevel scopeLevel = Item.this.scopeLevel;
                    responseWriter.writeString(responseField, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.scopeId);
                    responseWriter.writeList(responseFieldArr[20], Item.this.forUserIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[21], Item.this.forTeamIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Item.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[22], Item.this.forAuthorizations, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Item.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.displayInformation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Item.this.updatedAt);
                }
            };
        }

        public String objectTypeName() {
            return this.objectTypeName;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String reportCategory() {
            return this.reportCategory;
        }

        public String scopeId() {
            return this.scopeId;
        }

        public ScopeLevel scopeLevel() {
            return this.scopeLevel;
        }

        public String targetComponent() {
            return this.targetComponent;
        }

        public String timeFilterAttributeName() {
            return this.timeFilterAttributeName;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", targetComponent=" + this.targetComponent + ", reportCategory=" + this.reportCategory + ", chartTitle=" + this.chartTitle + ", isSystemCreated=" + this.isSystemCreated + ", includeAll=" + this.includeAll + ", gridType=" + this.gridType + ", aggregateOnField=" + this.aggregateOnField + ", aggregationType=" + this.aggregationType + ", defaultPivotOnAttribute=" + this.defaultPivotOnAttribute + ", timeFilterAttributeName=" + this.timeFilterAttributeName + ", objectTypeName=" + this.objectTypeName + ", appliedFilter=" + this.appliedFilter + ", filterModel=" + this.filterModel + ", dateBuckets=" + this.dateBuckets + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", forUserIds=" + this.forUserIds + ", forTeamIds=" + this.forTeamIds + ", forAuthorizations=" + this.forAuthorizations + ", displayInformation=" + this.displayInformation + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class ListSavedChartViewss {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ListSavedChartViewss> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ListSavedChartViewss map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ListSavedChartViewss.$responseFields;
                return new ListSavedChartViewss(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.ListSavedChartViewss.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.ListSavedChartViewss.Mapper.1.1
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

        public ListSavedChartViewss(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof ListSavedChartViewss)) {
                return false;
            }
            ListSavedChartViewss listSavedChartViewss = (ListSavedChartViewss) obj;
            if (this.__typename.equals(listSavedChartViewss.__typename) && this.items.equals(listSavedChartViewss.items)) {
                String str = this.nextToken;
                String str2 = listSavedChartViewss.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.ListSavedChartViewss.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ListSavedChartViewss.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ListSavedChartViewss.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], ListSavedChartViewss.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.ListSavedChartViewss.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], ListSavedChartViewss.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListSavedChartViewss{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelSavedChartViewsFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final transient Map<String, Object> valueMap;

        public Variables(ModelSavedChartViewsFilterInput modelSavedChartViewsFilterInput, Integer num, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = modelSavedChartViewsFilterInput;
            this.limit = num;
            this.nextToken = str;
            linkedHashMap.put("filter", modelSavedChartViewsFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
        }

        public ModelSavedChartViewsFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.ListSavedChartViewssQuery.Variables.1
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

    public ListSavedChartViewssQuery(ModelSavedChartViewsFilterInput modelSavedChartViewsFilterInput, Integer num, String str) {
        this.variables = new Variables(modelSavedChartViewsFilterInput, num, str);
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
        return "e7afd02aedbe821e1cdc0b092a9271ccbb736ab58ee13809a1039e81eeeeccf0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query ListSavedChartViewss($filter: ModelSavedChartViewsFilterInput, $limit: Int, $nextToken: String) {\n  listSavedChartViewss(filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      ownerId\n      targetComponent\n      reportCategory\n      chartTitle\n      isSystemCreated\n      includeAll\n      gridType\n      aggregateOnField\n      aggregationType\n      defaultPivotOnAttribute\n      timeFilterAttributeName\n      objectTypeName\n      appliedFilter\n      filterModel\n      dateBuckets\n      scopeLevel\n      scopeId\n      forUserIds\n      forTeamIds\n      forAuthorizations\n      displayInformation\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
