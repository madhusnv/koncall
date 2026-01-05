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
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomType;
import type.ProductServiceType;

/* loaded from: classes7.dex */
public final class GetProductServiceQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetProductService($id: ID!) {\n  getProductService(id: $id) {\n    __typename\n    id\n    accountId\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    startDate\n    endDate\n    isArchived\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    childProductss {\n      __typename\n      nextToken\n    }\n    linkedProductFiles {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetProductService";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetProductService($id: ID!) {\n  getProductService(id: $id) {\n    __typename\n    id\n    accountId\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    startDate\n    endDate\n    isArchived\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    childProductss {\n      __typename\n      nextToken\n    }\n    linkedProductFiles {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetProductServiceQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetProductServiceQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class ChildProductss {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<ChildProductss> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ChildProductss map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ChildProductss.$responseFields;
                return new ChildProductss(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public ChildProductss(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChildProductss)) {
                return false;
            }
            ChildProductss childProductss = (ChildProductss) obj;
            if (this.__typename.equals(childProductss.__typename)) {
                String str = this.nextToken;
                String str2 = childProductss.nextToken;
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
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.ChildProductss.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ChildProductss.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ChildProductss.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ChildProductss.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ChildProductss{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getProductService", "getProductService", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetProductService getProductService;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetProductService.Mapper getProductServiceFieldMapper = new GetProductService.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetProductService) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetProductService>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetProductService read(ResponseReader responseReader2) {
                        return Mapper.this.getProductServiceFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetProductService getProductService) {
            this.getProductService = getProductService;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetProductService getProductService = this.getProductService;
            GetProductService getProductService2 = ((Data) obj).getProductService;
            return getProductService == null ? getProductService2 == null : getProductService.equals(getProductService2);
        }

        public GetProductService getProductService() {
            return this.getProductService;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetProductService getProductService = this.getProductService;
                this.$hashCode = (getProductService == null ? 0 : getProductService.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetProductService getProductService = Data.this.getProductService;
                    responseWriter.writeObject(responseField, getProductService != null ? getProductService.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getProductService=" + this.getProductService + "}";
            }
            return this.$toString;
        }
    }

    public static class ExternalReference {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("externalReferenceId", "externalReferenceId", null, false, Collections.emptyList()), ResponseField.forString("externalReferenceIdSource", "externalReferenceIdSource", null, false, Collections.emptyList()), ResponseField.forCustomType("externalReferenceSourceDate", "externalReferenceSourceDate", null, true, CustomType.AWSDATETIME, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String externalReferenceId;
        final String externalReferenceIdSource;
        final String externalReferenceSourceDate;

        public static final class Mapper implements ResponseFieldMapper<ExternalReference> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ExternalReference map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ExternalReference.$responseFields;
                return new ExternalReference(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]));
            }
        }

