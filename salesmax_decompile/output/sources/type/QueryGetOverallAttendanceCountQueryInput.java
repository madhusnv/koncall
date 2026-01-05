package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class QueryGetOverallAttendanceCountQueryInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> fromDate;
    private final Input<String> toDate;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<String> fromDate = Input.absent();
        private Input<String> toDate = Input.absent();
        private Input<String> userId = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public QueryGetOverallAttendanceCountQueryInput build() {
            return new QueryGetOverallAttendanceCountQueryInput(this.accountId, this.fromDate, this.toDate, this.userId);
        }

        public Builder fromDate(String str) {
            this.fromDate = Input.fromNullable(str);
            return this;
        }

        public Builder toDate(String str) {
            this.toDate = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public QueryGetOverallAttendanceCountQueryInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4) {
        this.accountId = input;
        this.fromDate = input2;
        this.toDate = input3;
        this.userId = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String fromDate() {
        return this.fromDate.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryGetOverallAttendanceCountQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryGetOverallAttendanceCountQueryInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) QueryGetOverallAttendanceCountQueryInput.this.accountId.value);
                }
                if (QueryGetOverallAttendanceCountQueryInput.this.fromDate.defined) {
                    inputFieldWriter.writeString("fromDate", (String) QueryGetOverallAttendanceCountQueryInput.this.fromDate.value);
                }
                if (QueryGetOverallAttendanceCountQueryInput.this.toDate.defined) {
                    inputFieldWriter.writeString("toDate", (String) QueryGetOverallAttendanceCountQueryInput.this.toDate.value);
                }
                if (QueryGetOverallAttendanceCountQueryInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) QueryGetOverallAttendanceCountQueryInput.this.userId.value);
                }
            }
        };
    }

    public String toDate() {
        return this.toDate.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
