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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import type.CustomType;
import type.VerifyEmailInput;

/* loaded from: classes4.dex */
public final class VerifyEmailMutation implements Mutation<Data, Data, Variables> {
    public static final String OPERATION_DEFINITION = "mutation VerifyEmail($input: VerifyEmailInput!) {\n  verifyEmail(input: $input) {\n    __typename\n    verifyId\n    emailToVerify\n    phoneToVerify\n    isVerified\n    onErrorMessage\n  }\n}";
    private static final OperationName OPERATION_NAME = new OperationName() { // from class: com.amazonaws.amplify.generated.graphql.VerifyEmailMutation.1
        @Override // com.apollographql.apollo.api.OperationName
        public String name() {
            return "VerifyEmail";
        }
    };
    public static final String QUERY_DOCUMENT = "mutation VerifyEmail($input: VerifyEmailInput!) {\n  verifyEmail(input: $input) {\n    __typename\n    verifyId\n    emailToVerify\n    phoneToVerify\n    isVerified\n    onErrorMessage\n  }\n}";
    private final Variables variables;

    public static final class Builder {
        private VerifyEmailInput input;

        public VerifyEmailMutation build() {
            Utils.checkNotNull(this.input, "input == null");
            return new VerifyEmailMutation(this.input);
        }

        public Builder input(VerifyEmailInput verifyEmailInput) {
            this.input = verifyEmailInput;
            return this;
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("verifyEmail", "verifyEmail", new UnmodifiableMapBuilder(1).put("input", new UnmodifiableMapBuilder(2).put(ResponseField.VARIABLE_IDENTIFIER_KEY, ResponseField.VARIABLE_IDENTIFIER_VALUE).put(ResponseField.VARIABLE_NAME_KEY, "input").build()).build(), true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final VerifyEmail verifyEmail;

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final VerifyEmail.Mapper verifyEmailFieldMapper = new VerifyEmail.Mapper();

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public Data map(ResponseReader responseReader) {
                return new Data((VerifyEmail) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<VerifyEmail>() { // from class: com.amazonaws.amplify.generated.graphql.VerifyEmailMutation.Data.Mapper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.apollographql.apollo.api.ResponseReader.ObjectReader
                    public VerifyEmail read(ResponseReader responseReader2) {
                        return Mapper.this.verifyEmailFieldMapper.map(responseReader2);
                    }
                }));
            }
        }

        public Data(VerifyEmail verifyEmail) {
            this.verifyEmail = verifyEmail;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            VerifyEmail verifyEmail = this.verifyEmail;
            VerifyEmail verifyEmail2 = ((Data) obj).verifyEmail;
            return verifyEmail == null ? verifyEmail2 == null : verifyEmail.equals(verifyEmail2);
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                VerifyEmail verifyEmail = this.verifyEmail;
                this.$hashCode = (verifyEmail == null ? 0 : verifyEmail.hashCode()) ^ 1000003;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        @Override // com.apollographql.apollo.api.Operation.Data
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.VerifyEmailMutation.Data.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField responseField = Data.$responseFields[0];
                    VerifyEmail verifyEmail = Data.this.verifyEmail;
                    responseWriter.writeObject(responseField, verifyEmail != null ? verifyEmail.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{verifyEmail=" + this.verifyEmail + "}";
            }
            return this.$toString;
        }

        public VerifyEmail verifyEmail() {
            return this.verifyEmail;
        }
    }

    public static final class Variables extends Operation.Variables {
        private final VerifyEmailInput input;
        private final transient Map<String, Object> valueMap;

        public Variables(VerifyEmailInput verifyEmailInput) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.input = verifyEmailInput;
            linkedHashMap.put("input", verifyEmailInput);
        }

        public VerifyEmailInput input() {
            return this.input;
        }

        @Override // com.apollographql.apollo.api.Operation.Variables
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.VerifyEmailMutation.Variables.1
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

    public static class VerifyEmail {
        static final ResponseField[] $responseFields = {ResponseField.forString(ModelWithMetadataAdapter.TYPE_NAME, ModelWithMetadataAdapter.TYPE_NAME, null, false, Collections.emptyList()), ResponseField.forString("verifyId", "verifyId", null, true, Collections.emptyList()), ResponseField.forString("emailToVerify", "emailToVerify", null, true, Collections.emptyList()), ResponseField.forCustomType("phoneToVerify", "phoneToVerify", null, true, CustomType.AWSPHONE, Collections.emptyList()), ResponseField.forBoolean("isVerified", "isVerified", null, true, Collections.emptyList()), ResponseField.forString("onErrorMessage", "onErrorMessage", null, true, Collections.emptyList())};
        private volatile int $hashCode;
        private volatile boolean $hashCodeMemoized;
        private volatile String $toString;
        final String __typename;
        final String emailToVerify;
        final Boolean isVerified;
        final String onErrorMessage;
        final String phoneToVerify;
        final String verifyId;

