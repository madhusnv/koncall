package com.amplifyframework.datastore.generated.model;

import com.amazonaws.regions.ServiceAbbreviations;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.temporal.Temporal;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@Index(fields = {"registeredNumber", "userRegistrationStatus"}, name = "userByNumber")
@ModelConfig(authRules = {@AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE}, provider = ServiceAbbreviations.IAM), @AuthRule(allow = AuthStrategy.PRIVATE, operations = {ModelOperation.CREATE, ModelOperation.READ, ModelOperation.UPDATE, ModelOperation.DELETE})}, pluralName = "Users")
/* loaded from: classes5.dex */
public final class User implements Model {

    @ModelField(isRequired = true, targetType = "AddedSourceType")
    private final AddedSourceType addedSourceType;

    @ModelField(targetType = "String")
    private final String androidVersionRelease;

    @ModelField(targetType = "String")
    private final String appVersion;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime createdAt;

    @ModelField(targetType = "String")
    private final String deviceManufacturer;

    @ModelField(targetType = "String")
    private final String deviceModel;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(targetType = "ID")
    private final String lastSelectedAccountApp;

    @ModelField(targetType = "ID")
    private final String lastSelectedAccountWeb;

    @ModelField(isRequired = true, targetType = "String")
    private final String name;

    @ModelField(targetType = "String")
    private final String profilePictureUrl;

    @ModelField(targetType = "AWSEmail")
    private final String registeredEmail;

    @ModelField(targetType = "Boolean")
    private final Boolean registeredEmailVerified;

    @ModelField(isRequired = true, targetType = "AWSPhone")
    private final String registeredNumber;

    @ModelField(targetType = "Boolean")
    private final Boolean registeredNumberVerified;

    @ModelField(targetType = "AWSPhone")
    private final String secondaryNumber;

    @ModelField(targetType = "Boolean")
    private final Boolean secondaryNumberVerified;

    @ModelField(targetType = "AWSDateTime")
    private final Temporal.DateTime updatedAt;

    @ModelField(isRequired = true, targetType = "UserRegistrationStatus")
    private final UserRegistrationStatus userRegistrationStatus;

    @ModelField(targetType = "WebPreferences")
    private final List<WebPreferences> webPreferences;
    public static final QueryField ID = QueryField.field("User", OutcomeConstants.OUTCOME_ID);
    public static final QueryField ADDED_SOURCE_TYPE = QueryField.field("User", "addedSourceType");
    public static final QueryField NAME = QueryField.field("User", "name");
    public static final QueryField PROFILE_PICTURE_URL = QueryField.field("User", "profilePictureUrl");
    public static final QueryField REGISTERED_EMAIL = QueryField.field("User", "registeredEmail");
    public static final QueryField REGISTERED_EMAIL_VERIFIED = QueryField.field("User", "registeredEmailVerified");
    public static final QueryField REGISTERED_NUMBER = QueryField.field("User", "registeredNumber");
    public static final QueryField REGISTERED_NUMBER_VERIFIED = QueryField.field("User", "registeredNumberVerified");
    public static final QueryField SECONDARY_NUMBER = QueryField.field("User", "secondaryNumber");
    public static final QueryField SECONDARY_NUMBER_VERIFIED = QueryField.field("User", "secondaryNumberVerified");
    public static final QueryField USER_REGISTRATION_STATUS = QueryField.field("User", "userRegistrationStatus");
    public static final QueryField LAST_SELECTED_ACCOUNT_WEB = QueryField.field("User", "lastSelectedAccountWeb");
    public static final QueryField LAST_SELECTED_ACCOUNT_APP = QueryField.field("User", "lastSelectedAccountApp");
    public static final QueryField APP_VERSION = QueryField.field("User", RemoteConfigConstants.RequestFieldKey.APP_VERSION);
    public static final QueryField DEVICE_MODEL = QueryField.field("User", "deviceModel");
    public static final QueryField DEVICE_MANUFACTURER = QueryField.field("User", "deviceManufacturer");
    public static final QueryField ANDROID_VERSION_RELEASE = QueryField.field("User", "androidVersionRelease");
    public static final QueryField WEB_PREFERENCES = QueryField.field("User", "webPreferences");
    public static final QueryField CREATED_AT = QueryField.field("User", "createdAt");
    public static final QueryField UPDATED_AT = QueryField.field("User", "updatedAt");

