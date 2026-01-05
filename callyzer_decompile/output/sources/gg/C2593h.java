package gg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.h */
/* loaded from: classes.dex */
public final class C2593h implements Parcelable {
    public static final Parcelable.Creator<C2593h> CREATOR = new b0(19);

    /* renamed from: a */
    public final InterfaceC2586a f14112a;

    public C2593h(InterfaceC2586a interfaceC2586a) {
        AbstractC6840z.m13036g(interfaceC2586a);
        this.f14112a = interfaceC2586a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C2593h m6586a(int i10) throws COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException {
        EnumC2601p enumC2601p;
        if (i10 == EnumC2601p.LEGACY_RS1.getAlgoValue()) {
            enumC2601p = EnumC2601p.RS1;
        } else {
            EnumC2601p[] enumC2601pArrValues = EnumC2601p.values();
            int length = enumC2601pArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (EnumC2601p enumC2601p2 : EnumC2594i.values()) {
                        if (enumC2601p2.getAlgoValue() == i10) {
                            enumC2601p = enumC2601p2;
                        }
                    }
                    throw new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(AbstractC5601a.m11232c(i10, "Algorithm with COSE value ", " not supported"));
                }
                EnumC2601p enumC2601p3 = enumC2601pArrValues[i11];
                if (enumC2601p3.getAlgoValue() == i10) {
                    enumC2601p = enumC2601p3;
                    break;
                }
                i11++;
            }
        }
        return new C2593h(enumC2601p);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2593h) && this.f14112a.getAlgoValue() == ((C2593h) obj).f14112a.getAlgoValue();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14112a});
    }

    public final String toString() {
        return AbstractC5601a.m11238i("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f14112a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14112a.getAlgoValue());
    }
}
