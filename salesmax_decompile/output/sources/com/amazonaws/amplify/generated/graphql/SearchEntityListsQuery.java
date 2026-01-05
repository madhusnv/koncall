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
import type.ContactAssignmentStatus;
import type.CustomType;
import type.EntityListStatus;
import type.EntityListType;
import type.ListCreationType;
import type.SearchableEntityListFilterInput;
import type.SearchableEntityListSortInput;

/* loaded from: classes4.dex */
public final class SearchEntityListsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query SearchEntityLists($filter: SearchableEntityListFilterInput, $sort: SearchableEntityListSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEntityLists(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "SearchEntityLists";
        }
    };
    public static final String QUERY_DOCUMENT = "query SearchEntityLists($filter: SearchableEntityListFilterInput, $sort: SearchableEntityListSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEntityLists(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private SearchableEntityListFilterInput filter;
        private Integer from;
        private Integer limit;
        private String nextToken;
        private SearchableEntityListSortInput sort;

        public SearchEntityListsQuery build() {
            return new SearchEntityListsQuery(this.filter, this.sort, this.limit, this.nextToken, this.from);
        }

        public Builder filter(SearchableEntityListFilterInput searchableEntityListFilterInput) {
            this.filter = searchableEntityListFilterInput;
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

        public Builder sort(SearchableEntityListSortInput searchableEntityListSortInput) {
            this.sort = searchableEntityListSortInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("searchEntityLists", "searchEntityLists", new UnmodifiableMapBuilder(5).put("filter", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "filter").build()).put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY).build()).put("limit", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "limit").build()).put(Constants.MessagePayloadKeys.FROM, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, Constants.MessagePayloadKeys.FROM).build()).put("sort", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "sort").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final SearchEntityLists searchEntityLists;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SearchEntityLists.Mapper searchEntityListsFieldMapper = new SearchEntityLists.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((SearchEntityLists) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SearchEntityLists>() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public SearchEntityLists read(ResponseReader responseReader2) {
                        return Mapper.this.searchEntityListsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(SearchEntityLists searchEntityLists) {
            this.searchEntityLists = searchEntityLists;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            SearchEntityLists searchEntityLists = this.searchEntityLists;
            SearchEntityLists searchEntityLists2 = ((Data) obj).searchEntityLists;
            return searchEntityLists == null ? searchEntityLists2 == null : searchEntityLists.equals(searchEntityLists2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SearchEntityLists searchEntityLists = this.searchEntityLists;
                this.$hashCode = (searchEntityLists == null ? 0 : searchEntityLists.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    SearchEntityLists searchEntityLists = Data.this.searchEntityLists;
                    responseWriter.writeObject(responseField, searchEntityLists != null ? searchEntityLists.marshaller() : null);
                }
            };
        }

        public SearchEntityLists searchEntityLists() {
            return this.searchEntityLists;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{searchEntityLists=" + this.searchEntityLists + "}";
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
        final String assignedTeamId;
        final String assignedUserId;
        final String associatedDistributionId;
        final String chatMessagePlatform;
        final String createdAt;
        final String defaultCountryCode;
        final String defaultCountryIso;
        final String description;
        final Integer doNotTrackCount;
        final String dupliacteLeadList;
        final Integer duplicateCount;
        final String entityActionDefinitionReference;
        final EntityListType entityListType;
        final String entityTypeInList;
        final String finalBulkUploadFileRef;
        final String id;
        final Integer invalidEmailCount;
        final Integer invalidNumbersCount;
        final String leadSourceForBulkUpload;
        final String listCategory;
        final ListCreationType listCreationType;
        final String listName;
        final String modifiedBulkUploadFileRef;
        final String notificationBody;
        final Integer otherFailedCount;
        final String ownerId;
        final String rawBulkUploadFileHash;
        final String rawBulkUploadFileRef;
        final Boolean redistributeEntities;
        final String redistributionRequestedAt;
        final String rule;
        final EntityListStatus status;
        final Integer successfulCount;
        final List<String> tags;
        final ContactAssignmentStatus toBeAssigned;
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
                EntityListType entityListTypeValueOf = string3 != null ? EntityListType.valueOf(string3) : null;
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                EntityListStatus entityListStatusValueOf = string6 != null ? EntityListStatus.valueOf(string6) : null;
                Integer num = responseReader.readInt(responseFieldArr[8]);
                Integer num2 = responseReader.readInt(responseFieldArr[9]);
                Integer num3 = responseReader.readInt(responseFieldArr[10]);
                Integer num4 = responseReader.readInt(responseFieldArr[11]);
                Integer num5 = responseReader.readInt(responseFieldArr[12]);
                Integer num6 = responseReader.readInt(responseFieldArr[13]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]);
                String string7 = responseReader.readString(responseFieldArr[15]);
                ListCreationType listCreationTypeValueOf = string7 != null ? ListCreationType.valueOf(string7) : null;
                String string8 = responseReader.readString(responseFieldArr[16]);
                String string9 = responseReader.readString(responseFieldArr[17]);
                String string10 = responseReader.readString(responseFieldArr[18]);
                String string11 = responseReader.readString(responseFieldArr[19]);
                String string12 = responseReader.readString(responseFieldArr[20]);
                String string13 = responseReader.readString(responseFieldArr[21]);
                String string14 = responseReader.readString(responseFieldArr[22]);
                String string15 = responseReader.readString(responseFieldArr[23]);
                String string16 = responseReader.readString(responseFieldArr[24]);
                String string17 = responseReader.readString(responseFieldArr[25]);
                String string18 = responseReader.readString(responseFieldArr[26]);
                return new Item(string, str, str2, string2, entityListTypeValueOf, string4, string5, entityListStatusValueOf, num, num2, num3, num4, num5, num6, str3, listCreationTypeValueOf, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18 != null ? ContactAssignmentStatus.valueOf(string18) : null, responseReader.readString(responseFieldArr[27]), responseReader.readString(responseFieldArr[28]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[29]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[30]), responseReader.readBoolean(responseFieldArr[31]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[32]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[33]), responseReader.readList(responseFieldArr[34], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.Item.Mapper.1
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(responseFieldArr[35]), responseReader.readBoolean(responseFieldArr[36]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[37]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[38]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("entityTypeInList", "entityTypeInList", null, false, Collections.emptyList()), ResponseField.forString("entityListType", "entityListType", null, false, Collections.emptyList()), ResponseField.forString("listName", "listName", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("status", "status", null, true, Collections.emptyList()), ResponseField.forInt("successfulCount", "successfulCount", null, true, Collections.emptyList()), ResponseField.forInt("duplicateCount", "duplicateCount", null, true, Collections.emptyList()), ResponseField.forInt("invalidNumbersCount", "invalidNumbersCount", null, true, Collections.emptyList()), ResponseField.forInt("invalidEmailCount", "invalidEmailCount", null, true, Collections.emptyList()), ResponseField.forInt("doNotTrackCount", "doNotTrackCount", null, true, Collections.emptyList()), ResponseField.forInt("otherFailedCount", "otherFailedCount", null, true, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("listCreationType", "listCreationType", null, false, Collections.emptyList()), ResponseField.forString("listCategory", "listCategory", null, true, Collections.emptyList()), ResponseField.forString("rawBulkUploadFileRef", "rawBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("rawBulkUploadFileHash", "rawBulkUploadFileHash", null, true, Collections.emptyList()), ResponseField.forString("modifiedBulkUploadFileRef", "modifiedBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("finalBulkUploadFileRef", "finalBulkUploadFileRef", null, true, Collections.emptyList()), ResponseField.forString("leadSourceForBulkUpload", "leadSourceForBulkUpload", null, true, Collections.emptyList()), ResponseField.forString("defaultCountryCode", "defaultCountryCode", null, true, Collections.emptyList()), ResponseField.forString("defaultCountryIso", "defaultCountryIso", null, true, Collections.emptyList()), ResponseField.forString("notificationBody", "notificationBody", null, true, Collections.emptyList()), ResponseField.forString("rule", "rule", null, true, Collections.emptyList()), ResponseField.forString("toBeAssigned", "toBeAssigned", null, true, Collections.emptyList()), ResponseField.forString("assignedUserId", "assignedUserId", null, true, Collections.emptyList()), ResponseField.forString("assignedTeamId", "assignedTeamId", null, true, Collections.emptyList()), ResponseField.forCustomType("associatedDistributionId", "associatedDistributionId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("entityActionDefinitionReference", "entityActionDefinitionReference", null, true, customType, Collections.emptyList()), ResponseField.forBoolean("redistributeEntities", "redistributeEntities", null, true, Collections.emptyList()), ResponseField.forCustomType("redistributionRequestedAt", "redistributionRequestedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("dupliacteLeadList", "dupliacteLeadList", null, true, customType, Collections.emptyList()), ResponseField.forList("tags", "tags", null, true, Collections.emptyList()), ResponseField.forString("chatMessagePlatform", "chatMessagePlatform", null, true, Collections.emptyList()), ResponseField.forBoolean("allowMultiple", "allowMultiple", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Item(String str, String str2, String str3, String str4, EntityListType entityListType, String str5, String str6, EntityListStatus entityListStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str7, ListCreationType listCreationType, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ContactAssignmentStatus contactAssignmentStatus, String str18, String str19, String str20, String str21, Boolean bool, String str22, String str23, List<String> list, String str24, Boolean bool2, String str25, String str26) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.entityTypeInList = (String) Utils.checkNotNull(str4, "entityTypeInList == null");
            this.entityListType = (EntityListType) Utils.checkNotNull(entityListType, "entityListType == null");
            this.listName = str5;
            this.description = str6;
            this.status = entityListStatus;
            this.successfulCount = num;
            this.duplicateCount = num2;
            this.invalidNumbersCount = num3;
            this.invalidEmailCount = num4;
            this.doNotTrackCount = num5;
            this.otherFailedCount = num6;
            this.ownerId = (String) Utils.checkNotNull(str7, "ownerId == null");
            this.listCreationType = (ListCreationType) Utils.checkNotNull(listCreationType, "listCreationType == null");
            this.listCategory = str8;
            this.rawBulkUploadFileRef = str9;
            this.rawBulkUploadFileHash = str10;
            this.modifiedBulkUploadFileRef = str11;
            this.finalBulkUploadFileRef = str12;
            this.leadSourceForBulkUpload = str13;
            this.defaultCountryCode = str14;
            this.defaultCountryIso = str15;
            this.notificationBody = str16;
            this.rule = str17;
            this.toBeAssigned = contactAssignmentStatus;
            this.assignedUserId = str18;
            this.assignedTeamId = str19;
            this.associatedDistributionId = str20;
            this.entityActionDefinitionReference = str21;
            this.redistributeEntities = bool;
            this.redistributionRequestedAt = str22;
            this.dupliacteLeadList = str23;
            this.tags = list;
            this.chatMessagePlatform = str24;
            this.allowMultiple = bool2;
            this.createdAt = str25;
            this.updatedAt = str26;
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

        public String assignedTeamId() {
            return this.assignedTeamId;
        }

        public String assignedUserId() {
            return this.assignedUserId;
        }

        public String associatedDistributionId() {
            return this.associatedDistributionId;
        }

        public String chatMessagePlatform() {
            return this.chatMessagePlatform;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String defaultCountryCode() {
            return this.defaultCountryCode;
        }

        public String defaultCountryIso() {
            return this.defaultCountryIso;
        }

        public String description() {
            return this.description;
        }

        public Integer doNotTrackCount() {
            return this.doNotTrackCount;
        }

        public String dupliacteLeadList() {
            return this.dupliacteLeadList;
        }

        public Integer duplicateCount() {
            return this.duplicateCount;
        }

        public String entityActionDefinitionReference() {
            return this.entityActionDefinitionReference;
        }

        public EntityListType entityListType() {
            return this.entityListType;
        }

        public String entityTypeInList() {
            return this.entityTypeInList;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            EntityListStatus entityListStatus;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
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
            ContactAssignmentStatus contactAssignmentStatus;
            String str13;
            String str14;
            String str15;
            String str16;
            Boolean bool;
            String str17;
            String str18;
            List<String> list;
            String str19;
            Boolean bool2;
            String str20;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (this.__typename.equals(item.__typename) && this.id.equals(item.id) && this.accountId.equals(item.accountId) && this.entityTypeInList.equals(item.entityTypeInList) && this.entityListType.equals(item.entityListType) && ((str = this.listName) != null ? str.equals(item.listName) : item.listName == null) && ((str2 = this.description) != null ? str2.equals(item.description) : item.description == null) && ((entityListStatus = this.status) != null ? entityListStatus.equals(item.status) : item.status == null) && ((num = this.successfulCount) != null ? num.equals(item.successfulCount) : item.successfulCount == null) && ((num2 = this.duplicateCount) != null ? num2.equals(item.duplicateCount) : item.duplicateCount == null) && ((num3 = this.invalidNumbersCount) != null ? num3.equals(item.invalidNumbersCount) : item.invalidNumbersCount == null) && ((num4 = this.invalidEmailCount) != null ? num4.equals(item.invalidEmailCount) : item.invalidEmailCount == null) && ((num5 = this.doNotTrackCount) != null ? num5.equals(item.doNotTrackCount) : item.doNotTrackCount == null) && ((num6 = this.otherFailedCount) != null ? num6.equals(item.otherFailedCount) : item.otherFailedCount == null) && this.ownerId.equals(item.ownerId) && this.listCreationType.equals(item.listCreationType) && ((str3 = this.listCategory) != null ? str3.equals(item.listCategory) : item.listCategory == null) && ((str4 = this.rawBulkUploadFileRef) != null ? str4.equals(item.rawBulkUploadFileRef) : item.rawBulkUploadFileRef == null) && ((str5 = this.rawBulkUploadFileHash) != null ? str5.equals(item.rawBulkUploadFileHash) : item.rawBulkUploadFileHash == null) && ((str6 = this.modifiedBulkUploadFileRef) != null ? str6.equals(item.modifiedBulkUploadFileRef) : item.modifiedBulkUploadFileRef == null) && ((str7 = this.finalBulkUploadFileRef) != null ? str7.equals(item.finalBulkUploadFileRef) : item.finalBulkUploadFileRef == null) && ((str8 = this.leadSourceForBulkUpload) != null ? str8.equals(item.leadSourceForBulkUpload) : item.leadSourceForBulkUpload == null) && ((str9 = this.defaultCountryCode) != null ? str9.equals(item.defaultCountryCode) : item.defaultCountryCode == null) && ((str10 = this.defaultCountryIso) != null ? str10.equals(item.defaultCountryIso) : item.defaultCountryIso == null) && ((str11 = this.notificationBody) != null ? str11.equals(item.notificationBody) : item.notificationBody == null) && ((str12 = this.rule) != null ? str12.equals(item.rule) : item.rule == null) && ((contactAssignmentStatus = this.toBeAssigned) != null ? contactAssignmentStatus.equals(item.toBeAssigned) : item.toBeAssigned == null) && ((str13 = this.assignedUserId) != null ? str13.equals(item.assignedUserId) : item.assignedUserId == null) && ((str14 = this.assignedTeamId) != null ? str14.equals(item.assignedTeamId) : item.assignedTeamId == null) && ((str15 = this.associatedDistributionId) != null ? str15.equals(item.associatedDistributionId) : item.associatedDistributionId == null) && ((str16 = this.entityActionDefinitionReference) != null ? str16.equals(item.entityActionDefinitionReference) : item.entityActionDefinitionReference == null) && ((bool = this.redistributeEntities) != null ? bool.equals(item.redistributeEntities) : item.redistributeEntities == null) && ((str17 = this.redistributionRequestedAt) != null ? str17.equals(item.redistributionRequestedAt) : item.redistributionRequestedAt == null) && ((str18 = this.dupliacteLeadList) != null ? str18.equals(item.dupliacteLeadList) : item.dupliacteLeadList == null) && ((list = this.tags) != null ? list.equals(item.tags) : item.tags == null) && ((str19 = this.chatMessagePlatform) != null ? str19.equals(item.chatMessagePlatform) : item.chatMessagePlatform == null) && ((bool2 = this.allowMultiple) != null ? bool2.equals(item.allowMultiple) : item.allowMultiple == null) && ((str20 = this.createdAt) != null ? str20.equals(item.createdAt) : item.createdAt == null)) {
                String str21 = this.updatedAt;
                String str22 = item.updatedAt;
                if (str21 == null) {
                    if (str22 == null) {
                        return true;
                    }
                } else if (str21.equals(str22)) {
                    return true;
                }
            }
            return false;
        }

        public String finalBulkUploadFileRef() {
            return this.finalBulkUploadFileRef;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.entityTypeInList.hashCode()) * 1000003) ^ this.entityListType.hashCode()) * 1000003;
                String str = this.listName;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                EntityListStatus entityListStatus = this.status;
                int iHashCode4 = (iHashCode3 ^ (entityListStatus == null ? 0 : entityListStatus.hashCode())) * 1000003;
                Integer num = this.successfulCount;
                int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.duplicateCount;
                int iHashCode6 = (iHashCode5 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.invalidNumbersCount;
                int iHashCode7 = (iHashCode6 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.invalidEmailCount;
                int iHashCode8 = (iHashCode7 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.doNotTrackCount;
                int iHashCode9 = (iHashCode8 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.otherFailedCount;
                int iHashCode10 = (((((iHashCode9 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003) ^ this.ownerId.hashCode()) * 1000003) ^ this.listCreationType.hashCode()) * 1000003;
                String str3 = this.listCategory;
                int iHashCode11 = (iHashCode10 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.rawBulkUploadFileRef;
                int iHashCode12 = (iHashCode11 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.rawBulkUploadFileHash;
                int iHashCode13 = (iHashCode12 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.modifiedBulkUploadFileRef;
                int iHashCode14 = (iHashCode13 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.finalBulkUploadFileRef;
                int iHashCode15 = (iHashCode14 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.leadSourceForBulkUpload;
                int iHashCode16 = (iHashCode15 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.defaultCountryCode;
                int iHashCode17 = (iHashCode16 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.defaultCountryIso;
                int iHashCode18 = (iHashCode17 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.notificationBody;
                int iHashCode19 = (iHashCode18 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.rule;
                int iHashCode20 = (iHashCode19 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                ContactAssignmentStatus contactAssignmentStatus = this.toBeAssigned;
                int iHashCode21 = (iHashCode20 ^ (contactAssignmentStatus == null ? 0 : contactAssignmentStatus.hashCode())) * 1000003;
                String str13 = this.assignedUserId;
                int iHashCode22 = (iHashCode21 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.assignedTeamId;
                int iHashCode23 = (iHashCode22 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.associatedDistributionId;
                int iHashCode24 = (iHashCode23 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.entityActionDefinitionReference;
                int iHashCode25 = (iHashCode24 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                Boolean bool = this.redistributeEntities;
                int iHashCode26 = (iHashCode25 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str17 = this.redistributionRequestedAt;
                int iHashCode27 = (iHashCode26 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.dupliacteLeadList;
                int iHashCode28 = (iHashCode27 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                List<String> list = this.tags;
                int iHashCode29 = (iHashCode28 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str19 = this.chatMessagePlatform;
                int iHashCode30 = (iHashCode29 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                Boolean bool2 = this.allowMultiple;
                int iHashCode31 = (iHashCode30 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str20 = this.createdAt;
                int iHashCode32 = (iHashCode31 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.updatedAt;
                this.$hashCode = iHashCode32 ^ (str21 != null ? str21.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Integer invalidEmailCount() {
            return this.invalidEmailCount;
        }

        public Integer invalidNumbersCount() {
            return this.invalidNumbersCount;
        }

        public String leadSourceForBulkUpload() {
            return this.leadSourceForBulkUpload;
        }

        public String listCategory() {
            return this.listCategory;
        }

        public ListCreationType listCreationType() {
            return this.listCreationType;
        }

        public String listName() {
            return this.listName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.Item.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Item.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Item.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Item.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Item.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], Item.this.entityTypeInList);
                    responseWriter.writeString(responseFieldArr[4], Item.this.entityListType.name());
                    responseWriter.writeString(responseFieldArr[5], Item.this.listName);
                    responseWriter.writeString(responseFieldArr[6], Item.this.description);
                    ResponseField responseField = responseFieldArr[7];
                    EntityListStatus entityListStatus = Item.this.status;
                    responseWriter.writeString(responseField, entityListStatus != null ? entityListStatus.name() : null);
                    responseWriter.writeInt(responseFieldArr[8], Item.this.successfulCount);
                    responseWriter.writeInt(responseFieldArr[9], Item.this.duplicateCount);
                    responseWriter.writeInt(responseFieldArr[10], Item.this.invalidNumbersCount);
                    responseWriter.writeInt(responseFieldArr[11], Item.this.invalidEmailCount);
                    responseWriter.writeInt(responseFieldArr[12], Item.this.doNotTrackCount);
                    responseWriter.writeInt(responseFieldArr[13], Item.this.otherFailedCount);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], Item.this.ownerId);
                    responseWriter.writeString(responseFieldArr[15], Item.this.listCreationType.name());
                    responseWriter.writeString(responseFieldArr[16], Item.this.listCategory);
                    responseWriter.writeString(responseFieldArr[17], Item.this.rawBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[18], Item.this.rawBulkUploadFileHash);
                    responseWriter.writeString(responseFieldArr[19], Item.this.modifiedBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[20], Item.this.finalBulkUploadFileRef);
                    responseWriter.writeString(responseFieldArr[21], Item.this.leadSourceForBulkUpload);
                    responseWriter.writeString(responseFieldArr[22], Item.this.defaultCountryCode);
                    responseWriter.writeString(responseFieldArr[23], Item.this.defaultCountryIso);
                    responseWriter.writeString(responseFieldArr[24], Item.this.notificationBody);
                    responseWriter.writeString(responseFieldArr[25], Item.this.rule);
                    ResponseField responseField2 = responseFieldArr[26];
                    ContactAssignmentStatus contactAssignmentStatus = Item.this.toBeAssigned;
                    responseWriter.writeString(responseField2, contactAssignmentStatus != null ? contactAssignmentStatus.name() : null);
                    responseWriter.writeString(responseFieldArr[27], Item.this.assignedUserId);
                    responseWriter.writeString(responseFieldArr[28], Item.this.assignedTeamId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[29], Item.this.associatedDistributionId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[30], Item.this.entityActionDefinitionReference);
                    responseWriter.writeBoolean(responseFieldArr[31], Item.this.redistributeEntities);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[32], Item.this.redistributionRequestedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[33], Item.this.dupliacteLeadList);
                    responseWriter.writeList(responseFieldArr[34], Item.this.tags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.Item.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeString(responseFieldArr[35], Item.this.chatMessagePlatform);
                    responseWriter.writeBoolean(responseFieldArr[36], Item.this.allowMultiple);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[37], Item.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[38], Item.this.updatedAt);
                }
            };
        }

        public String modifiedBulkUploadFileRef() {
            return this.modifiedBulkUploadFileRef;
        }

        public String notificationBody() {
            return this.notificationBody;
        }

        public Integer otherFailedCount() {
            return this.otherFailedCount;
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String rawBulkUploadFileHash() {
            return this.rawBulkUploadFileHash;
        }

        public String rawBulkUploadFileRef() {
            return this.rawBulkUploadFileRef;
        }

        public Boolean redistributeEntities() {
            return this.redistributeEntities;
        }

        public String redistributionRequestedAt() {
            return this.redistributionRequestedAt;
        }

        public String rule() {
            return this.rule;
        }

        public EntityListStatus status() {
            return this.status;
        }

        public Integer successfulCount() {
            return this.successfulCount;
        }

        public List<String> tags() {
            return this.tags;
        }

        public ContactAssignmentStatus toBeAssigned() {
            return this.toBeAssigned;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Item{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", entityTypeInList=" + this.entityTypeInList + ", entityListType=" + this.entityListType + ", listName=" + this.listName + ", description=" + this.description + ", status=" + this.status + ", successfulCount=" + this.successfulCount + ", duplicateCount=" + this.duplicateCount + ", invalidNumbersCount=" + this.invalidNumbersCount + ", invalidEmailCount=" + this.invalidEmailCount + ", doNotTrackCount=" + this.doNotTrackCount + ", otherFailedCount=" + this.otherFailedCount + ", ownerId=" + this.ownerId + ", listCreationType=" + this.listCreationType + ", listCategory=" + this.listCategory + ", rawBulkUploadFileRef=" + this.rawBulkUploadFileRef + ", rawBulkUploadFileHash=" + this.rawBulkUploadFileHash + ", modifiedBulkUploadFileRef=" + this.modifiedBulkUploadFileRef + ", finalBulkUploadFileRef=" + this.finalBulkUploadFileRef + ", leadSourceForBulkUpload=" + this.leadSourceForBulkUpload + ", defaultCountryCode=" + this.defaultCountryCode + ", defaultCountryIso=" + this.defaultCountryIso + ", notificationBody=" + this.notificationBody + ", rule=" + this.rule + ", toBeAssigned=" + this.toBeAssigned + ", assignedUserId=" + this.assignedUserId + ", assignedTeamId=" + this.assignedTeamId + ", associatedDistributionId=" + this.associatedDistributionId + ", entityActionDefinitionReference=" + this.entityActionDefinitionReference + ", redistributeEntities=" + this.redistributeEntities + ", redistributionRequestedAt=" + this.redistributionRequestedAt + ", dupliacteLeadList=" + this.dupliacteLeadList + ", tags=" + this.tags + ", chatMessagePlatform=" + this.chatMessagePlatform + ", allowMultiple=" + this.allowMultiple + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class SearchEntityLists {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forList("items", "items", null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList()), ResponseField.forInt("total", "total", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final List<Item> items;
        final String nextToken;
        final Integer total;

        public static final class Mapper implements ResponseFieldMapper<SearchEntityLists> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public SearchEntityLists map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = SearchEntityLists.$responseFields;
                return new SearchEntityLists(responseReader.readString(responseFieldArr[0]), responseReader.readList(responseFieldArr[1], new ResponseReader.ListReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.SearchEntityLists.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Item read(ResponseReader.ListItemReader listItemReader) {
                        return (Item) listItemReader.readObject(new ResponseReader.ObjectReader<Item>() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.SearchEntityLists.Mapper.1.1
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

        public SearchEntityLists(String str, List<Item> list, String str2, Integer num) {
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
            if (!(obj instanceof SearchEntityLists)) {
                return false;
            }
            SearchEntityLists searchEntityLists = (SearchEntityLists) obj;
            if (this.__typename.equals(searchEntityLists.__typename) && this.items.equals(searchEntityLists.items) && ((str = this.nextToken) != null ? str.equals(searchEntityLists.nextToken) : searchEntityLists.nextToken == null)) {
                Integer num = this.total;
                Integer num2 = searchEntityLists.total;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.SearchEntityLists.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = SearchEntityLists.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], SearchEntityLists.this.__typename);
                    responseWriter.writeList(responseFieldArr[1], SearchEntityLists.this.items, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.SearchEntityLists.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Item) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[2], SearchEntityLists.this.nextToken);
                    responseWriter.writeInt(responseFieldArr[3], SearchEntityLists.this.total);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SearchEntityLists{__typename=" + this.__typename + ", items=" + this.items + ", nextToken=" + this.nextToken + ", total=" + this.total + "}";
            }
            return this.$toString;
        }

        public Integer total() {
            return this.total;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final SearchableEntityListFilterInput filter;
        private final Integer from;
        private final Integer limit;
        private final String nextToken;
        private final SearchableEntityListSortInput sort;
        private final transient Map<String, Object> valueMap;

        public Variables(SearchableEntityListFilterInput searchableEntityListFilterInput, SearchableEntityListSortInput searchableEntityListSortInput, Integer num, String str, Integer num2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.filter = searchableEntityListFilterInput;
            this.sort = searchableEntityListSortInput;
            this.limit = num;
            this.nextToken = str;
            this.from = num2;
            linkedHashMap.put("filter", searchableEntityListFilterInput);
            linkedHashMap.put("sort", searchableEntityListSortInput);
            linkedHashMap.put("limit", num);
            linkedHashMap.put(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, str);
            linkedHashMap.put(Constants.MessagePayloadKeys.FROM, num2);
        }

        public SearchableEntityListFilterInput filter() {
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.SearchEntityListsQuery.Variables.1
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

        public SearchableEntityListSortInput sort() {
            return this.sort;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public SearchEntityListsQuery(SearchableEntityListFilterInput searchableEntityListFilterInput, SearchableEntityListSortInput searchableEntityListSortInput, Integer num, String str, Integer num2) {
        this.variables = new Variables(searchableEntityListFilterInput, searchableEntityListSortInput, num, str, num2);
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
        return "b86fe58782bc328cd7a12798f805f7ca113595d24d9d3cd34d0895fcaa2aa618";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query SearchEntityLists($filter: SearchableEntityListFilterInput, $sort: SearchableEntityListSortInput, $limit: Int, $nextToken: String, $from: Int) {\n  searchEntityLists(filter: $filter, sort: $sort, limit: $limit, nextToken: $nextToken, from: $from) {\n    __typename\n    items {\n      __typename\n      id\n      accountId\n      entityTypeInList\n      entityListType\n      listName\n      description\n      status\n      successfulCount\n      duplicateCount\n      invalidNumbersCount\n      invalidEmailCount\n      doNotTrackCount\n      otherFailedCount\n      ownerId\n      listCreationType\n      listCategory\n      rawBulkUploadFileRef\n      rawBulkUploadFileHash\n      modifiedBulkUploadFileRef\n      finalBulkUploadFileRef\n      leadSourceForBulkUpload\n      defaultCountryCode\n      defaultCountryIso\n      notificationBody\n      rule\n      toBeAssigned\n      assignedUserId\n      assignedTeamId\n      associatedDistributionId\n      entityActionDefinitionReference\n      redistributeEntities\n      redistributionRequestedAt\n      dupliacteLeadList\n      tags\n      chatMessagePlatform\n      allowMultiple\n      createdAt\n      updatedAt\n    }\n    nextToken\n    total\n  }\n}";
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
