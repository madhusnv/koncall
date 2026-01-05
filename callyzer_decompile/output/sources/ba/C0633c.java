package ba;

import aa.AbstractC0081h;
import aa.AbstractC0082i;
import aa.C0074a;
import ex.InterfaceC2139c;
import fd.C2273k;
import fd.InterfaceC2266d;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ba.c */
/* loaded from: classes.dex */
public final class C0633c implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f4103a;

    /* renamed from: b */
    public final /* synthetic */ C0074a f4104b;

    public /* synthetic */ C0633c(C0074a c0074a, int i10) {
        this.f4103a = i10;
        this.f4104b = c0074a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f4103a) {
            case 0:
                InterfaceC2266d listField = (InterfaceC2266d) obj;
                AbstractC4154l.m8923f(listField, "$this$listField");
                ArrayList arrayList = this.f4104b.f274f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    listField.mo5961a(new C2273k((AbstractC0082i) obj2, C0632b.f4102a));
                }
                break;
            default:
                InterfaceC2266d listField2 = (InterfaceC2266d) obj;
                AbstractC4154l.m8923f(listField2, "$this$listField");
                ArrayList arrayList2 = this.f4104b.f271c;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    listField2.mo5961a(new C2273k((AbstractC0081h) obj3, C0634d.f4105a));
                }
                break;
        }
        return a0.f30746a;
    }
}
