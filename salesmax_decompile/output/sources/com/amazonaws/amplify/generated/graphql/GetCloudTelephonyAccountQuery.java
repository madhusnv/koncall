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
import java.util.Map;
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetCloudTelephonyAccountQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetCloudTelephonyAccount($id: ID!) {\n  getCloudTelephonyAccount(id: $id) {\n    __typename\n    id\n    accountId\n    providerName\n    telephonyNumber\n    providerAccountId\n    displayNumber\n    hasOutbound\n    createNewLead\n    accessToken\n    cloudTelephonySubdomain\n    cloudTelephonyAccountSid\n    createdAt\n    updatedAt\n    entityListId\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetCloudTelephonyAccountQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetCloudTelephonyAccount";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetCloudTelephonyAccount($id: ID!) {\n  getCloudTelephonyAccount(id: $id) {\n    __typename\n    id\n    accountId\n    providerName\n    telephonyNumber\n    providerAccountId\n    displayNumber\n    hasOutbound\n    createNewLead\n    accessToken\n    cloudTelephonySubdomain\n    cloudTelephonyAccountSid\n    createdAt\n    updatedAt\n    entityListId\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetCloudTelephonyAccountQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetCloudTelephonyAccountQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getCloudTelephonyAccount", "getCloudTelephonyAccount", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetCloudTelephonyAccount getCloudTelephonyAccount;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetCloudTelephonyAccount.Mapper getCloudTelephonyAccountFieldMapper = new GetCloudTelephonyAccount.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetCloudTelephonyAccount) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetCloudTelephonyAccount>() { // from class: com.amazonaws.amplify.generated.graphql.GetCloudTelephonyAccountQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetCloudTelephonyAccount read(ResponseReader responseReader2) {
                        return Mapper.this.getCloudTelephonyAccountFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetCloudTelephonyAccount getCloudTelephonyAccount) {
            this.getCloudTelephonyAccount = getCloudTelephonyAccount;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetCloudTelephonyAccount getCloudTelephonyAccount = this.getCloudTelephonyAccount;
            GetCloudTelephonyAccount getCloudTelephonyAccount2 = ((Data) obj).getCloudTelephonyAccount;
            return getCloudTelephonyAccount == null ? getCloudTelephonyAccount2 == null : getCloudTelephonyAccount.equals(getCloudTelephonyAccount2);
        }

        public GetCloudTelephonyAccount getCloudTelephonyAccount() {
            return this.getCloudTelephonyAccount;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetCloudTelephonyAccount getCloudTelephonyAccount = this.getCloudTelephonyAccount;
                this.$hashCode = (getCloudTelephonyAccount == null ? 0 : getCloudTelephonyAccount.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCloudTelephonyAccountQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetCloudTelephonyAccount getCloudTelephonyAccount = Data.this.getCloudTelephonyAccount;
                    responseWriter.writeObject(responseField, getCloudTelephonyAccount != null ? getCloudTelephonyAccount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getCloudTelephonyAccount=" + this.getCloudTelephonyAccount + "}";
            }
            return this.$toString;
        }
    }

    public static class GetCloudTelephonyAccount {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accessToken;
        final String accountId;
        final String cloudTelephonyAccountSid;
        final String cloudTelephonySubdomain;
        final Boolean createNewLead;
        final String createdAt;
        final String createdById;
        final String displayNumber;
        final String entityListId;
        final Boolean hasOutbound;
        final String id;
        final String providerAccountId;
        final String providerName;
        final String telephonyNumber;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<GetCloudTelephonyAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetCloudTelephonyAccount map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetCloudTelephonyAccount.$responseFields;
                return new GetCloudTelephonyAccount(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readBoolean(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("providerName", "providerName", null, false, Collections.emptyList()), ResponseField.forString("telephonyNumber", "telephonyNumber", null, true, Collections.emptyList()), ResponseField.forString("providerAccountId", "providerAccountId", null, true, Collections.emptyList()), ResponseField.forString("displayNumber", "displayNumber", null, true, Collections.emptyList()), ResponseField.forBoolean("hasOutbound", "hasOutbound", null, true, Collections.emptyList()), ResponseField.forBoolean("createNewLead", "createNewLead", null, true, Collections.emptyList()), ResponseField.forString("accessToken", "accessToken", null, true, Collections.emptyList()), ResponseField.forString("cloudTelephonySubdomain", "cloudTelephonySubdomain", null, true, Collections.emptyList()), ResponseField.forString("cloudTelephonyAccountSid", "cloudTelephonyAccountSid", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("entityListId", "entityListId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public GetCloudTelephonyAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.providerName = (String) Utils.checkNotNull(str4, "providerName == null");
            this.telephonyNumber = str5;
            this.providerAccountId = str6;
            this.displayNumber = str7;
            this.hasOutbound = bool;
            this.createNewLead = bool2;
            this.accessToken = str8;
            this.cloudTelephonySubdomain = str9;
            this.cloudTelephonyAccountSid = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
            this.entityListId = str13;
            this.createdById = str14;
            this.updatedById = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accessToken() {
            return this.accessToken;
        }

        public String accountId() {
            return this.accountId;
        }

        public String cloudTelephonyAccountSid() {
            return this.cloudTelephonyAccountSid;
        }

        public String cloudTelephonySubdomain() {
            return this.cloudTelephonySubdomain;
        }

        public Boolean createNewLead() {
            return this.createNewLead;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public String displayNumber() {
            return this.displayNumber;
        }

        public String entityListId() {
            return this.entityListId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Boolean bool;
            Boolean bool2;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetCloudTelephonyAccount)) {
                return false;
            }
            GetCloudTelephonyAccount getCloudTelephonyAccount = (GetCloudTelephonyAccount) obj;
            if (this.__typename.equals(getCloudTelephonyAccount.__typename) && this.id.equals(getCloudTelephonyAccount.id) && this.accountId.equals(getCloudTelephonyAccount.accountId) && this.providerName.equals(getCloudTelephonyAccount.providerName) && ((str = this.telephonyNumber) != null ? str.equals(getCloudTelephonyAccount.telephonyNumber) : getCloudTelephonyAccount.telephonyNumber == null) && ((str2 = this.providerAccountId) != null ? str2.equals(getCloudTelephonyAccount.providerAccountId) : getCloudTelephonyAccount.providerAccountId == null) && ((str3 = this.displayNumber) != null ? str3.equals(getCloudTelephonyAccount.displayNumber) : getCloudTelephonyAccount.displayNumber == null) && ((bool = this.hasOutbound) != null ? bool.equals(getCloudTelephonyAccount.hasOutbound) : getCloudTelephonyAccount.hasOutbound == null) && ((bool2 = this.createNewLead) != null ? bool2.equals(getCloudTelephonyAccount.createNewLead) : getCloudTelephonyAccount.createNewLead == null) && ((str4 = this.accessToken) != null ? str4.equals(getCloudTelephonyAccount.accessToken) : getCloudTelephonyAccount.accessToken == null) && ((str5 = this.cloudTelephonySubdomain) != null ? str5.equals(getCloudTelephonyAccount.cloudTelephonySubdomain) : getCloudTelephonyAccount.cloudTelephonySubdomain == null) && ((str6 = this.cloudTelephonyAccountSid) != null ? str6.equals(getCloudTelephonyAccount.cloudTelephonyAccountSid) : getCloudTelephonyAccount.cloudTelephonyAccountSid == null) && ((str7 = this.createdAt) != null ? str7.equals(getCloudTelephonyAccount.createdAt) : getCloudTelephonyAccount.createdAt == null) && ((str8 = this.updatedAt) != null ? str8.equals(getCloudTelephonyAccount.updatedAt) : getCloudTelephonyAccount.updatedAt == null) && ((str9 = this.entityListId) != null ? str9.equals(getCloudTelephonyAccount.entityListId) : getCloudTelephonyAccount.entityListId == null) && ((str10 = this.createdById) != null ? str10.equals(getCloudTelephonyAccount.createdById) : getCloudTelephonyAccount.createdById == null)) {
                String str11 = this.updatedById;
                String str12 = getCloudTelephonyAccount.updatedById;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public Boolean hasOutbound() {
            return this.hasOutbound;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.providerName.hashCode()) * 1000003;
                String str = this.telephonyNumber;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.providerAccountId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.displayNumber;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool = this.hasOutbound;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.createNewLead;
                int iHashCode6 = (iHashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str4 = this.accessToken;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.cloudTelephonySubdomain;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.cloudTelephonyAccountSid;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.updatedAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.entityListId;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdById;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedById;
                this.$hashCode = iHashCode13 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCloudTelephonyAccountQuery.GetCloudTelephonyAccount.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetCloudTelephonyAccount.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetCloudTelephonyAccount.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetCloudTelephonyAccount.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetCloudTelephonyAccount.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], GetCloudTelephonyAccount.this.providerName);
                    responseWriter.writeString(responseFieldArr[4], GetCloudTelephonyAccount.this.telephonyNumber);
                    responseWriter.writeString(responseFieldArr[5], GetCloudTelephonyAccount.this.providerAccountId);
                    responseWriter.writeString(responseFieldArr[6], GetCloudTelephonyAccount.this.displayNumber);
                    responseWriter.writeBoolean(responseFieldArr[7], GetCloudTelephonyAccount.this.hasOutbound);
                    responseWriter.writeBoolean(responseFieldArr[8], GetCloudTelephonyAccount.this.createNewLead);
                    responseWriter.writeString(responseFieldArr[9], GetCloudTelephonyAccount.this.accessToken);
                    responseWriter.writeString(responseFieldArr[10], GetCloudTelephonyAccount.this.cloudTelephonySubdomain);
                    responseWriter.writeString(responseFieldArr[11], GetCloudTelephonyAccount.this.cloudTelephonyAccountSid);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], GetCloudTelephonyAccount.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], GetCloudTelephonyAccount.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], GetCloudTelephonyAccount.this.entityListId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], GetCloudTelephonyAccount.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], GetCloudTelephonyAccount.this.updatedById);
                }
            };
        }

        public String providerAccountId() {
            return this.providerAccountId;
        }

        public String providerName() {
            return this.providerName;
        }

        public String telephonyNumber() {
            return this.telephonyNumber;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetCloudTelephonyAccount{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", providerName=" + this.providerName + ", telephonyNumber=" + this.telephonyNumber + ", providerAccountId=" + this.providerAccountId + ", displayNumber=" + this.displayNumber + ", hasOutbound=" + this.hasOutbound + ", createNewLead=" + this.createNewLead + ", accessToken=" + this.accessToken + ", cloudTelephonySubdomain=" + this.cloudTelephonySubdomain + ", cloudTelephonyAccountSid=" + this.cloudTelephonyAccountSid + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", entityListId=" + this.entityListId + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedById() {
            return this.updatedById;
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCloudTelephonyAccountQuery.Variables.1
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

    public GetCloudTelephonyAccountQuery(String str) {
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
        return "c879b901bc47e010531599c589e8b70328b7c6a75aa625c944ada033d86bd369";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetCloudTelephonyAccount($id: ID!) {\n  getCloudTelephonyAccount(id: $id) {\n    __typename\n    id\n    accountId\n    providerName\n    telephonyNumber\n    providerAccountId\n    displayNumber\n    hasOutbound\n    createNewLead\n    accessToken\n    cloudTelephonySubdomain\n    cloudTelephonyAccountSid\n    createdAt\n    updatedAt\n    entityListId\n    createdById\n    updatedById\n  }\n}";
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
