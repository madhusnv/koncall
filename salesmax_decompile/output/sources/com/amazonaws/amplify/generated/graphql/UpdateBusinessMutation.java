package com.amazonaws.amplify.generated.graphql;

import com.amplifyframework.api.aws.LazyTypeDeserializersKt;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.storage.s3.transfer.TransferTable;
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
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import type.AddedSourceType;
import type.CustomType;
import type.ModelBusinessConditionInput;
import type.UpdateBusinessInput;
import type.UserRegistrationStatus;

/* loaded from: classes4.dex */
public final class UpdateBusinessMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation UpdateBusiness($input: UpdateBusinessInput!, $condition: ModelBusinessConditionInput) {\n  updateBusiness(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    industry\n    priority\n    website\n    domain\n    logo\n    userDefinedTags\n    addedById\n    updatedById\n    createdAt\n    updatedAt\n    deals {\n      __typename\n      nextToken\n    }\n    contacts {\n      __typename\n      nextToken\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "UpdateBusiness";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation UpdateBusiness($input: UpdateBusinessInput!, $condition: ModelBusinessConditionInput) {\n  updateBusiness(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    industry\n    priority\n    website\n    domain\n    logo\n    userDefinedTags\n    addedById\n    updatedById\n    createdAt\n    updatedAt\n    deals {\n      __typename\n      nextToken\n    }\n    contacts {\n      __typename\n      nextToken\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static class AddedBy {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<AddedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public AddedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = AddedBy.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new AddedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public AddedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
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
            if (!(obj instanceof AddedBy)) {
                return false;
            }
            AddedBy addedBy = (AddedBy) obj;
            if (this.__typename.equals(addedBy.__typename) && this.id.equals(addedBy.id) && this.addedSourceType.equals(addedBy.addedSourceType) && this.name.equals(addedBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(addedBy.profilePictureUrl) : addedBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(addedBy.registeredEmail) : addedBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(addedBy.registeredEmailVerified) : addedBy.registeredEmailVerified == null) && this.registeredNumber.equals(addedBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(addedBy.registeredNumberVerified) : addedBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(addedBy.secondaryNumber) : addedBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(addedBy.secondaryNumberVerified) : addedBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(addedBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(addedBy.lastSelectedAccountWeb) : addedBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(addedBy.lastSelectedAccountApp) : addedBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(addedBy.appVersion) : addedBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(addedBy.deviceModel) : addedBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(addedBy.deviceManufacturer) : addedBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(addedBy.androidVersionRelease) : addedBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(addedBy.createdAt) : addedBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = addedBy.updatedAt;
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

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.AddedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = AddedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], AddedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], AddedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], AddedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], AddedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], AddedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], AddedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], AddedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], AddedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], AddedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], AddedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], AddedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], AddedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], AddedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], AddedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], AddedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], AddedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], AddedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], AddedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], AddedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], AddedBy.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AddedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static class Address {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("addressType", "addressType", null, true, Collections.emptyList()), ResponseField.forString("establishmentName", "establishmentName", null, true, Collections.emptyList()), ResponseField.forString("area", "area", null, true, Collections.emptyList()), ResponseField.forString("city", "city", null, true, Collections.emptyList()), ResponseField.forString("country", "country", null, true, Collections.emptyList()), ResponseField.forString("googlePlaceId", "googlePlaceId", null, true, Collections.emptyList()), ResponseField.forBoolean("isPrimaryAddress", "isPrimaryAddress", null, true, Collections.emptyList()), ResponseField.forString("landmark", "landmark", null, true, Collections.emptyList()), ResponseField.forString("lat", "lat", null, true, Collections.emptyList()), ResponseField.forString("lng", "lng", null, true, Collections.emptyList()), ResponseField.forString("rawAddressText", "rawAddressText", null, true, Collections.emptyList()), ResponseField.forString(TransferTable.COLUMN_REGION, TransferTable.COLUMN_REGION, null, true, Collections.emptyList()), ResponseField.forString("state", "state", null, true, Collections.emptyList()), ResponseField.forString("streetAddress", "streetAddress", null, true, Collections.emptyList()), ResponseField.forString("zipcode", "zipcode", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String addressType;
        final String area;
        final String city;
        final String country;
        final String establishmentName;
        final String googlePlaceId;
        final Boolean isPrimaryAddress;
        final String landmark;
        final String lat;
        final String lng;
        final String rawAddressText;
        final String region;
        final String state;
        final String streetAddress;
        final String zipcode;

        public static final class Mapper implements ResponseFieldMapper<Address> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Address map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Address.$responseFields;
                return new Address(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), responseReader.readBoolean(responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readString(responseFieldArr[10]), responseReader.readString(responseFieldArr[11]), responseReader.readString(responseFieldArr[12]), responseReader.readString(responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]));
            }
        }

        public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.addressType = str2;
            this.establishmentName = str3;
            this.area = str4;
            this.city = str5;
            this.country = str6;
            this.googlePlaceId = str7;
            this.isPrimaryAddress = bool;
            this.landmark = str8;
            this.lat = str9;
            this.lng = str10;
            this.rawAddressText = str11;
            this.region = str12;
            this.state = str13;
            this.streetAddress = str14;
            this.zipcode = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public String addressType() {
            return this.addressType;
        }

        public String area() {
            return this.area;
        }

        public String city() {
            return this.city;
        }

        public String country() {
            return this.country;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Boolean bool;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            if (this.__typename.equals(address.__typename) && ((str = this.addressType) != null ? str.equals(address.addressType) : address.addressType == null) && ((str2 = this.establishmentName) != null ? str2.equals(address.establishmentName) : address.establishmentName == null) && ((str3 = this.area) != null ? str3.equals(address.area) : address.area == null) && ((str4 = this.city) != null ? str4.equals(address.city) : address.city == null) && ((str5 = this.country) != null ? str5.equals(address.country) : address.country == null) && ((str6 = this.googlePlaceId) != null ? str6.equals(address.googlePlaceId) : address.googlePlaceId == null) && ((bool = this.isPrimaryAddress) != null ? bool.equals(address.isPrimaryAddress) : address.isPrimaryAddress == null) && ((str7 = this.landmark) != null ? str7.equals(address.landmark) : address.landmark == null) && ((str8 = this.lat) != null ? str8.equals(address.lat) : address.lat == null) && ((str9 = this.lng) != null ? str9.equals(address.lng) : address.lng == null) && ((str10 = this.rawAddressText) != null ? str10.equals(address.rawAddressText) : address.rawAddressText == null) && ((str11 = this.region) != null ? str11.equals(address.region) : address.region == null) && ((str12 = this.state) != null ? str12.equals(address.state) : address.state == null) && ((str13 = this.streetAddress) != null ? str13.equals(address.streetAddress) : address.streetAddress == null)) {
                String str14 = this.zipcode;
                String str15 = address.zipcode;
                if (str14 == null) {
                    if (str15 == null) {
                        return true;
                    }
                } else if (str14.equals(str15)) {
                    return true;
                }
            }
            return false;
        }

        public String establishmentName() {
            return this.establishmentName;
        }

        public String googlePlaceId() {
            return this.googlePlaceId;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.addressType;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.establishmentName;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.area;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.city;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.country;
                int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.googlePlaceId;
                int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Boolean bool = this.isPrimaryAddress;
                int iHashCode8 = (iHashCode7 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str7 = this.landmark;
                int iHashCode9 = (iHashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.lat;
                int iHashCode10 = (iHashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.lng;
                int iHashCode11 = (iHashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.rawAddressText;
                int iHashCode12 = (iHashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.region;
                int iHashCode13 = (iHashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.state;
                int iHashCode14 = (iHashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.streetAddress;
                int iHashCode15 = (iHashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.zipcode;
                this.$hashCode = iHashCode15 ^ (str14 != null ? str14.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean isPrimaryAddress() {
            return this.isPrimaryAddress;
        }

        public String landmark() {
            return this.landmark;
        }

        public String lat() {
            return this.lat;
        }

        public String lng() {
            return this.lng;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.Address.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Address.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Address.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Address.this.addressType);
                    responseWriter.writeString(responseFieldArr[2], Address.this.establishmentName);
                    responseWriter.writeString(responseFieldArr[3], Address.this.area);
                    responseWriter.writeString(responseFieldArr[4], Address.this.city);
                    responseWriter.writeString(responseFieldArr[5], Address.this.country);
                    responseWriter.writeString(responseFieldArr[6], Address.this.googlePlaceId);
                    responseWriter.writeBoolean(responseFieldArr[7], Address.this.isPrimaryAddress);
                    responseWriter.writeString(responseFieldArr[8], Address.this.landmark);
                    responseWriter.writeString(responseFieldArr[9], Address.this.lat);
                    responseWriter.writeString(responseFieldArr[10], Address.this.lng);
                    responseWriter.writeString(responseFieldArr[11], Address.this.rawAddressText);
                    responseWriter.writeString(responseFieldArr[12], Address.this.region);
                    responseWriter.writeString(responseFieldArr[13], Address.this.state);
                    responseWriter.writeString(responseFieldArr[14], Address.this.streetAddress);
                    responseWriter.writeString(responseFieldArr[15], Address.this.zipcode);
                }
            };
        }

        public String rawAddressText() {
            return this.rawAddressText;
        }

        public String region() {
            return this.region;
        }

        public String state() {
            return this.state;
        }

        public String streetAddress() {
            return this.streetAddress;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Address{__typename=" + this.__typename + ", addressType=" + this.addressType + ", establishmentName=" + this.establishmentName + ", area=" + this.area + ", city=" + this.city + ", country=" + this.country + ", googlePlaceId=" + this.googlePlaceId + ", isPrimaryAddress=" + this.isPrimaryAddress + ", landmark=" + this.landmark + ", lat=" + this.lat + ", lng=" + this.lng + ", rawAddressText=" + this.rawAddressText + ", region=" + this.region + ", state=" + this.state + ", streetAddress=" + this.streetAddress + ", zipcode=" + this.zipcode + "}";
            }
            return this.$toString;
        }

        public String zipcode() {
            return this.zipcode;
        }
    }

    public static final class Builder {
        private ModelBusinessConditionInput condition;
        private UpdateBusinessInput input;

        public UpdateBusinessMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new UpdateBusinessMutation(this.input, this.condition);
        }

        public Builder condition(ModelBusinessConditionInput modelBusinessConditionInput) {
            this.condition = modelBusinessConditionInput;
            return this;
        }

        public Builder input(UpdateBusinessInput updateBusinessInput) {
            this.input = updateBusinessInput;
            return this;
        }
    }

    public static class Contacts {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Contacts> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Contacts map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Contacts.$responseFields;
                return new Contacts(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Contacts(String str, String str2) {
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
            if (!(obj instanceof Contacts)) {
                return false;
            }
            Contacts contacts = (Contacts) obj;
            if (this.__typename.equals(contacts.__typename)) {
                String str = this.nextToken;
                String str2 = contacts.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.Contacts.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Contacts.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Contacts.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Contacts.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Contacts{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("updateBusiness", "updateBusiness", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final UpdateBusiness updateBusiness;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final UpdateBusiness.Mapper updateBusinessFieldMapper = new UpdateBusiness.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((UpdateBusiness) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<UpdateBusiness>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdateBusiness read(ResponseReader responseReader2) {
                        return Mapper.this.updateBusinessFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(UpdateBusiness updateBusiness) {
            this.updateBusiness = updateBusiness;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            UpdateBusiness updateBusiness = this.updateBusiness;
            UpdateBusiness updateBusiness2 = ((Data) obj).updateBusiness;
            return updateBusiness == null ? updateBusiness2 == null : updateBusiness.equals(updateBusiness2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                UpdateBusiness updateBusiness = this.updateBusiness;
                this.$hashCode = (updateBusiness == null ? 0 : updateBusiness.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    UpdateBusiness updateBusiness = Data.this.updateBusiness;
                    responseWriter.writeObject(responseField, updateBusiness != null ? updateBusiness.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{updateBusiness=" + this.updateBusiness + "}";
            }
            return this.$toString;
        }

        public UpdateBusiness updateBusiness() {
            return this.updateBusiness;
        }
    }

    public static class Deals {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, LazyTypeDeserializersKt.NEXT_TOKEN_KEY, null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String nextToken;

        public static final class Mapper implements ResponseFieldMapper<Deals> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Deals map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Deals.$responseFields;
                return new Deals(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]));
            }
        }

        public Deals(String str, String str2) {
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
            if (!(obj instanceof Deals)) {
                return false;
            }
            Deals deals = (Deals) obj;
            if (this.__typename.equals(deals.__typename)) {
                String str = this.nextToken;
                String str2 = deals.nextToken;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.Deals.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Deals.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Deals.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], Deals.this.nextToken);
                }
            };
        }

        public String nextToken() {
            return this.nextToken;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Deals{__typename=" + this.__typename + ", nextToken=" + this.nextToken + "}";
            }
            return this.$toString;
        }
    }

    public static class UpdateBusiness {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final AddedBy addedBy;
        final String addedById;
        final List<Address> addresses;
        final Contacts contacts;
        final String createdAt;
        final Deals deals;
        final String domain;
        final String id;
        final String industry;
        final String logo;
        final String name;
        final String priority;
        final String updatedAt;
        final UpdatedBy updatedBy;
        final String updatedById;
        final List<String> userDefinedTags;
        final String website;

        public static final class Mapper implements ResponseFieldMapper<UpdateBusiness> {
            final Address.Mapper addressFieldMapper = new Address.Mapper();
            final Deals.Mapper dealsFieldMapper = new Deals.Mapper();
            final Contacts.Mapper contactsFieldMapper = new Contacts.Mapper();
            final AddedBy.Mapper addedByFieldMapper = new AddedBy.Mapper();
            final UpdatedBy.Mapper updatedByFieldMapper = new UpdatedBy.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdateBusiness map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdateBusiness.$responseFields;
                return new UpdateBusiness(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), responseReader.readString(responseFieldArr[3]), responseReader.readList(responseFieldArr[4], new ResponseReader.ListReader<Address>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public Address read(ResponseReader.ListItemReader listItemReader) {
                        return (Address) listItemReader.readObject(new ResponseReader.ObjectReader<Address>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public Address read(ResponseReader responseReader2) {
                                return Mapper.this.addressFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), responseReader.readString(responseFieldArr[5]), responseReader.readString(responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), responseReader.readString(responseFieldArr[8]), responseReader.readString(responseFieldArr[9]), responseReader.readList(responseFieldArr[10], new ResponseReader.ListReader<String>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.Mapper.2
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[11]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[14]), (Deals) responseReader.readObject(responseFieldArr[15], new ResponseReader.ObjectReader<Deals>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.Mapper.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Deals read(ResponseReader responseReader2) {
                        return Mapper.this.dealsFieldMapper.map(responseReader2);
                    }
                }), (Contacts) responseReader.readObject(responseFieldArr[16], new ResponseReader.ObjectReader<Contacts>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.Mapper.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Contacts read(ResponseReader responseReader2) {
                        return Mapper.this.contactsFieldMapper.map(responseReader2);
                    }
                }), (AddedBy) responseReader.readObject(responseFieldArr[17], new ResponseReader.ObjectReader<AddedBy>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.Mapper.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public AddedBy read(ResponseReader responseReader2) {
                        return Mapper.this.addedByFieldMapper.map(responseReader2);
                    }
                }), (UpdatedBy) responseReader.readObject(responseFieldArr[18], new ResponseReader.ObjectReader<UpdatedBy>() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.Mapper.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public UpdatedBy read(ResponseReader responseReader2) {
                        return Mapper.this.updatedByFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forList("addresses", "addresses", null, true, Collections.emptyList()), ResponseField.forString("industry", "industry", null, true, Collections.emptyList()), ResponseField.forString("priority", "priority", null, true, Collections.emptyList()), ResponseField.forCustomType("website", "website", null, true, CustomType.AWSURL, Collections.emptyList()), ResponseField.forString(ClientCookie.DOMAIN_ATTR, ClientCookie.DOMAIN_ATTR, null, true, Collections.emptyList()), ResponseField.forString("logo", "logo", null, true, Collections.emptyList()), ResponseField.forList("userDefinedTags", "userDefinedTags", null, true, Collections.emptyList()), ResponseField.forCustomType("addedById", "addedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("updatedById", "updatedById", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject("deals", "deals", null, true, Collections.emptyList()), ResponseField.forObject("contacts", "contacts", null, true, Collections.emptyList()), ResponseField.forObject("addedBy", "addedBy", null, true, Collections.emptyList()), ResponseField.forObject("updatedBy", "updatedBy", null, true, Collections.emptyList())};
        }

        public UpdateBusiness(String str, String str2, String str3, String str4, List<Address> list, String str5, String str6, String str7, String str8, String str9, List<String> list2, String str10, String str11, String str12, String str13, Deals deals, Contacts contacts, AddedBy addedBy, UpdatedBy updatedBy) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.name = (String) Utils.checkNotNull(str4, "name == null");
            this.addresses = list;
            this.industry = str5;
            this.priority = str6;
            this.website = str7;
            this.domain = str8;
            this.logo = str9;
            this.userDefinedTags = list2;
            this.addedById = str10;
            this.updatedById = str11;
            this.createdAt = str12;
            this.updatedAt = str13;
            this.deals = deals;
            this.contacts = contacts;
            this.addedBy = addedBy;
            this.updatedBy = updatedBy;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public AddedBy addedBy() {
            return this.addedBy;
        }

        public String addedById() {
            return this.addedById;
        }

        public List<Address> addresses() {
            return this.addresses;
        }

        public Contacts contacts() {
            return this.contacts;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public Deals deals() {
            return this.deals;
        }

        public String domain() {
            return this.domain;
        }

        public boolean equals(Object obj) {
            List<Address> list;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list2;
            String str6;
            String str7;
            String str8;
            String str9;
            Deals deals;
            Contacts contacts;
            AddedBy addedBy;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateBusiness)) {
                return false;
            }
            UpdateBusiness updateBusiness = (UpdateBusiness) obj;
            if (this.__typename.equals(updateBusiness.__typename) && this.id.equals(updateBusiness.id) && this.accountId.equals(updateBusiness.accountId) && this.name.equals(updateBusiness.name) && ((list = this.addresses) != null ? list.equals(updateBusiness.addresses) : updateBusiness.addresses == null) && ((str = this.industry) != null ? str.equals(updateBusiness.industry) : updateBusiness.industry == null) && ((str2 = this.priority) != null ? str2.equals(updateBusiness.priority) : updateBusiness.priority == null) && ((str3 = this.website) != null ? str3.equals(updateBusiness.website) : updateBusiness.website == null) && ((str4 = this.domain) != null ? str4.equals(updateBusiness.domain) : updateBusiness.domain == null) && ((str5 = this.logo) != null ? str5.equals(updateBusiness.logo) : updateBusiness.logo == null) && ((list2 = this.userDefinedTags) != null ? list2.equals(updateBusiness.userDefinedTags) : updateBusiness.userDefinedTags == null) && ((str6 = this.addedById) != null ? str6.equals(updateBusiness.addedById) : updateBusiness.addedById == null) && ((str7 = this.updatedById) != null ? str7.equals(updateBusiness.updatedById) : updateBusiness.updatedById == null) && ((str8 = this.createdAt) != null ? str8.equals(updateBusiness.createdAt) : updateBusiness.createdAt == null) && ((str9 = this.updatedAt) != null ? str9.equals(updateBusiness.updatedAt) : updateBusiness.updatedAt == null) && ((deals = this.deals) != null ? deals.equals(updateBusiness.deals) : updateBusiness.deals == null) && ((contacts = this.contacts) != null ? contacts.equals(updateBusiness.contacts) : updateBusiness.contacts == null) && ((addedBy = this.addedBy) != null ? addedBy.equals(updateBusiness.addedBy) : updateBusiness.addedBy == null)) {
                UpdatedBy updatedBy = this.updatedBy;
                UpdatedBy updatedBy2 = updateBusiness.updatedBy;
                if (updatedBy == null) {
                    if (updatedBy2 == null) {
                        return true;
                    }
                } else if (updatedBy.equals(updatedBy2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                List<Address> list = this.addresses;
                int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.industry;
                int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.priority;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.website;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.domain;
                int iHashCode6 = (iHashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.logo;
                int iHashCode7 = (iHashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list2 = this.userDefinedTags;
                int iHashCode8 = (iHashCode7 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str6 = this.addedById;
                int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.updatedById;
                int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.createdAt;
                int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.updatedAt;
                int iHashCode12 = (iHashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                Deals deals = this.deals;
                int iHashCode13 = (iHashCode12 ^ (deals == null ? 0 : deals.hashCode())) * 1000003;
                Contacts contacts = this.contacts;
                int iHashCode14 = (iHashCode13 ^ (contacts == null ? 0 : contacts.hashCode())) * 1000003;
                AddedBy addedBy = this.addedBy;
                int iHashCode15 = (iHashCode14 ^ (addedBy == null ? 0 : addedBy.hashCode())) * 1000003;
                UpdatedBy updatedBy = this.updatedBy;
                this.$hashCode = iHashCode15 ^ (updatedBy != null ? updatedBy.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String industry() {
            return this.industry;
        }

        public String logo() {
            return this.logo;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdateBusiness.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdateBusiness.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdateBusiness.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], UpdateBusiness.this.accountId);
                    responseWriter.writeString(responseFieldArr[3], UpdateBusiness.this.name);
                    responseWriter.writeList(responseFieldArr[4], UpdateBusiness.this.addresses, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((Address) obj).marshaller());
                        }
                    });
                    responseWriter.writeString(responseFieldArr[5], UpdateBusiness.this.industry);
                    responseWriter.writeString(responseFieldArr[6], UpdateBusiness.this.priority);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdateBusiness.this.website);
                    responseWriter.writeString(responseFieldArr[8], UpdateBusiness.this.domain);
                    responseWriter.writeString(responseFieldArr[9], UpdateBusiness.this.logo);
                    responseWriter.writeList(responseFieldArr[10], UpdateBusiness.this.userDefinedTags, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdateBusiness.1.2
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeString(obj);
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[11], UpdateBusiness.this.addedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdateBusiness.this.updatedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdateBusiness.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[14], UpdateBusiness.this.updatedAt);
                    ResponseField responseField = responseFieldArr[15];
                    Deals deals = UpdateBusiness.this.deals;
                    responseWriter.writeObject(responseField, deals != null ? deals.marshaller() : null);
                    ResponseField responseField2 = responseFieldArr[16];
                    Contacts contacts = UpdateBusiness.this.contacts;
                    responseWriter.writeObject(responseField2, contacts != null ? contacts.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[17];
                    AddedBy addedBy = UpdateBusiness.this.addedBy;
                    responseWriter.writeObject(responseField3, addedBy != null ? addedBy.marshaller() : null);
                    ResponseField responseField4 = responseFieldArr[18];
                    UpdatedBy updatedBy = UpdateBusiness.this.updatedBy;
                    responseWriter.writeObject(responseField4, updatedBy != null ? updatedBy.marshaller() : null);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String priority() {
            return this.priority;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdateBusiness{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", name=" + this.name + ", addresses=" + this.addresses + ", industry=" + this.industry + ", priority=" + this.priority + ", website=" + this.website + ", domain=" + this.domain + ", logo=" + this.logo + ", userDefinedTags=" + this.userDefinedTags + ", addedById=" + this.addedById + ", updatedById=" + this.updatedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", deals=" + this.deals + ", contacts=" + this.contacts + ", addedBy=" + this.addedBy + ", updatedBy=" + this.updatedBy + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UpdatedBy updatedBy() {
            return this.updatedBy;
        }

        public String updatedById() {
            return this.updatedById;
        }

        public List<String> userDefinedTags() {
            return this.userDefinedTags;
        }

        public String website() {
            return this.website;
        }
    }

    public static class UpdatedBy {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final AddedSourceType addedSourceType;
        final String androidVersionRelease;
        final String appVersion;
        final String createdAt;
        final String deviceManufacturer;
        final String deviceModel;
        final String id;
        final String lastSelectedAccountApp;
        final String lastSelectedAccountWeb;
        final String name;
        final String profilePictureUrl;
        final String registeredEmail;
        final Boolean registeredEmailVerified;
        final String registeredNumber;
        final Boolean registeredNumberVerified;
        final String secondaryNumber;
        final Boolean secondaryNumberVerified;
        final String updatedAt;
        final UserRegistrationStatus userRegistrationStatus;

        public static final class Mapper implements ResponseFieldMapper<UpdatedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public UpdatedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = UpdatedBy.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String string2 = responseReader.readString(responseFieldArr[2]);
                AddedSourceType addedSourceTypeValueOf = string2 != null ? AddedSourceType.valueOf(string2) : null;
                String string3 = responseReader.readString(responseFieldArr[3]);
                String string4 = responseReader.readString(responseFieldArr[4]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]);
                Boolean bool = responseReader.readBoolean(responseFieldArr[6]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]);
                Boolean bool2 = responseReader.readBoolean(responseFieldArr[8]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]);
                Boolean bool3 = responseReader.readBoolean(responseFieldArr[10]);
                String string5 = responseReader.readString(responseFieldArr[11]);
                return new UpdatedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public UpdatedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.addedSourceType = (AddedSourceType) Utils.checkNotNull(addedSourceType, "addedSourceType == null");
            this.name = (String) Utils.checkNotNull(str3, "name == null");
            this.profilePictureUrl = str4;
            this.registeredEmail = str5;
            this.registeredEmailVerified = bool;
            this.registeredNumber = (String) Utils.checkNotNull(str6, "registeredNumber == null");
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str7;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = (UserRegistrationStatus) Utils.checkNotNull(userRegistrationStatus, "userRegistrationStatus == null");
            this.lastSelectedAccountWeb = str8;
            this.lastSelectedAccountApp = str9;
            this.appVersion = str10;
            this.deviceModel = str11;
            this.deviceManufacturer = str12;
            this.androidVersionRelease = str13;
            this.createdAt = str14;
            this.updatedAt = str15;
        }

        public String __typename() {
            return this.__typename;
        }

        public AddedSourceType addedSourceType() {
            return this.addedSourceType;
        }

        public String androidVersionRelease() {
            return this.androidVersionRelease;
        }

        public String appVersion() {
            return this.appVersion;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String deviceManufacturer() {
            return this.deviceManufacturer;
        }

        public String deviceModel() {
            return this.deviceModel;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Boolean bool;
            Boolean bool2;
            String str3;
            Boolean bool3;
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
            if (!(obj instanceof UpdatedBy)) {
                return false;
            }
            UpdatedBy updatedBy = (UpdatedBy) obj;
            if (this.__typename.equals(updatedBy.__typename) && this.id.equals(updatedBy.id) && this.addedSourceType.equals(updatedBy.addedSourceType) && this.name.equals(updatedBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(updatedBy.profilePictureUrl) : updatedBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(updatedBy.registeredEmail) : updatedBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(updatedBy.registeredEmailVerified) : updatedBy.registeredEmailVerified == null) && this.registeredNumber.equals(updatedBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(updatedBy.registeredNumberVerified) : updatedBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(updatedBy.secondaryNumber) : updatedBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(updatedBy.secondaryNumberVerified) : updatedBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(updatedBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(updatedBy.lastSelectedAccountWeb) : updatedBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(updatedBy.lastSelectedAccountApp) : updatedBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(updatedBy.appVersion) : updatedBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(updatedBy.deviceModel) : updatedBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(updatedBy.deviceManufacturer) : updatedBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(updatedBy.androidVersionRelease) : updatedBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(updatedBy.createdAt) : updatedBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = updatedBy.updatedAt;
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

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.addedSourceType.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003;
                String str = this.profilePictureUrl;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.registeredEmail;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.registeredEmailVerified;
                int iHashCode4 = (((iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.registeredNumber.hashCode()) * 1000003;
                Boolean bool2 = this.registeredNumberVerified;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str3 = this.secondaryNumber;
                int iHashCode6 = (iHashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool3 = this.secondaryNumberVerified;
                int iHashCode7 = (((iHashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.userRegistrationStatus.hashCode()) * 1000003;
                String str4 = this.lastSelectedAccountWeb;
                int iHashCode8 = (iHashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lastSelectedAccountApp;
                int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.appVersion;
                int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.deviceModel;
                int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.deviceManufacturer;
                int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.androidVersionRelease;
                int iHashCode13 = (iHashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode14 = (iHashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode14 ^ (str11 != null ? str11.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public String lastSelectedAccountApp() {
            return this.lastSelectedAccountApp;
        }

        public String lastSelectedAccountWeb() {
            return this.lastSelectedAccountWeb;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.UpdatedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = UpdatedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], UpdatedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], UpdatedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], UpdatedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], UpdatedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], UpdatedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], UpdatedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], UpdatedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], UpdatedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], UpdatedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], UpdatedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], UpdatedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], UpdatedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], UpdatedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], UpdatedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], UpdatedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], UpdatedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], UpdatedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], UpdatedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], UpdatedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], UpdatedBy.this.updatedAt);
                }
            };
        }

        public String name() {
            return this.name;
        }

        public String profilePictureUrl() {
            return this.profilePictureUrl;
        }

        public String registeredEmail() {
            return this.registeredEmail;
        }

        public Boolean registeredEmailVerified() {
            return this.registeredEmailVerified;
        }

        public String registeredNumber() {
            return this.registeredNumber;
        }

        public Boolean registeredNumberVerified() {
            return this.registeredNumberVerified;
        }

        public String secondaryNumber() {
            return this.secondaryNumber;
        }

        public Boolean secondaryNumberVerified() {
            return this.secondaryNumberVerified;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "UpdatedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelBusinessConditionInput condition;
        private final UpdateBusinessInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(UpdateBusinessInput updateBusinessInput, ModelBusinessConditionInput modelBusinessConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = updateBusinessInput;
            this.condition = modelBusinessConditionInput;
            linkedHashMap.put("input", updateBusinessInput);
            linkedHashMap.put("condition", modelBusinessConditionInput);
        }

        public ModelBusinessConditionInput condition() {
            return this.condition;
        }

        public UpdateBusinessInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.UpdateBusinessMutation.Variables.1
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

    public UpdateBusinessMutation(UpdateBusinessInput updateBusinessInput, ModelBusinessConditionInput modelBusinessConditionInput) {
        Utils.checkNotNull(updateBusinessInput, "input == null");
        this.variables = new Variables(updateBusinessInput, modelBusinessConditionInput);
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
        return "47d3189b253cd249fc234f12e7b1fc578477f75c3f45dc22c901f53254bd071c";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation UpdateBusiness($input: UpdateBusinessInput!, $condition: ModelBusinessConditionInput) {\n  updateBusiness(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    name\n    addresses {\n      __typename\n      addressType\n      establishmentName\n      area\n      city\n      country\n      googlePlaceId\n      isPrimaryAddress\n      landmark\n      lat\n      lng\n      rawAddressText\n      region\n      state\n      streetAddress\n      zipcode\n    }\n    industry\n    priority\n    website\n    domain\n    logo\n    userDefinedTags\n    addedById\n    updatedById\n    createdAt\n    updatedAt\n    deals {\n      __typename\n      nextToken\n    }\n    contacts {\n      __typename\n      nextToken\n    }\n    addedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n    updatedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
