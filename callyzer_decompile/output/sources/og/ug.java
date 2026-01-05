package og;

import android.content.Context;
import b2.C0554l;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ug implements tg {

    /* renamed from: a */
    public final ArrayList f26831a;

    public ug(Context context, sg sgVar) {
        ArrayList arrayList = new ArrayList();
        this.f26831a = arrayList;
        arrayList.add(new ah(context, sgVar));
    }

    @Override // og.tg
    /* renamed from: a */
    public final void mo10541a(C0554l c0554l) {
        ArrayList arrayList = this.f26831a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((tg) obj).mo10541a(c0554l);
        }
    }
}
