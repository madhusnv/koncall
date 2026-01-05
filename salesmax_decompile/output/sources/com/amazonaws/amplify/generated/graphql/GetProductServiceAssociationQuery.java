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
public final class GetProductServiceAssociationQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetProductServiceAssociation($id: ID!) {\n  getProductServiceAssociation(id: $id) {\n    __typename\n    id\n    productId\n    accountId\n    contactId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceAssociationQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetProductServiceAssociation";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetProductServiceAssociation($id: ID!) {\n  getProductServiceAssociation(id: $id) {\n    __typename\n    id\n    productId\n    accountId\n    contactId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetProductServiceAssociationQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetProductServiceAssociationQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getProductServiceAssociation", "getProductServiceAssociation", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetProductServiceAssociation getProductServiceAssociation;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetProductServiceAssociation.Mapper getProductServiceAssociationFieldMapper = new GetProductServiceAssociation.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetProductServiceAssociation) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetProductServiceAssociation>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceAssociationQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetProductServiceAssociation read(ResponseReader responseReader2) {
                        return Mapper.this.getProductServiceAssociationFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetProductServiceAssociation getProductServiceAssociation) {
            this.getProductServiceAssociation = getProductServiceAssociation;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetProductServiceAssociation getProductServiceAssociation = this.getProductServiceAssociation;
            GetProductServiceAssociation getProductServiceAssociation2 = ((Data) obj).getProductServiceAssociation;
            return getProductServiceAssociation == null ? getProductServiceAssociation2 == null : getProductServiceAssociation.equals(getProductServiceAssociation2);
        }

        public GetProductServiceAssociation getProductServiceAssociation() {
            return this.getProductServiceAssociation;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetProductServiceAssociation getProductServiceAssociation = this.getProductServiceAssociation;
                this.$hashCode = (getProductServiceAssociation == null ? 0 : getProductServiceAssociation.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceAssociationQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetProductServiceAssociation getProductServiceAssociation = Data.this.getProductServiceAssociation;
                    responseWriter.writeObject(responseField, getProductServiceAssociation != null ? getProductServiceAssociation.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getProductServiceAssociation=" + this.getProductServiceAssociation + "}";
            }
            return this.$toString;
        }
    }

    public static class GetProductServiceAssociation {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String contactId;
        final String createdAt;
        final String createdById;
        final String id;
        final String productId;
        final String updatedAt;
        final String updatedById;

        public static final class Mapper implements ResponseFieldMapper<GetProductServiceAssociation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetProductServiceAssociation map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetProductServiceAssociation.$responseFields;
                return new GetProductServiceAssociation(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("productId", "productId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("contactId", "contactId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList())};
        }

        public GetProductServiceAssociation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.productId = (String) Utils.checkNotNull(str3, "productId == null");
            this.accountId = (String) Utils.checkNotNull(str4, "accountId == null");
            this.contactId = str5;
            this.createdAt = str6;
            this.updatedAt = str7;
            this.createdById = str8;
            this.updatedById = str9;
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

        public String createdAt() {
            return this.createdAt;
        }

        public String createdById() {
            return this.createdById;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetProductServiceAssociation)) {
                return false;
            }
            GetProductServiceAssociation getProductServiceAssociation = (GetProductServiceAssociation) obj;
            if (this.__typename.equals(getProductServiceAssociation.__typename) && this.id.equals(getProductServiceAssociation.id) && this.productId.equals(getProductServiceAssociation.productId) && this.accountId.equals(getProductServiceAssociation.accountId) && ((str = this.contactId) != null ? str.equals(getProductServiceAssociation.contactId) : getProductServiceAssociation.contactId == null) && ((str2 = this.createdAt) != null ? str2.equals(getProductServiceAssociation.createdAt) : getProductServiceAssociation.createdAt == null) && ((str3 = this.updatedAt) != null ? str3.equals(getProductServiceAssociation.updatedAt) : getProductServiceAssociation.updatedAt == null) && ((str4 = this.createdById) != null ? str4.equals(getProductServiceAssociation.createdById) : getProductServiceAssociation.createdById == null)) {
                String str5 = this.updatedById;
                String str6 = getProductServiceAssociation.updatedById;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.contactId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.createdAt;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdById;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedById;
                this.$hashCode = iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceAssociationQuery.GetProductServiceAssociation.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetProductServiceAssociation.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetProductServiceAssociation.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetProductServiceAssociation.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetProductServiceAssociation.this.productId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], GetProductServiceAssociation.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], GetProductServiceAssociation.this.contactId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], GetProductServiceAssociation.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], GetProductServiceAssociation.this.updatedAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], GetProductServiceAssociation.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], GetProductServiceAssociation.this.updatedById);
                }
            };
        }

        public String productId() {
            return this.productId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetProductServiceAssociation{__typename=" + this.__typename + ", id=" + this.id + ", productId=" + this.productId + ", accountId=" + this.accountId + ", contactId=" + this.contactId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", createdById=" + this.createdById + ", updatedById=" + this.updatedById + "}";
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceAssociationQuery.Variables.1
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

    public GetProductServiceAssociationQuery(String str) {
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
        return "95bd0df3027b59cef80c0cdaf558071aa10d533a1dc79d0c74f142c7775be328";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetProductServiceAssociation($id: ID!) {\n  getProductServiceAssociation(id: $id) {\n    __typename\n    id\n    productId\n    accountId\n    contactId\n    createdAt\n    updatedAt\n    createdById\n    updatedById\n  }\n}";
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
