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
import type.ModelCloudCallWebhookEventsFilterInput;
import type.ModelSortDirection;
import type.ModelStringKeyConditionInput;

/* loaded from: classes7.dex */
public final class GetEventByCallIdQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetEventByCallId($callId: String, $providerName: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudCallWebhookEventsFilterInput, $limit: Int, $nextToken: String) {\n  getEventByCallId(callId: $callId, providerName: $providerName, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      callSessionId\n      callId\n      customIdentifier\n      providerName\n      connectionId\n      rawPayload\n      eventType\n      sourceNumber\n      callerSource\n      destinationNumber\n      displayNumber\n      agentNumber\n      customerNumber\n      callStartTime\n      callEndTime\n      callDuration\n      actualCallDuration\n      resourceURL\n      callDirection\n      status\n      expirationUnixTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetEventByCallId";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetEventByCallId($callId: String, $providerName: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudCallWebhookEventsFilterInput, $limit: Int, $nextToken: String) {\n  getEventByCallId(callId: $callId, providerName: $providerName, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      callSessionId\n      callId\n      customIdentifier\n      providerName\n      connectionId\n      rawPayload\n      eventType\n      sourceNumber\n      callerSource\n      destinationNumber\n      displayNumber\n      agentNumber\n      customerNumber\n      callStartTime\n      callEndTime\n      callDuration\n      actualCallDuration\n      resourceURL\n      callDirection\n      status\n      expirationUnixTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String callId;
        private ModelCloudCallWebhookEventsFilterInput filter;
        private Integer limit;
        private String nextToken;
        private ModelStringKeyConditionInput providerName;
        private ModelSortDirection sortDirection;

        public GetEventByCallIdQuery build() {
            return new GetEventByCallIdQuery(this.callId, this.providerName, this.sortDirection, this.filter, this.limit, this.nextToken);
        }

        public Builder callId(String str) {
            this.callId = str;
            return this;
        }

        public Builder filter(ModelCloudCallWebhookEventsFilterInput modelCloudCallWebhookEventsFilterInput) {
            this.filter = modelCloudCallWebhookEventsFilterInput;
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

        public Builder providerName(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.providerName = modelStringKeyConditionInput;
            return this;
        }

        public Builder sortDirection(ModelSortDirection modelSortDirection) {
            this.sortDirection = modelSortDirection;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getEventByCallId", "getEventByCallId", new UnmodifiableMapBuilder(6).put("callId", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "callId").build()).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put("sortDirection", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sortDirection").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put("providerName", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "providerName").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetEventByCallId getEventByCallId;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetEventByCallId.Mapper getEventByCallIdFieldMapper = new GetEventByCallId.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetEventByCallId) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetEventByCallId>() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetEventByCallId read(ResponseReader responseReader2) {
                        return Mapper.this.getEventByCallIdFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetEventByCallId getEventByCallId) {
            this.getEventByCallId = getEventByCallId;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetEventByCallId getEventByCallId = this.getEventByCallId;
            GetEventByCallId getEventByCallId2 = ((Data) obj).getEventByCallId;
            return getEventByCallId == null ? getEventByCallId2 == null : getEventByCallId.equals(getEventByCallId2);
        }

        public GetEventByCallId getEventByCallId() {
            return this.getEventByCallId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetEventByCallId getEventByCallId = this.getEventByCallId;
                this.$hashCode = (getEventByCallId == null ? 0 : getEventByCallId.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetEventByCallId getEventByCallId = Data.this.getEventByCallId;
                    responseWriter.writeObject(responseField, getEventByCallId != null ? getEventByCallId.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getEventByCallId=" + this.getEventByCallId + "}";
            }
            return this.$toString;
        }
    }

