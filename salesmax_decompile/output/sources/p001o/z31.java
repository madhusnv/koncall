package p001o;

import android.util.Size;
import java.util.List;
import p001o.f52;

/* loaded from: classes2.dex */
public final class z31 extends f52.AbstractC13339k {

    /* renamed from: a */
    public final String f56449a;

    /* renamed from: b */
    public final Class f56450b;

    /* renamed from: c */
    public final bhf f56451c;

    /* renamed from: d */
    public final c9i f56452d;

    /* renamed from: e */
    public final Size f56453e;

    /* renamed from: f */
    public final k7g f56454f;

    /* renamed from: g */
    public final List f56455g;

    public z31(String str, Class cls, bhf bhfVar, c9i c9iVar, Size size, k7g k7gVar, List list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f56449a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f56450b = cls;
        if (bhfVar == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f56451c = bhfVar;
        if (c9iVar == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f56452d = c9iVar;
        this.f56453e = size;
        this.f56454f = k7gVar;
        this.f56455g = list;
    }

    @Override // p001o.f52.AbstractC13339k
    /* renamed from: c */
    public List mo26160c() {
        return this.f56455g;
    }

    @Override // p001o.f52.AbstractC13339k
    /* renamed from: d */
    public bhf mo26161d() {
        return this.f56451c;
    }

    @Override // p001o.f52.AbstractC13339k
    /* renamed from: e */
    public k7g mo26162e() {
        return this.f56454f;
    }

    public boolean equals(Object obj) {
        Size size;
        k7g k7gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f52.AbstractC13339k)) {
            return false;
        }
        f52.AbstractC13339k abstractC13339k = (f52.AbstractC13339k) obj;
        if (this.f56449a.equals(abstractC13339k.mo26165h()) && this.f56450b.equals(abstractC13339k.mo26166i()) && this.f56451c.equals(abstractC13339k.mo26161d()) && this.f56452d.equals(abstractC13339k.mo26164g()) && ((size = this.f56453e) != null ? size.equals(abstractC13339k.mo26163f()) : abstractC13339k.mo26163f() == null) && ((k7gVar = this.f56454f) != null ? k7gVar.equals(abstractC13339k.mo26162e()) : abstractC13339k.mo26162e() == null)) {
            List list = this.f56455g;
            if (list == null) {
                if (abstractC13339k.mo26160c() == null) {
                    return true;
                }
            } else if (list.equals(abstractC13339k.mo26160c())) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.f52.AbstractC13339k
    /* renamed from: f */
    public Size mo26163f() {
        return this.f56453e;
    }

    @Override // p001o.f52.AbstractC13339k
    /* renamed from: g */
    public c9i mo26164g() {
        return this.f56452d;
    }

    @Override // p001o.f52.AbstractC13339k
    /* renamed from: h */
    public String mo26165h() {
        return this.f56449a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f56449a.hashCode() ^ 1000003) * 1000003) ^ this.f56450b.hashCode()) * 1000003) ^ this.f56451c.hashCode()) * 1000003) ^ this.f56452d.hashCode()) * 1000003;
        Size size = this.f56453e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        k7g k7gVar = this.f56454f;
        int iHashCode3 = (iHashCode2 ^ (k7gVar == null ? 0 : k7gVar.hashCode())) * 1000003;
        List list = this.f56455g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // p001o.f52.AbstractC13339k
    /* renamed from: i */
    public Class mo26166i() {
        return this.f56450b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f56449a + ", useCaseType=" + this.f56450b + ", sessionConfig=" + this.f56451c + ", useCaseConfig=" + this.f56452d + ", surfaceResolution=" + this.f56453e + ", streamSpec=" + this.f56454f + ", captureTypes=" + this.f56455g + "}";
    }
}
