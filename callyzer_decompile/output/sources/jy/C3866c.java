package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.c */
/* loaded from: classes3.dex */
public final class C3866c extends AbstractC3877n {

    /* renamed from: b */
    public final /* synthetic */ int f19876b = 1;

    /* renamed from: c */
    public final g0 f19877c;

    public C3866c() {
        super(a1.f19869a);
        t0 elementDesc = a1.f19870b;
        AbstractC4154l.m8923f(elementDesc, "elementDesc");
        this.f19877c = new C3865b(elementDesc, 1);
    }

    @Override // jy.AbstractC3864a
    /* renamed from: a */
    public final Object mo8406a() {
        switch (this.f19876b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // jy.AbstractC3864a
    /* renamed from: b */
    public final int mo8407b(Object obj) {
        switch (this.f19876b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC4154l.m8923f(arrayList, "<this>");
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC4154l.m8923f(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // jy.AbstractC3864a
    /* renamed from: c */
    public final Iterator mo8408c(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC4154l.m8923f(collection, "<this>");
        return collection.iterator();
    }

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC4154l.m8923f(collection, "<this>");
        return collection.size();
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        switch (this.f19876b) {
            case 0:
                AbstractC4154l.m8923f(null, "<this>");
                return new ArrayList((Collection) null);
            default:
                AbstractC4154l.m8923f(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        switch (this.f19876b) {
        }
        return (C3865b) this.f19877c;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: h */
    public final Object mo8413h(Object obj) {
        switch (this.f19876b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC4154l.m8923f(arrayList, "<this>");
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC4154l.m8923f(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // jy.AbstractC3877n
    /* renamed from: i */
    public final void mo8417i(int i10, Object obj, Object obj2) {
        switch (this.f19876b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC4154l.m8923f(arrayList, "<this>");
                arrayList.add(i10, obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC4154l.m8923f(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3866c(InterfaceC2401a element) {
        super(element);
        AbstractC4154l.m8923f(element, "element");
        InterfaceC3055f elementDesc = element.getDescriptor();
        AbstractC4154l.m8923f(elementDesc, "elementDesc");
        this.f19877c = new C3865b(elementDesc, 0);
    }
}
