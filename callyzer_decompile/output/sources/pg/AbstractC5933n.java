package pg;

import android.os.Parcel;
import android.os.Parcelable;
import fd.C2271i;
import fd.InterfaceC2265c;
import hd.C2896h;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import sf.AbstractC6840z;
import tf.InterfaceC7150b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.n */
/* loaded from: classes.dex */
public abstract class AbstractC5933n {
    /* renamed from: a */
    public static InterfaceC7150b m11793a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC6840z.m13036g(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        InterfaceC7150b interfaceC7150b = (InterfaceC7150b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return interfaceC7150b;
    }

    /* renamed from: b */
    public static final String m11794b(C2271i c2271i) {
        Object next;
        AbstractC4154l.m8923f(c2271i, "<this>");
        Iterator it = c2271i.f10280c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2265c) next).getClass() == C2896h.class) {
                break;
            }
        }
        InterfaceC2265c interfaceC2265c = (InterfaceC2265c) next;
        if (interfaceC2265c != null) {
            return ((C2896h) interfaceC2265c).f15930a;
        }
        throw new IllegalArgumentException(("Expected to find trait " + kotlin.jvm.internal.a0.m8901a(C2896h.class) + " in " + c2271i + " but was not present.").toString());
    }
}
