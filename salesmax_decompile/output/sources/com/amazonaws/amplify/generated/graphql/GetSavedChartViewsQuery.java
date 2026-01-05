package com.amazonaws.amplify.generated.graphql;

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
import type.ScopeLevel;

/* loaded from: classes7.dex */
public final class GetSavedChartViewsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetSavedChartViews($id: ID!) {\n  getSavedChartViews(id: $id) {\n    __typename\n    id\n    accountId\n    ownerId\n    targetComponent\n    reportCategory\n    chartTitle\n    isSystemCreated\n    includeAll\n    gridType\n    aggregateOnField\n    aggregationType\n    defaultPivotOnAttribute\n    timeFilterAttributeName\n    objectTypeName\n    appliedFilter\n    filterModel\n    dateBuckets\n    position {\n      __typename\n      x\n      y\n      width\n      height\n      minW\n      minH\n      selector\n    }\n    scopeLevel\n    scopeId\n    forUserIds\n    forTeamIds\n    forAuthorizations\n    displayInformation\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetSavedChartViews";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetSavedChartViews($id: ID!) {\n  getSavedChartViews(id: $id) {\n    __typename\n    id\n    accountId\n    ownerId\n    targetComponent\n    reportCategory\n    chartTitle\n    isSystemCreated\n    includeAll\n    gridType\n    aggregateOnField\n    aggregationType\n    defaultPivotOnAttribute\n    timeFilterAttributeName\n    objectTypeName\n    appliedFilter\n    filterModel\n    dateBuckets\n    position {\n      __typename\n      x\n      y\n      width\n      height\n      minW\n      minH\n      selector\n    }\n    scopeLevel\n    scopeId\n    forUserIds\n    forTeamIds\n    forAuthorizations\n    displayInformation\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetSavedChartViewsQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetSavedChartViewsQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getSavedChartViews", "getSavedChartViews", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetSavedChartViews getSavedChartViews;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetSavedChartViews.Mapper getSavedChartViewsFieldMapper = new GetSavedChartViews.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetSavedChartViews) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetSavedChartViews>() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetSavedChartViews read(ResponseReader responseReader2) {
                        return Mapper.this.getSavedChartViewsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetSavedChartViews getSavedChartViews) {
            this.getSavedChartViews = getSavedChartViews;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetSavedChartViews getSavedChartViews = this.getSavedChartViews;
            GetSavedChartViews getSavedChartViews2 = ((Data) obj).getSavedChartViews;
            return getSavedChartViews == null ? getSavedChartViews2 == null : getSavedChartViews.equals(getSavedChartViews2);
        }

