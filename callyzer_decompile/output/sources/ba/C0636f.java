package ba;

import aa.AbstractC0081h;
import aa.C0076c;
import b3.C0592x;
import b3.InterfaceC0586r;
import com.websoptimization.callyzerbiz.MainActivity;
import er.C2107g;
import ex.InterfaceC2139c;
import fd.C2273k;
import fd.InterfaceC2266d;
import gr.C2713i;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import nz.C5205p;
import p3.C5825w;
import qw.a0;
import th.C7151a;
import tx.c0;
import uw.InterfaceC7559c;
import xm.h3;
import xv.C8489p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ba.f */
/* loaded from: classes.dex */
public final class C0636f implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f4107a;

    /* renamed from: b */
    public Object f4108b;

    public /* synthetic */ C0636f() {
        this.f4107a = 5;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f4107a) {
            case 0:
                InterfaceC2266d listField = (InterfaceC2266d) obj;
                AbstractC4154l.m8923f(listField, "$this$listField");
                Iterator it = ((C0076c) this.f4108b).f280b.iterator();
                while (it.hasNext()) {
                    listField.mo5961a(new C2273k((AbstractC0081h) it.next(), C0635e.f4106a));
                }
                return a0.f30746a;
            case 1:
                String it2 = (String) obj;
                AbstractC4154l.m8923f(it2, "it");
                ((C2713i) this.f4108b).m6713f(new C2107g(it2));
                return a0.f30746a;
            case 2:
                C7151a it3 = (C7151a) obj;
                AbstractC4154l.m8923f(it3, "it");
                C8489p c8489p = ((MainActivity) this.f4108b).f7266k;
                InterfaceC7559c interfaceC7559c = null;
                if (c8489p != null) {
                    c0.m13502y(c8489p.f41369q, null, null, new h3(c8489p, it3, interfaceC7559c, 20), 3);
                    return a0.f30746a;
                }
                AbstractC4154l.m8928k("permissionsViewModel");
                throw null;
            case 3:
                InterfaceC0586r focusProperties = (InterfaceC0586r) obj;
                AbstractC4154l.m8923f(focusProperties, "$this$focusProperties");
                focusProperties.mo1752c((C0592x) this.f4108b);
                return a0.f30746a;
            case 4:
                ((C5205p) this.f4108b).cancel();
                return a0.f30746a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C5825w c5825w = (C5825w) this.f4108b;
                if (c5825w != null) {
                    c5825w.f28509c = zBooleanValue;
                }
                return a0.f30746a;
        }
    }

    public /* synthetic */ C0636f(int i10, Object obj) {
        this.f4107a = i10;
        this.f4108b = obj;
    }
}
