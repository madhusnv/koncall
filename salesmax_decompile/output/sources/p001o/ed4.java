package p001o;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ed4 {
    /* renamed from: a */
    public jd4 m24782a(long j, byte[] bArr, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i, i2);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new jd4(fn1.m27118a(new ol7() { // from class: o.dd4
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return cd4.m20915b((Bundle) obj);
            }
        }, (ArrayList) op0.m42515e(bundle.getParcelableArrayList("c"))), j, bundle.getLong("d"));
    }
}