        public static final class Mapper implements ResponseFieldMapper<VerifyEmail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.ResponseFieldMapper
            public VerifyEmail map(ResponseReader responseReader) {
                ResponseField[] responseFieldArr = VerifyEmail.$responseFields;
                return new VerifyEmail(responseReader.readString(responseFieldArr[0]), responseReader.readString(responseFieldArr[1]), responseReader.readString(responseFieldArr[2]), (String) responseReader.readCustomType((ResponseField.CustomTypeField) responseFieldArr[3]), responseReader.readBoolean(responseFieldArr[4]), responseReader.readString(responseFieldArr[5]));
            }
        }

        public VerifyEmail(String str, String str2, String str3, String str4, Boolean bool, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.verifyId = str2;
            this.emailToVerify = str3;
            this.phoneToVerify = str4;
            this.isVerified = bool;
            this.onErrorMessage = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String emailToVerify() {
            return this.emailToVerify;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Boolean bool;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VerifyEmail)) {
                return false;
            }
            VerifyEmail verifyEmail = (VerifyEmail) obj;
            if (this.__typename.equals(verifyEmail.__typename) && ((str = this.verifyId) != null ? str.equals(verifyEmail.verifyId) : verifyEmail.verifyId == null) && ((str2 = this.emailToVerify) != null ? str2.equals(verifyEmail.emailToVerify) : verifyEmail.emailToVerify == null) && ((str3 = this.phoneToVerify) != null ? str3.equals(verifyEmail.phoneToVerify) : verifyEmail.phoneToVerify == null) && ((bool = this.isVerified) != null ? bool.equals(verifyEmail.isVerified) : verifyEmail.isVerified == null)) {
                String str4 = this.onErrorMessage;
                String str5 = verifyEmail.onErrorMessage;
                if (str4 == null) {
                    if (str5 == null) {
                        return true;
                    }
                } else if (str4.equals(str5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int iHashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.verifyId;
                int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.emailToVerify;
                int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.phoneToVerify;
                int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool = this.isVerified;
                int iHashCode5 = (iHashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str4 = this.onErrorMessage;
                this.$hashCode = iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public Boolean isVerified() {
            return this.isVerified;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() { // from class: com.amazonaws.amplify.generated.graphql.VerifyEmailMutation.VerifyEmail.1
                @Override // com.apollographql.apollo.api.ResponseFieldMarshaller
                public void marshal(ResponseWriter responseWriter) {
                    ResponseField[] responseFieldArr = VerifyEmail.$responseFields;
                    responseWriter.writeString(responseFieldArr[0], VerifyEmail.this.__typename);
                    responseWriter.writeString(responseFieldArr[1], VerifyEmail.this.verifyId);
                    responseWriter.writeString(responseFieldArr[2], VerifyEmail.this.emailToVerify);
                    responseWriter.writeCustom((ResponseField.CustomTypeField) responseFieldArr[3], VerifyEmail.this.phoneToVerify);
                    responseWriter.writeBoolean(responseFieldArr[4], VerifyEmail.this.isVerified);
                    responseWriter.writeString(responseFieldArr[5], VerifyEmail.this.onErrorMessage);
                }
            };
        }

        public String onErrorMessage() {
            return this.onErrorMessage;
        }

        public String phoneToVerify() {
            return this.phoneToVerify;
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "VerifyEmail{__typename=" + this.__typename + ", verifyId=" + this.verifyId + ", emailToVerify=" + this.emailToVerify + ", phoneToVerify=" + this.phoneToVerify + ", isVerified=" + this.isVerified + ", onErrorMessage=" + this.onErrorMessage + "}";
            }
            return this.$toString;
        }

        public String verifyId() {
            return this.verifyId;
        }
    }

    public VerifyEmailMutation(VerifyEmailInput verifyEmailInput) {
        Utils.checkNotNull(verifyEmailInput, "input == null");
        this.variables = new Variables(verifyEmailInput);
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
        return "0d246b6b5a0c3ae6147f78a0986a67803984f93822737559fd164b741650ff93";
    }

    @Override // com.apollographql.apollo.api.Operation
    public String queryDocument() {
        return "mutation VerifyEmail($input: VerifyEmailInput!) {\n  verifyEmail(input: $input) {\n    __typename\n    verifyId\n    emailToVerify\n    phoneToVerify\n    isVerified\n    onErrorMessage\n  }\n}";
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
