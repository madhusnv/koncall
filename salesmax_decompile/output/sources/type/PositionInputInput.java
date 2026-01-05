package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class PositionInputInput implements InputType {
    private final Input<Integer> height;
    private final Input<Integer> minH;
    private final Input<Integer> minW;
    private final Input<String> selector;
    private final Input<Integer> width;

    /* renamed from: x */
    private final Input<Integer> f58046x;

    /* renamed from: y */
    private final Input<Integer> f58047y;

    public static final class Builder {

        /* renamed from: x */
        private Input<Integer> f58048x = Input.absent();

        /* renamed from: y */
        private Input<Integer> f58049y = Input.absent();
        private Input<Integer> width = Input.absent();
        private Input<Integer> height = Input.absent();
        private Input<Integer> minW = Input.absent();
        private Input<Integer> minH = Input.absent();
        private Input<String> selector = Input.absent();

        public PositionInputInput build() {
            return new PositionInputInput(this.f58048x, this.f58049y, this.width, this.height, this.minW, this.minH, this.selector);
        }

        public Builder height(Integer num) {
            this.height = Input.fromNullable(num);
            return this;
        }

        public Builder minH(Integer num) {
            this.minH = Input.fromNullable(num);
            return this;
        }

        public Builder minW(Integer num) {
            this.minW = Input.fromNullable(num);
            return this;
        }

        public Builder selector(String str) {
            this.selector = Input.fromNullable(str);
            return this;
        }

        public Builder width(Integer num) {
            this.width = Input.fromNullable(num);
            return this;
        }

        /* renamed from: x */
        public Builder m65841x(Integer num) {
            this.f58048x = Input.fromNullable(num);
            return this;
        }

        /* renamed from: y */
        public Builder m65842y(Integer num) {
            this.f58049y = Input.fromNullable(num);
            return this;
        }
    }

    public PositionInputInput(Input<Integer> input, Input<Integer> input2, Input<Integer> input3, Input<Integer> input4, Input<Integer> input5, Input<Integer> input6, Input<String> input7) {
        this.f58046x = input;
        this.f58047y = input2;
        this.width = input3;
        this.height = input4;
        this.minW = input5;
        this.minH = input6;
        this.selector = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer height() {
        return this.height.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.PositionInputInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (PositionInputInput.this.f58046x.defined) {
                    inputFieldWriter.writeInt("x", (Integer) PositionInputInput.this.f58046x.value);
                }
                if (PositionInputInput.this.f58047y.defined) {
                    inputFieldWriter.writeInt("y", (Integer) PositionInputInput.this.f58047y.value);
                }
                if (PositionInputInput.this.width.defined) {
                    inputFieldWriter.writeInt("width", (Integer) PositionInputInput.this.width.value);
                }
                if (PositionInputInput.this.height.defined) {
                    inputFieldWriter.writeInt("height", (Integer) PositionInputInput.this.height.value);
                }
                if (PositionInputInput.this.minW.defined) {
                    inputFieldWriter.writeInt("minW", (Integer) PositionInputInput.this.minW.value);
                }
                if (PositionInputInput.this.minH.defined) {
                    inputFieldWriter.writeInt("minH", (Integer) PositionInputInput.this.minH.value);
                }
                if (PositionInputInput.this.selector.defined) {
                    inputFieldWriter.writeString("selector", (String) PositionInputInput.this.selector.value);
                }
            }
        };
    }

    public Integer minH() {
        return this.minH.value;
    }

    public Integer minW() {
        return this.minW.value;
    }

    public String selector() {
        return this.selector.value;
    }

    public Integer width() {
        return this.width.value;
    }

    /* renamed from: x */
    public Integer m65839x() {
        return this.f58046x.value;
    }

    /* renamed from: y */
    public Integer m65840y() {
        return this.f58047y.value;
    }
}
