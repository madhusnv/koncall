package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelNoteAdditionMethodInput implements InputType {
    private final Input<NoteAdditionMethod> eq;
    private final Input<NoteAdditionMethod> ne;

    public static final class Builder {
        private Input<NoteAdditionMethod> eq = Input.absent();
        private Input<NoteAdditionMethod> ne = Input.absent();

        public ModelNoteAdditionMethodInput build() {
            return new ModelNoteAdditionMethodInput(this.eq, this.ne);
        }

        public Builder eq(NoteAdditionMethod noteAdditionMethod) {
            this.eq = Input.fromNullable(noteAdditionMethod);
            return this;
        }

        public Builder ne(NoteAdditionMethod noteAdditionMethod) {
            this.ne = Input.fromNullable(noteAdditionMethod);
            return this;
        }
    }

    public ModelNoteAdditionMethodInput(Input<NoteAdditionMethod> input, Input<NoteAdditionMethod> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public NoteAdditionMethod eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelNoteAdditionMethodInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelNoteAdditionMethodInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelNoteAdditionMethodInput.this.eq.value != 0 ? ((NoteAdditionMethod) ModelNoteAdditionMethodInput.this.eq.value).name() : null);
                }
                if (ModelNoteAdditionMethodInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelNoteAdditionMethodInput.this.ne.value != 0 ? ((NoteAdditionMethod) ModelNoteAdditionMethodInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public NoteAdditionMethod ne() {
        return this.ne.value;
    }
}
