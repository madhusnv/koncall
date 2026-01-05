package g2;

import ex.InterfaceC2137a;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4266h;
import l4.C4367l;
import t2.C7002a;
import t2.InterfaceC7008g;
import t2.InterfaceC7009h;
import t2.InterfaceC7012k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t4 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f12749a;

    /* renamed from: b */
    public final /* synthetic */ Object f12750b;

    /* renamed from: c */
    public final /* synthetic */ Object f12751c;

    /* renamed from: d */
    public final /* synthetic */ Object f12752d;

    /* renamed from: e */
    public final /* synthetic */ Object f12753e;

    /* renamed from: f */
    public final /* synthetic */ Object f12754f;

    /* renamed from: g */
    public final /* synthetic */ Object f12755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(0);
        this.f12749a = i10;
        this.f12750b = obj;
        this.f12751c = obj2;
        this.f12752d = obj3;
        this.f12753e = obj4;
        this.f12754f = obj5;
        this.f12755g = obj6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        boolean z6;
        switch (this.f12749a) {
            case 0:
                return new v4((Long) this.f12750b, (Long) this.f12751c, (Long) this.f12752d, (C4266h) this.f12753e, 0, (z9) this.f12754f, (Locale) this.f12755g);
            default:
                C7002a c7002a = (C7002a) this.f12750b;
                InterfaceC7012k interfaceC7012k = (InterfaceC7012k) this.f12751c;
                InterfaceC7009h interfaceC7009h = (InterfaceC7009h) this.f12752d;
                String str = (String) this.f12753e;
                Object[] objArr = (Object[]) this.f12755g;
                boolean z10 = true;
                if (c7002a.f33925b != interfaceC7009h) {
                    c7002a.f33925b = interfaceC7009h;
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (AbstractC4154l.m8918a(c7002a.f33926c, str)) {
                    z10 = z6;
                } else {
                    c7002a.f33926c = str;
                }
                c7002a.f33924a = interfaceC7012k;
                c7002a.f33927d = this.f12754f;
                c7002a.f33928e = objArr;
                InterfaceC7008g interfaceC7008g = c7002a.f33929f;
                if (interfaceC7008g != null && z10) {
                    ((C4367l) interfaceC7008g).m9127N();
                    c7002a.f33929f = null;
                    c7002a.m13271a();
                }
                return qw.a0.f30746a;
        }
    }
}