        public ExternalReference(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.externalReferenceId = (String) Utils.checkNotNull(str2, "externalReferenceId == null");
            this.externalReferenceIdSource = (String) Utils.checkNotNull(str3, "externalReferenceIdSource == null");
            this.externalReferenceSourceDate = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExternalReference)) {
                return false;
            }
            ExternalReference externalReference = (ExternalReference) obj;
            if (this.__typename.equals(externalReference.__typename) && this.externalReferenceId.equals(externalReference.externalReferenceId) && this.externalReferenceIdSource.equals(externalReference.externalReferenceIdSource)) {
                String str = this.externalReferenceSourceDate;
                String str2 = externalReference.externalReferenceSourceDate;
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

        public String externalReferenceId() {
            return this.externalReferenceId;
        }

        public String externalReferenceIdSource() {
            return this.externalReferenceIdSource;
        }

        public String externalReferenceSourceDate() {
            return this.externalReferenceSourceDate;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.externalReferenceId.hashCode()) * 1000003) ^ this.externalReferenceIdSource.hashCode()) * 1000003;
                String str = this.externalReferenceSourceDate;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.ExternalReference.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ExternalReference.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ExternalReference.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], ExternalReference.this.externalReferenceId);
                    responseWriter.writeString(responseFieldArr[2], ExternalReference.this.externalReferenceIdSource);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], ExternalReference.this.externalReferenceSourceDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ExternalReference{__typename=" + this.__typename + ", externalReferenceId=" + this.externalReferenceId + ", externalReferenceIdSource=" + this.externalReferenceIdSource + ", externalReferenceSourceDate=" + this.externalReferenceSourceDate + "}";
            }
            return this.$toString;
        }
    }

    public static class GetProductService {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final ChildProductss childProductss;
        final String createdAt;
        final String createdBy;
        final String currency;
        final String description;
        final String endDate;
        final List<ExternalReference> externalReference;
        final String hsCode;
        final String id;
        final Integer incrementBy;
        final Boolean isArchived;
        final LinkedProductFiles linkedProductFiles;
        final String measurementUnit;
        final String name;
        final ParentProduct parentProduct;
        final String parentProductId;
        final String productPicture;
        final String skuCode;
        final String standardPricePerUnit;
        final String startDate;

        /* renamed from: type, reason: collision with root package name */
        final ProductServiceType f58071type;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<GetProductService> {
            final ExternalReference.Mapper externalReferenceFieldMapper = new ExternalReference.Mapper();
            final ParentProduct.Mapper parentProductFieldMapper = new ParentProduct.Mapper();
            final ChildProductss.Mapper childProductssFieldMapper = new ChildProductss.Mapper();
            final LinkedProductFiles.Mapper linkedProductFilesFieldMapper = new LinkedProductFiles.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetProductService map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetProductService.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                List list = responseReader.readList(responseFieldArr[3], new ResponseReader.ListReader<ExternalReference>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.GetProductService.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ExternalReference read(ResponseReader.ListItemReader listItemReader) {
                        return (ExternalReference) listItemReader.readObject(new ResponseReader.ObjectReader<ExternalReference>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.GetProductService.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public ExternalReference read(ResponseReader responseReader2) {
                                return Mapper.this.externalReferenceFieldMapper.map(responseReader2);
                            }
                        });
                    }
                });
                String string2 = responseReader.readString(responseFieldArr[4]);
                String string3 = responseReader.readString(responseFieldArr[5]);
                String string4 = responseReader.readString(responseFieldArr[6]);
                return new GetProductService(string, str, str2, list, string2, string3, string4 != null ? ProductServiceType.valueOf(string4) : null, responseReader.readString(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readBoolean(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (ParentProduct) responseReader.readObject(responseFieldArr[22], new ResponseReader.ObjectReader<ParentProduct>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.GetProductService.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ParentProduct read(ResponseReader responseReader2) {
                        return Mapper.this.parentProductFieldMapper.map(responseReader2);
                    }
                }), (ChildProductss) responseReader.readObject(responseFieldArr[23], new ResponseReader.ObjectReader<ChildProductss>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.GetProductService.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChildProductss read(ResponseReader responseReader2) {
                        return Mapper.this.childProductssFieldMapper.map(responseReader2);
                    }
                }), (LinkedProductFiles) responseReader.readObject(responseFieldArr[24], new ResponseReader.ObjectReader<LinkedProductFiles>() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.GetProductService.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public LinkedProductFiles read(ResponseReader responseReader2) {
                        return Mapper.this.linkedProductFilesFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forList("externalReference", "externalReference", null, true, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("measurementUnit", "measurementUnit", null, true, Collections.emptyList()), ResponseField.forInt("incrementBy", "incrementBy", null, true, Collections.emptyList()), ResponseField.forString("hsCode", "hsCode", null, true, Collections.emptyList()), ResponseField.forString("skuCode", "skuCode", null, true, Collections.emptyList()), ResponseField.forString("standardPricePerUnit", "standardPricePerUnit", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("parentProductId", "parentProductId", null, true, customType, Collections.emptyList()), ResponseField.forString("productPicture", "productPicture", null, true, Collections.emptyList()), ResponseField.forCustomType("startDate", "startDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDate", "endDate", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("parentProduct", "parentProduct", null, true, Collections.emptyList()), ResponseField.forObject("childProductss", "childProductss", null, true, Collections.emptyList()), ResponseField.forObject("linkedProductFiles", "linkedProductFiles", null, true, Collections.emptyList())};
        }

        public GetProductService(String str, String str2, String str3, List<ExternalReference> list, String str4, String str5, ProductServiceType productServiceType, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, String str17, String str18, ParentProduct parentProduct, ChildProductss childProductss, LinkedProductFiles linkedProductFiles) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.externalReference = list;
            this.name = str4;
            this.description = str5;
            this.f58071type = productServiceType;
            this.measurementUnit = str6;
            this.incrementBy = num;
            this.hsCode = str7;
            this.skuCode = str8;
            this.standardPricePerUnit = str9;
            this.currency = str10;
            this.parentProductId = str11;
            this.productPicture = str12;
            this.startDate = str13;
            this.endDate = str14;
            this.isArchived = bool;
            this.createdBy = str15;
            this.updatedBy = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
            this.parentProduct = parentProduct;
            this.childProductss = childProductss;
            this.linkedProductFiles = linkedProductFiles;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public ChildProductss childProductss() {
            return this.childProductss;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public String currency() {
            return this.currency;
        }

        public String description() {
            return this.description;
        }

        public String endDate() {
            return this.endDate;
        }

        public boolean equals(Object obj) {
            List<ExternalReference> list;
            String str;
            String str2;
            ProductServiceType productServiceType;
            String str3;
            Integer num;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            Boolean bool;
            String str12;
            String str13;
            String str14;
            String str15;
            ParentProduct parentProduct;
            ChildProductss childProductss;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetProductService)) {
                return false;
            }
            GetProductService getProductService = (GetProductService) obj;
            if (this.__typename.equals(getProductService.__typename) && this.id.equals(getProductService.id) && this.accountId.equals(getProductService.accountId) && ((list = this.externalReference) != null ? list.equals(getProductService.externalReference) : getProductService.externalReference == null) && ((str = this.name) != null ? str.equals(getProductService.name) : getProductService.name == null) && ((str2 = this.description) != null ? str2.equals(getProductService.description) : getProductService.description == null) && ((productServiceType = this.f58071type) != null ? productServiceType.equals(getProductService.f58071type) : getProductService.f58071type == null) && ((str3 = this.measurementUnit) != null ? str3.equals(getProductService.measurementUnit) : getProductService.measurementUnit == null) && ((num = this.incrementBy) != null ? num.equals(getProductService.incrementBy) : getProductService.incrementBy == null) && ((str4 = this.hsCode) != null ? str4.equals(getProductService.hsCode) : getProductService.hsCode == null) && ((str5 = this.skuCode) != null ? str5.equals(getProductService.skuCode) : getProductService.skuCode == null) && ((str6 = this.standardPricePerUnit) != null ? str6.equals(getProductService.standardPricePerUnit) : getProductService.standardPricePerUnit == null) && ((str7 = this.currency) != null ? str7.equals(getProductService.currency) : getProductService.currency == null) && ((str8 = this.parentProductId) != null ? str8.equals(getProductService.parentProductId) : getProductService.parentProductId == null) && ((str9 = this.productPicture) != null ? str9.equals(getProductService.productPicture) : getProductService.productPicture == null) && ((str10 = this.startDate) != null ? str10.equals(getProductService.startDate) : getProductService.startDate == null) && ((str11 = this.endDate) != null ? str11.equals(getProductService.endDate) : getProductService.endDate == null) && ((bool = this.isArchived) != null ? bool.equals(getProductService.isArchived) : getProductService.isArchived == null) && ((str12 = this.createdBy) != null ? str12.equals(getProductService.createdBy) : getProductService.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(getProductService.updatedBy) : getProductService.updatedBy == null) && ((str14 = this.createdAt) != null ? str14.equals(getProductService.createdAt) : getProductService.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(getProductService.updatedAt) : getProductService.updatedAt == null) && ((parentProduct = this.parentProduct) != null ? parentProduct.equals(getProductService.parentProduct) : getProductService.parentProduct == null) && ((childProductss = this.childProductss) != null ? childProductss.equals(getProductService.childProductss) : getProductService.childProductss == null)) {
                LinkedProductFiles linkedProductFiles = this.linkedProductFiles;
                LinkedProductFiles linkedProductFiles2 = getProductService.linkedProductFiles;
                if (linkedProductFiles == null) {
                    if (linkedProductFiles2 == null) {
                        return true;
                    }
                } else if (linkedProductFiles.equals(linkedProductFiles2)) {
                    return true;
                }
            }
            return false;
        }

        public List<ExternalReference> externalReference() {
            return this.externalReference;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                List<ExternalReference> list = this.externalReference;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.name;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                ProductServiceType productServiceType = this.f58071type;
                int iHashCode5 = (iHashCode4 ^ (productServiceType == null ? 0 : productServiceType.hashCode())) * 1000003;
                String str3 = this.measurementUnit;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.incrementBy;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str4 = this.hsCode;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.skuCode;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.standardPricePerUnit;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.currency;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.parentProductId;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.productPicture;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.startDate;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.endDate;
                int iHashCode15 = (iHashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.isArchived;
                int iHashCode16 = (iHashCode15 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str12 = this.createdBy;
                int iHashCode17 = (iHashCode16 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedBy;
                int iHashCode18 = (iHashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode19 = (iHashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                int iHashCode20 = (iHashCode19 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                ParentProduct parentProduct = this.parentProduct;
                int iHashCode21 = (iHashCode20 ^ (parentProduct == null ? 0 : parentProduct.hashCode())) * 1000003;
                ChildProductss childProductss = this.childProductss;
                int iHashCode22 = (iHashCode21 ^ (childProductss == null ? 0 : childProductss.hashCode())) * 1000003;
                LinkedProductFiles linkedProductFiles = this.linkedProductFiles;
                this.$hashCode = iHashCode22 ^ (linkedProductFiles != null ? linkedProductFiles.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String hsCode() {
            return this.hsCode;
        }

        public String id() {
            return this.id;
        }

        public Integer incrementBy() {
            return this.incrementBy;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public LinkedProductFiles linkedProductFiles() {
            return this.linkedProductFiles;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.GetProductService.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetProductService.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetProductService.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetProductService.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetProductService.this.accountId);
                    responseWriter.writeList(responseFieldArr[3], GetProductService.this.externalReference, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.GetProductService.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ExternalReference) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[4], GetProductService.this.name);
                    responseWriter.writeString(responseFieldArr[5], GetProductService.this.description);
                    ResponseField responseField = responseFieldArr[6];
                    ProductServiceType productServiceType = GetProductService.this.f58071type;
                    responseWriter.writeString(responseField, productServiceType != null ? productServiceType.name() : null);
                    responseWriter.writeString(responseFieldArr[7], GetProductService.this.measurementUnit);
                    responseWriter.writeInt(responseFieldArr[8], GetProductService.this.incrementBy);
                    responseWriter.writeString(responseFieldArr[9], GetProductService.this.hsCode);
                    responseWriter.writeString(responseFieldArr[10], GetProductService.this.skuCode);
                    responseWriter.writeString(responseFieldArr[11], GetProductService.this.standardPricePerUnit);
                    responseWriter.writeString(responseFieldArr[12], GetProductService.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], GetProductService.this.parentProductId);
                    responseWriter.writeString(responseFieldArr[14], GetProductService.this.productPicture);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], GetProductService.this.startDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], GetProductService.this.endDate);
                    responseWriter.writeBoolean(responseFieldArr[17], GetProductService.this.isArchived);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], GetProductService.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], GetProductService.this.updatedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], GetProductService.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], GetProductService.this.updatedAt);
                    ResponseField responseField2 = responseFieldArr[22];
                    ParentProduct parentProduct = GetProductService.this.parentProduct;
                    responseWriter.writeObject(responseField2, parentProduct != null ? parentProduct.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[23];
                    ChildProductss childProductss = GetProductService.this.childProductss;
                    responseWriter.writeObject(responseField3, childProductss != null ? childProductss.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[24];
                    LinkedProductFiles linkedProductFiles = GetProductService.this.linkedProductFiles;
                    responseWriter.writeObject(responseField4, linkedProductFiles != null ? linkedProductFiles.marshaller() : null);
                }
            };
        }

        public String measurementUnit() {
            return this.measurementUnit;
        }

        public String name() {
            return this.name;
        }

        public ParentProduct parentProduct() {
            return this.parentProduct;
        }

        public String parentProductId() {
            return this.parentProductId;
        }

        public String productPicture() {
            return this.productPicture;
        }

        public String skuCode() {
            return this.skuCode;
        }

        public String standardPricePerUnit() {
            return this.standardPricePerUnit;
        }

        public String startDate() {
            return this.startDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetProductService{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", externalReference=" + this.externalReference + ", name=" + this.name + ", description=" + this.description + ", type=" + this.f58071type + ", measurementUnit=" + this.measurementUnit + ", incrementBy=" + this.incrementBy + ", hsCode=" + this.hsCode + ", skuCode=" + this.skuCode + ", standardPricePerUnit=" + this.standardPricePerUnit + ", currency=" + this.currency + ", parentProductId=" + this.parentProductId + ", productPicture=" + this.productPicture + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isArchived=" + this.isArchived + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", parentProduct=" + this.parentProduct + ", childProductss=" + this.childProductss + ", linkedProductFiles=" + this.linkedProductFiles + "}";
            }
            return this.$toString;
        }

        public ProductServiceType type() {
            return this.f58071type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }
    }

    public static class LinkedProductFiles {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<LinkedProductFiles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public LinkedProductFiles map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = LinkedProductFiles.$responseFields;
                return new LinkedProductFiles(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public LinkedProductFiles(String str, String str2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.nextToken = str2;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LinkedProductFiles)) {
                return false;
            }
            LinkedProductFiles linkedProductFiles = (LinkedProductFiles) obj;
            if (this.__typename.equals(linkedProductFiles.__typename)) {
                String str = this.nextToken;
                String str2 = linkedProductFiles.nextToken;
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
                String str = this.nextToken;
                this.$hashCode = iHashCode ^ (str == null ? 0 : str.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.LinkedProductFiles.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = LinkedProductFiles.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], LinkedProductFiles.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], LinkedProductFiles.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LinkedProductFiles{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class ParentProduct {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdBy;
        final String currency;
        final String description;
        final String endDate;
        final String hsCode;
        final String id;
        final Integer incrementBy;
        final Boolean isArchived;
        final String measurementUnit;
        final String name;
        final String parentProductId;
        final String productPicture;
        final String skuCode;
        final String standardPricePerUnit;
        final String startDate;

        /* renamed from: type, reason: collision with root package name */
        final ProductServiceType f58072type;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<ParentProduct> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public ParentProduct map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = ParentProduct.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                return new ParentProduct(string, str, str2, string2, string3, string4 != null ? ProductServiceType.valueOf(string4) : null, responseReader.readString(responseFieldArr[6]), responseReader.readInt(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), responseReader.readBoolean(responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, true, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("measurementUnit", "measurementUnit", null, true, Collections.emptyList()), ResponseField.forInt("incrementBy", "incrementBy", null, true, Collections.emptyList()), ResponseField.forString("hsCode", "hsCode", null, true, Collections.emptyList()), ResponseField.forString("skuCode", "skuCode", null, true, Collections.emptyList()), ResponseField.forString("standardPricePerUnit", "standardPricePerUnit", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.CURRENCY, null, true, Collections.emptyList()), ResponseField.forCustomType("parentProductId", "parentProductId", null, true, customType, Collections.emptyList()), ResponseField.forString("productPicture", "productPicture", null, true, Collections.emptyList()), ResponseField.forCustomType("startDate", "startDate", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("endDate", "endDate", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forCustomType("createdBy", "createdBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedBy", "updatedBy", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public ParentProduct(String str, String str2, String str3, String str4, String str5, ProductServiceType productServiceType, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, String str17, String str18) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = str4;
            this.description = str5;
            this.f58072type = productServiceType;
            this.measurementUnit = str6;
            this.incrementBy = num;
            this.hsCode = str7;
            this.skuCode = str8;
            this.standardPricePerUnit = str9;
            this.currency = str10;
            this.parentProductId = str11;
            this.productPicture = str12;
            this.startDate = str13;
            this.endDate = str14;
            this.isArchived = bool;
            this.createdBy = str15;
            this.updatedBy = str16;
            this.createdAt = str17;
            this.updatedAt = str18;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String createdBy() {
            return this.createdBy;
        }

        public String currency() {
            return this.currency;
        }

        public String description() {
            return this.description;
        }

        public String endDate() {
            return this.endDate;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            ProductServiceType productServiceType;
            String str3;
            Integer num;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            Boolean bool;
            String str12;
            String str13;
            String str14;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParentProduct)) {
                return false;
            }
            ParentProduct parentProduct = (ParentProduct) obj;
            if (this.__typename.equals(parentProduct.__typename) && this.id.equals(parentProduct.id) && this.accountId.equals(parentProduct.accountId) && ((str = this.name) != null ? str.equals(parentProduct.name) : parentProduct.name == null) && ((str2 = this.description) != null ? str2.equals(parentProduct.description) : parentProduct.description == null) && ((productServiceType = this.f58072type) != null ? productServiceType.equals(parentProduct.f58072type) : parentProduct.f58072type == null) && ((str3 = this.measurementUnit) != null ? str3.equals(parentProduct.measurementUnit) : parentProduct.measurementUnit == null) && ((num = this.incrementBy) != null ? num.equals(parentProduct.incrementBy) : parentProduct.incrementBy == null) && ((str4 = this.hsCode) != null ? str4.equals(parentProduct.hsCode) : parentProduct.hsCode == null) && ((str5 = this.skuCode) != null ? str5.equals(parentProduct.skuCode) : parentProduct.skuCode == null) && ((str6 = this.standardPricePerUnit) != null ? str6.equals(parentProduct.standardPricePerUnit) : parentProduct.standardPricePerUnit == null) && ((str7 = this.currency) != null ? str7.equals(parentProduct.currency) : parentProduct.currency == null) && ((str8 = this.parentProductId) != null ? str8.equals(parentProduct.parentProductId) : parentProduct.parentProductId == null) && ((str9 = this.productPicture) != null ? str9.equals(parentProduct.productPicture) : parentProduct.productPicture == null) && ((str10 = this.startDate) != null ? str10.equals(parentProduct.startDate) : parentProduct.startDate == null) && ((str11 = this.endDate) != null ? str11.equals(parentProduct.endDate) : parentProduct.endDate == null) && ((bool = this.isArchived) != null ? bool.equals(parentProduct.isArchived) : parentProduct.isArchived == null) && ((str12 = this.createdBy) != null ? str12.equals(parentProduct.createdBy) : parentProduct.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(parentProduct.updatedBy) : parentProduct.updatedBy == null) && ((str14 = this.createdAt) != null ? str14.equals(parentProduct.createdAt) : parentProduct.createdAt == null)) {
                String str15 = this.updatedAt;
                String str16 = parentProduct.updatedAt;
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

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003;
                String str = this.name;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.description;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                ProductServiceType productServiceType = this.f58072type;
                int iHashCode4 = (iHashCode3 ^ (productServiceType == null ? 0 : productServiceType.hashCode())) * 1000003;
                String str3 = this.measurementUnit;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num = this.incrementBy;
                int iHashCode6 = (iHashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str4 = this.hsCode;
                int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.skuCode;
                int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.standardPricePerUnit;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.currency;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.parentProductId;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.productPicture;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.startDate;
                int iHashCode13 = (iHashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.endDate;
                int iHashCode14 = (iHashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.isArchived;
                int iHashCode15 = (iHashCode14 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str12 = this.createdBy;
                int iHashCode16 = (iHashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.updatedBy;
                int iHashCode17 = (iHashCode16 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.createdAt;
                int iHashCode18 = (iHashCode17 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.updatedAt;
                this.$hashCode = iHashCode18 ^ (str15 != null ? str15.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String hsCode() {
            return this.hsCode;
        }

        public String id() {
            return this.id;
        }

        public Integer incrementBy() {
            return this.incrementBy;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.ParentProduct.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ParentProduct.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ParentProduct.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ParentProduct.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ParentProduct.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], ParentProduct.this.name);
                    responseWriter.writeString(responseFieldArr[4], ParentProduct.this.description);
                    ResponseField responseField = responseFieldArr[5];
                    ProductServiceType productServiceType = ParentProduct.this.f58072type;
                    responseWriter.writeString(responseField, productServiceType != null ? productServiceType.name() : null);
                    responseWriter.writeString(responseFieldArr[6], ParentProduct.this.measurementUnit);
                    responseWriter.writeInt(responseFieldArr[7], ParentProduct.this.incrementBy);
                    responseWriter.writeString(responseFieldArr[8], ParentProduct.this.hsCode);
                    responseWriter.writeString(responseFieldArr[9], ParentProduct.this.skuCode);
                    responseWriter.writeString(responseFieldArr[10], ParentProduct.this.standardPricePerUnit);
                    responseWriter.writeString(responseFieldArr[11], ParentProduct.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], ParentProduct.this.parentProductId);
                    responseWriter.writeString(responseFieldArr[13], ParentProduct.this.productPicture);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], ParentProduct.this.startDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], ParentProduct.this.endDate);
                    responseWriter.writeBoolean(responseFieldArr[16], ParentProduct.this.isArchived);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], ParentProduct.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], ParentProduct.this.updatedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], ParentProduct.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], ParentProduct.this.updatedAt);
                }
            };
        }

        public String measurementUnit() {
            return this.measurementUnit;
        }

        public String name() {
            return this.name;
        }

        public String parentProductId() {
            return this.parentProductId;
        }

        public String productPicture() {
            return this.productPicture;
        }

        public String skuCode() {
            return this.skuCode;
        }

        public String standardPricePerUnit() {
            return this.standardPricePerUnit;
        }

        public String startDate() {
            return this.startDate;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ParentProduct{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", type=" + this.f58072type + ", measurementUnit=" + this.measurementUnit + ", incrementBy=" + this.incrementBy + ", hsCode=" + this.hsCode + ", skuCode=" + this.skuCode + ", standardPricePerUnit=" + this.standardPricePerUnit + ", currency=" + this.currency + ", parentProductId=" + this.parentProductId + ", productPicture=" + this.productPicture + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isArchived=" + this.isArchived + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public ProductServiceType type() {
            return this.f58072type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetProductServiceQuery.Variables.1
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

    public GetProductServiceQuery(String str) {
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
        return "8229bff558cc4804cd6fbadc76660f0a3ac3b326e45a0867d7bd069550a5c148";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetProductService($id: ID!) {\n  getProductService(id: $id) {\n    __typename\n    id\n    accountId\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    startDate\n    endDate\n    isArchived\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    childProductss {\n      __typename\n      nextToken\n    }\n    linkedProductFiles {\n      __typename\n      nextToken\n    }\n  }\n}";
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