    public interface AddedSourceTypeStep {
        NameStep addedSourceType(AddedSourceType addedSourceType);
    }

    public interface BuildStep {
        BuildStep androidVersionRelease(String str);

        BuildStep appVersion(String str);

        User build();

        BuildStep createdAt(Temporal.DateTime dateTime);

        BuildStep deviceManufacturer(String str);

        BuildStep deviceModel(String str);

        BuildStep id(String str);

        BuildStep lastSelectedAccountApp(String str);

        BuildStep lastSelectedAccountWeb(String str);

        BuildStep profilePictureUrl(String str);

        BuildStep registeredEmail(String str);

        BuildStep registeredEmailVerified(Boolean bool);

        BuildStep registeredNumberVerified(Boolean bool);

        BuildStep secondaryNumber(String str);

        BuildStep secondaryNumberVerified(Boolean bool);

        BuildStep updatedAt(Temporal.DateTime dateTime);

        BuildStep webPreferences(List<WebPreferences> list);
    }

    public static class Builder implements AddedSourceTypeStep, NameStep, RegisteredNumberStep, UserRegistrationStatusStep, BuildStep {
        private AddedSourceType addedSourceType;
        private String androidVersionRelease;
        private String appVersion;
        private Temporal.DateTime createdAt;
        private String deviceManufacturer;
        private String deviceModel;
        private String id;
        private String lastSelectedAccountApp;
        private String lastSelectedAccountWeb;
        private String name;
        private String profilePictureUrl;
        private String registeredEmail;
        private Boolean registeredEmailVerified;
        private String registeredNumber;
        private Boolean registeredNumberVerified;
        private String secondaryNumber;
        private Boolean secondaryNumberVerified;
        private Temporal.DateTime updatedAt;
        private UserRegistrationStatus userRegistrationStatus;
        private List<WebPreferences> webPreferences;