    public static class GetEventByCallId {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<GetEventByCallId> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetEventByCallId map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetEventByCallId.$responseFields;
                return new GetEventByCallId(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.GetEventByCallId.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.GetEventByCallId.Mapper.1.1
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

        public GetEventByCallId(String str, List<Item> list, String str2) {
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
            if (!(obj instanceof GetEventByCallId)) {
                return false;
            }
            GetEventByCallId getEventByCallId = (GetEventByCallId) obj;
            if (this.__typename.equals(getEventByCallId.__typename) && this.items.equals(getEventByCallId.items)) {
                String str = this.nextToken;
                String str2 = getEventByCallId.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.GetEventByCallId.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetEventByCallId.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetEventByCallId.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], GetEventByCallId.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.GetEventByCallId.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], GetEventByCallId.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetEventByCallId{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + "}";
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
        final Integer actualCallDuration;
        final String agentNumber;
        final String callDirection;
        final Integer callDuration;
        final String callEndTime;
        final String callId;
        final String callSessionId;
        final String callStartTime;
        final String callerSource;
        final String connectionId;
        final String contactId;
        final String createdAt;
        final String customIdentifier;
        final String customerNumber;
        final String destinationNumber;
        final String displayNumber;
        final String eventType;
        final Long expirationUnixTime;
        final String id;
        final String providerName;
        final String rawPayload;
        final String resourceURL;
        final String sourceNumber;
        final String status;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Item map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Item.$responseFields;
                return new Item(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readString(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), responseReader.readInt(responseFieldArr[19]), responseReader.readInt(responseFieldArr[20]), responseReader.readString(responseFieldArr[21]), responseReader.readString(responseFieldArr[22]), responseReader.readString(responseFieldArr[23]), (Long) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[24]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[25]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[26]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forString("callSessionId", "callSessionId", null, true, Collections.emptyList()), ResponseField.forString("callId", "callId", null, true, Collections.emptyList()), ResponseField.forString("customIdentifier", "customIdentifier", null, true, Collections.emptyList()), ResponseField.forString("providerName", "providerName", null, true, Collections.emptyList()), ResponseField.forString("connectionId", "connectionId", null, true, Collections.emptyList()), ResponseField.forCustomType("rawPayload", "rawPayload", null, true, CustomType.AWSJSON, Collections.emptyList()), ResponseField.forString("eventType", "eventType", null, true, Collections.emptyList()), ResponseField.forString("sourceNumber", "sourceNumber", null, true, Collections.emptyList()), ResponseField.forString("callerSource", "callerSource", null, true, Collections.emptyList()), ResponseField.forString("destinationNumber", "destinationNumber", null, true, Collections.emptyList()), ResponseField.forString("displayNumber", "displayNumber", null, true, Collections.emptyList()), ResponseField.forString("agentNumber", "agentNumber", null, true, Collections.emptyList()), ResponseField.forString("customerNumber", "customerNumber", null, true, Collections.emptyList()), ResponseField.forCustomType("callStartTime", "callStartTime", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("callEndTime", "callEndTime", null, true, customType2, Collections.emptyList()), ResponseField.forInt("callDuration", "callDuration", null, true, Collections.emptyList()), ResponseField.forInt("actualCallDuration", "actualCallDuration", null, true, Collections.emptyList()), ResponseField.forString("resourceURL", "resourceURL", null, true, Collections.emptyList()), ResponseField.forString("callDirection", "callDirection", null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forCustomType("expirationUnixTime", "expirationUnixTime", null, true, CustomType.AWSTIMESTAMP, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, Integer num2, String str20, String str21, String str22, Long l, String str23, String str24) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = str3;
            this.contactId = str4;
            this.callSessionId = str5;
            this.callId = str6;
            this.customIdentifier = str7;
            this.providerName = str8;
            this.connectionId = str9;
            this.rawPayload = str10;
            this.eventType = str11;
            this.sourceNumber = str12;
            this.callerSource = str13;
            this.destinationNumber = str14;
            this.displayNumber = str15;
            this.agentNumber = str16;
            this.customerNumber = str17;
            this.callStartTime = str18;
            this.callEndTime = str19;
            this.callDuration = num;
            this.actualCallDuration = num2;
            this.resourceURL = str20;
            this.callDirection = str21;
            this.status = str22;
            this.expirationUnixTime = l;
            this.createdAt = str23;
            this.updatedAt = str24;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Integer actualCallDuration() {
            return this.actualCallDuration;
        }

        public String agentNumber() {
            return this.agentNumber;
        }

        public String callDirection() {
            return this.callDirection;
        }

        public Integer callDuration() {
            return this.callDuration;
        }

        public String callEndTime() {
            return this.callEndTime;
        }

        public String callId() {
            return this.callId;
        }

        public String callSessionId() {
            return this.callSessionId;
        }

        public String callStartTime() {
            return this.callStartTime;
        }

        public String callerSource() {
            return this.callerSource;
        }

        public String connectionId() {
            return this.connectionId;
        }

        public String contactId() {
            return this.contactId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String customIdentifier() {
            return this.customIdentifier;
        }

        public String customerNumber() {
            return this.customerNumber;
        }

        public String destinationNumber() {
            return this.destinationNumber;
        }

        public String displayNumber() {
            return this.displayNumber;
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
            Integer num;
            Integer num2;
            String str18;
            String str19;
            String str20;
            Long l;
            String str21;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && ((str = this.accountId) != null ? str.equals(item.accountId) : item.accountId == null) && ((str2 = this.contactId) != null ? str2.equals(item.contactId) : item.contactId == null) && ((str3 = this.callSessionId) != null ? str3.equals(item.callSessionId) : item.callSessionId == null) && ((str4 = this.callId) != null ? str4.equals(item.callId) : item.callId == null) && ((str5 = this.customIdentifier) != null ? str5.equals(item.customIdentifier) : item.customIdentifier == null) && ((str6 = this.providerName) != null ? str6.equals(item.providerName) : item.providerName == null) && ((str7 = this.connectionId) != null ? str7.equals(item.connectionId) : item.connectionId == null) && ((str8 = this.rawPayload) != null ? str8.equals(item.rawPayload) : item.rawPayload == null) && ((str9 = this.eventType) != null ? str9.equals(item.eventType) : item.eventType == null) && ((str10 = this.sourceNumber) != null ? str10.equals(item.sourceNumber) : item.sourceNumber == null) && ((str11 = this.callerSource) != null ? str11.equals(item.callerSource) : item.callerSource == null) && ((str12 = this.destinationNumber) != null ? str12.equals(item.destinationNumber) : item.destinationNumber == null) && ((str13 = this.displayNumber) != null ? str13.equals(item.displayNumber) : item.displayNumber == null) && ((str14 = this.agentNumber) != null ? str14.equals(item.agentNumber) : item.agentNumber == null) && ((str15 = this.customerNumber) != null ? str15.equals(item.customerNumber) : item.customerNumber == null) && ((str16 = this.callStartTime) != null ? str16.equals(item.callStartTime) : item.callStartTime == null) && ((str17 = this.callEndTime) != null ? str17.equals(item.callEndTime) : item.callEndTime == null) && ((num = this.callDuration) != null ? num.equals(item.callDuration) : item.callDuration == null) && ((num2 = this.actualCallDuration) != null ? num2.equals(item.actualCallDuration) : item.actualCallDuration == null) && ((str18 = this.resourceURL) != null ? str18.equals(item.resourceURL) : item.resourceURL == null) && ((str19 = this.callDirection) != null ? str19.equals(item.callDirection) : item.callDirection == null) && ((str20 = this.status) != null ? str20.equals(item.status) : item.status == null) && ((l = this.expirationUnixTime) != null ? l.equals(item.expirationUnixTime) : item.expirationUnixTime == null) && ((str21 = this.createdAt) != null ? str21.equals(item.createdAt) : item.createdAt == null)) {
                String str22 = this.updatedAt;
                String str23 = item.updatedAt;
                if (str22 == null) {
                    if (str23 == null) {
                        return true;
                    }
                } else if (str22.equals(str23)) {
                    return true;
                }
            }
            return false;
        }

        public String eventType() {
            return this.eventType;
        }

        public Long expirationUnixTime() {
            return this.expirationUnixTime;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003;
                String str = this.accountId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.contactId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.callSessionId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.callId;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.customIdentifier;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.providerName;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.connectionId;
                int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.rawPayload;
                int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.eventType;
                int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.sourceNumber;
                int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.callerSource;
                int iHashCode12 = (iHashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.destinationNumber;
                int iHashCode13 = (iHashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.displayNumber;
                int iHashCode14 = (iHashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.agentNumber;
                int iHashCode15 = (iHashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.customerNumber;
                int iHashCode16 = (iHashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.callStartTime;
                int iHashCode17 = (iHashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.callEndTime;
                int iHashCode18 = (iHashCode17 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                Integer num = this.callDuration;
                int iHashCode19 = (iHashCode18 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.actualCallDuration;
                int iHashCode20 = (iHashCode19 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str18 = this.resourceURL;
                int iHashCode21 = (iHashCode20 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.callDirection;
                int iHashCode22 = (iHashCode21 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.status;
                int iHashCode23 = (iHashCode22 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                Long l = this.expirationUnixTime;
                int iHashCode24 = (iHashCode23 ^ (l == null ? 0 : l.hashCode())) * 1000003;
                String str21 = this.createdAt;
                int iHashCode25 = (iHashCode24 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.updatedAt;
                this.$hashCode = iHashCode25 ^ (str22 != null ? str22.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Item.this.contactId);
                    responseWriter.writeString(responseFieldArr[4], Item.this.callSessionId);
                    responseWriter.writeString(responseFieldArr[5], Item.this.callId);
                    responseWriter.writeString(responseFieldArr[6], Item.this.customIdentifier);
                    responseWriter.writeString(responseFieldArr[7], Item.this.providerName);
                    responseWriter.writeString(responseFieldArr[8], Item.this.connectionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Item.this.rawPayload);
                    responseWriter.writeString(responseFieldArr[10], Item.this.eventType);
                    responseWriter.writeString(responseFieldArr[11], Item.this.sourceNumber);
                    responseWriter.writeString(responseFieldArr[12], Item.this.callerSource);
                    responseWriter.writeString(responseFieldArr[13], Item.this.destinationNumber);
                    responseWriter.writeString(responseFieldArr[14], Item.this.displayNumber);
                    responseWriter.writeString(responseFieldArr[15], Item.this.agentNumber);
                    responseWriter.writeString(responseFieldArr[16], Item.this.customerNumber);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], Item.this.callStartTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], Item.this.callEndTime);
                    responseWriter.writeInt(responseFieldArr[19], Item.this.callDuration);
                    responseWriter.writeInt(responseFieldArr[20], Item.this.actualCallDuration);
                    responseWriter.writeString(responseFieldArr[21], Item.this.resourceURL);
                    responseWriter.writeString(responseFieldArr[22], Item.this.callDirection);
                    responseWriter.writeString(responseFieldArr[23], Item.this.status);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[24], Item.this.expirationUnixTime);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[25], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[26], Item.this.updatedAt);
                }
            };
        }

        public String providerName() {
            return this.providerName;
        }

        public String rawPayload() {
            return this.rawPayload;
        }

        public String resourceURL() {
            return this.resourceURL;
        }

        public String sourceNumber() {
            return this.sourceNumber;
        }

        public String status() {
            return this.status;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", callSessionId=" + this.callSessionId + ", callId=" + this.callId + ", customIdentifier=" + this.customIdentifier + ", providerName=" + this.providerName + ", connectionId=" + this.connectionId + ", rawPayload=" + this.rawPayload + ", eventType=" + this.eventType + ", sourceNumber=" + this.sourceNumber + ", callerSource=" + this.callerSource + ", destinationNumber=" + this.destinationNumber + ", displayNumber=" + this.displayNumber + ", agentNumber=" + this.agentNumber + ", customerNumber=" + this.customerNumber + ", callStartTime=" + this.callStartTime + ", callEndTime=" + this.callEndTime + ", callDuration=" + this.callDuration + ", actualCallDuration=" + this.actualCallDuration + ", resourceURL=" + this.resourceURL + ", callDirection=" + this.callDirection + ", status=" + this.status + ", expirationUnixTime=" + this.expirationUnixTime + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String callId;
        private final ModelCloudCallWebhookEventsFilterInput filter;
        private final Integer limit;
        private final String nextToken;
        private final ModelStringKeyConditionInput providerName;
        private final ModelSortDirection sortDirection;
        private final transient Map<String, Object> valueMap;

        public Variables(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelCloudCallWebhookEventsFilterInput modelCloudCallWebhookEventsFilterInput, Integer num, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.callId = str;
            this.providerName = modelStringKeyConditionInput;
            this.sortDirection = modelSortDirection;
            this.filter = modelCloudCallWebhookEventsFilterInput;
            this.limit = num;
            this.nextToken = str2;
            linkedHashMap.put("callId", str);
            linkedHashMap.put("providerName", modelStringKeyConditionInput);
            linkedHashMap.put("sortDirection", modelSortDirection);
            linkedHashMap.put("filter", modelCloudCallWebhookEventsFilterInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str2);
        }

        public String callId() {
            return this.callId;
        }

        public ModelCloudCallWebhookEventsFilterInput filter() {
            return this.filter;
        }

        public Integer limit() {
            return this.limit;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetEventByCallIdQuery.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeString("callId", Variables.this.callId);
                    inputFieldWriter.writeObject("providerName", Variables.this.providerName != null ? Variables.this.providerName.marshaller() : null);
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

        public ModelStringKeyConditionInput providerName() {
            return this.providerName;
        }

        public ModelSortDirection sortDirection() {
            return this.sortDirection;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public GetEventByCallIdQuery(String str, ModelStringKeyConditionInput modelStringKeyConditionInput, ModelSortDirection modelSortDirection, ModelCloudCallWebhookEventsFilterInput modelCloudCallWebhookEventsFilterInput, Integer num, String str2) {
        this.variables = new Variables(str, modelStringKeyConditionInput, modelSortDirection, modelCloudCallWebhookEventsFilterInput, num, str2);
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
        return "feb4c9667653d6963678b3509adf4452e34aee698d803d28074503d1bab6d01c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetEventByCallId($callId: String, $providerName: ModelStringKeyConditionInput, $sortDirection: ModelSortDirection, $filter: ModelCloudCallWebhookEventsFilterInput, $limit: Int, $nextToken: String) {\n  getEventByCallId(callId: $callId, providerName: $providerName, sortDirection: $sortDirection, filter: $filter, limit: $limit, nextToken: $nextToken) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      contactId\n      callSessionId\n      callId\n      customIdentifier\n      providerName\n      connectionId\n      rawPayload\n      eventType\n      sourceNumber\n      callerSource\n      destinationNumber\n      displayNumber\n      agentNumber\n      customerNumber\n      callStartTime\n      callEndTime\n      callDuration\n      actualCallDuration\n      resourceURL\n      callDirection\n      status\n      expirationUnixTime\n      createdAt\n      updatedAt\n    }\n    nextToken\n  }\n}";
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
