package p001o;

import com.google.android.gms.common.internal.ImagesContract;

/* loaded from: classes2.dex */
public final class n8i {

    /* renamed from: a */
    public final String f36575a;

    public n8i(String str) {
        sq8.m48649h(str, ImagesContract.URL);
        this.f36575a = str;
    }

    /* renamed from: a */
    public final String m40250a() {
        return this.f36575a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8i) && sq8.m48644c(this.f36575a, ((n8i) obj).f36575a);
    }

    public int hashCode() {
        return this.f36575a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f36575a + ')';
    }
}
