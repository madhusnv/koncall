package ow;

import jakarta.mail.AbstractC3682n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ow.i */
/* loaded from: classes3.dex */
public final class C5766i extends AbstractC5767j {

    /* renamed from: a */
    public AbstractC5767j[] f28332a;

    public final boolean equals(Object obj) {
        AbstractC5767j[] abstractC5767jArr = this.f28332a;
        if (!(obj instanceof C5766i)) {
            return false;
        }
        AbstractC5767j[] abstractC5767jArr2 = ((C5766i) obj).f28332a;
        if (abstractC5767jArr2.length != abstractC5767jArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < abstractC5767jArr.length; i10++) {
            if (!abstractC5767jArr[i10].equals(abstractC5767jArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            AbstractC5767j[] abstractC5767jArr = this.f28332a;
            if (i10 >= abstractC5767jArr.length) {
                return iHashCode;
            }
            iHashCode += abstractC5767jArr[i10].hashCode();
            i10++;
        }
    }

    @Override // ow.AbstractC5767j
    public final boolean match(AbstractC3682n abstractC3682n) {
        int i10 = 0;
        while (true) {
            AbstractC5767j[] abstractC5767jArr = this.f28332a;
            if (i10 >= abstractC5767jArr.length) {
                return false;
            }
            if (abstractC5767jArr[i10].match(abstractC3682n)) {
                return true;
            }
            i10++;
        }
    }
}
