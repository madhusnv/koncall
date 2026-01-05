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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.DealOutcome;
import type.DealState;
import type.SearchableDealFilterInput;
import type.SearchableDealSortInput;

/* loaded from: classes4.dex */
public final class SearchDealsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchDeals($filter: SearchableDealFilterInput, $sort: SearchableDealSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchDeals(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchDeals";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchDeals($filter: SearchableDealFilterInput, $sort: SearchableDealSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchDeals(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableDealFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableDealSortInput sort;

        public SearchDealsQuery build() {
            return new SearchDealsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableDealFilterInput searchableDealFilterInput) {
            this.filter = searchableDealFilterInput;
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

        public Builder sort(SearchableDealSortInput searchableDealSortInput) {
            this.sort = searchableDealSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchDeals", "searchDeals", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchDeals searchDeals;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchDeals.Mapper searchDealsFieldMapper = new SearchDeals.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchDeals) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchDeals>() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchDeals read(ResponseReader responseReader2) {
                        return Mapper.this.searchDealsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchDeals searchDeals) {
            this.searchDeals = searchDeals;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchDeals searchDeals = this.searchDeals;
            SearchDeals searchDeals2 = ((Data) obj).searchDeals;
            return searchDeals == null ? searchDeals2 == null : searchDeals.equals(searchDeals2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchDeals searchDeals = this.searchDeals;
                this.$hashCode = (searchDeals == null ? 0 : searchDeals.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchDeals searchDeals = Data.this.searchDeals;
                    responseWriter.writeObject(responseField, searchDeals != null ? searchDeals.marshaller() : null);
                }
            };
        }

        public SearchDeals searchDeals() {
            return this.searchDeals;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchDeals=" + this.searchDeals + "}";
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
        final Double amount;
        final String createdAt;
        final String createdByUser;
        final String currency;
        final String customDealData;
        final String dealLostReason;
        final DealOutcome dealOutcome;
        final String dealStage;
        final String dealStageUpdatedAt;
        final DealState dealState;
        final String description;
        final String id;
        final String lastActivity;
        final String lastUpdatedByUser;
        final String name;
        final String openTaskDetail;
        final String ownerId;
        final String primaryTeamId;
        final List<String> recentEngagements;
        final String recentEngagementsUpdatedAt;
        final List<String> tags;
        final List<String> transitionSummary;
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
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]);
                String string5 = responseReader.readString(responseFieldArr[7]);
                DealState dealStateValueOf = string5 != null ? DealState.valueOf(string5) : null;
                String string6 = responseReader.readString(responseFieldArr[8]);
                return new Item(string, str, str2, string2, string3, string4, str3, dealStateValueOf, string6 != null ? DealOutcome.valueOf(string6) : null, responseReader.readString(responseFieldArr[9]), responseReader.readDouble(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readList(responseFieldArr[17], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Item.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return (String) listItemReader.readCustomType(CustomType.AWSJSON);
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), responseReader.readString(responseFieldArr[20]), responseReader.readList(responseFieldArr[21], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Item.Mapper.3
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            CustomType customType3 = CustomType.AWSJSON;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("dealStage", "dealStage", null, true, Collections.emptyList()), ResponseField.forCustomType("dealStageUpdatedAt", "dealStageUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("dealState", "dealState", null, true, Collections.emptyList()), ResponseField.forString("dealOutcome", "dealOutcome", null, true, Collections.emptyList()), ResponseField.forString("dealLostReason", "dealLostReason", null, true, Collections.emptyList()), ResponseField.forDouble("amount", "amount", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("createdByUser", "createdByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastUpdatedByUser", "lastUpdatedByUser", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("primaryTeamId", "primaryTeamId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("openTaskDetail", "openTaskDetail", null, true, customType3, Collections.emptyList()), ResponseField.forList("transitionSummary", "transitionSummary", null, true, Collections.emptyList()), ResponseField.forList("recentEngagements", "recentEngagements", null, true, Collections.emptyList()), ResponseField.forCustomType("recentEngagementsUpdatedAt", "recentEngagementsUpdatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forString("lastActivity", "lastActivity", null, true, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forCustomType("customDealData", "customDealData", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, DealState dealState, DealOutcome dealOutcome, String str8, Double d, String str9, String str10, String str11, String str12, String str13, String str14, List<String> list, List<String> list2, String str15, String str16, List<String> list3, String str17, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.dealStage = str6;
            this.dealStageUpdatedAt = str7;
            this.dealState = dealState;
            this.dealOutcome = dealOutcome;
            this.dealLostReason = str8;
            this.amount = d;
            this.currency = str9;
            this.createdByUser = str10;
            this.lastUpdatedByUser = str11;
            this.ownerId = str12;
            this.primaryTeamId = str13;
            this.openTaskDetail = str14;
            this.transitionSummary = list;
            this.recentEngagements = list2;
            this.recentEngagementsUpdatedAt = str15;
            this.lastActivity = str16;
            this.tags = list3;
            this.customDealData = str17;
            this.createdAt = str18;
            this.updatedAt = str19;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Double amount() {
            return this.amount;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdByUser() {
            return this.createdByUser;
        }

        public String currency() {
            return this.currency;
        }

        public String customDealData() {
            return this.customDealData;
        }

        public String dealLostReason() {
            return this.dealLostReason;
        }

        public DealOutcome dealOutcome() {
            return this.dealOutcome;
        }

        public String dealStage() {
            return this.dealStage;
        }

        public String dealStageUpdatedAt() {
            return this.dealStageUpdatedAt;
        }

        public DealState dealState() {
            return this.dealState;
        }

        public String description() {
            return this.description;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            DealState dealState;
            DealOutcome dealOutcome;
            String str5;
            Double d;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            List<String> list;
            List<String> list2;
            String str12;
            String str13;
            List<String> list3;
            String str14;
            String str15;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && ((str = this.name) != null ? str.equals(item.name) : item.name == null) && ((str2 = this.description) != null ? str2.equals(item.description) : item.description == null) && ((str3 = this.dealStage) != null ? str3.equals(item.dealStage) : item.dealStage == null) && ((str4 = this.dealStageUpdatedAt) != null ? str4.equals(item.dealStageUpdatedAt) : item.dealStageUpdatedAt == null) && ((dealState = this.dealState) != null ? dealState.equals(item.dealState) : item.dealState == null) && ((dealOutcome = this.dealOutcome) != null ? dealOutcome.equals(item.dealOutcome) : item.dealOutcome == null) && ((str5 = this.dealLostReason) != null ? str5.equals(item.dealLostReason) : item.dealLostReason == null) && ((d = this.amount) != null ? d.equals(item.amount) : item.amount == null) && ((str6 = this.currency) != null ? str6.equals(item.currency) : item.currency == null) && ((str7 = this.createdByUser) != null ? str7.equals(item.createdByUser) : item.createdByUser == null) && ((str8 = this.lastUpdatedByUser) != null ? str8.equals(item.lastUpdatedByUser) : item.lastUpdatedByUser == null) && ((str9 = this.ownerId) != null ? str9.equals(item.ownerId) : item.ownerId == null) && ((str10 = this.primaryTeamId) != null ? str10.equals(item.primaryTeamId) : item.primaryTeamId == null) && ((str11 = this.openTaskDetail) != null ? str11.equals(item.openTaskDetail) : item.openTaskDetail == null) && ((list = this.transitionSummary) != null ? list.equals(item.transitionSummary) : item.transitionSummary == null) && ((list2 = this.recentEngagements) != null ? list2.equals(item.recentEngagements) : item.recentEngagements == null) && ((str12 = this.recentEngagementsUpdatedAt) != null ? str12.equals(item.recentEngagementsUpdatedAt) : item.recentEngagementsUpdatedAt == null) && ((str13 = this.lastActivity) != null ? str13.equals(item.lastActivity) : item.lastActivity == null) && ((list3 = this.tags) != null ? list3.equals(item.tags) : item.tags == null) && ((str14 = this.customDealData) != null ? str14.equals(item.customDealData) : item.customDealData == null) && ((str15 = this.createdAt) != null ? str15.equals(item.createdAt) : item.createdAt == null)) {
                String str16 = this.updatedAt;
                String str17 = item.updatedAt;
                if (str16 == null) {
                    if (str17 == null) {
                        return true;
                    }
                } else if (str16.equals(str17)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.dealStage;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.dealStageUpdatedAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                DealState dealState = this.dealState;
                int iHashCode6 = (iHashCode5 ^ (dealState == null ? 0 : dealState.hashCode())) * 1000003;
                DealOutcome dealOutcome = this.dealOutcome;
                int iHashCode7 = (iHashCode6 ^ (dealOutcome == null ? 0 : dealOutcome.hashCode())) * 1000003;
                String str5 = this.dealLostReason;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.amount;
                int iHashCode9 = (iHashCode8 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str6 = this.currency;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdByUser;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lastUpdatedByUser;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.ownerId;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.primaryTeamId;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.openTaskDetail;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                List<String> list = this.transitionSummary;
                int iHashCode16 = (iHashCode15 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.recentEngagements;
                int iHashCode17 = (iHashCode16 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str12 = this.recentEngagementsUpdatedAt;
                int iHashCode18 = (iHashCode17 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.lastActivity;
                int iHashCode19 = (iHashCode18 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                List<String> list3 = this.tags;
                int iHashCode20 = (iHashCode19 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str14 = this.customDealData;
                int iHashCode21 = (iHashCode20 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.createdAt;
                int iHashCode22 = (iHashCode21 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.updatedAt;
                this.$hashCode = iHashCode22 ^ (str16 != null ? str16.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastActivity() {
            return this.lastActivity;
        }

        public String lastUpdatedByUser() {
            return this.lastUpdatedByUser;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.name);
                    responseWriter.writeString(responseFieldArr[4], Item.this.description);
                    responseWriter.writeString(responseFieldArr[5], Item.this.dealStage);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.dealStageUpdatedAt);
                    ResponseField responseField = responseFieldArr[7];
                    DealState dealState = Item.this.dealState;
                    responseWriter.writeString(responseField, dealState != null ? dealState.name() : null);
                    ResponseField responseField2 = responseFieldArr[8];
                    DealOutcome dealOutcome = Item.this.dealOutcome;
                    responseWriter.writeString(responseField2, dealOutcome != null ? dealOutcome.name() : null);
                    responseWriter.writeString(responseFieldArr[9], Item.this.dealLostReason);
                    responseWriter.writeDouble(responseFieldArr[10], Item.this.amount);
                    responseWriter.writeString(responseFieldArr[11], Item.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], Item.this.createdByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.lastUpdatedByUser);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.ownerId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.primaryTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.openTaskDetail);
                    responseWriter.writeList(responseFieldArr[17], Item.this.transitionSummary, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeList(responseFieldArr[18], Item.this.recentEngagements, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Item.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeCustom(CustomType.AWSJSON, obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.recentEngagementsUpdatedAt);
                    responseWriter.writeString(responseFieldArr[20], Item.this.lastActivity);
                    responseWriter.writeList(responseFieldArr[21], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Item.1.3
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.customDealData);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Item.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String openTaskDetail() {
            return this.openTaskDetail;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String primaryTeamId() {
            return this.primaryTeamId;
        }

        public List<String> recentEngagements() {
            return this.recentEngagements;
        }

        public String recentEngagementsUpdatedAt() {
            return this.recentEngagementsUpdatedAt;
        }

        public List<String> tags() {
            return this.tags;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", dealStage=" + this.dealStage + ", dealStageUpdatedAt=" + this.dealStageUpdatedAt + ", dealState=" + this.dealState + ", dealOutcome=" + this.dealOutcome + ", dealLostReason=" + this.dealLostReason + ", amount=" + this.amount + ", currency=" + this.currency + ", createdByUser=" + this.createdByUser + ", lastUpdatedByUser=" + this.lastUpdatedByUser + ", ownerId=" + this.ownerId + ", primaryTeamId=" + this.primaryTeamId + ", openTaskDetail=" + this.openTaskDetail + ", transitionSummary=" + this.transitionSummary + ", recentEngagements=" + this.recentEngagements + ", recentEngagementsUpdatedAt=" + this.recentEngagementsUpdatedAt + ", lastActivity=" + this.lastActivity + ", tags=" + this.tags + ", customDealData=" + this.customDealData + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public List<String> transitionSummary() {
            return this.transitionSummary;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class SearchDeals {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchDeals> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchDeals map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchDeals.$responseFields;
                return new SearchDeals(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.SearchDeals.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.SearchDeals.Mapper.1.1
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

        public SearchDeals(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchDeals)) {
                return false;
            }
            SearchDeals searchDeals = (SearchDeals) obj;
            if (this.__typename.equals(searchDeals.__typename) && this.items.equals(searchDeals.items) && ((str = this.nextToken) != null ? str.equals(searchDeals.nextToken) : searchDeals.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchDeals.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.SearchDeals.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchDeals.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchDeals.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchDeals.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.SearchDeals.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchDeals.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchDeals.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchDeals{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableDealFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableDealSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableDealFilterInput searchableDealFilterInput, SearchableDealSortInput searchableDealSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableDealFilterInput;
            this.sort = searchableDealSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableDealFilterInput);
            linkedHashMap.put("sort", searchableDealSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableDealFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchDealsQuery.Variables.1
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

        public SearchableDealSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchDealsQuery(SearchableDealFilterInput searchableDealFilterInput, SearchableDealSortInput searchableDealSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableDealFilterInput, searchableDealSortInput, num, str, num2);
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
        return "022b744123e818838aa07702cb478fb7d40216019e081f8227fd7b51898a1c2a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchDeals($filter: SearchableDealFilterInput, $sort: SearchableDealSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchDeals(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      name\n      description\n      dealStage\n      dealStageUpdatedAt\n      dealState\n      dealOutcome\n      dealLostReason\n      amount\n      currency\n      createdByUser\n      lastUpdatedByUser\n      ownerId\n      primaryTeamId\n      openTaskDetail\n      transitionSummary\n      recentEngagements\n      recentEngagementsUpdatedAt\n      lastActivity\n      tags\n      customDealData\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
