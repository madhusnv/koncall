package p2;

import java.util.Iterator;
import java.util.Map;
import n2.InterfaceC4943b;
import rw.AbstractC6659i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.i */
/* loaded from: classes.dex */
public final class C5797i extends AbstractC6659i implements InterfaceC4943b {

    /* renamed from: a */
    public final /* synthetic */ int f28396a;

    /* renamed from: b */
    public final C5790b f28397b;

    public /* synthetic */ C5797i(C5790b c5790b, int i10) {
        this.f28396a = i10;
        this.f28397b = c5790b;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        switch (this.f28396a) {
            case 0:
                C5790b c5790b = this.f28397b;
                c5790b.getClass();
                return c5790b.f28378b;
            default:
                C5790b c5790b2 = this.f28397b;
                c5790b2.getClass();
                return c5790b2.f28378b;
        }
    }

    @Override // rw.AbstractC6651a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f28396a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C5790b c5790b = this.f28397b;
                Object obj2 = c5790b.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c5790b.containsKey(entry.getKey());
            default:
                return this.f28397b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f28396a) {
            case 0:
                C5799k c5799k = this.f28397b.f28377a;
                AbstractC5800l[] abstractC5800lArr = new AbstractC5800l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC5800lArr[i10] = new C5801m(0);
                }
                return new C5798j(c5799k, abstractC5800lArr);
            default:
                C5799k c5799k2 = this.f28397b.f28377a;
                AbstractC5800l[] abstractC5800lArr2 = new AbstractC5800l[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    abstractC5800lArr2[i11] = new C5801m(1);
                }
                return new C5798j(c5799k2, abstractC5800lArr2);
        }
    }
}
