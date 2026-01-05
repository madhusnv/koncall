package l1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Process;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.core.CorruptionException;
import androidx.fragment.app.a1;
import bd.C0645a;
import c6.InterfaceC0888r;
import cj.C0979e;
import com.skydoves.balloon.internals.DefinitionKt;
import e1.C1924z;
import ex.InterfaceC2139c;
import f1.AbstractC2176a;
import h1.AbstractC2773d;
import h6.C2856l;
import hq.d0;
import hy.InterfaceC3055f;
import i0.m0;
import iz.InterfaceC3369b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jc.C3733i;
import k1.d1;
import k9.C4033g;
import kc.C4049d;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import ly.C4586j;
import na.AbstractC4982d;
import na.C4979a;
import na.C4980b;
import na.C4983e;
import na.C4984f;
import na.C4985g;
import na.C4987i;
import na.C4988j;
import nc.InterfaceC5007r;
import net.schmizz.sshj.sftp.SFTPException;
import o6.InterfaceC5301c;
import og.pe;
import p012n.MenuC4929i;
import p013o.C5220f;
import p013o.C5223i;
import q9.C6148f;
import ra.C6487a;
import rb.C6489b;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import s4.C6759o;
import s4.C6760p;
import sc.C6788h;
import sc.C6802v;
import sc.InterfaceC6796p;
import sw.C6959c;
import sy.C6966b;
import tc.C7117b;
import th.C7153c;
import ty.C7275i;
import ty.C7277k;
import ty.C7279m;
import ty.EnumC7272f;
import ub.C7391g;
import ub.InterfaceC7385a;
import ug.EnumC7437h;
import ug.x1;
import uh.InterfaceC7458c;
import vc.InterfaceC7700c;
import vc.InterfaceC7703f;
import vw.EnumC7794a;
import wc.AbstractC7984r;
import wc.C7985s;
import wc.InterfaceC7987u;
import wc.e0;
import yc.C8615d;
import yc.EnumC8616e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.p */
/* loaded from: classes.dex */
public final class C4327p implements InterfaceC4313b, InterfaceC7703f, InterfaceC5301c, InterfaceC3369b, InterfaceC6796p, InterfaceC7385a, InterfaceC7458c {

    /* renamed from: a */
    public final /* synthetic */ int f21787a;

    /* renamed from: b */
    public Object f21788b;

    public /* synthetic */ C4327p(int i10, Object obj) {
        this.f21787a = i10;
        this.f21788b = obj;
    }

    @Override // vc.InterfaceC7703f
    /* renamed from: S */
    public InterfaceC7700c mo1857S(String schemeId) {
        switch (this.f21787a) {
            case 1:
                AbstractC4154l.m8923f(schemeId, "schemeId");
                if (schemeId.equals("aws.auth#sigv4")) {
                    return ((C4033g) this.f21788b).f20839f;
                }
                if (schemeId.equals("smithy.api#noAuth")) {
                    return C4049d.f20892a;
                }
                throw new IllegalStateException(("auth scheme " + ((Object) C6489b.m12497a(schemeId)) + " not configured for client").toString());
            default:
                AbstractC4154l.m8923f(schemeId, "schemeId");
                if (schemeId.equals("aws.auth#sigv4")) {
                    return ((C6148f) this.f21788b).f29980f;
                }
                if (schemeId.equals("smithy.api#noAuth")) {
                    return C4049d.f20892a;
                }
                throw new IllegalStateException(("auth scheme " + ((Object) C6489b.m12497a(schemeId)) + " not configured for client").toString());
        }
    }

    @Override // o6.InterfaceC5301c
    /* renamed from: a */
    public Object mo1986a(CorruptionException corruptionException) {
        return ((InterfaceC2139c) this.f21788b).invoke(corruptionException);
    }

