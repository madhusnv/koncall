package xw;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6654d;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xw.b */
/* loaded from: classes3.dex */
public final class C8494b extends AbstractC6654d implements InterfaceC8493a, Serializable {

    /* renamed from: a */
    public final Enum[] f41389a;

    public C8494b(Enum[] entries) {
        AbstractC4154l.m8923f(entries, "entries");
        this.f41389a = entries;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f41389a.length;
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        return ((Enum) AbstractC6662l.m12736z(r42.ordinal(), this.f41389a)) == r42;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f41389a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("index: ", i10, length, ", size: "));
        }
        return enumArr[i10];
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) AbstractC6662l.m12736z(iOrdinal, this.f41389a)) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) AbstractC6662l.m12736z(iOrdinal, this.f41389a)) == r42) {
            return iOrdinal;
        }
        return -1;
    }
}
