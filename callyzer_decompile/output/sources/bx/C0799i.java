package bx;

import e1.h0;
import java.util.ArrayList;
import java.util.Iterator;
import mx.C4915k;
import mx.InterfaceC4911g;
import rw.AbstractC6666p;
import tb.C7102m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bx.i */
/* loaded from: classes3.dex */
public final class C0799i implements InterfaceC4911g {

    /* renamed from: a */
    public final /* synthetic */ int f5022a;

    /* renamed from: b */
    public final Object f5023b;

    /* renamed from: c */
    public final Object f5024c;

    public /* synthetic */ C0799i(int i10, Object obj, Object obj2) {
        this.f5022a = i10;
        this.f5023b = obj;
        this.f5024c = obj2;
    }

    @Override // mx.InterfaceC4911g
    public final Iterator iterator() {
        switch (this.f5022a) {
            case 0:
                return new C0797g(this);
            case 1:
                return new h0(this);
            default:
                C4915k c4915k = (C4915k) this.f5023b;
                ArrayList arrayList = new ArrayList();
                Iterator it = c4915k.f24456b.iterator();
                while (it.hasNext()) {
                    arrayList.add(c4915k.f24457c.invoke(it.next()));
                }
                AbstractC6666p.m12771u(arrayList, (C7102m) this.f5024c);
                return arrayList.iterator();
        }
    }
}
