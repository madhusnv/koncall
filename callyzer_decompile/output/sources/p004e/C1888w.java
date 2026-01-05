package p004e;

import ex.InterfaceC2139c;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import rw.C6661k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.w */
/* loaded from: classes.dex */
public final class C1888w extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f8904a;

    /* renamed from: b */
    public final /* synthetic */ c0 f8905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1888w(c0 c0Var, int i10) {
        super(1);
        this.f8904a = i10;
        this.f8905b = c0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f8904a) {
            case 0:
                C1866a backEvent = (C1866a) obj;
                AbstractC4154l.m8923f(backEvent, "backEvent");
                c0 c0Var = this.f8905b;
                C6661k c6661k = c0Var.f8868b;
                ListIterator listIterator = c6661k.listIterator(c6661k.mo10411b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((AbstractC1887v) objPrevious).f8901a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                AbstractC1887v abstractC1887v = (AbstractC1887v) objPrevious;
                if (c0Var.f8869c != null) {
                    c0Var.m5501b();
                }
                c0Var.f8869c = abstractC1887v;
                if (abstractC1887v != null) {
                    abstractC1887v.mo1278d(backEvent);
                }
                break;
            default:
                C1866a backEvent2 = (C1866a) obj;
                AbstractC4154l.m8923f(backEvent2, "backEvent");
                c0 c0Var2 = this.f8905b;
                AbstractC1887v abstractC1887v2 = c0Var2.f8869c;
                if (abstractC1887v2 == null) {
                    C6661k c6661k2 = c0Var2.f8868b;
                    ListIterator listIterator2 = c6661k2.listIterator(c6661k2.mo10411b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((AbstractC1887v) objPrevious2).f8901a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    abstractC1887v2 = (AbstractC1887v) objPrevious2;
                }
                if (abstractC1887v2 != null) {
                    abstractC1887v2.mo1277c(backEvent2);
                }
                break;
        }
        return a0.f30746a;
    }
}
