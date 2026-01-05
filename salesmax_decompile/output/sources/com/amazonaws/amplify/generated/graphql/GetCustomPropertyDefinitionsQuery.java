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
import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import type.CustomDataType;
import type.CustomType;

/* loaded from: classes7.dex */
public final class GetCustomPropertyDefinitionsQuery implements Query<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "query GetCustomPropertyDefinitions($id: ID!) {\n  getCustomPropertyDefinitions(id: $id) {\n    __typename\n    id\n    accountId\n    propertyName\n    displayName\n    description\n    scalarType\n    dataType\n    isMultiple\n    parentObjectType\n    isSystemProperty\n    possibleValues {\n      __typename\n      value\n      viewValue\n      isArchived\n      tagColor\n      otherAttributes\n    }\n    isArchived\n    displayOrder\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "GetCustomPropertyDefinitions";
        }
    };
    public static final String QUERY_DOCUMENT = "query GetCustomPropertyDefinitions($id: ID!) {\n  getCustomPropertyDefinitions(id: $id) {\n    __typename\n    id\n    accountId\n    propertyName\n    displayName\n    description\n    scalarType\n    dataType\n    isMultiple\n    parentObjectType\n    isSystemProperty\n    possibleValues {\n      __typename\n      value\n      viewValue\n      isArchived\n      tagColor\n      otherAttributes\n    }\n    isArchived\n    displayOrder\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private String id;

        public GetCustomPropertyDefinitionsQuery build() {
            Utils.checkNotNull(this.id, "id == null");
            return new GetCustomPropertyDefinitionsQuery(this.id);
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getCustomPropertyDefinitions", "getCustomPropertyDefinitions", new UnmodifiableMapBuilder(1).put(OutcomeConstants.OUTCOME_ID, new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, OutcomeConstants.OUTCOME_ID).build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final GetCustomPropertyDefinitions getCustomPropertyDefinitions;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetCustomPropertyDefinitions.Mapper getCustomPropertyDefinitionsFieldMapper = new GetCustomPropertyDefinitions.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((GetCustomPropertyDefinitions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetCustomPropertyDefinitions>() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public GetCustomPropertyDefinitions read(ResponseReader responseReader2) {
                        return Mapper.this.getCustomPropertyDefinitionsFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(GetCustomPropertyDefinitions getCustomPropertyDefinitions) {
            this.getCustomPropertyDefinitions = getCustomPropertyDefinitions;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            GetCustomPropertyDefinitions getCustomPropertyDefinitions = this.getCustomPropertyDefinitions;
            GetCustomPropertyDefinitions getCustomPropertyDefinitions2 = ((Data) obj).getCustomPropertyDefinitions;
            return getCustomPropertyDefinitions == null ? getCustomPropertyDefinitions2 == null : getCustomPropertyDefinitions.equals(getCustomPropertyDefinitions2);
        }

        public GetCustomPropertyDefinitions getCustomPropertyDefinitions() {
            return this.getCustomPropertyDefinitions;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetCustomPropertyDefinitions getCustomPropertyDefinitions = this.getCustomPropertyDefinitions;
                this.$hashCode = (getCustomPropertyDefinitions == null ? 0 : getCustomPropertyDefinitions.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    GetCustomPropertyDefinitions getCustomPropertyDefinitions = Data.this.getCustomPropertyDefinitions;
                    responseWriter.writeObject(responseField, getCustomPropertyDefinitions != null ? getCustomPropertyDefinitions.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getCustomPropertyDefinitions=" + this.getCustomPropertyDefinitions + "}";
            }
            return this.$toString;
        }
    }

    public static class GetCustomPropertyDefinitions {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String createdAt;
        final String createdById;
        final CustomDataType dataType;
        final String description;
        final String displayName;
        final Integer displayOrder;
        final String id;
        final Boolean isArchived;
        final Boolean isMultiple;
        final boolean isSystemProperty;
        final String parentObjectType;
        final List<PossibleValue> possibleValues;
        final String propertyName;
        final String scalarType;
        final String updaedById;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<GetCustomPropertyDefinitions> {
            final PossibleValue.Mapper possibleValueFieldMapper = new PossibleValue.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public GetCustomPropertyDefinitions map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = GetCustomPropertyDefinitions.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String string2 = responseReader.readString(responseFieldArr[3]);
                String string3 = responseReader.readString(responseFieldArr[4]);
                String string4 = responseReader.readString(responseFieldArr[5]);
                String string5 = responseReader.readString(responseFieldArr[6]);
                String string6 = responseReader.readString(responseFieldArr[7]);
                return new GetCustomPropertyDefinitions(string, str, str2, string2, string3, string4, string5, string6 != null ? CustomDataType.valueOf(string6) : null, responseReader.readBoolean(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readBoolean(responseFieldArr[10]).booleanValue(), responseReader.readList(responseFieldArr[11], new ResponseReader.ListReader<PossibleValue>() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.GetCustomPropertyDefinitions.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public PossibleValue read(ResponseReader.ListItemReader listItemReader) {
                        return (PossibleValue) listItemReader.readObject(new ResponseReader.ObjectReader<PossibleValue>() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.GetCustomPropertyDefinitions.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public PossibleValue read(ResponseReader responseReader2) {
                                return Mapper.this.possibleValueFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readBoolean(responseFieldArr[12]), responseReader.readInt(responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[15]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[16]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[17]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("propertyName", "propertyName", null, false, Collections.emptyList()), ResponseField.forString("displayName", "displayName", null, false, Collections.emptyList()), ResponseField.forString(MediaTrack.ROLE_DESCRIPTION, MediaTrack.ROLE_DESCRIPTION, null, true, Collections.emptyList()), ResponseField.forString("scalarType", "scalarType", null, false, Collections.emptyList()), ResponseField.forString("dataType", "dataType", null, true, Collections.emptyList()), ResponseField.forBoolean("isMultiple", "isMultiple", null, true, Collections.emptyList()), ResponseField.forString("parentObjectType", "parentObjectType", null, false, Collections.emptyList()), ResponseField.forBoolean("isSystemProperty", "isSystemProperty", null, false, Collections.emptyList()), ResponseField.forList("possibleValues", "possibleValues", null, true, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forInt("displayOrder", "displayOrder", null, true, Collections.emptyList()), ResponseField.forCustomType("createdById", "createdById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updaedById", "updaedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public GetCustomPropertyDefinitions(String str, String str2, String str3, String str4, String str5, String str6, String str7, CustomDataType customDataType, Boolean bool, String str8, boolean z, List<PossibleValue> list, Boolean bool2, Integer num, String str9, String str10, String str11, String str12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.propertyName = (String) Utils.checkNotNull(str4, "propertyName == null");
            this.displayName = (String) Utils.checkNotNull(str5, "displayName == null");
            this.description = str6;
            this.scalarType = (String) Utils.checkNotNull(str7, "scalarType == null");
            this.dataType = customDataType;
            this.isMultiple = bool;
            this.parentObjectType = (String) Utils.checkNotNull(str8, "parentObjectType == null");
            this.isSystemProperty = z;
            this.possibleValues = list;
            this.isArchived = bool2;
            this.displayOrder = num;
            this.createdById = str9;
            this.updaedById = str10;
            this.createdAt = str11;
            this.updatedAt = str12;
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

        public String createdById() {
            return this.createdById;
        }

        public CustomDataType dataType() {
            return this.dataType;
        }

        public String description() {
            return this.description;
        }

        public String displayName() {
            return this.displayName;
        }

        public Integer displayOrder() {
            return this.displayOrder;
        }

        public boolean equals(Object obj) {
            String str;
            CustomDataType customDataType;
            Boolean bool;
            List<PossibleValue> list;
            Boolean bool2;
            Integer num;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetCustomPropertyDefinitions)) {
                return false;
            }
            GetCustomPropertyDefinitions getCustomPropertyDefinitions = (GetCustomPropertyDefinitions) obj;
            if (this.__typename.equals(getCustomPropertyDefinitions.__typename) && this.id.equals(getCustomPropertyDefinitions.id) && this.accountId.equals(getCustomPropertyDefinitions.accountId) && this.propertyName.equals(getCustomPropertyDefinitions.propertyName) && this.displayName.equals(getCustomPropertyDefinitions.displayName) && ((str = this.description) != null ? str.equals(getCustomPropertyDefinitions.description) : getCustomPropertyDefinitions.description == null) && this.scalarType.equals(getCustomPropertyDefinitions.scalarType) && ((customDataType = this.dataType) != null ? customDataType.equals(getCustomPropertyDefinitions.dataType) : getCustomPropertyDefinitions.dataType == null) && ((bool = this.isMultiple) != null ? bool.equals(getCustomPropertyDefinitions.isMultiple) : getCustomPropertyDefinitions.isMultiple == null) && this.parentObjectType.equals(getCustomPropertyDefinitions.parentObjectType) && this.isSystemProperty == getCustomPropertyDefinitions.isSystemProperty && ((list = this.possibleValues) != null ? list.equals(getCustomPropertyDefinitions.possibleValues) : getCustomPropertyDefinitions.possibleValues == null) && ((bool2 = this.isArchived) != null ? bool2.equals(getCustomPropertyDefinitions.isArchived) : getCustomPropertyDefinitions.isArchived == null) && ((num = this.displayOrder) != null ? num.equals(getCustomPropertyDefinitions.displayOrder) : getCustomPropertyDefinitions.displayOrder == null) && ((str2 = this.createdById) != null ? str2.equals(getCustomPropertyDefinitions.createdById) : getCustomPropertyDefinitions.createdById == null) && ((str3 = this.updaedById) != null ? str3.equals(getCustomPropertyDefinitions.updaedById) : getCustomPropertyDefinitions.updaedById == null) && ((str4 = this.createdAt) != null ? str4.equals(getCustomPropertyDefinitions.createdAt) : getCustomPropertyDefinitions.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = getCustomPropertyDefinitions.updatedAt;
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
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.propertyName.hashCode()) * 1000003) ^ this.displayName.hashCode()) * 1000003;
                String str = this.description;
                int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.scalarType.hashCode()) * 1000003;
                CustomDataType customDataType = this.dataType;
                int iHashCode3 = (iHashCode2 ^ (customDataType == null ? 0 : customDataType.hashCode())) * 1000003;
                Boolean bool = this.isMultiple;
                int iHashCode4 = (((((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.parentObjectType.hashCode()) * 1000003) ^ Boolean.valueOf(this.isSystemProperty).hashCode()) * 1000003;
                List<PossibleValue> list = this.possibleValues;
                int iHashCode5 = (iHashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Boolean bool2 = this.isArchived;
                int iHashCode6 = (iHashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num = this.displayOrder;
                int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str2 = this.createdById;
                int iHashCode8 = (iHashCode7 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updaedById;
                int iHashCode9 = (iHashCode8 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode10 = (iHashCode9 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode10 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public Boolean isMultiple() {
            return this.isMultiple;
        }

        public boolean isSystemProperty() {
            return this.isSystemProperty;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.GetCustomPropertyDefinitions.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = GetCustomPropertyDefinitions.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], GetCustomPropertyDefinitions.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], GetCustomPropertyDefinitions.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], GetCustomPropertyDefinitions.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], GetCustomPropertyDefinitions.this.propertyName);
                    responseWriter.writeString(responseFieldArr[4], GetCustomPropertyDefinitions.this.displayName);
                    responseWriter.writeString(responseFieldArr[5], GetCustomPropertyDefinitions.this.description);
                    responseWriter.writeString(responseFieldArr[6], GetCustomPropertyDefinitions.this.scalarType);
                    ResponseField responseField = responseFieldArr[7];
                    CustomDataType customDataType = GetCustomPropertyDefinitions.this.dataType;
                    responseWriter.writeString(responseField, customDataType != null ? customDataType.name() : null);
                    responseWriter.writeBoolean(responseFieldArr[8], GetCustomPropertyDefinitions.this.isMultiple);
                    responseWriter.writeString(responseFieldArr[9], GetCustomPropertyDefinitions.this.parentObjectType);
                    responseWriter.writeBoolean(responseFieldArr[10], Boolean.valueOf(GetCustomPropertyDefinitions.this.isSystemProperty));
                    responseWriter.writeList(responseFieldArr[11], GetCustomPropertyDefinitions.this.possibleValues, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.GetCustomPropertyDefinitions.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((PossibleValue) obj).marshaller());
                        }
                    });
                    responseWriter.writeBoolean(responseFieldArr[12], GetCustomPropertyDefinitions.this.isArchived);
                    responseWriter.writeInt(responseFieldArr[13], GetCustomPropertyDefinitions.this.displayOrder);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], GetCustomPropertyDefinitions.this.createdById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[15], GetCustomPropertyDefinitions.this.updaedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[16], GetCustomPropertyDefinitions.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[17], GetCustomPropertyDefinitions.this.updatedAt);
                }
            };
        }

        public String parentObjectType() {
            return this.parentObjectType;
        }

        public List<PossibleValue> possibleValues() {
            return this.possibleValues;
        }

        public String propertyName() {
            return this.propertyName;
        }

        public String scalarType() {
            return this.scalarType;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetCustomPropertyDefinitions{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", propertyName=" + this.propertyName + ", displayName=" + this.displayName + ", description=" + this.description + ", scalarType=" + this.scalarType + ", dataType=" + this.dataType + ", isMultiple=" + this.isMultiple + ", parentObjectType=" + this.parentObjectType + ", isSystemProperty=" + this.isSystemProperty + ", possibleValues=" + this.possibleValues + ", isArchived=" + this.isArchived + ", displayOrder=" + this.displayOrder + ", createdById=" + this.createdById + ", updaedById=" + this.updaedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updaedById() {
            return this.updaedById;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class PossibleValue {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, false, Collections.emptyList()), ResponseField.forString("viewValue", "viewValue", null, false, Collections.emptyList()), ResponseField.forBoolean("isArchived", "isArchived", null, true, Collections.emptyList()), ResponseField.forInt("tagColor", "tagColor", null, true, Collections.emptyList()), ResponseField.forCustomType("otherAttributes", "otherAttributes", null, true, CustomType.AWSJSON, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final Boolean isArchived;
        final String otherAttributes;
        final Integer tagColor;
        final String value;
        final String viewValue;

        public static final class Mapper implements ResponseFieldMapper<PossibleValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public PossibleValue map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = PossibleValue.$responseFields;
                return new PossibleValue(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readBoolean(responseFieldArr[3]), responseReader.readInt(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]));
            }
        }

        public PossibleValue(String str, String str2, String str3, Boolean bool, Integer num, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = (String) Utils.checkNotNull(str2, "value == null");
            this.viewValue = (String) Utils.checkNotNull(str3, "viewValue == null");
            this.isArchived = bool;
            this.tagColor = num;
            this.otherAttributes = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            Boolean bool;
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PossibleValue)) {
                return false;
            }
            PossibleValue possibleValue = (PossibleValue) obj;
            if (this.__typename.equals(possibleValue.__typename) && this.value.equals(possibleValue.value) && this.viewValue.equals(possibleValue.viewValue) && ((bool = this.isArchived) != null ? bool.equals(possibleValue.isArchived) : possibleValue.isArchived == null) && ((num = this.tagColor) != null ? num.equals(possibleValue.tagColor) : possibleValue.tagColor == null)) {
                String str = this.otherAttributes;
                String str2 = possibleValue.otherAttributes;
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
                int iHashCode = (((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode()) * 1000003) ^ this.viewValue.hashCode()) * 1000003;
                Boolean bool = this.isArchived;
                int iHashCode2 = (iHashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Integer num = this.tagColor;
                int iHashCode3 = (iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.otherAttributes;
                this.$hashCode = iHashCode3 ^ (str != null ? str.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean isArchived() {
            return this.isArchived;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.PossibleValue.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = PossibleValue.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], PossibleValue.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], PossibleValue.this.value);
                    responseWriter.writeString(responseFieldArr[2], PossibleValue.this.viewValue);
                    responseWriter.writeBoolean(responseFieldArr[3], PossibleValue.this.isArchived);
                    responseWriter.writeInt(responseFieldArr[4], PossibleValue.this.tagColor);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], PossibleValue.this.otherAttributes);
                }
            };
        }

        public String otherAttributes() {
            return this.otherAttributes;
        }

        public Integer tagColor() {
            return this.tagColor;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PossibleValue{__typename=" + this.__typename + ", value=" + this.value + ", viewValue=" + this.viewValue + ", isArchived=" + this.isArchived + ", tagColor=" + this.tagColor + ", otherAttributes=" + this.otherAttributes + "}";
            }
            return this.$toString;
        }

        public String value() {
            return this.value;
        }

        public String viewValue() {
            return this.viewValue;
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
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.GetCustomPropertyDefinitionsQuery.Variables.1
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

    public GetCustomPropertyDefinitionsQuery(String str) {
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
        return "6177603a08aeb48e0cc7de9824a0fa593d4e6f87f189f8d950adad3dcba7993d";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "query GetCustomPropertyDefinitions($id: ID!) {\n  getCustomPropertyDefinitions(id: $id) {\n    __typename\n    id\n    accountId\n    propertyName\n    displayName\n    description\n    scalarType\n    dataType\n    isMultiple\n    parentObjectType\n    isSystemProperty\n    possibleValues {\n      __typename\n      value\n      viewValue\n      isArchived\n      tagColor\n      otherAttributes\n    }\n    isArchived\n    displayOrder\n    createdById\n    updaedById\n    createdAt\n    updatedAt\n  }\n}";
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
