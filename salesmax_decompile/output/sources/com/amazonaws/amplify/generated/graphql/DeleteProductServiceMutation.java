package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
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
import type.DeleteProductServiceInput;
import type.ModelProductServiceConditionInput;
import type.ProductServiceType;

/* loaded from: classes7.dex */
public final class DeleteProductServiceMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteProductService($input: DeleteProductServiceInput!, $condition: ModelProductServiceConditionInput) {\n  deleteProductService(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    startDate\n    endDate\n    isArchived\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    childProductss {\n      __typename\n      nextToken\n    }\n    linkedProductFiles {\n      __typename\n      nextToken\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteProductService";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteProductService($input: DeleteProductServiceInput!, $condition: ModelProductServiceConditionInput) {\n  deleteProductService(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    startDate\n    endDate\n    isArchived\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    childProductss {\n      __typename\n      nextToken\n    }\n    linkedProductFiles {\n      __typename\n      nextToken\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelProductServiceConditionInput condition;
        private DeleteProductServiceInput input;

        public DeleteProductServiceMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteProductServiceMutation(this.input, this.condition);
        }

        public Builder condition(ModelProductServiceConditionInput modelProductServiceConditionInput) {
            this.condition = modelProductServiceConditionInput;
            return this;
        }

        public Builder input(DeleteProductServiceInput deleteProductServiceInput) {
            this.input = deleteProductServiceInput;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.ChildProductss.1
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteProductService", "deleteProductService", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteProductService deleteProductService;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteProductService.Mapper deleteProductServiceFieldMapper = new DeleteProductService.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteProductService) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteProductService>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteProductService read(ResponseReader responseReader2) {
                        return Mapper.this.deleteProductServiceFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteProductService deleteProductService) {
            this.deleteProductService = deleteProductService;
        }

        public DeleteProductService deleteProductService() {
            return this.deleteProductService;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteProductService deleteProductService = this.deleteProductService;
            DeleteProductService deleteProductService2 = ((Data) obj).deleteProductService;
            return deleteProductService == null ? deleteProductService2 == null : deleteProductService.equals(deleteProductService2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteProductService deleteProductService = this.deleteProductService;
                this.$hashCode = (deleteProductService == null ? 0 : deleteProductService.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteProductService deleteProductService = Data.this.deleteProductService;
                    responseWriter.writeObject(responseField, deleteProductService != null ? deleteProductService.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteProductService=" + this.deleteProductService + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteProductService {
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
        final ProductServiceType f58066type;
        final String updatedAt;
        final String updatedBy;

        public static final class Mapper implements ResponseFieldMapper<DeleteProductService> {
            final ExternalReference.Mapper externalReferenceFieldMapper = new ExternalReference.Mapper();
            final ParentProduct.Mapper parentProductFieldMapper = new ParentProduct.Mapper();
            final ChildProductss.Mapper childProductssFieldMapper = new ChildProductss.Mapper();
            final LinkedProductFiles.Mapper linkedProductFilesFieldMapper = new LinkedProductFiles.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteProductService map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteProductService.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                List list = responseReader.readList(responseFieldArr[3], new ResponseReader.ListReader<ExternalReference>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.DeleteProductService.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public ExternalReference read(ResponseReader.ListItemReader listItemReader) {
                        return (ExternalReference) listItemReader.readObject(new ResponseReader.ObjectReader<ExternalReference>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.DeleteProductService.Mapper.1.1
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
                return new DeleteProductService(string, str, str2, list, string2, string3, string4 != null ? ProductServiceType.valueOf(string4) : null, responseReader.readString(responseFieldArr[7]), responseReader.readInt(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), responseReader.readBoolean(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[21]), (ParentProduct) responseReader.readObject(responseFieldArr[22], new ResponseReader.ObjectReader<ParentProduct>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.DeleteProductService.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ParentProduct read(ResponseReader responseReader2) {
                        return Mapper.this.parentProductFieldMapper.map(responseReader2);
                    }
                }), (ChildProductss) responseReader.readObject(responseFieldArr[23], new ResponseReader.ObjectReader<ChildProductss>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.DeleteProductService.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public ChildProductss read(ResponseReader responseReader2) {
                        return Mapper.this.childProductssFieldMapper.map(responseReader2);
                    }
                }), (LinkedProductFiles) responseReader.readObject(responseFieldArr[24], new ResponseReader.ObjectReader<LinkedProductFiles>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.DeleteProductService.Mapper.4
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

        public DeleteProductService(String str, String str2, String str3, List<ExternalReference> list, String str4, String str5, ProductServiceType productServiceType, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, String str16, String str17, String str18, ParentProduct parentProduct, ChildProductss childProductss, LinkedProductFiles linkedProductFiles) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.externalReference = list;
            this.name = str4;
            this.description = str5;
            this.f58066type = productServiceType;
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
            if (!(obj instanceof DeleteProductService)) {
                return false;
            }
            DeleteProductService deleteProductService = (DeleteProductService) obj;
            if (this.__typename.equals(deleteProductService.__typename) && this.id.equals(deleteProductService.id) && this.accountId.equals(deleteProductService.accountId) && ((list = this.externalReference) != null ? list.equals(deleteProductService.externalReference) : deleteProductService.externalReference == null) && ((str = this.name) != null ? str.equals(deleteProductService.name) : deleteProductService.name == null) && ((str2 = this.description) != null ? str2.equals(deleteProductService.description) : deleteProductService.description == null) && ((productServiceType = this.f58066type) != null ? productServiceType.equals(deleteProductService.f58066type) : deleteProductService.f58066type == null) && ((str3 = this.measurementUnit) != null ? str3.equals(deleteProductService.measurementUnit) : deleteProductService.measurementUnit == null) && ((num = this.incrementBy) != null ? num.equals(deleteProductService.incrementBy) : deleteProductService.incrementBy == null) && ((str4 = this.hsCode) != null ? str4.equals(deleteProductService.hsCode) : deleteProductService.hsCode == null) && ((str5 = this.skuCode) != null ? str5.equals(deleteProductService.skuCode) : deleteProductService.skuCode == null) && ((str6 = this.standardPricePerUnit) != null ? str6.equals(deleteProductService.standardPricePerUnit) : deleteProductService.standardPricePerUnit == null) && ((str7 = this.currency) != null ? str7.equals(deleteProductService.currency) : deleteProductService.currency == null) && ((str8 = this.parentProductId) != null ? str8.equals(deleteProductService.parentProductId) : deleteProductService.parentProductId == null) && ((str9 = this.productPicture) != null ? str9.equals(deleteProductService.productPicture) : deleteProductService.productPicture == null) && ((str10 = this.startDate) != null ? str10.equals(deleteProductService.startDate) : deleteProductService.startDate == null) && ((str11 = this.endDate) != null ? str11.equals(deleteProductService.endDate) : deleteProductService.endDate == null) && ((bool = this.isArchived) != null ? bool.equals(deleteProductService.isArchived) : deleteProductService.isArchived == null) && ((str12 = this.createdBy) != null ? str12.equals(deleteProductService.createdBy) : deleteProductService.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(deleteProductService.updatedBy) : deleteProductService.updatedBy == null) && ((str14 = this.createdAt) != null ? str14.equals(deleteProductService.createdAt) : deleteProductService.createdAt == null) && ((str15 = this.updatedAt) != null ? str15.equals(deleteProductService.updatedAt) : deleteProductService.updatedAt == null) && ((parentProduct = this.parentProduct) != null ? parentProduct.equals(deleteProductService.parentProduct) : deleteProductService.parentProduct == null) && ((childProductss = this.childProductss) != null ? childProductss.equals(deleteProductService.childProductss) : deleteProductService.childProductss == null)) {
                LinkedProductFiles linkedProductFiles = this.linkedProductFiles;
                LinkedProductFiles linkedProductFiles2 = deleteProductService.linkedProductFiles;
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
                ProductServiceType productServiceType = this.f58066type;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.DeleteProductService.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteProductService.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteProductService.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteProductService.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], DeleteProductService.this.accountId);
                    responseWriter.writeList(responseFieldArr[3], DeleteProductService.this.externalReference, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.DeleteProductService.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((ExternalReference) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[4], DeleteProductService.this.name);
                    responseWriter.writeString(responseFieldArr[5], DeleteProductService.this.description);
                    ResponseField responseField = responseFieldArr[6];
                    ProductServiceType productServiceType = DeleteProductService.this.f58066type;
                    responseWriter.writeString(responseField, productServiceType != null ? productServiceType.name() : null);
                    responseWriter.writeString(responseFieldArr[7], DeleteProductService.this.measurementUnit);
                    responseWriter.writeInt(responseFieldArr[8], DeleteProductService.this.incrementBy);
                    responseWriter.writeString(responseFieldArr[9], DeleteProductService.this.hsCode);
                    responseWriter.writeString(responseFieldArr[10], DeleteProductService.this.skuCode);
                    responseWriter.writeString(responseFieldArr[11], DeleteProductService.this.standardPricePerUnit);
                    responseWriter.writeString(responseFieldArr[12], DeleteProductService.this.currency);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], DeleteProductService.this.parentProductId);
                    responseWriter.writeString(responseFieldArr[14], DeleteProductService.this.productPicture);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], DeleteProductService.this.startDate);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], DeleteProductService.this.endDate);
                    responseWriter.writeBoolean(responseFieldArr[17], DeleteProductService.this.isArchived);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], DeleteProductService.this.createdBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], DeleteProductService.this.updatedBy);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], DeleteProductService.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[21], DeleteProductService.this.updatedAt);
                    ResponseField responseField2 = responseFieldArr[22];
                    ParentProduct parentProduct = DeleteProductService.this.parentProduct;
                    responseWriter.writeObject(responseField2, parentProduct != null ? parentProduct.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[23];
                    ChildProductss childProductss = DeleteProductService.this.childProductss;
                    responseWriter.writeObject(responseField3, childProductss != null ? childProductss.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[24];
                    LinkedProductFiles linkedProductFiles = DeleteProductService.this.linkedProductFiles;
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
                this.$toString = "DeleteProductService{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", externalReference=" + this.externalReference + ", name=" + this.name + ", description=" + this.description + ", type=" + this.f58066type + ", measurementUnit=" + this.measurementUnit + ", incrementBy=" + this.incrementBy + ", hsCode=" + this.hsCode + ", skuCode=" + this.skuCode + ", standardPricePerUnit=" + this.standardPricePerUnit + ", currency=" + this.currency + ", parentProductId=" + this.parentProductId + ", productPicture=" + this.productPicture + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isArchived=" + this.isArchived + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", parentProduct=" + this.parentProduct + ", childProductss=" + this.childProductss + ", linkedProductFiles=" + this.linkedProductFiles + "}";
            }
            return this.$toString;
        }

        public ProductServiceType type() {
            return this.f58066type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.ExternalReference.1
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.LinkedProductFiles.1
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
        final ProductServiceType f58067type;
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
            this.f58067type = productServiceType;
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
            if (this.__typename.equals(parentProduct.__typename) && this.id.equals(parentProduct.id) && this.accountId.equals(parentProduct.accountId) && ((str = this.name) != null ? str.equals(parentProduct.name) : parentProduct.name == null) && ((str2 = this.description) != null ? str2.equals(parentProduct.description) : parentProduct.description == null) && ((productServiceType = this.f58067type) != null ? productServiceType.equals(parentProduct.f58067type) : parentProduct.f58067type == null) && ((str3 = this.measurementUnit) != null ? str3.equals(parentProduct.measurementUnit) : parentProduct.measurementUnit == null) && ((num = this.incrementBy) != null ? num.equals(parentProduct.incrementBy) : parentProduct.incrementBy == null) && ((str4 = this.hsCode) != null ? str4.equals(parentProduct.hsCode) : parentProduct.hsCode == null) && ((str5 = this.skuCode) != null ? str5.equals(parentProduct.skuCode) : parentProduct.skuCode == null) && ((str6 = this.standardPricePerUnit) != null ? str6.equals(parentProduct.standardPricePerUnit) : parentProduct.standardPricePerUnit == null) && ((str7 = this.currency) != null ? str7.equals(parentProduct.currency) : parentProduct.currency == null) && ((str8 = this.parentProductId) != null ? str8.equals(parentProduct.parentProductId) : parentProduct.parentProductId == null) && ((str9 = this.productPicture) != null ? str9.equals(parentProduct.productPicture) : parentProduct.productPicture == null) && ((str10 = this.startDate) != null ? str10.equals(parentProduct.startDate) : parentProduct.startDate == null) && ((str11 = this.endDate) != null ? str11.equals(parentProduct.endDate) : parentProduct.endDate == null) && ((bool = this.isArchived) != null ? bool.equals(parentProduct.isArchived) : parentProduct.isArchived == null) && ((str12 = this.createdBy) != null ? str12.equals(parentProduct.createdBy) : parentProduct.createdBy == null) && ((str13 = this.updatedBy) != null ? str13.equals(parentProduct.updatedBy) : parentProduct.updatedBy == null) && ((str14 = this.createdAt) != null ? str14.equals(parentProduct.createdAt) : parentProduct.createdAt == null)) {
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
                ProductServiceType productServiceType = this.f58067type;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.ParentProduct.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = ParentProduct.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], ParentProduct.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], ParentProduct.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], ParentProduct.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], ParentProduct.this.name);
                    responseWriter.writeString(responseFieldArr[4], ParentProduct.this.description);
                    ResponseField responseField = responseFieldArr[5];
                    ProductServiceType productServiceType = ParentProduct.this.f58067type;
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
                this.$toString = "ParentProduct{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", description=" + this.description + ", type=" + this.f58067type + ", measurementUnit=" + this.measurementUnit + ", incrementBy=" + this.incrementBy + ", hsCode=" + this.hsCode + ", skuCode=" + this.skuCode + ", standardPricePerUnit=" + this.standardPricePerUnit + ", currency=" + this.currency + ", parentProductId=" + this.parentProductId + ", productPicture=" + this.productPicture + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isArchived=" + this.isArchived + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public ProductServiceType type() {
            return this.f58067type;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public String updatedBy() {
            return this.updatedBy;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelProductServiceConditionInput condition;
        private final DeleteProductServiceInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteProductServiceInput deleteProductServiceInput, ModelProductServiceConditionInput modelProductServiceConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteProductServiceInput;
            this.condition = modelProductServiceConditionInput;
            linkedHashMap.put("input", deleteProductServiceInput);
            linkedHashMap.put("condition", modelProductServiceConditionInput);
        }

        public ModelProductServiceConditionInput condition() {
            return this.condition;
        }

        public DeleteProductServiceInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteProductServiceMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                    inputFieldWriter.writeObject("condition", Variables.this.condition != null ? Variables.this.condition.marshaller() : null);
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public DeleteProductServiceMutation(DeleteProductServiceInput deleteProductServiceInput, ModelProductServiceConditionInput modelProductServiceConditionInput) {
        Utils.checkNotNull(deleteProductServiceInput, "input == null");
        this.variables = new Variables(deleteProductServiceInput, modelProductServiceConditionInput);
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
        return "444942d95b81f3f9a7a4170fd3ed720da9b4430dd897ec4c4fdbb641ff964448";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteProductService($input: DeleteProductServiceInput!, $condition: ModelProductServiceConditionInput) {\n  deleteProductService(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    externalReference {\n      __typename\n      externalReferenceId\n      externalReferenceIdSource\n      externalReferenceSourceDate\n    }\n    name\n    description\n    type\n    measurementUnit\n    incrementBy\n    hsCode\n    skuCode\n    standardPricePerUnit\n    currency\n    parentProductId\n    productPicture\n    startDate\n    endDate\n    isArchived\n    createdBy\n    updatedBy\n    createdAt\n    updatedAt\n    parentProduct {\n      __typename\n      id\n      accountId\n      name\n      description\n      type\n      measurementUnit\n      incrementBy\n      hsCode\n      skuCode\n      standardPricePerUnit\n      currency\n      parentProductId\n      productPicture\n      startDate\n      endDate\n      isArchived\n      createdBy\n      updatedBy\n      createdAt\n      updatedAt\n    }\n    childProductss {\n      __typename\n      nextToken\n    }\n    linkedProductFiles {\n      __typename\n      nextToken\n    }\n  }\n}";
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
