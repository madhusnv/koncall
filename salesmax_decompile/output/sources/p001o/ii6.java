package p001o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class ii6 extends e8 implements gi6, Serializable {

    /* renamed from: b */
    public final Enum[] f28723b;

    public ii6(Enum[] enumArr) {
        sq8.m48649h(enumArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        this.f28723b = enumArr;
    }

    private final Object writeReplace() {
        return new ji6(this.f28723b);
    }

    @Override // p001o.b7, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m32170e((Enum) obj);
        }
        return false;
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f28723b.length;
    }

    /* renamed from: e */
    public boolean m32170e(Enum r3) {
        sq8.m48649h(r3, "element");
        return ((Enum) gp0.f0(this.f28723b, r3.ordinal())) == r3;
    }

    @Override // p001o.e8, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m32172o((Enum) obj);
        }
        return -1;
    }

    @Override // p001o.e8, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Enum get(int i) {
        e8.f21141a.m24504b(i, this.f28723b.length);
        return this.f28723b[i];
    }

    @Override // p001o.e8, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m32173p((Enum) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public int m32172o(Enum r3) {
        sq8.m48649h(r3, "element");
        int iOrdinal = r3.ordinal();
        if (((Enum) gp0.f0(this.f28723b, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    /* renamed from: p */
    public int m32173p(Enum r2) {
        sq8.m48649h(r2, "element");
        return indexOf(r2);
    }
}
