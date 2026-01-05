package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class taj {

    /* renamed from: a */
    public final List f46747a;

    public taj(List list) {
        sq8.m48649h(list, "displayFeatures");
        this.f46747a = list;
    }

    /* renamed from: a */
    public final List m49662a() {
        return this.f46747a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(taj.class, obj.getClass())) {
            return false;
        }
        return sq8.m48644c(this.f46747a, ((taj) obj).f46747a);
    }

    public int hashCode() {
        return this.f46747a.hashCode();
    }

    public String toString() {
        return kh3.p0(this.f46747a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
