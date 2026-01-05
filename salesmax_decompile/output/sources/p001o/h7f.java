package p001o;

import com.apollographql.apollo.api.ResponseField;
import java.util.Set;

/* loaded from: classes3.dex */
public class h7f {

    /* renamed from: d */
    public static final C13891a f26367d = new C13891a(null);

    /* renamed from: a */
    public final aff f26368a;

    /* renamed from: b */
    public int f26369b;

    /* renamed from: c */
    public final Set f26370c;

    /* renamed from: o.h7f$a */
    public static final class C13891a {
        public C13891a() {
        }

        public /* synthetic */ C13891a(id5 id5Var) {
            this();
        }
    }

    public h7f(aff affVar, int i, Set set) {
        sq8.m48649h(affVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        sq8.m48649h(set, "traits");
        this.f26368a = affVar;
        this.f26369b = i;
        this.f26370c = set;
    }

    /* renamed from: a */
    public final int m29946a() {
        return this.f26369b;
    }

    /* renamed from: b */
    public final aff m29947b() {
        return this.f26368a;
    }

    /* renamed from: c */
    public final Set m29948c() {
        return this.f26370c;
    }

    /* renamed from: d */
    public final void m29949d(int i) {
        this.f26369b = i;
    }

    public String toString() {
        return "SdkFieldDescriptor." + this.f26368a + "(traits=" + kh3.p0(this.f26370c, ",", null, null, 0, null, null, 62, null) + ')';
    }

    public /* synthetic */ h7f(aff affVar, int i, Set set, int i2, id5 id5Var) {
        this(affVar, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? nif.m40664e() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h7f(aff affVar, hu6... hu6VarArr) {
        this(affVar, 0, gp0.K0(hu6VarArr));
        sq8.m48649h(affVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        sq8.m48649h(hu6VarArr, "trait");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h7f(aff affVar, Set set) {
        this(affVar, 0, set);
        sq8.m48649h(affVar, ResponseField.VARIABLE_IDENTIFIER_KEY);
        sq8.m48649h(set, "traits");
    }
}
