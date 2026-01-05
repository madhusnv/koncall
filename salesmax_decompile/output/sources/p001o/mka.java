package p001o;

import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class mka {

    /* renamed from: d */
    public static final C15352a f35623d = new C15352a(null);

    /* renamed from: a */
    public final Set f35624a;

    /* renamed from: b */
    public final String f35625b;

    /* renamed from: c */
    public final String f35626c;

    /* renamed from: o.mka$a */
    public static final class C15352a {
        public C15352a() {
        }

        public /* synthetic */ C15352a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mka(Collection collection, String str, int i, id5 id5Var) {
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            sq8.m48648g(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    /* renamed from: a */
    public final String m39291a() {
        return this.f35626c;
    }

    /* renamed from: b */
    public final String m39292b() {
        return this.f35625b;
    }

    /* renamed from: c */
    public final Set m39293c() {
        return this.f35624a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mka(Collection collection, String str) {
        this(collection, str, eic.m25117c());
        sq8.m48649h(str, "nonce");
    }

    public mka(Collection collection, String str, String str2) {
        sq8.m48649h(str, "nonce");
        sq8.m48649h(str2, "codeVerifier");
        if (h0c.m29722a(str) && eic.m25118d(str2)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add(Scopes.OPEN_ID);
            Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            sq8.m48648g(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.f35624a = setUnmodifiableSet;
            this.f35625b = str;
            this.f35626c = str2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
