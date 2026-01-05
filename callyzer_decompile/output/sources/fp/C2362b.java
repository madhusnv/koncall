package fp;

import ex.InterfaceC2139c;
import gp.C2703n;
import kotlin.jvm.internal.AbstractC4154l;
import qp.C6266c;
import qw.a0;
import ur.AbstractC7523p;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fp.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2362b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f10754a;

    /* renamed from: b */
    public final /* synthetic */ C2703n f10755b;

    public /* synthetic */ C2362b(C2703n c2703n, int i10) {
        this.f10754a = i10;
        this.f10755b = c2703n;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f10754a) {
            case 0:
                AbstractC7523p it = (AbstractC7523p) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f10755b.mo2033e(it);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m1 m1Var = this.f10755b.f15094q;
                while (true) {
                    Object value2 = m1Var.getValue();
                    m1 m1Var2 = m1Var;
                    if (m1Var2.m15397i(value2, C6266c.m12271a((C6266c) value2, null, false, null, null, null, null, null, false, false, zBooleanValue, false, false, false, 0, false, false, 260095))) {
                        break;
                    } else {
                        m1Var = m1Var2;
                    }
                }
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                m1 m1Var3 = this.f10755b.f15094q;
                do {
                    value = m1Var3.getValue();
                } while (!m1Var3.m15397i(value, C6266c.m12271a((C6266c) value, null, false, null, null, null, null, null, false, false, false, zBooleanValue2, false, false, 0, false, false, 258047)));
        }
        return a0.f30746a;
    }
}
