package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public final class hgb extends gff {

    /* renamed from: a */
    public final List f26839a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgb(List list, String str, Throwable th) {
        super(str, th);
        sq8.m48649h(list, "missingFields");
        this.f26839a = list;
    }

    /* renamed from: a */
    public final List m30422a() {
        return this.f26839a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hgb(List list, String str) {
        String str2;
        sq8.m48649h(list, "missingFields");
        sq8.m48649h(str, "serialName");
        if (list.size() == 1) {
            str2 = "Field '" + ((String) list.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }
}