        public GetSavedChartViews getSavedChartViews() {
            return this.getSavedChartViews;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetSavedChartViews getSavedChartViews = this.getSavedChartViews;
                this.$hashCode = (getSavedChartViews == null ? 0 : getSavedChartViews.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetSavedChartViews getSavedChartViews = Data.this.getSavedChartViews;
                    responseWriter.writeObject(responseField, getSavedChartViews != null ? getSavedChartViews.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getSavedChartViews=" + this.getSavedChartViews + "}";
            }
            return this.$toString;
        }
    }

    public static class GetSavedChartViews {
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
        final Position position;
        final String reportCategory;
        final String scopeId;
        final ScopeLevel scopeLevel;
        final String targetComponent;
        final String timeFilterAttributeName;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<GetSavedChartViews> {
            final Position.Mapper positionFieldMapper = new Position.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetSavedChartViews map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetSavedChartViews.$responseFields;
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
                Position position = (Position) responseReader.readObject(responseFieldArr[18], new ResponseReader.ObjectReader<Position>() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Position read(ResponseReader responseReader2) {
                        return Mapper.this.positionFieldMapper.map(responseReader2);
                    }
                });
                String string11 = responseReader.readString(responseFieldArr[19]);
                return new GetSavedChartViews(string, str, str2, str3, string2, string3, string4, bool, bool2, string5, string6, string7, string8, string9, string10, str4, str5, str6, position, string11 != null ? ScopeLevel.valueOf(string11) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readList(responseFieldArr[21], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[22], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(responseFieldArr[23], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.Mapper.4
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("targetComponent", "targetComponent", null, true, Collections.emptyList()), ResponseField.forString("reportCategory", "reportCategory", null, true, Collections.emptyList()), ResponseField.forString("chartTitle", "chartTitle", null, false, Collections.emptyList()), ResponseField.forBoolean("isSystemCreated", "isSystemCreated", null, true, Collections.emptyList()), ResponseField.forBoolean("includeAll", "includeAll", null, true, Collections.emptyList()), ResponseField.forString("gridType", "gridType", null, true, Collections.emptyList()), ResponseField.forString("aggregateOnField", "aggregateOnField", null, true, Collections.emptyList()), ResponseField.forString("aggregationType", "aggregationType", null, true, Collections.emptyList()), ResponseField.forString("defaultPivotOnAttribute", "defaultPivotOnAttribute", null, true, Collections.emptyList()), ResponseField.forString("timeFilterAttributeName", "timeFilterAttributeName", null, true, Collections.emptyList()), ResponseField.forString("objectTypeName", "objectTypeName", null, true, Collections.emptyList()), ResponseField.forCustomType("appliedFilter", "appliedFilter", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("filterModel", "filterModel", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("dateBuckets", "dateBuckets", null, true, customType2, Collections.emptyList()), ResponseField.forObject("position", "position", null, true, Collections.emptyList()), ResponseField.forString("scopeLevel", "scopeLevel", null, true, Collections.emptyList()), ResponseField.forCustomType("scopeId", "scopeId", null, true, customType, Collections.emptyList()), ResponseField.forList("forUserIds", "forUserIds", null, true, Collections.emptyList()), ResponseField.forList("forTeamIds", "forTeamIds", null, true, Collections.emptyList()), ResponseField.forList("forAuthorizations", "forAuthorizations", null, true, Collections.emptyList()), ResponseField.forCustomType("displayInformation", "displayInformation", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public GetSavedChartViews(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Position position, ScopeLevel scopeLevel, String str17, List<String> list, List<String> list2, List<String> list3, String str18, String str19, String str20) {
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
            this.position = position;
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
            Position position;
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
            if (!(obj instanceof GetSavedChartViews)) {
                return false;
            }
            GetSavedChartViews getSavedChartViews = (GetSavedChartViews) obj;
            if (this.__typename.equals(getSavedChartViews.__typename) && this.id.equals(getSavedChartViews.id) && this.accountId.equals(getSavedChartViews.accountId) && this.ownerId.equals(getSavedChartViews.ownerId) && ((str = this.targetComponent) != null ? str.equals(getSavedChartViews.targetComponent) : getSavedChartViews.targetComponent == null) && ((str2 = this.reportCategory) != null ? str2.equals(getSavedChartViews.reportCategory) : getSavedChartViews.reportCategory == null) && this.chartTitle.equals(getSavedChartViews.chartTitle) && ((bool = this.isSystemCreated) != null ? bool.equals(getSavedChartViews.isSystemCreated) : getSavedChartViews.isSystemCreated == null) && ((bool2 = this.includeAll) != null ? bool2.equals(getSavedChartViews.includeAll) : getSavedChartViews.includeAll == null) && ((str3 = this.gridType) != null ? str3.equals(getSavedChartViews.gridType) : getSavedChartViews.gridType == null) && ((str4 = this.aggregateOnField) != null ? str4.equals(getSavedChartViews.aggregateOnField) : getSavedChartViews.aggregateOnField == null) && ((str5 = this.aggregationType) != null ? str5.equals(getSavedChartViews.aggregationType) : getSavedChartViews.aggregationType == null) && ((str6 = this.defaultPivotOnAttribute) != null ? str6.equals(getSavedChartViews.defaultPivotOnAttribute) : getSavedChartViews.defaultPivotOnAttribute == null) && ((str7 = this.timeFilterAttributeName) != null ? str7.equals(getSavedChartViews.timeFilterAttributeName) : getSavedChartViews.timeFilterAttributeName == null) && ((str8 = this.objectTypeName) != null ? str8.equals(getSavedChartViews.objectTypeName) : getSavedChartViews.objectTypeName == null) && ((str9 = this.appliedFilter) != null ? str9.equals(getSavedChartViews.appliedFilter) : getSavedChartViews.appliedFilter == null) && ((str10 = this.filterModel) != null ? str10.equals(getSavedChartViews.filterModel) : getSavedChartViews.filterModel == null) && ((str11 = this.dateBuckets) != null ? str11.equals(getSavedChartViews.dateBuckets) : getSavedChartViews.dateBuckets == null) && ((position = this.position) != null ? position.equals(getSavedChartViews.position) : getSavedChartViews.position == null) && ((scopeLevel = this.scopeLevel) != null ? scopeLevel.equals(getSavedChartViews.scopeLevel) : getSavedChartViews.scopeLevel == null) && ((str12 = this.scopeId) != null ? str12.equals(getSavedChartViews.scopeId) : getSavedChartViews.scopeId == null) && ((list = this.forUserIds) != null ? list.equals(getSavedChartViews.forUserIds) : getSavedChartViews.forUserIds == null) && ((list2 = this.forTeamIds) != null ? list2.equals(getSavedChartViews.forTeamIds) : getSavedChartViews.forTeamIds == null) && ((list3 = this.forAuthorizations) != null ? list3.equals(getSavedChartViews.forAuthorizations) : getSavedChartViews.forAuthorizations == null) && ((str13 = this.displayInformation) != null ? str13.equals(getSavedChartViews.displayInformation) : getSavedChartViews.displayInformation == null) && ((str14 = this.createdAt) != null ? str14.equals(getSavedChartViews.createdAt) : getSavedChartViews.createdAt == null)) {
                String str15 = this.updatedAt;
                String str16 = getSavedChartViews.updatedAt;
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
                Position position = this.position;
                int iHashCode15 = (iHashCode14 ^ (position == null ? 0 : position.hashCode())) * 1000003;
                ScopeLevel scopeLevel = this.scopeLevel;
                int iHashCode16 = (iHashCode15 ^ (scopeLevel == null ? 0 : scopeLevel.hashCode())) * 1000003;
                String str12 = this.scopeId;
                int iHashCode17 = (iHashCode16 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                List<String> list = this.forUserIds;
                int iHashCode18 = (iHashCode17 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.forTeamIds;
                int iHashCode19 = (iHashCode18 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<String> list3 = this.forAuthorizations;
                int iHashCode20 = (iHashCode19 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str13 = this.displayInformation;
                int iHashCode21 = (iHashCode20 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode22 = (iHashCode21 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode22 ^ (str15 != null ? str15.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetSavedChartViews.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetSavedChartViews.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetSavedChartViews.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetSavedChartViews.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetSavedChartViews.this.ownerId);
                    responseWriter.writeString(responseFieldArr[4], GetSavedChartViews.this.targetComponent);
                    responseWriter.writeString(responseFieldArr[5], GetSavedChartViews.this.reportCategory);
                    responseWriter.writeString(responseFieldArr[6], GetSavedChartViews.this.chartTitle);
                    responseWriter.writeBoolean(responseFieldArr[7], GetSavedChartViews.this.isSystemCreated);
                    responseWriter.writeBoolean(responseFieldArr[8], GetSavedChartViews.this.includeAll);
                    responseWriter.writeString(responseFieldArr[9], GetSavedChartViews.this.gridType);
                    responseWriter.writeString(responseFieldArr[10], GetSavedChartViews.this.aggregateOnField);
                    responseWriter.writeString(responseFieldArr[11], GetSavedChartViews.this.aggregationType);
                    responseWriter.writeString(responseFieldArr[12], GetSavedChartViews.this.defaultPivotOnAttribute);
                    responseWriter.writeString(responseFieldArr[13], GetSavedChartViews.this.timeFilterAttributeName);
                    responseWriter.writeString(responseFieldArr[14], GetSavedChartViews.this.objectTypeName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], GetSavedChartViews.this.appliedFilter);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], GetSavedChartViews.this.filterModel);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], GetSavedChartViews.this.dateBuckets);
                    ResponseField responseField = responseFieldArr[18];
                    Position position = GetSavedChartViews.this.position;
                    responseWriter.writeObject(responseField, position != null ? position.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[19];
                    ScopeLevel scopeLevel = GetSavedChartViews.this.scopeLevel;
                    responseWriter.writeString(responseField2, scopeLevel != null ? scopeLevel.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], GetSavedChartViews.this.scopeId);
                    responseWriter.writeList(responseFieldArr[21], GetSavedChartViews.this.forUserIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[22], GetSavedChartViews.this.forTeamIds, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[23], GetSavedChartViews.this.forAuthorizations, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.GetSavedChartViews.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], GetSavedChartViews.this.displayInformation);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], GetSavedChartViews.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], GetSavedChartViews.this.updatedAt);
                }
            };
        }

        public String objectTypeName() {
            return this.objectTypeName;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public Position position() {
            return this.position;
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
                this.$toString = "GetSavedChartViews{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", targetComponent=" + this.targetComponent + ", reportCategory=" + this.reportCategory + ", chartTitle=" + this.chartTitle + ", isSystemCreated=" + this.isSystemCreated + ", includeAll=" + this.includeAll + ", gridType=" + this.gridType + ", aggregateOnField=" + this.aggregateOnField + ", aggregationType=" + this.aggregationType + ", defaultPivotOnAttribute=" + this.defaultPivotOnAttribute + ", timeFilterAttributeName=" + this.timeFilterAttributeName + ", objectTypeName=" + this.objectTypeName + ", appliedFilter=" + this.appliedFilter + ", filterModel=" + this.filterModel + ", dateBuckets=" + this.dateBuckets + ", position=" + this.position + ", scopeLevel=" + this.scopeLevel + ", scopeId=" + this.scopeId + ", forUserIds=" + this.forUserIds + ", forTeamIds=" + this.forTeamIds + ", forAuthorizations=" + this.forAuthorizations + ", displayInformation=" + this.displayInformation + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Position {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forInt("x", "x", null, true, Collections.emptyList()), ResponseField.forInt("y", "y", null, true, Collections.emptyList()), ResponseField.forInt("width", "width", null, true, Collections.emptyList()), ResponseField.forInt("height", "height", null, true, Collections.emptyList()), ResponseField.forInt("minW", "minW", null, true, Collections.emptyList()), ResponseField.forInt("minH", "minH", null, true, Collections.emptyList()), ResponseField.forString("selector", "selector", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Integer height;
        final Integer minH;
        final Integer minW;
        final String selector;
        final Integer width;

        /* renamed from: x */
        final Integer f10612x;

        /* renamed from: y */
        final Integer f10613y;

        public static final class Mapper implements ResponseFieldMapper<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Position map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Position.$responseFields;
                return new Position(responseReader.readString(responseFieldArr[0]), responseReader.readInt(responseFieldArr[1]), responseReader.readInt(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]), responseReader.readInt(responseFieldArr[4]), responseReader.readInt(responseFieldArr[5]), responseReader.readInt(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]));
            }
        }

        public Position(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.f10612x = num;
            this.f10613y = num2;
            this.width = num3;
            this.height = num4;
            this.minW = num5;
            this.minH = num6;
            this.selector = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Position position = (Position) obj;
            if (this.__typename.equals(position.__typename) && ((num = this.f10612x) != null ? num.equals(position.f10612x) : position.f10612x == null) && ((num2 = this.f10613y) != null ? num2.equals(position.f10613y) : position.f10613y == null) && ((num3 = this.width) != null ? num3.equals(position.width) : position.width == null) && ((num4 = this.height) != null ? num4.equals(position.height) : position.height == null) && ((num5 = this.minW) != null ? num5.equals(position.minW) : position.minW == null) && ((num6 = this.minH) != null ? num6.equals(position.minH) : position.minH == null)) {
                String str = this.selector;
                String str2 = position.selector;
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
                Integer num = this.f10612x;
                int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.f10613y;
                int iHashCode3 = (iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.width;
                int iHashCode4 = (iHashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.height;
                int iHashCode5 = (iHashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.minW;
                int iHashCode6 = (iHashCode5 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.minH;
                int iHashCode7 = (iHashCode6 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                String str = this.selector;
                this.$hashCode = iHashCode7 ^ (str != null ? str.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Integer height() {
            return this.height;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.Position.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Position.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Position.this.__typename);
                    responseWriter.writeInt(responseFieldArr[1], Position.this.f10612x);
                    responseWriter.writeInt(responseFieldArr[2], Position.this.f10613y);
                    responseWriter.writeInt(responseFieldArr[3], Position.this.width);
                    responseWriter.writeInt(responseFieldArr[4], Position.this.height);
                    responseWriter.writeInt(responseFieldArr[5], Position.this.minW);
                    responseWriter.writeInt(responseFieldArr[6], Position.this.minH);
                    responseWriter.writeString(responseFieldArr[7], Position.this.selector);
                }
            };
        }

        public Integer minH() {
            return this.minH;
        }

        public Integer minW() {
            return this.minW;
        }

        public String selector() {
            return this.selector;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Position{__typename=" + this.__typename + ", x=" + this.f10612x + ", y=" + this.f10613y + ", width=" + this.width + ", height=" + this.height + ", minW=" + this.minW + ", minH=" + this.minH + ", selector=" + this.selector + "}";
            }
            return this.$toString;
        }

        public Integer width() {
            return this.width;
        }

        /* renamed from: x */
        public Integer m11000x() {
            return this.f10612x;
        }

        /* renamed from: y */
        public Integer m11001y() {
            return this.f10613y;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String id;
        private final transient Map<String, Object> valueMap;

        public Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.id = str;
            linkedHashMap.put(OutcomeConstants.OUTCOME_ID, str);
        }

        public String id() {
            return this.id;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetSavedChartViewsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, Variables.this.id);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetSavedChartViewsQuery(String str) {
        Utils.checkNotNull(str, "id == null");
        this.variables = new Variables(str);
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
        return "0bafca361a29b23f928f2c18366058234349bca8307df27d15f7f0d9823ab78e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetSavedChartViews($id: ID!) {\n  getSavedChartViews(id: $id) {\n    __typename\n    id\n    accountId\n    ownerId\n    targetComponent\n    reportCategory\n    chartTitle\n    isSystemCreated\n    includeAll\n    gridType\n    aggregateOnField\n    aggregationType\n    defaultPivotOnAttribute\n    timeFilterAttributeName\n    objectTypeName\n    appliedFilter\n    filterModel\n    dateBuckets\n    position {\n      __typename\n      x\n      y\n      width\n      height\n      minW\n      minH\n      selector\n    }\n    scopeLevel\n    scopeId\n    forUserIds\n    forTeamIds\n    forAuthorizations\n    displayInformation\n    createdAt\n    updatedAt\n  }\n}";
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
