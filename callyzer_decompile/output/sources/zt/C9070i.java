package zt;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import er.C2123w;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import java.io.IOException;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.s0;
import kotlin.jvm.internal.AbstractC4155m;
import l7.a0;
import lx.InterfaceC4566e;
import org.xmlpull.v1.XmlPullParserException;
import p005f.C2162k;
import su.C6952k;
import tu.C7226b;
import us.C7536c;
import vr.b0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zt.i */
/* loaded from: classes3.dex */
public final class C9070i extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f43597a;

    /* renamed from: b */
    public final /* synthetic */ Context f43598b;

    /* renamed from: c */
    public final /* synthetic */ a0 f43599c;

    /* renamed from: d */
    public final /* synthetic */ C2162k f43600d;

    /* renamed from: e */
    public final /* synthetic */ C6952k f43601e;

    /* renamed from: f */
    public final /* synthetic */ C7536c f43602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9070i(List list, Context context, a0 a0Var, C2162k c2162k, C6952k c6952k, C7536c c7536c) {
        super(4);
        this.f43597a = list;
        this.f43598b = context;
        this.f43599c = a0Var;
        this.f43600d = c2162k;
        this.f43601e = c6952k;
        this.f43602f = c7536c;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int i10;
        InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(i10 & 1, (i10 & 147) != 146)) {
            C7226b c7226b = (C7226b) this.f43597a.get(iIntValue);
            c3966o.m8607Y(-68399893);
            C2162k c2162k = this.f43600d;
            boolean zM8616i = c3966o.m8616i(c2162k);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new C2123w(11, c2162k);
                c3966o.j0(objM8596M);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
            C6952k c6952k = this.f43601e;
            boolean zM8616i2 = c3966o.m8616i(c6952k);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i2 || objM8596M2 == s0Var) {
                b0 b0Var = new b0(1, c6952k, C6952k.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/more/settings/event/SettingsEvent;)V", 0, 28);
                c3966o.j0(b0Var);
                objM8596M2 = b0Var;
            }
            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) ((InterfaceC4566e) objM8596M2);
            C7536c c7536c = this.f43602f;
            boolean zM8616i3 = c3966o.m8616i(c7536c);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8616i3 || objM8596M3 == s0Var) {
                b0 b0Var2 = new b0(1, c7536c, C7536c.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/mainscreen/event/RecordingPathsSelectEvent;)V", 0, 29);
                c3966o.j0(b0Var2);
                objM8596M3 = b0Var2;
            }
            AbstractC9062a.m16501b(c7226b, this.f43598b, this.f43599c, interfaceC2137a, interfaceC2139c, (InterfaceC2139c) ((InterfaceC4566e) objM8596M3), c3966o, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
