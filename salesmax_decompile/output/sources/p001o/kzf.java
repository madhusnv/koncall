package p001o;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.ScalarType;
import com.apollographql.apollo.api.internal.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class kzf implements InputFieldWriter {

    /* renamed from: a */
    public final Comparator f32888a;

    /* renamed from: b */
    public final Map f32889b;

    /* renamed from: o.kzf$a */
    public static class C14944a implements InputFieldWriter.ListItemWriter {

        /* renamed from: a */
        public final Comparator f32890a;

        /* renamed from: b */
        public final List f32891b = new ArrayList();

        public C14944a(Comparator comparator) {
            this.f32890a = comparator;
        }

        @Override // com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
        public void writeBoolean(Boolean bool) {
            if (bool != null) {
                this.f32891b.add(bool);
            }
        }

        @Override // com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
        public void writeCustom(ScalarType scalarType, Object obj) {
            if (obj != null) {
                this.f32891b.add(obj);
            }
        }

        @Override // com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
        public void writeDouble(Double d) {
            if (d != null) {
                this.f32891b.add(d);
            }
        }

        @Override // com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
        public void writeInt(Integer num) {
            if (num != null) {
                this.f32891b.add(num);
            }
        }

        @Override // com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
        public void writeLong(Long l) {
            if (l != null) {
                this.f32891b.add(l);
            }
        }

        @Override // com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
        public void writeObject(InputFieldMarshaller inputFieldMarshaller) {
            if (inputFieldMarshaller != null) {
                kzf kzfVar = new kzf(this.f32890a);
                inputFieldMarshaller.marshal(kzfVar);
                this.f32891b.add(kzfVar.f32889b);
            }
        }

        @Override // com.apollographql.apollo.api.InputFieldWriter.ListItemWriter
        public void writeString(String str) {
            if (str != null) {
                this.f32891b.add(str);
            }
        }
    }

    public kzf(Comparator comparator) {
        this.f32888a = (Comparator) Utils.checkNotNull(comparator, "fieldNameComparator == null");
        this.f32889b = new TreeMap(comparator);
    }

    /* renamed from: a */
    public Map m36376a() {
        return Collections.unmodifiableMap(this.f32889b);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeBoolean(String str, Boolean bool) {
        this.f32889b.put(str, bool);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeCustom(String str, ScalarType scalarType, Object obj) {
        this.f32889b.put(str, obj);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeDouble(String str, Double d) {
        this.f32889b.put(str, d);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeInt(String str, Integer num) {
        this.f32889b.put(str, num);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeList(String str, InputFieldWriter.ListWriter listWriter) {
        if (listWriter == null) {
            this.f32889b.put(str, null);
            return;
        }
        C14944a c14944a = new C14944a(this.f32888a);
        listWriter.write(c14944a);
        this.f32889b.put(str, c14944a.f32891b);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeLong(String str, Long l) {
        this.f32889b.put(str, l);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeObject(String str, InputFieldMarshaller inputFieldMarshaller) {
        if (inputFieldMarshaller == null) {
            this.f32889b.put(str, null);
            return;
        }
        kzf kzfVar = new kzf(this.f32888a);
        inputFieldMarshaller.marshal(kzfVar);
        this.f32889b.put(str, kzfVar.f32889b);
    }

    @Override // com.apollographql.apollo.api.InputFieldWriter
    public void writeString(String str, String str2) {
        this.f32889b.put(str, str2);
    }
}
