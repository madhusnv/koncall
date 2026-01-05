package com.amazonaws.amplify.generated.graphql;

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
import type.AddedSourceType;
import type.CustomType;
import type.DeleteUserInput;
import type.UserRegistrationStatus;

/* loaded from: classes7.dex */
public final class DeleteUserMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation DeleteUser($input: DeleteUserInput!) {\n  deleteUser(input: $input) {\n    __typename\n    id\n    addedSourceType\n    name\n    profilePictureUrl\n    registeredEmail\n    registeredEmailVerified\n    registeredNumber\n    registeredNumberVerified\n    secondaryNumber\n    secondaryNumberVerified\n    userRegistrationStatus\n    lastSelectedAccountWeb\n    lastSelectedAccountApp\n    appVersion\n    deviceModel\n    deviceManufacturer\n    androidVersionRelease\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    createdAt\n    updatedAt\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "DeleteUser";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation DeleteUser($input: DeleteUserInput!) {\n  deleteUser(input: $input) {\n    __typename\n    id\n    addedSourceType\n    name\n    profilePictureUrl\n    registeredEmail\n    registeredEmailVerified\n    registeredNumber\n    registeredNumberVerified\n    secondaryNumber\n    secondaryNumberVerified\n    userRegistrationStatus\n    lastSelectedAccountWeb\n    lastSelectedAccountApp\n    appVersion\n    deviceModel\n    deviceManufacturer\n    androidVersionRelease\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    createdAt\n    updatedAt\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private DeleteUserInput input;

        public DeleteUserMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new DeleteUserMutation(this.input);
        }

