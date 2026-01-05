package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteSavedTableViewsInput implements InputType {
    private final String accountId;
    private final String ownerId;
    private final String tableName;
    private final String viewName;

    public static final class Builder {
        private String accountId;
        private String ownerId;
        private String tableName;
        private String viewName;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteSavedTableViewsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.tableName, "tableName == null");
            Utils.checkNotNull(this.viewName, "viewName == null");
            return new DeleteSavedTableViewsInput(this.accountId, this.ownerId, this.tableName, this.viewName);
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        public Builder tableName(String str) {
            this.tableName = str;
            return this;
        }

        public Builder viewName(String str) {
            this.viewName = str;
            return this;
        }
    }

    public DeleteSavedTableViewsInput(String str, String str2, String str3, String str4) {
        this.accountId = str;
        this.ownerId = str2;
        this.tableName = str3;
        this.viewName = str4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteSavedTableViewsInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", DeleteSavedTableViewsInput.this.accountId);
                inputFieldWriter.writeString("ownerId", DeleteSavedTableViewsInput.this.ownerId);
                inputFieldWriter.writeString("tableName", DeleteSavedTableViewsInput.this.tableName);
                inputFieldWriter.writeString("viewName", DeleteSavedTableViewsInput.this.viewName);
            }
        };
    }

    public String ownerId() {
        return this.ownerId;
    }

    public String tableName() {
        return this.tableName;
    }

    public String viewName() {
        return this.viewName;
    }
}