        @Override // com.amplifyframework.datastore.generated.model.User.AddedSourceTypeStep
        public NameStep addedSourceType(AddedSourceType addedSourceType) {
            Objects.requireNonNull(addedSourceType);
            this.addedSourceType = addedSourceType;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep androidVersionRelease(String str) {
            this.androidVersionRelease = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public User build() {
            String string = this.id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            return new User(string, this.addedSourceType, this.name, this.profilePictureUrl, this.registeredEmail, this.registeredEmailVerified, this.registeredNumber, this.registeredNumberVerified, this.secondaryNumber, this.secondaryNumberVerified, this.userRegistrationStatus, this.lastSelectedAccountWeb, this.lastSelectedAccountApp, this.appVersion, this.deviceModel, this.deviceManufacturer, this.androidVersionRelease, this.webPreferences, this.createdAt, this.updatedAt);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep createdAt(Temporal.DateTime dateTime) {
            this.createdAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep deviceManufacturer(String str) {
            this.deviceManufacturer = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep deviceModel(String str) {
            this.deviceModel = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep id(String str) {
            this.id = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep lastSelectedAccountApp(String str) {
            this.lastSelectedAccountApp = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep lastSelectedAccountWeb(String str) {
            this.lastSelectedAccountWeb = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.NameStep
        public RegisteredNumberStep name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep profilePictureUrl(String str) {
            this.profilePictureUrl = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep registeredEmail(String str) {
            this.registeredEmail = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep registeredEmailVerified(Boolean bool) {
            this.registeredEmailVerified = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.RegisteredNumberStep
        public UserRegistrationStatusStep registeredNumber(String str) {
            Objects.requireNonNull(str);
            this.registeredNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep registeredNumberVerified(Boolean bool) {
            this.registeredNumberVerified = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep secondaryNumber(String str) {
            this.secondaryNumber = str;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep secondaryNumberVerified(Boolean bool) {
            this.secondaryNumberVerified = bool;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep updatedAt(Temporal.DateTime dateTime) {
            this.updatedAt = dateTime;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.UserRegistrationStatusStep
        public BuildStep userRegistrationStatus(UserRegistrationStatus userRegistrationStatus) {
            Objects.requireNonNull(userRegistrationStatus);
            this.userRegistrationStatus = userRegistrationStatus;
            return this;
        }

        @Override // com.amplifyframework.datastore.generated.model.User.BuildStep
        public BuildStep webPreferences(List<WebPreferences> list) {
            this.webPreferences = list;
            return this;
        }

        public Builder() {
        }

        private Builder(String str, AddedSourceType addedSourceType, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str7, String str8, String str9, String str10, String str11, String str12, List<WebPreferences> list, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            this.id = str;
            this.addedSourceType = addedSourceType;
            this.name = str2;
            this.profilePictureUrl = str3;
            this.registeredEmail = str4;
            this.registeredEmailVerified = bool;
            this.registeredNumber = str5;
            this.registeredNumberVerified = bool2;
            this.secondaryNumber = str6;
            this.secondaryNumberVerified = bool3;
            this.userRegistrationStatus = userRegistrationStatus;
            this.lastSelectedAccountWeb = str7;
            this.lastSelectedAccountApp = str8;
            this.appVersion = str9;
            this.deviceModel = str10;
            this.deviceManufacturer = str11;
            this.androidVersionRelease = str12;
            this.webPreferences = list;
            this.createdAt = dateTime;
            this.updatedAt = dateTime2;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public /* bridge */ /* synthetic */ BuildStep webPreferences(List list) {
            return webPreferences((List<WebPreferences>) list);
        }

        private CopyOfBuilder(String str, AddedSourceType addedSourceType, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str7, String str8, String str9, String str10, String str11, String str12, List<WebPreferences> list, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
            super(str, addedSourceType, str2, str3, str4, bool, str5, bool2, str6, bool3, userRegistrationStatus, str7, str8, str9, str10, str11, str12, list, dateTime, dateTime2);
            Objects.requireNonNull(addedSourceType);
            Objects.requireNonNull(str2);
            Objects.requireNonNull(str5);
            Objects.requireNonNull(userRegistrationStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.AddedSourceTypeStep
        public CopyOfBuilder addedSourceType(AddedSourceType addedSourceType) {
            return (CopyOfBuilder) super.addedSourceType(addedSourceType);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder androidVersionRelease(String str) {
            return (CopyOfBuilder) super.androidVersionRelease(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder appVersion(String str) {
            return (CopyOfBuilder) super.appVersion(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder createdAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.createdAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder deviceManufacturer(String str) {
            return (CopyOfBuilder) super.deviceManufacturer(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder deviceModel(String str) {
            return (CopyOfBuilder) super.deviceModel(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder lastSelectedAccountApp(String str) {
            return (CopyOfBuilder) super.lastSelectedAccountApp(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder lastSelectedAccountWeb(String str) {
            return (CopyOfBuilder) super.lastSelectedAccountWeb(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.NameStep
        public CopyOfBuilder name(String str) {
            return (CopyOfBuilder) super.name(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder profilePictureUrl(String str) {
            return (CopyOfBuilder) super.profilePictureUrl(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder registeredEmail(String str) {
            return (CopyOfBuilder) super.registeredEmail(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder registeredEmailVerified(Boolean bool) {
            return (CopyOfBuilder) super.registeredEmailVerified(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.RegisteredNumberStep
        public CopyOfBuilder registeredNumber(String str) {
            return (CopyOfBuilder) super.registeredNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder registeredNumberVerified(Boolean bool) {
            return (CopyOfBuilder) super.registeredNumberVerified(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder secondaryNumber(String str) {
            return (CopyOfBuilder) super.secondaryNumber(str);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder secondaryNumberVerified(Boolean bool) {
            return (CopyOfBuilder) super.secondaryNumberVerified(bool);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder updatedAt(Temporal.DateTime dateTime) {
            return (CopyOfBuilder) super.updatedAt(dateTime);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.UserRegistrationStatusStep
        public CopyOfBuilder userRegistrationStatus(UserRegistrationStatus userRegistrationStatus) {
            return (CopyOfBuilder) super.userRegistrationStatus(userRegistrationStatus);
        }

        @Override // com.amplifyframework.datastore.generated.model.User.Builder, com.amplifyframework.datastore.generated.model.User.BuildStep
        public CopyOfBuilder webPreferences(List<WebPreferences> list) {
            return (CopyOfBuilder) super.webPreferences(list);
        }
    }

    public interface NameStep {
        RegisteredNumberStep name(String str);
    }

    public interface RegisteredNumberStep {
        UserRegistrationStatusStep registeredNumber(String str);
    }

    public interface UserRegistrationStatusStep {
        BuildStep userRegistrationStatus(UserRegistrationStatus userRegistrationStatus);
    }

    public static AddedSourceTypeStep builder() {
        return new Builder();
    }

    public static User justId(String str) {
        return new User(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.id, this.addedSourceType, this.name, this.profilePictureUrl, this.registeredEmail, this.registeredEmailVerified, this.registeredNumber, this.registeredNumberVerified, this.secondaryNumber, this.secondaryNumberVerified, this.userRegistrationStatus, this.lastSelectedAccountWeb, this.lastSelectedAccountApp, this.appVersion, this.deviceModel, this.deviceManufacturer, this.androidVersionRelease, this.webPreferences, this.createdAt, this.updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return s6c.m47909a(getId(), user.getId()) && s6c.m47909a(getAddedSourceType(), user.getAddedSourceType()) && s6c.m47909a(getName(), user.getName()) && s6c.m47909a(getProfilePictureUrl(), user.getProfilePictureUrl()) && s6c.m47909a(getRegisteredEmail(), user.getRegisteredEmail()) && s6c.m47909a(getRegisteredEmailVerified(), user.getRegisteredEmailVerified()) && s6c.m47909a(getRegisteredNumber(), user.getRegisteredNumber()) && s6c.m47909a(getRegisteredNumberVerified(), user.getRegisteredNumberVerified()) && s6c.m47909a(getSecondaryNumber(), user.getSecondaryNumber()) && s6c.m47909a(getSecondaryNumberVerified(), user.getSecondaryNumberVerified()) && s6c.m47909a(getUserRegistrationStatus(), user.getUserRegistrationStatus()) && s6c.m47909a(getLastSelectedAccountWeb(), user.getLastSelectedAccountWeb()) && s6c.m47909a(getLastSelectedAccountApp(), user.getLastSelectedAccountApp()) && s6c.m47909a(getAppVersion(), user.getAppVersion()) && s6c.m47909a(getDeviceModel(), user.getDeviceModel()) && s6c.m47909a(getDeviceManufacturer(), user.getDeviceManufacturer()) && s6c.m47909a(getAndroidVersionRelease(), user.getAndroidVersionRelease()) && s6c.m47909a(getWebPreferences(), user.getWebPreferences()) && s6c.m47909a(getCreatedAt(), user.getCreatedAt()) && s6c.m47909a(getUpdatedAt(), user.getUpdatedAt());
    }

    public AddedSourceType getAddedSourceType() {
        return this.addedSourceType;
    }

    public String getAndroidVersionRelease() {
        return this.androidVersionRelease;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public Temporal.DateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getId() {
        return this.id;
    }

    public String getLastSelectedAccountApp() {
        return this.lastSelectedAccountApp;
    }

    public String getLastSelectedAccountWeb() {
        return this.lastSelectedAccountWeb;
    }

    public String getName() {
        return this.name;
    }

    public String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public String getRegisteredEmail() {
        return this.registeredEmail;
    }

    public Boolean getRegisteredEmailVerified() {
        return this.registeredEmailVerified;
    }

    public String getRegisteredNumber() {
        return this.registeredNumber;
    }

    public Boolean getRegisteredNumberVerified() {
        return this.registeredNumberVerified;
    }

    public String getSecondaryNumber() {
        return this.secondaryNumber;
    }

    public Boolean getSecondaryNumberVerified() {
        return this.secondaryNumberVerified;
    }

    public Temporal.DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public UserRegistrationStatus getUserRegistrationStatus() {
        return this.userRegistrationStatus;
    }

    public List<WebPreferences> getWebPreferences() {
        return this.webPreferences;
    }

    public int hashCode() {
        return (getId() + getAddedSourceType() + getName() + getProfilePictureUrl() + getRegisteredEmail() + getRegisteredEmailVerified() + getRegisteredNumber() + getRegisteredNumberVerified() + getSecondaryNumber() + getSecondaryNumberVerified() + getUserRegistrationStatus() + getLastSelectedAccountWeb() + getLastSelectedAccountApp() + getAppVersion() + getDeviceModel() + getDeviceManufacturer() + getAndroidVersionRelease() + getWebPreferences() + getCreatedAt() + getUpdatedAt()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User {");
        sb.append("id=" + String.valueOf(getId()) + ", ");
        sb.append("addedSourceType=" + String.valueOf(getAddedSourceType()) + ", ");
        sb.append("name=" + String.valueOf(getName()) + ", ");
        sb.append("profilePictureUrl=" + String.valueOf(getProfilePictureUrl()) + ", ");
        sb.append("registeredEmail=" + String.valueOf(getRegisteredEmail()) + ", ");
        sb.append("registeredEmailVerified=" + String.valueOf(getRegisteredEmailVerified()) + ", ");
        sb.append("registeredNumber=" + String.valueOf(getRegisteredNumber()) + ", ");
        sb.append("registeredNumberVerified=" + String.valueOf(getRegisteredNumberVerified()) + ", ");
        sb.append("secondaryNumber=" + String.valueOf(getSecondaryNumber()) + ", ");
        sb.append("secondaryNumberVerified=" + String.valueOf(getSecondaryNumberVerified()) + ", ");
        sb.append("userRegistrationStatus=" + String.valueOf(getUserRegistrationStatus()) + ", ");
        sb.append("lastSelectedAccountWeb=" + String.valueOf(getLastSelectedAccountWeb()) + ", ");
        sb.append("lastSelectedAccountApp=" + String.valueOf(getLastSelectedAccountApp()) + ", ");
        sb.append("appVersion=" + String.valueOf(getAppVersion()) + ", ");
        sb.append("deviceModel=" + String.valueOf(getDeviceModel()) + ", ");
        sb.append("deviceManufacturer=" + String.valueOf(getDeviceManufacturer()) + ", ");
        sb.append("androidVersionRelease=" + String.valueOf(getAndroidVersionRelease()) + ", ");
        sb.append("webPreferences=" + String.valueOf(getWebPreferences()) + ", ");
        sb.append("createdAt=" + String.valueOf(getCreatedAt()) + ", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updatedAt=");
        sb2.append(String.valueOf(getUpdatedAt()));
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }

    private User(String str, AddedSourceType addedSourceType, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str7, String str8, String str9, String str10, String str11, String str12, List<WebPreferences> list, Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        this.id = str;
        this.addedSourceType = addedSourceType;
        this.name = str2;
        this.profilePictureUrl = str3;
        this.registeredEmail = str4;
        this.registeredEmailVerified = bool;
        this.registeredNumber = str5;
        this.registeredNumberVerified = bool2;
        this.secondaryNumber = str6;
        this.secondaryNumberVerified = bool3;
        this.userRegistrationStatus = userRegistrationStatus;
        this.lastSelectedAccountWeb = str7;
        this.lastSelectedAccountApp = str8;
        this.appVersion = str9;
        this.deviceModel = str10;
        this.deviceManufacturer = str11;
        this.androidVersionRelease = str12;
        this.webPreferences = list;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }
}
