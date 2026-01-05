package vx;

import android.content.res.Resources;
import c3.C0850e;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import s4.C6748d;
import uw.InterfaceC7564h;
import w3.C7904v;
import w3.h0;
import yx.AbstractC8808b;
import z2.C8857b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7801c extends AbstractC4152j implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f37475a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7801c(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f37475a = i12;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f37475a) {
            case 0:
                InterfaceC2139c interfaceC2139c = ((C7806h) this.receiver).f37494b;
                AbstractC4154l.m8920c(interfaceC2139c);
                AbstractC8808b.m16241a(interfaceC2139c, obj2, (InterfaceC7564h) obj3);
                return a0.f30746a;
            case 1:
                Object obj4 = ((C7813o) obj2).f37520a;
                InterfaceC2139c interfaceC2139c2 = ((C7806h) this.receiver).f37494b;
                AbstractC4154l.m8920c(interfaceC2139c2);
                Object objM14794a = C7813o.m14794a(obj4);
                AbstractC4154l.m8920c(objM14794a);
                AbstractC8808b.m16241a(interfaceC2139c2, objM14794a, (InterfaceC7564h) obj3);
                return a0.f30746a;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C7904v c7904v = (C7904v) this.receiver;
                Resources resources = c7904v.getContext().getResources();
                return Boolean.valueOf(h0.f37804a.m14956a(c7904v, null, new C8857b(new C6748d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C0850e) obj2).f5366a, (InterfaceC2139c) obj3)));
        }
    }
}
