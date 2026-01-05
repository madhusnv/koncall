package p001o;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.j0g;
import p001o.l77;
import p001o.zw7;

/* loaded from: classes2.dex */
public final class irf {

    /* renamed from: b */
    public static final C14357a f29164b = new C14357a(null);

    /* renamed from: c */
    public static final String f29165c = irf.class.getSimpleName();

    /* renamed from: a */
    public final j0g.EnumC14421b f29166a;

    /* renamed from: o.irf$a */
    public static final class C14357a {
        public C14357a() {
        }

        public /* synthetic */ C14357a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m32638a(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        /* renamed from: b */
        public final int m32639b(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(sidecarDeviceState, "sidecarDeviceState");
            int iM32638a = m32638a(sidecarDeviceState);
            if (iM32638a < 0 || iM32638a > 4) {
                return 0;
            }
            return iM32638a;
        }

        /* renamed from: c */
        public final List m32640c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? ch3.m21246k() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    if (objInvoke != null) {
                        return (List) objInvoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return ch3.m21246k();
            }
        }

        /* renamed from: d */
        public final void m32641d(SidecarDeviceState sidecarDeviceState, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    /* renamed from: o.irf$b */
    public static final class C14358b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14358b f29167a = new C14358b();

        public C14358b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            sq8.m48649h(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.irf$c */
    public static final class C14359c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14359c f29168a = new C14359c();

        public C14359c() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            sq8.m48649h(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    /* renamed from: o.irf$d */
    public static final class C14360d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14360d f29169a = new C14360d();

        public C14360d() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            sq8.m48649h(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.irf$e */
    public static final class C14361e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14361e f29170a = new C14361e();

        public C14361e() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            sq8.m48649h(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public irf(j0g.EnumC14421b enumC14421b) {
        sq8.m48649h(enumC14421b, "verificationMode");
        this.f29166a = enumC14421b;
    }

    /* renamed from: a */
    public final boolean m32631a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (sq8.m48644c(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C14357a c14357a = f29164b;
        return c14357a.m32639b(sidecarDeviceState) == c14357a.m32639b(sidecarDeviceState2);
    }

    /* renamed from: b */
    public final boolean m32632b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (sq8.m48644c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return sq8.m48644c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* renamed from: c */
    public final boolean m32633c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!m32632b((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m32634d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (sq8.m48644c(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C14357a c14357a = f29164b;
        return m32633c(c14357a.m32640c(sidecarWindowLayoutInfo), c14357a.m32640c(sidecarWindowLayoutInfo2));
    }

    /* renamed from: e */
    public final List m32635e(List list, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(list, "sidecarDisplayFeatures");
        sq8.m48649h(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ou5 ou5VarM32637g = m32637g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (ou5VarM32637g != null) {
                arrayList.add(ou5VarM32637g);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final taj m32636f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new taj(ch3.m21246k());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C14357a c14357a = f29164b;
        c14357a.m32641d(sidecarDeviceState2, c14357a.m32639b(sidecarDeviceState));
        return new taj(m32635e(c14357a.m32640c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* renamed from: g */
    public final ou5 m32637g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zw7.C18722b c18722bM59995a;
        l77.C15011b c15011b;
        sq8.m48649h(sidecarDisplayFeature, "feature");
        sq8.m48649h(sidecarDeviceState, "deviceState");
        j0g.C14420a c14420a = j0g.f29523a;
        String str = f29165c;
        sq8.m48648g(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) j0g.C14420a.m33015b(c14420a, sidecarDisplayFeature, str, this.f29166a, null, 4, null).mo33014c("Type must be either TYPE_FOLD or TYPE_HINGE", C14358b.f29167a).mo33014c("Feature bounds must not be 0", C14359c.f29168a).mo33014c("TYPE_FOLD must have 0 area", C14360d.f29169a).mo33014c("Feature be pinned to either left or top", C14361e.f29170a).mo33012a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type2 = sidecarDisplayFeature2.getType();
        if (type2 == 1) {
            c18722bM59995a = zw7.C18722b.f57814b.m59995a();
        } else {
            if (type2 != 2) {
                return null;
            }
            c18722bM59995a = zw7.C18722b.f57814b.m59996b();
        }
        int iM32639b = f29164b.m32639b(sidecarDeviceState);
        if (iM32639b == 0 || iM32639b == 1) {
            return null;
        }
        if (iM32639b == 2) {
            c15011b = l77.C15011b.f33349d;
        } else {
            if (iM32639b != 3 && iM32639b == 4) {
                return null;
            }
            c15011b = l77.C15011b.f33348c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        sq8.m48648g(rect, "feature.rect");
        return new zw7(new ll1(rect), c18722bM59995a, c15011b);
    }

    public /* synthetic */ irf(j0g.EnumC14421b enumC14421b, int i, id5 id5Var) {
        this((i & 1) != 0 ? j0g.EnumC14421b.QUIET : enumC14421b);
    }
}
