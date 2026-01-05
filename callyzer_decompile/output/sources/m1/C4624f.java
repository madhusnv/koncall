package m1;

import java.util.ArrayList;
import k2.w0;
import qw.a0;
import uw.InterfaceC7559c;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m1.f */
/* loaded from: classes.dex */
public final class C4624f implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f22865a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f22866b;

    /* renamed from: c */
    public final /* synthetic */ w0 f22867c;

    public /* synthetic */ C4624f(ArrayList arrayList, w0 w0Var, int i10) {
        this.f22865a = i10;
        this.f22866b = arrayList;
        this.f22867c = w0Var;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f22865a) {
            case 0:
                InterfaceC4628j interfaceC4628j = (InterfaceC4628j) obj;
                boolean z6 = interfaceC4628j instanceof C4622d;
                ArrayList arrayList = this.f22866b;
                if (z6) {
                    arrayList.add(interfaceC4628j);
                } else if (interfaceC4628j instanceof C4623e) {
                    arrayList.remove(((C4623e) interfaceC4628j).f22864a);
                }
                this.f22867c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                InterfaceC4628j interfaceC4628j2 = (InterfaceC4628j) obj;
                boolean z10 = interfaceC4628j2 instanceof C4626h;
                ArrayList arrayList2 = this.f22866b;
                if (z10) {
                    arrayList2.add(interfaceC4628j2);
                } else if (interfaceC4628j2 instanceof C4627i) {
                    arrayList2.remove(((C4627i) interfaceC4628j2).f22872a);
                }
                this.f22867c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return a0.f30746a;
    }
}
