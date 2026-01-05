package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelScopeLevelInput implements InputType {
    private final Input<ScopeLevel> eq;
    private final Input<ScopeLevel> ne;

    public static final class Builder {
        private Input<ScopeLevel> eq = Input.absent();
        private Input<ScopeLevel> ne = Input.absent();

        public ModelScopeLevelInput build() {
            return new ModelScopeLevelInput(this.eq, this.ne);
        }

        public Builder eq(ScopeLevel scopeLevel) {
            this.eq = Input.fromNullable(scopeLevel);
            return this;
        }

        public Builder ne(ScopeLevel scopeLevel) {
            this.ne = Input.fromNullable(scopeLevel);
            return this;
        }
    }

    public ModelScopeLevelInput(Input<ScopeLevel> input, Input<ScopeLevel> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ScopeLevel eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelScopeLevelInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelScopeLevelInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelScopeLevelInput.this.eq.value != 0 ? ((ScopeLevel) ModelScopeLevelInput.this.eq.value).name() : null);
                }
                if (ModelScopeLevelInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelScopeLevelInput.this.ne.value != 0 ? ((ScopeLevel) ModelScopeLevelInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ScopeLevel ne() {
        return this.ne.value;
    }
}
