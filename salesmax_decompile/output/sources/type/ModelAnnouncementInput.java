package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAnnouncementInput implements InputType {
    private final Input<Announcement> eq;
    private final Input<Announcement> ne;

    public static final class Builder {
        private Input<Announcement> eq = Input.absent();
        private Input<Announcement> ne = Input.absent();

        public ModelAnnouncementInput build() {
            return new ModelAnnouncementInput(this.eq, this.ne);
        }

        public Builder eq(Announcement announcement) {
            this.eq = Input.fromNullable(announcement);
            return this;
        }

        public Builder ne(Announcement announcement) {
            this.ne = Input.fromNullable(announcement);
            return this;
        }
    }

    public ModelAnnouncementInput(Input<Announcement> input, Input<Announcement> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Announcement eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAnnouncementInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAnnouncementInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelAnnouncementInput.this.eq.value != 0 ? ((Announcement) ModelAnnouncementInput.this.eq.value).name() : null);
                }
                if (ModelAnnouncementInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelAnnouncementInput.this.ne.value != 0 ? ((Announcement) ModelAnnouncementInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public Announcement ne() {
        return this.ne.value;
    }
}
