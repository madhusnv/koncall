package pg;

import android.content.Context;
import java.util.ArrayList;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ja implements ia {

    /* renamed from: a */
    public final ArrayList f28931a;

    public ja(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.f28931a = arrayList;
        arrayList.add(new la(context, haVar));
    }

    @Override // pg.ia
    /* renamed from: a */
    public final void mo11701a(C7105p c7105p) {
        ArrayList arrayList = this.f28931a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ia) obj).mo11701a(c7105p);
        }
    }
}
