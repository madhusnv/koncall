package d7;

import g8.C2545e;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.h */
/* loaded from: classes.dex */
public final class C1635h implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ int f8104a = 0;

    /* renamed from: b */
    public final Object f8105b;

    /* renamed from: c */
    public final Object f8106c;

    public C1635h(InterfaceC1633f defaultLifecycleObserver, InterfaceC1647s interfaceC1647s) {
        AbstractC4154l.m8923f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f8105b = defaultLifecycleObserver;
        this.f8106c = interfaceC1647s;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f8104a) {
            case 0:
                InterfaceC1633f interfaceC1633f = (InterfaceC1633f) this.f8105b;
                switch (AbstractC1634g.f8103a[enumC1644p.ordinal()]) {
                    case 1:
                        interfaceC1633f.onCreate(interfaceC1649u);
                        break;
                    case 2:
                        interfaceC1633f.onStart(interfaceC1649u);
                        break;
                    case 3:
                        interfaceC1633f.onResume(interfaceC1649u);
                        break;
                    case 4:
                        interfaceC1633f.onPause(interfaceC1649u);
                        break;
                    case 5:
                        interfaceC1633f.onStop(interfaceC1649u);
                        break;
                    case 6:
                        interfaceC1633f.onDestroy(interfaceC1649u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                InterfaceC1647s interfaceC1647s = (InterfaceC1647s) this.f8106c;
                if (interfaceC1647s != null) {
                    interfaceC1647s.mo1120u(interfaceC1649u, enumC1644p);
                    return;
                }
                return;
            case 1:
                if (enumC1644p == EnumC1644p.ON_START) {
                    ((AbstractC1646r) this.f8105b).mo5346d(this);
                    ((C2545e) this.f8106c).m6566d();
                    return;
                }
                return;
            default:
                HashMap map = ((C1629b) this.f8106c).f8068a;
                List list = (List) map.get(enumC1644p);
                Object obj = this.f8105b;
                C1629b.m5304a(list, interfaceC1649u, enumC1644p, obj);
                C1629b.m5304a((List) map.get(EnumC1644p.ON_ANY), interfaceC1649u, enumC1644p, obj);
                return;
        }
    }

    public C1635h(InterfaceC1648t interfaceC1648t) {
        this.f8105b = interfaceC1648t;
        C1631d c1631d = C1631d.f8079c;
        Class<?> cls = interfaceC1648t.getClass();
        C1629b c1629b = (C1629b) c1631d.f8080a.get(cls);
        this.f8106c = c1629b == null ? c1631d.m5310a(cls, null) : c1629b;
    }

    public C1635h(AbstractC1646r abstractC1646r, C2545e c2545e) {
        this.f8105b = abstractC1646r;
        this.f8106c = c2545e;
    }
}
