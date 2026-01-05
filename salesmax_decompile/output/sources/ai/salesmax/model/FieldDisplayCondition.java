package ai.salesmax.model;

import ai.salesmax.model.FieldDisplayCondition;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.stream.Stream;
import p001o.gge;
import p001o.id5;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class FieldDisplayCondition implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FieldDisplayCondition> CREATOR = new Creator();
    private String condition;
    private List<FieldDisplayRule> rules;

    public static final class Creator implements Parcelable.Creator<FieldDisplayCondition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldDisplayCondition createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(FieldDisplayRule.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FieldDisplayCondition(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FieldDisplayCondition[] newArray(int i) {
            return new FieldDisplayCondition[i];
        }
    }

    /* renamed from: ai.salesmax.model.FieldDisplayCondition$evaluateRule$1 */
    public static final class C02001 extends kf9 implements xk7 {
        final /* synthetic */ gge $prevValue;
        final /* synthetic */ Map<String, Object> $submittedValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02001(gge ggeVar, Map<String, ? extends Object> map) {
            super(1);
            this.$prevValue = ggeVar;
            this.$submittedValues = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FieldDisplayRule) obj);
            return y3i.f54824a;
        }

        public final void invoke(FieldDisplayRule fieldDisplayRule) {
            if (!sq8.m48644c(FieldDisplayCondition.this.getCondition(), "and")) {
                Object obj = this.$prevValue.f25106a;
                ((AtomicBoolean) obj).set(((AtomicBoolean) obj).get() || fieldDisplayRule.evaluateRule(this.$submittedValues));
                return;
            }
            Object obj2 = this.$prevValue.f25106a;
            AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
            if (((AtomicBoolean) obj2).get() && fieldDisplayRule.evaluateRule(this.$submittedValues)) {
                z = true;
            }
            atomicBoolean.set(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FieldDisplayCondition() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FieldDisplayCondition copy$default(FieldDisplayCondition fieldDisplayCondition, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fieldDisplayCondition.condition;
        }
        if ((i & 2) != 0) {
            list = fieldDisplayCondition.rules;
        }
        return fieldDisplayCondition.copy(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateRule$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    public final String component1() {
        return this.condition;
    }

    public final List<FieldDisplayRule> component2() {
        return this.rules;
    }

    public final FieldDisplayCondition copy(String str, List<FieldDisplayRule> list) {
        return new FieldDisplayCondition(str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDisplayCondition)) {
            return false;
        }
        FieldDisplayCondition fieldDisplayCondition = (FieldDisplayCondition) obj;
        return sq8.m48644c(this.condition, fieldDisplayCondition.condition) && sq8.m48644c(this.rules, fieldDisplayCondition.rules);
    }

    public final boolean evaluateRule(Map<String, ? extends Object> map) {
        Stream<FieldDisplayRule> stream;
        sq8.m48649h(map, "submittedValues");
        gge ggeVar = new gge();
        ggeVar.f25106a = sq8.m48644c(this.condition, "and") ? new AtomicBoolean(true) : new AtomicBoolean(false);
        List<FieldDisplayRule> list = this.rules;
        if (list != null && (stream = list.stream()) != null) {
            final C02001 c02001 = new C02001(ggeVar, map);
            stream.forEach(new Consumer() { // from class: o.zt6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FieldDisplayCondition.evaluateRule$lambda$0(c02001, obj);
                }
            });
        }
        boolean z = ((AtomicBoolean) ggeVar.f25106a).get();
        StringBuilder sb = new StringBuilder();
        sb.append(map);
        sb.append("  => ");
        sb.append(z);
        return ((AtomicBoolean) ggeVar.f25106a).get();
    }

    public final String getCondition() {
        return this.condition;
    }

    public final List<FieldDisplayRule> getRules() {
        return this.rules;
    }

    public int hashCode() {
        String str = this.condition;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FieldDisplayRule> list = this.rules;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setCondition(String str) {
        this.condition = str;
    }

    public final void setRules(List<FieldDisplayRule> list) {
        this.rules = list;
    }

    public String toString() {
        return "FieldDisplayCondition(condition=" + this.condition + ", rules=" + this.rules + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.condition);
        List<FieldDisplayRule> list = this.rules;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<FieldDisplayRule> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public FieldDisplayCondition(String str, List<FieldDisplayRule> list) {
        this.condition = str;
        this.rules = list;
    }

    public /* synthetic */ FieldDisplayCondition(String str, List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? "and" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
