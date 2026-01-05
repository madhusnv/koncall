package p001o;

import android.os.Bundle;
import android.os.Parcel;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class irh {
    /* renamed from: a */
    public static final int m32646a(Bundle bundle) {
        sq8.m48649h(bundle, "bundle");
        Parcel parcelObtain = Parcel.obtain();
        sq8.m48648g(parcelObtain, "Parcel.obtain()");
        try {
            parcelObtain.writeBundle(bundle);
            return parcelObtain.dataSize();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* renamed from: b */
    public static final lvf m32647b(Bundle bundle) {
        sq8.m48649h(bundle, "bundle");
        ArrayList arrayList = new ArrayList(bundle.size());
        Bundle bundle2 = new Bundle(bundle);
        try {
            int iM32646a = m32646a(bundle);
            for (String str : bundle2.keySet()) {
                bundle.remove(str);
                int iM32646a2 = m32646a(bundle);
                sq8.m48648g(str, TransferTable.COLUMN_KEY);
                arrayList.add(new lvf(str, iM32646a - iM32646a2, ch3.m21246k()));
                iM32646a = iM32646a2;
            }
            bundle.putAll(bundle2);
            return new lvf("Bundle" + System.identityHashCode(bundle), m32646a(bundle), arrayList);
        } catch (Throwable th) {
            bundle.putAll(bundle2);
            throw th;
        }
    }
}
