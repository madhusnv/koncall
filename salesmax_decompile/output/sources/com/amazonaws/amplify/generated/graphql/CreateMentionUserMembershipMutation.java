package com.amazonaws.amplify.generated.graphql;

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
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import type.AddedSourceType;
import type.Announcement;
import type.CreateMentionUserMembershipInput;
import type.CustomType;
import type.ModelMentionUserMembershipConditionInput;
import type.UserRegistrationStatus;

/* loaded from: classes6.dex */
public final class CreateMentionUserMembershipMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation CreateMentionUserMembership($input: CreateMentionUserMembershipInput!, $condition: ModelMentionUserMembershipConditionInput) {\n  createMentionUserMembership(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    commentId\n    mentionedUserId\n    isAnnouncement\n    commentedById\n    createdAt\n    updatedAt\n    comment {\n      __typename\n      id\n      accountId\n      ownerId\n      body\n      engagementId\n      activityId\n      parentEngagementId\n      createdAt\n      updatedAt\n    }\n    commentedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "CreateMentionUserMembership";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation CreateMentionUserMembership($input: CreateMentionUserMembershipInput!, $condition: ModelMentionUserMembershipConditionInput) {\n  createMentionUserMembership(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    commentId\n    mentionedUserId\n    isAnnouncement\n    commentedById\n    createdAt\n    updatedAt\n    comment {\n      __typename\n      id\n      accountId\n      ownerId\n      body\n      engagementId\n      activityId\n      parentEngagementId\n      createdAt\n      updatedAt\n    }\n    commentedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private ModelMentionUserMembershipConditionInput condition;
        private CreateMentionUserMembershipInput input;

        public CreateMentionUserMembershipMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new CreateMentionUserMembershipMutation(this.input, this.condition);
        }

        public Builder condition(ModelMentionUserMembershipConditionInput modelMentionUserMembershipConditionInput) {
            this.condition = modelMentionUserMembershipConditionInput;
            return this;
        }

        public Builder input(CreateMentionUserMembershipInput createMentionUserMembershipInput) {
            this.input = createMentionUserMembershipInput;
            return this;
        }
    }

    public static class Comment {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final String activityId;
        final String body;
        final String createdAt;
        final String engagementId;
        final String id;
        final String ownerId;
        final String parentEngagementId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<Comment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Comment map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = Comment.$responseFields;
                return new Comment(responseReader.readString(responseFieldArr[0]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readString(responseFieldArr[4]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[5]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[9]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("ownerId", "ownerId", null, false, customType, Collections.emptyList()), ResponseField.forString("body", "body", null, false, Collections.emptyList()), ResponseField.forCustomType("engagementId", "engagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("activityId", "activityId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("parentEngagementId", "parentEngagementId", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList())};
        }

        public Comment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.ownerId = (String) Utils.checkNotNull(str4, "ownerId == null");
            this.body = (String) Utils.checkNotNull(str5, "body == null");
            this.engagementId = str6;
            this.activityId = str7;
            this.parentEngagementId = str8;
            this.createdAt = str9;
            this.updatedAt = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public String activityId() {
            return this.activityId;
        }

        public String body() {
            return this.body;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public String engagementId() {
            return this.engagementId;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Comment)) {
                return false;
            }
            Comment comment = (Comment) obj;
            if (this.__typename.equals(comment.__typename) && this.id.equals(comment.id) && this.accountId.equals(comment.accountId) && this.ownerId.equals(comment.ownerId) && this.body.equals(comment.body) && ((str = this.engagementId) != null ? str.equals(comment.engagementId) : comment.engagementId == null) && ((str2 = this.activityId) != null ? str2.equals(comment.activityId) : comment.activityId == null) && ((str3 = this.parentEngagementId) != null ? str3.equals(comment.parentEngagementId) : comment.parentEngagementId == null) && ((str4 = this.createdAt) != null ? str4.equals(comment.createdAt) : comment.createdAt == null)) {
                String str5 = this.updatedAt;
                String str6 = comment.updatedAt;
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
                int iHashCode = (((((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.ownerId.hashCode()) * 1000003) ^ this.body.hashCode()) * 1000003;
                String str = this.engagementId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.activityId;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.parentEngagementId;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.createdAt;
                int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.updatedAt;
                this.$hashCode = iHashCode5 ^ (str5 != null ? str5.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.Comment.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = Comment.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], Comment.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], Comment.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], Comment.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], Comment.this.ownerId);
                    responseWriter.writeString(responseFieldArr[4], Comment.this.body);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], Comment.this.engagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], Comment.this.activityId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], Comment.this.parentEngagementId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], Comment.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], Comment.this.updatedAt);
                }
            };
        }

        public String ownerId() {
            return this.ownerId;
        }

        public String parentEngagementId() {
            return this.parentEngagementId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Comment{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", ownerId=" + this.ownerId + ", body=" + this.body + ", engagementId=" + this.engagementId + ", activityId=" + this.activityId + ", parentEngagementId=" + this.parentEngagementId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class CommentedBy {
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

        public static final class Mapper implements ResponseFieldMapper<CommentedBy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CommentedBy map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CommentedBy.$responseFields;
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
                return new CommentedBy(string, str, addedSourceTypeValueOf, string3, string4, str2, bool, str3, bool2, str4, bool3, string5 != null ? UserRegistrationStatus.valueOf(string5) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[12]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[13]), responseReader.readString(responseFieldArr[14]), responseReader.readString(responseFieldArr[15]), responseReader.readString(responseFieldArr[16]), responseReader.readString(responseFieldArr[17]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[18]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[19]));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSPHONE;
            CustomType customType3 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forString("addedSourceType", "addedSourceType", null, false, Collections.emptyList()), ResponseField.forString("name", "name", null, false, Collections.emptyList()), ResponseField.forString("profilePictureUrl", "profilePictureUrl", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredEmail", "registeredEmail", null, true, CustomType.AWSEMAIL, Collections.emptyList()), ResponseField.forBoolean("registeredEmailVerified", "registeredEmailVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("registeredNumber", "registeredNumber", null, false, customType2, Collections.emptyList()), ResponseField.forBoolean("registeredNumberVerified", "registeredNumberVerified", null, true, Collections.emptyList()), ResponseField.forCustomType("secondaryNumber", "secondaryNumber", null, true, customType2, Collections.emptyList()), ResponseField.forBoolean("secondaryNumberVerified", "secondaryNumberVerified", null, true, Collections.emptyList()), ResponseField.forString("userRegistrationStatus", "userRegistrationStatus", null, false, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountWeb", "lastSelectedAccountWeb", null, true, customType, Collections.emptyList()), ResponseField.forCustomType("lastSelectedAccountApp", "lastSelectedAccountApp", null, true, customType, Collections.emptyList()), ResponseField.forString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, RemoteConfigConstants.RequestFieldKey.APP_VERSION, null, true, Collections.emptyList()), ResponseField.forString("deviceModel", "deviceModel", null, true, Collections.emptyList()), ResponseField.forString("deviceManufacturer", "deviceManufacturer", null, true, Collections.emptyList()), ResponseField.forString("androidVersionRelease", "androidVersionRelease", null, true, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType3, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType3, Collections.emptyList())};
        }

        public CommentedBy(String str, String str2, AddedSourceType addedSourceType, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, String str7, Boolean bool3, UserRegistrationStatus userRegistrationStatus, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
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
            if (!(obj instanceof CommentedBy)) {
                return false;
            }
            CommentedBy commentedBy = (CommentedBy) obj;
            if (this.__typename.equals(commentedBy.__typename) && this.id.equals(commentedBy.id) && this.addedSourceType.equals(commentedBy.addedSourceType) && this.name.equals(commentedBy.name) && ((str = this.profilePictureUrl) != null ? str.equals(commentedBy.profilePictureUrl) : commentedBy.profilePictureUrl == null) && ((str2 = this.registeredEmail) != null ? str2.equals(commentedBy.registeredEmail) : commentedBy.registeredEmail == null) && ((bool = this.registeredEmailVerified) != null ? bool.equals(commentedBy.registeredEmailVerified) : commentedBy.registeredEmailVerified == null) && this.registeredNumber.equals(commentedBy.registeredNumber) && ((bool2 = this.registeredNumberVerified) != null ? bool2.equals(commentedBy.registeredNumberVerified) : commentedBy.registeredNumberVerified == null) && ((str3 = this.secondaryNumber) != null ? str3.equals(commentedBy.secondaryNumber) : commentedBy.secondaryNumber == null) && ((bool3 = this.secondaryNumberVerified) != null ? bool3.equals(commentedBy.secondaryNumberVerified) : commentedBy.secondaryNumberVerified == null) && this.userRegistrationStatus.equals(commentedBy.userRegistrationStatus) && ((str4 = this.lastSelectedAccountWeb) != null ? str4.equals(commentedBy.lastSelectedAccountWeb) : commentedBy.lastSelectedAccountWeb == null) && ((str5 = this.lastSelectedAccountApp) != null ? str5.equals(commentedBy.lastSelectedAccountApp) : commentedBy.lastSelectedAccountApp == null) && ((str6 = this.appVersion) != null ? str6.equals(commentedBy.appVersion) : commentedBy.appVersion == null) && ((str7 = this.deviceModel) != null ? str7.equals(commentedBy.deviceModel) : commentedBy.deviceModel == null) && ((str8 = this.deviceManufacturer) != null ? str8.equals(commentedBy.deviceManufacturer) : commentedBy.deviceManufacturer == null) && ((str9 = this.androidVersionRelease) != null ? str9.equals(commentedBy.androidVersionRelease) : commentedBy.androidVersionRelease == null) && ((str10 = this.createdAt) != null ? str10.equals(commentedBy.createdAt) : commentedBy.createdAt == null)) {
                String str11 = this.updatedAt;
                String str12 = commentedBy.updatedAt;
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
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.CommentedBy.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CommentedBy.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CommentedBy.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CommentedBy.this.id);
                    responseWriter.writeString(responseFieldArr[2], CommentedBy.this.addedSourceType.name());
                    responseWriter.writeString(responseFieldArr[3], CommentedBy.this.name);
                    responseWriter.writeString(responseFieldArr[4], CommentedBy.this.profilePictureUrl);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[5], CommentedBy.this.registeredEmail);
                    responseWriter.writeBoolean(responseFieldArr[6], CommentedBy.this.registeredEmailVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CommentedBy.this.registeredNumber);
                    responseWriter.writeBoolean(responseFieldArr[8], CommentedBy.this.registeredNumberVerified);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[9], CommentedBy.this.secondaryNumber);
                    responseWriter.writeBoolean(responseFieldArr[10], CommentedBy.this.secondaryNumberVerified);
                    responseWriter.writeString(responseFieldArr[11], CommentedBy.this.userRegistrationStatus.name());
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[12], CommentedBy.this.lastSelectedAccountWeb);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[13], CommentedBy.this.lastSelectedAccountApp);
                    responseWriter.writeString(responseFieldArr[14], CommentedBy.this.appVersion);
                    responseWriter.writeString(responseFieldArr[15], CommentedBy.this.deviceModel);
                    responseWriter.writeString(responseFieldArr[16], CommentedBy.this.deviceManufacturer);
                    responseWriter.writeString(responseFieldArr[17], CommentedBy.this.androidVersionRelease);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[18], CommentedBy.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[19], CommentedBy.this.updatedAt);
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
                this.$toString = "CommentedBy{__typename=" + this.__typename + ", id=" + this.id + ", addedSourceType=" + this.addedSourceType + ", name=" + this.name + ", profilePictureUrl=" + this.profilePictureUrl + ", registeredEmail=" + this.registeredEmail + ", registeredEmailVerified=" + this.registeredEmailVerified + ", registeredNumber=" + this.registeredNumber + ", registeredNumberVerified=" + this.registeredNumberVerified + ", secondaryNumber=" + this.secondaryNumber + ", secondaryNumberVerified=" + this.secondaryNumberVerified + ", userRegistrationStatus=" + this.userRegistrationStatus + ", lastSelectedAccountWeb=" + this.lastSelectedAccountWeb + ", lastSelectedAccountApp=" + this.lastSelectedAccountApp + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", androidVersionRelease=" + this.androidVersionRelease + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
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

    public static class CreateMentionUserMembership {
        static final ResponseField[] $responseFields;
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String accountId;
        final Comment comment;
        final String commentId;
        final CommentedBy commentedBy;
        final String commentedById;
        final String createdAt;
        final String id;
        final Announcement isAnnouncement;
        final String mentionedUserId;
        final String updatedAt;

        public static final class Mapper implements ResponseFieldMapper<CreateMentionUserMembership> {
            final Comment.Mapper commentFieldMapper = new Comment.Mapper();
            final CommentedBy.Mapper commentedByFieldMapper = new CommentedBy.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public CreateMentionUserMembership map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = CreateMentionUserMembership.$responseFields;
                String string = responseReader.readString(responseFieldArr[0]);
                String str = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[1]);
                String str2 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[2]);
                String str3 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]);
                String str4 = (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[4]);
                String string2 = responseReader.readString(responseFieldArr[5]);
                return new CreateMentionUserMembership(string, str, str2, str3, str4, string2 != null ? Announcement.valueOf(string2) : null, (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[6]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[7]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[8]), (Comment) responseReader.readObject(responseFieldArr[9], new ResponseReader.ObjectReader<Comment>() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.CreateMentionUserMembership.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public Comment read(ResponseReader responseReader2) {
                        return Mapper.this.commentFieldMapper.map(responseReader2);
                    }
                }), (CommentedBy) responseReader.readObject(responseFieldArr[10], new ResponseReader.ObjectReader<CommentedBy>() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.CreateMentionUserMembership.Mapper.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CommentedBy read(ResponseReader responseReader2) {
                        return Mapper.this.commentedByFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        static {
            CustomType customType = CustomType.ID;
            CustomType customType2 = CustomType.AWSDATETIME;
            $responseFields = new ResponseField[]{ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forCustomType(OutcomeConstants.OUTCOME_ID, OutcomeConstants.OUTCOME_ID, null, false, customType, Collections.emptyList()), ResponseField.forCustomType("accountId", "accountId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("commentId", "commentId", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("mentionedUserId", "mentionedUserId", null, true, customType, Collections.emptyList()), ResponseField.forString("isAnnouncement", "isAnnouncement", null, true, Collections.emptyList()), ResponseField.forCustomType("commentedById", "commentedById", null, false, customType, Collections.emptyList()), ResponseField.forCustomType("createdAt", "createdAt", null, true, customType2, Collections.emptyList()), ResponseField.forCustomType("updatedAt", "updatedAt", null, true, customType2, Collections.emptyList()), ResponseField.forObject(ClientCookie.COMMENT_ATTR, ClientCookie.COMMENT_ATTR, null, true, Collections.emptyList()), ResponseField.forObject("commentedBy", "commentedBy", null, true, Collections.emptyList())};
        }

        public CreateMentionUserMembership(String str, String str2, String str3, String str4, String str5, Announcement announcement, String str6, String str7, String str8, Comment comment, CommentedBy commentedBy) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.id = (String) Utils.checkNotNull(str2, "id == null");
            this.accountId = (String) Utils.checkNotNull(str3, "accountId == null");
            this.commentId = (String) Utils.checkNotNull(str4, "commentId == null");
            this.mentionedUserId = str5;
            this.isAnnouncement = announcement;
            this.commentedById = (String) Utils.checkNotNull(str6, "commentedById == null");
            this.createdAt = str7;
            this.updatedAt = str8;
            this.comment = comment;
            this.commentedBy = commentedBy;
        }

        public String __typename() {
            return this.__typename;
        }

        public String accountId() {
            return this.accountId;
        }

        public Comment comment() {
            return this.comment;
        }

        public String commentId() {
            return this.commentId;
        }

        public CommentedBy commentedBy() {
            return this.commentedBy;
        }

        public String commentedById() {
            return this.commentedById;
        }

        public String createdAt() {
            return this.createdAt;
        }

        public boolean equals(Object obj) {
            String str;
            Announcement announcement;
            String str2;
            String str3;
            Comment comment;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CreateMentionUserMembership)) {
                return false;
            }
            CreateMentionUserMembership createMentionUserMembership = (CreateMentionUserMembership) obj;
            if (this.__typename.equals(createMentionUserMembership.__typename) && this.id.equals(createMentionUserMembership.id) && this.accountId.equals(createMentionUserMembership.accountId) && this.commentId.equals(createMentionUserMembership.commentId) && ((str = this.mentionedUserId) != null ? str.equals(createMentionUserMembership.mentionedUserId) : createMentionUserMembership.mentionedUserId == null) && ((announcement = this.isAnnouncement) != null ? announcement.equals(createMentionUserMembership.isAnnouncement) : createMentionUserMembership.isAnnouncement == null) && this.commentedById.equals(createMentionUserMembership.commentedById) && ((str2 = this.createdAt) != null ? str2.equals(createMentionUserMembership.createdAt) : createMentionUserMembership.createdAt == null) && ((str3 = this.updatedAt) != null ? str3.equals(createMentionUserMembership.updatedAt) : createMentionUserMembership.updatedAt == null) && ((comment = this.comment) != null ? comment.equals(createMentionUserMembership.comment) : createMentionUserMembership.comment == null)) {
                CommentedBy commentedBy = this.commentedBy;
                CommentedBy commentedBy2 = createMentionUserMembership.commentedBy;
                if (commentedBy == null) {
                    if (commentedBy2 == null) {
                        return true;
                    }
                } else if (commentedBy.equals(commentedBy2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (((((((this.__typename.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.accountId.hashCode()) * 1000003) ^ this.commentId.hashCode()) * 1000003;
                String str = this.mentionedUserId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Announcement announcement = this.isAnnouncement;
                int iHashCode3 = (((iHashCode2 ^ (announcement == null ? 0 : announcement.hashCode())) * 1000003) ^ this.commentedById.hashCode()) * 1000003;
                String str2 = this.createdAt;
                int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.updatedAt;
                int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Comment comment = this.comment;
                int iHashCode6 = (iHashCode5 ^ (comment == null ? 0 : comment.hashCode())) * 1000003;
                CommentedBy commentedBy = this.commentedBy;
                this.$hashCode = iHashCode6 ^ (commentedBy != null ? commentedBy.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public String id() {
            return this.id;
        }

        public Announcement isAnnouncement() {
            return this.isAnnouncement;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.CreateMentionUserMembership.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = CreateMentionUserMembership.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], CreateMentionUserMembership.this.__typename);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[1], CreateMentionUserMembership.this.id);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[2], CreateMentionUserMembership.this.accountId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], CreateMentionUserMembership.this.commentId);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[4], CreateMentionUserMembership.this.mentionedUserId);
                    ResponseField responseField = responseFieldArr[5];
                    Announcement announcement = CreateMentionUserMembership.this.isAnnouncement;
                    responseWriter.writeString(responseField, announcement != null ? announcement.name() : null);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[6], CreateMentionUserMembership.this.commentedById);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[7], CreateMentionUserMembership.this.createdAt);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[8], CreateMentionUserMembership.this.updatedAt);
                    ResponseField responseField2 = responseFieldArr[9];
                    Comment comment = CreateMentionUserMembership.this.comment;
                    responseWriter.writeObject(responseField2, comment != null ? comment.marshaller() : null);
                    ResponseField responseField3 = responseFieldArr[10];
                    CommentedBy commentedBy = CreateMentionUserMembership.this.commentedBy;
                    responseWriter.writeObject(responseField3, commentedBy != null ? commentedBy.marshaller() : null);
                }
            };
        }

        public String mentionedUserId() {
            return this.mentionedUserId;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CreateMentionUserMembership{__typename=" + this.__typename + ", id=" + this.id + ", accountId=" + this.accountId + ", commentId=" + this.commentId + ", mentionedUserId=" + this.mentionedUserId + ", isAnnouncement=" + this.isAnnouncement + ", commentedById=" + this.commentedById + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", comment=" + this.comment + ", commentedBy=" + this.commentedBy + "}";
            }
            return this.$toString;
        }

        public String updatedAt() {
            return this.updatedAt;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("createMentionUserMembership", "createMentionUserMembership", new UnmodifiableMapBuilder(2).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).put("condition", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "condition").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final CreateMentionUserMembership createMentionUserMembership;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final CreateMentionUserMembership.Mapper createMentionUserMembershipFieldMapper = new CreateMentionUserMembership.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((CreateMentionUserMembership) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<CreateMentionUserMembership>() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public CreateMentionUserMembership read(ResponseReader responseReader2) {
                        return Mapper.this.createMentionUserMembershipFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(CreateMentionUserMembership createMentionUserMembership) {
            this.createMentionUserMembership = createMentionUserMembership;
        }

        public CreateMentionUserMembership createMentionUserMembership() {
            return this.createMentionUserMembership;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            CreateMentionUserMembership createMentionUserMembership = this.createMentionUserMembership;
            CreateMentionUserMembership createMentionUserMembership2 = ((Data) obj).createMentionUserMembership;
            return createMentionUserMembership == null ? createMentionUserMembership2 == null : createMentionUserMembership.equals(createMentionUserMembership2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                CreateMentionUserMembership createMentionUserMembership = this.createMentionUserMembership;
                this.$hashCode = (createMentionUserMembership == null ? 0 : createMentionUserMembership.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    CreateMentionUserMembership createMentionUserMembership = Data.this.createMentionUserMembership;
                    responseWriter.writeObject(responseField, createMentionUserMembership != null ? createMentionUserMembership.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{createMentionUserMembership=" + this.createMentionUserMembership + "}";
            }
            return this.$toString;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final ModelMentionUserMembershipConditionInput condition;
        private final CreateMentionUserMembershipInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(CreateMentionUserMembershipInput createMentionUserMembershipInput, ModelMentionUserMembershipConditionInput modelMentionUserMembershipConditionInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = createMentionUserMembershipInput;
            this.condition = modelMentionUserMembershipConditionInput;
            linkedHashMap.put("input", createMentionUserMembershipInput);
            linkedHashMap.put("condition", modelMentionUserMembershipConditionInput);
        }

        public ModelMentionUserMembershipConditionInput condition() {
            return this.condition;
        }

        public CreateMentionUserMembershipInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.CreateMentionUserMembershipMutation.Variables.1
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

    public CreateMentionUserMembershipMutation(CreateMentionUserMembershipInput createMentionUserMembershipInput, ModelMentionUserMembershipConditionInput modelMentionUserMembershipConditionInput) {
        Utils.checkNotNull(createMentionUserMembershipInput, "input == null");
        this.variables = new Variables(createMentionUserMembershipInput, modelMentionUserMembershipConditionInput);
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
        return "b34ac456bdd636f1b4b733799545e8c8a7b1c3421d71aac0a591f10e6411814f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation CreateMentionUserMembership($input: CreateMentionUserMembershipInput!, $condition: ModelMentionUserMembershipConditionInput) {\n  createMentionUserMembership(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    commentId\n    mentionedUserId\n    isAnnouncement\n    commentedById\n    createdAt\n    updatedAt\n    comment {\n      __typename\n      id\n      accountId\n      ownerId\n      body\n      engagementId\n      activityId\n      parentEngagementId\n      createdAt\n      updatedAt\n    }\n    commentedBy {\n      __typename\n      id\n      addedSourceType\n      name\n      profilePictureUrl\n      registeredEmail\n      registeredEmailVerified\n      registeredNumber\n      registeredNumberVerified\n      secondaryNumber\n      secondaryNumberVerified\n      userRegistrationStatus\n      lastSelectedAccountWeb\n      lastSelectedAccountApp\n      appVersion\n      deviceModel\n      deviceManufacturer\n      androidVersionRelease\n      createdAt\n      updatedAt\n    }\n  }\n}";
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
