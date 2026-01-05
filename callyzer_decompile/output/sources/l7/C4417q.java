package l7;

import a2.AbstractC0030c;
import cj.C0979e;
import jc.AbstractC3745u;
import jc.C3742r;
import jc.C3743s;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import nx.AbstractC5185w;
import og.ud;
import sc.C6788h;
import sc.C6802v;
import sc.InterfaceC6796p;
import tc.C7117b;
import yc.C8615d;
import yc.EnumC8616e;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.q */
/* loaded from: classes.dex */
public final class C4417q implements InterfaceC6796p {

    /* renamed from: a */
    public final /* synthetic */ int f22096a;

    /* renamed from: b */
    public String f22097b;

    public /* synthetic */ C4417q() {
        this.f22096a = 0;
    }

    /* renamed from: a */
    public String m9234a(Object obj) {
        String string = obj.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return this.f22097b + obj;
        }
        throw new IllegalArgumentException(i0.m0.m7378k("Invalid key: ", string));
    }

    @Override // sc.InterfaceC6796p
    /* renamed from: b */
    public Object mo7561b(Object obj, C8615d c8615d) {
        C6802v c6802v = (C6802v) obj;
        String str = (String) ud.m10978d(c6802v.f32331a, AbstractC8923q.f42882a);
        C7117b c7117b = (C7117b) c6802v.f32332b;
        c7117b.f34312c.m336p(this.f22097b + '.' + str, "X-Amz-Target");
        c7117b.f34312c.m320H("application/x-amz-json-1.1");
        if (c7117b.f34313d instanceof C3743s) {
            C3742r c3742r = AbstractC3745u.Companion;
            byte[] bArrM10128j = AbstractC5185w.m10128j("{}");
            c3742r.getClass();
            c7117b.f34313d = C3742r.m8277a(bArrM10128j);
        }
        return c6802v;
    }

    /* renamed from: c */
    public void m9235c(C0979e c0979e) {
        C6788h c6788h = (C6788h) ((C4535g) c0979e.f5802a).f22539c;
        EnumC8616e order = EnumC8616e.After;
        c6788h.getClass();
        AbstractC4154l.m8923f(order, "order");
        c6788h.m12980c(new C6788h(2, this), order);
    }

    public String toString() {
        switch (this.f22096a) {
            case 3:
                return AbstractC0030c.m123n(new StringBuilder("<"), this.f22097b, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4417q(String str, int i10) {
        this.f22096a = i10;
        this.f22097b = str;
    }

    public C4417q(String str) {
        this.f22096a = 2;
        this.f22097b = str.concat("_");
    }
}
