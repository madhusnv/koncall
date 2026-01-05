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
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CampaignStatus;
import type.CampaignType;
import type.CustomType;
import type.SearchableCampaignRunFilterInput;
import type.SearchableCampaignRunSortInput;

/* loaded from: classes4.dex */
public final class SearchCampaignRunsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchCampaignRuns($filter: SearchableCampaignRunFilterInput, $sort: SearchableCampaignRunSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCampaignRuns(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      campaignId\n      campaignName\n      campaignType\n      campaignChannelIdentifier\n      name\n      startDate\n      endDate\n      status\n      systemPauseReason\n      leadCount\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      ownerId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchCampaignRuns";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchCampaignRuns($filter: SearchableCampaignRunFilterInput, $sort: SearchableCampaignRunSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCampaignRuns(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      campaignId\n      campaignName\n      campaignType\n      campaignChannelIdentifier\n      name\n      startDate\n      endDate\n      status\n      systemPauseReason\n      leadCount\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      ownerId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableCampaignRunFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableCampaignRunSortInput sort;

        public SearchCampaignRunsQuery build() {
            return new SearchCampaignRunsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableCampaignRunFilterInput searchableCampaignRunFilterInput) {
            this.filter = searchableCampaignRunFilterInput;
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

        public Builder sort(SearchableCampaignRunSortInput searchableCampaignRunSortInput) {
            this.sort = searchableCampaignRunSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchCampaignRuns", "searchCampaignRuns", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchCampaignRuns searchCampaignRuns;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchCampaignRuns.Mapper searchCampaignRunsFieldMapper = new SearchCampaignRuns.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchCampaignRuns) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchCampaignRuns>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchCampaignRuns read(ResponseReader responseReader2) {
                        return Mapper.this.searchCampaignRunsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchCampaignRuns searchCampaignRuns) {
            this.searchCampaignRuns = searchCampaignRuns;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchCampaignRuns searchCampaignRuns = this.searchCampaignRuns;
            SearchCampaignRuns searchCampaignRuns2 = ((Data) obj).searchCampaignRuns;
            return searchCampaignRuns == null ? searchCampaignRuns2 == null : searchCampaignRuns.equals(searchCampaignRuns2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchCampaignRuns searchCampaignRuns = this.searchCampaignRuns;
                this.$hashCode = (searchCampaignRuns == null ? 0 : searchCampaignRuns.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchCampaignRuns searchCampaignRuns = Data.this.searchCampaignRuns;
                    responseWriter.writeObject(responseField, searchCampaignRuns != null ? searchCampaignRuns.marshaller() : null);
                }
            };
        }

        public SearchCampaignRuns searchCampaignRuns() {
            return this.searchCampaignRuns;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchCampaignRuns=" + this.searchCampaignRuns + "}";
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
        final String campaignChannelIdentifier;
        final String campaignId;
        final String campaignName;
        final CampaignType campaignType;
        final String createdAt;
        final Integer deliveredCount;
        final String endDate;
        final Integer failedCount;
        final String id;
        final Integer leadCount;
        final Integer messageCreated;
        final String name;
        final String ownerId;
        final String primaryTeamId;
        final Integer readCount;
        final Integer repliedCount;
        final Integer sentCount;
        final String startDate;
        final CampaignStatus status;
        final String systemPauseReason;
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
                CampaignType campaignTypeValueOf = string3 != null ? CampaignType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]);
                String str5 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                String string6 = responseReader.readString(responseFieldArr[10]);
                return new Item(string, str, str2, str3, string2, campaignTypeValueOf, string4, string5, str4, str5, string6 != null ? CampaignStatus.valueOf(string6) : null, responseReader.readString(responseFieldArr[11]), responseReader.readInt(responseFieldArr[12]), responseReader.readInt(responseFieldArr[13]), responseReader.readInt(responseFieldArr[14]), responseReader.readInt(responseFieldArr[15]), responseReader.readInt(responseFieldArr[16]), responseReader.readInt(responseFieldArr[17]), responseReader.readInt(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("campaignId", "campaignId", null, false, customType, Collections.emptyList()), ResponseField.forString("campaignName", "campaignName", null, true, Collections.emptyList()), ResponseField.forString("campaignType", "campaignType", null, true, Collections.emptyList()), ResponseField.forString("campaignChannelIdentifier", "campaignChannelIdentifier", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forCustomType("startDate", "startDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDate", "endDate", null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, false, Collections.emptyList()), ResponseField.forString("systemPauseReason", "systemPauseReason", null, true, Collections.emptyList()), ResponseField.forInt("leadCount", "leadCount", null, true, Collections.emptyList()), ResponseField.forInt("messageCreated", "messageCreated", null, true, Collections.emptyList()), ResponseField.forInt("sentCount", "sentCount", null, true, Collections.emptyList()), ResponseField.forInt("deliveredCount", "deliveredCount", null, true, Collections.emptyList()), ResponseField.forInt("readCount", "readCount", null, true, Collections.emptyList()), ResponseField.forInt("repliedCount", "repliedCount", null, true, Collections.emptyList()), ResponseField.forInt("failedCount", "failedCount", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, CampaignType campaignType, String str6, String str7, String str8, String str9, CampaignStatus campaignStatus, String str10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str11, String str12, String str13, String str14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.campaignId = (String) Utils.checkNotNull(str4, "campaignId == null");
            this.campaignName = str5;
            this.campaignType = campaignType;
            this.campaignChannelIdentifier = str6;
            this.name = (String) Utils.checkNotNull(str7, "name == null");
            this.startDate = str8;
            this.endDate = str9;
            this.status = (CampaignStatus) Utils.checkNotNull(campaignStatus, "status == null");
            this.systemPauseReason = str10;
            this.leadCount = num;
            this.messageCreated = num2;
            this.sentCount = num3;
            this.deliveredCount = num4;
            this.readCount = num5;
            this.repliedCount = num6;
            this.failedCount = num7;
            this.ownerId = (String) Utils.checkNotNull(str11, "ownerId == null");
            this.primaryTeamId = str12;
            this.createdAt = str13;
            this.updatedAt = str14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String campaignChannelIdentifier() {
            return this.campaignChannelIdentifier;
        }

        public String campaignId() {
            return this.campaignId;
        }

        public String campaignName() {
            return this.campaignName;
        }

        public CampaignType campaignType() {
            return this.campaignType;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public Integer deliveredCount() {
            return this.deliveredCount;
        }

        public String endDate() {
            return this.endDate;
        }

        public boolean equals(Object obj) {
            String str;
            CampaignType campaignType;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            String str6;
            String str7;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.campaignId.equals(item.campaignId) && ((str = this.campaignName) != null ? str.equals(item.campaignName) : item.campaignName == null) && ((campaignType = this.campaignType) != null ? campaignType.equals(item.campaignType) : item.campaignType == null) && ((str2 = this.campaignChannelIdentifier) != null ? str2.equals(item.campaignChannelIdentifier) : item.campaignChannelIdentifier == null) && this.name.equals(item.name) && ((str3 = this.startDate) != null ? str3.equals(item.startDate) : item.startDate == null) && ((str4 = this.endDate) != null ? str4.equals(item.endDate) : item.endDate == null) && this.status.equals(item.status) && ((str5 = this.systemPauseReason) != null ? str5.equals(item.systemPauseReason) : item.systemPauseReason == null) && ((num = this.leadCount) != null ? num.equals(item.leadCount) : item.leadCount == null) && ((num2 = this.messageCreated) != null ? num2.equals(item.messageCreated) : item.messageCreated == null) && ((num3 = this.sentCount) != null ? num3.equals(item.sentCount) : item.sentCount == null) && ((num4 = this.deliveredCount) != null ? num4.equals(item.deliveredCount) : item.deliveredCount == null) && ((num5 = this.readCount) != null ? num5.equals(item.readCount) : item.readCount == null) && ((num6 = this.repliedCount) != null ? num6.equals(item.repliedCount) : item.repliedCount == null) && ((num7 = this.failedCount) != null ? num7.equals(item.failedCount) : item.failedCount == null) && this.ownerId.equals(item.ownerId) && ((str6 = this.primaryTeamId) != null ? str6.equals(item.primaryTeamId) : item.primaryTeamId == null) && ((str7 = this.createdAt) != null ? str7.equals(item.createdAt) : item.createdAt == null)) {
                String str8 = this.updatedAt;
                String str9 = item.updatedAt;
                if (str8 == null) {
                    if (str9 == null) {
                        return true;
                    }
                } else if (str8.equals(str9)) {
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
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.campaignId.hashCode()) * 1000003;
                String str = this.campaignName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                CampaignType campaignType = this.campaignType;
                int iHashCode3 = (iHashCode2 ^ (campaignType == null ? 0 : campaignType.hashCode())) * 1000003;
                String str2 = this.campaignChannelIdentifier;
                int iHashCode4 = (((iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str3 = this.startDate;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.endDate;
                int iHashCode6 = (((iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.status.hashCode()) * 1000003;
                String str5 = this.systemPauseReason;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.leadCount;
                int iHashCode8 = (iHashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.messageCreated;
                int iHashCode9 = (iHashCode8 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sentCount;
                int iHashCode10 = (iHashCode9 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.deliveredCount;
                int iHashCode11 = (iHashCode10 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.readCount;
                int iHashCode12 = (iHashCode11 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.repliedCount;
                int iHashCode13 = (iHashCode12 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Integer num7 = this.failedCount;
                int iHashCode14 = (((iHashCode13 ^ (num7 == null ? 0 : num7.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003;
                String str6 = this.primaryTeamId;
                int iHashCode15 = (iHashCode14 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode16 = (iHashCode15 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                this.$hashCode = iHashCode16 ^ (str8 != null ? str8.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Integer leadCount() {
            return this.leadCount;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.campaignId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.campaignName);
                    ResponseField responseField = responseFieldArr[5];
                    CampaignType campaignType = Item.this.campaignType;
                    responseWriter.writeString(responseField, campaignType != null ? campaignType.name() : null);
                    responseWriter.writeString(responseFieldArr[6], Item.this.campaignChannelIdentifier);
                    responseWriter.writeString(responseFieldArr[7], Item.this.name);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Item.this.startDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.endDate);
                    responseWriter.writeString(responseFieldArr[10], Item.this.status.name());
                    responseWriter.writeString(responseFieldArr[11], Item.this.systemPauseReason);
                    responseWriter.writeInt(responseFieldArr[12], Item.this.leadCount);
                    responseWriter.writeInt(responseFieldArr[13], Item.this.messageCreated);
                    responseWriter.writeInt(responseFieldArr[14], Item.this.sentCount);
                    responseWriter.writeInt(responseFieldArr[15], Item.this.deliveredCount);
                    responseWriter.writeInt(responseFieldArr[16], Item.this.readCount);
                    responseWriter.writeInt(responseFieldArr[17], Item.this.repliedCount);
                    responseWriter.writeInt(responseFieldArr[18], Item.this.failedCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.updatedAt);
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

        public String startDate() {
            return this.startDate;
        }

        public CampaignStatus status() {
            return this.status;
        }

        public String systemPauseReason() {
            return this.systemPauseReason;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", campaignId=" + this.campaignId + ", campaignName=" + this.campaignName + ", campaignType=" + this.campaignType + ", campaignChannelIdentifier=" + this.campaignChannelIdentifier + ", name=" + this.name + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", status=" + this.status + ", systemPauseReason=" + this.systemPauseReason + ", leadCount=" + this.leadCount + ", messageCreated=" + this.messageCreated + ", sentCount=" + this.sentCount + ", deliveredCount=" + this.deliveredCount + ", readCount=" + this.readCount + ", repliedCount=" + this.repliedCount + ", failedCount=" + this.failedCount + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class SearchCampaignRuns {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchCampaignRuns> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchCampaignRuns map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchCampaignRuns.$responseFields;
                return new SearchCampaignRuns(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.SearchCampaignRuns.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.SearchCampaignRuns.Mapper.1.1
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

        public SearchCampaignRuns(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchCampaignRuns)) {
                return false;
            }
            SearchCampaignRuns searchCampaignRuns = (SearchCampaignRuns) obj;
            if (this.__typename.equals(searchCampaignRuns.__typename) && this.items.equals(searchCampaignRuns.items) && ((str = this.nextToken) != null ? str.equals(searchCampaignRuns.nextToken) : searchCampaignRuns.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchCampaignRuns.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.SearchCampaignRuns.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchCampaignRuns.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchCampaignRuns.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchCampaignRuns.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.SearchCampaignRuns.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchCampaignRuns.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchCampaignRuns.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchCampaignRuns{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableCampaignRunFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableCampaignRunSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableCampaignRunFilterInput searchableCampaignRunFilterInput, SearchableCampaignRunSortInput searchableCampaignRunSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableCampaignRunFilterInput;
            this.sort = searchableCampaignRunSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableCampaignRunFilterInput);
            linkedHashMap.put("sort", searchableCampaignRunSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableCampaignRunFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchCampaignRunsQuery.Variables.1
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

        public SearchableCampaignRunSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchCampaignRunsQuery(SearchableCampaignRunFilterInput searchableCampaignRunFilterInput, SearchableCampaignRunSortInput searchableCampaignRunSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableCampaignRunFilterInput, searchableCampaignRunSortInput, num, str, num2);
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
        return "a0733ad0a342f31c91d24d27791b17fc89132209da0a764ae77090c66cf18e16";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchCampaignRuns($filter: SearchableCampaignRunFilterInput, $sort: SearchableCampaignRunSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchCampaignRuns(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      campaignId\n      campaignName\n      campaignType\n      campaignChannelIdentifier\n      name\n      startDate\n      endDate\n      status\n      systemPauseReason\n      leadCount\n      messageCreated\n      sentCount\n      deliveredCount\n      readCount\n      repliedCount\n      failedCount\n      ownerId\n      primaryTeamId\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