        public Builder input(DeleteUserInput deleteUserInput) {
            this.input = deleteUserInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("deleteUser", "deleteUser", new UnmodifiableMapBuilder(1).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final DeleteUser deleteUser;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final DeleteUser.Mapper deleteUserFieldMapper = new DeleteUser.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((DeleteUser) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<DeleteUser>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public DeleteUser read(ResponseReader responseReader2) {
                        return Mapper.this.deleteUserFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(DeleteUser deleteUser) {
            this.deleteUser = deleteUser;
        }

        public DeleteUser deleteUser() {
            return this.deleteUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            DeleteUser deleteUser = this.deleteUser;
            DeleteUser deleteUser2 = ((Data) obj).deleteUser;
            return deleteUser == null ? deleteUser2 == null : deleteUser.equals(deleteUser2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                DeleteUser deleteUser = this.deleteUser;
                this.$hashCode = (deleteUser == null ? 0 : deleteUser.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    DeleteUser deleteUser = Data.this.deleteUser;
                    responseWriter.writeObject(responseField, deleteUser != null ? deleteUser.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{deleteUser=" + this.deleteUser + "}";
            }
            return this.$toString;
        }
    }

    public static class DeleteUser {
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
        final List<WebPreference> webPreferences;

        public static final class Mapper implements ResponseFieldMapper<DeleteUser> {
            final WebPreference.Mapper webPreferenceFieldMapper = new WebPreference.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public DeleteUser map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = DeleteUser.$responseFields;
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
                return new DeleteUser(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), responseReader.readList(responseFieldArr[18], new ResponseReader.ListReader<WebPreference>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.DeleteUser.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ListReader
                    public WebPreference read(ResponseReader.ListItemReader listItemReader) {
                        return (WebPreference) listItemReader.readObject(new ResponseReader.ObjectReader<WebPreference>() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.DeleteUser.Mapper.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                            public WebPreference read(ResponseReader responseReader2) {
                                return Mapper.this.webPreferenceFieldMapper.map(responseReader2);
                            }
                        });
                    }
                }), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[20]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forList("webPreferences", "webPreferences", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public DeleteUser(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, List<WebPreference> list, String str14, String str15) {
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
            this.webPreferences = list;
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
            List<WebPreference> list;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteUser)) {
                return false;
            }
            DeleteUser deleteUser = (DeleteUser) obj;
            if (this.__typename.equals(deleteUser.__typename) && this.id.equals(deleteUser.id) && this.addedSourceType.equals(deleteUser.addedSourceType) && this.name.equals(deleteUser.name) && ((str = this.profilePictureUrl) != null ? str.equals(deleteUser.profilePictureUrl) : deleteUser.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(deleteUser.registeredEmail) : deleteUser.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(deleteUser.registeredEmailVerified) : deleteUser.registeredEmailVerified == null) && this.registeredNumber.equals(deleteUser.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(deleteUser.registeredNumberVerified) : deleteUser.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(deleteUser.secondaryNumber) : deleteUser.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(deleteUser.secondaryNumberVerified) : deleteUser.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(deleteUser.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(deleteUser.lastSelectedAccountWeb) : deleteUser.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(deleteUser.lastSelectedAccountApp) : deleteUser.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(deleteUser.appVersion) : deleteUser.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(deleteUser.deviceModel) : deleteUser.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(deleteUser.deviceManufacturer) : deleteUser.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(deleteUser.androidVersionRelease) : deleteUser.androidVersionRelease == null) && ((list = this.webPreferences) != null ? list.equals(deleteUser.webPreferences) : deleteUser.webPreferences == null) && ((str10 = this.createdAt) != null ? str10.equals(deleteUser.createdAt) : deleteUser.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = deleteUser.updatedAt;
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
                List<WebPreference> list = this.webPreferences;
                int iHashCode14 = (iHashCode13 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str10 = this.createdAt;
                int iHashCode15 = (iHashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.updatedAt;
                this.$hashCode = iHashCode15 ^ (str11 != null ? str11.hashCode() : 0);
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.DeleteUser.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = DeleteUser.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], DeleteUser.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], DeleteUser.this.id);
                    responseWriter.writeString(responseFieldArr[2], DeleteUser.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], DeleteUser.this.name);
                    responseWriter.writeString(responseFieldArr[4], DeleteUser.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], DeleteUser.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], DeleteUser.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], DeleteUser.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], DeleteUser.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], DeleteUser.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], DeleteUser.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], DeleteUser.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], DeleteUser.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], DeleteUser.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], DeleteUser.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], DeleteUser.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], DeleteUser.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], DeleteUser.this.androidVersionRelease);
                    responseWriter.writeList(responseFieldArr[18], DeleteUser.this.webPreferences, new ResponseWriter.ListWriter() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.DeleteUser.1.1
                        @Override // com.apollographql.apollo.api.ResponseWriter.ListWriter
                        public void write(Object obj, ResponseWriter.ListItemWriter listItemWriter) {
                            listItemWriter.writeObject(((WebPreference) obj).marshaller());
                        }
                    });
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], DeleteUser.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[20], DeleteUser.this.updatedAt);
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
                this.$toString = "DeleteUser{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", webPreferences=" + this.webPreferences + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }

        public UserRegistrationStatus userRegistrationStatus() {
            return this.userRegistrationStatus;
        }

        public List<WebPreference> webPreferences() {
            return this.webPreferences;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final DeleteUserInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(DeleteUserInput deleteUserInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = deleteUserInput;
            linkedHashMap.put("input", deleteUserInput);
        }

        public DeleteUserInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.Variables.1
                @Override // com.apollographql.apollo.api.InputFieldMarshaller
                public void marshal(InputFieldWriter inputFieldWriter) {
                    inputFieldWriter.writeObject("input", Variables.this.input.marshaller());
                }
            };
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }
    }

    public static class WebPreference {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString(TransferTable.COLUMN_KEY, TransferTable.COLUMN_KEY, null, true, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String key;
        final String value;

        public static final class Mapper implements ResponseFieldMapper<WebPreference> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public WebPreference map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = WebPreference.$responseFields;
                return new WebPreference(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]));
            }
        }

        public WebPreference(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.key = str2;
            this.value = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WebPreference)) {
                return false;
            }
            WebPreference webPreference = (WebPreference) obj;
            if (this.__typename.equals(webPreference.__typename) && ((str = this.key) != null ? str.equals(webPreference.key) : webPreference.key == null)) {
                String str2 = this.value;
                String str3 = webPreference.value;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.key;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.value;
                this.$hashCode = iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String key() {
            return this.key;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.DeleteUserMutation.WebPreference.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = WebPreference.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], WebPreference.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], WebPreference.this.key);
                    responseWriter.writeString(responseFieldArr[2], WebPreference.this.value);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "WebPreference{__typename=" + this.__typename + ", key=" + this.key + ", value=" + this.value + "}";
            }
            return this.$toString;
        }

        public String value() {
            return this.value;
        }
    }

    public DeleteUserMutation(DeleteUserInput deleteUserInput) {
        Utils.checkNotNull(deleteUserInput, "input == null");
        this.variables = new Variables(deleteUserInput);
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
        return "ac69695f408c992507b01e8f4076f61a2387fdb93abde1c9a008b8ab5cc0597b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation DeleteUser($input: DeleteUserInput!) {\n  deleteUser(input: $input) {\n    __typename\n    id\n    addedSourceType\n    name\n    profilePictureUrl\n    registeredEmail\n    registeredEmailVerified\n    registeredNumber\n    registeredNumberVerified\n    secondaryNumber\n    secondaryNumberVerified\n    userRegistrationStatus\n    lastSelectedAccountWeb\n    lastSelectedAccountApp\n    appVersion\n    deviceModel\n    deviceManufacturer\n    androidVersionRelease\n    webPreferences {\n      __typename\n      key\n      value\n    }\n    createdAt\n    updatedAt\n  }\n}";
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
