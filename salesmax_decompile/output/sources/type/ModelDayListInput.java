package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ModelDayListInput implements InputType {
    private final Input<Day> contains;
    private final Input<List<Day>> eq;
    private final Input<List<Day>> ne;
    private final Input<Day> notContains;

    public static final class Builder {
        private Input<List<Day>> eq = Input.absent();
        private Input<List<Day>> ne = Input.absent();
        private Input<Day> contains = Input.absent();
        private Input<Day> notContains = Input.absent();

        public ModelDayListInput build() {
            return new ModelDayListInput(this.eq, this.ne, this.contains, this.notContains);
        }

        public Builder contains(Day day) {
            this.contains = Input.fromNullable(day);
            return this;
        }

        public Builder eq(List<Day> list) {
            this.eq = Input.fromNullable(list);
            return this;
        }

        public Builder ne(List<Day> list) {
            this.ne = Input.fromNullable(list);
            return this;
        }

        public Builder notContains(Day day) {
            this.notContains = Input.fromNullable(day);
            return this;
        }
    }

    public ModelDayListInput(Input<List<Day>> input, Input<List<Day>> input2, Input<Day> input3, Input<Day> input4) {
        this.eq = input;
        this.ne = input2;
        this.contains = input3;
        this.notContains = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Day contains() {
        return this.contains.value;
    }

    public List<Day> eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDayListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDayListInput.this.eq.defined) {
                    inputFieldWriter.writeList("eq", ModelDayListInput.this.eq.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDayListInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDayListInput.this.eq.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((Day) it.next()).name());
                            }
                        }
                    } : null);
                }
                if (ModelDayListInput.this.ne.defined) {
                    inputFieldWriter.writeList("ne", ModelDayListInput.this.ne.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ModelDayListInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ModelDayListInput.this.ne.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString(((Day) it.next()).name());
                            }
                        }
                    } : null);
                }
                if (ModelDayListInput.this.contains.defined) {
                    inputFieldWriter.writeString("contains", ModelDayListInput.this.contains.value != 0 ? ((Day) ModelDayListInput.this.contains.value).name() : null);
                }
                if (ModelDayListInput.this.notContains.defined) {
                    inputFieldWriter.writeString("notContains", ModelDayListInput.this.notContains.value != 0 ? ((Day) ModelDayListInput.this.notContains.value).name() : null);
                }
            }
        };
    }

    public List<Day> ne() {
        return this.ne.value;
    }

    public Day notContains() {
        return this.notContains.value;
    }
}
