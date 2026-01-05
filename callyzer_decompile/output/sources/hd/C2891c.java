package hd;

import a1.C0005d;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import com.sun.mail.util.AbstractC1452a;
import cv.C1517m;
import ex.InterfaceC2139c;
import fd.C2271i;
import fd.C2272j;
import fd.InterfaceC2263a;
import fd.InterfaceC2264b;
import fd.InterfaceC2269g;
import hc.AbstractC2887j;
import hc.C2882e;
import hc.C2883f;
import hc.C2884g;
import hc.C2885h;
import hc.C2886i;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import nf.C5047i;
import of.C5359n;
import pg.AbstractC5934o;
import rw.AbstractC6662l;
import td.C7124a;
import td.C7126c;
import td.EnumC7143t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.c */
/* loaded from: classes.dex */
public final class C2891c implements InterfaceC2269g, InterfaceC2263a {

    /* renamed from: b */
    public static final Set f15919b = AbstractC6662l.m12710M(new String[]{"Infinity", "-Infinity", "NaN"});

    /* renamed from: a */
    public final C5359n f15920a;

    public C2891c(byte[] payload) {
        AbstractC4154l.m8923f(payload, "payload");
        this.f15920a = new C5359n(payload);
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: B */
    public final long mo35B() {
        return ((Number) m7006o(new C1517m(18))).longValue();
    }

    /* renamed from: a */
    public final AbstractC2887j m6997a() {
        C5359n c5359n = this.f15920a;
        AbstractC5934o abstractC5934oM10504k = c5359n.m10504k();
        if (abstractC5934oM10504k instanceof C2906r) {
            Number value = (Number) m7006o(new C1517m(16));
            AbstractC4154l.m8923f(value, "value");
            return new C2885h(value);
        }
        if (abstractC5934oM10504k instanceof C2907s) {
            String value2 = mo62d();
            AbstractC4154l.m8923f(value2, "value");
            return new C2886i(value2);
        }
        if (abstractC5934oM10504k instanceof C2900l) {
            return new C2882e(mo79x());
        }
        if (abstractC5934oM10504k.equals(C2905q.f15939b)) {
            c5359n.m10503j();
            return null;
        }
        if (abstractC5934oM10504k.equals(C2898j.f15932b)) {
            AbstractC5934o abstractC5934oM10503j = c5359n.m10503j();
            if (abstractC5934oM10503j.getClass() == C2898j.class) {
                ArrayList arrayList = new ArrayList();
                while (m7002i()) {
                    arrayList.add(m6997a());
                }
                return new C2883f(arrayList);
            }
            throw new DeserializationException("expected " + a0.m8901a(C2898j.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
        }
        if (!abstractC5934oM10504k.equals(C2899k.f15933b)) {
            if (!abstractC5934oM10504k.equals(C2901m.f15935b) && !abstractC5934oM10504k.equals(C2903o.f15937b) && !abstractC5934oM10504k.equals(C2902n.f15936b)) {
                if (abstractC5934oM10504k instanceof C2904p) {
                    throw new DeserializationException(AbstractC1452a.m4564k(new StringBuilder("encountered unexpected json field declaration \""), ((C2904p) abstractC5934oM10504k).f15938b, "\" while deserializing document"));
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new DeserializationException("encountered unexpected json token \"" + abstractC5934oM10504k + "\" while deserializing document");
        }
        AbstractC5934o abstractC5934oM10503j2 = c5359n.m10503j();
        if (abstractC5934oM10503j2.getClass() == C2899k.class) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (m7003j()) {
                linkedHashMap.put(m7004k(), m6997a());
            }
            return new C2884g(linkedHashMap);
        }
        throw new DeserializationException("expected " + a0.m8901a(C2899k.class) + "; found " + a0.m8901a(abstractC5934oM10503j2.getClass()));
    }

    /* renamed from: b */
    public final C2891c m6998b(C2271i c2271i) {
        AbstractC5934o abstractC5934oM10503j = this.f15920a.m10503j();
        if (abstractC5934oM10503j.getClass() == C2898j.class) {
            return this;
        }
        throw new DeserializationException("expected " + a0.m8901a(C2898j.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }

    /* renamed from: c */
    public final InterfaceC2263a m6999c(C2271i c2271i) {
        AbstractC5934o abstractC5934oM10503j = this.f15920a.m10503j();
        if (abstractC5934oM10503j.getClass() == C2899k.class) {
            return this;
        }
        throw new DeserializationException("expected " + a0.m8901a(C2899k.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: d */
    public final String mo62d() {
        AbstractC5934o abstractC5934oM10503j = this.f15920a.m10503j();
        if (abstractC5934oM10503j instanceof C2907s) {
            return ((C2907s) abstractC5934oM10503j).f15941b;
        }
        if (abstractC5934oM10503j instanceof C2906r) {
            return ((C2906r) abstractC5934oM10503j).f15940b;
        }
        if (abstractC5934oM10503j instanceof C2900l) {
            return String.valueOf(((C2900l) abstractC5934oM10503j).f15934b);
        }
        throw new DeserializationException(abstractC5934oM10503j + " cannot be deserialized as type String");
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: f */
    public final int mo64f() {
        return ((Number) m7006o(new C1517m(17))).intValue();
    }

    /* renamed from: g */
    public final void m7000g() {
        AbstractC5934o abstractC5934oM10503j = this.f15920a.m10503j();
        if (abstractC5934oM10503j.getClass() == C2905q.class) {
            return;
        }
        throw new DeserializationException("expected " + a0.m8901a(C2905q.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }

    /* renamed from: h */
    public final InterfaceC2264b m7001h(C2272j descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        C5359n c5359n = this.f15920a;
        AbstractC5934o abstractC5934oM10504k = c5359n.m10504k();
        if (!abstractC5934oM10504k.equals(C2899k.f15933b)) {
            if (abstractC5934oM10504k.equals(C2905q.f15939b)) {
                return new C5047i(20, this);
            }
            throw new DeserializationException("Unexpected token type " + c5359n.m10504k());
        }
        AbstractC5934o abstractC5934oM10503j = c5359n.m10503j();
        if (abstractC5934oM10503j.getClass() == C2899k.class) {
            return new C0005d(c5359n, descriptor, this);
        }
        throw new DeserializationException("expected " + a0.m8901a(C2899k.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }

    /* renamed from: i */
    public final boolean m7002i() {
        C5359n c5359n = this.f15920a;
        AbstractC5934o abstractC5934oM10504k = c5359n.m10504k();
        if (!abstractC5934oM10504k.equals(C2901m.f15935b)) {
            return !abstractC5934oM10504k.equals(C2902n.f15936b);
        }
        AbstractC5934o abstractC5934oM10503j = c5359n.m10503j();
        if (abstractC5934oM10503j.getClass() == C2901m.class) {
            return false;
        }
        throw new DeserializationException("expected " + a0.m8901a(C2901m.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }

    /* renamed from: j */
    public final boolean m7003j() {
        C5359n c5359n = this.f15920a;
        AbstractC5934o abstractC5934oM10504k = c5359n.m10504k();
        if (!abstractC5934oM10504k.equals(C2903o.f15937b)) {
            return (abstractC5934oM10504k.equals(C2905q.f15939b) || abstractC5934oM10504k.equals(C2902n.f15936b)) ? false : true;
        }
        AbstractC5934o abstractC5934oM10503j = c5359n.m10503j();
        if (abstractC5934oM10503j.getClass() == C2903o.class) {
            return false;
        }
        throw new DeserializationException("expected " + a0.m8901a(C2903o.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }

    /* renamed from: k */
    public final String m7004k() {
        AbstractC5934o abstractC5934oM10503j = this.f15920a.m10503j();
        if (abstractC5934oM10503j.getClass() == C2904p.class) {
            return ((C2904p) abstractC5934oM10503j).f15938b;
        }
        throw new DeserializationException("expected " + a0.m8901a(C2904p.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }

    /* renamed from: l */
    public final boolean m7005l() {
        return !this.f15920a.m10504k().equals(C2905q.f15939b);
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: m */
    public final AbstractC2887j mo70m() {
        AbstractC2887j abstractC2887jM6997a = m6997a();
        if (abstractC2887jM6997a != null) {
            return abstractC2887jM6997a;
        }
        throw new IllegalStateException("expected non-null document field");
    }

    /* renamed from: o */
    public final Object m7006o(InterfaceC2139c interfaceC2139c) {
        AbstractC5934o abstractC5934oM10503j = this.f15920a.m10503j();
        if (abstractC5934oM10503j instanceof C2906r) {
            return interfaceC2139c.invoke(((C2906r) abstractC5934oM10503j).f15940b);
        }
        if (abstractC5934oM10503j instanceof C2907s) {
            String str = ((C2907s) abstractC5934oM10503j).f15941b;
            if (f15919b.contains(str)) {
                return interfaceC2139c.invoke(str);
            }
        }
        throw new DeserializationException(abstractC5934oM10503j + " cannot be deserialized as type Number");
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: v */
    public final C7126c mo77v(EnumC7143t format) {
        AbstractC4154l.m8923f(format, "format");
        int i10 = AbstractC2890b.f15918a[format.ordinal()];
        if (i10 == 1) {
            String strMo62d = mo62d();
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            return C7124a.m13404b(strMo62d);
        }
        if (i10 == 2) {
            String strMo62d2 = mo62d();
            DateTimeFormatter dateTimeFormatter2 = C7126c.f34342b;
            return C7124a.m13405c(strMo62d2);
        }
        if (i10 == 3) {
            String strMo62d3 = mo62d();
            DateTimeFormatter dateTimeFormatter3 = C7126c.f34342b;
            return C7124a.m13406d(strMo62d3);
        }
        throw new DeserializationException("unknown timestamp format: " + format);
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: x */
    public final boolean mo79x() {
        AbstractC5934o abstractC5934oM10503j = this.f15920a.m10503j();
        if (abstractC5934oM10503j.getClass() == C2900l.class) {
            return ((C2900l) abstractC5934oM10503j).f15934b;
        }
        throw new DeserializationException("expected " + a0.m8901a(C2900l.class) + "; found " + a0.m8901a(abstractC5934oM10503j.getClass()));
    }
}
