package y0;

import android.hardware.camera2.params.SessionConfiguration;
import dg.C1720i;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y0.a */
/* loaded from: classes.dex */
public final class C8525a implements InterfaceC8528d {

    /* renamed from: a */
    public final ArrayList f41449a;

    public C8525a(ArrayList arrayList) {
        this.f41449a = arrayList;
    }

    @Override // y0.InterfaceC8528d
    /* renamed from: a */
    public final C1720i mo15797a(SessionConfiguration sessionConfiguration) {
        ArrayList arrayList = this.f41449a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C1720i c1720iMo15797a = ((InterfaceC8528d) obj).mo15797a(sessionConfiguration);
            if (c1720iMo15797a.f8363b != 0) {
                return c1720iMo15797a;
            }
        }
        return new C1720i(0, 4);
    }
}
