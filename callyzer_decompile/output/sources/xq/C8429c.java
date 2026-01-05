package xq;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4798i;
import qw.a0;
import uq.C7500f;
import uq.C7506l;
import wq.C8142a;
import wx.m1;
import yq.C8741f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xq.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8429c implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f41135a;

    /* renamed from: b */
    public final /* synthetic */ C8741f f41136b;

    public /* synthetic */ C8429c(C8741f c8741f, int i10) {
        this.f41135a = i10;
        this.f41136b = c8741f;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f41135a) {
            case 0:
                String search = (String) obj;
                AbstractC4154l.m8923f(search, "search");
                this.f41136b.m16121f(new C7506l(search));
                break;
            case 1:
                C4798i it = (C4798i) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f41136b.m16121f(new C7500f(it, false));
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m1 m1Var = this.f41136b.f42337f;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C8142a.m15319a((C8142a) value, null, zBooleanValue, false, false, null, 0, 125)));
                return a0.f30746a;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                m1 m1Var2 = this.f41136b.f42337f;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C8142a.m15319a((C8142a) value2, null, false, zBooleanValue2, false, null, 0, 123)));
                return a0.f30746a;
        }
        return a0.f30746a;
    }
}
