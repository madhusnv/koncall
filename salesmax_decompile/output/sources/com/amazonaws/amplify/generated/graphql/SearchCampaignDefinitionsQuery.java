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
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CampaignRunFrequencyUnit;
import type.CampaignStatus;
import type.CampaignType;
import type.CustomType;
import type.SearchableCampaignDefinitionFilterInput;
import type.SearchableCampaignDefinitionSortInput;

/* loaded from: classes4.dex */
public final class SearchCampaignDefinitionsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchCampaignDefinitions($filter: SearchableCampaignDefinitionFilterInput, $sort: SearchableCampaignDefinitionSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCampaignDefinitions(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchCampaignDefinitions";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchCampaignDefinitions($filter: SearchableCampaignDefinitionFilterInput, $sort: SearchableCampaignDefinitionSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCampaignDefinitions(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableCampaignDefinitionFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableCampaignDefinitionSortInput sort;

        public SearchCampaignDefinitionsQuery build() {
            return new SearchCampaignDefinitionsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableCampaignDefinitionFilterInput searchableCampaignDefinitionFilterInput) {
            this.filter = searchableCampaignDefinitionFilterInput;
            return this;
        }

        public Builder from(Integer num) {
            this.from = num;
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

        public Builder sort(SearchableCampaignDefinitionSortInput searchableCampaignDefinitionSortInput) {
            this.sort = searchableCampaignDefinitionSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchCampaignDefinitions", "searchCampaignDefinitions", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchCampaignDefinitions searchCampaignDefinitions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchCampaignDefinitions.Mapper searchCampaignDefinitionsFieldMapper = new SearchCampaignDefinitions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchCampaignDefinitions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchCampaignDefinitions>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchCampaignDefinitions read(ResponseReader responseReader2) {
                        return Mapper.this.searchCampaignDefinitionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchCampaignDefinitions searchCampaignDefinitions) {
            this.searchCampaignDefinitions = searchCampaignDefinitions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchCampaignDefinitions searchCampaignDefinitions = this.searchCampaignDefinitions;
            SearchCampaignDefinitions searchCampaignDefinitions2 = ((Data) obj).searchCampaignDefinitions;
            return searchCampaignDefinitions == null ? searchCampaignDefinitions2 == null : searchCampaignDefinitions.equals(searchCampaignDefinitions2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchCampaignDefinitions searchCampaignDefinitions = this.searchCampaignDefinitions;
                this.$hashCode = (searchCampaignDefinitions == null ? 0 : searchCampaignDefinitions.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchCampaignDefinitions searchCampaignDefinitions = Data.this.searchCampaignDefinitions;
                    responseWriter.writeObject(responseField, searchCampaignDefinitions != null ? searchCampaignDefinitions.marshaller() : null);
                }
            };
        }

        public SearchCampaignDefinitions searchCampaignDefinitions() {
            return this.searchCampaignDefinitions;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchCampaignDefinitions=" + this.searchCampaignDefinitions + "}";
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
        final Boolean allowMultiple;
        final String associatedEntityListId;
        final String campaignCategory;
        final String campaignChannelIdentifier;
        final String campaignData;
        final CampaignRunFrequencyUnit campaignRunFrequencyUnit;
        final Integer campaignRunFrequencyValue;
        final String campaignSubCategory;
        final CampaignType campaignType;
        final String createdAt;
        final List<String> daysToSend;
        final Integer deliveredCount;
        final String description;
        final Integer durationOfRunInDays;
        final String endDateOfRun;
        final Integer failedCount;
        final String id;
        final Boolean includeHistoricalMemberships;
        final Integer leadLimit;
        final Integer messageCreated;
        final String name;
        final String ownerId;
        final String primaryTeamId;
        final Integer readCount;
        final Integer repliedCount;
        final Integer sentCount;
        final String startDateOfRun;
        final CampaignStatus status;
        final String systemPauseReason;
        final List<String> tags;
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
                CampaignType campaignTypeValueOf = string6 != null ? CampaignType.valueOf(string6) : null;
                String string7 = responseReader.readString(responseFieldArr[8]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String string8 = responseReader.readString(responseFieldArr[10]);
                CampaignRunFrequencyUnit campaignRunFrequencyUnitValueOf = string8 != null ? CampaignRunFrequencyUnit.valueOf(string8) : null;
                Integer num = responseReader.readInt(responseFieldArr[11]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]);
                Integer num2 = responseReader.readInt(responseFieldArr[14]);
                List list = responseReader.readList(responseFieldArr[15], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                });
                String str6 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]);
                String str7 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]);
                String string9 = responseReader.readString(responseFieldArr[18]);
                return new Item(string, str, str2, string2, string3, string4, string5, campaignTypeValueOf, string7, str3, campaignRunFrequencyUnitValueOf, num, str4, str5, num2, list, str6, str7, string9 != null ? CampaignStatus.valueOf(string9) : null, responseReader.readString(responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readBoolean(responseFieldArr[21]), responseReader.readBoolean(responseFieldArr[22]), responseReader.readInt(responseFieldArr[23]), responseReader.readInt(responseFieldArr[24]), responseReader.readInt(responseFieldArr[25]), responseReader.readInt(responseFieldArr[26]), responseReader.readInt(responseFieldArr[27]), responseReader.readInt(responseFieldArr[28]), responseReader.readList(responseFieldArr[29], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Item.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readInt(responseFieldArr[30]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, false, Collections.emptyList()), ResponseField.forString("campaignCategory", "campaignCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignSubCategory", "campaignSubCategory", null, true, Collections.emptyList()), ResponseField.forString("campaignType", "campaignType", null, false, Collections.emptyList()), ResponseField.forString("campaignChannelIdentifier", "campaignChannelIdentifier", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignData", "campaignData", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("campaignRunFrequencyUnit", "campaignRunFrequencyUnit", null, true, Collections.emptyList()), ResponseField.forInt("campaignRunFrequencyValue", "campaignRunFrequencyValue", null, true, Collections.emptyList()), ResponseField.forCustomType("startDateOfRun", "startDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDateOfRun", "endDateOfRun", null, true, customType2, Collections.emptyList()), ResponseField.forInt("durationOfRunInDays", "durationOfRunInDays", null, true, Collections.emptyList()), ResponseField.forList("daysToSend", "daysToSend", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forString("systemPauseReason", "systemPauseReason", null, true, Collections.emptyList()), ResponseField.forCustomType("associatedEntityListId", "associatedEntityListId", null, false, customType, Collections.emptyList()), ResponseField.forBoolean("includeHistoricalMemberships", "includeHistoricalMemberships", null, true, Collections.emptyList()), ResponseField.forBoolean("allowMultiple", "allowMultiple", null, true, Collections.emptyList()), ResponseField.forInt("messageCreated", "messageCreated", null, true, Collections.emptyList()), ResponseField.forInt("sentCount", "sentCount", null, true, Collections.emptyList()), ResponseField.forInt("deliveredCount", "deliveredCount", null, true, Collections.emptyList()), ResponseField.forInt("readCount", "readCount", null, true, Collections.emptyList()), ResponseField.forInt("repliedCount", "repliedCount", null, true, Collections.emptyList()), ResponseField.forInt("failedCount", "failedCount", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forInt("leadLimit", "leadLimit", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, CampaignType campaignType, String str8, String str9, CampaignRunFrequencyUnit campaignRunFrequencyUnit, Integer num, String str10, String str11, Integer num2, List<String> list, String str12, String str13, CampaignStatus campaignStatus, String str14, String str15, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, List<String> list2, Integer num9, String str16, String str17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.description = (String) Utils.checkNotNull(str5, "description == null");
            this.campaignCategory = str6;
            this.campaignSubCategory = str7;
            this.campaignType = (CampaignType) Utils.checkNotNull(campaignType, "campaignType == null");
            this.campaignChannelIdentifier = str8;
            this.campaignData = str9;
            this.campaignRunFrequencyUnit = campaignRunFrequencyUnit;
            this.campaignRunFrequencyValue = num;
            this.startDateOfRun = str10;
            this.endDateOfRun = str11;
            this.durationOfRunInDays = num2;
            this.daysToSend = list;
            this.ownerId = (String) Utils.checkNotNull(str12, "ownerId == null");
            this.primaryTeamId = str13;
            this.status = (CampaignStatus) Utils.checkNotNull(campaignStatus, "status == null");
            this.systemPauseReason = str14;
            this.associatedEntityListId = (String) Utils.checkNotNull(str15, "associatedEntityListId == null");
            this.includeHistoricalMemberships = bool;
            this.allowMultiple = bool2;
            this.messageCreated = num3;
            this.sentCount = num4;
            this.deliveredCount = num5;
            this.readCount = num6;
            this.repliedCount = num7;
            this.failedCount = num8;
            this.tags = list2;
            this.leadLimit = num9;
            this.createdAt = str16;
            this.updatedAt = str17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Boolean allowMultiple() {
            return this.allowMultiple;
        }

        public String associatedEntityListId() {
            return this.associatedEntityListId;
        }

        public String campaignCategory() {
            return this.campaignCategory;
        }

        public String campaignChannelIdentifier() {
            return this.campaignChannelIdentifier;
        }

        public String campaignData() {
            return this.campaignData;
        }

        public CampaignRunFrequencyUnit campaignRunFrequencyUnit() {
            return this.campaignRunFrequencyUnit;
        }

        public Integer campaignRunFrequencyValue() {
            return this.campaignRunFrequencyValue;
        }

        public String campaignSubCategory() {
            return this.campaignSubCategory;
        }

        public CampaignType campaignType() {
            return this.campaignType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public List<String> daysToSend() {
            return this.daysToSend;
        }

        public Integer deliveredCount() {
            return this.deliveredCount;
        }

        public String description() {
            return this.description;
        }

        public Integer durationOfRunInDays() {
            return this.durationOfRunInDays;
        }

        public String endDateOfRun() {
            return this.endDateOfRun;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            CampaignRunFrequencyUnit campaignRunFrequencyUnit;
            Integer num;
            String str5;
            String str6;
            Integer num2;
            List<String> list;
            String str7;
            String str8;
            Boolean bool;
            Boolean bool2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            Integer num8;
            List<String> list2;
            Integer num9;
            String str9;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.name.equals(item.name) && this.description.equals(item.description) && ((str = this.campaignCategory) != null ? str.equals(item.campaignCategory) : item.campaignCategory == null) && ((str2 = this.campaignSubCategory) != null ? str2.equals(item.campaignSubCategory) : item.campaignSubCategory == null) && this.campaignType.equals(item.campaignType) && ((str3 = this.campaignChannelIdentifier) != null ? str3.equals(item.campaignChannelIdentifier) : item.campaignChannelIdentifier == null) && ((str4 = this.campaignData) != null ? str4.equals(item.campaignData) : item.campaignData == null) && ((campaignRunFrequencyUnit = this.campaignRunFrequencyUnit) != null ? campaignRunFrequencyUnit.equals(item.campaignRunFrequencyUnit) : item.campaignRunFrequencyUnit == null) && ((num = this.campaignRunFrequencyValue) != null ? num.equals(item.campaignRunFrequencyValue) : item.campaignRunFrequencyValue == null) && ((str5 = this.startDateOfRun) != null ? str5.equals(item.startDateOfRun) : item.startDateOfRun == null) && ((str6 = this.endDateOfRun) != null ? str6.equals(item.endDateOfRun) : item.endDateOfRun == null) && ((num2 = this.durationOfRunInDays) != null ? num2.equals(item.durationOfRunInDays) : item.durationOfRunInDays == null) && ((list = this.daysToSend) != null ? list.equals(item.daysToSend) : item.daysToSend == null) && this.ownerId.equals(item.ownerId) && ((str7 = this.primaryTeamId) != null ? str7.equals(item.primaryTeamId) : item.primaryTeamId == null) && this.status.equals(item.status) && ((str8 = this.systemPauseReason) != null ? str8.equals(item.systemPauseReason) : item.systemPauseReason == null) && this.associatedEntityListId.equals(item.associatedEntityListId) && ((bool = this.includeHistoricalMemberships) != null ? bool.equals(item.includeHistoricalMemberships) : item.includeHistoricalMemberships == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(item.allowMultiple) : item.allowMultiple == null) && ((num3 = this.messageCreated) != null ? num3.equals(item.messageCreated) : item.messageCreated == null) && ((num4 = this.sentCount) != null ? num4.equals(item.sentCount) : item.sentCount == null) && ((num5 = this.deliveredCount) != null ? num5.equals(item.deliveredCount) : item.deliveredCount == null) && ((num6 = this.readCount) != null ? num6.equals(item.readCount) : item.readCount == null) && ((num7 = this.repliedCount) != null ? num7.equals(item.repliedCount) : item.repliedCount == null) && ((num8 = this.failedCount) != null ? num8.equals(item.failedCount) : item.failedCount == null) && ((list2 = this.tags) != null ? list2.equals(item.tags) : item.tags == null) && ((num9 = this.leadLimit) != null ? num9.equals(item.leadLimit) : item.leadLimit == null) && ((str9 = this.createdAt) != null ? str9.equals(item.createdAt) : item.createdAt == null)) {
                String str10 = this.updatedAt;
                String str11 = item.updatedAt;
                if (str10 == null) {
                    if (str11 == null) {
                        return true;
                    }
                } else if (str10.equals(str11)) {
                    return true;
                }
            }
            return false;
        }

        public Integer failedCount() {
            return this.failedCount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003;
                String str = this.campaignCategory;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.campaignSubCategory;
                int iHashCode3 = (((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.campaignType.hashCode()) * 1000003;
                String str3 = this.campaignChannelIdentifier;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.campaignData;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                CampaignRunFrequencyUnit campaignRunFrequencyUnit = this.campaignRunFrequencyUnit;
                int iHashCode6 = (iHashCode5 ^ (campaignRunFrequencyUnit == null ? 0 : campaignRunFrequencyUnit.hashCode())) * 1000003;
                Integer num = this.campaignRunFrequencyValue;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str5 = this.startDateOfRun;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.endDateOfRun;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num2 = this.durationOfRunInDays;
                int iHashCode10 = (iHashCode9 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                List<String> list = this.daysToSend;
                int iHashCode11 = (((iHashCode10 ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str7 = this.primaryTeamId;
                int iHashCode12 = (((iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003;
                String str8 = this.systemPauseReason;
                int iHashCode13 = (((iHashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003) ^ this.associatedEntityListId.hashCode()) * 1000003;
                Boolean bool = this.includeHistoricalMemberships;
                int iHashCode14 = (iHashCode13 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.allowMultiple;
                int iHashCode15 = (iHashCode14 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num3 = this.messageCreated;
                int iHashCode16 = (iHashCode15 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.sentCount;
                int iHashCode17 = (iHashCode16 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.deliveredCount;
                int iHashCode18 = (iHashCode17 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.readCount;
                int iHashCode19 = (iHashCode18 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.repliedCount;
                int iHashCode20 = (iHashCode19 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003;
                Integer num8 = this.failedCount;
                int iHashCode21 = (iHashCode20 ^ (num8 == null ? 0 : num8.hashCode())) * 1000003;
                List<String> list2 = this.tags;
                int iHashCode22 = (iHashCode21 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Integer num9 = this.leadLimit;
                int iHashCode23 = (iHashCode22 ^ (num9 == null ? 0 : num9.hashCode())) * 1000003;
                String str9 = this.createdAt;
                int iHashCode24 = (iHashCode23 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.updatedAt;
                this.$hashCode = iHashCode24 ^ (str10 != null ? str10.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean includeHistoricalMemberships() {
            return this.includeHistoricalMemberships;
        }

        public Integer leadLimit() {
            return this.leadLimit;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.name);
                    responseWriter.writeString(responseFieldArr[4], Item.this.description);
                    responseWriter.writeString(responseFieldArr[5], Item.this.campaignCategory);
                    responseWriter.writeString(responseFieldArr[6], Item.this.campaignSubCategory);
                    responseWriter.writeString(responseFieldArr[7], Item.this.campaignType.name());
                    responseWriter.writeString(responseFieldArr[8], Item.this.campaignChannelIdentifier);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.campaignData);
                    ResponseField responseField = responseFieldArr[10];
                    CampaignRunFrequencyUnit campaignRunFrequencyUnit = Item.this.campaignRunFrequencyUnit;
                    responseWriter.writeString(responseField, campaignRunFrequencyUnit != null ? campaignRunFrequencyUnit.name() : null);
                    responseWriter.writeInt(responseFieldArr[11], Item.this.campaignRunFrequencyValue);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.startDateOfRun);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.endDateOfRun);
                    responseWriter.writeInt(responseFieldArr[14], Item.this.durationOfRunInDays);
                    responseWriter.writeList(responseFieldArr[15], Item.this.daysToSend, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.primaryTeamId);
                    responseWriter.writeString(responseFieldArr[18], Item.this.status.name());
                    responseWriter.writeString(responseFieldArr[19], Item.this.systemPauseReason);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.associatedEntityListId);
                    responseWriter.writeBoolean(responseFieldArr[21], Item.this.includeHistoricalMemberships);
                    responseWriter.writeBoolean(responseFieldArr[22], Item.this.allowMultiple);
                    responseWriter.writeInt(responseFieldArr[23], Item.this.messageCreated);
                    responseWriter.writeInt(responseFieldArr[24], Item.this.sentCount);
                    responseWriter.writeInt(responseFieldArr[25], Item.this.deliveredCount);
                    responseWriter.writeInt(responseFieldArr[26], Item.this.readCount);
                    responseWriter.writeInt(responseFieldArr[27], Item.this.repliedCount);
                    responseWriter.writeInt(responseFieldArr[28], Item.this.failedCount);
                    responseWriter.writeList(responseFieldArr[29], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Item.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeInt(responseFieldArr[30], Item.this.leadLimit);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[31], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Item.this.updatedAt);
                }
            };
        }

        public Integer messageCreated() {
            return this.messageCreated;
        }

        public String name() {
            return this.name;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public Integer readCount() {
            return this.readCount;
        }

        public Integer repliedCount() {
            return this.repliedCount;
        }

        public Integer sentCount() {
            return this.sentCount;
        }

        public String startDateOfRun() {
            return this.startDateOfRun;
        }

        public CampaignStatus status() {
            return this.status;
        }

        public String systemPauseReason() {
            return this.systemPauseReason;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", campaignCategory=" + this.campaignCategory + ", campaignSubCategory=" + this.campaignSubCategory + ", campaignType=" + this.campaignType + ", campaignChannelIdentifier=" + this.campaignChannelIdentifier + ", campaignData=" + this.campaignData + ", campaignRunFrequencyUnit=" + this.campaignRunFrequencyUnit + ", campaignRunFrequencyValue=" + this.campaignRunFrequencyValue + ", startDateOfRun=" + this.startDateOfRun + ", endDateOfRun=" + this.endDateOfRun + ", durationOfRunInDays=" + this.durationOfRunInDays + ", daysToSend=" + this.daysToSend + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", status=" + this.status + ", systemPauseReason=" + this.systemPauseReason + ", associatedEntityListId=" + this.associatedEntityListId + ", includeHistoricalMemberships=" + this.includeHistoricalMemberships + ", allowMultiple=" + this.allowMultiple + ", messageCreated=" + this.messageCreated + ", sentCount=" + this.sentCount + ", deliveredCount=" + this.deliveredCount + ", readCount=" + this.readCount + ", repliedCount=" + this.repliedCount + ", failedCount=" + this.failedCount + ", tags=" + this.tags + ", leadLimit=" + this.leadLimit + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class SearchCampaignDefinitions {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchCampaignDefinitions> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchCampaignDefinitions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchCampaignDefinitions.$responseFields;
                return new SearchCampaignDefinitions(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.SearchCampaignDefinitions.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.SearchCampaignDefinitions.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Item read(ResponseReader responseReader2) {
                                return Mapper.this.itemFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[2]), responseReader.readInt(responseFieldArr[3]));
            }
        }

        public SearchCampaignDefinitions(String str, List<Item> list, String str2, Integer num) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.items = (List) Utils.checkNotNull(list, "items == null");
            this.nextToken = str2;
            this.total = num;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SearchCampaignDefinitions)) {
                return false;
            }
            SearchCampaignDefinitions searchCampaignDefinitions = (SearchCampaignDefinitions) obj;
            if (this.__typename.equals(searchCampaignDefinitions.__typename) && this.items.equals(searchCampaignDefinitions.items) && ((str = this.nextToken) != null ? str.equals(searchCampaignDefinitions.nextToken) : searchCampaignDefinitions.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchCampaignDefinitions.total;
                if (num == null) {
                    if (num2 == null) {
                        return true;
                    }
                } else if (num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.items.hashCode()) * 1000003;
                String str = this.nextToken;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Integer num = this.total;
                this.$hashCode = iHashCode2 ^ (num != null ? num.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public List<Item> items() {
            return this.items;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.SearchCampaignDefinitions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchCampaignDefinitions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchCampaignDefinitions.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchCampaignDefinitions.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.SearchCampaignDefinitions.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchCampaignDefinitions.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchCampaignDefinitions.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchCampaignDefinitions{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableCampaignDefinitionFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableCampaignDefinitionSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableCampaignDefinitionFilterInput searchableCampaignDefinitionFilterInput, SearchableCampaignDefinitionSortInput searchableCampaignDefinitionSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableCampaignDefinitionFilterInput;
            this.sort = searchableCampaignDefinitionSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableCampaignDefinitionFilterInput);
            linkedHashMap.put("sort", searchableCampaignDefinitionSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableCampaignDefinitionFilterInput filter() {
            return this.filter;
        }

        public Integer from() {
            return this.from;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignDefinitionsQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("filter", Variables.this.filter != null ? Variables.this.filter.marshaller() : null);
                    inputFieldWriter.writeObject("sort", Variables.this.sort != null ? Variables.this.sort.marshaller() : null);
                    inputFieldWriter.writeInt("limit", Variables.this.limit);
                    inputFieldWriter.writeString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, Variables.this.nextToken);
                    inputFieldWriter.writeInt(Constants.MessagePayloadKeys.FROM, Variables.this.from);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public SearchableCampaignDefinitionSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchCampaignDefinitionsQuery(SearchableCampaignDefinitionFilterInput searchableCampaignDefinitionFilterInput, SearchableCampaignDefinitionSortInput searchableCampaignDefinitionSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableCampaignDefinitionFilterInput, searchableCampaignDefinitionSortInput, num, str, num2);
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
        return "12d484f67886027c9db2fd5aee5d0798b3ec1300fb28879a00b9cff31a8e5640";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchCampaignDefinitions($filter: SearchableCampaignDefinitionFilterInput, $sort: SearchableCampaignDefinitionSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCampaignDefinitions(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      campaignCategory\n      campaignSubCategory\n      campaignType\n      campaignChannelIdentifier\n      campaignData\n      campaignRunFrequencyUnit\n      campaignRunFrequencyValue\n      startDateOfRun\n      endDateOfRun\n      durationOfRunInDays\n      daysToSend\n      ownerId\n      primaryTeamId\n      status\n      systemPauseReason\n      associatedEntityListId\n      includeHistoricalMemberships\n      allowMultiple\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      tags\n      leadLimit\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