    @Override // sc.InterfaceC6796p
    /* renamed from: b */
    public Object mo7561b(Object obj, C8615d c8615d) {
        C4980b c4980b = (C4980b) this.f21788b;
        C6802v c6802v = (C6802v) obj;
        C0645a c0645a = c6802v.f32331a;
        Object obj2 = c6802v.f32332b;
        C6487a c6487a = (C6487a) c0645a.mo1864e(C6487a.f31162c);
        if (c6487a != null) {
            C6487a c6487a2 = c4980b.f24716h;
            C6487a c6487a3 = new C6487a(AbstractC6674x.m12780h(c6487a2.f31163a, c6487a.f31163a), AbstractC6663m.m12754R(c6487a2.f31164b, c6487a.f31164b));
            C4988j c4988j = c4980b.f24709a;
            C4979a c4979a = c4980b.f24710b;
            C4987i c4987i = c4980b.f24711c;
            C4985g c4985g = c4980b.f24712d;
            C4983e c4983e = c4980b.f24713e;
            C4984f c4984f = c4980b.f24714f;
            String str = c4980b.f24715g;
            c4980b.getClass();
            c4980b = new C4980b(c4988j, c4979a, c4987i, c4985g, c4983e, c4984f, str, c6487a3);
        }
        C7117b c7117b = (C7117b) obj2;
        C3733i c3733i = c7117b.f34312c;
        c4980b.getClass();
        C4988j c4988j2 = c4980b.f24709a;
        C6959c c6959cM10829d = pe.m10829d();
        c6959cM10829d.add(c4988j2);
        C6487a c6487a4 = c4980b.f24716h;
        ArrayList arrayList = c6487a4.f31164b;
        LinkedHashMap linkedHashMap = c6487a4.f31163a;
        if (linkedHashMap != null) {
            if ((linkedHashMap.containsKey("internal") ? linkedHashMap : null) != null) {
                c6959cM10829d.add("md/internal");
            }
        }
        c6959cM10829d.add(AbstractC4982d.m9897b("ua", "2.1", null));
        c6959cM10829d.add(c4980b.f24710b);
        c6959cM10829d.add(c4980b.f24711c);
        c6959cM10829d.add(c4980b.f24712d);
        C4983e c4983e2 = c4980b.f24713e;
        if (c4983e2 != null) {
            c6959cM10829d.add(c4983e2);
        }
        int i10 = 0;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.get(i11);
            }
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                c6959cM10829d.add(obj3);
            }
        }
        String str2 = c4980b.f24715g;
        if (str2 != null) {
            c6959cM10829d.add(AbstractC4982d.m9897b("app", str2, null));
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList.get(i13);
            }
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                c6959cM10829d.add(obj4);
            }
        }
        C4984f c4984f2 = c4980b.f24714f;
        if (c4984f2 != null) {
            c6959cM10829d.add(c4984f2);
        }
        if (linkedHashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!AbstractC4154l.m8918a((String) entry.getKey(), "internal")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            c6959cM10829d.add(AbstractC6663m.m12748L(linkedHashMap2.entrySet(), " ", null, null, new d0(26), 30));
        }
        c3733i.m318F(AbstractC6663m.m12748L(pe.m10828c(c6959cM10829d), " ", null, null, null, 62), "User-Agent");
        c7117b.f34312c.m318F(String.valueOf(c4988j2), "x-amz-user-agent");
        return c6802v;
    }

    /* renamed from: c */
    public String m9046c(String str) throws SFTPException {
        C7279m c7279m = (C7279m) this.f21788b;
        C7275i c7275iM13599j = c7279m.m13599j(EnumC7272f.REALPATH);
        C6966b c6966b = c7279m.f34738e;
        c7275iM13599j.m9917l(str, c6966b.f33733h);
        C7277k c7277kM13598h = c7279m.m13598h(c7275iM13599j);
        Charset charset = c6966b.f33733h;
        c7277kM13598h.m13593C(EnumC7272f.NAME);
        if (((int) c7277kM13598h.m9930y()) == 1) {
            return new String(c7277kM13598h.m9925t(), charset);
        }
        throw new SFTPException("Unexpected data in " + c7277kM13598h.f34730f + " packet");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    @Override // iz.InterfaceC3369b
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p020v.x0 mo7726d(iz.o0 r17, iz.k0 r18) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C4327p.mo7726d(iz.o0, iz.k0):v.x0");
    }

    /* renamed from: e */
    public void m9047e(byte b10) {
        ((Parcel) this.f21788b).writeByte(b10);
    }

    /* renamed from: f */
    public void m9048f(float f6) {
        ((Parcel) this.f21788b).writeFloat(f6);
    }

    /* renamed from: g */
    public void m9049g(long j6) {
        long jM12953b = C6759o.m12953b(j6);
        byte b10 = 0;
        if (!C6760p.m12956a(jM12953b, 0L)) {
            if (C6760p.m12956a(jM12953b, 4294967296L)) {
                b10 = 1;
            } else if (C6760p.m12956a(jM12953b, 8589934592L)) {
                b10 = 2;
            }
        }
        m9047e(b10);
        if (C6760p.m12956a(C6759o.m12953b(j6), 0L)) {
            return;
        }
        m9048f(C6759o.m12954c(j6));
    }

    /* renamed from: h */
    public Object m9050h(InterfaceC3055f descriptor, C4586j c4586j) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f21788b).get(descriptor);
        Object obj = map != null ? map.get(c4586j) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* renamed from: i */
    public void m9051i(C0979e c0979e) {
        C6788h c6788h = (C6788h) ((C4535g) c0979e.f5802a).f22539c;
        EnumC8616e order = EnumC8616e.After;
        c6788h.getClass();
        AbstractC4154l.m8923f(order, "order");
        c6788h.m12980c(new C6788h(2, this), order);
    }

    @Override // ub.InterfaceC7385a
    public boolean isClosedForRead() {
        return ((InterfaceC7987u) this.f21788b).mo15147e();
    }

    /* renamed from: j */
    public void m9052j(MenuC4929i menuC4929i) {
        C5220f c5220f;
        switch (this.f21787a) {
            case 9:
                C4327p c4327p = ((ActionMenuView) this.f21788b).f1756w;
                if (c4327p != null) {
                    c4327p.m9052j(menuC4929i);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.f21788b;
                C5223i c5223i = toolbar.f1789a.f1755v;
                if (c5223i == null || (c5220f = c5223i.f25531t) == null || !c5220f.m9881b()) {
                    Iterator it = toolbar.f1783L.f5508b.iterator();
                    while (it.hasNext()) {
                        ((a1) ((InterfaceC0888r) it.next())).f2456a.m1195t(menuC4929i);
                    }
                    break;
                }
                break;
        }
    }

    @Override // ub.InterfaceC7385a
    /* renamed from: k */
    public Object mo8770k(C7985s c7985s, long j6, C7391g c7391g) {
        return new Long(((InterfaceC7987u) this.f21788b).read(c7985s, j6));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9053l(ug.x1 r3, int r4) {
        /*
            r2 = this;
            ug.h r0 = ug.EnumC7437h.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            ug.h r0 = ug.EnumC7437h.INITIALIZATION
            goto L20
        L18:
            ug.h r0 = ug.EnumC7437h.MANIFEST
            goto L20
        L1b:
            ug.h r0 = ug.EnumC7437h.API
            goto L20
        L1e:
            ug.h r0 = ug.EnumC7437h.TCF
        L20:
            java.lang.Object r4 = r2.f21788b
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C4327p.m9053l(ug.x1, int):void");
    }

    /* renamed from: m */
    public void m9054m(x1 x1Var, EnumC7437h enumC7437h) {
        ((EnumMap) this.f21788b).put((EnumMap) x1Var, (x1) enumC7437h);
    }

    @Override // l1.InterfaceC4313b
    /* renamed from: n */
    public Object mo8773n(d1 d1Var, Float f6, Float f10, InterfaceC2139c interfaceC2139c, C4318g c4318g) {
        float fFloatValue = f6.floatValue();
        float fFloatValue2 = f10.floatValue();
        Object objM9043c = AbstractC4323l.m9043c(d1Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, AbstractC2773d.m6779b(DefinitionKt.NO_Float_VALUE, fFloatValue2, 28), (h1.a1) this.f21788b, interfaceC2139c, c4318g);
        return objM9043c == EnumC7794a.COROUTINE_SUSPENDED ? objM9043c : (C4312a) objM9043c;
    }

    public String toString() {
        switch (this.f21787a) {
            case 29:
                StringBuilder sb2 = new StringBuilder("1");
                for (x1 x1Var : x1.values()) {
                    EnumC7437h enumC7437h = (EnumC7437h) ((EnumMap) this.f21788b).get(x1Var);
                    if (enumC7437h == null) {
                        enumC7437h = EnumC7437h.UNSET;
                    }
                    sb2.append(enumC7437h.zzb());
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // uh.InterfaceC7458c
    public Object zza() {
        switch (this.f21787a) {
            case 24:
                Context context = ((C2856l) ((C4327p) this.f21788b).f21788b).f15864a;
                m0.m7377j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("AppUpdateListenerRegistry");
                new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
                C7153c c7153c = new C7153c();
                new HashSet();
                context.getApplicationContext();
                return c7153c;
            default:
                return ((C2856l) this.f21788b).f15864a;
        }
    }

    public /* synthetic */ C4327p(int i10, boolean z6) {
        this.f21787a = i10;
    }

    public C4327p(EnumMap enumMap) {
        this.f21787a = 29;
        EnumMap enumMap2 = new EnumMap(x1.class);
        this.f21788b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public C4327p(C4033g config) {
        this.f21787a = 1;
        AbstractC4154l.m8923f(config, "config");
        this.f21788b = config;
    }

    public C4327p(C6148f config) {
        this.f21787a = 19;
        AbstractC4154l.m8923f(config, "config");
        this.f21788b = config;
    }

    public C4327p(int i10) {
        this.f21787a = i10;
        switch (i10) {
            case 8:
                this.f21788b = new LinkedHashSet();
                break;
            case 29:
                this.f21788b = new EnumMap(x1.class);
                break;
            default:
                this.f21788b = new ConcurrentHashMap(16);
                break;
        }
    }

    public C4327p(C4980b staticMetadata) {
        this.f21787a = 17;
        AbstractC4154l.m8923f(staticMetadata, "staticMetadata");
        this.f21788b = staticMetadata;
    }

    public C4327p(boolean z6) {
        this.f21787a = 22;
        this.f21788b = new AtomicBoolean(z6);
    }

    public C4327p(e0 e0Var) {
        this.f21787a = 23;
        this.f21788b = AbstractC7984r.m15159c(e0Var);
    }

    public C4327p(InterfaceC5007r selector) {
        this.f21787a = 15;
        AbstractC4154l.m8923f(selector, "selector");
        this.f21788b = selector;
    }

    public C4327p(long[] jArr) {
        C1924z c1924z;
        this.f21787a = 28;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c1924z = new C1924z(jArrCopyOf.length);
            int i10 = c1924z.f9092b;
            if (i10 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i10;
                    long[] jArr2 = c1924z.f9091a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        AbstractC4154l.m8922e(jArrCopyOf2, "copyOf(...)");
                        c1924z.f9091a = jArrCopyOf2;
                    }
                    long[] jArr3 = c1924z.f9091a;
                    int i11 = c1924z.f9092b;
                    if (i10 != i11) {
                        AbstractC6662l.m12718h(jArrCopyOf.length + i10, jArr3, i10, jArr3, i11);
                    }
                    AbstractC6662l.m12718h(i10, jArrCopyOf, 0, jArr3, jArrCopyOf.length);
                    c1924z.f9092b += jArrCopyOf.length;
                }
            } else {
                AbstractC2176a.m5863d("");
                throw null;
            }
        } else {
            c1924z = new C1924z(16);
        }
        this.f21788b = c1924z;
    }
}
