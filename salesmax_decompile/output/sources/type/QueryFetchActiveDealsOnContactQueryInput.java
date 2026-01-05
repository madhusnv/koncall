package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class QueryFetchActiveDealsOnContactQueryInput implements InputType {
    private final String accountId;
    private final String contactId;

    public static final class Builder {
        private String accountId;
        private String contactId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public QueryFetchActiveDealsOnContactQueryInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            return new QueryFetchActiveDealsOnContactQueryInput(this.accountId, this.contactId);
        }

        public Builder contactId(String str) {
            this.contactId = str;
            return this;
        }
    }

    public QueryFetchActiveDealsOnContactQueryInput(String str, String str2) {
        this.accountId = str;
        this.contactId = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String contactId() {
        return this.contactId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryFetchActiveDealsOnContactQueryInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", QueryFetchActiveDealsOnContactQueryInput.this.accountId);
                inputFieldWriter.writeString("contactId", QueryFetchActiveDealsOnContactQueryInput.this.contactId);
            }
        };
    }
}
