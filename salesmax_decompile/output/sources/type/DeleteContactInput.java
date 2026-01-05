package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class DeleteContactInput implements InputType {
    private final Input<Boolean> doNotTrack;
    private final String id;

    public static final class Builder {
        private Input<Boolean> doNotTrack = Input.absent();
        private String id;

        public DeleteContactInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new DeleteContactInput(this.id, this.doNotTrack);
        }

        public Builder doNotTrack(Boolean bool) {
            this.doNotTrack = Input.fromNullable(bool);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    public DeleteContactInput(String str, Input<Boolean> input) {
        this.id = str;
        this.doNotTrack = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean doNotTrack() {
        return this.doNotTrack.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteContactInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, DeleteContactInput.this.id);
                if (DeleteContactInput.this.doNotTrack.defined) {
                    inputFieldWriter.writeBoolean("doNotTrack", (Boolean) DeleteContactInput.this.doNotTrack.value);
                }
            }
        };
    }
}
