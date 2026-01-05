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
import type.ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput;
import type.ModelCampaignRunDataFilterInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetCampaignDataByRunQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetCampaignDataByRun($accountId: ID, $campaignRunIdUpdatedAt: ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCampaignRunDataFilterInput, $limit: Int, $nextToken: String) {\n  getCampaignDataByRun(accountId: $accountId, campaignRunIdUpdatedAt: $campaignRunIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      contactSource\n      campaignId\n      campaignRunId\n      engagementId\n      campaignOutputType\n      campaignOutputId\n      campaignResponseType\n      campaignResponseId\n      responseCategory\n      responseBody\n      status\n      messageCreatedAt\n      sentAt\n      deliveredAt\n      readAt\n      repliedAt\n      sourceId\n      sourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetCampaignDataByRun";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetCampaignDataByRun($accountId: ID, $campaignRunIdUpdatedAt: ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCampaignRunDataFilterInput, $limit: Int, $nextToken: String) {\n  getCampaignDataByRun(accountId: $accountId, campaignRunIdUpdatedAt: $campaignRunIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      contactSource\n      campaignId\n      campaignRunId\n      engagementId\n      campaignOutputType\n      campaignOutputId\n      campaignResponseType\n      campaignResponseId\n      responseCategory\n      responseBody\n      status\n      messageCreatedAt\n      sentAt\n      deliveredAt\n      readAt\n      repliedAt\n      sourceId\n      sourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String accountId;
        private ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput campaignRunIdUpdatedAt;
        private ModelCampaignRunDataFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public GetCampaignDataByRunQuery build() {
            return new GetCampaignDataByRunQuery(this.accountId, this.campaignRunIdUpdatedAt, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder campaignRunIdUpdatedAt(ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput modelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput) {
            this.campaignRunIdUpdatedAt = modelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput;
            return this;
        }

        public Builder filter(ModelCampaignRunDataFilterInput modelCampaignRunDataFilterInput) {
            this.filter = modelCampaignRunDataFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getCampaignDataByRun", "getCampaignDataByRun", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("accountId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "accountId").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("campaignRunIdUpdatedAt", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "campaignRunIdUpdatedAt").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetCampaignDataByRun getCampaignDataByRun;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetCampaignDataByRun.Mapper getCampaignDataByRunFieldMapper = new GetCampaignDataByRun.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetCampaignDataByRun) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetCampaignDataByRun>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetCampaignDataByRun read(ResponseReader responseReader2) {
                        return Mapper.this.getCampaignDataByRunFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetCampaignDataByRun getCampaignDataByRun) {
            this.getCampaignDataByRun = getCampaignDataByRun;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetCampaignDataByRun getCampaignDataByRun = this.getCampaignDataByRun;
            GetCampaignDataByRun getCampaignDataByRun2 = ((Data) obj).getCampaignDataByRun;
            return getCampaignDataByRun == null ? getCampaignDataByRun2 == null : getCampaignDataByRun.equals(getCampaignDataByRun2);
        }

        public GetCampaignDataByRun getCampaignDataByRun() {
            return this.getCampaignDataByRun;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetCampaignDataByRun getCampaignDataByRun = this.getCampaignDataByRun;
                this.$hashCode = (getCampaignDataByRun == null ? 0 : getCampaignDataByRun.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetCampaignDataByRun getCampaignDataByRun = Data.this.getCampaignDataByRun;
                    responseWriter.writeObject(responseField, getCampaignDataByRun != null ? getCampaignDataByRun.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getCampaignDataByRun=" + this.getCampaignDataByRun + "}";
            }
            return this.$toString;
        }
    }

    public static class GetCampaignDataByRun {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetCampaignDataByRun> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetCampaignDataByRun map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetCampaignDataByRun.$responseFields;
                return new GetCampaignDataByRun(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.GetCampaignDataByRun.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.GetCampaignDataByRun.Mapper.1.1
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

        public GetCampaignDataByRun(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetCampaignDataByRun)) {
                return false;
            }
            GetCampaignDataByRun getCampaignDataByRun = (GetCampaignDataByRun) obj;
            if (this.__typename.equals(getCampaignDataByRun.__typename) && this.items.equals(getCampaignDataByRun.items)) {
                String str = this.nextToken;
                String str2 = getCampaignDataByRun.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.GetCampaignDataByRun.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetCampaignDataByRun.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetCampaignDataByRun.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetCampaignDataByRun.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.GetCampaignDataByRun.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetCampaignDataByRun.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetCampaignDataByRun{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String campaignId;
        final String campaignOutputId;
        final String campaignOutputType;
        final String campaignResponseId;
        final String campaignResponseType;
        final String campaignRunId;
        final String contactId;
        final String contactSource;
        final String createdAt;
        final String deliveredAt;
        final String engagementId;
        final String id;
        final String messageCreatedAt;
        final String readAt;
        final String repliedAt;
        final String responseBody;
        final String responseCategory;
        final String sentAt;
        final String sourceId;
        final String sourceType;
        final String status;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[23]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, false, customType, Collections.emptyList()), ResponseField.forString("contactSource", "contactSource", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignId", "campaignId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("campaignRunId", "campaignRunId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forString("campaignOutputType", "campaignOutputType", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignOutputId", "campaignOutputId", null, true, customType, Collections.emptyList()), ResponseField.forString("campaignResponseType", "campaignResponseType", null, true, Collections.emptyList()), ResponseField.forCustomType("campaignResponseId", "campaignResponseId", null, true, customType, Collections.emptyList()), ResponseField.forString("responseCategory", "responseCategory", null, true, Collections.emptyList()), ResponseField.forString("responseBody", "responseBody", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("messageCreatedAt", "messageCreatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("sentAt", "sentAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("deliveredAt", "deliveredAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("readAt", "readAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("repliedAt", "repliedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("sourceId", "sourceId", null, true, customType, Collections.emptyList()), ResponseField.forString("sourceType", "sourceType", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.contactId = (String) Utils.checkNotNull(str4, "contactId == null");
            this.contactSource = str5;
            this.campaignId = (String) Utils.checkNotNull(str6, "campaignId == null");
            this.campaignRunId = (String) Utils.checkNotNull(str7, "campaignRunId == null");
            this.engagementId = str8;
            this.campaignOutputType = str9;
            this.campaignOutputId = str10;
            this.campaignResponseType = str11;
            this.campaignResponseId = str12;
            this.responseCategory = str13;
            this.responseBody = str14;
            this.status = str15;
            this.messageCreatedAt = str16;
            this.sentAt = str17;
            this.deliveredAt = str18;
            this.readAt = str19;
            this.repliedAt = str20;
            this.sourceId = str21;
            this.sourceType = str22;
            this.createdAt = str23;
            this.updatedAt = str24;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String campaignId() {
            return this.campaignId;
        }

        public String campaignOutputId() {
            return this.campaignOutputId;
        }

        public String campaignOutputType() {
            return this.campaignOutputType;
        }

        public String campaignResponseId() {
            return this.campaignResponseId;
        }

        public String campaignResponseType() {
            return this.campaignResponseType;
        }

        public String campaignRunId() {
            return this.campaignRunId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String contactSource() {
            return this.contactSource;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deliveredAt() {
            return this.deliveredAt;
        }

        public String engagementId() {
            return this.engagementId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.contactId.equals(item.contactId) && ((str = this.contactSource) != null ? str.equals(item.contactSource) : item.contactSource == null) && this.campaignId.equals(item.campaignId) && this.campaignRunId.equals(item.campaignRunId) && ((str2 = this.engagementId) != null ? str2.equals(item.engagementId) : item.engagementId == null) && ((str3 = this.campaignOutputType) != null ? str3.equals(item.campaignOutputType) : item.campaignOutputType == null) && ((str4 = this.campaignOutputId) != null ? str4.equals(item.campaignOutputId) : item.campaignOutputId == null) && ((str5 = this.campaignResponseType) != null ? str5.equals(item.campaignResponseType) : item.campaignResponseType == null) && ((str6 = this.campaignResponseId) != null ? str6.equals(item.campaignResponseId) : item.campaignResponseId == null) && ((str7 = this.responseCategory) != null ? str7.equals(item.responseCategory) : item.responseCategory == null) && ((str8 = this.responseBody) != null ? str8.equals(item.responseBody) : item.responseBody == null) && ((str9 = this.status) != null ? str9.equals(item.status) : item.status == null) && ((str10 = this.messageCreatedAt) != null ? str10.equals(item.messageCreatedAt) : item.messageCreatedAt == null) && ((str11 = this.sentAt) != null ? str11.equals(item.sentAt) : item.sentAt == null) && ((str12 = this.deliveredAt) != null ? str12.equals(item.deliveredAt) : item.deliveredAt == null) && ((str13 = this.readAt) != null ? str13.equals(item.readAt) : item.readAt == null) && ((str14 = this.repliedAt) != null ? str14.equals(item.repliedAt) : item.repliedAt == null) && ((str15 = this.sourceId) != null ? str15.equals(item.sourceId) : item.sourceId == null) && ((str16 = this.sourceType) != null ? str16.equals(item.sourceType) : item.sourceType == null) && ((str17 = this.createdAt) != null ? str17.equals(item.createdAt) : item.createdAt == null)) {
                String str18 = this.updatedAt;
                String str19 = item.updatedAt;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.contactId.hashCode()) * 1000003;
                String str = this.contactSource;
                int iHashCode2 = (((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.campaignId.hashCode()) * 1000003) ^ this.campaignRunId.hashCode()) * 1000003;
                String str2 = this.engagementId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.campaignOutputType;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.campaignOutputId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.campaignResponseType;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.campaignResponseId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.responseCategory;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.responseBody;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.status;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.messageCreatedAt;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.sentAt;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.deliveredAt;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.readAt;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.repliedAt;
                int iHashCode15 = (iHashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.sourceId;
                int iHashCode16 = (iHashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.sourceType;
                int iHashCode17 = (iHashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.createdAt;
                int iHashCode18 = (iHashCode17 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.updatedAt;
                this.$hashCode = iHashCode18 ^ (str18 != null ? str18.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.contactSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.campaignId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.campaignRunId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.engagementId);
                    responseWriter.writeString(responseFieldArr[8], Item.this.campaignOutputType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.campaignOutputId);
                    responseWriter.writeString(responseFieldArr[10], Item.this.campaignResponseType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], Item.this.campaignResponseId);
                    responseWriter.writeString(responseFieldArr[12], Item.this.responseCategory);
                    responseWriter.writeString(responseFieldArr[13], Item.this.responseBody);
                    responseWriter.writeString(responseFieldArr[14], Item.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], Item.this.messageCreatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], Item.this.sentAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.deliveredAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.readAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.repliedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.sourceId);
                    responseWriter.writeString(responseFieldArr[21], Item.this.sourceType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[23], Item.this.updatedAt);
                }
            };
        }

        public String messageCreatedAt() {
            return this.messageCreatedAt;
        }

        public String readAt() {
            return this.readAt;
        }

        public String repliedAt() {
            return this.repliedAt;
        }

        public String responseBody() {
            return this.responseBody;
        }

        public String responseCategory() {
            return this.responseCategory;
        }

        public String sentAt() {
            return this.sentAt;
        }

        public String sourceId() {
            return this.sourceId;
        }

        public String sourceType() {
            return this.sourceType;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", contactSource=" + this.contactSource + ", campaignId=" + this.campaignId + ", campaignRunId=" + this.campaignRunId + ", engagementId=" + this.engagementId + ", campaignOutputType=" + this.campaignOutputType + ", campaignOutputId=" + this.campaignOutputId + ", campaignResponseType=" + this.campaignResponseType + ", campaignResponseId=" + this.campaignResponseId + ", responseCategory=" + this.responseCategory + ", responseBody=" + this.responseBody + ", status=" + this.status + ", messageCreatedAt=" + this.messageCreatedAt + ", sentAt=" + this.sentAt + ", deliveredAt=" + this.deliveredAt + ", readAt=" + this.readAt + ", repliedAt=" + this.repliedAt + ", sourceId=" + this.sourceId + ", sourceType=" + this.sourceType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String accountId;
        private final ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput campaignRunIdUpdatedAt;
        private final ModelCampaignRunDataFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput modelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelCampaignRunDataFilterInput modelCampaignRunDataFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.accountId = str;
            this.campaignRunIdUpdatedAt = modelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelCampaignRunDataFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("accountId", str);
            linkedHashMap.put("campaignRunIdUpdatedAt", modelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelCampaignRunDataFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String accountId() {
            return this.accountId;
        }

        public ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput campaignRunIdUpdatedAt() {
            return this.campaignRunIdUpdatedAt;
        }

        public ModelCampaignRunDataFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCampaignDataByRunQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("accountId", Variables.this.accountId);
                    inputFieldWriter.writeObject("campaignRunIdUpdatedAt", Variables.this.campaignRunIdUpdatedAt != null ? Variables.this.campaignRunIdUpdatedAt.marshaller() : null);
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

    public GetCampaignDataByRunQuery(String str, ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput modelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput, ModelSortDirection modelSortDirection, ModelCampaignRunDataFilterInput modelCampaignRunDataFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput, modelSortDirection, modelCampaignRunDataFilterInput, num, str2);
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
        return "76e5fec993d803a5f58431ee50add1f9eecac99a23fed19ee5460b829998b5d2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetCampaignDataByRun($accountId: ID, $campaignRunIdUpdatedAt: ModelCampaignRunDataByCampaignRunIdCompositeKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCampaignRunDataFilterInput, $limit: Int, $nextToken: String) {\n  getCampaignDataByRun(accountId: $accountId, campaignRunIdUpdatedAt: $campaignRunIdUpdatedAt, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      contactSource\n      campaignId\n      campaignRunId\n      engagementId\n      campaignOutputType\n      campaignOutputId\n      campaignResponseType\n      campaignResponseId\n      responseCategory\n      responseBody\n      status\n      messageCreatedAt\n      sentAt\n      deliveredAt\n      readAt\n      repliedAt\n      sourceId\n      sourceType\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
