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
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ModelExternalEventRecordFilterInput;
import type.ModelIDKeyConditionInput;
import type.ModelSortDirection;

/* loaded from: classes7.dex */
public final class GetExternalEventByExternalIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetExternalEventByExternalId($externalSourceType: String, $externalSourceId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelExternalEventRecordFilterInput, $limit: Int, $nextToken: String) {\n  getExternalEventByExternalId(externalSourceType: $externalSourceType, externalSourceId: $externalSourceId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      externalSourceId\n      externalSourceType\n      engagementId\n      userId\n      contactId\n      contactName\n      primaryParticipantEmailId\n      primaryParticipantName\n      recordingUrl\n      transcriptUrl\n      rawEvent\n      message\n      status\n      eventSummary\n      eventDescription\n      eventUrl\n      eventStartTime\n      eventEndTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetExternalEventByExternalId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetExternalEventByExternalId($externalSourceType: String, $externalSourceId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelExternalEventRecordFilterInput, $limit: Int, $nextToken: String) {\n  getExternalEventByExternalId(externalSourceType: $externalSourceType, externalSourceId: $externalSourceId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      externalSourceId\n      externalSourceType\n      engagementId\n      userId\n      contactId\n      contactName\n      primaryParticipantEmailId\n      primaryParticipantName\n      recordingUrl\n      transcriptUrl\n      rawEvent\n      message\n      status\n      eventSummary\n      eventDescription\n      eventUrl\n      eventStartTime\n      eventEndTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelIDKeyConditionInput externalSourceId;
        private String externalSourceType;
        private ModelExternalEventRecordFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelSortDirection sortDirection;

        public GetExternalEventByExternalIdQuery build() {
            return new GetExternalEventByExternalIdQuery(this.externalSourceType, this.externalSourceId, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder externalSourceId(ModelIDKeyConditionInput modelIDKeyConditionInput) {
            this.externalSourceId = modelIDKeyConditionInput;
            return this;
        }

        public Builder externalSourceType(String str) {
            this.externalSourceType = str;
            return this;
        }

        public Builder filter(ModelExternalEventRecordFilterInput modelExternalEventRecordFilterInput) {
            this.filter = modelExternalEventRecordFilterInput;
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getExternalEventByExternalId", "getExternalEventByExternalId", new UnmodifiableMapBuilder(6).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put("externalSourceType", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "externalSourceType").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("externalSourceId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "externalSourceId").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetExternalEventByExternalId getExternalEventByExternalId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetExternalEventByExternalId.Mapper getExternalEventByExternalIdFieldMapper = new GetExternalEventByExternalId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetExternalEventByExternalId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetExternalEventByExternalId>() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetExternalEventByExternalId read(ResponseReader responseReader2) {
                        return Mapper.this.getExternalEventByExternalIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetExternalEventByExternalId getExternalEventByExternalId) {
            this.getExternalEventByExternalId = getExternalEventByExternalId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetExternalEventByExternalId getExternalEventByExternalId = this.getExternalEventByExternalId;
            GetExternalEventByExternalId getExternalEventByExternalId2 = ((Data) obj).getExternalEventByExternalId;
            return getExternalEventByExternalId == null ? getExternalEventByExternalId2 == null : getExternalEventByExternalId.equals(getExternalEventByExternalId2);
        }

        public GetExternalEventByExternalId getExternalEventByExternalId() {
            return this.getExternalEventByExternalId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetExternalEventByExternalId getExternalEventByExternalId = this.getExternalEventByExternalId;
                this.$hashCode = (getExternalEventByExternalId == null ? 0 : getExternalEventByExternalId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetExternalEventByExternalId getExternalEventByExternalId = Data.this.getExternalEventByExternalId;
                    responseWriter.writeObject(responseField, getExternalEventByExternalId != null ? getExternalEventByExternalId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getExternalEventByExternalId=" + this.getExternalEventByExternalId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetExternalEventByExternalId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetExternalEventByExternalId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetExternalEventByExternalId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetExternalEventByExternalId.$responseFields;
                return new GetExternalEventByExternalId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.GetExternalEventByExternalId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.GetExternalEventByExternalId.Mapper.1.1
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

        public GetExternalEventByExternalId(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetExternalEventByExternalId)) {
                return false;
            }
            GetExternalEventByExternalId getExternalEventByExternalId = (GetExternalEventByExternalId) obj;
            if (this.__typename.equals(getExternalEventByExternalId.__typename) && this.items.equals(getExternalEventByExternalId.items)) {
                String str = this.nextToken;
                String str2 = getExternalEventByExternalId.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.GetExternalEventByExternalId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetExternalEventByExternalId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetExternalEventByExternalId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetExternalEventByExternalId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.GetExternalEventByExternalId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetExternalEventByExternalId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetExternalEventByExternalId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final String contactId;
        final String contactName;
        final String createdAt;
        final String engagementId;
        final String eventDescription;
        final String eventEndTime;
        final String eventStartTime;
        final String eventSummary;
        final String eventUrl;
        final String externalSourceId;
        final String externalSourceType;
        final String id;
        final String message;
        final String primaryParticipantEmailId;
        final String primaryParticipantName;
        final String rawEvent;
        final String recordingUrl;
        final String status;
        final String transcriptUrl;
        final String updatedAt;
        final String userId;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readString(responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[22]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSJSON;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("externalSourceId", "externalSourceId", null, false, customType, Collections.emptyList()), ResponseField.forString("externalSourceType", "externalSourceType", null, false, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("userId", "userId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("contactName", "contactName", null, true, Collections.emptyList()), ResponseField.forCustomType("primaryParticipantEmailId", "primaryParticipantEmailId", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forString("primaryParticipantName", "primaryParticipantName", null, true, Collections.emptyList()), ResponseField.forString("recordingUrl", "recordingUrl", null, true, Collections.emptyList()), ResponseField.forString("transcriptUrl", "transcriptUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("rawEvent", "rawEvent", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, null, true, customType2, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forString("eventSummary", "eventSummary", null, true, Collections.emptyList()), ResponseField.forString("eventDescription", "eventDescription", null, true, Collections.emptyList()), ResponseField.forString("eventUrl", "eventUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("eventStartTime", "eventStartTime", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("eventEndTime", "eventEndTime", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.externalSourceId = (String) Utils.checkNotNull(str4, "externalSourceId == null");
            this.externalSourceType = (String) Utils.checkNotNull(str5, "externalSourceType == null");
            this.engagementId = str6;
            this.userId = str7;
            this.contactId = str8;
            this.contactName = str9;
            this.primaryParticipantEmailId = str10;
            this.primaryParticipantName = str11;
            this.recordingUrl = str12;
            this.transcriptUrl = str13;
            this.rawEvent = str14;
            this.message = str15;
            this.status = str16;
            this.eventSummary = str17;
            this.eventDescription = str18;
            this.eventUrl = str19;
            this.eventStartTime = str20;
            this.eventEndTime = str21;
            this.createdAt = str22;
            this.updatedAt = str23;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String contactName() {
            return this.contactName;
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
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.externalSourceId.equals(item.externalSourceId) && this.externalSourceType.equals(item.externalSourceType) && ((str = this.engagementId) != null ? str.equals(item.engagementId) : item.engagementId == null) && ((str2 = this.userId) != null ? str2.equals(item.userId) : item.userId == null) && ((str3 = this.contactId) != null ? str3.equals(item.contactId) : item.contactId == null) && ((str4 = this.contactName) != null ? str4.equals(item.contactName) : item.contactName == null) && ((str5 = this.primaryParticipantEmailId) != null ? str5.equals(item.primaryParticipantEmailId) : item.primaryParticipantEmailId == null) && ((str6 = this.primaryParticipantName) != null ? str6.equals(item.primaryParticipantName) : item.primaryParticipantName == null) && ((str7 = this.recordingUrl) != null ? str7.equals(item.recordingUrl) : item.recordingUrl == null) && ((str8 = this.transcriptUrl) != null ? str8.equals(item.transcriptUrl) : item.transcriptUrl == null) && ((str9 = this.rawEvent) != null ? str9.equals(item.rawEvent) : item.rawEvent == null) && ((str10 = this.message) != null ? str10.equals(item.message) : item.message == null) && ((str11 = this.status) != null ? str11.equals(item.status) : item.status == null) && ((str12 = this.eventSummary) != null ? str12.equals(item.eventSummary) : item.eventSummary == null) && ((str13 = this.eventDescription) != null ? str13.equals(item.eventDescription) : item.eventDescription == null) && ((str14 = this.eventUrl) != null ? str14.equals(item.eventUrl) : item.eventUrl == null) && ((str15 = this.eventStartTime) != null ? str15.equals(item.eventStartTime) : item.eventStartTime == null) && ((str16 = this.eventEndTime) != null ? str16.equals(item.eventEndTime) : item.eventEndTime == null) && ((str17 = this.createdAt) != null ? str17.equals(item.createdAt) : item.createdAt == null)) {
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

        public String eventDescription() {
            return this.eventDescription;
        }

        public String eventEndTime() {
            return this.eventEndTime;
        }

        public String eventStartTime() {
            return this.eventStartTime;
        }

        public String eventSummary() {
            return this.eventSummary;
        }

        public String eventUrl() {
            return this.eventUrl;
        }

        public String externalSourceId() {
            return this.externalSourceId;
        }

        public String externalSourceType() {
            return this.externalSourceType;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.externalSourceId.hashCode()) * 1000003) ^ this.externalSourceType.hashCode()) * 1000003;
                String str = this.engagementId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.userId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.contactId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.contactName;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.primaryParticipantEmailId;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.primaryParticipantName;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.recordingUrl;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.transcriptUrl;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.rawEvent;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.message;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.status;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.eventSummary;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.eventDescription;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.eventUrl;
                int iHashCode15 = (iHashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.eventStartTime;
                int iHashCode16 = (iHashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.eventEndTime;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.externalSourceId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.externalSourceType);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Item.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Item.this.userId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[8], Item.this.contactName);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.primaryParticipantEmailId);
                    responseWriter.writeString(responseFieldArr[10], Item.this.primaryParticipantName);
                    responseWriter.writeString(responseFieldArr[11], Item.this.recordingUrl);
                    responseWriter.writeString(responseFieldArr[12], Item.this.transcriptUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], Item.this.rawEvent);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.message);
                    responseWriter.writeString(responseFieldArr[15], Item.this.status);
                    responseWriter.writeString(responseFieldArr[16], Item.this.eventSummary);
                    responseWriter.writeString(responseFieldArr[17], Item.this.eventDescription);
                    responseWriter.writeString(responseFieldArr[18], Item.this.eventUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], Item.this.eventStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], Item.this.eventEndTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[22], Item.this.updatedAt);
                }
            };
        }

        public String message() {
            return this.message;
        }

        public String primaryParticipantEmailId() {
            return this.primaryParticipantEmailId;
        }

        public String primaryParticipantName() {
            return this.primaryParticipantName;
        }

        public String rawEvent() {
            return this.rawEvent;
        }

        public String recordingUrl() {
            return this.recordingUrl;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", externalSourceId=" + this.externalSourceId + ", externalSourceType=" + this.externalSourceType + ", engagementId=" + this.engagementId + ", userId=" + this.userId + ", contactId=" + this.contactId + ", contactName=" + this.contactName + ", primaryParticipantEmailId=" + this.primaryParticipantEmailId + ", primaryParticipantName=" + this.primaryParticipantName + ", recordingUrl=" + this.recordingUrl + ", transcriptUrl=" + this.transcriptUrl + ", rawEvent=" + this.rawEvent + ", message=" + this.message + ", status=" + this.status + ", eventSummary=" + this.eventSummary + ", eventDescription=" + this.eventDescription + ", eventUrl=" + this.eventUrl + ", eventStartTime=" + this.eventStartTime + ", eventEndTime=" + this.eventEndTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String transcriptUrl() {
            return this.transcriptUrl;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String userId() {
            return this.userId;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelIDKeyConditionInput externalSourceId;
        private final String externalSourceType;
        private final ModelExternalEventRecordFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelExternalEventRecordFilterInput modelExternalEventRecordFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.externalSourceType = str;
            this.externalSourceId = modelIDKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelExternalEventRecordFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("externalSourceType", str);
            linkedHashMap.put("externalSourceId", modelIDKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelExternalEventRecordFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public ModelIDKeyConditionInput externalSourceId() {
            return this.externalSourceId;
        }

        public String externalSourceType() {
            return this.externalSourceType;
        }

        public ModelExternalEventRecordFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetExternalEventByExternalIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("externalSourceType", Variables.this.externalSourceType);
                    inputFieldWriter.writeObject("externalSourceId", Variables.this.externalSourceId != null ? Variables.this.externalSourceId.marshaller() : null);
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

    public GetExternalEventByExternalIdQuery(String str, ModelIDKeyConditionInput modelIDKeyConditionInput, ModelSortDirection modelSortDirection, ModelExternalEventRecordFilterInput modelExternalEventRecordFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelIDKeyConditionInput, modelSortDirection, modelExternalEventRecordFilterInput, num, str2);
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
        return "3a461fe66f693bfe4d928c38d1c20f35b5d962e8312d7d5dc67d439abcf3491d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetExternalEventByExternalId($externalSourceType: String, $externalSourceId: ModelIDKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelExternalEventRecordFilterInput, $limit: Int, $nextToken: String) {\n  getExternalEventByExternalId(externalSourceType: $externalSourceType, externalSourceId: $externalSourceId, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      externalSourceId\n      externalSourceType\n      engagementId\n      userId\n      contactId\n      contactName\n      primaryParticipantEmailId\n      primaryParticipantName\n      recordingUrl\n      transcriptUrl\n      rawEvent\n      message\n      status\n      eventSummary\n      eventDescription\n      eventUrl\n      eventStartTime\n      eventEndTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
