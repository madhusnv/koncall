package p001o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gd4 {
    /* renamed from: a */
    public byte[] m28471a(List list, long j) {
        ArrayList<? extends Parcelable> arrayListM27119b = fn1.m27119b(list, new ol7() { // from class: o.fd4
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return ((cd4) obj).m20918d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListM27119b);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
